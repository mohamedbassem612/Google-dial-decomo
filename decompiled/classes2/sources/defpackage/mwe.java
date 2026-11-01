package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class mwe implements qia, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public mwe(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a() {
        switch (this.$cid) {
            case 0:
                defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onAnswerButtonClicked", 79, "DobbyNotificationController.kt").v("user clicked on dobby answer button from notification");
                defpackage.mwj mwjVar = (defpackage.mwj) this.a;
                if (!mwjVar.l) {
                    mwjVar.i.b(mce.cf);
                    mwjVar.l = true;
                }
                mwjVar.d.a();
                aoov.an(mwjVar.c, (aolr) null, 0, new defpackage.mwi(mwjVar, null), 3);
                return;
            case 1:
                defpackage.jec.a.b().l("com/android/dialer/beesly/impl/v2/notification/BeeslyV2NotificationController", "onAnswerClicked", 46, "BeeslyV2NotificationController.kt").v("beesly notification answer button clicked");
                defpackage.jec jecVar = (defpackage.jec) this.a;
                aoov.an(jecVar.b, (aolr) null, 0, new defpackage.jeb(jecVar, (aoln) null, 0), 3);
                return;
            case 2:
                defpackage.mwj.a.b().l("com/android/dialer/dobby/impl/notification/DobbyNotificationController", "onHangUpButtonClicked", 169, "DobbyNotificationController.kt").v("user clicked on dobby hangup button from notification");
                defpackage.mwj mwjVar2 = (defpackage.mwj) this.a;
                mwjVar2.i.b(mce.cg);
                mwjVar2.a(mwjVar2.c, new defpackage.muz(mwjVar2, (aoln) null, 6, (byte[]) null));
                return;
            case 3:
                defpackage.mwj mwjVar3 = (defpackage.mwj) this.a;
                if (!mwjVar3.m) {
                    mwjVar3.i.b(mce.bM);
                    mwjVar3.m = true;
                }
                ptx ptxVar = mwjVar3.o;
                if (ptxVar.l() || ptxVar.r()) {
                    mwjVar3.i.b(mce.cr);
                    return;
                } else {
                    mwjVar3.a(mwjVar3.c, new defpackage.muz(mwjVar3, (aoln) null, 7, (char[]) null));
                    ahqx.l(mwjVar3.b, mwjVar3.q.bk(new otd(false, false, false, false, false, (qit) null, (abvz) null, (java.lang.String) null, (java.lang.Long) null, 511)));
                    return;
                }
            case 4:
                java.lang.Object obj = this.a;
                ahoq ahoqVarW = ahvr.W(610, "BasicActionsController_answer");
                try {
                    if (!((java.lang.Boolean) ((qjl) obj).k.a()).booleanValue() || !((qjl) obj).l) {
                        ((qjl) obj).l = true;
                        ((qjl) obj).c.n(rmw.kw);
                        ((qjl) obj).n.c(qbc.dN);
                        qax qaxVar = ((qjl) obj).g;
                        ruc rucVar = qaxVar.e;
                        qaxVar.s = rucVar.a();
                        qaxVar.t = rucVar.a();
                        defpackage.mba mbaVar = ((qjl) obj).h;
                        mbaVar.b(mce.aA);
                        mbaVar.b(mce.aB);
                        aoin aoinVar = ((qjl) obj).a;
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            ((qjl) obj).o.j(aoov.an(((qjl) obj).e, (aolr) null, 0, new oxe((qjl) obj, (aoln) null, 11, (char[]) null), 3), 5000L);
                        } else {
                            ahrv ahrvVarG = ahrv.g(((qjl) obj).p.X());
                            qfc qfcVar = new qfc(new pmu(18), 10);
                            ajcu ajcuVar = ((qjl) obj).d;
                            ((qjl) obj).i.g(ahvr.H(ahrvVarG.i(qfcVar, ajcuVar), new wik(new lwl(obj, 9), 1), ajcuVar), 5L, java.util.concurrent.TimeUnit.SECONDS);
                        }
                        ajcq ajcqVarB = ((qjl) obj).m.b();
                        ((qjl) obj).f.a();
                        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
                            ((qjl) obj).o.i(aoov.an(((qjl) obj).e, (aolr) null, 0, new defpackage.ohh(ajcqVarB, (qjl) obj, (aoln) null, 13), 3));
                        } else {
                            agsm.i(1315, ahvr.H(ajcqVarB, new qgx(new qji(obj, 2), 2), ((qjl) obj).d), "Failed to answer call.", new java.lang.Object[0]);
                        }
                    }
                    ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                    return;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        ajsz.ak(ahoqVarW, th);
                        throw th2;
                    }
                }
            case 5:
                java.lang.Object obj2 = this.a;
                qjl qjlVar = (qjl) obj2;
                if (((java.lang.Boolean) qjlVar.k.a()).booleanValue() && qjlVar.l) {
                    return;
                }
                qjlVar.l = true;
                qjlVar.c.n(rmw.kE);
                ajcq ajcqVarD = qjlVar.m.d();
                qjlVar.f.a();
                if (((java.lang.Boolean) qjlVar.a.a()).booleanValue()) {
                    qjlVar.o.i(aoov.an(qjlVar.e, (aolr) null, 0, new defpackage.ohh(ajcqVarD, qjlVar, null, 14, null), 3));
                    return;
                } else {
                    agsm.i(611, ahvr.H(ajcqVarD, new wik(new lwl(obj2, 8), 1), qjlVar.d), "Failed to answer video call.", new java.lang.Object[0]);
                    return;
                }
            case 6:
                java.lang.Object obj3 = this.a;
                qjl qjlVar2 = (qjl) obj3;
                qjlVar2.c.n(rmw.ky);
                pqm pqmVar = qjlVar2.m;
                if (pqmVar.a() == zpo.l) {
                    if (((java.lang.Boolean) qjlVar2.a.a()).booleanValue()) {
                        qjlVar2.o.i(aoov.an(qjlVar2.e, (aolr) null, 0, new oxe(qjlVar2, (aoln) null, 9), 3));
                        return;
                    } else {
                        agsm.i(613, ahvr.I(pqmVar.k(), new qfc(new qji(obj3, 0), 9), qjlVar2.d), "Failed to disconnect audio processing call.", new java.lang.Object[0]);
                        return;
                    }
                }
                if (((java.lang.Boolean) qjlVar2.a.a()).booleanValue()) {
                    qjlVar2.o.i(aoov.an(qjlVar2.e, (aolr) null, 0, new oxe(qjlVar2, (aoln) null, 10, (byte[]) null), 3));
                    return;
                } else {
                    agsm.i(612, pqmVar.f(), "Failed to disconnect ongoing call.", new java.lang.Object[0]);
                    return;
                }
            case 7:
                qjl qjlVar3 = (qjl) this.a;
                qjlVar3.c.n(rmw.kx);
                qjlVar3.h.b(mce.al);
                if (((java.lang.Boolean) qjlVar3.a.a()).booleanValue()) {
                    qjlVar3.o.i(aoov.an(qjlVar3.e, (aolr) null, 0, new oxe(qjlVar3, (aoln) null, 12, (short[]) null), 3));
                    return;
                } else {
                    agsm.i(614, qjlVar3.m.h(), "Failed to reject call.", new java.lang.Object[0]);
                    return;
                }
            case 8:
                qjl qjlVar4 = (qjl) this.a;
                qjlVar4.c.n(rmw.kC);
                qjlVar4.b.e(zmw.e);
                return;
            case 9:
                qjl qjlVar5 = (qjl) this.a;
                qjlVar5.c.n(rmw.kB);
                qjlVar5.b.e(zmw.d);
                return;
            default:
                qjl qjlVar6 = (qjl) this.a;
                qjlVar6.c.n(rmw.kL);
                if (((java.lang.Boolean) qjlVar6.a.a()).booleanValue()) {
                    qjlVar6.o.i(aoov.an(qjlVar6.e, (aolr) null, 0, new oxe(qjlVar6, (aoln) null, 13, (int[]) null), 3));
                    return;
                } else {
                    agsm.i(615, qjlVar6.m.l(), "Failed to unhold call.", new java.lang.Object[0]);
                    return;
                }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 1:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 2:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 3:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 4:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 5:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 6:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 7:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 8:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            case 9:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            default:
                if ((obj instanceof qia) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
        }
    }

    public final aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        switch (i) {
            case 0:
                return new aoof(0, obj, defpackage.mwj.class, "onAnswerButtonClicked", "onAnswerButtonClicked()V", 0);
            case 1:
                return new aoof(0, obj, defpackage.jec.class, "onAnswerClicked", "onAnswerClicked()V", 0);
            case 2:
                return new aoof(0, obj, defpackage.mwj.class, "onHangUpButtonClicked", "onHangUpButtonClicked()V", 0);
            case 3:
                return new aoof(0, obj, defpackage.mwj.class, "onScreenCallButtonClicked", "onScreenCallButtonClicked()V", 0);
            case 4:
                return new aoof(0, obj, qjl.class, "answer", "answer()V", 0);
            case 5:
                return new aoof(0, obj, qjl.class, "answerVideo", "answerVideo()V", 0);
            case 6:
                return new aoof(0, obj, qjl.class, "disconnect", "disconnect()V", 0);
            case 7:
                return new aoof(0, obj, qjl.class, "reject", "reject()V", 0);
            case 8:
                return new aoof(0, obj, qjl.class, "turnSpeakerOff", "turnSpeakerOff()V", 0);
            case 9:
                return new aoof(0, obj, qjl.class, "turnSpeakerOn", "turnSpeakerOn()V", 0);
            default:
                return new aoof(0, obj, qjl.class, "unhold", "unhold()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                break;
        }
        return ex().hashCode();
    }
}
