package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class addr implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ addr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [aomy, java.lang.Object] */
    public final java.lang.Object a() {
        java.lang.Object aghdVar;
        boolean z = true;
        boolean z2 = false;
        java.lang.Object[] objArr = 0;
        switch (this.$cid) {
            case 0:
                defpackage.addc addcVar = (defpackage.addc) this.a;
                aghdVar = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) addcVar.d.a();
                if (aghdVar == null) {
                    return defpackage.adei.m(addcVar.b);
                }
                break;
            case 1:
                java.lang.Object obj = this.a;
                aghdVar = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) ((defpackage.adda) obj).c.a();
                if (aghdVar == null) {
                    return defpackage.adei.m(((defpackage.addq) obj).d);
                }
                break;
            case 2:
                try {
                    android.content.pm.PackageInfo packageInfo = ((defpackage.adyc) this.a).b.getPackageManager().getPackageInfo("com.android.chrome", 0);
                    android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                    if (applicationInfo != null && applicationInfo.enabled) {
                        if (ft$.ExternalSyntheticApiModelOutline0.m(packageInfo) < 705100000) {
                        }
                        return java.lang.Boolean.valueOf(z);
                    }
                    defpackage.adyc.a.d().v("Chrome is disabled");
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    hgb.b(defpackage.adyc.a.d(), "Chrome is not installed", e);
                } catch (java.lang.Exception e2) {
                    defpackage.adyc.a.d().k(e2).y("getPackageInfo(%s) failed", "com.android.chrome");
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 3:
                return defpackage.aeih.a(new defpackage.aeia(), ((android.content.res.Resources) ((aeic) this.a).b).getString(2132019591));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                final aeic aeicVar = (aeic) this.a;
                final java.lang.Object[] objArr2 = objArr == true ? 1 : 0;
                return defpackage.aeih.a(new defpackage.aeip() { // from class: aeib
                    @Override // defpackage.aeip
                    public final defpackage.aeio a(defpackage.aprf aprfVar) {
                        int i = objArr2;
                        aeic aeicVar2 = aeicVar;
                        return i != 0 ? new defpackage.aeif((android.content.res.Resources) aeicVar2.b, aprfVar, 2) : new defpackage.aeif((android.content.res.Resources) aeicVar2.b, aprfVar, 1);
                    }
                }, ((android.content.res.Resources) aeicVar.b).getString(2132019590));
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                final aeic aeicVar2 = (aeic) this.a;
                final int i = z ? 1 : 0;
                return defpackage.aeih.a(new defpackage.aeip() { // from class: aeib
                    @Override // defpackage.aeip
                    public final defpackage.aeio a(defpackage.aprf aprfVar) {
                        int i2 = i;
                        aeic aeicVar3 = aeicVar2;
                        return i2 != 0 ? new defpackage.aeif((android.content.res.Resources) aeicVar3.b, aprfVar, 2) : new defpackage.aeif((android.content.res.Resources) aeicVar3.b, aprfVar, 1);
                    }
                }, ((android.content.res.Resources) aeicVar2.b).getString(2132019590));
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity.n.b().l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/GooglePhotosBottomSheetActivity", "onCreate$<anonymous>$<anonymous>$<anonymous>", 74, "GooglePhotosBottomSheetActivity.kt").v("user dismissed bottomsheet");
                ((com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity) this.a).finish();
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aimz aimzVar = defpackage.afny.a;
                defpackage.afov afovVar = (defpackage.afov) this.a;
                aoov.an(afovVar.a, (aolr) null, 0, new defpackage.adzb(afovVar, (aoln) null, 11, (char[]) null), 3);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ?? r0 = this.a;
                aimz aimzVar2 = defpackage.afny.a;
                return a.r((aomy) r0);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return java.lang.Integer.valueOf(((bcl) this.a).b());
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return java.lang.Integer.valueOf(((bcl) this.a).b());
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                defpackage.aggs aggsVar = (defpackage.aggs) this.a;
                if (aggsVar.a.isAttachedToWindow()) {
                    android.widget.PopupWindow popupWindow = aggsVar.f;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                } else {
                    aggsVar.b();
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aghdVar = new defpackage.aghd(((defpackage.aghg) this.a).a);
                break;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj2 = this.a;
                return aoov.as(new hlh(((defpackage.aghg) obj2).b().c, obj2, 14), eob.a((eoa) obj2), new aozg(5000L, 0L), new defpackage.aghf(defpackage.aggc.f, false, 0, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, null));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.agfz.j = defpackage.agfz.h(((defpackage.aghy) this.a).b, "isOneTapEnabled", "SetupWizard One Tap status unknown; return as false.");
                android.os.Bundle bundle = defpackage.agfz.j;
                if (bundle == null || bundle.isEmpty()) {
                    android.util.Log.d("PartnerConfigHelper", "isOneTapEnabled: false because oneTapBundle is null or empty");
                } else {
                    z2 = defpackage.agfz.j.getBoolean("isOneTapEnabled", false);
                }
                return java.lang.Boolean.valueOf(z2);
            case 15:
                defpackage.aghg aghgVar = ((defpackage.aghy) this.a).i;
                if (aghgVar != null) {
                    aghgVar.b = false;
                }
                return aojh.a;
            case 16:
                return java.lang.Boolean.valueOf(((android.view.View) this.a).getLayoutDirection() == 1);
            case 17:
                ?? r1 = this.a;
                aoov.f((java.lang.Object) r1, 0);
                java.lang.Boolean bool = (java.lang.Boolean) r1.a();
                bool.booleanValue();
                return bool;
            case 18:
                return ((ahgd) this.a).S();
            case 19:
                return ((ahgd) this.a).R();
            default:
                return ((ahgd) this.a).T();
        }
        return aghdVar;
    }
}
