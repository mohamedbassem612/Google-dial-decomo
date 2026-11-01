package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dvr {
    public static java.lang.String b;
    private static dvq f;
    public final android.app.NotificationManager d;
    private final android.content.Context g;
    public static final java.lang.Object a = new java.lang.Object();
    public static java.util.Set c = new java.util.HashSet();
    private static final java.lang.Object e = new java.lang.Object();

    public dvr(android.content.Context context) {
        this.g = context;
        this.d = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        return aa$.ExternalSyntheticApiModelOutline1.m(this.d);
    }

    public final void b(int i, android.app.Notification notification) {
        android.os.Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(null, i, notification);
            return;
        }
        android.content.Context context = this.g;
        dvo dvoVar = new dvo(context.getPackageName(), i, notification);
        synchronized (e) {
            dvq dvqVar = f;
            if (dvqVar == null) {
                dvqVar = new dvq(context.getApplicationContext());
                f = dvqVar;
            }
            dvqVar.a.obtainMessage(0, dvoVar).sendToTarget();
        }
        this.d.cancel(null, i);
    }
}
