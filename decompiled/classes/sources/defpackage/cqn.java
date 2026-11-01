package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cqn extends defpackage.dca {
    private final float a;
    private final float b;
    private final float d;
    private final float g;
    private final float j;
    private final float k;
    private final long l;
    private final defpackage.crd m;
    private final boolean n;
    private final long o;
    private final long p;
    private final int q;
    private final defpackage.cqr t;
    private final float e = 0.0f;
    private final float f = 0.0f;
    private final float h = 0.0f;
    private final float i = 0.0f;
    private final defpackage.sa u = null;
    private final int r = 3;
    private final defpackage.cqh s = null;

    public cqn(float f, float f2, float f3, float f4, float f5, float f6, long j, defpackage.crd crdVar, boolean z, long j2, long j3, int i, defpackage.cqr cqrVar) {
        this.a = f;
        this.b = f2;
        this.d = f3;
        this.g = f4;
        this.j = f5;
        this.k = f6;
        this.l = j;
        this.m = crdVar;
        this.n = z;
        this.o = j2;
        this.p = j3;
        this.q = i;
        this.t = cqrVar;
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ defpackage.cmv d() {
        return new defpackage.cre(this.a, this.b, this.d, this.g, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.t);
    }

    @Override // defpackage.dca
    public final /* bridge */ /* synthetic */ void e(defpackage.cmv cmvVar) {
        defpackage.cre creVar = (defpackage.cre) cmvVar;
        creVar.a = this.a;
        creVar.b = this.b;
        creVar.c = this.d;
        creVar.d = 0.0f;
        creVar.e = 0.0f;
        creVar.f = this.g;
        creVar.g = 0.0f;
        creVar.h = 0.0f;
        creVar.i = this.j;
        creVar.j = this.k;
        creVar.k = this.l;
        creVar.l = this.m;
        creVar.m = this.n;
        creVar.F = null;
        creVar.n = this.o;
        creVar.o = this.p;
        creVar.p = this.q;
        creVar.q = 3;
        creVar.r = null;
        creVar.s = this.t;
        defpackage.cfo.v(creVar, creVar.E);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.cqn) {
            defpackage.cqn cqnVar = (defpackage.cqn) obj;
            if (java.lang.Float.compare(this.a, cqnVar.a) == 0 && java.lang.Float.compare(this.b, cqnVar.b) == 0 && java.lang.Float.compare(this.d, cqnVar.d) == 0) {
                float f = cqnVar.e;
                float f2 = cqnVar.f;
                if (java.lang.Float.compare(this.g, cqnVar.g) == 0) {
                    float f3 = cqnVar.h;
                    float f4 = cqnVar.i;
                    if (java.lang.Float.compare(this.j, cqnVar.j) == 0 && java.lang.Float.compare(this.k, cqnVar.k) == 0 && this.l == cqnVar.l && defpackage.aooh.n(this.m, cqnVar.m) && this.n == cqnVar.n) {
                        defpackage.sa saVar = cqnVar.u;
                        if (this.o == cqnVar.o && this.p == cqnVar.p && this.q == cqnVar.q) {
                            int i = cqnVar.r;
                            defpackage.cqh cqhVar = cqnVar.s;
                            if (defpackage.aooh.n(this.t, cqnVar.t)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((((((((java.lang.Float.floatToIntBits(this.a) * 31) + java.lang.Float.floatToIntBits(this.b)) * 31) + java.lang.Float.floatToIntBits(this.d)) * 29791) + java.lang.Float.floatToIntBits(this.g)) * 29791) + java.lang.Float.floatToIntBits(this.j)) * 31) + java.lang.Float.floatToIntBits(this.k);
        long j = this.l;
        int iHashCode = (((iFloatToIntBits * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.m.hashCode();
        boolean z = this.n;
        int iHashCode2 = this.t.hashCode();
        int i = true != z ? 1237 : 1231;
        long j2 = this.o;
        long j3 = this.p;
        return (((((((((((iHashCode * 31) + i) * 961) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.q) * 31) + 3) * 961) + iHashCode2;
    }

    public final java.lang.String toString() {
        int i = this.q;
        long j = this.p;
        long j2 = this.o;
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.d + ", translationX=0.0, translationY=0.0, shadowElevation=" + this.g + ", rotationX=0.0, rotationY=0.0, rotationZ=" + this.j + ", cameraDistance=" + this.k + ", transformOrigin=" + defpackage.crg.a(this.l) + ", shape=" + this.m + ", clip=" + this.n + ", renderEffect=null, ambientShadowColor=" + defpackage.cqg.g(j2) + ", spotShadowColor=" + defpackage.cqg.g(j) + ", compositingStrategy=" + defpackage.cqk.a(i) + ", blendMode=" + defpackage.cpz.a(3) + ", colorFilter=null, outsets=" + this.t + ')';
    }
}
