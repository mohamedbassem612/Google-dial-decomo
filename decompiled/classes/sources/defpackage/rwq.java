package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/channel/NotificationChannelManagerCompatSync");
    private static final android.media.AudioAttributes e = new android.media.AudioAttributes.Builder().setUsage(5).build();
    public final android.content.Context b;
    public final android.app.NotificationManager c;
    public final defpackage.rsr d;
    private final defpackage.ahzi f = defpackage.ahvr.bI(new defpackage.rwp(this, 0));

    public rwq(android.content.Context context, android.app.NotificationManager notificationManager, defpackage.rsr rsrVar) {
        this.b = context;
        this.c = notificationManager;
        this.d = rsrVar;
    }

    public final defpackage.aihd a() {
        defpackage.aihb aihbVar = new defpackage.aihb();
        java.util.Iterator it = aa$.ExternalSyntheticApiModelOutline0.m$1(this.c).iterator();
        while (it.hasNext()) {
            aihbVar.c(aa$.ExternalSyntheticApiModelOutline0.m$1(aa$.ExternalSyntheticApiModelOutline0.m(it.next())));
        }
        return aihbVar.g();
    }

    public final void b() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_default", this.b.getText(2132019509), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void c() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_feedback", this.b.getText(2132019506), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            ae$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        }
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, e);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void d() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_incoming_call", this.b.getText(2132019507), 4);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, e);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void e() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_low_priority", this.b.getText(2132019508), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, e);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void f() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_missed_call", this.b.getText(2132019510), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, e);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void g() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_ongoing_call", this.b.getText(2132019511), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, e);
        aa$.ExternalSyntheticApiModelOutline0.m(this.c, notificationChannel);
    }

    public final void h() {
        this.f.eZ();
    }
}
