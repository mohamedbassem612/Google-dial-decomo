package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gyb implements defpackage.gsu {
    public final java.util.Map a;
    public final java.lang.Object b;
    private final defpackage.aoss c;
    private final defpackage.aosp d;
    private final defpackage.gou e;

    /* JADX WARN: Type inference failed for: r0v0, types: [aoss, java.lang.Object] */
    public gyb(defpackage.gou gouVar) {
        if (gouVar == null) {
            defpackage.aooh.i("taskExecutor");
        }
        this.e = gouVar;
        ?? r0 = gouVar.a;
        defpackage.aooh.e(r0, "getCoroutineScope(...)");
        this.c = r0;
        java.lang.Object obj = gouVar.b;
        defpackage.aooh.e(obj, "getTaskCoroutineDispatcher(...)");
        this.d = (defpackage.aosp) obj;
        this.a = new java.util.LinkedHashMap();
        this.b = new java.lang.Object();
    }

    @Override // defpackage.gsu
    public final void a(java.lang.Runnable runnable) {
        synchronized (this.b) {
            defpackage.aoub aoubVar = (defpackage.aoub) this.a.remove(runnable);
            if (aoubVar != null) {
                aoubVar.s(null);
            }
        }
    }

    @Override // defpackage.gsu
    public final void b(long j, java.lang.Runnable runnable) {
        synchronized (this.b) {
            java.util.Map map = this.a;
            defpackage.aoub aoubVar = (defpackage.aoub) map.remove(runnable);
            if (aoubVar != null) {
                aoubVar.s(null);
            }
            map.put(runnable, defpackage.aoov.an(this.c, this.d, 0, new gya(j, runnable, this, (defpackage.aoln) null), 2));
        }
    }
}
