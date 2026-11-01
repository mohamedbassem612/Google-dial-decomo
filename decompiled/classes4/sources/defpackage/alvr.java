package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class alvr implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public alvr(defpackage.anmo anmoVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anmoVar);
        this.a = anmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$cid) {
            case 0:
                akzz akzzVarM = defpackage.almz.a.m();
                defpackage.alnb alnbVar = defpackage.alnb.EVENT_BOT_SILENCE_DEADLINE_REACHED;
                akzzVarM.u();
                defpackage.almz almzVar = akzzVarM.b;
                almzVar.c = alnbVar.aN;
                almzVar.b |= 1;
                apdi apdiVar = defpackage.almo.d;
                akzx akzxVarM = defpackage.almo.a.m();
                defpackage.alvs alvsVar = (defpackage.alvs) this.a;
                akzm akzmVarDH = ajsz.dH(alvsVar.b);
                akzxVarM.u();
                defpackage.almo almoVar = (defpackage.almo) akzxVarM.b;
                j$.util.Objects.requireNonNull(akzmVarDH);
                almoVar.c = akzmVarDH;
                almoVar.b |= 1;
                akzzVarM.bV(apdiVar, (defpackage.almo) akzxVarM.p());
                alvsVar.a.b(akzzVarM.p());
                return;
            case 1:
                defpackage.alun alunVar = (defpackage.alun) this.a;
                defpackage.alvg alvgVar = alunVar.c;
                if (alvgVar.c == defpackage.alvd.d) {
                    defpackage.alun.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleLlmVerdictTimeoutDuringSilence", 312, "AgenticCallScreenActionExecutorProcessor.kt").v("LLM verdict timeout reached after silence.");
                    java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
                    reentrantLock.lock();
                    try {
                        alvgVar.g++;
                        reentrantLock.unlock();
                        defpackage.alvg alvgVar2 = alunVar.c;
                        java.util.concurrent.locks.ReentrantLock reentrantLock2 = alvgVar2.b;
                        reentrantLock2.lock();
                        try {
                            int i = alvgVar2.g;
                            reentrantLock2.unlock();
                            if (i >= alunVar.e) {
                                defpackage.alun.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenActionExecutorProcessor", "handleLlmVerdictTimeoutDuringSilence", 319, "AgenticCallScreenActionExecutorProcessor.kt").v("Reached maximum consecutive LLM timeout events. Connecting call to user.");
                                java.lang.String strC = alunVar.c(defpackage.alwb.LLM_TIMEOUT_BAILOUT_TRIGGER, "ConnectToUserNotSpam");
                                defpackage.alsy alsyVar = defpackage.alsy.START_RINGING;
                                defpackage.alun.i(alunVar, strC, alsyVar, null, null, defpackage.alxx.DECISION_NOT_SPAM, 12);
                                alunVar.h(alsyVar);
                            } else {
                                alunVar.g(true);
                            }
                            alunVar.c.g();
                            alunVar.d = null;
                            return;
                        } catch (java.lang.Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    } catch (java.lang.Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                return;
            case 2:
                ((defpackage.alvy) this.a).c();
                return;
            case 3:
                ((defpackage.alza) this.a).b.set(false);
                return;
            case 4:
                defpackage.amcx amcxVar = (defpackage.amcx) this.a;
                amcxVar.n();
                amcxVar.i();
                return;
            case 5:
                try {
                    ((defpackage.anmo) this.a).j(new java.util.concurrent.TimeoutException("context timed out"));
                    return;
                } catch (java.lang.Throwable th3) {
                    defpackage.anmv.c.logp(java.util.logging.Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th3);
                    return;
                }
            case 6:
                ((defpackage.anrx) this.a).m();
                return;
            case 7:
                ((defpackage.anrx) this.a).o();
                return;
            case 8:
                ((defpackage.ansc) this.a).b();
                return;
            case org.chromium.net.NetworkException.ERROR_ADDRESS_UNREACHABLE /* 9 */:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((defpackage.ansf) obj).D(4)) {
                        ((defpackage.ansf) obj).x(((defpackage.ansf) obj).o, true);
                    }
                    break;
                }
                return;
            case org.chromium.net.NetworkException.ERROR_QUIC_PROTOCOL_FAILED /* 10 */:
                defpackage.answ answVar = (defpackage.answ) this.a;
                ahvr.bZ(answVar.i == null, "Already registered!");
                answVar.i = new defpackage.ansv(answVar);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addDataScheme("package");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                defpackage.ansv ansvVar = answVar.i;
                android.content.Context context = answVar.e;
                context.registerReceiver(ansvVar, intentFilter);
                context.registerReceiver(answVar.i, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            case org.chromium.net.NetworkException.ERROR_OTHER /* 11 */:
                defpackage.answ answVar2 = (defpackage.answ) this.a;
                anrc anrcVar = answVar2.g;
                anrcVar.c();
                ahvr.bY(answVar2.k != null);
                ahvr.bY(answVar2.k.isDone());
                defpackage.antw antwVar = answVar2.l;
                ahvr.ci(antwVar);
                aiql.I(answVar2.k, new defpackage.ansu(answVar2, antwVar), anrcVar);
                answVar2.k = null;
                if (answVar2.j) {
                    answVar2.j = false;
                    answVar2.e();
                    return;
                }
                return;
            case 12:
                defpackage.answ answVar3 = (defpackage.answ) this.a;
                defpackage.ansv ansvVar2 = answVar3.i;
                if (ansvVar2 != null) {
                    answVar3.e.unregisterReceiver(ansvVar2);
                    answVar3.i = null;
                    return;
                }
                return;
            case 13:
                ((defpackage.answ) this.a).e();
                return;
            case 14:
                ((anrc) this.a).a();
                return;
            case 15:
                defpackage.anul anulVar = (defpackage.anul) this.a;
                anzt anztVar = anulVar.b;
                defpackage.anlw anlwVar = anulVar.h;
                anztVar.h();
                anulVar.h = anlwVar;
                anulVar.b.b();
                return;
            case 16:
                anva anvaVar = (anva) this.a;
                defpackage.apjb apjbVar = anvaVar.e;
                if (apjbVar != null && apjbVar.k()) {
                    apjbVar.j();
                }
                anvaVar.d = null;
                return;
            case 17:
                ((defpackage.anwl) this.a).g.dw();
                return;
            case 18:
                ((defpackage.anwk) this.a).h();
                return;
            case 19:
                anyv anyvVar = ((anwn) this.a).f;
                defpackage.aodh aodhVar = defpackage.aodh.SUBCHANNEL_SHUTDOWN;
                ahvr.bZ(anyvVar.a.B.get(), "Channel must have been shut down");
                return;
            default:
                ((defpackage.anwq) this.a).f.f();
                return;
        }
    }

    public /* synthetic */ alvr(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public alvr(defpackage.anul anulVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anulVar);
        this.a = anulVar;
    }

    public alvr(defpackage.anwl anwlVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwlVar);
        this.a = anwlVar;
    }

    public alvr(defpackage.anwk anwkVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwkVar);
        this.a = anwkVar;
    }

    public alvr(anwn anwnVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwnVar);
        this.a = anwnVar;
    }

    public alvr(defpackage.anwq anwqVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anwqVar);
        this.a = anwqVar;
    }
}
