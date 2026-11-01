package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aczo implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aczo(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v72, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v73, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                acwh acwhVar = (acwh) obj;
                int i = adbe.a;
                akzx akzxVarP = acwhVar.p();
                java.lang.Object obj2 = this.a;
                for (java.lang.String str : j$.util.DesugarCollections.unmodifiableMap(acwhVar.b).keySet()) {
                    try {
                        defpackage.acwe acweVarAb = afsq.ab(str, ((aczp) obj2).a, ((aczp) obj2).b);
                        j$.util.Objects.requireNonNull(str);
                        defpackage.acwg acwgVar = (defpackage.acwg) acwhVar.b.get(str);
                        if (acwgVar == null) {
                            acwgVar = null;
                        }
                        akzxVarP.am(str);
                        if (acwgVar == null) {
                            adbe.c("%s: Unable to read sharedFile from ProtoDataStore.", "ProtoDataStoreSharedFilesMetadata");
                        } else {
                            akzxVarP.al(afsq.ae(acweVarAb), acwgVar);
                        }
                    } catch (adbz unused) {
                        adbe.d("%s Failed to deserialize file key %s, remove and continue.", "ProtoDataStoreSharedFilesMetadata", str);
                        ((aczp) obj2).b.a();
                        akzxVarP.am(str);
                    }
                }
                return akzxVarP.p();
            case 1:
                return (java.util.List) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 2:
                return (android.net.Uri) ((aigf) obj).get(this.a);
            case 3:
                return (defpackage.acwg) ((aigf) obj).get(this.a);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return new defpackage.adaz((aiwu) obj, (aiwm) this.a);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                defpackage.acyt acytVar = (defpackage.acyt) obj;
                java.lang.Object obj3 = this.a;
                if (acytVar == defpackage.acyt.b || acytVar == defpackage.acyt.a) {
                    akzx akzxVar = (akzx) obj3;
                    akzxVar.u();
                    aiwu aiwuVar = akzxVar.b;
                    aiwu aiwuVar2 = aiwu.a;
                    aiwuVar.c = a.Q(4);
                    aiwuVar.b |= 1;
                } else {
                    akzx akzxVar2 = (akzx) obj3;
                    akzxVar2.u();
                    aiwu aiwuVar3 = akzxVar2.b;
                    aiwu aiwuVar4 = aiwu.a;
                    aiwuVar3.c = a.Q(5);
                    aiwuVar3.b |= 1;
                }
                return ((akzx) obj3).p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aiwq aiwqVar = (aiwq) obj;
                akzx akzxVarM = aiwo.a.m();
                akzxVarM.u();
                aiwo aiwoVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(aiwqVar);
                aiwoVar.x = aiwqVar;
                aiwoVar.d |= 32768;
                adbk adbkVar = (adbk) this.a;
                adbkVar.s(1120, akzxVarM, adbkVar.a.j());
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                int i2 = adbo.d;
                return (java.util.List) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                acwd acwdVar = (acwd) obj;
                int i3 = adbo.d;
                alat alatVar = acwdVar.d;
                java.lang.Object obj4 = this.a;
                int iAS = ahvr.aS(alatVar.iterator(), new adbm(obj4, 0));
                if (iAS == -1) {
                    akzx akzxVarP2 = acwdVar.p();
                    akzxVarP2.u();
                    acwd acwdVar2 = akzxVarP2.b;
                    j$.util.Objects.requireNonNull(obj4);
                    acwdVar2.b();
                    acwdVar2.d.add(obj4);
                    return akzxVarP2.p();
                }
                defpackage.acvy acvyVar = (defpackage.acvy) acwdVar.d.get(iAS);
                akzx akzxVarP3 = acvyVar.p();
                defpackage.acvy acvyVar2 = (defpackage.acvy) obj4;
                long j = acvyVar.g + acvyVar2.g;
                akzxVarP3.u();
                defpackage.acvy acvyVar3 = (defpackage.acvy) akzxVarP3.b;
                acvyVar3.b |= 16;
                acvyVar3.g = j;
                long j2 = acvyVar.h + acvyVar2.h;
                akzxVarP3.u();
                defpackage.acvy acvyVar4 = (defpackage.acvy) akzxVarP3.b;
                acvyVar4.b |= 32;
                acvyVar4.h = j2;
                defpackage.acvy acvyVar5 = (defpackage.acvy) akzxVarP3.p();
                akzx akzxVarP4 = acwdVar.p();
                akzxVarP4.u();
                acwd acwdVar3 = akzxVarP4.b;
                j$.util.Objects.requireNonNull(acvyVar5);
                acwdVar3.b();
                acwdVar3.d.set(iAS, acvyVar5);
                return akzxVarP4.p();
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                int i4 = adbo.d;
                return (ahyn) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                acwd acwdVar4 = (acwd) obj;
                defpackage.acwf acwfVar = acwdVar4.f;
                if (acwfVar == null) {
                    acwfVar = defpackage.acwf.a;
                }
                if ((acwfVar.b & 1) != 0) {
                    return acwdVar4;
                }
                long jNextLong = ((adbo) this.a).b.nextLong();
                akzx akzxVarP5 = acwdVar4.p();
                defpackage.acwf acwfVar2 = acwdVar4.f;
                if (acwfVar2 == null) {
                    acwfVar2 = defpackage.acwf.a;
                }
                akzx akzxVarP6 = acwfVar2.p();
                akzxVarP6.u();
                defpackage.acwf acwfVar3 = (defpackage.acwf) akzxVarP6.b;
                acwfVar3.b |= 1;
                acwfVar3.c = jNextLong;
                alcf alcfVarE = aldi.e(abrz.V());
                akzxVarP6.u();
                defpackage.acwf acwfVar4 = (defpackage.acwf) akzxVarP6.b;
                j$.util.Objects.requireNonNull(alcfVarE);
                acwfVar4.d = alcfVarE;
                acwfVar4.b |= 2;
                akzxVarP5.u();
                acwd acwdVar5 = akzxVarP5.b;
                defpackage.acwf acwfVar5 = (defpackage.acwf) akzxVarP6.p();
                j$.util.Objects.requireNonNull(acwfVar5);
                acwdVar5.f = acwfVar5;
                acwdVar5.b |= 4;
                return akzxVarP5.p();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                acwd acwdVar6 = (acwd) obj;
                long jV = abrz.V();
                java.lang.Long lValueOf = java.lang.Long.valueOf(jV);
                alcf alcfVar = acwdVar6.c;
                if (alcfVar == null) {
                    alcfVar = alcf.a;
                }
                long jB = aldi.b(alcfVar);
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(jB);
                akzx akzxVarP7 = acwdVar6.p();
                lValueOf.getClass();
                alcf alcfVarE2 = aldi.e(jV);
                akzxVarP7.u();
                acwd acwdVar7 = akzxVarP7.b;
                j$.util.Objects.requireNonNull(alcfVarE2);
                acwdVar7.c = alcfVarE2;
                acwdVar7.b |= 1;
                acwd acwdVarP = akzxVarP7.p();
                if ((acwdVar6.b & 1) != 0) {
                    java.lang.Object obj5 = this.a;
                    lValueOf.getClass();
                    long jF = adbo.f(jV);
                    lValueOf2.getClass();
                    long jF2 = jF - adbo.f(jB);
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                    ((java.util.concurrent.atomic.AtomicReference) obj5).set(ahyn.h(java.lang.Integer.valueOf(aiql.T(jF2 / 86400000))));
                }
                return acwdVarP;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                int i5 = adbo.d;
                return (ahyn) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                acwd acwdVar8 = (acwd) obj;
                int i6 = adbo.d;
                ((java.util.concurrent.atomic.AtomicReference) this.a).set(acwdVar8.d);
                akzx akzxVarP8 = acwdVar8.p();
                akzxVarP8.u();
                akzxVarP8.b.d = albq.a;
                return akzxVarP8.p();
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                android.net.Uri uri = (android.net.Uri) obj;
                java.lang.Object obj6 = this.a;
                if (uri != null) {
                    try {
                        return java.lang.Long.valueOf(((aogc) ((agqj) obj6).f).K(uri));
                    } catch (java.io.IOException e) {
                        adbe.g(e, "%s: Failed to call mobstore fileSize on uri %s!", new java.lang.Object[]{"StorageLogger", uri});
                    }
                }
                return 0L;
            case 15:
                ahyn ahynVar = (ahyn) obj;
                if (!ahynVar.f()) {
                    return null;
                }
                ((java.util.concurrent.atomic.AtomicReference) this.a).set((defpackage.adco) ahynVar.b());
                return null;
            case 16:
                return ahyn.g((defpackage.adco) j$.util.DesugarCollections.unmodifiableMap(((adcp) obj).b).get(this.a));
            case 17:
                gus gusVar = (gus) obj;
                ailj ailjVarK = ((adcv) this.a).a.k();
                while (ailjVarK.hasNext()) {
                    try {
                        ((defpackage.adcx) ailjVarK.next()).a();
                    } catch (java.lang.Exception unused2) {
                    }
                }
                return gusVar;
            case 18:
                ailj ailjVarK2 = ((adcv) this.a).a.k();
                while (ailjVarK2.hasNext()) {
                    ((defpackage.adcx) ailjVarK2.next()).b();
                }
                return new gsd();
            case 19:
                return this.a.a(obj);
            default:
                return this.a.a(obj);
        }
    }
}
