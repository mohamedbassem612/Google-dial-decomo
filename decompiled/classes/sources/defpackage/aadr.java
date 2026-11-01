package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aadr extends defpackage.aadp {
    protected final defpackage.zzx a;

    public aadr(int i, defpackage.zzx zzxVar) {
        super(i);
        this.a = zzxVar;
    }

    @Override // defpackage.aadp
    public final void b(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        ((defpackage.aaum) this.a.a).n(executor, new aadq(runnable, 0));
    }

    protected abstract void e(defpackage.aaeo aaeoVar);

    @Override // defpackage.aadw
    public final void f(com.google.android.gms.common.api.Status status) {
        this.a.h(new defpackage.aacw(status));
    }

    @Override // defpackage.aadw
    public final void g(java.lang.Exception exc) {
        if (k(exc)) {
            return;
        }
        this.a.h(exc);
    }

    @Override // defpackage.aadw
    public final void h(defpackage.aaeo aaeoVar) throws android.os.DeadObjectException {
        try {
            e(aaeoVar);
        } catch (android.os.DeadObjectException e) {
            f(defpackage.aadw.j(e));
            throw e;
        } catch (android.os.RemoteException e2) {
            f(defpackage.aadw.j(e2));
        } catch (java.lang.RuntimeException e3) {
            g(e3);
        }
    }

    @Override // defpackage.aadw
    public void i(defpackage.acxg acxgVar, boolean z) {
    }
}
