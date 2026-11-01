package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qsv implements java.util.function.Consumer {
    public final /* synthetic */ defpackage.qsn a;

    public /* synthetic */ qsv(defpackage.qsn qsnVar) {
        this.a = qsnVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        defpackage.qrv qrvVar = (defpackage.qrv) obj;
        aihd aihdVar = defpackage.qtd.a;
        boolean z = this.a.a;
        qrvVar.e(z ? qbc.ca : qbc.cb);
        qrvVar.g.set(z);
        qrvVar.s.a(ajcm.a);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
