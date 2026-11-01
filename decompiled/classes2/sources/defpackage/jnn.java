package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jnn implements zcr {
    private static final aimz a = aimz.i("com/android/dialer/callannouncer/impl/CallAnnouncerEnabledFn");
    private final android.content.Context b;
    private final aoin c;
    private final zzx d;

    public jnn(android.content.Context context, aoin aoinVar, zzx zzxVar) {
        this.b = context;
        this.c = aoinVar;
        this.d = zzxVar;
    }

    public final boolean a() {
        if (this.d.m()) {
            hgb.c(a.b(), "disabled in direct boot mode", "com/android/dialer/callannouncer/impl/CallAnnouncerEnabledFn", "isEnabled", '*', "CallAnnouncerEnabledFn.java", (byte) 1, java.util.concurrent.TimeUnit.MINUTES);
            return false;
        }
        java.util.Locale localeAe = gus.ae(this.b);
        java.lang.String languageTag = new java.util.Locale(localeAe.getLanguage(), localeAe.getCountry()).toLanguageTag();
        if (((alfc) this.c.a()).b.contains(ahvr.p(languageTag))) {
            return true;
        }
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callannouncer/impl/CallAnnouncerEnabledFn", "isEnabled", 49, "CallAnnouncerEnabledFn.java").y("Feature disabled, device system language %s is not supported.", languageTag);
        return false;
    }
}
