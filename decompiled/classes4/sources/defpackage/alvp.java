package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvp implements defpackage.allg, defpackage.aljt {
    public final defpackage.allj a;
    private final defpackage.aljq b;
    private final java.util.concurrent.locks.Lock c = new java.util.concurrent.locks.ReentrantLock();
    private alln d;
    private aigf e;
    private defpackage.alvq f;
    private defpackage.alwi g;
    private defpackage.alvx h;
    private boolean i;
    private int j;
    private final defpackage.alqf k;

    public alvp(defpackage.alli alliVar, defpackage.aljq aljqVar, defpackage.alqf alqfVar) {
        this.a = alliVar.a(defpackage.allh.R.name());
        this.b = aljqVar;
        this.k = alqfVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aihd.v(defpackage.alnb.EVENT_START_CONVERSATION, defpackage.alnb.EVENT_USER_END_CALL, defpackage.alnb.EVENT_USER_JOIN_CALL, defpackage.alnb.EVENT_MORE_HOLD_TIME, defpackage.alnb.EVENT_ASR_RESULT, defpackage.alnb.EVENT_FLOW_SIGNALS, new defpackage.alnb[0]);
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        aify aifyVarP;
        java.util.concurrent.locks.Lock lock = this.c;
        lock.lock();
        try {
            defpackage.aljq aljqVar = this.b;
            defpackage.almz almzVar = almyVar.h;
            if (almzVar == null) {
                almzVar = defpackage.almz.a;
            }
            aljqVar.c(almzVar);
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                defpackage.alvq alvqVar = this.f;
                defpackage.almz almzVar2 = almyVar.h;
                if (almzVar2 == null) {
                    almzVar2 = defpackage.almz.a;
                }
                defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar2.c);
                if (alnbVarB == null) {
                    alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
                }
                int iOrdinal = alnbVarB.ordinal();
                if (iOrdinal == 9) {
                    try {
                        alvqVar.c = j$.util.Optional.of(alvqVar.f.c(new defpackage.alkh(alvqVar, 10), almyVar, alvqVar.b));
                    } catch (defpackage.aljs e) {
                        a.by(defpackage.alvq.a.c(), "Scheduling cutting off hold finish failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/bam/BamSubFlow", "processEvent", 'D', "BamSubFlow.java", e);
                    }
                    java.lang.Object obj = alvqVar.d.b;
                    akzx akzxVarM = defpackage.alnf.a.m();
                    defpackage.alsz alszVar = defpackage.alsz.BOT;
                    akzxVarM.u();
                    defpackage.alnf alnfVar = (defpackage.alnf) akzxVarM.b;
                    alnfVar.h = alszVar.d;
                    alnfVar.b |= 2;
                    aifyVarP = aify.p(alvqVar.c(akzxVarM, (java.lang.String) obj));
                } else if (iOrdinal == 90) {
                    if (alvqVar.c.isPresent()) {
                        alvqVar.f.a((java.lang.String) alvqVar.c.get());
                    }
                    try {
                        alvqVar.c = j$.util.Optional.of(alvqVar.f.c(new defpackage.alkh(alvqVar, 10), almyVar, alvqVar.b));
                    } catch (defpackage.aljs e2) {
                        a.by(defpackage.alvq.a.c(), "Scheduling finish hold time event publication failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/bam/BamSubFlow", "handleMoreHoldTimeEvent", (char) 141, "BamSubFlow.java", e2);
                    }
                    aifyVarP = aify.p(alvqVar.a(defpackage.alwk.MORE_HOLD_TIME_TRIGGER, "WaitForUserResponse", defpackage.alsz.BOT));
                } else if (iOrdinal == 21) {
                    akzz akzzVarB = defpackage.alvq.b();
                    defpackage.alnb alnbVar = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
                    akzzVarB.u();
                    defpackage.almz almzVar3 = akzzVarB.b;
                    almzVar3.c = alnbVar.aN;
                    almzVar3.b |= 1;
                    aifyVarP = aify.q(akzzVarB.p(), alvqVar.a(defpackage.alwk.USER_END_CALL_TRIGGER, "EndCall", defpackage.alsz.USER));
                } else if (iOrdinal != 22) {
                    aifyVarP = aike.a;
                } else {
                    akzz akzzVarB2 = defpackage.alvq.b();
                    defpackage.alnb alnbVar2 = defpackage.alnb.EVENT_STOP_BOT_SPEECH;
                    akzzVarB2.u();
                    defpackage.almz almzVar4 = akzzVarB2.b;
                    almzVar4.c = alnbVar2.aN;
                    almzVar4.b |= 1;
                    aifyVarP = aify.q(akzzVarB2.p(), alvqVar.a(defpackage.alwk.USER_JOIN_CALL_TRIGGER, "JoinCall", defpackage.alsz.USER));
                }
                j$.util.Collection.-EL.stream(aifyVarP).forEach(new defpackage.agzo(this, almyVar, 8, null));
            } else if (i2 == 1) {
                j$.util.Collection.-EL.stream(this.h.a(almyVar)).forEach(new defpackage.agzo(this, almyVar, 9, null));
                lock.unlock();
                return;
            }
            this.c.unlock();
        } catch (java.lang.Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        apdi apdiVar = defpackage.alwi.h;
        almlVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almlVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        this.g = (defpackage.alwi) objJ;
        this.d = alln.g(alqdVar, almbVar.f, alkfVar);
        this.e = (aigf) j$.util.Collection.-EL.stream(this.g.e).filter(new defpackage.altw(11)).collect(aido.b(new defpackage.alpp(12), new defpackage.alpp(13)));
        this.j = 1;
        apdi apdiVar2 = defpackage.alwn.r;
        alqkVar.c(apdiVar2);
        java.lang.Object objJ2 = ((alaa) alqkVar).n.j((alac) apdiVar2.a);
        if (objJ2 == null) {
            objJ2 = apdiVar2.b;
        } else {
            apdiVar2.c(objJ2);
        }
        defpackage.alwj alwjVar = ((defpackage.alwn) objJ2).h;
        if (alwjVar == null) {
            alwjVar = defpackage.alwj.a;
        }
        this.i = alwjVar.c;
        defpackage.alwi alwiVar = this.g;
        alln allnVar = this.d;
        aigf aigfVar = this.e;
        defpackage.alqf alqfVar = this.k;
        this.f = new defpackage.alvq(alwiVar, allnVar, aigfVar, alqfVar, this);
        defpackage.alyk alykVar = this.g.g;
        if (alykVar == null) {
            alykVar = defpackage.alyk.a;
        }
        this.h = new defpackage.alvx(alykVar, this.d, alqfVar, this);
    }

    public final void g(defpackage.almz almzVar, defpackage.almy almyVar) {
        defpackage.alwk alwkVarB;
        if (this.i) {
            alam alamVar = new alam(this.g.f, defpackage.alwi.a);
            apdi apdiVar = defpackage.alnf.k;
            almzVar.c(apdiVar);
            java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
            if (objJ == null) {
                objJ = apdiVar.b;
            } else {
                apdiVar.c(objJ);
            }
            defpackage.alnf alnfVar = (defpackage.alnf) objJ;
            if (alnfVar.e != 9 || (alwkVarB = defpackage.alwk.b(((java.lang.Integer) alnfVar.f).intValue())) == null) {
                alwkVarB = defpackage.alwk.NO_TRIGGER;
            }
            if (alamVar.contains(alwkVarB)) {
                this.j = 2;
                this.a.a(this.h.c(2, almyVar, defpackage.alsz.BOT), almyVar);
                return;
            }
        }
        this.a.a(almzVar, almyVar);
    }

    @Override // defpackage.aljt
    public final void v(defpackage.almz almzVar, defpackage.almy almyVar) {
        int iAQ;
        java.util.concurrent.locks.Lock lock = this.c;
        lock.lock();
        try {
            int i = this.j;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 != 0) {
                if (i2 == 1 && (iAQ = a.aQ(almzVar.d)) != 0 && iAQ == 2) {
                    this.a.a(almzVar, almyVar);
                }
                this.c.unlock();
                return;
            }
            int iAQ2 = a.aQ(almzVar.d);
            if (iAQ2 != 0 && iAQ2 == 3) {
                g(almzVar, almyVar);
            }
            lock.unlock();
        } catch (java.lang.Throwable th) {
            this.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
