package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahyb implements java.io.Closeable {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ahyb.class.getName());
    private static final defpackage.ahxy e;
    final java.lang.ref.ReferenceQueue b;
    final java.lang.ref.PhantomReference c;
    final boolean d;

    static {
        java.lang.Class clsA;
        ahxz ahxwVar;
        defpackage.ahxx[] ahxxVarArr = {new defpackage.ahya(0), new defpackage.ahya(1)};
        int i = 0;
        while (true) {
            if (i < 2) {
                clsA = ahxxVarArr[i].a();
                if (clsA != null) {
                    break;
                } else {
                    i++;
                }
            } else {
                clsA = null;
                break;
            }
        }
        if (clsA != null) {
            try {
                ahxwVar = new ahxz(clsA.getMethod("startFinalizer", java.lang.Class.class, java.lang.ref.ReferenceQueue.class, java.lang.ref.PhantomReference.class));
            } catch (java.lang.NoSuchMethodException e2) {
                throw new java.lang.AssertionError(e2);
            }
        } else {
            ahxwVar = new defpackage.ahxw();
        }
        e = ahxwVar;
    }

    public ahyb() {
        boolean z;
        java.lang.ref.ReferenceQueue referenceQueue = new java.lang.ref.ReferenceQueue();
        this.b = referenceQueue;
        java.lang.ref.PhantomReference phantomReference = new java.lang.ref.PhantomReference(this, referenceQueue);
        this.c = phantomReference;
        try {
            e.a(defpackage.ahxv.class, referenceQueue, phantomReference);
            z = true;
        } catch (java.lang.Throwable th) {
            a.logp(java.util.logging.Level.INFO, "com.google.common.base.FinalizableReferenceQueue", "<init>", "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", th);
            z = false;
        }
        this.d = z;
    }

    public static boolean b() {
        return ((java.lang.String) j$.util.Objects.requireNonNull(java.lang.System.getProperty("java.runtime.name", ""))).contains("Android");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void a() {
        if (this.d) {
            return;
        }
        while (true) {
            java.lang.ref.Reference referencePoll = this.b.poll();
            if (referencePoll == 0) {
                return;
            }
            referencePoll.clear();
            try {
                ((defpackage.ahxv) referencePoll).finalizeReferent();
            } catch (java.lang.Throwable th) {
                a.logp(java.util.logging.Level.SEVERE, "com.google.common.base.FinalizableReferenceQueue", "cleanUp", "Error cleaning up after reference.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.enqueue();
        a();
    }
}
