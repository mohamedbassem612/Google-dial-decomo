package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ukg {
    public final aoss a;
    public defpackage.uji b;
    public final defpackage.znp c;
    public final defpackage.znv d;
    private final defpackage.ujk e;
    private final j$.util.Optional f;
    private final uhs g;
    private final defpackage.qbe h;
    private final defpackage.pqo i;
    private final apdp j;
    private final hgw k;
    private final defpackage.afpl l;

    public ukg(defpackage.ujk ujkVar, defpackage.afpl afplVar, uhs uhsVar, defpackage.qbe qbeVar, j$.util.Optional optional, hgw hgwVar, aoss aossVar, defpackage.pqo pqoVar) {
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(optional, "spamNotificationSender");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(pqoVar, "callDirection");
        this.e = ujkVar;
        this.l = afplVar;
        this.g = uhsVar;
        this.h = qbeVar;
        this.f = optional;
        this.k = hgwVar;
        this.a = aossVar;
        this.i = pqoVar;
        this.j = new apdp();
        this.b = new defpackage.ujh(defpackage.ujg.c);
        this.c = new ler(this, 15);
        this.d = new ooa(this, 9);
    }

    private final java.lang.Object j(aoln aolnVar) {
        return aosv.D(a().aN(), aolnVar);
    }

    private final java.lang.Object k(aoln aolnVar) {
        return aosv.D(a().bF(), aolnVar);
    }

    private final java.lang.Object l(defpackage.ukm ukmVar, aoln aolnVar) {
        java.lang.Object objF;
        defpackage.uyg uygVar = (defpackage.uyg) aooh.q(this.f);
        return (uygVar == null || (objF = uygVar.f(ukmVar, aolnVar)) != aolu.a) ? aojh.a : objF;
    }

    private final boolean m(long j) {
        return ((long) ((java.util.Random) this.k.a).nextInt(100)) >= j;
    }

    public final defpackage.ujw a() {
        java.lang.Object objAr = aooc.ar(this.l.Y(), defpackage.ujw.class);
        aooh.e(objAr, "get(...)");
        return (defpackage.ujw) objAr;
    }

    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.ujx ujxVar;
        defpackage.ujk ujkVar;
        java.lang.String str;
        java.lang.Object objAj;
        if (aolnVar instanceof defpackage.ujx) {
            ujxVar = (defpackage.ujx) aolnVar;
            int i = ujxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujxVar.c = i - Integer.MIN_VALUE;
            } else {
                ujxVar = new defpackage.ujx(this, aolnVar);
            }
        } else {
            ujxVar = new defpackage.ujx(this, aolnVar);
        }
        java.lang.Object objC = ujxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujxVar.c;
        if (i2 == 0) {
            aooc.af(objC);
            ujxVar.c = 1;
            objC = c(ujxVar);
            if (objC != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 == 1) {
            aooc.af(objC);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
                return objC;
            }
            java.lang.String str2 = ujxVar.e;
            ujkVar = ujxVar.d;
            aooc.af(objC);
            str = str2;
        }
        defpackage.ujk ujkVar2 = ujkVar;
        ujxVar.d = null;
        ujxVar.e = null;
        ujxVar.c = 3;
        objAj = aoov.aj(ujkVar2.c, new defpackage.ugg(ujkVar2, str, (java.lang.String) objC, (aoln) null, 7), ujxVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
        java.lang.String str3 = (java.lang.String) objC;
        if (str3 == null) {
            return new defpackage.ujh(defpackage.ujg.d);
        }
        ujkVar = this.e;
        ujxVar.d = ujkVar;
        ujxVar.e = str3;
        ujxVar.c = 2;
        java.lang.Object objD = d(ujxVar);
        if (objD != aoluVar) {
            str = str3;
            objC = objD;
            defpackage.ujk ujkVar3 = ujkVar;
            ujxVar.d = null;
            ujxVar.e = null;
            ujxVar.c = 3;
            objAj = aoov.aj(ujkVar3.c, new defpackage.ugg(ujkVar3, str, (java.lang.String) objC, (aoln) null, 7), ujxVar);
            if (objAj != aoluVar) {
                return objAj;
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.ujy ujyVar;
        if (aolnVar instanceof defpackage.ujy) {
            ujyVar = (defpackage.ujy) aolnVar;
            int i = ujyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujyVar.c = i - Integer.MIN_VALUE;
            } else {
                ujyVar = new defpackage.ujy(this, aolnVar);
            }
        } else {
            ujyVar = new defpackage.ujy(this, aolnVar);
        }
        java.lang.Object objD = ujyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujyVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarBl = a().bl();
            ujyVar.c = 1;
            objD = aosv.D(ajcqVarBl, ujyVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.ujz ujzVar;
        if (aolnVar instanceof defpackage.ujz) {
            ujzVar = (defpackage.ujz) aolnVar;
            int i = ujzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ujzVar.c = i - Integer.MIN_VALUE;
            } else {
                ujzVar = new defpackage.ujz(this, aolnVar);
            }
        } else {
            ujzVar = new defpackage.ujz(this, aolnVar);
        }
        java.lang.Object objD = ujzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ujzVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarBB = a().bB();
            ujzVar.c = 1;
            objD = aosv.D(ajcqVarBB, ujzVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) throws java.lang.Throwable {
        defpackage.uka ukaVar;
        apdp apdpVar;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.uka) {
            ukaVar = (defpackage.uka) aolnVar;
            int i = ukaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukaVar.c = i - Integer.MIN_VALUE;
            } else {
                ukaVar = new defpackage.uka(this, aolnVar);
            }
        } else {
            ukaVar = new defpackage.uka(this, aolnVar);
        }
        java.lang.Object obj = ukaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ukaVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.j;
                ukaVar.e = apdpVar;
                ukaVar.c = 1;
                if (apdpVar.b(ukaVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    this = ukaVar.d;
                    apdpVar2 = ukaVar.e;
                    try {
                        aooc.af(obj);
                        this.b = (defpackage.uji) obj;
                        apdpVar2.d();
                        return aojh.a;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdp apdpVar3 = ukaVar.e;
                aooc.af(obj);
                apdpVar = apdpVar3;
            }
            ukaVar.e = apdpVar;
            ukaVar.d = this;
            ukaVar.c = 2;
            java.lang.Object objB = b(ukaVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            apdpVar2 = apdpVar;
            obj = objB;
            this.b = (defpackage.uji) obj;
            apdpVar2.d();
            return aojh.a;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.ukb ukbVar;
        qbc qbcVar;
        if (aolnVar instanceof defpackage.ukb) {
            ukbVar = (defpackage.ukb) aolnVar;
            int i = ukbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukbVar.c = i - Integer.MIN_VALUE;
            } else {
                ukbVar = new defpackage.ukb(this, aolnVar);
            }
        } else {
            ukbVar = new defpackage.ukb(this, aolnVar);
        }
        java.lang.Object objD = ukbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ukbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            if (((java.lang.Boolean) objD).booleanValue()) {
                qbcVar = qbc.fL;
            } else {
                qbcVar = qbc.fM;
            }
            this.h.a(qbcVar);
            return aojh.a;
        }
        aooc.af(objD);
        ajcq ajcqVar = this.i.b;
        aooh.e(ajcqVar, "getDirection(...)");
        ukbVar.c = 1;
        objD = aosv.D(ajcqVar, ukbVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (objD != defpackage.zmy.a) {
            return aojh.a;
        }
        ukbVar.c = 2;
        objD = j(ukbVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objD).booleanValue()) {
            qbcVar = qbc.fL;
        } else {
            qbcVar = qbc.fM;
        }
        this.h.a(qbcVar);
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.ukc ukcVar;
        if (aolnVar instanceof defpackage.ukc) {
            ukcVar = (defpackage.ukc) aolnVar;
            int i = ukcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukcVar.c = i - Integer.MIN_VALUE;
            } else {
                ukcVar = new defpackage.ukc(this, aolnVar);
            }
        } else {
            ukcVar = new defpackage.ukc(this, aolnVar);
        }
        java.lang.Object objK = ukcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ukcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                this = ukcVar.d;
                aooc.af(objK);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            return aojh.a;
        }
        aooc.af(objK);
        boolean zM = m(((java.lang.Long) this.g.c.a()).longValue());
        defpackage.qbe qbeVar = this.h;
        if (zM) {
            qbeVar.a(qbc.fK);
            return aojh.a;
        }
        qbeVar.a(qbc.fJ);
        ukcVar.d = this;
        ukcVar.c = 1;
        objK = k(ukcVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        defpackage.ukj ukjVar = new defpackage.ukj((defpackage.uku) objK);
        ukcVar.d = null;
        ukcVar.c = 2;
        if (this.l(ukjVar, ukcVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.ukd ukdVar;
        if (aolnVar instanceof defpackage.ukd) {
            ukdVar = (defpackage.ukd) aolnVar;
            int i = ukdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukdVar.c = i - Integer.MIN_VALUE;
            } else {
                ukdVar = new defpackage.ukd(this, aolnVar);
            }
        } else {
            ukdVar = new defpackage.ukd(this, aolnVar);
        }
        java.lang.Object objK = ukdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ukdVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                this = ukdVar.d;
                aooc.af(objK);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objK);
            }
            return aojh.a;
        }
        aooc.af(objK);
        boolean zM = m(((java.lang.Long) this.g.b.a()).longValue());
        defpackage.qbe qbeVar = this.h;
        if (zM) {
            qbeVar.a(qbc.fI);
            return aojh.a;
        }
        qbeVar.a(qbc.fH);
        ukdVar.d = this;
        ukdVar.c = 1;
        objK = k(ukdVar);
        if (objK == aoluVar) {
            return aoluVar;
        }
        defpackage.ukl uklVar = new defpackage.ukl((defpackage.uku) objK);
        ukdVar.d = null;
        ukdVar.c = 2;
        if (this.l(uklVar, ukdVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.ukf ukfVar;
        if (aolnVar instanceof defpackage.ukf) {
            ukfVar = (defpackage.ukf) aolnVar;
            int i = ukfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukfVar.c = i - Integer.MIN_VALUE;
            } else {
                ukfVar = new defpackage.ukf(this, aolnVar);
            }
        } else {
            ukfVar = new defpackage.ukf(this, aolnVar);
        }
        java.lang.Object objJ = ukfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ukfVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objJ);
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objJ);
            }
            return aojh.a;
        }
        aooc.af(objJ);
        ukfVar.c = 1;
        objJ = j(ukfVar);
        if (objJ == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objJ).booleanValue()) {
            ukfVar.c = 2;
            if (h(ukfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            ukfVar.c = 3;
            if (g(ukfVar) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }
}
