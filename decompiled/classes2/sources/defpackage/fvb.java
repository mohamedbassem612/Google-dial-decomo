package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvb {
    private final java.lang.String a;
    private final int b;
    private final int c;
    private int d;
    private java.lang.String e;

    public fvb(int i, int i2, int i3) {
        java.lang.String string;
        if (i != Integer.MIN_VALUE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append('/');
            string = sb.toString();
        } else {
            string = "";
        }
        this.a = string;
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    private final void d() {
        if (this.d == Integer.MIN_VALUE) {
            throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int a() {
        d();
        return this.d;
    }

    public final java.lang.String b() {
        d();
        return this.e;
    }

    public final void c() {
        int i = this.d;
        int i2 = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.d = i2;
        this.e = this.a + i2;
    }
}
