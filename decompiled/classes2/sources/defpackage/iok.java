package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iok implements znv, znu, znk, znp {
    public static final aimz a = aimz.i("com/android/dialer/autoassistedemergencycall/safetyhub/impl/service/SafetyhubEmergencyCallDataSender");
    public final j$.util.Optional b;
    public final ajct c;
    public final aoin d;
    public final ahzh f;
    public final ahzh g;
    private final android.app.Application i;
    public final java.util.concurrent.atomic.AtomicBoolean e = new java.util.concurrent.atomic.AtomicBoolean(false);
    public int h = 1;

    public iok(j$.util.Optional optional, android.app.Application application, ajct ajctVar, aoin aoinVar) {
        ahzp ahzpVar = ahwr.a;
        this.f = new ahzh(ahzpVar);
        this.g = new ahzh(ahzpVar);
        this.b = optional;
        this.i = application;
        this.c = ajctVar;
        this.d = aoinVar;
    }

    public final ajcq b() {
        return ahvr.E(new defpackage.ioi(this, 3), this.c);
    }

    public final ajcq c() {
        return ahvr.E(new defpackage.ioi(this, 0), this.c);
    }

    public final /* synthetic */ void e(android.content.Intent intent, android.app.PendingIntent pendingIntent) {
        try {
            pendingIntent.send(this.i, 1, intent);
        } catch (android.app.PendingIntent.CanceledException e) {
            a.bq(a.d(), "Unable to send data back to SafetyHub", "com/android/dialer/autoassistedemergencycall/safetyhub/impl/service/SafetyhubEmergencyCallDataSender", "sendSafetyHubIntent", (char) 202, "SafetyhubEmergencyCallDataSender.java", e, zct.b);
        }
    }

    public final ajcq ej() {
        return ahvr.E(new defpackage.ioi(this, 2), this.c);
    }

    public final ajcq ek() {
        ahzh ahzhVar = this.f;
        if (ahzhVar.a) {
            ahzhVar.f();
        }
        a.b().l("com/android/dialer/autoassistedemergencycall/safetyhub/impl/service/SafetyhubEmergencyCallDataSender", "sendDataBackToSafetyHub", 100, "SafetyhubEmergencyCallDataSender.java").v("sending data to SafetyHub");
        return ahvr.I(((defpackage.ioj) aooc.ar(((afpl) this.d.a()).Y(), defpackage.ioj.class)).av(), new defpackage.hky(this, 4), this.c);
    }
}
