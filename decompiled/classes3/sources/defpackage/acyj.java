package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyj implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ acyj(acyu acyuVar, defpackage.acvw acvwVar, defpackage.acwb acwbVar, ajat ajatVar, int i) {
        this.$cid = i;
        this.b = acyuVar;
        this.c = acvwVar;
        this.d = acwbVar;
        this.a = ajatVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v28, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v30, types: [acwi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [ajat, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int i;
        int i2 = 0;
        int i3 = 1;
        android.net.Uri uriP = null;
        switch (this.$cid) {
            case 0:
                defpackage.acvu acvuVar = (defpackage.acvu) this.d;
                return ((acyu) this.a).n((defpackage.acwb) this.b, (acvh) this.c, acvuVar.s, acvuVar.t);
            case 1:
                defpackage.acvu acvuVar2 = (defpackage.acvu) this.d;
                return ((acyu) this.a).n((defpackage.acwb) this.b, (acvh) this.c, acvuVar2.s, acvuVar2.t);
            case 2:
                defpackage.acvu acvuVar3 = (defpackage.acvu) obj;
                java.lang.Object obj2 = this.c;
                if (obj2 == null && (obj2 = acvuVar3.m) == null) {
                    obj2 = defpackage.acvw.a;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = acvuVar3.o.iterator();
                while (true) {
                    java.lang.Object obj3 = this.d;
                    java.lang.Object obj4 = this.b;
                    if (!it.hasNext()) {
                        acyu acyuVar = (acyu) obj4;
                        return abrz.ac(arrayList).E(new kff(acyuVar, (defpackage.acwb) obj3, (ajat) this.a, arrayList, 18), acyuVar.f);
                    }
                    defpackage.acvr acvrVar = (defpackage.acvr) it.next();
                    if (!afsq.au(acvrVar)) {
                        int iAQ = a.aQ(acvuVar3.j);
                        if (iAQ == 0) {
                            iAQ = i3;
                        }
                        defpackage.acwe acweVarAB = afsq.aB(acvrVar, iAQ);
                        acyu acyuVar2 = (acyu) obj4;
                        ajcq ajcqVarL = acyuVar2.l(acvuVar3, acvrVar, acweVarAB);
                        defpackage.adcs adcsVarE = defpackage.adcs.e(ajcqVarL);
                        defpackage.acyh acyhVar = new defpackage.acyh(obj4, acvrVar, acvuVar3, i3);
                        java.util.concurrent.Executor executor = acyuVar2.f;
                        arrayList.add(acyuVar2.q(adcsVarE.g(acyhVar, executor).g(new defpackage.acyf(acyuVar2, acvrVar, acvuVar3, ajcqVarL, acweVarAB, 2), executor).d(defpackage.adbt.class, new defpackage.acyh(obj4, acvrVar, acvuVar3, i2), executor), new defpackage.adle(acyuVar2, (defpackage.acwb) obj3, acvuVar3, acvrVar, acweVarAB, (defpackage.acvw) obj2, 1)));
                        i3 = 1;
                    }
                }
                break;
            case 3:
                defpackage.acuv acuvVar = (defpackage.acuv) obj;
                if (acuvVar == defpackage.acuv.a) {
                    return ajcm.a;
                }
                java.lang.Object obj5 = this.d;
                java.lang.Object obj6 = this.c;
                java.lang.Object obj7 = this.a;
                java.lang.Object obj8 = this.b;
                ((defpackage.vaa) obj7).F(1008, (defpackage.acvu) obj6);
                ajcq ajcqVarZ = aiql.z(java.lang.Boolean.TRUE);
                if (acuvVar != defpackage.acuv.c) {
                    ajcqVarZ = ((acyu) obj8).d.i((defpackage.acwb) obj5);
                }
                return ((acyu) obj8).q(ajcqVarZ, new defpackage.acyg(obj8, (alad) obj5, 8));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                adbe.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", this.b);
                acyu acyuVar3 = (acyu) this.a;
                acyuVar3.c.a();
                acyu.B(acyuVar3.b, (defpackage.acvu) this.d, (defpackage.acvr) this.c, 26);
                return aiql.y((defpackage.aczv) obj);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.acyt acytVar = (defpackage.acyt) obj;
                java.lang.Object obj9 = this.d;
                if (acytVar != defpackage.acyt.b) {
                    acyu.w((java.util.List) this.a, (defpackage.acwb) obj9);
                }
                java.lang.Object obj10 = this.c;
                java.lang.Object obj11 = this.b;
                akzx akzxVarM = aiwm.a.m();
                defpackage.acwb acwbVar = (defpackage.acwb) obj9;
                java.lang.String str = acwbVar.c;
                akzxVarM.u();
                aiwm aiwmVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                aiwmVar.b |= 1;
                aiwmVar.c = str;
                java.lang.String str2 = acwbVar.d;
                akzxVarM.u();
                aiwm aiwmVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                aiwmVar2.b |= 4;
                aiwmVar2.e = str2;
                defpackage.acvu acvuVar4 = (defpackage.acvu) obj10;
                int i4 = acvuVar4.f;
                akzxVarM.u();
                aiwm aiwmVar3 = akzxVarM.b;
                aiwmVar3.b |= 2;
                aiwmVar3.d = i4;
                long j = acvuVar4.s;
                akzxVarM.u();
                aiwm aiwmVar4 = akzxVarM.b;
                aiwmVar4.b |= 64;
                aiwmVar4.i = j;
                java.lang.String str3 = acvuVar4.t;
                akzxVarM.u();
                aiwm aiwmVar5 = akzxVarM.b;
                j$.util.Objects.requireNonNull(str3);
                aiwmVar5.b |= 128;
                aiwmVar5.j = str3;
                ((acyu) obj11).b.q(3, akzxVarM.p(), 2);
                return aiql.z(obj10);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.acwg acwgVar = (defpackage.acwg) obj;
                defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
                if (acwaVarB == null) {
                    acwaVarB = defpackage.acwa.NONE;
                }
                if (acwaVarB != defpackage.acwa.DOWNLOAD_COMPLETE) {
                    return ajcm.a;
                }
                java.lang.Object obj12 = this.b;
                java.lang.Object obj13 = this.c;
                java.lang.Object obj14 = this.d;
                acyu acyuVar4 = (acyu) this.a;
                defpackage.acvu acvuVar5 = (defpackage.acvu) obj14;
                defpackage.acvr acvrVar2 = (defpackage.acvr) obj13;
                defpackage.adcs adcsVarE2 = defpackage.adcs.e(acyuVar4.f(acwgVar, acvrVar2, acvuVar5));
                defpackage.acwe acweVar = (defpackage.acwe) obj12;
                defpackage.acyf acyfVar = new defpackage.acyf(acyuVar4, acvrVar2, acvuVar5, acwgVar, acweVar, 3);
                java.util.concurrent.Executor executor2 = acyuVar4.f;
                return adcsVarE2.g(acyfVar, executor2).d(defpackage.adbt.class, new jsc(acyuVar4, acvuVar5, acvrVar2, acweVar, 20), executor2);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.adad adadVar = (defpackage.adad) obj;
                defpackage.acvu acvuVar6 = adadVar.a;
                if (acvuVar6 == null) {
                    acvuVar6 = adadVar.b;
                }
                defpackage.acvu acvuVar7 = acvuVar6;
                ?? r2 = this.a;
                java.lang.Object obj15 = this.c;
                if (acvuVar7 == null) {
                    acyu.w((java.util.List) r2, (defpackage.acwb) obj15);
                    return aiql.y(new java.lang.AssertionError("impossible error"));
                }
                ?? r4 = this.b;
                acyu acyuVar5 = (acyu) this.d;
                defpackage.acwb acwbVar2 = (defpackage.acwb) obj15;
                return acyuVar5.q(acyuVar5.C(acwbVar2, acvuVar7, (ajat) r4, new defpackage.vaa(acyuVar5.b)), new defpackage.acyj(acyuVar5, (java.lang.Object) r2, acvuVar7, acwbVar2, 5));
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                return ((aczk) this.d).d.e((defpackage.acwb) this.c, (defpackage.acvw) ((ahyn) this.b).e(), (ajat) this.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.acwg acwgVar2 = (defpackage.acwg) obj;
                java.lang.Object obj16 = this.d;
                java.lang.Object obj17 = this.c;
                java.lang.Object obj18 = this.a;
                if (acwgVar2 != null) {
                    defpackage.acwa acwaVarB2 = defpackage.acwa.b(acwgVar2.d);
                    if (acwaVarB2 == null) {
                        acwaVarB2 = defpackage.acwa.NONE;
                    }
                    if (acwaVarB2 == defpackage.acwa.DOWNLOAD_COMPLETE) {
                        defpackage.adas adasVar = (defpackage.adas) obj18;
                        uriP = abrz.P(adasVar.a, adasVar.m, acwgVar2.c, ((defpackage.acwe) this.b).e, adasVar.c, adasVar.k, false);
                    }
                }
                if (uriP == null) {
                    yg ygVarB = acvh.b();
                    ygVarB.b = defpackage.acvg.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return aiql.y(ygVarB.d());
                }
                try {
                    aogc aogcVar = ((defpackage.adas) obj18).o;
                    if (aogcVar.R((android.net.Uri) obj17)) {
                        aogcVar.P((android.net.Uri) obj17);
                    }
                    adae adaeVar = ((defpackage.adas) obj18).n;
                    if (!com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder.a) {
                        throw new defpackage.acxh("VcDiff decoding library is not initialized!");
                    }
                    try {
                        if (!com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder.a(adaeVar.c(uriP), adaeVar.c((android.net.Uri) obj16), adaeVar.c((android.net.Uri) obj17))) {
                            throw new defpackage.acxh("Failed to decode.");
                        }
                        aogcVar.P((android.net.Uri) obj16);
                        akzx akzxVarM2 = aiwm.a.m();
                        defpackage.adas adasVar2 = (defpackage.adas) obj18;
                        defpackage.acwb acwbVar3 = adasVar2.g;
                        java.lang.String str4 = acwbVar3.c;
                        akzxVarM2.u();
                        aiwm aiwmVar6 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str4);
                        aiwmVar6.b |= 1;
                        aiwmVar6.c = str4;
                        int i5 = adasVar2.h;
                        akzxVarM2.u();
                        aiwm aiwmVar7 = akzxVarM2.b;
                        aiwmVar7.b |= 2;
                        aiwmVar7.d = i5;
                        java.lang.String str5 = acwbVar3.d;
                        akzxVarM2.u();
                        aiwm aiwmVar8 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str5);
                        aiwmVar8.b |= 4;
                        aiwmVar8.e = str5;
                        long j2 = adasVar2.i;
                        akzxVarM2.u();
                        aiwm aiwmVar9 = akzxVarM2.b;
                        aiwmVar9.b |= 64;
                        aiwmVar9.i = j2;
                        java.lang.String str6 = adasVar2.j;
                        akzxVarM2.u();
                        aiwm aiwmVar10 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(str6);
                        aiwmVar10.b |= 128;
                        aiwmVar10.j = str6;
                        aiwm aiwmVarP = akzxVarM2.p();
                        adba adbaVar = adasVar2.f;
                        defpackage.acvr acvrVar3 = adasVar2.d;
                        defpackage.acvv acvvVar = adasVar2.e;
                        long j3 = acvrVar3.e;
                        long j4 = acvvVar.d;
                        java.lang.String str7 = acvrVar3.c;
                        int i6 = 0;
                        while (i6 < acvrVar3.l.size()) {
                            int i7 = i6 + 1;
                            if (ahvr.r(((defpackage.acvv) acvrVar3.l.get(i6)).e, acvvVar.e)) {
                                i = i7;
                                adbaVar.o(aiwmVarP, 4, j3, j4, str7, i);
                                return ajcm.a;
                            }
                            i6 = i7;
                        }
                        i = 0;
                        adbaVar.o(aiwmVarP, 4, j3, j4, str7, i);
                        return ajcm.a;
                    } catch (afex e) {
                        throw new defpackage.acxh((java.lang.Throwable) e);
                    }
                } catch (java.io.IOException e2) {
                    defpackage.adas adasVar3 = (defpackage.adas) obj18;
                    adbe.g(e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", new java.lang.Object[]{"DeltaFileDownloaderCallbackImpl", adasVar3.e.c, adasVar3.d.g});
                    adasVar3.c.a();
                    yg ygVarB2 = acvh.b();
                    ygVarB2.b = defpackage.acvg.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    ygVarB2.c = e2;
                    return aiql.y(ygVarB2.d());
                }
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                int i8 = adbe.a;
                java.lang.Object obj19 = this.a;
                defpackage.adco adcoVar = (defpackage.adco) ((java.util.concurrent.atomic.AtomicReference) obj19).get();
                adcn adcnVar = (adcn) this.d;
                defpackage.abtr abtrVar = (defpackage.abtr) adcnVar.c.eZ();
                defpackage.afmm afmmVar = new defpackage.afmm(null, null);
                java.lang.Object obj20 = this.b;
                afmmVar.e((java.lang.String) obj20);
                afmmVar.b = adcn.b(adcoVar);
                return ahvr.I(abtrVar.a(afmmVar.d()), new defpackage.aczq(obj20, this.c, obj19, 9, (byte[]) null), adcnVar.d);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                return ((adcn) this.b).c((acwi) this.d, (android.net.Uri) this.c, (java.util.concurrent.atomic.AtomicReference) this.a);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i9 = adbe.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.a;
                defpackage.adco adcoVar2 = (defpackage.adco) atomicReference.get();
                adcn adcnVar2 = (adcn) this.d;
                defpackage.abtr abtrVar2 = (defpackage.abtr) adcnVar2.c.eZ();
                defpackage.afmm afmmVar2 = new defpackage.afmm(null, null);
                java.lang.String str8 = (java.lang.String) this.b;
                afmmVar2.e(str8);
                afmmVar2.b = adcn.b(adcoVar2);
                return ahvr.I(abtrVar2.a(afmmVar2.d()), new defpackage.acyf(adcnVar2, atomicReference, str8, adcoVar2, (android.net.Uri) this.c, 8), adcnVar2.d);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                java.lang.Object obj21 = this.d;
                java.lang.String str9 = ((adhb) obj21).b;
                final java.lang.Throwable th = (java.lang.Throwable) obj;
                adhl.a();
                java.lang.Object obj22 = this.a;
                java.lang.Object obj23 = this.b;
                final adhw adhwVar = (adhw) this.c;
                final com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) obj23;
                final gat gatVar = (gat) obj22;
                final adhw adhwVar2 = (adhw) obj21;
                final int i10 = 0;
                ((tvn) gatVar.b).P(new adfq() { // from class: adlh
                    public final void a(java.lang.Object obj24) {
                        int i11 = i10;
                        gat gatVar2 = gatVar;
                        if (i11 != 0) {
                            com.google.android.libraries.micore.superpacks.common.PackManifest packManifest2 = packManifest;
                            adhw adhwVar3 = adhwVar;
                            ((tvn) obj24).ac(adhwVar2, packManifest2.e(), ((adjz) gatVar2.e).i(adhwVar3), th);
                            return;
                        }
                        com.google.android.libraries.micore.superpacks.common.PackManifest packManifest3 = packManifest;
                        adhw adhwVar4 = adhwVar;
                        ((tvn) obj24).ab(adhwVar2, packManifest3.e(), ((adjz) gatVar2.e).i(adhwVar4), th);
                    }
                });
                return aiql.y(th);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.aezu aezuVar = (defpackage.aezu) aiql.H((java.util.concurrent.Future) this.b);
                if (aezuVar.c.isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj24 = this.a;
                java.lang.Object obj25 = this.d;
                java.lang.Object obj26 = this.c;
                aewq aewqVar = (aewq) obj26;
                return ajck.w(ajck.w(defpackage.aezf.b(aewqVar).c()).x(new defpackage.adek(((aezd) obj25).a, 15), aewqVar.c())).y(new defpackage.acyj(obj24, obj25, obj26, aezuVar, 15), aewqVar.c());
            case 15:
                java.lang.Object obj27 = this.a;
                if (!((java.lang.String) obj).equals(obj27)) {
                    return ajcm.a;
                }
                apnt apntVar = aezl.a;
                return (apntVar == null || !apntVar.g(((aezd) this.d).a, (java.lang.String) obj27)) ? ((aewq) this.c).b().b(((defpackage.aezu) this.b).c) : ajcm.a;
            default:
                return ((defpackage.abtr) this.a).h((com.google.apps.tiktok.account.AccountId) this.d, (android.content.Intent) this.c, (com.google.apps.tiktok.account.api.AccountOperationContext) this.b);
        }
    }

    public /* synthetic */ acyj(acyu acyuVar, defpackage.acwe acweVar, defpackage.acvu acvuVar, defpackage.acvr acvrVar, int i) {
        this.$cid = i;
        this.a = acyuVar;
        this.b = acweVar;
        this.d = acvuVar;
        this.c = acvrVar;
    }

    public /* synthetic */ acyj(acyu acyuVar, java.lang.Object obj, defpackage.acvu acvuVar, defpackage.acwb acwbVar, int i) {
        this.$cid = i;
        this.b = acyuVar;
        this.a = obj;
        this.c = acvuVar;
        this.d = acwbVar;
    }

    public /* synthetic */ acyj(adcn adcnVar, acwi acwiVar, android.net.Uri uri, java.util.concurrent.atomic.AtomicReference atomicReference, int i) {
        this.$cid = i;
        this.b = adcnVar;
        this.d = acwiVar;
        this.c = uri;
        this.a = atomicReference;
    }

    public /* synthetic */ acyj(adcn adcnVar, java.lang.String str, android.net.Uri uri, java.util.concurrent.atomic.AtomicReference atomicReference, int i) {
        this.$cid = i;
        this.d = adcnVar;
        this.b = str;
        this.c = uri;
        this.a = atomicReference;
    }

    public /* synthetic */ acyj(aewq aewqVar, ajcq ajcqVar, aezd aezdVar, java.lang.String str, int i) {
        this.$cid = i;
        this.c = aewqVar;
        this.b = ajcqVar;
        this.d = aezdVar;
        this.a = str;
    }

    public /* synthetic */ acyj(gat gatVar, adhw adhwVar, adhw adhwVar2, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, int i) {
        this.$cid = i;
        this.a = gatVar;
        this.c = adhwVar;
        this.d = adhwVar2;
        this.b = packManifest;
    }

    public /* synthetic */ acyj(java.lang.Object obj, defpackage.acwb acwbVar, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.d = obj;
        this.c = acwbVar;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ acyj(java.lang.Object obj, alad aladVar, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = aladVar;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ acyj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.$cid = i;
        this.a = obj;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }
}
