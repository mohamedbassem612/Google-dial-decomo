package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynm {
    public float a;
    public int b;
    public boolean c;
    public int d;
    public defpackage.ymm e;
    public defpackage.yno f;
    public defpackage.yod g;
    public short h;
    private aify i;
    private float j;
    private int k;
    private aify l;
    private int m;
    private int n;

    public final defpackage.ynn a() {
        aify aifyVar;
        aify aifyVar2;
        defpackage.ymm ymmVar;
        defpackage.yod yodVar;
        if (this.h == 8191 && (aifyVar = this.i) != null && (aifyVar2 = this.l) != null && (ymmVar = this.e) != null && (yodVar = this.g) != null) {
            return new defpackage.ynn(aifyVar, this.j, this.k, this.a, aifyVar2, this.m, this.n, this.b, this.c, this.d, ymmVar, this.f, yodVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.i == null) {
            sb.append(" messages");
        }
        if ((this.h & 1) == 0) {
            sb.append(" temperature");
        }
        if ((this.h & 2) == 0) {
            sb.append(" topK");
        }
        if ((this.h & 4) == 0) {
            sb.append(" topP");
        }
        if (this.l == null) {
            sb.append(" stopTokensList");
        }
        if ((this.h & 8) == 0) {
            sb.append(" targetReplyLengthMin");
        }
        if ((this.h & 16) == 0) {
            sb.append(" targetReplyLengthMax");
        }
        if ((this.h & 32) == 0) {
            sb.append(" numSamples");
        }
        if ((this.h & 64) == 0) {
            sb.append(" shouldApplySafetyFilter");
        }
        if ((this.h & 128) == 0) {
            sb.append(" preferredImageWidth");
        }
        if ((this.h & 256) == 0) {
            sb.append(" preferredImageHeight");
        }
        if ((this.h & 512) == 0) {
            sb.append(" numSoftTokens");
        }
        if ((this.h & 1024) == 0) {
            sb.append(" rngSeed");
        }
        if (this.e == null) {
            sb.append(" userProperties");
        }
        if ((this.h & 2048) == 0) {
            sb.append(" overrideRequestKind");
        }
        if ((this.h & 4096) == 0) {
            sb.append(" enableThinking");
        }
        if (this.g == null) {
            sb.append(" tools");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(java.util.List list) {
        this.i = aify.n(list);
    }

    public final void c(java.util.List list) {
        this.l = aify.n(list);
    }

    public final void d(int i) {
        this.n = i;
        this.h = (short) (this.h | 16);
    }

    public final void e(int i) {
        this.m = i;
        this.h = (short) (this.h | 8);
    }

    public final void f(float f) {
        this.j = f;
        this.h = (short) (this.h | 1);
    }

    public final void g(int i) {
        this.k = i;
        this.h = (short) (this.h | 2);
    }
}
