package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class bnj {
    public static final defpackage.ayy a;
    public static final defpackage.ayy b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    private static final float g;

    static {
        defpackage.azc azcVar = new defpackage.azc(24.0f, 8.0f, 24.0f, 8.0f);
        a = azcVar;
        new defpackage.azc(16.0f, 8.0f, 24.0f, 8.0f);
        g = 12.0f;
        b = new defpackage.azc(12.0f, azcVar.a, 12.0f, azcVar.b);
        new defpackage.azc(12.0f, azcVar.a, 16.0f, azcVar.b);
        c = 58.0f;
        d = 56.0f;
        e = 96.0f;
        f = 136.0f;
    }

    public static final defpackage.bni a(long j, long j2, long j3, long j4, defpackage.cav cavVar) {
        defpackage.bor borVarAk = defpackage.den.ak(cavVar);
        defpackage.bni bniVar = borVarAk.W;
        if (bniVar == null) {
            bniVar = new defpackage.bni(defpackage.bos.b(borVarAk, 25), defpackage.bos.b(borVarAk, 9), defpackage.cqg.h(defpackage.bos.b(borVarAk, 17), 0.1f), defpackage.cqg.h(defpackage.bos.b(borVarAk, 18), 0.38f));
            borVarAk.W = bniVar;
        }
        return bniVar.c(j, j2, j3, j4);
    }

    public static final defpackage.bni b(defpackage.bor borVar) {
        defpackage.bni bniVar = borVar.X;
        if (bniVar != null) {
            return bniVar;
        }
        long jB = defpackage.bos.b(borVar, 25);
        long jB2 = defpackage.bos.b(borVar, 18);
        float fD = defpackage.cqg.d(jB2);
        float fC = defpackage.cqg.c(jB2);
        float fB = defpackage.cqg.b(jB2);
        float[] fArr = defpackage.crp.a;
        defpackage.bni bniVar2 = new defpackage.bni(0L, jB, 0L, defpackage.cfd.N(fD, fC, fB, 0.38f, defpackage.crp.y[(int) (jB2 & 63)]));
        borVar.X = bniVar2;
        return bniVar2;
    }

    public static final float c() {
        return ((java.lang.Boolean) defpackage.bsi.a.a()).booleanValue() ? 36.0f : 40.0f;
    }

    public static final defpackage.dkz d(float f2, defpackage.cav cavVar) {
        float f3 = d;
        float f4 = e;
        float f5 = f;
        if (defpackage.dpi.a(f2, f3) < 0) {
            cavVar.u(-623485538);
            defpackage.dkz dkzVar = defpackage.den.an(cavVar).m;
            cavVar.o();
            return dkzVar;
        }
        if (defpackage.dpi.a(f2, f4) < 0) {
            cavVar.u(-623483041);
            defpackage.dkz dkzVar2 = defpackage.den.an(cavVar).h;
            cavVar.o();
            return dkzVar2;
        }
        if (defpackage.dpi.a(f2, f5) < 0) {
            cavVar.u(-623480479);
            defpackage.dkz dkzVar3 = defpackage.den.an(cavVar).f;
            cavVar.o();
            return dkzVar3;
        }
        cavVar.u(-623478591);
        defpackage.dkz dkzVar4 = defpackage.den.an(cavVar).d;
        cavVar.o();
        return dkzVar4;
    }
}
