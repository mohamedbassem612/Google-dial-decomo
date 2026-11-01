package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jfc implements defpackage.jfg {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2");
    private final ipc A;
    private final afpl B;
    public final aoin b;
    public final aoin c;
    public final aoin d;
    public final aoss e;
    public final long f;
    public final defpackage.jek g;
    public final defpackage.jgk h;
    public final defpackage.mba i;
    public int j;
    public final zog k;
    public final znh l;
    public final znj m;
    public final znp n;
    public final pqm o;
    public final ptx p;
    public final qbe q;
    public final pci r;
    public final oud s;
    public final izg t;
    public final kgl u;
    public final apni v;
    private final android.content.Context w;
    private final ita x;
    private aoub y;
    private final ahda z;

    public jfc(aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoss aossVar, ajcu ajcuVar, android.content.Context context, long j, defpackage.jek jekVar, ita itaVar, defpackage.jgk jgkVar, pqm pqmVar, ptx ptxVar, ipc ipcVar, izg izgVar, apni apniVar, aazc aazcVar, kgl kglVar, qbe qbeVar, pci pciVar, oud oudVar, afpl afplVar, defpackage.mba mbaVar) {
        aooh.f(aoinVar, "enableSimulatedRingingFix");
        aooh.f(aoinVar2, "enableWearSyncFix");
        aooh.f(aoinVar3, "recordingFinalizationTimeoutMs");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(context, "appContext");
        aooh.f(jekVar, "callScopedMissedCallNotifier");
        aooh.f(itaVar, "beeslyLatestVoteStorage");
        aooh.f(jgkVar, "beeslySession");
        aooh.f(pqmVar, "callController");
        aooh.f(ptxVar, "callProperties");
        aooh.f(izgVar, "state");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aazcVar, "clock");
        aooh.f(kglVar, "beeslySot");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(pciVar, "arbiter");
        aooh.f(oudVar, "inCallActivityMinimizer");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.e = aossVar;
        this.w = context;
        this.f = j;
        this.g = jekVar;
        this.x = itaVar;
        this.h = jgkVar;
        this.o = pqmVar;
        this.p = ptxVar;
        this.A = ipcVar;
        this.t = izgVar;
        this.v = apniVar;
        this.u = kglVar;
        this.q = qbeVar;
        this.r = pciVar;
        this.s = oudVar;
        this.B = afplVar;
        this.i = mbaVar;
        this.z = new ahda((byte[]) null);
        this.j = -1;
        int i = 1;
        this.k = new defpackage.les(this, i);
        this.l = new defpackage.ncc(this, 1);
        this.m = new defpackage.nbx(this, i);
        this.n = new defpackage.ler(this, i);
    }

    public static final java.lang.Object w(pci pciVar, aoln aolnVar) {
        return pciVar.d(pca.c, aolnVar);
    }

    public static final java.lang.Object x(pci pciVar, aoln aolnVar) {
        return pciVar.f(pca.c, aolnVar);
    }

    public final ajcq a(aonj aonjVar) {
        return aosv.C(ahvr.ag(this.e, this.z, new defpackage.jeb(aonjVar, (aoln) null, 7, (byte[]) null)));
    }

    public final java.lang.Object b(aoln aolnVar) {
        java.lang.Object objC = c(new defpackage.jet(this, null), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    public final java.lang.Object c(aonj aonjVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.e, this.z, new defpackage.jeb(aonjVar, (aoln) null, 6)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.jeu jeuVar;
        if (aolnVar instanceof defpackage.jeu) {
            jeuVar = (defpackage.jeu) aolnVar;
            int i = jeuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jeuVar.c = i - Integer.MIN_VALUE;
            } else {
                jeuVar = new defpackage.jeu(this, aolnVar);
            }
        } else {
            jeuVar = new defpackage.jeu(this, aolnVar);
        }
        java.lang.Object objJ = jeuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jeuVar.c;
        if (i2 == 0) {
            aooc.af(objJ);
            izg izgVar = this.t;
            jeuVar.c = 1;
            objJ = izgVar.j(jeuVar);
            if (objJ == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objJ);
        }
        defpackage.jhb jhbVarB = defpackage.jhb.b(((defpackage.jhc) objJ).c);
        if (jhbVarB == null) {
            jhbVarB = defpackage.jhb.UNRECOGNIZED;
        }
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 532, "BeeslyLifecycleControllerV2.kt").y("fallback due to error at lifecycle %s", jhbVarB.name());
        switch (jhbVarB) {
            case NOT_SET:
            case ANSWERED:
            case DISCONNECTED:
                aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 540, "BeeslyLifecycleControllerV2.kt").y("Not executing fallback since call is in safe state %s", jhbVarB.name());
                break;
            case ELIGIBILITY_FAILED:
                if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
                    aimzVar.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 549, "BeeslyLifecycleControllerV2.kt").y("Not executing fallback since call is not beesly call in %s", jhbVarB.name());
                } else {
                    aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 544, "BeeslyLifecycleControllerV2.kt").v("executing fallback, end call.");
                    n();
                }
                break;
            case ELIGIBILITY_PASSED:
            case ACTIVATING_BACKGROUND:
            case ACTIVATING_FOREGROUND:
            case ACTIVE_BACKGROUND:
            case ACTIVE_FOREGROUND:
            case ANSWERING_BACKGROUND:
            case ANSWERING_FOREGROUND:
                this.i.a(mcd.aQ);
                aimzVar.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 560, "BeeslyLifecycleControllerV2.kt").v("executing fallback, end call.");
                n();
                break;
            default:
                aimzVar.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "fallbackDueToError", 566, "BeeslyLifecycleControllerV2.kt").y("Falling back due to error in unexpected state %s", jhbVarB.name());
                n();
                break;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.jev jevVar;
        if (aolnVar instanceof defpackage.jev) {
            jevVar = (defpackage.jev) aolnVar;
            int i = jevVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jevVar.c = i - Integer.MIN_VALUE;
            } else {
                jevVar = new defpackage.jev(this, aolnVar);
            }
        } else {
            jevVar = new defpackage.jev(this, aolnVar);
        }
        java.lang.Object objD = jevVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jevVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return aooh.q((j$.util.Optional) objD);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.B.X();
        jevVar.c = 1;
        objD = aosv.D(ajcqVarX, jevVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarW = ((defpackage.jes) aooc.ar(objD, defpackage.jes.class)).W();
        jevVar.c = 2;
        objD = aosv.D(ajcqVarW, jevVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    @Override // defpackage.jfg
    public final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objC = c(new defpackage.blq(this, (aoln) null, 13, (char[]) null), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    @Override // defpackage.jfg
    public final java.lang.Object g(defpackage.jfl jflVar, aoln aolnVar) {
        java.lang.Object objC = c(new defpackage.bqp(jflVar, this, (aoln) null, 2), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    @Override // defpackage.jfg
    public final java.lang.Object h(aoln aolnVar) {
        java.lang.Object objC = c(new wol((aoln) null, 1, (byte[]) null), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object i(aoln aolnVar) {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.jey jeyVar;
        if (aolnVar instanceof defpackage.jey) {
            jeyVar = (defpackage.jey) aolnVar;
            int i = jeyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jeyVar.c = i - Integer.MIN_VALUE;
            } else {
                jeyVar = new defpackage.jey(this, aolnVar);
            }
        } else {
            jeyVar = new defpackage.jey(this, aolnVar);
        }
        java.lang.Object objA = jeyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jeyVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            ita itaVar = this.x;
            jeyVar.c = 1;
            objA = itaVar.a(jeyVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.isx isxVar = (defpackage.isx) objA;
        a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "shouldTriggerBeeslyFeatureExtension", 167, "BeeslyLifecycleControllerV2.kt").y("canStart vote reason: %s", isxVar != null ? isxVar.a : null);
        return java.lang.Boolean.valueOf((isxVar != null ? isxVar.a : null) == defpackage.isw.f);
    }

    public final java.lang.Object k(int i, aoln aolnVar) {
        java.lang.Object objC = c(new defpackage.jez(this, i, null), aolnVar);
        return objC != aolu.a ? aojh.a : objC;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:36:0x011d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0120  */
    /* JADX WARN: Code duplicated, block: B:39:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object l(int i, aoln aolnVar) {
        defpackage.jfa jfaVar;
        int i2;
        defpackage.jhb jhbVar;
        if (aolnVar instanceof defpackage.jfa) {
            jfaVar = (defpackage.jfa) aolnVar;
            int i3 = jfaVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jfaVar.d = i3 - Integer.MIN_VALUE;
            } else {
                jfaVar = new defpackage.jfa(this, aolnVar);
            }
        } else {
            jfaVar = new defpackage.jfa(this, aolnVar);
        }
        defpackage.jfa jfaVar2 = jfaVar;
        java.lang.Object objJ = jfaVar2.b;
        aolu aoluVar = aolu.a;
        int i4 = jfaVar2.d;
        if (i4 != 0) {
            if (i4 == 1) {
                i2 = jfaVar2.a;
                aooc.af(objJ);
            } else if (i4 == 2) {
                i2 = jfaVar2.a;
                aooc.af(objJ);
                if (!((java.lang.Boolean) objJ).booleanValue()) {
                    a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 393, "BeeslyLifecycleControllerV2.kt").v("Failed to start Beesly since other takeover feature is running.");
                    aoov.an(this.e, (aolr) null, 0, new defpackage.jeb(this, (aoln) null, 12, (byte[][]) null), 3);
                    return aojh.a;
                }
                aoov.an(this.e, (aolr) null, 0, new defpackage.hxo(this, i2, (aoln) null, 5, (char[]) null), 3);
                a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 408, "BeeslyLifecycleControllerV2.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", this.s.a());
                try {
                    this.o.m();
                    jhbVar = defpackage.jhb.ACTIVATING_BACKGROUND;
                    jfaVar2.a = i2;
                    jfaVar2.d = 3;
                    if (m(jhbVar, jfaVar2) == aoluVar) {
                        return aoluVar;
                    }
                } catch (java.lang.IllegalStateException e) {
                    a.b().k(e).l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 420, "BeeslyLifecycleControllerV2.kt").v("Failed to transition to AUDIO_PROCESSING as the call is not in RINGING or ACTIVE state.");
                    this.q.a(qbc.cl);
                    return aojh.a;
                }
            } else {
                if (i4 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = jfaVar2.a;
                aooc.af(objJ);
            }
            if (i2 != 3) {
                this.q.a(qbc.cj);
            } else if (i2 == 5) {
                this.q.a(qbc.ck);
            }
            return aojh.a;
        }
        aooc.af(objJ);
        izg izgVar = this.t;
        i2 = i;
        jfaVar2.a = i2;
        jfaVar2.d = 1;
        objJ = izgVar.j(jfaVar2);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        defpackage.jhb jhbVarB = defpackage.jhb.b(((defpackage.jhc) objJ).c);
        if (jhbVarB == null) {
            jhbVarB = defpackage.jhb.UNRECOGNIZED;
        }
        defpackage.jhb jhbVar2 = jhbVarB;
        if (jhbVar2.ordinal() != 2) {
            aoov.an(this.e, (aolr) null, 0, new defpackage.hxo(this, i2, (aoln) null, 6, (short[]) null), 3);
            a.d().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 439, "BeeslyLifecycleControllerV2.kt").y("Can't start Beesly in background in state %s", jhbVar2.name());
        } else {
            a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 391, "BeeslyLifecycleControllerV2.kt").v("Starting Beesly in background.");
            pci pciVar = this.r;
            jfaVar2.a = i2;
            jfaVar2.d = 2;
            objJ = x(pciVar, jfaVar2);
            if (objJ == aoluVar) {
                return aoluVar;
            }
            if (!((java.lang.Boolean) objJ).booleanValue()) {
                a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 393, "BeeslyLifecycleControllerV2.kt").v("Failed to start Beesly since other takeover feature is running.");
                aoov.an(this.e, (aolr) null, 0, new defpackage.jeb(this, (aoln) null, 12, (byte[][]) null), 3);
                return aojh.a;
            }
            aoov.an(this.e, (aolr) null, 0, new defpackage.hxo(this, i2, (aoln) null, 5, (char[]) null), 3);
            a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "startBackgroundBeeslyLegacy", 408, "BeeslyLifecycleControllerV2.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", this.s.a());
            this.o.m();
            jhbVar = defpackage.jhb.ACTIVATING_BACKGROUND;
            jfaVar2.a = i2;
            jfaVar2.d = 3;
            if (m(jhbVar, jfaVar2) == aoluVar) {
                return aoluVar;
            }
            if (i2 != 3) {
                this.q.a(qbc.cj);
            } else if (i2 == 5) {
                this.q.a(qbc.ck);
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(defpackage.jhb jhbVar, aoln aolnVar) {
        defpackage.jfb jfbVar;
        qbc qbcVar;
        if (aolnVar instanceof defpackage.jfb) {
            jfbVar = (defpackage.jfb) aolnVar;
            int i = jfbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jfbVar.c = i - Integer.MIN_VALUE;
            } else {
                jfbVar = new defpackage.jfb(this, aolnVar);
            }
        } else {
            jfbVar = new defpackage.jfb(this, aolnVar);
        }
        java.lang.Object obj = jfbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jfbVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "transitionLifecycleStateTo", 637, "BeeslyLifecycleControllerV2.kt").y("transitioning to state %s", jhbVar.name());
            defpackage.jhb jhbVar2 = defpackage.jhb.ACTIVATING_BACKGROUND;
            if (jhbVar == jhbVar2) {
                this.i.b(mce.gY);
            }
            izg izgVar = this.t;
            akzx akzxVarM = defpackage.jgz.a.m();
            aooh.f(akzxVarM, "builder");
            akzx akzxVarM2 = defpackage.jgw.a.m();
            aooh.f(akzxVarM2, "builder");
            aooh.f(jhbVar, "value");
            akzxVarM2.u();
            ((defpackage.jgw) akzxVarM2.b).c = jhbVar.a();
            if (jhbVar == jhbVar2) {
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                akzxVarM2.u();
                defpackage.jgw jgwVar = (defpackage.jgw) akzxVarM2.b;
                jgwVar.b |= 1;
                jgwVar.d = epochMilli;
            }
            if (jhbVar == defpackage.jhb.ELIGIBILITY_PASSED) {
                akzxVarM2.u();
                defpackage.jgw jgwVar2 = (defpackage.jgw) akzxVarM2.b;
                jgwVar2.b |= 2;
                jgwVar2.e = true;
            }
            alad aladVarP = akzxVarM2.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.jgw jgwVar3 = (defpackage.jgw) aladVarP;
            aooh.f(jgwVar3, "value");
            akzxVarM.u();
            defpackage.jgz jgzVar = (defpackage.jgz) akzxVarM.b;
            j$.util.Objects.requireNonNull(jgwVar3);
            jgzVar.c = jgwVar3;
            jgzVar.b = 1;
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            jfbVar.d = jhbVar;
            jfbVar.c = 1;
            if (izgVar.k((defpackage.jgz) aladVarP2, jfbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jhbVar = jfbVar.d;
            aooc.af(obj);
        }
        switch (jhbVar) {
            case NOT_SET:
            default:
                qbcVar = null;
                break;
            case ELIGIBILITY_FAILED:
                qbcVar = qbc.ov;
                break;
            case ELIGIBILITY_PASSED:
                qbcVar = qbc.ow;
                break;
            case ACTIVATING_BACKGROUND:
                qbcVar = qbc.ox;
                break;
            case ACTIVATING_FOREGROUND:
                qbcVar = qbc.oy;
                break;
            case ACTIVE_BACKGROUND:
                qbcVar = qbc.oz;
                break;
            case ACTIVE_FOREGROUND:
                qbcVar = qbc.oA;
                break;
            case ANSWERED:
                qbcVar = qbc.oB;
                break;
            case DISCONNECTED:
                qbcVar = qbc.oC;
                break;
            case ANSWERING_BACKGROUND:
                qbcVar = qbc.oD;
                break;
            case ANSWERING_FOREGROUND:
                qbcVar = qbc.oE;
                break;
        }
        if (qbcVar != null) {
            this.q.a(qbcVar);
        }
        switch (jhbVar.ordinal()) {
            case 5:
            case 6:
                if (this.y == null) {
                    this.y = aoov.an(this.e, (aolr) null, 0, new defpackage.jeb(this, (aoln) null, 13, (char[][]) null), 3);
                }
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                aoub aoubVar = this.y;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                this.y = null;
                break;
        }
        return aojh.a;
    }

    public final void n() {
        a.b().l("com/android/dialer/beesly/impl/v2/service/BeeslyLifecycleControllerV2", "endCall", 578, "BeeslyLifecycleControllerV2.kt").v("ending call");
        aoov.an(this.e, (aolr) null, 0, new defpackage.jeb(this, (aoln) null, 5, (char[]) null), 3);
    }

    public final void o() {
        ahqx.l(this.w, this.A.bk(new otd(false, false, false, false, false, (qit) null, (abvz) null, (java.lang.String) null, (java.lang.Long) null, 511)));
    }

    public final boolean p(defpackage.jhb jhbVar) {
        int iOrdinal = jhbVar.ordinal();
        return iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5 || iOrdinal == 6 || iOrdinal == 9 || iOrdinal == 10;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object q() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object r() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object s() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object t(defpackage.jfo jfoVar) {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object u() {
        return aojh.a;
    }

    @Override // defpackage.jfg
    public final /* synthetic */ java.lang.Object v() {
        return aojh.a;
    }
}
