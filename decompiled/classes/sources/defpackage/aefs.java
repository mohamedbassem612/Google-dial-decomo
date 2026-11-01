package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aefs implements defpackage.aefe {
    private static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    private final android.content.Context b;
    private final defpackage.aduu c;
    private final defpackage.ahyn d;
    private final defpackage.ahyn e;
    private final defpackage.aeds f;
    private final defpackage.aoin g;
    private final defpackage.aeey h;

    public aefs(android.content.Context context, defpackage.aduu aduuVar, defpackage.ahyn ahynVar, defpackage.ahyn ahynVar2, defpackage.aeds aedsVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.aeey aeeyVar) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aduuVar, "gnpConfig");
        defpackage.aooh.f(ajctVar, "lightweightExecuter");
        defpackage.aooh.f(aoinVar, "inappPushEnabledFlag");
        defpackage.aooh.f(aeeyVar, "clientStreamz");
        this.b = context;
        this.c = aduuVar;
        this.d = ahynVar;
        this.e = ahynVar2;
        this.f = aedsVar;
        this.g = aoinVar;
        this.h = aeeyVar;
    }

    private final java.lang.String e() {
        java.lang.String languageTag = aa$.ExternalSyntheticApiModelOutline1.m(aa$.ExternalSyntheticApiModelOutline1.m(this.b.getResources().getConfiguration()), 0).toLanguageTag();
        defpackage.aooh.e(languageTag, "toLanguageTag(...)");
        return languageTag;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0488  */
    /* JADX WARN: Code duplicated, block: B:139:0x0494  */
    private final defpackage.akrv f() {
        java.lang.String str;
        java.util.List arrayList;
        java.util.List arrayList2;
        defpackage.aefd aefdVar;
        defpackage.akrr akrrVar;
        java.lang.String strValueOf = "";
        defpackage.akzx akzxVarM = defpackage.akrv.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        android.content.Context context = this.b;
        float f = context.getResources().getDisplayMetrics().density;
        akzxVarM.u();
        defpackage.akrv akrvVar = (defpackage.akrv) akzxVarM.b;
        akrvVar.b |= 1;
        akrvVar.c = f;
        boolean zM = false;
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                str = "";
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).v("Couldn't get app version name.");
        }
        akzxVarM.u();
        defpackage.akrv akrvVar2 = (defpackage.akrv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        akrvVar2.b |= 8;
        akrvVar2.f = str;
        try {
            android.content.Context context2 = this.b;
            strValueOf = java.lang.String.valueOf(ft$.ExternalSyntheticApiModelOutline0.m(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0)));
        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e2)).v("Couldn't get app version code.");
        }
        defpackage.aooh.f(strValueOf, "value");
        akzxVarM.u();
        defpackage.akrv akrvVar3 = (defpackage.akrv) akzxVarM.b;
        j$.util.Objects.requireNonNull(strValueOf);
        akrvVar3.b |= 16;
        akrvVar3.g = strValueOf;
        int i = android.os.Build.VERSION.SDK_INT;
        akzxVarM.u();
        defpackage.akrv akrvVar4 = (defpackage.akrv) akzxVarM.b;
        akrvVar4.b |= 256;
        akrvVar4.k = i;
        akzxVarM.u();
        defpackage.akrv akrvVar5 = (defpackage.akrv) akzxVarM.b;
        akrvVar5.d = 3;
        akrvVar5.b |= 2;
        akzxVarM.u();
        defpackage.akrv akrvVar6 = (defpackage.akrv) akzxVarM.b;
        j$.util.Objects.requireNonNull("1001915728");
        akrvVar6.b |= 4;
        akrvVar6.e = "1001915728";
        android.content.Context context3 = this.b;
        defpackage.akrp akrpVar = new defpackage.dvr(context3).a() ? defpackage.akrp.ALLOWED : defpackage.akrp.BANNED;
        akzxVarM.u();
        defpackage.akrv akrvVar7 = (defpackage.akrv) akzxVarM.b;
        akrvVar7.p = akrpVar.d;
        akrvVar7.b |= 2048;
        try {
            defpackage.dvr dvrVar = new defpackage.dvr(context3);
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                zM = a$.ExternalSyntheticApiModelOutline0.m(dvrVar.d);
            }
        } catch (java.lang.Throwable unused) {
        }
        akzxVarM.u();
        defpackage.akrv akrvVar8 = (defpackage.akrv) akzxVarM.b;
        akrvVar8.b |= 4096;
        akrvVar8.q = zM;
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akrvVar8.n);
        defpackage.aooh.e(listUnmodifiableList, "getChannelList(...)");
        new defpackage.alct(listUnmodifiableList);
        try {
            java.util.List listM$1 = aa$.ExternalSyntheticApiModelOutline0.m$1(new defpackage.dvr(this.b).d);
            defpackage.aooh.e(listM$1, "getNotificationChannels(...)");
            arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listM$1, 10));
            java.util.Iterator it = listM$1.iterator();
            while (it.hasNext()) {
                android.app.NotificationChannel notificationChannelM = aa$.ExternalSyntheticApiModelOutline0.m(it.next());
                defpackage.akzx akzxVarM2 = defpackage.akrs.a.m();
                defpackage.aooh.f(akzxVarM2, "builder");
                java.lang.String strM$1 = aa$.ExternalSyntheticApiModelOutline0.m$1(notificationChannelM);
                defpackage.aooh.e(strM$1, "getId(...)");
                defpackage.aooh.f(strM$1, "value");
                akzxVarM2.u();
                defpackage.akrs akrsVar = (defpackage.akrs) akzxVarM2.b;
                j$.util.Objects.requireNonNull(strM$1);
                akrsVar.b |= 1;
                akrsVar.c = strM$1;
                int iM = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM);
                if (iM == 0) {
                    akrrVar = defpackage.akrr.IMPORTANCE_NONE;
                } else if (iM == 1) {
                    akrrVar = defpackage.akrr.IMPORTANCE_MIN;
                } else if (iM == 2) {
                    akrrVar = defpackage.akrr.IMPORTANCE_LOW;
                } else if (iM == 3) {
                    akrrVar = defpackage.akrr.IMPORTANCE_DEFAULT;
                } else if (iM != 4) {
                    akrrVar = iM != 5 ? defpackage.akrr.IMPORTANCE_UNSPECIFIED : defpackage.akrr.IMPORTANCE_MAX;
                } else {
                    akrrVar = defpackage.akrr.IMPORTANCE_HIGH;
                }
                akzxVarM2.u();
                defpackage.akrs akrsVar2 = (defpackage.akrs) akzxVarM2.b;
                akrsVar2.e = akrrVar.h;
                akrsVar2.b |= 4;
                defpackage.akrq akrqVar = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM) ? defpackage.akrq.TRUE : defpackage.akrq.FALSE;
                akzxVarM2.u();
                defpackage.akrs akrsVar3 = (defpackage.akrs) akzxVarM2.b;
                akrsVar3.f = akrqVar.d;
                akrsVar3.b |= 8;
                java.lang.String strM = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM);
                if (strM != null && strM.length() != 0) {
                    java.lang.String strM2 = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelM);
                    defpackage.aooh.e(strM2, "getGroup(...)");
                    defpackage.aooh.f(strM2, "value");
                    akzxVarM2.u();
                    defpackage.akrs akrsVar4 = (defpackage.akrs) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strM2);
                    akrsVar4.b |= 2;
                    akrsVar4.d = strM2;
                }
                defpackage.alad aladVarR = akzxVarM2.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                arrayList.add((defpackage.akrs) aladVarR);
            }
        } catch (java.lang.NullPointerException e3) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e3)).v("Failed to get notification channels from Android.");
            arrayList = defpackage.aokc.a;
        }
        akzxVarM.u();
        defpackage.akrv akrvVar9 = (defpackage.akrv) akzxVarM.b;
        defpackage.alat alatVar = akrvVar9.n;
        if (!alatVar.c()) {
            akrvVar9.n = defpackage.alad.J(alatVar);
        }
        defpackage.akyl.i(arrayList, akrvVar9.n);
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(((defpackage.akrv) akzxVarM.b).o);
        defpackage.aooh.e(listUnmodifiableList2, "getChannelGroupList(...)");
        new defpackage.alct(listUnmodifiableList2);
        try {
            java.util.List listM = aa$.ExternalSyntheticApiModelOutline0.m(new defpackage.dvr(this.b).d);
            defpackage.aooh.e(listM, "getNotificationChannelGroups(...)");
            arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listM, 10));
            java.util.Iterator it2 = listM.iterator();
            while (it2.hasNext()) {
                android.app.NotificationChannelGroup notificationChannelGroupM = aa$.ExternalSyntheticApiModelOutline0.m(it2.next());
                defpackage.akzx akzxVarM3 = defpackage.akru.a.m();
                defpackage.aooh.f(akzxVarM3, "builder");
                java.lang.String strM3 = aa$.ExternalSyntheticApiModelOutline0.m(notificationChannelGroupM);
                defpackage.aooh.e(strM3, "getId(...)");
                defpackage.aooh.f(strM3, "value");
                akzxVarM3.u();
                defpackage.akru akruVar = (defpackage.akru) akzxVarM3.b;
                j$.util.Objects.requireNonNull(strM3);
                akruVar.b |= 1;
                akruVar.c = strM3;
                akrt akrtVar = ft$.ExternalSyntheticApiModelOutline0.m(notificationChannelGroupM) ? akrt.c : akrt.b;
                akzxVarM3.u();
                defpackage.akru akruVar2 = (defpackage.akru) akzxVarM3.b;
                akruVar2.d = akrtVar.d;
                akruVar2.b |= 2;
                defpackage.alad aladVarR2 = akzxVarM3.r();
                defpackage.aooh.e(aladVarR2, "build(...)");
                arrayList2.add((defpackage.akru) aladVarR2);
            }
        } catch (java.lang.NullPointerException e4) {
            ((defpackage.aiob) ((defpackage.aiob) a.d()).k(e4)).v("Failed to get notification channel groups from Android.");
            arrayList2 = defpackage.aokc.a;
        }
        akzxVarM.u();
        defpackage.akrv akrvVar10 = (defpackage.akrv) akzxVarM.b;
        defpackage.alat alatVar2 = akrvVar10.o;
        if (!alatVar2.c()) {
            akrvVar10.o = defpackage.alad.J(alatVar2);
        }
        defpackage.akyl.i(arrayList2, akrvVar10.o);
        java.lang.String str2 = this.c.d;
        if (str2 != null && str2.length() != 0) {
            akzxVarM.u();
            defpackage.akrv akrvVar11 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str2);
            akrvVar11.b |= 1024;
            akrvVar11.m = str2;
        }
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        if (str3 != null && str3.length() != 0) {
            java.lang.String str4 = android.os.Build.VERSION.RELEASE;
            defpackage.aooh.e(str4, "RELEASE");
            defpackage.aooh.f(str4, "value");
            akzxVarM.u();
            defpackage.akrv akrvVar12 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str4);
            akrvVar12.b |= 32;
            akrvVar12.h = str4;
        }
        java.lang.String str5 = android.os.Build.ID;
        if (str5 != null && str5.length() != 0) {
            java.lang.String str6 = android.os.Build.ID;
            defpackage.aooh.e(str6, "ID");
            defpackage.aooh.f(str6, "value");
            akzxVarM.u();
            defpackage.akrv akrvVar13 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str6);
            akrvVar13.b |= 64;
            akrvVar13.i = str6;
        }
        java.lang.String str7 = android.os.Build.MODEL;
        if (str7 != null && str7.length() != 0) {
            java.lang.String str8 = android.os.Build.MODEL;
            defpackage.aooh.e(str8, "MODEL");
            defpackage.aooh.f(str8, "value");
            akzxVarM.u();
            defpackage.akrv akrvVar14 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str8);
            akrvVar14.b |= 128;
            akrvVar14.j = str8;
        }
        java.lang.String str9 = android.os.Build.MANUFACTURER;
        if (str9 != null && str9.length() != 0) {
            java.lang.String str10 = android.os.Build.MANUFACTURER;
            defpackage.aooh.e(str10, "MANUFACTURER");
            defpackage.aooh.f(str10, "value");
            akzxVarM.u();
            defpackage.akrv akrvVar15 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(str10);
            akrvVar15.b |= 512;
            akrvVar15.l = str10;
        }
        java.lang.String strA = null;
        try {
            strA = defpackage.aaym.a(this.b.getContentResolver(), "device_country", null);
        } catch (java.lang.SecurityException e5) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e5)).v("Exception reading GServices 'device_country' key.");
        }
        if (strA != null && strA.length() != 0) {
            akzxVarM.u();
            defpackage.akrv akrvVar16 = (defpackage.akrv) akzxVarM.b;
            j$.util.Objects.requireNonNull(strA);
            akrvVar16.b |= 8192;
            akrvVar16.r = strA;
        }
        android.content.Context context4 = this.b;
        defpackage.aefo aefoVar = defpackage.aefo.a;
        defpackage.aooh.f(context4, "context");
        defpackage.aooh.f(context4, "context");
        if (context4.getPackageManager().hasSystemFeature("org.chromium.arc")) {
            aefdVar = defpackage.aefd.f;
        } else {
            defpackage.aooh.f(context4, "context");
            if (context4.getPackageManager().hasSystemFeature("android.software.xr.api.spatial")) {
                aefdVar = defpackage.aefd.h;
            } else {
                defpackage.aooh.f(context4, "context");
                if (context4.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                    aefdVar = defpackage.aefd.e;
                } else {
                    defpackage.aooh.f(context4, "context");
                    if (context4.getPackageManager().hasSystemFeature("com.google.android.tv") || context4.getPackageManager().hasSystemFeature("android.hardware.type.television") || context4.getPackageManager().hasSystemFeature("android.software.leanback")) {
                        aefdVar = defpackage.aefd.b;
                    } else {
                        defpackage.aooh.f(context4, "context");
                        if (context4.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            aefdVar = defpackage.aefd.d;
                        } else {
                            defpackage.aooh.f(context4, "context");
                            if (context4.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                                aefdVar = defpackage.aefd.c;
                            } else {
                                defpackage.aooh.f(context4, "context");
                                if (context4.getPackageManager().hasSystemFeature("com.google.desktop.gms")) {
                                    aefdVar = defpackage.aefd.g;
                                } else {
                                    defpackage.aooh.f(context4, "context");
                                    int i2 = defpackage.dwz.a;
                                    if (android.os.Build.VERSION.SDK_INT < 36) {
                                        if (android.os.Build.VERSION.SDK_INT >= 35) {
                                            java.lang.String str11 = android.os.Build.VERSION.CODENAME;
                                            defpackage.aooh.e(str11, "CODENAME");
                                            if (defpackage.dwz.a("Baklava", str11)) {
                                                if (context4.getPackageManager().hasSystemFeature("android.hardware.type.xr_peripheral")) {
                                                    aefdVar = defpackage.aefd.i;
                                                }
                                            }
                                        }
                                        aefdVar = defpackage.aefd.a;
                                    } else if (context4.getPackageManager().hasSystemFeature("android.hardware.type.xr_peripheral")) {
                                        aefdVar = defpackage.aefd.i;
                                    } else {
                                        aefdVar = defpackage.aefd.a;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        defpackage.akro akroVar = (defpackage.akro) aefoVar.d(aefdVar);
        if (akroVar != null) {
            akzxVarM.u();
            defpackage.akrv akrvVar17 = (defpackage.akrv) akzxVarM.b;
            akrvVar17.u = akroVar.j;
            akrvVar17.b |= 65536;
        }
        defpackage.alad aladVarR3 = akzxVarM.r();
        defpackage.aooh.e(aladVarR3, "build(...)");
        return (defpackage.akrv) aladVarR3;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0360 A[LOOP:2: B:100:0x035a->B:102:0x0360, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:47:0x0148  */
    /* JADX WARN: Code duplicated, block: B:50:0x018c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0192  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x0200  */
    /* JADX WARN: Code duplicated, block: B:63:0x0204  */
    /* JADX WARN: Code duplicated, block: B:66:0x0217 A[LOOP:3: B:64:0x0211->B:66:0x0217, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0238 A[LOOP:4: B:68:0x0232->B:70:0x0238, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0264 A[LOOP:5: B:72:0x025e->B:74:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0299  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:84:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:87:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:88:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:93:0x0317 A[LOOP:1: B:91:0x0311->B:93:0x0317, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x032f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0350  */
    @Override // defpackage.aefe
    public final java.lang.Object a(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, java.util.Set set, defpackage.aduw aduwVar, defpackage.aoln aolnVar) {
        defpackage.aefp aefpVar;
        defpackage.ahyn ahynVar;
        com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation2;
        defpackage.akzx akzxVar;
        defpackage.akyp akypVar;
        defpackage.akrv akrvVar;
        defpackage.aktb aktbVar;
        defpackage.akrv akrvVar2;
        defpackage.akrv akrvVar3;
        defpackage.aktb aktbVar2;
        defpackage.akrv akrvVar4;
        defpackage.akrv akrvVar5;
        java.util.Set set2;
        java.util.ArrayList arrayList;
        java.util.Iterator it;
        java.util.Iterator it2;
        int iMax;
        java.util.ArrayList arrayList2;
        java.util.Iterator it3;
        defpackage.aktb aktbVar3;
        defpackage.aktb aktbVar4;
        java.util.ArrayList arrayList3;
        int iMax2;
        int i;
        defpackage.akzx akzxVarM;
        java.util.Iterator it4;
        java.util.Set set3;
        defpackage.aktj aktjVar;
        defpackage.alak alakVar;
        java.util.Iterator it5;
        long jA;
        long jA2;
        if (aolnVar instanceof defpackage.aefp) {
            aefpVar = (defpackage.aefp) aolnVar;
            int i2 = aefpVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aefpVar.e = i2 - Integer.MIN_VALUE;
            } else {
                aefpVar = new defpackage.aefp(this, aolnVar);
            }
        } else {
            aefpVar = new defpackage.aefp(this, aolnVar);
        }
        java.lang.Object objC = aefpVar.c;
        java.lang.Object obj = defpackage.aolu.a;
        int i3 = aefpVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                defpackage.ahyn ahynVar2 = aefpVar.f;
                defpackage.akzx akzxVar2 = aefpVar.g;
                java.util.Set set4 = (java.util.Set) aefpVar.b;
                accountRepresentation2 = (com.google.android.libraries.notifications.platform.registration.AccountRepresentation) aefpVar.a;
                defpackage.aooc.af(objC);
                ahynVar = ahynVar2;
                akzxVar = akzxVar2;
                set = set4;
            } else {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                akzxVar = (defpackage.akzx) aefpVar.b;
                set = (java.util.Set) aefpVar.a;
                defpackage.aooc.af(objC);
            }
            akypVar = (defpackage.akyp) objC;
            if (akypVar != null) {
                akzxVar.u();
                defpackage.akrw akrwVar = (defpackage.akrw) akzxVar.b;
                defpackage.akrw akrwVar2 = defpackage.akrw.a;
                j$.util.Objects.requireNonNull(akypVar);
                akrwVar.g = akypVar;
                akrwVar.b |= 64;
            }
            boolean zContains = set.contains(defpackage.aegl.IN_APP);
            akrvVar = ((defpackage.akrw) akzxVar.b).f;
            if (akrvVar == null) {
                akrvVar = defpackage.akrv.a;
            }
            aktbVar = akrvVar.s;
            if (aktbVar == null) {
                aktbVar = defpackage.aktb.a;
            }
            defpackage.akzx akzxVarL = aktbVar.L();
            defpackage.agab.bz(akzxVarL, 2, zContains);
            akrvVar2 = ((defpackage.akrw) akzxVar.b).f;
            if (akrvVar2 == null) {
                akrvVar2 = defpackage.akrv.a;
            }
            defpackage.akzx akzxVarL2 = akrvVar2.L();
            akzxVarL2.u();
            defpackage.akrv akrvVar6 = (defpackage.akrv) akzxVarL2.b;
            defpackage.aktb aktbVar5 = (defpackage.aktb) akzxVarL.r();
            j$.util.Objects.requireNonNull(aktbVar5);
            akrvVar6.s = aktbVar5;
            akrvVar6.b |= 16384;
            akzxVar.u();
            defpackage.akrw akrwVar3 = (defpackage.akrw) akzxVar.b;
            defpackage.akrv akrvVar7 = (defpackage.akrv) akzxVarL2.r();
            j$.util.Objects.requireNonNull(akrvVar7);
            akrwVar3.f = akrvVar7;
            akrwVar3.b |= 32;
            boolean zContains2 = set.contains(defpackage.aegl.SYSTEM_TRAY);
            akrvVar3 = ((defpackage.akrw) akzxVar.b).f;
            if (akrvVar3 == null) {
                akrvVar3 = defpackage.akrv.a;
            }
            aktbVar2 = akrvVar3.s;
            if (aktbVar2 == null) {
                aktbVar2 = defpackage.aktb.a;
            }
            defpackage.akzx akzxVarL3 = aktbVar2.L();
            defpackage.agab.bz(akzxVarL3, 3, !zContains2);
            akrvVar4 = ((defpackage.akrw) akzxVar.b).f;
            if (akrvVar4 == null) {
                akrvVar4 = defpackage.akrv.a;
            }
            defpackage.akzx akzxVarL4 = akrvVar4.L();
            akzxVarL4.u();
            defpackage.akrv akrvVar8 = (defpackage.akrv) akzxVarL4.b;
            defpackage.aktb aktbVar6 = (defpackage.aktb) akzxVarL3.r();
            j$.util.Objects.requireNonNull(aktbVar6);
            akrvVar8.s = aktbVar6;
            akrvVar8.b |= 16384;
            akzxVar.u();
            defpackage.akrw akrwVar4 = (defpackage.akrw) akzxVar.b;
            defpackage.akrv akrvVar9 = (defpackage.akrv) akzxVarL4.r();
            j$.util.Objects.requireNonNull(akrvVar9);
            akrwVar4.f = akrvVar9;
            akrwVar4.b |= 32;
            akrvVar5 = ((defpackage.akrw) akzxVar.b).f;
            if (akrvVar5 == null) {
                akrvVar5 = defpackage.akrv.a;
            }
            defpackage.akzx akzxVarL5 = akrvVar5.L();
            defpackage.aooh.e(akzxVarL5, "toBuilder(...)");
            defpackage.aeds aedsVar = this.f;
            set2 = (java.util.Set) ((defpackage.amyw) aedsVar.a).b;
            if (set2.isEmpty()) {
                aktbVar3 = defpackage.aktb.a;
            } else {
                arrayList = new java.util.ArrayList(set2.size());
                it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((akpi) it.next()).g));
                }
                defpackage.akzx akzxVarM2 = defpackage.aktb.a.m();
                it2 = arrayList.iterator();
                iMax = 1;
                while (it2.hasNext()) {
                    iMax = java.lang.Math.max((((java.lang.Integer) it2.next()).intValue() / 64) + 1, iMax);
                }
                arrayList2 = new java.util.ArrayList(iMax);
                arrayList2.addAll(java.util.Collections.nCopies(iMax, 0L));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    int iIntValue = ((java.lang.Integer) it3.next()).intValue();
                    int i4 = iIntValue / 64;
                    arrayList2.set(i4, java.lang.Long.valueOf((1 << (iIntValue % 64)) | ((java.lang.Long) arrayList2.get(i4)).longValue()));
                }
                akzxVarM2.aI(arrayList2);
                aktbVar3 = (defpackage.aktb) akzxVarM2.r();
            }
            aktbVar4 = ((defpackage.akrv) akzxVarL5.b).s;
            if (aktbVar4 == null) {
                aktbVar4 = defpackage.aktb.a;
            }
            arrayList3 = new java.util.ArrayList();
            iMax2 = java.lang.Math.max(aktbVar3.b.size(), aktbVar4.b.size());
            for (i = 0; i < iMax2; i++) {
                if (i < aktbVar3.b.size()) {
                    jA = aktbVar3.b.a(i);
                } else {
                    jA = 0;
                }
                if (i < aktbVar4.b.size()) {
                    jA2 = aktbVar4.b.a(i);
                } else {
                    jA2 = 0;
                }
                arrayList3.add(java.lang.Long.valueOf(jA | jA2));
            }
            defpackage.akzx akzxVarM3 = defpackage.aktb.a.m();
            akzxVarM3.aI(arrayList3);
            defpackage.aktb aktbVar7 = (defpackage.aktb) akzxVarM3.r();
            akzxVarL5.u();
            defpackage.akrv akrvVar10 = (defpackage.akrv) akzxVarL5.b;
            j$.util.Objects.requireNonNull(aktbVar7);
            akrvVar10.s = aktbVar7;
            akrvVar10.b |= 16384;
            akzxVarM = defpackage.aktj.a.m();
            it4 = ((java.util.Set) aedsVar.b.a()).iterator();
            while (it4.hasNext()) {
                akzxVarM.z((defpackage.aktj) it4.next());
            }
            set3 = (java.util.Set) ((defpackage.amyw) aedsVar.c).b;
            if (!set3.isEmpty()) {
                java.lang.Iterable iterable = (java.lang.Iterable) j$.util.Collection.-EL.stream(set3).map(defpackage.aeds.d).collect(defpackage.aido.a);
                akzxVarM.u();
                aktjVar = (defpackage.aktj) akzxVarM.b;
                alakVar = aktjVar.e;
                if (!alakVar.c()) {
                    aktjVar.e = defpackage.alad.H(alakVar);
                }
                it5 = iterable.iterator();
                while (it5.hasNext()) {
                    aktjVar.e.g(((defpackage.aksr) it5.next()).C);
                }
            }
            defpackage.aktj aktjVar2 = (defpackage.aktj) akzxVarM.r();
            akzxVarL5.u();
            defpackage.akrv akrvVar11 = (defpackage.akrv) akzxVarL5.b;
            j$.util.Objects.requireNonNull(aktjVar2);
            akrvVar11.t = aktjVar2;
            akrvVar11.b |= 32768;
            akzxVar.u();
            defpackage.akrw akrwVar5 = (defpackage.akrw) akzxVar.b;
            defpackage.akrv akrvVar12 = (defpackage.akrv) akzxVarL5.r();
            j$.util.Objects.requireNonNull(akrvVar12);
            akrwVar5.f = akrvVar12;
            akrwVar5.b |= 32;
            defpackage.alad aladVarR = akzxVar.r();
            defpackage.aooh.e(aladVarR, "build(...)");
            return aladVarR;
        }
        defpackage.aooc.af(objC);
        defpackage.akzx akzxVarM4 = defpackage.akrw.a.m();
        java.lang.String strE = e();
        akzxVarM4.u();
        defpackage.akrw akrwVar6 = (defpackage.akrw) akzxVarM4.b;
        j$.util.Objects.requireNonNull(strE);
        akrwVar6.b |= 1;
        akrwVar6.c = strE;
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        akzxVarM4.u();
        defpackage.akrw akrwVar7 = (defpackage.akrw) akzxVarM4.b;
        j$.util.Objects.requireNonNull(id);
        akrwVar7.b |= 8;
        akrwVar7.e = id;
        defpackage.akrv akrvVarF = f();
        akzxVarM4.u();
        defpackage.akrw akrwVar8 = (defpackage.akrw) akzxVarM4.b;
        j$.util.Objects.requireNonNull(akrvVarF);
        akrwVar8.f = akrvVarF;
        akrwVar8.b |= 32;
        if (aduwVar.a()) {
            if (!((java.lang.Boolean) this.g.a()).booleanValue()) {
                throw new java.lang.IllegalStateException("Registration data provider must be provided for GNP FCM registrations");
            }
            ahynVar = this.d;
        } else {
            if (!aduwVar.b()) {
                throw new java.lang.IllegalStateException("Unsupported targetType for RequestUtilImpl");
            }
            ahynVar = this.e;
        }
        aefpVar.a = accountRepresentation;
        aefpVar.b = set;
        aefpVar.g = akzxVarM4;
        aefpVar.f = (defpackage.ahys) ahynVar;
        aefpVar.e = 1;
        java.lang.Object objD = d(ahynVar, aefpVar);
        if (objD == obj) {
            return obj;
        }
        accountRepresentation2 = accountRepresentation;
        akzxVar = akzxVarM4;
        objC = objD;
        java.lang.String str = (java.lang.String) objC;
        if (str != null && str.length() != 0) {
            akzxVar.u();
            defpackage.akrw akrwVar9 = (defpackage.akrw) akzxVar.b;
            defpackage.akrw akrwVar10 = defpackage.akrw.a;
            j$.util.Objects.requireNonNull(str);
            akrwVar9.b |= 4;
            akrwVar9.d = str;
        }
        aefpVar.a = set;
        aefpVar.b = akzxVar;
        aefpVar.g = null;
        aefpVar.f = null;
        aefpVar.e = 2;
        objC = c(accountRepresentation2, ahynVar, aefpVar);
        if (objC == obj) {
            return obj;
        }
        akypVar = (defpackage.akyp) objC;
        if (akypVar != null) {
            akzxVar.u();
            defpackage.akrw akrwVar11 = (defpackage.akrw) akzxVar.b;
            defpackage.akrw akrwVar12 = defpackage.akrw.a;
            j$.util.Objects.requireNonNull(akypVar);
            akrwVar11.g = akypVar;
            akrwVar11.b |= 64;
        }
        boolean zContains3 = set.contains(defpackage.aegl.IN_APP);
        akrvVar = ((defpackage.akrw) akzxVar.b).f;
        if (akrvVar == null) {
            akrvVar = defpackage.akrv.a;
        }
        aktbVar = akrvVar.s;
        if (aktbVar == null) {
            aktbVar = defpackage.aktb.a;
        }
        defpackage.akzx akzxVarL6 = aktbVar.L();
        defpackage.agab.bz(akzxVarL6, 2, zContains3);
        akrvVar2 = ((defpackage.akrw) akzxVar.b).f;
        if (akrvVar2 == null) {
            akrvVar2 = defpackage.akrv.a;
        }
        defpackage.akzx akzxVarL7 = akrvVar2.L();
        akzxVarL7.u();
        defpackage.akrv akrvVar13 = (defpackage.akrv) akzxVarL7.b;
        defpackage.aktb aktbVar8 = (defpackage.aktb) akzxVarL6.r();
        j$.util.Objects.requireNonNull(aktbVar8);
        akrvVar13.s = aktbVar8;
        akrvVar13.b |= 16384;
        akzxVar.u();
        defpackage.akrw akrwVar13 = (defpackage.akrw) akzxVar.b;
        defpackage.akrv akrvVar14 = (defpackage.akrv) akzxVarL7.r();
        j$.util.Objects.requireNonNull(akrvVar14);
        akrwVar13.f = akrvVar14;
        akrwVar13.b |= 32;
        boolean zContains4 = set.contains(defpackage.aegl.SYSTEM_TRAY);
        akrvVar3 = ((defpackage.akrw) akzxVar.b).f;
        if (akrvVar3 == null) {
            akrvVar3 = defpackage.akrv.a;
        }
        aktbVar2 = akrvVar3.s;
        if (aktbVar2 == null) {
            aktbVar2 = defpackage.aktb.a;
        }
        defpackage.akzx akzxVarL8 = aktbVar2.L();
        defpackage.agab.bz(akzxVarL8, 3, !zContains4);
        akrvVar4 = ((defpackage.akrw) akzxVar.b).f;
        if (akrvVar4 == null) {
            akrvVar4 = defpackage.akrv.a;
        }
        defpackage.akzx akzxVarL9 = akrvVar4.L();
        akzxVarL9.u();
        defpackage.akrv akrvVar15 = (defpackage.akrv) akzxVarL9.b;
        defpackage.aktb aktbVar9 = (defpackage.aktb) akzxVarL8.r();
        j$.util.Objects.requireNonNull(aktbVar9);
        akrvVar15.s = aktbVar9;
        akrvVar15.b |= 16384;
        akzxVar.u();
        defpackage.akrw akrwVar14 = (defpackage.akrw) akzxVar.b;
        defpackage.akrv akrvVar16 = (defpackage.akrv) akzxVarL9.r();
        j$.util.Objects.requireNonNull(akrvVar16);
        akrwVar14.f = akrvVar16;
        akrwVar14.b |= 32;
        akrvVar5 = ((defpackage.akrw) akzxVar.b).f;
        if (akrvVar5 == null) {
            akrvVar5 = defpackage.akrv.a;
        }
        defpackage.akzx akzxVarL10 = akrvVar5.L();
        defpackage.aooh.e(akzxVarL10, "toBuilder(...)");
        defpackage.aeds aedsVar2 = this.f;
        set2 = (java.util.Set) ((defpackage.amyw) aedsVar2.a).b;
        if (set2.isEmpty()) {
            aktbVar3 = defpackage.aktb.a;
        } else {
            arrayList = new java.util.ArrayList(set2.size());
            it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Integer.valueOf(((akpi) it.next()).g));
            }
            defpackage.akzx akzxVarM5 = defpackage.aktb.a.m();
            it2 = arrayList.iterator();
            iMax = 1;
            while (it2.hasNext()) {
                iMax = java.lang.Math.max((((java.lang.Integer) it2.next()).intValue() / 64) + 1, iMax);
            }
            arrayList2 = new java.util.ArrayList(iMax);
            arrayList2.addAll(java.util.Collections.nCopies(iMax, 0L));
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                int iIntValue2 = ((java.lang.Integer) it3.next()).intValue();
                int i5 = iIntValue2 / 64;
                arrayList2.set(i5, java.lang.Long.valueOf((1 << (iIntValue2 % 64)) | ((java.lang.Long) arrayList2.get(i5)).longValue()));
            }
            akzxVarM5.aI(arrayList2);
            aktbVar3 = (defpackage.aktb) akzxVarM5.r();
        }
        aktbVar4 = ((defpackage.akrv) akzxVarL10.b).s;
        if (aktbVar4 == null) {
            aktbVar4 = defpackage.aktb.a;
        }
        arrayList3 = new java.util.ArrayList();
        iMax2 = java.lang.Math.max(aktbVar3.b.size(), aktbVar4.b.size());
        while (i < iMax2) {
            if (i < aktbVar3.b.size()) {
                jA = aktbVar3.b.a(i);
            } else {
                jA = 0;
            }
            if (i < aktbVar4.b.size()) {
                jA2 = aktbVar4.b.a(i);
            } else {
                jA2 = 0;
            }
            arrayList3.add(java.lang.Long.valueOf(jA | jA2));
        }
        defpackage.akzx akzxVarM6 = defpackage.aktb.a.m();
        akzxVarM6.aI(arrayList3);
        defpackage.aktb aktbVar10 = (defpackage.aktb) akzxVarM6.r();
        akzxVarL10.u();
        defpackage.akrv akrvVar17 = (defpackage.akrv) akzxVarL10.b;
        j$.util.Objects.requireNonNull(aktbVar10);
        akrvVar17.s = aktbVar10;
        akrvVar17.b |= 16384;
        akzxVarM = defpackage.aktj.a.m();
        it4 = ((java.util.Set) aedsVar2.b.a()).iterator();
        while (it4.hasNext()) {
            akzxVarM.z((defpackage.aktj) it4.next());
        }
        set3 = (java.util.Set) ((defpackage.amyw) aedsVar2.c).b;
        if (!set3.isEmpty()) {
            java.lang.Iterable iterable2 = (java.lang.Iterable) j$.util.Collection.-EL.stream(set3).map(defpackage.aeds.d).collect(defpackage.aido.a);
            akzxVarM.u();
            aktjVar = (defpackage.aktj) akzxVarM.b;
            alakVar = aktjVar.e;
            if (!alakVar.c()) {
                aktjVar.e = defpackage.alad.H(alakVar);
            }
            it5 = iterable2.iterator();
            while (it5.hasNext()) {
                aktjVar.e.g(((defpackage.aksr) it5.next()).C);
            }
        }
        defpackage.aktj aktjVar3 = (defpackage.aktj) akzxVarM.r();
        akzxVarL10.u();
        defpackage.akrv akrvVar18 = (defpackage.akrv) akzxVarL10.b;
        j$.util.Objects.requireNonNull(aktjVar3);
        akrvVar18.t = aktjVar3;
        akrvVar18.b |= 32768;
        akzxVar.u();
        defpackage.akrw akrwVar15 = (defpackage.akrw) akzxVar.b;
        defpackage.akrv akrvVar19 = (defpackage.akrv) akzxVarL10.r();
        j$.util.Objects.requireNonNull(akrvVar19);
        akrwVar15.f = akrvVar19;
        akrwVar15.b |= 32;
        defpackage.alad aladVarR2 = akzxVar.r();
        defpackage.aooh.e(aladVarR2, "build(...)");
        return aladVarR2;
    }

    @Override // defpackage.aefe
    public final akql b() {
        defpackage.akrv akrvVarF = f();
        defpackage.akzx akzxVarM = akql.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        java.lang.String strE = e();
        defpackage.aooh.f(strE, "value");
        akzxVarM.u();
        akql akqlVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strE);
        akqlVar.b |= 1;
        akqlVar.e = strE;
        java.lang.String id = java.util.TimeZone.getDefault().getID();
        defpackage.aooh.e(id, "getID(...)");
        defpackage.aooh.f(id, "value");
        akzxVarM.u();
        akql akqlVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        char c = 4;
        akqlVar2.c = 4;
        akqlVar2.d = id;
        defpackage.akzx akzxVarM2 = akqk.a.m();
        defpackage.aooh.f(akzxVarM2, "builder");
        float f = akrvVarF.c;
        akzxVarM2.u();
        akqk akqkVar = akzxVarM2.b;
        akqkVar.b |= 1;
        akqkVar.c = f;
        java.lang.String str = akrvVarF.f;
        defpackage.aooh.e(str, "getAppVersion(...)");
        defpackage.aooh.f(str, "value");
        akzxVarM2.u();
        akqk akqkVar2 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str);
        akqkVar2.b |= 8;
        akqkVar2.f = str;
        java.lang.String str2 = akrvVarF.g;
        defpackage.aooh.e(str2, "getAppVersionCode(...)");
        defpackage.aooh.f(str2, "value");
        akzxVarM2.u();
        akqk akqkVar3 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str2);
        akqkVar3.b |= 16;
        akqkVar3.g = str2;
        int i = akrvVarF.k;
        akzxVarM2.u();
        akqk akqkVar4 = akzxVarM2.b;
        akqkVar4.b |= 256;
        akqkVar4.k = i;
        akzxVarM2.u();
        akqk akqkVar5 = akzxVarM2.b;
        akqkVar5.d = 3;
        akqkVar5.b |= 2;
        java.lang.String str3 = akrvVarF.e;
        defpackage.aooh.e(str3, "getSdkVersion(...)");
        defpackage.aooh.f(str3, "value");
        akzxVarM2.u();
        akqk akqkVar6 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str3);
        akqkVar6.b |= 4;
        akqkVar6.e = str3;
        aeff aeffVar = aeff.a;
        defpackage.akrp akrpVarB = defpackage.akrp.b(akrvVarF.p);
        if (akrpVarB == null) {
            akrpVarB = defpackage.akrp.APP_BLOCK_STATE_UNKNOWN;
        }
        akqj akqjVar = (akqj) aeffVar.d(akrpVarB);
        if (akqjVar != null) {
            akzxVarM2.u();
            akqk akqkVar7 = akzxVarM2.b;
            akqkVar7.o = akqjVar.d;
            akqkVar7.b |= 2048;
        }
        boolean z = akrvVarF.q;
        akzxVarM2.u();
        akqk akqkVar8 = akzxVarM2.b;
        akqkVar8.b |= 4096;
        akqkVar8.p = z;
        android.content.Context context = this.b;
        defpackage.aooh.f(context, "context");
        int i2 = (context.getResources().getConfiguration().uiMode & 48) != 32 ? 2 : 3;
        akzxVarM2.u();
        akqk akqkVar9 = akzxVarM2.b;
        akqkVar9.r = i2 - 1;
        akqkVar9.b |= 65536;
        java.lang.String str4 = akrvVarF.h;
        defpackage.aooh.e(str4, "getOsVersion(...)");
        if (str4.length() > 0) {
            java.lang.String str5 = akrvVarF.h;
            defpackage.aooh.e(str5, "getOsVersion(...)");
            defpackage.aooh.f(str5, "value");
            akzxVarM2.u();
            akqk akqkVar10 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str5);
            akqkVar10.b |= 32;
            akqkVar10.h = str5;
        }
        java.lang.String str6 = akrvVarF.i;
        defpackage.aooh.e(str6, "getOsBuildId(...)");
        if (str6.length() > 0) {
            java.lang.String str7 = akrvVarF.i;
            defpackage.aooh.e(str7, "getOsBuildId(...)");
            defpackage.aooh.f(str7, "value");
            akzxVarM2.u();
            akqk akqkVar11 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str7);
            akqkVar11.b |= 64;
            akqkVar11.i = str7;
        }
        java.lang.String str8 = akrvVarF.j;
        defpackage.aooh.e(str8, "getOsModel(...)");
        if (str8.length() > 0) {
            java.lang.String str9 = akrvVarF.j;
            defpackage.aooh.e(str9, "getOsModel(...)");
            defpackage.aooh.f(str9, "value");
            akzxVarM2.u();
            akqk akqkVar12 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str9);
            akqkVar12.b |= 128;
            akqkVar12.j = str9;
        }
        java.lang.String str10 = akrvVarF.l;
        defpackage.aooh.e(str10, "getDeviceManufacturer(...)");
        if (str10.length() > 0) {
            java.lang.String str11 = akrvVarF.l;
            defpackage.aooh.e(str11, "getDeviceManufacturer(...)");
            defpackage.aooh.f(str11, "value");
            akzxVarM2.u();
            akqk akqkVar13 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str11);
            akqkVar13.b |= 512;
            akqkVar13.l = str11;
        }
        java.lang.String str12 = akrvVarF.r;
        defpackage.aooh.e(str12, "getCountryCode(...)");
        if (str12.length() > 0) {
            java.lang.String str13 = akrvVarF.r;
            defpackage.aooh.e(str13, "getCountryCode(...)");
            defpackage.aooh.f(str13, "value");
            akzxVarM2.u();
            akqk akqkVar14 = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str13);
            akqkVar14.b |= 8192;
            akqkVar14.q = str13;
        }
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(akzxVarM2.b.m);
        defpackage.aooh.e(listUnmodifiableList, "getChannelList(...)");
        new defpackage.alct(listUnmodifiableList);
        defpackage.alat<defpackage.akrs> alatVar = akrvVarF.n;
        defpackage.aooh.e(alatVar, "getChannelList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(alatVar, 10));
        for (defpackage.akrs akrsVar : alatVar) {
            defpackage.akzx akzxVarM3 = akpo.a.m();
            defpackage.aooh.f(akzxVarM3, "builder");
            java.lang.String str14 = akrsVar.c;
            defpackage.aooh.e(str14, "getChannelId(...)");
            defpackage.aooh.f(str14, "value");
            akzxVarM3.u();
            akpo akpoVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(str14);
            char c2 = c;
            akpoVar.b |= 1;
            akpoVar.c = str14;
            aefn aefnVar = aefn.a;
            defpackage.akrr akrrVarB = defpackage.akrr.b(akrsVar.e);
            if (akrrVarB == null) {
                akrrVarB = defpackage.akrr.IMPORTANCE_UNSPECIFIED;
            }
            akpn akpnVar = (akpn) aefnVar.d(akrrVarB);
            if (akpnVar != null) {
                akzxVarM3.u();
                akpo akpoVar2 = akzxVarM3.b;
                akpoVar2.e = akpnVar.h;
                akpoVar2.b |= 4;
            }
            aefl aeflVar = aefl.a;
            defpackage.akrq akrqVarB = defpackage.akrq.b(akrsVar.f);
            if (akrqVarB == null) {
                akrqVarB = defpackage.akrq.UNSPECIFIED;
            }
            akpm akpmVar = (akpm) aeflVar.d(akrqVarB);
            if (akpmVar != null) {
                akzxVarM3.u();
                akpo akpoVar3 = akzxVarM3.b;
                akpoVar3.f = akpmVar.d;
                akpoVar3.b |= 8;
            }
            java.lang.String str15 = akrsVar.d;
            defpackage.aooh.e(str15, "getGroupId(...)");
            if (str15.length() > 0) {
                java.lang.String str16 = akrsVar.d;
                defpackage.aooh.e(str16, "getGroupId(...)");
                defpackage.aooh.f(str16, "value");
                akzxVarM3.u();
                akpo akpoVar4 = akzxVarM3.b;
                j$.util.Objects.requireNonNull(str16);
                akpoVar4.b |= 2;
                akpoVar4.d = str16;
            }
            akpo akpoVarR = akzxVarM3.r();
            defpackage.aooh.e(akpoVarR, "build(...)");
            arrayList.add(akpoVarR);
            c = c2;
        }
        akzxVarM2.u();
        akqk akqkVar15 = akzxVarM2.b;
        defpackage.alat alatVar2 = akqkVar15.m;
        if (!alatVar2.c()) {
            akqkVar15.m = defpackage.alad.J(alatVar2);
        }
        defpackage.akyl.i(arrayList, akqkVar15.m);
        java.util.List listUnmodifiableList2 = j$.util.DesugarCollections.unmodifiableList(akzxVarM2.b.n);
        defpackage.aooh.e(listUnmodifiableList2, "getChannelGroupList(...)");
        new defpackage.alct(listUnmodifiableList2);
        defpackage.alat<defpackage.akru> alatVar3 = akrvVarF.o;
        defpackage.aooh.e(alatVar3, "getChannelGroupList(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(alatVar3, 10));
        for (defpackage.akru akruVar : alatVar3) {
            defpackage.akzx akzxVarM4 = akpl.a.m();
            defpackage.aooh.f(akzxVarM4, "builder");
            java.lang.String str17 = akruVar.c;
            defpackage.aooh.e(str17, "getGroupId(...)");
            defpackage.aooh.f(str17, "value");
            akzxVarM4.u();
            akpl akplVar = akzxVarM4.b;
            j$.util.Objects.requireNonNull(str17);
            akplVar.b |= 1;
            akplVar.c = str17;
            aefm aefmVar = aefm.a;
            akrt akrtVarB = akrt.b(akruVar.d);
            if (akrtVarB == null) {
                akrtVarB = akrt.a;
            }
            akpk akpkVar = (akpk) aefmVar.d(akrtVarB);
            if (akpkVar != null) {
                akzxVarM4.u();
                akpl akplVar2 = akzxVarM4.b;
                akplVar2.d = akpkVar.d;
                akplVar2.b |= 2;
            }
            akpl akplVarR = akzxVarM4.r();
            defpackage.aooh.e(akplVarR, "build(...)");
            arrayList2.add(akplVarR);
        }
        akzxVarM2.u();
        akqk akqkVar16 = akzxVarM2.b;
        defpackage.alat alatVar4 = akqkVar16.n;
        if (!alatVar4.c()) {
            akqkVar16.n = defpackage.alad.J(alatVar4);
        }
        defpackage.akyl.i(arrayList2, akqkVar16.n);
        akqk akqkVarR = akzxVarM2.r();
        defpackage.aooh.e(akqkVarR, "build(...)");
        akqk akqkVar17 = akqkVarR;
        defpackage.aooh.f(akqkVar17, "value");
        akzxVarM.u();
        akql akqlVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(akqkVar17);
        akqlVar3.f = akqkVar17;
        akqlVar3.b |= 2;
        akql akqlVarR = akzxVarM.r();
        defpackage.aooh.e(akqlVarR, "build(...)");
        return akqlVarR;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final java.lang.Object c(com.google.android.libraries.notifications.platform.registration.AccountRepresentation accountRepresentation, defpackage.ahyn ahynVar, defpackage.aoln aolnVar) {
        defpackage.aefr aefrVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.aefr) {
            aefrVar = (defpackage.aefr) aolnVar;
            int i = aefrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aefrVar.c = i - Integer.MIN_VALUE;
            } else {
                aefrVar = new defpackage.aefr(this, aolnVar);
            }
        } else {
            aefrVar = new defpackage.aefr(this, aolnVar);
        }
        java.lang.Object obj = aefrVar.a;
        int i2 = aefrVar.c;
        defpackage.akyp akypVar = null;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                if (accountRepresentation.b()) {
                    this.h.n(this.b.getPackageName(), this.c.a, true, true, "NO_DEVICE_PAYLOAD_REQUESTED");
                } else {
                    java.lang.Object obj2 = ((defpackage.ahys) ahynVar).a;
                    aefrVar.c = 1;
                    obj = null;
                }
                return akypVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
            str = "SUCCESS_REGISTRATION_DATA_PROVIDER";
            akypVar = (defpackage.akyp) obj;
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).v("Failed getting device payload");
            str = "EXCEPTION_REGISTRATION_DATA_PROVIDER";
        }
        java.lang.String str2 = str;
        this.h.n(this.b.getPackageName(), this.c.a, false, akypVar == null, str2);
        return akypVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.ahyn ahynVar, defpackage.aoln aolnVar) {
        defpackage.aefq aefqVar;
        if (aolnVar instanceof defpackage.aefq) {
            aefqVar = (defpackage.aefq) aolnVar;
            int i = aefqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aefqVar.c = i - Integer.MIN_VALUE;
            } else {
                aefqVar = new defpackage.aefq(this, aolnVar);
            }
        } else {
            aefqVar = new defpackage.aefq(this, aolnVar);
        }
        java.lang.Object obj = aefqVar.a;
        int i2 = aefqVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                java.lang.Object obj2 = ((defpackage.ahys) ahynVar).a;
                aefqVar.c = 1;
                obj = null;
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return (java.lang.String) obj;
        } catch (java.lang.Exception e) {
            ((defpackage.aiob) ((defpackage.aiob) a.c()).k(e)).v("Failed getting language code");
            return null;
        }
    }
}
