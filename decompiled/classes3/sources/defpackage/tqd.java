package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tqd implements defpackage.ywn {
    public final ojo b;
    public aonj c;
    private final aolr f;
    private final tmi g;
    private final defpackage.pqo h;
    private final defpackage.afpl i;
    private final aogc j;
    private static final java.util.Set d = ajsz.cW(new akfg[]{akfg.dS, akfg.O});
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerCallPreconditionDataProvider");
    private static final java.util.Set e = ajsz.cW(new defpackage.zpo[]{defpackage.zpo.f, defpackage.zpo.d, defpackage.zpo.c});

    public tqd(aolr aolrVar, defpackage.pqo pqoVar, ojo ojoVar, tmi tmiVar, aogc aogcVar, defpackage.afpl afplVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(pqoVar, "callDirection");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(tmiVar, "configProvider");
        aooh.f(aogcVar, "sharpieSettings");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        this.f = aolrVar;
        this.h = pqoVar;
        this.b = ojoVar;
        this.g = tmiVar;
        this.j = aogcVar;
        this.i = afplVar;
        this.c = new aiuo(new defpackage.sbm(this, (aoln) null, 17));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tpl tplVar;
        if (aolnVar instanceof defpackage.tpl) {
            tplVar = (defpackage.tpl) aolnVar;
            int i = tplVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tplVar.c = i - Integer.MIN_VALUE;
            } else {
                tplVar = new defpackage.tpl(this, aolnVar);
            }
        } else {
            tplVar = new defpackage.tpl(this, aolnVar);
        }
        java.lang.Object objD = tplVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tplVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.i.X();
            tplVar.c = 1;
            objD = aosv.D(ajcqVarX, tplVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.tpk.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.tpm tpmVar;
        if (aolnVar instanceof defpackage.tpm) {
            tpmVar = (defpackage.tpm) aolnVar;
            int i = tpmVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpmVar.c = i - Integer.MIN_VALUE;
            } else {
                tpmVar = new defpackage.tpm(this, aolnVar);
            }
        } else {
            tpmVar = new defpackage.tpm(this, aolnVar);
        }
        java.lang.Object objA = tpmVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpmVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return aooh.q((j$.util.Optional) objA);
        }
        aooc.af(objA);
        aonj aonjVar = this.c;
        tpmVar.c = 1;
        objA = aonjVar.a(tpmVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAz = ((defpackage.tpk) objA).az();
        tpmVar.c = 2;
        objA = aosv.D(ajcqVarAz, tpmVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Set] */
    @Override // defpackage.ywn
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tpn tpnVar;
        java.lang.Object obj;
        ?? r6;
        if (aolnVar instanceof defpackage.tpn) {
            tpnVar = (defpackage.tpn) aolnVar;
            int i = tpnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpnVar.d = i - Integer.MIN_VALUE;
            } else {
                tpnVar = new defpackage.tpn(this, aolnVar);
            }
        } else {
            tpnVar = new defpackage.tpn(this, aolnVar);
        }
        java.lang.Object objD = tpnVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tpnVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                java.lang.Object obj2 = tpnVar.a;
                aooc.af(objD);
                obj = obj2;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj3 = tpnVar.a;
                aooc.af(objD);
                r6 = obj3;
            }
            return new defpackage.ywl(java.lang.Boolean.valueOf(r6.contains(objD)));
        }
        aooc.af(objD);
        java.util.Set set = e;
        aonj aonjVar = this.c;
        tpnVar.a = set;
        tpnVar.d = 1;
        java.lang.Object objA = aonjVar.a(tpnVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        objD = objA;
        obj = set;
        ajcq ajcqVarY = ((defpackage.tpk) objD).y();
        tpnVar.a = obj;
        tpnVar.d = 2;
        objD = aosv.D(ajcqVarY, tpnVar);
        r6 = obj;
        if (objD == aoluVar) {
            return aoluVar;
        }
        return new defpackage.ywl(java.lang.Boolean.valueOf(r6.contains(objD)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.tpo tpoVar;
        if (aolnVar instanceof defpackage.tpo) {
            tpoVar = (defpackage.tpo) aolnVar;
            int i = tpoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpoVar.c = i - Integer.MIN_VALUE;
            } else {
                tpoVar = new defpackage.tpo(this, aolnVar);
            }
        } else {
            tpoVar = new defpackage.tpo(this, aolnVar);
        }
        java.lang.Object objA = tpoVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpoVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpoVar.c = 1;
            objA = aonjVar.a(tpoVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAB = ((defpackage.tpk) objA).aB();
        tpoVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAB, tpoVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.tpp tppVar;
        if (aolnVar instanceof defpackage.tpp) {
            tppVar = (defpackage.tpp) aolnVar;
            int i = tppVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tppVar.c = i - Integer.MIN_VALUE;
            } else {
                tppVar = new defpackage.tpp(this, aolnVar);
            }
        } else {
            tppVar = new defpackage.tpp(this, aolnVar);
        }
        java.lang.Object objA = tppVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tppVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tppVar.c = 1;
            objA = aonjVar.a(tppVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAC = ((defpackage.tpk) objA).aC();
        tppVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAC, tppVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.tpq tpqVar;
        if (aolnVar instanceof defpackage.tpq) {
            tpqVar = (defpackage.tpq) aolnVar;
            int i = tpqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpqVar.c = i - Integer.MIN_VALUE;
            } else {
                tpqVar = new defpackage.tpq(this, aolnVar);
            }
        } else {
            tpqVar = new defpackage.tpq(this, aolnVar);
        }
        java.lang.Object objA = tpqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpqVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpqVar.c = 1;
            objA = aonjVar.a(tpqVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAG = ((defpackage.tpk) objA).aG();
        tpqVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAG, tpqVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.tpr tprVar;
        if (aolnVar instanceof defpackage.tpr) {
            tprVar = (defpackage.tpr) aolnVar;
            int i = tprVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tprVar.c = i - Integer.MIN_VALUE;
            } else {
                tprVar = new defpackage.tpr(this, aolnVar);
            }
        } else {
            tprVar = new defpackage.tpr(this, aolnVar);
        }
        java.lang.Object objA = tprVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tprVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return new defpackage.ywl(objA);
        }
        aooc.af(objA);
        aonj aonjVar = this.c;
        tprVar.c = 1;
        objA = aonjVar.a(tprVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAH = ((defpackage.tpk) objA).aH();
        tprVar.c = 2;
        objA = aosv.D(ajcqVarAH, tprVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        return new defpackage.ywl(objA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.tps tpsVar;
        if (aolnVar instanceof defpackage.tps) {
            tpsVar = (defpackage.tps) aolnVar;
            int i = tpsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpsVar.c = i - Integer.MIN_VALUE;
            } else {
                tpsVar = new defpackage.tps(this, aolnVar);
            }
        } else {
            tpsVar = new defpackage.tps(this, aolnVar);
        }
        java.lang.Object objA = tpsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpsVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpsVar.c = 1;
            objA = aonjVar.a(tpsVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAI = ((defpackage.tpk) objA).aI();
        tpsVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAI, tpsVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.tpt tptVar;
        if (aolnVar instanceof defpackage.tpt) {
            tptVar = (defpackage.tpt) aolnVar;
            int i = tptVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tptVar.c = i - Integer.MIN_VALUE;
            } else {
                tptVar = new defpackage.tpt(this, aolnVar);
            }
        } else {
            tptVar = new defpackage.tpt(this, aolnVar);
        }
        java.lang.Object objD = tptVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tptVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVar = this.h.b;
            aooh.e(ajcqVar, "getDirection(...)");
            tptVar.c = 1;
            objD = aosv.D(ajcqVar, tptVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        return java.lang.Boolean.valueOf(objD == defpackage.zmy.b);
    }

    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object j(aoln aolnVar) {
        defpackage.tpu tpuVar;
        java.lang.Object objAj;
        if (aolnVar instanceof defpackage.tpu) {
            tpuVar = (defpackage.tpu) aolnVar;
            int i = tpuVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpuVar.c = i - Integer.MIN_VALUE;
            } else {
                tpuVar = new defpackage.tpu(this, aolnVar);
            }
        } else {
            tpuVar = new defpackage.tpu(this, aolnVar);
        }
        java.lang.Object objA = tpuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpuVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpuVar.d = this;
            tpuVar.c = 1;
            objA = aonjVar.a(tpuVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 == 1) {
            this = tpuVar.d;
            aooc.af(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
                return objA;
            }
            this = tpuVar.d;
            aooc.af(objA);
        }
        java.lang.String str = (java.lang.String) aooh.q((j$.util.Optional) objA);
        tpuVar.d = null;
        tpuVar.c = 3;
        objAj = aoov.aj(this.f, new defpackage.tkz(str, this, (aoln) null, 7), tpuVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
        ajcq ajcqVarBl = ((defpackage.tpk) objA).bl();
        tpuVar.d = this;
        tpuVar.c = 2;
        objA = aosv.D(ajcqVarBl, tpuVar);
        if (objA != aoluVar) {
            java.lang.String str2 = (java.lang.String) aooh.q((j$.util.Optional) objA);
            tpuVar.d = null;
            tpuVar.c = 3;
            objAj = aoov.aj(this.f, new defpackage.tkz(str2, this, (aoln) null, 7), tpuVar);
            if (objAj != aoluVar) {
                return objAj;
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object k(aoln aolnVar) {
        defpackage.tpv tpvVar;
        if (aolnVar instanceof defpackage.tpv) {
            tpvVar = (defpackage.tpv) aolnVar;
            int i = tpvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpvVar.c = i - Integer.MIN_VALUE;
            } else {
                tpvVar = new defpackage.tpv(this, aolnVar);
            }
        } else {
            tpvVar = new defpackage.tpv(this, aolnVar);
        }
        java.lang.Object objA = tpvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpvVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpvVar.c = 1;
            objA = aonjVar.a(tpvVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAM = ((defpackage.tpk) objA).aM();
        tpvVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAM, tpvVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object l(aoln aolnVar) {
        defpackage.tpw tpwVar;
        defpackage.trv trvVar;
        if (aolnVar instanceof defpackage.tpw) {
            tpwVar = (defpackage.tpw) aolnVar;
            int i = tpwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpwVar.c = i - Integer.MIN_VALUE;
            } else {
                tpwVar = new defpackage.tpw(this, aolnVar);
            }
        } else {
            tpwVar = new defpackage.tpw(this, aolnVar);
        }
        java.lang.Object obj = tpwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aogc aogcVar = this.j;
            defpackage.trv trvVar2 = defpackage.trv.a;
            tpwVar.d = trvVar2;
            tpwVar.c = 1;
            java.lang.Object objAu = aogcVar.au(tpwVar);
            if (objAu == aoluVar) {
                return aoluVar;
            }
            obj = objAu;
            trvVar = trvVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            trvVar = tpwVar.d;
            aooc.af(obj);
        }
        defpackage.trt trtVarB = defpackage.trt.b(((tru) obj).c);
        if (trtVarB == null) {
            trtVarB = defpackage.trt.UNRECOGNIZED;
        }
        return new defpackage.ywl(java.lang.Boolean.valueOf(trvVar.b(trtVarB)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object m(aoln aolnVar) {
        defpackage.tpx tpxVar;
        if (aolnVar instanceof defpackage.tpx) {
            tpxVar = (defpackage.tpx) aolnVar;
            int i = tpxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpxVar.c = i - Integer.MIN_VALUE;
            } else {
                tpxVar = new defpackage.tpx(this, aolnVar);
            }
        } else {
            tpxVar = new defpackage.tpx(this, aolnVar);
        }
        java.lang.Object objA = tpxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpxVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpxVar.c = 1;
            objA = aonjVar.a(tpxVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAN = ((defpackage.tpk) objA).aN();
        tpxVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAN, tpxVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object n(aoln aolnVar) {
        defpackage.tpy tpyVar;
        java.lang.Object objD;
        if (aolnVar instanceof defpackage.tpy) {
            tpyVar = (defpackage.tpy) aolnVar;
            int i = tpyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpyVar.c = i - Integer.MIN_VALUE;
            } else {
                tpyVar = new defpackage.tpy(this, aolnVar);
            }
        } else {
            tpyVar = new defpackage.tpy(this, aolnVar);
        }
        java.lang.Object objR = tpyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpyVar.c;
        if (i2 == 0) {
            aooc.af(objR);
            tpyVar.c = 1;
            objR = r(tpyVar);
            if (objR != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 == 1) {
            aooc.af(objR);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objR);
                return objR;
            }
            aooc.af(objR);
        }
        ajcq ajcqVarAQ = ((defpackage.tpk) objR).aQ();
        tpyVar.c = 3;
        objD = aosv.D(ajcqVarAQ, tpyVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
        if (!((java.lang.Boolean) objR).booleanValue()) {
            return java.lang.Boolean.FALSE;
        }
        aonj aonjVar = this.c;
        tpyVar.c = 2;
        objR = aonjVar.a(tpyVar);
        if (objR != aoluVar) {
            ajcq ajcqVarAQ2 = ((defpackage.tpk) objR).aQ();
            tpyVar.c = 3;
            objD = aosv.D(ajcqVarAQ2, tpyVar);
            if (objD != aoluVar) {
                return objD;
            }
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object o(aoln aolnVar) {
        defpackage.tpz tpzVar;
        if (aolnVar instanceof defpackage.tpz) {
            tpzVar = (defpackage.tpz) aolnVar;
            int i = tpzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tpzVar.c = i - Integer.MIN_VALUE;
            } else {
                tpzVar = new defpackage.tpz(this, aolnVar);
            }
        } else {
            tpzVar = new defpackage.tpz(this, aolnVar);
        }
        java.lang.Object objA = tpzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tpzVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tpzVar.c = 1;
            objA = aonjVar.a(tpzVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAR = ((defpackage.tpk) objA).aR();
        tpzVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAR, tpzVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object p(aoln aolnVar) {
        defpackage.tqa tqaVar;
        if (aolnVar instanceof defpackage.tqa) {
            tqaVar = (defpackage.tqa) aolnVar;
            int i = tqaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqaVar.c = i - Integer.MIN_VALUE;
            } else {
                tqaVar = new defpackage.tqa(this, aolnVar);
            }
        } else {
            tqaVar = new defpackage.tqa(this, aolnVar);
        }
        java.lang.Object objA = tqaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqaVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            aonj aonjVar = this.c;
            tqaVar.c = 1;
            objA = aonjVar.a(tqaVar);
            if (objA != aoluVar) {
            }
            return aoluVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objA);
            return objA;
        }
        aooc.af(objA);
        ajcq ajcqVarAU = ((defpackage.tpk) objA).aU();
        tqaVar.c = 2;
        java.lang.Object objD = aosv.D(ajcqVarAU, tqaVar);
        if (objD != aoluVar) {
            return objD;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ywn
    public final java.lang.Object q(aoln aolnVar) {
        defpackage.tqb tqbVar;
        if (aolnVar instanceof defpackage.tqb) {
            tqbVar = (defpackage.tqb) aolnVar;
            int i = tqbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqbVar.c = i - Integer.MIN_VALUE;
            } else {
                tqbVar = new defpackage.tqb(this, aolnVar);
            }
        } else {
            tqbVar = new defpackage.tqb(this, aolnVar);
        }
        java.lang.Object objA = tqbVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tqbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objA);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objA);
            }
            return new defpackage.ywl(aooh.q((j$.util.Optional) objA));
        }
        aooc.af(objA);
        aonj aonjVar = this.c;
        tqbVar.c = 1;
        objA = aonjVar.a(tqbVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBw = ((defpackage.tpk) objA).bw();
        tqbVar.c = 2;
        objA = aosv.D(ajcqVarBw, tqbVar);
        if (objA == aoluVar) {
            return aoluVar;
        }
        return new defpackage.ywl(aooh.q((j$.util.Optional) objA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final java.lang.Object r(aoln aolnVar) {
        defpackage.tqc tqcVar;
        ?? r8;
        if (aolnVar instanceof defpackage.tqc) {
            tqcVar = (defpackage.tqc) aolnVar;
            int i = tqcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqcVar.d = i - Integer.MIN_VALUE;
            } else {
                tqcVar = new defpackage.tqc(this, aolnVar);
            }
        } else {
            tqcVar = new defpackage.tqc(this, aolnVar);
        }
        java.lang.Object obj = tqcVar.b;
        aolu aoluVar = aolu.a;
        int i2 = tqcVar.d;
        if (i2 == 0) {
            aooc.af(obj);
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/service/preconditions/SharpieDialerCallPreconditionDataProvider", "shouldRunStirShakenPreconditions", 125, "SharpieDialerCallPreconditionDataProvider.kt").v("Checking if the detection region is supported for stir shaken for sharpie preconditions.");
            tmi tmiVar = this.g;
            java.util.Set set = d;
            tqcVar.a = set;
            tqcVar.d = 1;
            java.lang.Object objB = tmiVar.b(tqcVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            obj = objB;
            r8 = set;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj2 = tqcVar.a;
            aooc.af(obj);
            r8 = obj2;
        }
        return java.lang.Boolean.valueOf(r8.contains(((defpackage.yuw) obj).b.b));
    }
}
