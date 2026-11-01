package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cs implements android.widget.AdapterView.OnItemClickListener {
    final /* synthetic */ android.support.v7.app.AlertController$RecycleListView a;
    final /* synthetic */ defpackage.cw b;
    final /* synthetic */ defpackage.ct c;

    public cs(defpackage.ct ctVar, android.support.v7.app.AlertController$RecycleListView alertController$RecycleListView, defpackage.cw cwVar) {
        this.a = alertController$RecycleListView;
        this.b = cwVar;
        this.c = ctVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        defpackage.ct ctVar = this.c;
        boolean[] zArr = ctVar.v;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        ctVar.z.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
