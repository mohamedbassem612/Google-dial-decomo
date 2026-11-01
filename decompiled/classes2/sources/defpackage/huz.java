package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class huz {
    private static final aimz b = aimz.i("com/android/dialer/assistedemergencydialing/impl/LocaleProvider");
    public final android.content.Context a;
    private final ahzi c;
    private final ahzi d = ahvr.bJ(new defpackage.exm(this, 6), j$.time.Duration.ofHours(12));

    public huz(android.content.Context context, aoin aoinVar) {
        this.a = context;
        this.c = ahvr.bI(new defpackage.exm(aoinVar, 7));
    }

    private static j$.util.Optional b(aigf aigfVar, java.lang.String str) {
        if (str == null) {
            a.bt(b.d(), "%s - null countryCode", "supported", "com/android/dialer/assistedemergencydialing/impl/LocaleProvider", "getSupportedLocaleFromCountryCode", '>', "LocaleProvider.java", zct.b);
            return j$.util.Optional.empty();
        }
        java.lang.String str2 = (java.lang.String) aigfVar.get(ahvr.q(str));
        if (str2 == null) {
            b.b().g(11, java.util.concurrent.TimeUnit.HOURS).l("com/android/dialer/assistedemergencydialing/impl/LocaleProvider", "getSupportedLocaleFromCountryCode", 68, "LocaleProvider.java").I("%s - unsupported country: %s", "supported", str);
            return j$.util.Optional.empty();
        }
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(str2);
        try {
            if (!android.text.TextUtils.isEmpty(localeForLanguageTag.getISO3Language())) {
                return j$.util.Optional.of(localeForLanguageTag);
            }
            b.d().i(zct.b).l("com/android/dialer/assistedemergencydialing/impl/LocaleProvider", "getSupportedLocaleFromCountryCode", 90, "LocaleProvider.java").I("%s - no iso3 language for languageCode: %s", "supported", str2);
            return j$.util.Optional.empty();
        } catch (java.util.MissingResourceException e) {
            b.d().i(zct.b).k(e).l("com/android/dialer/assistedemergencydialing/impl/LocaleProvider", "getSupportedLocaleFromCountryCode", 82, "LocaleProvider.java").I("%s - missing resource for languageCode: %s", "supported", str2);
            return j$.util.Optional.empty();
        }
    }

    public final j$.util.Optional a() {
        return b((aigf) this.c.eZ(), (java.lang.String) this.d.eZ());
    }
}
