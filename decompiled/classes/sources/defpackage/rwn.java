package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class rwn {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/channel/NotificationChannelManager");

    public static java.util.Set a(android.content.Context context) {
        defpackage.acc accVar = new defpackage.acc(0);
        java.util.Iterator it = aa$.ExternalSyntheticApiModelOutline0.m$1((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).iterator();
        while (it.hasNext()) {
            accVar.add(aa$.ExternalSyntheticApiModelOutline0.m$1(aa$.ExternalSyntheticApiModelOutline0.m(it.next())));
        }
        return accVar;
    }

    public static void b(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_default", context.getText(2132019509), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }

    public static void c(android.content.Context context) {
        ((defpackage.rwm) defpackage.agab.aH(context, defpackage.rwm.class)).nO().j();
    }

    public static void d(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_feedback", context.getText(2132019506), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            ae$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        }
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }

    public static void e(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_incoming_call", context.getText(2132019507), 4);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }

    public static void f(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_low_priority", context.getText(2132019508), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }

    public static void g(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_missed_call", context.getText(2132019510), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }

    public static void h(android.content.Context context) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_ongoing_call", context.getText(2132019511), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, new android.media.AudioAttributes.Builder().setUsage(5).build());
        aa$.ExternalSyntheticApiModelOutline0.m((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class), notificationChannel);
    }
}
