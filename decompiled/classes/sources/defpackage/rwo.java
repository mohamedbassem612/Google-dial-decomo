package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rwo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/notification/channel/NotificationChannelManagerCompat");
    private static final android.media.AudioAttributes f = new android.media.AudioAttributes.Builder().setUsage(5).build();
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final android.app.NotificationManager d;
    public final defpackage.rsr e;
    private defpackage.ajcq g;

    public rwo(android.content.Context context, defpackage.ajct ajctVar, android.app.NotificationManager notificationManager, defpackage.rsr rsrVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = notificationManager;
        this.e = rsrVar;
    }

    public final defpackage.aihd a() {
        defpackage.aihb aihbVar = new defpackage.aihb();
        aihbVar.c("phone_incoming_call");
        aihbVar.c("phone_ongoing_call");
        aihbVar.c("phone_missed_call");
        aihbVar.c("phone_emergency_call");
        aihbVar.c("phone_low_priority");
        aihbVar.c("phone_feedback");
        aihbVar.c("phone_default");
        android.content.Context context = this.b;
        if (!((defpackage.rwt) defpackage.agab.aH(context, defpackage.rwt.class)).ir()) {
            aihbVar.k(defpackage.rwu.c(context));
        }
        return aihbVar.g();
    }

    public final defpackage.ajcq b() {
        defpackage.guy guyVar = new defpackage.guy(this, 8);
        long j = defpackage.ahqx.a;
        return this.c.submit(new defpackage.ajav(defpackage.ahns.c(false), guyVar, 1));
    }

    public final defpackage.ajcq c() {
        defpackage.ajcq ajcqVar = this.g;
        if (ajcqVar != null) {
            return ajcqVar;
        }
        defpackage.ajcq ajcqVarB = b();
        defpackage.jwf jwfVar = new defpackage.jwf(this, 13);
        defpackage.ajbm ajbmVar = defpackage.ajbm.INSTANCE;
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), jwfVar, 1);
        int i = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarB, ajaxVar);
        ajcqVarB.c(ajalVar, defpackage.aiql.t(ajbmVar, ajalVar));
        this.g = ajalVar;
        return ajalVar;
    }

    public final defpackage.ajcq d() {
        return this.c.submit(defpackage.ahqx.i(new defpackage.raj(this, 13)));
    }

    public final void e() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_default", this.b.getText(2132019509), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }

    public final void f() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_feedback", this.b.getText(2132019506), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            ae$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        }
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, f);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }

    public final void g() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_incoming_call", this.b.getText(2132019507), 4);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, f);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }

    public final void h() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_low_priority", this.b.getText(2132019508), 2);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, f);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }

    public final void i() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_missed_call", this.b.getText(2132019510), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, true);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, f);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }

    public final void j() {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("phone_ongoing_call", this.b.getText(2132019511), 3);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$1(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m$2(notificationChannel, false);
        rs$.ExternalSyntheticApiModelOutline0.m(notificationChannel, (android.net.Uri) null, f);
        aa$.ExternalSyntheticApiModelOutline0.m(this.d, notificationChannel);
    }
}
