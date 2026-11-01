package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apkv {
    public final long a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    private final java.lang.Object e;

    public apkv(defpackage.apkc apkcVar, java.util.concurrent.TimeUnit timeUnit, defpackage.apkh apkhVar) {
        if (apkcVar == null) {
            defpackage.aooh.i("taskRunner");
        }
        if (timeUnit == null) {
            defpackage.aooh.i("timeUnit");
        }
        this.b = apkhVar;
        this.a = timeUnit.toNanos(5L);
        this.c = apkcVar.b();
        this.e = new defpackage.apku(this, java.lang.String.valueOf(defpackage.apjx.b).concat(" ConnectionPool connection closer"));
        this.d = new j$.util.concurrent.ConcurrentLinkedQueue();
    }

    public final void a() {
        ((defpackage.apkb) this.c).f((defpackage.apjz) this.e);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [gsu, java.lang.Object] */
    public final void b(defpackage.ipc ipcVar) {
        java.lang.Runnable runnable;
        if (ipcVar == null) {
            defpackage.aooh.i("token");
        }
        synchronized (this.b) {
            runnable = (java.lang.Runnable) this.e.remove(ipcVar);
        }
        if (runnable != null) {
            this.d.a(runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [gsu, java.lang.Object] */
    public final void c(defpackage.ipc ipcVar) {
        defpackage.an anVar = new defpackage.an(this, ipcVar, 10);
        synchronized (this.b) {
        }
        this.d.b(this.a, anVar);
    }

    public apkv(defpackage.gsu gsuVar, defpackage.rsr rsrVar) {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MINUTES;
        this.d = gsuVar;
        this.c = rsrVar;
        this.a = 5400000L;
        this.b = new java.lang.Object();
        this.e = new java.util.LinkedHashMap();
    }
}
