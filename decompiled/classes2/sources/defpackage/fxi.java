package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class fxi implements aonn {
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        android.os.Bundle bundleR;
        defpackage.fvx fvxVar = (defpackage.fvx) obj2;
        defpackage.fxr fxrVar = fvxVar.b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle bundleR2 = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        android.os.Bundle bundle = fxrVar.d;
        if (bundle != null && gie.f(bundle, "android-support-nav:controller:navigatorState:names")) {
            for (java.lang.String str : gie.d(bundle, "android-support-nav:controller:navigatorState:names")) {
                if (gie.f(bundle, str)) {
                    android.os.Bundle bundleA = gie.a(bundle, str);
                    arrayList.add(str);
                    gij.b(bundleR2, str, bundleA);
                }
            }
        }
        for (java.util.Map.Entry entry : fxrVar.m.c().entrySet()) {
        }
        if (arrayList.isEmpty()) {
            bundleR = null;
        } else {
            bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            gij.e(bundleR2, "android-support-nav:controller:navigatorState:names", arrayList);
            gij.b(bundleR, "android-support-nav:controller:navigatorState", bundleR2);
        }
        aojw aojwVar = fxrVar.f;
        if (!aojwVar.isEmpty()) {
            if (bundleR == null) {
                bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = aojwVar.iterator();
            while (it.hasNext()) {
                arrayList2.add(new defpackage.vk((defpackage.fvs) it.next()).d());
            }
            gij.c(bundleR, "android-support-nav:controller:backStack", arrayList2);
        } else if (fxrVar.e != null) {
            if (bundleR == null) {
                bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            }
            android.os.Bundle[] bundleArr = fxrVar.e;
            aooh.c(bundleArr);
            gij.c(bundleR, "android-support-nav:controller:backStack", ajsz.cU(bundleArr));
        }
        java.util.Map map = fxrVar.h;
        if (!map.isEmpty()) {
            if (bundleR == null) {
                bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            }
            int[] iArr = new int[map.size()];
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            int i = 0;
            for (java.util.Map.Entry entry2 : map.entrySet()) {
                int iIntValue = ((java.lang.Number) entry2.getKey()).intValue();
                java.lang.String str2 = (java.lang.String) entry2.getValue();
                int i2 = i + 1;
                iArr[i] = iIntValue;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList3.add(str2);
                i = i2;
            }
            bundleR.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            gij.e(bundleR, "android-support-nav:controller:backStackIds", arrayList3);
        }
        java.util.Map map2 = fxrVar.i;
        if (!map2.isEmpty()) {
            if (bundleR == null) {
                bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.util.Map.Entry entry3 : map2.entrySet()) {
                java.lang.String str3 = (java.lang.String) entry3.getKey();
                aojw aojwVar2 = (aojw) entry3.getValue();
                arrayList4.add(str3);
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it2 = aojwVar2.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((defpackage.vk) it2.next()).d());
                }
                gij.c(bundleR, "android-support-nav:controller:backStackStates:".concat(java.lang.String.valueOf(str3)), arrayList5);
            }
            gij.e(bundleR, "android-support-nav:controller:backStackStates", arrayList4);
        }
        if (fvxVar.d) {
            if (bundleR == null) {
                bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            }
            bundleR.putBoolean("android-support-nav:controller:deepLinkHandled", fvxVar.d);
        }
        return bundleR;
    }
}
