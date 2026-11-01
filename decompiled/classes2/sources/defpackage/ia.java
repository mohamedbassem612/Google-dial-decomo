package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ia implements android.content.DialogInterface.OnClickListener, defpackage.id {
    defpackage.cy a;
    final /* synthetic */ defpackage.ie b;
    private android.widget.ListAdapter c;
    private java.lang.CharSequence d;

    public ia(defpackage.ie ieVar) {
        this.b = ieVar;
    }

    @Override // defpackage.id
    public final int a() {
        return 0;
    }

    @Override // defpackage.id
    public final int b() {
        return 0;
    }

    @Override // defpackage.id
    public final android.graphics.drawable.Drawable c() {
        return null;
    }

    @Override // defpackage.id
    public final java.lang.CharSequence d() {
        return this.d;
    }

    @Override // defpackage.id
    public final void e(android.widget.ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.id
    public final void f(android.graphics.drawable.Drawable drawable) {
        android.util.Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.id
    public final void g(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.id
    public final void h(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.id
    public final void i(java.lang.CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.id
    public final void j(int i) {
        android.util.Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.id
    public final void k(int i, int i2) {
        if (this.c != null) {
            defpackage.ie ieVar = this.b;
            defpackage.cx cxVar = new defpackage.cx(ieVar.a);
            java.lang.CharSequence charSequence = this.d;
            if (charSequence != null) {
                cxVar.setTitle(charSequence);
            }
            android.widget.ListAdapter listAdapter = this.c;
            int selectedItemPosition = ieVar.getSelectedItemPosition();
            defpackage.ct ctVar = cxVar.a;
            ctVar.r = listAdapter;
            ctVar.s = this;
            ctVar.y = selectedItemPosition;
            ctVar.x = true;
            defpackage.cy cyVarCreate = cxVar.create();
            this.a = cyVarCreate;
            android.widget.ListView listViewD = cyVarCreate.d();
            listViewD.setTextDirection(i);
            listViewD.setTextAlignment(i2);
            this.a.show();
        }
    }

    @Override // defpackage.id
    public final void m() {
        defpackage.cy cyVar = this.a;
        if (cyVar != null) {
            cyVar.dismiss();
            this.a = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        defpackage.ie ieVar = this.b;
        ieVar.setSelection(i);
        if (ieVar.getOnItemClickListener() != null) {
            ieVar.performItemClick(null, i, this.c.getItemId(i));
        }
        m();
    }

    @Override // defpackage.id
    public final boolean x() {
        defpackage.cy cyVar = this.a;
        if (cyVar != null) {
            return cyVar.isShowing();
        }
        return false;
    }
}
