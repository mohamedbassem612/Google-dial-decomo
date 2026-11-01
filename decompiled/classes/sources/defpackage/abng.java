package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abng {
    public final java.util.List a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final long m;
    private final long n;
    private final long o;
    private final java.util.List p;
    private final defpackage.aoir q;

    public abng(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = j8;
        this.j = j9;
        this.k = j10;
        this.l = j11;
        this.m = j12;
        this.n = j13;
        this.o = j14;
        java.util.List listAsList = java.util.Arrays.asList(new defpackage.cqg(j), new defpackage.cqg(j2), new defpackage.cqg(j3), new defpackage.cqg(j4), new defpackage.cqg(j5), new defpackage.cqg(j6), new defpackage.cqg(j7));
        defpackage.aooh.e(listAsList, "asList(...)");
        this.a = listAsList;
        java.util.List listAsList2 = java.util.Arrays.asList(new defpackage.cqg(j8), new defpackage.cqg(j9), new defpackage.cqg(j10), new defpackage.cqg(j11), new defpackage.cqg(j12), new defpackage.cqg(j13), new defpackage.cqg(j14));
        defpackage.aooh.e(listAsList2, "asList(...)");
        this.p = listAsList2;
        this.q = new defpackage.aoiy(new defpackage.uob(this, 16));
    }

    public static final float c(long j, float[] fArr) {
        android.graphics.Color.colorToHSV(defpackage.cfd.L(j), fArr);
        return fArr[0];
    }

    public final long a(long j, long j2) {
        defpackage.cqg cqgVar = (defpackage.cqg) defpackage.ajsz.bH(this.p, this.a.indexOf(new defpackage.cqg(j)));
        if (cqgVar == null) {
            return j2;
        }
        if (cqgVar.a == 16) {
            cqgVar = null;
        }
        return cqgVar != null ? cqgVar.a : j2;
    }

    public final long b(float f) {
        float[] fArr = (float[]) this.q.a();
        defpackage.aooh.f(fArr, "<this>");
        java.util.Iterator it = new defpackage.aokh(new ahca(fArr, 9)).iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            float fFloatValue = ((((java.lang.Number) ((defpackage.aokg) next).b).floatValue() - f) + 360.0f) % 360.0f;
            float fMin = java.lang.Math.min(fFloatValue, 360.0f - fFloatValue);
            do {
                java.lang.Object next2 = it.next();
                float fFloatValue2 = ((((java.lang.Number) ((defpackage.aokg) next2).b).floatValue() - f) + 360.0f) % 360.0f;
                float fMin2 = java.lang.Math.min(fFloatValue2, 360.0f - fFloatValue2);
                if (java.lang.Float.compare(fMin, fMin2) > 0) {
                    next = next2;
                    fMin = fMin2;
                }
            } while (it.hasNext());
        }
        return ((defpackage.cqg) this.a.get(((defpackage.aokg) next).a)).a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.abng) {
            defpackage.abng abngVar = (defpackage.abng) obj;
            if (defpackage.anty.ah(this.b, abngVar.b) && defpackage.anty.ah(this.c, abngVar.c) && defpackage.anty.ah(this.d, abngVar.d) && defpackage.anty.ah(this.e, abngVar.e) && defpackage.anty.ah(this.f, abngVar.f) && defpackage.anty.ah(this.g, abngVar.g) && defpackage.anty.ah(this.h, abngVar.h) && defpackage.anty.ah(this.i, abngVar.i) && defpackage.anty.ah(this.j, abngVar.j) && defpackage.anty.ah(this.k, abngVar.k) && defpackage.anty.ah(this.l, abngVar.l) && defpackage.anty.ah(this.m, abngVar.m) && defpackage.anty.ah(this.n, abngVar.n) && defpackage.anty.ah(this.o, abngVar.o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM = defpackage.anty.M(this.b) * 31;
        long j = this.o;
        long j2 = this.n;
        long j3 = this.m;
        long j4 = this.l;
        long j5 = this.k;
        long j6 = this.j;
        long j7 = this.i;
        long j8 = this.h;
        long j9 = this.g;
        long j10 = this.f;
        long j11 = this.e;
        return ((((((((((((((((((((((((iM + defpackage.anty.M(this.c)) * 31) + defpackage.anty.M(this.d)) * 31) + defpackage.anty.M(j11)) * 31) + defpackage.anty.M(j10)) * 31) + defpackage.anty.M(j9)) * 31) + defpackage.anty.M(j8)) * 31) + defpackage.anty.M(j7)) * 31) + defpackage.anty.M(j6)) * 31) + defpackage.anty.M(j5)) * 31) + defpackage.anty.M(j4)) * 31) + defpackage.anty.M(j3)) * 31) + defpackage.anty.M(j2)) * 31) + defpackage.anty.M(j);
    }

    public final java.lang.String toString() {
        long j = this.o;
        long j2 = this.n;
        long j3 = this.m;
        long j4 = this.l;
        long j5 = this.k;
        long j6 = this.j;
        long j7 = this.i;
        long j8 = this.h;
        long j9 = this.g;
        long j10 = this.f;
        long j11 = this.e;
        long j12 = this.d;
        long j13 = this.c;
        return "AbcMonogramColors(red=" + defpackage.cqg.g(this.b) + ", yellow=" + defpackage.cqg.g(j13) + ", purple=" + defpackage.cqg.g(j12) + ", orange=" + defpackage.cqg.g(j11) + ", green=" + defpackage.cqg.g(j10) + ", pink=" + defpackage.cqg.g(j9) + ", cyan=" + defpackage.cqg.g(j8) + ", onRed=" + defpackage.cqg.g(j7) + ", onYellow=" + defpackage.cqg.g(j6) + ", onPurple=" + defpackage.cqg.g(j5) + ", onOrange=" + defpackage.cqg.g(j4) + ", onGreen=" + defpackage.cqg.g(j3) + ", onPink=" + defpackage.cqg.g(j2) + ", onCyan=" + defpackage.cqg.g(j) + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ abng(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        float[] fArr = defpackage.crp.a;
        defpackage.csb csbVar = defpackage.crp.u;
        this(j, j2, j3, j4, j5, j6, j7, defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar), defpackage.cfd.N(0.0f, 0.0f, 0.0f, 0.0f, csbVar));
    }
}
