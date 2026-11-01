package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ssm {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl");
    private final android.content.Context b;
    private final defpackage.aogc c;

    public ssm(android.content.Context context, defpackage.aogc aogcVar) {
        this.b = context;
        this.c = aogcVar;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        akgu akguVarI;
        java.lang.String strA;
        java.lang.String strB;
        defpackage.aimz aimzVar = a;
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl", "getGeoDescription", 60, "PhoneNumberGeoLocatorImpl.java")).y("number: %s", defpackage.aais.aC(str));
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl", "getGeoDescription", 61, "PhoneNumberGeoLocatorImpl.java")).y("countryIso: %s", defpackage.aais.aD(str2));
        if (android.text.TextUtils.isEmpty(str)) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl", "getGeoDescription", 64, "PhoneNumberGeoLocatorImpl.java")).v("number is empty");
            return null;
        }
        try {
            akguVarI = this.c.aI().i(str, defpackage.akfg.b(str2));
        } catch (defpackage.akfp e) {
            aimzVar = a;
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl", "getGeoDescription", 'L', "PhoneNumberGeoLocatorImpl.java")).v("Unable to parse number");
            akguVarI = null;
        }
        ((defpackage.aimw) ((defpackage.aimw) aimzVar.b()).l("com/android/dialer/phonenumbergeolocator/impl/PhoneNumberGeoLocatorImpl", "getGeoDescription", 79, "PhoneNumberGeoLocatorImpl.java")).y("parsedPhoneNumber is null: %b", java.lang.Boolean.valueOf(akguVarI == null));
        if (akguVarI == null) {
            return null;
        }
        android.content.Context context = this.b;
        akfw akfwVarA = akfw.a();
        java.util.Locale localeAe = defpackage.gus.ae(context);
        akfx akfxVar = akfwVarA.b;
        int iV = akfxVar.v(akguVarI);
        if (iV == 12) {
            strB = "";
        } else if (akfxVar.A(iV, akguVarI.c)) {
            java.lang.String language = localeAe.getLanguage();
            java.lang.String country = localeAe.getCountry();
            java.lang.String strK = akfx.k(akguVarI.c);
            java.lang.String strL = akfxVar.l(akguVarI);
            if (strK.isEmpty() || !strL.startsWith(strK)) {
                strA = akfwVarA.a.a(akguVarI, language, country);
            } else {
                java.lang.String strSubstring = strL.substring(strK.length());
                defpackage.akzx akzxVarM = akgu.a.m();
                int i = akguVarI.c;
                akzxVarM.u();
                akgu akguVar = akzxVarM.b;
                akguVar.b |= 1;
                akguVar.c = i;
                long j = java.lang.Long.parseLong(strSubstring);
                akzxVarM.u();
                akgu akguVar2 = akzxVarM.b;
                akguVar2.b |= 2;
                akguVar2.d = j;
                akfx.G(strSubstring, akzxVarM);
                strA = akfwVarA.a.a(akzxVarM.r(), language, country);
            }
            if (strA.length() > 0) {
                return strA;
            }
            strB = akfwVarA.b(akguVarI, localeAe);
        } else {
            strB = akfwVarA.b(akguVarI, localeAe);
        }
        return strB;
    }
}
