package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akcu {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final defpackage.akcv a() {
        if (this.d == 7) {
            return new defpackage.akcv(this.a, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" enableCelLogsiteMetadata");
        }
        if ((this.d & 2) == 0) {
            sb.append(" enableSafeFormatArgs");
        }
        if ((this.d & 4) == 0) {
            sb.append(" includeSuppressedExceptions");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final oph e() {
        if (this.d == 7) {
            return new oph(this.a, this.c, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" circleCropPhoto");
        }
        if ((this.d & 2) == 0) {
            sb.append(" showDefaultPlaceholderPhoto");
        }
        if ((this.d & 4) == 0) {
            sb.append(" showDefaultFallbackPhoto");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f() {
        this.a = true;
        this.d = (byte) (this.d | 1);
    }

    public final void g(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 4);
    }

    public final void h(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }
}
