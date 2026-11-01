package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class acpl {
    public static final ayy a;
    public static final ayy b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float i;
    public static final float j;
    public static final float k;
    public static final float l;
    public static final float m;
    public static final float n;
    public static final float o;
    public static final float p;
    public static final float q;
    private static final float r;
    private static final float s;
    private static final float t;
    private static final float u;
    private static final float v;
    private static final float w;
    private static final float x;

    static {
        azc azcVar = new azc(24.0f, 8.0f, 24.0f, 8.0f);
        a = azcVar;
        new azc(16.0f, 8.0f, 24.0f, 8.0f);
        r = 12.0f;
        b = new azc(12.0f, azcVar.a, 12.0f, azcVar.b);
        new azc(12.0f, azcVar.a, 16.0f, azcVar.b);
        c = 32.0f;
        d = 56.0f;
        e = 96.0f;
        f = 136.0f;
        g = 18.0f;
        h = 20.0f;
        i = 20.0f;
        j = 24.0f;
        k = 32.0f;
        l = 40.0f;
        m = 8.0f;
        n = 4.0f;
        o = 8.0f;
        p = 12.0f;
        q = 16.0f;
        s = 24.0f;
        t = 24.0f;
        u = 16.0f;
        v = 32.0f;
        w = 48.0f;
        x = 48.0f;
    }

    public static final bni a(long j2, long j3, cav cavVar, int i2) {
        if ((i2 & 1) != 0) {
            j2 = abrz.t(25, cavVar);
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = abrz.t(9, cavVar);
        }
        long jH = cqg.h(abrz.t(17, cavVar), 0.1f);
        long jH2 = cqg.h(abrz.t(17, cavVar), 0.38f);
        ayy ayyVar = bnj.a;
        return bnj.a(j4, j3, jH, jH2, cavVar);
    }

    public static final bni b(long j2, cav cavVar, int i2) {
        if ((i2 & 1) != 0) {
            j2 = abrz.t(31, cavVar);
        }
        long j3 = j2;
        long jT = abrz.t(14, cavVar);
        long jH = cqg.h(abrz.t(17, cavVar), 0.1f);
        long jH2 = cqg.h(abrz.t(17, cavVar), 0.38f);
        ayy ayyVar = bnj.a;
        return bnj.a(j3, jT, jH, jH2, cavVar);
    }

    public static final float c() {
        return ((java.lang.Boolean) defpackage.acqh.a.a()).booleanValue() ? 36.0f : 40.0f;
    }

    public static final crd d(cav cavVar) {
        return acqn.a(6, cavVar);
    }

    public static final bni e(long j2, cav cavVar, int i2) {
        long jM = (i2 & 1) != 0 ? cfd.M(0) : 0L;
        if ((i2 & 2) != 0) {
            j2 = abrz.t(18, cavVar);
        }
        long j3 = j2;
        long jH = cqg.h(abrz.t(17, cavVar), 0.38f);
        ayy ayyVar = bnj.a;
        return bnj.a(jM, j3, cfd.M(0), jH, cavVar);
    }

    public static final bni f(long j2, cav cavVar, int i2) {
        long jM = (i2 & 1) != 0 ? cfd.M(0) : 0L;
        if ((i2 & 2) != 0) {
            j2 = abrz.t(25, cavVar);
        }
        long j3 = j2;
        long jH = cqg.h(abrz.t(17, cavVar), 0.38f);
        ayy ayyVar = bnj.a;
        return bnj.a(jM, j3, cfd.M(0), jH, cavVar);
    }

    public static final defpackage.bnm g() {
        ayy ayyVar = bnj.a;
        return new defpackage.bnm();
    }

    public static final ayy h(float f2) {
        azc azcVar;
        float fC = c();
        float f3 = d;
        float f4 = e;
        float f5 = f;
        if (dpi.a(f2, fC) < 0) {
            return new azc(12.0f, 6.0f, 12.0f, 6.0f);
        }
        if (dpi.a(f2, f3) < 0) {
            return new azc(16.0f, j(), 16.0f, j());
        }
        if (dpi.a(f2, f4) < 0) {
            float f6 = s;
            float f7 = u;
            azcVar = new azc(f6, f7, t, f7);
        } else {
            if (dpi.a(f2, f5) >= 0) {
                return new azc(64.0f, 48.0f, 64.0f, 48.0f);
            }
            float f8 = w;
            float f9 = v;
            azcVar = new azc(f8, f9, x, f9);
        }
        return azcVar;
    }

    public static final ayy i() {
        return new azc(16.0f, j(), 16.0f, j());
    }

    private static final float j() {
        return ((java.lang.Boolean) defpackage.acqh.a.a()).booleanValue() ? 8.0f : 10.0f;
    }
}
