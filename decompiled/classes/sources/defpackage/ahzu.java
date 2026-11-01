package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahzu implements java.lang.Runnable {
    private static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ahzu.class.getName());
    private static final java.lang.reflect.Constructor b;
    private static final java.lang.reflect.Field c;
    private final java.lang.ref.WeakReference d;
    private final java.lang.ref.PhantomReference e;
    private final java.lang.ref.ReferenceQueue f;

    static {
        java.lang.reflect.Constructor constructor;
        java.lang.reflect.Field field = null;
        try {
            constructor = java.lang.Thread.class.getConstructor(java.lang.ThreadGroup.class, java.lang.Runnable.class, java.lang.String.class, java.lang.Long.TYPE, java.lang.Boolean.TYPE);
        } catch (java.lang.Throwable unused) {
            constructor = null;
        }
        b = constructor;
        if (constructor == null && !((java.lang.String) j$.util.Objects.requireNonNull(java.lang.System.getProperty("java.runtime.name", ""))).contains("Android")) {
            try {
                java.lang.reflect.Field declaredField = java.lang.Thread.class.getDeclaredField("inheritableThreadLocals");
                declaredField.setAccessible(true);
                field = declaredField;
            } catch (java.lang.Throwable unused2) {
                a.logp(java.util.logging.Level.INFO, "com.google.common.base.internal.Finalizer", "getInheritableThreadLocalsField", "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            }
        }
        c = field;
    }

    private ahzu(java.lang.Class cls, java.lang.ref.ReferenceQueue referenceQueue, java.lang.ref.PhantomReference phantomReference) {
        this.f = referenceQueue;
        this.d = new java.lang.ref.WeakReference(cls);
        this.e = phantomReference;
    }

    private final boolean a(java.lang.ref.Reference reference, java.lang.reflect.Method method) {
        reference.clear();
        if (reference == this.e) {
            return false;
        }
        try {
            method.invoke(reference, null);
        } catch (java.lang.Throwable th) {
            a.logp(java.util.logging.Level.SEVERE, "com.google.common.base.internal.Finalizer", "finalizeReference", "Error cleaning up after reference.", th);
        }
        return true;
    }

    public static void startFinalizer(java.lang.Class cls, java.lang.ref.ReferenceQueue referenceQueue, java.lang.ref.PhantomReference phantomReference) {
        java.lang.Thread thread;
        defpackage.ahzu ahzuVar = new defpackage.ahzu(cls, referenceQueue, phantomReference);
        java.lang.reflect.Constructor constructor = b;
        if (constructor != null) {
            try {
                thread = (java.lang.Thread) constructor.newInstance(null, ahzuVar, "com.google.common.base.internal.Finalizer", 0L, java.lang.Boolean.FALSE);
            } catch (java.lang.Throwable th) {
                a.logp(java.util.logging.Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to create a thread without inherited thread-local values", th);
                thread = null;
            }
        } else {
            thread = null;
        }
        if (thread == null) {
            thread = new java.lang.Thread(null, ahzuVar, "com.google.common.base.internal.Finalizer");
        }
        thread.setDaemon(true);
        try {
            java.lang.reflect.Field field = c;
            if (field != null) {
                field.set(thread, null);
            }
        } catch (java.lang.Throwable th2) {
            a.logp(java.util.logging.Level.INFO, "com.google.common.base.internal.Finalizer", "startFinalizer", "Failed to clear thread local values inherited by reference finalizer thread.", th2);
        }
        thread.start();
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.Reference referencePoll;
        while (true) {
            try {
                java.lang.ref.Reference referenceRemove = this.f.remove();
                java.lang.Class cls = (java.lang.Class) this.d.get();
                java.lang.reflect.Method method = null;
                if (cls != null) {
                    try {
                        method = cls.getMethod("finalizeReferent", null);
                    } catch (java.lang.NoSuchMethodException e) {
                        throw new java.lang.AssertionError(e);
                    }
                }
                if (method == null || !a(referenceRemove, method)) {
                    return;
                }
                do {
                    referencePoll = this.f.poll();
                    if (referencePoll == null) {
                        continue;
                    }
                } while (a(referencePoll, method));
                return;
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }
}
