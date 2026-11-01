package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apuv extends org.chromium.net.NetworkException {
    public final android.net.http.NetworkException a;

    public apuv(android.net.http.NetworkException networkException, boolean z) {
        super(networkException.getMessage(), null);
        this.a = networkException;
        a(this, networkException);
        if (!z && defpackage.aabo$$ExternalSyntheticApiModelOutline0.m$1(networkException)) {
            throw new java.lang.IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }

    static void a(java.lang.Throwable th, java.lang.Throwable th2) {
        th.addSuppressed(th2);
        java.util.Set setNewSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
        while (th2.getCause() != null && setNewSetFromMap.add(th2.getCause())) {
            th2 = th2.getCause();
        }
        th.setStackTrace(th2.getStackTrace());
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return -508;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a.getErrorCode();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        return this.a.isImmediatelyRetryable();
    }
}
