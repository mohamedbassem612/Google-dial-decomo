package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class irf extends aomh implements aonn {
    java.lang.Object a;
    long b;
    long c;
    int d;
    final /* synthetic */ defpackage.irg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irf(defpackage.irg irgVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = irgVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[PHI: r2
      0x0097: PHI (r2v8 long) = (r2v7 long), (r2v9 long), (r2v9 long), (r2v9 long) binds: [B:19:0x0070, B:23:0x0082, B:25:0x008c, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.irg irgVar;
        java.lang.Object objB;
        java.lang.Object obj2;
        java.lang.Object objA;
        long jLongValue;
        defpackage.irg irgVar2;
        java.lang.Object objG;
        defpackage.irg irgVar3;
        long epochMilli;
        java.lang.Object objB2;
        defpackage.irg irgVar4;
        java.lang.Object objD;
        long j;
        aolu aoluVar = aolu.a;
        int i = this.d;
        int i2 = 4;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj3 = this.a;
                aooc.af(obj);
                objB = obj;
                obj2 = obj3;
            } else {
                if (i == 2) {
                    aooc.af(obj);
                    objA = obj;
                    jLongValue = ((java.lang.Number) objA).longValue();
                    irgVar2 = this.e;
                    if (irgVar2.j.c()) {
                        this.b = jLongValue;
                        this.d = 3;
                        objG = irgVar2.g(this);
                        if (objG == aoluVar) {
                            return aoluVar;
                        }
                        if (((java.lang.Boolean) objG).booleanValue()) {
                            irgVar4 = this.e;
                            if (!irgVar4.f.b()) {
                                irgVar4.i.c(defpackage.irg.h(3));
                            }
                        }
                        irgVar3 = this.e;
                        if (!((java.lang.Boolean) irgVar3.e.a()).booleanValue()) {
                            epochMilli = j$.time.Instant.now().toEpochMilli();
                            this.b = jLongValue;
                            this.c = epochMilli;
                            this.d = 4;
                            objB2 = irgVar3.b(this);
                            if (objB2 == aoluVar) {
                                return aoluVar;
                            }
                            ajcq ajcqVarP = ((defpackage.iqx) objB2).p();
                            this.b = jLongValue;
                            this.c = epochMilli;
                            this.d = 5;
                            objD = aosv.D(ajcqVarP, this);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            j = jLongValue;
                        }
                    } else {
                        irgVar3 = this.e;
                        if (!((java.lang.Boolean) irgVar3.e.a()).booleanValue()) {
                            epochMilli = j$.time.Instant.now().toEpochMilli();
                            this.b = jLongValue;
                            this.c = epochMilli;
                            this.d = 4;
                            objB2 = irgVar3.b(this);
                            if (objB2 == aoluVar) {
                                return aoluVar;
                            }
                            ajcq ajcqVarP2 = ((defpackage.iqx) objB2).p();
                            this.b = jLongValue;
                            this.c = epochMilli;
                            this.d = 5;
                            objD = aosv.D(ajcqVarP2, this);
                            if (objD != aoluVar) {
                                return aoluVar;
                            }
                            j = jLongValue;
                        }
                    }
                    defpackage.irg irgVar5 = this.e;
                    irgVar5.b.b(new defpackage.ioi(irgVar5, i2), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
                    return aojh.a;
                }
                if (i == 3) {
                    jLongValue = this.b;
                    aooc.af(obj);
                    objG = obj;
                    if (((java.lang.Boolean) objG).booleanValue()) {
                        irgVar4 = this.e;
                        if (!irgVar4.f.b()) {
                            irgVar4.i.c(defpackage.irg.h(3));
                        }
                    }
                    irgVar3 = this.e;
                    if (!((java.lang.Boolean) irgVar3.e.a()).booleanValue()) {
                        epochMilli = j$.time.Instant.now().toEpochMilli();
                        this.b = jLongValue;
                        this.c = epochMilli;
                        this.d = 4;
                        objB2 = irgVar3.b(this);
                        if (objB2 == aoluVar) {
                            return aoluVar;
                        }
                        ajcq ajcqVarP3 = ((defpackage.iqx) objB2).p();
                        this.b = jLongValue;
                        this.c = epochMilli;
                        this.d = 5;
                        objD = aosv.D(ajcqVarP3, this);
                        if (objD != aoluVar) {
                            return aoluVar;
                        }
                        j = jLongValue;
                    }
                    defpackage.irg irgVar6 = this.e;
                    irgVar6.b.b(new defpackage.ioi(irgVar6, i2), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
                    return aojh.a;
                }
                long j2 = this.c;
                if (i != 4) {
                    j = this.b;
                    aooc.af(obj);
                    epochMilli = j2;
                    objD = obj;
                } else {
                    long j3 = this.b;
                    aooc.af(obj);
                    epochMilli = j2;
                    jLongValue = j3;
                    objB2 = obj;
                    ajcq ajcqVarP4 = ((defpackage.iqx) objB2).p();
                    this.b = jLongValue;
                    this.c = epochMilli;
                    this.d = 5;
                    objD = aosv.D(ajcqVarP4, this);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    j = jLongValue;
                }
            }
            if (objD == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            long jLongValue2 = ((java.lang.Number) objD).longValue();
            long j4 = aorh.a;
            long jI = aorh.i(aooh.B((aorh.g(aooh.B(j, aorj.d)) - epochMilli) + jLongValue2, aorj.c));
            defpackage.irg.a.b().l("com/android/dialer/beesly/impl/BeeslyCallRingingStartedListener", "onCallRingingStarted$<anonymous>", 112, "BeeslyCallRingingStartedListener.kt").N("Total timeout %s seconds is calculated from Per carrier timeout: %s, currentTime: %s, callCreationTime: %s", new java.lang.Long(jI), new java.lang.Long(j), new java.lang.Long(epochMilli), new java.lang.Long(jLongValue2));
            jLongValue = jI;
            defpackage.irg irgVar7 = this.e;
            irgVar7.b.b(new defpackage.ioi(irgVar7, i2), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
            return aojh.a;
        }
        aooc.af(obj);
        irgVar = this.e;
        this.a = irgVar;
        this.d = 1;
        objB = irgVar.b(this);
        if (objB == aoluVar) {
            obj2 = irgVar;
            return aoluVar;
        }
        obj2 = irgVar;
        this.a = null;
        this.d = 2;
        objA = ((defpackage.irg) obj2).a((defpackage.iqx) objB, this);
        if (objA == aoluVar) {
            return aoluVar;
        }
        jLongValue = ((java.lang.Number) objA).longValue();
        irgVar2 = this.e;
        if (irgVar2.j.c()) {
            this.b = jLongValue;
            this.d = 3;
            objG = irgVar2.g(this);
            if (objG == aoluVar) {
                return aoluVar;
            }
            if (((java.lang.Boolean) objG).booleanValue()) {
                irgVar4 = this.e;
                if (!irgVar4.f.b()) {
                    irgVar4.i.c(defpackage.irg.h(3));
                }
            }
            irgVar3 = this.e;
            if (!((java.lang.Boolean) irgVar3.e.a()).booleanValue()) {
                epochMilli = j$.time.Instant.now().toEpochMilli();
                this.b = jLongValue;
                this.c = epochMilli;
                this.d = 4;
                objB2 = irgVar3.b(this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                ajcq ajcqVarP5 = ((defpackage.iqx) objB2).p();
                this.b = jLongValue;
                this.c = epochMilli;
                this.d = 5;
                objD = aosv.D(ajcqVarP5, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                j = jLongValue;
                if (objD == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                long jLongValue3 = ((java.lang.Number) objD).longValue();
                long j5 = aorh.a;
                long jI2 = aorh.i(aooh.B((aorh.g(aooh.B(j, aorj.d)) - epochMilli) + jLongValue3, aorj.c));
                defpackage.irg.a.b().l("com/android/dialer/beesly/impl/BeeslyCallRingingStartedListener", "onCallRingingStarted$<anonymous>", 112, "BeeslyCallRingingStartedListener.kt").N("Total timeout %s seconds is calculated from Per carrier timeout: %s, currentTime: %s, callCreationTime: %s", new java.lang.Long(jI2), new java.lang.Long(j), new java.lang.Long(epochMilli), new java.lang.Long(jLongValue3));
                jLongValue = jI2;
            }
        } else {
            irgVar3 = this.e;
            if (!((java.lang.Boolean) irgVar3.e.a()).booleanValue()) {
                epochMilli = j$.time.Instant.now().toEpochMilli();
                this.b = jLongValue;
                this.c = epochMilli;
                this.d = 4;
                objB2 = irgVar3.b(this);
                if (objB2 == aoluVar) {
                    return aoluVar;
                }
                ajcq ajcqVarP6 = ((defpackage.iqx) objB2).p();
                this.b = jLongValue;
                this.c = epochMilli;
                this.d = 5;
                objD = aosv.D(ajcqVarP6, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                j = jLongValue;
                if (objD == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                long jLongValue4 = ((java.lang.Number) objD).longValue();
                long j6 = aorh.a;
                long jI3 = aorh.i(aooh.B((aorh.g(aooh.B(j, aorj.d)) - epochMilli) + jLongValue4, aorj.c));
                defpackage.irg.a.b().l("com/android/dialer/beesly/impl/BeeslyCallRingingStartedListener", "onCallRingingStarted$<anonymous>", 112, "BeeslyCallRingingStartedListener.kt").N("Total timeout %s seconds is calculated from Per carrier timeout: %s, currentTime: %s, callCreationTime: %s", new java.lang.Long(jI3), new java.lang.Long(j), new java.lang.Long(epochMilli), new java.lang.Long(jLongValue4));
                jLongValue = jI3;
            }
        }
        defpackage.irg irgVar8 = this.e;
        irgVar8.b.b(new defpackage.ioi(irgVar8, i2), jLongValue, java.util.concurrent.TimeUnit.SECONDS);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.irf(this.e, aolnVar);
    }
}
