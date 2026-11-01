package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gwm {
    public static void a(android.app.Service service, int i, android.app.Notification notification, int i2) {
        try {
            da$.ExternalSyntheticApiModelOutline0.m(service, i, notification, i2);
        } catch (android.app.ForegroundServiceStartNotAllowedException e) {
            gsh.a();
            android.util.Log.w(androidx.work.impl.foreground.SystemForegroundService.a, "Unable to start foreground service", e);
        } catch (java.lang.SecurityException e2) {
            gsh.a();
            android.util.Log.w(androidx.work.impl.foreground.SystemForegroundService.a, "Unable to start foreground service", e2);
        }
    }
}
