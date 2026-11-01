package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aadu extends defpackage.aadp {
    private final defpackage.aafr a;
    private final defpackage.zzx b;

    public aadu(int i, defpackage.aafr aafrVar, defpackage.zzx zzxVar) {
        super(i);
        this.b = zzxVar;
        this.a = aafrVar;
        if (i == 2 && aafrVar.b) {
            throw new java.lang.IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.aadp
    public final int a(defpackage.aaeo aaeoVar) {
        return this.a.c;
    }

    @Override // defpackage.aadp
    public final void b(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        ((defpackage.aaum) this.b.a).n(executor, new aadq(runnable, 2));
    }

    @Override // defpackage.aadp
    public final boolean c(defpackage.aaeo aaeoVar) {
        return this.a.b;
    }

    @Override // defpackage.aadp
    public final com.google.android.gms.common.Feature[] d(defpackage.aaeo aaeoVar) {
        return this.a.a;
    }

    @Override // defpackage.aadw
    public final void f(com.google.android.gms.common.api.Status status) {
        this.b.h(defpackage.aehj.bY(status));
    }

    @Override // defpackage.aadw
    public final void g(java.lang.Exception exc) {
        if (k(exc)) {
            return;
        }
        this.b.h(exc);
    }

    @Override // defpackage.aadw
    public final void h(defpackage.aaeo aaeoVar) throws android.os.DeadObjectException {
        try {
            defpackage.aafr aafrVar = this.a;
            aafrVar.d.a.a(aaeoVar.b, this.b);
        } catch (android.os.DeadObjectException e) {
            throw e;
        } catch (android.os.RemoteException e2) {
            f(defpackage.aadw.j(e2));
        } catch (java.lang.RuntimeException e3) {
            g(e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.aadw
    public final void i(defpackage.acxg acxgVar, boolean z) {
        ?? r0 = acxgVar.a;
        defpackage.zzx zzxVar = this.b;
        r0.put(zzxVar, java.lang.Boolean.valueOf(z));
        ((defpackage.aaum) zzxVar.a).m(new defpackage.aaek(acxgVar, zzxVar));
    }
}
