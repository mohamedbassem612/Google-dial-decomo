package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azm {
    private static final defpackage.axg c = new defpackage.axg(2, 1.0f);
    private static final defpackage.axg d = new defpackage.axg(1, 1.0f);
    private static final defpackage.axg e = new defpackage.axg(3, 1.0f);
    public static final defpackage.baf a = defpackage.den.aQ(defpackage.cmh.k);
    public static final defpackage.baf b = defpackage.den.aQ(defpackage.cmh.j);
    private static final defpackage.baf f = defpackage.den.aO(defpackage.cmh.n);
    private static final defpackage.baf g = defpackage.den.aO(defpackage.cmh.m);
    private static final defpackage.baf h = defpackage.den.aP(defpackage.cmh.e);
    private static final defpackage.baf i = defpackage.den.aP(defpackage.cmh.a);

    public static final defpackage.cmw a(defpackage.cmw cmwVar, float f2, float f3) {
        return cmwVar.a(new defpackage.azu(f2, f3));
    }

    public static final defpackage.cmw b(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(f2 == 1.0f ? d : new defpackage.axg(1, f2));
    }

    public static final defpackage.cmw c(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(f2 == 1.0f ? e : new defpackage.axg(3, f2));
    }

    public static final defpackage.cmw d(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(f2 == 1.0f ? c : new defpackage.axg(2, f2));
    }

    public static final defpackage.cmw e(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(new defpackage.azl(Float.NaN, f2, Float.NaN, f2, true));
    }

    public static final defpackage.cmw f(defpackage.cmw cmwVar, float f2, float f3) {
        return cmwVar.a(new defpackage.azl(Float.NaN, f2, Float.NaN, f3, true));
    }

    public static final defpackage.cmw g(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(new defpackage.azl(f2, f2, f2, f2, true));
    }

    public static final defpackage.cmw h(defpackage.cmw cmwVar, long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + 0.0f;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + 0.0f;
        return cmwVar.a(new defpackage.azl(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2, true));
    }

    public static final defpackage.cmw i(defpackage.cmw cmwVar, float f2, float f3) {
        return cmwVar.a(new defpackage.azl(f2, f3, f2, f3, true));
    }

    public static final defpackage.cmw j(defpackage.cmw cmwVar, float f2, float f3, float f4, float f5) {
        return cmwVar.a(new defpackage.azl(f2, f3, f4, f5, true));
    }

    public static final defpackage.cmw k(defpackage.cmw cmwVar, float f2) {
        return cmwVar.a(new defpackage.azl(f2, Float.NaN, f2, Float.NaN, true));
    }

    public static final defpackage.cmw l(defpackage.cmw cmwVar, float f2, float f3) {
        return cmwVar.a(new defpackage.azl(f2, Float.NaN, f3, Float.NaN, true));
    }

    public static /* synthetic */ defpackage.cmw m(defpackage.cmw cmwVar, float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if (1 == (i2 & 1)) {
            f2 = Float.NaN;
        }
        return cmwVar.a(new defpackage.azu(f2, f3));
    }

    public static /* synthetic */ defpackage.cmw n(defpackage.cmw cmwVar, float f2, float f3, float f4, float f5, int i2) {
        float f6 = (i2 & 8) != 0 ? Float.NaN : f5;
        float f7 = (i2 & 4) != 0 ? Float.NaN : f4;
        return cmwVar.a(new defpackage.azl(1 != (i2 & 1) ? f2 : Float.NaN, (i2 & 2) != 0 ? Float.NaN : f3, f7, f6, false));
    }

    public static /* synthetic */ defpackage.cmw o(defpackage.cmw cmwVar, defpackage.cmn cmnVar, int i2) {
        defpackage.baf bafVar;
        if ((i2 & 1) != 0) {
            cmnVar = defpackage.cmh.n;
        }
        if (defpackage.aooh.n(cmnVar, defpackage.cmh.n)) {
            bafVar = f;
        } else {
            bafVar = defpackage.aooh.n(cmnVar, defpackage.cmh.m) ? g : new defpackage.baf(1, new defpackage.bae(cmnVar, 2), cmnVar);
        }
        return cmwVar.a(bafVar);
    }

    public static final defpackage.cmw p(defpackage.cmw cmwVar) {
        return cmwVar.a(new defpackage.azl(20.0f, 20.0f, 20.0f, 20.0f, false));
    }

    public static /* synthetic */ defpackage.cmw q(defpackage.cmj cmjVar) {
        if (defpackage.aooh.n(cmjVar, defpackage.cmh.e)) {
            return h;
        }
        return defpackage.aooh.n(cmjVar, defpackage.cmh.a) ? i : new defpackage.baf(3, new defpackage.bae(cmjVar, 3), cmjVar);
    }
}
