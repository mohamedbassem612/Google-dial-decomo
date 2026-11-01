package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oug {
    public j$.util.Optional a;
    private defpackage.ouj b;
    private int c;
    private boolean d;
    private j$.util.Optional e;
    private java.lang.String f;
    private j$.util.Optional g;
    private boolean h;
    private boolean i;
    private byte j;

    public oug(byte[] bArr) {
        this.e = j$.util.Optional.empty();
        this.g = j$.util.Optional.empty();
        this.a = j$.util.Optional.empty();
    }

    public final defpackage.oui a() {
        defpackage.ouj oujVar;
        java.lang.String str;
        if (this.j == 15 && (oujVar = this.b) != null && (str = this.f) != null) {
            return new defpackage.oui(oujVar, this.c, this.d, this.e, str, this.g, this.h, this.i, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" priority");
        }
        if ((this.j & 1) == 0) {
            sb.append(" iconRes");
        }
        if ((this.j & 2) == 0) {
            sb.append(" tintIconWithPrimaryColor");
        }
        if (this.f == null) {
            sb.append(" label");
        }
        if ((this.j & 4) == 0) {
            sb.append(" highlighted");
        }
        if ((this.j & 8) == 0) {
            sb.append(" useGiBranding");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null growthkitViewTag");
        }
        this.g = optional;
    }

    public final void c(boolean z) {
        this.h = z;
        this.j = (byte) (this.j | 4);
    }

    public final void d(int i) {
        this.c = i;
        this.j = (byte) (this.j | 1);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null label");
        }
        this.f = str;
    }

    public final void f(defpackage.ouj oujVar) {
        if (oujVar == null) {
            throw new java.lang.NullPointerException("Null priority");
        }
        this.b = oujVar;
    }

    public final void g(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null tint");
        }
        this.e = optional;
    }

    public final void h(boolean z) {
        this.d = z;
        this.j = (byte) (this.j | 2);
    }

    public final void i(boolean z) {
        this.i = z;
        this.j = (byte) (this.j | 8);
    }

    public oug() {
        throw null;
    }
}
