package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pyh {
    public int a;
    private boolean b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private j$.util.Optional i = j$.util.Optional.empty();
    private byte j;

    public final defpackage.pyi a() {
        int i;
        if (this.j == 127 && (i = this.a) != 0) {
            return new defpackage.pyi(this.b, this.c, this.d, this.e, i, this.f, this.g, this.h, this.i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.j & 1) == 0) {
            sb.append(" shouldShow");
        }
        if ((this.j & 2) == 0) {
            sb.append(" containerResId");
        }
        if ((this.j & 4) == 0) {
            sb.append(" bottomSpace");
        }
        if ((this.j & 8) == 0) {
            sb.append(" hideShadow");
        }
        if (this.a == 0) {
            sb.append(" roundedCornerMode");
        }
        if ((this.j & 16) == 0) {
            sb.append(" hideCloseButton");
        }
        if ((this.j & 32) == 0) {
            sb.append(" scalableDialpad");
        }
        if ((this.j & 64) == 0) {
            sb.append(" expressiveStyle");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.j = (byte) (this.j | 4);
    }

    public final void c(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        this.i = optional;
    }

    public final void d(int i) {
        this.c = i;
        this.j = (byte) (this.j | 2);
    }

    public final void e(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 64);
    }

    public final void f(boolean z) {
        this.f = z;
        this.j = (byte) (this.j | 16);
    }

    public final void g(boolean z) {
        this.e = z;
        this.j = (byte) (this.j | 8);
    }

    public final void h(boolean z) {
        this.g = z;
        this.j = (byte) (this.j | 32);
    }

    public final void i(boolean z) {
        this.b = z;
        this.j = (byte) (this.j | 1);
    }
}
