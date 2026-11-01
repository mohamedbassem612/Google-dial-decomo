package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cr implements android.widget.AdapterView.OnItemClickListener {
    final /* synthetic */ defpackage.cw a;
    final /* synthetic */ defpackage.ct b;

    public cr(defpackage.ct ctVar, defpackage.cw cwVar) {
        this.a = cwVar;
        this.b = ctVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i, long j) {
        defpackage.cw cwVar = this.a;
        defpackage.ct ctVar = this.b;
        android.content.DialogInterface.OnClickListener onClickListener = ctVar.s;
        defpackage.ds dsVar = cwVar.b;
        onClickListener.onClick(dsVar, i);
        if (ctVar.x) {
            return;
        }
        dsVar.dismiss();
    }
}
