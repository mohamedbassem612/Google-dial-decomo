package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bqu implements crd {
    private long a = 9205357640488583168L;
    private final cpx b;
    private cpx c;

    public bqu(defpackage.ely elyVar) {
        this.b = defpackage.rq.l(elyVar, null, false, 13);
    }

    public final cqx a(long j, dpq dpqVar, dpf dpfVar) {
        cpx cpxVar;
        if (!anty.ah(j, this.a) || (cpxVar = this.c) == null) {
            this.a = j;
            this.c = new cpx((byte[]) null);
        } else {
            cpxVar.l();
        }
        cpx cpxVar2 = this.c;
        aooh.c(cpxVar2);
        cpxVar2.s(this.b);
        float[] fArrE = cqt.e();
        cqt.g(fArrE, java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
        cpxVar2.n(fArrE);
        cpxVar2.o(mni.aM(cdh.q(j), cpxVar2.b().b()));
        return new cqu(cpxVar2);
    }
}
