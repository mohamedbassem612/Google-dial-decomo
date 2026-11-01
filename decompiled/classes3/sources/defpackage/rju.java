package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rju {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public rju(defpackage.rjr rjrVar, java.util.Map map, defpackage.rjs rjsVar) {
        defpackage.rij rijVar;
        this.a = rjrVar;
        this.b = map;
        int i = rjsVar.b;
        if (i == 0) {
            rijVar = defpackage.rij.JOYBALL_DIALOG_KEY_UNKNOWN;
        } else if (i != 1) {
            rijVar = i != 2 ? null : defpackage.rij.JOYBALL_DIALOG_KEY_SHARPIE;
        } else {
            rijVar = defpackage.rij.JOYBALL_DIALOG_KEY_DOBBY;
        }
        this.c = rijVar == null ? defpackage.rij.UNRECOGNIZED : rijVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.tkq tkqVar;
        if (aolnVar instanceof defpackage.tkq) {
            tkqVar = (defpackage.tkq) aolnVar;
            int i = tkqVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkqVar.b = i - Integer.MIN_VALUE;
            } else {
                tkqVar = new defpackage.tkq(this, aolnVar);
            }
        } else {
            tkqVar = new defpackage.tkq(this, aolnVar);
        }
        java.lang.Object obj = tkqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tkqVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            ?? r5 = this.a;
            ipv ipvVar = new ipv((aoln) null, 20, (char[]) null, (byte[]) null);
            tkqVar.b = 1;
            if (r5.a(ipvVar, tkqVar) == aoluVar) {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v2, types: [aoin, java.lang.Object] */
    public final java.lang.Object b(aoln aolnVar) throws aois {
        defpackage.tkr tkrVar;
        if (aolnVar instanceof defpackage.tkr) {
            tkrVar = (defpackage.tkr) aolnVar;
            int i = tkrVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkrVar.b = i - Integer.MIN_VALUE;
            } else {
                tkrVar = new defpackage.tkr(this, aolnVar);
            }
        } else {
            tkrVar = new defpackage.tkr(this, aolnVar);
        }
        java.lang.Object objB = tkrVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tkrVar.b;
        if (i2 == 0) {
            aooc.af(objB);
            java.lang.Object obj = this.b;
            tkrVar.b = 1;
            objB = ((tmi) obj).b(tkrVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objB);
        }
        int iS = anty.S(((defpackage.yuw) objB).a);
        if (iS == 0) {
            return "aicore_4";
        }
        if (iS != 1) {
            throw new aois();
        }
        java.lang.Object objA = this.c.a();
        java.util.Objects.toString(objA);
        return "bert_".concat(java.lang.String.valueOf(objA));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.tks tksVar;
        if (aolnVar instanceof defpackage.tks) {
            tksVar = (defpackage.tks) aolnVar;
            int i = tksVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tksVar.b = i - Integer.MIN_VALUE;
            } else {
                tksVar = new defpackage.tks(this, aolnVar);
            }
        } else {
            tksVar = new defpackage.tks(this, aolnVar);
        }
        java.lang.Object objF = tksVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tksVar.b;
        if (i2 == 0) {
            aooc.af(objF);
            tksVar.b = 1;
            objF = f(tksVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        java.lang.String str = ((defpackage.tkp) objF).d;
        aooh.e(str, "getSharpieCallDirection(...)");
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.tkt tktVar;
        if (aolnVar instanceof defpackage.tkt) {
            tktVar = (defpackage.tkt) aolnVar;
            int i = tktVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tktVar.b = i - Integer.MIN_VALUE;
            } else {
                tktVar = new defpackage.tkt(this, aolnVar);
            }
        } else {
            tktVar = new defpackage.tkt(this, aolnVar);
        }
        java.lang.Object objF = tktVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tktVar.b;
        if (i2 == 0) {
            aooc.af(objF);
            tktVar.b = 1;
            objF = f(tktVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        alcf alcfVar = ((defpackage.tkp) objF).c;
        if (alcfVar == null) {
            alcfVar = alcf.a;
        }
        alcf alcfVar2 = alcfVar;
        aooh.e(alcfVar2, "getSharpieCallWithAlertEndedTimestamp(...)");
        return alcfVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.tku tkuVar;
        if (aolnVar instanceof defpackage.tku) {
            tkuVar = (defpackage.tku) aolnVar;
            int i = tkuVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkuVar.b = i - Integer.MIN_VALUE;
            } else {
                tkuVar = new defpackage.tku(this, aolnVar);
            }
        } else {
            tkuVar = new defpackage.tku(this, aolnVar);
        }
        java.lang.Object objF = tkuVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tkuVar.b;
        if (i2 == 0) {
            aooc.af(objF);
            tkuVar.b = 1;
            objF = f(tkuVar);
            if (objF == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objF);
        }
        java.lang.String str = ((defpackage.tkp) objF).e;
        aooh.e(str, "getSharpieModel(...)");
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object f(aoln aolnVar) {
        return aoov.au(this.a.b(), aolnVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v1, types: [ecx, java.lang.Object] */
    public final java.lang.Object g(alcf alcfVar, defpackage.zmy zmyVar, aoln aolnVar) throws aois {
        defpackage.tkv tkvVar;
        if (aolnVar instanceof defpackage.tkv) {
            tkvVar = (defpackage.tkv) aolnVar;
            int i = tkvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkvVar.b = i - Integer.MIN_VALUE;
            } else {
                tkvVar = new defpackage.tkv(this, aolnVar);
            }
        } else {
            tkvVar = new defpackage.tkv(this, aolnVar);
        }
        java.lang.Object objB = tkvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = tkvVar.b;
        if (i2 != 0) {
            if (i2 == 1) {
                zmyVar = tkvVar.d;
                alcfVar = tkvVar.c;
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
        tkvVar.c = alcfVar;
        tkvVar.d = zmyVar;
        tkvVar.b = 1;
        objB = b(tkvVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        alcf alcfVar2 = alcfVar;
        defpackage.zmy zmyVar2 = zmyVar;
        ?? r10 = this.a;
        defpackage.tkw tkwVar = new defpackage.tkw(zmyVar2, alcfVar2, (java.lang.String) objB, (aoln) null, 0);
        tkvVar.c = null;
        tkvVar.d = null;
        tkvVar.b = 2;
        if (r10.a(tkwVar, tkvVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq h(android.app.Activity activity, java.lang.String str) {
        return ahvr.H(((ahbv) this.b).x(), new icy(this, str, activity, 13, (byte[]) null), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.xcs xcsVar;
        j$.util.Optional optionalG;
        defpackage.omu omuVar;
        if (aolnVar instanceof defpackage.xcs) {
            xcsVar = (defpackage.xcs) aolnVar;
            int i = xcsVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                xcsVar.b = i - Integer.MIN_VALUE;
            } else {
                xcsVar = new defpackage.xcs(this, aolnVar);
            }
        } else {
            xcsVar = new defpackage.xcs(this, aolnVar);
        }
        java.lang.Object obj = xcsVar.a;
        aolu aoluVar = aolu.a;
        int i2 = xcsVar.b;
        if (i2 == 0) {
            aooc.af(obj);
            j$.util.Optional optionalH = ((zpm) this.b).h();
            aooh.e(optionalH, "getPrimaryCallScope(...)");
            defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
            defpackage.xcr xcrVar = apqrVar != null ? (defpackage.xcr) apqrVar.a(defpackage.xcr.class) : null;
            if (xcrVar != null && (optionalG = xcrVar.jW().g()) != null && (omuVar = (defpackage.omu) aooh.q(optionalG)) != null) {
                xcsVar.b = 1;
                if (omuVar.a() == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final ajcq j() {
        return ((aogc) this.a).bk();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @java.lang.Deprecated
    public final ajcq k() {
        return ahrv.g(((aogc) this.a).bk()).h(new defpackage.wzj(13), (java.util.concurrent.Executor) this.c);
    }

    public final ajcq l(defpackage.xap xapVar) {
        return ((kaw) this.b).p(((aogc) this.a).bl(new defpackage.tbd(xapVar, 12)));
    }

    public rju(aogc aogcVar, ajct ajctVar, kaw kawVar) {
        this.a = aogcVar;
        this.c = ajctVar;
        this.b = kawVar;
    }

    public rju(aoin aoinVar, ajcu ajcuVar, defpackage.wzx wzxVar) {
        this.c = aoinVar;
        this.b = ajcuVar;
        this.a = wzxVar;
    }

    public rju(aoss aossVar, zpm zpmVar, ruc rucVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(zpmVar, "callScopes");
        aooh.f(rucVar, "metrics");
        this.c = aossVar;
        this.b = zpmVar;
        this.a = rucVar;
    }

    public rju(ecx ecxVar, tmi tmiVar, aoin aoinVar) {
        aooh.f(ecxVar, "dataStore");
        aooh.f(tmiVar, "dialerSharpieConfigProvider");
        aooh.f(aoinVar, "hadesModelVersion");
        this.a = ecxVar;
        this.b = tmiVar;
        this.c = aoinVar;
    }

    public rju(android.content.Context context, ahbv ahbvVar, ajct ajctVar) {
        this.a = context;
        this.b = ahbvVar;
        this.c = ajctVar;
    }

    public rju(defpackage.sna snaVar, defpackage.sng sngVar, defpackage.snt sntVar) {
        aooh.f(snaVar, "capabilityPublisherSynclet");
        aooh.f(sngVar, "batchCapabilityPullerSynclet");
        aooh.f(sntVar, "localNetworkIdentityHasRcsSynclet");
        this.c = snaVar;
        this.a = sngVar;
        this.b = sntVar;
    }

    public rju(defpackage.xue xueVar, java.lang.Object obj, defpackage.xus xusVar) {
        this.a = xueVar;
        this.c = obj;
        this.b = xusVar;
    }
}
