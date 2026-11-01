package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apwp extends org.chromium.net.NetworkException {
    protected final int a;
    protected final int b;

    public apwp() {
        super("Network bound to request not found", null);
        this.a = 9;
        this.b = -4;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        int i = this.a;
        sb.append(i);
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(i2);
        }
        sb.append(", Retryable=");
        sb.append(i == 3 || i == 4 || i == 5 || i == 6 || i == 8);
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.a;
        return i == 3 || i == 4 || i == 5 || i == 6 || i == 8;
    }
}
