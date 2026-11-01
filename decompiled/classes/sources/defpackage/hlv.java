package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class hlv implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ hlv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v34, types: [akzx, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        ?? linkedHashMap;
        int i = 2;
        boolean z = false;
        switch (this.$cid) {
            case 0:
                android.content.Context context = ((com.android.dialer.androidauto.impl.caricons.CarIconContentProvider) this.a).getContext();
                if (context != null) {
                    return ((defpackage.hly) defpackage.agab.aH(context, defpackage.hly.class)).ih();
                }
                throw new java.lang.IllegalStateException("Should not be called before `onCreate()`");
            case 1:
                android.content.Context context2 = ((com.android.dialer.androidauto.impl.caricons.CarIconContentProvider) this.a).getContext();
                if (context2 != null) {
                    return ((defpackage.hly) defpackage.agab.aH(context2, defpackage.hly.class)).iA();
                }
                throw new java.lang.IllegalStateException("Should not be called before `onCreate()`");
            case 2:
                ?? r0 = this.a;
                if (r0 == 0) {
                    defpackage.aooh.i("mapProvider");
                }
                linkedHashMap = new java.util.LinkedHashMap();
                for (defpackage.ypu ypuVar : ((defpackage.ypt) r0.a()).b) {
                    java.lang.String str = ypuVar.b;
                    defpackage.aooh.e(str, "getCountryCode(...)");
                    if (str == null) {
                        defpackage.aooh.i("unsanitizedCountryCode");
                        defpackage.aooh.i("<this>");
                    }
                    java.lang.String strQ = defpackage.ahvr.q(str);
                    defpackage.aooh.e(strQ, "toUpperCase(...)");
                    if (linkedHashMap.containsKey(strQ)) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.hyt.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b).l("com/android/dialer/audio/audioinjector/localeprovider/TtsLocaleProvider$Companion", "buildMap", 128, "TtsLocaleProvider.kt")).y("country code \"%s\" is duplicated", strQ);
                    } else {
                        linkedHashMap.put(strQ, ypuVar.c);
                    }
                }
                break;
            case 3:
                java.lang.String strB = defpackage.rlt.b(((defpackage.hyt) this.a).b);
                strB.getClass();
                return strB;
            case 4:
                return (defpackage.acve) this.a.a();
            case 5:
                return java.lang.Boolean.valueOf(baa$.ExternalSyntheticApiModelOutline1.m(((defpackage.jxe) this.a).f));
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.kjw kjwVar = (defpackage.kjw) this.a;
                defpackage.aify aifyVar = (defpackage.aify) j$.util.Collection.-EL.stream(kjwVar.l.k().entrySet()).sorted(j$.util.Map.Entry.-CC.comparingByKey()).map(new defpackage.kju(z ? 1 : 0)).map(new defpackage.kju(i)).collect(defpackage.aido.a);
                int size = aifyVar.size() + 1;
                defpackage.ahvr.bC(size, "expectedSize");
                defpackage.aift aiftVar = new defpackage.aift(size);
                aiftVar.i(kjwVar.i);
                aiftVar.k(aifyVar);
                return aiftVar.g();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String strB2 = defpackage.rlt.b(((defpackage.kwt) this.a).b);
                if (strB2 == null) {
                    throw new java.lang.NullPointerException("Current country code is null.");
                }
                return strB2;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                java.lang.String strQ2 = defpackage.ahvr.q((java.lang.String) ((defpackage.kwt) this.a).c.x().orElse((java.lang.Object) null));
                if (strQ2 == null) {
                    throw new java.lang.NullPointerException("networkCountryIso not available");
                }
                return strQ2;
            case 9:
                java.lang.String strQ3 = defpackage.ahvr.q((java.lang.String) ((defpackage.kwt) this.a).c.z().orElse((java.lang.Object) null));
                if (strQ3 == null) {
                    throw new java.lang.NullPointerException("simCountryIso not available");
                }
                return strQ3;
            case 10:
                defpackage.kwt kwtVar = (defpackage.kwt) this.a;
                if (kwtVar.c.b() != 1) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.kwt.a.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getNetworkCountryMatchesSimCountryInternal", 156, "LocaleProvider.java")).v("NetworkCountryCode not available due to non-GSM network");
                    return java.lang.Boolean.FALSE;
                }
                java.lang.String str2 = (java.lang.String) kwtVar.e.eZ();
                java.lang.String str3 = (java.lang.String) kwtVar.f.eZ();
                ((defpackage.aimw) ((defpackage.aimw) defpackage.kwt.a.b()).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "getNetworkCountryMatchesSimCountryInternal", 163, "LocaleProvider.java")).I("NetworkCountryCode: %s, SimCountryIso: %s", str2, str3);
                return java.lang.Boolean.valueOf(defpackage.ahvr.r(str2, str3));
            case 11:
                defpackage.aift aiftVar2 = new defpackage.aift(4);
                java.util.Iterator it = ((defpackage.alfc) ((defpackage.kwt) this.a).h.a()).b.iterator();
                while (it.hasNext()) {
                    aiftVar2.i(defpackage.ahvr.q((java.lang.String) it.next()));
                }
                return aiftVar2.g();
            case 12:
                defpackage.aimz aimzVar = defpackage.kwt.a;
                defpackage.aigb aigbVar = new defpackage.aigb(4);
                java.util.HashSet hashSet = new java.util.HashSet();
                for (defpackage.ypu ypuVar2 : ((defpackage.ypt) this.a.a()).b) {
                    java.lang.String strQ4 = defpackage.ahvr.q(ypuVar2.b);
                    if (hashSet.contains(strQ4)) {
                        ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.kwt.a.c()).m(defpackage.aioa.MEDIUM)).i(defpackage.zct.b)).l("com/android/dialer/callrecording/impl/localeprovider/LocaleProvider", "buildMap", (char) 254, "LocaleProvider.java")).y("country code \"%s\" is duplicated", strQ4);
                    } else {
                        hashSet.add(strQ4);
                        aigbVar.i(strQ4, ypuVar2.c);
                    }
                }
                return aigbVar.e(true);
            case 13:
                return ((defpackage.ljf) this.a).a();
            case 14:
                return android.preference.PreferenceManager.getDefaultSharedPreferences((android.content.Context) this.a);
            case 15:
                android.content.Context context3 = (android.content.Context) this.a;
                return context3.getSharedPreferences(context3.getPackageName(), 0);
            case 16:
                return ((android.content.Context) this.a).getString(2132018362);
            case 17:
                return ((android.content.Context) this.a).getString(2132018354);
            case 18:
                for (java.lang.String str4 : ((defpackage.mid) this.a).b.getPackageManager().getSystemSharedLibraryNames()) {
                    if ("com.google.android.dialer.support".equals(str4)) {
                        z = true;
                        return java.lang.Boolean.valueOf(z);
                    }
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) defpackage.mid.a.d()).i(defpackage.zct.b)).l("com/android/dialer/devices/google/checker/GoogleDeviceCompatibilityChecker", "hasDialerSupportLibrary", 'I', "GoogleDeviceCompatibilityChecker.java")).v("device is missing dialer shared library!");
                return java.lang.Boolean.valueOf(z);
            case 19:
                return (defpackage.acve) this.a.a();
            default:
                linkedHashMap = defpackage.ampq.a.m();
                java.lang.String str5 = android.os.Build.DEVICE;
                linkedHashMap.u();
                defpackage.ampq ampqVar = (defpackage.ampq) linkedHashMap.b;
                j$.util.Objects.requireNonNull(str5);
                ampqVar.b |= 1;
                ampqVar.c = str5;
                java.lang.String str6 = android.os.Build.MODEL;
                linkedHashMap.u();
                defpackage.ampq ampqVar2 = (defpackage.ampq) linkedHashMap.b;
                j$.util.Objects.requireNonNull(str6);
                ampqVar2.b |= 2;
                ampqVar2.d = str6;
                java.lang.String str7 = android.os.Build.VERSION.RELEASE;
                linkedHashMap.u();
                defpackage.ampq ampqVar3 = (defpackage.ampq) linkedHashMap.b;
                j$.util.Objects.requireNonNull(str7);
                ampqVar3.b |= 4;
                ampqVar3.e = str7;
                java.lang.String str8 = android.os.Build.ID;
                linkedHashMap.u();
                defpackage.ampq ampqVar4 = (defpackage.ampq) linkedHashMap.b;
                j$.util.Objects.requireNonNull(str8);
                ampqVar4.b |= 8;
                ampqVar4.f = str8;
                linkedHashMap.u();
                defpackage.ampq ampqVar5 = (defpackage.ampq) linkedHashMap.b;
                ampqVar5.i = 4;
                ampqVar5.b |= 64;
                linkedHashMap.u();
                defpackage.ampq ampqVar6 = (defpackage.ampq) linkedHashMap.b;
                ampqVar6.r = 3;
                ampqVar6.b |= 32768;
                android.content.Context context4 = ((defpackage.rmb) this.a).b;
                boolean z2 = 1 == (context4.getApplicationInfo().flags & 1);
                linkedHashMap.u();
                defpackage.ampq ampqVar7 = (defpackage.ampq) linkedHashMap.b;
                ampqVar7.b |= 4096;
                ampqVar7.o = z2;
                int i2 = context4.getApplicationInfo().flags & 128;
                linkedHashMap.u();
                defpackage.ampq ampqVar8 = (defpackage.ampq) linkedHashMap.b;
                ampqVar8.b |= 8192;
                ampqVar8.p = i2 != 0;
                j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(context4.getPackageManager().getInstallerPackageName(context4.getPackageName()));
                j$.util.Objects.requireNonNull((java.lang.Object) linkedHashMap);
                defpackage.jyv jyvVar = new defpackage.jyv(linkedHashMap, 9);
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.String str9 = (java.lang.String) optionalOfNullable.get();
                    defpackage.akzx akzxVar = (defpackage.akzx) jyvVar.a;
                    akzxVar.u();
                    defpackage.ampq ampqVar9 = (defpackage.ampq) akzxVar.b;
                    j$.util.Objects.requireNonNull(str9);
                    ampqVar9.b |= 16384;
                    ampqVar9.q = str9;
                }
                break;
        }
        return linkedHashMap;
    }
}
