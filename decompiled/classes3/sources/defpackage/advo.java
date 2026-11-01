package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class advo extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    long e;
    int f;
    int g;
    final /* synthetic */ defpackage.advp h;
    final /* synthetic */ grp i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advo(defpackage.advp advpVar, grp grpVar, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.h = advpVar;
        this.i = grpVar;
        this.j = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:103:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:110:0x034e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0351  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [advp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v0, types: [advo, aoln] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [int] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final java.lang.Object b(java.lang.Object obj) {
        ?? r8;
        java.lang.Throwable th;
        ?? r10;
        byte[] bArr;
        android.os.Bundle bundle;
        ?? HasSystemFeature;
        boolean z;
        ahpm ahpmVar;
        java.lang.Object obj2;
        java.lang.Object obj3;
        long j;
        ?? r2;
        java.lang.Object objK;
        adub adtwVar;
        java.lang.String strValueOf;
        android.net.NetworkCapabilities networkCapabilities;
        gsd gsdVar;
        int length;
        boolean z2;
        gus gsdVar2;
        boolean z3;
        boolean z4;
        ?? r1 = this;
        java.lang.String str = "CHECK_FAILED";
        aolu aoluVar = aolu.a;
        try {
            if (r1.g == 0) {
                aooc.af(obj);
                r10 = r1.h;
                grp grpVar = r1.i;
                int i = r1.j;
                ahpm ahpmVarA = r10.d.a("GnpWorker");
                try {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    java.lang.String strC = grpVar.c("com.google.android.libraries.notifications.platform.JOB_ID");
                    if (strC == null) {
                        strC = "";
                    }
                    java.lang.String str2 = strC;
                    java.lang.String strC2 = grpVar.c("com.google.android.libraries.notifications.platform.JOB_KEY");
                    aooh.f(grpVar, "<this>");
                    java.lang.Object obj4 = grpVar.b.get("com.google.android.libraries.notifications.platform.WORKER_PARAMS");
                    if (obj4 instanceof java.lang.Object[]) {
                        try {
                            int length2 = ((java.lang.Object[]) obj4).length;
                            aib aibVar = new aib(obj4, 9);
                            bArr = new byte[length2];
                            for (int i2 = 0; i2 < length2; i2++) {
                                bArr[i2] = ((java.lang.Number) aibVar.a(java.lang.Integer.valueOf(i2))).byteValue();
                            }
                        } catch (java.lang.ClassCastException unused) {
                            bArr = null;
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr == null || (length = bArr.length) == 0) {
                        bundle = new android.os.Bundle();
                    } else {
                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                        parcelObtain.unmarshall(bArr, 0, length);
                        parcelObtain.setDataPosition(0);
                        aooh.e(parcelObtain, "apply(...)");
                        bundle = new android.os.Bundle();
                        bundle.readFromParcel(parcelObtain);
                        parcelObtain.recycle();
                    }
                    android.os.Bundle bundle2 = bundle;
                    try {
                        HasSystemFeature = r10.b.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
                    } catch (java.lang.Exception unused2) {
                        HasSystemFeature = 0;
                    }
                    if (strC2 == null) {
                        defpackage.advp.a.c().y("Job key is null. Job ID: %s.", str2);
                        gsdVar = new gsd();
                    } else {
                        adzf adzfVar = (adzf) r10.c.get(strC2);
                        if (adzfVar == null) {
                            defpackage.advp.a.c().I("Failed to find job, is it injected?. Job ID: %s, Job key: %s.", str2, strC2);
                            gsdVar = new gsd();
                        } else {
                            bundle2.putInt("com.google.android.libraries.notifications.platform.JOB_RETRY_COUNT", i);
                            try {
                                tvn tvnVar = r10.i;
                                adty adtyVar = adty.aO;
                                try {
                                    java.lang.Object systemService = ((android.content.Context) tvnVar.a).getSystemService("connectivity");
                                    aooh.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                                    android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) systemService;
                                    android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
                                    adtwVar = new adub(java.lang.Boolean.valueOf(activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)));
                                } catch (java.lang.Exception e) {
                                    adtwVar = new defpackage.adtw(e, adtyVar);
                                }
                                java.lang.Boolean bool = (java.lang.Boolean) adtwVar.d();
                                if (bool != null && (strValueOf = java.lang.String.valueOf(bool.booleanValue())) != null) {
                                    java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
                                    aooh.e(upperCase, "toUpperCase(...)");
                                    if (upperCase != null) {
                                        str = upperCase;
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                hgb.b(defpackage.advp.a.b(), "Failed incrementing GnpJobStartCount streamz", th2);
                            }
                            z = false;
                            ((afip) ((aeey) r10.f.a()).c.eZ()).b(1L, new java.lang.Object[]{r10.b.getPackageName(), r10.e.a, java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT), strC2, str, adzfVar.h() != 1 ? "NONE" : "ANY"});
                            try {
                                long jE = anfw.a.b().e();
                                ahpmVar = ahpmVarA;
                                try {
                                    defpackage.advn advnVar = new defpackage.advn(adzfVar, bundle2, r10, str2, strC2, epochMilli, HasSystemFeature, null);
                                    r1.a = ahpmVar;
                                    r1.b = r10;
                                    r1.c = strC2;
                                    r1.d = str2;
                                    r1.e = epochMilli;
                                    r1.f = HasSystemFeature;
                                    r1.g = 1;
                                    objK = aooh.K(jE, advnVar, (aoln) r1);
                                    if (objK == aoluVar) {
                                        return aoluVar;
                                    }
                                    r1 = ahpmVar;
                                    obj2 = str2;
                                    obj3 = strC2;
                                    j = epochMilli;
                                    r2 = HasSystemFeature;
                                    r10 = r10;
                                    gsdVar2 = (gus) objK;
                                } catch (java.util.concurrent.CancellationException e2) {
                                    e = e2;
                                    r1 = ahpmVar;
                                    obj2 = str2;
                                    obj3 = strC2;
                                    j = epochMilli;
                                    r2 = HasSystemFeature;
                                    defpackage.advp.a.b().k(e).I("Job cancelled. Job ID: '%s', key: '%s'", obj2, obj3);
                                    aeey aeeyVar = (aeey) ((defpackage.advp) r10).f.a();
                                    java.lang.String packageName = ((defpackage.advp) r10).b.getPackageName();
                                    java.lang.String str3 = ((defpackage.advp) r10).e.a;
                                    int i3 = android.os.Build.VERSION.SDK_INT;
                                    java.lang.String str4 = (java.lang.String) obj3;
                                    if (1 != r2) {
                                        z3 = z;
                                    } else {
                                        z3 = true;
                                    }
                                    aeeyVar.e(packageName, str3, i3, str4, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                                    adxm adxmVar = (adxm) ((defpackage.advp) r10).g.a();
                                    defpackage.adxn adxnVarO = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                                    adxnVarO.b((java.lang.String) obj3);
                                    adxmVar.a(adxnVarO);
                                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(e, adty.M));
                                    gsdVar2 = new gsd();
                                    r1 = r1;
                                    gus gusVar = gsdVar2;
                                    ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                                    return gusVar;
                                } catch (aovk e3) {
                                    e = e3;
                                    r1 = ahpmVar;
                                    obj2 = str2;
                                    obj3 = strC2;
                                    j = epochMilli;
                                    r2 = HasSystemFeature;
                                    defpackage.advp.a.b().k(e).I("Job timed out. Job ID: '%s', key: '%s'", obj2, obj3);
                                    aeey aeeyVar2 = (aeey) ((defpackage.advp) r10).f.a();
                                    java.lang.String packageName2 = ((defpackage.advp) r10).b.getPackageName();
                                    java.lang.String str5 = ((defpackage.advp) r10).e.a;
                                    int i4 = android.os.Build.VERSION.SDK_INT;
                                    java.lang.String str6 = (java.lang.String) obj3;
                                    if (1 != r2) {
                                        z4 = z;
                                    } else {
                                        z4 = true;
                                    }
                                    aeeyVar2.e(packageName2, str5, i4, str6, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                                    adxm adxmVar2 = (adxm) ((defpackage.advp) r10).g.a();
                                    defpackage.adxn adxnVarO2 = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                                    adxnVarO2.b((java.lang.String) obj3);
                                    adxmVar2.a(adxnVarO2);
                                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx((java.lang.Throwable) e, adty.O));
                                    gsdVar2 = new gsd();
                                    r1 = r1;
                                    gus gusVar2 = gsdVar2;
                                    ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                                    return gusVar2;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    r1 = ahpmVar;
                                    obj2 = str2;
                                    obj3 = strC2;
                                    j = epochMilli;
                                    r2 = HasSystemFeature;
                                    defpackage.advp.a.d().k(th).I("Job failed with exception. Job ID: '%s', key: '%s'", obj2, obj3);
                                    aeey aeeyVar3 = (aeey) ((defpackage.advp) r10).f.a();
                                    java.lang.String packageName3 = ((defpackage.advp) r10).b.getPackageName();
                                    java.lang.String str7 = ((defpackage.advp) r10).e.a;
                                    int i5 = android.os.Build.VERSION.SDK_INT;
                                    java.lang.String str8 = (java.lang.String) obj3;
                                    if (1 != r2) {
                                        z2 = z;
                                    } else {
                                        z2 = true;
                                    }
                                    aeeyVar3.e(packageName3, str7, i5, str8, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                                    adxm adxmVar3 = (adxm) ((defpackage.advp) r10).g.a();
                                    defpackage.adxn adxnVarO3 = ((gat) ((defpackage.advp) r10).h.a()).o(th);
                                    adxnVarO3.b((java.lang.String) obj3);
                                    adxmVar3.a(adxnVarO3);
                                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(th, adty.b));
                                    gsdVar2 = new gsd();
                                    r1 = r1;
                                    gus gusVar3 = gsdVar2;
                                    ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                                    return gusVar3;
                                }
                            } catch (aovk e4) {
                                e = e4;
                                ahpmVar = ahpmVarA;
                            } catch (java.util.concurrent.CancellationException e5) {
                                e = e5;
                                ahpmVar = ahpmVarA;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                ahpmVar = ahpmVarA;
                            }
                        }
                    }
                    gsd gsdVar3 = gsdVar;
                    ajsz.ak(ahpmVarA, (java.lang.Throwable) null);
                    return gsdVar3;
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    r8 = ahpmVarA;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th6) {
                        ajsz.ak((java.io.Closeable) r8, th);
                        throw th6;
                    }
                }
            }
            r2 = r1.f;
            j = r1.e;
            obj2 = r1.d;
            obj3 = r1.c;
            r10 = r1.b;
            r1 = r1.a;
            try {
                aooc.af(obj);
                objK = obj;
                z = false;
                r1 = r1;
                r2 = r2;
                r10 = r10;
                try {
                    gsdVar2 = (gus) objK;
                } catch (aovk e6) {
                    e = e6;
                    defpackage.advp.a.b().k(e).I("Job timed out. Job ID: '%s', key: '%s'", obj2, obj3);
                    aeey aeeyVar4 = (aeey) ((defpackage.advp) r10).f.a();
                    java.lang.String packageName4 = ((defpackage.advp) r10).b.getPackageName();
                    java.lang.String str9 = ((defpackage.advp) r10).e.a;
                    int i6 = android.os.Build.VERSION.SDK_INT;
                    java.lang.String str10 = (java.lang.String) obj3;
                    if (1 != r2) {
                        z4 = z;
                    } else {
                        z4 = true;
                    }
                    aeeyVar4.e(packageName4, str9, i6, str10, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                    adxm adxmVar4 = (adxm) ((defpackage.advp) r10).g.a();
                    defpackage.adxn adxnVarO4 = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                    adxnVarO4.b((java.lang.String) obj3);
                    adxmVar4.a(adxnVarO4);
                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx((java.lang.Throwable) e, adty.O));
                    gsdVar2 = new gsd();
                    r1 = r1;
                } catch (java.util.concurrent.CancellationException e7) {
                    e = e7;
                    defpackage.advp.a.b().k(e).I("Job cancelled. Job ID: '%s', key: '%s'", obj2, obj3);
                    aeey aeeyVar5 = (aeey) ((defpackage.advp) r10).f.a();
                    java.lang.String packageName5 = ((defpackage.advp) r10).b.getPackageName();
                    java.lang.String str11 = ((defpackage.advp) r10).e.a;
                    int i7 = android.os.Build.VERSION.SDK_INT;
                    java.lang.String str12 = (java.lang.String) obj3;
                    if (1 != r2) {
                        z3 = z;
                    } else {
                        z3 = true;
                    }
                    aeeyVar5.e(packageName5, str11, i7, str12, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                    adxm adxmVar5 = (adxm) ((defpackage.advp) r10).g.a();
                    defpackage.adxn adxnVarO5 = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                    adxnVarO5.b((java.lang.String) obj3);
                    adxmVar5.a(adxnVarO5);
                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(e, adty.M));
                    gsdVar2 = new gsd();
                    r1 = r1;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    defpackage.advp.a.d().k(th).I("Job failed with exception. Job ID: '%s', key: '%s'", obj2, obj3);
                    aeey aeeyVar6 = (aeey) ((defpackage.advp) r10).f.a();
                    java.lang.String packageName6 = ((defpackage.advp) r10).b.getPackageName();
                    java.lang.String str13 = ((defpackage.advp) r10).e.a;
                    int i8 = android.os.Build.VERSION.SDK_INT;
                    java.lang.String str14 = (java.lang.String) obj3;
                    if (1 != r2) {
                        z2 = z;
                    } else {
                        z2 = true;
                    }
                    aeeyVar6.e(packageName6, str13, i8, str14, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                    adxm adxmVar6 = (adxm) ((defpackage.advp) r10).g.a();
                    defpackage.adxn adxnVarO6 = ((gat) ((defpackage.advp) r10).h.a()).o(th);
                    adxnVarO6.b((java.lang.String) obj3);
                    adxmVar6.a(adxnVarO6);
                    ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(th, adty.b));
                    gsdVar2 = new gsd();
                    r1 = r1;
                }
            } catch (java.util.concurrent.CancellationException e8) {
                e = e8;
                z = false;
                defpackage.advp.a.b().k(e).I("Job cancelled. Job ID: '%s', key: '%s'", obj2, obj3);
                aeey aeeyVar7 = (aeey) ((defpackage.advp) r10).f.a();
                java.lang.String packageName7 = ((defpackage.advp) r10).b.getPackageName();
                java.lang.String str15 = ((defpackage.advp) r10).e.a;
                int i9 = android.os.Build.VERSION.SDK_INT;
                java.lang.String str16 = (java.lang.String) obj3;
                if (1 != r2) {
                    z3 = z;
                } else {
                    z3 = true;
                }
                aeeyVar7.e(packageName7, str15, i9, str16, "CANCELLED", "JOB_CANCELATION_FAILURE", z3);
                adxm adxmVar7 = (adxm) ((defpackage.advp) r10).g.a();
                defpackage.adxn adxnVarO7 = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                adxnVarO7.b((java.lang.String) obj3);
                adxmVar7.a(adxnVarO7);
                ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(e, adty.M));
                gsdVar2 = new gsd();
                r1 = r1;
                gus gusVar4 = gsdVar2;
                ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                return gusVar4;
            } catch (aovk e9) {
                e = e9;
                z = false;
                defpackage.advp.a.b().k(e).I("Job timed out. Job ID: '%s', key: '%s'", obj2, obj3);
                aeey aeeyVar8 = (aeey) ((defpackage.advp) r10).f.a();
                java.lang.String packageName8 = ((defpackage.advp) r10).b.getPackageName();
                java.lang.String str17 = ((defpackage.advp) r10).e.a;
                int i10 = android.os.Build.VERSION.SDK_INT;
                java.lang.String str18 = (java.lang.String) obj3;
                if (1 != r2) {
                    z4 = z;
                } else {
                    z4 = true;
                }
                aeeyVar8.e(packageName8, str17, i10, str18, "TIMEOUT", "JOB_EXECUTION_TIMEOUT_FAILURE", z4);
                adxm adxmVar8 = (adxm) ((defpackage.advp) r10).g.a();
                defpackage.adxn adxnVarO8 = ((gat) ((defpackage.advp) r10).h.a()).o(e);
                adxnVarO8.b((java.lang.String) obj3);
                adxmVar8.a(adxnVarO8);
                ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx((java.lang.Throwable) e, adty.O));
                gsdVar2 = new gsd();
                r1 = r1;
                gus gusVar5 = gsdVar2;
                ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                return gusVar5;
            } catch (java.lang.Throwable th8) {
                th = th8;
                z = false;
                defpackage.advp.a.d().k(th).I("Job failed with exception. Job ID: '%s', key: '%s'", obj2, obj3);
                aeey aeeyVar9 = (aeey) ((defpackage.advp) r10).f.a();
                java.lang.String packageName9 = ((defpackage.advp) r10).b.getPackageName();
                java.lang.String str19 = ((defpackage.advp) r10).e.a;
                int i11 = android.os.Build.VERSION.SDK_INT;
                java.lang.String str110 = (java.lang.String) obj3;
                if (1 != r2) {
                    z2 = z;
                } else {
                    z2 = true;
                }
                aeeyVar9.e(packageName9, str19, i11, str110, "EXCEPTION", "UNCAUGHT_EXCEPTION", z2);
                adxm adxmVar9 = (adxm) ((defpackage.advp) r10).g.a();
                defpackage.adxn adxnVarO9 = ((gat) ((defpackage.advp) r10).h.a()).o(th);
                adxnVarO9.b((java.lang.String) obj3);
                adxmVar9.a(adxnVarO9);
                ((defpackage.advp) r10).b(j, (java.lang.String) obj3, new defpackage.adtx(th, adty.b));
                gsdVar2 = new gsd();
                r1 = r1;
                gus gusVar6 = gsdVar2;
                ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                return gusVar6;
            }
            gus gusVar7 = gsdVar2;
            ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
            return gusVar7;
        } catch (java.lang.Throwable th9) {
            r8 = r1;
            th = th9;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.advo(this.h, this.i, this.j, aolnVar);
    }
}
