package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vfm implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ vfm(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, wvs] */
    /* JADX WARN: Type inference failed for: r1v78, types: [amzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v28, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [aoss, java.lang.Object] */
    public final ajcq a() {
        int i = 18;
        int i2 = 15;
        int i3 = 16;
        int i4 = 17;
        int i5 = 4;
        byte[] bArr = null;
        int i6 = 3;
        int i7 = 0;
        int i8 = 1;
        switch (this.$cid) {
            case 0:
                return ((vfn) this.a).m.w((android.telecom.PhoneAccountHandle) this.b);
            case 1:
                java.lang.Object obj = this.a;
                vdo vdoVar = (vdo) obj;
                ahrv ahrvVarG = ahrv.g(vdoVar.e.a());
                java.lang.Object obj2 = this.b;
                defpackage.vcu vcuVar = new defpackage.vcu(vdoVar, (java.lang.Object) ((defpackage.vdl) obj2).b, i5);
                ajct ajctVar = vdoVar.d;
                return ahvr.I(ahrvVarG.i(vcuVar, ajctVar), new defpackage.vcu(obj, obj2, i6), ajctVar);
            case 2:
                return ((vgg) this.a).p.m((android.telecom.PhoneAccountHandle) this.b);
            case 3:
                return ((defpackage.vjr) this.a).i.m((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.vjr) this.a).i.m((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return ((defpackage.vka) this.a).h.v((defpackage.vgm) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                return ((vku) this.a).j.b((android.telecom.PhoneAccountHandle) this.b);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((vmi) this.a).f.m((android.telecom.PhoneAccountHandle) this.b, true);
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                ((vva) this.b).i();
                java.util.Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    aiql.H((ajcq) it.next());
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((vva) this.b).i();
                java.util.Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    aiql.H((ajcq) it2.next());
                }
                return ajcm.a;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                aimw aimwVarL = defpackage.whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "getScoobyClearcutLogs", 193, "XatuLoggingCoordinatorImpl.java");
                java.lang.Object obj3 = this.a;
                aimwVarL.y("returning scooby clearcut logs for [%s]", obj3);
                java.lang.Object obj4 = this.b;
                defpackage.whs whsVar = (defpackage.whs) obj4;
                defpackage.whm whmVar = (defpackage.whm) whsVar.e.get(obj3);
                if (whmVar == null) {
                    return whsVar.f.d((java.lang.String) obj3);
                }
                aoin aoinVar = whsVar.d;
                ahrv ahrvVarG2 = ahrv.g(whmVar.a);
                long jLongValue = ((java.lang.Long) aoinVar.a()).longValue();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService = whsVar.b;
                return ahrv.g(ahrvVarG2.j(jLongValue, java.util.concurrent.TimeUnit.MILLISECONDS, scheduledExecutorService).e(java.util.concurrent.TimeoutException.class, new vrx(16), scheduledExecutorService)).i(new defpackage.whr(obj4, obj3, i8), scheduledExecutorService);
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                aimw aimwVarL2 = defpackage.whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "getDialerClearcutLogs", 153, "XatuLoggingCoordinatorImpl.java");
                java.lang.Object obj5 = this.a;
                aimwVarL2.y("returning clearcut logs for [%s]", obj5);
                java.lang.Object obj6 = this.b;
                defpackage.whs whsVar2 = (defpackage.whs) obj6;
                defpackage.whm whmVar2 = (defpackage.whm) whsVar2.e.get(obj5);
                if (whmVar2 == null) {
                    return whsVar2.h.e((java.lang.String) obj5);
                }
                aoin aoinVar2 = whsVar2.d;
                ahrv ahrvVarG3 = ahrv.g(whmVar2.a);
                long jLongValue2 = ((java.lang.Long) aoinVar2.a()).longValue();
                java.util.concurrent.ScheduledExecutorService scheduledExecutorService2 = whsVar2.b;
                return ahrv.g(ahrvVarG3.j(jLongValue2, java.util.concurrent.TimeUnit.MILLISECONDS, scheduledExecutorService2).e(java.util.concurrent.TimeoutException.class, new vrx(17), scheduledExecutorService2)).i(new defpackage.whr(obj6, obj5, i7), scheduledExecutorService2);
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                defpackage.whs whsVar3 = (defpackage.whs) this.b;
                java.util.Map map = whsVar3.e;
                java.lang.Object obj7 = this.a;
                if (((defpackage.whm) map.get(obj7)) == null) {
                    return aiql.y(new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "No ongoing logging session for [%s]", obj7)));
                }
                defpackage.whs.a.b().l("com/android/dialer/xatu/impl/callmetrics/XatuLoggingCoordinatorImpl", "endLoggingSession", 130, "XatuLoggingCoordinatorImpl.java").y("ending logging session for [%s]", obj7);
                ((defpackage.whm) map.get(obj7)).b.b((java.lang.Object) null);
                map.remove(obj7);
                defpackage.voc vocVar = whsVar3.g;
                return ahvr.F(new defpackage.whv(vocVar, obj7, i7), (java.util.concurrent.Executor) vocVar.b);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                a.bI(defpackage.wky.a.b(), "starting pipeline", "com/android/dialer/xatu/impl/service/XatuController", "startPipeline", (char) 474, "XatuController.java", zct.a);
                akzx akzxVarM = defpackage.wjd.a.m();
                akzxVarM.u();
                defpackage.wjd wjdVar = (defpackage.wjd) akzxVarM.b;
                java.lang.Object obj8 = this.b;
                defpackage.wky wkyVar = (defpackage.wky) obj8;
                java.lang.String str = wkyVar.m;
                j$.util.Objects.requireNonNull(str);
                wjdVar.c = str;
                int i9 = wkyVar.y + 1;
                wkyVar.y = i9;
                akzxVarM.u();
                ((defpackage.wjd) akzxVarM.b).b = i9;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.vxc vxcVar = new defpackage.vxc(akzxVarM, i4);
                j$.util.Optional optional = (j$.util.Optional) this.a;
                if (true == optional.isPresent()) {
                    java.lang.String str2 = (java.lang.String) optional.get();
                    akzx akzxVar = (akzx) vxcVar.a;
                    akzxVar.u();
                    defpackage.wjd wjdVar2 = (defpackage.wjd) akzxVar.b;
                    j$.util.Objects.requireNonNull(str2);
                    wjdVar2.d = str2;
                }
                defpackage.wjo wjoVar = wkyVar.p;
                defpackage.wjd wjdVar3 = (defpackage.wjd) akzxVarM.p();
                aooh.f(wjdVar3, "startParams");
                ajcq ajcqVarF = aosv.F(wjoVar.c, 0, new defpackage.vjf(wjoVar, wjdVar3, (aoln) null, 14, (byte[]) null), 3);
                defpackage.wie wieVar = new defpackage.wie(obj8, 10);
                ajcu ajcuVar = wkyVar.g;
                ajcq ajcqVarH = ahvr.H(ajcqVarF, wieVar, ajcuVar);
                ahvr.J(ajcqVarH, new defpackage.uwo(wkyVar, 2), ajcuVar);
                return ajcqVarH;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                java.lang.Object obj9 = this.a;
                defpackage.wky wkyVar2 = (defpackage.wky) obj9;
                wkyVar2.i.n(ruc.r, rub.c);
                java.lang.Object obj10 = this.b;
                defpackage.wre wreVar = ((defpackage.wkx) obj10).a;
                aooh.f(wreVar, "endCause");
                defpackage.ahdv ahdvVar = wkyVar2.E;
                defpackage.woo wooVar = ((defpackage.abtr) ahdvVar.b).n().d;
                if (wooVar == null) {
                    wooVar = defpackage.woo.a;
                }
                defpackage.won wonVarB = defpackage.won.b(wooVar.c);
                if (wonVarB == null) {
                    wonVarB = defpackage.won.UNRECOGNIZED;
                }
                if (wonVarB != defpackage.won.CLOSED) {
                    if (wreVar == defpackage.wre.USER_ENDED) {
                        ((agsm) ahdvVar.a).g(aosv.F((aoss) ahdvVar.f, 0, new defpackage.wcj(ahdvVar, (aoln) null, 4, (byte[]) null), 3), 5L, java.util.concurrent.TimeUnit.SECONDS);
                    } else {
                        ahdvVar.e();
                    }
                }
                defpackage.abtr abtrVar = wkyVar2.D;
                akzx akzxVarM2 = defpackage.wor.a.m();
                defpackage.wod wodVar = defpackage.wod.a;
                akzxVarM2.u();
                defpackage.wor worVar = (defpackage.wor) akzxVarM2.b;
                j$.util.Objects.requireNonNull(wodVar);
                worVar.c = wodVar;
                worVar.b = 12;
                return ahvr.I(abtrVar.p((defpackage.wor) akzxVarM2.p(), new defpackage.vfm(obj9, obj10, i2)), new defpackage.wkv(obj9, i6), wkyVar2.g);
            case 15:
                defpackage.wkx wkxVar = (defpackage.wkx) this.b;
                defpackage.wre wreVar2 = wkxVar.a;
                boolean zEquals = wreVar2.equals(defpackage.wre.CALL_DEACTIVATED);
                java.lang.Object obj11 = this.a;
                if (zEquals) {
                    ((defpackage.wky) obj11).h.o(rmx.gH);
                }
                defpackage.wky wkyVar3 = (defpackage.wky) obj11;
                defpackage.whs whsVar4 = wkyVar3.o;
                java.lang.String str3 = wkyVar3.m;
                whsVar4.b(str3, 4);
                defpackage.wit witVar = wkyVar3.e;
                agsm.i(1060, ahvr.E(new defpackage.vet(witVar, 12), witVar.a), "failed to reset state", new java.lang.Object[0]);
                defpackage.wky.a.b().l("com/android/dialer/xatu/impl/service/XatuController", "stopPipeline", 611, "XatuController.java").y("stopping pipeline: %s", wreVar2.name());
                defpackage.woo wooVar2 = wkyVar3.D.n().d;
                if (wooVar2 == null) {
                    wooVar2 = defpackage.woo.a;
                }
                if ((wooVar2.b & 1) == 0) {
                    throw new java.lang.IllegalStateException("session start time missing");
                }
                akzx akzxVarM3 = defpackage.wje.a.m();
                long j = wooVar2.d;
                akzxVarM3.u();
                ((defpackage.wje) akzxVarM3.b).c = j;
                long j2 = wkyVar3.j;
                akzxVarM3.u();
                ((defpackage.wje) akzxVarM3.b).d = j2;
                akzxVarM3.u();
                defpackage.wje wjeVar = (defpackage.wje) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str3);
                wjeVar.e = str3;
                akzx akzxVarM4 = defpackage.wrb.a.m();
                akzxVarM4.u();
                defpackage.wrb wrbVar = (defpackage.wrb) akzxVarM4.b;
                wrbVar.c = wreVar2.h;
                wrbVar.b |= 1;
                defpackage.wrb wrbVar2 = (defpackage.wrb) akzxVarM4.p();
                akzxVarM3.u();
                defpackage.wje wjeVar2 = (defpackage.wje) akzxVarM3.b;
                j$.util.Objects.requireNonNull(wrbVar2);
                wjeVar2.f = wrbVar2;
                wjeVar2.b |= 1;
                j$.util.Optional optional2 = wkxVar.b;
                j$.util.Objects.requireNonNull(akzxVarM3);
                defpackage.vxc vxcVar2 = new defpackage.vxc(akzxVarM3, i);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj12 = optional2.get();
                    java.lang.Object obj13 = vxcVar2.a;
                    int iIntValue = ((java.lang.Integer) obj12).intValue();
                    akzx akzxVar2 = (akzx) obj13;
                    akzxVar2.u();
                    ((defpackage.wje) akzxVar2.b).g = iIntValue;
                }
                defpackage.wjo wjoVar2 = wkyVar3.p;
                defpackage.wje wjeVar3 = (defpackage.wje) akzxVarM3.p();
                aooh.f(wjeVar3, "stopParams");
                return ahvr.H(aosv.F(wjoVar2.c, 0, new defpackage.vjf(wjoVar2, wjeVar3, (aoln) null, 15), 3), new defpackage.wie(obj11, 12), wkyVar3.g);
            case 16:
                j$.util.Optional optional3 = (j$.util.Optional) this.a;
                if (!optional3.isPresent() || ((java.lang.String) optional3.orElseThrow()).isEmpty()) {
                    return ajcm.a;
                }
                java.lang.Object obj14 = this.b;
                akzx akzxVarM5 = defpackage.wqs.a.m();
                java.lang.String str4 = (java.lang.String) optional3.orElseThrow();
                akzxVarM5.u();
                defpackage.wqs wqsVar = (defpackage.wqs) akzxVarM5.b;
                j$.util.Objects.requireNonNull(str4);
                wqsVar.b |= 2;
                wqsVar.e = str4;
                defpackage.wky wkyVar4 = (defpackage.wky) obj14;
                return wkyVar4.n.e(wkyVar4.j, (defpackage.wqs) akzxVarM5.p());
            case 17:
                java.lang.Object obj15 = this.a;
                defpackage.wmy wmyVar = (defpackage.wmy) obj15;
                aoin aoinVar3 = wmyVar.e;
                return ((java.lang.String) aoinVar3.a()).isEmpty() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.I(wmyVar.a((java.lang.String) aoinVar3.a()), new defpackage.whr(obj15, this.b, 7, bArr), wmyVar.d);
            case 18:
                return ahvr.H(this.a.d(), new defpackage.wkb(5), (java.util.concurrent.Executor) this.b);
            case 19:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it3 = ((defpackage.wqs) this.b).c.iterator();
                while (true) {
                    java.lang.Object obj16 = this.a;
                    if (!it3.hasNext()) {
                        return ahvr.aj(arrayList).o(new defpackage.vug(arrayList, i3), ((defpackage.wrj) obj16).b);
                    }
                    defpackage.wrf wrfVar = (defpackage.wrf) it3.next();
                    defpackage.wqn wqnVar = wrfVar.d;
                    if (wqnVar == null) {
                        wqnVar = defpackage.wqn.a;
                    }
                    if (wqnVar.c.isEmpty()) {
                        arrayList.add(aiql.z(j$.util.Optional.empty()));
                    } else {
                        defpackage.wqn wqnVar2 = wrfVar.d;
                        if (wqnVar2 == null) {
                            wqnVar2 = defpackage.wqn.a;
                        }
                        java.lang.String str5 = wqnVar2.c;
                        java.lang.String strValueOf = java.lang.String.valueOf(str5.substring(0, str5.lastIndexOf(".")));
                        defpackage.vug vugVar = new defpackage.vug(str5, i4);
                        defpackage.wrj wrjVar = (defpackage.wrj) obj16;
                        ahrv ahrvVarG4 = ahrv.g(ahvr.F(vugVar, wrjVar.b));
                        defpackage.whr whrVar = new defpackage.whr(obj16, strValueOf.concat("_scotty.flac"), 11);
                        ajct ajctVar2 = wrjVar.c;
                        arrayList.add(ahrvVarG4.i(whrVar, ajctVar2).h(new defpackage.wkb(18), ajctVar2).e(java.lang.Throwable.class, new defpackage.wkb(19), ajctVar2));
                    }
                }
                break;
            default:
                java.lang.Object obj17 = this.a;
                defpackage.wwd wwdVar = (defpackage.wwd) obj17;
                defpackage.taq taqVar = wwdVar.k;
                ajcu ajcuVar2 = (ajcu) taqVar.a.a();
                ajcuVar2.getClass();
                defpackage.wwb wwbVar = new defpackage.wwb(this.b, ajcuVar2, taqVar.b);
                wwdVar.g = j$.util.Optional.of(wwbVar);
                wwdVar.e = j$.util.Optional.of(new defpackage.wwc(wwdVar, wwbVar));
                akzx akzxVarM6 = defpackage.twd.a.m();
                defpackage.twc twcVar = defpackage.twc.INTERRUPT;
                akzxVarM6.u();
                defpackage.twd twdVar = (defpackage.twd) akzxVarM6.b;
                twdVar.c = twcVar.d;
                twdVar.b |= 1;
                akzxVarM6.u();
                defpackage.twd twdVar2 = (defpackage.twd) akzxVarM6.b;
                twdVar2.b |= 2;
                twdVar2.d = 16000;
                defpackage.twd twdVar3 = (defpackage.twd) akzxVarM6.p();
                defpackage.twh twhVar = (defpackage.twh) wwdVar.e.orElseThrow();
                aooh.f(twdVar3, "sodaConfig");
                aooh.f(twhVar, "listener");
                txc txcVar = wwdVar.h;
                return ahrv.g(aosv.F(txcVar.b, 0, new defpackage.rjk(txcVar, twdVar3, twhVar, (aoln) null, 18), 3)).h(new defpackage.wrn(obj17, 6), wwdVar.c);
        }
    }

    public /* synthetic */ vfm(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
