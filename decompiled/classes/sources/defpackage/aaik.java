package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaik {
    private static final java.lang.Object b = new java.lang.Object();
    private static volatile defpackage.aaik c;
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    private aaik() {
    }

    public static defpackage.aaik a() {
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    c = new defpackage.aaik();
                }
            }
        }
        defpackage.aaik aaikVar = c;
        if (aaikVar != null) {
            return aaikVar;
        }
        throw new java.lang.NullPointerException("null reference");
    }

    private static void e(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    private static final boolean f(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return executor != null ? da$.ExternalSyntheticApiModelOutline0.m(context, intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
    }

    public final void b(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (serviceConnection instanceof defpackage.aagz) {
            e(context, serviceConnection);
            return;
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        if (!concurrentHashMap.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final boolean c(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    public final boolean d(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            try {
                if ((defpackage.aaiy.a.a(context).b(component.getPackageName(), 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof defpackage.aagz) {
            return f(context, intent, serviceConnection, i, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            android.util.Log.w("ConnectionTracker", java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zF = f(context, intent, serviceConnection, i, executor);
            if (zF) {
                return zF;
            }
            this.a.remove(serviceConnection, serviceConnection);
            return false;
        } catch (java.lang.Throwable th) {
            this.a.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
