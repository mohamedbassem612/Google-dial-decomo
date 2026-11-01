package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yry implements aoxh {
    private final /* synthetic */ int $cid;
    final /* synthetic */ aoxh a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public yry(aoxh aoxhVar, defpackage.tel telVar, defpackage.tei teiVar, int i) {
        this.$cid = i;
        this.a = aoxhVar;
        this.c = telVar;
        this.b = teiVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, tel] */
    public final java.lang.Object fM(aoxi aoxiVar, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object objFM = this.a.fM(new defpackage.tgo(aoxiVar, (zth) this.b, (defpackage.yse) this.c, 2), aolnVar);
            return objFM != aolu.a ? aojh.a : objFM;
        }
        if (i != 1) {
            java.lang.Object objFM2 = this.a.fM(new defpackage.tgo(aoxiVar, (zth) this.b, (defpackage.yse) this.c, 3), aolnVar);
            return objFM2 != aolu.a ? aojh.a : objFM2;
        }
        java.lang.Object objFM3 = this.a.fM(new defpackage.tgo(aoxiVar, (defpackage.tel) this.c, (defpackage.tei) this.b, 0), aolnVar);
        return objFM3 != aolu.a ? aojh.a : objFM3;
    }

    public yry(aoxh aoxhVar, zth zthVar, defpackage.yse yseVar, int i) {
        this.$cid = i;
        this.a = aoxhVar;
        this.b = zthVar;
        this.c = yseVar;
    }
}
