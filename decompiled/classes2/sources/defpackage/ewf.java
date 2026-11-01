package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class ewf extends defpackage.evs {
    public final int b;

    public ewf() {
        super(b(2008, 1));
        this.b = 1;
    }

    public static defpackage.ewf a(java.io.IOException iOException, int i) {
        int i2;
        java.lang.String message = iOException.getMessage();
        if (iOException instanceof java.net.SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof java.io.InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !ahvr.p(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new defpackage.ewe(iOException) : new defpackage.ewf(iOException, i2, i);
    }

    private static int b(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public ewf(java.io.IOException iOException, int i, int i2) {
        super(iOException, b(i, i2));
        this.b = i2;
    }

    public ewf(java.lang.String str, java.io.IOException iOException, int i) {
        super(str, iOException, b(i, 1));
        this.b = 1;
    }
}
