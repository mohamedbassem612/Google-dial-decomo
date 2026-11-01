package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aizu extends defpackage.ajbv implements java.lang.Runnable {
    public static final /* synthetic */ int d = 0;
    defpackage.ajcq a;
    java.lang.Class b;
    java.lang.Object c;

    public aizu(defpackage.ajcq ajcqVar, java.lang.Class cls, java.lang.Object obj) {
        ajcqVar.getClass();
        this.a = ajcqVar;
        this.b = cls;
        this.c = obj;
    }

    public static defpackage.ajcq f(defpackage.ajcq ajcqVar, java.lang.Class cls, defpackage.ahyc ahycVar, java.util.concurrent.Executor executor) {
        defpackage.aizt aiztVar = new defpackage.aizt(ajcqVar, cls, ahycVar);
        ajcqVar.c(aiztVar, defpackage.aiql.t(executor, aiztVar));
        return aiztVar;
    }

    public static defpackage.ajcq g(defpackage.ajcq ajcqVar, java.lang.Class cls, defpackage.ajat ajatVar, java.util.concurrent.Executor executor) {
        defpackage.aizs aizsVar = new defpackage.aizs(ajcqVar, cls, ajatVar);
        ajcqVar.c(aizsVar, defpackage.aiql.t(executor, aizsVar));
        return aizsVar;
    }

    @Override // defpackage.ajac
    protected final void a() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    @Override // defpackage.ajac
    protected final java.lang.String b() {
        defpackage.ajcq ajcqVar = this.a;
        java.lang.Class cls = this.b;
        java.lang.Object obj = this.c;
        java.lang.String strB = super.b();
        java.lang.String strBJ = ajcqVar != null ? defpackage.a.bJ(ajcqVar, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strB != null) {
                return strBJ.concat(strB);
            }
            return null;
        }
        return strBJ + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + ']';
    }

    public abstract java.lang.Object d(java.lang.Object obj, java.lang.Throwable th);

    public abstract void e(java.lang.Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objH;
        defpackage.ajcq ajcqVar = this.a;
        java.lang.Class cls = this.b;
        java.lang.Object obj = this.c;
        if ((((ajcqVar == 0) | (cls == null)) || (obj == null)) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = ajcqVar instanceof defpackage.ajdm ? ((defpackage.ajdm) ajcqVar).j() : null;
            if (th == null) {
                defpackage.ahvr.cc(ajcqVar.isDone(), "Future was expected to be done: %s", ajcqVar);
                objH = defpackage.a.h(ajcqVar);
            } else {
                objH = null;
            }
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                cause = new java.lang.NullPointerException("Future type " + java.lang.String.valueOf(ajcqVar.getClass()) + " threw " + java.lang.String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            o(objH);
            return;
        }
        if (!cls.isInstance(th)) {
            q(ajcqVar);
            return;
        }
        try {
            java.lang.Object objD = d(obj, th);
            this.b = null;
            this.c = null;
            e(objD);
        } catch (java.lang.Throwable th2) {
            try {
                defpackage.aiql.p(th2);
                p(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
