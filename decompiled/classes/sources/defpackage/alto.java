package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alto {
    public int a;
    public int b;
    public byte c;

    public final altp a() {
        if (this.c == 3) {
            return new altp(this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" start");
        }
        if ((this.c & 2) == 0) {
            sb.append(" end");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public final void c(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }

    public final defpackage.aesl d() {
        int i;
        if (this.c == 3 && (i = this.b) != 0) {
            return new defpackage.aesl(i, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.c & 2) == 0) {
            sb.append(" perfettoMustBeExplicitlyTriggered");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final vpf e() {
        int i = this.b;
        int i2 = this.a;
        int i3 = ~this.c;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return new vpf(i, i2);
    }

    public final void f(int i) {
        this.b = i;
        this.c = (byte) (this.c | 1);
    }

    public final reu g() {
        if (this.c == 3) {
            return new reu(this.a, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" titleTextRes");
        }
        if ((this.c & 2) == 0) {
            sb.append(" bodyTextRes");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void h(int i) {
        this.b = i;
        this.c = (byte) (this.c | 2);
    }

    public final void i(int i) {
        this.a = i;
        this.c = (byte) (this.c | 1);
    }
}
