package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bwa {
    public static final float a;
    public static final float b;
    public static final defpackage.boz c;

    static {
        long jBj = mni.bj(16.0f, 8.0f);
        a = 200.0f;
        b = 320.0f;
        c = new defpackage.boz(jBj);
    }

    public static final defpackage.drr a(int i, cav cavVar) {
        ayy ayyVar = defpackage.bwh.a;
        int iDp = ((dpf) cavVar.e(dfo.e)).dp(4.0f);
        long jB = ((dgn) cavVar.e(dfo.o)).b();
        boolean z = cavVar.z(iDp) | cavVar.z(i) | cavVar.A(jB);
        cbt cbtVar = (cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z || objR == cau.a) {
            objR = new defpackage.bwi(i, iDp, jB);
            cbtVar.ab(objR);
        }
        return (defpackage.bwi) objR;
    }

    public static final defpackage.bss b(long j, long j2, long j3, cav cavVar) {
        long jS = cfd.S();
        bor borVarAk = den.ak(cavVar);
        defpackage.bss bssVar = borVarAk.ak;
        if (bssVar == null) {
            bssVar = new defpackage.bss(bos.b(borVarAk, 36), bos.b(borVarAk, 18), bos.b(borVarAk, 18), bos.b(borVarAk, 25));
            borVarAk.ak = bssVar;
        }
        long j4 = j != 16 ? j : bssVar.a;
        long j5 = j2 != 16 ? j2 : bssVar.b;
        long j6 = j3 != 16 ? j3 : bssVar.c;
        if (jS == 16) {
            jS = bssVar.d;
        }
        return new defpackage.bss(j4, j5, j6, jS);
    }
}
