package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class toj {
    private static final java.util.Set G;
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/service/SharpieLifecycleController");
    public static final java.util.Set b;
    public final defpackage.tpf A;
    public final defpackage.rju B;
    public final heq C;
    public final defpackage.zlr D;
    public final apni E;
    public final defpackage.aprf F;
    private final aoss H;
    private final defpackage.tpf I;
    private final defpackage.ttw J;
    private final tmi K;
    private final defpackage.wby L;
    private final defpackage.tuy M;
    private final defpackage.tre N;
    private int O;
    private final defpackage.ysb P;
    private final yvh Q;
    private final defpackage.tqf R;
    private final tkl S;
    private final defpackage.uss T;
    private final ahda U;
    private final defpackage.afpl V;
    public final aoss c;
    public final defpackage.tms d;
    public final mba e;
    public final defpackage.tlw f;
    public final aoin g;
    public final defpackage.tlx h;
    public final zog i;
    public final defpackage.zni j;
    public final defpackage.znw k;
    public final defpackage.znp l;
    public final defpackage.znk m;
    public final defpackage.put n;
    public final defpackage.puu o;
    public final defpackage.zob p;
    public final defpackage.zoc q;
    public final defpackage.znd r;
    public aosb s;
    public final defpackage.pqm t;
    public final defpackage.qbe u;
    public final zpz v;
    public final defpackage.pqo w;
    public final defpackage.tnq x;
    public final defpackage.tnr y;
    public final defpackage.yyf z;

    static {
        aooh.e(j$.time.Duration.ofMinutes(6L), "ofMinutes(...)");
        b = ajsz.cW(new defpackage.tth[]{defpackage.tth.STARTING, defpackage.tth.SCAM_DETECTION_RUNNING, defpackage.tth.SCAM_DETECTED});
        G = ajsz.cW(new defpackage.ywx[]{defpackage.ywx.i, defpackage.ywx.j, defpackage.ywx.f, defpackage.ywx.c});
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [tnr] */
    public toj(aoss aossVar, aoss aossVar2, defpackage.pqm pqmVar, defpackage.zlr zlrVar, defpackage.yyf yyfVar, defpackage.tpf tpfVar, defpackage.ttw ttwVar, defpackage.qbe qbeVar, defpackage.tms tmsVar, aazc aazcVar, tkl tklVar, mba mbaVar, defpackage.tpf tpfVar2, defpackage.tlw tlwVar, heq heqVar, apni apniVar, defpackage.rju rjuVar, defpackage.afpl afplVar, zpz zpzVar, defpackage.pqo pqoVar, defpackage.ysb ysbVar, tmi tmiVar, aoin aoinVar, defpackage.wby wbyVar, defpackage.tuy tuyVar, defpackage.uss ussVar, defpackage.tre treVar, defpackage.tlx tlxVar, aais aaisVar, yvh yvhVar, defpackage.rai raiVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "backgroundScope");
        aooh.f(pqmVar, "callController");
        aooh.f(zlrVar, "sharpieState");
        aooh.f(tpfVar, "sharpieSnackbarController");
        aooh.f(ttwVar, "sharpieStorageDataWriter");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aazcVar, "clock");
        aooh.f(tklVar, "inCallUiVisibilityProvider");
        aooh.f(tpfVar2, "callEventClearcutLogger");
        aooh.f(tlwVar, "sharpieScoobyClearcutLogger");
        aooh.f(apniVar, "androidJobs");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(pqoVar, "callDirection");
        aooh.f(ysbVar, "aiCoreAvailability");
        aooh.f(tmiVar, "dialerSharpieConfigProvider");
        aooh.f(aoinVar, "sharpiePendingPreconditionsTimeoutMillis");
        aooh.f(tuyVar, "sharpieWearRelay");
        aooh.f(ussVar, "disclaimerController");
        aooh.f(aaisVar, "sanitizer");
        aooh.f(raiVar, "preconditionCheckerFactory");
        this.c = aossVar;
        this.H = aossVar2;
        this.t = pqmVar;
        this.D = zlrVar;
        this.z = yyfVar;
        this.I = tpfVar;
        this.J = ttwVar;
        this.u = qbeVar;
        this.d = tmsVar;
        this.S = tklVar;
        this.e = mbaVar;
        this.A = tpfVar2;
        this.f = tlwVar;
        this.C = heqVar;
        this.E = apniVar;
        this.B = rjuVar;
        this.V = afplVar;
        this.v = zpzVar;
        this.w = pqoVar;
        this.P = ysbVar;
        this.K = tmiVar;
        this.g = aoinVar;
        this.L = wbyVar;
        this.M = tuyVar;
        this.T = ussVar;
        this.N = treVar;
        this.h = tlxVar;
        this.Q = yvhVar;
        this.U = new ahda((byte[]) null);
        this.i = new les(this, 13);
        this.j = new leq(this, 8);
        this.k = new defpackage.tno(this, 0);
        this.l = new ler(this, 14);
        this.m = new defpackage.pva(this, 5);
        this.n = new defpackage.pvp(this, 6);
        this.o = new defpackage.qpi(this, 3);
        int i = 2;
        this.p = new defpackage.qgj(this, i);
        this.q = new defpackage.qgl(this, i);
        this.r = new defpackage.xcw(this, 1);
        defpackage.tnq tnqVar = new defpackage.tnq(this);
        this.x = tnqVar;
        this.y = new aood() { // from class: tnr
            public final boolean equals(java.lang.Object obj) {
                if ((obj instanceof defpackage.tnr) && (obj instanceof aood)) {
                    return aooh.n(ex(), ((aood) obj).ex());
                }
                return false;
            }

            public final aoio ex() {
                return new aoof(2, this.a, defpackage.toj.class, "onSessionEventReceived", "onSessionEventReceived(Lcom/android/dialer/audioprism/api/session/AudioPrismSessionEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return ex().hashCode();
            }
        };
        this.F = new defpackage.aprf(this, (byte[]) null);
        this.R = raiVar.r(tnqVar);
    }

    public final ajcq a(aonj aonjVar) {
        return aosv.C(ahvr.ag(this.c, this.U, new defpackage.tkx(aonjVar, (aoln) null, 12, (byte[]) null)));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [toj] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, tqp] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    public final java.lang.Object b(aoln aolnVar) throws aois {
        defpackage.tns tnsVar;
        ?? r14;
        ?? r13;
        java.lang.Object objE;
        defpackage.tth tthVar;
        ?? r15;
        if (aolnVar instanceof defpackage.tns) {
            tnsVar = (defpackage.tns) aolnVar;
            int i = tnsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnsVar.d = i - Integer.MIN_VALUE;
            } else {
                tnsVar = new defpackage.tns(this, aolnVar);
            }
        } else {
            tnsVar = new defpackage.tns(this, aolnVar);
        }
        java.lang.Object objA = tnsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tnsVar.d;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.tqf tqfVar = this.R;
            tnsVar.d = 1;
            objA = tqfVar.a(tnsVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    java.lang.Object obj = tnsVar.a;
                    aooc.af(objA);
                    r14 = obj;
                    tthVar = defpackage.tth.NOT_A_SHARPIE_CALL;
                    tnsVar.a = r14;
                    tnsVar.d = 3;
                    if (v(tthVar, false, tnsVar) != aoluVar) {
                        return aoluVar;
                    }
                    r15 = r14;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4 && i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj2 = tnsVar.a;
                        aooc.af(objA);
                        r13 = obj2;
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "canStartScamDetectionSession", 982, "SharpieLifecycleController.kt").y("session can not start: %s", (java.lang.Object) r13);
                        return java.lang.Boolean.FALSE;
                    }
                    java.lang.Object obj3 = tnsVar.a;
                    aooc.af(objA);
                    r15 = obj3;
                }
                a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "canStartScamDetectionSession", 966, "SharpieLifecycleController.kt").y("session can not start: %s", (java.lang.Object) r15);
                return java.lang.Boolean.FALSE;
            }
            aooc.af(objA);
        }
        r14 = (defpackage.tqp) objA;
        j$.util.Objects.checkIndex(0, 4);
        if (r14 != 0) {
            if (r14 instanceof defpackage.tqg) {
                x(r14);
                return java.lang.Boolean.TRUE;
            }
            if (r14 instanceof defpackage.tqh) {
                x(r14);
                defpackage.tqk tqkVar = ((defpackage.tqh) r14).a;
                if (tqkVar instanceof defpackage.tqj) {
                    defpackage.yww ywwVar = ((defpackage.tqj) tqkVar).a;
                    tnsVar.a = r14;
                    tnsVar.d = 2;
                    java.util.Set set = G;
                    defpackage.ywx ywxVar = ywwVar.a;
                    if (set.contains(ywxVar)) {
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "downloadMissingModels", 696, "SharpieLifecycleController.kt").y("Session start failed because: %s", ywxVar);
                        objE = this.Q.e(tnsVar);
                        if (objE != aoluVar) {
                            objE = aojh.a;
                        }
                    } else {
                        objE = aojh.a;
                    }
                    if (objE == aoluVar) {
                        return aoluVar;
                    }
                }
                tthVar = defpackage.tth.NOT_A_SHARPIE_CALL;
                tnsVar.a = r14;
                tnsVar.d = 3;
                if (v(tthVar, false, tnsVar) != aoluVar) {
                    return aoluVar;
                }
                r15 = r14;
                a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "canStartScamDetectionSession", 966, "SharpieLifecycleController.kt").y("session can not start: %s", (java.lang.Object) r15);
                return java.lang.Boolean.FALSE;
            }
            if (r14 instanceof defpackage.tql) {
                defpackage.tth tthVarB = defpackage.tth.b(this.D.m().c);
                if (tthVarB == null) {
                    tthVarB = defpackage.tth.UNRECOGNIZED;
                }
                if (tthVarB == defpackage.tth.PRECONDITION_PENDING) {
                    a.d().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "canStartScamDetectionSession", 973, "SharpieLifecycleController.kt").y("attemping to transition to pending state while in precondition pending state with reason: %s", (java.lang.Object) r14);
                    x(r14);
                    defpackage.tth tthVar2 = defpackage.tth.NOT_A_SHARPIE_CALL;
                    tnsVar.a = r14;
                    tnsVar.d = 4;
                    if (v(tthVar2, false, tnsVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    tnsVar.a = r14;
                    tnsVar.d = 5;
                    if (w(r14, tnsVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                r13 = r14;
                a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "canStartScamDetectionSession", 982, "SharpieLifecycleController.kt").y("session can not start: %s", (java.lang.Object) r13);
                return java.lang.Boolean.FALSE;
            }
        }
        throw new aois();
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tnt tntVar;
        defpackage.qtz qtzVar;
        defpackage.qtz qtzVar2;
        if (aolnVar instanceof defpackage.tnt) {
            tntVar = (defpackage.tnt) aolnVar;
            int i = tntVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tntVar.c = i - Integer.MIN_VALUE;
            } else {
                tntVar = new defpackage.tnt(this, aolnVar);
            }
        } else {
            tntVar = new defpackage.tnt(this, aolnVar);
        }
        java.lang.Object obj = tntVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tntVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            int i3 = this.O + 1;
            this.O = i3;
            aimz aimzVar = a;
            if (i3 > 3) {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "checkAttemptsAndHandleStartError", 684, "SharpieLifecycleController.kt").v("max retry attempts reached");
                defpackage.tth tthVar = defpackage.tth.ENDED;
                tntVar.c = 1;
                if (v(tthVar, false, tntVar) == aoluVar) {
                    return aoluVar;
                }
                qtzVar = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_START_ERROR_END;
                tntVar.c = 2;
                if (e(qtzVar, tntVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                aimzVar.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "checkAttemptsAndHandleStartError", 688, "SharpieLifecycleController.kt").v("session paused");
                defpackage.tth tthVar2 = defpackage.tth.PAUSED;
                tntVar.c = 3;
                if (v(tthVar2, false, tntVar) == aoluVar) {
                    return aoluVar;
                }
                qtzVar2 = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_START_ERROR_PAUSE;
                tntVar.c = 4;
                if (e(qtzVar2, tntVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    aooc.af(obj);
                    qtzVar2 = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_START_ERROR_PAUSE;
                    tntVar.c = 4;
                    if (e(qtzVar2, tntVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            aooc.af(obj);
        } else {
            aooc.af(obj);
            qtzVar = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_START_ERROR_END;
            tntVar.c = 2;
            if (e(qtzVar, tntVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final java.lang.Object d(aoln aolnVar) {
        java.lang.Object objV = v(defpackage.tth.PAUSED, false, aolnVar);
        return objV != aolu.a ? aojh.a : objV;
    }

    public final java.lang.Object e(defpackage.qtz qtzVar, aoln aolnVar) {
        defpackage.tpf tpfVar = this.I;
        java.lang.Object objA = ahvr.ag(tpfVar.a, (ahda) tpfVar.b, new roz(tpfVar, qtzVar, (aoln) null, 15)).a(aolnVar);
        aolu aoluVar = aolu.a;
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        return objA != aoluVar ? aojh.a : objA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object f(boolean z, aoln aolnVar) throws aois {
        java.lang.Object objU = u(defpackage.tth.ENDED, z, aolnVar);
        return objU != aolu.a ? aojh.a : objU;
    }

    public final java.lang.Object g(aonj aonjVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.U, new defpackage.tkx(aonjVar, (aoln) null, 11)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.tnu tnuVar;
        if (aolnVar instanceof defpackage.tnu) {
            tnuVar = (defpackage.tnu) aolnVar;
            int i = tnuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnuVar.c = i - Integer.MIN_VALUE;
            } else {
                tnuVar = new defpackage.tnu(this, aolnVar);
            }
        } else {
            tnuVar = new defpackage.tnu(this, aolnVar);
        }
        java.lang.Object objB = tnuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tnuVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            return aojh.a;
        }
        aooc.af(objB);
        tmi tmiVar = this.K;
        tnuVar.c = 1;
        objB = tmiVar.b(tnuVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        if (!(((defpackage.yuw) objB).a instanceof defpackage.yus)) {
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "getAiCoreAvailability", 842, "SharpieLifecycleController.kt").v("AiCore not available on this device, do not wait for pending aicore availability status.");
            return aojh.a;
        }
        defpackage.tth tthVarB = defpackage.tth.b(this.D.m().c);
        if (tthVarB == null) {
            tthVarB = defpackage.tth.UNRECOGNIZED;
        }
        if (tthVarB != defpackage.tth.PRECONDITION_PENDING) {
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "getAiCoreAvailability", 850, "SharpieLifecycleController.kt").v("Not in precondition pending state, do not wait for pending aicore availability status.");
            return aojh.a;
        }
        if (((defpackage.ysc) this.P.e.get(defpackage.yse.d)) != null) {
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "getAiCoreAvailability", 858, "SharpieLifecycleController.kt").v("aicore availability status is already available, do not wait for pending aicore availability status.");
            return aojh.a;
        }
        tnuVar.c = 2;
        aosc aoscVar = new aosc(ajsz.ap(tnuVar), 1);
        aoscVar.z();
        this.s = aoscVar;
        if (aoscVar.k() == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.tnv tnvVar;
        if (aolnVar instanceof defpackage.tnv) {
            tnvVar = (defpackage.tnv) aolnVar;
            int i = tnvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnvVar.c = i - Integer.MIN_VALUE;
            } else {
                tnvVar = new defpackage.tnv(this, aolnVar);
            }
        } else {
            tnvVar = new defpackage.tnv(this, aolnVar);
        }
        java.lang.Object objL = tnvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tnvVar.c;
        if (i2 == 0) {
            aooc.af(objL);
            tnvVar.c = 1;
            objL = l(tnvVar);
            if (objL != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objL);
            return objL;
        }
        aooc.af(objL);
        ajcq ajcqVarAB = ((defpackage.tnp) objL).aB();
        tnvVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAB, tnvVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(boolean z, aoln aolnVar) {
        defpackage.tnw tnwVar;
        defpackage.qtz qtzVar;
        if (aolnVar instanceof defpackage.tnw) {
            tnwVar = (defpackage.tnw) aolnVar;
            int i = tnwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnwVar.c = i - Integer.MIN_VALUE;
            } else {
                tnwVar = new defpackage.tnw(this, aolnVar);
            }
        } else {
            tnwVar = new defpackage.tnw(this, aolnVar);
        }
        java.lang.Object obj = tnwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tnwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!z) {
                defpackage.tth tthVarB = defpackage.tth.b(this.D.m().c);
                if (tthVarB == null) {
                    tthVarB = defpackage.tth.UNRECOGNIZED;
                }
                if (tthVarB == defpackage.tth.SCAM_DETECTION_RUNNING) {
                    a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "handleError", 545, "SharpieLifecycleController.kt").v("unrecoverable error - ending session and showing error snackbar");
                    this.u.a(qbc.lO);
                    tnwVar.c = 1;
                    if (f(false, tnwVar) == aoluVar) {
                        return aoluVar;
                    }
                    qtzVar = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_ERROR;
                    tnwVar.c = 2;
                    if (e(qtzVar, tnwVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else if (i2 == 1) {
            aooc.af(obj);
            qtzVar = defpackage.qtz.SNACKBAR_SHARPIE_SESSION_ERROR;
            tnwVar.c = 2;
            if (e(qtzVar, tnwVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object k(aoln aolnVar) throws aois {
        java.util.List listBb = ajsz.bb(new defpackage.tth[]{defpackage.tth.PRECONDITION_PENDING, defpackage.tth.STARTING, defpackage.tth.SCAM_DETECTION_RUNNING});
        defpackage.tth tthVarB = defpackage.tth.b(this.D.m().c);
        if (tthVarB == null) {
            tthVarB = defpackage.tth.UNRECOGNIZED;
        }
        if (listBb.contains(tthVarB)) {
            this.u.a(qbc.lL);
            java.lang.Object objU = u(defpackage.tth.NOT_A_SHARPIE_CALL, false, aolnVar);
            if (objU == aolu.a) {
                return objU;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(aoln aolnVar) {
        defpackage.tnx tnxVar;
        if (aolnVar instanceof defpackage.tnx) {
            tnxVar = (defpackage.tnx) aolnVar;
            int i = tnxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnxVar.c = i - Integer.MIN_VALUE;
            } else {
                tnxVar = new defpackage.tnx(this, aolnVar);
            }
        } else {
            tnxVar = new defpackage.tnx(this, aolnVar);
        }
        java.lang.Object objD = tnxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tnxVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.V.X();
            tnxVar.c = 1;
            objD = aosv.D(ajcqVarX, tnxVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.tnp.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, yxm] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public final java.lang.Object m(defpackage.yxm yxmVar, aoln aolnVar) {
        defpackage.tny tnyVar;
        if (aolnVar instanceof defpackage.tny) {
            tnyVar = (defpackage.tny) aolnVar;
            int i = tnyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnyVar.d = i - Integer.MIN_VALUE;
            } else {
                tnyVar = new defpackage.tny(this, aolnVar);
            }
        } else {
            tnyVar = new defpackage.tny(this, aolnVar);
        }
        java.lang.Object obj = tnyVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tnyVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Objects.checkIndex(0, 3);
            if (yxmVar != 0) {
                if (yxmVar instanceof defpackage.yxi) {
                    defpackage.tlw tlwVar = this.f;
                    int i3 = ((defpackage.yxi) yxmVar).a;
                    tnyVar.a = yxmVar;
                    tnyVar.d = 1;
                    java.lang.Object objA = ahvr.ag(tlwVar.a, tlwVar.i, new defpackage.tmk(tlwVar, i3, (aoln) null, 1)).a(tnyVar);
                    if (objA != aoluVar) {
                        objA = aojh.a;
                    }
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                } else if (yxmVar instanceof defpackage.yxk) {
                    a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "logScamDetectionRecord", 516, "SharpieLifecycleController.kt").y("Hades scam detection verdict: %s", aais.aD(((defpackage.yxk) yxmVar).a));
                }
            }
            return aojh.a;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yxmVar = tnyVar.a;
        aooc.af(obj);
        defpackage.abbi abbiVar = ((defpackage.yxi) yxmVar).b;
        if (abbiVar != null) {
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "logScamDetectionRecord", 511, "SharpieLifecycleController.kt").y("Hades scam intent policy verdict: %s", aais.aD(abbiVar));
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(aoln aolnVar) {
        defpackage.tnz tnzVar;
        if (aolnVar instanceof defpackage.tnz) {
            tnzVar = (defpackage.tnz) aolnVar;
            int i = tnzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tnzVar.c = i - Integer.MIN_VALUE;
            } else {
                tnzVar = new defpackage.tnz(this, aolnVar);
            }
        } else {
            tnzVar = new defpackage.tnz(this, aolnVar);
        }
        java.lang.Object obj = tnzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tnzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "logSharpieSessionStarted", 720, "SharpieLifecycleController.kt").v("start session succeeded, transitioned to SCAM_DETECTION_RUNNING");
            this.e.b(mce.fE);
            defpackage.tlw tlwVar = this.f;
            tnzVar.c = 1;
            java.lang.Object objA = ahvr.ag(tlwVar.a, tlwVar.i, new defpackage.sfo(tlwVar, (aoln) null, 20, (short[]) null)).a(tnzVar);
            if (objA != aoluVar) {
                objA = aojh.a;
            }
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        this.u.a(qbc.lK);
        j$.util.Optional optionalE = this.S.e();
        aooh.e(optionalE, "getIsInCallUiShowing(...)");
        if (!((java.lang.Boolean) aooh.p(optionalE, java.lang.Boolean.FALSE)).booleanValue()) {
            this.e.b(mce.fF);
        }
        return aojh.a;
    }

    public final java.lang.Object o(alcf alcfVar, aoln aolnVar) {
        java.lang.Object objG = g(new nhv(this, alcfVar, (aoln) null, 3, (byte[]) null), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(aoln aolnVar) {
        defpackage.toc tocVar;
        if (aolnVar instanceof defpackage.toc) {
            tocVar = (defpackage.toc) aolnVar;
            int i = tocVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tocVar.c = i - Integer.MIN_VALUE;
            } else {
                tocVar = new defpackage.toc(this, aolnVar);
            }
        } else {
            tocVar = new defpackage.toc(this, aolnVar);
        }
        java.lang.Object objL = tocVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tocVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objL);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objL);
            }
            return java.lang.Boolean.valueOf(objL == hxe.a);
        }
        aooc.af(objL);
        defpackage.uss ussVar = this.T;
        defpackage.pzd pzdVar = defpackage.pzd.d;
        tocVar.c = 1;
        objL = ussVar.l(new defpackage.rir(ussVar, pzdVar, (aoln) null, 1), tocVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarB = ((hxf) objL).b();
        aooh.e(ajcqVarB, "playbackEndedFuture(...)");
        tocVar.c = 2;
        objL = aosv.D(ajcqVarB, tocVar);
        if (objL == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(objL == hxe.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [tqp] */
    public final java.lang.Object q(defpackage.tqp tqpVar, aoln aolnVar) {
        defpackage.tod todVar;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.tod) {
            todVar = (defpackage.tod) aolnVar;
            int i = todVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                todVar.d = i - Integer.MIN_VALUE;
            } else {
                todVar = new defpackage.tod(this, aolnVar);
            }
        } else {
            todVar = new defpackage.tod(this, aolnVar);
        }
        java.lang.Object objL = todVar.b;
        aolu aoluVar = aolu.a;
        int i2 = todVar.d;
        if (i2 == 0) {
            aooc.af(objL);
            todVar.a = tqpVar;
            todVar.d = 1;
            objL = l(todVar);
            if (objL == aoluVar) {
                obj = tqpVar;
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = todVar.a;
            aooc.af(objL);
            obj = obj2;
        }
        obj = tqpVar;
        aoov.an(this.H, (aolr) null, 0, new defpackage.rjk(this, (defpackage.tqp) obj, (defpackage.tnp) objL, (aoln) null, 16), 3);
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(aoln aolnVar) throws aois {
        defpackage.toe toeVar;
        if (aolnVar instanceof defpackage.toe) {
            toeVar = (defpackage.toe) aolnVar;
            int i = toeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                toeVar.c = i - Integer.MIN_VALUE;
            } else {
                toeVar = new defpackage.toe(this, aolnVar);
            }
        } else {
            toeVar = new defpackage.toe(this, aolnVar);
        }
        java.lang.Object objC = toeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = toeVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else if (i2 == 2) {
                aooc.af(objC);
                toeVar.c = 3;
                if (n(toeVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3 && i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aojh.a;
        }
        aooc.af(objC);
        defpackage.tre treVar = this.N;
        toeVar.c = 1;
        objC = treVar.c(toeVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        defpackage.tri triVar = (defpackage.tri) objC;
        int iV = anty.V(triVar);
        if (iV == 0) {
            defpackage.tth tthVar = defpackage.tth.SCAM_DETECTION_RUNNING;
            toeVar.c = 2;
            if (v(tthVar, false, toeVar) == aoluVar) {
                return aoluVar;
            }
            toeVar.c = 3;
            if (n(toeVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (iV != 1) {
                throw new aois();
            }
            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startScamDetectorSession", 713, "SharpieLifecycleController.kt").y("failed to start session: %s", ((defpackage.trf) triVar).a);
            defpackage.tth tthVar2 = defpackage.tth.ENDED;
            toeVar.c = 4;
            if (v(tthVar2, false, toeVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0102 A[Catch: all -> 0x01cd, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0123 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0153 A[Catch: all -> 0x01cd, TRY_ENTER, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0176 A[Catch: all -> 0x01cd, TRY_LEAVE, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0194 A[Catch: all -> 0x01cd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c6 A[Catch: all -> 0x01cd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01cd, blocks: (B:68:0x016c, B:70:0x0176, B:74:0x0194, B:59:0x011d, B:61:0x0123, B:66:0x0153, B:57:0x0110, B:53:0x00fa, B:55:0x0102, B:81:0x01c6, B:38:0x0084, B:40:0x0092, B:41:0x0094, B:43:0x009c, B:44:0x00ba, B:46:0x00be, B:47:0x00dc, B:49:0x00e0, B:51:0x00ef, B:50:0x00e8), top: B:96:0x0084 }] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0, types: [toj] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final java.lang.Object s(aoln aolnVar) {
        defpackage.tof tofVar;
        ahoq ahoqVarZ;
        java.lang.Object objB;
        aojh aojhVar;
        aojh aojhVar2;
        defpackage.tth tthVar;
        java.lang.Object objA;
        java.lang.Object objP;
        ahoq ahoqVar;
        aojh aojhVar3;
        boolean zBooleanValue;
        defpackage.qbe qbeVar;
        ahoq ahoqVar2;
        if (aolnVar instanceof defpackage.tof) {
            tofVar = (defpackage.tof) aolnVar;
            int i = tofVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tofVar.c = i - Integer.MIN_VALUE;
            } else {
                tofVar = new defpackage.tof(this, aolnVar);
            }
        } else {
            tofVar = new defpackage.tof(this, aolnVar);
        }
        java.lang.Object obj = tofVar.a;
        aolu aoluVar = aolu.a;
        ?? r2 = tofVar.c;
        try {
            try {
                switch (r2) {
                    case 0:
                        aooc.af(obj);
                        if (!ahvr.R(tofVar.u())) {
                            throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                        }
                        ahoqVarZ = ahvr.Z(889, "SharpieLifecycleController_startSession");
                        try {
                            defpackage.tth tthVarB = defpackage.tth.b(this.D.m().c);
                            if (tthVarB == null) {
                                tthVarB = defpackage.tth.UNRECOGNIZED;
                            }
                            if (b.contains(tthVarB)) {
                                a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 634, "SharpieLifecycleController.kt").y("session can't start - previously started, lifecycle state is %s", tthVarB);
                                this.e.b(mce.fC);
                                aojhVar = aojh.a;
                            } else if (tthVarB == defpackage.tth.ENDED) {
                                a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 639, "SharpieLifecycleController.kt").v("session can't start - lifecycle state is ENDED");
                                this.e.b(mce.fC);
                                aojhVar = aojh.a;
                            } else {
                                if (tthVarB == defpackage.tth.PRECONDITION_PENDING) {
                                    this.u.a(qbc.lS);
                                } else {
                                    this.e.b(mce.fD);
                                }
                                tofVar.d = ahoqVarZ;
                                tofVar.c = 1;
                                objB = b(tofVar);
                                if (objB == aoluVar) {
                                    return aoluVar;
                                }
                                if (!((java.lang.Boolean) objB).booleanValue()) {
                                    tthVar = defpackage.tth.STARTING;
                                    tofVar.d = ahoqVarZ;
                                    tofVar.c = 2;
                                    if (v(tthVar, false, tofVar) == aoluVar) {
                                        return aoluVar;
                                    }
                                    defpackage.tre treVar = this.N;
                                    tofVar.d = ahoqVarZ;
                                    tofVar.c = 3;
                                    objA = treVar.a(tofVar);
                                    if (objA == aoluVar) {
                                        return aoluVar;
                                    }
                                    if (!((ihq) objA).c) {
                                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 656, "SharpieLifecycleController.kt").v("Unable to reserve an AudioPrism session, due to another running session.");
                                        this.u.a(qbc.kJ);
                                        this.e.b(mce.fC);
                                        tofVar.d = ahoqVarZ;
                                        tofVar.c = 4;
                                        if (c(tofVar) != aoluVar) {
                                            return aoluVar;
                                        }
                                        ahoqVar = ahoqVarZ;
                                        aojhVar3 = aojh.a;
                                        aojhVar2 = aojhVar3;
                                        ahoqVarZ = ahoqVar;
                                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                                        return aojhVar2;
                                    }
                                    this.e.b(mce.fx);
                                    this.u.a(qbc.jP);
                                    tofVar.d = ahoqVarZ;
                                    tofVar.c = 5;
                                    objP = p(tofVar);
                                    if (objP == aoluVar) {
                                        return aoluVar;
                                    }
                                    zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                                    qbeVar = this.u;
                                    if (zBooleanValue) {
                                        qbeVar.a(qbc.jQ);
                                        this.e.b(mce.fy);
                                        tofVar.d = ahoqVarZ;
                                        tofVar.c = 7;
                                        if (r(tofVar) == aoluVar) {
                                            return aoluVar;
                                        }
                                        ahoqVar2 = ahoqVarZ;
                                        ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                                        return aojh.a;
                                    }
                                    qbeVar.a(qbc.jR);
                                    this.e.b(mce.fC);
                                    a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 672, "SharpieLifecycleController.kt").v("failed to play beep, do not start session");
                                    tofVar.d = ahoqVarZ;
                                    tofVar.c = 6;
                                    if (c(tofVar) == aoluVar) {
                                        return aoluVar;
                                    }
                                    ahoqVar = ahoqVarZ;
                                    aojhVar3 = aojh.a;
                                    aojhVar2 = aojhVar3;
                                    ahoqVarZ = ahoqVar;
                                    ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                                    return aojhVar2;
                                }
                                aojhVar = aojh.a;
                            }
                            aojhVar2 = aojhVar;
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                            return aojhVar2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            this = ahoqVarZ;
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                ajsz.ak((java.io.Closeable) this, th);
                                throw th2;
                            }
                        }
                    case 1:
                        ahoq ahoqVar3 = tofVar.d;
                        aooc.af(obj);
                        objB = obj;
                        ahoqVarZ = ahoqVar3;
                        if (!((java.lang.Boolean) objB).booleanValue()) {
                            aojhVar = aojh.a;
                            aojhVar2 = aojhVar;
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                            return aojhVar2;
                        }
                        tthVar = defpackage.tth.STARTING;
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 2;
                        if (v(tthVar, false, tofVar) == aoluVar) {
                            return aoluVar;
                        }
                        defpackage.tre treVar2 = this.N;
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 3;
                        objA = treVar2.a(tofVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (!((ihq) objA).c) {
                            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 656, "SharpieLifecycleController.kt").v("Unable to reserve an AudioPrism session, due to another running session.");
                            this.u.a(qbc.kJ);
                            this.e.b(mce.fC);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 4;
                            if (c(tofVar) != aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar = ahoqVarZ;
                            aojhVar3 = aojh.a;
                            aojhVar2 = aojhVar3;
                            ahoqVarZ = ahoqVar;
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                            return aojhVar2;
                        }
                        this.e.b(mce.fx);
                        this.u.a(qbc.jP);
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 5;
                        objP = p(tofVar);
                        if (objP == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                        qbeVar = this.u;
                        if (zBooleanValue) {
                            qbeVar.a(qbc.jQ);
                            this.e.b(mce.fy);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 7;
                            if (r(tofVar) == aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar2 = ahoqVarZ;
                            ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                            return aojh.a;
                        }
                        qbeVar.a(qbc.jR);
                        this.e.b(mce.fC);
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 672, "SharpieLifecycleController.kt").v("failed to play beep, do not start session");
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 6;
                        if (c(tofVar) == aoluVar) {
                            return aoluVar;
                        }
                        ahoqVar = ahoqVarZ;
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case 2:
                        ahoq ahoqVar4 = tofVar.d;
                        aooc.af(obj);
                        ahoqVarZ = ahoqVar4;
                        defpackage.tre treVar3 = this.N;
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 3;
                        objA = treVar3.a(tofVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (!((ihq) objA).c) {
                            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 656, "SharpieLifecycleController.kt").v("Unable to reserve an AudioPrism session, due to another running session.");
                            this.u.a(qbc.kJ);
                            this.e.b(mce.fC);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 4;
                            if (c(tofVar) != aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar = ahoqVarZ;
                            aojhVar3 = aojh.a;
                            aojhVar2 = aojhVar3;
                            ahoqVarZ = ahoqVar;
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                            return aojhVar2;
                        }
                        this.e.b(mce.fx);
                        this.u.a(qbc.jP);
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 5;
                        objP = p(tofVar);
                        if (objP == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                        qbeVar = this.u;
                        if (zBooleanValue) {
                            qbeVar.a(qbc.jQ);
                            this.e.b(mce.fy);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 7;
                            if (r(tofVar) == aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar2 = ahoqVarZ;
                            ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                            return aojh.a;
                        }
                        qbeVar.a(qbc.jR);
                        this.e.b(mce.fC);
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 672, "SharpieLifecycleController.kt").v("failed to play beep, do not start session");
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 6;
                        if (c(tofVar) == aoluVar) {
                            return aoluVar;
                        }
                        ahoqVar = ahoqVarZ;
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case 3:
                        ahoq ahoqVar5 = tofVar.d;
                        aooc.af(obj);
                        objA = obj;
                        ahoqVarZ = ahoqVar5;
                        if (!((ihq) objA).c) {
                            a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 656, "SharpieLifecycleController.kt").v("Unable to reserve an AudioPrism session, due to another running session.");
                            this.u.a(qbc.kJ);
                            this.e.b(mce.fC);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 4;
                            if (c(tofVar) != aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar = ahoqVarZ;
                            aojhVar3 = aojh.a;
                            aojhVar2 = aojhVar3;
                            ahoqVarZ = ahoqVar;
                            ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                            return aojhVar2;
                        }
                        this.e.b(mce.fx);
                        this.u.a(qbc.jP);
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 5;
                        objP = p(tofVar);
                        if (objP == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                        qbeVar = this.u;
                        if (zBooleanValue) {
                            qbeVar.a(qbc.jQ);
                            this.e.b(mce.fy);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 7;
                            if (r(tofVar) == aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar2 = ahoqVarZ;
                            ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                            return aojh.a;
                        }
                        qbeVar.a(qbc.jR);
                        this.e.b(mce.fC);
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 672, "SharpieLifecycleController.kt").v("failed to play beep, do not start session");
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 6;
                        if (c(tofVar) == aoluVar) {
                            return aoluVar;
                        }
                        ahoqVar = ahoqVarZ;
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        ahoqVar = tofVar.d;
                        aooc.af(obj);
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        ahoq ahoqVar6 = tofVar.d;
                        aooc.af(obj);
                        objP = obj;
                        ahoqVarZ = ahoqVar6;
                        zBooleanValue = ((java.lang.Boolean) objP).booleanValue();
                        qbeVar = this.u;
                        if (zBooleanValue) {
                            qbeVar.a(qbc.jQ);
                            this.e.b(mce.fy);
                            tofVar.d = ahoqVarZ;
                            tofVar.c = 7;
                            if (r(tofVar) == aoluVar) {
                                return aoluVar;
                            }
                            ahoqVar2 = ahoqVarZ;
                            ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                            return aojh.a;
                        }
                        qbeVar.a(qbc.jR);
                        this.e.b(mce.fC);
                        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "startSession$<anonymous>", 672, "SharpieLifecycleController.kt").v("failed to play beep, do not start session");
                        tofVar.d = ahoqVarZ;
                        tofVar.c = 6;
                        if (c(tofVar) == aoluVar) {
                            return aoluVar;
                        }
                        ahoqVar = ahoqVarZ;
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        ahoqVar = tofVar.d;
                        aooc.af(obj);
                        aojhVar3 = aojh.a;
                        aojhVar2 = aojhVar3;
                        ahoqVarZ = ahoqVar;
                        ajsz.ak(ahoqVarZ, (java.lang.Throwable) null);
                        return aojhVar2;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        ahoqVar2 = tofVar.d;
                        aooc.af(obj);
                        ajsz.ak(ahoqVar2, (java.lang.Throwable) null);
                        return aojh.a;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            this = r2;
        }
    }

    public final java.lang.Object t(aoln aolnVar) {
        java.lang.Object objG = g(new defpackage.sbm(this, (aoln) null, 15, (short[][]) null), aolnVar);
        return objG != aolu.a ? aojh.a : objG;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final java.lang.Object u(defpackage.tth tthVar, boolean z, aoln aolnVar) throws aois {
        defpackage.tog togVar;
        boolean z2;
        defpackage.tth tthVar2;
        defpackage.tth tthVar3;
        boolean z3;
        defpackage.tth tthVar4;
        if (aolnVar instanceof defpackage.tog) {
            togVar = (defpackage.tog) aolnVar;
            int i = togVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                togVar.d = i - Integer.MIN_VALUE;
            } else {
                togVar = new defpackage.tog(this, aolnVar);
            }
        } else {
            togVar = new defpackage.tog(this, aolnVar);
        }
        java.lang.Object objE = togVar.b;
        aolu aoluVar = aolu.a;
        int i2 = togVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z4 = togVar.a;
                defpackage.tth tthVar5 = togVar.e;
                aooc.af(objE);
                z2 = z4;
                tthVar2 = tthVar5;
            } else if (i2 == 2) {
                z3 = togVar.a;
                tthVar3 = togVar.e;
                aooc.af(objE);
                if (!aooh.n((defpackage.yxt) objE, defpackage.yxs.a)) {
                    a.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 770, "SharpieLifecycleController.kt").v("tearDown failed.");
                }
                defpackage.uss ussVar = this.T;
                defpackage.pzd pzdVar = defpackage.pzd.d;
                togVar.e = tthVar3;
                togVar.a = z3;
                togVar.d = 3;
                objE = ussVar.l(new ohh(ussVar, pzdVar, (aoln) null, 11), togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                ajcq ajcqVarB = ((hxf) objE).b();
                aooh.e(ajcqVarB, "playbackEndedFuture(...)");
                togVar.e = tthVar3;
                togVar.a = z3;
                togVar.d = 4;
                objE = aosv.D(ajcqVarB, togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                tthVar4 = tthVar3;
                if (objE != hxe.a) {
                    a.d().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 779, "SharpieLifecycleController.kt").v("failed to play end audio");
                }
                togVar.e = null;
                togVar.d = 5;
                if (v(tthVar4, z3, togVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 3) {
                z3 = togVar.a;
                tthVar3 = togVar.e;
                aooc.af(objE);
                ajcq ajcqVarB2 = ((hxf) objE).b();
                aooh.e(ajcqVarB2, "playbackEndedFuture(...)");
                togVar.e = tthVar3;
                togVar.a = z3;
                togVar.d = 4;
                objE = aosv.D(ajcqVarB2, togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                tthVar4 = tthVar3;
                if (objE != hxe.a) {
                    a.d().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 779, "SharpieLifecycleController.kt").v("failed to play end audio");
                }
                togVar.e = null;
                togVar.d = 5;
                if (v(tthVar4, z3, togVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 == 4) {
                z3 = togVar.a;
                tthVar4 = togVar.e;
                aooc.af(objE);
                if (objE != hxe.a) {
                    a.d().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 779, "SharpieLifecycleController.kt").v("failed to play end audio");
                }
                togVar.e = null;
                togVar.d = 5;
                if (v(tthVar4, z3, togVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 5) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objE);
            }
            return aojh.a;
        }
        aooc.af(objE);
        this.u.a(qbc.lG);
        defpackage.tre treVar = this.N;
        togVar.e = tthVar;
        z2 = z;
        togVar.a = z2;
        togVar.d = 1;
        objE = treVar.e(togVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        tthVar2 = tthVar;
        defpackage.trm trmVar = (defpackage.trm) objE;
        j$.util.Objects.checkIndex(0, 3);
        if (trmVar != null) {
            if (trmVar instanceof defpackage.trl) {
                defpackage.yyf yyfVar = this.z;
                togVar.e = tthVar2;
                togVar.a = z2;
                togVar.d = 2;
                objE = yyfVar.g(yyfVar.h, new defpackage.wbi(yyfVar, (aoln) null, 9, (byte[]) null), togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                tthVar3 = tthVar2;
                z3 = z2;
                if (!aooh.n((defpackage.yxt) objE, defpackage.yxs.a)) {
                    a.b().m(aioa.b).l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 770, "SharpieLifecycleController.kt").v("tearDown failed.");
                }
                defpackage.uss ussVar2 = this.T;
                defpackage.pzd pzdVar2 = defpackage.pzd.d;
                togVar.e = tthVar3;
                togVar.a = z3;
                togVar.d = 3;
                objE = ussVar2.l(new ohh(ussVar2, pzdVar2, (aoln) null, 11), togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                ajcq ajcqVarB3 = ((hxf) objE).b();
                aooh.e(ajcqVarB3, "playbackEndedFuture(...)");
                togVar.e = tthVar3;
                togVar.a = z3;
                togVar.d = 4;
                objE = aosv.D(ajcqVarB3, togVar);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                tthVar4 = tthVar3;
                if (objE != hxe.a) {
                    a.d().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 779, "SharpieLifecycleController.kt").v("failed to play end audio");
                }
                togVar.e = null;
                togVar.d = 5;
                if (v(tthVar4, z3, togVar) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            }
            if (trmVar instanceof defpackage.trj) {
                a.d().m(aioa.b).l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "stopSessionAndTransitionLifecycleTo", 788, "SharpieLifecycleController.kt").y("failed to stop session: %s", ((defpackage.trj) trmVar).a);
                this.e.a(mcd.aK);
                return aojh.a;
            }
        }
        throw new aois();
    }

    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(defpackage.tth tthVar, boolean z, aoln aolnVar) {
        defpackage.toh tohVar;
        defpackage.tth tthVar2;
        boolean z2;
        defpackage.tuy tuyVar;
        if (aolnVar instanceof defpackage.toh) {
            tohVar = (defpackage.toh) aolnVar;
            int i = tohVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tohVar.d = i - Integer.MIN_VALUE;
            } else {
                tohVar = new defpackage.toh(this, aolnVar);
            }
        } else {
            tohVar = new defpackage.toh(this, aolnVar);
        }
        java.lang.Object obj = tohVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tohVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                z = tohVar.a;
                tthVar = tohVar.e;
                aooc.af(obj);
            } else if (i2 == 2) {
                z2 = tohVar.a;
                tthVar2 = tohVar.e;
                aooc.af(obj);
                if (this.L.a() && !z2) {
                    tuyVar = this.M;
                    tohVar.e = null;
                    tohVar.d = 3;
                    if (tuyVar.a(tthVar2, tohVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        a.b().l("com/android/dialer/sharpie/impl/service/SharpieLifecycleController", "transitionLifecycleStateTo", 894, "SharpieLifecycleController.kt").y("transitioning to state %s", tthVar.name());
        if (ajsz.cW(new defpackage.tth[]{defpackage.tth.PAUSED, defpackage.tth.ENDED}).contains(tthVar)) {
            this.e.b(mce.fG);
        }
        defpackage.zlr zlrVar = this.D;
        defpackage.vqu vquVarCv = wsc.cv(defpackage.ttb.a.m());
        akzx akzxVarM = defpackage.tsv.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(tthVar, "value");
        akzxVarM.u();
        ((defpackage.tsv) akzxVarM.b).b = tthVar.a();
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.tsv tsvVar = (defpackage.tsv) aladVarP;
        aooh.f(tsvVar, "value");
        akzx akzxVar = (akzx) vquVarCv.a;
        akzxVar.u();
        defpackage.ttb ttbVar = (defpackage.ttb) akzxVar.b;
        j$.util.Objects.requireNonNull(tsvVar);
        ttbVar.c = tsvVar;
        ttbVar.b = 1;
        defpackage.ttb ttbVarAe = vquVarCv.ae();
        tohVar.e = tthVar;
        tohVar.a = z;
        tohVar.d = 1;
        if (zlrVar.n(ttbVarAe, tohVar) == aoluVar) {
            return aoluVar;
        }
        if (tthVar == defpackage.tth.ENDED) {
            defpackage.ttw ttwVar = this.J;
            defpackage.ttg ttgVar = this.D.m().e;
            if (ttgVar == null) {
                ttgVar = defpackage.ttg.a;
            }
            aooh.e(ttgVar, "getSessionMetricsData(...)");
            tohVar.e = tthVar;
            tohVar.a = z;
            tohVar.d = 2;
            if (ttwVar.b(ttgVar, tohVar) == aoluVar) {
                return aoluVar;
            }
        }
        boolean z3 = z;
        tthVar2 = tthVar;
        z2 = z3;
        if (this.L.a()) {
            tuyVar = this.M;
            tohVar.e = null;
            tohVar.d = 3;
            if (tuyVar.a(tthVar2, tohVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [toj] */
    /* JADX WARN: Type inference failed for: r6v1, types: [tqp] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final java.lang.Object w(defpackage.tqp tqpVar, aoln aolnVar) {
        defpackage.toi toiVar;
        ?? r6;
        if (aolnVar instanceof defpackage.toi) {
            toiVar = (defpackage.toi) aolnVar;
            int i = toiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                toiVar.d = i - Integer.MIN_VALUE;
            } else {
                toiVar = new defpackage.toi(this, aolnVar);
            }
        } else {
            toiVar = new defpackage.toi(this, aolnVar);
        }
        java.lang.Object obj = toiVar.b;
        aolu aoluVar = aolu.a;
        int i2 = toiVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = toiVar.a;
                aooc.af(obj);
                r6 = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.tth tthVar = defpackage.tth.PRECONDITION_PENDING;
        toiVar.a = tqpVar;
        toiVar.d = 1;
        if (v(tthVar, false, toiVar) == aoluVar) {
            r6 = tqpVar;
            return aoluVar;
        }
        r6 = tqpVar;
        toiVar.a = null;
        toiVar.d = 2;
        if (q(r6, toiVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final void x(defpackage.tqp tqpVar) throws aois {
        qbc qbcVar;
        qbc qbcVar2;
        qbc qbcVar3;
        j$.util.Objects.checkIndex(0, 4);
        if (tqpVar != null) {
            if (tqpVar instanceof defpackage.tqh) {
                defpackage.tqk tqkVar = ((defpackage.tqh) tqpVar).a;
                j$.util.Objects.checkIndex(0, 3);
                if (tqkVar instanceof defpackage.tqj) {
                    defpackage.qbe qbeVar = this.u;
                    defpackage.yww ywwVar = ((defpackage.tqj) tqkVar).a;
                    defpackage.yxv yxvVar = defpackage.yxv.NOT_CONFIGURED;
                    switch (ywwVar.a.ordinal()) {
                        case 0:
                            qbcVar3 = qbc.ka;
                            break;
                        case 1:
                            qbcVar3 = qbc.kh;
                            break;
                        case 2:
                            qbcVar3 = qbc.ki;
                            break;
                        case 3:
                            qbcVar3 = qbc.kj;
                            break;
                        case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                            qbcVar3 = qbc.kk;
                            break;
                        case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                            qbcVar3 = qbc.kl;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                            qbcVar3 = qbc.km;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                            qbcVar3 = qbc.kn;
                            break;
                        case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                            qbcVar3 = qbc.kq;
                            break;
                        case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                            qbcVar3 = qbc.kv;
                            break;
                        case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                            qbcVar3 = qbc.kf;
                            break;
                        case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                            qbcVar3 = qbc.kE;
                            break;
                        default:
                            throw new aois();
                    }
                    qbeVar.a(qbcVar3);
                    qbeVar.a(qbc.jJ);
                    this.e.b(mce.fC);
                    return;
                }
                if (!(tqkVar instanceof defpackage.tqi)) {
                    throw new aois();
                }
                defpackage.qbe qbeVar2 = this.u;
                defpackage.ywp ywpVar = ((defpackage.tqi) tqkVar).a;
                defpackage.yxv yxvVar2 = defpackage.yxv.NOT_CONFIGURED;
                switch (ywpVar.a - 1) {
                    case 0:
                        qbcVar2 = qbc.jW;
                        break;
                    case 1:
                        qbcVar2 = qbc.jX;
                        break;
                    case 2:
                        qbcVar2 = qbc.jY;
                        break;
                    case 3:
                        qbcVar2 = qbc.jZ;
                        break;
                    case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                        qbcVar2 = qbc.kb;
                        break;
                    case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                        qbcVar2 = qbc.kd;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                        qbcVar2 = qbc.kg;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                        qbcVar2 = qbc.ks;
                        break;
                    case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                        qbcVar2 = qbc.ku;
                        break;
                    case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                        qbcVar2 = qbc.ky;
                        break;
                    case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                        qbcVar2 = qbc.kz;
                        break;
                    case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                        qbcVar2 = qbc.kA;
                        break;
                    case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                        qbcVar2 = qbc.kB;
                        break;
                    default:
                        qbcVar2 = qbc.kD;
                        break;
                }
                qbeVar2.a(qbcVar2);
                qbeVar2.a(qbc.kG);
                this.e.b(mce.fC);
                return;
            }
            if (tqpVar instanceof defpackage.tql) {
                defpackage.qbe qbeVar3 = this.u;
                defpackage.tqo tqoVar = ((defpackage.tql) tqpVar).a;
                j$.util.Objects.checkIndex(0, 3);
                if (tqoVar instanceof defpackage.tqm) {
                    defpackage.yxv yxvVar3 = defpackage.yxv.NOT_CONFIGURED;
                    qbcVar = qbc.kt;
                } else {
                    if (!(tqoVar instanceof defpackage.tqn)) {
                        throw new aois();
                    }
                    defpackage.yxv yxvVar4 = defpackage.yxv.NOT_CONFIGURED;
                    qbcVar = qbc.ko;
                }
                qbeVar3.a(qbcVar);
                qbeVar3.a(qbc.jJ);
                this.e.b(mce.fC);
                return;
            }
            if (tqpVar instanceof defpackage.tqg) {
                this.u.a(qbc.jK);
                return;
            }
        }
        throw new aois();
    }
}
