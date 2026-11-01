package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class tp extends android.app.Service {
    public final java.util.Map a = new java.util.HashMap();
    public defpackage.ty b;
    private androidx.car.app.AppInfo c;

    public final androidx.car.app.AppInfo a() {
        androidx.car.app.AppInfo appInfo = this.c;
        if (appInfo != null) {
            return appInfo;
        }
        androidx.car.app.AppInfo appInfoCreate = androidx.car.app.AppInfo.create(this);
        this.c = appInfoCreate;
        return appInfoCreate;
    }

    public defpackage.ue b() {
        throw null;
    }

    public abstract defpackage.abo c();

    @Override // android.app.Service
    public final void dump(java.io.FileDescriptor fileDescriptor, java.io.PrintWriter printWriter, java.lang.String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (java.lang.String str : strArr) {
                if ("AUTO_DRIVE".equals(str)) {
                    defpackage.abn.b(new defpackage.jd(this, 12, null));
                }
            }
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        android.os.IBinder iBinder;
        androidx.car.app.SessionInfo sessionInfoB = defpackage.rr.c(intent) ? defpackage.rr.b(intent) : androidx.car.app.SessionInfo.DEFAULT_SESSION_INFO;
        java.util.Map map = this.a;
        synchronized (map) {
            if (!map.containsKey(sessionInfoB)) {
                map.put(sessionInfoB, new androidx.car.app.CarAppBinder(this, sessionInfoB));
            }
            iBinder = (android.os.IBinder) j$.util.Objects.requireNonNull((androidx.car.app.CarAppBinder) map.get(sessionInfoB));
        }
        return iBinder;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        java.util.Map map = this.a;
        synchronized (map) {
            java.util.Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((androidx.car.app.CarAppBinder) it.next()).destroy();
            }
            map.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        if (android.util.Log.isLoggable("CarApp", 3)) {
            java.util.Objects.toString(intent);
            android.util.Log.d("CarApp", "onUnbind intent: ".concat(java.lang.String.valueOf(intent)));
        }
        defpackage.abn.b(new ad(this, defpackage.rr.c(intent) ? defpackage.rr.b(intent) : androidx.car.app.SessionInfo.DEFAULT_SESSION_INFO, 12, (byte[]) null));
        if (!android.util.Log.isLoggable("CarApp", 3)) {
            return true;
        }
        android.util.Log.d("CarApp", "onUnbind completed");
        return true;
    }
}
