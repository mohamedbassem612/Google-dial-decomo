package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tvj {
    public java.lang.String a;
    private long b;
    private java.lang.String c;
    private byte d;

    public final defpackage.tvk a() {
        java.lang.String str;
        if (this.d == 1 && (str = this.c) != null) {
            return new defpackage.tvk(this.b, str, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" id");
        }
        if (this.c == null) {
            sb.append(" lookupKey");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.b = j;
        this.d = (byte) 1;
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null lookupKey");
        }
        this.c = str;
    }
}
