package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gpd {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.lang.Object e;
    public final java.lang.Object f;

    public gpd(androidx.window.extensions.embedding.ActivityEmbeddingComponent activityEmbeddingComponent, defpackage.goe goeVar) {
        if (activityEmbeddingComponent == null) {
            defpackage.aooh.i("embeddingExtension");
        }
        this.a = activityEmbeddingComponent;
        this.b = goeVar;
        this.c = new java.util.concurrent.locks.ReentrantLock();
        this.d = new android.util.ArrayMap();
        this.e = new android.util.ArrayMap();
        this.f = new android.util.ArrayMap();
        new android.util.ArrayMap();
        new defpackage.gms().a(8);
        goy$.ExternalSyntheticApiModelOutline3.m$1(activityEmbeddingComponent, new androidx.window.extensions.core.util.function.Function() { // from class: gpc
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r16v0 */
            /* JADX WARN: Type inference failed for: r16v1, types: [java.util.concurrent.locks.Lock] */
            /* JADX WARN: Type inference failed for: r16v2 */
            /* JADX WARN: Type inference failed for: r16v3, types: [java.util.concurrent.locks.Lock] */
            /* JADX WARN: Type inference failed for: r16v4 */
            /* JADX WARN: Type inference failed for: r16v5 */
            /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.concurrent.locks.Lock] */
            @Override // androidx.window.extensions.core.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) throws java.lang.Throwable {
                ?? r16;
                gor gorVar;
                ?? r17;
                int iMin;
                int i;
                int i2;
                int iMin2;
                defpackage.gmv gmvVarC;
                defpackage.gpd gpdVar = this.a;
                androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams activityStackAttributesCalculatorParamsM = goy$.ExternalSyntheticApiModelOutline3.m(obj);
                ?? r8 = gpdVar.c;
                r8.lock();
                try {
                    androidx.window.extensions.embedding.ParentContainerInfo parentContainerInfoM = goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM);
                    defpackage.aooh.e(parentContainerInfoM, "getParentContainerInfo(...)");
                    defpackage.gre greVarJ = defpackage.gus.J();
                    android.content.res.Configuration configurationM = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(configurationM, "getConfiguration(...)");
                    android.view.WindowMetrics windowMetricsM = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowMetricsM, "getWindowMetrics(...)");
                    float fB = greVarJ.b(configurationM, windowMetricsM);
                    defpackage.gqf gqfVar = defpackage.gqg.a;
                    android.view.WindowMetrics windowMetricsM2 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowMetricsM2, "getWindowMetrics(...)");
                    defpackage.gqe gqeVarA = gqfVar.a(windowMetricsM2, fB);
                    java.lang.String strM = goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM);
                    defpackage.aooh.e(strM, "getActivityStackTag(...)");
                    android.os.Bundle bundleM = goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM);
                    defpackage.aooh.e(bundleM, "getLaunchOptions(...)");
                    defpackage.aooh.f(bundleM, "<this>");
                    android.os.Bundle bundle = bundleM.getBundle("androidx.window.embedding.EmbeddingBounds");
                    if (bundle == null) {
                        r17 = r8;
                        gorVar = null;
                    } else {
                        r16 = r8;
                        try {
                            gorVar = new gor(new gon(bundle.getInt("androidx.window.embedding.EmbeddingBounds.alignment")), fsu.D(bundle, "androidx.window.embedding.EmbeddingBounds.width"), fsu.D(bundle, "androidx.window.embedding.EmbeddingBounds.height"));
                            r17 = r16;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            r16.unlock();
                            throw th;
                        }
                    }
                    gpa gpaVar = gorVar == null ? null : new gpa(gorVar);
                    android.view.WindowMetrics windowMetricsM3 = goy$.ExternalSyntheticApiModelOutline3.m(goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM));
                    defpackage.aooh.e(windowMetricsM3, "getWindowMetrics(...)");
                    gqfVar.a(windowMetricsM3, fB);
                    android.content.res.Configuration configurationM2 = goy$.ExternalSyntheticApiModelOutline3.m(goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM));
                    defpackage.aooh.e(configurationM2, "getConfiguration(...)");
                    androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfoM = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowLayoutInfoM, "getWindowLayoutInfo(...)");
                    fsu.z(gqeVarA, windowLayoutInfoM);
                    defpackage.aooh.f(strM, "tag");
                    defpackage.aooh.f(configurationM2, "configuration");
                    defpackage.aooh.f(strM, "overlayTag");
                    gpa gpaVar2 = (gpa) gpdVar.d.get(strM);
                    if (gpaVar2 != null) {
                        gpaVar = gpaVar2;
                    } else if (gpaVar == null) {
                        throw new java.lang.IllegalArgumentException("Can't retrieve overlay attributes from launch options");
                    }
                    r17.lock();
                    r17.unlock();
                    gpdVar.e.put(strM, gpaVar);
                    android.os.Bundle bundleM2 = goy$.ExternalSyntheticApiModelOutline3.m(activityStackAttributesCalculatorParamsM);
                    defpackage.aooh.e(bundleM2, "getLaunchOptions(...)");
                    gor gorVar2 = gpaVar.a;
                    defpackage.aooh.f(bundleM2, "<this>");
                    defpackage.aooh.f(gorVar2, "embeddingBounds");
                    gon gonVar = gorVar2.b;
                    bundleM2.putInt("androidx.window.embedding.ActivityStackAlignment", gonVar.e);
                    androidx.window.extensions.embedding.ActivityStackAttributes.Builder builder = new androidx.window.extensions.embedding.ActivityStackAttributes.Builder();
                    java.lang.Object obj2 = gpdVar.b;
                    defpackage.aooh.f(parentContainerInfoM, "parentContainerInfo");
                    android.content.res.Configuration configurationM3 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(configurationM3, "getConfiguration(...)");
                    defpackage.gre greVarJ2 = defpackage.gus.J();
                    android.content.res.Configuration configurationM4 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(configurationM4, "getConfiguration(...)");
                    android.view.WindowMetrics windowMetricsM4 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowMetricsM4, "getWindowMetrics(...)");
                    float fB2 = greVarJ2.b(configurationM4, windowMetricsM4);
                    android.view.WindowMetrics windowMetricsM5 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowMetricsM5, "getWindowMetrics(...)");
                    defpackage.gqe gqeVarA2 = gqfVar.a(windowMetricsM5, fB2);
                    defpackage.gmv gmvVar = new defpackage.gmv(gqeVarA2.a());
                    androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfoM2 = goy$.ExternalSyntheticApiModelOutline3.m(parentContainerInfoM);
                    defpackage.aooh.e(windowLayoutInfoM2, "getWindowLayoutInfo(...)");
                    gpe gpeVar = new gpe(gmvVar, fsu.z(gqeVarA2, windowLayoutInfoM2), configurationM3, fB2);
                    defpackage.aooh.f(gorVar2, "embeddingBounds");
                    defpackage.gmv gmvVar2 = gpeVar.a;
                    gqd gqdVar = gpeVar.b;
                    defpackage.aooh.f(gorVar2, "embeddingBounds");
                    goq goqVar = goq.b;
                    gop gopVar = gorVar2.c;
                    if (defpackage.aooh.n(gopVar, goqVar) && defpackage.aooh.n(gorVar2.d, goqVar)) {
                        gmvVarC = defpackage.gmv.a;
                    } else {
                        if (gorVar2.b(gqdVar)) {
                            gopVar = new gop(0.5f);
                        }
                        gor gorVar3 = new gor(gonVar, gopVar, gorVar2.a(gqdVar) ? new gop(0.5f) : gorVar2.d);
                        int iB = gmvVar2.b();
                        gop gopVar2 = gorVar3.b(gqdVar) ? new gop(0.5f) : gorVar3.c;
                        if (gopVar2 instanceof gop) {
                            iMin = gopVar2.a(iB);
                        } else if (gopVar2 instanceof goo) {
                            iMin = java.lang.Math.min(iB, ((goo) gopVar2).a);
                        } else {
                            if (!defpackage.aooh.n(gopVar2, goq.c)) {
                                goq goqVar2 = gorVar3.c;
                                java.util.Objects.toString(goqVar2);
                                throw new java.lang.IllegalArgumentException("Unhandled width dimension=".concat(java.lang.String.valueOf(goqVar2)));
                            }
                            gpy gpyVarC = gor.c(gqdVar);
                            defpackage.aooh.c(gpyVarC);
                            android.graphics.Rect rectA = gpyVarC.a();
                            gon gonVar2 = gorVar3.b;
                            if (defpackage.aooh.n(gonVar2, gon.a)) {
                                iMin = rectA.left - gmvVar2.b;
                            } else {
                                if (!defpackage.aooh.n(gonVar2, gon.c)) {
                                    throw new java.lang.IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + gorVar3 + " taskBounds=" + gmvVar2 + " windowLayoutInfo=" + gqdVar);
                                }
                                iMin = gmvVar2.d - rectA.right;
                            }
                        }
                        int iA = gmvVar2.a();
                        gop gopVar3 = gorVar3.a(gqdVar) ? new gop(0.5f) : gorVar3.d;
                        if (gopVar3 instanceof gop) {
                            iMin2 = gopVar3.a(iA);
                        } else if (gopVar3 instanceof goo) {
                            iMin2 = java.lang.Math.min(iA, ((goo) gopVar3).a);
                        } else {
                            if (!defpackage.aooh.n(gopVar3, goq.c)) {
                                goq goqVar3 = gorVar3.c;
                                java.util.Objects.toString(goqVar3);
                                throw new java.lang.IllegalArgumentException("Unhandled width dimension=".concat(java.lang.String.valueOf(goqVar3)));
                            }
                            gpy gpyVarC2 = gor.c(gqdVar);
                            defpackage.aooh.c(gpyVarC2);
                            android.graphics.Rect rectA2 = gpyVarC2.a();
                            gon gonVar3 = gorVar3.b;
                            if (defpackage.aooh.n(gonVar3, gon.b)) {
                                i = rectA2.top;
                                i2 = gmvVar2.c;
                            } else {
                                if (!defpackage.aooh.n(gonVar3, gon.d)) {
                                    throw new java.lang.IllegalStateException("Unhandled condition to get height in pixel! embeddingBounds=" + gorVar3 + " taskBounds=" + gmvVar2 + " windowLayoutInfo=" + gqdVar);
                                }
                                i = gmvVar2.e;
                                i2 = rectA2.bottom;
                            }
                            iMin2 = i - i2;
                        }
                        int iB2 = gmvVar2.b();
                        int iA2 = gmvVar2.a();
                        if (iMin == iB2 && iMin2 == iA2) {
                            gmvVarC = defpackage.gmv.a;
                        } else {
                            defpackage.gmv gmvVar3 = new defpackage.gmv(0, 0, iMin, iMin2);
                            if (defpackage.aooh.n(gonVar, gon.b)) {
                                gmvVarC = fsu.C(gmvVar3, (iB2 - iMin) / 2, 0);
                            } else if (defpackage.aooh.n(gonVar, gon.a)) {
                                gmvVarC = fsu.C(gmvVar3, 0, (iA2 - iMin2) / 2);
                            } else if (defpackage.aooh.n(gonVar, gon.d)) {
                                gmvVarC = fsu.C(gmvVar3, (iB2 - iMin) / 2, iA2 - iMin2);
                            } else {
                                if (!defpackage.aooh.n(gonVar, gon.c)) {
                                    java.util.Objects.toString(gonVar);
                                    throw new java.lang.IllegalArgumentException("Unknown alignment: ".concat(java.lang.String.valueOf(gonVar)));
                                }
                                gmvVarC = fsu.C(gmvVar3, iB2 - iMin, (iA2 - iMin2) / 2);
                            }
                        }
                    }
                    androidx.window.extensions.embedding.ActivityStackAttributes activityStackAttributesM = goy$.ExternalSyntheticApiModelOutline3.m(goy$.ExternalSyntheticApiModelOutline3.m(goy$.ExternalSyntheticApiModelOutline3.m(builder, gmvVarC.c()), defpackage.goe.g()));
                    defpackage.aooh.e(activityStackAttributesM, "build(...)");
                    r17.unlock();
                    return activityStackAttributesM;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r16 = r8;
                }
            }
        });
        ddz$.ExternalSyntheticApiModelOutline0.m(activityEmbeddingComponent, new defpackage.so(3), new defpackage.gpb(new defpackage.ddz(this, 18)));
    }

    public static final unf p(upl uplVar) {
        int i;
        java.lang.String str = uplVar.c;
        defpackage.aooh.e(str, "getNumber(...)");
        int i2 = (int) uplVar.d;
        java.lang.String str2 = uplVar.e;
        defpackage.aooh.e(str2, "getLabel(...)");
        upk upkVarB = upk.b(uplVar.f);
        if (upkVarB == null) {
            upkVarB = upk.f;
        }
        int iOrdinal = upkVarB.ordinal();
        int i3 = 1;
        if (iOrdinal != 0) {
            int i4 = 2;
            if (iOrdinal != 1) {
                i3 = 3;
                if (iOrdinal != 2) {
                    i4 = 4;
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new java.lang.IllegalArgumentException("unsupported technology type");
                        }
                        i3 = 5;
                    }
                }
                i = i3;
            }
            i = i4;
        } else {
            i = i3;
        }
        return new unf(str, i2, str2, i, uplVar.g);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    public final defpackage.akzx a(defpackage.kiu kiuVar, int i) {
        kiw kiwVar;
        java.lang.String str;
        defpackage.kgu kguVarB;
        defpackage.akzx akzxVarM = abwd.a.m();
        defpackage.tkl tklVar = (defpackage.tkl) this.b;
        boolean z = tklVar.v(kiuVar) || ((((defpackage.tkk) this.d).a() || ((defpackage.iqm) this.f).b()) && tklVar.t(kiuVar)) || ((defpackage.kaw) this.c).t(kiuVar);
        kiw kiwVar2 = kiuVar.r;
        if (kiwVar2 == null) {
            kiwVar2 = kiw.a;
        }
        boolean z2 = kiwVar2.i;
        akzxVarM.u();
        abwd abwdVar = akzxVarM.b;
        abwdVar.b |= 32;
        abwdVar.h = z2;
        kiw kiwVar3 = kiuVar.r;
        if (kiwVar3 == null) {
            kiwVar3 = kiw.a;
        }
        boolean z3 = kiwVar3.j;
        akzxVarM.u();
        abwd abwdVar2 = akzxVarM.b;
        abwdVar2.b |= 128;
        abwdVar2.j = z3;
        java.lang.String string = ((defpackage.aeqx) this.e).d(kiuVar, true).toString();
        akzxVarM.u();
        abwd abwdVar3 = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        abwdVar3.b |= 1;
        abwdVar3.c = string;
        java.lang.String str2 = kiuVar.h;
        akzxVarM.u();
        abwd abwdVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        abwdVar4.b |= 2;
        abwdVar4.d = str2;
        hkd hkdVar = kiuVar.f;
        if (hkdVar == null) {
            hkdVar = hkd.a;
        }
        java.lang.String str3 = hkdVar.c;
        akzxVarM.u();
        abwd abwdVar5 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        abwdVar5.b |= 8192;
        abwdVar5.o = str3;
        boolean z4 = kiuVar.s;
        akzxVarM.u();
        abwd abwdVar6 = akzxVarM.b;
        abwdVar6.b |= 64;
        abwdVar6.i = z4;
        akzxVarM.u();
        abwd abwdVar7 = akzxVarM.b;
        abwdVar7.b |= 256;
        abwdVar7.k = z;
        boolean z5 = 1 == (kiuVar.o & 1);
        akzxVarM.u();
        abwd abwdVar8 = akzxVarM.b;
        abwdVar8.b |= 512;
        abwdVar8.l = z5;
        boolean z6 = (kiuVar.o & 32) == 32;
        akzxVarM.u();
        abwd abwdVar9 = akzxVarM.b;
        abwdVar9.b |= 1024;
        abwdVar9.m = z6;
        defpackage.kgz kgzVar = (defpackage.kgz) ((defpackage.zjm) this.a).g().orElse((java.lang.Object) null);
        if (kgzVar != null && kgzVar.d && (kguVarB = kgzVar.b(kiuVar)) != null && !kguVarB.j.isEmpty()) {
            str = kguVarB.j;
        } else if (i != 1) {
            kiwVar = kiuVar.r;
            if (kiwVar == null) {
                kiwVar = kiw.a;
            }
            str = kiwVar.e;
        } else {
            kiw kiwVar4 = kiuVar.r;
            if (kiwVar4 == null) {
                kiwVar4 = kiw.a;
            }
            if (kiwVar4.x.isEmpty()) {
                kiwVar = kiuVar.r;
                if (kiwVar == null) {
                    kiwVar = kiw.a;
                }
                str = kiwVar.e;
            } else {
                kiw kiwVar5 = kiuVar.r;
                if (kiwVar5 == null) {
                    kiwVar5 = kiw.a;
                }
                str = kiwVar5.x;
            }
        }
        akzxVarM.u();
        abwd abwdVar10 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        abwdVar10.b |= 4;
        abwdVar10.e = str;
        kiw kiwVar6 = kiuVar.r;
        if (kiwVar6 == null) {
            kiwVar6 = kiw.a;
        }
        long j = kiwVar6.f;
        akzxVarM.u();
        abwd abwdVar11 = akzxVarM.b;
        abwdVar11.b |= 8;
        abwdVar11.f = j;
        kiw kiwVar7 = kiuVar.r;
        if (kiwVar7 == null) {
            kiwVar7 = kiw.a;
        }
        java.lang.String str4 = kiwVar7.g;
        akzxVarM.u();
        abwd abwdVar12 = akzxVarM.b;
        j$.util.Objects.requireNonNull(str4);
        abwdVar12.b |= 16;
        abwdVar12.g = str4;
        defpackage.akzx akzxVarM2 = abvq.a.m();
        kiw kiwVar8 = kiuVar.r;
        if (kiwVar8 == null) {
            kiwVar8 = kiw.a;
        }
        akzxVarM2.u();
        abvq abvqVar = akzxVarM2.b;
        j$.util.Objects.requireNonNull(kiwVar8);
        abvqVar.c = kiwVar8;
        abvqVar.b |= 1;
        int i2 = kiuVar.q;
        akzxVarM2.u();
        abvq abvqVar2 = akzxVarM2.b;
        abvqVar2.b |= 2;
        abvqVar2.d = i2;
        long j2 = kiuVar.H;
        akzxVarM2.u();
        abvq abvqVar3 = akzxVarM2.b;
        abvqVar3.b |= 4;
        abvqVar3.e = j2;
        java.lang.String str5 = kiuVar.m;
        akzxVarM2.u();
        abvq abvqVar4 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str5);
        abvqVar4.b |= 8;
        abvqVar4.f = str5;
        java.lang.String str6 = kiuVar.n;
        akzxVarM2.u();
        abvq abvqVar5 = akzxVarM2.b;
        j$.util.Objects.requireNonNull(str6);
        abvqVar5.b |= 16;
        abvqVar5.g = str6;
        akzxVarM2.u();
        abvq abvqVar6 = akzxVarM2.b;
        abvqVar6.b |= 32;
        abvqVar6.h = z;
        abvq abvqVarR = akzxVarM2.r();
        akzxVarM.u();
        abwd abwdVar13 = akzxVarM.b;
        j$.util.Objects.requireNonNull(abvqVarR);
        abwdVar13.p = abvqVarR;
        abwdVar13.b |= 32768;
        return akzxVarM;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new hqi(this, (defpackage.aoln) null, 11), aolnVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    public final boolean c(defpackage.aoin aoinVar) {
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            return android.os.Build.DEVICE.equals("OP56CFL1");
        }
        java.lang.Object objA = aoinVar.a();
        if (objA == null) {
            defpackage.aooh.g();
        }
        return ((java.lang.Boolean) objA).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final boolean d() {
        return c(this.c) || f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final boolean e() {
        return c(this.f) || f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aoin, java.lang.Object] */
    public final boolean f() {
        defpackage.alat alatVar = ((defpackage.alfc) this.e.a()).b;
        defpackage.aooh.e(alatVar, "getElementList(...)");
        if (!(alatVar instanceof java.util.Collection) || !alatVar.isEmpty()) {
            java.util.Iterator<E> it = alatVar.iterator();
            while (it.hasNext()) {
                if (defpackage.aoov.s((java.lang.String) it.next(), android.os.Build.DEVICE, true)) {
                    return true;
                }
            }
        }
        defpackage.alat alatVar2 = ((defpackage.alfc) this.d.a()).b;
        defpackage.aooh.e(alatVar2, "getElementList(...)");
        if (!(alatVar2 instanceof java.util.Collection) || !alatVar2.isEmpty()) {
            java.util.Iterator<E> it2 = alatVar2.iterator();
            while (it2.hasNext()) {
                if (defpackage.aoov.s((java.lang.String) it2.next(), android.os.Build.DEVICE, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object g(defpackage.aoln aolnVar) throws java.lang.Throwable {
        ody odyVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof ody) {
            odyVar = (ody) aolnVar;
            int i = odyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                odyVar.b = i - Integer.MIN_VALUE;
            } else {
                odyVar = new ody(this, aolnVar);
            }
        } else {
            odyVar = new ody(this, aolnVar);
        }
        java.lang.Object obj3 = odyVar.a;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = odyVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                obj = this.d;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                odyVar.c = apdpVar;
                odyVar.b = 1;
                if (apdpVar.b(odyVar) != obj4) {
                }
                return obj4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = odyVar.c;
                try {
                    defpackage.aooc.af(obj3);
                    obj4 = (java.util.Map) obj3;
                    ((defpackage.apdp) obj2).d();
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj2).d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar2 = odyVar.c;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            ?? r6 = this.f;
            odyVar.c = (defpackage.apdp) obj;
            odyVar.b = 2;
            java.lang.Object objD = r6.d(odyVar);
            if (objD != obj4) {
                java.lang.Object obj5 = obj;
                obj3 = objD;
                obj2 = obj5;
                obj4 = (java.util.Map) obj3;
                ((defpackage.apdp) obj2).d();
            }
            return obj4;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object h(defpackage.aoln aolnVar) throws java.lang.Throwable {
        odz odzVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof odz) {
            odzVar = (odz) aolnVar;
            int i = odzVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                odzVar.b = i - Integer.MIN_VALUE;
            } else {
                odzVar = new odz(this, aolnVar);
            }
        } else {
            odzVar = new odz(this, aolnVar);
        }
        java.lang.Object obj3 = odzVar.a;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = odzVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                obj = this.d;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                odzVar.c = apdpVar;
                odzVar.b = 1;
                if (apdpVar.b(odzVar) != obj4) {
                }
                return obj4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = odzVar.c;
                try {
                    defpackage.aooc.af(obj3);
                    obj4 = (java.util.Map) obj3;
                    ((defpackage.apdp) obj2).d();
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj2).d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar2 = odzVar.c;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            ?? r6 = this.c;
            odzVar.c = (defpackage.apdp) obj;
            odzVar.b = 2;
            java.lang.Object objD = r6.d(odzVar);
            if (objD != obj4) {
                java.lang.Object obj5 = obj;
                obj3 = objD;
                obj2 = obj5;
                obj4 = (java.util.Map) obj3;
                ((defpackage.apdp) obj2).d();
            }
            return obj4;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    public final defpackage.zas i(java.lang.String str) {
        mbj mbjVar;
        ziv zivVar;
        java.lang.String strBY = null;
        if (!((java.lang.Boolean) this.d.a()).booleanValue()) {
            if (str != null) {
                j$.util.Optional optionalE = ((defpackage.zpm) this.b).e(str);
                defpackage.aooh.e(optionalE, "get(...)");
                if (optionalE == null) {
                    defpackage.aooh.i("<this>");
                }
                apqr apqrVar = (apqr) optionalE.orElse((java.lang.Object) null);
                if (apqrVar != null && (mbjVar = (mbj) apqrVar.a(mbj.class)) != null) {
                    strBY = mbjVar.bY();
                }
            }
            return j(strBY);
        }
        java.lang.Object obj = this.e;
        if (str != null) {
            j$.util.Optional optionalE2 = ((defpackage.zpm) ((defpackage.zth) obj).c).e(str);
            defpackage.aooh.e(optionalE2, "get(...)");
            if (optionalE2 == null) {
                defpackage.aooh.i("<this>");
            }
            apqr apqrVar2 = (apqr) optionalE2.orElse((java.lang.Object) null);
            if (apqrVar2 != null && (zivVar = (ziv) apqrVar2.a(ziv.class)) != null) {
                strBY = zivVar.bY();
            }
        }
        return ((defpackage.zth) obj).d(strBY);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v1, types: [aoir, java.lang.Object] */
    public final defpackage.zas j(java.lang.String str) {
        defpackage.zas zasVar;
        java.lang.Object objPutIfAbsent;
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            return ((defpackage.zth) this.e).d(str);
        }
        if (str != null) {
            ?? r0 = this.f;
            java.lang.Object mcbVar = r0.get(str);
            if (mcbVar == null && (objPutIfAbsent = r0.putIfAbsent(str, (mcbVar = new mcb(str, (defpackage.mca) this.a)))) != null) {
                mcbVar = objPutIfAbsent;
            }
            zasVar = (defpackage.zas) mcbVar;
        } else {
            zasVar = (mcb) this.c.a();
        }
        defpackage.aooh.c(zasVar);
        return zasVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object k(defpackage.aoln aolnVar) throws java.lang.Throwable {
        lrl lrlVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof lrl) {
            lrlVar = (lrl) aolnVar;
            int i = lrlVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrlVar.b = i - Integer.MIN_VALUE;
            } else {
                lrlVar = new lrl(this, aolnVar);
            }
        } else {
            lrlVar = new lrl(this, aolnVar);
        }
        java.lang.Object obj3 = lrlVar.a;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = lrlVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                obj = this.d;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                lrlVar.c = apdpVar;
                lrlVar.b = 1;
                if (apdpVar.b(lrlVar) != obj4) {
                }
                return obj4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = lrlVar.c;
                try {
                    defpackage.aooc.af(obj3);
                    obj4 = (java.util.Map) obj3;
                    ((defpackage.apdp) obj2).d();
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj2).d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar2 = lrlVar.c;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            ?? r6 = this.f;
            lrlVar.c = (defpackage.apdp) obj;
            lrlVar.b = 2;
            java.lang.Object objD = r6.d(lrlVar);
            if (objD != obj4) {
                java.lang.Object obj5 = obj;
                obj3 = objD;
                obj2 = obj5;
                obj4 = (java.util.Map) obj3;
                ((defpackage.apdp) obj2).d();
            }
            return obj4;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object l(defpackage.aoln aolnVar) throws java.lang.Throwable {
        lrm lrmVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof lrm) {
            lrmVar = (lrm) aolnVar;
            int i = lrmVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrmVar.b = i - Integer.MIN_VALUE;
            } else {
                lrmVar = new lrm(this, aolnVar);
            }
        } else {
            lrmVar = new lrm(this, aolnVar);
        }
        java.lang.Object obj3 = lrmVar.a;
        java.lang.Object obj4 = defpackage.aolu.a;
        int i2 = lrmVar.b;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj3);
                obj = this.c;
                defpackage.apdp apdpVar = (defpackage.apdp) obj;
                lrmVar.c = apdpVar;
                lrmVar.b = 1;
                if (apdpVar.b(lrmVar) != obj4) {
                }
                return obj4;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = lrmVar.c;
                try {
                    defpackage.aooc.af(obj3);
                    obj4 = (java.util.Map) obj3;
                    ((defpackage.apdp) obj2).d();
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    ((defpackage.apdp) obj2).d();
                    throw th;
                }
            }
            defpackage.apdp apdpVar2 = lrmVar.c;
            defpackage.aooc.af(obj3);
            obj = apdpVar2;
            ?? r6 = this.b;
            lrmVar.c = (defpackage.apdp) obj;
            lrmVar.b = 2;
            java.lang.Object objD = r6.d(lrmVar);
            if (objD != obj4) {
                java.lang.Object obj5 = obj;
                obj3 = objD;
                obj2 = obj5;
                obj4 = (java.util.Map) obj3;
                ((defpackage.apdp) obj2).d();
            }
            return obj4;
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj6 = obj;
            th = th3;
            obj2 = obj6;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object m(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new defpackage.ung(this, (defpackage.aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(defpackage.aoln aolnVar) {
        defpackage.unh unhVar;
        if (aolnVar instanceof defpackage.unh) {
            unhVar = (defpackage.unh) aolnVar;
            int i = unhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                unhVar.c = i - Integer.MIN_VALUE;
            } else {
                unhVar = new defpackage.unh(this, aolnVar);
            }
        } else {
            unhVar = new defpackage.unh(this, aolnVar);
        }
        java.lang.Object objO = unhVar.b;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = unhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objO);
            unhVar.c = 1;
            objO = o(unhVar);
            if (objO == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj2 = unhVar.a;
                defpackage.aooc.af(objO);
                return obj2;
            }
            defpackage.aooc.af(objO);
        }
        java.lang.Object obj3 = this.d;
        java.util.List list = (java.util.List) objO;
        defpackage.unv unvVarD = defpackage.ttj.D(list);
        unhVar.a = list;
        unhVar.c = 2;
        return ((defpackage.tvn) obj3).u(unvVarD, unhVar) != obj ? list : obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object o(defpackage.aoln aolnVar) {
        return defpackage.aoov.aj(this.a, new defpackage.unk(this, null), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object q(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        odw odwVar;
        afpl afplVar2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof odw) {
            odwVar = (odw) aolnVar;
            int i = odwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odwVar.c = i - Integer.MIN_VALUE;
            } else {
                odwVar = new odw(this, aolnVar);
            }
        } else {
            odwVar = new odw(this, aolnVar);
        }
        java.lang.Object objB = odwVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = odwVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                java.lang.Object obj3 = this.e;
                odwVar.a = afplVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                odwVar.d = apdpVar;
                odwVar.c = 1;
                if (apdpVar.b(odwVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) odwVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = odwVar.d;
                afplVar2 = (afpl) odwVar.a;
                defpackage.aooc.af(objB);
            }
            ?? r6 = this.c;
            odwVar.a = obj;
            odwVar.d = null;
            odwVar.c = 2;
            objB = defpackage.aazc.B(r6, afplVar2, null, odwVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object r(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        odx odxVar;
        afpl afplVar2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof odx) {
            odxVar = (odx) aolnVar;
            int i = odxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                odxVar.c = i - Integer.MIN_VALUE;
            } else {
                odxVar = new odx(this, aolnVar);
            }
        } else {
            odxVar = new odx(this, aolnVar);
        }
        java.lang.Object objB = odxVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = odxVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                java.lang.Object obj3 = this.d;
                odxVar.a = afplVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                odxVar.d = apdpVar;
                odxVar.c = 1;
                if (apdpVar.b(odxVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) odxVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = odxVar.d;
                afplVar2 = (afpl) odxVar.a;
                defpackage.aooc.af(objB);
            }
            ?? r6 = this.f;
            odxVar.a = obj;
            odxVar.d = null;
            odxVar.c = 2;
            objB = defpackage.aazc.B(r6, afplVar2, null, odxVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object s(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        lri lriVar;
        afpl afplVar2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof lri) {
            lriVar = (lri) aolnVar;
            int i = lriVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lriVar.c = i - Integer.MIN_VALUE;
            } else {
                lriVar = new lri(this, aolnVar);
            }
        } else {
            lriVar = new lri(this, aolnVar);
        }
        java.lang.Object objB = lriVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lriVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                java.lang.Object obj3 = this.c;
                lriVar.a = afplVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                lriVar.d = apdpVar;
                lriVar.c = 1;
                if (apdpVar.b(lriVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) lriVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = lriVar.d;
                afplVar2 = (afpl) lriVar.a;
                defpackage.aooc.af(objB);
            }
            ?? r6 = this.b;
            lriVar.a = obj;
            lriVar.d = null;
            lriVar.c = 2;
            objB = defpackage.aazc.B(r6, afplVar2, null, lriVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [abwo, java.lang.Object] */
    public final java.lang.Object t(afpl afplVar, defpackage.aoln aolnVar) throws java.lang.Throwable {
        lrj lrjVar;
        afpl afplVar2;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof lrj) {
            lrjVar = (lrj) aolnVar;
            int i = lrjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lrjVar.c = i - Integer.MIN_VALUE;
            } else {
                lrjVar = new lrj(this, aolnVar);
            }
        } else {
            lrjVar = new lrj(this, aolnVar);
        }
        java.lang.Object objB = lrjVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = lrjVar.c;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(objB);
                java.lang.Object obj3 = this.d;
                lrjVar.a = afplVar;
                defpackage.apdp apdpVar = (defpackage.apdp) obj3;
                lrjVar.d = apdpVar;
                lrjVar.c = 1;
                if (apdpVar.b(lrjVar) == aoluVar) {
                    return aoluVar;
                }
                afplVar2 = afplVar;
                obj = obj3;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = (defpackage.apdp) lrjVar.a;
                    try {
                        defpackage.aooc.af(objB);
                        defpackage.ahbq ahbqVar = (defpackage.ahbq) objB;
                        ((defpackage.apdp) obj2).d();
                        return java.lang.Boolean.valueOf(ahbqVar != null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ((defpackage.apdp) obj2).d();
                        throw th;
                    }
                }
                obj = lrjVar.d;
                afplVar2 = (afpl) lrjVar.a;
                defpackage.aooc.af(objB);
            }
            ?? r6 = this.f;
            lrjVar.a = obj;
            lrjVar.d = null;
            lrjVar.c = 2;
            objB = defpackage.aazc.B(r6, afplVar2, null, lrjVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj2 = obj;
            defpackage.ahbq ahbqVar2 = (defpackage.ahbq) objB;
            ((defpackage.apdp) obj2).d();
            return java.lang.Boolean.valueOf(ahbqVar2 != null);
        } catch (java.lang.Throwable th3) {
            java.lang.Object obj4 = obj;
            th = th3;
            obj2 = obj4;
            ((defpackage.apdp) obj2).d();
            throw th;
        }
    }

    public gpd(android.content.Context context, defpackage.vze vzeVar, defpackage.ahbv ahbvVar, defpackage.vea veaVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar) {
        this.b = context;
        this.f = vzeVar;
        this.d = ahbvVar;
        this.e = veaVar;
        this.c = ajctVar;
        this.a = aoinVar;
    }

    public gpd(defpackage.aeqx aeqxVar, defpackage.tkk tkkVar, defpackage.iqm iqmVar, defpackage.tkl tklVar, defpackage.kaw kawVar, defpackage.zjm zjmVar) {
        this.e = aeqxVar;
        this.d = tkkVar;
        this.f = iqmVar;
        this.b = tklVar;
        this.c = kawVar;
        this.a = zjmVar;
    }

    public gpd(defpackage.lsx lsxVar, defpackage.ltd ltdVar) {
        defpackage.aooh.f(lsxVar, "callerVerificationStateDao");
        defpackage.aooh.f(ltdVar, "spoofCallLogDao");
        this.a = lsxVar;
        this.e = ltdVar;
        this.c = new defpackage.apdp();
        this.d = new defpackage.apdp();
        this.b = defpackage.aazc.p("contact_checker_call_log_data", "caller_number", lsxVar, lrk.a, new defpackage.aeza());
        this.f = defpackage.aazc.o("contact_check_spoof_call_log_data", ltdVar, lrn.a, new defpackage.aeza());
    }

    public gpd(defpackage.aoin aoinVar, defpackage.zth zthVar, defpackage.mca mcaVar, defpackage.zpm zpmVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("useSharedInfra");
        }
        if (zthVar == null) {
            defpackage.aooh.i("sharedLoggerFactory");
        }
        if (mcaVar == null) {
            defpackage.aooh.i("legacyLogger");
        }
        if (zpmVar == null) {
            defpackage.aooh.i("callScopes");
        }
        this.d = aoinVar;
        this.e = zthVar;
        this.a = mcaVar;
        this.b = zpmVar;
        this.c = new defpackage.aoiy(new defpackage.mbe(this, 4));
        this.f = new j$.util.concurrent.ConcurrentHashMap();
    }

    public gpd(defpackage.oef oefVar, defpackage.oem oemVar) {
        if (oefVar == null) {
            defpackage.aooh.i("expressoCallLogDao");
        }
        if (oemVar == null) {
            defpackage.aooh.i("expressoHandshakeDao");
        }
        this.b = oefVar;
        this.a = oemVar;
        this.d = new defpackage.apdp();
        this.e = new defpackage.apdp();
        this.f = defpackage.aazc.o("expresso_call_log_data", oefVar, new defpackage.aoom() { // from class: oeb
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return java.lang.Long.valueOf(((defpackage.oel) obj).a);
            }
        }, new defpackage.aeza());
        this.c = defpackage.aazc.p("expresso_handshake_data", "caller_number", oemVar, new defpackage.aoom() { // from class: oea
            @Override // defpackage.aoom
            public final java.lang.Object b(java.lang.Object obj) {
                return ((defpackage.oes) obj).a;
            }
        }, new defpackage.aeza());
    }

    public gpd(defpackage.rsr rsrVar, android.content.Context context, defpackage.khr khrVar, defpackage.aolr aolrVar, defpackage.tkl tklVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (tklVar == null) {
            defpackage.aooh.i("peopleDirectoryContactStorage");
        }
        this.e = rsrVar;
        this.f = context;
        this.b = khrVar;
        this.a = aolrVar;
        this.c = tklVar;
        this.d = new defpackage.sso(context);
    }

    public gpd(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7) {
        if (aoinVar == null) {
            defpackage.aooh.i("directBootFlagsSynced");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableFlippablesSupport");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableFlippablesSupportOta");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("enableFlippablesRecentTab");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("enableFlippablesDialpad");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("motorolaFlippablesList");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("oppoFlippablesList");
        }
        this.b = aoinVar;
        this.c = aoinVar2;
        this.f = aoinVar3;
        this.a = aoinVar4;
        this.e = aoinVar6;
        this.d = aoinVar7;
    }

    public gpd(defpackage.uqc uqcVar, defpackage.zjm zjmVar, defpackage.aolr aolrVar, defpackage.tvn tvnVar, defpackage.ojo ojoVar) {
        if (uqcVar == null) {
            defpackage.aooh.i("speedDialUiItemMutator");
        }
        if (aolrVar == null) {
            defpackage.aooh.i("lightweightContext");
        }
        if (ojoVar == null) {
            defpackage.aooh.i("dialerContentResolver");
        }
        this.e = uqcVar;
        this.f = zjmVar;
        this.a = aolrVar;
        this.d = tvnVar;
        this.b = ojoVar;
        this.c = new java.util.concurrent.atomic.AtomicBoolean(false);
    }
}
