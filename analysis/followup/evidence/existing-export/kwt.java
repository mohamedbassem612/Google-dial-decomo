package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kwt {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider");
    private static final java.util.Locale i = java.util.Locale.forLanguageTag("en-US");
    public final android.content.Context b;
    public final defpackage.oko c;
    public final defpackage.aoin h;
    private final defpackage.ahzi j;
    private final defpackage.hyt l;
    public final defpackage.ahzi d = defpackage.ahvr.bJ(new defpackage.hlv(this, 7), j$.time.Duration.ofSeconds(15));
    public final defpackage.ahzi e = defpackage.ahvr.bJ(new defpackage.hlv(this, 8), j$.time.Duration.ofSeconds(15));
    public final defpackage.ahzi f = defpackage.ahvr.bJ(new defpackage.hlv(this, 9), j$.time.Duration.ofSeconds(15));
    private final defpackage.ahzi k = defpackage.ahvr.bJ(new defpackage.hlv(this, 10), j$.time.Duration.ofSeconds(15));
    public final defpackage.ahzi g = defpackage.ahvr.bI(new defpackage.hlv(this, 11));

    public kwt(android.content.Context context, defpackage.oko okoVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.hyt hytVar) {
        this.b = context;
        this.c = okoVar;
        this.j = defpackage.ahvr.bI(new defpackage.hlv(aoinVar, 12));
        this.h = aoinVar2;
        this.l = hytVar;
    }

    private final j$.util.Optional d() {
        return g((defpackage.aigf) this.j.eZ(), (java.lang.String) f(this.d));
    }

    private final j$.util.Optional e() {
        return this.l.a();
    }

    private static java.lang.Object f(defpackage.ahzi ahziVar) {
        try {
            return ahziVar.eZ();
        } catch (java.lang.NullPointerException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getMemoizedSupplierValueOrNull", (char) 283, "LocaleProvider.java")).v("The supplied value is not available yet.");
            return null;
        }
    }

    private static j$.util.Optional g(defpackage.aigf aigfVar, java.lang.String str) {
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", 174, "LocaleProvider.java")).I("checking whether country %s is supported by %s for start/end audio", str, "builtInAudio");
        if (str == null) {
            defpackage.ainm ainmVarD = aimzVar.d();
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ainmVarD).i(defpackage.zct.b)).g((byte) 1, java.util.concurrent.TimeUnit.MINUTES)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", (char) 179, "LocaleProvider.java")).v("null countryCode");
            return j$.util.Optional.empty();
        }
        java.lang.String str2 = (java.lang.String) aigfVar.get(defpackage.ahvr.q(str));
        if (str2 == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", 185, "LocaleProvider.java")).I("country %s not supported by %s", str, "builtInAudio");
            return j$.util.Optional.empty();
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
        try {
            if (!android.text.TextUtils.isEmpty(localeForLanguageTag.getISO3Language())) {
                ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", 210, "LocaleProvider.java")).I("country %s start/end audio supported by %s", str, "builtInAudio");
                return j$.util.Optional.of(localeForLanguageTag);
            }
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.d()).i(defpackage.zct.b)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", (char) 206, "LocaleProvider.java")).y("no iso3 language for languageCode: %s", str2);
            return j$.util.Optional.empty();
        } catch (java.util.MissingResourceException e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getSupportedLocaleFromCountryCode", (char) 198, "LocaleProvider.java")).y("missing resource for languageCode: %s", str2);
            return j$.util.Optional.empty();
        }
    }

    public final j$.util.Optional a() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getCurrentLocaleForBuiltInAudioFile", 136, "LocaleProvider.java")).v("checking built in audio file locale");
        return d();
    }

    public final java.util.Locale b() {
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getCurrentLocaleOrDefaultForTts", 127, "LocaleProvider.java")).v("checking TTS locale");
        return (java.util.Locale) e().orElse(i);
    }

    public final boolean c() {
        java.lang.Boolean bool = (java.lang.Boolean) f(this.k);
        boolean z = bool != null && bool.booleanValue();
        java.lang.Boolean.valueOf(z).getClass();
        if (!z) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "isCallRecordingCountry", 116, "LocaleProvider.java")).v("SIM and network countries do not match.");
        } else if (d().isPresent() || e().isPresent()) {
            return true;
        }
        return false;
    }
}
