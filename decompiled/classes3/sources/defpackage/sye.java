package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sye implements defpackage.qjc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public sye(defpackage.qko qkoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(qkoVar);
        this.a = qkoVar;
    }

    @Override // defpackage.qjc
    public final void a() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        if (i != 0) {
            defpackage.qko qkoVar = (defpackage.qko) obj;
            if (qkoVar.g.getAndSet(true)) {
                return;
            }
            qkoVar.r.a(qbc.dJ);
            return;
        }
        defpackage.vie vieVar = (defpackage.vie) obj;
        if (((java.util.concurrent.atomic.AtomicBoolean) vieVar.h).getAndSet(true)) {
            return;
        }
        ((defpackage.qbe) vieVar.a).a(qbc.dK);
    }

    public /* synthetic */ sye(defpackage.vie vieVar, int i) {
        this.$cid = i;
        this.a = vieVar;
    }
}
