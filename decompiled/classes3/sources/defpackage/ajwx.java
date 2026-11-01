package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajwx {
    public java.lang.String a;
    public int b;
    private long c;
    private byte d;

    public final defpackage.ajwy a() {
        if (this.d == 1) {
            return new defpackage.ajwy(this.a, this.c, this.b);
        }
        throw new java.lang.IllegalStateException("Missing required properties: tokenExpirationTimestamp");
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final defpackage.rgu c() {
        java.lang.String str;
        int i;
        if (this.d == 1 && (str = this.a) != null && (i = this.b) != 0) {
            return new defpackage.rgu(str, i, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == 0) {
            sb.append(" renderingGuide");
        }
        if (this.d == 0) {
            sb.append(" creationTimeMillis");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
    }
}
