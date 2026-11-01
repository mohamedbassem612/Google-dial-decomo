package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ggd implements defpackage.giv, defpackage.giu {
    public static final java.util.TreeMap a = new java.util.TreeMap();
    public final long[] b;
    public final double[] c;
    public final java.lang.String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;
    private volatile java.lang.String h;

    public ggd(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new java.lang.String[i2];
        this.e = new byte[i2][];
    }

    @Override // defpackage.giu
    public final void a(int i, byte[] bArr) {
        defpackage.aooh.f(bArr, "value");
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // defpackage.giu
    public final void b(int i, double d) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // defpackage.giu
    public final void c(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // defpackage.giu
    public final void d(int i) {
        this.f[i] = 1;
    }

    @Override // defpackage.giu
    public final void e(int i, java.lang.String str) {
        defpackage.aooh.f(str, "value");
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // defpackage.giv
    public final java.lang.String f() {
        java.lang.String str = this.h;
        if (str != null) {
            return str;
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    @Override // defpackage.giv
    public final void g(defpackage.giu giuVar) {
        int i = this.g;
        if (i <= 0) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                giuVar.d(i2);
            } else if (i3 == 2) {
                giuVar.c(i2, this.b[i2]);
            } else if (i3 == 3) {
                giuVar.b(i2, this.c[i2]);
            } else if (i3 == 4) {
                java.lang.String str = this.d[i2];
                if (str == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                giuVar.e(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                giuVar.a(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void h(java.lang.String str, int i) {
        if (str == null) {
            defpackage.aooh.i("query");
        }
        this.h = str;
        this.g = i;
    }

    public final defpackage.rsr i() {
        return new defpackage.rsr(f(), (defpackage.aonj) new defpackage.ddz(this, 16));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
