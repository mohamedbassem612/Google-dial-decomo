package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class inu implements defpackage.ihr {
    public static final aimz a = aimz.i("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl");
    public static final long b;
    public final aoss c;
    public final aoin d;
    public final defpackage.mfz e;
    public final defpackage.ijt f;
    public final defpackage.ijq g;
    public final defpackage.ijb h;
    public final aoin i;
    public final j$.util.concurrent.ConcurrentHashMap j;
    public final j$.util.concurrent.ConcurrentHashMap k;
    public final java.util.Map l;
    public final qbe m;
    public final defpackage.iif n;
    public final defpackage.ijf o;
    public final zzx p;
    private final ajcu q;
    private final ruc r;
    private final defpackage.iix s;
    private final defpackage.iin t;
    private final defpackage.ikj u;
    private final ahda v;

    static {
        long j = aorh.a;
        b = aooh.A(20, aorj.d);
    }

    public inu(ajcu ajcuVar, aoss aossVar, ruc rucVar, aoin aoinVar, defpackage.iif iifVar, defpackage.iin iinVar, defpackage.ikj ikjVar, defpackage.iix iixVar, defpackage.ijf ijfVar, defpackage.mfz mfzVar, qbe qbeVar, defpackage.ijt ijtVar, defpackage.ijq ijqVar, defpackage.ijb ijbVar, zzx zzxVar, aoin aoinVar2) {
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rucVar, "metrics");
        aooh.f(aoinVar, "enableCallAudioStartsBeforeModel");
        aooh.f(iifVar, "audioStateConfigApplier");
        aooh.f(iinVar, "callAudioReader");
        aooh.f(ikjVar, "compositeModelRunner");
        aooh.f(iixVar, "preconditions");
        aooh.f(ijfVar, "duolinksAvailability");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(ijtVar, "audioPrismInCallLogger");
        aooh.f(ijqVar, "audioPrismRunningFeatures");
        aooh.f(aoinVar2, "enableDeviceThermalThreshold");
        this.q = ajcuVar;
        this.c = aossVar;
        this.r = rucVar;
        this.d = aoinVar;
        this.n = iifVar;
        this.t = iinVar;
        this.u = ikjVar;
        this.s = iixVar;
        this.o = ijfVar;
        this.e = mfzVar;
        this.m = qbeVar;
        this.f = ijtVar;
        this.g = ijqVar;
        this.h = ijbVar;
        this.p = zzxVar;
        this.i = aoinVar2;
        this.v = new ahda();
        this.j = new j$.util.concurrent.ConcurrentHashMap();
        this.k = new j$.util.concurrent.ConcurrentHashMap();
        this.l = new java.util.LinkedHashMap();
    }

    @Override // defpackage.ihr
    public final java.lang.Object a(igf igfVar, aoln aolnVar) {
        return f(ruc.bK, new defpackage.bhp(this, igfVar, (aoln) null, 8), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ihr
    public final java.lang.Object b(igf igfVar, aoln aolnVar) {
        defpackage.inl inlVar;
        if (aolnVar instanceof defpackage.inl) {
            inlVar = (defpackage.inl) aolnVar;
            int i = inlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                inlVar.c = i - Integer.MIN_VALUE;
            } else {
                inlVar = new defpackage.inl(this, aolnVar);
            }
        } else {
            inlVar = new defpackage.inl(this, aolnVar);
        }
        java.lang.Object objD = inlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = inlVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarH = this.v.h(new defpackage.ibi(this, igfVar, 5, null), this.q);
            aooh.e(ajcqVarH, "submitAsync(...)");
            inlVar.c = 1;
            objD = aosv.D(ajcqVarH, inlVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        defpackage.ihq ihqVar = (defpackage.ihq) objD;
        aooh.c(ihqVar);
        return ihqVar;
    }

    @Override // defpackage.ihr
    public final java.lang.Object c(igf igfVar, aoln aolnVar) {
        return f(ruc.bI, new defpackage.inq(this, igfVar, (aoln) null, 1), aolnVar);
    }

    @Override // defpackage.ihr
    public final java.lang.Object d(ifv ifvVar, aoln aolnVar) {
        return f(ruc.bJ, new defpackage.inq(this, ifvVar, (aoln) null, 0), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b8 A[LOOP:0: B:27:0x00b2->B:29:0x00b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(igf igfVar, aoln aolnVar) {
        defpackage.inh inhVar;
        defpackage.heq heqVar;
        defpackage.heq heqVar2;
        alct alctVar;
        defpackage.igi igiVar;
        alak alakVar;
        java.util.Iterator it;
        if (aolnVar instanceof defpackage.inh) {
            inhVar = (defpackage.inh) aolnVar;
            int i = inhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                inhVar.d = i - Integer.MIN_VALUE;
            } else {
                inhVar = new defpackage.inh(this, aolnVar);
            }
        } else {
            inhVar = new defpackage.inh(this, aolnVar);
        }
        java.lang.Object objA = inhVar.b;
        aolu aoluVar = aolu.a;
        int i2 = inhVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                igfVar = (igf) inhVar.a;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                alctVar = inhVar.e;
                heqVar = inhVar.f;
                heqVar2 = (defpackage.heq) inhVar.a;
                aooc.af(objA);
            }
            java.lang.Iterable iterable = (java.lang.Iterable) objA;
            aooh.f(alctVar, "<this>");
            aooh.f(iterable, "values");
            akzx akzxVar = (akzx) heqVar.a;
            akzxVar.u();
            igiVar = (defpackage.igi) akzxVar.b;
            alal alalVar = defpackage.igi.a;
            alakVar = igiVar.f;
            if (!alakVar.c()) {
                igiVar.f = alad.H(alakVar);
            }
            it = iterable.iterator();
            while (it.hasNext()) {
                igiVar.f.g(((ifv) it.next()).a());
            }
            return heqVar2.t();
        }
        aooc.af(objA);
        defpackage.iix iixVar = this.s;
        inhVar.a = igfVar;
        inhVar.d = 1;
        objA = iixVar.a(igfVar, inhVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        defpackage.igi igiVar2 = (defpackage.igi) objA;
        if (!igiVar2.d) {
            return igiVar2;
        }
        defpackage.heq heqVarA = defpackage.hhe.A(igiVar2.p());
        alct alctVar2 = new alct(new alam(((defpackage.igi) ((akzx) heqVarA.a).b).f, defpackage.igi.a));
        inhVar.a = heqVarA;
        inhVar.f = heqVarA;
        inhVar.e = alctVar2;
        inhVar.d = 2;
        java.lang.Object objG = g(igfVar, inhVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        heqVar = heqVarA;
        heqVar2 = heqVar;
        objA = objG;
        alctVar = alctVar2;
        java.lang.Iterable iterable2 = (java.lang.Iterable) objA;
        aooh.f(alctVar, "<this>");
        aooh.f(iterable2, "values");
        akzx akzxVar2 = (akzx) heqVar.a;
        akzxVar2.u();
        igiVar = (defpackage.igi) akzxVar2.b;
        alal alalVar2 = defpackage.igi.a;
        alakVar = igiVar.f;
        if (!alakVar.c()) {
            igiVar.f = alad.H(alakVar);
        }
        it = iterable2.iterator();
        while (it.hasNext()) {
            igiVar.f.g(((ifv) it.next()).a());
        }
        return heqVar2.t();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aenj aenjVar, aonj aonjVar, aoln aolnVar) {
        defpackage.ini iniVar;
        aenj aenjVar2;
        aeun aeunVar;
        if (aolnVar instanceof defpackage.ini) {
            iniVar = (defpackage.ini) aolnVar;
            int i = iniVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iniVar.c = i - Integer.MIN_VALUE;
            } else {
                iniVar = new defpackage.ini(this, aolnVar);
            }
        } else {
            iniVar = new defpackage.ini(this, aolnVar);
        }
        java.lang.Object obj = iniVar.a;
        aolu aoluVar = aolu.a;
        int i2 = iniVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalA = this.r.a();
            aooh.e(optionalA, "startLocalTimer(...)");
            aeun aeunVar2 = (aeun) aooh.q(optionalA);
            ajcq ajcqVarH = this.v.h(new defpackage.ibi(this, aonjVar, 6), this.q);
            aooh.e(ajcqVarH, "submitAsync(...)");
            iniVar.d = aenjVar;
            iniVar.e = aeunVar2;
            iniVar.c = 1;
            java.lang.Object objD = aosv.D(ajcqVarH, iniVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
            aenjVar2 = aenjVar;
            aeunVar = aeunVar2;
            obj = objD;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aeunVar = iniVar.e;
            aenjVar2 = iniVar.d;
            aooc.af(obj);
        }
        if (aeunVar != null) {
            this.r.p(aeunVar, aenjVar2);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(igf igfVar, aoln aolnVar) {
        defpackage.inj injVar;
        java.lang.Iterable iterable;
        if (aolnVar instanceof defpackage.inj) {
            injVar = (defpackage.inj) aolnVar;
            int i = injVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                injVar.d = i - Integer.MIN_VALUE;
            } else {
                injVar = new defpackage.inj(this, aolnVar);
            }
        } else {
            injVar = new defpackage.inj(this, aolnVar);
        }
        java.lang.Object objCf = injVar.b;
        java.lang.Object obj = aolu.a;
        int i2 = injVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                igfVar = (igf) injVar.a;
                aooc.af(objCf);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iterable = (java.lang.Iterable) injVar.a;
                aooc.af(objCf);
            }
            return ajsz.cg(iterable, (java.lang.Iterable) objCf);
        }
        aooc.af(objCf);
        injVar.a = igfVar;
        injVar.d = 1;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.k;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            if (!defpackage.hgu.j(igfVar, (igf) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        objCf = ajsz.cf(linkedHashMap.keySet());
        if (objCf == obj) {
            return obj;
        }
        java.lang.Iterable iterable2 = (java.lang.Iterable) objCf;
        injVar.a = iterable2;
        injVar.d = 2;
        java.util.Map map = this.l;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : map.entrySet()) {
            if (!defpackage.hgu.j(igfVar, (igf) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.lang.Object objCf2 = ajsz.cf(linkedHashMap2.keySet());
        if (objCf2 == obj) {
            return obj;
        }
        objCf = objCf2;
        iterable = iterable2;
        return ajsz.cg(iterable, (java.lang.Iterable) objCf);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(igf igfVar, aoln aolnVar) {
        defpackage.ink inkVar;
        igf igfVar2;
        ifv ifvVarB;
        ifv ifvVarB2;
        aoub aoubVar;
        ifv ifvVarB3;
        if (aolnVar instanceof defpackage.ink) {
            inkVar = (defpackage.ink) aolnVar;
            int i = inkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                inkVar.c = i - Integer.MIN_VALUE;
            } else {
                inkVar = new defpackage.ink(this, aolnVar);
            }
        } else {
            inkVar = new defpackage.ink(this, aolnVar);
        }
        java.lang.Object objA = inkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = inkVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                igfVar = inkVar.d;
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                igfVar = inkVar.d;
                aooc.af(objA);
            }
            igfVar2 = igfVar;
            if (!((java.util.Collection) objA).isEmpty()) {
                defpackage.jhw jhwVarD = defpackage.hmr.d(defpackage.ihq.a.m());
                jhwVarD.i(false);
                jhwVarD.h(defpackage.ihp.FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION);
                return jhwVarD.g();
            }
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.k;
            ifvVarB = ifv.b(igfVar2.c);
            if (ifvVarB == null) {
                ifvVarB = ifv.j;
            }
            concurrentHashMap.put(ifvVarB, igfVar2);
            j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.j;
            ifvVarB2 = ifv.b(igfVar2.c);
            if (ifvVarB2 == null) {
                ifvVarB2 = ifv.j;
            }
            aoubVar = (aoub) concurrentHashMap2.remove(ifvVarB2);
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            aoub aoubVarAn = aoov.an(this.c, (aolr) null, 0, new defpackage.iiw(this, igfVar2, (aoln) null, 8), 3);
            ifvVarB3 = ifv.b(igfVar2.c);
            if (ifvVarB3 == null) {
                ifvVarB3 = ifv.j;
            }
            concurrentHashMap2.put(ifvVarB3, aoubVarAn);
            aoubVarAn.p(new afx(this, igfVar2, aoubVarAn, 19, (short[]) null));
            defpackage.jhw jhwVarD2 = defpackage.hmr.d(defpackage.ihq.a.m());
            jhwVarD2.i(true);
            return jhwVarD2.g();
        }
        aooc.af(objA);
        defpackage.ijq ijqVar = this.g;
        inkVar.d = igfVar;
        inkVar.c = 1;
        objA = ijqVar.a(inkVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        java.util.Set setKeySet = ((java.util.Map) objA).keySet();
        ifv ifvVarB4 = ifv.b(igfVar.c);
        if (ifvVarB4 == null) {
            ifvVarB4 = ifv.j;
        }
        if (setKeySet.contains(ifvVarB4)) {
            aimw aimwVarL = a.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "reserveInternal", 232, "AudioPrismSessionImpl.kt");
            ifv ifvVarB5 = ifv.b(igfVar.c);
            if (ifvVarB5 == null) {
                ifvVarB5 = ifv.j;
            }
            aimwVarL.y("Feature %s already running", ifvVarB5.name());
            defpackage.jhw jhwVarD3 = defpackage.hmr.d(defpackage.ihq.a.m());
            jhwVarD3.i(false);
            jhwVarD3.h(defpackage.ihp.FAILURE_REQUESTED_FEATURE_ALREADY_IN_SESSION);
            return jhwVarD3.g();
        }
        inkVar.d = igfVar;
        inkVar.c = 2;
        objA = g(igfVar, inkVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        igfVar2 = igfVar;
        if (!((java.util.Collection) objA).isEmpty()) {
            defpackage.jhw jhwVarD4 = defpackage.hmr.d(defpackage.ihq.a.m());
            jhwVarD4.i(false);
            jhwVarD4.h(defpackage.ihp.FAILURE_INCOMPATIBLE_CLIENT_IN_SESSION);
            return jhwVarD4.g();
        }
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap3 = this.k;
        ifvVarB = ifv.b(igfVar2.c);
        if (ifvVarB == null) {
            ifvVarB = ifv.j;
        }
        concurrentHashMap3.put(ifvVarB, igfVar2);
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap4 = this.j;
        ifvVarB2 = ifv.b(igfVar2.c);
        if (ifvVarB2 == null) {
            ifvVarB2 = ifv.j;
        }
        aoubVar = (aoub) concurrentHashMap4.remove(ifvVarB2);
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        aoub aoubVarAn2 = aoov.an(this.c, (aolr) null, 0, new defpackage.iiw(this, igfVar2, (aoln) null, 8), 3);
        ifvVarB3 = ifv.b(igfVar2.c);
        if (ifvVarB3 == null) {
            ifvVarB3 = ifv.j;
        }
        concurrentHashMap4.put(ifvVarB3, aoubVarAn2);
        aoubVarAn2.p(new afx(this, igfVar2, aoubVarAn2, 19, (short[]) null));
        defpackage.jhw jhwVarD5 = defpackage.hmr.d(defpackage.ihq.a.m());
        jhwVarD5.i(true);
        return jhwVarD5.g();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(ifv ifvVar, aoln aolnVar) {
        defpackage.inr inrVar;
        java.lang.Object objA;
        if (aolnVar instanceof defpackage.inr) {
            inrVar = (defpackage.inr) aolnVar;
            int i = inrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                inrVar.c = i - Integer.MIN_VALUE;
            } else {
                inrVar = new defpackage.inr(this, aolnVar);
            }
        } else {
            inrVar = new defpackage.inr(this, aolnVar);
        }
        java.lang.Object obj = inrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = inrVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ifvVar = inrVar.d;
                aooc.af(obj);
            } else if (i2 == 2) {
                ifvVar = inrVar.d;
                aooc.af(obj);
                ifv ifvVar2 = ifvVar;
                defpackage.iin iinVar = this.t;
                inrVar.d = null;
                inrVar.c = 3;
                objA = ahvr.ag(iinVar.c, iinVar.j, new huk(iinVar, ifvVar2, (aoln) null, 14, (byte[]) null)).a(inrVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
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
        a.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopAndRestoreAllComponents", 575, "AudioPrismSessionImpl.kt").v("stopping and restoring all components");
        defpackage.iif iifVar = this.n;
        inrVar.d = ifvVar;
        inrVar.c = 1;
        if (iifVar.c(inrVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.ikj ikjVar = this.u;
        inrVar.d = ifvVar;
        inrVar.c = 2;
        if (ikjVar.b(ifvVar, inrVar) == aoluVar) {
            return aoluVar;
        }
        ifv ifvVar3 = ifvVar;
        defpackage.iin iinVar2 = this.t;
        inrVar.d = null;
        inrVar.c = 3;
        objA = ahvr.ag(iinVar2.c, iinVar2.j, new huk(iinVar2, ifvVar3, (aoln) null, 14, (byte[]) null)).a(inrVar);
        if (objA != aoluVar) {
            objA = aojh.a;
        }
        if (objA == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(ifv ifvVar, aoln aolnVar) {
        defpackage.ins insVar;
        defpackage.ijq ijqVar;
        if (aolnVar instanceof defpackage.ins) {
            insVar = (defpackage.ins) aolnVar;
            int i = insVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                insVar.c = i - Integer.MIN_VALUE;
            } else {
                insVar = new defpackage.ins(this, aolnVar);
            }
        } else {
            insVar = new defpackage.ins(this, aolnVar);
        }
        java.lang.Object obj = insVar.a;
        aolu aoluVar = aolu.a;
        int i2 = insVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                ifvVar = insVar.d;
                aooc.af(obj);
            } else if (i2 == 2) {
                ifvVar = insVar.d;
                aooc.af(obj);
                a.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopInternal", 535, "AudioPrismSessionImpl.kt").y("stopped for %s", ifvVar.name());
                this.l.remove(ifvVar);
                ijqVar = this.g;
                insVar.d = null;
                insVar.c = 3;
                if (ijqVar.c(ifvVar, insVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            defpackage.ni niVarM = defpackage.hmr.m(defpackage.ihw.a.m());
            niVarM.V(true);
            return niVarM.U();
        }
        aooc.af(obj);
        java.lang.Object objRemove = this.k.remove(ifvVar);
        aimz aimzVar = a;
        if (objRemove != null) {
            aimzVar.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopInternal", 517, "AudioPrismSessionImpl.kt").y("cleared reservation for feature: %s", ifvVar);
            defpackage.ni niVarM2 = defpackage.hmr.m(defpackage.ihw.a.m());
            niVarM2.V(true);
            return niVarM2.U();
        }
        aimzVar.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopInternal", 520, "AudioPrismSessionImpl.kt").y("attempting to stop for %s", ifvVar.name());
        if (this.l.get(ifvVar) == null) {
            aimzVar.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopInternal", 522, "AudioPrismSessionImpl.kt").v("can't stop: not running");
            defpackage.ni niVarM3 = defpackage.hmr.m(defpackage.ihw.a.m());
            niVarM3.V(false);
            java.lang.Object obj2 = niVarM3.a;
            defpackage.ihv ihvVar = defpackage.ihv.FAILURE_NO_ONGOING_SESSION_FOR_FEATURE;
            akzx akzxVar = (akzx) obj2;
            akzxVar.u();
            defpackage.ihw ihwVar = (defpackage.ihw) akzxVar.b;
            ihwVar.d = ihvVar.a();
            ihwVar.b |= 1;
            return niVarM3.U();
        }
        insVar.d = ifvVar;
        insVar.c = 1;
        if (i(ifvVar, insVar) == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) this.i.a()).booleanValue()) {
            defpackage.ijb ijbVar = this.h;
            insVar.d = ifvVar;
            insVar.c = 2;
            if (ijbVar.b(ifvVar, insVar) == aoluVar) {
                return aoluVar;
            }
        }
        a.b().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "stopInternal", 535, "AudioPrismSessionImpl.kt").y("stopped for %s", ifvVar.name());
        this.l.remove(ifvVar);
        ijqVar = this.g;
        insVar.d = null;
        insVar.c = 3;
        if (ijqVar.c(ifvVar, insVar) == aoluVar) {
            return aoluVar;
        }
        defpackage.ni niVarM4 = defpackage.hmr.m(defpackage.ihw.a.m());
        niVarM4.V(true);
        return niVarM4.U();
    }

    /* JADX WARN: Code duplicated, block: B:61:0x015a A[Catch: all -> 0x006c, TryCatch #5 {all -> 0x006c, blocks: (B:25:0x0065, B:41:0x00b0, B:42:0x00b2, B:44:0x00c5, B:46:0x00e8, B:47:0x00ea, B:59:0x0131, B:61:0x015a, B:62:0x015c), top: B:77:0x0065 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13, types: [ahoq] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable, java.lang.Object] */
    public final java.lang.Object k(igf igfVar, akzx akzxVar, defpackage.igg iggVar, aoln aolnVar) {
        defpackage.inn innVar;
        ?? r2;
        ?? r3;
        java.lang.Throwable th;
        igf igfVar2;
        akzx akzxVar2;
        ifv ifvVarB;
        ?? r1;
        ?? r4;
        akzx akzxVar3;
        if (aolnVar instanceof defpackage.inn) {
            innVar = (defpackage.inn) aolnVar;
            int i = innVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                innVar.e = i - Integer.MIN_VALUE;
            } else {
                innVar = new defpackage.inn(this, aolnVar);
            }
        } else {
            innVar = new defpackage.inn(this, aolnVar);
        }
        java.lang.Object objB = innVar.c;
        aolu aoluVar = aolu.a;
        int i2 = innVar.e;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    r2 = innVar.f;
                    akzx akzxVar4 = (akzx) innVar.b;
                    igfVar2 = (igf) innVar.a;
                    try {
                        try {
                            aooc.af(objB);
                            akzxVar2 = akzxVar4;
                            r2 = r2;
                        } catch (java.lang.Exception e) {
                            e = e;
                            a.d().i(zct.b).k(e).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "startCallAudioReader$<anonymous>", 493, "AudioPrismSessionImpl.kt").v("error while starting call audio reader");
                            ifvVarB = ifv.b(igfVar2.c);
                            if (ifvVarB == null) {
                                ifvVarB = ifv.j;
                            }
                            innVar.a = r2;
                            innVar.b = null;
                            innVar.f = null;
                            innVar.e = 2;
                            if (i(ifvVarB, innVar) != aoluVar) {
                                return aoluVar;
                            }
                            r1 = r2;
                            defpackage.ni niVarN = defpackage.hmr.n(defpackage.ihu.a.m());
                            niVarN.X(defpackage.iht.FAILURE_CALL_AUDIO_READER_FAILED_TO_START);
                            niVarN.Y();
                            defpackage.ihu ihuVarW = niVarN.W();
                            ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                            return ihuVarW;
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        th = th;
                        r3 = r2;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            ajsz.ak((java.io.Closeable) r3, th);
                            throw th3;
                        }
                    }
                } else {
                    if (i2 == 2) {
                        java.io.Closeable closeable = (java.io.Closeable) innVar.a;
                        aooc.af(objB);
                        r1 = closeable;
                        defpackage.ni niVarN2 = defpackage.hmr.n(defpackage.ihu.a.m());
                        niVarN2.X(defpackage.iht.FAILURE_CALL_AUDIO_READER_FAILED_TO_START);
                        niVarN2.Y();
                        defpackage.ihu ihuVarW2 = niVarN2.W();
                        ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                        return ihuVarW2;
                    }
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.io.Closeable closeable2 = (java.io.Closeable) innVar.b;
                    akzxVar3 = (akzx) innVar.a;
                    aooc.af(objB);
                    r4 = closeable2;
                }
                defpackage.iht ihtVar = defpackage.iht.FAILURE_CALL_AUDIO_READER_FAILED_TO_START;
                akzxVar3.u();
                defpackage.ihu ihuVar = (defpackage.ihu) akzxVar3.b;
                defpackage.ihu ihuVar2 = defpackage.ihu.a;
                ihuVar.d = ihtVar.a();
                ihuVar.b |= 1;
                akzxVar3.u();
                ((defpackage.ihu) akzxVar3.b).c = false;
                alad aladVarP = akzxVar3.p();
                ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
                return aladVarP;
            }
            aooc.af(objB);
            if (!ahvr.R(innVar.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            ahoq ahoqVarZ = ahvr.Z(130, "AudioPrismSessionImpl_startCallAudioReader");
            try {
                defpackage.iin iinVar = this.t;
                ifv ifvVarB2 = ifv.b(igfVar.c);
                if (ifvVarB2 == null) {
                    ifvVarB2 = ifv.j;
                }
                ifz ifzVar = igfVar.e;
                if (ifzVar == null) {
                    ifzVar = ifz.a;
                }
                aooh.e(ifzVar, "getCallAudioConfig(...)");
                innVar.a = igfVar;
                akzxVar2 = akzxVar;
                innVar.b = akzxVar2;
                innVar.f = ahoqVarZ;
                innVar.e = 1;
                objB = iinVar.b(ifvVarB2, ifzVar, iggVar, innVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                igfVar2 = igfVar;
                r2 = ahoqVarZ;
            } catch (java.lang.Exception e2) {
                e = e2;
                igfVar2 = igfVar;
                r2 = ahoqVarZ;
                a.d().i(zct.b).k(e).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "startCallAudioReader$<anonymous>", 493, "AudioPrismSessionImpl.kt").v("error while starting call audio reader");
                ifvVarB = ifv.b(igfVar2.c);
                if (ifvVarB == null) {
                    ifvVarB = ifv.j;
                }
                innVar.a = r2;
                innVar.b = null;
                innVar.f = null;
                innVar.e = 2;
                if (i(ifvVarB, innVar) != aoluVar) {
                    return aoluVar;
                }
                r1 = r2;
                defpackage.ni niVarN3 = defpackage.hmr.n(defpackage.ihu.a.m());
                niVarN3.X(defpackage.iht.FAILURE_CALL_AUDIO_READER_FAILED_TO_START);
                niVarN3.Y();
                defpackage.ihu ihuVarW3 = niVarN3.W();
                ajsz.ak((java.io.Closeable) r1, (java.lang.Throwable) null);
                return ihuVarW3;
            } catch (java.lang.Throwable th4) {
                th = th4;
                r3 = ahoqVarZ;
                throw th;
            }
            defpackage.iga igaVar = (defpackage.iga) objB;
            akzxVar2.u();
            defpackage.ihu ihuVar3 = (defpackage.ihu) akzxVar2.b;
            defpackage.ihu ihuVar4 = defpackage.ihu.a;
            ihuVar3.g = igaVar.a();
            if (igaVar == defpackage.iga.RESULT_SUCCESS) {
                ajsz.ak((java.io.Closeable) r2, (java.lang.Throwable) null);
                return null;
            }
            a.d().i(zct.b).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "startCallAudioReader$<anonymous>", 505, "AudioPrismSessionImpl.kt").y("call audio reader failed to start: %s", igaVar);
            ifv ifvVarB3 = ifv.b(igfVar2.c);
            if (ifvVarB3 == null) {
                ifvVarB3 = ifv.j;
            }
            innVar.a = akzxVar2;
            innVar.b = r2;
            innVar.f = null;
            innVar.e = 3;
            if (i(ifvVarB3, innVar) == aoluVar) {
                return aoluVar;
            }
            r4 = r2;
            akzxVar3 = akzxVar2;
            defpackage.iht ihtVar2 = defpackage.iht.FAILURE_CALL_AUDIO_READER_FAILED_TO_START;
            akzxVar3.u();
            defpackage.ihu ihuVar5 = (defpackage.ihu) akzxVar3.b;
            defpackage.ihu ihuVar6 = defpackage.ihu.a;
            ihuVar5.d = ihtVar2.a();
            ihuVar5.b |= 1;
            akzxVar3.u();
            ((defpackage.ihu) akzxVar3.b).c = false;
            alad aladVarP2 = akzxVar3.p();
            ajsz.ak((java.io.Closeable) r4, (java.lang.Throwable) null);
            return aladVarP2;
        } catch (java.lang.Throwable th5) {
            th = th5;
            r2 = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:132:0x0271  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:96:0x01d1  */
    public final java.lang.Object l(igf igfVar, akzx akzxVar, defpackage.igg iggVar, aoln aolnVar) {
        defpackage.ino inoVar;
        igf igfVarZ;
        akzx akzxVar2;
        java.lang.Object objA;
        java.lang.Object next;
        akzx akzxVar3;
        igf igfVar2 = igfVar;
        if (aolnVar instanceof defpackage.ino) {
            inoVar = (defpackage.ino) aolnVar;
            int i = inoVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                inoVar.e = i - Integer.MIN_VALUE;
            } else {
                inoVar = new defpackage.ino(this, aolnVar);
            }
        } else {
            inoVar = new defpackage.ino(this, aolnVar);
        }
        defpackage.ino inoVar2 = inoVar;
        java.lang.Object obj = inoVar2.c;
        aolu aoluVar = aolu.a;
        int i2 = inoVar2.e;
        boolean z = true;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    igf igfVar3 = inoVar2.f;
                    akzx akzxVar4 = (akzx) inoVar2.b;
                    igf igfVar4 = (igf) inoVar2.a;
                    aooc.af(obj);
                    akzxVar2 = akzxVar4;
                    objA = obj;
                    igfVarZ = igfVar3;
                    igfVar2 = igfVar4;
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    igfVar2 = (java.io.Closeable) inoVar2.b;
                    akzxVar3 = (akzx) inoVar2.a;
                    aooc.af(obj);
                }
                defpackage.iht ihtVar = defpackage.iht.FAILURE_MODELS_FAILED_TO_START;
                akzxVar3.u();
                defpackage.ihu ihuVar = (defpackage.ihu) akzxVar3.b;
                defpackage.ihu ihuVar2 = defpackage.ihu.a;
                ihuVar.d = ihtVar.a();
                ihuVar.b |= 1;
                akzxVar3.u();
                ((defpackage.ihu) akzxVar3.b).c = false;
                alad aladVarP = akzxVar3.p();
                ajsz.ak(igfVar2, (java.lang.Throwable) null);
                return aladVarP;
            }
            aooc.af(obj);
            if (!ahvr.R(inoVar2.u())) {
                throw new java.lang.IllegalStateException("TikTok trace may not live through suspension without TikTok provided CoroutineContext");
            }
            igfVarZ = ahvr.Z(131, "AudioPrismSessionImpl_startCompositeModelRunner");
            try {
                igs igsVar = igfVar2.f;
                if (igsVar == null) {
                    igsVar = igs.a;
                }
                if (igsVar.c.size() > 0) {
                    defpackage.ikj ikjVar = this.u;
                    ifv ifvVarB = ifv.b(igfVar2.c);
                    if (ifvVarB == null) {
                        ifvVarB = ifv.j;
                    }
                    ifz ifzVar = igfVar2.e;
                    if (ifzVar == null) {
                        ifzVar = ifz.a;
                    }
                    aooh.e(ifzVar, "getCallAudioConfig(...)");
                    igs igsVar2 = igfVar2.f;
                    if (igsVar2 == null) {
                        igsVar2 = igs.a;
                    }
                    aooh.e(igsVar2, "getCompositeModelConfig(...)");
                    inoVar2.a = igfVar2;
                    akzxVar2 = akzxVar;
                    inoVar2.b = akzxVar2;
                    inoVar2.f = igfVarZ;
                    inoVar2.e = 1;
                    objA = ikjVar.a(ifvVarB, ifzVar, igsVar2, iggVar, inoVar2);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                }
                ajsz.ak(igfVarZ, (java.lang.Throwable) null);
                return null;
            } catch (java.lang.Throwable th) {
                th = th;
                java.lang.Throwable th2 = th;
                try {
                    throw th2;
                } catch (java.lang.Throwable th3) {
                    ajsz.ak(igfVarZ, th2);
                    throw th3;
                }
            }
            defpackage.igx igxVar = (defpackage.igx) objA;
            akzxVar2.u();
            defpackage.ihu ihuVar3 = (defpackage.ihu) akzxVar2.b;
            defpackage.ihu ihuVar4 = defpackage.ihu.a;
            j$.util.Objects.requireNonNull(igxVar);
            ihuVar3.f = igxVar;
            int i3 = 4;
            ihuVar3.b |= 4;
            alat alatVar = igxVar.c;
            aooh.e(alatVar, "getIndividualModelStartResultsList(...)");
            java.util.Iterator it = alatVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while ((((defpackage.igv) next).b & 1) == 0);
            defpackage.igv igvVar = (defpackage.igv) next;
            if (igvVar != null) {
                defpackage.igw igwVar = igvVar.f;
                if (igwVar == null) {
                    igwVar = defpackage.igw.a;
                }
                akzxVar2.u();
                defpackage.ihu ihuVar5 = (defpackage.ihu) akzxVar2.b;
                j$.util.Objects.requireNonNull(igwVar);
                ihuVar5.h = igwVar;
                ihuVar5.b |= 8;
            }
            alat alatVar2 = igxVar.c;
            aooh.e(alatVar2, "getIndividualModelStartResultsList(...)");
            if (!(alatVar2 instanceof java.util.Collection) || !alatVar2.isEmpty()) {
                java.util.Iterator it2 = alatVar2.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (((defpackage.igv) it2.next()).e);
                alat alatVar3 = igxVar.c;
                aooh.e(alatVar3, "getIndividualModelStartResultsList(...)");
                java.util.ArrayList<defpackage.igv> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : alatVar3) {
                    if (!((defpackage.igv) obj2).e) {
                        arrayList.add(obj2);
                    }
                }
                for (defpackage.igv igvVar2 : arrayList) {
                    aooh.c(igvVar2);
                    int i4 = igvVar2.c;
                    java.lang.String str = "UNRECOGNIZED";
                    z = z;
                    if (i4 == i3) {
                        aimw aimwVarL = a.d().l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "logFailedModelWithReason", 546, "AudioPrismSessionImpl.kt");
                        if (igvVar2.c != i3) {
                            str = "AUDIO_QUALITY_MONITOR_START_FAILURE_UNKNOWN";
                        } else {
                            int iD = defpackage.hhe.d(((java.lang.Integer) igvVar2.d).intValue());
                            if (iD != 0) {
                                if (iD == 2) {
                                    str = "AUDIO_QUALITY_MONITOR_START_FAILURE_UNKNOWN";
                                } else if (iD == 3) {
                                    str = "AUDIO_QUALITY_MONITOR_START_FAILURE_NO_LISTENER_PROVIDED";
                                }
                            }
                        }
                        aimwVarL.y("Audio quality monitor failure: %s", str);
                    } else if (i4 == 3) {
                        aimw aimwVarL2 = a.d().i(zct.b).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "logFailedModelWithReason", 552, "AudioPrismSessionImpl.kt");
                        if (igvVar2.c != 3) {
                            str = "DAREDEVIL_START_FAILURE_UNKNOWN";
                        } else {
                            int iD2 = defpackage.hhv.d(((java.lang.Integer) igvVar2.d).intValue());
                            if (iD2 != 0) {
                                if (iD2 == 2) {
                                    str = "DAREDEVIL_START_FAILURE_UNKNOWN";
                                } else if (iD2 == 3) {
                                    str = "DAREDEVIL_START_FAILURE_NO_LISTENER_PROVIDED";
                                }
                            }
                        }
                        aimwVarL2.y("Daredevil failure: %s", str);
                    } else {
                        if (i4 == 5) {
                            aimw aimwVarL3 = a.d().i(zct.b).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "logFailedModelWithReason", 558, "AudioPrismSessionImpl.kt");
                            if (igvVar2.c == 5) {
                                int iAV = a.aV(((java.lang.Integer) igvVar2.d).intValue());
                                if (iAV != 0) {
                                    switch (iAV) {
                                        case 2:
                                            str = "DUPLEX_START_FAILURE_UNKNOWN";
                                            break;
                                        case 3:
                                            str = "DUPLEX_START_FAILURE_MISSING_CONVERSATION_CONTEXT";
                                            break;
                                        case 4:
                                            str = "DUPLEX_START_FAILURE_NO_LISTENER_PROVIDED";
                                            break;
                                        case 5:
                                            str = "DUPLEX_START_FAILURE_UNSUPPORTED_LOCALE";
                                            break;
                                        case 6:
                                            str = "DUPLEX_START_FAILURE_FILE_GROUP_NOT_DOWNLOADED";
                                            break;
                                        case 7:
                                            str = "DUPLEX_START_FAILURE_NO_FILE_IN_FILE_GROUP";
                                            break;
                                        case 8:
                                            str = "DUPLEX_START_FAILURE_MISSING_MODULE_TYPE";
                                            break;
                                        case 9:
                                            str = "DUPLEX_START_FAILURE_CONVERSATION_INIT_ERROR";
                                            break;
                                        case 10:
                                            str = "DUPLEX_FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE";
                                            break;
                                    }
                                }
                            } else {
                                str = "DUPLEX_START_FAILURE_UNKNOWN";
                            }
                            aimwVarL3.y("Duplex failure: %s", str);
                        } else if (i4 == 2) {
                            aimw aimwVarL4 = a.d().i(zct.b).l("com/android/dialer/audioprism/internal/session/impl/AudioPrismSessionImpl", "logFailedModelWithReason", 561, "AudioPrismSessionImpl.kt");
                            if (igvVar2.c == 2) {
                                int iAV2 = a.aV(((java.lang.Integer) igvVar2.d).intValue());
                                if (iAV2 != 0) {
                                    switch (iAV2) {
                                        case 2:
                                            str = "SODA_START_FAILURE_UNKNOWN";
                                            break;
                                        case 3:
                                            str = "SODA_START_FAILURE_UNSUPPORTED_LOCALE_REQUESTED";
                                            break;
                                        case 4:
                                            str = "SODA_START_FAILURE_NO_LP_SPECIFIED";
                                            break;
                                        case 5:
                                            str = "SODA_START_FAILURE_SODA_INFRA_ERROR";
                                            break;
                                        case 6:
                                            str = "SODA_START_FAILURE_NO_LP_DOWNLOADED";
                                            break;
                                        case 7:
                                            str = "SODA_START_FAILURE_LP_VERSION_LOWER_THAN_MIN_VERSION";
                                            break;
                                        case 8:
                                            str = "SODA_START_FAILURE_NO_LISTENER_PROVIDED";
                                            break;
                                        case 9:
                                            str = "SODA_START_FAILURE_LP_VERSION_RANGE_MISMATCHED";
                                            break;
                                        case 10:
                                            str = "SODA_START_FAILURE_UPLINK_REQUESTED_WHEN_DUOLINKS_UNAVAILABLE";
                                            break;
                                    }
                                }
                            } else {
                                str = "SODA_START_FAILURE_UNKNOWN";
                            }
                            aimwVarL4.y("SODA failure: %s", str);
                        }
                        i3 = 4;
                    }
                }
                ifv ifvVarB2 = ifv.b(igfVar2.c);
                if (ifvVarB2 == null) {
                    ifvVarB2 = ifv.j;
                }
                inoVar2.a = akzxVar2;
                inoVar2.b = igfVarZ;
                inoVar2.f = null;
                inoVar2.e = 2;
                if (i(ifvVarB2, inoVar2) == aoluVar) {
                    return aoluVar;
                }
                igfVar2 = igfVarZ;
                akzxVar3 = akzxVar2;
                defpackage.iht ihtVar2 = defpackage.iht.FAILURE_MODELS_FAILED_TO_START;
                akzxVar3.u();
                defpackage.ihu ihuVar6 = (defpackage.ihu) akzxVar3.b;
                defpackage.ihu ihuVar7 = defpackage.ihu.a;
                ihuVar6.d = ihtVar2.a();
                ihuVar6.b |= 1;
                akzxVar3.u();
                ((defpackage.ihu) akzxVar3.b).c = false;
                alad aladVarP2 = akzxVar3.p();
                ajsz.ak(igfVar2, (java.lang.Throwable) null);
                return aladVarP2;
            }
            ajsz.ak(igfVarZ, (java.lang.Throwable) null);
            return null;
        } catch (java.lang.Throwable th4) {
            th = th4;
            igfVarZ = igfVar2;
        }
    }
}
