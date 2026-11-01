package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nld implements defpackage.njm {
    public final ahda A;
    public mni B;
    private final aolr D;
    private final ajcu E;
    private final aoin F;
    private ajcq G;
    public final android.content.Context b;
    public final aoss c;
    public final ysy d;
    public final aoin e;
    public final aoin f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    public final aoyq j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public aoub p;
    public long q;
    public boolean r;
    public defpackage.mzd s;
    public j$.time.Instant t;
    public java.lang.Long u;
    public final apdp v;
    public final yuo w;
    public final aazc x;
    public final zzx y;
    public ahdv z;
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner");
    private static final aorg C = new aorg("\\s+");

    public nld(android.content.Context context, aolr aolrVar, aoss aossVar, ajcu ajcuVar, aazc aazcVar, ysy ysyVar, yuo yuoVar, aoin aoinVar, aoin aoinVar2, zzx zzxVar, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, aoin aoinVar6, aoin aoinVar7) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajcuVar, "lightweightExecutor");
        aooh.f(aazcVar, "clock");
        aooh.f(ysyVar, "aiCoreModelAvailability");
        aooh.f(aoinVar, "silenceFallbackTimeoutSeconds");
        aooh.f(aoinVar2, "conversationMaxTurnFallbackCount");
        aooh.f(aoinVar3, "enableAsyncAicoreStatusCheck");
        aooh.f(aoinVar4, "enableCallScreenLiteChipDebounce");
        aooh.f(aoinVar5, "enableCallScreenLiteGeminiDisclosure");
        aooh.f(aoinVar6, "enableCslSodaPartialsForBargeIn");
        aooh.f(aoinVar7, "enableCslFixTerminalChipRaceCondition");
        this.b = context;
        this.D = aolrVar;
        this.c = aossVar;
        this.E = ajcuVar;
        this.x = aazcVar;
        this.d = ysyVar;
        this.w = yuoVar;
        this.F = aoinVar;
        this.e = aoinVar2;
        this.y = zzxVar;
        this.f = aoinVar3;
        this.g = aoinVar4;
        this.h = aoinVar5;
        this.i = aoinVar7;
        this.j = aoyx.c(10, 0, 0, 6);
        this.A = new ahda((byte[]) null);
        this.v = new apdp();
        this.B = defpackage.nkr.a;
        this.s = mni.T(defpackage.mzd.a.m()).m();
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        aooh.e(instant, "EPOCH");
        this.t = instant;
    }

    public static final defpackage.mzd E(defpackage.mzd mzdVar, aonj aonjVar) {
        defpackage.vk vkVarT = mni.T(mzdVar.p());
        defpackage.mze mzeVar = mzdVar.d;
        if (mzeVar == null) {
            mzeVar = defpackage.mze.a;
        }
        aooh.e(mzeVar, "getLatestSuggestedReplies(...)");
        defpackage.vk vkVarAb = mni.ab(mzeVar.p());
        alct<defpackage.mzg> alctVarK = vkVarAb.k();
        vkVarAb.k();
        akzx akzxVar = (akzx) vkVarAb.a;
        akzxVar.u();
        ((defpackage.mze) akzxVar.b).b = albq.a;
        vkVarAb.k();
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alctVarK, 10));
        for (defpackage.mzg mzgVar : alctVarK) {
            defpackage.npw npwVarQ = mni.Q(mzgVar.p());
            npwVarQ.ab((defpackage.mzb) aonjVar.a(mzgVar));
            arrayList.add(npwVarQ.Y());
        }
        akzxVar.u();
        defpackage.mze mzeVar2 = (defpackage.mze) akzxVar.b;
        mzeVar2.b();
        akyl.i(arrayList, mzeVar2.b);
        vkVarT.n(vkVarAb.j());
        return vkVarT.m();
    }

    private final java.lang.Object G(aoln aolnVar) {
        java.lang.Object objA;
        alat alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        java.util.ArrayList<defpackage.mzc> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : alatVar) {
            defpackage.mzc mzcVar = (defpackage.mzc) obj;
            if (!(mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
        for (defpackage.mzc mzcVar2 : arrayList) {
            defpackage.myz myzVar = (mzcVar2.b == 3 ? (defpackage.mzh) mzcVar2.c : defpackage.mzh.a).d;
            if (myzVar == null) {
                myzVar = defpackage.myz.a;
            }
            java.lang.String str = myzVar.b;
            aooh.e(str, "getText(...)");
            arrayList2.add(aoov.x(str).toString());
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (((java.lang.String) obj2).length() > 0) {
                arrayList3.add(obj2);
            }
        }
        java.lang.String strCr = ajsz.cr(arrayList3, " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, (aonj) null, 62);
        return (strCr.length() <= 0 || (objA = this.j.a(new defpackage.nkd(strCr), aolnVar)) != aolu.a) ? aojh.a : objA;
    }

    public final boolean A() {
        alat<defpackage.mzc> alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        if ((alatVar instanceof java.util.Collection) && alatVar.isEmpty()) {
            return false;
        }
        for (defpackage.mzc mzcVar : alatVar) {
            if (!(mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        return !aooh.n(this.B, defpackage.nkr.a) || this.n || this.o || this.m;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final void F(java.lang.String str, j$.time.Instant instant, int i) {
        defpackage.mzc mzcVar;
        int i2;
        alat alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        int iAZ = ajsz.aZ(alatVar);
        if (iAZ == -1 || (i2 = (mzcVar = (defpackage.mzc) alatVar.get(iAZ)).b) != 3) {
            iAZ = -1;
        } else {
            if ((i2 == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c) {
                iAZ = -1;
            } else {
                int iH = mni.H((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).f);
                if (iH == 0 || iH != 3) {
                    iAZ = -1;
                }
            }
        }
        if (iAZ != -1) {
            defpackage.mzc mzcVar2 = (defpackage.mzc) this.s.c.get(iAZ);
            aooh.c(mzcVar2);
            defpackage.vk vkVarU = mni.U(mzcVar2.p());
            defpackage.npw npwVarP = mni.P(vkVarU.s().p());
            defpackage.vk vkVarV = mni.V(defpackage.myz.a.m());
            vkVarV.x(str);
            npwVarP.W(vkVarV.w());
            npwVarP.X(i);
            vkVarU.v(npwVarP.T());
            defpackage.mzc mzcVarR = vkVarU.r();
            defpackage.vk vkVarT = mni.T(this.s.p());
            vkVarT.q();
            vkVarT.p(iAZ, mzcVarR);
            this.s = vkVarT.m();
            return;
        }
        long epochMilli = instant.toEpochMilli();
        defpackage.vk vkVarU2 = mni.U(defpackage.mzc.a.m());
        vkVarU2.t(m() + 1);
        vkVarU2.u(epochMilli);
        defpackage.npw npwVarP2 = mni.P(defpackage.mzh.a.m());
        npwVarP2.U(false);
        defpackage.vk vkVarV2 = mni.V(defpackage.myz.a.m());
        vkVarV2.x(str);
        npwVarP2.W(vkVarV2.w());
        npwVarP2.V(epochMilli);
        npwVarP2.X(i);
        vkVarU2.v(npwVarP2.T());
        defpackage.mzc mzcVarR2 = vkVarU2.r();
        defpackage.vk vkVarT2 = mni.T(this.s.p());
        vkVarT2.q();
        vkVarT2.o(mzcVarR2);
        this.s = vkVarT2.m();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.njm
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nks nksVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nks) {
            nksVar = (defpackage.nks) aolnVar;
            int i = nksVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nksVar.c = i - Integer.MIN_VALUE;
            } else {
                nksVar = new defpackage.nks(this, aolnVar);
            }
        } else {
            nksVar = new defpackage.nks(this, aolnVar);
        }
        java.lang.Object obj = nksVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nksVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    apdpVar = nksVar.d;
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
            apdpVar = this.v;
            nksVar.d = apdpVar;
            nksVar.c = 1;
            if (apdpVar.b(nksVar) == aoluVar) {
                return aoluVar;
            }
            this.k = false;
            apdpVar.d();
            aosy aosyVarAg = ahvr.ag(this.c, this.A, new defpackage.nht(this, (aoln) null, 7));
            nksVar.d = null;
            nksVar.c = 2;
            if (aosyVarAg.a(nksVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    @Override // defpackage.njm
    public final java.lang.Object b(aoln aolnVar) {
        return aoov.aj(this.D, new defpackage.mva(this, (aoln) null, 8), aolnVar);
    }

    @Override // defpackage.njm
    public final java.lang.Object c(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.hnj(this, (aoln) null, 14)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object d(defpackage.njq njqVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.nkw(this, njqVar, null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object e(defpackage.njs njsVar, aoln aolnVar) {
        java.lang.Object objT;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayDaredevilEvent", 977, "DobbyCallScreenLiteUseCaseRunner.kt").v("relayDaredevilEvent");
        if (!this.l) {
            return (njsVar.a + (-1) == 2 && (objT = t(aolnVar)) == aolu.a) ? objT : aojh.a;
        }
        aimzVar.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "relayDaredevilEvent", 979, "DobbyCallScreenLiteUseCaseRunner.kt").v("relayDaredevilEvent: ignoring because ringing timed out.");
        return aojh.a;
    }

    @Override // defpackage.njm
    public final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.hnj(this, (aoln) null, 15, (byte[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object g(defpackage.nju njuVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.hxq(this, njuVar, (aoln) null, 3)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object h(aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.hnj(this, (aoln) null, 16, (char[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object i(long j, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.nkx(j, this, null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    @Override // defpackage.njm
    public final java.lang.Object j(defpackage.nju njuVar, aoln aolnVar) {
        java.lang.Object objA = ahvr.ag(this.c, this.A, new defpackage.hxq(this, njuVar, (aoln) null, 4, (byte[]) null)).a(aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.njm
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.nkz nkzVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nkz) {
            nkzVar = (defpackage.nkz) aolnVar;
            int i = nkzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkzVar.c = i - Integer.MIN_VALUE;
            } else {
                nkzVar = new defpackage.nkz(this, aolnVar);
            }
        } else {
            nkzVar = new defpackage.nkz(this, aolnVar);
        }
        java.lang.Object obj = nkzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nkzVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    apdpVar = nkzVar.d;
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
            if (this.z == null) {
                a.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "start", 200, "DobbyCallScreenLiteUseCaseRunner.kt").v("start called without a successful initialize");
                return aojh.a;
            }
            apdpVar = this.v;
            nkzVar.d = apdpVar;
            nkzVar.c = 1;
            if (apdpVar.b(nkzVar) == aoluVar) {
                return aoluVar;
            }
            if (this.k) {
                throw new java.lang.IllegalStateException("start called when already running");
            }
            this.k = true;
            apdpVar.d();
            aoss aossVar = this.c;
            aoov.an(aossVar, (aolr) null, 0, new defpackage.nht(this, (aoln) null, 8, (byte[]) null), 3);
            aosy aosyVarAg = ahvr.ag(aossVar, this.A, new defpackage.hnj(this, (aoln) null, 17, (short[]) null));
            nkzVar.d = null;
            nkzVar.c = 2;
            if (aosyVarAg.a(nkzVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    @Override // defpackage.njm
    public final aoxh l() {
        return this.j;
    }

    public final long m() {
        java.lang.Long l;
        alat alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        java.util.Iterator it = alatVar.iterator();
        if (it.hasNext()) {
            java.lang.Long lValueOf = java.lang.Long.valueOf(((defpackage.mzc) it.next()).d);
            while (it.hasNext()) {
                java.lang.Long lValueOf2 = java.lang.Long.valueOf(((defpackage.mzc) it.next()).d);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            l = lValueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(java.lang.String str, java.lang.Long l, aoln aolnVar) {
        defpackage.nkt nktVar;
        long jLongValue;
        java.lang.String str2;
        long j;
        aoub aoubVar;
        if (aolnVar instanceof defpackage.nkt) {
            nktVar = (defpackage.nkt) aolnVar;
            int i = nktVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nktVar.d = i - Integer.MIN_VALUE;
            } else {
                nktVar = new defpackage.nkt(this, aolnVar);
            }
        } else {
            nktVar = new defpackage.nkt(this, aolnVar);
        }
        java.lang.Object obj = nktVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nktVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                long j2 = nktVar.a;
                java.lang.String str3 = nktVar.e;
                aooc.af(obj);
                jLongValue = j2;
                str = str3;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j3 = nktVar.a;
                java.lang.String str4 = nktVar.e;
                aooc.af(obj);
                j = j3;
                str2 = str4;
            }
            aoubVar = this.p;
            if (aoubVar != null) {
                aoubVar.s((java.util.concurrent.CancellationException) null);
            }
            this.p = aoov.an(this.c, (aolr) null, 0, new defpackage.klr(this, str2, j, (aoln) null, 6), 3);
            return aojh.a;
        }
        aooc.af(obj);
        jLongValue = l != null ? l.longValue() : m() + 1;
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        defpackage.vk vkVarU = mni.U(defpackage.mzc.a.m());
        vkVarU.t(jLongValue);
        vkVarU.u(epochMilli);
        defpackage.npw npwVarP = mni.P(defpackage.mzh.a.m());
        npwVarP.U(true);
        defpackage.vk vkVarV = mni.V(defpackage.myz.a.m());
        vkVarV.x(str);
        npwVarP.W(vkVarV.w());
        npwVarP.V(epochMilli);
        npwVarP.X(3);
        vkVarU.v(npwVarP.T());
        defpackage.mzc mzcVarR = vkVarU.r();
        defpackage.vk vkVarT = mni.T(this.s.p());
        vkVarT.q();
        vkVarT.o(mzcVarR);
        this.s = vkVarT.m();
        nktVar.e = str;
        nktVar.a = jLongValue;
        nktVar.d = 1;
        if (p(nktVar) == aoluVar) {
            return aoluVar;
        }
        aoyq aoyqVar = this.j;
        defpackage.njw njwVar = new defpackage.njw(str, jLongValue);
        nktVar.e = str;
        nktVar.a = jLongValue;
        nktVar.d = 2;
        if (aoyqVar.a(njwVar, nktVar) == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        j = jLongValue;
        aoubVar = this.p;
        if (aoubVar != null) {
            aoubVar.s((java.util.concurrent.CancellationException) null);
        }
        this.p = aoov.an(this.c, (aolr) null, 0, new defpackage.klr(this, str2, j, (aoln) null, 6), 3);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    public final java.lang.Object o(defpackage.njt njtVar, aoln aolnVar) {
        java.lang.Object objPrevious;
        java.lang.String str;
        defpackage.mzc mzcVar;
        if (!this.m && !this.n && !this.o && (!((java.lang.Boolean) this.i.a()).booleanValue() || !B())) {
            this.m = true;
            java.lang.String string = this.b.getString(2132018384);
            aooh.e(string, "getString(...)");
            long jM = m() + 1;
            if (njtVar == defpackage.njt.NONE) {
                alat alatVar = this.s.c;
                aooh.e(alatVar, "getConversationItemsList(...)");
                java.util.ListIterator listIterator = alatVar.listIterator(alatVar.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    mzcVar = (defpackage.mzc) objPrevious;
                } while ((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c);
                defpackage.mzc mzcVar2 = (defpackage.mzc) objPrevious;
                if (mzcVar2 == null) {
                    str = "";
                } else {
                    defpackage.mzh mzhVar = mzcVar2.b == 3 ? (defpackage.mzh) mzcVar2.c : defpackage.mzh.a;
                    if (mzhVar == null) {
                        str = "";
                    } else {
                        defpackage.myz myzVar = mzhVar.d;
                        if (myzVar == null) {
                            myzVar = defpackage.myz.a;
                        }
                        if (myzVar == null || (str = myzVar.b) == null) {
                            str = "";
                        }
                    }
                }
                njtVar = mni.F(str);
            }
            this.B = new defpackage.nkp(jM, njtVar);
            java.lang.Object objN = n(string, new java.lang.Long(jM), aolnVar);
            if (objN == aolu.a) {
                return objN;
            }
        }
        return aojh.a;
    }

    public final java.lang.Object p(aoln aolnVar) {
        java.lang.Object objA = this.j.a(new defpackage.njy(this.s), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object q(boolean z, defpackage.njt njtVar, aoln aolnVar) {
        this.o = true;
        java.lang.Object objA = this.j.a(new defpackage.njz(z, njtVar), aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object r(boolean z, aoln aolnVar) {
        if (!this.m && !this.n && !this.o) {
            this.m = true;
            y();
            aoyq aoyqVar = this.j;
            if (z) {
                java.lang.Object objA = aoyqVar.a(defpackage.nkb.a, aolnVar);
                if (objA == aolu.a) {
                    return objA;
                }
            } else {
                java.lang.Object objA2 = aoyqVar.a(defpackage.nka.a, aolnVar);
                if (objA2 == aolu.a) {
                    return objA2;
                }
            }
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(long j, aoln aolnVar) throws aois {
        defpackage.nku nkuVar;
        java.lang.Object obj;
        aoyq aoyqVar;
        defpackage.njv njvVar;
        aoyq aoyqVar2;
        defpackage.njx njxVar;
        if (aolnVar instanceof defpackage.nku) {
            nkuVar = (defpackage.nku) aolnVar;
            int i = nkuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkuVar.d = i - Integer.MIN_VALUE;
            } else {
                nkuVar = new defpackage.nku(this, aolnVar);
            }
        } else {
            nkuVar = new defpackage.nku(this, aolnVar);
        }
        java.lang.Object obj2 = nkuVar.b;
        aolu aoluVar = aolu.a;
        int i2 = nkuVar.d;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj2);
                y();
                aoyqVar = this.j;
                njvVar = defpackage.njv.a;
                nkuVar.d = 2;
                if (aoyqVar.a(njvVar, nkuVar) == aoluVar) {
                    return aoluVar;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    obj = nkuVar.a;
                    aooc.af(obj2);
                    y();
                    aoyqVar2 = this.j;
                    njxVar = new defpackage.njx(((defpackage.nkp) obj).b);
                    nkuVar.a = null;
                    nkuVar.d = 4;
                    if (aoyqVar2.a(njxVar, nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i2 == 4) {
                    aooc.af(obj2);
                } else {
                    if (i2 != 5) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj2);
                    this.B = defpackage.nkr.a;
                }
                this.B = defpackage.nkr.a;
            } else {
                aooc.af(obj2);
            }
            this.B = defpackage.nkr.a;
        } else {
            aooc.af(obj2);
            mni mniVar = this.B;
            if (mniVar instanceof defpackage.nko) {
                if (j == ((defpackage.nko) mniVar).a) {
                    nkuVar.d = 1;
                    if (G(nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                    y();
                    aoyqVar = this.j;
                    njvVar = defpackage.njv.a;
                    nkuVar.d = 2;
                    if (aoyqVar.a(njvVar, nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.B = defpackage.nkr.a;
                }
            } else if (mniVar instanceof defpackage.nkp) {
                if (j == ((defpackage.nkp) mniVar).a) {
                    nkuVar.a = mniVar;
                    nkuVar.d = 3;
                    if (G(nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                    obj = mniVar;
                    y();
                    aoyqVar2 = this.j;
                    njxVar = new defpackage.njx(((defpackage.nkp) obj).b);
                    nkuVar.a = null;
                    nkuVar.d = 4;
                    if (aoyqVar2.a(njxVar, nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.B = defpackage.nkr.a;
                }
            } else if (mniVar instanceof defpackage.nkq) {
                defpackage.nkq nkqVar = (defpackage.nkq) mniVar;
                if (j == nkqVar.a) {
                    y();
                    boolean z2 = nkqVar.b;
                    defpackage.njt njtVar = nkqVar.c;
                    nkuVar.d = 5;
                    if (q(z2, njtVar, nkuVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.B = defpackage.nkr.a;
                }
            } else if (!aooh.n(mniVar, defpackage.nkr.a)) {
                throw new aois();
            }
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final java.lang.Object t(aoln aolnVar) {
        java.lang.Long l;
        alat alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : alatVar) {
            defpackage.mzc mzcVar = (defpackage.mzc) obj;
            if ((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c) {
                int iH = mni.H((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).f);
                if (iH != 0 && iH == 3) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Long l2 = new java.lang.Long(((defpackage.mzc) it.next()).d);
            while (it.hasNext()) {
                java.lang.Long l3 = new java.lang.Long(((defpackage.mzc) it.next()).d);
                if (l2.compareTo(l3) < 0) {
                    l2 = l3;
                }
            }
            l = l2;
        } else {
            l = null;
        }
        if ((l != null ? l.longValue() : -1L) <= 0 || !aooh.n(this.B, defpackage.nkr.a)) {
            a.b().l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "findAndCancelOngoingSpeech", 998, "DobbyCallScreenLiteUseCaseRunner.kt").v("Skip interrupting disclosure or pending action speech");
            return aojh.a;
        }
        java.lang.Object objA = this.j.a(defpackage.nkc.a, aolnVar);
        return objA != aolu.a ? aojh.a : objA;
    }

    public final java.lang.Object u(aoln aolnVar) {
        java.lang.Long l;
        java.lang.Object objA;
        alat alatVar = this.s.c;
        aooh.e(alatVar, "getConversationItemsList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : alatVar) {
            defpackage.mzc mzcVar = (defpackage.mzc) obj;
            if ((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c) {
                int iH = mni.H((mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).f);
                if (iH != 0 && iH == 3) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            java.lang.Long l2 = new java.lang.Long(((defpackage.mzc) it.next()).d);
            while (it.hasNext()) {
                java.lang.Long l3 = new java.lang.Long(((defpackage.mzc) it.next()).d);
                if (l2.compareTo(l3) < 0) {
                    l2 = l3;
                }
            }
            l = l2;
        } else {
            l = null;
        }
        return ((l != null ? l.longValue() : -1L) == -1 || (objA = this.j.a(defpackage.nkc.a, aolnVar)) != aolu.a) ? aojh.a : objA;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0114 -> B:14:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object v(java.lang.String r21, long r22, aoln r24) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nld.v(java.lang.String, long, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(aoln aolnVar) {
        defpackage.nla nlaVar;
        if (aolnVar instanceof defpackage.nla) {
            nlaVar = (defpackage.nla) aolnVar;
            int i = nlaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nlaVar.c = i - Integer.MIN_VALUE;
            } else {
                nlaVar = new defpackage.nla(this, aolnVar);
            }
        } else {
            nlaVar = new defpackage.nla(this, aolnVar);
        }
        java.lang.Object objA = nlaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nlaVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objA);
                defpackage.mzd mzdVar = this.s;
                aooh.f(mzdVar, "conversationState");
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (defpackage.mzc mzcVar : mzdVar.c) {
                    int i3 = mzcVar.b;
                    if (i3 == 3) {
                        java.lang.String str = true != (i3 == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).c ? "Caller" : "Assistant";
                        defpackage.myz myzVar = (mzcVar.b == 3 ? (defpackage.mzh) mzcVar.c : defpackage.mzh.a).d;
                        if (myzVar == null) {
                            myzVar = defpackage.myz.a;
                        }
                        sb.append(str + ": " + myzVar.b + '\n');
                    }
                }
                java.util.List listAY = ajsz.aY(new ynk(sb.toString()));
                ynm ynmVarA = ynn.a();
                ynmVarA.b(listAY);
                ynmVarA.f(0.1f);
                ynmVarA.d(300);
                yno ynoVar = defpackage.nkm.a;
                ynmVarA.f = defpackage.nkm.a;
                ynn ynnVarA = ynmVarA.a();
                ahdv ahdvVar = this.z;
                if (ahdvVar != null) {
                    this.r = true;
                    nlaVar.c = 1;
                    objA = ahdvVar.a(ynnVarA, nlaVar);
                    if (objA == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
        } catch (java.lang.Exception e) {
            a.d().j(zct.a, java.lang.Boolean.TRUE).k(e).l("com/android/dialer/dobby/impl/service/gemini/runners/DobbyCallScreenLiteUseCaseRunner", "submitInferenceRequest$<anonymous>", 671, "DobbyCallScreenLiteUseCaseRunner.kt").v("submitInferenceRequest: runInference failed");
            this.r = false;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(long j, int i, aoln aolnVar) {
        defpackage.nlb nlbVar;
        apdp apdpVar;
        long j2;
        int i2;
        if (aolnVar instanceof defpackage.nlb) {
            nlbVar = (defpackage.nlb) aolnVar;
            int i3 = nlbVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nlbVar.e = i3 - Integer.MIN_VALUE;
            } else {
                nlbVar = new defpackage.nlb(this, aolnVar);
            }
        } else {
            nlbVar = new defpackage.nlb(this, aolnVar);
        }
        java.lang.Object obj = nlbVar.c;
        aolu aoluVar = aolu.a;
        int i4 = nlbVar.e;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    i = nlbVar.b;
                    j = nlbVar.a;
                    apdpVar = nlbVar.f;
                    aooc.af(obj);
                } else {
                    if (i4 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(obj);
                }
                return aojh.a;
            }
            aooc.af(obj);
            apdpVar = this.v;
            nlbVar.f = apdpVar;
            nlbVar.a = j;
            nlbVar.b = i;
            nlbVar.e = 1;
            if (apdpVar.b(nlbVar) == aoluVar) {
                return aoluVar;
            }
            if (!this.k) {
                aojh aojhVar = aojh.a;
                apdpVar.d();
                return aojhVar;
            }
            apdpVar.d();
            aosy aosyVarAg = ahvr.ag(this.c, this.A, new defpackage.nlc(this, j2, i2, (aoln) null, 0));
            nlbVar.f = null;
            nlbVar.e = 2;
            if (aosyVarAg.a(nlbVar) == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
        j2 = j;
        i2 = i;
    }

    public final void y() {
        ajcq ajcqVar = this.G;
        if (ajcqVar != null) {
            ajcqVar.cancel(false);
        }
        this.G = null;
    }

    public final void z() {
        if (this.G != null) {
            y();
        }
        java.lang.Long l = (java.lang.Long) this.F.a();
        defpackage.lge lgeVar = new defpackage.lge(this, l, 12);
        aooh.c(l);
        this.G = ahus.t(lgeVar, l.longValue(), l.longValue(), java.util.concurrent.TimeUnit.SECONDS, this.E);
    }
}
