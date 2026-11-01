package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lsn implements znv, defpackage.luc, zoi, znp {
    public static final aimz a = aimz.i("com/android/dialer/contactchecker/receiver/impl/service/ContactCheckerReceiverController");
    public final aoss b;
    public final java.util.concurrent.ScheduledExecutorService c;
    public final defpackage.lug d;
    public final aoin e;
    public final aoin f;
    public final aoin g;
    public final aoin h;
    public final aoin i;
    public final rlv j;
    public final defpackage.mba k;
    public final defpackage.lrc l;
    public final lrb m;
    public final defpackage.lrh n;
    public defpackage.hkd o;
    public boolean p;
    public boolean q;
    public java.lang.Long r;
    public boolean s;
    public final zpz t;
    public final kaw u;
    public final ahda v;
    private final long w;
    private final rsr x;
    private final afpl y;

    public lsn(aoss aossVar, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.lug lugVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, aoin aoinVar5, rlv rlvVar, defpackage.mba mbaVar, rsr rsrVar, afpl afplVar, zpz zpzVar, defpackage.lrc lrcVar, aazc aazcVar, long j, kaw kawVar, lrb lrbVar, defpackage.lrh lrhVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(scheduledExecutorService, "scheduledService");
        aooh.f(lugVar, "remote");
        aooh.f(aoinVar, "waitingInSecond");
        aooh.f(aoinVar2, "enableHapticsSound");
        aooh.f(aoinVar3, "enableCallForwardDebug");
        aooh.f(aoinVar4, "enableStirShakenSpoofMitigation");
        aooh.f(aoinVar5, "disableReceiverSpoofAlerts");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(lrcVar, "inCallLogger");
        aooh.f(aazcVar, "clock");
        this.b = aossVar;
        this.c = scheduledExecutorService;
        this.d = lugVar;
        this.e = aoinVar;
        this.f = aoinVar2;
        this.g = aoinVar3;
        this.h = aoinVar4;
        this.i = aoinVar5;
        this.j = rlvVar;
        this.k = mbaVar;
        this.x = rsrVar;
        this.y = afplVar;
        this.t = zpzVar;
        this.l = lrcVar;
        this.w = j;
        this.u = kawVar;
        this.m = lrbVar;
        this.n = lrhVar;
        this.v = new ahda((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.lse lseVar;
        if (aolnVar instanceof defpackage.lse) {
            lseVar = (defpackage.lse) aolnVar;
            int i = lseVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lseVar.c = i - Integer.MIN_VALUE;
            } else {
                lseVar = new defpackage.lse(this, aolnVar);
            }
        } else {
            lseVar = new defpackage.lse(this, aolnVar);
        }
        java.lang.Object objD = lseVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lseVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.y.X();
            lseVar.c = 1;
            objD = aosv.D(ajcqVarX, lseVar);
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
        ajcq ajcqVarT = ((defpackage.lsd) aooc.ar(objD, defpackage.lsd.class)).t();
        lseVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarT, lseVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.lsf lsfVar;
        if (aolnVar instanceof defpackage.lsf) {
            lsfVar = (defpackage.lsf) aolnVar;
            int i = lsfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsfVar.c = i - Integer.MIN_VALUE;
            } else {
                lsfVar = new defpackage.lsf(this, aolnVar);
            }
        } else {
            lsfVar = new defpackage.lsf(this, aolnVar);
        }
        java.lang.Object objD = lsfVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lsfVar.c;
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
        ajcq ajcqVarX = this.y.X();
        lsfVar.c = 1;
        objD = aosv.D(ajcqVarX, lsfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAj = ((defpackage.lsd) aooc.ar(objD, defpackage.lsd.class)).aj();
        lsfVar.c = 2;
        objD = aosv.D(ajcqVarAj, lsfVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    public final void eh() {
        ahvr.ag(this.b, this.v, new defpackage.ksy(this, (aoln) null, 17, (byte[]) null));
    }

    public final ajcq ej() {
        return aosv.C(ahvr.ag(this.b, this.v, new defpackage.hqi(this, (aoln) null, 19)));
    }

    public final ajcq ek() {
        return aosv.C(ahvr.ag(this.b, this.v, new defpackage.ksy(this, (aoln) null, 16)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(aoln aolnVar) {
        defpackage.lsg lsgVar;
        if (aolnVar instanceof defpackage.lsg) {
            lsgVar = (defpackage.lsg) aolnVar;
            int i = lsgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsgVar.c = i - Integer.MIN_VALUE;
            } else {
                lsgVar = new defpackage.lsg(this, aolnVar);
            }
        } else {
            lsgVar = new defpackage.lsg(this, aolnVar);
        }
        java.lang.Object objD = lsgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lsgVar.c;
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
        ajcq ajcqVarX = this.y.X();
        lsgVar.c = 1;
        objD = aosv.D(ajcqVarX, lsgVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarAW = ((defpackage.lsd) aooc.ar(objD, defpackage.lsd.class)).aW();
        lsgVar.c = 2;
        objD = aosv.D(ajcqVarAW, lsgVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.lsh lshVar;
        if (aolnVar instanceof defpackage.lsh) {
            lshVar = (defpackage.lsh) aolnVar;
            int i = lshVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lshVar.c = i - Integer.MIN_VALUE;
            } else {
                lshVar = new defpackage.lsh(this, aolnVar);
            }
        } else {
            lshVar = new defpackage.lsh(this, aolnVar);
        }
        java.lang.Object objD = lshVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lshVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.y.X();
            lshVar.c = 1;
            objD = aosv.D(ajcqVarX, lshVar);
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
        ajcq ajcqVarR = ((defpackage.lsd) aooc.ar(objD, defpackage.lsd.class)).R();
        lshVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarR, lshVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v2, types: [aolr, java.lang.Object] */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.lsi lsiVar;
        defpackage.hkd hkdVar;
        if (aolnVar instanceof defpackage.lsi) {
            lsiVar = (defpackage.lsi) aolnVar;
            int i = lsiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsiVar.c = i - Integer.MIN_VALUE;
            } else {
                lsiVar = new defpackage.lsi(this, aolnVar);
            }
        } else {
            lsiVar = new defpackage.lsi(this, aolnVar);
        }
        java.lang.Object obj = lsiVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lsiVar.c;
        java.lang.Boolean boolValueOf = null;
        boolean zBooleanValue = false;
        boolean z = true;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.hkd hkdVar2 = this.o;
            if (hkdVar2 != null) {
                rsr rsrVar = this.x;
                lsiVar.d = hkdVar2;
                lsiVar.c = 1;
                java.lang.Object objAj = aoov.aj((aolr) rsrVar.a, new defpackage.ksy(rsrVar, (aoln) null, 13), lsiVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                obj = objAj;
                hkdVar = hkdVar2;
            }
            return java.lang.Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        hkdVar = lsiVar.d;
        aooc.af(obj);
        defpackage.ltj ltjVar = (defpackage.ltj) ((java.util.Map) obj).get(hkdVar.c);
        if (ltjVar != null) {
            if (ltjVar != defpackage.ltj.VERIFIED && ltjVar != defpackage.ltj.SPOOFED) {
                z = false;
            }
            boolValueOf = java.lang.Boolean.valueOf(z);
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        }
        return java.lang.Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.lsj lsjVar;
        if (aolnVar instanceof defpackage.lsj) {
            lsjVar = (defpackage.lsj) aolnVar;
            int i = lsjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lsjVar.c = i - Integer.MIN_VALUE;
            } else {
                lsjVar = new defpackage.lsj(this, aolnVar);
            }
        } else {
            lsjVar = new defpackage.lsj(this, aolnVar);
        }
        java.lang.Object objD = lsjVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lsjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objD);
            }
            return java.lang.Boolean.valueOf(objD == ztf.b);
        }
        aooc.af(objD);
        ajcq ajcqVarX = this.y.X();
        lsjVar.c = 1;
        objD = aosv.D(ajcqVarX, lsjVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBJ = ((defpackage.lsd) aooc.ar(objD, defpackage.lsd.class)).bJ();
        lsjVar.c = 2;
        objD = aosv.D(ajcqVarBJ, lsjVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return java.lang.Boolean.valueOf(objD == ztf.b);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.ltj ltjVar, aoln aolnVar) {
        defpackage.lsk lskVar;
        defpackage.hkd hkdVar;
        rsr rsrVar;
        long j;
        java.lang.String str;
        if (aolnVar instanceof defpackage.lsk) {
            lskVar = (defpackage.lsk) aolnVar;
            int i = lskVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lskVar.c = i - Integer.MIN_VALUE;
            } else {
                lskVar = new defpackage.lsk(this, aolnVar);
            }
        } else {
            lskVar = new defpackage.lsk(this, aolnVar);
        }
        java.lang.Object obj = lskVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lskVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            hkdVar = this.o;
            if (hkdVar != null) {
                rsr rsrVar2 = this.x;
                java.lang.String str2 = hkdVar.c;
                aooh.e(str2, "getNormalizedNumber(...)");
                lskVar.d = ltjVar;
                lskVar.e = hkdVar;
                lskVar.c = 1;
                if (rsrVar2.Q(str2, ltjVar, lskVar) == aoluVar) {
                    return aoluVar;
                }
                if (ltjVar == defpackage.ltj.SPOOFED) {
                    rsrVar = this.x;
                    j = this.w;
                    str = hkdVar.c;
                    aooh.e(str, "getNormalizedNumber(...)");
                    lskVar.d = null;
                    lskVar.e = null;
                    lskVar.c = 2;
                    if (rsrVar.R(j, str, lskVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
        } else if (i2 == 1) {
            defpackage.hkd hkdVar2 = lskVar.e;
            defpackage.ltj ltjVar2 = lskVar.d;
            aooc.af(obj);
            hkdVar = hkdVar2;
            ltjVar = ltjVar2;
            if (ltjVar == defpackage.ltj.SPOOFED) {
                rsrVar = this.x;
                j = this.w;
                str = hkdVar.c;
                aooh.e(str, "getNormalizedNumber(...)");
                lskVar.d = null;
                lskVar.e = null;
                lskVar.c = 2;
                if (rsrVar.R(j, str, lskVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    @Override // defpackage.luc
    public final java.lang.Object k(defpackage.ltu ltuVar, aoln aolnVar) {
        ahvr.ag(this.b, this.v, new defpackage.lsl(ltuVar, this, null));
        return aojh.a;
    }
}
