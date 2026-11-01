package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ajan extends defpackage.ajbv implements java.lang.Runnable {
    public static final /* synthetic */ int c = 0;
    defpackage.ajcq a;
    java.lang.Object b;

    public ajan(defpackage.ajcq ajcqVar, java.lang.Object obj) {
        ajcqVar.getClass();
        this.a = ajcqVar;
        obj.getClass();
        this.b = obj;
    }

    public static defpackage.ajcq f(defpackage.ajcq ajcqVar, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        defpackage.ajam ajamVar = new defpackage.ajam(ajcqVar, ahycVar);
        ajcqVar.c(ajamVar, defpackage.aiql.t(executor, ajamVar));
        return ajamVar;
    }

    public static defpackage.ajcq g(defpackage.ajcq ajcqVar, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVar, ajatVar);
        ajcqVar.c(ajalVar, defpackage.aiql.t(executor, ajalVar));
        return ajalVar;
    }

    @Override // defpackage.ajac
    protected final void a() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajcq ajcqVar = this.a;
        java.lang.Object obj = this.b;
        java.lang.String strB = super.b();
        java.lang.String strBJ = ajcqVar != null ? defpackage.a.bJ(ajcqVar, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strB != null) {
                return strBJ.concat(strB);
            }
            return null;
        }
        return strBJ + "function=[" + obj.toString() + ']';
    }

    public abstract java.lang.Object d(java.lang.Object obj, java.lang.Object obj2);

    public abstract void e(java.lang.Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        defpackage.ajcq ajcqVar = this.a;
        java.lang.Object obj = this.b;
        if (!(isCancelled() | (ajcqVar == null)) && !(obj == null)) {
            this.a = null;
            if (ajcqVar.isCancelled()) {
                q(ajcqVar);
                return;
            }
            try {
                defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                try {
                    java.lang.Object objD = d(obj, defpackage.a.h(ajcqVar));
                    this.b = null;
                    e(objD);
                } catch (java.lang.Throwable th) {
                    try {
                        defpackage.aiql.p(th);
                        p(th);
                    } finally {
                        this.b = null;
                    }
                }
            } catch (java.lang.Error e) {
                p(e);
            } catch (java.util.concurrent.CancellationException unused) {
                cancel(false);
            } catch (java.util.concurrent.ExecutionException e2) {
                p(e2.getCause());
            } catch (java.lang.Exception e3) {
                p(e3);
            }
        }
    }
}
