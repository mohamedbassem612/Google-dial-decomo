package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wkv implements ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wkv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v101, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v50, types: [aonj, java.lang.Object] */
    public final ajcq a(java.lang.Object obj) {
        int i = 11;
        int i2 = 17;
        int i3 = 4;
        byte[] bArr = null;
        int i4 = 2;
        int i5 = 0;
        int i6 = 1;
        switch (this.$cid) {
            case 0:
                final defpackage.wky wkyVar = (defpackage.wky) this.a;
                defpackage.woo wooVar = wkyVar.D.n().d;
                if (wooVar == null) {
                    wooVar = defpackage.woo.a;
                }
                defpackage.won wonVarB = defpackage.won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = defpackage.won.UNRECOGNIZED;
                }
                if (wonVarB != defpackage.won.IN_SESSION) {
                    return ajcm.a;
                }
                final defpackage.wkw wkwVarA = wkyVar.a();
                return ahvr.H(wkwVarA.bl(), new ahyc() { // from class: wku
                    public final java.lang.Object apply(java.lang.Object obj2) {
                        defpackage.wky wkyVar2 = wkyVar;
                        wkyVar2.o.b(wkyVar2.m, 2);
                        ajcq ajcqVarBO = wkwVarA.bO();
                        vuu vuuVar = new vuu(wkyVar2, 19);
                        ajcu ajcuVar = wkyVar2.g;
                        agsm.i(1089, ahvr.I(ajcqVarBO, vuuVar, ajcuVar), "Could not mark feature as activated in storage", new java.lang.Object[0]);
                        agsm.i(1088, ahvr.G(new defpackage.vfm(wkyVar2, (j$.util.Optional) obj2, 16, null), ajcuVar), "Could not save business number", new java.lang.Object[0]);
                        agsm.i(1081, wkyVar2.F.R(oqt.d), "failed to log Xatu Activated HaTS event", new java.lang.Object[0]);
                        return null;
                    }
                }, wkyVar.g);
            case 1:
                return ((defpackage.wky) this.a).r.d();
            case 2:
                akzx akzxVarM = defpackage.wor.a.m();
                defpackage.wnj wnjVar = defpackage.wnj.a;
                akzxVarM.u();
                defpackage.wor worVar = (defpackage.wor) akzxVarM.b;
                j$.util.Objects.requireNonNull(wnjVar);
                worVar.c = wnjVar;
                worVar.b = 16;
                return ((defpackage.wky) this.a).D.o((defpackage.wor) akzxVarM.p());
            case 3:
                akzx akzxVarM2 = defpackage.wor.a.m();
                defpackage.woq woqVar = defpackage.woq.a;
                akzxVarM2.u();
                defpackage.wor worVar2 = (defpackage.wor) akzxVarM2.b;
                j$.util.Objects.requireNonNull(woqVar);
                worVar2.c = woqVar;
                worVar2.b = 7;
                return ((defpackage.wky) this.a).D.o((defpackage.wor) akzxVarM2.p());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.wky) this.a).c();
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (!optional.isPresent()) {
                    return ajcm.a;
                }
                java.lang.Object obj2 = this.a;
                long j = ((defpackage.ahwi) optional.orElseThrow()).c;
                defpackage.wky wkyVar2 = (defpackage.wky) obj2;
                defpackage.wjb wjbVar = wkyVar2.s;
                defpackage.wiz wizVar = new defpackage.wiz(wjbVar, j, 1);
                java.util.concurrent.Executor executor = wjbVar.a;
                agsm.i(1062, ahvr.F(wizVar, executor), "failed to track update time for logging", new java.lang.Object[0]);
                agsm.i(1063, ahvr.F(new defpackage.wiz(wjbVar, ((defpackage.ahwi) optional.orElseThrow()).d, 0), executor), "failed to track validation time for logging", new java.lang.Object[0]);
                defpackage.ahwi ahwiVar = (defpackage.ahwi) optional.orElseThrow();
                aooh.f(ahwiVar, "businessPhoneData");
                java.lang.String str = wkyVar2.m;
                aooh.f(str, "callId");
                defpackage.wjo wjoVar = wkyVar2.p;
                return aosv.F(wjoVar.c, 0, new defpackage.ugg(wjoVar, ahwiVar, str, (aoln) null, 18), 3);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.zmy) obj).equals(defpackage.zmy.b) ? ((defpackage.wll) this.a).a() : aiql.z(java.lang.Boolean.FALSE);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                hkd hkdVar = (hkd) obj;
                boolean z = hkdVar.g;
                java.lang.Object obj3 = this.a;
                if (z) {
                    if (((alfc) ((defpackage.wmy) obj3).g.a()).b.contains(ahvr.q(hkdVar.h))) {
                        defpackage.wmy.a.b().l("com/android/dialer/xatu/impl/service/XatuSupportedNumbers", "checkAndCacheEligibility", 115, "XatuSupportedNumbers.java").v("number is TFN in eligible countries");
                        akzx akzxVarM3 = nzb.a.m();
                        akzxVarM3.u();
                        nzb nzbVar = akzxVarM3.b;
                        nzbVar.b |= 1;
                        nzbVar.c = true;
                        akzxVarM3.u();
                        nzb nzbVar2 = akzxVarM3.b;
                        nzbVar2.d = 1;
                        nzbVar2.b |= 2;
                        return aiql.z(akzxVarM3.p());
                    }
                }
                java.lang.String strQ = ahvr.q(hkdVar.h);
                defpackage.wmy wmyVar = (defpackage.wmy) obj3;
                for (java.lang.String str2 : ((alfc) wmyVar.f.a()).b) {
                    if (str2.contains("_")) {
                        java.util.List listJ = ahzf.b('_').j(str2);
                        java.lang.String str3 = (java.lang.String) listJ.get(0);
                        java.lang.String str4 = (java.lang.String) listJ.get(1);
                        if (strQ.equals(str3) && hkdVar.c.startsWith(str4)) {
                            akzx akzxVarM4 = nzb.a.m();
                            akzxVarM4.u();
                            nzb nzbVar3 = akzxVarM4.b;
                            nzbVar3.b |= 1;
                            nzbVar3.c = true;
                            akzxVarM4.u();
                            nzb nzbVar4 = akzxVarM4.b;
                            nzbVar4.d = 3;
                            nzbVar4.b |= 2;
                            return aiql.z(akzxVarM4.p());
                        }
                    }
                }
                defpackage.vfm vfmVar = new defpackage.vfm(obj3, hkdVar, i2);
                ajct ajctVar = wmyVar.d;
                return ahvr.Q(vfmVar, ajctVar).i(new defpackage.whr(obj3, hkdVar, 8, bArr), ajctVar);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                return a.j((aonj) this.a, obj);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                return ((defpackage.wql) this.a).e.e();
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                long epochMilli = j$.time.Instant.now().toEpochMilli() - wrp.d;
                adag adagVar = new adag((byte[]) null);
                adagVar.n("SELECT * FROM xatu_data WHERE call_creation_time_millis < ?");
                adagVar.o(java.lang.Long.valueOf(epochMilli));
                adag adagVarB = adagVar.B();
                wrp wrpVar = (wrp) this.a;
                wqr wqrVar = wrpVar.g;
                return ahvr.H(ahvr.H(wqrVar.c.F(new defpackage.ufj(wqrVar, adagVarB, 6)), new defpackage.wie(wqrVar, 20), wqrVar.a), new defpackage.wro(i5), wrpVar.f);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return ahvr.aj((aify) obj).o(new defpackage.vnc(4), ((wrp) this.a).f);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                j$.util.Optional optionalOfNullable = ((defpackage.wwd) this.a).g;
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.Object obj4 = optionalOfNullable.get();
                    optionalOfNullable = j$.util.Optional.ofNullable(ahvr.E(new defpackage.vet(obj4, 13), ((defpackage.wwb) obj4).c));
                }
                return (ajcq) optionalOfNullable.orElse(ajcm.a);
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.wxb wxbVar = (defpackage.wxb) obj;
                return wxbVar.o.e(ahqx.b(new defpackage.wwg(wxbVar, this.a, i4)), wxbVar.h);
            case 15:
                long j2 = ((wyp) obj).c;
                wyo.a.b().l("com/android/incallui/atlas/ui/impl/calllog/AtlasCallLogDataSource", "getAnnotatedCallLogIdsToAtlasDataMap", 199, "AtlasCallLogDataSource.java").x("lastSyncedAtlasDataTimestamp %d", j2);
                wzd wzdVar = ((wyo) this.a).c;
                return ahvr.B(wzdVar.d.d(ahqx.i(new jww(wzdVar, j2, 17)), wzdVar.c), java.lang.Throwable.class, new defpackage.wro(12), ajbm.a);
            case 16:
                aigf aigfVar = (aigf) j$.util.Collection.-EL.stream((java.util.List) obj).collect(aido.b(new defpackage.wyd(6), new defpackage.wyd(5)));
                aihd aihdVarF = aigfVar.f();
                wyo wyoVar = (wyo) this.a;
                return ahvr.H(wyoVar.e.ac(aihdVarF), new defpackage.wrn(aigfVar, i), wyoVar.b);
            case 17:
                java.util.concurrent.Callable callableI = ahqx.i(new defpackage.wwy((aify) obj, i3));
                wyo wyoVar2 = (wyo) this.a;
                ajct ajctVar2 = wyoVar2.b;
                ahrv ahrvVarG = ahrv.g(ajctVar2.eU(callableI));
                wzd wzdVar2 = wyoVar2.c;
                j$.util.Objects.requireNonNull(wzdVar2);
                return ahrvVarG.i(new defpackage.wkv(wzdVar2, 19), ajbm.a).h(new defpackage.wro(10), ajctVar2);
            case 18:
                java.lang.Object obj5 = this.a;
                wzd wzdVar3 = (wzd) obj5;
                return ahvr.B(wzdVar3.d.d(ahqx.i(new defpackage.wzc(obj5, (aify) obj, i6)), wzdVar3.c), java.lang.Throwable.class, new defpackage.wro(i), ajbm.a);
            case 19:
                return ((wzd) this.a).d((aify) obj);
            default:
                return this.a;
        }
    }
}
