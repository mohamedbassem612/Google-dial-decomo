package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hui implements defpackage.hud {
    private static final aimz a = aimz.i("com/android/dialer/assisteddialing/impl/AssistedDialingMediatorImpl");
    private final defpackage.hun b;
    private final huo c;

    public hui(defpackage.hun hunVar, huo huoVar) {
        this.b = hunVar;
        this.c = huoVar;
    }

    @Override // defpackage.hud
    public final j$.util.Optional a(java.lang.String str) {
        java.lang.String upperCase;
        akgu akguVarJ;
        int i;
        int i2;
        int iH;
        defpackage.hue hueVar;
        boolean z;
        if (str == null || str.length() == 0) {
            a.b().l("com/android/dialer/assisteddialing/impl/AssistedDialingMediatorImpl", "attemptAssistedDial", 38, "AssistedDialingMediatorImpl.kt").v("numberToCheck is empty");
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.e(optionalEmpty, "empty(...)");
            return optionalEmpty;
        }
        defpackage.hun hunVar = this.b;
        java.lang.String strA = hunVar.a();
        if (strA == null || strA.length() == 0) {
            a.b().l("com/android/dialer/assisteddialing/impl/AssistedDialingMediatorImpl", "attemptAssistedDial", 44, "AssistedDialingMediatorImpl.kt").v("userHomeCountryCode was empty");
            j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
            aooh.e(optionalEmpty2, "empty(...)");
            return optionalEmpty2;
        }
        java.lang.String str2 = (java.lang.String) aooh.q(hunVar.b.x());
        if (str2 == null) {
            defpackage.hun.a.b().l("com/android/dialer/assisteddialing/impl/LocationDetector", "getUpperCaseUserRoamingCountry", 63, "LocationDetector.kt").v("user roaming country was null");
            upperCase = null;
        } else {
            java.util.Locale locale = java.util.Locale.US;
            aooh.e(locale, "US");
            upperCase = str2.toUpperCase(locale);
            aooh.e(upperCase, "toUpperCase(...)");
        }
        if (upperCase == null || upperCase.length() == 0) {
            a.b().l("com/android/dialer/assisteddialing/impl/AssistedDialingMediatorImpl", "attemptAssistedDial", 50, "AssistedDialingMediatorImpl.kt").v("userRoamingCountryCode was empty");
            j$.util.Optional optionalEmpty3 = j$.util.Optional.empty();
            aooh.e(optionalEmpty3, "empty(...)");
            return optionalEmpty3;
        }
        huo huoVar = this.c;
        try {
            akfx akfxVarAI = huoVar.f.aI();
            akfg akfgVarB = akfg.b(strA);
            akfq akfqVarA = akfr.a();
            akfqVarA.b(true);
            akfqVarA.a = akfgVarB;
            akguVarJ = akfxVarAI.j(str, akfqVarA.a());
        } catch (akfp unused) {
            huoVar.c.n(rmw.fO);
            huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "parsePhoneNumber", 126, "NumberTransformer.kt").v("could not parse the number");
            akguVarJ = null;
        }
        if (akguVarJ == null) {
            huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "parsePhoneNumberAndValidate", 95, "NumberTransformer.kt").v("parsedPhoneNumber was empty");
            i2 = 1;
            akguVarJ = null;
            i = 4;
        } else {
            if (android.text.TextUtils.isEmpty(strA)) {
                huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "isSupportedCountryCode", 133, "NumberTransformer.kt").v("userHomeCountryCode was empty");
            } else {
                boolean zA = huoVar.b.a(strA);
                aimz aimzVar = huo.a;
                aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "isSupportedCountryCode", 138, "NumberTransformer.kt").y("result: %b", java.lang.Boolean.valueOf(zA));
                if (zA) {
                    boolean zN = aooh.n(strA, upperCase);
                    i = 4;
                    i2 = 1;
                    aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer$Companion", "isUserRoaming", 203, "NumberTransformer.kt").y("result: %b", java.lang.Boolean.valueOf(!zN));
                    if (!zN) {
                        if ((akguVarJ.b & 1) == 0 || ((iH = akky.h(akguVarJ.i)) != 0 && iH == 21)) {
                            boolean z2 = huoVar.e.X(str) || huoVar.d.e(str);
                            aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "isEmergencyNumber", 165, "NumberTransformer.kt").y("result: %b", java.lang.Boolean.valueOf(z2));
                            if (!z2) {
                                boolean zQ = huoVar.f.aI().q(akguVarJ);
                                aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "isValidNumber", 172, "NumberTransformer.kt").y("result: %b", java.lang.Boolean.valueOf(zQ));
                                if (zQ) {
                                    if ((akguVarJ.b & 4) != 0 && !android.text.TextUtils.isEmpty(akguVarJ.e)) {
                                        huoVar.c.n(rmw.fQ);
                                        aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "hasExtension", 188, "NumberTransformer.kt").v("phone number has an extension");
                                    }
                                }
                            }
                        } else {
                            huoVar.c.n(rmw.fP);
                            aimzVar.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "isInternationalNumber", 152, "NumberTransformer.kt").v("phone number already provided the country code");
                        }
                    }
                }
                huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "parsePhoneNumberAndValidate", 110, "NumberTransformer.kt").v("numberToCheck does not meet all conditions");
                akguVarJ = null;
            }
            i2 = 1;
            i = 4;
            huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "parsePhoneNumberAndValidate", 110, "NumberTransformer.kt").v("numberToCheck does not meet all conditions");
            akguVarJ = null;
        }
        if (akguVarJ != null) {
            akfx akfxVarAI2 = huoVar.f.aI();
            akfg akfgVarB2 = akfg.b(upperCase);
            int i3 = akguVarJ.c;
            java.lang.String strX = "";
            if (akfxVarAI2.p(i3)) {
                akzx akzxVarP = akguVarJ.p();
                akzxVarP.u();
                akgu akguVar = akzxVarP.b;
                akguVar.b &= -5;
                akguVar.e = akgu.a.e;
                akgu akguVarP = akzxVarP.p();
                akfg akfgVarC = akfxVarAI2.c(i3);
                int iV = akfxVarAI2.v(akguVarP);
                if (akfgVarB2.equals(akfgVarC)) {
                    boolean z3 = iV == i2 || iV == 2 || iV == 3;
                    if (!akfgVarC.equals(akfg.G)) {
                        z = z3;
                    } else if (!z3) {
                        z = false;
                    } else if (akguVarP.j.length() > 0) {
                        strX = akguVarP.j.length() > 0 ? akguVarP.j : "";
                        int i4 = akguVarP.c;
                        java.lang.String strL = akfxVarAI2.l(akguVarP);
                        if (akfxVarAI2.p(i4)) {
                            akft akftVarG = akfxVarAI2.g(i4, akfxVarAI2.c(i4));
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
                            sb.append(akfxVarAI2.y(strL, akftVarG, 3, strX));
                            akfxVarAI2.I(akguVarP, akftVarG, sb);
                            akfxVarAI2.z(i4, 3, sb);
                            strX = sb.toString();
                        } else {
                            strX = strL;
                        }
                    }
                    if (i3 == 1) {
                        strX = (!akfxVarAI2.n(akguVarP) || akfxVarAI2.w(akfxVarAI2.l(akguVarP), akfxVarAI2.f(akfgVarB2), 12) == i) ? akfxVarAI2.x(akguVarP, 3) : akfxVarAI2.x(akguVarP, 2);
                    } else {
                        strX = ((akfgVarC.equals(akfx.h) || ((akfgVarC.equals(akfg.cn) || akfgVarC.equals(akfg.W) || akfgVarC.equals(akfg.dU)) && z)) && akfxVarAI2.n(akguVarP)) ? akfxVarAI2.x(akguVarP, 2) : akfxVarAI2.x(akguVarP, 3);
                    }
                } else if (iV != 12 && akfxVarAI2.n(akguVarP)) {
                    strX = akfxVarAI2.x(akguVarP, 2);
                }
            } else if ((akguVarJ.b & 32) != 0) {
                strX = akguVarJ.h;
            }
            aooh.e(strX, "formatNumberForMobileDialing(...)");
            if (android.text.TextUtils.isEmpty(strX)) {
                huo.a.b().l("com/android/dialer/assisteddialing/impl/NumberTransformer", "doAssistedDialingTransformation", 62, "NumberTransformer.kt").v("formatNumberForMobileDialing returned an empty string");
                hueVar = null;
            } else {
                hueVar = new defpackage.hue(str, strX, strA, upperCase, akguVarJ.c);
            }
        } else {
            hueVar = null;
        }
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(hueVar);
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    @Override // defpackage.hud
    public final j$.util.Optional b() {
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(this.b.a());
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return optionalOfNullable;
    }

    @Override // defpackage.hud
    public final boolean c() {
        return true;
    }
}
