package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nhq {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/DobbySession");
    public final tpf A;
    private final aoin B;
    private final long C;
    private final wae D;
    private final nri E;
    private final defpackage.nbr F;
    private final defpackage.njd G;
    private final aoin H;
    private final defpackage.mfz I;
    private final qbe J;
    private final defpackage.maj K;
    private final zjm L;
    private final defpackage.heq M;
    private final afpl N;
    public final aolr b;
    public final aoss c;
    public final java.lang.String d;
    public final defpackage.nji e;
    public final defpackage.ihr f;
    public final defpackage.mzp g;
    public final defpackage.mqt h;
    public final defpackage.nrv i;
    public final defpackage.nqh j;
    public final defpackage.mba k;
    public final mvy l;
    public final defpackage.ntb m;
    public final aoin n;
    public final aoin o;
    public final aoin p;
    public final aoin q;
    public aoub r;
    public aoub s;
    public volatile aowi t;
    public j$.time.Instant u;
    public volatile defpackage.mzd v;
    public volatile defpackage.nje w;
    public final apdp x;
    public final defpackage.ogj y;
    public final aazc z;

    public nhq(aoin aoinVar, android.content.Context context, long j, aolr aolrVar, aolr aolrVar2, aoss aossVar, java.lang.String str, defpackage.nji njiVar, defpackage.ihr ihrVar, wae waeVar, defpackage.mzp mzpVar, zpm zpmVar, defpackage.heq heqVar, defpackage.ogj ogjVar, nri nriVar, defpackage.nbr nbrVar, defpackage.mqt mqtVar, defpackage.nrv nrvVar, defpackage.nqh nqhVar, defpackage.maj majVar, defpackage.mba mbaVar, afpl afplVar, mvy mvyVar, defpackage.ntb ntbVar, defpackage.njd njdVar, tpf tpfVar, aoin aoinVar2, aoin aoinVar3, aazc aazcVar, qbe qbeVar, zjm zjmVar, defpackage.mfz mfzVar, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6) {
        aooh.f(aoinVar, "useCoroutinesLaunch");
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "blockingContext");
        aooh.f(aolrVar2, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(str, "callIdString");
        aooh.f(njiVar, "dobbyCallAudioPreparer");
        aooh.f(ihrVar, "audioPrismSession");
        aooh.f(mzpVar, "callScopedAudioPrismConfigProvider");
        aooh.f(zpmVar, "callScopes");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nrvVar, "dobbySessionWriter");
        aooh.f(nqhVar, "dobbySpam");
        aooh.f(majVar, "dobbyStorageTranscriptsCreator");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(mvyVar, "dobbySingletonLocaleProvider");
        aooh.f(ntbVar, "dobbyTtsSessionProvider");
        aooh.f(njdVar, "dobbyUplinkAudioInjector");
        aooh.f(tpfVar, "dobbyUseCaseRunnerCoordinator");
        aooh.f(aoinVar2, "enableAgenticCallScreen");
        aooh.f(aoinVar3, "gacsLoraModelMaxVersion");
        aooh.f(aazcVar, "clock");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(aoinVar4, "enableUseDefaultTtsVoice");
        aooh.f(aoinVar5, "enableCslNewBotMessageCuiLogging");
        aooh.f(aoinVar6, "enableDobbyAudioWaveFileWriterCleanup");
        this.B = aoinVar;
        this.C = j;
        this.b = aolrVar2;
        this.c = aossVar;
        this.d = str;
        this.e = njiVar;
        this.f = ihrVar;
        this.D = waeVar;
        this.g = mzpVar;
        this.M = heqVar;
        this.y = ogjVar;
        this.E = nriVar;
        this.F = nbrVar;
        this.h = mqtVar;
        this.i = nrvVar;
        this.j = nqhVar;
        this.K = majVar;
        this.k = mbaVar;
        this.N = afplVar;
        this.l = mvyVar;
        this.m = ntbVar;
        this.G = njdVar;
        this.A = tpfVar;
        this.n = aoinVar2;
        this.H = aoinVar3;
        this.z = aazcVar;
        this.J = qbeVar;
        this.L = zjmVar;
        this.I = mfzVar;
        this.o = aoinVar4;
        this.p = aoinVar5;
        this.q = aoinVar6;
        this.x = new apdp();
        this.v = mni.T(defpackage.mzd.a.m()).m();
    }

    public final int a(java.util.List list) {
        int i = 0;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                defpackage.mzc mzcVar = (defpackage.mzc) it.next();
                int i2 = mzcVar.b;
                if (i2 == 3) {
                    if ((i2 == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c && (i = i + 1) < 0) {
                        ajsz.bg();
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final defpackage.nms b(defpackage.nje njeVar) throws aois {
        int iOrdinal = njeVar.ordinal();
        if (iOrdinal == 0) {
            return defpackage.nms.CASE_MANUAL_SCREENING;
        }
        if (iOrdinal == 1) {
            return defpackage.nms.CASE_AUTO_SCREENING;
        }
        if (iOrdinal == 2) {
            return defpackage.nms.CASE_BAM;
        }
        if (iOrdinal == 3) {
            return defpackage.nms.CASE_BEESLY;
        }
        if (iOrdinal == 4) {
            return defpackage.nms.CASE_CALL_SCREEN_LITE;
        }
        throw new aois();
    }

    public final java.lang.Object c(aoln aolnVar) {
        aoub aoubVar = this.s;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.s = null;
        aowi aowiVar = this.t;
        if (aowiVar != null) {
            aowiVar.e((java.lang.Throwable) null);
        }
        this.t = null;
        aoub aoubVar2 = this.r;
        if (aoubVar2 != null) {
            aoubVar2.s((java.util.concurrent.CancellationException) null);
        }
        this.r = null;
        this.v = mni.T(defpackage.mzd.a.m()).m();
        java.lang.Object objB = this.A.b(aolnVar);
        return objB != aolu.a ? aojh.a : objB;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0138  */
    /* JADX WARN: Code duplicated, block: B:35:0x0168  */
    /* JADX WARN: Code duplicated, block: B:37:0x017d  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) throws java.lang.Throwable {
        defpackage.nhb nhbVar;
        java.lang.String str;
        java.lang.String str2;
        defpackage.nrv nrvVar;
        defpackage.nsn nsnVar;
        java.lang.Object objA;
        defpackage.nsn nsnVar2;
        defpackage.nrv nrvVar2;
        defpackage.nsg nsgVar;
        defpackage.npw npwVarAw;
        java.lang.Object objA2;
        defpackage.nsg nsgVar2;
        defpackage.nsn nsnVar3;
        defpackage.nrv nrvVar3;
        defpackage.npw npwVar;
        defpackage.npw npwVar2;
        defpackage.nsm nsmVarT;
        java.lang.Object objAj;
        defpackage.nsg nsgVar3;
        defpackage.nsn nsnVar4;
        defpackage.nsm nsmVar;
        defpackage.aivr aivrVar;
        java.lang.Object objA3;
        defpackage.aivr aivrVar2;
        defpackage.nrv nrvVar4;
        defpackage.nsm nsmVar2;
        defpackage.nsn nsnVar5;
        defpackage.nsg nsgVar4;
        alat alatVar;
        if (aolnVar instanceof defpackage.nhb) {
            nhbVar = (defpackage.nhb) aolnVar;
            int i = nhbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhbVar.h = i - Integer.MIN_VALUE;
            } else {
                nhbVar = new defpackage.nhb(this, aolnVar);
            }
        } else {
            nhbVar = new defpackage.nhb(this, aolnVar);
        }
        defpackage.nhb nhbVar2 = nhbVar;
        java.lang.Object objB = nhbVar2.f;
        aolu aoluVar = aolu.a;
        switch (nhbVar2.h) {
            case 0:
                aooc.af(objB);
                a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "finalizeSessionWriterAndLogs", 653, "DobbySession.kt").v("finalizing session writer and logs");
                java.lang.String string = java.util.UUID.randomUUID().toString();
                aooh.e(string, "toString(...)");
                defpackage.mqt mqtVar = this.h;
                nhbVar2.a = string;
                nhbVar2.h = 1;
                if (mqtVar.q(string, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                str = string;
                nhbVar2.a = str;
                nhbVar2.h = 2;
                if (j(nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mqt mqtVar2 = this.h;
                nhbVar2.a = str;
                nhbVar2.h = 3;
                objB = mqtVar2.b(nhbVar2);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                nrvVar = this.i;
                defpackage.mse mseVar = (defpackage.mse) objB;
                akzx akzxVarM = defpackage.nsn.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(mseVar, "value");
                akzxVarM.u();
                defpackage.nsn nsnVar6 = (defpackage.nsn) akzxVarM.b;
                j$.util.Objects.requireNonNull(mseVar);
                nsnVar6.c = mseVar;
                nsnVar6.b |= 1;
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                nsnVar = (defpackage.nsn) aladVarP;
                defpackage.maj majVar = this.K;
                nhbVar2.a = str2;
                nhbVar2.b = nrvVar;
                nhbVar2.c = nsnVar;
                nhbVar2.h = 4;
                objA = majVar.a(nhbVar2);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                nsnVar2 = nsnVar;
                objB = objA;
                nrvVar2 = nrvVar;
                nsgVar = (defpackage.nsg) objB;
                npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(str2, "value");
                akzx akzxVar = (akzx) npwVarAw.a;
                akzxVar.u();
                defpackage.nsm nsmVar3 = (defpackage.nsm) akzxVar.b;
                j$.util.Objects.requireNonNull(str2);
                nsmVar3.b |= 2;
                nsmVar3.d = str2;
                if (this.D.a()) {
                    defpackage.ogj ogjVar = this.y;
                    nhbVar2.a = npwVarAw;
                    nhbVar2.b = npwVarAw;
                    nhbVar2.c = nrvVar2;
                    nhbVar2.d = nsnVar2;
                    nhbVar2.e = nsgVar;
                    nhbVar2.h = 5;
                    objA2 = ogjVar.a(nhbVar2);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nsn nsnVar7 = nsnVar2;
                    nsgVar2 = nsgVar;
                    objB = objA2;
                    nsnVar3 = nsnVar7;
                    nrvVar3 = nrvVar2;
                    npwVar = npwVarAw;
                    npwVar2 = npwVar;
                    boolean z = ((defpackage.nmu) objB).p;
                    akzx akzxVar2 = (akzx) npwVar.a;
                    akzxVar2.u();
                    defpackage.nsm nsmVar4 = (defpackage.nsm) akzxVar2.b;
                    defpackage.nsm nsmVar5 = defpackage.nsm.a;
                    nsmVar4.b |= 1024;
                    nsmVar4.m = z;
                    nsgVar = nsgVar2;
                    nsnVar2 = nsnVar3;
                    nrvVar2 = nrvVar3;
                    npwVarAw = npwVar2;
                }
                defpackage.mqt mqtVar3 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar3.a, new defpackage.lve(mqtVar3, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar2 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar2.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 1:
                str = (java.lang.String) nhbVar2.a;
                aooc.af(objB);
                nhbVar2.a = str;
                nhbVar2.h = 2;
                if (j(nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                defpackage.mqt mqtVar4 = this.h;
                nhbVar2.a = str;
                nhbVar2.h = 3;
                objB = mqtVar4.b(nhbVar2);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                nrvVar = this.i;
                defpackage.mse mseVar2 = (defpackage.mse) objB;
                akzx akzxVarM2 = defpackage.nsn.a.m();
                aooh.f(akzxVarM2, "builder");
                aooh.f(mseVar2, "value");
                akzxVarM2.u();
                defpackage.nsn nsnVar8 = (defpackage.nsn) akzxVarM2.b;
                j$.util.Objects.requireNonNull(mseVar2);
                nsnVar8.c = mseVar2;
                nsnVar8.b |= 1;
                alad aladVarP2 = akzxVarM2.p();
                aooh.e(aladVarP2, "build(...)");
                nsnVar = (defpackage.nsn) aladVarP2;
                defpackage.maj majVar2 = this.K;
                nhbVar2.a = str2;
                nhbVar2.b = nrvVar;
                nhbVar2.c = nsnVar;
                nhbVar2.h = 4;
                objA = majVar2.a(nhbVar2);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                nsnVar2 = nsnVar;
                objB = objA;
                nrvVar2 = nrvVar;
                nsgVar = (defpackage.nsg) objB;
                npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(str2, "value");
                akzx akzxVar3 = (akzx) npwVarAw.a;
                akzxVar3.u();
                defpackage.nsm nsmVar6 = (defpackage.nsm) akzxVar3.b;
                j$.util.Objects.requireNonNull(str2);
                nsmVar6.b |= 2;
                nsmVar6.d = str2;
                if (this.D.a()) {
                    defpackage.ogj ogjVar3 = this.y;
                    nhbVar2.a = npwVarAw;
                    nhbVar2.b = npwVarAw;
                    nhbVar2.c = nrvVar2;
                    nhbVar2.d = nsnVar2;
                    nhbVar2.e = nsgVar;
                    nhbVar2.h = 5;
                    objA2 = ogjVar3.a(nhbVar2);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nsn nsnVar9 = nsnVar2;
                    nsgVar2 = nsgVar;
                    objB = objA2;
                    nsnVar3 = nsnVar9;
                    nrvVar3 = nrvVar2;
                    npwVar = npwVarAw;
                    npwVar2 = npwVar;
                    boolean z2 = ((defpackage.nmu) objB).p;
                    akzx akzxVar4 = (akzx) npwVar.a;
                    akzxVar4.u();
                    defpackage.nsm nsmVar7 = (defpackage.nsm) akzxVar4.b;
                    defpackage.nsm nsmVar8 = defpackage.nsm.a;
                    nsmVar7.b |= 1024;
                    nsmVar7.m = z2;
                    nsgVar = nsgVar2;
                    nsnVar2 = nsnVar3;
                    nrvVar2 = nrvVar3;
                    npwVarAw = npwVar2;
                }
                defpackage.mqt mqtVar5 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar5.a, new defpackage.lve(mqtVar5, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar4 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar4.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 2:
                str = (java.lang.String) nhbVar2.a;
                aooc.af(objB);
                defpackage.mqt mqtVar6 = this.h;
                nhbVar2.a = str;
                nhbVar2.h = 3;
                objB = mqtVar6.b(nhbVar2);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                str2 = str;
                nrvVar = this.i;
                defpackage.mse mseVar3 = (defpackage.mse) objB;
                akzx akzxVarM3 = defpackage.nsn.a.m();
                aooh.f(akzxVarM3, "builder");
                aooh.f(mseVar3, "value");
                akzxVarM3.u();
                defpackage.nsn nsnVar10 = (defpackage.nsn) akzxVarM3.b;
                j$.util.Objects.requireNonNull(mseVar3);
                nsnVar10.c = mseVar3;
                nsnVar10.b |= 1;
                alad aladVarP3 = akzxVarM3.p();
                aooh.e(aladVarP3, "build(...)");
                nsnVar = (defpackage.nsn) aladVarP3;
                defpackage.maj majVar3 = this.K;
                nhbVar2.a = str2;
                nhbVar2.b = nrvVar;
                nhbVar2.c = nsnVar;
                nhbVar2.h = 4;
                objA = majVar3.a(nhbVar2);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                nsnVar2 = nsnVar;
                objB = objA;
                nrvVar2 = nrvVar;
                nsgVar = (defpackage.nsg) objB;
                npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(str2, "value");
                akzx akzxVar5 = (akzx) npwVarAw.a;
                akzxVar5.u();
                defpackage.nsm nsmVar9 = (defpackage.nsm) akzxVar5.b;
                j$.util.Objects.requireNonNull(str2);
                nsmVar9.b |= 2;
                nsmVar9.d = str2;
                if (this.D.a()) {
                    defpackage.ogj ogjVar5 = this.y;
                    nhbVar2.a = npwVarAw;
                    nhbVar2.b = npwVarAw;
                    nhbVar2.c = nrvVar2;
                    nhbVar2.d = nsnVar2;
                    nhbVar2.e = nsgVar;
                    nhbVar2.h = 5;
                    objA2 = ogjVar5.a(nhbVar2);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nsn nsnVar11 = nsnVar2;
                    nsgVar2 = nsgVar;
                    objB = objA2;
                    nsnVar3 = nsnVar11;
                    nrvVar3 = nrvVar2;
                    npwVar = npwVarAw;
                    npwVar2 = npwVar;
                    boolean z3 = ((defpackage.nmu) objB).p;
                    akzx akzxVar6 = (akzx) npwVar.a;
                    akzxVar6.u();
                    defpackage.nsm nsmVar10 = (defpackage.nsm) akzxVar6.b;
                    defpackage.nsm nsmVar11 = defpackage.nsm.a;
                    nsmVar10.b |= 1024;
                    nsmVar10.m = z3;
                    nsgVar = nsgVar2;
                    nsnVar2 = nsnVar3;
                    nrvVar2 = nrvVar3;
                    npwVarAw = npwVar2;
                }
                defpackage.mqt mqtVar7 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar7.a, new defpackage.lve(mqtVar7, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar6 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar6.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 3:
                str = (java.lang.String) nhbVar2.a;
                aooc.af(objB);
                str2 = str;
                nrvVar = this.i;
                defpackage.mse mseVar4 = (defpackage.mse) objB;
                akzx akzxVarM4 = defpackage.nsn.a.m();
                aooh.f(akzxVarM4, "builder");
                aooh.f(mseVar4, "value");
                akzxVarM4.u();
                defpackage.nsn nsnVar12 = (defpackage.nsn) akzxVarM4.b;
                j$.util.Objects.requireNonNull(mseVar4);
                nsnVar12.c = mseVar4;
                nsnVar12.b |= 1;
                alad aladVarP4 = akzxVarM4.p();
                aooh.e(aladVarP4, "build(...)");
                nsnVar = (defpackage.nsn) aladVarP4;
                defpackage.maj majVar4 = this.K;
                nhbVar2.a = str2;
                nhbVar2.b = nrvVar;
                nhbVar2.c = nsnVar;
                nhbVar2.h = 4;
                objA = majVar4.a(nhbVar2);
                if (objA != aoluVar) {
                    return aoluVar;
                }
                nsnVar2 = nsnVar;
                objB = objA;
                nrvVar2 = nrvVar;
                nsgVar = (defpackage.nsg) objB;
                npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(str2, "value");
                akzx akzxVar7 = (akzx) npwVarAw.a;
                akzxVar7.u();
                defpackage.nsm nsmVar12 = (defpackage.nsm) akzxVar7.b;
                j$.util.Objects.requireNonNull(str2);
                nsmVar12.b |= 2;
                nsmVar12.d = str2;
                if (this.D.a()) {
                    defpackage.ogj ogjVar7 = this.y;
                    nhbVar2.a = npwVarAw;
                    nhbVar2.b = npwVarAw;
                    nhbVar2.c = nrvVar2;
                    nhbVar2.d = nsnVar2;
                    nhbVar2.e = nsgVar;
                    nhbVar2.h = 5;
                    objA2 = ogjVar7.a(nhbVar2);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nsn nsnVar13 = nsnVar2;
                    nsgVar2 = nsgVar;
                    objB = objA2;
                    nsnVar3 = nsnVar13;
                    nrvVar3 = nrvVar2;
                    npwVar = npwVarAw;
                    npwVar2 = npwVar;
                    boolean z4 = ((defpackage.nmu) objB).p;
                    akzx akzxVar8 = (akzx) npwVar.a;
                    akzxVar8.u();
                    defpackage.nsm nsmVar13 = (defpackage.nsm) akzxVar8.b;
                    defpackage.nsm nsmVar14 = defpackage.nsm.a;
                    nsmVar13.b |= 1024;
                    nsmVar13.m = z4;
                    nsgVar = nsgVar2;
                    nsnVar2 = nsnVar3;
                    nrvVar2 = nrvVar3;
                    npwVarAw = npwVar2;
                }
                defpackage.mqt mqtVar8 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar8.a, new defpackage.lve(mqtVar8, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar8 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar8.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 4:
                nsnVar2 = (defpackage.nsn) nhbVar2.c;
                nrvVar2 = (defpackage.nrv) nhbVar2.b;
                str2 = (java.lang.String) nhbVar2.a;
                aooc.af(objB);
                nsgVar = (defpackage.nsg) objB;
                npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(str2, "value");
                akzx akzxVar9 = (akzx) npwVarAw.a;
                akzxVar9.u();
                defpackage.nsm nsmVar15 = (defpackage.nsm) akzxVar9.b;
                j$.util.Objects.requireNonNull(str2);
                nsmVar15.b |= 2;
                nsmVar15.d = str2;
                if (this.D.a()) {
                    defpackage.ogj ogjVar9 = this.y;
                    nhbVar2.a = npwVarAw;
                    nhbVar2.b = npwVarAw;
                    nhbVar2.c = nrvVar2;
                    nhbVar2.d = nsnVar2;
                    nhbVar2.e = nsgVar;
                    nhbVar2.h = 5;
                    objA2 = ogjVar9.a(nhbVar2);
                    if (objA2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.nsn nsnVar14 = nsnVar2;
                    nsgVar2 = nsgVar;
                    objB = objA2;
                    nsnVar3 = nsnVar14;
                    nrvVar3 = nrvVar2;
                    npwVar = npwVarAw;
                    npwVar2 = npwVar;
                    boolean z5 = ((defpackage.nmu) objB).p;
                    akzx akzxVar10 = (akzx) npwVar.a;
                    akzxVar10.u();
                    defpackage.nsm nsmVar16 = (defpackage.nsm) akzxVar10.b;
                    defpackage.nsm nsmVar17 = defpackage.nsm.a;
                    nsmVar16.b |= 1024;
                    nsmVar16.m = z5;
                    nsgVar = nsgVar2;
                    nsnVar2 = nsnVar3;
                    nrvVar2 = nrvVar3;
                    npwVarAw = npwVar2;
                }
                defpackage.mqt mqtVar9 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar9.a, new defpackage.lve(mqtVar9, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar10 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar10.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 5:
                nsgVar2 = (defpackage.nsg) nhbVar2.e;
                nsnVar3 = (defpackage.nsn) nhbVar2.d;
                nrvVar3 = (defpackage.nrv) nhbVar2.c;
                npwVar = (defpackage.npw) nhbVar2.b;
                npwVar2 = (defpackage.npw) nhbVar2.a;
                aooc.af(objB);
                boolean z6 = ((defpackage.nmu) objB).p;
                akzx akzxVar11 = (akzx) npwVar.a;
                akzxVar11.u();
                defpackage.nsm nsmVar18 = (defpackage.nsm) akzxVar11.b;
                defpackage.nsm nsmVar19 = defpackage.nsm.a;
                nsmVar18.b |= 1024;
                nsmVar18.m = z6;
                nsgVar = nsgVar2;
                nsnVar2 = nsnVar3;
                nrvVar2 = nrvVar3;
                npwVarAw = npwVar2;
                defpackage.mqt mqtVar10 = this.h;
                nsmVarT = npwVarAw.t();
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar2;
                nhbVar2.c = nsgVar;
                nhbVar2.d = nsmVarT;
                nhbVar2.e = null;
                nhbVar2.h = 6;
                objAj = aoov.aj(mqtVar10.a, new defpackage.lve(mqtVar10, (aoln) null, 18, (byte[]) null), nhbVar2);
                if (objAj != aoluVar) {
                    return aoluVar;
                }
                nsgVar3 = nsgVar;
                objB = objAj;
                nsnVar4 = nsnVar2;
                nsmVar = nsmVarT;
                defpackage.ogj ogjVar11 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar11.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 6:
                nsmVar = (defpackage.nsm) nhbVar2.d;
                nsgVar3 = (defpackage.nsg) nhbVar2.c;
                nsnVar4 = (defpackage.nsn) nhbVar2.b;
                nrvVar2 = (defpackage.nrv) nhbVar2.a;
                aooc.af(objB);
                defpackage.ogj ogjVar12 = this.y;
                aivrVar = (defpackage.aivr) objB;
                nhbVar2.a = nrvVar2;
                nhbVar2.b = nsnVar4;
                nhbVar2.c = nsgVar3;
                nhbVar2.d = nsmVar;
                nhbVar2.e = aivrVar;
                nhbVar2.h = 7;
                objA3 = ogjVar12.a(nhbVar2);
                if (objA3 == aoluVar) {
                    return aoluVar;
                }
                objB = objA3;
                aivrVar2 = aivrVar;
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 7:
                aivrVar2 = (defpackage.aivr) nhbVar2.e;
                nsmVar = (defpackage.nsm) nhbVar2.d;
                nsgVar3 = (defpackage.nsg) nhbVar2.c;
                nsnVar4 = (defpackage.nsn) nhbVar2.b;
                nrvVar2 = (defpackage.nrv) nhbVar2.a;
                aooc.af(objB);
                nrvVar4 = nrvVar2;
                nsmVar2 = nsmVar;
                nsnVar5 = nsnVar4;
                nsgVar4 = nsgVar3;
                alatVar = ((defpackage.nmu) objB).e;
                aooh.e(alatVar, "getDuplexRecordingsList(...)");
                nhbVar2.a = null;
                nhbVar2.b = null;
                nhbVar2.c = null;
                nhbVar2.d = null;
                nhbVar2.e = null;
                nhbVar2.h = 8;
                if (nrvVar4.b(nsnVar5, nsgVar4, nsmVar2, aivrVar2, alatVar, nhbVar2) == aoluVar) {
                    return aoluVar;
                }
                return aojh.a;
            case 8:
                aooc.af(objB);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.nhc nhcVar;
        if (aolnVar instanceof defpackage.nhc) {
            nhcVar = (defpackage.nhc) aolnVar;
            int i = nhcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhcVar.c = i - Integer.MIN_VALUE;
            } else {
                nhcVar = new defpackage.nhc(this, aolnVar);
            }
        } else {
            nhcVar = new defpackage.nhc(this, aolnVar);
        }
        java.lang.Object objD = nhcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhcVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.N.X();
            nhcVar.c = 1;
            objD = aosv.D(ajcqVarX, nhcVar);
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
        ajcq ajcqVarZ = ((defpackage.nha) aooc.ar(objD, defpackage.nha.class)).Z();
        nhcVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarZ, nhcVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.nhd nhdVar;
        defpackage.hkd hkdVar;
        if (aolnVar instanceof defpackage.nhd) {
            nhdVar = (defpackage.nhd) aolnVar;
            int i = nhdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhdVar.c = i - Integer.MIN_VALUE;
            } else {
                nhdVar = new defpackage.nhd(this, aolnVar);
            }
        } else {
            nhdVar = new defpackage.nhd(this, aolnVar);
        }
        java.lang.Object objD = nhdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhdVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            hkdVar = (defpackage.hkd) aooh.q((j$.util.Optional) objD);
            if (hkdVar != null) {
                return hkdVar.c;
            }
            return null;
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.N.X();
        nhdVar.c = 1;
        objD = aosv.D(ajcqVarX, nhdVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarR = ((defpackage.nha) aooc.ar(objD, defpackage.nha.class)).R();
        nhdVar.c = 2;
        objD = aosv.D(ajcqVarR, nhdVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        hkdVar = (defpackage.hkd) aooh.q((j$.util.Optional) objD);
        if (hkdVar != null) {
            return hkdVar.c;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.nhe nheVar;
        if (aolnVar instanceof defpackage.nhe) {
            nheVar = (defpackage.nhe) aolnVar;
            int i = nheVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nheVar.c = i - Integer.MIN_VALUE;
            } else {
                nheVar = new defpackage.nhe(this, aolnVar);
            }
        } else {
            nheVar = new defpackage.nhe(this, aolnVar);
        }
        java.lang.Object objD = nheVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nheVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.N.X();
            nheVar.c = 1;
            objD = aosv.D(ajcqVarX, nheVar);
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
        ajcq ajcqVarBO = ((defpackage.nha) aooc.ar(objD, defpackage.nha.class)).bO();
        nheVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarBO, nheVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.nje njeVar, aoln aolnVar) throws aois {
        defpackage.nhf nhfVar;
        defpackage.mok mokVar;
        akzx akzxVarM;
        int i;
        java.lang.Long l;
        java.lang.Object objG;
        if (aolnVar instanceof defpackage.nhf) {
            nhfVar = (defpackage.nhf) aolnVar;
            int i2 = nhfVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nhfVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nhfVar = new defpackage.nhf(this, aolnVar);
            }
        } else {
            nhfVar = new defpackage.nhf(this, aolnVar);
        }
        java.lang.Object obj = nhfVar.a;
        aolu aoluVar = aolu.a;
        int i3 = nhfVar.c;
        int i4 = 4;
        if (i3 == 0) {
            aooc.af(obj);
            int iOrdinal = njeVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                mokVar = ((java.lang.Boolean) this.n.a()).booleanValue() ? new defpackage.mok(3, (java.lang.Long) this.H.a()) : new defpackage.mok(2, null);
            } else if (iOrdinal == 2 || iOrdinal == 3) {
                mokVar = null;
            } else {
                if (iOrdinal != 4) {
                    throw new aois();
                }
                mokVar = new defpackage.mok(4, null);
            }
            if (mokVar != null) {
                defpackage.mqt mqtVar = this.h;
                nhfVar.d = mokVar;
                nhfVar.c = 1;
                if (mqtVar.e(mokVar, nhfVar) == aoluVar) {
                    return aoluVar;
                }
                defpackage.nrv nrvVar = this.i;
                nhfVar.d = null;
                nhfVar.c = 2;
                defpackage.npw npwVarAw = mni.aw(defpackage.nsm.a.m());
                aooh.f(mokVar, "<this>");
                akzxVarM = defpackage.mmx.a.m();
                aooh.f(akzxVarM, "builder");
                i = mokVar.b - 1;
                if (i != 1) {
                    i4 = 3;
                } else if (i != 2) {
                    i4 = 5;
                }
                akzxVarM.u();
                defpackage.mmx mmxVar = (defpackage.mmx) akzxVarM.b;
                mmxVar.c = a.Q(i4);
                mmxVar.b |= 1;
                l = mokVar.a;
                if (l != null) {
                    long jLongValue = l.longValue();
                    akzxVarM.u();
                    defpackage.mmx mmxVar2 = (defpackage.mmx) akzxVarM.b;
                    mmxVar2.b |= 2;
                    mmxVar2.d = jLongValue;
                }
                alad aladVarP = akzxVarM.p();
                aooh.e(aladVarP, "build(...)");
                defpackage.mmx mmxVar3 = (defpackage.mmx) aladVarP;
                aooh.f(mmxVar3, "value");
                akzx akzxVar = (akzx) npwVarAw.a;
                akzxVar.u();
                defpackage.nsm nsmVar = (defpackage.nsm) akzxVar.b;
                j$.util.Objects.requireNonNull(mmxVar3);
                nsmVar.p = mmxVar3;
                nsmVar.b |= 8192;
                objG = nrvVar.g(npwVarAw.t(), nhfVar);
                if (objG != aoluVar) {
                    objG = aojh.a;
                }
                if (objG == aoluVar) {
                    return aoluVar;
                }
            }
        } else if (i3 == 1) {
            mokVar = nhfVar.d;
            aooc.af(obj);
            defpackage.nrv nrvVar2 = this.i;
            nhfVar.d = null;
            nhfVar.c = 2;
            defpackage.npw npwVarAw2 = mni.aw(defpackage.nsm.a.m());
            aooh.f(mokVar, "<this>");
            akzxVarM = defpackage.mmx.a.m();
            aooh.f(akzxVarM, "builder");
            i = mokVar.b - 1;
            if (i != 1) {
                i4 = 3;
            } else if (i != 2) {
                i4 = 5;
            }
            akzxVarM.u();
            defpackage.mmx mmxVar4 = (defpackage.mmx) akzxVarM.b;
            mmxVar4.c = a.Q(i4);
            mmxVar4.b |= 1;
            l = mokVar.a;
            if (l != null) {
                long jLongValue2 = l.longValue();
                akzxVarM.u();
                defpackage.mmx mmxVar5 = (defpackage.mmx) akzxVarM.b;
                mmxVar5.b |= 2;
                mmxVar5.d = jLongValue2;
            }
            alad aladVarP2 = akzxVarM.p();
            aooh.e(aladVarP2, "build(...)");
            defpackage.mmx mmxVar6 = (defpackage.mmx) aladVarP2;
            aooh.f(mmxVar6, "value");
            akzx akzxVar2 = (akzx) npwVarAw2.a;
            akzxVar2.u();
            defpackage.nsm nsmVar2 = (defpackage.nsm) akzxVar2.b;
            j$.util.Objects.requireNonNull(mmxVar6);
            nsmVar2.p = mmxVar6;
            nsmVar2.b |= 8192;
            objG = nrvVar2.g(npwVarAw2.t(), nhfVar);
            if (objG != aoluVar) {
                objG = aojh.a;
            }
            if (objG == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(defpackage.nje njeVar, aoln aolnVar) {
        defpackage.nhg nhgVar;
        if (aolnVar instanceof defpackage.nhg) {
            nhgVar = (defpackage.nhg) aolnVar;
            int i = nhgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhgVar.c = i - Integer.MIN_VALUE;
            } else {
                nhgVar = new defpackage.nhg(this, aolnVar);
            }
        } else {
            nhgVar = new defpackage.nhg(this, aolnVar);
        }
        java.lang.Object obj = nhgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhgVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                njeVar = nhgVar.d;
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
        a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "logOnSessionStartSuccess", 396, "DobbySession.kt").v("AudioPrismSession started successfully");
        defpackage.mqt mqtVar = this.h;
        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_SESSION_STARTED;
        nhgVar.d = njeVar;
        nhgVar.c = 1;
        if (mqtVar.x(nvpVar, nhgVar) == aoluVar) {
            return aoluVar;
        }
        agsm.i(376, this.M.R(defpackage.oqt.DIALER_HATS_DOBBY_ACTIVATED), "failed to log Dobby Activated HaTS event", new java.lang.Object[0]);
        a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "logOnSessionStartSuccess", 403, "DobbySession.kt").v("Kick off Disclaimer after AudioPrismSession started successfully.");
        nhgVar.d = null;
        nhgVar.c = 2;
        if (h(njeVar, nhgVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.nhh nhhVar;
        j$.time.Instant instant;
        j$.time.Instant instant2;
        j$.time.Duration durationOfSeconds;
        j$.time.Instant instantNow;
        if (aolnVar instanceof defpackage.nhh) {
            nhhVar = (defpackage.nhh) aolnVar;
            int i = nhhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhhVar.c = i - Integer.MIN_VALUE;
            } else {
                nhhVar = new defpackage.nhh(this, aolnVar);
            }
        } else {
            nhhVar = new defpackage.nhh(this, aolnVar);
        }
        java.lang.Object objF = nhhVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhhVar.c;
        if (i2 == 0) {
            aooc.af(objF);
            j$.time.Instant instant3 = this.u;
            if (instant3 != null) {
                defpackage.ogj ogjVar = this.y;
                nhhVar.d = instant3;
                nhhVar.c = 1;
                java.lang.Object objA = ogjVar.a(nhhVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                instant = instant3;
                objF = objA;
            }
            return aojh.a;
        }
        if (i2 == 1) {
            instant = nhhVar.d;
            aooc.af(objF);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            instant2 = nhhVar.d;
            aooc.af(objF);
        }
        durationOfSeconds = j$.time.Duration.ofSeconds(((java.lang.Number) objF).longValue());
        if (durationOfSeconds != null) {
            instantNow = j$.time.Instant.now();
            aooh.e(instantNow, "instant(...)");
            if (defpackage.ajee.b(instantNow, instant2).compareTo(durationOfSeconds) > 0) {
                a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "maybeLogBeeslyDisclaimerPlaybackFailed", 688, "DobbySession.kt").v("Beesly disclaimer broken playback detected");
                this.J.a(qbc.oL);
            }
        }
        return aojh.a;
        defpackage.nmu nmuVar = (defpackage.nmu) objF;
        defpackage.nms nmsVarB = defpackage.nms.b(nmuVar.s);
        if (nmsVarB == null) {
            nmsVarB = defpackage.nms.UNRECOGNIZED;
        }
        if (nmsVarB == defpackage.nms.CASE_BEESLY && !nmuVar.v) {
            j$.util.Optional optionalG = this.L.g();
            aooh.e(optionalG, "getFeature(...)");
            defpackage.irl irlVar = (defpackage.irl) aooh.q(optionalG);
            if (irlVar != null) {
                nhhVar.d = instant;
                nhhVar.c = 2;
                objF = irlVar.d.f(nhhVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                instant2 = instant;
                durationOfSeconds = j$.time.Duration.ofSeconds(((java.lang.Number) objF).longValue());
                if (durationOfSeconds != null) {
                    instantNow = j$.time.Instant.now();
                    aooh.e(instantNow, "instant(...)");
                    if (defpackage.ajee.b(instantNow, instant2).compareTo(durationOfSeconds) > 0) {
                        a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "maybeLogBeeslyDisclaimerPlaybackFailed", 688, "DobbySession.kt").v("Beesly disclaimer broken playback detected");
                        this.J.a(qbc.oL);
                    }
                }
            }
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:32:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.njw njwVar, aoln aolnVar) throws aois {
        defpackage.nhi nhiVar;
        defpackage.njw njwVar2;
        defpackage.njw njwVar3;
        defpackage.njm njmVar;
        defpackage.njo njoVar;
        defpackage.njm njmVar2;
        defpackage.njn njnVar;
        if (aolnVar instanceof defpackage.nhi) {
            nhiVar = (defpackage.nhi) aolnVar;
            int i = nhiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhiVar.c = i - Integer.MIN_VALUE;
            } else {
                nhiVar = new defpackage.nhi(this, aolnVar);
            }
        } else {
            nhiVar = new defpackage.nhi(this, aolnVar);
        }
        java.lang.Object objAj = nhiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhiVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                njwVar = nhiVar.d;
                aooc.af(objAj);
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        njwVar3 = nhiVar.d;
                        aooc.af(objAj);
                        njmVar2 = (defpackage.njm) objAj;
                        if (njmVar2 != null) {
                            njnVar = new defpackage.njn(njwVar3.b);
                            nhiVar.d = null;
                            nhiVar.c = 5;
                            if (njmVar2.d(njnVar, nhiVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    } else if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                aooc.af(objAj);
            } else {
                njwVar2 = nhiVar.d;
                aooc.af(objAj);
                njmVar = (defpackage.njm) objAj;
                if (njmVar != null) {
                    njoVar = new defpackage.njo(njwVar2.b);
                    nhiVar.d = null;
                    nhiVar.c = 3;
                    if (njmVar.d(njoVar, nhiVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        aooc.af(objAj);
        defpackage.njd njdVar = this.G;
        java.lang.String str = njwVar.a;
        nhiVar.d = njwVar;
        nhiVar.c = 1;
        objAj = aoov.aj(njdVar.c, new defpackage.nix(str, njdVar, null), nhiVar);
        if (objAj == aoluVar) {
            return aoluVar;
        }
        switch ((defpackage.Cnew) objAj) {
            case PLAY_RECORDING_RESULT_UNKNOWN:
                return aojh.a;
            case PLAY_RECORDING_COMPLETED:
                a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "playSpeechAndAwait", 818, "DobbySession.kt").v("playback completed");
                tpf tpfVar = this.A;
                nhiVar.d = njwVar;
                nhiVar.c = 2;
                objAj = tpfVar.d(nhiVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                njwVar2 = njwVar;
                njmVar = (defpackage.njm) objAj;
                if (njmVar != null) {
                    njoVar = new defpackage.njo(njwVar2.b);
                    nhiVar.d = null;
                    nhiVar.c = 3;
                    if (njmVar.d(njoVar, nhiVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case PLAY_RECORDING_FAILED:
            case PLAY_RECORDING_NOT_STARTED:
            case PLAY_RECORDING_CANCELLED_UNDER_WRONG_STATES:
            case PLAY_RECORDING_CANCELLED_DUE_TO_AUDIO_PLAYING_ISSUES_DETECTED:
            case UNRECOGNIZED:
                tpf tpfVar2 = this.A;
                nhiVar.d = njwVar;
                nhiVar.c = 4;
                objAj = tpfVar2.d(nhiVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                njwVar3 = njwVar;
                njmVar2 = (defpackage.njm) objAj;
                if (njmVar2 != null) {
                    njnVar = new defpackage.njn(njwVar3.b);
                    nhiVar.d = null;
                    nhiVar.c = 5;
                    if (njmVar2.d(njnVar, nhiVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            default:
                throw new aois();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(aoln aolnVar) throws aois {
        defpackage.nhj nhjVar;
        defpackage.mzv mzvVar;
        alwq alwqVar;
        defpackage.mqt mqtVar;
        if (aolnVar instanceof defpackage.nhj) {
            nhjVar = (defpackage.nhj) aolnVar;
            int i = nhjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhjVar.c = i - Integer.MIN_VALUE;
            } else {
                nhjVar = new defpackage.nhj(this, aolnVar);
            }
        } else {
            nhjVar = new defpackage.nhj(this, aolnVar);
        }
        java.lang.Object objE = nhjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objE);
            } else if (i2 == 2) {
                mzvVar = nhjVar.d;
                aooc.af(objE);
                mqtVar = this.h;
                nhjVar.d = null;
                nhjVar.c = 3;
                if (mqtVar.l(mzvVar, nhjVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objE);
            }
            return aojh.a;
        }
        aooc.af(objE);
        nhjVar.c = 1;
        objE = e(nhjVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        mzvVar = (defpackage.mzv) objE;
        aooh.f(mzvVar, "<this>");
        switch (mzvVar) {
            case TYPE_UNSET:
                alwqVar = alwq.a;
                break;
            case TYPE_FAVORITE:
                alwqVar = alwq.b;
                break;
            case TYPE_LOCAL_CONTACT:
                alwqVar = alwq.c;
                break;
            case TYPE_WORK:
                alwqVar = alwq.d;
                break;
            case TYPE_BUSINESS:
                alwqVar = alwq.e;
                break;
            case TYPE_SPAM:
                alwqVar = alwq.f;
                break;
            case TYPE_UNKNOWN:
                alwqVar = alwq.g;
                break;
            case TYPE_HIDDEN_NUMBER:
                alwqVar = alwq.h;
                break;
            case UNRECOGNIZED:
                throw new java.lang.IllegalArgumentException("unrecognized dobby caller type");
            default:
                throw new aois();
        }
        ajyi ajyiVarI = ahus.I(alro.a.m());
        apdi apdiVar = alwr.d;
        aooh.e(apdiVar, "callerTypeInboundEvent");
        akzx akzxVarM = alwr.a.m();
        aooh.f(akzxVarM, "builder");
        akzxVarM.u();
        alwr alwrVar = akzxVarM.b;
        alwrVar.c = alwqVar.i;
        alwrVar.b |= 1;
        alwr alwrVarP = akzxVarM.p();
        aooh.e(alwrVarP, "build(...)");
        ajyiVarI.be(apdiVar, alwrVarP);
        alro alroVarBa = ajyiVarI.ba();
        defpackage.nbr nbrVar = this.F;
        nhjVar.d = mzvVar;
        nhjVar.c = 2;
        if (nbrVar.a(alroVarBa, nhjVar) == aoluVar) {
            return aoluVar;
        }
        mqtVar = this.h;
        nhjVar.d = null;
        nhjVar.c = 3;
        if (mqtVar.l(mzvVar, nhjVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(aoln aolnVar) {
        defpackage.nhk nhkVar;
        if (aolnVar instanceof defpackage.nhk) {
            nhkVar = (defpackage.nhk) aolnVar;
            int i = nhkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhkVar.c = i - Integer.MIN_VALUE;
            } else {
                nhkVar = new defpackage.nhk(this, aolnVar);
            }
        } else {
            nhkVar = new defpackage.nhk(this, aolnVar);
        }
        java.lang.Object obj = nhkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = altb.b;
            aooh.e(apdiVar, "startConversationEvent");
            akzx akzxVarM = altb.a.m();
            aooh.f(akzxVarM, "builder");
            altb altbVarP = akzxVarM.p();
            aooh.e(altbVarP, "build(...)");
            ajyiVarI.be(apdiVar, altbVarP);
            alro alroVarBa = ajyiVarI.ba();
            defpackage.nbr nbrVar = this.F;
            nhkVar.c = 1;
            if (nbrVar.a(alroVarBa, nhkVar) == aoluVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [ahoq] */
    public final java.lang.Object n(defpackage.nje njeVar, aoln aolnVar) {
        defpackage.nhl nhlVar;
        ?? Z;
        java.lang.Throwable th;
        ?? r8;
        if (aolnVar instanceof defpackage.nhl) {
            nhlVar = (defpackage.nhl) aolnVar;
            int i = nhlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhlVar.c = i - Integer.MIN_VALUE;
            } else {
                nhlVar = new defpackage.nhl(this, aolnVar);
            }
        } else {
            nhlVar = new defpackage.nhl(this, aolnVar);
        }
        java.lang.Object obj = nhlVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = nhlVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                if (!ahvr.R(nhlVar.u())) {
                    throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
                }
                Z = ahvr.Z(377, "DobbySession_start");
                try {
                    defpackage.mfz mfzVar = this.I;
                    gus.aw("Start");
                    mfzVar.c();
                    try {
                        nhlVar.d = Z;
                        nhlVar.c = 1;
                        java.lang.Object objAj = aoov.aj(this.b, new defpackage.nhm(njeVar, this, null), nhlVar);
                        if (objAj != bool) {
                            obj = objAj;
                            r8 = Z;
                        }
                        return bool;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        defpackage.mfz mfzVar2 = this.I;
                        gus.aw("Start");
                        mfzVar2.c();
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    try {
                        throw th;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak((java.io.Closeable) Z, th);
                        throw th4;
                    }
                }
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ahoq ahoqVar = nhlVar.d;
            try {
                aooc.af(obj);
                r8 = ahoqVar;
            } catch (java.lang.Throwable th5) {
                th = th5;
                defpackage.mfz mfzVar3 = this.I;
                gus.aw("Start");
                mfzVar3.c();
                throw th;
            }
            bool = (java.lang.Boolean) obj;
            bool.booleanValue();
            defpackage.mfz mfzVar4 = this.I;
            gus.aw("Start");
            mfzVar4.c();
            ajsz.ak((java.io.Closeable) r8, (java.lang.Throwable) null);
            return bool;
        } catch (java.lang.Throwable th6) {
            th = th6;
            Z = njeVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.nhn nhnVar;
        if (aolnVar instanceof defpackage.nhn) {
            nhnVar = (defpackage.nhn) aolnVar;
            int i = nhnVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhnVar.c = i - Integer.MIN_VALUE;
            } else {
                nhnVar = new defpackage.nhn(this, aolnVar);
            }
        } else {
            nhnVar = new defpackage.nhn(this, aolnVar);
        }
        java.lang.Object obj = nhnVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nhnVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.mfz mfzVar = this.I;
                gus.aw("Stop");
                mfzVar.c();
                nhnVar.c = 1;
                java.lang.Object objAj = aoov.aj(this.b, new defpackage.nho(this, null), nhnVar);
                if (objAj != aoluVar) {
                    objAj = aojh.a;
                }
                if (objAj == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            defpackage.mfz mfzVar2 = this.I;
            gus.aw("Stop");
            mfzVar2.c();
            return aojh.a;
        } catch (java.lang.Throwable th) {
            defpackage.mfz mfzVar3 = this.I;
            gus.aw("Stop");
            mfzVar3.c();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(aoln aolnVar) {
        defpackage.nhp nhpVar;
        nri nriVar;
        long j;
        defpackage.npw npwVarAw;
        java.lang.Object objG;
        defpackage.npw npwVar;
        defpackage.npw npwVar2;
        nri nriVar2;
        long j2;
        defpackage.npw npwVar3;
        defpackage.npw npwVar4;
        java.lang.String str;
        defpackage.nsm nsmVarT;
        if (aolnVar instanceof defpackage.nhp) {
            nhpVar = (defpackage.nhp) aolnVar;
            int i = nhpVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nhpVar.e = i - Integer.MIN_VALUE;
            } else {
                nhpVar = new defpackage.nhp(this, aolnVar);
            }
        } else {
            nhpVar = new defpackage.nhp(this, aolnVar);
        }
        java.lang.Object obj = nhpVar.c;
        aolu aoluVar = aolu.a;
        int i2 = nhpVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                j = nhpVar.b;
                nri nriVar3 = nhpVar.f;
                defpackage.npw npwVar5 = (defpackage.npw) nhpVar.a;
                defpackage.npw npwVar6 = nhpVar.h;
                npwVar2 = nhpVar.g;
                aooc.af(obj);
                objG = obj;
                nriVar = nriVar3;
                npwVar = npwVar5;
                npwVarAw = npwVar6;
            } else if (i2 == 2) {
                j2 = nhpVar.b;
                nriVar2 = (nri) nhpVar.a;
                npwVar3 = nhpVar.h;
                npwVar4 = nhpVar.g;
                aooc.af(obj);
                str = (java.lang.String) obj;
                if (str != null) {
                    akzx akzxVar = (akzx) npwVar3.a;
                    akzxVar.u();
                    defpackage.nsm nsmVar = (defpackage.nsm) akzxVar.b;
                    defpackage.nsm nsmVar2 = defpackage.nsm.a;
                    j$.util.Objects.requireNonNull(str);
                    nsmVar.b |= 256;
                    nsmVar.k = str;
                }
                nsmVarT = npwVar4.t();
                nhpVar.g = null;
                nhpVar.h = null;
                nhpVar.a = null;
                nhpVar.e = 3;
                if (nriVar2.k(j2, nsmVarT, nhpVar) == aoluVar) {
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
        nriVar = this.E;
        j = this.C;
        npwVarAw = mni.aw(defpackage.nsm.a.m());
        npwVarAw.w(true);
        nhpVar.g = npwVarAw;
        nhpVar.h = npwVarAw;
        nhpVar.a = npwVarAw;
        nhpVar.f = nriVar;
        nhpVar.b = j;
        nhpVar.e = 1;
        objG = g(nhpVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        npwVar = npwVarAw;
        npwVar2 = npwVar;
        java.lang.String str2 = (java.lang.String) objG;
        aooh.f(str2, "value");
        akzx akzxVar2 = (akzx) npwVar.a;
        akzxVar2.u();
        defpackage.nsm nsmVar3 = (defpackage.nsm) akzxVar2.b;
        defpackage.nsm nsmVar4 = defpackage.nsm.a;
        j$.util.Objects.requireNonNull(str2);
        nsmVar3.b |= 8;
        nsmVar3.f = str2;
        akzx akzxVar3 = (akzx) npwVarAw.a;
        akzxVar3.u();
        defpackage.nsm nsmVar5 = (defpackage.nsm) akzxVar3.b;
        nsmVar5.b |= 16;
        nsmVar5.g = true;
        nhpVar.g = npwVar2;
        nhpVar.h = npwVarAw;
        nhpVar.a = nriVar;
        nhpVar.f = null;
        nhpVar.b = j;
        nhpVar.e = 2;
        java.lang.Object objF = f(nhpVar);
        if (objF == aoluVar) {
            return aoluVar;
        }
        nri nriVar4 = nriVar;
        obj = objF;
        nriVar2 = nriVar4;
        j2 = j;
        npwVar3 = npwVarAw;
        npwVar4 = npwVar2;
        str = (java.lang.String) obj;
        if (str != null) {
            akzx akzxVar4 = (akzx) npwVar3.a;
            akzxVar4.u();
            defpackage.nsm nsmVar6 = (defpackage.nsm) akzxVar4.b;
            defpackage.nsm nsmVar7 = defpackage.nsm.a;
            j$.util.Objects.requireNonNull(str);
            nsmVar6.b |= 256;
            nsmVar6.k = str;
        }
        nsmVarT = npwVar4.t();
        nhpVar.g = null;
        nhpVar.h = null;
        nhpVar.a = null;
        nhpVar.e = 3;
        if (nriVar2.k(j2, nsmVarT, nhpVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final aoub q(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.B.a()).booleanValue()) {
            return aoov.an(aossVar, (aolr) null, 0, new defpackage.nuh(aonnVar, (aoln) null, 1), 3);
        }
        aimz aimzVar = zih.a;
        return aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, aonnVar, 20, (short[][]) null));
    }

    public final void r() {
        a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "relayAnswerClicked", 551, "DobbySession.kt").v("relayAnswerClicked");
        aoov.an(this.c, (aolr) null, 0, new defpackage.ndu(this, (aoln) null, 14), 3);
    }

    public final void s() {
        a.b().l("com/android/dialer/dobby/impl/service/DobbySession", "relayDeclineClicked", 556, "DobbySession.kt").v("relayDeclineClicked");
        aoov.an(this.c, (aolr) null, 0, new defpackage.ndu(this, (aoln) null, 15, (byte[]) null), 3);
    }
}
