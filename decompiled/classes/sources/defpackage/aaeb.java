package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aaeb extends com.google.android.gms.common.api.internal.BasePendingResult implements defpackage.aaec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aaeb(defpackage.acxg acxgVar, defpackage.aade aadeVar) {
        super(aadeVar);
        if (aadeVar == null) {
            throw new java.lang.NullPointerException("GoogleApiClient must not be null");
        }
        if (acxgVar == null) {
            throw new java.lang.NullPointerException("Api must not be null");
        }
    }

    private final void n(android.os.RemoteException remoteException) {
        i(new com.google.android.gms.common.api.Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    protected abstract void b(defpackage.aacr aacrVar);

    public /* bridge */ /* synthetic */ void c(java.lang.Object obj) {
        throw null;
    }

    public final void h(defpackage.aacr aacrVar) throws android.os.DeadObjectException {
        try {
            b(aacrVar);
        } catch (android.os.DeadObjectException e) {
            n(e);
            throw e;
        } catch (android.os.RemoteException e2) {
            n(e2);
        }
    }

    public final void i(com.google.android.gms.common.api.Status status) {
        defpackage.aais.aj(!status.c(), "Failed result must not be success");
        l(a(status));
    }
}
