package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
@java.lang.Deprecated
public final class sso {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil");
    public final android.content.Context a;

    @java.lang.Deprecated
    public sso(android.content.Context context) {
        this.a = context;
    }

    @java.lang.Deprecated
    public static java.lang.String b(hkd hkdVar) {
        java.lang.String str = hkdVar.c;
        return str.length() > 4 ? str.substring(str.length() - 4) : str;
    }

    public static boolean e(java.lang.String str) {
        return str.contains("#") || str.startsWith("*");
    }

    private static boolean f(java.lang.String str, java.lang.String str2) {
        int length = str.length();
        int length2 = str2.length();
        return (length < 4 || length2 < 4) ? str.equals(str2) : str.regionMatches(length - 4, str2, length2 - 4, 4);
    }

    @java.lang.Deprecated
    public final hkd a(java.lang.String str, java.lang.String str2) {
        defpackage.gus.aJ();
        defpackage.akzx akzxVarM = hkd.a.m();
        if (str2 != null) {
            ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 108, "DialerPhoneNumberUtil.java")).v("country ISO set to default region");
            akzxVarM.u();
            hkd hkdVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            hkdVar.b |= 2;
            hkdVar.d = str2;
        }
        if (str == null) {
            return akzxVarM.r();
        }
        if (e(str)) {
            ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 122, "DialerPhoneNumberUtil.java")).v("normalized number is set to raw number due to being a service number");
            akzxVarM.u();
            hkd hkdVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            hkdVar2.b |= 1;
            hkdVar2.c = str;
            return akzxVarM.r();
        }
        java.lang.String strExtractPostDialPortion = android.telephony.PhoneNumberUtils.extractPostDialPortion(str);
        if (!strExtractPostDialPortion.isEmpty()) {
            akzxVarM.u();
            hkd hkdVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(strExtractPostDialPortion);
            hkdVar3.b |= 8;
            hkdVar3.f = strExtractPostDialPortion;
            ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 129, "DialerPhoneNumberUtil.java")).v("post dial portion is present and set");
        }
        java.lang.String strExtractNetworkPortion = android.telephony.PhoneNumberUtils.extractNetworkPortion(str);
        try {
            defpackage.ssn ssnVarB = sns.b(this.a);
            akfx akfxVarAI = ssnVarB.tb().aI();
            akgu akguVarI = akfxVarAI.i(strExtractNetworkPortion, str2 == null ? defpackage.akfg.ZZ : defpackage.akfg.b(str2));
            boolean zQ = akfxVarAI.q(akguVarI);
            if (!zQ) {
                defpackage.oko okoVarBe = ssnVarB.be();
                if (okoVarBe.aa()) {
                    defpackage.rlv rlvVarBt = ssnVarB.bt();
                    rlvVarBt.o(defpackage.rmx.PARSE_PHONE_NUMBER_WITH_SIM_COUNTRY_ATTEMPTED);
                    j$.util.Optional optionalZ = okoVarBe.z();
                    if (optionalZ.isPresent()) {
                        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 162, "DialerPhoneNumberUtil.java")).v("simCountryCode is present");
                        akgu akguVarI2 = akfxVarAI.i(strExtractNetworkPortion, defpackage.akfg.b((java.lang.String) optionalZ.orElseThrow()));
                        if (akfxVarAI.q(akguVarI2)) {
                            rlvVarBt.o(defpackage.rmx.PARSE_PHONE_NUMBER_WITH_SIM_COUNTRY_SUCCESSFUL);
                            akguVarI = akguVarI2;
                            zQ = true;
                        }
                    }
                }
            }
            if (zQ) {
                java.lang.String strX = akfxVarAI.x(akguVarI, 1);
                if (android.text.TextUtils.isEmpty(strX)) {
                    throw new java.lang.IllegalStateException("e164 number should not be empty.");
                }
                if (!strExtractPostDialPortion.isEmpty()) {
                    ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 184, "DialerPhoneNumberUtil.java")).v("present post dial portion appended to valid number");
                    strX = strX + strExtractPostDialPortion;
                }
                boolean z = akfxVarAI.v(akguVarI) == 4;
                akzxVarM.u();
                hkd hkdVar4 = akzxVarM.b;
                hkdVar4.b |= 16;
                hkdVar4.g = z;
                java.lang.String str3 = akfxVarAI.d(akguVarI).eW;
                if (!android.text.TextUtils.isEmpty(str3)) {
                    akzxVarM.u();
                    hkd hkdVar5 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str3);
                    hkdVar5.b |= 32;
                    hkdVar5.h = str3;
                }
                ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 195, "DialerPhoneNumberUtil.java")).v("normalized number is set to valid number");
                akzxVarM.u();
                hkd hkdVar6 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strX);
                hkdVar6.b |= 1;
                hkdVar6.c = strX;
                akzxVarM.u();
                hkd hkdVar7 = akzxVarM.b;
                hkdVar7.b |= 4;
                hkdVar7.e = true;
                return akzxVarM.r();
            }
        } catch (defpackage.akfp e) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) b.d()).i(defpackage.zct.b)).k(e)).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", (char) 200, "DialerPhoneNumberUtil.java")).v("failed parsing number");
        }
        ((defpackage.aimw) ((defpackage.aimw) b.b()).l("com/android/dialer/phonenumberproto/DialerPhoneNumberUtil", "parse", 202, "DialerPhoneNumberUtil.java")).v("normalized number is set to the combination of the network and post dial portions");
        java.lang.String strValueOf = java.lang.String.valueOf(strExtractNetworkPortion);
        java.lang.String strValueOf2 = java.lang.String.valueOf(strExtractPostDialPortion);
        akzxVarM.u();
        hkd hkdVar8 = akzxVarM.b;
        java.lang.String strConcat = strValueOf.concat(strValueOf2);
        j$.util.Objects.requireNonNull(strConcat);
        hkdVar8.b |= 1;
        hkdVar8.c = strConcat;
        return akzxVarM.r();
    }

    public final boolean c(hkd hkdVar, hkd hkdVar2) {
        akgu akguVarI;
        java.lang.String str = hkdVar.c;
        java.lang.String str2 = hkdVar2.c;
        if (str.isEmpty() || str2.isEmpty() || !f(str, str2)) {
            return false;
        }
        if (!hkdVar.equals(hkdVar2)) {
            if (e(str) || e(str2)) {
                return str.equals(str2);
            }
            if (!hkdVar.f.equals(hkdVar2.f)) {
                return false;
            }
            akfx akfxVarAI = sns.b(this.a).tb().aI();
            akgu akguVarI2 = null;
            try {
                akguVarI = akfxVarAI.i(str, defpackage.akfg.b(hkdVar.d));
            } catch (defpackage.akfp unused) {
                akguVarI = null;
            }
            if (akguVarI == null) {
                return str.equals(str2);
            }
            try {
                akguVarI2 = akfxVarAI.i(str2, defpackage.akfg.b(hkdVar2.d));
            } catch (defpackage.akfp unused2) {
            }
            if (akguVarI2 == null) {
                return str.equals(str2);
            }
            akfy akfyVarAJ = sns.b(this.a).tb().aJ();
            if (akfyVarAJ.a(akguVarI) || akfyVarAJ.a(akguVarI2)) {
                return str.equals(str2);
            }
            int iT = akfxVarAI.t(akguVarI, akguVarI2);
            if (iT != 3 && iT != 4 && iT != 5) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x0050, please report this as an issue */
    public final boolean d(kdy kdyVar, kdy kdyVar2) {
        hkd hkdVarB;
        hkd hkdVarB2;
        java.lang.String str;
        java.lang.String str2;
        defpackage.ssn ssnVarB = sns.b(this.a);
        if (((java.lang.Boolean) ssnVarB.hL().a()).booleanValue()) {
            java.lang.String str3 = kdyVar.B;
            boolean z = str3 == null;
            java.lang.String str4 = kdyVar2.B;
            if (z == (str4 == null)) {
                if (str3 == null || str4 == null) {
                    hkdVarB = kdyVar.b();
                    hkdVarB2 = kdyVar2.b();
                    if (hkdVarB == null) {
                        str = "";
                    } else {
                        str = hkdVarB.c;
                    }
                    if (hkdVarB2 != null) {
                    }
                    if (!str.isEmpty()) {
                        if (hkdVarB.equals(hkdVarB2)) {
                            return true;
                        }
                        if (e(str)) {
                        }
                        return str.equals(str2);
                    }
                } else if (j$.util.Objects.equals(kdyVar.j, kdyVar2.j)) {
                    if (kdyVar.n() != null && kdyVar2.n() != null && j$.util.Objects.equals(kdyVar.n(), kdyVar2.n())) {
                        return true;
                    }
                    hkdVarB = kdyVar.b();
                    hkdVarB2 = kdyVar2.b();
                    if (hkdVarB == null) {
                        str = "";
                    } else {
                        str = hkdVarB.c;
                    }
                    if (hkdVarB2 != null) {
                    }
                    if (!str.isEmpty()) {
                        if (hkdVarB.equals(hkdVarB2)) {
                            return true;
                        }
                        if (e(str)) {
                        }
                        return str.equals(str2);
                    }
                }
            }
        } else {
            hkdVarB = kdyVar.b();
            hkdVarB2 = kdyVar2.b();
            if (hkdVarB == null) {
                str = "";
            } else {
                str = hkdVarB.c;
            }
            str2 = hkdVarB2 != null ? hkdVarB2.c : "";
            if (!str.isEmpty() && !str2.isEmpty() && f(str, str2)) {
                if (hkdVarB.equals(hkdVarB2)) {
                    return true;
                }
                if (!e(str) || e(str2)) {
                    return str.equals(str2);
                }
                if (hkdVarB.f.equals(hkdVarB2.f)) {
                    akgu akguVarL = kdyVar.l();
                    if (akguVarL == null) {
                        return str.equals(str2);
                    }
                    akgu akguVarL2 = kdyVar2.l();
                    if (akguVarL2 == null) {
                        return str.equals(str2);
                    }
                    if (kdyVar.m().booleanValue() || kdyVar2.m().booleanValue()) {
                        return str.equals(str2);
                    }
                    int iT = ssnVarB.tb().aI().t(akguVarL, akguVarL2);
                    if (iT == 3 || iT == 4 || iT == 5) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
