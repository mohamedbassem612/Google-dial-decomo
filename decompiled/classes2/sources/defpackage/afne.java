package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afne implements aomy {
    public final /* synthetic */ android.app.Activity a;
    public final /* synthetic */ defpackage.fvx b;

    public /* synthetic */ afne(defpackage.fvx fvxVar, android.app.Activity activity) {
        this.b = fvxVar;
        this.a = activity;
    }

    public final java.lang.Object a() {
        android.content.Intent launchIntentForPackage;
        android.os.Bundle bundleC;
        android.content.Intent launchIntentForPackage2;
        aimz aimzVar = afny.a;
        defpackage.fvx fvxVar = this.b;
        defpackage.fwc fwcVarC = fvxVar.c();
        if (aooh.n(fwcVarC != null ? fwcVarC.f() : null, "GooglePhotosHome")) {
            android.app.Activity activity = this.a;
            afny.a.b().l("com/google/android/libraries/user/profile/photopicker/components/googlephotos/GooglePhotosPickerKt", "GooglePhotosPicker$<anonymous>$<anonymous>$<anonymous>$<anonymous>", 213, "GooglePhotosPicker.kt").v("user exited bottomsheet via button");
            if (activity != null) {
                activity.finish();
            }
        }
        if (fvxVar.a() == 1) {
            android.app.Activity activity2 = fvxVar.c;
            android.content.Intent intent = activity2 != null ? activity2.getIntent() : null;
            android.os.Bundle extras = intent != null ? intent.getExtras() : null;
            int i = 0;
            if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null || !fvxVar.f(intent)) {
                defpackage.fwc fwcVarC2 = fvxVar.c();
                aooh.c(fwcVarC2);
                int iB = fwcVarC2.b();
                for (defpackage.fwe fweVar = fwcVarC2.c; fweVar != null; fweVar = fweVar.c) {
                    if (fweVar.i() != iB) {
                        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                        android.app.Activity activity3 = fvxVar.c;
                        if (activity3 != null && activity3.getIntent() != null) {
                            android.app.Activity activity4 = fvxVar.c;
                            aooh.c(activity4);
                            if (activity4.getIntent().getData() != null) {
                                android.app.Activity activity5 = fvxVar.c;
                                aooh.c(activity5);
                                android.content.Intent intent2 = activity5.getIntent();
                                aooh.e(intent2, "getIntent(...)");
                                gij.a(bundleR, "android-support-nav:controller:deepLinkIntent", intent2);
                                defpackage.fwe fweVarG = fvxVar.b.g();
                                android.app.Activity activity6 = fvxVar.c;
                                aooh.c(activity6);
                                android.content.Intent intent3 = activity6.getIntent();
                                aooh.e(intent3, "getIntent(...)");
                                defpackage.fwb fwbVarO = fweVarG.o(defpackage.hgt.aa(intent3), fweVarG);
                                if ((fwbVarO != null ? fwbVarO.b : null) != null && (bundleC = fwbVarO.a.c(fwbVarO.b)) != null) {
                                    bundleR.putAll(bundleC);
                                }
                            }
                        }
                        android.content.Context context = fvxVar.a;
                        aooh.f(context, "context");
                        defpackage.vk vkVar = new defpackage.vk(context, (byte[]) null);
                        android.app.Activity activity7 = (android.app.Activity) aooc.j(aooc.n(aooc.h(context, new defpackage.fvt(3)), new defpackage.fvt(4)));
                        if (activity7 != null) {
                            launchIntentForPackage = new android.content.Intent(context, activity7.getClass());
                        } else {
                            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                            if (launchIntentForPackage == null) {
                                launchIntentForPackage = new android.content.Intent();
                            }
                        }
                        launchIntentForPackage.addFlags(268468224);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        defpackage.fwe fweVarD = fvxVar.d();
                        int iB2 = fweVar.b();
                        arrayList.clear();
                        arrayList.add(new amwp(iB2, (java.lang.Object) null, (byte[]) null));
                        defpackage.hgt.ag(vkVar, fweVarD, arrayList);
                        launchIntentForPackage.putExtra("android-support-nav:controller:deepLinkExtras", bundleR);
                        defpackage.hgt.af(context, vkVar, launchIntentForPackage, fweVarD, arrayList).d();
                        android.app.Activity activity8 = fvxVar.c;
                        if (activity8 == null) {
                            break;
                        }
                        activity8.finish();
                        break;
                    }
                    iB = fweVar.b();
                }
            } else if (fvxVar.d) {
                android.app.Activity activity9 = fvxVar.c;
                aooh.c(activity9);
                android.content.Intent intent4 = activity9.getIntent();
                android.os.Bundle extras2 = intent4.getExtras();
                aooh.c(extras2);
                int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
                aooh.c(intArray);
                java.util.List listCV = ajsz.cV(intArray);
                java.util.ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                if (listCV.size() >= 2) {
                    int iIntValue = ((java.lang.Number) ajsz.bq(listCV)).intValue();
                    if (parcelableArrayList != null) {
                    }
                    defpackage.fwc fwcVarN = defpackage.fxr.n(fvxVar.d(), iIntValue, false, null);
                    if (fwcVarN instanceof defpackage.fwe) {
                        iIntValue = defpackage.hgt.W((defpackage.fwe) fwcVarN).b();
                    }
                    defpackage.fwc fwcVarC3 = fvxVar.c();
                    if (fwcVarC3 != null && iIntValue == fwcVarC3.b()) {
                        android.content.Context context2 = fvxVar.a;
                        aooh.f(context2, "context");
                        defpackage.vk vkVar2 = new defpackage.vk(context2, (byte[]) null);
                        android.app.Activity activity10 = (android.app.Activity) aooc.j(aooc.n(aooc.h(context2, new defpackage.fvt(3)), new defpackage.fvt(4)));
                        if (activity10 != null) {
                            launchIntentForPackage2 = new android.content.Intent(context2, activity10.getClass());
                        } else {
                            launchIntentForPackage2 = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName());
                            if (launchIntentForPackage2 == null) {
                                launchIntentForPackage2 = new android.content.Intent();
                            }
                        }
                        launchIntentForPackage2.addFlags(268468224);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        defpackage.fwe fweVarD2 = fvxVar.d();
                        android.os.Bundle bundleR2 = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                        aooh.c(intent4);
                        gij.a(bundleR2, "android-support-nav:controller:deepLinkIntent", intent4);
                        android.os.Bundle bundle = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                        if (bundle != null) {
                            bundleR2.putAll(bundle);
                        }
                        launchIntentForPackage2.putExtra("android-support-nav:controller:deepLinkExtras", bundleR2);
                        for (java.lang.Object obj : listCV) {
                            int i2 = i + 1;
                            if (i < 0) {
                                ajsz.bh();
                            }
                            arrayList2.add(new amwp(((java.lang.Number) obj).intValue(), parcelableArrayList != null ? (android.os.Bundle) parcelableArrayList.get(i) : null, (byte[]) null));
                            defpackage.hgt.ag(vkVar2, fweVarD2, arrayList2);
                            i = i2;
                        }
                        defpackage.hgt.af(context2, vkVar2, launchIntentForPackage2, fweVarD2, arrayList2).d();
                        android.app.Activity activity11 = fvxVar.c;
                        if (activity11 != null) {
                            activity11.finish();
                        }
                    }
                }
            }
        } else {
            fvxVar.i();
        }
        return aojh.a;
    }
}
