package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ghl implements giw {
    public final java.lang.String a;
    public int[] b;
    public long[] c;
    public double[] d;
    public java.lang.String[] e;
    public byte[][] f;
    private final ghh g;

    public ghl(java.lang.String str, ghh ghhVar) {
        aooh.f(str, "sql");
        this.a = str;
        this.g = ghhVar;
        this.b = new int[0];
        this.c = new long[0];
        this.d = new double[0];
        this.e = new java.lang.String[0];
        this.f = new byte[0][];
    }

    private final void g(int i, int i2) {
        int[] iArr = this.b;
        int i3 = i2 + 1;
        if (iArr.length < i3) {
            int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, i3);
            aooh.e(iArrCopyOf, "copyOf(...)");
            this.b = iArrCopyOf;
        }
        if (i == 1) {
            long[] jArr = this.c;
            if (jArr.length < i3) {
                long[] jArrCopyOf = java.util.Arrays.copyOf(jArr, i3);
                aooh.e(jArrCopyOf, "copyOf(...)");
                this.c = jArrCopyOf;
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.d;
            if (dArr.length < i3) {
                double[] dArrCopyOf = java.util.Arrays.copyOf(dArr, i3);
                aooh.e(dArrCopyOf, "copyOf(...)");
                this.d = dArrCopyOf;
                return;
            }
            return;
        }
        if (i == 3) {
            java.lang.String[] strArr = this.e;
            if (strArr.length < i3) {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(strArr, i3);
                aooh.e(objArrCopyOf, "copyOf(...)");
                this.e = (java.lang.String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i == 4) {
            byte[][] bArr = this.f;
            if (bArr.length < i3) {
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(bArr, i3);
                aooh.e(objArrCopyOf2, "copyOf(...)");
                this.f = (byte[][]) objArrCopyOf2;
            }
        }
    }

    public final void a(int i, byte[] bArr) {
        aooh.f(bArr, "value");
        g(4, i);
        this.b[i] = 4;
        this.f[i] = bArr;
    }

    public final void b(int i, double d) {
        g(2, i);
        this.b[i] = 2;
        this.d[i] = d;
    }

    public final void c(int i, long j) {
        g(1, i);
        this.b[i] = 1;
        this.c[i] = j;
    }

    public final void close() {
        this.b = new int[0];
        this.c = new long[0];
        this.d = new double[0];
        this.e = new java.lang.String[0];
        this.f = new byte[0][];
    }

    public final void d(int i) {
        g(5, i);
        this.b[i] = 5;
    }

    public final void e(int i, java.lang.String str) {
        aooh.f(str, "value");
        g(3, i);
        this.b[i] = 3;
        this.e[i] = str;
    }

    public final void f() {
        this.g.b(new dpz(this, new defpackage.fvt(16), 16, (byte[]) null));
    }
}
