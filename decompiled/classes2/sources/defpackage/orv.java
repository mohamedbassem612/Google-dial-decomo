package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class orv {
    private static final aimz a = aimz.i("com/android/dialer/i18n/phonenumbers/PhoneNumberParsing");

    public static final akgu a(akfx akfxVar, java.lang.String str, akfg akfgVar) {
        aooh.f(akfxVar, "util");
        aooh.f(str, "numberToParse");
        try {
            return akfxVar.i(str, akfgVar);
        } catch (akfp e) {
            a.b().k(e).l("com/android/dialer/i18n/phonenumbers/PhoneNumberParsing", "parseOrNull", 27, "PhoneNumberParsing.kt").y("PhoneNumberUtil.parse failed. Error type: %s", e.a);
            return null;
        }
    }
}
