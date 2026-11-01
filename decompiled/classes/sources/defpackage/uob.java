package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class uob implements defpackage.aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ uob(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.aomy
    public final java.lang.Object a() {
        ?? arrayList;
        boolean z;
        switch (this.$cid) {
            case 0:
                ((defpackage.aimw) defpackage.uod.a.b().l("com/android/dialer/speeddial/bar/impl/integration/FavoritesBarCallLogScreenIntegration", "Render$<anonymous>$<anonymous>", 143, "FavoritesBarCallLogScreenIntegration.kt")).v("onAddPermissionsClicked");
                ((defpackage.ok) this.a).b(new java.lang.String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"});
                return defpackage.aojh.a;
            case 1:
                ((defpackage.aimw) defpackage.uod.a.b().l("com/android/dialer/speeddial/bar/impl/integration/FavoritesBarCallLogScreenIntegration", "Render$<anonymous>$<anonymous>", 134, "FavoritesBarCallLogScreenIntegration.kt")).v("onAddFavoriteClicked");
                ((defpackage.ok) this.a).b(new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI));
                return defpackage.aojh.a;
            case 2:
                ((defpackage.uod) this.a).d.i(null).b(defpackage.mce.FAVORITES_BAR_RENDERED_AFTER_CREATED);
                return defpackage.aojh.a;
            case 3:
                defpackage.ahbv ahbvVar = (defpackage.ahbv) this.a;
                ?? r0 = ahbvVar.f;
                if (r0.isEmpty()) {
                    return defpackage.aokc.a;
                }
                ?? r12 = ahbvVar.c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = r12.iterator();
                while (it.hasNext()) {
                    defpackage.ajsz.bv(arrayList2, ((defpackage.zaq) it.next()).a());
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                for (java.lang.Object obj : arrayList2) {
                    java.util.Set setA = ((defpackage.zao) obj).a();
                    if (!(setA instanceof java.util.Collection) || !setA.isEmpty()) {
                        java.util.Iterator it2 = setA.iterator();
                        while (it2.hasNext()) {
                            if (r0.contains(java.lang.Integer.valueOf(((java.lang.Number) it2.next()).intValue()))) {
                                arrayList3.add(obj);
                            }
                            break;
                        }
                    }
                }
                return arrayList3;
            case 4:
                java.util.List<defpackage.zao> listB = ((defpackage.ahbv) this.a).b();
                arrayList = new java.util.ArrayList();
                for (defpackage.zao zaoVar : listB) {
                    java.util.Set setAI = defpackage.ajsz.aI(zaoVar.a, zaoVar.b.keySet());
                    java.util.Set set = zaoVar.c;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.util.Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        defpackage.ajsz.bv(arrayList4, ((defpackage.zam) it3.next()).a);
                    }
                    java.util.Set setAI2 = defpackage.ajsz.aI(setAI, arrayList4);
                    java.util.Set set2 = zaoVar.d;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.util.Iterator it4 = set2.iterator();
                    while (it4.hasNext()) {
                        defpackage.ajsz.bv(arrayList5, ((defpackage.aacy) it4.next()).b);
                    }
                    defpackage.ajsz.bv(arrayList, defpackage.ajsz.aJ(defpackage.ajsz.aI(setAI2, arrayList5), zaoVar.g));
                }
                break;
            case 5:
                java.util.List listB2 = ((defpackage.ahbv) this.a).b();
                arrayList = new java.util.ArrayList();
                java.util.Iterator it5 = listB2.iterator();
                while (it5.hasNext()) {
                    defpackage.ajsz.bv(arrayList, ((defpackage.zao) it5.next()).e.keySet());
                }
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r13 = ((defpackage.agqj) this.a).a;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(defpackage.ajsz.bl(r13, 10));
                java.util.Iterator it6 = r13.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((defpackage.zaq) it6.next()).a());
                }
                return defpackage.ajsz.bm(arrayList6);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.agqj agqjVar = (defpackage.agqj) this.a;
                java.util.List listF = agqjVar.f();
                int iAL = defpackage.ajsz.aL(defpackage.ajsz.bl(listF, 10));
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(iAL >= 16 ? iAL : 16);
                for (java.lang.Object obj2 : listF) {
                    linkedHashMap.put(((defpackage.zao) obj2).g, obj2);
                }
                if (linkedHashMap.size() == agqjVar.f().size()) {
                    return linkedHashMap;
                }
                throw new java.lang.IllegalStateException("Duplicate CuiEventConfigurations with the same start CuiEvent.");
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.util.List listF2 = ((defpackage.agqj) this.a).f();
                int iAL2 = defpackage.ajsz.aL(defpackage.ajsz.bl(listF2, 10));
                arrayList = new java.util.LinkedHashMap(iAL2 >= 16 ? iAL2 : 16);
                for (java.lang.Object obj3 : listF2) {
                    arrayList.put(obj3, new defpackage.zjm(((defpackage.zao) obj3).c));
                }
                break;
            case 9:
                java.util.List listF3 = ((defpackage.agqj) this.a).f();
                int iAL3 = defpackage.ajsz.aL(defpackage.ajsz.bl(listF3, 10));
                arrayList = new java.util.LinkedHashMap(iAL3 >= 16 ? iAL3 : 16);
                for (java.lang.Object obj4 : listF3) {
                    arrayList.put(obj4, new defpackage.zjm(((defpackage.zao) obj4).d, (byte[]) null));
                }
                break;
            case 10:
                return ((rai) ((defpackage.zth) this.a).b).l((java.lang.String) null);
            case 11:
                return ((defpackage.zjp) this.a).b.getDefaultDialerPackage();
            case 12:
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addAction("android.telecom.action.DEFAULT_DIALER_CHANGED");
                intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_REGISTERED");
                intentFilter.addAction("android.telecom.action.PHONE_ACCOUNT_UNREGISTERED");
                defpackage.zjp zjpVar = (defpackage.zjp) this.a;
                defpackage.dvx.f(zjpVar.c, new defpackage.zjo(zjpVar), intentFilter, null, 2);
                return defpackage.aojh.a;
            case 13:
                android.content.Context context = (android.content.Context) ((defpackage.zth) this.a).a;
                return context.getSharedPreferences(java.lang.String.valueOf(context.getPackageName()).concat("_preferences"), 0);
            case 14:
                return defpackage.gez.c((android.content.Context) ((defpackage.zth) this.a).b);
            case 15:
                java.lang.Object obj5 = this.a;
                try {
                    return ((defpackage.aazk) obj5).b().a();
                } catch (java.lang.Exception e) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.aazk.a.d()).k(e).l("com/google/android/libraries/abuse/hades/common/encryption/AndroidTinkEncryptionHelper", "handle$<anonymous>", 32, "AndroidTinkEncryptionHelper.kt")).v("Failed to initialize AndroidKeysetManager; clearing state and retrying.");
                    try {
                        ((defpackage.aazk) obj5).b.getSharedPreferences("moirai_pref", 0).edit().remove("moirai_keyset").commit();
                    } catch (java.lang.Exception e2) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.aazk.a.d()).k(e2).l("com/google/android/libraries/abuse/hades/common/encryption/AndroidTinkEncryptionHelper", "clearKeysetData", 62, "AndroidTinkEncryptionHelper.kt")).v("Failed to clear keyset from shared preferences.");
                    }
                    try {
                        java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
                        defpackage.aooh.e(keyStore, "getInstance(...)");
                        keyStore.load(null);
                        if (keyStore.containsAlias("hades_moirai")) {
                            keyStore.deleteEntry("hades_moirai");
                        }
                    } catch (java.lang.Exception e3) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.aazk.a.d()).k(e3).l("com/google/android/libraries/abuse/hades/common/encryption/AndroidTinkEncryptionHelper", "clearKeysetData", 72, "AndroidTinkEncryptionHelper.kt")).v("Failed to delete hades_moirai from AndroidKeyStore.");
                    }
                    try {
                        return ((defpackage.aazk) obj5).b().a();
                    } catch (java.lang.Exception e4) {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.aazk.a.c()).k(e4).l("com/google/android/libraries/abuse/hades/common/encryption/AndroidTinkEncryptionHelper", "handle$<anonymous>", 40, "AndroidTinkEncryptionHelper.kt")).v("Failed to recover AndroidKeysetManager; falling back to ephemeral key.");
                        return ajex.k(((defpackage.aazl) obj5).c);
                    }
                }
                break;
            case 16:
                float[] fArr = new float[3];
                java.util.List list = ((defpackage.abng) this.a).a;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(defpackage.ajsz.bl(list, 10));
                java.util.Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(java.lang.Float.valueOf(defpackage.abng.c(((defpackage.cqg) it7.next()).a, fArr)));
                }
                return defpackage.ajsz.cl(arrayList7);
            case 17:
                defpackage.abuy abuyVar = defpackage.abva.a;
                int i = abuyVar.a;
                defpackage.abvh abvhVar = (defpackage.abvh) this.a;
                android.content.Context context2 = abvhVar.b;
                if (abvhVar.e.l(context2, i) == 0) {
                    android.content.pm.PackageManager packageManager = context2.getPackageManager();
                    defpackage.aooh.e(packageManager, "getPackageManager(...)");
                    z = abuyVar.a(defpackage.abrz.d(packageManager)) && defpackage.abts.h(context2);
                }
                return java.lang.Boolean.valueOf(z);
            case 18:
                android.content.pm.PackageManager packageManager2 = ((defpackage.abvp) this.a).b.getPackageManager();
                defpackage.aooh.e(packageManager2, "getPackageManager(...)");
                return defpackage.abrz.d(packageManager2);
            case 19:
                defpackage.abuy abuyVar2 = defpackage.abva.b;
                int i2 = abuyVar2.a;
                defpackage.abvp abvpVar = (defpackage.abvp) this.a;
                android.content.Context context3 = abvpVar.b;
                return java.lang.Boolean.valueOf(abvpVar.e.l(context3, i2) == 0 && abuyVar2.a(abvpVar.a()) && defpackage.abts.h(context3));
            default:
                defpackage.abuy abuyVar3 = defpackage.abva.c;
                int i3 = abuyVar3.a;
                defpackage.abvp abvpVar2 = (defpackage.abvp) this.a;
                android.content.Context context4 = abvpVar2.b;
                return java.lang.Boolean.valueOf(abvpVar2.e.l(context4, i3) == 0 && abuyVar3.a(abvpVar2.a()) && defpackage.abts.h(context4));
        }
        return arrayList;
    }
}
