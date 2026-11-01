package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aww {
    private static final defpackage.cye a = new defpackage.awx(defpackage.awi.c, defpackage.cmh.j);

    public static final defpackage.cye a(defpackage.awh awhVar, defpackage.cmi cmiVar, defpackage.cav cavVar, int i) {
        if (defpackage.aooh.n(awhVar, defpackage.awi.c) && defpackage.aooh.n(cmiVar, defpackage.cmh.j)) {
            cavVar.u(-1446604504);
            cavVar.o();
            return a;
        }
        cavVar.u(-1446550657);
        boolean z = ((((i & 14) ^ 6) > 4 && cavVar.B(awhVar)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && cavVar.B(cmiVar)) || (i & 48) == 32);
        java.lang.Object objG = cavVar.g();
        if (z || objG == defpackage.cau.a) {
            objG = new defpackage.awx(awhVar, cmiVar);
            cavVar.w(objG);
        }
        defpackage.awx awxVar = (defpackage.awx) objG;
        cavVar.o();
        return awxVar;
    }
}
