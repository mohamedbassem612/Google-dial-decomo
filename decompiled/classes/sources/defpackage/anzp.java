package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzp extends defpackage.anxf {
    public final defpackage.anzo c;
    private static final java.lang.ref.ReferenceQueue d = new java.lang.ref.ReferenceQueue();
    private static final java.util.concurrent.ConcurrentMap e = new j$.util.concurrent.ConcurrentHashMap();
    public static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.anzp.class.getName());

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anzp(defpackage.anor anorVar) {
        super(anorVar);
        java.lang.ref.ReferenceQueue referenceQueue = d;
        java.util.concurrent.ConcurrentMap concurrentMap = e;
        this.c = new defpackage.anzo(this, anorVar, referenceQueue, concurrentMap);
    }

    @Override // defpackage.anxf, defpackage.anor
    public final void d() {
        int i = defpackage.anzo.a;
        this.c.a();
        if (getClass() == null) {
            throw new java.lang.AssertionError();
        }
        ((defpackage.anzg) this.a).d();
    }
}
