package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aabo {
    public static final java.util.concurrent.Executor a = new defpackage.so(5);
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private static int h;
    private static android.app.PendingIntent i;
    public final android.content.Context d;
    public final defpackage.aabl e;
    public android.os.Messenger f;
    public com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat g;
    private final java.util.concurrent.ScheduledExecutorService j;
    public final defpackage.aec c = new defpackage.aec(0);
    private final android.os.Messenger k = new android.os.Messenger(new defpackage.aabn(this, android.os.Looper.getMainLooper()));

    public aabo(android.content.Context context) {
        this.d = context;
        this.e = new defpackage.aabl(context);
        java.util.concurrent.ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new defpackage.aaiv("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, java.util.concurrent.TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.j = scheduledThreadPoolExecutor;
    }

    public static boolean d(android.os.Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    private static synchronized java.lang.String e() {
        int i2;
        i2 = h;
        h = i2 + 1;
        return java.lang.Integer.toString(i2);
    }

    private static synchronized void f(android.content.Context context, android.content.Intent intent) {
        android.app.PendingIntent broadcast = i;
        if (broadcast == null) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            int i2 = aane.b;
            boolean z = aane.a;
            broadcast = android.app.PendingIntent.getBroadcast(context, 0, intent2, i2);
            i = broadcast;
        }
        intent.putExtra("app", broadcast);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    public final defpackage.aaum a(android.os.Bundle bundle) {
        int iB;
        android.content.Context context;
        java.lang.String strE = e();
        defpackage.zzx zzxVar = new defpackage.zzx((char[]) null);
        defpackage.aec aecVar = this.c;
        synchronized (aecVar) {
            aecVar.put(strE, zzxVar);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setPackage("com.google.android.gms");
        if (this.e.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        f(this.d, intent);
        intent.putExtra("kid", "|ID|" + strE + '|');
        if (android.util.Log.isLoggable("Rpc", 3)) {
            android.util.Log.d("Rpc", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(intent.getExtras()))));
        }
        intent.putExtra("google.messenger", this.k);
        if (this.f == null && this.g == null) {
            iB = this.e.b();
            context = this.d;
            if (iB == 2) {
                context.startService(intent);
            } else if (android.os.Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                aabo$.ExternalSyntheticApiModelOutline0.m(context, intent, (java.lang.String) null, aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(), true)));
            }
        } else {
            android.os.Message messageObtain = android.os.Message.obtain();
            messageObtain.obj = intent;
            try {
                android.os.Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.b(messageObtain);
                }
            } catch (android.os.RemoteException unused) {
                if (android.util.Log.isLoggable("Rpc", 3)) {
                    android.util.Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iB = this.e.b();
                context = this.d;
                if (iB == 2) {
                    context.startService(intent);
                } else if (android.os.Build.VERSION.SDK_INT < 34) {
                    context.sendBroadcast(intent);
                } else {
                    aabo$.ExternalSyntheticApiModelOutline0.m(context, intent, (java.lang.String) null, aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(aabo$.ExternalSyntheticApiModelOutline0.m(), true)));
                }
            }
        }
        java.util.concurrent.ScheduledFuture<?> scheduledFutureSchedule = this.j.schedule((java.lang.Runnable) new yne(zzxVar, 6), 30L, java.util.concurrent.TimeUnit.SECONDS);
        defpackage.aaum aaumVar = (defpackage.aaum) zzxVar.a;
        aaumVar.n(a, new ackb(this, strE, scheduledFutureSchedule, 1));
        return aaumVar;
    }

    public final defpackage.aaum b(android.os.Bundle bundle) {
        defpackage.aabl aablVar = this.e;
        if (aablVar.a() < 12000000) {
            return aablVar.b() != 0 ? a(bundle).c(a, new aaab(this, bundle, 2)) : defpackage.aazc.r(new java.io.IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return afiq.c(this.d).b(1, bundle).b(a, new aabm(1));
    }

    public final void c(java.lang.String str, android.os.Bundle bundle) {
        defpackage.aec aecVar = this.c;
        synchronized (aecVar) {
            defpackage.zzx zzxVar = (defpackage.zzx) aecVar.remove(str);
            if (zzxVar == null) {
                android.util.Log.w("Rpc", defpackage.a.bx(str, "Missing callback for "));
            } else {
                zzxVar.i(bundle);
            }
        }
    }
}
