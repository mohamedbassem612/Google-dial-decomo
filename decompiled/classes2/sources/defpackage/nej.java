package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nej {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbyLifecycleController");
    public final aoin A;
    public final aoin B;
    public final aoin C;
    public final aoin D;
    public final aoin E;
    public final aoin F;
    public final j$.util.concurrent.ConcurrentLinkedQueue G;
    public aoub H;
    public defpackage.nfc I;
    public boolean J;
    public boolean K;
    public boolean L;
    public defpackage.nje M;
    public int N;
    public final zog O;
    public final zoi P;
    public final znh Q;
    public final znj R;
    public final znp S;
    public final znv T;
    public final zmt U;
    public final pqm V;
    public final ptx W;
    public final qbe X;
    public final pci Y;
    public final defpackage.ogj Z;
    public final defpackage.ifb aa;
    public final ipc ab;
    public final ipc ac;
    private final aoss ad;
    private final defpackage.nbr ae;
    private final ruc af;
    private final mgu ag;
    private final odp ah;
    private final aoin ai;
    private final aoin aj;
    private final aoin ak;
    private final aoin al;
    private final aoin am;
    private final oud an;
    private final ouc ao;
    private final zjm ap;
    private final zzx aq;
    private final zzx ar;
    private final defpackage.ifb as;
    private final zzx at;
    private final ahda au;
    private final tpf av;
    private final afpl aw;
    public final long b;
    public final java.lang.String c;
    public final aolr d;
    public final ajcu e;
    public final aoss f;
    public final android.content.Context g;
    public final j$.util.Optional h;
    public final zjs i;
    public final defpackage.mqt j;
    public final mnl k;
    public final defpackage.nrj l;
    public final defpackage.nqh m;
    public final defpackage.mba n;
    public final ote o;
    public final mtd p;
    public final defpackage.mqt q;
    public final defpackage.mym r;
    public final defpackage.mfz s;
    public final defpackage.nfo t;
    public final defpackage.nhq u;
    public final defpackage.nrv v;
    public final nnx w;
    public final noe x;
    public final defpackage.njd y;
    public final aoin z;

    public nej(defpackage.ifb ifbVar, long j, java.lang.String str, aoss aossVar, aolr aolrVar, ajcu ajcuVar, aoss aossVar2, android.content.Context context, pqm pqmVar, ptx ptxVar, j$.util.Optional optional, aazc aazcVar, zjs zjsVar, defpackage.nbr nbrVar, defpackage.mqt mqtVar, mnl mnlVar, defpackage.nrj nrjVar, defpackage.nqh nqhVar, oud oudVar, defpackage.mba mbaVar, afpl afplVar, ote oteVar, mtd mtdVar, defpackage.mqt mqtVar2, ruc rucVar, ipc ipcVar, defpackage.mym mymVar, defpackage.mfz mfzVar, mgu mguVar, defpackage.nfo nfoVar, defpackage.nhq nhqVar, defpackage.nrv nrvVar, nnx nnxVar, noe noeVar, defpackage.ogj ogjVar, defpackage.njd njdVar, zjm zjmVar, zzx zzxVar, odp odpVar, ipc ipcVar2, ouc oucVar, qbe qbeVar, zzx zzxVar2, zzx zzxVar3, pci pciVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7, defpackage.ifb ifbVar2, aoin aoinVar8, tpf tpfVar, aoin aoinVar9, aoin aoinVar10, aoin aoinVar11, aoin aoinVar12) {
        aooh.f(str, "callIdString");
        aooh.f(aossVar, "backgroundScope");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aossVar2, "lightweightScope");
        aooh.f(context, "appContext");
        aooh.f(pqmVar, "callController");
        aooh.f(ptxVar, "callProperties");
        aooh.f(aazcVar, "clock");
        aooh.f(zjsVar, "dialerTelecom");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(oudVar, "inCallActivityMinimizer");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(mtdVar, "latestVoteStorage");
        aooh.f(mqtVar2, "loggingCoordinator");
        aooh.f(rucVar, "metrics");
        aooh.f(ipcVar, "missedCallNotificationInhibitor");
        aooh.f(mymVar, "missedCallNotifier");
        aooh.f(mguVar, "recorder");
        aooh.f(nfoVar, "preconditions");
        aooh.f(nhqVar, "session");
        aooh.f(nrvVar, "sessionWriter");
        aooh.f(ogjVar, "state");
        aooh.f(njdVar, "uplinkAudioInjector");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(pciVar, "arbiter");
        aooh.f(aoinVar, "useGeminiRunner");
        aooh.f(aoinVar2, "enableAgenticCallScreen");
        aooh.f(aoinVar3, "dobbyCuiNewImpressions");
        aooh.f(aoinVar4, "dobbyNewExecutors");
        aooh.f(aoinVar5, "enableWinkyPhaseTwo");
        aooh.f(aoinVar6, "enableWinkyFullFunctionality");
        aooh.f(aoinVar7, "enableManualScreeningWithoutUi");
        aooh.f(aoinVar8, "useCoroutinesLaunch");
        aooh.f(tpfVar, "dobbyUseCaseRunnerCoordinator");
        aooh.f(aoinVar9, "trackingSequencerTasks");
        aooh.f(aoinVar10, "stalledActiveTaskDuration");
        aooh.f(aoinVar11, "cancelActiveDeclineCallTask");
        aooh.f(aoinVar12, "enableDynamicBluetoothMuteDuringScreening");
        this.as = ifbVar;
        this.b = j;
        this.c = str;
        this.ad = aossVar;
        this.d = aolrVar;
        this.e = ajcuVar;
        this.f = aossVar2;
        this.g = context;
        this.V = pqmVar;
        this.W = ptxVar;
        this.h = optional;
        this.i = zjsVar;
        this.ae = nbrVar;
        this.j = mqtVar;
        this.k = mnlVar;
        this.l = nrjVar;
        this.m = nqhVar;
        this.an = oudVar;
        this.n = mbaVar;
        this.aw = afplVar;
        this.o = oteVar;
        this.p = mtdVar;
        this.q = mqtVar2;
        this.af = rucVar;
        this.ab = ipcVar;
        this.r = mymVar;
        this.s = mfzVar;
        this.ag = mguVar;
        this.t = nfoVar;
        this.u = nhqVar;
        this.v = nrvVar;
        this.w = nnxVar;
        this.x = noeVar;
        this.Z = ogjVar;
        this.y = njdVar;
        this.ap = zjmVar;
        this.at = zzxVar;
        this.ah = odpVar;
        this.ac = ipcVar2;
        this.ao = oucVar;
        this.X = qbeVar;
        this.aq = zzxVar2;
        this.ar = zzxVar3;
        this.Y = pciVar;
        this.z = aoinVar;
        this.A = aoinVar2;
        this.B = aoinVar3;
        this.ai = aoinVar4;
        this.C = aoinVar5;
        this.D = aoinVar6;
        this.E = aoinVar7;
        this.aa = ifbVar2;
        this.aj = aoinVar8;
        this.av = tpfVar;
        this.ak = aoinVar9;
        this.al = aoinVar10;
        this.am = aoinVar11;
        this.F = aoinVar12;
        this.G = new j$.util.concurrent.ConcurrentLinkedQueue();
        this.au = new ahda((byte[]) null);
        this.I = mni.O(defpackage.nfc.a.m()).Q();
        this.N = -1;
        int i = 2;
        this.O = new defpackage.les(this, i);
        this.P = new defpackage.jwb(this, 3);
        this.Q = new defpackage.ncc(this, 0);
        this.R = new defpackage.nbx(this, 0);
        this.S = new defpackage.ler(this, i);
        this.T = new defpackage.ncd(this);
        this.U = new xby(this, 1);
    }

    public static final java.lang.Object Z(pci pciVar, aoln aolnVar) {
        return pciVar.d(pca.b, aolnVar);
    }

    public static final java.lang.Object aa(pci pciVar, aoln aolnVar) {
        return pciVar.f(pca.b, aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object A(defpackage.mmv mmvVar, aoln aolnVar) {
        defpackage.ndi ndiVar;
        j$.time.Instant instantNow;
        aenj aenjVar;
        if (aolnVar instanceof defpackage.ndi) {
            ndiVar = (defpackage.ndi) aolnVar;
            int i = ndiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndiVar.c = i - Integer.MIN_VALUE;
            } else {
                ndiVar = new defpackage.ndi(this, aolnVar);
            }
        } else {
            ndiVar = new defpackage.ndi(this, aolnVar);
        }
        java.lang.Object obj = ndiVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ndiVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ndiVar.e;
                instantNow = ndiVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar2 = new aenj("startBeesly");
        ndiVar.d = instantNow;
        ndiVar.e = aenjVar2;
        ndiVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ndj(this, mmvVar, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        obj = aosyVarS;
        aenjVar = aenjVar2;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ndiVar.d = null;
        ndiVar.e = null;
        ndiVar.c = 2;
        if (aosyVar2.a(ndiVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object B(aoln aolnVar) {
        defpackage.ndk ndkVar;
        aenj aenjVar;
        j$.time.Instant instant;
        if (aolnVar instanceof defpackage.ndk) {
            ndkVar = (defpackage.ndk) aolnVar;
            int i = ndkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndkVar.c = i - Integer.MIN_VALUE;
            } else {
                ndkVar = new defpackage.ndk(this, aolnVar);
            }
        } else {
            ndkVar = new defpackage.ndk(this, aolnVar);
        }
        java.lang.Object obj = ndkVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ndkVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ndkVar.e;
                instant = ndkVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenjVar = new aenj("startBeeslyWithUi");
        ndkVar.d = instantNow;
        ndkVar.e = aenjVar;
        ndkVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ndl(this, null, 0));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ndkVar.d = null;
        ndkVar.e = null;
        ndkVar.c = 2;
        if (aosyVar2.a(ndkVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object C(aoln aolnVar) {
        defpackage.ndm ndmVar;
        defpackage.njm njmVar;
        if (aolnVar instanceof defpackage.ndm) {
            ndmVar = (defpackage.ndm) aolnVar;
            int i = ndmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndmVar.c = i - Integer.MIN_VALUE;
            } else {
                ndmVar = new defpackage.ndm(this, aolnVar);
            }
        } else {
            ndmVar = new defpackage.ndm(this, aolnVar);
        }
        java.lang.Object objK = ndmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objK);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        aooc.af(objK);
                        ndmVar.c = 5;
                        if (J(ndmVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                aooc.af(objK);
            } else {
                aooc.af(objK);
                njmVar = (defpackage.njm) objK;
                if (njmVar == null) {
                    this.H = aoov.an(this.f, (aolr) null, 0, new defpackage.nea(njmVar, this, (aoln) null, 1), 3);
                    return aojh.a;
                }
                a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startCallScreenLiteSession", 540, "DobbyLifecycleController.kt").v("useCaseRunner is null after starting CALL_SCREEN_LITE session");
                ndmVar.c = 3;
                if (g(ndmVar) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        aooc.af(objK);
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startCallScreenLiteSession", 532, "DobbyLifecycleController.kt").v("Starting Call Screen Lite session");
        defpackage.nje njeVar = defpackage.nje.e;
        ndmVar.c = 1;
        objK = K(njeVar, ndmVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (!((java.lang.Boolean) objK).booleanValue()) {
            if (((java.lang.Boolean) this.C.a()).booleanValue() || ((java.lang.Boolean) this.D.a()).booleanValue()) {
                defpackage.ifb ifbVar = this.aa;
                defpackage.nmo nmoVar = defpackage.nmo.MANUAL_SCREENING;
                ndmVar.c = 4;
                if (ifbVar.g(nmoVar, true, ndmVar) == aoluVar) {
                    return aoluVar;
                }
            }
            ndmVar.c = 5;
            if (J(ndmVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        this.M = defpackage.nje.e;
        tpf tpfVar = this.av;
        ndmVar.c = 2;
        objK = tpfVar.d(ndmVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        njmVar = (defpackage.njm) objK;
        if (njmVar == null) {
            this.H = aoov.an(this.f, (aolr) null, 0, new defpackage.nea(njmVar, this, (aoln) null, 1), 3);
            return aojh.a;
        }
        a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startCallScreenLiteSession", 540, "DobbyLifecycleController.kt").v("useCaseRunner is null after starting CALL_SCREEN_LITE session");
        ndmVar.c = 3;
        if (g(ndmVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object D(aoln aolnVar) {
        defpackage.ndp ndpVar;
        if (aolnVar instanceof defpackage.ndp) {
            ndpVar = (defpackage.ndp) aolnVar;
            int i = ndpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndpVar.c = i - Integer.MIN_VALUE;
            } else {
                ndpVar = new defpackage.ndp(this, aolnVar);
            }
        } else {
            ndpVar = new defpackage.ndp(this, aolnVar);
        }
        java.lang.Object objA = ndpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndpVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            ouc oucVar = this.ao;
            ndpVar.c = 1;
            objA = oucVar.a(ndpVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        ((java.lang.Boolean) objA).booleanValue();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object E(boolean z, aoln aolnVar) {
        defpackage.ndq ndqVar;
        j$.time.Instant instantNow;
        aenj aenjVar;
        if (aolnVar instanceof defpackage.ndq) {
            ndqVar = (defpackage.ndq) aolnVar;
            int i = ndqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndqVar.c = i - Integer.MIN_VALUE;
            } else {
                ndqVar = new defpackage.ndq(this, aolnVar);
            }
        } else {
            ndqVar = new defpackage.ndq(this, aolnVar);
        }
        java.lang.Object obj = ndqVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ndqVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ndqVar.e;
                instantNow = ndqVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar2 = new aenj("startManualScreening");
        ndqVar.d = instantNow;
        ndqVar.e = aenjVar2;
        ndqVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ndr(this, z, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        obj = aosyVarS;
        aenjVar = aenjVar2;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ndqVar.d = null;
        ndqVar.e = null;
        ndqVar.c = 2;
        if (aosyVar2.a(ndqVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object F(aoln aolnVar) {
        defpackage.nds ndsVar;
        if (aolnVar instanceof defpackage.nds) {
            ndsVar = (defpackage.nds) aolnVar;
            int i = ndsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndsVar.c = i - Integer.MIN_VALUE;
            } else {
                ndsVar = new defpackage.nds(this, aolnVar);
            }
        } else {
            ndsVar = new defpackage.nds(this, aolnVar);
        }
        java.lang.Object objK = ndsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndsVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objK);
            } else if (i2 == 2) {
                aooc.af(objK);
                ndsVar.c = 3;
                if (J(ndsVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            return aojh.a;
        }
        aooc.af(objK);
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startManualScreeningSession", 584, "DobbyLifecycleController.kt").v("Starting Manual Screening session");
        defpackage.nje njeVar = defpackage.nje.a;
        ndsVar.c = 1;
        objK = K(njeVar, ndsVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            this.M = defpackage.nje.a;
            return aojh.a;
        }
        if ((((java.lang.Boolean) this.C.a()).booleanValue() || ((java.lang.Boolean) this.D.a()).booleanValue()) && ((java.lang.Boolean) this.A.a()).booleanValue()) {
            defpackage.ifb ifbVar = this.aa;
            defpackage.nmo nmoVar = defpackage.nmo.MANUAL_SCREENING;
            ndsVar.c = 2;
            if (ifbVar.g(nmoVar, true, ndsVar) == aoluVar) {
                return aoluVar;
            }
        }
        ndsVar.c = 3;
        if (J(ndsVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object G(alta altaVar, aoln aolnVar) {
        defpackage.ndt ndtVar;
        j$.time.Instant instantNow;
        aenj aenjVar;
        if (aolnVar instanceof defpackage.ndt) {
            ndtVar = (defpackage.ndt) aolnVar;
            int i = ndtVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndtVar.c = i - Integer.MIN_VALUE;
            } else {
                ndtVar = new defpackage.ndt(this, aolnVar);
            }
        } else {
            ndtVar = new defpackage.ndt(this, aolnVar);
        }
        java.lang.Object obj = ndtVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ndtVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ndtVar.e;
                instantNow = ndtVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar2 = new aenj("startRinging");
        ndtVar.d = instantNow;
        ndtVar.e = aenjVar2;
        ndtVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ndv(this, altaVar, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        obj = aosyVarS;
        aenjVar = aenjVar2;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ndtVar.d = null;
        ndtVar.e = null;
        ndtVar.c = 2;
        if (aosyVar2.a(ndtVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object H(aoln aolnVar) {
        defpackage.ndw ndwVar;
        defpackage.nmo nmoVar;
        if (aolnVar instanceof defpackage.ndw) {
            ndwVar = (defpackage.ndw) aolnVar;
            int i = ndwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndwVar.c = i - Integer.MIN_VALUE;
            } else {
                ndwVar = new defpackage.ndw(this, aolnVar);
            }
        } else {
            ndwVar = new defpackage.ndw(this, aolnVar);
        }
        java.lang.Object obj = ndwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndwVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                this.n.b(mce.db);
                nmoVar = defpackage.nmo.RINGING_DURING_NOT_ACTIVE_SESSION;
                ndwVar.c = 3;
                if (O(nmoVar, ndwVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            T(this.f, new defpackage.ndu(this, (aoln) null, 2, (char[]) null));
            return aojh.a;
        }
        aooc.af(obj);
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingDuringNotActiveSession", 1682, "DobbyLifecycleController.kt").v("Starting ringing during not active session");
        defpackage.njd njdVar = this.y;
        ndwVar.c = 1;
        if (njdVar.n(ndwVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.mfz mfzVar = this.s;
        gus.aw("CEVT_CMD_EXIT_AUDIOPROCESSING_AND_RING");
        mfzVar.c();
        ajcq ajcqVarG = this.V.g(true);
        ndwVar.c = 2;
        if (aosv.D(ajcqVarG, ndwVar) == aoluVar) {
            return aoluVar;
        }
        this.n.b(mce.db);
        nmoVar = defpackage.nmo.RINGING_DURING_NOT_ACTIVE_SESSION;
        ndwVar.c = 3;
        if (O(nmoVar, ndwVar) == aoluVar) {
            return aoluVar;
        }
        T(this.f, new defpackage.ndu(this, (aoln) null, 2, (char[]) null));
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object I(aoln aolnVar) {
        defpackage.ndx ndxVar;
        if (aolnVar instanceof defpackage.ndx) {
            ndxVar = (defpackage.ndx) aolnVar;
            int i = ndxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndxVar.c = i - Integer.MIN_VALUE;
            } else {
                ndxVar = new defpackage.ndx(this, aolnVar);
            }
        } else {
            ndxVar = new defpackage.ndx(this, aolnVar);
        }
        java.lang.Object objP = ndxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndxVar.c;
        if (i2 == 0) {
            aooc.af(objP);
            ndxVar.c = 1;
            objP = p(ndxVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    aooc.af(objP);
                    V();
                    return aojh.a;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objP);
                return aojh.a;
            }
            aooc.af(objP);
        }
        if (((java.lang.Boolean) objP).booleanValue()) {
            defpackage.nfb nfbVarB = defpackage.nfb.b(this.I.d);
            if (nfbVarB == null) {
                nfbVarB = defpackage.nfb.UNRECOGNIZED;
            }
            if (nfbVarB != defpackage.nfb.REASON_EMERGENCY_CALL_OR_CALLBACK) {
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingOrEndSpamCallWithPreconditionFailed", 1673, "DobbyLifecycleController.kt").v("Not starting ringing for spam. Ending call.");
                defpackage.mqt mqtVar = this.q;
                defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_FALLBACK_END_SPAM_CALL;
                ndxVar.c = 2;
                if (mqtVar.x(nvpVar, ndxVar) == aoluVar) {
                    return aoluVar;
                }
                V();
                return aojh.a;
            }
        }
        ndxVar.c = 3;
        if (H(ndxVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object J(aoln aolnVar) {
        defpackage.ndy ndyVar;
        if (aolnVar instanceof defpackage.ndy) {
            ndyVar = (defpackage.ndy) aolnVar;
            int i = ndyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndyVar.c = i - Integer.MIN_VALUE;
            } else {
                ndyVar = new defpackage.ndy(this, aolnVar);
            }
        } else {
            ndyVar = new defpackage.ndy(this, aolnVar);
        }
        java.lang.Object objP = ndyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndyVar.c;
        if (i2 == 0) {
            aooc.af(objP);
            ndyVar.c = 1;
            objP = p(ndyVar);
            if (objP == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    aooc.af(objP);
                    V();
                    return aojh.a;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objP);
                return aojh.a;
            }
            aooc.af(objP);
        }
        if (!((java.lang.Boolean) objP).booleanValue()) {
            ndyVar.c = 3;
            if (H(ndyVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startRingingOrEndSpamCallWithPreconditionPass", 1659, "DobbyLifecycleController.kt").v("Not starting ringing for spam. Ending call.");
        defpackage.mqt mqtVar = this.q;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_FALLBACK_END_SPAM_CALL;
        ndyVar.c = 2;
        if (mqtVar.x(nvpVar, ndyVar) == aoluVar) {
            return aoluVar;
        }
        V();
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:23:0x007d, B:25:0x0087, B:33:0x00a6, B:35:0x00b4, B:37:0x00c2, B:50:0x0131, B:51:0x0140, B:53:0x0146, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00f0, B:43:0x00fe, B:45:0x010c, B:47:0x011a, B:54:0x0158, B:21:0x0051), top: B:67:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:23:0x007d, B:25:0x0087, B:33:0x00a6, B:35:0x00b4, B:37:0x00c2, B:50:0x0131, B:51:0x0140, B:53:0x0146, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00f0, B:43:0x00fe, B:45:0x010c, B:47:0x011a, B:54:0x0158, B:21:0x0051), top: B:67:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131 A[Catch: all -> 0x0163, TryCatch #1 {all -> 0x0163, blocks: (B:23:0x007d, B:25:0x0087, B:33:0x00a6, B:35:0x00b4, B:37:0x00c2, B:50:0x0131, B:51:0x0140, B:53:0x0146, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00f0, B:43:0x00fe, B:45:0x010c, B:47:0x011a, B:54:0x0158, B:21:0x0051), top: B:67:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0163, LOOP:0: B:51:0x0140->B:53:0x0146, LOOP_END, TryCatch #1 {all -> 0x0163, blocks: (B:23:0x007d, B:25:0x0087, B:33:0x00a6, B:35:0x00b4, B:37:0x00c2, B:50:0x0131, B:51:0x0140, B:53:0x0146, B:38:0x00d6, B:39:0x00db, B:40:0x00dc, B:41:0x00f0, B:43:0x00fe, B:45:0x010c, B:47:0x011a, B:54:0x0158, B:21:0x0051), top: B:67:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v19, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v29, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v37, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v7, types: [aoin, java.lang.Object] */
    public final java.lang.Object K(defpackage.nje njeVar, aoln aolnVar) {
        defpackage.ndz ndzVar;
        java.io.Closeable closeableZ;
        java.io.Closeable closeable;
        java.lang.Object objN;
        defpackage.ifb ifbVar;
        int iOrdinal;
        defpackage.mne mneVarI;
        ailj ailjVarK;
        if (aolnVar instanceof defpackage.ndz) {
            ndzVar = (defpackage.ndz) aolnVar;
            int i = ndzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndzVar.c = i - Integer.MIN_VALUE;
            } else {
                ndzVar = new defpackage.ndz(this, aolnVar);
            }
        } else {
            ndzVar = new defpackage.ndz(this, aolnVar);
        }
        java.lang.Object obj = ndzVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = ndzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            if (!ahvr.R(ndzVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            closeableZ = ahvr.Z(375, "DobbyLifecycleController_startSession");
            try {
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "startSession$<anonymous>", 603, "DobbyLifecycleController.kt").y("Starting session for %s", njeVar);
                this.af.j(ruc.aS);
                defpackage.nhq nhqVar = this.u;
                ndzVar.d = njeVar;
                ndzVar.e = closeableZ;
                ndzVar.c = 1;
                objN = nhqVar.n(njeVar, ndzVar);
                if (objN != bool) {
                    bool = (java.lang.Boolean) objN;
                    if (bool.booleanValue()) {
                        this.af.m(ruc.aS);
                        ifbVar = this.as;
                        aooh.f(njeVar, "useCase");
                        iOrdinal = njeVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal != 1) {
                                mneVarI = null;
                            } else {
                                mneVarI = null;
                            }
                        } else if (((java.lang.Boolean) ifbVar.a.a()).booleanValue()) {
                            defpackage.vk vkVarS = mni.S(defpackage.mne.a.m());
                            vkVarS.J(defpackage.mnd.WINKY);
                            mneVarI = vkVarS.I();
                        } else {
                            defpackage.vk vkVarS2 = mni.S(defpackage.mne.a.m());
                            vkVarS2.J(defpackage.mnd.WINKY);
                            mneVarI = vkVarS2.I();
                        }
                        if (mneVarI != null) {
                            ailjVarK = this.aq.e().k();
                            aooh.e(ailjVarK, "iterator(...)");
                            while (ailjVarK.hasNext()) {
                                aoov.an(this.f, (aolr) null, 0, new defpackage.nea((defpackage.mnc) ailjVarK.next(), mneVarI, (aoln) null, 0), 3);
                            }
                        }
                    }
                    this.af.b(ruc.aS);
                    ajsz.ak(closeableZ, (java.lang.Throwable) null);
                }
            } catch (java.lang.Throwable th) {
                th = th;
                closeable = closeableZ;
                throw th;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable = ndzVar.e;
            defpackage.nje njeVar2 = ndzVar.d;
            try {
                aooc.af(obj);
                closeableZ = closeable;
                njeVar = njeVar2;
                objN = obj;
                bool = (java.lang.Boolean) objN;
                if (bool.booleanValue()) {
                    this.af.m(ruc.aS);
                    ifbVar = this.as;
                    aooh.f(njeVar, "useCase");
                    iOrdinal = njeVar.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1 || iOrdinal == 2) {
                            mneVarI = null;
                        } else if (iOrdinal == 3) {
                            defpackage.vk vkVarS3 = mni.S(defpackage.mne.a.m());
                            vkVarS3.J(defpackage.mnd.BEESLY);
                            mneVarI = vkVarS3.I();
                        } else {
                            if (iOrdinal != 4) {
                                throw new aois();
                            }
                            if (((java.lang.Boolean) ifbVar.a.a()).booleanValue() || ((java.lang.Boolean) ifbVar.d.a()).booleanValue()) {
                                defpackage.vk vkVarS4 = mni.S(defpackage.mne.a.m());
                                vkVarS4.J(defpackage.mnd.WINKY);
                                mneVarI = vkVarS4.I();
                            } else {
                                mneVarI = null;
                            }
                        }
                    } else if ((((java.lang.Boolean) ifbVar.a.a()).booleanValue() || ((java.lang.Boolean) ifbVar.d.a()).booleanValue()) && ((java.lang.Boolean) ifbVar.b.a()).booleanValue()) {
                        defpackage.vk vkVarS5 = mni.S(defpackage.mne.a.m());
                        vkVarS5.J(defpackage.mnd.WINKY);
                        mneVarI = vkVarS5.I();
                    } else {
                        mneVarI = null;
                    }
                    if (mneVarI != null) {
                        ailjVarK = this.aq.e().k();
                        aooh.e(ailjVarK, "iterator(...)");
                        while (ailjVarK.hasNext()) {
                            aoov.an(this.f, (aolr) null, 0, new defpackage.nea((defpackage.mnc) ailjVarK.next(), mneVarI, (aoln) null, 0), 3);
                        }
                    }
                }
                this.af.b(ruc.aS);
                ajsz.ak(closeableZ, (java.lang.Throwable) null);
            } catch (java.lang.Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak(closeable, th);
                    throw th3;
                }
            }
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object L(aoln aolnVar) {
        defpackage.neb nebVar;
        aenj aenjVar;
        j$.time.Instant instant;
        if (aolnVar instanceof defpackage.neb) {
            nebVar = (defpackage.neb) aolnVar;
            int i = nebVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nebVar.c = i - Integer.MIN_VALUE;
            } else {
                nebVar = new defpackage.neb(this, aolnVar);
            }
        } else {
            nebVar = new defpackage.neb(this, aolnVar);
        }
        java.lang.Object obj = nebVar.a;
        aosy aosyVar = aolu.a;
        int i2 = nebVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = nebVar.e;
                instant = nebVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenjVar = new aenj("startTakingMessageFromCaller");
        nebVar.d = instantNow;
        nebVar.e = aenjVar;
        nebVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.nec(this, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        nebVar.d = null;
        nebVar.e = null;
        nebVar.c = 2;
        if (aosyVar2.a(nebVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object M(defpackage.nmr nmrVar, aoln aolnVar) {
        defpackage.ned nedVar;
        aoub aoubVar;
        defpackage.nhq nhqVar;
        if (aolnVar instanceof defpackage.ned) {
            nedVar = (defpackage.ned) aolnVar;
            int i = nedVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nedVar.c = i - Integer.MIN_VALUE;
            } else {
                nedVar = new defpackage.ned(this, aolnVar);
            }
        } else {
            nedVar = new defpackage.ned(this, aolnVar);
        }
        java.lang.Object obj = nedVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nedVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                aoubVar = this.H;
                if (aoubVar != null) {
                    aoubVar.s((java.util.concurrent.CancellationException) null);
                }
                nhqVar = this.u;
                nedVar.c = 3;
                if (nhqVar.o(nedVar) == aoluVar) {
                    return aoluVar;
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
        nedVar.c = 1;
        if (N(nmrVar, nedVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.njd njdVar = this.y;
        nedVar.c = 2;
        if (njdVar.n(nedVar) == aoluVar) {
            return aoluVar;
        }
        aoubVar = this.H;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        nhqVar = this.u;
        nedVar.c = 3;
        if (nhqVar.o(nedVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final java.lang.Object N(defpackage.nmr nmrVar, aoln aolnVar) {
        defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
        akzx akzxVarM = defpackage.nmb.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(nmrVar, "value");
        akzxVarM.u();
        ((defpackage.nmb) akzxVarM.b).b = nmrVar.a();
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.nmb nmbVar = (defpackage.nmb) aladVarP;
        aooh.f(nmbVar, "value");
        akzx akzxVar = (akzx) npwVarAB.a;
        akzxVar.u();
        defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
        j$.util.Objects.requireNonNull(nmbVar);
        nmkVar.c = nmbVar;
        nmkVar.b = 6;
        java.lang.Object objB = this.Z.b(npwVarAB.D(), aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:101:0x0256  */
    /* JADX WARN: Code duplicated, block: B:105:0x0266  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:60:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:70:0x01db  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0203  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x021f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:85:0x0223  */
    /* JADX WARN: Code duplicated, block: B:88:0x0233  */
    /* JADX WARN: Code duplicated, block: B:99:0x024c  */
    public final java.lang.Object O(defpackage.nmo nmoVar, aoln aolnVar) throws aois {
        defpackage.nee neeVar;
        defpackage.nmo nmoVar2;
        defpackage.nmo nmoVarB;
        java.lang.Object objQ;
        defpackage.nmo nmoVar3;
        defpackage.nmo nmoVar4;
        defpackage.nmo nmoVar5;
        int i;
        defpackage.ogj ogjVar;
        akzx akzxVarM;
        int i2;
        defpackage.nmk nmkVarD;
        defpackage.nmo nmoVar6;
        int i3;
        defpackage.nvp nvpVar;
        int i4;
        defpackage.nmo nmoVar7;
        defpackage.mqt mqtVar;
        boolean z;
        defpackage.ifb ifbVar;
        int iOrdinal;
        java.lang.Object objF;
        if (aolnVar instanceof defpackage.nee) {
            neeVar = (defpackage.nee) aolnVar;
            int i5 = neeVar.d;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                neeVar.d = i5 - Integer.MIN_VALUE;
            } else {
                neeVar = new defpackage.nee(this, aolnVar);
            }
        } else {
            neeVar = new defpackage.nee(this, aolnVar);
        }
        java.lang.Object objA = neeVar.b;
        aolu aoluVar = aolu.a;
        switch (neeVar.d) {
            case 0:
                aooc.af(objA);
                defpackage.ogj ogjVar2 = this.Z;
                nmoVar2 = nmoVar;
                neeVar.e = nmoVar2;
                neeVar.d = 1;
                objA = ogjVar2.a(neeVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (!((java.lang.Boolean) this.C.a()).booleanValue() || ((java.lang.Boolean) this.D.a()).booleanValue()) {
                    neeVar.e = nmoVar2;
                    neeVar.f = nmoVarB;
                    neeVar.d = 2;
                    objQ = q(neeVar);
                    if (objQ != aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nmo nmoVar8 = nmoVar2;
                    nmoVar3 = nmoVarB;
                    objA = objQ;
                    nmoVar4 = nmoVar8;
                    if (!((java.lang.Boolean) objA).booleanValue() || ((java.lang.Boolean) this.A.a()).booleanValue()) {
                        i = 1;
                        nmoVar5 = nmoVar4;
                    } else {
                        nmoVarB = nmoVar3;
                        nmoVar2 = nmoVar4;
                        nmoVar5 = nmoVar2;
                        nmoVar3 = nmoVarB;
                        i = 0;
                    }
                } else {
                    nmoVar5 = nmoVar2;
                    nmoVar3 = nmoVarB;
                    i = 0;
                }
                a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "transitionLifecycleStateTo", 2210, "DobbyLifecycleController.kt").y("transitioning to state %s", new aepg(nmoVar5));
                new mgr(this.ag, nmoVar5).b(defpackage.mfy.DOBBY_LIFECYCLE_STATE).c(new defpackage.naa(new aoom() { // from class: nef
                    public final java.lang.Object b(java.lang.Object obj) {
                        return ((defpackage.nmo) obj).name();
                    }
                }, 14));
                ogjVar = this.Z;
                defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
                akzxVarM = defpackage.nlr.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(nmoVar5, "value");
                akzxVarM.u();
                ((defpackage.nlr) akzxVarM.b).c = nmoVar5.a();
                if (nmoVar5 != defpackage.nmo.MANUAL_SCREENING || nmoVar5 == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI || nmoVar5 == defpackage.nmo.BAM || nmoVar5 == defpackage.nmo.AUTO_SCREENING || nmoVar5 == defpackage.nmo.BEESLY) {
                    long epochMilli = j$.time.Instant.now().toEpochMilli();
                    akzxVarM.u();
                    defpackage.nlr nlrVar = (defpackage.nlr) akzxVarM.b;
                    i2 = 4;
                    nlrVar.b |= 4;
                    nlrVar.d = epochMilli;
                } else {
                    i2 = 4;
                }
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.nlr nlrVar2 = (defpackage.nlr) aladVarP;
                aooh.f(nlrVar2, "value");
                akzx akzxVar = (akzx) npwVarAB.a;
                akzxVar.u();
                defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
                j$.util.Objects.requireNonNull(nlrVar2);
                nmkVar.c = nlrVar2;
                nmkVar.b = 1;
                nmkVarD = npwVarAB.D();
                neeVar.e = nmoVar5;
                neeVar.f = nmoVar3;
                neeVar.a = i;
                neeVar.d = 3;
                if (ogjVar.b(nmkVarD, neeVar) == aoluVar) {
                    return aoluVar;
                }
                nmoVar6 = nmoVar3;
                i3 = i;
                switch (nmoVar5.ordinal()) {
                    case 0:
                    case 16:
                        nvpVar = null;
                        break;
                    case 1:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_NOT_A_DOBBY_CALL;
                        break;
                    case 2:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_READY_FOR_MANUAL_SCREENING;
                        break;
                    case 3:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING;
                        break;
                    case 4:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI;
                        break;
                    case 5:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING;
                        break;
                    case 6:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI;
                        break;
                    case 7:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BAM;
                        break;
                    case 8:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION;
                        break;
                    case 9:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION;
                        break;
                    case 10:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_TAKING_MESSAGE;
                        break;
                    case 11:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_FOREGROUND_DECLINING;
                        break;
                    case 12:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BACKGROUND_DECLINING;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_ANSWER;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY_WITH_UI;
                        break;
                    default:
                        throw new aois();
                }
                if (nvpVar != null) {
                    mqtVar = this.q;
                    neeVar.e = nmoVar5;
                    neeVar.f = nmoVar6;
                    neeVar.a = i3;
                    neeVar.d = i2;
                    if (mqtVar.x(nvpVar, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                i4 = i3;
                nmoVar7 = nmoVar5;
                if (!((java.lang.Boolean) this.C.a()).booleanValue() || ((java.lang.Boolean) this.D.a()).booleanValue()) {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1 || iOrdinal == 2 || iOrdinal == 3) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else if ((iOrdinal != 11 && iOrdinal != 12) || (objF = ifbVar.e(nmoVar6, z, neeVar)) != aoluVar) {
                        objF = aojh.a;
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 6;
                    if (u(neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                nmoVar2 = neeVar.e;
                aooc.af(objA);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (((java.lang.Boolean) this.C.a()).booleanValue()) {
                    break;
                }
                neeVar.e = nmoVar2;
                neeVar.f = nmoVarB;
                neeVar.d = 2;
                objQ = q(neeVar);
                if (objQ != aoluVar) {
                    return aoluVar;
                }
                defpackage.nmo nmoVar9 = nmoVar2;
                nmoVar3 = nmoVarB;
                objA = objQ;
                nmoVar4 = nmoVar9;
                if (((java.lang.Boolean) objA).booleanValue()) {
                    break;
                }
                i = 1;
                nmoVar5 = nmoVar4;
                a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "transitionLifecycleStateTo", 2210, "DobbyLifecycleController.kt").y("transitioning to state %s", new aepg(nmoVar5));
                new mgr(this.ag, nmoVar5).b(defpackage.mfy.DOBBY_LIFECYCLE_STATE).c(new defpackage.naa(new aoom() { // from class: nef
                    public final java.lang.Object b(java.lang.Object obj) {
                        return ((defpackage.nmo) obj).name();
                    }
                }, 14));
                ogjVar = this.Z;
                defpackage.npw npwVarAB2 = mni.aB(defpackage.nmk.a.m());
                akzxVarM = defpackage.nlr.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(nmoVar5, "value");
                akzxVarM.u();
                ((defpackage.nlr) akzxVarM.b).c = nmoVar5.a();
                if (nmoVar5 != defpackage.nmo.MANUAL_SCREENING) {
                    long epochMilli2 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM.u();
                    defpackage.nlr nlrVar3 = (defpackage.nlr) akzxVarM.b;
                    i2 = 4;
                    nlrVar3.b |= 4;
                    nlrVar3.d = epochMilli2;
                } else {
                    long epochMilli3 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM.u();
                    defpackage.nlr nlrVar4 = (defpackage.nlr) akzxVarM.b;
                    i2 = 4;
                    nlrVar4.b |= 4;
                    nlrVar4.d = epochMilli3;
                }
                alad aladVarP2 = akzxVarM.p();
                aooh.e(aladVarP2, "build(...)");
                defpackage.nlr nlrVar5 = (defpackage.nlr) aladVarP2;
                aooh.f(nlrVar5, "value");
                akzx akzxVar2 = (akzx) npwVarAB2.a;
                akzxVar2.u();
                defpackage.nmk nmkVar2 = (defpackage.nmk) akzxVar2.b;
                j$.util.Objects.requireNonNull(nlrVar5);
                nmkVar2.c = nlrVar5;
                nmkVar2.b = 1;
                nmkVarD = npwVarAB2.D();
                neeVar.e = nmoVar5;
                neeVar.f = nmoVar3;
                neeVar.a = i;
                neeVar.d = 3;
                if (ogjVar.b(nmkVarD, neeVar) == aoluVar) {
                    return aoluVar;
                }
                nmoVar6 = nmoVar3;
                i3 = i;
                switch (nmoVar5.ordinal()) {
                    case 0:
                    case 16:
                        nvpVar = null;
                        break;
                    case 1:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_NOT_A_DOBBY_CALL;
                        break;
                    case 2:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_READY_FOR_MANUAL_SCREENING;
                        break;
                    case 3:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING;
                        break;
                    case 4:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI;
                        break;
                    case 5:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING;
                        break;
                    case 6:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI;
                        break;
                    case 7:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BAM;
                        break;
                    case 8:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION;
                        break;
                    case 9:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION;
                        break;
                    case 10:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_TAKING_MESSAGE;
                        break;
                    case 11:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_FOREGROUND_DECLINING;
                        break;
                    case 12:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BACKGROUND_DECLINING;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_ANSWER;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY_WITH_UI;
                        break;
                    default:
                        throw new aois();
                }
                if (nvpVar != null) {
                    mqtVar = this.q;
                    neeVar.e = nmoVar5;
                    neeVar.f = nmoVar6;
                    neeVar.a = i3;
                    neeVar.d = i2;
                    if (mqtVar.x(nvpVar, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                i4 = i3;
                nmoVar7 = nmoVar5;
                if (((java.lang.Boolean) this.C.a()).booleanValue()) {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                }
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 2:
                nmoVar3 = neeVar.f;
                nmoVar4 = neeVar.e;
                aooc.af(objA);
                if (((java.lang.Boolean) objA).booleanValue()) {
                    break;
                }
                i = 1;
                nmoVar5 = nmoVar4;
                a.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "transitionLifecycleStateTo", 2210, "DobbyLifecycleController.kt").y("transitioning to state %s", new aepg(nmoVar5));
                new mgr(this.ag, nmoVar5).b(defpackage.mfy.DOBBY_LIFECYCLE_STATE).c(new defpackage.naa(new aoom() { // from class: nef
                    public final java.lang.Object b(java.lang.Object obj) {
                        return ((defpackage.nmo) obj).name();
                    }
                }, 14));
                ogjVar = this.Z;
                defpackage.npw npwVarAB3 = mni.aB(defpackage.nmk.a.m());
                akzxVarM = defpackage.nlr.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(nmoVar5, "value");
                akzxVarM.u();
                ((defpackage.nlr) akzxVarM.b).c = nmoVar5.a();
                if (nmoVar5 != defpackage.nmo.MANUAL_SCREENING) {
                    long epochMilli4 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM.u();
                    defpackage.nlr nlrVar6 = (defpackage.nlr) akzxVarM.b;
                    i2 = 4;
                    nlrVar6.b |= 4;
                    nlrVar6.d = epochMilli4;
                } else {
                    long epochMilli5 = j$.time.Instant.now().toEpochMilli();
                    akzxVarM.u();
                    defpackage.nlr nlrVar7 = (defpackage.nlr) akzxVarM.b;
                    i2 = 4;
                    nlrVar7.b |= 4;
                    nlrVar7.d = epochMilli5;
                }
                alad aladVarP3 = akzxVarM.p();
                aooh.e(aladVarP3, "build(...)");
                defpackage.nlr nlrVar8 = (defpackage.nlr) aladVarP3;
                aooh.f(nlrVar8, "value");
                akzx akzxVar3 = (akzx) npwVarAB3.a;
                akzxVar3.u();
                defpackage.nmk nmkVar3 = (defpackage.nmk) akzxVar3.b;
                j$.util.Objects.requireNonNull(nlrVar8);
                nmkVar3.c = nlrVar8;
                nmkVar3.b = 1;
                nmkVarD = npwVarAB3.D();
                neeVar.e = nmoVar5;
                neeVar.f = nmoVar3;
                neeVar.a = i;
                neeVar.d = 3;
                if (ogjVar.b(nmkVarD, neeVar) == aoluVar) {
                    return aoluVar;
                }
                nmoVar6 = nmoVar3;
                i3 = i;
                switch (nmoVar5.ordinal()) {
                    case 0:
                    case 16:
                        nvpVar = null;
                        break;
                    case 1:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_NOT_A_DOBBY_CALL;
                        break;
                    case 2:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_READY_FOR_MANUAL_SCREENING;
                        break;
                    case 3:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING;
                        break;
                    case 4:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI;
                        break;
                    case 5:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING;
                        break;
                    case 6:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI;
                        break;
                    case 7:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BAM;
                        break;
                    case 8:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION;
                        break;
                    case 9:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION;
                        break;
                    case 10:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_TAKING_MESSAGE;
                        break;
                    case 11:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_FOREGROUND_DECLINING;
                        break;
                    case 12:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BACKGROUND_DECLINING;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_ANSWER;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY_WITH_UI;
                        break;
                    default:
                        throw new aois();
                }
                if (nvpVar != null) {
                    mqtVar = this.q;
                    neeVar.e = nmoVar5;
                    neeVar.f = nmoVar6;
                    neeVar.a = i3;
                    neeVar.d = i2;
                    if (mqtVar.x(nvpVar, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                i4 = i3;
                nmoVar7 = nmoVar5;
                if (((java.lang.Boolean) this.C.a()).booleanValue()) {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                }
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 3:
                i3 = neeVar.a;
                defpackage.nmo nmoVar10 = neeVar.f;
                nmoVar5 = neeVar.e;
                aooc.af(objA);
                nmoVar6 = nmoVar10;
                i2 = 4;
                switch (nmoVar5.ordinal()) {
                    case 0:
                    case 16:
                        nvpVar = null;
                        break;
                    case 1:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_NOT_A_DOBBY_CALL;
                        break;
                    case 2:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_READY_FOR_MANUAL_SCREENING;
                        break;
                    case 3:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING;
                        break;
                    case 4:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_AUTO_SCREENING_WITH_UI;
                        break;
                    case 5:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING;
                        break;
                    case 6:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_MANUAL_SCREENING_WITHOUT_UI;
                        break;
                    case 7:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BAM;
                        break;
                    case 8:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_ACTIVE_SESSION;
                        break;
                    case 9:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_RINGING_DURING_NOT_ACTIVE_SESSION;
                        break;
                    case 10:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_TAKING_MESSAGE;
                        break;
                    case 11:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_FOREGROUND_DECLINING;
                        break;
                    case 12:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BACKGROUND_DECLINING;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_ANSWER;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY;
                        break;
                    case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                        nvpVar = defpackage.nvp.EVENT_DOBBY_START_BEESLY_WITH_UI;
                        break;
                    default:
                        throw new aois();
                }
                if (nvpVar != null) {
                    mqtVar = this.q;
                    neeVar.e = nmoVar5;
                    neeVar.f = nmoVar6;
                    neeVar.a = i3;
                    neeVar.d = i2;
                    if (mqtVar.x(nvpVar, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                i4 = i3;
                nmoVar7 = nmoVar5;
                if (((java.lang.Boolean) this.C.a()).booleanValue()) {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                }
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 4:
                int i6 = neeVar.a;
                nmoVar6 = neeVar.f;
                defpackage.nmo nmoVar11 = neeVar.e;
                aooc.af(objA);
                i4 = i6;
                nmoVar7 = nmoVar11;
                if (((java.lang.Boolean) this.C.a()).booleanValue()) {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (1 != i4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    ifbVar = this.aa;
                    neeVar.e = nmoVar7;
                    neeVar.f = null;
                    neeVar.d = 5;
                    iOrdinal = nmoVar7.ordinal();
                    if (iOrdinal != 1) {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    } else {
                        objF = ifbVar.f(nmoVar7, java.lang.Boolean.valueOf(z), neeVar);
                        if (objF != aoluVar) {
                            objF = aojh.a;
                        }
                    }
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                }
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 5:
            case 6:
                nmoVar7 = neeVar.e;
                aooc.af(objA);
                if (this.ap.g().isPresent()) {
                    neeVar.e = null;
                    neeVar.d = 7;
                    if (v(nmoVar7, neeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 7:
                aooc.af(objA);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object P(defpackage.njt njtVar, aoln aolnVar) {
        defpackage.neg negVar;
        j$.time.Instant instantNow;
        aenj aenjVar;
        if (aolnVar instanceof defpackage.neg) {
            negVar = (defpackage.neg) aolnVar;
            int i = negVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                negVar.c = i - Integer.MIN_VALUE;
            } else {
                negVar = new defpackage.neg(this, aolnVar);
            }
        } else {
            negVar = new defpackage.neg(this, aolnVar);
        }
        java.lang.Object obj = negVar.a;
        aosy aosyVar = aolu.a;
        int i2 = negVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = negVar.e;
                instantNow = negVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar2 = new aenj("updateIntentLabel");
        negVar.d = instantNow;
        negVar.e = aenjVar2;
        negVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.bhp(njtVar, this, (aoln) null, 19));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        obj = aosyVarS;
        aenjVar = aenjVar2;
        defpackage.nbz nbzVar = new defpackage.nbz(instantNow, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        negVar.d = null;
        negVar.e = null;
        negVar.c = 2;
        if (aosyVar2.a(negVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object Q(aoln aolnVar) {
        defpackage.neh nehVar;
        if (aolnVar instanceof defpackage.neh) {
            nehVar = (defpackage.neh) aolnVar;
            int i = nehVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nehVar.c = i - Integer.MIN_VALUE;
            } else {
                nehVar = new defpackage.neh(this, aolnVar);
            }
        } else {
            nehVar = new defpackage.neh(this, aolnVar);
        }
        java.lang.Object objA = nehVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nehVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        defpackage.ogj ogjVar = this.Z;
        nehVar.c = 1;
        objA = ogjVar.a(nehVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        if (nmoVarB == defpackage.nmo.MANUAL_SCREENING_WITHOUT_UI) {
            defpackage.nmo nmoVar = defpackage.nmo.MANUAL_SCREENING;
            nehVar.c = 2;
            if (O(nmoVar, nehVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object R(aoln aolnVar) {
        defpackage.nei neiVar;
        if (aolnVar instanceof defpackage.nei) {
            neiVar = (defpackage.nei) aolnVar;
            int i = neiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                neiVar.c = i - Integer.MIN_VALUE;
            } else {
                neiVar = new defpackage.nei(this, aolnVar);
            }
        } else {
            neiVar = new defpackage.nei(this, aolnVar);
        }
        java.lang.Object objA = neiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = neiVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        defpackage.ogj ogjVar = this.Z;
        neiVar.c = 1;
        objA = ogjVar.a(neiVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        if (nmoVarB == defpackage.nmo.AUTO_SCREENING) {
            defpackage.nmo nmoVar = defpackage.nmo.AUTO_SCREENING_WITH_UI;
            neiVar.c = 2;
            if (O(nmoVar, neiVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aosy S(aenj aenjVar, aonj aonjVar) {
        aonj aonjVarAR = pez.aR(this.af, ruc.aW, aenjVar, new defpackage.bhp(aonjVar, aenjVar, (aoln) null, 18));
        return ((java.lang.Boolean) this.ai.a()).booleanValue() ? ahvr.ag(this.ad, this.au, new defpackage.muz(aonjVarAR, (aoln) null, 19, (short[]) null)) : ahvr.ag(this.f, this.au, new defpackage.muz(aonjVarAR, (aoln) null, 20, (int[]) null));
    }

    public final aoub T(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.aj.a()).booleanValue()) {
            return aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(aonnVar, (aoln) null, 11, (boolean[]) null), 3);
        }
        aimz aimzVar = zih.a;
        return aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, aonnVar, 10, (int[]) null));
    }

    public final void U(aenj aenjVar) {
        defpackage.nbz nbzVar;
        if (!((java.lang.Boolean) this.ak.a()).booleanValue()) {
            return;
        }
        aenj aenjVar2 = new aenj(" ");
        aenj aenjVar3 = new aenj("");
        while (true) {
            j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
            if (concurrentLinkedQueue.isEmpty() || (nbzVar = (defpackage.nbz) concurrentLinkedQueue.peek()) == null) {
                return;
            }
            if (nbzVar.c.t()) {
                long seconds = j$.time.Duration.between(nbzVar.a, j$.time.Instant.now()).toSeconds();
                if (seconds <= 0) {
                    a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "dumpOldestActiveTask", 795, "DobbyLifecycleController.kt").N("NGCS.dumpActiveTask.Instant(%s) duration(%s) : Active(%s),Complete(%s)", new aepg(aenjVar), new aepb(seconds), new aepg(nbzVar.b), new aepg(aenjVar3));
                    return;
                }
                long jLongValue = ((java.lang.Number) this.al.a()).longValue();
                aimz aimzVar = a;
                if (seconds >= jLongValue) {
                    aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "dumpOldestActiveTask", 805, "DobbyLifecycleController.kt").N("NGCS.dumpActiveTask.Stall(%s) duration(%s) : Active(%s),Complete(%s)", new aepg(aenjVar), new aepb(seconds), new aepg(nbzVar.b), new aepg(aenjVar3));
                    return;
                } else {
                    aimzVar.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "dumpOldestActiveTask", 815, "DobbyLifecycleController.kt").N("NGCS.dumpActiveTask(%s) duration(%s) : Active(%s),Complete(%s)", new aepg(aenjVar), new aepb(seconds), new aepg(nbzVar.b), new aepg(aenjVar3));
                    return;
                }
            }
            aenjVar3 = aenj.b(aenjVar3, new aenj[]{nbzVar.b, aenjVar2});
        }
    }

    public final void V() {
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "endCall", 2062, "DobbyLifecycleController.kt").v("ending call");
        T(this.f, new defpackage.muz(this, (aoln) null, 18));
    }

    public final boolean W(android.telecom.Call.Details details) {
        return !android.text.TextUtils.isEmpty(ura.b(details)) && details.getHandlePresentation() == 1;
    }

    public final void X(aenj aenjVar) {
        defpackage.nbz nbzVar;
        if (((java.lang.Boolean) this.am.a()).booleanValue()) {
            aoot aootVar = new aoot();
            aootVar.a = new aenj("");
            boolean z = false;
            while (true) {
                j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.G;
                if (concurrentLinkedQueue.isEmpty() || (nbzVar = (defpackage.nbz) concurrentLinkedQueue.peek()) == null) {
                    break;
                }
                aosy aosyVar = nbzVar.c;
                if (!aosyVar.t()) {
                    concurrentLinkedQueue.poll();
                } else {
                    if (!z && !nbzVar.b.equals(new aenj("declineCall"))) {
                        return;
                    }
                    this.X.c(qbc.aT);
                    aootVar.a = aenj.b((aenj) aootVar.a, new aenj[]{new aenj(" "), nbzVar.b});
                    aosyVar.s((java.util.concurrent.CancellationException) null);
                    concurrentLinkedQueue.poll();
                    z = true;
                }
            }
            aoov.an(this.f, (aolr) null, 0, new defpackage.jnq(this, aenjVar, aootVar, (aoln) null, 2), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object Y(pci pciVar, aoln aolnVar) {
        defpackage.ncp ncpVar;
        if (aolnVar instanceof defpackage.ncp) {
            ncpVar = (defpackage.ncp) aolnVar;
            int i = ncpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncpVar.c = i - Integer.MIN_VALUE;
            } else {
                ncpVar = new defpackage.ncp(this, aolnVar);
            }
        } else {
            ncpVar = new defpackage.ncp(this, aolnVar);
        }
        java.lang.Object objC = ncpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncpVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            ncpVar.c = 1;
            objC = pciVar.c(ncpVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
        }
        return java.lang.Boolean.valueOf(!((java.lang.Boolean) objC).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nca ncaVar;
        aenj aenjVar;
        j$.time.Instant instant;
        if (aolnVar instanceof defpackage.nca) {
            ncaVar = (defpackage.nca) aolnVar;
            int i = ncaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncaVar.c = i - Integer.MIN_VALUE;
            } else {
                ncaVar = new defpackage.nca(this, aolnVar);
            }
        } else {
            ncaVar = new defpackage.nca(this, aolnVar);
        }
        java.lang.Object obj = ncaVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ncaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ncaVar.e;
                instant = ncaVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenjVar = new aenj("answerCall");
        ncaVar.d = instantNow;
        ncaVar.e = aenjVar;
        ncaVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ncb(this, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ncaVar.d = null;
        ncaVar.e = null;
        ncaVar.c = 2;
        if (aosyVar2.a(ncaVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(defpackage.mne mneVar, aoln aolnVar) {
        defpackage.nce nceVar;
        if (aolnVar instanceof defpackage.nce) {
            nceVar = (defpackage.nce) aolnVar;
            int i = nceVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nceVar.c = i - Integer.MIN_VALUE;
            } else {
                nceVar = new defpackage.nce(this, aolnVar);
            }
        } else {
            nceVar = new defpackage.nce(this, aolnVar);
        }
        java.lang.Object objA = nceVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = nceVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.Z;
            nceVar.d = mneVar;
            nceVar.c = 1;
            objA = ogjVar.a(nceVar);
            if (objA != boolValueOf) {
            }
            return boolValueOf;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mneVar = nceVar.d;
        aooc.af(objA);
        defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
        if (nmoVarB == null) {
            nmoVarB = defpackage.nmo.UNRECOGNIZED;
        }
        defpackage.ifb ifbVar = this.as;
        aooh.f(mneVar, "useCase");
        java.util.Map mapI = ifbVar.i();
        defpackage.mnd mndVarB = defpackage.mnd.b(mneVar.c);
        if (mndVarB == null) {
            mndVarB = defpackage.mnd.UNRECOGNIZED;
        }
        java.util.Set set = (java.util.Set) mapI.get(mndVarB);
        if (set == null) {
            java.util.Objects.toString(mneVar);
            throw new java.lang.IllegalArgumentException("Invalid use case: ".concat(java.lang.String.valueOf(mneVar)));
        }
        boolean zContains = set.contains(nmoVarB);
        boolValueOf = java.lang.Boolean.valueOf(zContains);
        boolValueOf.getClass();
        aimw aimwVarL = a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "canStartDobbyFeature$<anonymous>", 2036, "DobbyLifecycleController.kt");
        defpackage.mnd mndVarB2 = defpackage.mnd.b(mneVar.c);
        if (mndVarB2 == null) {
            mndVarB2 = defpackage.mnd.UNRECOGNIZED;
        }
        aimwVarL.M("canStartDobbyFeature for %s: %s in lifecycleState: %s", mndVarB2.name(), java.lang.Boolean.valueOf(zContains), nmoVarB);
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(alta altaVar, boolean z, aoln aolnVar) {
        defpackage.ncf ncfVar;
        j$.time.Instant instant;
        aenj aenjVar;
        if (aolnVar instanceof defpackage.ncf) {
            ncfVar = (defpackage.ncf) aolnVar;
            int i = ncfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncfVar.c = i - Integer.MIN_VALUE;
            } else {
                ncfVar = new defpackage.ncf(this, aolnVar);
            }
        } else {
            ncfVar = new defpackage.ncf(this, aolnVar);
        }
        java.lang.Object obj = ncfVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ncfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ncfVar.e;
                instant = ncfVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenj aenjVar2 = new aenj("declineCall");
        ncfVar.d = instantNow;
        ncfVar.e = aenjVar2;
        ncfVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ncg(this, altaVar, z, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        aenjVar = aenjVar2;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ncfVar.d = null;
        ncfVar.e = null;
        ncfVar.c = 2;
        if (aosyVar2.a(ncfVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    public final java.lang.Object d(aoln aolnVar) {
        defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
        defpackage.nwj nwjVarAD = mni.aD(defpackage.nlu.a.m());
        nwjVarAD.D();
        npwVarAB.G(nwjVarAD.C());
        java.lang.Object objB = this.Z.b(npwVarAB.D(), aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.nch nchVar;
        if (aolnVar instanceof defpackage.nch) {
            nchVar = (defpackage.nch) aolnVar;
            int i = nchVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nchVar.c = i - Integer.MIN_VALUE;
            } else {
                nchVar = new defpackage.nch(this, aolnVar);
            }
        } else {
            nchVar = new defpackage.nch(this, aolnVar);
        }
        java.lang.Object objA = nchVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nchVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.Z;
            nchVar.c = 1;
            objA = ogjVar.a(nchVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.nms nmsVarB = defpackage.nms.b(((defpackage.nmu) objA).s);
        return nmsVarB == null ? defpackage.nms.UNRECOGNIZED : nmsVarB;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(alta altaVar, boolean z, aoln aolnVar) {
        defpackage.nci nciVar;
        alta altaVar2;
        boolean z2;
        defpackage.nmo nmoVarB;
        defpackage.nmo nmoVar;
        if (aolnVar instanceof defpackage.nci) {
            nciVar = (defpackage.nci) aolnVar;
            int i = nciVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nciVar.d = i - Integer.MIN_VALUE;
            } else {
                nciVar = new defpackage.nci(this, aolnVar);
            }
        } else {
            nciVar = new defpackage.nci(this, aolnVar);
        }
        java.lang.Object objA = nciVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nciVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    z = nciVar.a;
                    altaVar = nciVar.e;
                    aooc.af(objA);
                } else if (i2 == 2) {
                    z2 = nciVar.a;
                    altaVar2 = nciVar.e;
                    aooc.af(objA);
                    nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                    if (nmoVarB == null) {
                        nmoVarB = defpackage.nmo.UNRECOGNIZED;
                    }
                    if (nmoVarB != defpackage.nmo.BEESLY) {
                        nciVar.e = altaVar2;
                        nciVar.d = 3;
                        if (k(z2, nciVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    altaVar = altaVar2;
                    nmoVar = defpackage.nmo.BACKGROUND_DECLINING;
                    nciVar.e = altaVar;
                    nciVar.d = 4;
                    if (O(nmoVar, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.n.b(mce.ch);
                    nciVar.e = null;
                    nciVar.d = 5;
                    if (t(altaVar, false, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 == 3) {
                    altaVar = nciVar.e;
                    aooc.af(objA);
                    nmoVar = defpackage.nmo.BACKGROUND_DECLINING;
                    nciVar.e = altaVar;
                    nciVar.d = 4;
                    if (O(nmoVar, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.n.b(mce.ch);
                    nciVar.e = null;
                    nciVar.d = 5;
                    if (t(altaVar, false, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 == 4) {
                    altaVar = nciVar.e;
                    aooc.af(objA);
                    this.n.b(mce.ch);
                    nciVar.e = null;
                    nciVar.d = 5;
                    if (t(altaVar, false, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objA);
                }
                this.n.b(mce.ce);
                V();
                return aojh.a;
            }
            aooc.af(objA);
            defpackage.ogj ogjVar = this.Z;
            nciVar.e = altaVar;
            nciVar.a = z;
            nciVar.d = 1;
            objA = ogjVar.a(nciVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            if (!((defpackage.nmu) objA).n) {
                defpackage.ogj ogjVar2 = this.Z;
                nciVar.e = altaVar;
                nciVar.a = z;
                nciVar.d = 2;
                objA = ogjVar2.a(nciVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                boolean z3 = z;
                altaVar2 = altaVar;
                z2 = z3;
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                if (nmoVarB != defpackage.nmo.BEESLY) {
                    nciVar.e = altaVar2;
                    nciVar.d = 3;
                    if (k(z2, nciVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                altaVar = altaVar2;
            }
            nmoVar = defpackage.nmo.BACKGROUND_DECLINING;
            nciVar.e = altaVar;
            nciVar.d = 4;
            if (O(nmoVar, nciVar) == aoluVar) {
                return aoluVar;
            }
            this.n.b(mce.ch);
            nciVar.e = null;
            nciVar.d = 5;
            if (t(altaVar, false, nciVar) == aoluVar) {
                return aoluVar;
            }
            this.n.b(mce.ce);
            V();
            return aojh.a;
        } catch (java.util.concurrent.CancellationException e) {
            a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "endBackgroundDecliningCall", 2437, "DobbyLifecycleController.kt").v("endBackgroundDecliningCall audio playback was cancelled");
            this.n.b(mce.cw);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.ncj ncjVar;
        aenj aenjVar;
        j$.time.Instant instant;
        if (aolnVar instanceof defpackage.ncj) {
            ncjVar = (defpackage.ncj) aolnVar;
            int i = ncjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncjVar.c = i - Integer.MIN_VALUE;
            } else {
                ncjVar = new defpackage.ncj(this, aolnVar);
            }
        } else {
            ncjVar = new defpackage.ncj(this, aolnVar);
        }
        java.lang.Object obj = ncjVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ncjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ncjVar.e;
                instant = ncjVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenjVar = new aenj("fallbackToSafeStateDueToError");
        ncjVar.d = instantNow;
        ncjVar.e = aenjVar;
        ncjVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.nck(this, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ncjVar.d = null;
        ncjVar.e = null;
        ncjVar.c = 2;
        if (aosyVar2.a(ncjVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.ncl nclVar;
        if (aolnVar instanceof defpackage.ncl) {
            nclVar = (defpackage.ncl) aolnVar;
            int i = nclVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nclVar.c = i - Integer.MIN_VALUE;
            } else {
                nclVar = new defpackage.ncl(this, aolnVar);
            }
        } else {
            nclVar = new defpackage.ncl(this, aolnVar);
        }
        java.lang.Object objD = nclVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nclVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.aw.X();
            nclVar.c = 1;
            objD = aosv.D(ajcqVarX, nclVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarQ = ((defpackage.nby) aooc.ar(objD, defpackage.nby.class)).q();
        nclVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarQ, nclVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.ncm ncmVar;
        if (aolnVar instanceof defpackage.ncm) {
            ncmVar = (defpackage.ncm) aolnVar;
            int i = ncmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncmVar.c = i - Integer.MIN_VALUE;
            } else {
                ncmVar = new defpackage.ncm(this, aolnVar);
            }
        } else {
            ncmVar = new defpackage.ncm(this, aolnVar);
        }
        java.lang.Object objD = ncmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncmVar.c;
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
        ajcq ajcqVarX = this.aw.X();
        ncmVar.c = 1;
        objD = aosv.D(ajcqVarX, ncmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarW = ((defpackage.nby) aooc.ar(objD, defpackage.nby.class)).W();
        ncmVar.c = 2;
        objD = aosv.D(ajcqVarW, ncmVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.ncn ncnVar;
        if (aolnVar instanceof defpackage.ncn) {
            ncnVar = (defpackage.ncn) aolnVar;
            int i = ncnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncnVar.c = i - Integer.MIN_VALUE;
            } else {
                ncnVar = new defpackage.ncn(this, aolnVar);
            }
        } else {
            ncnVar = new defpackage.ncn(this, aolnVar);
        }
        java.lang.Object objD = ncnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncnVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.aw.X();
            ncnVar.c = 1;
            objD = aosv.D(ajcqVarX, ncnVar);
            if (objD != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
            return objD;
        }
        aooc.af(objD);
        ajcq ajcqVarAc = ((defpackage.nby) aooc.ar(objD, defpackage.nby.class)).ac();
        ncnVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarAc, ncnVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    public final java.lang.Object k(boolean z, aoln aolnVar) {
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "handleCallTypeUpdateForDeclinedCall", 2046, "DobbyLifecycleController.kt").y("handleDeclinedCallTypeUpdate. isMissedCall: %s", java.lang.Boolean.valueOf(z));
        if (z) {
            this.n.b(mce.cp);
            java.lang.Object objL = l(aolnVar);
            if (objL == aolu.a) {
                return objL;
            }
        } else {
            java.lang.Object objE = this.v.e(5, aolnVar);
            if (objE == aolu.a) {
                return objE;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(aoln aolnVar) {
        defpackage.nco ncoVar;
        if (aolnVar instanceof defpackage.nco) {
            ncoVar = (defpackage.nco) aolnVar;
            int i = ncoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncoVar.c = i - Integer.MIN_VALUE;
            } else {
                ncoVar = new defpackage.nco(this, aolnVar);
            }
        } else {
            ncoVar = new defpackage.nco(this, aolnVar);
        }
        java.lang.Object obj = ncoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncoVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            this.J = true;
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.ogj ogjVar = this.Z;
        defpackage.npw npwVarAB = mni.aB(defpackage.nmk.a.m());
        akzx akzxVarM = defpackage.nlv.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        ((defpackage.nlv) akzxVarM.b).b = true;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.nlv nlvVar = (defpackage.nlv) aladVarP;
        aooh.f(nlvVar, "value");
        akzx akzxVar = (akzx) npwVarAB.a;
        akzxVar.u();
        defpackage.nmk nmkVar = (defpackage.nmk) akzxVar.b;
        j$.util.Objects.requireNonNull(nlvVar);
        nmkVar.c = nlvVar;
        nmkVar.b = 7;
        defpackage.nmk nmkVarD = npwVarAB.D();
        ncoVar.c = 1;
        if (ogjVar.b(nmkVarD, ncoVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.nrv nrvVar = this.v;
        ncoVar.c = 2;
        if (nrvVar.e(3, ncoVar) == aoluVar) {
            return aoluVar;
        }
        this.J = true;
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aoln aolnVar) {
        defpackage.ncq ncqVar;
        if (aolnVar instanceof defpackage.ncq) {
            ncqVar = (defpackage.ncq) aolnVar;
            int i = ncqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncqVar.c = i - Integer.MIN_VALUE;
            } else {
                ncqVar = new defpackage.ncq(this, aolnVar);
            }
        } else {
            ncqVar = new defpackage.ncq(this, aolnVar);
        }
        java.lang.Object objI = ncqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncqVar.c;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(objI);
            ncqVar.c = 1;
            objI = i(ncqVar);
            if (objI == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objI);
        }
        android.telecom.DisconnectCause disconnectCause = (android.telecom.DisconnectCause) objI;
        if (disconnectCause == null) {
            return java.lang.Boolean.FALSE;
        }
        if (disconnectCause.getCode() != 3 && disconnectCause.getCode() != 5) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(aoln aolnVar) {
        defpackage.ncr ncrVar;
        if (aolnVar instanceof defpackage.ncr) {
            ncrVar = (defpackage.ncr) aolnVar;
            int i = ncrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncrVar.c = i - Integer.MIN_VALUE;
            } else {
                ncrVar = new defpackage.ncr(this, aolnVar);
            }
        } else {
            ncrVar = new defpackage.ncr(this, aolnVar);
        }
        java.lang.Object objE = ncrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncrVar.c;
        if (i2 == 0) {
            aooc.af(objE);
            ncrVar.c = 1;
            objE = e(ncrVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        return java.lang.Boolean.valueOf(objE != defpackage.nms.CASE_NO_SESSION);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.ncs ncsVar;
        if (aolnVar instanceof defpackage.ncs) {
            ncsVar = (defpackage.ncs) aolnVar;
            int i = ncsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncsVar.c = i - Integer.MIN_VALUE;
            } else {
                ncsVar = new defpackage.ncs(this, aolnVar);
            }
        } else {
            ncsVar = new defpackage.ncs(this, aolnVar);
        }
        java.lang.Object objA = ncsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncsVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            defpackage.ogj ogjVar = this.Z;
            ncsVar.c = 1;
            objA = ogjVar.a(ncsVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        }
        defpackage.nmr nmrVarB = defpackage.nmr.b(((defpackage.nmu) objA).g);
        if (nmrVarB == null) {
            nmrVarB = defpackage.nmr.UNRECOGNIZED;
        }
        return java.lang.Boolean.valueOf(nmrVarB != defpackage.nmr.REASON_UNKNOWN);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x009e  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(aoln aolnVar) {
        defpackage.nct nctVar;
        defpackage.nmq nmqVar;
        defpackage.nmq nmqVar2;
        aimz aimzVar;
        if (aolnVar instanceof defpackage.nct) {
            nctVar = (defpackage.nct) aolnVar;
            int i = nctVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nctVar.c = i - Integer.MIN_VALUE;
            } else {
                nctVar = new defpackage.nct(this, aolnVar);
            }
        } else {
            nctVar = new defpackage.nct(this, aolnVar);
        }
        java.lang.Object objA = nctVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nctVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nmqVar = nctVar.d;
                aooc.af(objA);
            }
            if (((defpackage.nqi) objA).a != udj.c) {
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2156, "DobbyLifecycleController.kt").v("not spam from scooby or duplex");
                return java.lang.Boolean.FALSE;
            }
            nmqVar2 = defpackage.nmq.DECISION_NOT_SPAM;
            aimzVar = a;
            if (nmqVar == nmqVar2) {
                aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2160, "DobbyLifecycleController.kt").v("is spam from scooby but duplex doesn't agree");
                return java.lang.Boolean.FALSE;
            }
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2163, "DobbyLifecycleController.kt").v("is spam from scooby");
            return java.lang.Boolean.TRUE;
        }
        aooc.af(objA);
        defpackage.ogj ogjVar = this.Z;
        nctVar.c = 1;
        objA = ogjVar.a(nctVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.nmq nmqVarB = defpackage.nmq.b(((defpackage.nmu) objA).f);
        if (nmqVarB == null) {
            nmqVarB = defpackage.nmq.UNRECOGNIZED;
        }
        if (nmqVarB == defpackage.nmq.DECISION_SPAM) {
            a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2152, "DobbyLifecycleController.kt").v("is spam from duplex");
            return java.lang.Boolean.TRUE;
        }
        defpackage.nqh nqhVar = this.m;
        nctVar.d = nmqVarB;
        nctVar.c = 2;
        java.lang.Object objC = nqhVar.c(nctVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        defpackage.nmq nmqVar3 = nmqVarB;
        objA = objC;
        nmqVar = nmqVar3;
        if (((defpackage.nqi) objA).a != udj.c) {
            a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2156, "DobbyLifecycleController.kt").v("not spam from scooby or duplex");
            return java.lang.Boolean.FALSE;
        }
        nmqVar2 = defpackage.nmq.DECISION_NOT_SPAM;
        aimzVar = a;
        if (nmqVar == nmqVar2) {
            aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2160, "DobbyLifecycleController.kt").v("is spam from scooby but duplex doesn't agree");
            return java.lang.Boolean.FALSE;
        }
        aimzVar.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "isSpamCallFromScoobyAndDuplex", 2163, "DobbyLifecycleController.kt").v("is spam from scooby");
        return java.lang.Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(aoln aolnVar) {
        defpackage.ncu ncuVar;
        if (aolnVar instanceof defpackage.ncu) {
            ncuVar = (defpackage.ncu) aolnVar;
            int i = ncuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ncuVar.c = i - Integer.MIN_VALUE;
            } else {
                ncuVar = new defpackage.ncu(this, aolnVar);
            }
        } else {
            ncuVar = new defpackage.ncu(this, aolnVar);
        }
        java.lang.Object objD = ncuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ncuVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            tpf tpfVar = this.av;
            ncuVar.c = 1;
            objD = tpfVar.d(ncuVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(objD != null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(aoln aolnVar) {
        defpackage.ncz nczVar;
        if (aolnVar instanceof defpackage.ncz) {
            nczVar = (defpackage.ncz) aolnVar;
            int i = nczVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nczVar.c = i - Integer.MIN_VALUE;
            } else {
                nczVar = new defpackage.ncz(this, aolnVar);
            }
        } else {
            nczVar = new defpackage.ncz(this, aolnVar);
        }
        java.lang.Object obj = nczVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nczVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aolr aolrVar = this.d;
            bpj bpjVar = new bpj(this, (aoln) null, 19, (byte[]) null);
            nczVar.c = 1;
            if (aoov.aj(aolrVar, bpjVar, nczVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object s(aoln aolnVar) {
        defpackage.nda ndaVar;
        defpackage.nmo nmoVarB;
        int iOrdinal;
        java.lang.Object objAj;
        defpackage.nmo nmoVar;
        aenj aenjVar;
        aenj[] aenjVarArr;
        aenj[] aenjVarArr2;
        java.lang.String str;
        alsp alspVar;
        defpackage.mqt mqtVar;
        defpackage.nvp nvpVar;
        defpackage.njm njmVar;
        aimw aimwVar;
        if (aolnVar instanceof defpackage.nda) {
            ndaVar = (defpackage.nda) aolnVar;
            int i = ndaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndaVar.f = i - Integer.MIN_VALUE;
            } else {
                ndaVar = new defpackage.nda(this, aolnVar);
            }
        } else {
            ndaVar = new defpackage.nda(this, aolnVar);
        }
        java.lang.Object objA = ndaVar.d;
        aolu aoluVar = aolu.a;
        int i2 = 1;
        switch (ndaVar.f) {
            case 0:
                aooc.af(objA);
                defpackage.ogj ogjVar = this.Z;
                ndaVar.f = 1;
                objA = ogjVar.a(ndaVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                iOrdinal = nmoVarB.ordinal();
                if (iOrdinal == 8 && iOrdinal != 9) {
                    aimw aimwVarL = a.d().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playDialingSoundHandlingTimeoutBlocking", 1721, "DobbyLifecycleController.kt");
                    aenj aenjVarC = aenj.c((java.lang.String) null, nmoVarB);
                    aenj[] aenjVarArr3 = new aenj[2];
                    aenjVarArr3[0] = new aenj(", events:");
                    defpackage.mqt mqtVar2 = this.q;
                    ndaVar.a = aenjVarArr3;
                    ndaVar.b = aimwVarL;
                    ndaVar.g = "Can't start dial tone in state %s";
                    ndaVar.h = aenjVarC;
                    ndaVar.i = aenjVarArr3;
                    ndaVar.c = 1;
                    ndaVar.f = 9;
                    java.lang.Object objA2 = mqtVar2.a(ndaVar);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    aenjVar = aenjVarC;
                    aenjVarArr = aenjVarArr3;
                    objA = objA2;
                    aenjVarArr2 = aenjVarArr;
                    str = "Can't start dial tone in state %s";
                    aimwVar = aimwVarL;
                    aenjVarArr2[i2] = (aenj) objA;
                    aimwVar.y(str, new aepg(aenj.b(aenjVar, aenjVarArr)));
                    return aojh.a;
                }
                defpackage.njd njdVar = this.y;
                ndaVar.a = nmoVarB;
                ndaVar.f = 2;
                objAj = aoov.aj(njdVar.b, new defpackage.nit(njdVar, null), ndaVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nmoVar = nmoVarB;
                objA = objAj;
                if (((java.lang.Boolean) objA).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playDialingSoundHandlingTimeoutBlocking", 1702, "DobbyLifecycleController.kt").v("decline call when dial tone is finished.");
                    this.n.b(mce.cY);
                    ndaVar.a = nmoVar;
                    ndaVar.f = 3;
                    if (l(ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                        alspVar = alsp.b;
                        ndaVar.a = null;
                        ndaVar.f = 4;
                        if (w(alspVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        mqtVar = this.q;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_RINGING_TIMEOUT;
                        ndaVar.f = 5;
                        if (mqtVar.x(nvpVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        ndaVar.f = 6;
                        objA = q(ndaVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objA).booleanValue()) {
                            tpf tpfVar = this.av;
                            ndaVar.f = 7;
                            objA = tpfVar.d(ndaVar);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            njmVar = (defpackage.njm) objA;
                            if (njmVar != null) {
                                ndaVar.f = 8;
                                if (njmVar.h(ndaVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    } else {
                        V();
                    }
                }
                return aojh.a;
            case 1:
                aooc.af(objA);
                nmoVarB = defpackage.nmo.b(((defpackage.nmu) objA).c);
                if (nmoVarB == null) {
                    nmoVarB = defpackage.nmo.UNRECOGNIZED;
                }
                iOrdinal = nmoVarB.ordinal();
                if (iOrdinal == 8) {
                    break;
                }
                defpackage.njd njdVar2 = this.y;
                ndaVar.a = nmoVarB;
                ndaVar.f = 2;
                objAj = aoov.aj(njdVar2.b, new defpackage.nit(njdVar2, null), ndaVar);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nmoVar = nmoVarB;
                objA = objAj;
                if (((java.lang.Boolean) objA).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playDialingSoundHandlingTimeoutBlocking", 1702, "DobbyLifecycleController.kt").v("decline call when dial tone is finished.");
                    this.n.b(mce.cY);
                    ndaVar.a = nmoVar;
                    ndaVar.f = 3;
                    if (l(ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                        alspVar = alsp.b;
                        ndaVar.a = null;
                        ndaVar.f = 4;
                        if (w(alspVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        mqtVar = this.q;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_RINGING_TIMEOUT;
                        ndaVar.f = 5;
                        if (mqtVar.x(nvpVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        ndaVar.f = 6;
                        objA = q(ndaVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objA).booleanValue()) {
                            tpf tpfVar2 = this.av;
                            ndaVar.f = 7;
                            objA = tpfVar2.d(ndaVar);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            njmVar = (defpackage.njm) objA;
                            if (njmVar != null) {
                                ndaVar.f = 8;
                                if (njmVar.h(ndaVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    } else {
                        V();
                    }
                }
                return aojh.a;
            case 2:
                nmoVar = (defpackage.nmo) ndaVar.a;
                aooc.af(objA);
                if (((java.lang.Boolean) objA).booleanValue()) {
                    a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playDialingSoundHandlingTimeoutBlocking", 1702, "DobbyLifecycleController.kt").v("decline call when dial tone is finished.");
                    this.n.b(mce.cY);
                    ndaVar.a = nmoVar;
                    ndaVar.f = 3;
                    if (l(ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                    if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                        alspVar = alsp.b;
                        ndaVar.a = null;
                        ndaVar.f = 4;
                        if (w(alspVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        mqtVar = this.q;
                        nvpVar = defpackage.nvp.EVENT_DOBBY_RINGING_TIMEOUT;
                        ndaVar.f = 5;
                        if (mqtVar.x(nvpVar, ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                        ndaVar.f = 6;
                        objA = q(ndaVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objA).booleanValue()) {
                            tpf tpfVar3 = this.av;
                            ndaVar.f = 7;
                            objA = tpfVar3.d(ndaVar);
                            if (objA == aoluVar) {
                                return aoluVar;
                            }
                            njmVar = (defpackage.njm) objA;
                            if (njmVar != null) {
                                ndaVar.f = 8;
                                if (njmVar.h(ndaVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                    } else {
                        V();
                    }
                }
                return aojh.a;
            case 3:
                nmoVar = (defpackage.nmo) ndaVar.a;
                aooc.af(objA);
                if (nmoVar == defpackage.nmo.RINGING_DURING_ACTIVE_SESSION) {
                    alspVar = alsp.b;
                    ndaVar.a = null;
                    ndaVar.f = 4;
                    if (w(alspVar, ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                    mqtVar = this.q;
                    nvpVar = defpackage.nvp.EVENT_DOBBY_RINGING_TIMEOUT;
                    ndaVar.f = 5;
                    if (mqtVar.x(nvpVar, ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                    ndaVar.f = 6;
                    objA = q(ndaVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objA).booleanValue()) {
                        tpf tpfVar4 = this.av;
                        ndaVar.f = 7;
                        objA = tpfVar4.d(ndaVar);
                        if (objA == aoluVar) {
                            return aoluVar;
                        }
                        njmVar = (defpackage.njm) objA;
                        if (njmVar != null) {
                            ndaVar.f = 8;
                            if (njmVar.h(ndaVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                } else {
                    V();
                }
                return aojh.a;
            case 4:
                aooc.af(objA);
                mqtVar = this.q;
                nvpVar = defpackage.nvp.EVENT_DOBBY_RINGING_TIMEOUT;
                ndaVar.f = 5;
                if (mqtVar.x(nvpVar, ndaVar) == aoluVar) {
                    return aoluVar;
                }
                ndaVar.f = 6;
                objA = q(ndaVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objA).booleanValue()) {
                    tpf tpfVar5 = this.av;
                    ndaVar.f = 7;
                    objA = tpfVar5.d(ndaVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    njmVar = (defpackage.njm) objA;
                    if (njmVar != null) {
                        ndaVar.f = 8;
                        if (njmVar.h(ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 5:
                aooc.af(objA);
                ndaVar.f = 6;
                objA = q(ndaVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objA).booleanValue()) {
                    tpf tpfVar6 = this.av;
                    ndaVar.f = 7;
                    objA = tpfVar6.d(ndaVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    njmVar = (defpackage.njm) objA;
                    if (njmVar != null) {
                        ndaVar.f = 8;
                        if (njmVar.h(ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 6:
                aooc.af(objA);
                if (((java.lang.Boolean) objA).booleanValue()) {
                    tpf tpfVar7 = this.av;
                    ndaVar.f = 7;
                    objA = tpfVar7.d(ndaVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                    njmVar = (defpackage.njm) objA;
                    if (njmVar != null) {
                        ndaVar.f = 8;
                        if (njmVar.h(ndaVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                }
                return aojh.a;
            case 7:
                aooc.af(objA);
                njmVar = (defpackage.njm) objA;
                if (njmVar != null) {
                    ndaVar.f = 8;
                    if (njmVar.h(ndaVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 8:
                aooc.af(objA);
                return aojh.a;
            case 9:
                i2 = ndaVar.c;
                aenjVarArr2 = ndaVar.i;
                aenjVar = ndaVar.h;
                str = ndaVar.g;
                java.lang.Object obj = ndaVar.b;
                aenjVarArr = (aenj[]) ndaVar.a;
                aooc.af(objA);
                aimwVar = obj;
                aenjVarArr2[i2] = (aenj) objA;
                aimwVar.y(str, new aepg(aenj.b(aenjVar, aenjVarArr)));
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(alta altaVar, boolean z, aoln aolnVar) throws aois {
        defpackage.ndb ndbVar;
        if (aolnVar instanceof defpackage.ndb) {
            ndbVar = (defpackage.ndb) aolnVar;
            int i = ndbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndbVar.d = i - Integer.MIN_VALUE;
            } else {
                ndbVar = new defpackage.ndb(this, aolnVar);
            }
        } else {
            ndbVar = new defpackage.ndb(this, aolnVar);
        }
        java.lang.Object objAj = ndbVar.b;
        aolu aoluVar = aolu.a;
        int i2 = ndbVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                z = ndbVar.a;
                aooc.af(objAj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objAj);
            }
            return aojh.a;
        }
        aooc.af(objAj);
        defpackage.njd njdVar = this.y;
        ndbVar.a = z;
        ndbVar.d = 1;
        objAj = aoov.aj(njdVar.c, new defpackage.niw(njdVar, altaVar, null), ndbVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        switch ((defpackage.Cnew) objAj) {
            case PLAY_RECORDING_RESULT_UNKNOWN:
            case PLAY_RECORDING_COMPLETED:
            case UNRECOGNIZED:
                break;
            case PLAY_RECORDING_FAILED:
                a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playRecordingAndAwait", 2105, "DobbyLifecycleController.kt").y("play recording failed, fallback %b", new aepc(z));
                if (z) {
                    ndbVar.d = 2;
                    if (g(ndbVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                break;
            case PLAY_RECORDING_NOT_STARTED:
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playRecordingAndAwait", 2120, "DobbyLifecycleController.kt").v("play recording not started");
                break;
            case PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES:
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playRecordingAndAwait", 2114, "DobbyLifecycleController.kt").v("play recording cancelled in not allowed states, no fallback");
                break;
            case PLAY_RECORDING_CANCELLED_DUE_TO_AUDIO_PLAYING_ISSUES_DETECTED:
                a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "playRecordingAndAwait", 2117, "DobbyLifecycleController.kt").v("play recording cancelled due to audio playing issues detected before");
                break;
            default:
                throw new aois();
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:31:0x00cb->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b5 -> B:31:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object u(aoln r11) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nej.u(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(defpackage.nmo nmoVar, aoln aolnVar) {
        defpackage.ndd nddVar;
        aoin aoinVar;
        defpackage.nvh nvhVar;
        defpackage.nvg nvgVarD;
        if (aolnVar instanceof defpackage.ndd) {
            nddVar = (defpackage.ndd) aolnVar;
            int i = nddVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nddVar.c = i - Integer.MIN_VALUE;
            } else {
                nddVar = new defpackage.ndd(this, aolnVar);
            }
        } else {
            nddVar = new defpackage.ndd(this, aolnVar);
        }
        java.lang.Object objA = nddVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nddVar.c;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                nmoVar = nddVar.d;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        if (nmoVar != defpackage.nmo.READY_FOR_MANUAL_SCREENING && nmoVar != defpackage.nmo.BAM) {
            defpackage.ogj ogjVar = this.Z;
            nddVar.d = nmoVar;
            nddVar.c = 1;
            objA = ogjVar.a(nddVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        } else if (z) {
            aoinVar = (aoin) this.at.k().get(defpackage.nvd.a);
            if (aoinVar != null) {
                nvhVar = (defpackage.nvh) aoinVar.a();
            } else {
                nvhVar = null;
            }
            if (nvhVar == null) {
                this.ah.a(new java.lang.IllegalStateException("BamSyncEventListener for NewConversationStateReceived is missing when the call has transitioned to BAM."));
            } else {
                defpackage.nwj nwjVarAh = mni.ah(defpackage.nvg.a.m());
                defpackage.nwj nwjVarAg = mni.ag(defpackage.nve.a.m());
                nwjVarAg.b(nmoVar);
                nwjVarAh.e(nwjVarAg.a());
                nvgVarD = nwjVarAh.d();
                nddVar.d = null;
                nddVar.c = 2;
                if (nvhVar.a(nvgVarD, nddVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
        if (!((defpackage.nmu) objA).p) {
            z = false;
        }
        if (z) {
            aoinVar = (aoin) this.at.k().get(defpackage.nvd.a);
            if (aoinVar != null) {
                nvhVar = (defpackage.nvh) aoinVar.a();
            } else {
                nvhVar = null;
            }
            if (nvhVar == null) {
                this.ah.a(new java.lang.IllegalStateException("BamSyncEventListener for NewConversationStateReceived is missing when the call has transitioned to BAM."));
            } else {
                defpackage.nwj nwjVarAh2 = mni.ah(defpackage.nvg.a.m());
                defpackage.nwj nwjVarAg2 = mni.ag(defpackage.nve.a.m());
                nwjVarAg2.b(nmoVar);
                nwjVarAh2.e(nwjVarAg2.a());
                nvgVarD = nwjVarAh2.d();
                nddVar.d = null;
                nddVar.c = 2;
                if (nvhVar.a(nvgVarD, nddVar) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(alsp alspVar, aoln aolnVar) {
        defpackage.nde ndeVar;
        if (aolnVar instanceof defpackage.nde) {
            ndeVar = (defpackage.nde) aolnVar;
            int i = ndeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndeVar.c = i - Integer.MIN_VALUE;
            } else {
                ndeVar = new defpackage.nde(this, aolnVar);
            }
        } else {
            ndeVar = new defpackage.nde(this, aolnVar);
        }
        java.lang.Object obj = ndeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndeVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "relayToDuplexRingingEndedEvent", 2305, "DobbyLifecycleController.kt").v("relaying to Duplex ringing ended event");
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alsq.d;
            aooh.e(apdiVar, "ringingEndedEvent");
            akzx akzxVarM = alsq.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(alspVar, "value");
            akzxVarM.u();
            alsq alsqVar = akzxVarM.b;
            alsqVar.c = alspVar.e;
            alsqVar.b |= 1;
            alsq alsqVarP = akzxVarM.p();
            aooh.e(alsqVarP, "build(...)");
            ajyiVarI.be(apdiVar, alsqVarP);
            alro alroVarBa = ajyiVarI.ba();
            defpackage.nbr nbrVar = this.ae;
            ndeVar.c = 1;
            if (nbrVar.a(alroVarBa, ndeVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(aoln aolnVar) {
        defpackage.ndf ndfVar;
        if (aolnVar instanceof defpackage.ndf) {
            ndfVar = (defpackage.ndf) aolnVar;
            int i = ndfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndfVar.c = i - Integer.MIN_VALUE;
            } else {
                ndfVar = new defpackage.ndf(this, aolnVar);
            }
        } else {
            ndfVar = new defpackage.ndf(this, aolnVar);
        }
        java.lang.Object obj = ndfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndfVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "relayToDuplexRingingStartedEvent", 2297, "DobbyLifecycleController.kt").v("relaying to Duplex ringing started event");
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alsr.b;
            aooh.e(apdiVar, "ringingStartedEvent");
            akzx akzxVarM = alsr.a.m();
            aooh.f(akzxVarM, "builder");
            alsr alsrVarP = akzxVarM.p();
            aooh.e(alsrVarP, "build(...)");
            ajyiVarI.be(apdiVar, alsrVarP);
            alro alroVarBa = ajyiVarI.ba();
            defpackage.nbr nbrVar = this.ae;
            ndfVar.c = 1;
            if (nbrVar.a(alroVarBa, ndfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(aoln aolnVar) {
        defpackage.ndg ndgVar;
        if (aolnVar instanceof defpackage.ndg) {
            ndgVar = (defpackage.ndg) aolnVar;
            int i = ndgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndgVar.c = i - Integer.MIN_VALUE;
            } else {
                ndgVar = new defpackage.ndg(this, aolnVar);
            }
        } else {
            ndgVar = new defpackage.ndg(this, aolnVar);
        }
        java.lang.Object objD = ndgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ndgVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarA = this.an.a();
            ndgVar.c = 1;
            objD = aosv.D(ajcqVarA, ndgVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objD;
        bool.booleanValue();
        a.b().l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "requestInCallMinimization", 2470, "DobbyLifecycleController.kt").y("Call is transitioning to Beesly call, requested minimizing in-call UI; is request processed: %b", bool);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object z(aoln aolnVar) {
        defpackage.ndh ndhVar;
        aenj aenjVar;
        j$.time.Instant instant;
        if (aolnVar instanceof defpackage.ndh) {
            ndhVar = (defpackage.ndh) aolnVar;
            int i = ndhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ndhVar.c = i - Integer.MIN_VALUE;
            } else {
                ndhVar = new defpackage.ndh(this, aolnVar);
            }
        } else {
            ndhVar = new defpackage.ndh(this, aolnVar);
        }
        java.lang.Object obj = ndhVar.a;
        aosy aosyVar = aolu.a;
        int i2 = ndhVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aenjVar = ndhVar.e;
                instant = ndhVar.d;
                aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        j$.time.Instant instantNow = j$.time.Instant.now();
        aooh.e(instantNow, "instant(...)");
        aenjVar = new aenj("startBam");
        ndhVar.d = instantNow;
        ndhVar.e = aenjVar;
        ndhVar.c = 1;
        aosy aosyVarS = S(null, new defpackage.ndl(this, null, 1, null));
        if (aosyVarS == aosyVar) {
            return aosyVar;
        }
        instant = instantNow;
        obj = aosyVarS;
        defpackage.nbz nbzVar = new defpackage.nbz(instant, aenjVar, (aosy) obj);
        this.G.offer(nbzVar);
        aosy aosyVar2 = nbzVar.c;
        ndhVar.d = null;
        ndhVar.e = null;
        ndhVar.c = 2;
        if (aosyVar2.a(ndhVar) == aosyVar) {
            return aosyVar;
        }
        return aojh.a;
    }
}
