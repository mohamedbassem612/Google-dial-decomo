package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gbk extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk(defpackage.accp accpVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = accpVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.gbk) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        if (i != 1) {
            return ((defpackage.gbk) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
        return ((defpackage.gbk) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.aogc aogcVar;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        defpackage.aogc aogcVar2;
        java.lang.Object obj6;
        java.lang.Object obj7;
        j$.time.Instant instantAw;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        defpackage.acxg acxgVar;
        defpackage.alcf alcfVarAu;
        int i = this.$cid;
        if (i == 0) {
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i2 = this.d;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        defpackage.aooc.af(obj);
                    } else {
                        obj2 = this.c;
                        obj3 = this.b;
                        java.lang.Object obj13 = this.a;
                        defpackage.aooc.af(obj);
                        obj4 = obj13;
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj);
                obj2 = this.e;
                aogcVar = ((defpackage.gbl) obj2).i;
                this.a = aogcVar;
                obj3 = aogcVar.b;
                this.b = obj3;
                this.c = obj2;
                this.d = 1;
                if (((defpackage.apdp) obj3).b(this) == aoluVar) {
                    obj4 = aogcVar;
                    return aoluVar;
                }
                obj4 = aogcVar;
                java.lang.Object obj14 = ((defpackage.aogc) obj4).c;
                defpackage.gdc gdcVar = new defpackage.gdc((defpackage.aonn) new defpackage.gbm((defpackage.gbn) obj14, (defpackage.aoln) null, 0), (defpackage.aoxh) new defpackage.aoxd(((defpackage.gbn) obj14).i, true), 7);
                ((defpackage.apdp) obj3).d();
                defpackage.gac gacVar = defpackage.gac.c;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 2;
                if (((defpackage.gbl) obj2).a(gdcVar, gacVar, this) == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th) {
                ((defpackage.apdp) obj3).d();
                throw th;
            }
        }
        if (i == 1) {
            defpackage.aolu aoluVar2 = defpackage.aolu.a;
            int i3 = this.d;
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        defpackage.aooc.af(obj);
                    } else {
                        obj5 = this.c;
                        obj6 = this.b;
                        java.lang.Object obj15 = this.a;
                        defpackage.aooc.af(obj);
                        obj7 = obj15;
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj);
                obj5 = this.e;
                aogcVar2 = ((defpackage.gbl) obj5).i;
                this.a = aogcVar2;
                obj6 = aogcVar2.b;
                this.b = obj6;
                this.c = obj5;
                this.d = 1;
                if (((defpackage.apdp) obj6).b(this) == aoluVar2) {
                    obj7 = aogcVar2;
                    return aoluVar2;
                }
                obj7 = aogcVar2;
                java.lang.Object obj16 = ((defpackage.aogc) obj7).c;
                defpackage.gdc gdcVar2 = new defpackage.gdc((defpackage.aonn) new defpackage.gbm((defpackage.gbn) obj16, (defpackage.aoln) null, 2, (byte[]) null), (defpackage.aoxh) new defpackage.aoxd(((defpackage.gbn) obj16).h, true), 7);
                ((defpackage.apdp) obj6).d();
                defpackage.gac gacVar2 = defpackage.gac.b;
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 2;
                if (((defpackage.gbl) obj5).a(gdcVar2, gacVar2, this) == aoluVar2) {
                    return aoluVar2;
                }
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th2) {
                ((defpackage.apdp) obj6).d();
                throw th2;
            }
        }
        defpackage.aolu aoluVar3 = defpackage.aolu.a;
        int i4 = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                defpackage.aooc.af(obj);
            } else if (i4 == 2) {
                obj9 = this.b;
                java.lang.Object obj17 = this.a;
                defpackage.aooc.af(obj);
                obj8 = obj17;
                obj10 = (defpackage.accl) obj;
                if (!((j$.time.Instant) obj9).minus(defpackage.accp.a).isBefore((j$.time.Instant) obj8)) {
                    obj11 = this.e;
                    this.a = obj8;
                    this.b = obj9;
                    this.c = obj10;
                    this.d = 3;
                    if (((defpackage.accp) obj11).b(this) == aoluVar3) {
                        return aoluVar3;
                    }
                    if (defpackage.aooh.n(obj8, j$.time.Instant.EPOCH)) {
                        obj12 = this.e;
                        this.a = obj9;
                        this.b = null;
                        this.c = null;
                        this.d = 4;
                        if (((defpackage.accp) obj12).a((defpackage.accl) obj10, this) == aoluVar3) {
                            return aoluVar3;
                        }
                        java.lang.Object systemService = ((defpackage.accp) this.e).e.getSystemService("jobscheduler");
                        defpackage.aooh.d(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                        android.app.job.JobScheduler jobScheduler = (android.app.job.JobScheduler) systemService;
                        jobScheduler.cancel(1573857706);
                        jobScheduler.cancel(1573857705);
                        jobScheduler.cancel(1573857707);
                    }
                    acxgVar = (defpackage.acxg) ((defpackage.accp) this.e).c.a();
                    defpackage.aooh.c(obj9);
                    alcfVarAu = defpackage.aooc.au((j$.time.Instant) obj9);
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = 5;
                    if (acxgVar.b(alcfVarAu, this) == aoluVar3) {
                        return aoluVar3;
                    }
                }
            } else if (i4 == 3) {
                java.lang.Object obj18 = this.c;
                java.lang.Object obj19 = this.b;
                obj8 = this.a;
                defpackage.aooc.af(obj);
                obj10 = obj18;
                obj9 = obj19;
                if (defpackage.aooh.n(obj8, j$.time.Instant.EPOCH)) {
                    obj12 = this.e;
                    this.a = obj9;
                    this.b = null;
                    this.c = null;
                    this.d = 4;
                    if (((defpackage.accp) obj12).a((defpackage.accl) obj10, this) == aoluVar3) {
                        return aoluVar3;
                    }
                    java.lang.Object systemService2 = ((defpackage.accp) this.e).e.getSystemService("jobscheduler");
                    defpackage.aooh.d(systemService2, "null cannot be cast to non-null type android.app.job.JobScheduler");
                    android.app.job.JobScheduler jobScheduler2 = (android.app.job.JobScheduler) systemService2;
                    jobScheduler2.cancel(1573857706);
                    jobScheduler2.cancel(1573857705);
                    jobScheduler2.cancel(1573857707);
                }
                acxgVar = (defpackage.acxg) ((defpackage.accp) this.e).c.a();
                defpackage.aooh.c(obj9);
                alcfVarAu = defpackage.aooc.au((j$.time.Instant) obj9);
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 5;
                if (acxgVar.b(alcfVarAu, this) == aoluVar3) {
                    return aoluVar3;
                }
            } else if (i4 != 4) {
                defpackage.aooc.af(obj);
            } else {
                obj9 = this.a;
                defpackage.aooc.af(obj);
                java.lang.Object systemService3 = ((defpackage.accp) this.e).e.getSystemService("jobscheduler");
                defpackage.aooh.d(systemService3, "null cannot be cast to non-null type android.app.job.JobScheduler");
                android.app.job.JobScheduler jobScheduler3 = (android.app.job.JobScheduler) systemService3;
                jobScheduler3.cancel(1573857706);
                jobScheduler3.cancel(1573857705);
                jobScheduler3.cancel(1573857707);
                acxgVar = (defpackage.acxg) ((defpackage.accp) this.e).c.a();
                defpackage.aooh.c(obj9);
                alcfVarAu = defpackage.aooc.au((j$.time.Instant) obj9);
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = 5;
                if (acxgVar.b(alcfVarAu, this) == aoluVar3) {
                    return aoluVar3;
                }
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        j$.time.Duration duration = defpackage.accp.a;
        defpackage.acxg acxgVar2 = (defpackage.acxg) ((defpackage.accp) this.e).c.a();
        this.d = 1;
        obj = acxgVar2.a(this);
        if (obj == aoluVar3) {
            return aoluVar3;
        }
        defpackage.achw achwVar = (defpackage.achw) obj;
        if ((achwVar.b & 2) != 0) {
            defpackage.alcf alcfVar = achwVar.d;
            if (alcfVar == null) {
                alcfVar = defpackage.alcf.a;
            }
            defpackage.aooh.e(alcfVar, "getGnpJobsScheduledTime(...)");
            instantAw = defpackage.aooc.aw(alcfVar);
        } else {
            instantAw = j$.time.Instant.EPOCH;
            defpackage.aooh.c(instantAw);
        }
        java.lang.Object obj20 = this.e;
        j$.time.Instant instantNow = j$.time.Instant.now();
        defpackage.aooh.c(instantNow);
        this.a = instantAw;
        this.b = instantNow;
        this.d = 2;
        java.lang.Object objC = ((defpackage.accp) obj20).c(this);
        if (objC == aoluVar3) {
            return aoluVar3;
        }
        obj8 = instantAw;
        obj = objC;
        obj9 = instantNow;
        obj10 = (defpackage.accl) obj;
        if (!((j$.time.Instant) obj9).minus(defpackage.accp.a).isBefore((j$.time.Instant) obj8)) {
            obj11 = this.e;
            this.a = obj8;
            this.b = obj9;
            this.c = obj10;
            this.d = 3;
            if (((defpackage.accp) obj11).b(this) == aoluVar3) {
                return aoluVar3;
            }
            if (defpackage.aooh.n(obj8, j$.time.Instant.EPOCH)) {
                obj12 = this.e;
                this.a = obj9;
                this.b = null;
                this.c = null;
                this.d = 4;
                if (((defpackage.accp) obj12).a((defpackage.accl) obj10, this) == aoluVar3) {
                    return aoluVar3;
                }
                java.lang.Object systemService4 = ((defpackage.accp) this.e).e.getSystemService("jobscheduler");
                defpackage.aooh.d(systemService4, "null cannot be cast to non-null type android.app.job.JobScheduler");
                android.app.job.JobScheduler jobScheduler4 = (android.app.job.JobScheduler) systemService4;
                jobScheduler4.cancel(1573857706);
                jobScheduler4.cancel(1573857705);
                jobScheduler4.cancel(1573857707);
            }
            acxgVar = (defpackage.acxg) ((defpackage.accp) this.e).c.a();
            defpackage.aooh.c(obj9);
            alcfVarAu = defpackage.aooc.au((j$.time.Instant) obj9);
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = 5;
            if (acxgVar.b(alcfVarAu, this) == aoluVar3) {
                return aoluVar3;
            }
        }
        return defpackage.aojh.a;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.gbk((defpackage.gbl) this.e, aolnVar, 0);
        }
        java.lang.Object obj2 = this.e;
        return i != 1 ? new defpackage.gbk((defpackage.accp) obj2, aolnVar, 2) : new defpackage.gbk((defpackage.gbl) obj2, aolnVar, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk(defpackage.gbl gblVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = gblVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbk(defpackage.gbl gblVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = gblVar;
    }
}
