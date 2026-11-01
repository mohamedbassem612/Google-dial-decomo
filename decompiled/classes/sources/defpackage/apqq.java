package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apqq extends defpackage.apow {
    private final java.net.Socket a;

    public apqq(java.net.Socket socket) {
        if (socket == null) {
            defpackage.aooh.i("socket");
        }
        this.a = socket;
    }

    @Override // defpackage.apow
    protected final void a() {
        try {
            this.a.close();
        } catch (java.lang.AssertionError e) {
            if (!apqt.a(e)) {
                throw e;
            }
            java.net.Socket socket = this.a;
            java.util.logging.Logger logger = apqt.a;
            java.util.logging.Level level = java.util.logging.Level.WARNING;
            java.util.Objects.toString(socket);
            logger.log(level, "Failed to close timed out socket ".concat(java.lang.String.valueOf(socket)), (java.lang.Throwable) e);
        } catch (java.lang.Exception e2) {
            java.net.Socket socket2 = this.a;
            java.util.logging.Logger logger2 = apqt.a;
            java.util.logging.Level level2 = java.util.logging.Level.WARNING;
            java.util.Objects.toString(socket2);
            logger2.log(level2, "Failed to close timed out socket ".concat(java.lang.String.valueOf(socket2)), (java.lang.Throwable) e2);
        }
    }

    @Override // defpackage.apow
    public final java.io.IOException c(java.io.IOException iOException) {
        java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
