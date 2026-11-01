package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class hfz implements java.io.Closeable {
    public static final java.lang.String[] a = new java.lang.String[128];
    int b;
    int[] c = new int[32];
    java.lang.String[] d = new java.lang.String[32];
    int[] e = new int[32];

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract double a();

    public abstract int b();

    final defpackage.hfy c(java.lang.String str) throws defpackage.hfy {
        throw new defpackage.hfy(str + " at path " + d());
    }

    public final java.lang.String d() {
        int i = this.b;
        int[] iArr = this.c;
        java.lang.String[] strArr = this.d;
        int[] iArr2 = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                java.lang.String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract java.lang.String e();

    public abstract java.lang.String f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    final void k(int i) {
        int i2 = this.b;
        int[] iArr = this.c;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new defpackage.hfx("Nesting too deep at ".concat(d()));
            }
            this.c = java.util.Arrays.copyOf(iArr, length << 1);
            java.lang.String[] strArr = this.d;
            this.d = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length << 1);
            int[] iArr2 = this.e;
            this.e = java.util.Arrays.copyOf(iArr2, iArr2.length << 1);
        }
        int[] iArr3 = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void l();

    public abstract void m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract int p();

    public abstract int q(defpackage.kvt kvtVar);
}
