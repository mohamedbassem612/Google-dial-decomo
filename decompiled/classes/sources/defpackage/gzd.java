package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class gzd {
    protected gzd() {
    }

    public static defpackage.gzd a(android.content.Context context) {
        defpackage.guq guqVarH = defpackage.guq.h(context);
        if (guqVarH.j == null) {
            synchronized (defpackage.guq.b) {
                if (guqVarH.j == null) {
                    try {
                        guqVarH.j = (defpackage.gzd) java.lang.Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(android.content.Context.class, defpackage.guq.class).newInstance(guqVarH.c, guqVarH);
                    } catch (java.lang.Throwable th) {
                        defpackage.gsh.a().d(defpackage.guq.a, "Unable to initialize multi-process support", th);
                    }
                    if (guqVarH.j == null) {
                        java.lang.String str = guqVarH.d.i;
                    }
                }
            }
        }
        defpackage.gzd gzdVar = guqVarH.j;
        if (gzdVar != null) {
            return gzdVar;
        }
        throw new java.lang.IllegalStateException("Unable to initialize RemoteWorkManager");
    }

    public abstract defpackage.ajcq b();

    public abstract defpackage.ajcq c();

    public abstract defpackage.ajcq d();

    public abstract defpackage.ajcq e();

    public abstract defpackage.ajcq f();

    public abstract defpackage.ajcq g();
}
