package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vzg implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public vzg(defpackage.acld acldVar, int i, byte[] bArr) {
        this.$cid = i;
        this.a = acldVar;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.aimz aimzVar = defpackage.vzh.a;
            ((defpackage.rsr) this.a).aC(new defpackage.kaw("source_package").aI("!=", (java.lang.String) obj));
            return;
        }
        if (i == 1) {
            defpackage.aimz aimzVar2 = defpackage.vzh.a;
            ((defpackage.rsr) this.a).aD(new defpackage.kaw("source_type").aI("IS", (java.lang.String) obj));
            return;
        }
        if (i == 2) {
            ((defpackage.aiob) ((defpackage.aiob) defpackage.acld.a.c()).k((java.lang.Throwable) obj)).v("GrowthKit failed to start.");
            defpackage.acld acldVar = (defpackage.acld) this.a;
            ((defpackage.aeey) acldVar.d.a()).k(acldVar.e, "ERROR");
            return;
        }
        if (i == 3) {
            defpackage.acld acldVar2 = (defpackage.acld) this.a;
            ((defpackage.aeey) acldVar2.d.a()).k(acldVar2.e, "OK");
            return;
        }
        defpackage.adnv adnvVar = (defpackage.adnv) obj;
        if (adnvVar.b.isEmpty()) {
            throw new java.lang.IllegalArgumentException("invalid empty message text");
        }
        java.lang.Object obj2 = this.a;
        java.lang.String str = adnvVar.a;
        defpackage.ahvr.bR(((defpackage.aigf) ((defpackage.adqe) obj2).j.a).containsKey(str), "unsupported voice ID %s", str);
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        int i = this.$cid;
        if (i == 0) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i == 1) {
            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Consumer.-CC.$default$andThen(this, consumer) : j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ vzg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
