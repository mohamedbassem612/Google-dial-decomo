package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qza implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ qza(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v48, types: [ccp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v63, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v75, types: [aonj, java.lang.Object] */
    public final java.lang.Object a() {
        defpackage.thj thjVar;
        aozj aozjVar;
        java.lang.Object objC;
        defpackage.tgx tgxVar;
        switch (this.$cid) {
            case 0:
                ((defpackage.qyz) this.a).b.a(this.b);
                return aojh.a;
            case 1:
                ((defpackage.qyz) this.a).b.a(this.b);
                return aojh.a;
            case 2:
                java.lang.Object obj = this.a;
                ahpz ahpzVar = ((defpackage.qzk) obj).g;
                java.lang.Object obj2 = this.b;
                ahok ahokVarF = ahpzVar.f(680, "MoreMenuFragmentPeer_onCloseButtonClicked");
                try {
                    j$.util.Optional optionalE = ((defpackage.qzk) obj).i.e(((defpackage.qze) obj2).a);
                    aooh.e(optionalE, "get(...)");
                    defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalE);
                    defpackage.qzh qzhVar = apqrVar != null ? (defpackage.qzh) apqrVar.a(defpackage.qzh.class) : null;
                    her herVarLx = qzhVar != null ? qzhVar.lx() : null;
                    if (herVarLx != null) {
                        ((defpackage.rap) herVarLx.a).d();
                        break;
                    }
                    ajsz.ak(ahokVarF, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahokVarF, th);
                        throw th2;
                    }
                }
            case 3:
                pez.bW(((defpackage.qzb) this.b).e, new defpackage.qzj(this.a, 0));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                defpackage.qug qugVarB = defpackage.qug.b(((defpackage.qtw) this.b).c);
                if (qugVarB == null) {
                    qugVarB = defpackage.qug.BUTTON_UNKNOWN;
                }
                ((defpackage.rdk) this.a).j(qugVarB);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj3 = this.a;
                ((rsq) obj3).d.aF((android.view.View) this.b, new defpackage.qsu(obj3, 17));
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.ryq) this.b).c.a(this.a);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.saa.a.b().l("com/android/dialer/patrick/impl/background/PatrickCallBackgroundProvider", "loadCallingCardBackground$<anonymous>$<anonymous>", 101, "PatrickCallBackgroundProvider.kt").v("Timeout loading CallingCard background");
                java.lang.Object obj4 = this.a;
                if (obj4 != null) {
                    ((defpackage.saa) this.b).e((aeun) obj4, rub.d);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                j$.util.Optional optionalA = ((defpackage.sdw) this.b).b.a();
                aooh.e(optionalA, "startLocalTimer(...)");
                ((aoot) this.a).a = aooh.q(optionalA);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aeun aeunVar = (aeun) ((aoot) this.a).a;
                if (aeunVar != null) {
                    ((defpackage.sdw) this.b).e(aeunVar, rub.b);
                }
                defpackage.sdw.a.b().l("com/android/dialer/patrick/impl/service/CallingCardCallScopedDataService", "loadCallingCardCacheResult$<anonymous>$<anonymous>", 162, "CallingCardCallScopedDataService.kt").v("CallingCard data computation completed successfully");
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aeun aeunVar2 = (aeun) ((aoot) this.a).a;
                if (aeunVar2 != null) {
                    ((defpackage.sdw) this.b).e(aeunVar2, rub.c);
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.sle sleVar = (defpackage.sle) this.a;
                sleVar.i.o(rmx.yy);
                android.accounts.Account accountE = sleVar.K.e();
                if (accountE != null) {
                    java.lang.Object obj5 = this.b;
                    android.content.Intent intent = new android.content.Intent((android.content.Context) sleVar.N.a, (java.lang.Class<?>) com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity.class);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("com.google.profile.photopicker.ACCOUNT", accountE);
                    intent.putExtra("com.google.profile.photopicker.HOST_SURFACE", 26);
                    intent.putExtras(bundle);
                    ((ok) obj5).b(intent);
                } else {
                    defpackage.sle.a.b().l("com/android/dialer/patrick/onboarding/ui/OnboardingFlowFragmentPeer", "onCreateView$<anonymous>$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 381, "OnboardingFlowFragmentPeer.kt").v("account missing for google photos");
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                this.a.a(this.b);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.util.List list = defpackage.sme.a;
                ?? r0 = this.b;
                defpackage.smv smvVar = new defpackage.smv(((defpackage.abjl) r0.a()).b, ((defpackage.abjl) r0.a()).c, ((defpackage.abjl) r0.a()).d);
                defpackage.smu smuVar = (defpackage.smu) this.a;
                smuVar.j.a(smvVar);
                smuVar.c.a();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj6 = this.a;
                java.lang.Object obj7 = this.b;
                java.util.List list2 = defpackage.sme.a;
                defpackage.skf skfVar = (defpackage.skf) obj7;
                if (skfVar.h) {
                    defpackage.sme.i(skfVar, (defpackage.smu) obj6);
                } else if (skfVar.c) {
                    ((defpackage.smu) obj6).b.a();
                } else {
                    ((defpackage.smu) obj6).a.a();
                }
                return aojh.a;
            case 15:
                java.util.List list3 = defpackage.sme.a;
                this.a.a(this.b);
                return aojh.a;
            case 16:
                defpackage.sme.i((defpackage.skf) this.b, (defpackage.smu) this.a);
                return aojh.a;
            case 17:
                ((defpackage.smu) this.a).d.a(new defpackage.smr(((defpackage.skf) this.b).a + 1));
                return aojh.a;
            case 18:
                break;
            case 19:
                aihd aihdVarE = ((zzx) this.a).e();
                aooh.e(aihdVarE, "get(...)");
                java.util.List listBX = ajsz.bX(aihdVarE, new defpackage.qxq(11));
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBX, 10));
                java.util.Iterator it = listBX.iterator();
                while (it.hasNext()) {
                    java.lang.Object obj8 = this.b;
                    aopu aopuVar = ((defpackage.teu) it.next()).b().b;
                    defpackage.tel telVar = (defpackage.tel) ((defpackage.thj) obj8).c.f.get(aopuVar);
                    defpackage.tek tekVarA = telVar != null ? telVar.a() : null;
                    if (tekVarA == null) {
                        throw new java.lang.IllegalStateException("No bound SearchDataSource found for business model type: ".concat(java.lang.String.valueOf(aopuVar.b())));
                    }
                    arrayList.add(tekVarA);
                }
                return ajsz.cf(arrayList);
            default:
                java.lang.Object obj9 = this.a;
                ahpz ahpzVar2 = ((defpackage.ubw) obj9).f;
                java.lang.Object obj10 = this.b;
                ahok ahokVarF2 = ahpzVar2.f(904, "SonicGridFragmentPeer_handleOnClick");
                try {
                    defpackage.tzx tzxVarA = ((defpackage.ubw) obj9).a();
                    if (tzxVarA != null) {
                        tzxVarA.c((defpackage.uab) obj10);
                        break;
                    }
                    ajsz.ak(ahokVarF2, (java.lang.Throwable) null);
                    return aojh.a;
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(ahokVarF2, th3);
                        throw th4;
                    }
                }
        }
        do {
            thjVar = (defpackage.thj) this.b;
            aozjVar = thjVar.l;
            objC = aozjVar.c();
            defpackage.tgx tgxVar2 = (defpackage.tgx) objC;
            java.lang.String str = tgxVar2 != null ? tgxVar2.a : null;
            java.lang.Object obj11 = this.a;
            if (str != null && aooh.n(str, obj11)) {
                obj11 = null;
            }
            tgxVar = obj11 != null ? new defpackage.tgx((java.lang.String) obj11) : null;
        } while (!aozjVar.f(objC, tgxVar));
        java.lang.String str2 = tgxVar != null ? tgxVar.a : null;
        if (str2 != null) {
            aoov.an(thjVar.d, (aolr) null, 0, new defpackage.tkz(thjVar, str2, (aoln) null, 1), 3);
        }
        return aojh.a;
    }

    public /* synthetic */ qza(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
