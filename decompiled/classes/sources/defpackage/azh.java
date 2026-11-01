package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azh {
    private static final defpackage.cye a = new defpackage.azi(defpackage.awi.a, defpackage.cmh.m);

    public static final defpackage.cye a(defpackage.awa awaVar, defpackage.cmn cmnVar, defpackage.cav cavVar, int i) {
        if (defpackage.aooh.n(awaVar, defpackage.awi.a) && defpackage.aooh.n(cmnVar, defpackage.cmh.m)) {
            cavVar.u(-1073830487);
            cavVar.o();
            return a;
        }
        cavVar.u(-1073779616);
        boolean z = ((((i & 14) ^ 6) > 4 && cavVar.B(awaVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && cavVar.B(cmnVar)) || (i & 48) == 32);
        java.lang.Object objG = cavVar.g();
        if (z || objG == defpackage.cau.a) {
            objG = new defpackage.azi(awaVar, cmnVar);
            cavVar.w(objG);
        }
        defpackage.azi aziVar = (defpackage.azi) objG;
        cavVar.o();
        return aziVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        return !z ? defpackage.dpe.c(i, i2, 0, i3) : defpackage.dpe.k(i, i2, 0, i3);
    }
}
