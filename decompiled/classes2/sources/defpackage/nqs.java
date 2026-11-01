package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nqs {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/storage/DobbyAudioWaveFileWriter");
    public final android.content.Context b;
    public final long c;
    public final defpackage.nsf d;
    public final defpackage.jif e;
    public final aoin f;
    public defpackage.nqj g;
    public final ipc h;
    private final aolr i;
    private final apdp j;

    public nqs(android.content.Context context, aolr aolrVar, long j, ipc ipcVar, defpackage.nsf nsfVar, defpackage.jif jifVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        aooh.f(aoinVar, "enableCleanup");
        this.b = context;
        this.i = aolrVar;
        this.c = j;
        this.h = ipcVar;
        this.d = nsfVar;
        this.e = jifVar;
        this.f = aoinVar;
        this.j = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.nqk nqkVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nqk) {
            nqkVar = (defpackage.nqk) aolnVar;
            int i = nqkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqkVar.c = i - Integer.MIN_VALUE;
            } else {
                nqkVar = new defpackage.nqk(this, aolnVar);
            }
        } else {
            nqkVar = new defpackage.nqk(this, aolnVar);
        }
        java.lang.Object obj = nqkVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nqkVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.j;
            nqkVar.d = apdpVar2;
            nqkVar.c = 1;
            if (apdpVar2.b(nqkVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = nqkVar.d;
            aooc.af(obj);
        }
        try {
            defpackage.nqj nqjVar = this.g;
            if (nqjVar != null) {
                akzc akzcVar = akzc.d;
                nqjVar.a = new akzb(128);
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) throws java.lang.Throwable {
        defpackage.nql nqlVar;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.nql) {
            nqlVar = (defpackage.nql) aolnVar;
            int i = nqlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqlVar.c = i - Integer.MIN_VALUE;
            } else {
                nqlVar = new defpackage.nql(this, aolnVar);
            }
        } else {
            nqlVar = new defpackage.nql(this, aolnVar);
        }
        java.lang.Object obj = nqlVar.a;
        java.lang.Boolean bool = aolu.a;
        int i2 = nqlVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.j;
                nqlVar.d = apdpVar;
                nqlVar.c = 1;
                if (apdpVar.b(nqlVar) != bool) {
                }
                return bool;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = nqlVar.d;
                try {
                    aooc.af(obj);
                    bool = (java.lang.Boolean) obj;
                    bool.booleanValue();
                    apdpVar2.d();
                    return bool;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar3 = nqlVar.d;
            aooc.af(obj);
            apdpVar = apdpVar3;
            aolr aolrVar = this.i;
            defpackage.mhq mhqVar = new defpackage.mhq(this, (aoln) null, 14);
            nqlVar.d = apdpVar;
            nqlVar.c = 2;
            java.lang.Object objAj = aoov.aj(aolrVar, mhqVar, nqlVar);
            if (objAj != bool) {
                apdp apdpVar4 = apdpVar;
                obj = objAj;
                apdpVar2 = apdpVar4;
                bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                apdpVar2.d();
            }
            return bool;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar5 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar5;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.util.List list, aoln aolnVar) throws java.lang.Throwable {
        defpackage.nqm nqmVar;
        java.util.List list2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.nqm) {
            nqmVar = (defpackage.nqm) aolnVar;
            int i = nqmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqmVar.d = i - Integer.MIN_VALUE;
            } else {
                nqmVar = new defpackage.nqm(this, aolnVar);
            }
        } else {
            nqmVar = new defpackage.nqm(this, aolnVar);
        }
        java.lang.Object objAj = nqmVar.b;
        defpackage.nsl nslVar = aolu.a;
        int i2 = nqmVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objAj);
                apdp apdpVar3 = this.j;
                nqmVar.a = list;
                nqmVar.e = apdpVar3;
                nqmVar.d = 1;
                if (apdpVar3.b(nqmVar) != nslVar) {
                    list2 = list;
                    apdpVar = apdpVar3;
                }
                return nslVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) nqmVar.a;
                try {
                    aooc.af(objAj);
                    nslVar = (defpackage.nsl) objAj;
                    apdpVar2.d();
                    return nslVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = nqmVar.e;
            list2 = (java.util.List) nqmVar.a;
            aooc.af(objAj);
            aolr aolrVar = this.i;
            defpackage.nqn nqnVar = new defpackage.nqn(this, list2, null);
            nqmVar.a = apdpVar;
            nqmVar.e = null;
            nqmVar.d = 2;
            objAj = aoov.aj(aolrVar, nqnVar, nqmVar);
            if (objAj != nslVar) {
                apdpVar2 = apdpVar;
                nslVar = (defpackage.nsl) objAj;
                apdpVar2.d();
            }
            return nslVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.nqo nqoVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nqo) {
            nqoVar = (defpackage.nqo) aolnVar;
            int i = nqoVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqoVar.c = i - Integer.MIN_VALUE;
            } else {
                nqoVar = new defpackage.nqo(this, aolnVar);
            }
        } else {
            nqoVar = new defpackage.nqo(this, aolnVar);
        }
        java.lang.Object obj = nqoVar.a;
        defpackage.nqj nqjVar = aolu.a;
        int i2 = nqoVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.j;
                nqoVar.d = apdpVar2;
                nqoVar.c = 1;
                if (apdpVar2.b(nqoVar) != nqjVar) {
                    apdpVar = apdpVar2;
                }
                return nqjVar;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = nqoVar.d;
            aooc.af(obj);
            nqjVar = this.g;
            return nqjVar;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(aoln aolnVar) {
        defpackage.nqp nqpVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.nqp) {
            nqpVar = (defpackage.nqp) aolnVar;
            int i = nqpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqpVar.c = i - Integer.MIN_VALUE;
            } else {
                nqpVar = new defpackage.nqp(this, aolnVar);
            }
        } else {
            nqpVar = new defpackage.nqp(this, aolnVar);
        }
        java.lang.Object obj = nqpVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = nqpVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.j;
                nqpVar.d = apdpVar2;
                nqpVar.c = 1;
                if (apdpVar2.b(nqpVar) != boolValueOf) {
                    apdpVar = apdpVar2;
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = nqpVar.d;
            aooc.af(obj);
            defpackage.nqj nqjVar = this.g;
            boolValueOf = java.lang.Boolean.valueOf(nqjVar != null && nqjVar.c > 0);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.nqj nqjVar, aoln aolnVar) {
        defpackage.nqq nqqVar;
        defpackage.npw npwVar;
        if (aolnVar instanceof defpackage.nqq) {
            nqqVar = (defpackage.nqq) aolnVar;
            int i = nqqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqqVar.c = i - Integer.MIN_VALUE;
            } else {
                nqqVar = new defpackage.nqq(this, aolnVar);
            }
        } else {
            nqqVar = new defpackage.nqq(this, aolnVar);
        }
        java.lang.Object obj = nqqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = nqqVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            defpackage.npw npwVarAp = mni.ap(defpackage.nsl.a.m());
            npwVarAp.e(nqjVar.b);
            long j = this.c;
            akzx akzxVar = (akzx) npwVarAp.a;
            akzxVar.u();
            ((defpackage.nsl) akzxVar.b).e = j;
            akzxVar.u();
            ((defpackage.nsl) akzxVar.b).g = a.U(3);
            int i3 = nqjVar.f;
            akzxVar.u();
            ((defpackage.nsl) akzxVar.b).h = i3;
            defpackage.nsk nskVar = nqjVar.d;
            if (nskVar != null) {
                akzxVar.u();
                defpackage.nsl nslVar = (defpackage.nsl) akzxVar.b;
                j$.util.Objects.requireNonNull(nskVar);
                nslVar.d = nskVar;
                nslVar.b |= 1;
                long j2 = (nqjVar.c * 1000) / ((long) nskVar.b);
                akzxVar.u();
                ((defpackage.nsl) akzxVar.b).f = j2;
                defpackage.jif jifVar = this.e;
                nqqVar.d = npwVarAp;
                nqqVar.c = 1;
                java.lang.Object objA = ahvr.ag(jifVar.a, jifVar.h, new defpackage.jie(jifVar, j2, (aoln) null, 1, (byte[]) null)).a(nqqVar);
                if (objA != aoluVar) {
                    objA = aojh.a;
                }
                if (objA == aoluVar) {
                    return aoluVar;
                }
            }
            npwVar = npwVarAp;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            npwVar = nqqVar.d;
            aooc.af(obj);
        }
        return npwVar.d();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.igb igbVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.nqr nqrVar;
        defpackage.igb igbVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.nqr) {
            nqrVar = (defpackage.nqr) aolnVar;
            int i = nqrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqrVar.d = i - Integer.MIN_VALUE;
            } else {
                nqrVar = new defpackage.nqr(this, aolnVar);
            }
        } else {
            nqrVar = new defpackage.nqr(this, aolnVar);
        }
        java.lang.Object objAj = nqrVar.b;
        java.lang.Boolean bool = aolu.a;
        int i2 = nqrVar.d;
        try {
            if (i2 == 0) {
                aooc.af(objAj);
                apdp apdpVar3 = this.j;
                nqrVar.a = igbVar;
                nqrVar.e = apdpVar3;
                nqrVar.d = 1;
                if (apdpVar3.b(nqrVar) != bool) {
                    igbVar2 = igbVar;
                    apdpVar = apdpVar3;
                }
                return bool;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) nqrVar.a;
                try {
                    aooc.af(objAj);
                    bool = (java.lang.Boolean) objAj;
                    bool.booleanValue();
                    apdpVar2.d();
                    return bool;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = nqrVar.e;
            igbVar2 = (defpackage.igb) nqrVar.a;
            aooc.af(objAj);
            aolr aolrVar = this.i;
            defpackage.kdr kdrVar = new defpackage.kdr(this, igbVar2, (aoln) null, 17);
            nqrVar.a = apdpVar;
            nqrVar.e = null;
            nqrVar.d = 2;
            objAj = aoov.aj(aolrVar, kdrVar, nqrVar);
            if (objAj != bool) {
                apdpVar2 = apdpVar;
                bool = (java.lang.Boolean) objAj;
                bool.booleanValue();
                apdpVar2.d();
            }
            return bool;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }
}
