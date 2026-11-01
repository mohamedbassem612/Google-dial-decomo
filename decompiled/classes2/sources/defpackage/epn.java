package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class epn {
    private static android.os.Handler a;
    public volatile int f = 1;
    public final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean();
    public final java.util.concurrent.FutureTask c = new defpackage.epm(this, new defpackage.hkx(this, 1));

    public abstract java.lang.Object a();

    public void b(java.lang.Object obj) {
        throw null;
    }

    public void c(java.lang.Object obj) {
        throw null;
    }

    public final void d(java.lang.Object obj) {
        android.os.Handler handler;
        synchronized (defpackage.epn.class) {
            handler = a;
            if (handler == null) {
                handler = new android.os.Handler(android.os.Looper.getMainLooper());
                a = handler;
            }
        }
        handler.post(new ad(this, obj, 19, (char[]) null));
    }

    final void e(java.lang.Object obj) {
        if (this.e.get()) {
            return;
        }
        d(obj);
    }

    public final boolean f() {
        return this.d.get();
    }
}
