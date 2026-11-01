package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeeb implements defpackage.aedo {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private static final defpackage.adxc c = defpackage.adxc.a("X-Goog-Api-Key");
    private static final defpackage.adxc d = defpackage.adxc.a("X-Goog-Spatula");
    private static final defpackage.adxc e = defpackage.adxc.a("X-Android-Cert");
    private static final defpackage.adxc f = defpackage.adxc.a("X-Android-Package");
    private static final defpackage.adxc g = defpackage.adxc.a("Authorization");
    private static final defpackage.adxc h = defpackage.adxc.a("Cookie");
    public final defpackage.aolr b;
    private final defpackage.adxb i;
    private final defpackage.aduu j;
    private final java.lang.String k;
    private final defpackage.adym l;
    private final android.content.Context m;
    private final java.lang.String n;
    private final defpackage.ahyn o;

    static {
        defpackage.adxc.a("X-Goog-Visitor-Id");
        defpackage.adxc.a("X-Goog-Fitbit-Oauth-Token");
    }

    public aeeb(defpackage.adxb adxbVar, defpackage.aduu aduuVar, java.lang.String str, defpackage.adym adymVar, android.content.Context context, java.lang.String str2, defpackage.aolr aolrVar, defpackage.aoss aossVar, defpackage.ahyn ahynVar) {
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(adymVar, "authUtil");
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aolrVar, "gnpBlockingContext");
        defpackage.aooh.f(aossVar, "gnpLightweightScope");
        defpackage.aooh.f(ahynVar, "fitbitAuthDataProvider");
        this.i = adxbVar;
        this.j = aduuVar;
        this.k = str;
        this.l = adymVar;
        this.m = context;
        this.n = str2;
        this.b = aolrVar;
        this.o = ahynVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:49:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0248  */
    /* JADX WARN: Code duplicated, block: B:64:0x024e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0254  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x0304  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0390  */
    /* JADX WARN: Code duplicated, block: B:88:0x0396  */
    /* JADX WARN: Code duplicated, block: B:90:0x03fc  */
    public final java.lang.Object a(defpackage.akri akriVar, java.lang.String str, defpackage.aduy aduyVar, boolean z, defpackage.aoln aolnVar) {
        aedt aedtVar;
        defpackage.aduy aduyVar2;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation;
        defpackage.akri akriVar2;
        defpackage.adtz adtzVar;
        java.lang.Object objD;
        java.lang.String str2;
        defpackage.adtz adtzVar2;
        java.lang.Object objD2;
        defpackage.adtz adtzVar3;
        int iR;
        defpackage.akri akriVar3 = akriVar;
        if (aolnVar instanceof aedt) {
            aedtVar = (aedt) aolnVar;
            int i = aedtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedtVar.d = i - Integer.MIN_VALUE;
            } else {
                aedtVar = new aedt(this, aolnVar);
            }
        } else {
            aedtVar = new aedt(this, aolnVar);
        }
        java.lang.Object objG = aedtVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aedtVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aduyVar2 = (defpackage.aduy) aedtVar.a;
                akriVar3 = aedtVar.e;
                defpackage.aooc.af(objG);
                adtzVar = (defpackage.adtz) objG;
                if (!(adtzVar instanceof defpackage.adtv)) {
                    objD = adtzVar.d();
                    if (objD != null) {
                        throw new java.lang.IllegalArgumentException("Auth token is null");
                    }
                    java.lang.String str3 = (java.lang.String) objD;
                    defpackage.ajyk ajykVarAf = defpackage.ajsz.af(akriVar3.L());
                    defpackage.xtq xtqVarL = aknx.L(ajykVarAf.O().L());
                    defpackage.akzx akzxVarM = akre.a.m();
                    defpackage.aooh.f(akzxVarM, "builder");
                    akzxVarM.u();
                    akre akreVar = akzxVarM.b;
                    j$.util.Objects.requireNonNull(str3);
                    akreVar.b |= 1;
                    akreVar.c = str3;
                    akre akreVarR = akzxVarM.r();
                    defpackage.aooh.e(akreVarR, "build(...)");
                    akre akreVar2 = akreVarR;
                    defpackage.aooh.f(akreVar2, "value");
                    defpackage.akzx akzxVar = (defpackage.akzx) xtqVarL.a;
                    akzxVar.u();
                    defpackage.aksb aksbVar = (defpackage.aksb) akzxVar.b;
                    j$.util.Objects.requireNonNull(akreVar2);
                    aksbVar.c = akreVar2;
                    aksbVar.b = 1;
                    ajykVarAf.P(xtqVarL.as());
                    return new defpackage.aoiu(ajykVarAf.N(), new defpackage.adub(defpackage.aojh.a));
                }
                str2 = aduyVar2.c;
                if (str2 != null || str2.length() == 0) {
                    return new defpackage.aoiu(akriVar3, adtzVar);
                }
                defpackage.ajyk ajykVarAf2 = defpackage.ajsz.af(akriVar3.L());
                defpackage.xtq xtqVarL2 = aknx.L(ajykVarAf2.O().L());
                defpackage.akzx akzxVarM2 = akrf.a.m();
                defpackage.aooh.f(akzxVarM2, "builder");
                akzxVarM2.u();
                akrf akrfVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                akrfVar.b |= 1;
                akrfVar.c = str2;
                java.lang.String message = ((defpackage.adtv) adtzVar).b().getMessage();
                if (message != null) {
                    akzxVarM2.u();
                    akrf akrfVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(message);
                    akrfVar2.b |= 2;
                    akrfVar2.d = message;
                }
                akrf akrfVarR = akzxVarM2.r();
                defpackage.aooh.e(akrfVarR, "build(...)");
                akrf akrfVar3 = akrfVarR;
                defpackage.aooh.f(akrfVar3, "value");
                defpackage.akzx akzxVar2 = (defpackage.akzx) xtqVarL2.a;
                akzxVar2.u();
                defpackage.aksb aksbVar2 = (defpackage.aksb) akzxVar2.b;
                j$.util.Objects.requireNonNull(akrfVar3);
                aksbVar2.c = akrfVar3;
                aksbVar2.b = 6;
                ajykVarAf2.P(xtqVarL2.as());
                return new defpackage.aoiu(ajykVarAf2.N(), adtzVar);
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                akriVar2 = aedtVar.e;
                defpackage.aooc.af(objG);
                adtzVar3 = (defpackage.adtz) objG;
                iR = defpackage.anty.R(adtzVar3);
                if (iR != 0) {
                    if (iR == 1) {
                        return new defpackage.aoiu(akriVar2, (defpackage.adtv) adtzVar3);
                    }
                    throw new defpackage.aois();
                }
                java.lang.String str4 = (java.lang.String) ((defpackage.adub) adtzVar3).a;
                defpackage.ajyk ajykVarAf3 = defpackage.ajsz.af(akriVar2.L());
                defpackage.xtq xtqVarL3 = aknx.L(ajykVarAf3.O().L());
                defpackage.akzx akzxVarM3 = akrd.a.m();
                defpackage.aooh.f(akzxVarM3, "builder");
                defpackage.aooh.f(str4, "value");
                akzxVarM3.u();
                akrd akrdVar = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str4);
                akrdVar.b |= 1;
                akrdVar.c = str4;
                akrd akrdVarR = akzxVarM3.r();
                defpackage.aooh.e(akrdVarR, "build(...)");
                akrd akrdVar2 = akrdVarR;
                defpackage.aooh.f(akrdVar2, "value");
                defpackage.akzx akzxVar3 = (defpackage.akzx) xtqVarL3.a;
                akzxVar3.u();
                defpackage.aksb aksbVar3 = (defpackage.aksb) akzxVar3.b;
                j$.util.Objects.requireNonNull(akrdVar2);
                aksbVar3.c = akrdVar2;
                aksbVar3.b = 5;
                ajykVarAf3.P(xtqVarL3.as());
                return new defpackage.aoiu(ajykVarAf3.N(), new defpackage.adub(defpackage.aojh.a));
            }
            accountRepresentation = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) aedtVar.a;
            akriVar3 = aedtVar.e;
            defpackage.aooc.af(objG);
            adtzVar2 = (defpackage.adtz) objG;
            if (adtzVar2 instanceof defpackage.adtv) {
                return new defpackage.aoiu(akriVar3, adtzVar2);
            }
            objD2 = adtzVar2.d();
            if (objD2 != null) {
                throw new java.lang.IllegalArgumentException("Auth token is null");
            }
            java.lang.String str5 = (java.lang.String) objD2;
            defpackage.ajyk ajykVarAf4 = defpackage.ajsz.af(akriVar3.L());
            defpackage.xtq xtqVarL4 = aknx.L(ajykVarAf4.O().L());
            defpackage.akzx akzxVarM4 = akqz.a.m();
            defpackage.aooh.f(akzxVarM4, "builder");
            akzxVarM4.u();
            akqz akqzVar = akzxVarM4.b;
            j$.util.Objects.requireNonNull(str5);
            akqzVar.b |= 1;
            akqzVar.c = str5;
            java.lang.String str6 = ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) accountRepresentation).a;
            defpackage.aooh.f(str6, "value");
            akzxVarM4.u();
            akqz akqzVar2 = akzxVarM4.b;
            j$.util.Objects.requireNonNull(str6);
            akqzVar2.b |= 2;
            akqzVar2.d = str6;
            akqz akqzVarR = akzxVarM4.r();
            defpackage.aooh.e(akqzVarR, "build(...)");
            akqz akqzVar3 = akqzVarR;
            defpackage.aooh.f(akqzVar3, "value");
            defpackage.akzx akzxVar4 = (defpackage.akzx) xtqVarL4.a;
            akzxVar4.u();
            defpackage.aksb aksbVar4 = (defpackage.aksb) akzxVar4.b;
            j$.util.Objects.requireNonNull(akqzVar3);
            aksbVar4.c = akqzVar3;
            aksbVar4.b = 3;
            ajykVarAf4.P(xtqVarL4.as());
            return new defpackage.aoiu(ajykVarAf4.N(), new defpackage.adub(defpackage.aojh.a));
        }
        defpackage.aooc.af(objG);
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentationB = aduyVar.b();
        int iAe = defpackage.anty.ae(accountRepresentationB);
        if (iAe == 0) {
            java.lang.String str7 = ((com.google.android.libraries.notifications.platform.registration.Gaia) accountRepresentationB).a;
            aedtVar.e = akriVar3;
            aedtVar.a = aduyVar;
            aedtVar.d = 1;
            objG = g(str7, accountRepresentationB, z, aedtVar);
            if (objG == aoluVar) {
                return aoluVar;
            }
            aduyVar2 = aduyVar;
            adtzVar = (defpackage.adtz) objG;
            if (!(adtzVar instanceof defpackage.adtv)) {
                str2 = aduyVar2.c;
                if (str2 != null) {
                }
                return new defpackage.aoiu(akriVar3, adtzVar);
            }
            objD = adtzVar.d();
            if (objD != null) {
                throw new java.lang.IllegalArgumentException("Auth token is null");
            }
            java.lang.String str8 = (java.lang.String) objD;
            defpackage.ajyk ajykVarAf5 = defpackage.ajsz.af(akriVar3.L());
            defpackage.xtq xtqVarL5 = aknx.L(ajykVarAf5.O().L());
            defpackage.akzx akzxVarM5 = akre.a.m();
            defpackage.aooh.f(akzxVarM5, "builder");
            akzxVarM5.u();
            akre akreVar3 = akzxVarM5.b;
            j$.util.Objects.requireNonNull(str8);
            akreVar3.b |= 1;
            akreVar3.c = str8;
            akre akreVarR2 = akzxVarM5.r();
            defpackage.aooh.e(akreVarR2, "build(...)");
            akre akreVar4 = akreVarR2;
            defpackage.aooh.f(akreVar4, "value");
            defpackage.akzx akzxVar5 = (defpackage.akzx) xtqVarL5.a;
            akzxVar5.u();
            defpackage.aksb aksbVar5 = (defpackage.aksb) akzxVar5.b;
            j$.util.Objects.requireNonNull(akreVar4);
            aksbVar5.c = akreVar4;
            aksbVar5.b = 1;
            ajykVarAf5.P(xtqVarL5.as());
            return new defpackage.aoiu(ajykVarAf5.N(), new defpackage.adub(defpackage.aojh.a));
        }
        if (iAe == 1) {
            java.lang.String str9 = aduyVar.d;
            if (str9 == null || str9.length() == 0) {
                return new defpackage.aoiu(akriVar3, new adtw(new java.lang.IllegalStateException("No actual account name found for delegated Gaia account"), defpackage.adty.ap));
            }
            aedtVar.e = akriVar3;
            aedtVar.a = accountRepresentationB;
            aedtVar.d = 2;
            java.lang.Object objG2 = g(str9, accountRepresentationB, z, aedtVar);
            if (objG2 == aoluVar) {
                return aoluVar;
            }
            objG = objG2;
            accountRepresentation = accountRepresentationB;
            adtzVar2 = (defpackage.adtz) objG;
            if (adtzVar2 instanceof defpackage.adtv) {
                return new defpackage.aoiu(akriVar3, adtzVar2);
            }
            objD2 = adtzVar2.d();
            if (objD2 != null) {
                throw new java.lang.IllegalArgumentException("Auth token is null");
            }
            java.lang.String str10 = (java.lang.String) objD2;
            defpackage.ajyk ajykVarAf6 = defpackage.ajsz.af(akriVar3.L());
            defpackage.xtq xtqVarL6 = aknx.L(ajykVarAf6.O().L());
            defpackage.akzx akzxVarM6 = akqz.a.m();
            defpackage.aooh.f(akzxVarM6, "builder");
            akzxVarM6.u();
            akqz akqzVar4 = akzxVarM6.b;
            j$.util.Objects.requireNonNull(str10);
            akqzVar4.b |= 1;
            akqzVar4.c = str10;
            java.lang.String str11 = ((com.google.android.libraries.notifications.platform.registration.DelegatedGaia) accountRepresentation).a;
            defpackage.aooh.f(str11, "value");
            akzxVarM6.u();
            akqz akqzVar5 = akzxVarM6.b;
            j$.util.Objects.requireNonNull(str11);
            akqzVar5.b |= 2;
            akqzVar5.d = str11;
            akqz akqzVarR2 = akzxVarM6.r();
            defpackage.aooh.e(akqzVarR2, "build(...)");
            akqz akqzVar6 = akqzVarR2;
            defpackage.aooh.f(akqzVar6, "value");
            defpackage.akzx akzxVar6 = (defpackage.akzx) xtqVarL6.a;
            akzxVar6.u();
            defpackage.aksb aksbVar6 = (defpackage.aksb) akzxVar6.b;
            j$.util.Objects.requireNonNull(akqzVar6);
            aksbVar6.c = akqzVar6;
            aksbVar6.b = 3;
            ajykVarAf6.P(xtqVarL6.as());
            return new defpackage.aoiu(ajykVarAf6.N(), new defpackage.adub(defpackage.aojh.a));
        }
        if (iAe == 2) {
            defpackage.ahyn ahynVar = this.o;
            if (!ahynVar.f()) {
                return new defpackage.aoiu(akriVar3, new adtw(new java.lang.IllegalArgumentException("fitbitAuthDataProvider not found, can't get fitbit auth token."), defpackage.adty.ao));
            }
            aefy aefyVar = (aefy) ahynVar.b();
            aedtVar.e = akriVar3;
            aedtVar.d = 3;
            objG = aefyVar.a();
            if (objG == aoluVar) {
                return aoluVar;
            }
            akriVar2 = akriVar3;
            adtzVar3 = (defpackage.adtz) objG;
            iR = defpackage.anty.R(adtzVar3);
            if (iR != 0) {
                if (iR == 1) {
                    return new defpackage.aoiu(akriVar2, (defpackage.adtv) adtzVar3);
                }
                throw new defpackage.aois();
            }
            java.lang.String str12 = (java.lang.String) ((defpackage.adub) adtzVar3).a;
            defpackage.ajyk ajykVarAf7 = defpackage.ajsz.af(akriVar2.L());
            defpackage.xtq xtqVarL7 = aknx.L(ajykVarAf7.O().L());
            defpackage.akzx akzxVarM7 = akrd.a.m();
            defpackage.aooh.f(akzxVarM7, "builder");
            defpackage.aooh.f(str12, "value");
            akzxVarM7.u();
            akrd akrdVar3 = akzxVarM7.b;
            j$.util.Objects.requireNonNull(str12);
            akrdVar3.b |= 1;
            akrdVar3.c = str12;
            akrd akrdVarR2 = akzxVarM7.r();
            defpackage.aooh.e(akrdVarR2, "build(...)");
            akrd akrdVar4 = akrdVarR2;
            defpackage.aooh.f(akrdVar4, "value");
            defpackage.akzx akzxVar7 = (defpackage.akzx) xtqVarL7.a;
            akzxVar7.u();
            defpackage.aksb aksbVar7 = (defpackage.aksb) akzxVar7.b;
            j$.util.Objects.requireNonNull(akrdVar4);
            aksbVar7.c = akrdVar4;
            aksbVar7.b = 5;
            ajykVarAf7.P(xtqVarL7.as());
            return new defpackage.aoiu(ajykVarAf7.N(), new defpackage.adub(defpackage.aojh.a));
        }
        if (iAe == 3) {
            if (str == null) {
                return new defpackage.aoiu(akriVar3, new adtx(new java.lang.IllegalArgumentException("Zwieback ID must not be null when registering Zwieback"), defpackage.adty.ar));
            }
            defpackage.ajyk ajykVarAf8 = defpackage.ajsz.af(akriVar3.L());
            defpackage.xtq xtqVarL8 = aknx.L(ajykVarAf8.O().L());
            defpackage.akzx akzxVarM8 = aksf.a.m();
            defpackage.aooh.f(akzxVarM8, "builder");
            akzxVarM8.u();
            aksf aksfVar = akzxVarM8.b;
            j$.util.Objects.requireNonNull(str);
            aksfVar.b |= 1;
            aksfVar.c = str;
            aksf aksfVarR = akzxVarM8.r();
            defpackage.aooh.e(aksfVarR, "build(...)");
            aksf aksfVar2 = aksfVarR;
            defpackage.aooh.f(aksfVar2, "value");
            defpackage.akzx akzxVar8 = (defpackage.akzx) xtqVarL8.a;
            akzxVar8.u();
            defpackage.aksb aksbVar8 = (defpackage.aksb) akzxVar8.b;
            j$.util.Objects.requireNonNull(aksfVar2);
            aksbVar8.c = aksfVar2;
            aksbVar8.b = 2;
            ajykVarAf8.P(xtqVarL8.as());
            return new defpackage.aoiu(ajykVarAf8.N(), new defpackage.adub(defpackage.aojh.a));
        }
        if (iAe != 4) {
            throw new defpackage.aois();
        }
        if (str == null) {
            return new defpackage.aoiu(akriVar3, new adtw(new java.lang.IllegalArgumentException("Visitor ID must not be null when registering YouTube Visitor account"), defpackage.adty.aq));
        }
        defpackage.ajyk ajykVarAf9 = defpackage.ajsz.af(akriVar3.L());
        defpackage.xtq xtqVarL9 = aknx.L(ajykVarAf9.O().L());
        defpackage.akzx akzxVarM9 = akse.a.m();
        defpackage.aooh.f(akzxVarM9, "builder");
        akzxVarM9.u();
        akse akseVar = akzxVarM9.b;
        j$.util.Objects.requireNonNull(str);
        akseVar.b |= 1;
        akseVar.c = str;
        akse akseVarR = akzxVarM9.r();
        defpackage.aooh.e(akseVarR, "build(...)");
        akse akseVar2 = akseVarR;
        defpackage.aooh.f(akseVar2, "value");
        defpackage.akzx akzxVar9 = (defpackage.akzx) xtqVarL9.a;
        akzxVar9.u();
        defpackage.aksb aksbVar9 = (defpackage.aksb) akzxVar9.b;
        j$.util.Objects.requireNonNull(akseVar2);
        aksbVar9.c = akseVar2;
        aksbVar9.b = 4;
        ajykVarAf9.P(xtqVarL9.as());
        return new defpackage.aoiu(ajykVarAf9.N(), new defpackage.adub(defpackage.aojh.a));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x012a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ajyk] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00f4 -> B:36:0x00f8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.util.List r18, java.lang.String r19, defpackage.akrj r20, boolean r21, defpackage.aoln r22) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeeb.b(java.util.List, java.lang.String, akrj, boolean, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, java.net.URL url, defpackage.albh albhVar, boolean z, defpackage.aoln aolnVar) {
        aedw aedwVar;
        aoux aouxVar;
        if (aolnVar instanceof aedw) {
            aedwVar = (aedw) aolnVar;
            int i = aedwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedwVar.c = i - Integer.MIN_VALUE;
            } else {
                aedwVar = new aedw(this, aolnVar);
            }
        } else {
            aedwVar = new aedw(this, aolnVar);
        }
        java.lang.Object objI = aedwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aedwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objI);
            aoux aouxVar2 = new aoux();
            aouxVar2.c = 1;
            aouxVar2.d = new java.util.HashMap();
            aouxVar2.c = 2;
            if (url == null) {
                throw new java.lang.NullPointerException("Null url");
            }
            aouxVar2.b = url;
            aouxVar2.a = "application/x-protobuf";
            aouxVar2.e = albhVar.i();
            aedwVar.d = aouxVar2;
            aedwVar.c = 1;
            objI = i(aouxVar2, accountRepresentation, str, z, aedwVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
            aouxVar = aouxVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aouxVar = aedwVar.d;
            defpackage.aooc.af(objI);
        }
        defpackage.adtz adtzVar = (defpackage.adtz) objI;
        if (!adtzVar.g()) {
            return new defpackage.adub(aouxVar.b());
        }
        defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
        return (defpackage.adtv) adtzVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [aeeb] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v5 */
    public final java.lang.Object d(java.util.List list, java.lang.String str, defpackage.akrj akrjVar, boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        aedx aedxVar;
        ?? r10;
        defpackage.akrj akrjVar2;
        defpackage.adtz adtzVar;
        if (aolnVar instanceof aedx) {
            aedxVar = (aedx) aolnVar;
            int i = aedxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedxVar.e = i - Integer.MIN_VALUE;
            } else {
                aedxVar = new aedx((defpackage.aeeb) this, aolnVar);
            }
        } else {
            aedxVar = new aedx((defpackage.aeeb) this, aolnVar);
        }
        aedx aedxVar2 = aedxVar;
        java.lang.Object objB = aedxVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aedxVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                z = aedxVar2.a;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj = aedxVar2.b;
                akrjVar2 = aedxVar2.f;
                defpackage.aooc.af(objB);
                r10 = obj;
            }
            adtzVar = (defpackage.adtz) objB;
            if (adtzVar instanceof defpackage.adub) {
                defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                return (defpackage.adtv) adtzVar;
            }
            java.lang.Object obj2 = ((defpackage.adub) adtzVar).a;
            defpackage.aooh.e(obj2, "<get-value>(...)");
            return new defpackage.adub(new aeaa(akrjVar2, (akrl) obj2, (java.util.Map) r10));
        }
        defpackage.aooc.af(objB);
        aedxVar2.a = z;
        aedxVar2.e = 1;
        objB = b(list, str, akrjVar, z, aedxVar2);
        if (objB == aoluVar) {
            return aoluVar;
        }
        boolean z2 = z;
        defpackage.adtz adtzVar2 = (defpackage.adtz) objB;
        java.net.URL urlH = h("/v1/multiloginupdate");
        if (!(adtzVar2 instanceof defpackage.adub)) {
            defpackage.aooh.d(adtzVar2, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
            return (defpackage.adtv) adtzVar2;
        }
        defpackage.aoiu aoiuVar = (defpackage.aoiu) ((defpackage.adub) adtzVar2).a;
        defpackage.akrj akrjVar3 = (defpackage.akrj) aoiuVar.a;
        java.util.Map map = (java.util.Map) aoiuVar.b;
        akrl akrlVar = akrl.a;
        defpackage.aooh.e(akrlVar, "getDefaultInstance(...)");
        aedxVar2.f = akrjVar3;
        aedxVar2.b = map;
        aedxVar2.e = 2;
        objB = e(null, null, urlH, akrjVar3, akrlVar, z2, aedxVar2);
        if (objB == aoluVar) {
            return aoluVar;
        }
        r10 = map;
        akrjVar2 = akrjVar3;
        adtzVar = (defpackage.adtz) objB;
        if (adtzVar instanceof defpackage.adub) {
            defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
            return (defpackage.adtv) adtzVar;
        }
        java.lang.Object obj3 = ((defpackage.adub) adtzVar).a;
        defpackage.aooh.e(obj3, "<get-value>(...)");
        return new defpackage.adub(new aeaa(akrjVar2, (akrl) obj3, (java.util.Map) r10));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0138  */
    /* JADX WARN: Code duplicated, block: B:73:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:98:0x017e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v5, types: [albh] */
    public final java.lang.Object e(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, java.net.URL url, defpackage.albh albhVar, defpackage.albh albhVar2, boolean z, defpackage.aoln aolnVar) throws java.lang.Throwable {
        aedy aedyVar;
        java.lang.Object objC;
        java.lang.Object obj;
        java.lang.Object obj2;
        ?? r9;
        adxe adxeVar;
        java.lang.Integer num;
        adxf adxfVarA;
        aedk aedjVar;
        aedg aedgVarA;
        aedm aedlVar;
        int i;
        amhg amhgVar;
        if (aolnVar instanceof aedy) {
            aedyVar = (aedy) aolnVar;
            int i2 = aedyVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aedyVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aedyVar = new aedy(this, aolnVar);
            }
        } else {
            aedyVar = new aedy(this, aolnVar);
        }
        aedy aedyVar2 = aedyVar;
        java.lang.Object objD = aedyVar2.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i3 = aedyVar2.e;
        if (i3 != 0) {
            if (i3 == 1) {
                java.lang.Object obj3 = aedyVar2.b;
                java.lang.Object obj4 = aedyVar2.a;
                defpackage.aooc.af(objD);
                objC = objD;
                obj2 = obj4;
                obj = obj3;
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj5 = aedyVar2.b;
                defpackage.aooc.af(objD);
                r9 = obj5;
            }
            adxeVar = (adxe) objD;
            defpackage.aooh.c(adxeVar);
            if (adxeVar.a() != null) {
                try {
                    java.lang.Object objF = r9.N().f(adxeVar.b);
                    defpackage.aooh.d(objF, "null cannot be cast to non-null type T of com.google.android.libraries.notifications.platform.internal.rpc.impl.GnpChimeApiClientImpl.parseResponse");
                    return new defpackage.adub(objF);
                } catch (defpackage.alaz e2) {
                    return new adtw(new aedg(e2), defpackage.adty.ax);
                }
            }
            byte[] bArr = adxeVar.b;
            num = adxeVar.a;
            if (num == null && num.intValue() == 409 && bArr != null) {
                amhh amhhVarY = defpackage.alad.y(amhh.a, bArr);
                defpackage.aooh.e(amhhVarY, "parseFrom(...)");
                if (amhhVarY.d.isEmpty()) {
                    ((defpackage.aiob) a.d()).v("Got a conflict result with a status proto, but details are empty.");
                } else {
                    try {
                        amhgVar = (amhg) defpackage.alad.v(amhg.a, ((defpackage.akyp) amhhVarY.d.get(0)).c);
                    } catch (java.lang.Exception unused) {
                        amhgVar = null;
                    }
                    if (defpackage.aooh.n(amhgVar != null ? amhgVar.c : null, "notifications-pa.googleapis.com") && defpackage.aooh.n(amhgVar.b, "TOKEN_ALREADY_IN_USE")) {
                        java.lang.Throwable thA = adxeVar.a();
                        if (thA == null) {
                            throw new java.lang.IllegalArgumentException("Error is null");
                        }
                        aedlVar = new aedm(thA, defpackage.adty.au);
                    }
                }
                boolean zE = defpackage.ango.a.eZ().e();
                adxfVarA = adxeVar.a();
                if (adxfVarA == null) {
                    aedgVarA = adxeVar.a();
                    if (aedgVarA == null) {
                        aedgVarA = new aedg();
                    }
                    aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
                } else {
                    aedgVarA = adxeVar.a();
                    if (aedgVarA == null) {
                        aedgVarA = new aedg();
                    }
                    aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
                }
                return aedjVar;
            }
            boolean zE2 = defpackage.ango.a.eZ().e();
            adxfVarA = adxeVar.a();
            if (adxfVarA == null && ((adxfVarA instanceof java.net.SocketException) || (adxfVarA instanceof java.net.UnknownHostException) || (adxfVarA instanceof javax.net.ssl.SSLException) || ((adxfVarA instanceof adxf) && ((i = adxfVarA.a) == 401 || (zE2 && (i == 429 || i == 500 || i == 502 || i == 503 || i == 504)))))) {
                java.lang.Integer num2 = adxeVar.a;
                if (num2 == null || num2.intValue() != 401) {
                    aedg aedgVarA2 = adxeVar.a();
                    if (aedgVarA2 == null) {
                        aedgVarA2 = new aedg();
                    }
                    aedjVar = new aedk(aedgVarA2, defpackage.adty.aw);
                } else {
                    java.lang.Throwable thA2 = adxeVar.a();
                    if (thA2 == null) {
                        throw new java.lang.IllegalArgumentException("Error is null");
                    }
                    aedlVar = new aedl(thA2, defpackage.adty.av);
                }
            } else {
                aedgVarA = adxeVar.a();
                if (aedgVarA == null) {
                    aedgVarA = new aedg();
                }
                aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
            }
            return aedjVar;
            return aedlVar;
        }
        defpackage.aooc.af(objD);
        aedyVar2.a = accountRepresentation;
        aedyVar2.b = albhVar2;
        aedyVar2.e = 1;
        objC = c(accountRepresentation, str, url, albhVar, z, aedyVar2);
        if (objC == aoluVar) {
            obj2 = accountRepresentation;
            obj = albhVar2;
            return aoluVar;
        }
        obj2 = accountRepresentation;
        obj = albhVar2;
        defpackage.adtz adtzVar = (defpackage.adtz) objC;
        if (!(adtzVar instanceof defpackage.adub)) {
            defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
            return (defpackage.adtv) adtzVar;
        }
        defpackage.ajcq ajcqVarA = this.i.a((adxd) ((defpackage.adub) adtzVar).a);
        defpackage.aooh.e(ajcqVarA, "executeAsync(...)");
        aedyVar2.a = obj2;
        aedyVar2.b = obj;
        aedyVar2.e = 2;
        objD = defpackage.aosv.D(ajcqVarA, aedyVar2);
        if (objD == aoluVar) {
            return aoluVar;
        }
        r9 = obj;
        adxeVar = (adxe) objD;
        defpackage.aooh.c(adxeVar);
        if (adxeVar.a() != null) {
            java.lang.Object objF2 = r9.N().f(adxeVar.b);
            defpackage.aooh.d(objF2, "null cannot be cast to non-null type T of com.google.android.libraries.notifications.platform.internal.rpc.impl.GnpChimeApiClientImpl.parseResponse");
            return new defpackage.adub(objF2);
        }
        byte[] bArr2 = adxeVar.b;
        num = adxeVar.a;
        if (num == null) {
            boolean zE3 = defpackage.ango.a.eZ().e();
            adxfVarA = adxeVar.a();
            if (adxfVarA == null) {
                aedgVarA = adxeVar.a();
                if (aedgVarA == null) {
                    aedgVarA = new aedg();
                }
                aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
            } else {
                aedgVarA = adxeVar.a();
                if (aedgVarA == null) {
                    aedgVarA = new aedg();
                }
                aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
            }
            return aedjVar;
        }
        boolean zE4 = defpackage.ango.a.eZ().e();
        adxfVarA = adxeVar.a();
        if (adxfVarA == null) {
            aedgVarA = adxeVar.a();
            if (aedgVarA == null) {
                aedgVarA = new aedg();
            }
            aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
        } else {
            aedgVarA = adxeVar.a();
            if (aedgVarA == null) {
                aedgVarA = new aedg();
            }
            aedjVar = new aedj(aedgVarA, defpackage.adty.aw);
        }
        return aedjVar;
        return aedlVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [aeeb] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final java.lang.Object f(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, java.net.URL url, defpackage.albh albhVar, defpackage.albh albhVar2, defpackage.aoln aolnVar) throws java.lang.Throwable {
        aedz aedzVar;
        ?? r1;
        java.lang.String str2;
        defpackage.albh albhVar3;
        defpackage.albh albhVar4;
        if (aolnVar instanceof aedz) {
            aedzVar = (aedz) aolnVar;
            int i = aedzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedzVar.d = i - Integer.MIN_VALUE;
            } else {
                aedzVar = new aedz((defpackage.aeeb) this, aolnVar);
            }
        } else {
            aedzVar = new aedz((defpackage.aeeb) this, aolnVar);
        }
        aedz aedzVar2 = aedzVar;
        java.lang.Object obj = aedzVar2.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aedzVar2.d;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            aedzVar2.a = accountRepresentation;
            aedzVar2.e = str;
            aedzVar2.f = url;
            aedzVar2.g = (akrm) albhVar;
            aedzVar2.h = (akrn) albhVar2;
            aedzVar2.d = 1;
            java.lang.Object objE = e(accountRepresentation, str, url, albhVar, albhVar2, false, aedzVar2);
            if (objE != aoluVar) {
                r1 = accountRepresentation;
                str2 = str;
                albhVar3 = albhVar;
                albhVar4 = albhVar2;
                obj = objE;
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
            return obj;
        }
        defpackage.albh albhVar5 = aedzVar2.h;
        defpackage.albh albhVar6 = aedzVar2.g;
        url = aedzVar2.f;
        java.lang.String str3 = aedzVar2.e;
        java.lang.Object obj2 = aedzVar2.a;
        defpackage.aooc.af(obj);
        str2 = str3;
        r1 = obj2;
        albhVar4 = albhVar5;
        albhVar3 = albhVar6;
        java.net.URL url2 = url;
        defpackage.adtz adtzVar = (defpackage.adtz) obj;
        if (!(adtzVar instanceof aedl)) {
            return adtzVar;
        }
        aedzVar2.a = null;
        aedzVar2.e = null;
        aedzVar2.f = null;
        aedzVar2.g = null;
        aedzVar2.h = null;
        aedzVar2.d = 2;
        java.lang.Object objE2 = e(r1, str2, url2, albhVar3, albhVar4, true, aedzVar2);
        if (objE2 != aoluVar) {
            return objE2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.libraries.notifications.platform.registration.AccountRepresentation] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final java.lang.Object g(java.lang.String str, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, boolean z, defpackage.aoln aolnVar) {
        aeea aeeaVar;
        java.lang.Object obj;
        defpackage.adtz adtzVar;
        ?? r7;
        aedi aedhVar;
        java.lang.Object obj2;
        if (aolnVar instanceof aeea) {
            aeeaVar = (aeea) aolnVar;
            int i = aeeaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aeeaVar.d = i - Integer.MIN_VALUE;
            } else {
                aeeaVar = new aeea(this, aolnVar);
            }
        } else {
            aeeaVar = new aeea(this, aolnVar);
        }
        java.lang.Object objB = aeeaVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aeeaVar.d;
        if (i2 == 0) {
            defpackage.aooc.af(objB);
            defpackage.adym adymVar = this.l;
            if (z) {
                aeeaVar.a = accountRepresentation;
                aeeaVar.d = 1;
                objB = adymVar.d(str, aeeaVar);
                if (objB == aoluVar) {
                    obj = accountRepresentation;
                    return aoluVar;
                }
                obj = accountRepresentation;
                adtzVar = (defpackage.adtz) objB;
                r7 = obj;
            } else {
                aeeaVar.a = accountRepresentation;
                aeeaVar.d = 2;
                objB = adymVar.b(str, "oauth2:https://www.googleapis.com/auth/notifications", aeeaVar);
                if (objB == aoluVar) {
                    obj2 = accountRepresentation;
                    return aoluVar;
                }
                obj2 = accountRepresentation;
                adtzVar = (defpackage.adtz) objB;
                r7 = obj2;
            }
        } else if (i2 == 1) {
            java.lang.Object obj3 = aeeaVar.a;
            defpackage.aooc.af(objB);
            obj = obj3;
            obj = accountRepresentation;
            adtzVar = (defpackage.adtz) objB;
            r7 = obj;
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj4 = aeeaVar.a;
            defpackage.aooc.af(objB);
            obj2 = obj4;
            obj2 = accountRepresentation;
            adtzVar = (defpackage.adtz) objB;
            r7 = obj2;
        }
        defpackage.adtz adtzVar2 = adtzVar;
        j$.util.Objects.checkIndex(0, 4);
        if (adtzVar2 == null) {
            return adtzVar2;
        }
        if (adtzVar2 instanceof adyl) {
            adyl adylVar = (adyl) adtzVar2;
            aedhVar = new aedi(adylVar.a, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) r7, adylVar.b);
        } else if (adtzVar2 instanceof adyj) {
            adyj adyjVar = (adyj) adtzVar2;
            aedhVar = new aedh(adyjVar.a, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) r7, adyjVar.b);
        } else {
            if (!(adtzVar2 instanceof adyk)) {
                return adtzVar2;
            }
            adyk adykVar = (adyk) adtzVar2;
            aedhVar = new aedh(adykVar.a, (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) r7, adykVar.b);
        }
        return aedhVar;
    }

    public final java.net.URL h(java.lang.String str) {
        return new java.net.URL(this.k.concat(str));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoux aouxVar, com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.lang.String str, boolean z, defpackage.aoln aolnVar) {
        aedv aedvVar;
        defpackage.adtz adtzVar;
        defpackage.adtz adtzVar2;
        int iR;
        if (aolnVar instanceof aedv) {
            aedvVar = (aedv) aolnVar;
            int i = aedvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aedvVar.c = i - Integer.MIN_VALUE;
            } else {
                aedvVar = new aedv(this, aolnVar);
            }
        } else {
            aedvVar = new aedv(this, aolnVar);
        }
        java.lang.Object objC = aedvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aedvVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.YouTubeVisitor) {
                return new adtw(new java.lang.UnsupportedOperationException("YouTube visitor isn't supported for this operation"), defpackage.adty.V);
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.DelegatedGaia) {
                return new adtw(new java.lang.UnsupportedOperationException("Delegated Gaia isn't supported for this operation"), defpackage.adty.V);
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Fitbit) {
                return new adtw(new java.lang.UnsupportedOperationException("Fitbit isn't supported for this operation"), defpackage.adty.V);
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                java.lang.String str2 = ((com.google.android.libraries.notifications.platform.registration.Gaia) accountRepresentation).a;
                if (str2.length() > 0) {
                    aedvVar.d = aouxVar;
                    aedvVar.c = 1;
                    objC = g(str2, accountRepresentation, z, aedvVar);
                    if (objC == aoluVar) {
                        return aoluVar;
                    }
                    adtzVar = (defpackage.adtz) objC;
                    if (adtzVar instanceof defpackage.adub) {
                        defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                        return (defpackage.adtv) adtzVar;
                    }
                    defpackage.adxc adxcVar = g;
                    java.lang.Object obj = ((defpackage.adub) adtzVar).a;
                    java.util.Objects.toString(obj);
                    aouxVar.d(adxcVar, "Bearer ".concat(java.lang.String.valueOf(obj)));
                    return new defpackage.adub(defpackage.aojh.a);
                }
            }
            if (accountRepresentation instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                if (str == null) {
                    return new adtx(new java.lang.IllegalArgumentException("Zwieback ID must not be null when syncing Zwieback"), defpackage.adty.ar);
                }
                aouxVar.d(h, "NID=".concat(str));
            }
            if (angi.a.b().b()) {
                java.lang.String str3 = this.j.f;
                if (str3 == null || str3.length() == 0) {
                    return new adtw(new java.lang.IllegalStateException("One of Account Name, Zwieback or API Key must be set."), defpackage.adty.V);
                }
                aouxVar.d(c, str3);
                java.lang.String str4 = this.n;
                if (str4 != null && str4.length() != 0) {
                    aouxVar.d(f, this.m.getPackageName());
                    aouxVar.d(e, str4);
                }
            } else {
                defpackage.adym adymVar = this.l;
                aedvVar.d = aouxVar;
                aedvVar.c = 2;
                objC = adymVar.c(aedvVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                adtzVar2 = (defpackage.adtz) objC;
                iR = defpackage.anty.R(adtzVar2);
                if (iR != 0) {
                    if (iR == 1) {
                        return defpackage.agab.bW((defpackage.adtv) adtzVar2);
                    }
                    throw new defpackage.aois();
                }
                aouxVar.d(d, (java.lang.String) ((defpackage.adub) adtzVar2).a);
            }
        } else {
            if (i2 == 1) {
                aouxVar = aedvVar.d;
                defpackage.aooc.af(objC);
                adtzVar = (defpackage.adtz) objC;
                if (adtzVar instanceof defpackage.adub) {
                    defpackage.aooh.d(adtzVar, "null cannot be cast to non-null type com.google.android.libraries.notifications.platform.Failure");
                    return (defpackage.adtv) adtzVar;
                }
                defpackage.adxc adxcVar2 = g;
                java.lang.Object obj2 = ((defpackage.adub) adtzVar).a;
                java.util.Objects.toString(obj2);
                aouxVar.d(adxcVar2, "Bearer ".concat(java.lang.String.valueOf(obj2)));
                return new defpackage.adub(defpackage.aojh.a);
            }
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aouxVar = aedvVar.d;
            defpackage.aooc.af(objC);
            adtzVar2 = (defpackage.adtz) objC;
            iR = defpackage.anty.R(adtzVar2);
            if (iR != 0) {
                if (iR == 1) {
                    return defpackage.agab.bW((defpackage.adtv) adtzVar2);
                }
                throw new defpackage.aois();
            }
            aouxVar.d(d, (java.lang.String) ((defpackage.adub) adtzVar2).a);
        }
        return new defpackage.adub(defpackage.aojh.a);
    }
}
