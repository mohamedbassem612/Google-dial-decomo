package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rrj implements ahtl {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public rrj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r10v85, types: [android.content.Context, com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity] */
    public final /* synthetic */ defpackage.ahtm a(ahth ahthVar) {
        java.lang.Class<?> cls;
        java.lang.Class<?> cls2;
        int i = 1;
        java.lang.String simpleName = null;
        switch (this.$cid) {
            case 0:
                aooh.f((defpackage.tjr) ahthVar, "event");
                mla mlaVarA = ((defpackage.rri) this.a).a();
                if (mlaVarA != null) {
                    mli mliVarR = mlaVarA.r();
                    mliVarR.a();
                    mliVarR.d();
                }
                return new defpackage.ahtm(new rqs());
            case 1:
                aooh.f((defpackage.rrg) ahthVar, "event");
                defpackage.rri rriVar = (defpackage.rri) this.a;
                rriVar.g.o(rmx.jQ);
                mla mlaVarA2 = rriVar.a();
                if (mlaVarA2 != null) {
                    mlaVarA2.r().a();
                    mlaVarA2.r().h(defpackage.rri.a);
                }
                return new defpackage.ahtm(rqr.a);
            case 2:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                java.lang.String str = ((defpackage.rxo) this.a).h;
                if (str == null) {
                    aooh.j("onClickHandler");
                } else {
                    simpleName = str;
                }
                return (defpackage.ahtm) simpleName.a();
            case 3:
                aooh.f((defpackage.ahtd) ahthVar, "event");
                ((defpackage.sgh) ((defpackage.sgi) this.a).a).f();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addFlags(268435456);
                defpackage.sgh sghVar = (defpackage.sgh) ((defpackage.sgi) this.a).a;
                intent.setData(android.net.Uri.parse("package:".concat(java.lang.String.valueOf(sghVar.A().getPackageName()))));
                ahqx.l(sghVar.A(), intent);
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.tyr tyrVar = (defpackage.tyr) ahthVar;
                aooh.f(tyrVar, "buttonEvent");
                defpackage.tyv tyvVarB = defpackage.tyv.b(tyrVar.a().d);
                if (tyvVarB == null) {
                    tyvVarB = defpackage.tyv.UNRECOGNIZED;
                }
                java.lang.Object obj = this.a;
                int iOrdinal = tyvVarB.ordinal();
                if (iOrdinal == 1) {
                    akff akffVarA = akff.a(tyrVar.a().c);
                    defpackage.tsq tsqVar = (defpackage.tsq) obj;
                    apni apniVar = tsqVar.o;
                    tsg tsgVar = tsqVar.e;
                    apniVar.i(aoov.am(tsgVar.b, 0, new defpackage.tkz(tsgVar, akffVarA, (aoln) null, 9), 3));
                } else if (iOrdinal != 6) {
                    defpackage.tsq.a.d().l("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer", "onSodaStatusBannerClick", 222, "SharpieSettingsFragmentPeer.kt").v("Click on un-clickable Soda Status Banner");
                } else {
                    defpackage.tsq tsqVar2 = (defpackage.tsq) obj;
                    ahqx.l(tsqVar2.c, tsqVar2.m.a());
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aooh.f((defpackage.ubp) ahthVar, "event");
                defpackage.ubw ubwVar = (defpackage.ubw) this.a;
                defpackage.tzx tzxVarA = ubwVar.a();
                if (tzxVarA == null) {
                    defpackage.ubw.a.d().l("com/android/dialer/sonic/impl/ui/SonicGridFragmentPeer", "onSonicGridCloseEvent", 210, "SonicGridFragmentPeer.kt").v("Unable to get Sonic Controller");
                    return defpackage.ahtm.a;
                }
                defpackage.qbe qbeVarC = ubwVar.c();
                if (qbeVarC != null) {
                    qbeVarC.a(qbc.hM);
                }
                tzxVarA.a();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.uck uckVar = (defpackage.uck) ahthVar;
                aooh.f(uckVar, "event");
                defpackage.tzx tzxVarA2 = ((defpackage.ubw) this.a).a();
                if (tzxVarA2 == null) {
                    defpackage.ubw.a.d().l("com/android/dialer/sonic/impl/ui/SonicGridFragmentPeer", "onSonicGridItemClickEvent", 194, "SonicGridFragmentPeer.kt").v("SonicController does not exist");
                    return defpackage.ahtm.a;
                }
                tzxVarA2.c(uckVar.a());
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aooh.f((defpackage.umb) ahthVar, "event");
                ((defpackage.ulq) this.a).b.finish();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.ulv ulvVar = (defpackage.ulv) ahthVar;
                aooh.f(ulvVar, "event");
                defpackage.uls ulsVar = ulvVar.a;
                int iOrdinal2 = ulsVar.ordinal();
                java.lang.Object obj2 = this.a;
                if (iOrdinal2 == 0) {
                    ((defpackage.umd) obj2).b(rmw.x);
                } else {
                    if (iOrdinal2 != 1) {
                        java.util.Objects.toString(ulsVar);
                        throw new java.lang.IllegalStateException("DismissDialogEvent unsupported for type: ".concat(java.lang.String.valueOf(ulsVar)));
                    }
                    ((defpackage.umd) obj2).b(rmw.y);
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aooh.f((defpackage.ahtd) ahthVar, "event");
                defpackage.umd umdVar = (defpackage.umd) this.a;
                int iBD = wsc.bD(umdVar.g);
                if (iBD == 0) {
                    umdVar.a();
                } else {
                    if (iBD != 1) {
                        defpackage.uks uksVar = umdVar.g;
                        if (uksVar != null && (cls = uksVar.getClass()) != null) {
                            simpleName = cls.getSimpleName();
                        }
                        throw new java.lang.IllegalStateException("OnNegativeButtonClickEvent unsupported for model: ".concat(java.lang.String.valueOf(simpleName)));
                    }
                    aimz aimzVar = zih.a;
                    aoov.al(umdVar.c, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, umdVar, 5, (char[]) null));
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aooh.f((defpackage.ahtf) ahthVar, "event");
                defpackage.umd umdVar2 = (defpackage.umd) this.a;
                int iBD2 = wsc.bD(umdVar2.g);
                if (iBD2 == 0) {
                    defpackage.umd.a.b().l("com/android/dialer/spamnotification/impl/ui/SpamNotificationFragmentPeer", "handleAddToContactsButtonClick", 227, "SpamNotificationFragmentPeer.kt").v("enter");
                    defpackage.uku ukuVar = umdVar2.b.d;
                    if (ukuVar == null) {
                        ukuVar = defpackage.uku.a;
                    }
                    java.lang.String str2 = ukuVar.c;
                    aooh.e(str2, "getRawNumber(...)");
                    umdVar2.d(str2);
                } else {
                    if (iBD2 != 1) {
                        defpackage.uks uksVar2 = umdVar2.g;
                        if (uksVar2 != null && (cls2 = uksVar2.getClass()) != null) {
                            simpleName = cls2.getSimpleName();
                        }
                        throw new java.lang.IllegalStateException("OnPositiveButtonClickEvent unsupported for model: ".concat(java.lang.String.valueOf(simpleName)));
                    }
                    umdVar2.a();
                }
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                ((defpackage.usp) ((defpackage.uss) this.a).b).f();
                return defpackage.ahtm.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                defpackage.uss ussVar = (defpackage.uss) this.a;
                ussVar.f.x(((akzx) ussVar.e).p());
                ((defpackage.usp) ussVar.b).f();
                agsm.i(941, ((defpackage.usj) ussVar.d).d(((defpackage.urz) ussVar.a).h), "failed to update survey status", new java.lang.Object[0]);
                return new defpackage.ahtm(new defpackage.uta());
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.usy) this.a).a();
                return defpackage.ahtm.a;
            case 15:
                com.android.dialer.transcriptaudiofeedback.impl.FeedbackConsentActivity feedbackConsentActivity = ((defpackage.uvg) this.a).b;
                feedbackConsentActivity.finish();
                feedbackConsentActivity.overridePendingTransition(0, 0);
                return defpackage.ahtm.a;
            case 16:
                defpackage.uvg uvgVar = (defpackage.uvg) this.a;
                ?? r10 = uvgVar.b;
                ahqx.l((android.content.Context) r10, defpackage.uvd.a(r10, uvgVar.c));
                r10.finish();
                return defpackage.ahtm.a;
            case 17:
                ((defpackage.uvo) this.a).c.H().findViewById(2131428248).setElevation(4.0f);
                return defpackage.ahtm.a;
            case 18:
                ((defpackage.uvo) this.a).b();
                return defpackage.ahtm.a;
            case 19:
                defpackage.uwc uwcVar = (defpackage.uwc) this.a;
                java.lang.String str3 = uwcVar.d.e;
                defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserPressedCancelButton", 67, "FeedbackMetricsLogger.java").v("logging user pressed feedback cancel button");
                uwcVar.c.b(str3, new defpackage.uwm(i));
                uwcVar.a();
                return new defpackage.ahtm(new defpackage.uwa());
            default:
                defpackage.uwc uwcVar2 = (defpackage.uwc) this.a;
                java.lang.String str4 = uwcVar2.d.e;
                defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserPressedContinueButton", 83, "FeedbackMetricsLogger.java").v("logging user pressed feedback continue button");
                uwcVar2.c.b(str4, new lct(20));
                return new defpackage.ahtm(new defpackage.uwb());
        }
    }
}
