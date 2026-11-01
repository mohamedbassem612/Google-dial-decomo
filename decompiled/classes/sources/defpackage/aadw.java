package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aadw {
    public final int c;
    public boolean d = false;
    public boolean e = false;

    public aadw(int i) {
        this.c = i;
    }

    public static com.google.android.gms.common.api.Status j(android.os.RemoteException remoteException) {
        return new com.google.android.gms.common.api.Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract void f(com.google.android.gms.common.api.Status status);

    public abstract void g(java.lang.Exception exc);

    public abstract void h(defpackage.aaeo aaeoVar);

    public abstract void i(defpackage.acxg acxgVar, boolean z);

    protected final boolean k(java.lang.Exception exc) {
        if (exc != null && exc.getMessage() != null) {
            java.lang.String message = exc.getMessage();
            if (message.startsWith("Throttled:") || message.startsWith("GmsCore module throttled:")) {
                f(new com.google.android.gms.common.api.Status(23, exc.getLocalizedMessage(), null, null));
                return true;
            }
        }
        return false;
    }
}
