package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mym {
    private final long a;
    private final java.lang.String b;
    private final defpackage.mys c;
    private final defpackage.mba d;
    private final defpackage.iqp e;
    private final nri f;
    private final defpackage.nqs g;
    private final aoin h;
    private final aoin i;
    private final aoin j;
    private final aimz k;
    private final qbe l;
    private final afpl m;

    public mym(long j, java.lang.String str, afpl afplVar, defpackage.mys mysVar, qbe qbeVar, defpackage.mba mbaVar, defpackage.iqp iqpVar, nri nriVar, defpackage.nqs nqsVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(str, "uniqueCallId");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(nriVar, "dobbyDatabase");
        aooh.f(nqsVar, "audioWaveFileWriter");
        aooh.f(aoinVar, "enableBeeslyOnWearFullFunctionality");
        aooh.f(aoinVar2, "enableBeeslyCrashFix");
        aooh.f(aoinVar3, "enableBeeslyMissedCallRedirectToCallLog");
        this.a = j;
        this.b = str;
        this.m = afplVar;
        this.c = mysVar;
        this.l = qbeVar;
        this.d = mbaVar;
        this.e = iqpVar;
        this.f = nriVar;
        this.g = nqsVar;
        this.h = aoinVar;
        this.i = aoinVar2;
        this.j = aoinVar3;
        this.k = aimz.i("com/android/dialer/dobby/impl/notification/missedcall/DobbyCallScopedMissedCallNotifier");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(long j, aoln aolnVar) {
        defpackage.myd mydVar;
        defpackage.nsp nspVar;
        defpackage.nsl nslVar;
        defpackage.nsq nsqVar;
        if (aolnVar instanceof defpackage.myd) {
            mydVar = (defpackage.myd) aolnVar;
            int i = mydVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mydVar.d = i - Integer.MIN_VALUE;
            } else {
                mydVar = new defpackage.myd(this, aolnVar);
            }
        } else {
            mydVar = new defpackage.myd(this, aolnVar);
        }
        java.lang.Object objE = mydVar.b;
        aolu aoluVar = aolu.a;
        int i2 = mydVar.d;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                j = mydVar.a;
                aooc.af(objE);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objE);
            }
            nspVar = (defpackage.nsp) objE;
            nslVar = null;
            if (nspVar != null) {
                nsqVar = nspVar.e;
                if (nsqVar == null) {
                    nsqVar = defpackage.nsq.a;
                }
                if (nsqVar != null && (nslVar = nsqVar.e) == null) {
                    nslVar = defpackage.nsl.a;
                }
            }
            if (nslVar != null && nslVar.f != 0) {
                z = false;
            }
            return java.lang.Boolean.valueOf(z);
        }
        aooc.af(objE);
        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            defpackage.nqs nqsVar = this.g;
            mydVar.a = j;
            mydVar.d = 1;
            objE = nqsVar.e(mydVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        }
        nri nriVar = this.f;
        mydVar.d = 2;
        objE = nriVar.h(j, mydVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        nspVar = (defpackage.nsp) objE;
        nslVar = null;
        if (nspVar != null) {
            nsqVar = nspVar.e;
            if (nsqVar == null) {
                nsqVar = defpackage.nsq.a;
            }
            if (nsqVar != null) {
                nslVar = defpackage.nsl.a;
            }
        }
        if (nslVar != null) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
        if (((java.lang.Boolean) objE).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        nri nriVar2 = this.f;
        mydVar.d = 2;
        objE = nriVar2.h(j, mydVar);
        if (objE == aoluVar) {
            return aoluVar;
        }
        nspVar = (defpackage.nsp) objE;
        nslVar = null;
        if (nspVar != null) {
            nsqVar = nspVar.e;
            if (nsqVar == null) {
                nsqVar = defpackage.nsq.a;
            }
            if (nsqVar != null) {
                nslVar = defpackage.nsl.a;
            }
        }
        if (nslVar != null) {
            z = false;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:47:0x0117  */
    /* JADX WARN: Code duplicated, block: B:50:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x012f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0144  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(boolean z, wcq wcqVar, zjd zjdVar, aoln aolnVar) throws aois {
        defpackage.mye myeVar;
        defpackage.nmz nmzVar;
        wcq wcqVar2;
        zjd zjdVar2;
        java.lang.String str;
        java.lang.Object objF;
        defpackage.nmz nmzVar2;
        java.lang.String str2;
        zjd zjdVar3;
        int iP;
        java.lang.String strCu;
        boolean z2;
        java.lang.Object objI;
        java.lang.String str3;
        wcq wcqVar3;
        zjd zjdVar4;
        java.lang.String str4;
        boolean z3;
        int i;
        if (aolnVar instanceof defpackage.mye) {
            myeVar = (defpackage.mye) aolnVar;
            int i2 = myeVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                myeVar.f = i2 - Integer.MIN_VALUE;
            } else {
                myeVar = new defpackage.mye(this, aolnVar);
            }
        } else {
            myeVar = new defpackage.mye(this, aolnVar);
        }
        java.lang.Object objH = myeVar.d;
        aolu aoluVar = aolu.a;
        int i3 = myeVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                z = myeVar.a;
                zjdVar = myeVar.h;
                wcqVar = myeVar.g;
                aooc.af(objH);
            } else if (i3 == 2) {
                nmzVar = (defpackage.nmz) myeVar.b;
                zjdVar2 = myeVar.h;
                wcqVar2 = myeVar.g;
                aooc.af(objH);
                str = (java.lang.String) objH;
                myeVar.g = wcqVar2;
                myeVar.h = zjdVar2;
                myeVar.b = nmzVar;
                myeVar.i = str;
                myeVar.f = 3;
                objF = f(myeVar);
                if (objF != aoluVar) {
                    return aoluVar;
                }
                zjd zjdVar5 = zjdVar2;
                nmzVar2 = nmzVar;
                str2 = str;
                objH = objF;
                zjdVar3 = zjdVar5;
                iP = rsr.p((zna) objH);
                strCu = afsq.cu(nmzVar2);
                if (nmzVar2 instanceof defpackage.nmy) {
                    z2 = ((defpackage.nmy) nmzVar2).b;
                } else {
                    z2 = false;
                }
                myeVar.g = wcqVar2;
                myeVar.h = zjdVar3;
                myeVar.b = str2;
                myeVar.i = strCu;
                myeVar.c = iP;
                myeVar.a = z2;
                myeVar.f = 4;
                objI = i(myeVar);
                if (objI == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                wcqVar3 = wcqVar2;
                zjdVar4 = zjdVar3;
                str4 = strCu;
                z3 = z2;
                i = iP;
                objH = objI;
            } else if (i3 == 3) {
                str2 = myeVar.i;
                nmzVar2 = (defpackage.nmz) myeVar.b;
                zjd zjdVar6 = myeVar.h;
                wcq wcqVar4 = myeVar.g;
                aooc.af(objH);
                zjdVar3 = zjdVar6;
                wcqVar2 = wcqVar4;
                iP = rsr.p((zna) objH);
                strCu = afsq.cu(nmzVar2);
                if (nmzVar2 instanceof defpackage.nmy) {
                    z2 = ((defpackage.nmy) nmzVar2).b;
                } else {
                    z2 = false;
                }
                myeVar.g = wcqVar2;
                myeVar.h = zjdVar3;
                myeVar.b = str2;
                myeVar.i = strCu;
                myeVar.c = iP;
                myeVar.a = z2;
                myeVar.f = 4;
                objI = i(myeVar);
                if (objI == aoluVar) {
                    return aoluVar;
                }
                str3 = str2;
                wcqVar3 = wcqVar2;
                zjdVar4 = zjdVar3;
                str4 = strCu;
                z3 = z2;
                i = iP;
                objH = objI;
            } else {
                if (i3 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z4 = myeVar.a;
                int i4 = myeVar.c;
                java.lang.String str5 = myeVar.i;
                str3 = (java.lang.String) myeVar.b;
                zjd zjdVar7 = myeVar.h;
                wcq wcqVar5 = myeVar.g;
                aooc.af(objH);
                z3 = z4;
                str4 = str5;
                wcqVar3 = wcqVar5;
                zjdVar4 = zjdVar7;
                i = i4;
            }
            return new defpackage.myn(str3, i, str4, z3, (abwd) objH, this.b, wcqVar3, zjdVar4);
        }
        aooc.af(objH);
        myeVar.g = wcqVar;
        myeVar.h = zjdVar;
        myeVar.a = z;
        myeVar.f = 1;
        objH = h(myeVar);
        if (objH == aoluVar) {
            return aoluVar;
        }
        defpackage.nmz nmzVar3 = (defpackage.nmz) objH;
        if (z) {
            if (nmzVar3 instanceof defpackage.nmx) {
                int i5 = ((defpackage.nmx) nmzVar3).b - 1;
                if (i5 != 1) {
                    qbe qbeVar = this.l;
                    if (i5 != 2) {
                        qbeVar.a(qbc.cr);
                        this.k.b().l("com/android/dialer/dobby/impl/notification/missedcall/DobbyCallScopedMissedCallNotifier", "logBeeslyNotification", 203, "DobbyCallScopedMissedCallNotifier.kt").v("Fallback reason unexpected.");
                    } else {
                        qbeVar.a(qbc.cq);
                    }
                } else {
                    this.l.a(qbc.cp);
                }
            } else if (nmzVar3 instanceof defpackage.nmy) {
                this.l.a(qbc.cs);
            } else {
                if (!aooh.n(nmzVar3, defpackage.nmw.a)) {
                    throw new aois();
                }
                this.l.a(qbc.ct);
            }
            this.d.b(mce.gX);
        }
        myeVar.g = wcqVar;
        myeVar.h = zjdVar;
        myeVar.b = nmzVar3;
        myeVar.f = 2;
        java.lang.Object objG = g(myeVar);
        if (objG == aoluVar) {
            return aoluVar;
        }
        objH = objG;
        nmzVar = nmzVar3;
        zjd zjdVar8 = zjdVar;
        wcqVar2 = wcqVar;
        zjdVar2 = zjdVar8;
        str = (java.lang.String) objH;
        myeVar.g = wcqVar2;
        myeVar.h = zjdVar2;
        myeVar.b = nmzVar;
        myeVar.i = str;
        myeVar.f = 3;
        objF = f(myeVar);
        if (objF != aoluVar) {
            return aoluVar;
        }
        zjd zjdVar9 = zjdVar2;
        nmzVar2 = nmzVar;
        str2 = str;
        objH = objF;
        zjdVar3 = zjdVar9;
        iP = rsr.p((zna) objH);
        strCu = afsq.cu(nmzVar2);
        if (nmzVar2 instanceof defpackage.nmy) {
            z2 = ((defpackage.nmy) nmzVar2).b;
        } else {
            z2 = false;
        }
        myeVar.g = wcqVar2;
        myeVar.h = zjdVar3;
        myeVar.b = str2;
        myeVar.i = strCu;
        myeVar.c = iP;
        myeVar.a = z2;
        myeVar.f = 4;
        objI = i(myeVar);
        if (objI == aoluVar) {
            return aoluVar;
        }
        str3 = str2;
        wcqVar3 = wcqVar2;
        zjdVar4 = zjdVar3;
        str4 = strCu;
        z3 = z2;
        i = iP;
        objH = objI;
        return new defpackage.myn(str3, i, str4, z3, (abwd) objH, this.b, wcqVar3, zjdVar4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.myf myfVar;
        if (aolnVar instanceof defpackage.myf) {
            myfVar = (defpackage.myf) aolnVar;
            int i = myfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                myfVar.c = i - Integer.MIN_VALUE;
            } else {
                myfVar = new defpackage.myf(this, aolnVar);
            }
        } else {
            myfVar = new defpackage.myf(this, aolnVar);
        }
        java.lang.Object objD = myfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = myfVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.m.X();
            myfVar.c = 1;
            objD = aosv.D(ajcqVarX, myfVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.myc.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object d(aoln aolnVar) throws aois {
        defpackage.myg mygVar;
        int i;
        defpackage.mys mysVar;
        long j;
        defpackage.iqp iqpVar;
        wcq wcqVar;
        zjd zjdVarM;
        java.lang.Object objB;
        defpackage.mys mysVar2;
        int i2;
        long j2;
        defpackage.myn mynVar;
        if (aolnVar instanceof defpackage.myg) {
            mygVar = (defpackage.myg) aolnVar;
            int i3 = mygVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mygVar.e = i3 - Integer.MIN_VALUE;
            } else {
                mygVar = new defpackage.myg(this, aolnVar);
            }
        } else {
            mygVar = new defpackage.myg(this, aolnVar);
        }
        defpackage.myg mygVar2 = mygVar;
        java.lang.Object objA = mygVar2.c;
        aolu aoluVar = aolu.a;
        int i4 = mygVar2.e;
        int i5 = 2;
        if (i4 != 0) {
            if (i4 == 1) {
                aooc.af(objA);
            } else if (i4 == 2) {
                i = mygVar2.a;
                aooc.af(objA);
                boolean z = ((defpackage.nmz) objA) instanceof defpackage.nmy;
                if (((java.lang.Boolean) this.j.a()).booleanValue() && i == 0 && !z) {
                    i5 = 1;
                }
                mysVar = this.c;
                j = this.a;
                iqpVar = this.e;
                if (iqpVar.a()) {
                    wcqVar = wcq.a;
                } else {
                    wcqVar = null;
                }
                if (((java.lang.Boolean) this.h.a()).booleanValue() || !iqpVar.a()) {
                    zjdVarM = null;
                } else {
                    zoe zoeVarCp = aehj.cp(zjd.a.m());
                    zoeVarCp.o(zjc.b);
                    zoe zoeVarCq = aehj.cq(zjb.a.m());
                    zoeVarCq.r(j);
                    if (((java.lang.Boolean) this.i.a()).booleanValue()) {
                        zoeVarCq.q(1 == (i ^ 1));
                    }
                    zoeVarCp.n(zoeVarCq.p());
                    zjdVarM = zoeVarCp.m();
                }
                mygVar2.g = i5;
                mygVar2.f = mysVar;
                mygVar2.b = j;
                mygVar2.e = 3;
                objB = b(true, wcqVar, zjdVarM, mygVar2);
                if (objB != aoluVar) {
                    return aoluVar;
                }
                objA = objB;
                mysVar2 = mysVar;
                i2 = i5;
                j2 = j;
                mynVar = (defpackage.myn) objA;
                mygVar2.g = 0;
                mygVar2.f = null;
                mygVar2.e = 4;
                if (mysVar2.d(j2, mynVar, i2, mygVar2) == aoluVar) {
                    return aoluVar;
                }
            } else if (i4 == 3) {
                j2 = mygVar2.b;
                mysVar2 = mygVar2.f;
                int i6 = mygVar2.g;
                aooc.af(objA);
                i2 = i6;
                mynVar = (defpackage.myn) objA;
                mygVar2.g = 0;
                mygVar2.f = null;
                mygVar2.e = 4;
                if (mysVar2.d(j2, mynVar, i2, mygVar2) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i4 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aojh.a;
        }
        aooc.af(objA);
        long j3 = this.a;
        mygVar2.e = 1;
        objA = a(j3, mygVar2);
        if (objA == aoluVar) {
            return aoluVar;
        }
        i = !((java.lang.Boolean) objA).booleanValue() ? 1 : 0;
        mygVar2.a = i;
        mygVar2.e = 2;
        objA = h(mygVar2);
        if (objA == aoluVar) {
            return aoluVar;
        }
        boolean z2 = ((defpackage.nmz) objA) instanceof defpackage.nmy;
        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
            i5 = 1;
        }
        mysVar = this.c;
        j = this.a;
        iqpVar = this.e;
        if (iqpVar.a()) {
            wcqVar = wcq.a;
        } else {
            wcqVar = null;
        }
        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
            zjdVarM = null;
        } else {
            zjdVarM = null;
        }
        mygVar2.g = i5;
        mygVar2.f = mysVar;
        mygVar2.b = j;
        mygVar2.e = 3;
        objB = b(true, wcqVar, zjdVarM, mygVar2);
        if (objB != aoluVar) {
            return aoluVar;
        }
        objA = objB;
        mysVar2 = mysVar;
        i2 = i5;
        j2 = j;
        mynVar = (defpackage.myn) objA;
        mygVar2.g = 0;
        mygVar2.f = null;
        mygVar2.e = 4;
        if (mysVar2.d(j2, mynVar, i2, mygVar2) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) throws aois {
        defpackage.myh myhVar;
        long j;
        defpackage.mys mysVar;
        if (aolnVar instanceof defpackage.myh) {
            myhVar = (defpackage.myh) aolnVar;
            int i = myhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                myhVar.d = i - Integer.MIN_VALUE;
            } else {
                myhVar = new defpackage.myh(this, aolnVar);
            }
        } else {
            myhVar = new defpackage.myh(this, aolnVar);
        }
        defpackage.myh myhVar2 = myhVar;
        java.lang.Object obj = myhVar2.b;
        aolu aoluVar = aolu.a;
        int i2 = myhVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                j = myhVar2.a;
                defpackage.mys mysVar2 = myhVar2.e;
                aooc.af(obj);
                mysVar = mysVar2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.mys mysVar3 = this.c;
        j = this.a;
        myhVar2.e = mysVar3;
        myhVar2.a = j;
        myhVar2.d = 1;
        java.lang.Object objB = b(false, null, null, myhVar2);
        if (objB == aoluVar) {
            return aoluVar;
        }
        mysVar = mysVar3;
        obj = objB;
        myhVar2.e = null;
        myhVar2.d = 2;
        if (mysVar.d(j, (defpackage.myn) obj, 1, myhVar2) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.myi myiVar;
        if (aolnVar instanceof defpackage.myi) {
            myiVar = (defpackage.myi) aolnVar;
            int i = myiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                myiVar.c = i - Integer.MIN_VALUE;
            } else {
                myiVar = new defpackage.myi(this, aolnVar);
            }
        } else {
            myiVar = new defpackage.myi(this, aolnVar);
        }
        java.lang.Object objC = myiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = myiVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            myiVar.c = 1;
            objC = c(myiVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        aooc.af(objC);
        ajcq ajcqVarV = ((defpackage.myc) objC).v();
        myiVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarV, myiVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.myj myjVar;
        if (aolnVar instanceof defpackage.myj) {
            myjVar = (defpackage.myj) aolnVar;
            int i = myjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                myjVar.c = i - Integer.MIN_VALUE;
            } else {
                myjVar = new defpackage.myj(this, aolnVar);
            }
        } else {
            myjVar = new defpackage.myj(this, aolnVar);
        }
        java.lang.Object objC = myjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = myjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aooh.q((j$.util.Optional) objC);
        }
        aooc.af(objC);
        myjVar.c = 1;
        objC = c(myjVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBl = ((defpackage.myc) objC).bl();
        myjVar.c = 2;
        objC = aosv.D(ajcqVarBl, myjVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.myk mykVar;
        if (aolnVar instanceof defpackage.myk) {
            mykVar = (defpackage.myk) aolnVar;
            int i = mykVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mykVar.c = i - Integer.MIN_VALUE;
            } else {
                mykVar = new defpackage.myk(this, aolnVar);
            }
        } else {
            mykVar = new defpackage.myk(this, aolnVar);
        }
        java.lang.Object objC = mykVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mykVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            mykVar.c = 1;
            objC = c(mykVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        aooc.af(objC);
        ajcq ajcqVarAc = ((defpackage.myc) objC).ac();
        mykVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAc, mykVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.myl mylVar;
        if (aolnVar instanceof defpackage.myl) {
            mylVar = (defpackage.myl) aolnVar;
            int i = mylVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mylVar.c = i - Integer.MIN_VALUE;
            } else {
                mylVar = new defpackage.myl(this, aolnVar);
            }
        } else {
            mylVar = new defpackage.myl(this, aolnVar);
        }
        java.lang.Object objC = mylVar.a;
        aolu aoluVar = aolu.a;
        int i2 = mylVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            mylVar.c = 1;
            objC = c(mylVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objC);
            return objC;
        }
        aooc.af(objC);
        ajcq ajcqVarBh = ((defpackage.myc) objC).bh();
        mylVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarBh, mylVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }
}
