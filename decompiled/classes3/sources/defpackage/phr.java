package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class phr implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ phr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0414  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [aonj, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        boolean z;
        int iC;
        int i = 2;
        int i2 = 4;
        byte[] bArr = null;
        switch (this.$cid) {
            case 0:
                defpackage.akfx akfxVar = (defpackage.akfx) obj;
                try {
                    return j$.util.Optional.of(akfxVar.x(akfxVar.i(this.a, akfg.W), 3));
                } catch (akfp unused) {
                    hgb.c(defpackage.phu.a.b(), "Fail to parse the phone number in Chile.", "com/android/dialer/incall/callinfo/CallInfoInternalProducerModule", "produceFormattedNumber", (char) 209, "CallInfoInternalProducerModule.java", (byte) 5, java.util.concurrent.TimeUnit.SECONDS);
                    return j$.util.Optional.empty();
                }
            case 1:
                defpackage.spn spnVar = (defpackage.spn) obj;
                if (spnVar == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                defpackage.spa spaVar = spnVar.n;
                if (spaVar == null) {
                    spaVar = defpackage.spa.a;
                }
                ?? r12 = this.a;
                aooh.e(spaVar, "getCallerIdFeedbackInfo(...)");
                defpackage.spa spaVar2 = (defpackage.spa) r12.a(spaVar);
                akzx akzxVarP = spnVar.p();
                akzxVarP.u();
                defpackage.spn spnVar2 = (defpackage.spn) akzxVarP.b;
                j$.util.Objects.requireNonNull(spaVar2);
                spnVar2.n = spaVar2;
                spnVar2.b |= 2048;
                return (defpackage.spn) akzxVarP.p();
            case 2:
                defpackage.pqm pqmVar = (defpackage.pqm) this.a;
                pqmVar.f.a(mfy.em);
                da$.ExternalSyntheticApiModelOutline1.m(pqmVar.b);
                return null;
            case 3:
                j$.lang.Iterable.-EL.forEach(((defpackage.pqm) this.a).w.e(), new defpackage.pqi());
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                if (num != null) {
                    java.lang.Object obj2 = this.a;
                    num.intValue();
                    z = ((alfa) ((lnr) obj2).d.a()).b.contains(num) ? false : true;
                }
                return java.lang.Boolean.valueOf(z);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.pvr) this.a).k(1);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.pvr pvrVar = (defpackage.pvr) this.a;
                android.telecom.Call call = pvrVar.d;
                if (android.telecom.VideoProfile.isAudioOnly(call.getDetails().getVideoState())) {
                    defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "pauseVideo", 124, "VideoControllerImpl.java").v("not video");
                    return null;
                }
                defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "pauseVideo", 129, "VideoControllerImpl.java").J("call state: %s, pause video capability: %b", defpackage.zpo.a(call.getState()), call.getDetails().can(1048576));
                defpackage.pvf pvfVar = pvrVar.e;
                j$.util.Optional optionalL = pvfVar.t.l();
                defpackage.puo puoVar = new defpackage.puo(pvfVar, i);
                if (true != optionalL.isPresent()) {
                    return null;
                }
                java.lang.Object obj3 = optionalL.get();
                ((defpackage.pvf) puoVar.a).q.b(mfy.dq, aify.p(gus.aw("null")));
                ((android.telecom.InCallService.VideoCall) obj3).setCamera(null);
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                defpackage.pvr pvrVar2 = (defpackage.pvr) this.a;
                pvrVar2.e.f(defpackage.pur.b);
                pvrVar2.k(3);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.pvr pvrVar3 = (defpackage.pvr) this.a;
                android.telecom.Call call2 = pvrVar3.d;
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                if (android.telecom.VideoProfile.isAudioOnly(call2.getDetails().getVideoState()) || !bool.booleanValue()) {
                    return null;
                }
                pvrVar3.g.o(rmx.oq);
                defpackage.pvr.a.d().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "onVideoStateChanged", 489, "VideoControllerImpl.java").v("Unexpected pause state when we explicitly only unset camera, sending unpause request");
                pvrVar3.k(call2.getDetails().getVideoState() & (-5));
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                ((defpackage.pvr) this.a).n.h();
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                defpackage.pvr pvrVar4 = (defpackage.pvr) this.a;
                android.telecom.Call call3 = pvrVar4.d;
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                if (android.telecom.VideoProfile.isAudioOnly(call3.getDetails().getVideoState())) {
                    defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "resumeVideo", 151, "VideoControllerImpl.java").v("not video");
                    return null;
                }
                if (bool2.booleanValue()) {
                    pvrVar4.g.o(rmx.oq);
                    defpackage.pvr.a.d().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "resumeVideo", 160, "VideoControllerImpl.java").v("Unexpected pause state when we explicitly only unset camera, sending unpause request");
                    pvrVar4.k(call3.getDetails().getVideoState() & (-5));
                }
                defpackage.pvr.a.b().l("com/android/dialer/incall/core/video/impl/VideoControllerImpl", "resumeVideo", 166, "VideoControllerImpl.java").v("sync camera state to try to resume the camera");
                pvrVar4.e.g();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.qax) this.a).g = ((defpackage.zmy) obj) == defpackage.zmy.a;
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                aify aifyVar = (aify) obj;
                java.lang.Object obj4 = this.a;
                akzx akzxVar = (akzx) obj4;
                akzxVar.u();
                amow amowVar = akzxVar.b;
                amow amowVar2 = amow.a;
                alat alatVar = amowVar.Z;
                if (!alatVar.c()) {
                    amowVar.Z = alad.J(alatVar);
                }
                akyl.i(aifyVar, amowVar.Z);
                return obj4;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                qdo qdoVar = (qdo) this.a;
                defpackage.qdn qdnVar = qdoVar.j;
                java.util.concurrent.atomic.AtomicReference atomicReference = qdoVar.k;
                atomicReference.set(qdnVar);
                qdo.a.b().l("com/android/dialer/incall/proximitysensor/impl/incall/AccelerometerTracker", "updateOrientation", 276, "AccelerometerTracker.java").y("orientation is updated to %s", atomicReference);
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                ((defpackage.qek) this.a).a.set(!((defpackage.qej) obj).c);
                return null;
            case 15:
                defpackage.otc otcVarAo = pez.ao();
                otcVarAo.e(false);
                otcVarAo.d(false);
                otcVarAo.b(false);
                defpackage.otd otdVarA = otcVarAo.a();
                defpackage.qet qetVar = (defpackage.qet) this.a;
                ahqx.l(qetVar.a, qetVar.b.bk(otdVarA));
                return null;
            case 16:
                if (((tcp) obj) != tcp.d) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj5 = this.a;
                defpackage.oug ougVarA = defpackage.oui.a();
                ougVarA.f(defpackage.ouj.ANSWER_AS_RTT);
                ougVarA.d(2131232047);
                android.content.Context context = (android.content.Context) obj5;
                ougVarA.e(context.getString(2132017665));
                ougVarA.h(false);
                ougVarA.g(j$.util.Optional.of(java.lang.Integer.valueOf(context.getColor(2131099713))));
                return j$.util.Optional.of(ougVarA.a());
            case 17:
                if (((tcp) obj) != tcp.d) {
                    return j$.util.Optional.empty();
                }
                java.lang.Object obj6 = this.a;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    ahvr.bZ(a.n(), "CallStyle notifications must be enabled in order for the Android OS to produce the 'answer button' in incoming call notifications.");
                    iC = urg.c((android.content.Context) obj6, 2130969024);
                } else {
                    iC = urg.c((android.content.Context) obj6, 2130969017);
                }
                defpackage.qif qifVar = new defpackage.qif();
                qifVar.e(defpackage.qid.ANSWER_AS_RTT);
                qifVar.d(defpackage.qic.b);
                qifVar.c(((android.content.Context) obj6).getString(2132019491));
                qifVar.g(j$.util.Optional.of(java.lang.Integer.valueOf(iC)));
                qifVar.b(2131232047);
                qifVar.f(true);
                return j$.util.Optional.of(qifVar.a());
            case 18:
                j$.util.Optional optional = (j$.util.Optional) obj;
                defpackage.qbf qbfVar = new defpackage.qbf(this.a, i2);
                if (true != optional.isPresent()) {
                    return null;
                }
                java.lang.Object obj7 = optional.get();
                java.lang.Object obj8 = qbfVar.a;
                java.lang.String str = (java.lang.String) obj7;
                aimw aimwVarL = defpackage.qfg.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessagesCache", "updateRemoteMessage", 73, "RttCallMessagesCache.java");
                defpackage.qfa qfaVar = (defpackage.qfa) obj8;
                defpackage.qfg qfgVar = qfaVar.d;
                aais aaisVar = qfgVar.j;
                aimwVarL.y("updateRemoteMessage: %s", aais.aD(str));
                qfaVar.h.a(ahvr.E(new defpackage.pmw(qfgVar, str, 13, bArr), qfgVar.e));
                return null;
            case 19:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                akzx akzxVarM = defpackage.tdt.a.m();
                defpackage.qfg qfgVar2 = (defpackage.qfg) this.a;
                long j = qfgVar2.i;
                java.lang.String strValueOf = java.lang.String.valueOf(j);
                akzxVarM.u();
                defpackage.tdt tdtVar = (defpackage.tdt) akzxVarM.b;
                j$.util.Objects.requireNonNull(strValueOf);
                tdtVar.b |= 1;
                tdtVar.c = strValueOf;
                akzxVarM.u();
                defpackage.tdt tdtVar2 = (defpackage.tdt) akzxVarM.b;
                tdtVar2.b |= 4;
                tdtVar2.e = j;
                j$.util.Objects.requireNonNull(akzxVarM);
                defpackage.qbf qbfVar2 = new defpackage.qbf(akzxVarM, 5);
                if (true == optional2.isPresent()) {
                    java.lang.String str2 = (java.lang.String) optional2.get();
                    akzx akzxVar2 = (akzx) qbfVar2.a;
                    akzxVar2.u();
                    defpackage.tdt tdtVar3 = (defpackage.tdt) akzxVar2.b;
                    j$.util.Objects.requireNonNull(str2);
                    tdtVar3.b |= 2;
                    tdtVar3.d = str2;
                }
                java.util.List<defpackage.qep> list = qfgVar2.b;
                ahzf ahzfVar = defpackage.qeq.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (defpackage.qep qepVar : list) {
                    akzx akzxVarM2 = defpackage.tdy.a.m();
                    java.lang.String strA = qepVar.a();
                    akzxVarM2.u();
                    defpackage.tdy tdyVar = (defpackage.tdy) akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strA);
                    tdyVar.b |= 1;
                    tdyVar.c = strA;
                    long j2 = qepVar.b;
                    akzxVarM2.u();
                    defpackage.tdy tdyVar2 = (defpackage.tdy) akzxVarM2.b;
                    tdyVar2.b |= 2;
                    tdyVar2.d = j2;
                    boolean z2 = qepVar.a;
                    akzxVarM2.u();
                    defpackage.tdy tdyVar3 = (defpackage.tdy) akzxVarM2.b;
                    tdyVar3.b |= 4;
                    tdyVar3.e = z2;
                    boolean z3 = qepVar.c;
                    akzxVarM2.u();
                    defpackage.tdy tdyVar4 = (defpackage.tdy) akzxVarM2.b;
                    tdyVar4.b |= 8;
                    tdyVar4.f = z3;
                    arrayList.add((defpackage.tdy) akzxVarM2.p());
                }
                akzxVarM.u();
                defpackage.tdt tdtVar4 = (defpackage.tdt) akzxVarM.b;
                alat alatVar2 = tdtVar4.f;
                if (!alatVar2.c()) {
                    tdtVar4.f = alad.J(alatVar2);
                }
                akyl.i(arrayList, tdtVar4.f);
                return (defpackage.tdt) akzxVarM.p();
            default:
                ((defpackage.qfj) this.a).o.a(ajcm.a);
                return null;
        }
    }
}
