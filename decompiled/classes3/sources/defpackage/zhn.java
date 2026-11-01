package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zhn {
    private static final aimz a = aimz.i("com/google/android/callingshared/phonenumbers/PhoneNumberParsing");

    public static final defpackage.akgu a(defpackage.akfx akfxVar, java.lang.String str, akfg akfgVar) {
        aooh.f(akfxVar, "util");
        aooh.f(str, "numberToParse");
        try {
            return akfxVar.i(str, akfgVar);
        } catch (akfp e) {
            a.b().k(e).l("com/google/android/callingshared/phonenumbers/PhoneNumberParsing", "parseOrNull", 35, "PhoneNumberParsing.kt").y("PhoneNumberUtil.parse failed. Error type: %s", e.a);
            return null;
        }
    }
}
