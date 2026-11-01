package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jns {
    public static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl");
    public final android.content.Context b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final aoin d;
    public volatile j$.util.Optional e = j$.util.Optional.empty();
    public final defpackage.ni f;
    private final ajct g;
    private final aoin h;
    private final aoin i;

    public jns(android.content.Context context, ajcu ajcuVar, ajct ajctVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, defpackage.ni niVar) {
        this.b = context;
        this.c = ajcuVar;
        this.g = ajctVar;
        this.f = niVar;
        this.h = aoinVar;
        this.i = aoinVar2;
        this.d = aoinVar3;
    }

    public final ajcq a(java.util.Locale locale) {
        a.b().l("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "initTtsForLocale", 181, "CallAnnouncerTtsPrewarmerImpl.java").y("initializing TTS for locale: %s", locale.toLanguageTag());
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        ajcq ajcqVarM = dff.m(new defpackage.jnr(this, atomicReference, 0));
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.c;
        return ahrv.g(ahrv.g(aiql.G(ajcqVarM, 10000L, timeUnit, scheduledExecutorService)).h(new defpackage.hup(atomicReference, 16), scheduledExecutorService)).h(new defpackage.iau(this, locale, 6), this.g);
    }

    public final ajcq b() {
        a.b().l("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "schedulePeriodicTtsPrewarmForSystemLocale", 132, "CallAnnouncerTtsPrewarmerImpl.java").v("Scheduling periodic pre-warm");
        zjx zjxVar = (zjx) this.d.a();
        aguv aguvVarA = aguz.a(jnt.class);
        aguvVarA.d(new aguw(new agux(((java.lang.Long) this.i.a()).longValue(), java.util.concurrent.TimeUnit.HOURS), ahwt.a));
        aguvVarA.c(new agux(((java.lang.Long) this.h.a()).longValue(), java.util.concurrent.TimeUnit.HOURS));
        grl grlVar = new grl();
        grlVar.b(gsi.c);
        grlVar.b = true;
        grlVar.a = true;
        aguvVarA.b(grlVar.a());
        aguvVarA.f(new aguy("com.android.dialer.texttospeech.PrewarmTextToSpeechWorker", 1));
        return ahvr.H(zjxVar.b(aguvVarA.a()), new defpackage.exn(14), this.c);
    }

    public final void c() {
        java.util.Locale localeAe = gus.ae(this.b);
        a.b().l("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "prewarmTtsForSystemLocale", androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CallAnnouncerTtsPrewarmerImpl.java").y("Requesting pre-warm for locale: %s", localeAe.toLanguageTag());
        agsm.d("com/android/dialer/callannouncer/impl/prewarmer/CallAnnouncerTtsPrewarmerImpl", "prewarmTtsForSystemLocale", 126, ahvr.H(a(localeAe), new defpackage.hup(this, 17), this.g), zct.b, "Failure while requesting to pre-warm TTS", new java.lang.Object[0]);
    }
}
