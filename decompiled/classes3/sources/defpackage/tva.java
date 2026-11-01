package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class tva {
    private long a;
    private java.lang.String b;
    private java.lang.String c;
    private int d;
    private byte e;

    public final defpackage.tvb a() {
        java.lang.String str;
        java.lang.String str2;
        if (this.e == 3 && (str = this.b) != null && (str2 = this.c) != null) {
            return new defpackage.tvb(this.a, str, str2, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" contactId");
        }
        if (this.b == null) {
            sb.append(" lookupKey");
        }
        if (this.c == null) {
            sb.append(" displayName");
        }
        if ((this.e & 2) == 0) {
            sb.append(" rank");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void c(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null displayName");
        }
        this.c = str;
    }

    public final void d(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null lookupKey");
        }
        this.b = str;
    }

    public final void e(int i) {
        this.d = i;
        this.e = (byte) (this.e | 2);
    }
}
