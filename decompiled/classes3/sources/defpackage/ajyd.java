package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ajyd implements android.content.ServiceConnection {
    private final android.content.Context a;
    private final android.content.Intent b;
    private final java.util.concurrent.ScheduledExecutorService c;
    private final java.util.Queue d;
    private defpackage.ajyc e;
    private boolean f;

    public ajyd(android.content.Context context) {
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, (java.util.concurrent.ThreadFactory) new aaiv("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, java.util.concurrent.TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = new java.util.ArrayDeque();
        this.f = false;
        android.content.Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new android.content.Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    private final void b() {
        while (true) {
            java.util.Queue queue = this.d;
            if (queue.isEmpty()) {
                return;
            } else {
                ((apjb) queue.poll()).v();
            }
        }
    }

    private final synchronized void c() {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "flush queue called");
        }
        while (true) {
            java.util.Queue queue = this.d;
            if (queue.isEmpty()) {
                break;
            }
            if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                android.util.Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            defpackage.ajyc ajycVar = this.e;
            if (ajycVar == null || !ajycVar.isBinderAlive()) {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "binder is dead. start connection? " + (!this.f));
                }
                if (this.f) {
                    break;
                }
                this.f = true;
                try {
                    if (aaik.a().c(this.a, this.b, this, 65)) {
                        break;
                    }
                    android.util.Log.e("FirebaseMessaging", "binding to the service failed");
                    this.f = false;
                    b();
                    return;
                } catch (java.lang.SecurityException e) {
                    android.util.Log.e("FirebaseMessaging", "Exception while binding the service", e);
                }
            } else {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                apjb apjbVar = (apjb) queue.poll();
                defpackage.ajyc ajycVar2 = this.e;
                if (android.os.Binder.getCallingUid() != android.os.Process.myUid()) {
                    throw new java.lang.SecurityException("Binding only allowed within app");
                }
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    android.util.Log.d("FirebaseMessaging", "service received new intent via bind strategy");
                }
                ((defpackage.ajxd) ajycVar2.a.a).f((android.content.Intent) apjbVar.b).n(new fjq(11), new defpackage.aadq(apjbVar, 6));
            }
        }
    }

    final synchronized aaum a(android.content.Intent intent) {
        apjb apjbVar;
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        apjbVar = new apjb(intent);
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        apjbVar.u().n(scheduledExecutorService, new defpackage.aadq(scheduledExecutorService.schedule(new defpackage.ahts(apjbVar, 10), 20L, java.util.concurrent.TimeUnit.SECONDS), 7));
        this.d.add(apjbVar);
        c();
        return apjbVar.u();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "onServiceConnected: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        }
        this.f = false;
        if (iBinder instanceof defpackage.ajyc) {
            this.e = (defpackage.ajyc) iBinder;
            c();
        } else {
            android.util.Log.e("FirebaseMessaging", "Invalid service connection: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(iBinder))));
            b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
            android.util.Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(componentName))));
        }
        c();
    }
}
