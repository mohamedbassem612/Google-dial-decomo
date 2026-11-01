package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class akbr implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ akbr(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x0225  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                ((akbw) this.a).b.remove(this.b);
                return;
            case 1:
                ((akbj) this.b).d.dy(this.a);
                return;
            case 2:
                ((akbw) this.b).e((anph) this.a);
                return;
            case 3:
                java.lang.Object obj = this.a;
                akbw akbwVar = (akbw) this.b;
                akbwVar.c.add(new akbt(akbwVar, obj));
                akbwVar.d();
                return;
            case 4:
                ((akbw) this.a).f((aljf) this.b);
                return;
            case 5:
                try {
                    this.a.run();
                    return;
                } catch (java.lang.Throwable th) {
                    akbw akbwVar2 = (akbw) this.b;
                    akbwVar2.j = true;
                    anty antyVar = akbwVar2.k;
                    if (antyVar != null) {
                        antyVar.a(anqw.d(th), new anph());
                        ajsz ajszVar = akbwVar2.l;
                        if (ajszVar == null || akbwVar2.e.e != 4) {
                            return;
                        }
                        ajszVar.dv((java.lang.String) null, th);
                        return;
                    }
                    return;
                }
            case 6:
                ((akbw) this.a).f((aljf) this.b);
                return;
            case 7:
                akbs akbsVar = (akbs) this.b;
                if (akbsVar.a) {
                    return;
                }
                akbsVar.c.c((anph) this.a);
                return;
            case 8:
                akbs akbsVar2 = (akbs) this.b;
                if (akbsVar2.a) {
                    return;
                }
                akbsVar2.c.d(this.a);
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                defpackage.akby akbyVar = (defpackage.akby) this.a;
                java.util.Iterator it = akbyVar.a.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (!((ajcq) entry.getValue()).isDone()) {
                        if (akbyVar.i()) {
                            return;
                        }
                        akbyVar.h();
                        return;
                    }
                    it.remove();
                    akbp akbpVar = (akbp) entry.getKey();
                    try {
                        akbyVar.k((agwm) this.b, akbpVar, akbpVar.b());
                    } catch (java.lang.Throwable th2) {
                        akbyVar.d = anqw.d(th2);
                        akbyVar.e = new anph();
                        akbyVar.g();
                        return;
                    }
                }
                if (akbyVar.i()) {
                    akbyVar.h();
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                java.lang.Object obj2 = this.a;
                defpackage.akby akbyVar2 = (defpackage.akby) obj2;
                java.util.Iterator it2 = akbyVar2.b.entrySet().iterator();
                java.lang.Object obj3 = this.b;
                while (it2.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                    if (!((ajcq) entry2.getValue()).isDone()) {
                        if (akbyVar2.b.isEmpty()) {
                            ((anqa) obj2).f.a(akbyVar2.d, akbyVar2.e);
                            return;
                        }
                        return;
                    } else {
                        it2.remove();
                        akbp akbpVar2 = (akbp) entry2.getKey();
                        try {
                            akbyVar2.l((defpackage.apjb) obj3, akbpVar2, akbpVar2.i((defpackage.apjb) obj3));
                        } catch (java.lang.Throwable th3) {
                            akbyVar2.d = anqw.d(th3);
                            akbyVar2.e = new anph();
                        }
                    }
                }
                if (akbyVar2.b.isEmpty()) {
                    ((anqa) obj2).f.a(akbyVar2.d, akbyVar2.e);
                    return;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                ((akce) this.b).a.c((anph) this.a);
                return;
            case 12:
                ((akce) this.b).a.d(this.a);
                return;
            case 13:
                ((defpackage.alje) this.b).d(((defpackage.alua) this.a).a);
                return;
            case 14:
                ((defpackage.alje) this.b).d((java.io.InputStream) this.a);
                return;
            case 15:
                defpackage.akxd akxdVar = new defpackage.akxd(this.b, 5);
                j$.util.Optional optional = (j$.util.Optional) this.a;
                if (true == optional.isPresent()) {
                    ((defpackage.alje) akxdVar.a).d((java.io.InputStream) optional.get());
                    return;
                }
                return;
            case 16:
                ((defpackage.alje) this.b).d(((defpackage.altz) this.a).a);
                return;
            case 17:
                ((defpackage.alkv) this.b).c((defpackage.almy) this.a, defpackage.alnu.TIMEOUT);
                return;
            case 18:
                java.lang.Object obj4 = this.b;
                defpackage.aluk alukVar = (defpackage.aluk) this.a;
                alukVar.e((aify) obj4);
                alukVar.r.a(alukVar.b(true));
                return;
            case 19:
                java.lang.Object obj5 = this.a;
                synchronized (obj5) {
                    if (((defpackage.alvb) obj5).d == null) {
                        return;
                    }
                    ((defpackage.alvb) obj5).d = null;
                    defpackage.alvb alvbVar = (defpackage.alvb) obj5;
                    defpackage.alvg alvgVar = alvbVar.b;
                    if (alvgVar.m()) {
                        defpackage.alvb.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenRobocallProcessor", "handleTimeout", 120, "AgenticCallScreenRobocallProcessor.kt").v("Robocall timeout reached but Take A Message flow is active. Ignoring.");
                        return;
                    }
                    java.lang.Object obj6 = this.b;
                    defpackage.alvb.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenRobocallProcessor", "handleTimeout", 126, "AgenticCallScreenRobocallProcessor.kt").v("Robocall timeout reached. Ending call as spam.");
                    xtq xtqVarN = defpackage.alpv.n(defpackage.alnf.a.m());
                    xtqVarN.af(defpackage.alsz.BOT);
                    xtq xtqVarP = defpackage.alpv.p(defpackage.almm.a.m());
                    xtqVarP.aj("KnownSpamBailout");
                    akzx akzxVar = (akzx) xtqVarP.a;
                    akzxVar.u();
                    defpackage.almm almmVar = (defpackage.almm) akzxVar.b;
                    almmVar.b |= 2;
                    almmVar.d = 1.0f;
                    xtqVarN.ad(xtqVarP.ai());
                    xtqVarN.ae(defpackage.alsy.END_SPAM_CALL);
                    defpackage.alnf alnfVarAc = xtqVarN.ac();
                    defpackage.almz almzVar = defpackage.almz.a;
                    xtq xtqVarO = defpackage.alpv.o(almzVar.m());
                    xtqVarO.ah(defpackage.alnb.EVENT_FLOW_OUTPUT);
                    apdi apdiVar = defpackage.alnf.k;
                    aooh.e(apdiVar, "flowOutputEvent");
                    xtqVarO.ax(apdiVar, alnfVarAc);
                    defpackage.almz almzVarAg = xtqVarO.ag();
                    defpackage.allj alljVar = alvbVar.c;
                    xtq xtqVarO2 = defpackage.alpv.o(almzVar.m());
                    xtqVarO2.ah(defpackage.alnb.EVENT_ROBOCALL_DETECTED);
                    defpackage.almy almyVar = (defpackage.almy) obj6;
                    alljVar.a(xtqVarO2.ag(), almyVar);
                    alljVar.a(almzVarAg, almyVar);
                    alvgVar.k(defpackage.alvd.g);
                    return;
                }
            default:
                java.lang.Object obj7 = this.a;
                defpackage.alvc alvcVar = (defpackage.alvc) obj7;
                java.util.concurrent.locks.ReentrantLock reentrantLock = alvcVar.f;
                reentrantLock.lock();
                try {
                    if (((defpackage.alvc) obj7).h == null) {
                        reentrantLock.unlock();
                        return;
                    }
                    ((defpackage.alvc) obj7).h = null;
                    reentrantLock.unlock();
                    if (alvcVar.g) {
                        defpackage.alvc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "publishSilenceEvent", 284, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Bot speaking, ignoring silence timer.");
                        return;
                    }
                    java.lang.Object obj8 = this.b;
                    alvcVar.d.j(false);
                    defpackage.alvc.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenSilenceDetectorProcessor", "publishSilenceEvent", 290, "AgenticCallScreenSilenceDetectorProcessor.kt").v("Silence detected. Triggering turn taking.");
                    xtq xtqVarO3 = defpackage.alpv.o(defpackage.almz.a.m());
                    xtqVarO3.ah(defpackage.alnb.EVENT_SILENCE_DETECTED);
                    apdi apdiVar2 = defpackage.alvo.b;
                    aooh.e(apdiVar2, "silenceDetectedEvent");
                    akzx akzxVarM = defpackage.alvo.a.m();
                    aooh.f(akzxVarM, "builder");
                    alad aladVarP = akzxVarM.p();
                    aooh.e(aladVarP, "build(...)");
                    xtqVarO3.ax(apdiVar2, (defpackage.alvo) aladVarP);
                    alvcVar.e.a(xtqVarO3.ag(), (defpackage.almy) obj8);
                    return;
                } catch (java.lang.Throwable th4) {
                    reentrantLock.unlock();
                    throw th4;
                }
        }
    }

    public /* synthetic */ akbr(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
