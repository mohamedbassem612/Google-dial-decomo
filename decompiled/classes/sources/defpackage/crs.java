package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class crs {
    private final defpackage.crn a;
    private final defpackage.crn b;
    private final defpackage.crn c;

    /* JADX WARN: Illegal instructions before constructor call */
    public crs(defpackage.crn crnVar, defpackage.crn crnVar2) {
        defpackage.crn crnVarT;
        if (crnVar.b == 12884901888L) {
            defpackage.csd csdVar = defpackage.crv.a;
            crnVar = defpackage.cfd.t(crnVar, defpackage.crv.b, defpackage.crl.b);
        }
        if (crnVar2.b == 12884901888L) {
            defpackage.csd csdVar2 = defpackage.crv.a;
            crnVarT = defpackage.cfd.t(crnVar2, defpackage.crv.b, defpackage.crl.b);
        } else {
            crnVarT = crnVar2;
        }
        this(crnVar2, crnVar, crnVarT);
    }

    public long a(long j) {
        defpackage.crn crnVar = this.b;
        float fD = defpackage.cqg.d(j);
        float fC = defpackage.cqg.c(j);
        float fB = defpackage.cqg.b(j);
        long jD = crnVar.d(fD, fC, fB);
        return this.c.e(java.lang.Float.intBitsToFloat((int) (jD >> 32)), java.lang.Float.intBitsToFloat((int) (jD & 4294967295L)), crnVar.c(fD, fC, fB), defpackage.cqg.a(j), this.a);
    }

    public crs(defpackage.crn crnVar, defpackage.crn crnVar2, defpackage.crn crnVar3) {
        this.a = crnVar;
        this.b = crnVar2;
        this.c = crnVar3;
    }
}
