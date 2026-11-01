package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ajua implements defpackage.ajvo, defpackage.ajvn {
    private final java.util.concurrent.Executor c;
    private final java.util.Map b = new java.util.HashMap();
    public java.util.Queue a = new java.util.ArrayDeque();

    public ajua(java.util.concurrent.Executor executor) {
        this.c = executor;
    }

    public final synchronized java.util.Set a() {
        throw null;
    }

    @Override // defpackage.ajvo
    public final void b(java.lang.Class cls, defpackage.apnt apntVar) {
        c(cls, this.c, apntVar);
    }

    public final synchronized void c(java.lang.Class cls, java.util.concurrent.Executor executor, defpackage.apnt apntVar) {
        defpackage.ajsz.J(apntVar);
        java.util.Map map = this.b;
        if (!map.containsKey(cls)) {
            map.put(cls, new j$.util.concurrent.ConcurrentHashMap());
        }
        ((j$.util.concurrent.ConcurrentHashMap) map.get(cls)).put(apntVar, executor);
    }
}
