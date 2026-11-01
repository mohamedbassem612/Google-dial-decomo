package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajbg {
    public static final boolean b;
    public final defpackage.ajbe c;
    public static final defpackage.ajcp a = new defpackage.ajcp(defpackage.ajbg.class);
    public static final int d = new int[]{1, 2}[0];

    static {
        boolean z = true;
        try {
            java.lang.ref.Reference.class.getMethod("reachabilityFence", java.lang.Object.class).invoke(null, defpackage.ajbg.class);
        } catch (java.lang.IllegalAccessException | java.lang.NoSuchMethodException unused) {
            z = false;
        } catch (java.lang.reflect.InvocationTargetException e) {
            ahzn.c(e.getCause());
            throw new java.lang.AssertionError(e.getCause());
        }
        b = z;
    }

    public ajbg(defpackage.ajcq ajcqVar, defpackage.ajbb ajbbVar) {
        this.c = new defpackage.ajbe(defpackage.ajck.w(ajcqVar), ajbbVar);
        int i = defpackage.ajbd.d;
        try {
            defpackage.ajbd.b.add(new defpackage.ajbd(this));
        } finally {
            defpackage.aiql.L(d, this);
        }
    }

    @java.lang.Deprecated
    public static defpackage.ajbg b(defpackage.ajcq ajcqVar, java.util.concurrent.Executor executor) {
        defpackage.ajbg ajbgVar = new defpackage.ajbg(defpackage.aiql.A(ajcqVar));
        defpackage.ajaw ajawVar = new defpackage.ajaw(ajbgVar, executor);
        ajcqVar.c(new defpackage.ajcc(ajcqVar, ajawVar), defpackage.ajbm.INSTANCE);
        return ajbgVar;
    }

    public static void g(java.lang.AutoCloseable autoCloseable, java.util.concurrent.Executor executor) {
        if (autoCloseable != null) {
            try {
                executor.execute(new defpackage.ahjn(autoCloseable, 7));
            } catch (java.util.concurrent.RejectedExecutionException e) {
                defpackage.ajcp ajcpVar = a;
                if (ajcpVar.a().isLoggable(java.util.logging.Level.WARNING)) {
                    ajcpVar.a().logp(java.util.logging.Level.WARNING, "com.google.common.util.concurrent.ClosingFuture", "closeQuietly", java.lang.String.format("while submitting close to %s; will close inline", executor), (java.lang.Throwable) e);
                }
                g(autoCloseable, defpackage.ajbm.INSTANCE);
            }
        }
    }

    private final defpackage.ajbg i(defpackage.ajck ajckVar) {
        try {
            defpackage.ajbg ajbgVar = new defpackage.ajbg(ajckVar);
            this.c.a(ajbgVar.c.b);
            return ajbgVar;
        } finally {
            defpackage.aiql.L(d, this);
        }
    }

    public final defpackage.ajbg a(java.lang.Class cls, defpackage.ajbc ajbcVar, java.util.concurrent.Executor executor) {
        return i(this.c.c.v(cls, new ajay(this, ajbcVar), executor));
    }

    public final defpackage.ajbg c(defpackage.ajbc ajbcVar, java.util.concurrent.Executor executor) {
        return i(this.c.c.y(new defpackage.ajax(this, ajbcVar, 0), executor));
    }

    public final defpackage.ajbg d(defpackage.ajba ajbaVar, java.util.concurrent.Executor executor) {
        return i(this.c.c.y(new defpackage.ajax(this, ajbaVar, 2), executor));
    }

    public final defpackage.ajcq e() {
        try {
            return defpackage.aiql.A(this.c.c.x(new defpackage.ahye(null), defpackage.ajbm.INSTANCE));
        } finally {
            defpackage.aiql.L(d, this);
        }
    }

    public final void f(defpackage.ajbb ajbbVar) {
        this.c.a(ajbbVar);
    }

    public final defpackage.ajck h() {
        try {
            return this.c.e();
        } finally {
            defpackage.aiql.L(d, this);
        }
    }

    public final java.lang.String toString() {
        return this.c.toString();
    }

    public ajbg(defpackage.ajcq ajcqVar) {
        this(ajcqVar, new defpackage.ajbb());
    }
}
