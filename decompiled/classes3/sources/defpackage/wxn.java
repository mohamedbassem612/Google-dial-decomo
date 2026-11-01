package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wxn {
    public java.lang.String a;
    private boolean b;
    private long c;
    private byte d;

    public final defpackage.wxo a() {
        java.lang.String str;
        if (this.d == 3 && (str = this.a) != null) {
            return new defpackage.wxo(str, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" phoneNumber");
        }
        if ((this.d & 1) == 0) {
            sb.append(" isIncomingCall");
        }
        if ((this.d & 2) == 0) {
            sb.append(" callCreationTimeMillis");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.c = j;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
    }
}
