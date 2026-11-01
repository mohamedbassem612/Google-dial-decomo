package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class gel extends defpackage.al implements android.content.DialogInterface.OnClickListener {
    private androidx.preference.DialogPreference ak;
    private java.lang.CharSequence al;
    private java.lang.CharSequence am;
    private java.lang.CharSequence an;
    public int ao;
    private java.lang.CharSequence ap;
    private int aq;
    private android.graphics.drawable.BitmapDrawable ar;

    protected void aU(android.view.View view) {
        int i;
        android.view.View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            java.lang.CharSequence charSequence = this.ap;
            if (android.text.TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
                if (viewFindViewById instanceof android.widget.TextView) {
                    ((android.widget.TextView) viewFindViewById).setText(charSequence);
                }
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void aV(boolean z);

    protected boolean aW() {
        return false;
    }

    @Override // defpackage.al
    public final android.app.Dialog eb(android.os.Bundle bundle) {
        this.ao = -2;
        defpackage.cx cxVar = new defpackage.cx(A());
        cxVar.setTitle(this.al);
        cxVar.d(this.ar);
        cxVar.h(this.am, this);
        cxVar.g(this.an, this);
        A();
        int i = this.aq;
        android.view.View viewInflate = i != 0 ? K().inflate(i, (android.view.ViewGroup) null) : null;
        if (viewInflate != null) {
            aU(viewInflate);
            cxVar.setView(viewInflate);
        } else {
            cxVar.f(this.ap);
        }
        dO(cxVar);
        defpackage.cy cyVarCreate = cxVar.create();
        if (aW()) {
            baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(cyVarCreate.getWindow().getDecorView()), baa$.ExternalSyntheticApiModelOutline1.m$7());
        }
        return cyVarCreate;
    }

    public final androidx.preference.DialogPreference er() {
        androidx.preference.DialogPreference dialogPreference = this.ak;
        if (dialogPreference != null) {
            return dialogPreference;
        }
        androidx.preference.DialogPreference dialogPreference2 = (androidx.preference.DialogPreference) super.E(true).ee(C().getString("key"));
        this.ak = dialogPreference2;
        return dialogPreference2;
    }

    @Override // defpackage.al
    public void h(android.os.Bundle bundle) {
        super.h(bundle);
        defpackage.gdy gdyVarE = super.E(true);
        if (!(gdyVarE instanceof defpackage.gdy)) {
            throw new java.lang.IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        defpackage.gdy gdyVar = gdyVarE;
        java.lang.String string = C().getString("key");
        if (bundle != null) {
            this.al = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.am = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.an = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.ap = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.aq = bundle.getInt("PreferenceDialogFragment.layout", 0);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.ar = new android.graphics.drawable.BitmapDrawable(dX(), bitmap);
                return;
            }
            return;
        }
        androidx.preference.DialogPreference dialogPreference = (androidx.preference.DialogPreference) gdyVar.ee(string);
        this.ak = dialogPreference;
        this.al = dialogPreference.a;
        this.am = dialogPreference.d;
        this.an = dialogPreference.e;
        this.ap = dialogPreference.b;
        this.aq = dialogPreference.f;
        android.graphics.drawable.Drawable drawable = dialogPreference.c;
        if (drawable == null || (drawable instanceof android.graphics.drawable.BitmapDrawable)) {
            this.ar = (android.graphics.drawable.BitmapDrawable) drawable;
            return;
        }
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.ar = new android.graphics.drawable.BitmapDrawable(dX(), bitmapCreateBitmap);
    }

    @Override // defpackage.al
    public void k(android.os.Bundle bundle) {
        super.k(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.al);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.am);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.an);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.ap);
        bundle.putInt("PreferenceDialogFragment.layout", this.aq);
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.ar;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.ao = i;
    }

    @Override // defpackage.al, android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        aV(this.ao == -1);
    }

    protected void dO(defpackage.cx cxVar) {
    }
}
