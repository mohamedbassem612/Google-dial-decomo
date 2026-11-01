package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xhb extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(adzd adzdVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = adzdVar;
        this.b = str;
        this.c = "oauth2:https://www.googleapis.com/auth/notifications";
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 15:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 17:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 18:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 19:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, xpb] */
    /* JADX WARN: Type inference failed for: r0v51, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, xjz] */
    /* JADX WARN: Type inference failed for: r1v141, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v43, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v51, types: [acab, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57, types: [aolr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v64, types: [acle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [acip, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v97, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aonj, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objD;
        java.lang.Object objC;
        java.lang.Object objA;
        java.lang.Object objK;
        aolu aoluVar;
        switch (this.$cid) {
            case 0:
                aolu aoluVar2 = aolu.a;
                int i = this.a;
                aooc.af(obj);
                if (i == 0) {
                    java.lang.Object obj2 = this.b;
                    java.lang.Object obj3 = this.c;
                    java.lang.Object obj4 = this.d;
                    this.a = 1;
                    if (((defpackage.xhd) obj2).g((java.lang.String) obj3, (android.os.PersistableBundle) obj4, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            case 1:
                aolu aoluVar3 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 != 0) {
                    objD = obj;
                } else {
                    java.lang.Object obj5 = this.d;
                    java.lang.Object obj6 = this.c;
                    this.a = 1;
                    objD = ((defpackage.xhd) obj5).d((java.lang.String) obj6, this);
                    if (objD == aoluVar3) {
                        return aoluVar3;
                    }
                }
                android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) objD;
                if (persistableBundle == null) {
                    return null;
                }
                return this.b.c(persistableBundle);
            case 2:
                aolu aoluVar4 = aolu.a;
                int i3 = this.a;
                aooc.af(obj);
                if (i3 != 0) {
                    objC = obj;
                } else {
                    ?? r1 = this.b;
                    defpackage.xmb xmbVar = (defpackage.xmb) r1;
                    aosy aosyVarAm = aoov.am(xmbVar.h(), 0, new defpackage.wcj((aonj) this.c, (aoln) null, 16, (byte[]) null), 3);
                    xmbVar.j(aosyVarAm);
                    java.lang.Object obj7 = this.d;
                    defpackage.xmb xmbVar2 = (defpackage.xmb) obj7;
                    aosy aosyVarAk = aoov.ak(xmbVar2.h(), new aosr("OnboardingTaskExecutionWatcher(" + defpackage.xfh.a(r1) + ')'), 1, new pzf(new defpackage.wcj(xmbVar, (aoln) null, 15), xmbVar2, (aoln) null, 6));
                    xmbVar2.j(aosyVarAk);
                    xmbVar.j(aosyVarAk);
                    apdm apdmVar = new apdm(u());
                    apdmVar.h(aosyVarAm.i(), new defpackage.uns((aoln) null, 4, (int[]) null));
                    apdmVar.h(aosyVarAk.i(), new bbf((aoln) null, 17, (boolean[][][]) null));
                    this.a = 1;
                    objC = apdm.c(apdmVar, this);
                    if (objC == aoluVar4) {
                        return aoluVar4;
                    }
                }
                defpackage.xmb xmbVar3 = (defpackage.xmb) this.b;
                defpackage.xhf resultDecoder = xmbVar3.a().getResultDecoder();
                defpackage.xkq xkqVarA = xmbVar3.a();
                long j = xmbVar3.b;
                android.os.PersistableBundle persistableBundle2 = (android.os.PersistableBundle) xmbVar3.a().getResultEncoder().b(objC);
                defpackage.xhn xhnVar = xmbVar3.i;
                return new defpackage.xmp(resultDecoder, xkqVarA, j, persistableBundle2, true == xhnVar.b() ? null : xhnVar);
            case 3:
                aolu aoluVar5 = aolu.a;
                int i4 = this.a;
                aooc.af(obj);
                if (i4 != 0) {
                    if (i4 == 1) {
                        objA = obj;
                    }
                    return aojh.a;
                }
                java.lang.Object obj8 = this.b;
                java.lang.Object obj9 = this.c;
                this.a = 1;
                objA = ((defpackage.ysb) obj8).a((defpackage.yse) obj9, this);
                if (objA == aoluVar5) {
                    return aoluVar5;
                }
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.c;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = ((defpackage.ysb) obj10).e;
                defpackage.ysc yscVar = (defpackage.ysc) objA;
                if (!aooh.n(yscVar, concurrentHashMap.get(obj11))) {
                    concurrentHashMap.put(obj11, yscVar);
                    defpackage.ysb.a.b().l("com/google/android/callcoreshared/aicore/availability/AiCoreAvailabilityImpl", "getLastAvailabilityAndUpdate$<anonymous>", 124, "AiCoreAvailabilityImpl.kt").I("[%s] onAiCoreAvailabilityStatusChanged: %s", obj11, yscVar);
                    java.lang.Object obj12 = this.d;
                    this.a = 2;
                    defpackage.toj tojVar = ((defpackage.tnq) obj12).a;
                    java.lang.Object objG = tojVar.g(new bqp(tojVar, yscVar, (aoln) null, 7), this);
                    if (objG != aoluVar5) {
                        objG = aojh.a;
                    }
                    if (objG != aoluVar5) {
                        objG = aojh.a;
                    }
                    if (objG == aoluVar5) {
                        return aoluVar5;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                aolu aoluVar6 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    java.lang.Object obj13 = this.d;
                    ?? r14 = this.c;
                    java.lang.Object obj14 = this.b;
                    this.a = 1;
                    aosc aoscVar = new aosc(ajsz.ap(this), 1);
                    aoscVar.z();
                    defpackage.abtr abtrVar = (defpackage.abtr) obj13;
                    ((apni) abtrVar.e).i(aoov.am((aoss) abtrVar.b, 0, new defpackage.zgc(abtrVar, aoscVar, (java.lang.String) obj14, r14, null), 3));
                    objK = aoscVar.k();
                    if (objK == aoluVar6) {
                        return aoluVar6;
                    }
                    return objK;
                }
                return obj;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                aolu aoluVar7 = aolu.a;
                int i6 = this.a;
                aooc.af(obj);
                if (i6 == 0) {
                    java.lang.Object obj15 = this.d;
                    java.lang.Object obj16 = this.b;
                    this.a = 1;
                    if (((abwh) obj15).a.e((ahbq) obj16, this) == aoluVar7) {
                        return aoluVar7;
                    }
                }
                ((abwh) this.d).b.e((java.util.Map) this.c);
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aolu aoluVar8 = aolu.a;
                int i7 = this.a;
                aooc.af(obj);
                if (i7 == 0) {
                    java.lang.Object obj17 = this.d;
                    java.lang.Object obj18 = this.b;
                    java.lang.Object obj19 = this.c;
                    this.a = 1;
                    if (((defpackage.afpl) obj17).b.a((akhi) obj18, (akhp) obj19, this) == aoluVar8) {
                        return aoluVar8;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                aolu aoluVar9 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 == 0) {
                    java.lang.Object obj20 = this.d;
                    java.lang.Object obj21 = this.b;
                    ?? r11 = this.c;
                    this.a = 1;
                    defpackage.afpl afplVar = (defpackage.afpl) ((defpackage.afpl) obj20).b;
                    objK = aoov.aj((aolr) afplVar.a, new defpackage.abos((java.util.Set) r11, afplVar, (acdl) obj21, (aoln) null, 2), this);
                    if (objK == aoluVar9) {
                        return aoluVar9;
                    }
                    return objK;
                }
                return obj;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                aoluVar = aolu.a;
                int i9 = this.a;
                aooc.af(obj);
                if (i9 == 0) {
                    java.lang.Object obj22 = this.d;
                    java.lang.Object obj23 = this.b;
                    acig acigVar = (acig) obj22;
                    adao adaoVar = acigVar.i;
                    java.lang.String str = ((aduy) obj23).b;
                    ajcq ajcqVarC = ((acgr) adaoVar.o(str)).c();
                    aooh.e(ajcqVarC, "getAll(...)");
                    java.lang.Object obj24 = this.c;
                    akhf akhfVarD = acigVar.d();
                    this.a = 1;
                    java.lang.Object objG2 = acigVar.g(ajcqVarC, akhfVarD, str, (akst) obj24, this);
                    if (objG2 != aoluVar) {
                        return objG2;
                    }
                    return aoluVar;
                }
                return obj;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                aolu aoluVar10 = aolu.a;
                int i10 = this.a;
                aooc.af(obj);
                if (i10 == 0) {
                    ?? r2 = this.d;
                    java.lang.Object obj25 = this.c;
                    java.lang.Object obj26 = this.b;
                    this.a = 1;
                    objK = r2.b((java.lang.String) obj25, (akhn) obj26, this);
                    if (objK == aoluVar10) {
                        return aoluVar10;
                    }
                    return objK;
                }
                return obj;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aoluVar = aolu.a;
                int i11 = this.a;
                aooc.af(obj);
                if (i11 == 0) {
                    acig acigVar2 = (acig) this.d;
                    java.lang.String str2 = (java.lang.String) this.c;
                    ajcq ajcqVarC2 = ((acgr) acigVar2.i.o(str2)).c();
                    aooh.e(ajcqVarC2, "getAll(...)");
                    java.lang.Object obj27 = this.b;
                    akhf akhfVarD2 = acigVar2.d();
                    this.a = 1;
                    java.lang.Object objG3 = acigVar2.g(ajcqVarC2, akhfVarD2, str2, (akst) obj27, this);
                    if (objG3 != aoluVar) {
                        return objG3;
                    }
                    return aoluVar;
                }
                return obj;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aolu aoluVar11 = aolu.a;
                int i12 = this.a;
                aooc.af(obj);
                if (i12 == 0) {
                    java.lang.Object obj28 = this.b;
                    java.lang.Object obj29 = this.d;
                    java.lang.Object obj30 = this.c;
                    this.a = 1;
                    if (((defpackage.afpl) obj28).b.a((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj29, (defpackage.acir) obj30, this) == aoluVar11) {
                        return aoluVar11;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aolu aoluVar12 = aolu.a;
                int i13 = this.a;
                aooc.af(obj);
                if (i13 == 0) {
                    java.lang.Object obj31 = this.d;
                    java.lang.Object obj32 = this.b;
                    akhp akhpVar = ((akhl) this.c).j;
                    if (akhpVar == null) {
                        akhpVar = akhp.a;
                    }
                    acab acabVar = ((acjk) obj31).e;
                    aooh.e(akhpVar, "getOnDeviceCapping(...)");
                    this.a = 1;
                    if (acabVar.a((akhi) obj32, akhpVar, this) == aoluVar12) {
                        return aoluVar12;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                aolu aoluVar13 = aolu.a;
                int i14 = this.a;
                aooc.af(obj);
                if (i14 == 0) {
                    java.lang.Object obj33 = this.c;
                    java.lang.Object obj34 = this.d;
                    java.lang.Object obj35 = this.b;
                    this.a = 1;
                    if (((defpackage.acjm) obj33).a.a((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj34, (defpackage.acir) obj35, this) == aoluVar13) {
                        return aoluVar13;
                    }
                }
                return aojh.a;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                aolu aoluVar14 = aolu.a;
                int i15 = this.a;
                aooc.af(obj);
                if (i15 == 0) {
                    java.lang.Object obj36 = this.c;
                    java.lang.Object obj37 = this.d;
                    java.lang.Object obj38 = this.b;
                    this.a = 1;
                    if (((defpackage.ackd) obj36).a.a((com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) obj37, (defpackage.acir) obj38, this) == aoluVar14) {
                        return aoluVar14;
                    }
                }
                return aojh.a;
            case 15:
                aolu aoluVar15 = aolu.a;
                int i16 = this.a;
                aooc.af(obj);
                if (i16 == 0 && angc.c()) {
                    java.lang.Object obj39 = this.d;
                    java.lang.Object obj40 = this.c;
                    java.lang.Object obj41 = this.b;
                    long epochMilli = j$.time.Instant.now().plusMillis(anfq.a.b().b()).toEpochMilli();
                    alat alatVar = ((akhn) obj41).b;
                    aooh.e(alatVar, "getPromoList(...)");
                    java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
                    java.util.Iterator it = alatVar.iterator();
                    while (it.hasNext()) {
                        akhq akhqVar = ((akhl) it.next()).c;
                        if (akhqVar == null) {
                            akhqVar = akhq.a;
                        }
                        alak alakVar = akhqVar.c;
                        aooh.e(alakVar, "getMendelIdList(...)");
                        ajsz.bv(arrayList, alakVar);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
                    for (java.lang.Integer num : arrayList) {
                        java.lang.String strValueOf = java.lang.String.valueOf(num);
                        akzx akzxVarM = akhm.a.m();
                        aooh.f(akzxVarM, "builder");
                        aooh.c(num);
                        int iIntValue = num.intValue();
                        akzxVarM.u();
                        akzxVarM.b.c = iIntValue;
                        xtq xtqVarC = defpackage.akmr.C(alcf.a.m());
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                        xtqVarC.am(epochMilli / 1000);
                        alcf alcfVarAl = xtqVarC.al();
                        aooh.f(alcfVarAl, "value");
                        akzxVarM.u();
                        akhm akhmVar = akzxVarM.b;
                        j$.util.Objects.requireNonNull(alcfVarAl);
                        akhmVar.d = alcfVarAl;
                        akhmVar.b |= 1;
                        akhm akhmVarP = akzxVarM.p();
                        aooh.e(akhmVarP, "build(...)");
                        arrayList2.add(defpackage.achu.a((java.lang.String) obj40, strValueOf, akhmVarP, 0L, epochMilli));
                    }
                    ajcq ajcqVarC3 = ((aclg) obj39).a.c(arrayList2);
                    aooh.e(ajcqVarC3, "put(...)");
                    this.a = 1;
                    if (aosv.D(ajcqVarC3, this) == aoluVar15) {
                        return aoluVar15;
                    }
                }
                return new adub(aojh.a);
            case 16:
                aolu aoluVar16 = aolu.a;
                try {
                    if (this.a != 0) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                        java.lang.Object obj42 = this.b;
                        if (obj42 != null) {
                            aii aiiVar = ((defpackage.acrz) this.d).c;
                            java.lang.Float f = new java.lang.Float(0.0f);
                            ajl ajlVar = ((defpackage.acsa) obj42).t;
                            this.a = 1;
                            if (aii.l(aiiVar, f, ajlVar, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar16) {
                                return aoluVar16;
                            }
                        }
                    }
                    java.lang.Object obj43 = this.d;
                    aoub aoubVar = ((defpackage.acrz) obj43).o;
                    if (aoubVar != null) {
                        aoubVar.s((java.util.concurrent.CancellationException) null);
                    }
                    aoub aoubVar2 = ((defpackage.acrz) obj43).p;
                    if (aoubVar2 != null) {
                        aoubVar2.s((java.util.concurrent.CancellationException) null);
                    }
                    aoub aoubVar3 = ((defpackage.acrz) obj43).q;
                    if (aoubVar3 != null) {
                        aoubVar3.s((java.util.concurrent.CancellationException) null);
                    }
                    aoub aoubVar4 = ((defpackage.acrz) obj43).r;
                    if (aoubVar4 != null) {
                        aoubVar4.s((java.util.concurrent.CancellationException) null);
                    }
                    aoub aoubVar5 = ((defpackage.acrz) obj43).s;
                    if (aoubVar5 != null) {
                        aoubVar5.s((java.util.concurrent.CancellationException) null);
                    }
                    aoub aoubVar6 = ((defpackage.acrz) obj43).t;
                    if (aoubVar6 != null) {
                        aoubVar6.s((java.util.concurrent.CancellationException) null);
                    }
                    ((defpackage.acrz) obj43).o = null;
                    ((defpackage.acrz) obj43).p = null;
                    ((defpackage.acrz) obj43).q = null;
                    ((defpackage.acrz) obj43).r = null;
                    ((defpackage.acrz) obj43).s = null;
                    ((defpackage.acrz) obj43).t = null;
                    this.c.a();
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    this.c.a();
                    throw th;
                }
            case 17:
                aolu aoluVar17 = aolu.a;
                int i17 = this.a;
                aooc.af(obj);
                if (i17 == 0) {
                    java.lang.Object obj44 = this.d;
                    java.lang.Object obj45 = this.b;
                    java.lang.Object obj46 = this.c;
                    this.a = 1;
                    objK = ((adzd) obj44).j((java.lang.String) obj45, (java.lang.String) obj46, this);
                    if (objK == aoluVar17) {
                        return aoluVar17;
                    }
                    return objK;
                }
                return obj;
            case 18:
                aolu aoluVar18 = aolu.a;
                int i18 = this.a;
                aooc.af(obj);
                if (i18 == 0) {
                    java.lang.Object obj47 = this.d;
                    edg edgVar = new edg(aoxo.a(new hlh(cdh.k(new defpackage.addr(obj47, 9)), this.b, 12)), 11);
                    avg avgVar = new avg(this.c, obj47, 10);
                    this.a = 1;
                    if (edgVar.fM(avgVar, this) == aoluVar18) {
                        return aoluVar18;
                    }
                }
                return aojh.a;
            case 19:
                aolu aoluVar19 = aolu.a;
                int i19 = this.a;
                aooc.af(obj);
                if (i19 == 0) {
                    java.lang.Object obj48 = this.d;
                    edg edgVar2 = new edg(aoxo.a(new hlh(cdh.k(new defpackage.addr(obj48, 10)), this.b, 13)), 12);
                    avg avgVar2 = new avg(this.c, obj48, 11);
                    this.a = 1;
                    if (edgVar2.fM(avgVar2, this) == aoluVar19) {
                        return aoluVar19;
                    }
                }
                return aojh.a;
            default:
                aolu aoluVar20 = aolu.a;
                int i20 = this.a;
                aooc.af(obj);
                if (i20 == 0) {
                    ?? r3 = this.c;
                    java.lang.Object obj49 = this.b;
                    this.a = 1;
                    aooc.X((aoub) r3, "Collection of responses completed exceptionally", (java.lang.Throwable) obj49);
                    java.lang.Object objN = r3.n(this);
                    if (objN != aoluVar20) {
                        objN = aojh.a;
                    }
                    if (objN == aoluVar20) {
                        return aoluVar20;
                    }
                }
                ((ajsz) this.d).dv("Collection of responses completed exceptionally", (java.lang.Throwable) this.b);
                return aojh.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [acle, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v34, types: [cer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xpb] */
    /* JADX WARN: Type inference failed for: r3v28, types: [aomy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Map] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.b;
                return new defpackage.xhb((defpackage.xhd) obj2, (java.lang.String) this.c, (android.os.PersistableBundle) this.d, aolnVar, 0);
            case 1:
                java.lang.Object obj3 = this.d;
                return new defpackage.xhb((defpackage.xhd) obj3, (java.lang.String) this.c, (defpackage.xpb) this.b, aolnVar, 1);
            case 2:
                java.lang.Object obj4 = this.b;
                return new defpackage.xhb((defpackage.xmb) obj4, (defpackage.xmb) this.d, (aonj) this.c, aolnVar, 2);
            case 3:
                java.lang.Object obj5 = this.b;
                return new defpackage.xhb((defpackage.ysb) obj5, (defpackage.yse) this.c, (defpackage.tnq) this.d, aolnVar, 3);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.xhb((defpackage.abtr) this.d, (aonj) this.c, (java.lang.String) this.b, aolnVar, 4);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                java.lang.Object obj6 = this.d;
                return new defpackage.xhb((abwh) obj6, (ahbq) this.b, (java.util.Map) this.c, aolnVar, 5);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                java.lang.Object obj7 = this.d;
                return new defpackage.xhb((defpackage.afpl) obj7, (akhi) this.b, (akhp) this.c, aolnVar, 6);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj8 = this.d;
                return new defpackage.xhb((defpackage.afpl) obj8, (acdl) this.b, (java.util.Set) this.c, aolnVar, 7);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                java.lang.Object obj9 = this.d;
                return new defpackage.xhb((acig) obj9, (aduy) this.b, (akst) this.c, aolnVar, 8);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return new defpackage.xhb((acle) this.d, (java.lang.String) this.c, (akhn) this.b, aolnVar, 9);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                java.lang.Object obj10 = this.d;
                return new defpackage.xhb((acig) obj10, (java.lang.String) this.c, (akst) this.b, aolnVar, 10);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                java.lang.Object obj11 = this.b;
                return new defpackage.xhb((defpackage.afpl) obj11, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.d, (defpackage.acir) this.c, aolnVar, 11);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                java.lang.Object obj12 = this.d;
                return new defpackage.xhb((acjk) obj12, (akhi) this.b, (akhl) this.c, aolnVar, 12);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj13 = this.c;
                return new defpackage.xhb((defpackage.acjm) obj13, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.d, (defpackage.acir) this.b, aolnVar, 13);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj14 = this.c;
                return new defpackage.xhb((defpackage.ackd) obj14, (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) this.d, (defpackage.acir) this.b, aolnVar, 14);
            case 15:
                java.lang.Object obj15 = this.d;
                return new defpackage.xhb((aclg) obj15, (java.lang.String) this.c, (akhn) this.b, aolnVar, 15);
            case 16:
                java.lang.Object obj16 = this.b;
                return new defpackage.xhb((defpackage.acsa) obj16, (defpackage.acrz) this.d, (aomy) this.c, aolnVar, 16);
            case 17:
                return new defpackage.xhb((adzd) this.d, (java.lang.String) this.b, aolnVar, 17);
            case 18:
                return new defpackage.xhb((bcl) this.d, (cer) this.b, (aonn) this.c, aolnVar, 18);
            case 19:
                return new defpackage.xhb((bcl) this.d, this.b, this.c, aolnVar, 19, null);
            default:
                return new defpackage.xhb((aoub) this.c, (java.lang.Exception) this.b, (ajsz) this.d, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(abwh abwhVar, ahbq ahbqVar, java.util.Map map, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = abwhVar;
        this.b = ahbqVar;
        this.c = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(acig acigVar, aduy aduyVar, akst akstVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = acigVar;
        this.b = aduyVar;
        this.c = akstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(acig acigVar, java.lang.String str, akst akstVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = acigVar;
        this.c = str;
        this.b = akstVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(acjk acjkVar, akhi akhiVar, akhl akhlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = acjkVar;
        this.b = akhiVar;
        this.c = akhlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.acjm acjmVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = acjmVar;
        this.d = promoContext;
        this.b = acirVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.ackd ackdVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = ackdVar;
        this.d = promoContext;
        this.b = acirVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(acle acleVar, java.lang.String str, akhn akhnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = acleVar;
        this.c = str;
        this.b = akhnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(aclg aclgVar, java.lang.String str, akhn akhnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = aclgVar;
        this.c = str;
        this.b = akhnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.acsa acsaVar, defpackage.acrz acrzVar, aomy aomyVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = acsaVar;
        this.d = acrzVar;
        this.c = aomyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.abtr abtrVar, aonj aonjVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = abtrVar;
        this.c = aonjVar;
        this.b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.afpl afplVar, acdl acdlVar, java.util.Set set, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = afplVar;
        this.b = acdlVar;
        this.c = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.afpl afplVar, akhi akhiVar, akhp akhpVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = afplVar;
        this.b = akhiVar;
        this.c = akhpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.afpl afplVar, com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext promoContext, defpackage.acir acirVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = afplVar;
        this.d = promoContext;
        this.c = acirVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(aoub aoubVar, java.lang.Exception exc, ajsz ajszVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aoubVar;
        this.b = exc;
        this.d = ajszVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(bcl bclVar, cer cerVar, aonn aonnVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = bclVar;
        this.b = cerVar;
        this.c = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(bcl bclVar, cer cerVar, aonn aonnVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = bclVar;
        this.b = cerVar;
        this.c = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.xhd xhdVar, java.lang.String str, android.os.PersistableBundle persistableBundle, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = xhdVar;
        this.c = str;
        this.d = persistableBundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.xhd xhdVar, java.lang.String str, defpackage.xpb xpbVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = xhdVar;
        this.c = str;
        this.b = xpbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.xmb xmbVar, defpackage.xmb xmbVar2, aonj aonjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = xmbVar;
        this.d = xmbVar2;
        this.c = aonjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhb(defpackage.ysb ysbVar, defpackage.yse yseVar, defpackage.tnq tnqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ysbVar;
        this.c = yseVar;
        this.d = tnqVar;
    }
}
