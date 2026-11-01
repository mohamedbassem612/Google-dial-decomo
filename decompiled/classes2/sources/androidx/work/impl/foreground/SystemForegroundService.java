package androidx.work.impl.foreground;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class SystemForegroundService extends defpackage.ena implements defpackage.gwk {
    public static final java.lang.String a = gsh.b("SystemFgService");
    defpackage.gwl b;
    android.app.NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (android.app.NotificationManager) getApplicationContext().getSystemService("notification");
        defpackage.gwl gwlVar = new defpackage.gwl(getApplicationContext());
        this.b = gwlVar;
        if (gwlVar.h == null) {
            gwlVar.h = this;
        } else {
            gsh.a();
            android.util.Log.e(defpackage.gwl.a, "A callback already exists.");
        }
    }

    @Override // defpackage.gwk
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.gwk
    public final void b(int i, android.app.Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.gwk
    public final void c(int i, int i2, android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.gwm.a(this, i, notification, i2);
        } else {
            da$.ExternalSyntheticApiModelOutline0.m(this, i, notification, i2);
        }
    }

    @Override // defpackage.gwk
    public final void d(int i) {
        this.d = true;
        gsh.a().c(a, "Shutting down.");
        stopForeground(true);
        stopSelf(i);
    }

    @Override // defpackage.ena, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.ena, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(android.content.Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            gsh.a();
            android.util.Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        defpackage.gwl gwlVar = this.b;
        java.lang.String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            gsh.a();
            java.lang.String str = defpackage.gwl.a;
            java.util.Objects.toString(intent);
            android.util.Log.i(str, "Started foreground service ".concat(intent.toString()));
            gwlVar.i.b(new defpackage.gra(gwlVar, intent.getStringExtra("KEY_WORKSPEC_ID"), 6, (char[]) null));
            gwlVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            gwlVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            gsh.a();
            android.util.Log.i(defpackage.gwl.a, "Stopping foreground service");
            defpackage.gwk gwkVar = gwlVar.h;
            if (gwkVar == null) {
                return 3;
            }
            gwkVar.d(i2);
            return 3;
        }
        gsh.a();
        java.lang.String str2 = defpackage.gwl.a;
        java.util.Objects.toString(intent);
        android.util.Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || android.text.TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        gus.e(java.util.UUID.fromString(stringExtra), gwlVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (android.os.Build.VERSION.SDK_INT < 35) {
            this.b.d(i, 2048);
        }
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i, i2);
    }
}
