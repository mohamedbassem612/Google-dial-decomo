package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagv {
    static android.os.HandlerThread a = null;
    private static final java.lang.Object g = new java.lang.Object();
    private static boolean h = false;
    private static defpackage.aagv l;
    public final java.util.HashMap b = new java.util.HashMap();
    public final android.content.Context c;
    public volatile android.os.Handler d;
    public final defpackage.aaik e;
    public final long f;
    private final defpackage.aagy i;
    private final long j;
    private volatile java.util.concurrent.Executor k;

    public aagv(android.content.Context context, android.os.Looper looper) {
        defpackage.aagy aagyVar = new defpackage.aagy(this);
        this.i = aagyVar;
        this.c = context.getApplicationContext();
        this.d = new defpackage.aanh(looper, aagyVar);
        this.e = defpackage.aaik.a();
        this.j = 5000L;
        this.f = 300000L;
        this.k = null;
    }

    public static android.os.HandlerThread a() {
        android.os.HandlerThread handlerThread;
        synchronized (g) {
            android.os.HandlerThread handlerThread2 = a;
            if (handlerThread2 == null || !handlerThread2.isAlive()) {
                android.os.HandlerThread handlerThread3 = new android.os.HandlerThread("GoogleApiHandler", 9);
                a = handlerThread3;
                handlerThread3.start();
                handlerThread = a;
            } else {
                handlerThread = a;
            }
        }
        return handlerThread;
    }

    public static defpackage.aagv b(android.content.Context context) {
        defpackage.aagv aagvVar;
        synchronized (g) {
            aagvVar = l;
            if (aagvVar == null) {
                if (!h) {
                    h = defpackage.aagt.a(context.getPackageName());
                }
                aagvVar = new defpackage.aagv(context.getApplicationContext(), h ? a().getLooper() : context.getMainLooper());
                l = aagvVar;
            }
        }
        return aagvVar;
    }

    public final com.google.android.gms.common.ConnectionResult c(defpackage.aagu aaguVar, android.content.ServiceConnection serviceConnection, java.lang.String str, java.util.concurrent.Executor executor) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus gmsClientSupervisorImpl$GmsClientConnectionStatus = (com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus) map.get(aaguVar);
            com.google.android.gms.common.ConnectionResult connectionResultA = null;
            if (executor == null) {
                java.util.concurrent.Executor executor2 = this.k;
                executor = null;
            }
            if (gmsClientSupervisorImpl$GmsClientConnectionStatus == null) {
                gmsClientSupervisorImpl$GmsClientConnectionStatus = new com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus(this, aaguVar);
                gmsClientSupervisorImpl$GmsClientConnectionStatus.e(serviceConnection, serviceConnection);
                connectionResultA = gmsClientSupervisorImpl$GmsClientConnectionStatus.a(str, executor);
                map.put(aaguVar, gmsClientSupervisorImpl$GmsClientConnectionStatus);
            } else {
                this.d.removeMessages(0, aaguVar);
                if (gmsClientSupervisorImpl$GmsClientConnectionStatus.c(serviceConnection)) {
                    throw new java.lang.IllegalStateException(defpackage.hgb.k(aaguVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                gmsClientSupervisorImpl$GmsClientConnectionStatus.e(serviceConnection, serviceConnection);
                int i = gmsClientSupervisorImpl$GmsClientConnectionStatus.c;
                if (i == 1) {
                    serviceConnection.onServiceConnected(gmsClientSupervisorImpl$GmsClientConnectionStatus.f, gmsClientSupervisorImpl$GmsClientConnectionStatus.e);
                } else if (i == 2) {
                    connectionResultA = gmsClientSupervisorImpl$GmsClientConnectionStatus.a(str, executor);
                }
            }
            if (gmsClientSupervisorImpl$GmsClientConnectionStatus.d) {
                return com.google.android.gms.common.ConnectionResult.a;
            }
            if (connectionResultA == null) {
                connectionResultA = new com.google.android.gms.common.ConnectionResult(1, -1, null, null, null, null);
            }
            return connectionResultA;
        }
    }

    public final void d(com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus gmsClientSupervisorImpl$GmsClientConnectionStatus) {
        if (gmsClientSupervisorImpl$GmsClientConnectionStatus.g != null) {
            this.d.removeMessages(1, gmsClientSupervisorImpl$GmsClientConnectionStatus.g);
            gmsClientSupervisorImpl$GmsClientConnectionStatus.g = null;
        }
    }

    public final void e(android.content.ComponentName componentName, android.content.ServiceConnection serviceConnection) {
        f(new defpackage.aagu(componentName), serviceConnection);
    }

    protected final void f(defpackage.aagu aaguVar, android.content.ServiceConnection serviceConnection) {
        java.util.HashMap map = this.b;
        synchronized (map) {
            com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus gmsClientSupervisorImpl$GmsClientConnectionStatus = (com.google.android.gms.common.internal.GmsClientSupervisorImpl$GmsClientConnectionStatus) map.get(aaguVar);
            if (gmsClientSupervisorImpl$GmsClientConnectionStatus == null) {
                throw new java.lang.IllegalStateException(defpackage.hgb.k(aaguVar, "Nonexistent connection status for service config: "));
            }
            if (!gmsClientSupervisorImpl$GmsClientConnectionStatus.c(serviceConnection)) {
                throw new java.lang.IllegalStateException(defpackage.hgb.k(aaguVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            gmsClientSupervisorImpl$GmsClientConnectionStatus.a.remove(serviceConnection);
            if (gmsClientSupervisorImpl$GmsClientConnectionStatus.d()) {
                this.d.sendMessageDelayed(this.d.obtainMessage(0, aaguVar), this.j);
            }
        }
    }
}
