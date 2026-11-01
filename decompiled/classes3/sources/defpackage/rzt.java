package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class rzt implements aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ rzt(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        defpackage.pmp pmpVarM;
        defpackage.abxp abxpVarE;
        defpackage.abxs abxsVarG;
        java.lang.String str;
        switch (this.$cid) {
            case 0:
                defpackage.apqr apqrVar = (defpackage.apqr) obj;
                aooh.f(apqrVar, "primaryCallScope");
                ((defpackage.rzu) this.a).b.i((java.lang.String) apqrVar.b).a(mcd.be);
                return aojh.a;
            case 1:
                akzx akzxVar = (akzx) obj;
                aooh.f(akzxVar, "builder");
                akzxVar.z((alad) this.a);
                return aojh.a;
            case 2:
                ((aoot) this.a).a = (defpackage.pdv) obj;
                return aojh.a;
            case 3:
                ((aoot) this.a).a = (defpackage.pmp) obj;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.abxt abxtVar = (defpackage.abxt) obj;
                if (abxtVar == null || (pmpVarM = defpackage.sbe.f(abxtVar)) == null) {
                    pmpVarM = pez.ah(defpackage.pmp.a.m()).m();
                }
                ((aoot) this.a).a = pmpVarM;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                gin ginVarA = ((gjh) obj).a("SELECT * FROM white_pages_data WHERE accountName = ?");
                try {
                    ginVarA.j(1, (java.lang.String) this.a);
                    int iS = dzk.S(ginVarA, "accountName");
                    int iS2 = dzk.S(ginVarA, "accountE164PhoneNumber");
                    int iS3 = dzk.S(ginVarA, "verificationStatus");
                    int iS4 = dzk.S(ginVarA, "timestamp");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    while (ginVarA.m()) {
                        java.lang.String strE = ginVarA.e(iS);
                        java.lang.String strE2 = ginVarA.e(iS2);
                        defpackage.scx scxVarL = ttj.L(ginVarA.l(iS3) ? null : ginVarA.e(iS3));
                        if (scxVarL == null) {
                            throw new java.lang.IllegalStateException("Expected NON-NULL 'com.android.dialer.patrick.impl.security.VerificationStatus', but it was NULL.");
                        }
                        j$.time.Instant instantM = ttj.M(ginVarA.l(iS4) ? null : java.lang.Long.valueOf(ginVarA.c(iS4)));
                        if (instantM == null) {
                            throw new java.lang.IllegalStateException("Expected NON-NULL 'java.time.Instant', but it was NULL.");
                        }
                        arrayList.add(new defpackage.sdl(strE, strE2, scxVarL, instantM));
                    }
                    ginVarA.close();
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    ginVarA.close();
                    throw th;
                }
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.abxt abxtVar2 = (defpackage.abxt) obj;
                if (abxtVar2 != null && (abxpVarE = defpackage.abxl.e(abxtVar2)) != null && (abxsVarG = defpackage.abxl.g(abxpVarE)) != null && (str = abxsVarG.f) != null && str.length() != 0) {
                    java.lang.Object obj2 = this.a;
                    j$.util.Optional optionalOf = j$.util.Optional.of(defpackage.pdw.BACKGROUND_PATRICK);
                    aooh.e(optionalOf, "of(...)");
                    ((aoot) obj2).a = optionalOf;
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                ((aoot) this.a).a = optionalEmpty;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.abxt abxtVar3 = (defpackage.abxt) obj;
                if (abxtVar3 != null && (abxtVar3.b & 2) != 0) {
                    java.lang.Object obj3 = this.a;
                    j$.util.Optional optionalOf2 = j$.util.Optional.of(defpackage.pmq.DISPLAY_NAME_PATRICK);
                    aooh.e(optionalOf2, "of(...)");
                    ((aoot) obj3).a = optionalOf2;
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                j$.util.Optional optionalEmpty2 = j$.util.Optional.empty();
                aooh.e(optionalEmpty2, "empty(...)");
                ((aoot) this.a).a = optionalEmpty2;
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.scy scyVar = (defpackage.scy) obj;
                java.lang.String str2 = scyVar.a;
                java.lang.Object obj4 = this.a;
                defpackage.scx[] scxVarArr = defpackage.she.a;
                return java.lang.Boolean.valueOf(aooh.n(str2, obj4) && ajsz.cY(defpackage.she.a, scyVar.b));
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.skp skpVar = (defpackage.skp) obj;
                aooh.f(skpVar, "uiModel");
                defpackage.rze rzeVarI = snl.i(skpVar.p());
                defpackage.abxs abxsVar = (defpackage.abxs) this.a;
                java.lang.String str3 = abxsVar.f;
                aooh.e(str3, "getImageUri(...)");
                rzeVarI.c(str3);
                java.lang.String str4 = abxsVar.g;
                aooh.e(str4, "getPhotoToken(...)");
                aooh.f(str4, "value");
                akzx akzxVar2 = (akzx) rzeVarI.a;
                akzxVar2.u();
                defpackage.skp skpVar2 = (defpackage.skp) akzxVar2.b;
                j$.util.Objects.requireNonNull(str4);
                skpVar2.b |= 131072;
                skpVar2.r = str4;
                rzeVarI.g(abxsVar.c);
                rzeVarI.e(abxsVar.d);
                rzeVarI.f(abxsVar.e);
                return rzeVarI.b();
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.skp skpVar3 = (defpackage.skp) obj;
                aooh.f(skpVar3, "uiModel");
                defpackage.rze rzeVarI2 = snl.i(skpVar3.p());
                java.lang.Object obj5 = this.a;
                aooh.f(obj5, "value");
                akzx akzxVar3 = (akzx) rzeVarI2.a;
                akzxVar3.u();
                defpackage.skp skpVar4 = (defpackage.skp) akzxVar3.b;
                j$.util.Objects.requireNonNull(obj5);
                skpVar4.f = (defpackage.sko) obj5;
                skpVar4.b |= 8;
                return rzeVarI2.b();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.skp skpVar5 = (defpackage.skp) obj;
                aooh.f(skpVar5, "uiModel");
                defpackage.rze rzeVarI3 = snl.i(skpVar5.p());
                java.lang.Object obj6 = this.a;
                aooh.f(obj6, "value");
                akzx akzxVar4 = (akzx) rzeVarI3.a;
                akzxVar4.u();
                defpackage.skp skpVar6 = (defpackage.skp) akzxVar4.b;
                j$.util.Objects.requireNonNull(obj6);
                skpVar6.q = (defpackage.sko) obj6;
                skpVar6.b |= 65536;
                return rzeVarI3.b();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.skp skpVar7 = (defpackage.skp) obj;
                aooh.f(skpVar7, "uiModel");
                akzx akzxVarP = skpVar7.p();
                akzxVarP.u();
                defpackage.skp skpVar8 = (defpackage.skp) akzxVarP.b;
                java.lang.Object obj7 = this.a;
                j$.util.Objects.requireNonNull(obj7);
                skpVar8.b |= 16;
                skpVar8.g = (java.lang.String) obj7;
                alad aladVarP = akzxVarP.p();
                aooh.e(aladVarP, "build(...)");
                return (defpackage.skp) aladVarP;
            case 15:
                defpackage.skp skpVar9 = (defpackage.skp) obj;
                aooh.f(skpVar9, "uiModel");
                akzx akzxVarP2 = skpVar9.p();
                akzxVarP2.u();
                defpackage.skp skpVar10 = (defpackage.skp) akzxVarP2.b;
                java.lang.Object obj8 = this.a;
                j$.util.Objects.requireNonNull(obj8);
                skpVar10.e = (defpackage.amml) obj8;
                skpVar10.b |= 4;
                alad aladVarP2 = akzxVarP2.p();
                aooh.e(aladVarP2, "build(...)");
                return (defpackage.skp) aladVarP2;
            case 16:
                defpackage.sms smsVar = (defpackage.sms) obj;
                aooh.f(smsVar, "it");
                defpackage.sle sleVar = (defpackage.sle) this.a;
                sleVar.i.o(rmx.yv);
                long j = smsVar.a;
                defpackage.uhp uhpVar = sleVar.K;
                uhpVar.o(j);
                uhpVar.z(new skg(smsVar.b, 4));
                uhpVar.v(j);
                return aojh.a;
            case 17:
                defpackage.smt smtVar = (defpackage.smt) obj;
                aooh.f(smtVar, "it");
                defpackage.sle sleVar2 = (defpackage.sle) this.a;
                defpackage.uhp uhpVar2 = sleVar2.K;
                uhpVar2.t(false);
                uhpVar2.x(false);
                sleVar2.i.o(rmx.yu);
                defpackage.sjz sjzVar = smtVar.a;
                if (sjzVar == null) {
                    uhpVar2.z(new defpackage.sdi(3));
                } else {
                    defpackage.sko skoVar = sjzVar.c;
                    uhpVar2.q(skoVar.c, skoVar.d, skoVar.e, skoVar.f, skoVar.g);
                }
                return aojh.a;
            case 18:
                defpackage.smv smvVar = (defpackage.smv) obj;
                aooh.f(smvVar, "it");
                float f = smvVar.a;
                float f2 = smvVar.b;
                float f3 = smvVar.c;
                defpackage.uhp uhpVar3 = ((defpackage.sle) this.a).K;
                uhpVar3.s(f, f2, f3);
                uhpVar3.w(false);
                return aojh.a;
            case 19:
                akzx akzxVar5 = (akzx) obj;
                aimz aimzVar = defpackage.sle.a;
                aooh.f(akzxVar5, "builder");
                akzxVar5.z((alad) this.a);
                return aojh.a;
            default:
                java.lang.Float f4 = (java.lang.Float) obj;
                f4.floatValue();
                ((defpackage.sle) this.a).K.n(f4, null, null);
                return aojh.a;
        }
    }
}
