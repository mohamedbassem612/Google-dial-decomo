package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class anzo extends java.lang.ref.WeakReference {
    public static final /* synthetic */ int a = 0;
    private static final boolean b = java.lang.Boolean.parseBoolean(java.lang.System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final java.lang.RuntimeException c;
    private final java.lang.ref.ReferenceQueue d;
    private final java.util.concurrent.ConcurrentMap e;
    private final java.lang.String f;
    private final java.lang.ref.Reference g;
    private final java.util.concurrent.atomic.AtomicBoolean h;

    static {
        java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new java.lang.StackTraceElement[0]);
        c = runtimeException;
    }

    public anzo(defpackage.anzp anzpVar, defpackage.anor anorVar, java.lang.ref.ReferenceQueue referenceQueue, java.util.concurrent.ConcurrentMap concurrentMap) {
        super(anzpVar, referenceQueue);
        this.h = new java.util.concurrent.atomic.AtomicBoolean();
        this.g = new java.lang.ref.SoftReference(b ? new java.lang.RuntimeException("ManagedChannel allocation site") : c);
        this.f = anorVar.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        concurrentMap.put(this, this);
        b(referenceQueue);
    }

    static void b(java.lang.ref.ReferenceQueue referenceQueue) {
        while (true) {
            defpackage.anzo anzoVar = (defpackage.anzo) referenceQueue.poll();
            if (anzoVar == null) {
                return;
            }
            java.lang.RuntimeException runtimeException = (java.lang.RuntimeException) anzoVar.g.get();
            boolean z = anzoVar.h.get();
            anzoVar.c();
            if (!z) {
                java.util.logging.Level level = java.util.logging.Level.SEVERE;
                java.util.logging.Logger logger = defpackage.anzp.b;
                if (logger.isLoggable(level)) {
                    java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + java.lang.System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new java.lang.Object[]{anzoVar.f});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    private final void c() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    public final void a() {
        if (this.h.getAndSet(true)) {
            return;
        }
        clear();
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        c();
        b(this.d);
    }
}
