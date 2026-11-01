package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cq extends android.widget.ArrayAdapter {
    final /* synthetic */ android.support.v7.app.AlertController$RecycleListView a;
    final /* synthetic */ defpackage.ct b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(defpackage.ct ctVar, android.content.Context context, int i, java.lang.CharSequence[] charSequenceArr, android.support.v7.app.AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, android.R.id.text1, charSequenceArr);
        this.a = alertController$RecycleListView;
        this.b = ctVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final android.view.View getView(int i, android.view.View view, android.view.ViewGroup viewGroup) {
        defpackage.ct ctVar = this.b;
        android.view.View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = ctVar.v;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
