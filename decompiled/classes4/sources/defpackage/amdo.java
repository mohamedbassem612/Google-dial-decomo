package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amdo {
    private float a;
    private int b;
    private float c;
    private int d;
    private float e;
    private int f;
    private int g;
    private int h;
    private double i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private short n = 8191;

    public amdo(defpackage.amdp amdpVar) {
        this.a = amdpVar.e;
        this.b = amdpVar.f;
        this.c = amdpVar.g;
        this.d = amdpVar.h;
        this.e = amdpVar.i;
        this.f = amdpVar.j;
        this.g = amdpVar.k;
        this.h = amdpVar.l;
        this.i = amdpVar.m;
        this.j = amdpVar.n;
        this.k = amdpVar.o;
        this.l = amdpVar.p;
        this.m = amdpVar.q;
    }

    public final defpackage.amdp a() {
        if (this.n == 8191) {
            return new defpackage.amdp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.n & 1) == 0) {
            sb.append(" minMatchRatio");
        }
        if ((this.n & 2) == 0) {
            sb.append(" maxConsecutiveErrors");
        }
        if ((this.n & 4) == 0) {
            sb.append(" maxCostToMatchWords");
        }
        if ((this.n & 8) == 0) {
            sb.append(" suffixTokensToCompare");
        }
        if ((this.n & 16) == 0) {
            sb.append(" suffixMinMatchRatio");
        }
        if ((this.n & 32) == 0) {
            sb.append(" minAsrTokens");
        }
        if ((this.n & 64) == 0) {
            sb.append(" maxIgnorableOnlineItemWords");
        }
        if ((this.n & 128) == 0) {
            sb.append(" suffixAsrTokensToIgnore");
        }
        if ((this.n & 256) == 0) {
            sb.append(" maxAmbiguityMatchCostDiff");
        }
        if ((this.n & 512) == 0) {
            sb.append(" maxDroppedCachePrefixWordCount");
        }
        if ((this.n & 1024) == 0) {
            sb.append(" isRematch");
        }
        if ((this.n & 2048) == 0) {
            sb.append(" splitUrls");
        }
        if ((this.n & 4096) == 0) {
            sb.append(" splitDigits");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.k = z;
        this.n = (short) (this.n | 1024);
    }

    public final void c(double d) {
        this.i = d;
        this.n = (short) (this.n | 256);
    }

    public final void d() {
        this.b = 2;
        this.n = (short) (this.n | 2);
    }

    public final void e(float f) {
        this.c = f;
        this.n = (short) (this.n | 4);
    }

    public final void f(int i) {
        this.j = i;
        this.n = (short) (this.n | 512);
    }

    public final void g() {
        this.g = 4;
        this.n = (short) (this.n | 64);
    }

    public final void h(int i) {
        this.f = i;
        this.n = (short) (this.n | 32);
    }

    public final void i(float f) {
        this.a = f;
        this.n = (short) (this.n | 1);
    }

    public final void j(boolean z) {
        this.m = z;
        this.n = (short) (this.n | 4096);
    }

    public final void k(boolean z) {
        this.l = z;
        this.n = (short) (this.n | 2048);
    }

    public final void l(int i) {
        this.h = i;
        this.n = (short) (this.n | 128);
    }

    public final void m(float f) {
        this.e = f;
        this.n = (short) (this.n | 16);
    }

    public final void n(int i) {
        this.d = i;
        this.n = (short) (this.n | 8);
    }
}
