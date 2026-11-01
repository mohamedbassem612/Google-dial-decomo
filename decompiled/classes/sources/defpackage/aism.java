package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aism implements java.io.Closeable {
    private final java.util.Deque a = new java.util.ArrayDeque(4);
    private java.lang.Throwable b;

    public final java.lang.RuntimeException a(java.lang.Throwable th) {
        this.b = th;
        ahzn.b(th, java.io.IOException.class);
        ahzn.c(th);
        throw new java.lang.RuntimeException(th);
    }

    public final java.lang.RuntimeException b(java.lang.Throwable th, java.lang.Class cls) {
        this.b = th;
        ahzn.b(th, java.io.IOException.class);
        ahzn.b(th, cls);
        ahzn.c(th);
        throw new java.lang.RuntimeException(th);
    }

    public final void c(java.io.Closeable closeable) {
        if (closeable != null) {
            this.a.addFirst(closeable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        java.lang.Throwable th = this.b;
        while (true) {
            java.util.Deque deque = this.a;
            if (deque.isEmpty()) {
                break;
            }
            java.io.Closeable closeable = (java.io.Closeable) deque.removeFirst();
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    try {
                        th.addSuppressed(th2);
                    } catch (java.lang.Throwable unused) {
                        aisl.a.logp(java.util.logging.Level.WARNING, "com.google.common.io.Closer", "<init>", "Suppressing exception thrown when closing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(closeable))), th2);
                    }
                }
            }
        }
        if (this.b != null || th == null) {
            return;
        }
        ahzn.b(th, java.io.IOException.class);
        ahzn.c(th);
        throw new java.lang.AssertionError(th);
    }
}
