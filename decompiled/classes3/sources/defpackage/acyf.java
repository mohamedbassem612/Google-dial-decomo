package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acyf implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ acyf(acvl acvlVar, java.lang.String str, adba adbaVar, aogc aogcVar, android.net.Uri uri, int i) {
        this.$cid = i;
        this.b = acvlVar;
        this.c = str;
        this.a = adbaVar;
        this.e = aogcVar;
        this.d = uri;
    }

    /* JADX WARN: Type inference failed for: r0v68, types: [adba, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ajat, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v35, types: [albh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r2v27, types: [acvl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [acwi, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int iAe;
        int iAe2;
        zzd zzdVar;
        int i = 0;
        int i2 = 3;
        int i3 = 2;
        switch (this.$cid) {
            case 0:
                defpackage.acvu acvuVar = (defpackage.acvu) obj;
                java.lang.Object obj2 = this.c;
                java.lang.Object obj3 = this.b;
                java.lang.Object obj4 = this.a;
                if (acvuVar == null) {
                    acyu acyuVar = (acyu) obj4;
                    return acyuVar.q(acyuVar.g((defpackage.acwb) obj3, true), new defpackage.acyg(obj3, obj2, 5));
                }
                ((java.util.concurrent.atomic.AtomicReference) obj2).set(acvuVar);
                defpackage.acvs acvsVar = acvuVar.c;
                if (acvsVar == null) {
                    acvsVar = defpackage.acvs.a;
                }
                int i4 = acvsVar.g + 1;
                akzx akzxVarP = acvuVar.p();
                akzx akzxVarP2 = acvsVar.p();
                akzxVarP2.u();
                defpackage.acvs acvsVar2 = (defpackage.acvs) akzxVarP2.b;
                acvsVar2.b |= 16;
                acvsVar2.g = i4;
                akzxVarP.u();
                defpackage.acvu acvuVar2 = (defpackage.acvu) akzxVarP.b;
                defpackage.acvs acvsVar3 = (defpackage.acvs) akzxVarP2.p();
                j$.util.Objects.requireNonNull(acvsVar3);
                acvuVar2.c = acvsVar3;
                acvuVar2.b |= 1;
                defpackage.acvu acvuVar3 = (defpackage.acvu) akzxVarP.p();
                boolean z = (acvsVar.b & 8) != 0;
                boolean z2 = !z;
                if (!z) {
                    long jV = abrz.V();
                    defpackage.acvs acvsVar4 = acvuVar3.c;
                    if (acvsVar4 == null) {
                        acvsVar4 = defpackage.acvs.a;
                    }
                    akzx akzxVarP3 = acvsVar4.p();
                    akzxVarP3.u();
                    defpackage.acvs acvsVar5 = (defpackage.acvs) akzxVarP3.b;
                    acvsVar5.b |= 8;
                    acvsVar5.f = jV;
                    defpackage.acvs acvsVar6 = (defpackage.acvs) akzxVarP3.p();
                    akzx akzxVarP4 = acvuVar3.p();
                    akzxVarP4.u();
                    defpackage.acvu acvuVar4 = (defpackage.acvu) akzxVarP4.b;
                    j$.util.Objects.requireNonNull(acvsVar6);
                    acvuVar4.c = acvsVar6;
                    acvuVar4.b |= 1;
                    acvuVar3 = (defpackage.acvu) akzxVarP4.p();
                }
                defpackage.adcs adcsVarZ = aiql.z(acvuVar3);
                if (!z) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = acvuVar3.o.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((acyu) obj4).j((defpackage.acvr) it.next(), acvuVar3));
                    }
                    defpackage.vaa vaaVar = new defpackage.vaa(aiql.aa(arrayList));
                    defpackage.zpk zpkVar = new defpackage.zpk(arrayList, 7);
                    java.util.concurrent.Executor executor = ((acyu) obj4).f;
                    adcsVarZ = defpackage.adcs.e(vaaVar.D(zpkVar, executor)).f(new defpackage.acym(acvuVar3, i), executor);
                }
                ?? r13 = this.e;
                java.lang.Object obj5 = this.d;
                defpackage.adcs adcsVarE = defpackage.adcs.e(adcsVarZ);
                defpackage.wzg wzgVar = new defpackage.wzg(obj4, obj3, 20);
                acyu acyuVar2 = (acyu) obj4;
                java.util.concurrent.Executor executor2 = acyuVar2.f;
                return defpackage.adcs.e(adcsVarE.g(wzgVar, executor2).g(new defpackage.vll(obj4, z2, adcsVarZ, i2), executor2)).d(java.io.IOException.class, new defpackage.acwn(3), executor2).g(new defpackage.acyj(acyuVar2, (defpackage.acvw) obj5, (defpackage.acwb) obj3, (ajat) r13, 2), executor2);
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.acvj acvjVar = (defpackage.acvj) this.a;
                    if (acvjVar.i == 2) {
                        java.lang.Object obj6 = this.b;
                        ?? r3 = this.c;
                        dva dvaVar = (dva) this.d;
                        dvaVar.r = "status";
                        dvaVar.g((java.lang.CharSequence) r3);
                        dvaVar.n(android.R.drawable.stat_sys_download);
                        dvaVar.d(2, true);
                        dvaVar.s(0, false);
                        java.lang.String str = acvjVar.a;
                        dvaVar.a();
                        ((dvr) obj6).b(str.hashCode(), dvaVar.a());
                    }
                }
                return ajcm.a;
            case 2:
                defpackage.acys acysVar = (defpackage.acys) obj;
                acysVar.name();
                defpackage.acvr acvrVar = (defpackage.acvr) this.d;
                java.lang.String str2 = acvrVar.c;
                defpackage.acvu acvuVar5 = (defpackage.acvu) this.b;
                java.lang.String str3 = acvuVar5.d;
                int i5 = adbe.a;
                defpackage.acwg acwgVar = (defpackage.acwg) aiql.H((java.util.concurrent.Future) this.c);
                int iOrdinal = acysVar.ordinal();
                java.lang.Object obj7 = this.e;
                java.lang.Object obj8 = this.a;
                if (iOrdinal == 1) {
                    acyu acyuVar3 = (acyu) obj7;
                    return acyuVar3.q(acyuVar3.z(acvuVar5, acvrVar, acwgVar, (defpackage.acwe) obj8, acwgVar.g, acvuVar5.l, 3), new defpackage.acwn(4));
                }
                if (iOrdinal == 3) {
                    return ((acyu) obj7).x(acvuVar5, acvrVar, (defpackage.acwe) obj8, acwgVar, 4);
                }
                if (iOrdinal == 4) {
                    defpackage.acwa acwaVarB = defpackage.acwa.b(acwgVar.d);
                    if (acwaVarB == null) {
                        acwaVarB = defpackage.acwa.NONE;
                    }
                    if (acwaVarB == defpackage.acwa.DOWNLOAD_COMPLETE && (iAe = a.ae(acvrVar.m)) != 0 && iAe == 2) {
                        return ((acyu) obj7).y(acvuVar5, acvrVar, (defpackage.acwe) obj8, acwgVar, 6);
                    }
                }
                java.lang.String str4 = acvrVar.c;
                java.lang.String str5 = acvuVar5.d;
                return ajcm.a;
            case 3:
                defpackage.acys acysVar2 = (defpackage.acys) obj;
                acysVar2.name();
                defpackage.acvr acvrVar2 = (defpackage.acvr) this.d;
                java.lang.String str6 = acvrVar2.c;
                defpackage.acvu acvuVar6 = (defpackage.acvu) this.b;
                java.lang.String str7 = acvuVar6.d;
                int i6 = adbe.a;
                int iOrdinal2 = acysVar2.ordinal();
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.e;
                java.lang.Object obj11 = this.a;
                if (iOrdinal2 == 1) {
                    long j = acvuVar6.l;
                    defpackage.acwg acwgVar2 = (defpackage.acwg) obj10;
                    if (!acyu.u(acwgVar2, j)) {
                        return ajcm.a;
                    }
                    java.lang.String str8 = acvrVar2.c;
                    java.lang.String str9 = acvuVar6.d;
                    defpackage.acwe acweVar = (defpackage.acwe) obj11;
                    acyu acyuVar4 = (acyu) obj9;
                    return acyuVar4.q(acyuVar4.z(acvuVar6, acvrVar2, acwgVar2, acweVar, acwgVar2.g, j, 27), new acyl(acyuVar4, acvuVar6, acvrVar2, acweVar, j, 0));
                }
                if (iOrdinal2 == 3) {
                    return ((acyu) obj9).x(acvuVar6, acvrVar2, (defpackage.acwe) obj11, (defpackage.acwg) obj10, 5);
                }
                if (iOrdinal2 == 4 && (iAe2 = a.ae(acvrVar2.m)) != 0 && iAe2 == 2) {
                    return ((acyu) obj9).y(acvuVar6, acvrVar2, (defpackage.acwe) obj11, (defpackage.acwg) obj10, 7);
                }
                int iAe3 = a.ae(acvrVar2.m);
                if (iAe3 != 0 && iAe3 == 2) {
                    acyu.B(((acyu) obj9).b, acvuVar6, acvrVar2, 16);
                }
                java.lang.String str10 = acvrVar2.c;
                java.lang.String str11 = acvuVar6.d;
                return ((acyu) obj9).r(acvuVar6, acvrVar2, (defpackage.acwe) obj11, acvuVar6.l);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                int i7 = ((defpackage.acwg) obj).h;
                ?? r2 = this.b;
                java.lang.Object obj12 = this.d;
                java.lang.Object obj13 = this.e;
                if (i7 < r2.e()) {
                    int i8 = adbe.a;
                    try {
                        ((aogc) obj13).P((android.net.Uri) obj12);
                    } catch (java.io.IOException e) {
                        adbe.g(e, "%s: Failed to remove corrupted file %s", new java.lang.Object[]{"DownloaderCallbackImpl", this.c});
                        return aiql.y(e);
                    }
                    break;
                } else {
                    ?? r0 = this.a;
                    int i9 = adbe.a;
                    r0.l(1115);
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ajcq ajcqVar = (ajcq) obj;
                if (ajcqVar != this.a) {
                    return ajcqVar;
                }
                java.lang.Object obj14 = this.d;
                java.lang.Object obj15 = this.c;
                java.lang.Object obj16 = this.e;
                java.lang.Object obj17 = this.b;
                ((ajcr) obj16).run();
                ajcqVar.c(new defpackage.acxq(obj17, obj15, obj14, 2, (byte[]) null), ((adax) obj17).f);
                return ajcqVar;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                if (((ahyn) obj).f()) {
                    return ajcm.a;
                }
                java.lang.Object obj18 = this.d;
                ?? r8 = this.b;
                java.lang.Object obj19 = this.c;
                java.lang.Object obj20 = this.a;
                java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) obj19;
                defpackage.adco adcoVar = (defpackage.adco) atomicReference.get();
                int iAN = a.aN(adcoVar.e);
                if (iAN != 0 && iAN == 4) {
                    int i10 = adbe.a;
                    adcn adcnVar = (adcn) obj20;
                    return !adcnVar.e.f() ? ajcm.a : adcnVar.c((acwi) r8, (android.net.Uri) obj18, atomicReference);
                }
                int iAN2 = a.aN(adcoVar.e);
                if (iAN2 != 0 && iAN2 == 3) {
                    int i11 = adbe.a;
                    return ((adcn) obj20).c((acwi) r8, (android.net.Uri) obj18, atomicReference);
                }
                java.lang.Object obj21 = this.e;
                android.net.Uri uri = (android.net.Uri) obj18;
                uri.toString();
                int i12 = adbe.a;
                adcn adcnVar2 = (adcn) obj20;
                ahzi ahziVar = adcnVar2.c;
                defpackage.acxm acxmVar = defpackage.acxm.c;
                defpackage.abtr abtrVar = (defpackage.abtr) ahziVar.eZ();
                defpackage.acxn acxnVarA = defpackage.acxo.a();
                java.lang.String str12 = (java.lang.String) obj21;
                acxnVarA.g(str12);
                acxnVarA.e(uri);
                acxnVarA.c(acxmVar);
                defpackage.adcs adcsVarE2 = defpackage.adcs.e(abtrVar.b(acxnVarA.a()));
                defpackage.acyj acyjVar = new defpackage.acyj(adcnVar2, str12, uri, atomicReference, 10);
                java.util.concurrent.Executor executor3 = adcnVar2.d;
                return adcsVarE2.g(acyjVar, executor3).g(new defpackage.acyj(adcnVar2, (acwi) r8, uri, atomicReference, 11), executor3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                java.lang.Object obj22 = this.c;
                java.lang.Object obj23 = this.e;
                java.lang.Object obj24 = this.a;
                java.lang.Object obj25 = this.d;
                adcn adcnVar3 = (adcn) this.b;
                acve acveVar = (acve) obj25;
                acup.c(aify.r(obj24, obj23, obj22), ahyn.h(new kxp(adcnVar3, acveVar, 13)), "Failed to refresh file groups", new java.lang.Object[0]);
                adcnVar3.g(3, acveVar);
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.acxj acxjVar = (defpackage.acxj) obj;
                java.util.concurrent.atomic.AtomicReference atomicReference2 = (java.util.concurrent.atomic.AtomicReference) this.c;
                int iAN3 = a.aN(((defpackage.adco) atomicReference2.get()).e);
                int i13 = iAN3 != 0 ? iAN3 : 1;
                java.lang.Object obj26 = this.a;
                java.lang.String str13 = (java.lang.String) this.e;
                if (!str13.equals(((defpackage.adco) obj26).c) || acxjVar.a) {
                    java.lang.Object obj27 = this.d;
                    java.lang.Object obj28 = this.b;
                    int i14 = adbe.a;
                    ((adcn) obj28).d((android.net.Uri) obj27);
                } else {
                    i3 = i13;
                }
                atomicReference2.set(adcn.f(str13, i3, acxjVar.b));
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((adhh) ((ajxw) this.e).a).a();
                java.lang.Object obj29 = this.b;
                java.lang.Object obj30 = this.d;
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = (com.google.android.libraries.micore.superpacks.common.PackManifest) this.a;
                ((gat) this.c).s(packManifest, (adhw) obj30, (adhw) obj29);
                return gat.u(packManifest);
            default:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return ajcm.a;
                }
                java.lang.Object obj31 = this.b;
                java.lang.Object obj32 = this.d;
                java.lang.Object obj33 = this.a;
                defpackage.aevy aevyVar = (defpackage.aevy) obj31;
                java.lang.String str14 = aevyVar.c;
                if (aevyVar.d) {
                    zzdVar = ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).b;
                    if (zzdVar == null) {
                        synchronized (obj33) {
                            zzdVar = ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).b;
                            if (zzdVar == null) {
                                zzd zzdVarI = zzd.i((android.content.Context) obj32, str14);
                                ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).b = zzdVarI;
                                zzdVar = zzdVarI;
                            }
                        }
                    }
                    break;
                } else {
                    zzdVar = ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).a;
                    if (zzdVar == null) {
                        synchronized (obj33) {
                            zzdVar = ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).a;
                            if (zzdVar == null) {
                                java.util.List list = zzd.m;
                                zzd zzdVarB = new zza((android.content.Context) obj32, str14).b();
                                ((com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter) obj33).a = zzdVarB;
                                zzdVar = zzdVarB;
                            }
                        }
                    }
                    break;
                }
                java.lang.Object obj34 = this.e;
                zzc zzcVarG = zzdVar.g((albh) this.c);
                if (obj34 != null) {
                    zzcVarG.m(((java.lang.Integer) obj34).intValue());
                }
                if (!aevyVar.d) {
                    java.lang.String str15 = aevyVar.e;
                    if (!ahvr.cp(str15)) {
                        if (((zyy) zzcVarG).a.d()) {
                            throw new java.lang.IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
                        }
                        akzz akzzVar = ((zyy) zzcVarG).p;
                        akzzVar.u();
                        amua amuaVar = akzzVar.b;
                        amua amuaVar2 = amua.a;
                        j$.util.Objects.requireNonNull(str15);
                        amuaVar.b |= 16777216;
                        amuaVar.j = str15;
                    }
                    java.util.Iterator it2 = aevyVar.i.iterator();
                    while (it2.hasNext()) {
                        zzcVarG.h((java.lang.String) it2.next());
                    }
                    if ((aevyVar.b & 8) != 0) {
                        zzcVarG.k(aevyVar.f);
                    }
                    alak alakVar = aevyVar.g;
                    if (!alakVar.isEmpty()) {
                        zzcVarG.g(aiql.W(alakVar));
                    }
                }
                return aazc.e(zzcVarG.d());
        }
    }

    public /* synthetic */ acyf(defpackage.acwu acwuVar, defpackage.acvj acvjVar, dva dvaVar, java.lang.String str, dvr dvrVar, int i) {
        this.$cid = i;
        this.e = acwuVar;
        this.a = acvjVar;
        this.d = dvaVar;
        this.c = str;
        this.b = dvrVar;
    }

    public /* synthetic */ acyf(acyu acyuVar, defpackage.acvr acvrVar, defpackage.acvu acvuVar, defpackage.acwg acwgVar, defpackage.acwe acweVar, int i) {
        this.$cid = i;
        this.c = acyuVar;
        this.d = acvrVar;
        this.b = acvuVar;
        this.e = acwgVar;
        this.a = acweVar;
    }

    public /* synthetic */ acyf(acyu acyuVar, defpackage.acvr acvrVar, defpackage.acvu acvuVar, ajcq ajcqVar, defpackage.acwe acweVar, int i) {
        this.$cid = i;
        this.e = acyuVar;
        this.d = acvrVar;
        this.b = acvuVar;
        this.c = ajcqVar;
        this.a = acweVar;
    }

    public /* synthetic */ acyf(acyu acyuVar, defpackage.acwb acwbVar, java.util.concurrent.atomic.AtomicReference atomicReference, defpackage.acvw acvwVar, ajat ajatVar, int i) {
        this.$cid = i;
        this.a = acyuVar;
        this.b = acwbVar;
        this.c = atomicReference;
        this.d = acvwVar;
        this.e = ajatVar;
    }

    public /* synthetic */ acyf(adcn adcnVar, java.util.concurrent.atomic.AtomicReference atomicReference, acwi acwiVar, android.net.Uri uri, java.lang.String str, int i) {
        this.$cid = i;
        this.a = adcnVar;
        this.c = atomicReference;
        this.b = acwiVar;
        this.d = uri;
        this.e = str;
    }

    public /* synthetic */ acyf(adcn adcnVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, defpackage.adco adcoVar, android.net.Uri uri, int i) {
        this.$cid = i;
        this.b = adcnVar;
        this.c = atomicReference;
        this.e = str;
        this.a = adcoVar;
        this.d = uri;
    }

    public /* synthetic */ acyf(com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter clearcutMetricSnapshotTransmitter, android.content.Context context, apgu apguVar, java.lang.Integer num, defpackage.aevy aevyVar, int i) {
        this.$cid = i;
        this.a = clearcutMetricSnapshotTransmitter;
        this.d = context;
        this.c = apguVar;
        this.e = num;
        this.b = aevyVar;
    }

    public /* synthetic */ acyf(gat gatVar, ajxw ajxwVar, com.google.android.libraries.micore.superpacks.common.PackManifest packManifest, adhw adhwVar, adhw adhwVar2, int i) {
        this.$cid = i;
        this.c = gatVar;
        this.e = ajxwVar;
        this.a = packManifest;
        this.d = adhwVar;
        this.b = adhwVar2;
    }

    public /* synthetic */ acyf(java.lang.Object obj, ajcq ajcqVar, ajcq ajcqVar2, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.$cid = i;
        this.b = obj;
        this.a = ajcqVar;
        this.e = ajcqVar2;
        this.c = obj2;
        this.d = obj3;
    }
}
