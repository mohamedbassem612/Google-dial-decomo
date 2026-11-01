package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeus {
    public int a;
    public byte b;
    public int c;
    public java.lang.Object d = j$.util.Optional.empty();

    public aeus(byte[] bArr, byte[] bArr2) {
    }

    public final defpackage.aeuu a() {
        int i;
        java.lang.Object obj;
        if (this.b == 7 && (i = this.c) != 0 && (obj = this.d) != null) {
            return new defpackage.aeuu(i, this.a, (defpackage.aeut) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if ((this.b & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if (this.d == null) {
            sb.append(" dynamicSampler");
        }
        if ((this.b & 2) == 0) {
            sb.append(" recordTimerDuration");
        }
        if ((this.b & 4) == 0) {
            sb.append(" sendEmptyTraces");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.d = "";
    }

    public final void c() {
        this.b = (byte) 1;
    }

    public final void d() {
        if (this.b == 1 && this.d != null && this.c != 0 && this.a != 0) {
            int i = aanb.a;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == null) {
            sb.append(" fileOwner");
        }
        if (this.b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.c == 0) {
            sb.append(" fileChecks");
        }
        if (this.a == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final tjj e() {
        if (this.b == 3) {
            return new tjj(this.a, (j$.util.Optional) this.d, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" stringId");
        }
        if ((this.b & 2) == 0) {
            sb.append(" drawableId");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f(int i) {
        this.d = j$.util.Optional.of(java.lang.Integer.valueOf(i));
    }

    public final void g(int i) {
        this.c = i;
        this.b = (byte) (this.b | 2);
    }

    public final void h(int i) {
        this.a = i;
        this.b = (byte) (this.b | 1);
    }
}
