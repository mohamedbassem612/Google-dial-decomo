package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tcc {
    private static final defpackage.aimz b = defpackage.aimz.i("com/android/dialer/reverselookup/settings/DataStoreReverseLookupSettings");
    public final defpackage.aoss a;
    private final defpackage.ecx c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.zjm f;
    private final defpackage.zzx g;

    public tcc(defpackage.aoss aossVar, defpackage.ecx ecxVar, defpackage.zzx zzxVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.zjm zjmVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(ecxVar, "dataStore");
        defpackage.aooh.f(aoinVar, "enableCallerIdAndSpam");
        defpackage.aooh.f(aoinVar2, "enableCallerIdAndSpamModern");
        this.a = aossVar;
        this.c = ecxVar;
        this.g = zzxVar;
        this.d = aoinVar;
        this.e = aoinVar2;
        this.f = zjmVar;
    }

    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.a, 0, new defpackage.mev(this, (defpackage.aoln) null, 20), 3);
    }

    public final defpackage.ajcq b(boolean z) {
        return defpackage.aosv.F(this.a, 0, new jbu(this, z, (defpackage.aoln) null, 14, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.aoln aolnVar) {
        defpackage.tbw tbwVar;
        if (aolnVar instanceof defpackage.tbw) {
            tbwVar = (defpackage.tbw) aolnVar;
            int i = tbwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbwVar.c = i - Integer.MIN_VALUE;
            } else {
                tbwVar = new defpackage.tbw(this, aolnVar);
            }
        } else {
            tbwVar = new defpackage.tbw(this, aolnVar);
        }
        java.lang.Object objC = tbwVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tbwVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objC);
            j$.util.Optional optionalG = this.f.g();
            defpackage.aooh.e(optionalG, "getFeature(...)");
            if (optionalG == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.met metVar = (defpackage.met) optionalG.orElse((java.lang.Object) null);
            if (metVar == null) {
                return java.lang.Boolean.FALSE;
            }
            ((defpackage.aimw) ((defpackage.aimw) b.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/reverselookup/settings/DataStoreReverseLookupSettings", "isAapmEnabledByUser", 154, "DataStoreReverseLookupSettings.kt")).v("Darpa is present");
            tbwVar.c = 1;
            objC = metVar.c(tbwVar);
            if (objC == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objC);
        }
        java.lang.Boolean bool = (java.lang.Boolean) objC;
        if (!bool.booleanValue()) {
            return bool;
        }
        ((defpackage.aimw) ((defpackage.aimw) b.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/reverselookup/settings/DataStoreReverseLookupSettings", "isAapmEnabledByUser", 157, "DataStoreReverseLookupSettings.kt")).v("AAPM is enabled");
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.aoln aolnVar) {
        defpackage.tbx tbxVar;
        if (aolnVar instanceof defpackage.tbx) {
            tbxVar = (defpackage.tbx) aolnVar;
            int i = tbxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbxVar.c = i - Integer.MIN_VALUE;
            } else {
                tbxVar = new defpackage.tbx(this, aolnVar);
            }
        } else {
            tbxVar = new defpackage.tbx(this, aolnVar);
        }
        java.lang.Object objE = tbxVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = tbxVar.c;
        boolean z = false;
        if (i2 == 0) {
            defpackage.aooc.af(objE);
            if (!this.g.m()) {
                tbxVar.c = 1;
                objE = e(tbxVar);
                if (objE == obj) {
                    return obj;
                }
            }
            return java.lang.Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        defpackage.aooc.af(objE);
        if (((java.lang.Boolean) objE).booleanValue() && i()) {
            z = true;
        }
        return java.lang.Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.aoln aolnVar) {
        defpackage.tby tbyVar;
        if (aolnVar instanceof defpackage.tby) {
            tbyVar = (defpackage.tby) aolnVar;
            int i = tbyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbyVar.c = i - Integer.MIN_VALUE;
            } else {
                tbyVar = new defpackage.tby(this, aolnVar);
            }
        } else {
            tbyVar = new defpackage.tby(this, aolnVar);
        }
        java.lang.Object objC = tbyVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = tbyVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objC);
            }
            defpackage.tch tchVar = (defpackage.tch) objC;
            return !tchVar.e ? java.lang.Boolean.TRUE : java.lang.Boolean.valueOf(tchVar.c);
        }
        defpackage.aooc.af(objC);
        tbyVar.c = 1;
        objC = c(tbyVar);
        if (objC == obj) {
            return obj;
        }
        if (((java.lang.Boolean) objC).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        defpackage.aoxh aoxhVarB = this.c.b();
        tbyVar.c = 2;
        objC = defpackage.aoov.au(aoxhVarB, tbyVar);
        if (objC == obj) {
            return obj;
        }
        defpackage.tch tchVar2 = (defpackage.tch) objC;
        if (!tchVar2.e) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        defpackage.tbz tbzVar;
        if (aolnVar instanceof defpackage.tbz) {
            tbzVar = (defpackage.tbz) aolnVar;
            int i = tbzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbzVar.c = i - Integer.MIN_VALUE;
            } else {
                tbzVar = new defpackage.tbz(this, aolnVar);
            }
        } else {
            tbzVar = new defpackage.tbz(this, aolnVar);
        }
        java.lang.Object objC = tbzVar.a;
        java.lang.Object obj = defpackage.aolu.a;
        int i2 = tbzVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(objC);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objC);
            }
            defpackage.tch tchVar = (defpackage.tch) objC;
            return (!tchVar.f || tchVar.d) ? java.lang.Boolean.valueOf(tchVar.d) : java.lang.Boolean.FALSE;
        }
        defpackage.aooc.af(objC);
        tbzVar.c = 1;
        objC = c(tbzVar);
        if (objC == obj) {
            return obj;
        }
        if (((java.lang.Boolean) objC).booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        defpackage.aoxh aoxhVarB = this.c.b();
        tbzVar.c = 2;
        objC = defpackage.aoov.au(aoxhVarB, tbzVar);
        if (objC == obj) {
            return obj;
        }
        defpackage.tch tchVar2 = (defpackage.tch) objC;
        if (tchVar2.f) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(boolean z, defpackage.aoln aolnVar) {
        tca tcaVar;
        if (aolnVar instanceof tca) {
            tcaVar = (tca) aolnVar;
            int i = tcaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tcaVar.c = i - Integer.MIN_VALUE;
            } else {
                tcaVar = new tca(this, aolnVar);
            }
        } else {
            tcaVar = new tca(this, aolnVar);
        }
        java.lang.Object obj = tcaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tcaVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.c;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 8, (char[][]) null);
            tcaVar.c = 1;
            if (ecxVar.a(jblVar, tcaVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(boolean z, defpackage.aoln aolnVar) {
        tcb tcbVar;
        if (aolnVar instanceof tcb) {
            tcbVar = (tcb) aolnVar;
            int i = tcbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tcbVar.c = i - Integer.MIN_VALUE;
            } else {
                tcbVar = new tcb(this, aolnVar);
            }
        } else {
            tcbVar = new tcb(this, aolnVar);
        }
        java.lang.Object obj = tcbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = tcbVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.c;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 9, (short[][]) null);
            tcbVar.c = 1;
            if (ecxVar.a(jblVar, tcbVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    public final boolean i() {
        return ((java.lang.Boolean) this.d.a()).booleanValue() || ((java.lang.Boolean) this.e.a()).booleanValue();
    }
}
