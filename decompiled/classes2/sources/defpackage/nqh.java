package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nqh {
    private static final aimz h = aimz.i("com/android/dialer/dobby/impl/spam/DobbySpam");
    public final android.content.Context a;
    public final long b;
    public final ucr c;
    public final defpackage.mqt d;
    public final defpackage.nrv e;
    public final aoin f;
    public final defpackage.mba g;
    private final aolr i;
    private final aolr j;
    private final defpackage.nbr k;
    private final afpl l;

    public nqh(android.content.Context context, aolr aolrVar, aolr aolrVar2, long j, afpl afplVar, defpackage.nbr nbrVar, ucr ucrVar, defpackage.mqt mqtVar, defpackage.nrv nrvVar, aoin aoinVar, defpackage.mba mbaVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aolrVar2, "backgroundContext");
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nrvVar, "dobbySessionWriter");
        aooh.f(aoinVar, "annotatedCallLogRefreshStarter");
        this.a = context;
        this.i = aolrVar;
        this.j = aolrVar2;
        this.b = j;
        this.l = afplVar;
        this.k = nbrVar;
        this.c = ucrVar;
        this.d = mqtVar;
        this.e = nrvVar;
        this.f = aoinVar;
        this.g = mbaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nqc nqcVar;
        if (aolnVar instanceof defpackage.nqc) {
            nqcVar = (defpackage.nqc) aolnVar;
            int i = nqcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqcVar.c = i - Integer.MIN_VALUE;
            } else {
                nqcVar = new defpackage.nqc(this, aolnVar);
            }
        } else {
            nqcVar = new defpackage.nqc(this, aolnVar);
        }
        java.lang.Object objD = nqcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nqcVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.l.X();
            nqcVar.c = 1;
            objD = aosv.D(ajcqVarX, nqcVar);
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
        ajcq ajcqVarQ = ((defpackage.nqb) aooc.ar(objD, defpackage.nqb.class)).q();
        nqcVar.c = 2;
        java.lang.Object objD2 = aosv.D(ajcqVarQ, nqcVar);
        if (objD2 != aoluVar) {
            return objD2;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.nqd nqdVar;
        defpackage.nqi nqiVar;
        java.lang.String str;
        defpackage.mqt mqtVar;
        defpackage.msg msgVar;
        if (aolnVar instanceof defpackage.nqd) {
            nqdVar = (defpackage.nqd) aolnVar;
            int i = nqdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqdVar.c = i - Integer.MIN_VALUE;
            } else {
                nqdVar = new defpackage.nqd(this, aolnVar);
            }
        } else {
            nqdVar = new defpackage.nqd(this, aolnVar);
        }
        java.lang.Object objC = nqdVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nqdVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objC);
            } else if (i2 == 2) {
                nqiVar = nqdVar.d;
                aooc.af(objC);
                mqtVar = this.d;
                msgVar = new defpackage.msg(nqiVar.a, nqiVar.c, nqiVar.b);
                nqdVar.d = null;
                nqdVar.c = 3;
                if (mqtVar.o(msgVar, nqdVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objC);
            }
            return aojh.a;
        }
        aooc.af(objC);
        nqdVar.c = 1;
        objC = c(nqdVar);
        if (objC == aoluVar) {
            return aoluVar;
        }
        nqiVar = (defpackage.nqi) objC;
        aimw aimwVarL = h.b().l("com/android/dialer/dobby/impl/spam/DobbySpam", "checkAndRelaySpamStatusToDuplex", 82, "DobbySpam.kt");
        java.lang.String strName = nqiVar.a.name();
        int i3 = nqiVar.c;
        if (i3 != 1) {
            str = i3 != 2 ? "NOT_SUSPICIOUS" : "SUSPICIOUS";
        } else {
            str = "UNKNOWN_SUSPICIOUS_STATUS";
        }
        aimwVarL.M("spam status: %s, suspicious status: %s, verdict source: %s", strName, str, nqiVar.b.name());
        nqdVar.d = nqiVar;
        nqdVar.c = 2;
        if (e(nqiVar, nqdVar) == aoluVar) {
            return aoluVar;
        }
        mqtVar = this.d;
        msgVar = new defpackage.msg(nqiVar.a, nqiVar.c, nqiVar.b);
        nqdVar.d = null;
        nqdVar.c = 3;
        if (mqtVar.o(msgVar, nqdVar) == aoluVar) {
            return aoluVar;
        }
        return aojh.a;
    }

    public final java.lang.Object c(aoln aolnVar) {
        return aoov.aj(this.i, new defpackage.mva(this, (aoln) null, 10), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.nqe nqeVar;
        if (aolnVar instanceof defpackage.nqe) {
            nqeVar = (defpackage.nqe) aolnVar;
            int i = nqeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqeVar.c = i - Integer.MIN_VALUE;
            } else {
                nqeVar = new defpackage.nqe(this, aolnVar);
            }
        } else {
            nqeVar = new defpackage.nqe(this, aolnVar);
        }
        java.lang.Object objD = nqeVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nqeVar.c;
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
        ajcq ajcqVarX = this.l.X();
        nqeVar.c = 1;
        objD = aosv.D(ajcqVarX, nqeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBl = ((defpackage.nqb) aooc.ar(objD, defpackage.nqb.class)).bl();
        nqeVar.c = 2;
        objD = aosv.D(ajcqVarBl, nqeVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        return aooh.q((j$.util.Optional) objD);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.nqi nqiVar, aoln aolnVar) {
        defpackage.nqf nqfVar;
        alss alssVar;
        int i;
        if (aolnVar instanceof defpackage.nqf) {
            nqfVar = (defpackage.nqf) aolnVar;
            int i2 = nqfVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nqfVar.c = i2 - Integer.MIN_VALUE;
            } else {
                nqfVar = new defpackage.nqf(this, aolnVar);
            }
        } else {
            nqfVar = new defpackage.nqf(this, aolnVar);
        }
        java.lang.Object obj = nqfVar.a;
        aolu aoluVar = aolu.a;
        int i3 = nqfVar.c;
        if (i3 == 0) {
            aooc.af(obj);
            h.b().l("com/android/dialer/dobby/impl/spam/DobbySpam", "relaySpamSignalEvent", 139, "DobbySpam.kt").v("relaying to duplex spam signal event");
            ajyi ajyiVarI = ahus.I(alro.a.m());
            apdi apdiVar = alsu.f;
            aooh.e(apdiVar, "spamSignalEvent");
            akzx akzxVarM = alsu.a.m();
            aooh.f(akzxVarM, "builder");
            int iOrdinal = nqiVar.a.ordinal();
            int i4 = 2;
            if (iOrdinal != 1) {
                alssVar = iOrdinal != 2 ? alss.a : alss.c;
            } else {
                alssVar = alss.b;
            }
            akzxVarM.u();
            alsu alsuVar = akzxVarM.b;
            alsuVar.c = alssVar.e;
            alsuVar.b |= 1;
            int i5 = nqiVar.c - 1;
            if (i5 != 1) {
                i = i5 != 2 ? 1 : 3;
            } else {
                i = 2;
            }
            akzxVarM.u();
            alsu alsuVar2 = akzxVarM.b;
            alsuVar2.d = i - 1;
            alsuVar2.b |= 2;
            int iOrdinal2 = nqiVar.b.ordinal();
            if (iOrdinal2 != 1) {
                i4 = iOrdinal2 != 2 ? 1 : 3;
            }
            akzxVarM.u();
            alsu alsuVar3 = akzxVarM.b;
            alsuVar3.e = i4 - 1;
            alsuVar3.b |= 4;
            alsu alsuVarP = akzxVarM.p();
            aooh.e(alsuVarP, "build(...)");
            ajyiVarI.be(apdiVar, alsuVarP);
            alro alroVarBa = ajyiVarI.ba();
            defpackage.nbr nbrVar = this.k;
            nqfVar.c = 1;
            if (nbrVar.a(alroVarBa, nqfVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(obj);
        }
        return aojh.a;
    }

    public final java.lang.Object f(aoln aolnVar) {
        java.lang.Object objAj = aoov.aj(this.j, new defpackage.nqg(this, null), aolnVar);
        return objAj != aolu.a ? aojh.a : objAj;
    }
}
