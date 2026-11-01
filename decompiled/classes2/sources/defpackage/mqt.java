package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mqt {
    private static final aimz g = aimz.i("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator");
    public final aolr a;
    public final defpackage.mpo b;
    public final defpackage.mrg c;
    public final aowi d;
    public final apdp e;
    public int f;
    private final long h;
    private final defpackage.mrz i;
    private final aoin j;
    private java.lang.Long k;
    private tvx l;

    public mqt(aolr aolrVar, long j, defpackage.mpo mpoVar, defpackage.mrg mrgVar, defpackage.mrz mrzVar, aazc aazcVar, aoin aoinVar) {
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(mpoVar, "dobbyDialerClearcutLogger");
        aooh.f(mrgVar, "dobbyScoobyClearcutLogger");
        aooh.f(mrzVar, "dobbyScottyLogger");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "loggingSessionEndTimeoutMillis");
        this.a = aolrVar;
        this.h = j;
        this.b = mpoVar;
        this.c = mrgVar;
        this.i = mrzVar;
        this.j = aoinVar;
        this.d = aooh.H(androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY, 0, (aonj) null, 6);
        this.f = 1;
        this.e = new apdp();
    }

    private final void F(aenj aenjVar) {
        if (this.f == 3) {
            g.b().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "isLoggingAfterSessionEnded", 518, "DobbyLoggingCoordinator.kt").y("%s produced log after session has ended", new aepg(aenjVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object A(java.lang.String str, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqo mqoVar;
        java.lang.String str2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqo) {
            mqoVar = (defpackage.mqo) aolnVar;
            int i = mqoVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqoVar.d = i - Integer.MIN_VALUE;
            } else {
                mqoVar = new defpackage.mqo(this, aolnVar);
            }
        } else {
            mqoVar = new defpackage.mqo(this, aolnVar);
        }
        java.lang.Object obj = mqoVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqoVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqoVar.a = str;
                mqoVar.e = apdpVar3;
                mqoVar.d = 1;
                if (apdpVar3.b(mqoVar) != aojhVar) {
                    str2 = str;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqoVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqoVar.e;
            str2 = (java.lang.String) mqoVar.a;
            aooc.af(obj);
            F(new aenj("logManualScreeningDuplexPredictedIntent"));
            defpackage.mpo mpoVar = this.b;
            mqoVar.a = apdpVar;
            mqoVar.e = null;
            mqoVar.d = 2;
            if (mpoVar.w(str2, mqoVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object B(int i, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqp mqpVar;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqp) {
            mqpVar = (defpackage.mqp) aolnVar;
            int i2 = mqpVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mqpVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mqpVar = new defpackage.mqp(this, aolnVar);
            }
        } else {
            mqpVar = new defpackage.mqp(this, aolnVar);
        }
        java.lang.Object obj = mqpVar.b;
        aojh aojhVar = aolu.a;
        int i3 = mqpVar.d;
        try {
            if (i3 == 0) {
                aooc.af(obj);
                apdpVar = this.e;
                mqpVar.e = apdpVar;
                mqpVar.a = i;
                mqpVar.d = 1;
                if (apdpVar.b(mqpVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = mqpVar.e;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            i = mqpVar.a;
            apdp apdpVar3 = mqpVar.e;
            aooc.af(obj);
            apdpVar = apdpVar3;
            F(new aenj("logSmartReplyAicoreFeatureVersion"));
            defpackage.mpo mpoVar = this.b;
            mqpVar.e = apdpVar;
            mqpVar.d = 2;
            if (mpoVar.x(i, mqpVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object C(alyi alyiVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqq mqqVar;
        java.lang.Throwable th;
        alyi alyiVar2;
        alyi alyiVar3;
        defpackage.mrz mrzVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.mqq) {
            mqqVar = (defpackage.mqq) aolnVar;
            int i = mqqVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqqVar.d = i - Integer.MIN_VALUE;
            } else {
                mqqVar = new defpackage.mqq(this, aolnVar);
            }
        } else {
            mqqVar = new defpackage.mqq(this, aolnVar);
        }
        java.lang.Object obj = mqqVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqqVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                alyi alyiVar4 = this.e;
                mqqVar.a = alyiVar;
                mqqVar.e = alyiVar4;
                mqqVar.d = 1;
                if (alyiVar4.b(mqqVar) != aojhVar) {
                    alyiVar3 = alyiVar;
                    alyiVar = alyiVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    alyiVar2 = (apdp) mqqVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        alyiVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        alyiVar2.d();
                        throw th;
                    }
                }
                alyiVar = mqqVar.e;
                alyiVar3 = (alyi) mqqVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                str = alyiVar3.g;
                aooh.e(str, "getContentId(...)");
                mqqVar.a = alyiVar;
                mqqVar.e = null;
                mqqVar.d = 3;
                if (mrzVar.r(str, mqqVar) != aojhVar) {
                    alyiVar2 = alyiVar;
                    aojhVar = aojh.a;
                    alyiVar2.d();
                }
                return aojhVar;
            }
            alyiVar = mqqVar.e;
            alyiVar3 = (alyi) mqqVar.a;
            aooc.af(obj);
            F(new aenj("logSuggestedReplyChipClickedInManualScreening"));
            defpackage.mpo mpoVar = this.b;
            mqqVar.a = alyiVar3;
            mqqVar.e = alyiVar;
            mqqVar.d = 2;
            if (mpoVar.y(alyiVar3, mqqVar) != aojhVar) {
                mrzVar = this.i;
                str = alyiVar3.g;
                aooh.e(str, "getContentId(...)");
                mqqVar.a = alyiVar;
                mqqVar.e = null;
                mqqVar.d = 3;
                if (mrzVar.r(str, mqqVar) != aojhVar) {
                    alyiVar2 = alyiVar;
                    aojhVar = aojh.a;
                    alyiVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            alyi alyiVar5 = alyiVar;
            th = th3;
            alyiVar2 = alyiVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object D(java.lang.Iterable iterable, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqr mqrVar;
        java.lang.Iterable iterable2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqr) {
            mqrVar = (defpackage.mqr) aolnVar;
            int i = mqrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqrVar.d = i - Integer.MIN_VALUE;
            } else {
                mqrVar = new defpackage.mqr(this, aolnVar);
            }
        } else {
            mqrVar = new defpackage.mqr(this, aolnVar);
        }
        java.lang.Object obj = mqrVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqrVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqrVar.a = iterable;
                mqrVar.e = apdpVar3;
                mqrVar.d = 1;
                if (apdpVar3.b(mqrVar) != aojhVar) {
                    iterable2 = iterable;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqrVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqrVar.e;
            iterable2 = (java.lang.Iterable) mqrVar.a;
            aooc.af(obj);
            F(new aenj("logSuggestedReplyChipsDisplayedInManualScreening"));
            defpackage.mpo mpoVar = this.b;
            mqrVar.a = apdpVar;
            mqrVar.e = null;
            mqrVar.d = 2;
            if (mpoVar.z(iterable2, mqrVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object E(aoln aolnVar) throws aois {
        defpackage.mqs mqsVar;
        aimw aimwVarL;
        java.lang.String str;
        apdp apdpVar;
        aowi aowiVar;
        java.lang.Integer num;
        if (aolnVar instanceof defpackage.mqs) {
            mqsVar = (defpackage.mqs) aolnVar;
            int i = mqsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqsVar.d = i - Integer.MIN_VALUE;
            } else {
                mqsVar = new defpackage.mqs(this, aolnVar);
            }
        } else {
            mqsVar = new defpackage.mqs(this, aolnVar);
        }
        java.lang.Object objA = mqsVar.b;
        aolu aoluVar = aolu.a;
        int i2 = mqsVar.d;
        try {
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        apdpVar = (apdp) mqsVar.a;
                        aooc.af(objA);
                    } else if (i2 == 2) {
                        aooc.af(objA);
                        aowiVar = this.d;
                        num = new java.lang.Integer(1);
                        mqsVar.d = 3;
                        if (aowiVar.a(num, mqsVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else if (i2 == 3) {
                        aooc.af(objA);
                    } else if (i2 == 4) {
                        str = mqsVar.e;
                        aimwVarL = (aimw) mqsVar.a;
                        aooc.af(objA);
                        aimwVarL.y(str, new aepg((aenj) objA));
                        defpackage.nvp nvpVar = defpackage.nvp.EVENT_DOBBY_LOGGING_SESSION_TIMEOUT;
                        mqsVar.a = null;
                        mqsVar.e = null;
                        mqsVar.d = 5;
                        if (x(nvpVar, mqsVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (i2 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aooc.af(objA);
                    }
                    return aojh.a;
                }
                aooc.af(objA);
                apdpVar = this.e;
                mqsVar.a = apdpVar;
                mqsVar.d = 1;
                if (apdpVar.b(mqsVar) == aoluVar) {
                    return aoluVar;
                }
                int i3 = this.f;
                apdpVar.d();
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    g.b().l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "waitUntilSessionEndedOrTimeOut", 498, "DobbyLoggingCoordinator.kt").x("Logging session has not started on %d", this.h);
                    return aojh.a;
                }
                if (i4 == 1) {
                    java.lang.Object objA2 = this.j.a();
                    aooh.e(objA2, "get(...)");
                    long jLongValue = ((java.lang.Number) objA2).longValue();
                    defpackage.lve lveVar = new defpackage.lve(this, (aoln) null, 20, (short[]) null);
                    mqsVar.a = null;
                    mqsVar.d = 2;
                    if (aooh.K(jLongValue, lveVar, mqsVar) == aoluVar) {
                        return aoluVar;
                    }
                    aowiVar = this.d;
                    num = new java.lang.Integer(1);
                    mqsVar.d = 3;
                    if (aowiVar.a(num, mqsVar) == aoluVar) {
                        return aoluVar;
                    }
                } else if (i4 != 2) {
                    throw new aois();
                }
                return aojh.a;
            } catch (java.lang.Throwable th) {
                apdpVar.d();
                throw th;
            }
        } catch (aovk unused) {
            aimwVarL = g.d().j(zct.a, java.lang.Boolean.TRUE).l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "waitUntilSessionEndedOrTimeOut", 491, "DobbyLoggingCoordinator.kt");
            mqsVar.a = aimwVarL;
            str = "LoggingSessionTimeout events:%s";
            mqsVar.e = "LoggingSessionTimeout events:%s";
            mqsVar.d = 4;
            objA = a(mqsVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: all -> 0x0081, LOOP:0: B:24:0x0066->B:26:0x006c, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:13:0x0028, B:23:0x0059, B:24:0x0066, B:26:0x006c), top: B:36:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.mpp mppVar;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        java.util.Iterator it;
        if (aolnVar instanceof defpackage.mpp) {
            mppVar = (defpackage.mpp) aolnVar;
            int i = mppVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mppVar.c = i - Integer.MIN_VALUE;
            } else {
                mppVar = new defpackage.mpp(this, aolnVar);
            }
        } else {
            mppVar = new defpackage.mpp(this, aolnVar);
        }
        java.lang.Object obj = mppVar.a;
        aenj aenjVar = aolu.a;
        int i2 = mppVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.e;
                mppVar.d = apdpVar;
                mppVar.c = 1;
                if (apdpVar.b(mppVar) != aenjVar) {
                }
                return aenjVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = mppVar.d;
                try {
                    aooc.af(obj);
                    aenjVar = new aenj("");
                    it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        aenjVar = aenj.a(aenjVar, aenj.c(" ", (defpackage.nvp) it.next()));
                    }
                    apdpVar2.d();
                    return aenjVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar3 = mppVar.d;
            aooc.af(obj);
            apdpVar = apdpVar3;
            mppVar.d = apdpVar;
            mppVar.c = 2;
            java.lang.Object objA = this.b.a(mppVar);
            if (objA != aenjVar) {
                apdp apdpVar4 = apdpVar;
                obj = objA;
                apdpVar2 = apdpVar4;
                aenjVar = new aenj("");
                it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    aenjVar = aenj.a(aenjVar, aenj.c(" ", (defpackage.nvp) it.next()));
                }
                apdpVar2.d();
            }
            return aenjVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar5 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar5;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:14:0x0030, B:40:0x0098, B:41:0x00c2, B:43:0x00c8, B:45:0x00d0, B:46:0x00d3, B:48:0x00e3, B:49:0x00e5, B:51:0x0100, B:53:0x010a), top: B:69:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:14:0x0030, B:40:0x0098, B:41:0x00c2, B:43:0x00c8, B:45:0x00d0, B:46:0x00d3, B:48:0x00e3, B:49:0x00e5, B:51:0x0100, B:53:0x010a), top: B:69:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: all -> 0x0115, TryCatch #2 {all -> 0x0115, blocks: (B:14:0x0030, B:40:0x0098, B:41:0x00c2, B:43:0x00c8, B:45:0x00d0, B:46:0x00d3, B:48:0x00e3, B:49:0x00e5, B:51:0x0100, B:53:0x010a), top: B:69:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[Catch: all -> 0x0115, LOOP:1: B:50:0x00fe->B:51:0x0100, LOOP_END, TryCatch #2 {all -> 0x0115, blocks: (B:14:0x0030, B:40:0x0098, B:41:0x00c2, B:43:0x00c8, B:45:0x00d0, B:46:0x00d3, B:48:0x00e3, B:49:0x00e5, B:51:0x0100, B:53:0x010a), top: B:69:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final java.lang.Object b(aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpq mpqVar;
        apdp apdpVar;
        apdp apdpVar2;
        java.lang.Object objA;
        java.lang.StringBuilder sb;
        int i;
        defpackage.nvp nvpVarB;
        java.lang.Object[] objArr;
        int i2;
        if (aolnVar instanceof defpackage.mpq) {
            mpqVar = (defpackage.mpq) aolnVar;
            int i3 = mpqVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mpqVar.c = i3 - Integer.MIN_VALUE;
            } else {
                mpqVar = new defpackage.mpq(this, aolnVar);
            }
        } else {
            mpqVar = new defpackage.mpq(this, aolnVar);
        }
        java.lang.Object obj = mpqVar.a;
        defpackage.mse mseVar = aolu.a;
        int i4 = mpqVar.c;
        try {
            if (i4 == 0) {
                aooc.af(obj);
                apdpVar = this.e;
                mpqVar.d = apdpVar;
                mpqVar.c = 1;
                if (apdpVar.b(mpqVar) != mseVar) {
                }
                return mseVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = mpqVar.d;
                    try {
                        aooc.af(obj);
                        mseVar = (defpackage.mse) obj;
                        aimw aimwVarL = g.b().l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "dumpDobbyEvents", 540, "DobbyLoggingCoordinator.kt");
                        alat alatVar = mseVar.c;
                        aooh.e(alatVar, "getDobbyEventList(...)");
                        sb = new java.lang.StringBuilder();
                        i = 0;
                        for (java.lang.Object obj2 : alatVar) {
                            int i5 = i + 1;
                            if (i < 0) {
                                ajsz.bh();
                            }
                            defpackage.msb msbVar = (defpackage.msb) obj2;
                            java.lang.Long lValueOf = java.lang.Long.valueOf(msbVar.c);
                            nvpVarB = defpackage.nvp.b(msbVar.d);
                            if (nvpVarB == null) {
                                nvpVarB = defpackage.nvp.EVENT_UNKNOWN;
                            }
                            objArr = new java.lang.Object[]{"\n(", lValueOf, ", ", nvpVarB.name(), ")"};
                            for (i2 = 0; i2 < 5; i2++) {
                                sb.append(objArr[i2]);
                            }
                            i = i5;
                        }
                        aimwVarL.y("DobbyEvents:%s", sb.toString());
                        apdpVar2.d();
                        return mseVar;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdp apdpVar3 = mpqVar.d;
                try {
                    aooc.af(obj);
                    apdpVar = apdpVar3;
                    defpackage.mrz mrzVar = this.i;
                    mpqVar.d = apdpVar;
                    mpqVar.c = 3;
                    objA = mrzVar.a(mpqVar);
                    if (objA != mseVar) {
                        apdpVar2 = apdpVar;
                        obj = objA;
                        mseVar = (defpackage.mse) obj;
                        aimw aimwVarL2 = g.b().l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "dumpDobbyEvents", 540, "DobbyLoggingCoordinator.kt");
                        alat alatVar2 = mseVar.c;
                        aooh.e(alatVar2, "getDobbyEventList(...)");
                        sb = new java.lang.StringBuilder();
                        i = 0;
                        while (r4.hasNext()) {
                            int i6 = i + 1;
                            if (i < 0) {
                                ajsz.bh();
                            }
                            defpackage.msb msbVar2 = (defpackage.msb) obj2;
                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(msbVar2.c);
                            nvpVarB = defpackage.nvp.b(msbVar2.d);
                            if (nvpVarB == null) {
                                nvpVarB = defpackage.nvp.EVENT_UNKNOWN;
                            }
                            objArr = new java.lang.Object[]{"\n(", lValueOf2, ", ", nvpVarB.name(), ")"};
                            while (i2 < 5) {
                                sb.append(objArr[i2]);
                            }
                            i = i6;
                        }
                        aimwVarL2.y("DobbyEvents:%s", sb.toString());
                        apdpVar2.d();
                    }
                    return mseVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2 = apdpVar3;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdp apdpVar4 = mpqVar.d;
            aooc.af(obj);
            apdpVar = apdpVar4;
            int i7 = this.f;
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                throw new java.lang.IllegalStateException("Logging Session can't end before started.");
            }
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new aois();
                }
                throw new java.lang.IllegalStateException("Logging Session can't end again.");
            }
            this.f = 3;
            aowi aowiVar = this.d;
            java.lang.Integer num = new java.lang.Integer(0);
            mpqVar.d = apdpVar;
            mpqVar.c = 2;
            if (aowiVar.a(num, mpqVar) != mseVar) {
                defpackage.mrz mrzVar2 = this.i;
                mpqVar.d = apdpVar;
                mpqVar.c = 3;
                objA = mrzVar2.a(mpqVar);
                if (objA != mseVar) {
                    apdpVar2 = apdpVar;
                    obj = objA;
                    mseVar = (defpackage.mse) obj;
                    aimw aimwVarL3 = g.b().l("com/android/dialer/dobby/impl/callmetrics/DobbyLoggingCoordinator", "dumpDobbyEvents", 540, "DobbyLoggingCoordinator.kt");
                    alat alatVar3 = mseVar.c;
                    aooh.e(alatVar3, "getDobbyEventList(...)");
                    sb = new java.lang.StringBuilder();
                    i = 0;
                    while (r4.hasNext()) {
                        int i9 = i + 1;
                        if (i < 0) {
                            ajsz.bh();
                        }
                        defpackage.msb msbVar3 = (defpackage.msb) obj2;
                        java.lang.Long lValueOf3 = java.lang.Long.valueOf(msbVar3.c);
                        nvpVarB = defpackage.nvp.b(msbVar3.d);
                        if (nvpVarB == null) {
                            nvpVarB = defpackage.nvp.EVENT_UNKNOWN;
                        }
                        objArr = new java.lang.Object[]{"\n(", lValueOf3, ", ", nvpVarB.name(), ")"};
                        while (i2 < 5) {
                            sb.append(objArr[i2]);
                        }
                        i = i9;
                    }
                    aimwVarL3.y("DobbyEvents:%s", sb.toString());
                    apdpVar2.d();
                }
            }
            return mseVar;
        } catch (java.lang.Throwable th3) {
            th = th3;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    public final java.lang.Object c(aoln aolnVar) {
        return this.c.b(aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: all -> 0x00a5, PHI: r8 r9
      0x0090: PHI (r8v4 boolean) = (r8v5 boolean), (r8v9 boolean) binds: [B:33:0x008e, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r9v4 apdp) = (r9v5 apdp), (r9v8 apdp) binds: [B:33:0x008e, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x00a5, blocks: (B:34:0x0090, B:32:0x0082, B:30:0x006a), top: B:48:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    public final java.lang.Object d(boolean z, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpr mprVar;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        defpackage.mrz mrzVar;
        defpackage.mrg mrgVar;
        if (aolnVar instanceof defpackage.mpr) {
            mprVar = (defpackage.mpr) aolnVar;
            int i = mprVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mprVar.d = i - Integer.MIN_VALUE;
            } else {
                mprVar = new defpackage.mpr(this, aolnVar);
            }
        } else {
            mprVar = new defpackage.mpr(this, aolnVar);
        }
        java.lang.Object obj = mprVar.b;
        aojh aojhVar = aolu.a;
        ?? r2 = mprVar.d;
        try {
            if (r2 == 0) {
                aooc.af(obj);
                apdpVar = this.e;
                mprVar.e = apdpVar;
                mprVar.a = z;
                mprVar.d = 1;
                if (apdpVar.b(mprVar) != aojhVar) {
                }
                return aojhVar;
            }
            if (r2 != 1) {
                try {
                    if (r2 == 2) {
                        z = mprVar.a;
                        apdp apdpVar3 = mprVar.e;
                        aooc.af(obj);
                        apdpVar = apdpVar3;
                        mrgVar = this.c;
                        mprVar.e = apdpVar;
                        mprVar.a = z;
                        mprVar.d = 3;
                        if (mrgVar.c(z, mprVar) != aojhVar) {
                            mrzVar = this.i;
                            mprVar.e = apdpVar;
                            mprVar.d = 4;
                            if (mrzVar.b(z, mprVar) != aojhVar) {
                                apdpVar2 = apdpVar;
                                aojhVar = aojh.a;
                                apdpVar2.d();
                            }
                        }
                        return aojhVar;
                    }
                    if (r2 != 3) {
                        if (r2 != 4) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        apdpVar2 = mprVar.e;
                        try {
                            aooc.af(obj);
                            apdpVar2 = apdpVar2;
                            aojhVar = aojh.a;
                            apdpVar2.d();
                            return aojhVar;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            apdpVar2.d();
                            throw th;
                        }
                    }
                    z = mprVar.a;
                    apdp apdpVar4 = mprVar.e;
                    aooc.af(obj);
                    apdpVar = apdpVar4;
                    mrzVar = this.i;
                    mprVar.e = apdpVar;
                    mprVar.d = 4;
                    if (mrzVar.b(z, mprVar) != aojhVar) {
                        apdpVar2 = apdpVar;
                        aojhVar = aojh.a;
                        apdpVar2.d();
                    }
                    return aojhVar;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    apdpVar2 = r2;
                    apdpVar2.d();
                    throw th;
                }
            }
            z = mprVar.a;
            apdp apdpVar5 = mprVar.e;
            aooc.af(obj);
            apdpVar = apdpVar5;
            F(new aenj("logAapmStatus"));
            defpackage.mpo mpoVar = this.b;
            mprVar.e = apdpVar;
            mprVar.a = z;
            mprVar.d = 2;
            if (mpoVar.c(z, mprVar) != aojhVar) {
                mrgVar = this.c;
                mprVar.e = apdpVar;
                mprVar.a = z;
                mprVar.d = 3;
                if (mrgVar.c(z, mprVar) != aojhVar) {
                    mrzVar = this.i;
                    mprVar.e = apdpVar;
                    mprVar.d = 4;
                    if (mrzVar.b(z, mprVar) != aojhVar) {
                        apdpVar2 = apdpVar;
                        aojhVar = aojh.a;
                        apdpVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th4) {
            th = th4;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(defpackage.mok mokVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mps mpsVar;
        java.lang.Throwable th;
        defpackage.mok mokVar2;
        defpackage.mok mokVar3;
        defpackage.mrg mrgVar;
        if (aolnVar instanceof defpackage.mps) {
            mpsVar = (defpackage.mps) aolnVar;
            int i = mpsVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpsVar.d = i - Integer.MIN_VALUE;
            } else {
                mpsVar = new defpackage.mps(this, aolnVar);
            }
        } else {
            mpsVar = new defpackage.mps(this, aolnVar);
        }
        java.lang.Object obj = mpsVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpsVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.mok mokVar4 = this.e;
                mpsVar.a = mokVar;
                mpsVar.e = mokVar4;
                mpsVar.d = 1;
                if (mokVar4.b(mpsVar) != aojhVar) {
                    mokVar3 = mokVar;
                    mokVar = mokVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mokVar2 = (apdp) mpsVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        mokVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mokVar2.d();
                        throw th;
                    }
                }
                mokVar = mpsVar.e;
                mokVar3 = (defpackage.mok) mpsVar.a;
                aooc.af(obj);
                mrgVar = this.c;
                mpsVar.a = mokVar;
                mpsVar.e = null;
                mpsVar.d = 3;
                if (mrgVar.d(mokVar3, mpsVar) != aojhVar) {
                    mokVar2 = mokVar;
                    aojhVar = aojh.a;
                    mokVar2.d();
                }
                return aojhVar;
            }
            mokVar = mpsVar.e;
            mokVar3 = (defpackage.mok) mpsVar.a;
            aooc.af(obj);
            F(new aenj("logAgenticContext"));
            defpackage.mpo mpoVar = this.b;
            mpsVar.a = mokVar3;
            mpsVar.e = mokVar;
            mpsVar.d = 2;
            if (mpoVar.d(mokVar3, mpsVar) != aojhVar) {
                mrgVar = this.c;
                mpsVar.a = mokVar;
                mpsVar.e = null;
                mpsVar.d = 3;
                if (mrgVar.d(mokVar3, mpsVar) != aojhVar) {
                    mokVar2 = mokVar;
                    aojhVar = aojh.a;
                    mokVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.mok mokVar5 = mokVar;
            th = th3;
            mokVar2 = mokVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(java.util.List list, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpt mptVar;
        java.util.List list2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mpt) {
            mptVar = (defpackage.mpt) aolnVar;
            int i = mptVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mptVar.d = i - Integer.MIN_VALUE;
            } else {
                mptVar = new defpackage.mpt(this, aolnVar);
            }
        } else {
            mptVar = new defpackage.mpt(this, aolnVar);
        }
        java.lang.Object obj = mptVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mptVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mptVar.a = list;
                mptVar.e = apdpVar3;
                mptVar.d = 1;
                if (apdpVar3.b(mptVar) != aojhVar) {
                    list2 = list;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mptVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mptVar.e;
            list2 = (java.util.List) mptVar.a;
            aooc.af(obj);
            F(new aenj("logAudioMatchDetectionDistances"));
            defpackage.mpo mpoVar = this.b;
            mptVar.a = apdpVar;
            mptVar.e = null;
            mptVar.d = 2;
            if (mpoVar.e(list2, mptVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(defpackage.iht ihtVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpu mpuVar;
        java.lang.Throwable th;
        defpackage.iht ihtVar2;
        defpackage.iht ihtVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mpu) {
            mpuVar = (defpackage.mpu) aolnVar;
            int i = mpuVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpuVar.d = i - Integer.MIN_VALUE;
            } else {
                mpuVar = new defpackage.mpu(this, aolnVar);
            }
        } else {
            mpuVar = new defpackage.mpu(this, aolnVar);
        }
        java.lang.Object obj = mpuVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpuVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.iht ihtVar4 = this.e;
                mpuVar.a = ihtVar;
                mpuVar.e = ihtVar4;
                mpuVar.d = 1;
                if (ihtVar4.b(mpuVar) != aojhVar) {
                    ihtVar3 = ihtVar;
                    ihtVar = ihtVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ihtVar2 = (apdp) mpuVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        ihtVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        ihtVar2.d();
                        throw th;
                    }
                }
                ihtVar = mpuVar.e;
                ihtVar3 = (defpackage.iht) mpuVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mpuVar.a = ihtVar;
                mpuVar.e = null;
                mpuVar.d = 3;
                if (mrzVar.f(ihtVar3, mpuVar) != aojhVar) {
                    ihtVar2 = ihtVar;
                    aojhVar = aojh.a;
                    ihtVar2.d();
                }
                return aojhVar;
            }
            ihtVar = mpuVar.e;
            ihtVar3 = (defpackage.iht) mpuVar.a;
            aooc.af(obj);
            F(new aenj("logAudioPrismSessionStartFailure"));
            defpackage.mpo mpoVar = this.b;
            mpuVar.a = ihtVar3;
            mpuVar.e = ihtVar;
            mpuVar.d = 2;
            if (mpoVar.i(ihtVar3, mpuVar) != aojhVar) {
                mrzVar = this.i;
                mpuVar.a = ihtVar;
                mpuVar.e = null;
                mpuVar.d = 3;
                if (mrzVar.f(ihtVar3, mpuVar) != aojhVar) {
                    ihtVar2 = ihtVar;
                    aojhVar = aojh.a;
                    ihtVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.iht ihtVar5 = ihtVar;
            th = th3;
            ihtVar2 = ihtVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.igw igwVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpv mpvVar;
        java.lang.Throwable th;
        defpackage.igw igwVar2;
        defpackage.igw igwVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mpv) {
            mpvVar = (defpackage.mpv) aolnVar;
            int i = mpvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpvVar.d = i - Integer.MIN_VALUE;
            } else {
                mpvVar = new defpackage.mpv(this, aolnVar);
            }
        } else {
            mpvVar = new defpackage.mpv(this, aolnVar);
        }
        java.lang.Object obj = mpvVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpvVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.igw igwVar4 = this.e;
                mpvVar.a = igwVar;
                mpvVar.e = igwVar4;
                mpvVar.d = 1;
                if (igwVar4.b(mpvVar) != aojhVar) {
                    igwVar3 = igwVar;
                    igwVar = igwVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    igwVar2 = (apdp) mpvVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        igwVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        igwVar2.d();
                        throw th;
                    }
                }
                igwVar = mpvVar.e;
                igwVar3 = (defpackage.igw) mpvVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mpvVar.a = igwVar;
                mpvVar.e = null;
                mpvVar.d = 3;
                if (mrzVar.c(igwVar3, mpvVar) != aojhVar) {
                    igwVar2 = igwVar;
                    aojhVar = aojh.a;
                    igwVar2.d();
                }
                return aojhVar;
            }
            igwVar = mpvVar.e;
            igwVar3 = (defpackage.igw) mpvVar.a;
            aooc.af(obj);
            F(new aenj("logAudioPrismSodaLpInfo"));
            defpackage.mpo mpoVar = this.b;
            mpvVar.a = igwVar3;
            mpvVar.e = igwVar;
            mpvVar.d = 2;
            if (mpoVar.f(igwVar3, mpvVar) != aojhVar) {
                mrzVar = this.i;
                mpvVar.a = igwVar;
                mpvVar.e = null;
                mpvVar.d = 3;
                if (mrzVar.c(igwVar3, mpvVar) != aojhVar) {
                    igwVar2 = igwVar;
                    aojhVar = aojh.a;
                    igwVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.igw igwVar5 = igwVar;
            th = th3;
            igwVar2 = igwVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(alsj alsjVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpw mpwVar;
        java.lang.Throwable th;
        alsj alsjVar2;
        alsj alsjVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mpw) {
            mpwVar = (defpackage.mpw) aolnVar;
            int i = mpwVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpwVar.d = i - Integer.MIN_VALUE;
            } else {
                mpwVar = new defpackage.mpw(this, aolnVar);
            }
        } else {
            mpwVar = new defpackage.mpw(this, aolnVar);
        }
        java.lang.Object obj = mpwVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpwVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                alsj alsjVar4 = this.e;
                mpwVar.a = alsjVar;
                mpwVar.e = alsjVar4;
                mpwVar.d = 1;
                if (alsjVar4.b(mpwVar) != aojhVar) {
                    alsjVar3 = alsjVar;
                    alsjVar = alsjVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    alsjVar2 = (apdp) mpwVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        alsjVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        alsjVar2.d();
                        throw th;
                    }
                }
                alsjVar = mpwVar.e;
                alsjVar3 = (alsj) mpwVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mpwVar.a = alsjVar;
                mpwVar.e = null;
                mpwVar.d = 3;
                if (mrzVar.d(alsjVar3, mpwVar) != aojhVar) {
                    alsjVar2 = alsjVar;
                    aojhVar = aojh.a;
                    alsjVar2.d();
                }
                return aojhVar;
            }
            alsjVar = mpwVar.e;
            alsjVar3 = (alsj) mpwVar.a;
            aooc.af(obj);
            F(new aenj("logClickedPostScreeningQuickRelyChip"));
            defpackage.mpo mpoVar = this.b;
            mpwVar.a = alsjVar3;
            mpwVar.e = alsjVar;
            mpwVar.d = 2;
            if (mpoVar.g(alsjVar3, mpwVar) != aojhVar) {
                mrzVar = this.i;
                mpwVar.a = alsjVar;
                mpwVar.e = null;
                mpwVar.d = 3;
                if (mrzVar.d(alsjVar3, mpwVar) != aojhVar) {
                    alsjVar2 = alsjVar;
                    aojhVar = aojh.a;
                    alsjVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            alsj alsjVar5 = alsjVar;
            th = th3;
            alsjVar2 = alsjVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(alsj alsjVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpx mpxVar;
        java.lang.Throwable th;
        alsj alsjVar2;
        alsj alsjVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mpx) {
            mpxVar = (defpackage.mpx) aolnVar;
            int i = mpxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpxVar.d = i - Integer.MIN_VALUE;
            } else {
                mpxVar = new defpackage.mpx(this, aolnVar);
            }
        } else {
            mpxVar = new defpackage.mpx(this, aolnVar);
        }
        java.lang.Object obj = mpxVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpxVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                alsj alsjVar4 = this.e;
                mpxVar.a = alsjVar;
                mpxVar.e = alsjVar4;
                mpxVar.d = 1;
                if (alsjVar4.b(mpxVar) != aojhVar) {
                    alsjVar3 = alsjVar;
                    alsjVar = alsjVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    alsjVar2 = (apdp) mpxVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        alsjVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        alsjVar2.d();
                        throw th;
                    }
                }
                alsjVar = mpxVar.e;
                alsjVar3 = (alsj) mpxVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mpxVar.a = alsjVar;
                mpxVar.e = null;
                mpxVar.d = 3;
                if (mrzVar.e(alsjVar3, mpxVar) != aojhVar) {
                    alsjVar2 = alsjVar;
                    aojhVar = aojh.a;
                    alsjVar2.d();
                }
                return aojhVar;
            }
            alsjVar = mpxVar.e;
            alsjVar3 = (alsj) mpxVar.a;
            aooc.af(obj);
            F(new aenj("logDisplayedPostScreeningQuickRelyChip"));
            defpackage.mpo mpoVar = this.b;
            mpxVar.a = alsjVar3;
            mpxVar.e = alsjVar;
            mpxVar.d = 2;
            if (mpoVar.h(alsjVar3, mpxVar) != aojhVar) {
                mrzVar = this.i;
                mpxVar.a = alsjVar;
                mpxVar.e = null;
                mpxVar.d = 3;
                if (mrzVar.e(alsjVar3, mpxVar) != aojhVar) {
                    alsjVar2 = alsjVar;
                    aojhVar = aojh.a;
                    alsjVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            alsj alsjVar5 = alsjVar;
            th = th3;
            alsjVar2 = alsjVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: all -> 0x0051, PHI: r2 r9
      0x0099: PHI (r2v5 mta) = (r2v4 mta), (r2v11 mta) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v7 mta) = (r9v6 mta), (r9v11 mta) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x0043, B:35:0x0099, B:23:0x004d, B:33:0x008b, B:31:0x0073), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.mta mtaVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpy mpyVar;
        java.lang.Throwable th;
        defpackage.mta mtaVar2;
        defpackage.mta mtaVar3;
        defpackage.mrz mrzVar;
        defpackage.mrg mrgVar;
        if (aolnVar instanceof defpackage.mpy) {
            mpyVar = (defpackage.mpy) aolnVar;
            int i = mpyVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpyVar.d = i - Integer.MIN_VALUE;
            } else {
                mpyVar = new defpackage.mpy(this, aolnVar);
            }
        } else {
            mpyVar = new defpackage.mpy(this, aolnVar);
        }
        java.lang.Object obj = mpyVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpyVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.mta mtaVar4 = this.e;
                mpyVar.a = mtaVar;
                mpyVar.e = mtaVar4;
                mpyVar.d = 1;
                if (mtaVar4.b(mpyVar) != aojhVar) {
                    mtaVar3 = mtaVar;
                    mtaVar = mtaVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    mtaVar = mpyVar.e;
                    mtaVar3 = (defpackage.mta) mpyVar.a;
                    aooc.af(obj);
                    mrzVar = this.i;
                    mpyVar.a = mtaVar3;
                    mpyVar.e = mtaVar;
                    mpyVar.d = 3;
                    if (mrzVar.g(mtaVar3, mpyVar) != aojhVar) {
                        mrgVar = this.c;
                        mpyVar.a = mtaVar;
                        mpyVar.e = null;
                        mpyVar.d = 4;
                        if (mrgVar.e(mtaVar3, mpyVar) != aojhVar) {
                            mtaVar2 = mtaVar;
                            aojhVar = aojh.a;
                            mtaVar2.d();
                        }
                    }
                    return aojhVar;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mtaVar2 = (apdp) mpyVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        mtaVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mtaVar2.d();
                        throw th;
                    }
                }
                mtaVar = mpyVar.e;
                mtaVar3 = (defpackage.mta) mpyVar.a;
                aooc.af(obj);
                mrgVar = this.c;
                mpyVar.a = mtaVar;
                mpyVar.e = null;
                mpyVar.d = 4;
                if (mrgVar.e(mtaVar3, mpyVar) != aojhVar) {
                    mtaVar2 = mtaVar;
                    aojhVar = aojh.a;
                    mtaVar2.d();
                }
                return aojhVar;
            }
            mtaVar = mpyVar.e;
            mtaVar3 = (defpackage.mta) mpyVar.a;
            aooc.af(obj);
            F(new aenj("logDobbyCallScreeningVoteWithReason"));
            defpackage.mpo mpoVar = this.b;
            mpyVar.a = mtaVar3;
            mpyVar.e = mtaVar;
            mpyVar.d = 2;
            if (mpoVar.j(mtaVar3, mpyVar) != aojhVar) {
                mrzVar = this.i;
                mpyVar.a = mtaVar3;
                mpyVar.e = mtaVar;
                mpyVar.d = 3;
                if (mrzVar.g(mtaVar3, mpyVar) != aojhVar) {
                    mrgVar = this.c;
                    mpyVar.a = mtaVar;
                    mpyVar.e = null;
                    mpyVar.d = 4;
                    if (mrgVar.e(mtaVar3, mpyVar) != aojhVar) {
                        mtaVar2 = mtaVar;
                        aojhVar = aojh.a;
                        mtaVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.mta mtaVar5 = mtaVar;
            th = th3;
            mtaVar2 = mtaVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(defpackage.mzv mzvVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mpz mpzVar;
        java.lang.Throwable th;
        defpackage.mzv mzvVar2;
        defpackage.mzv mzvVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mpz) {
            mpzVar = (defpackage.mpz) aolnVar;
            int i = mpzVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpzVar.d = i - Integer.MIN_VALUE;
            } else {
                mpzVar = new defpackage.mpz(this, aolnVar);
            }
        } else {
            mpzVar = new defpackage.mpz(this, aolnVar);
        }
        java.lang.Object obj = mpzVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mpzVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.mzv mzvVar4 = this.e;
                mpzVar.a = mzvVar;
                mpzVar.e = mzvVar4;
                mpzVar.d = 1;
                if (mzvVar4.b(mpzVar) != aojhVar) {
                    mzvVar3 = mzvVar;
                    mzvVar = mzvVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mzvVar2 = (apdp) mpzVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        mzvVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mzvVar2.d();
                        throw th;
                    }
                }
                mzvVar = mpzVar.e;
                mzvVar3 = (defpackage.mzv) mpzVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mpzVar.a = mzvVar;
                mpzVar.e = null;
                mpzVar.d = 3;
                if (mrzVar.h(mzvVar3, mpzVar) != aojhVar) {
                    mzvVar2 = mzvVar;
                    aojhVar = aojh.a;
                    mzvVar2.d();
                }
                return aojhVar;
            }
            mzvVar = mpzVar.e;
            mzvVar3 = (defpackage.mzv) mpzVar.a;
            aooc.af(obj);
            F(new aenj("logDobbyCallerType"));
            defpackage.mpo mpoVar = this.b;
            mpzVar.a = mzvVar3;
            mpzVar.e = mzvVar;
            mpzVar.d = 2;
            if (mpoVar.k(mzvVar3, mpzVar) != aojhVar) {
                mrzVar = this.i;
                mpzVar.a = mzvVar;
                mpzVar.e = null;
                mpzVar.d = 3;
                if (mrzVar.h(mzvVar3, mpzVar) != aojhVar) {
                    mzvVar2 = mzvVar;
                    aojhVar = aojh.a;
                    mzvVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.mzv mzvVar5 = mzvVar;
            th = th3;
            mzvVar2 = mzvVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(defpackage.nfb nfbVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqa mqaVar;
        java.lang.Throwable th;
        defpackage.nfb nfbVar2;
        defpackage.nfb nfbVar3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mqa) {
            mqaVar = (defpackage.mqa) aolnVar;
            int i = mqaVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqaVar.d = i - Integer.MIN_VALUE;
            } else {
                mqaVar = new defpackage.mqa(this, aolnVar);
            }
        } else {
            mqaVar = new defpackage.mqa(this, aolnVar);
        }
        java.lang.Object obj = mqaVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqaVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.nfb nfbVar4 = this.e;
                mqaVar.a = nfbVar;
                mqaVar.e = nfbVar4;
                mqaVar.d = 1;
                if (nfbVar4.b(mqaVar) != aojhVar) {
                    nfbVar3 = nfbVar;
                    nfbVar = nfbVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nfbVar2 = (apdp) mqaVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        nfbVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        nfbVar2.d();
                        throw th;
                    }
                }
                nfbVar = mqaVar.e;
                nfbVar3 = (defpackage.nfb) mqaVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqaVar.a = nfbVar;
                mqaVar.e = null;
                mqaVar.d = 3;
                if (mrzVar.j(nfbVar3, mqaVar) != aojhVar) {
                    nfbVar2 = nfbVar;
                    aojhVar = aojh.a;
                    nfbVar2.d();
                }
                return aojhVar;
            }
            nfbVar = mqaVar.e;
            nfbVar3 = (defpackage.nfb) mqaVar.a;
            aooc.af(obj);
            F(new aenj("logDobbyPreconditionFailure"));
            defpackage.mpo mpoVar = this.b;
            mqaVar.a = nfbVar3;
            mqaVar.e = nfbVar;
            mqaVar.d = 2;
            if (mpoVar.m(nfbVar3, mqaVar) != aojhVar) {
                mrzVar = this.i;
                mqaVar.a = nfbVar;
                mqaVar.e = null;
                mqaVar.d = 3;
                if (mrzVar.j(nfbVar3, mqaVar) != aojhVar) {
                    nfbVar2 = nfbVar;
                    aojhVar = aojh.a;
                    nfbVar2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.nfb nfbVar5 = nfbVar;
            th = th3;
            nfbVar2 = nfbVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: all -> 0x0051, PHI: r2 r9
      0x0099: PHI (r2v5 nok) = (r2v4 nok), (r2v11 nok) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v7 nok) = (r9v6 nok), (r9v11 nok) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x0043, B:35:0x0099, B:23:0x004d, B:33:0x008b, B:31:0x0073), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object n(nok nokVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqb mqbVar;
        java.lang.Throwable th;
        nok nokVar2;
        nok nokVar3;
        defpackage.mrg mrgVar;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mqb) {
            mqbVar = (defpackage.mqb) aolnVar;
            int i = mqbVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqbVar.d = i - Integer.MIN_VALUE;
            } else {
                mqbVar = new defpackage.mqb(this, aolnVar);
            }
        } else {
            mqbVar = new defpackage.mqb(this, aolnVar);
        }
        java.lang.Object obj = mqbVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqbVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                nok nokVar4 = this.e;
                mqbVar.a = nokVar;
                mqbVar.e = nokVar4;
                mqbVar.d = 1;
                if (nokVar4.b(mqbVar) != aojhVar) {
                    nokVar3 = nokVar;
                    nokVar = nokVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    nokVar = mqbVar.e;
                    nokVar3 = (nok) mqbVar.a;
                    aooc.af(obj);
                    mrgVar = this.c;
                    mqbVar.a = nokVar3;
                    mqbVar.e = nokVar;
                    mqbVar.d = 3;
                    if (mrgVar.g(nokVar3, mqbVar) != aojhVar) {
                        mrzVar = this.i;
                        mqbVar.a = nokVar;
                        mqbVar.e = null;
                        mqbVar.d = 4;
                        if (mrzVar.k(nokVar3, mqbVar) != aojhVar) {
                            nokVar2 = nokVar;
                            aojhVar = aojh.a;
                            nokVar2.d();
                        }
                    }
                    return aojhVar;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nokVar2 = (apdp) mqbVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        nokVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        nokVar2.d();
                        throw th;
                    }
                }
                nokVar = mqbVar.e;
                nokVar3 = (nok) mqbVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqbVar.a = nokVar;
                mqbVar.e = null;
                mqbVar.d = 4;
                if (mrzVar.k(nokVar3, mqbVar) != aojhVar) {
                    nokVar2 = nokVar;
                    aojhVar = aojh.a;
                    nokVar2.d();
                }
                return aojhVar;
            }
            nokVar = mqbVar.e;
            nokVar3 = (nok) mqbVar.a;
            aooc.af(obj);
            F(new aenj("logDobbySettingsData"));
            defpackage.mpo mpoVar = this.b;
            mqbVar.a = nokVar3;
            mqbVar.e = nokVar;
            mqbVar.d = 2;
            if (mpoVar.n(nokVar3, mqbVar) != aojhVar) {
                mrgVar = this.c;
                mqbVar.a = nokVar3;
                mqbVar.e = nokVar;
                mqbVar.d = 3;
                if (mrgVar.g(nokVar3, mqbVar) != aojhVar) {
                    mrzVar = this.i;
                    mqbVar.a = nokVar;
                    mqbVar.e = null;
                    mqbVar.d = 4;
                    if (mrzVar.k(nokVar3, mqbVar) != aojhVar) {
                        nokVar2 = nokVar;
                        aojhVar = aojh.a;
                        nokVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            nok nokVar5 = nokVar;
            th = th3;
            nokVar2 = nokVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: all -> 0x0051, PHI: r2 r9
      0x0099: PHI (r2v5 msg) = (r2v4 msg), (r2v11 msg) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v7 msg) = (r9v6 msg), (r9v11 msg) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x0043, B:35:0x0099, B:23:0x004d, B:33:0x008b, B:31:0x0073), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object o(defpackage.msg msgVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqc mqcVar;
        java.lang.Throwable th;
        defpackage.msg msgVar2;
        defpackage.msg msgVar3;
        defpackage.mrg mrgVar;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mqc) {
            mqcVar = (defpackage.mqc) aolnVar;
            int i = mqcVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqcVar.d = i - Integer.MIN_VALUE;
            } else {
                mqcVar = new defpackage.mqc(this, aolnVar);
            }
        } else {
            mqcVar = new defpackage.mqc(this, aolnVar);
        }
        java.lang.Object obj = mqcVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqcVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.msg msgVar4 = this.e;
                mqcVar.a = msgVar;
                mqcVar.e = msgVar4;
                mqcVar.d = 1;
                if (msgVar4.b(mqcVar) != aojhVar) {
                    msgVar3 = msgVar;
                    msgVar = msgVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    msgVar = mqcVar.e;
                    msgVar3 = (defpackage.msg) mqcVar.a;
                    aooc.af(obj);
                    mrgVar = this.c;
                    mqcVar.a = msgVar3;
                    mqcVar.e = msgVar;
                    mqcVar.d = 3;
                    if (mrgVar.h(msgVar3, mqcVar) != aojhVar) {
                        mrzVar = this.i;
                        mqcVar.a = msgVar;
                        mqcVar.e = null;
                        mqcVar.d = 4;
                        if (mrzVar.l(msgVar3, mqcVar) != aojhVar) {
                            msgVar2 = msgVar;
                            aojhVar = aojh.a;
                            msgVar2.d();
                        }
                    }
                    return aojhVar;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    msgVar2 = (apdp) mqcVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        msgVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        msgVar2.d();
                        throw th;
                    }
                }
                msgVar = mqcVar.e;
                msgVar3 = (defpackage.msg) mqcVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqcVar.a = msgVar;
                mqcVar.e = null;
                mqcVar.d = 4;
                if (mrzVar.l(msgVar3, mqcVar) != aojhVar) {
                    msgVar2 = msgVar;
                    aojhVar = aojh.a;
                    msgVar2.d();
                }
                return aojhVar;
            }
            msgVar = mqcVar.e;
            msgVar3 = (defpackage.msg) mqcVar.a;
            aooc.af(obj);
            F(new aenj("logDobbySpamStatus"));
            defpackage.mpo mpoVar = this.b;
            mqcVar.a = msgVar3;
            mqcVar.e = msgVar;
            mqcVar.d = 2;
            if (mpoVar.o(msgVar3, mqcVar) != aojhVar) {
                mrgVar = this.c;
                mqcVar.a = msgVar3;
                mqcVar.e = msgVar;
                mqcVar.d = 3;
                if (mrgVar.h(msgVar3, mqcVar) != aojhVar) {
                    mrzVar = this.i;
                    mqcVar.a = msgVar;
                    mqcVar.e = null;
                    mqcVar.d = 4;
                    if (mrzVar.l(msgVar3, mqcVar) != aojhVar) {
                        msgVar2 = msgVar;
                        aojhVar = aojh.a;
                        msgVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.msg msgVar5 = msgVar;
            th = th3;
            msgVar2 = msgVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object p(mnm mnmVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqd mqdVar;
        mnm mnmVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqd) {
            mqdVar = (defpackage.mqd) aolnVar;
            int i = mqdVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqdVar.d = i - Integer.MIN_VALUE;
            } else {
                mqdVar = new defpackage.mqd(this, aolnVar);
            }
        } else {
            mqdVar = new defpackage.mqd(this, aolnVar);
        }
        java.lang.Object obj = mqdVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqdVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqdVar.a = mnmVar;
                mqdVar.e = apdpVar3;
                mqdVar.d = 1;
                if (apdpVar3.b(mqdVar) != aojhVar) {
                    mnmVar2 = mnmVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqdVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqdVar.e;
            mnmVar2 = (mnm) mqdVar.a;
            aooc.af(obj);
            F(new aenj("logDobbySupportMode"));
            defpackage.mpo mpoVar = this.b;
            mqdVar.a = apdpVar;
            mqdVar.e = null;
            mqdVar.d = 2;
            if (mpoVar.p(mnmVar2, mqdVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object q(java.lang.String str, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqe mqeVar;
        java.lang.Throwable th;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mqe) {
            mqeVar = (defpackage.mqe) aolnVar;
            int i = mqeVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqeVar.d = i - Integer.MIN_VALUE;
            } else {
                mqeVar = new defpackage.mqe(this, aolnVar);
            }
        } else {
            mqeVar = new defpackage.mqe(this, aolnVar);
        }
        java.lang.Object obj = mqeVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqeVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                java.lang.String str4 = this.e;
                mqeVar.a = str;
                mqeVar.e = str4;
                mqeVar.d = 1;
                if (str4.b(mqeVar) != aojhVar) {
                    str3 = str;
                    str = str4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (apdp) mqeVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        str2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        str2.d();
                        throw th;
                    }
                }
                str = mqeVar.e;
                str3 = (java.lang.String) mqeVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqeVar.a = str;
                mqeVar.e = null;
                mqeVar.d = 3;
                if (mrzVar.m(str3, mqeVar) != aojhVar) {
                    str2 = str;
                    aojhVar = aojh.a;
                    str2.d();
                }
                return aojhVar;
            }
            str = mqeVar.e;
            str3 = (java.lang.String) mqeVar.a;
            aooc.af(obj);
            F(new aenj("logDobbyUploadId"));
            defpackage.mpo mpoVar = this.b;
            mqeVar.a = str3;
            mqeVar.e = str;
            mqeVar.d = 2;
            if (mpoVar.q(str3, mqeVar) != aojhVar) {
                mrzVar = this.i;
                mqeVar.a = str;
                mqeVar.e = null;
                mqeVar.d = 3;
                if (mrzVar.m(str3, mqeVar) != aojhVar) {
                    str2 = str;
                    aojhVar = aojh.a;
                    str2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            java.lang.String str5 = str;
            th = th3;
            str2 = str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object r(alio alioVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqf mqfVar;
        alio alioVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqf) {
            mqfVar = (defpackage.mqf) aolnVar;
            int i = mqfVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqfVar.d = i - Integer.MIN_VALUE;
            } else {
                mqfVar = new defpackage.mqf(this, aolnVar);
            }
        } else {
            mqfVar = new defpackage.mqf(this, aolnVar);
        }
        java.lang.Object obj = mqfVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqfVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqfVar.a = alioVar;
                mqfVar.e = apdpVar3;
                mqfVar.d = 1;
                if (apdpVar3.b(mqfVar) != aojhVar) {
                    alioVar2 = alioVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqfVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqfVar.e;
            alioVar2 = (alio) mqfVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexException"));
            defpackage.mrz mrzVar = this.i;
            mqfVar.a = apdpVar;
            mqfVar.e = null;
            mqfVar.d = 2;
            if (mrzVar.n(alioVar2, mqfVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object s(alrx alrxVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqg mqgVar;
        alrx alrxVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqg) {
            mqgVar = (defpackage.mqg) aolnVar;
            int i = mqgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqgVar.d = i - Integer.MIN_VALUE;
            } else {
                mqgVar = new defpackage.mqg(this, aolnVar);
            }
        } else {
            mqgVar = new defpackage.mqg(this, aolnVar);
        }
        java.lang.Object obj = mqgVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqgVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqgVar.a = alrxVar;
                mqgVar.e = apdpVar3;
                mqgVar.d = 1;
                if (apdpVar3.b(mqgVar) != aojhVar) {
                    alrxVar2 = alrxVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqgVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqgVar.e;
            alrxVar2 = (alrx) mqgVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexExtractionLlmInferenceFailure"));
            defpackage.mpo mpoVar = this.b;
            mqgVar.a = apdpVar;
            mqgVar.e = null;
            mqgVar.d = 2;
            if (mpoVar.r(alrxVar2, mqgVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object t(alsg alsgVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqh mqhVar;
        alsg alsgVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqh) {
            mqhVar = (defpackage.mqh) aolnVar;
            int i = mqhVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqhVar.d = i - Integer.MIN_VALUE;
            } else {
                mqhVar = new defpackage.mqh(this, aolnVar);
            }
        } else {
            mqhVar = new defpackage.mqh(this, aolnVar);
        }
        java.lang.Object obj = mqhVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqhVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqhVar.a = alsgVar;
                mqhVar.e = apdpVar3;
                mqhVar.d = 1;
                if (apdpVar3.b(mqhVar) != aojhVar) {
                    alsgVar2 = alsgVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqhVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqhVar.e;
            alsgVar2 = (alsg) mqhVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexModelIntentsPrediction"));
            defpackage.mrg mrgVar = this.c;
            mqhVar.a = apdpVar;
            mqhVar.e = null;
            mqhVar.d = 2;
            if (mrgVar.i(alsgVar2, mqhVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object u(java.lang.String str, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqi mqiVar;
        java.lang.Throwable th;
        java.lang.String str2;
        java.lang.String str3;
        defpackage.mrg mrgVar;
        if (aolnVar instanceof defpackage.mqi) {
            mqiVar = (defpackage.mqi) aolnVar;
            int i = mqiVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqiVar.d = i - Integer.MIN_VALUE;
            } else {
                mqiVar = new defpackage.mqi(this, aolnVar);
            }
        } else {
            mqiVar = new defpackage.mqi(this, aolnVar);
        }
        java.lang.Object obj = mqiVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqiVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                java.lang.String str4 = this.e;
                mqiVar.a = str;
                mqiVar.e = str4;
                mqiVar.d = 1;
                if (str4.b(mqiVar) != aojhVar) {
                    str3 = str;
                    str = str4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (apdp) mqiVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        str2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        str2.d();
                        throw th;
                    }
                }
                str = mqiVar.e;
                str3 = (java.lang.String) mqiVar.a;
                aooc.af(obj);
                mrgVar = this.c;
                mqiVar.a = str;
                mqiVar.e = null;
                mqiVar.d = 3;
                if (mrgVar.j(str3, mqiVar) != aojhVar) {
                    str2 = str;
                    aojhVar = aojh.a;
                    str2.d();
                }
                return aojhVar;
            }
            str = mqiVar.e;
            str3 = (java.lang.String) mqiVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexModelVersion"));
            defpackage.mpo mpoVar = this.b;
            mqiVar.a = str3;
            mqiVar.e = str;
            mqiVar.d = 2;
            if (mpoVar.s(str3, mqiVar) != aojhVar) {
                mrgVar = this.c;
                mqiVar.a = str;
                mqiVar.e = null;
                mqiVar.d = 3;
                if (mrgVar.j(str3, mqiVar) != aojhVar) {
                    str2 = str;
                    aojhVar = aojh.a;
                    str2.d();
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            java.lang.String str5 = str;
            th = th3;
            str2 = str5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object v(altn altnVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqj mqjVar;
        altn altnVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqj) {
            mqjVar = (defpackage.mqj) aolnVar;
            int i = mqjVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqjVar.d = i - Integer.MIN_VALUE;
            } else {
                mqjVar = new defpackage.mqj(this, aolnVar);
            }
        } else {
            mqjVar = new defpackage.mqj(this, aolnVar);
        }
        java.lang.Object obj = mqjVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqjVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqjVar.a = altnVar;
                mqjVar.e = apdpVar3;
                mqjVar.d = 1;
                if (apdpVar3.b(mqjVar) != aojhVar) {
                    altnVar2 = altnVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqjVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqjVar.e;
            altnVar2 = (altn) mqjVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexRecognitionEventLog"));
            defpackage.mrz mrzVar = this.i;
            mqjVar.a = apdpVar;
            mqjVar.e = null;
            mqjVar.d = 2;
            if (mrzVar.o(altnVar2, mqjVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: all -> 0x0051, PHI: r2 r9
      0x0099: PHI (r2v5 alxy) = (r2v4 alxy), (r2v11 alxy) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x0099: PHI (r9v7 alxy) = (r9v6 alxy), (r9v11 alxy) binds: [B:34:0x0097, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x0043, B:35:0x0099, B:23:0x004d, B:33:0x008b, B:31:0x0073), top: B:44:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object w(alxy alxyVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqk mqkVar;
        java.lang.Throwable th;
        alxy alxyVar2;
        alxy alxyVar3;
        defpackage.mrg mrgVar;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mqk) {
            mqkVar = (defpackage.mqk) aolnVar;
            int i = mqkVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqkVar.d = i - Integer.MIN_VALUE;
            } else {
                mqkVar = new defpackage.mqk(this, aolnVar);
            }
        } else {
            mqkVar = new defpackage.mqk(this, aolnVar);
        }
        java.lang.Object obj = mqkVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqkVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                alxy alxyVar4 = this.e;
                mqkVar.a = alxyVar;
                mqkVar.e = alxyVar4;
                mqkVar.d = 1;
                if (alxyVar4.b(mqkVar) != aojhVar) {
                    alxyVar3 = alxyVar;
                    alxyVar = alxyVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    alxyVar = mqkVar.e;
                    alxyVar3 = (alxy) mqkVar.a;
                    aooc.af(obj);
                    mrgVar = this.c;
                    mqkVar.a = alxyVar3;
                    mqkVar.e = alxyVar;
                    mqkVar.d = 3;
                    if (mrgVar.k(alxyVar3, mqkVar) != aojhVar) {
                        mrzVar = this.i;
                        mqkVar.a = alxyVar;
                        mqkVar.e = null;
                        mqkVar.d = 4;
                        if (mrzVar.p(alxyVar3, mqkVar) != aojhVar) {
                            alxyVar2 = alxyVar;
                            aojhVar = aojh.a;
                            alxyVar2.d();
                        }
                    }
                    return aojhVar;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    alxyVar2 = (apdp) mqkVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        alxyVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        alxyVar2.d();
                        throw th;
                    }
                }
                alxyVar = mqkVar.e;
                alxyVar3 = (alxy) mqkVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqkVar.a = alxyVar;
                mqkVar.e = null;
                mqkVar.d = 4;
                if (mrzVar.p(alxyVar3, mqkVar) != aojhVar) {
                    alxyVar2 = alxyVar;
                    aojhVar = aojh.a;
                    alxyVar2.d();
                }
                return aojhVar;
            }
            alxyVar = mqkVar.e;
            alxyVar3 = (alxy) mqkVar.a;
            aooc.af(obj);
            F(new aenj("logDuplexSpamDecisionEvent"));
            defpackage.mpo mpoVar = this.b;
            mqkVar.a = alxyVar3;
            mqkVar.e = alxyVar;
            mqkVar.d = 2;
            if (mpoVar.t(alxyVar3, mqkVar) != aojhVar) {
                mrgVar = this.c;
                mqkVar.a = alxyVar3;
                mqkVar.e = alxyVar;
                mqkVar.d = 3;
                if (mrgVar.k(alxyVar3, mqkVar) != aojhVar) {
                    mrzVar = this.i;
                    mqkVar.a = alxyVar;
                    mqkVar.e = null;
                    mqkVar.d = 4;
                    if (mrzVar.p(alxyVar3, mqkVar) != aojhVar) {
                        alxyVar2 = alxyVar;
                        aojhVar = aojh.a;
                        alxyVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            alxy alxyVar5 = alxyVar;
            th = th3;
            alxyVar2 = alxyVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object x(defpackage.nvp nvpVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mql mqlVar;
        java.lang.Throwable th;
        defpackage.nvp nvpVar2;
        defpackage.nvp nvpVar3;
        long j;
        defpackage.mrg mrgVar;
        long j2;
        defpackage.mrz mrzVar;
        if (aolnVar instanceof defpackage.mql) {
            mqlVar = (defpackage.mql) aolnVar;
            int i = mqlVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqlVar.e = i - Integer.MIN_VALUE;
            } else {
                mqlVar = new defpackage.mql(this, aolnVar);
            }
        } else {
            mqlVar = new defpackage.mql(this, aolnVar);
        }
        java.lang.Object obj = mqlVar.c;
        aojh aojhVar = aolu.a;
        int i2 = mqlVar.e;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                defpackage.nvp nvpVar4 = this.e;
                mqlVar.a = nvpVar;
                mqlVar.f = nvpVar4;
                mqlVar.e = 1;
                if (nvpVar4.b(mqlVar) != aojhVar) {
                    nvpVar3 = nvpVar;
                    nvpVar = nvpVar4;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    j = mqlVar.b;
                    nvpVar = mqlVar.f;
                    nvpVar3 = (defpackage.nvp) mqlVar.a;
                    aooc.af(obj);
                    mrgVar = this.c;
                    mqlVar.a = nvpVar3;
                    mqlVar.f = nvpVar;
                    mqlVar.b = j;
                    mqlVar.e = 3;
                    if (mrgVar.f(nvpVar3, mqlVar) != aojhVar) {
                        j2 = j;
                        mrzVar = this.i;
                        mqlVar.a = nvpVar;
                        mqlVar.f = null;
                        mqlVar.e = 4;
                        if (mrzVar.i(nvpVar3, j2, mqlVar) != aojhVar) {
                            nvpVar2 = nvpVar;
                            aojhVar = aojh.a;
                            nvpVar2.d();
                        }
                    }
                    return aojhVar;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nvpVar2 = (apdp) mqlVar.a;
                    try {
                        aooc.af(obj);
                        aojhVar = aojh.a;
                        nvpVar2.d();
                        return aojhVar;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        nvpVar2.d();
                        throw th;
                    }
                }
                j2 = mqlVar.b;
                nvpVar = mqlVar.f;
                nvpVar3 = (defpackage.nvp) mqlVar.a;
                aooc.af(obj);
                mrzVar = this.i;
                mqlVar.a = nvpVar;
                mqlVar.f = null;
                mqlVar.e = 4;
                if (mrzVar.i(nvpVar3, j2, mqlVar) != aojhVar) {
                    nvpVar2 = nvpVar;
                    aojhVar = aojh.a;
                    nvpVar2.d();
                }
                return aojhVar;
            }
            nvpVar = mqlVar.f;
            nvpVar3 = (defpackage.nvp) mqlVar.a;
            aooc.af(obj);
            F(aenj.a(new aenj("logEvent with event type "), aenj.c((java.lang.String) null, nvpVar3)));
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            java.lang.Long l = this.k;
            long jLongValue = l != null ? l.longValue() : jElapsedRealtime;
            this.k = java.lang.Long.valueOf(jLongValue);
            long j3 = jElapsedRealtime - jLongValue;
            defpackage.mpo mpoVar = this.b;
            mqlVar.a = nvpVar3;
            mqlVar.f = nvpVar;
            mqlVar.b = j3;
            mqlVar.e = 2;
            if (mpoVar.l(nvpVar3, j3, mqlVar) != aojhVar) {
                j = j3;
                mrgVar = this.c;
                mqlVar.a = nvpVar3;
                mqlVar.f = nvpVar;
                mqlVar.b = j;
                mqlVar.e = 3;
                if (mrgVar.f(nvpVar3, mqlVar) != aojhVar) {
                    j2 = j;
                    mrzVar = this.i;
                    mqlVar.a = nvpVar;
                    mqlVar.f = null;
                    mqlVar.e = 4;
                    if (mrzVar.i(nvpVar3, j2, mqlVar) != aojhVar) {
                        nvpVar2 = nvpVar;
                        aojhVar = aojh.a;
                        nvpVar2.d();
                    }
                }
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            defpackage.nvp nvpVar5 = nvpVar;
            th = th3;
            nvpVar2 = nvpVar5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object y(alri alriVar, aoln aolnVar) throws java.lang.Throwable {
        defpackage.mqm mqmVar;
        alri alriVar2;
        apdp apdpVar;
        java.lang.Throwable th;
        apdp apdpVar2;
        if (aolnVar instanceof defpackage.mqm) {
            mqmVar = (defpackage.mqm) aolnVar;
            int i = mqmVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqmVar.d = i - Integer.MIN_VALUE;
            } else {
                mqmVar = new defpackage.mqm(this, aolnVar);
            }
        } else {
            mqmVar = new defpackage.mqm(this, aolnVar);
        }
        java.lang.Object obj = mqmVar.b;
        aojh aojhVar = aolu.a;
        int i2 = mqmVar.d;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar3 = this.e;
                mqmVar.a = alriVar;
                mqmVar.e = apdpVar3;
                mqmVar.d = 1;
                if (apdpVar3.b(mqmVar) != aojhVar) {
                    alriVar2 = alriVar;
                    apdpVar = apdpVar3;
                }
                return aojhVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apdpVar2 = (apdp) mqmVar.a;
                try {
                    aooc.af(obj);
                    aojhVar = aojh.a;
                    apdpVar2.d();
                    return aojhVar;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    apdpVar2.d();
                    throw th;
                }
            }
            apdpVar = mqmVar.e;
            alriVar2 = (alri) mqmVar.a;
            aooc.af(obj);
            F(new aenj("logExperimentSummaryEvent"));
            defpackage.mpo mpoVar = this.b;
            mqmVar.a = apdpVar;
            mqmVar.e = null;
            mqmVar.d = 2;
            if (mpoVar.u(alriVar2, mqmVar) != aojhVar) {
                apdpVar2 = apdpVar;
                aojhVar = aojh.a;
                apdpVar2.d();
            }
            return aojhVar;
        } catch (java.lang.Throwable th3) {
            apdp apdpVar4 = apdpVar;
            th = th3;
            apdpVar2 = apdpVar4;
            apdpVar2.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a5 A[Catch: all -> 0x0051, PHI: r2 r9
      0x00a5: PHI (r2v5 tvx) = (r2v4 tvx), (r2v11 tvx) binds: [B:38:0x00a3, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r9v8 tvx) = (r9v6 tvx), (r9v12 tvx) binds: [B:38:0x00a3, B:20:0x0043] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:20:0x0043, B:39:0x00a5, B:23:0x004d, B:37:0x0097, B:31:0x0073, B:33:0x0081, B:35:0x0087), top: B:48:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
    
        if (r8.l(r2, r0) != r1) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(tvx r9, aoln r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.mqn
            if (r0 == 0) goto L13
            r0 = r10
            mqn r0 = (defpackage.mqn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            mqn r0 = new mqn
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            aolu r1 = aolu.a
            int r2 = r0.d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L60
            if (r2 == r6) goto L56
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r8 = r0.a
            apdp r8 = (apdp) r8
            aooc.af(r10)     // Catch: java.lang.Throwable -> Lbb
            goto Lb5
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            apdp r9 = r0.e
            java.lang.Object r2 = r0.a
            tvx r2 = (tvx) r2
            aooc.af(r10)     // Catch: java.lang.Throwable -> L51
            goto La5
        L47:
            apdp r9 = r0.e
            java.lang.Object r2 = r0.a
            tvx r2 = (tvx) r2
            aooc.af(r10)     // Catch: java.lang.Throwable -> L51
            goto L97
        L51:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto Lbc
        L56:
            apdp r9 = r0.e
            java.lang.Object r2 = r0.a
            tvx r2 = (tvx) r2
            aooc.af(r10)
            goto L73
        L60:
            aooc.af(r10)
            apdp r10 = r8.e
            r0.a = r9
            r0.e = r10
            r0.d = r6
            java.lang.Object r2 = r10.b(r0)
            if (r2 == r1) goto Lc0
            r2 = r9
            r9 = r10
        L73:
            java.lang.String r10 = "logLanguageDetectionEvent"
            aenj r6 = new aenj     // Catch: java.lang.Throwable -> L51
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L51
            r8.F(r6)     // Catch: java.lang.Throwable -> L51
            tvx r10 = r8.l     // Catch: java.lang.Throwable -> L51
            if (r10 == 0) goto L87
            boolean r10 = aooh.n(r10, r2)     // Catch: java.lang.Throwable -> L51
            if (r10 != 0) goto Lb4
        L87:
            r8.l = r2     // Catch: java.lang.Throwable -> L51
            mpo r10 = r8.b     // Catch: java.lang.Throwable -> L51
            r0.a = r2     // Catch: java.lang.Throwable -> L51
            r0.e = r9     // Catch: java.lang.Throwable -> L51
            r0.d = r5     // Catch: java.lang.Throwable -> L51
            java.lang.Object r10 = r10.v(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r10 == r1) goto Lc0
        L97:
            mrz r10 = r8.i     // Catch: java.lang.Throwable -> L51
            r0.a = r2     // Catch: java.lang.Throwable -> L51
            r0.e = r9     // Catch: java.lang.Throwable -> L51
            r0.d = r4     // Catch: java.lang.Throwable -> L51
            java.lang.Object r10 = r10.q(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r10 == r1) goto Lc0
        La5:
            mrg r8 = r8.c     // Catch: java.lang.Throwable -> L51
            r0.a = r9     // Catch: java.lang.Throwable -> L51
            r10 = 0
            r0.e = r10     // Catch: java.lang.Throwable -> L51
            r0.d = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r8 = r8.l(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r8 == r1) goto Lc0
        Lb4:
            r8 = r9
        Lb5:
            aojh r1 = aojh.a     // Catch: java.lang.Throwable -> Lbb
            r8.d()
            goto Lc0
        Lbb:
            r9 = move-exception
        Lbc:
            r8.d()
            throw r9
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqt.z(tvx, aoln):java.lang.Object");
    }
}
