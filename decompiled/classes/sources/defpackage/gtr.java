package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gtr implements defpackage.gwj {
    public static final java.lang.String a = defpackage.gsh.b("Processor");
    public final android.content.Context c;
    public final defpackage.grk d;
    public final androidx.work.impl.WorkDatabase e;
    public final defpackage.gou m;
    public final java.util.Map g = new java.util.HashMap();
    public final java.util.Map f = new java.util.HashMap();
    public final java.util.Set i = new java.util.HashSet();
    public final java.util.List j = new java.util.ArrayList();
    public final java.util.List k = new java.util.ArrayList();
    public android.os.PowerManager.WakeLock b = null;
    public final java.lang.Object l = new java.lang.Object();
    public final java.util.Map h = new java.util.HashMap();

    public gtr(android.content.Context context, defpackage.grk grkVar, defpackage.gou gouVar, androidx.work.impl.WorkDatabase workDatabase) {
        this.c = context;
        this.d = grkVar;
        this.m = gouVar;
        this.e = workDatabase;
    }

    public static boolean e(java.lang.String str, defpackage.gve gveVar, int i) {
        if (gveVar == null) {
            defpackage.gsh.a().c(a, "WorkerWrapper could not be found for ".concat(java.lang.String.valueOf(str)));
            return false;
        }
        gveVar.j.s(new defpackage.guu(i));
        defpackage.gsh.a().c(a, "WorkerWrapper interrupted for " + str + " (" + gveVar.a.d + "), reason: " + i);
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [gyt, java.lang.Object] */
    public final defpackage.gve a(java.lang.String str) {
        java.util.Map map = this.f;
        defpackage.gve gveVar = (defpackage.gve) map.remove(str);
        boolean z = gveVar != null;
        if (!z) {
            gveVar = (defpackage.gve) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.l) {
                if (map.isEmpty()) {
                    android.content.Context context = this.c;
                    int i = gwl.k;
                    android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) androidx.work.impl.foreground.SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        context.startService(intent);
                    } catch (java.lang.Throwable th) {
                        defpackage.gsh.a();
                        android.util.Log.e(a, "Unable to stop foreground service", th);
                    }
                    android.os.PowerManager.WakeLock wakeLock = this.b;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.b = null;
                    }
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(this.k);
            defpackage.gxd gxdVarA = gveVar.a();
            this.m.e.execute(new gra(arrayList, gxdVarA, 2));
        }
        return gveVar;
    }

    public final defpackage.gve b(java.lang.String str) {
        defpackage.gve gveVar = (defpackage.gve) this.f.get(str);
        return gveVar == null ? (defpackage.gve) this.g.get(str) : gveVar;
    }

    public final void c(defpackage.gtf gtfVar) {
        synchronized (this.l) {
            this.j.add(gtfVar);
        }
    }

    public final void d(defpackage.gtf gtfVar) {
        synchronized (this.l) {
            this.j.remove(gtfVar);
        }
    }

    public final boolean f(java.lang.String str) {
        boolean z;
        synchronized (this.l) {
            z = b(str) != null;
        }
        return z;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void g(defpackage.gxd gxdVar) {
        this.m.c.execute(new gra(this, gxdVar, 3, (byte[]) null));
    }
}
