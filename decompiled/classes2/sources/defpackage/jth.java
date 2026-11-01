package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jth {
    private static final aimz a = aimz.i("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController");
    private final jsk b;
    private final phg c;
    private final defpackage.jsv d;
    private boolean e;
    private final zpz f;
    private final qbe g;
    private final apdp h;
    private final defpackage.jiv i;
    private final afpl j;

    public jth(jsk jskVar, defpackage.jiv jivVar, zpz zpzVar, afpl afplVar, aazc aazcVar, qbe qbeVar, phg phgVar, defpackage.jsv jsvVar) {
        aooh.f(jskVar, "callerIdFeedbackDatabase");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(afplVar, "inCallProductionBuilder");
        aooh.f(aazcVar, "clock");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(jsvVar, "callerIdFeedbackSnackbarController");
        this.b = jskVar;
        this.i = jivVar;
        this.f = zpzVar;
        this.j = afplVar;
        this.g = qbeVar;
        this.c = phgVar;
        this.d = jsvVar;
        this.h = new apdp();
    }

    private static final boolean f(sql sqlVar) {
        if (sqlVar.b() == rmt.a) {
            java.lang.String strK = sqlVar.k();
            aooh.e(strK, "getTranscriptInferredName(...)");
            if (!aoov.H(strK)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.jtc jtcVar;
        sql sqlVar;
        java.lang.String strK;
        if (aolnVar instanceof defpackage.jtc) {
            jtcVar = (defpackage.jtc) aolnVar;
            int i = jtcVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtcVar.c = i - Integer.MIN_VALUE;
            } else {
                jtcVar = new defpackage.jtc(this, aolnVar);
            }
        } else {
            jtcVar = new defpackage.jtc(this, aolnVar);
        }
        java.lang.Object objB = jtcVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jtcVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objB);
            }
            sqlVar = (sql) objB;
            if (defpackage.hhv.i(sqlVar.b())) {
                strK = sqlVar.h();
                if (strK != null || aoov.H(strK)) {
                }
            } else {
                if (sqlVar.b() == rmt.a) {
                    return null;
                }
                strK = sqlVar.k();
                aooh.c(strK);
                if (aoov.H(strK)) {
                    return null;
                }
            }
            return strK;
        }
        aooc.af(objB);
        jtcVar.c = 1;
        objB = b(jtcVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        ajcq ajcqVarBg = ((defpackage.jtb) objB).bg();
        jtcVar.c = 2;
        objB = aosv.D(ajcqVarBg, jtcVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        sqlVar = (sql) objB;
        if (defpackage.hhv.i(sqlVar.b())) {
            strK = sqlVar.h();
            return strK != null ? null : null;
        }
        if (sqlVar.b() == rmt.a) {
            return null;
        }
        strK = sqlVar.k();
        aooh.c(strK);
        if (aoov.H(strK)) {
            return null;
        }
        return strK;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(aoln aolnVar) {
        defpackage.jte jteVar;
        if (aolnVar instanceof defpackage.jte) {
            jteVar = (defpackage.jte) aolnVar;
            int i = jteVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jteVar.c = i - Integer.MIN_VALUE;
            } else {
                jteVar = new defpackage.jte(this, aolnVar);
            }
        } else {
            jteVar = new defpackage.jte(this, aolnVar);
        }
        java.lang.Object objD = jteVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jteVar.c;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarX = this.j.X();
            jteVar.c = 1;
            objD = aosv.D(ajcqVarX, jteVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        java.lang.Object objAr = aooc.ar(objD, defpackage.jtb.class);
        aooh.e(objAr, "get(...)");
        return objAr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.jtf jtfVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.jtf) {
            jtfVar = (defpackage.jtf) aolnVar;
            int i = jtfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtfVar.c = i - Integer.MIN_VALUE;
            } else {
                jtfVar = new defpackage.jtf(this, aolnVar);
            }
        } else {
            jtfVar = new defpackage.jtf(this, aolnVar);
        }
        java.lang.Object obj = jtfVar.a;
        java.lang.Boolean boolValueOf = aolu.a;
        int i2 = jtfVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.h;
                jtfVar.d = apdpVar2;
                jtfVar.c = 1;
                if (apdpVar2.b(jtfVar) != boolValueOf) {
                    apdpVar = apdpVar2;
                }
                return boolValueOf;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = jtfVar.d;
            aooc.af(obj);
            boolValueOf = java.lang.Boolean.valueOf(this.e);
            return boolValueOf;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(aoln aolnVar) {
        defpackage.jtg jtgVar;
        apdp apdpVar;
        qbc qbcVar;
        if (aolnVar instanceof defpackage.jtg) {
            jtgVar = (defpackage.jtg) aolnVar;
            int i = jtgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jtgVar.c = i - Integer.MIN_VALUE;
            } else {
                jtgVar = new defpackage.jtg(this, aolnVar);
            }
        } else {
            jtgVar = new defpackage.jtg(this, aolnVar);
        }
        java.lang.Object objB = jtgVar.a;
        aolu aoluVar = aolu.a;
        int i2 = jtgVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    apdpVar = jtgVar.d;
                    aooc.af(objB);
                } else if (i2 == 2) {
                    aooc.af(objB);
                    ajcq ajcqVarBg = ((defpackage.jtb) objB).bg();
                    jtgVar.c = 3;
                    objB = aosv.D(ajcqVarBg, jtgVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aooc.af(objB);
                }
                if (f((sql) objB)) {
                    qbcVar = qbc.oS;
                } else {
                    qbcVar = qbc.oO;
                }
                this.g.a(qbcVar);
                return aojh.a;
            }
            aooc.af(objB);
            apdpVar = this.h;
            jtgVar.d = apdpVar;
            jtgVar.c = 1;
            if (apdpVar.b(jtgVar) == aoluVar) {
                return aoluVar;
            }
            this.e = true;
            apdpVar.d();
            this.f.a(ajcm.a);
            jtgVar.d = null;
            jtgVar.c = 2;
            objB = b(jtgVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            ajcq ajcqVarBg2 = ((defpackage.jtb) objB).bg();
            jtgVar.c = 3;
            objB = aosv.D(ajcqVarBg2, jtgVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            if (f((sql) objB)) {
                qbcVar = qbc.oS;
            } else {
                qbcVar = qbc.oO;
            }
            this.g.a(qbcVar);
            return aojh.a;
        } catch (java.lang.Throwable th) {
            apdpVar.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:107:0x0419  */
    /* JADX WARN: Code duplicated, block: B:109:0x0423  */
    /* JADX WARN: Code duplicated, block: B:111:0x0426  */
    /* JADX WARN: Code duplicated, block: B:113:0x042d  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0120  */
    /* JADX WARN: Code duplicated, block: B:32:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0144  */
    /* JADX WARN: Code duplicated, block: B:41:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x015b  */
    /* JADX WARN: Code duplicated, block: B:46:0x015e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0161  */
    /* JADX WARN: Code duplicated, block: B:49:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0169  */
    /* JADX WARN: Code duplicated, block: B:51:0x016c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x0197  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0244  */
    /* JADX WARN: Code duplicated, block: B:79:0x0247  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x024b  */
    /* JADX WARN: Code duplicated, block: B:83:0x026b  */
    /* JADX WARN: Code duplicated, block: B:87:0x029b  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:94:0x031c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0378  */
    public final java.lang.Object e(int i, aoln aolnVar) {
        defpackage.jtd jtdVar;
        apdp apdpVar;
        int i2;
        java.lang.Object objA;
        int i3;
        int i4;
        defpackage.jtb jtbVar;
        java.lang.Object objD;
        defpackage.jtb jtbVar2;
        sql sqlVar;
        boolean zF;
        int i5;
        qbc qbcVar;
        java.lang.Object objD2;
        sql sqlVar2;
        int i6;
        defpackage.jtb jtbVar3;
        java.lang.String str;
        java.lang.Object objD3;
        java.lang.String str2;
        sql sqlVar3;
        android.telecom.PhoneAccountHandle phoneAccountHandle;
        boolean zI;
        aoiu aoiuVar;
        java.lang.String str3;
        rmt rmtVar;
        long epochMilli;
        jsm jsmVar;
        int i7;
        soz sozVar;
        ajcq ajcqVarC;
        soz sozVar2;
        boolean z;
        int i8;
        rmt rmtVar2;
        java.lang.String str4;
        android.telecom.PhoneAccountHandle phoneAccountHandle2;
        java.lang.String str5;
        sql sqlVar4;
        long j;
        ajcq ajcqVarB;
        long j2;
        java.lang.String str6;
        boolean z2;
        int i9;
        android.telecom.PhoneAccountHandle phoneAccountHandle3;
        rmt rmtVar3;
        java.lang.String str7;
        java.lang.String strH;
        phg phgVar;
        defpackage.jpi jpiVar;
        java.lang.String str8;
        java.lang.String str9;
        int i10;
        long j3;
        phg phgVar2;
        defpackage.jpi jpiVar2;
        defpackage.jhw jhwVarO;
        akzx akzxVarM;
        ajcq ajcqVarA;
        java.lang.String strG;
        if (aolnVar instanceof defpackage.jtd) {
            jtdVar = (defpackage.jtd) aolnVar;
            int i11 = jtdVar.g;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jtdVar.g = i11 - Integer.MIN_VALUE;
            } else {
                jtdVar = new defpackage.jtd(this, aolnVar);
            }
        } else {
            jtdVar = new defpackage.jtd(this, aolnVar);
        }
        java.lang.Object objB = jtdVar.e;
        aolu aoluVar = aolu.a;
        java.lang.String str10 = "build(...)";
        switch (jtdVar.g) {
            case 0:
                aooc.af(objB);
                apdpVar = this.h;
                i2 = i;
                jtdVar.l = i2;
                jtdVar.a = apdpVar;
                jtdVar.g = 1;
                if (apdpVar.b(jtdVar) == aoluVar) {
                    return aoluVar;
                }
                try {
                    this.e = true;
                    apdpVar.d();
                    defpackage.jsv jsvVar = this.d;
                    jtdVar.l = i2;
                    jtdVar.a = null;
                    jtdVar.g = 2;
                    objA = jsvVar.a(qtz.M, jtdVar);
                    if (objA != aolu.a) {
                        objA = aojh.a;
                    }
                    if (objA != aoluVar) {
                        return aoluVar;
                    }
                    i3 = i2;
                    jtdVar.l = i3;
                    jtdVar.g = 3;
                    objB = b(jtdVar);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    i4 = i3;
                    jtbVar = (defpackage.jtb) objB;
                    ajcq ajcqVarBg = jtbVar.bg();
                    jtdVar.l = i4;
                    jtdVar.a = jtbVar;
                    jtdVar.g = 4;
                    objD = aosv.D(ajcqVarBg, jtdVar);
                    if (objD != aoluVar) {
                        return aoluVar;
                    }
                    jtbVar2 = jtbVar;
                    objB = objD;
                    sqlVar = (sql) objB;
                    zF = f(sqlVar);
                    i5 = i4 - 1;
                    if (i4 == 0) {
                        throw null;
                    }
                    if (i5 == 0) {
                        throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new aois();
                        }
                        if (zF) {
                            qbcVar = qbc.oR;
                        } else {
                            qbcVar = qbc.oN;
                        }
                    } else if (zF) {
                        qbcVar = qbc.oQ;
                    } else {
                        qbcVar = qbc.oM;
                    }
                    this.g.a(qbcVar);
                    ajcq ajcqVarBl = jtbVar2.bl();
                    jtdVar.l = i4;
                    jtdVar.a = jtbVar2;
                    jtdVar.b = sqlVar;
                    jtdVar.g = 5;
                    objD2 = aosv.D(ajcqVarBl, jtdVar);
                    if (objD2 == aoluVar) {
                        return aoluVar;
                    }
                    defpackage.jtb jtbVar4 = jtbVar2;
                    sqlVar2 = sqlVar;
                    objB = objD2;
                    i6 = i4;
                    jtbVar3 = jtbVar4;
                    str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                    if (str == null) {
                        a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                        return aojh.a;
                    }
                    ajcq ajcqVarBa = jtbVar3.ba();
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar2;
                    jtdVar.b = str;
                    jtdVar.g = 6;
                    objD3 = aosv.D(ajcqVarBa, jtdVar);
                    if (objD3 != aoluVar) {
                        return aoluVar;
                    }
                    sql sqlVar5 = sqlVar2;
                    str2 = str;
                    objB = objD3;
                    sqlVar3 = sqlVar5;
                    phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                    zI = defpackage.hhv.i(sqlVar3.b());
                    if (zI) {
                        strH = sqlVar3.h();
                        if (strH != null || aoov.H(strH)) {
                            strH = null;
                        }
                        rmt rmtVarB = sqlVar3.b();
                        if (strH == null) {
                            strH = "";
                        }
                        aoiuVar = new aoiu(strH, rmtVarB);
                    } else {
                        aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                    }
                    str3 = (java.lang.String) aoiuVar.a;
                    rmtVar = (rmt) aoiuVar.b;
                    epochMilli = j$.time.Instant.now().toEpochMilli();
                    akzx akzxVarM2 = jsm.a.m();
                    akzxVarM2.u();
                    jsm jsmVar2 = akzxVarM2.b;
                    jsmVar2.b |= 2;
                    jsmVar2.d = epochMilli;
                    jsm jsmVarP = akzxVarM2.p();
                    aooh.e(jsmVarP, "build(...)");
                    jsmVar = jsmVarP;
                    i7 = i6 - 1;
                    if (i6 == 0) {
                        throw null;
                    }
                    if (i7 == 0) {
                        throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                    }
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new aois();
                        }
                        ajcqVarB = this.b.b(str2, str3, jsmVar);
                        jtdVar.l = i6;
                        jtdVar.a = sqlVar3;
                        jtdVar.b = str2;
                        jtdVar.h = phoneAccountHandle;
                        jtdVar.i = str3;
                        jtdVar.j = rmtVar;
                        jtdVar.c = zI;
                        jtdVar.d = epochMilli;
                        jtdVar.g = 9;
                        if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                            return aoluVar;
                        }
                        j2 = epochMilli;
                        str6 = str2;
                        z2 = zI;
                        i9 = i6;
                        phoneAccountHandle3 = phoneAccountHandle;
                        rmtVar3 = rmtVar;
                        str7 = str3;
                        j3 = j2;
                        phgVar2 = this.c;
                        jpiVar2 = new defpackage.jpi(str7, 4);
                        jtdVar.l = i9;
                        jtdVar.a = sqlVar3;
                        jtdVar.b = str6;
                        jtdVar.h = phoneAccountHandle3;
                        jtdVar.i = str7;
                        jtdVar.j = rmtVar3;
                        jtdVar.c = z2;
                        jtdVar.d = j3;
                        jtdVar.g = 10;
                        if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                            return aoluVar;
                        }
                        str10 = "build(...)";
                        this.f.a(ajcm.a);
                        jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                        defpackage.heq heqVarC = defpackage.hhb.c(defpackage.hkd.a.m());
                        heqVarC.j(str6);
                        jhwVarO.F(heqVarC.i());
                        akzxVarM = defpackage.kiw.a.m();
                        aooh.f(akzxVarM, "builder");
                        aooh.f(str7, "value");
                        akzxVarM.u();
                        defpackage.kiw kiwVar = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(str7);
                        kiwVar.b |= 1;
                        kiwVar.c = str7;
                        if (z2 && (strG = sqlVar3.g()) != null) {
                            akzxVarM.u();
                            defpackage.kiw kiwVar2 = (defpackage.kiw) akzxVarM.b;
                            j$.util.Objects.requireNonNull(strG);
                            kiwVar2.b |= 16;
                            kiwVar2.g = strG;
                        }
                        aooh.c(rmtVar3);
                        aooh.f(rmtVar3, "value");
                        akzxVarM.u();
                        defpackage.kiw kiwVar3 = (defpackage.kiw) akzxVarM.b;
                        kiwVar3.o = rmtVar3.q;
                        kiwVar3.b |= 4096;
                        alad aladVarP = akzxVarM.p();
                        aooh.e(aladVarP, str10);
                        jhwVarO.G((defpackage.kiw) aladVarP);
                        akzx akzxVar = (akzx) jhwVarO.a;
                        akzxVar.u();
                        defpackage.jrz jrzVar = (defpackage.jrz) akzxVar.b;
                        jrzVar.b |= 4;
                        jrzVar.e = j3;
                        jhwVarO.J(9);
                        if (phoneAccountHandle3 != null) {
                            java.lang.String strFlattenToString = phoneAccountHandle3.getComponentName().flattenToString();
                            aooh.e(strFlattenToString, "flattenToString(...)");
                            jhwVarO.H(strFlattenToString);
                            java.lang.String id = phoneAccountHandle3.getId();
                            aooh.e(id, "getId(...)");
                            jhwVarO.I(id);
                        }
                        ajcqVarA = this.i.a(jhwVarO.E(), i9);
                        jtdVar.l = 0;
                        jtdVar.a = null;
                        jtdVar.b = null;
                        jtdVar.h = null;
                        jtdVar.i = null;
                        jtdVar.j = null;
                        jtdVar.g = 11;
                        if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                            return aoluVar;
                        }
                        this.f.a(ajcm.a);
                        return aojh.a;
                    }
                    akzx akzxVarM3 = soz.a.m();
                    akzxVarM3.u();
                    soz sozVar3 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(str3);
                    sozVar3.b |= 1;
                    sozVar3.c = str3;
                    soz sozVarP = akzxVarM3.p();
                    aooh.e(sozVarP, "build(...)");
                    sozVar = sozVarP;
                    ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.k = sozVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 7;
                    if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    sozVar2 = sozVar;
                    z = zI;
                    i8 = i6;
                    rmtVar2 = rmtVar;
                    str4 = str3;
                    phoneAccountHandle2 = phoneAccountHandle;
                    str5 = str2;
                    sqlVar4 = sqlVar3;
                    j = epochMilli;
                    phgVar = this.c;
                    jpiVar = new defpackage.jpi(sozVar2, 3);
                    jtdVar.l = i8;
                    jtdVar.a = sqlVar4;
                    jtdVar.b = str5;
                    jtdVar.h = phoneAccountHandle2;
                    jtdVar.i = str4;
                    jtdVar.j = rmtVar2;
                    jtdVar.k = null;
                    jtdVar.c = z;
                    jtdVar.d = j;
                    jtdVar.g = 8;
                    if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                        return aoluVar;
                    }
                    str8 = str4;
                    str9 = str5;
                    i10 = i8;
                    java.lang.String str11 = str9;
                    str7 = str8;
                    i9 = i10;
                    str6 = str11;
                    long j4 = j;
                    z2 = z;
                    sqlVar3 = sqlVar4;
                    phoneAccountHandle3 = phoneAccountHandle2;
                    rmtVar3 = rmtVar2;
                    j3 = j4;
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC2 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC2.j(str6);
                    jhwVarO.F(heqVarC2.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar4 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar4.b |= 1;
                    kiwVar4.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar5 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar5.b |= 16;
                        kiwVar5.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar6 = (defpackage.kiw) akzxVarM.b;
                    kiwVar6.o = rmtVar3.q;
                    kiwVar6.b |= 4096;
                    alad aladVarP2 = akzxVarM.p();
                    aooh.e(aladVarP2, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP2);
                    akzx akzxVar2 = (akzx) jhwVarO.a;
                    akzxVar2.u();
                    defpackage.jrz jrzVar2 = (defpackage.jrz) akzxVar2.b;
                    jrzVar2.b |= 4;
                    jrzVar2.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString2 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString2, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString2);
                        java.lang.String id2 = phoneAccountHandle3.getId();
                        aooh.e(id2, "getId(...)");
                        jhwVarO.I(id2);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                } catch (java.lang.Throwable th) {
                    apdpVar.d();
                    throw th;
                }
            case 1:
                apdpVar = (apdp) jtdVar.a;
                int i12 = jtdVar.l;
                aooc.af(objB);
                i2 = i12;
                this.e = true;
                apdpVar.d();
                defpackage.jsv jsvVar2 = this.d;
                jtdVar.l = i2;
                jtdVar.a = null;
                jtdVar.g = 2;
                objA = jsvVar2.a(qtz.M, jtdVar);
                if (objA != aolu.a) {
                    objA = aojh.a;
                }
                if (objA != aoluVar) {
                    return aoluVar;
                }
                i3 = i2;
                jtdVar.l = i3;
                jtdVar.g = 3;
                objB = b(jtdVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                i4 = i3;
                jtbVar = (defpackage.jtb) objB;
                ajcq ajcqVarBg2 = jtbVar.bg();
                jtdVar.l = i4;
                jtdVar.a = jtbVar;
                jtdVar.g = 4;
                objD = aosv.D(ajcqVarBg2, jtdVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                jtbVar2 = jtbVar;
                objB = objD;
                sqlVar = (sql) objB;
                zF = f(sqlVar);
                i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new aois();
                    }
                    if (zF) {
                        qbcVar = qbc.oR;
                    } else {
                        qbcVar = qbc.oN;
                    }
                } else if (zF) {
                    qbcVar = qbc.oQ;
                } else {
                    qbcVar = qbc.oM;
                }
                this.g.a(qbcVar);
                ajcq ajcqVarBl2 = jtbVar2.bl();
                jtdVar.l = i4;
                jtdVar.a = jtbVar2;
                jtdVar.b = sqlVar;
                jtdVar.g = 5;
                objD2 = aosv.D(ajcqVarBl2, jtdVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                defpackage.jtb jtbVar5 = jtbVar2;
                sqlVar2 = sqlVar;
                objB = objD2;
                i6 = i4;
                jtbVar3 = jtbVar5;
                str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                if (str == null) {
                    a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                    return aojh.a;
                }
                ajcq ajcqVarBa2 = jtbVar3.ba();
                jtdVar.l = i6;
                jtdVar.a = sqlVar2;
                jtdVar.b = str;
                jtdVar.g = 6;
                objD3 = aosv.D(ajcqVarBa2, jtdVar);
                if (objD3 != aoluVar) {
                    return aoluVar;
                }
                sql sqlVar6 = sqlVar2;
                str2 = str;
                objB = objD3;
                sqlVar3 = sqlVar6;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB2 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB2);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM4 = jsm.a.m();
                akzxVarM4.u();
                jsm jsmVar3 = akzxVarM4.b;
                jsmVar3.b |= 2;
                jsmVar3.d = epochMilli;
                jsm jsmVarP2 = akzxVarM4.p();
                aooh.e(jsmVarP2, "build(...)");
                jsmVar = jsmVarP2;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC3 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC3.j(str6);
                    jhwVarO.F(heqVarC3.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar7 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar7.b |= 1;
                    kiwVar7.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar8 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar8.b |= 16;
                        kiwVar8.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar9 = (defpackage.kiw) akzxVarM.b;
                    kiwVar9.o = rmtVar3.q;
                    kiwVar9.b |= 4096;
                    alad aladVarP3 = akzxVarM.p();
                    aooh.e(aladVarP3, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP3);
                    akzx akzxVar3 = (akzx) jhwVarO.a;
                    akzxVar3.u();
                    defpackage.jrz jrzVar3 = (defpackage.jrz) akzxVar3.b;
                    jrzVar3.b |= 4;
                    jrzVar3.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString3 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString3, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString3);
                        java.lang.String id3 = phoneAccountHandle3.getId();
                        aooh.e(id3, "getId(...)");
                        jhwVarO.I(id3);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM5 = soz.a.m();
                akzxVarM5.u();
                soz sozVar4 = akzxVarM5.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar4.b |= 1;
                sozVar4.c = str3;
                soz sozVarP2 = akzxVarM5.p();
                aooh.e(sozVarP2, "build(...)");
                sozVar = sozVarP2;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str12 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str12;
                long j5 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j5;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC4 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC4.j(str6);
                jhwVarO.F(heqVarC4.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar10 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar10.b |= 1;
                kiwVar10.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar11 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar11.b |= 16;
                    kiwVar11.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar12 = (defpackage.kiw) akzxVarM.b;
                kiwVar12.o = rmtVar3.q;
                kiwVar12.b |= 4096;
                alad aladVarP4 = akzxVarM.p();
                aooh.e(aladVarP4, str10);
                jhwVarO.G((defpackage.kiw) aladVarP4);
                akzx akzxVar4 = (akzx) jhwVarO.a;
                akzxVar4.u();
                defpackage.jrz jrzVar4 = (defpackage.jrz) akzxVar4.b;
                jrzVar4.b |= 4;
                jrzVar4.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString4 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString4, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString4);
                    java.lang.String id4 = phoneAccountHandle3.getId();
                    aooh.e(id4, "getId(...)");
                    jhwVarO.I(id4);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 2:
                i3 = jtdVar.l;
                aooc.af(objB);
                jtdVar.l = i3;
                jtdVar.g = 3;
                objB = b(jtdVar);
                if (objB == aoluVar) {
                    return aoluVar;
                }
                i4 = i3;
                jtbVar = (defpackage.jtb) objB;
                ajcq ajcqVarBg3 = jtbVar.bg();
                jtdVar.l = i4;
                jtdVar.a = jtbVar;
                jtdVar.g = 4;
                objD = aosv.D(ajcqVarBg3, jtdVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                jtbVar2 = jtbVar;
                objB = objD;
                sqlVar = (sql) objB;
                zF = f(sqlVar);
                i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new aois();
                    }
                    if (zF) {
                        qbcVar = qbc.oR;
                    } else {
                        qbcVar = qbc.oN;
                    }
                } else if (zF) {
                    qbcVar = qbc.oQ;
                } else {
                    qbcVar = qbc.oM;
                }
                this.g.a(qbcVar);
                ajcq ajcqVarBl3 = jtbVar2.bl();
                jtdVar.l = i4;
                jtdVar.a = jtbVar2;
                jtdVar.b = sqlVar;
                jtdVar.g = 5;
                objD2 = aosv.D(ajcqVarBl3, jtdVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                defpackage.jtb jtbVar6 = jtbVar2;
                sqlVar2 = sqlVar;
                objB = objD2;
                i6 = i4;
                jtbVar3 = jtbVar6;
                str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                if (str == null) {
                    a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                    return aojh.a;
                }
                ajcq ajcqVarBa3 = jtbVar3.ba();
                jtdVar.l = i6;
                jtdVar.a = sqlVar2;
                jtdVar.b = str;
                jtdVar.g = 6;
                objD3 = aosv.D(ajcqVarBa3, jtdVar);
                if (objD3 != aoluVar) {
                    return aoluVar;
                }
                sql sqlVar7 = sqlVar2;
                str2 = str;
                objB = objD3;
                sqlVar3 = sqlVar7;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB3 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB3);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM6 = jsm.a.m();
                akzxVarM6.u();
                jsm jsmVar4 = akzxVarM6.b;
                jsmVar4.b |= 2;
                jsmVar4.d = epochMilli;
                jsm jsmVarP3 = akzxVarM6.p();
                aooh.e(jsmVarP3, "build(...)");
                jsmVar = jsmVarP3;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC5 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC5.j(str6);
                    jhwVarO.F(heqVarC5.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar13 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar13.b |= 1;
                    kiwVar13.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar14 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar14.b |= 16;
                        kiwVar14.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar15 = (defpackage.kiw) akzxVarM.b;
                    kiwVar15.o = rmtVar3.q;
                    kiwVar15.b |= 4096;
                    alad aladVarP5 = akzxVarM.p();
                    aooh.e(aladVarP5, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP5);
                    akzx akzxVar5 = (akzx) jhwVarO.a;
                    akzxVar5.u();
                    defpackage.jrz jrzVar5 = (defpackage.jrz) akzxVar5.b;
                    jrzVar5.b |= 4;
                    jrzVar5.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString5 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString5, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString5);
                        java.lang.String id5 = phoneAccountHandle3.getId();
                        aooh.e(id5, "getId(...)");
                        jhwVarO.I(id5);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM7 = soz.a.m();
                akzxVarM7.u();
                soz sozVar5 = akzxVarM7.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar5.b |= 1;
                sozVar5.c = str3;
                soz sozVarP3 = akzxVarM7.p();
                aooh.e(sozVarP3, "build(...)");
                sozVar = sozVarP3;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str13 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str13;
                long j6 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j6;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC6 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC6.j(str6);
                jhwVarO.F(heqVarC6.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar16 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar16.b |= 1;
                kiwVar16.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar17 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar17.b |= 16;
                    kiwVar17.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar18 = (defpackage.kiw) akzxVarM.b;
                kiwVar18.o = rmtVar3.q;
                kiwVar18.b |= 4096;
                alad aladVarP6 = akzxVarM.p();
                aooh.e(aladVarP6, str10);
                jhwVarO.G((defpackage.kiw) aladVarP6);
                akzx akzxVar6 = (akzx) jhwVarO.a;
                akzxVar6.u();
                defpackage.jrz jrzVar6 = (defpackage.jrz) akzxVar6.b;
                jrzVar6.b |= 4;
                jrzVar6.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString6 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString6, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString6);
                    java.lang.String id6 = phoneAccountHandle3.getId();
                    aooh.e(id6, "getId(...)");
                    jhwVarO.I(id6);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 3:
                i3 = jtdVar.l;
                aooc.af(objB);
                i4 = i3;
                jtbVar = (defpackage.jtb) objB;
                ajcq ajcqVarBg4 = jtbVar.bg();
                jtdVar.l = i4;
                jtdVar.a = jtbVar;
                jtdVar.g = 4;
                objD = aosv.D(ajcqVarBg4, jtdVar);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                jtbVar2 = jtbVar;
                objB = objD;
                sqlVar = (sql) objB;
                zF = f(sqlVar);
                i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new aois();
                    }
                    if (zF) {
                        qbcVar = qbc.oR;
                    } else {
                        qbcVar = qbc.oN;
                    }
                } else if (zF) {
                    qbcVar = qbc.oQ;
                } else {
                    qbcVar = qbc.oM;
                }
                this.g.a(qbcVar);
                ajcq ajcqVarBl4 = jtbVar2.bl();
                jtdVar.l = i4;
                jtdVar.a = jtbVar2;
                jtdVar.b = sqlVar;
                jtdVar.g = 5;
                objD2 = aosv.D(ajcqVarBl4, jtdVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                defpackage.jtb jtbVar7 = jtbVar2;
                sqlVar2 = sqlVar;
                objB = objD2;
                i6 = i4;
                jtbVar3 = jtbVar7;
                str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                if (str == null) {
                    a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                    return aojh.a;
                }
                ajcq ajcqVarBa4 = jtbVar3.ba();
                jtdVar.l = i6;
                jtdVar.a = sqlVar2;
                jtdVar.b = str;
                jtdVar.g = 6;
                objD3 = aosv.D(ajcqVarBa4, jtdVar);
                if (objD3 != aoluVar) {
                    return aoluVar;
                }
                sql sqlVar8 = sqlVar2;
                str2 = str;
                objB = objD3;
                sqlVar3 = sqlVar8;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB4 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB4);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM8 = jsm.a.m();
                akzxVarM8.u();
                jsm jsmVar5 = akzxVarM8.b;
                jsmVar5.b |= 2;
                jsmVar5.d = epochMilli;
                jsm jsmVarP4 = akzxVarM8.p();
                aooh.e(jsmVarP4, "build(...)");
                jsmVar = jsmVarP4;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC7 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC7.j(str6);
                    jhwVarO.F(heqVarC7.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar19 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar19.b |= 1;
                    kiwVar19.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar110 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar110.b |= 16;
                        kiwVar110.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar111 = (defpackage.kiw) akzxVarM.b;
                    kiwVar111.o = rmtVar3.q;
                    kiwVar111.b |= 4096;
                    alad aladVarP7 = akzxVarM.p();
                    aooh.e(aladVarP7, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP7);
                    akzx akzxVar7 = (akzx) jhwVarO.a;
                    akzxVar7.u();
                    defpackage.jrz jrzVar7 = (defpackage.jrz) akzxVar7.b;
                    jrzVar7.b |= 4;
                    jrzVar7.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString7 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString7, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString7);
                        java.lang.String id7 = phoneAccountHandle3.getId();
                        aooh.e(id7, "getId(...)");
                        jhwVarO.I(id7);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM9 = soz.a.m();
                akzxVarM9.u();
                soz sozVar6 = akzxVarM9.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar6.b |= 1;
                sozVar6.c = str3;
                soz sozVarP4 = akzxVarM9.p();
                aooh.e(sozVarP4, "build(...)");
                sozVar = sozVarP4;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str14 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str14;
                long j7 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j7;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC8 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC8.j(str6);
                jhwVarO.F(heqVarC8.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar112 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar112.b |= 1;
                kiwVar112.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar113 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar113.b |= 16;
                    kiwVar113.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar114 = (defpackage.kiw) akzxVarM.b;
                kiwVar114.o = rmtVar3.q;
                kiwVar114.b |= 4096;
                alad aladVarP8 = akzxVarM.p();
                aooh.e(aladVarP8, str10);
                jhwVarO.G((defpackage.kiw) aladVarP8);
                akzx akzxVar8 = (akzx) jhwVarO.a;
                akzxVar8.u();
                defpackage.jrz jrzVar8 = (defpackage.jrz) akzxVar8.b;
                jrzVar8.b |= 4;
                jrzVar8.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString8 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString8, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString8);
                    java.lang.String id8 = phoneAccountHandle3.getId();
                    aooh.e(id8, "getId(...)");
                    jhwVarO.I(id8);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 4:
                jtbVar2 = (defpackage.jtb) jtdVar.a;
                i4 = jtdVar.l;
                aooc.af(objB);
                sqlVar = (sql) objB;
                zF = f(sqlVar);
                i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        throw new aois();
                    }
                    if (zF) {
                        qbcVar = qbc.oR;
                    } else {
                        qbcVar = qbc.oN;
                    }
                } else if (zF) {
                    qbcVar = qbc.oQ;
                } else {
                    qbcVar = qbc.oM;
                }
                this.g.a(qbcVar);
                ajcq ajcqVarBl5 = jtbVar2.bl();
                jtdVar.l = i4;
                jtdVar.a = jtbVar2;
                jtdVar.b = sqlVar;
                jtdVar.g = 5;
                objD2 = aosv.D(ajcqVarBl5, jtdVar);
                if (objD2 == aoluVar) {
                    return aoluVar;
                }
                defpackage.jtb jtbVar8 = jtbVar2;
                sqlVar2 = sqlVar;
                objB = objD2;
                i6 = i4;
                jtbVar3 = jtbVar8;
                str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                if (str == null) {
                    a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                    return aojh.a;
                }
                ajcq ajcqVarBa5 = jtbVar3.ba();
                jtdVar.l = i6;
                jtdVar.a = sqlVar2;
                jtdVar.b = str;
                jtdVar.g = 6;
                objD3 = aosv.D(ajcqVarBa5, jtdVar);
                if (objD3 != aoluVar) {
                    return aoluVar;
                }
                sql sqlVar9 = sqlVar2;
                str2 = str;
                objB = objD3;
                sqlVar3 = sqlVar9;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB5 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB5);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM10 = jsm.a.m();
                akzxVarM10.u();
                jsm jsmVar6 = akzxVarM10.b;
                jsmVar6.b |= 2;
                jsmVar6.d = epochMilli;
                jsm jsmVarP5 = akzxVarM10.p();
                aooh.e(jsmVarP5, "build(...)");
                jsmVar = jsmVarP5;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC9 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC9.j(str6);
                    jhwVarO.F(heqVarC9.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar115 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar115.b |= 1;
                    kiwVar115.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar116 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar116.b |= 16;
                        kiwVar116.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar117 = (defpackage.kiw) akzxVarM.b;
                    kiwVar117.o = rmtVar3.q;
                    kiwVar117.b |= 4096;
                    alad aladVarP9 = akzxVarM.p();
                    aooh.e(aladVarP9, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP9);
                    akzx akzxVar9 = (akzx) jhwVarO.a;
                    akzxVar9.u();
                    defpackage.jrz jrzVar9 = (defpackage.jrz) akzxVar9.b;
                    jrzVar9.b |= 4;
                    jrzVar9.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString9 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString9, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString9);
                        java.lang.String id9 = phoneAccountHandle3.getId();
                        aooh.e(id9, "getId(...)");
                        jhwVarO.I(id9);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM11 = soz.a.m();
                akzxVarM11.u();
                soz sozVar7 = akzxVarM11.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar7.b |= 1;
                sozVar7.c = str3;
                soz sozVarP5 = akzxVarM11.p();
                aooh.e(sozVarP5, "build(...)");
                sozVar = sozVarP5;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str15 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str15;
                long j8 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j8;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC10 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC10.j(str6);
                jhwVarO.F(heqVarC10.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar118 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar118.b |= 1;
                kiwVar118.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar119 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar119.b |= 16;
                    kiwVar119.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar1110 = (defpackage.kiw) akzxVarM.b;
                kiwVar1110.o = rmtVar3.q;
                kiwVar1110.b |= 4096;
                alad aladVarP10 = akzxVarM.p();
                aooh.e(aladVarP10, str10);
                jhwVarO.G((defpackage.kiw) aladVarP10);
                akzx akzxVar10 = (akzx) jhwVarO.a;
                akzxVar10.u();
                defpackage.jrz jrzVar10 = (defpackage.jrz) akzxVar10.b;
                jrzVar10.b |= 4;
                jrzVar10.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString10 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString10, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString10);
                    java.lang.String id10 = phoneAccountHandle3.getId();
                    aooh.e(id10, "getId(...)");
                    jhwVarO.I(id10);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 5:
                sqlVar2 = (sql) jtdVar.b;
                jtbVar3 = (defpackage.jtb) jtdVar.a;
                i6 = jtdVar.l;
                aooc.af(objB);
                str = (java.lang.String) aooh.q((j$.util.Optional) objB);
                if (str == null) {
                    a.d().m(aioa.b).l("com/android/dialer/calleridfeedback/impl/incall/service/InCallCallerIdFeedbackController", "handleFeedback", 111, "InCallCallerIdFeedbackController.kt").v("Missing raw number.");
                    return aojh.a;
                }
                ajcq ajcqVarBa6 = jtbVar3.ba();
                jtdVar.l = i6;
                jtdVar.a = sqlVar2;
                jtdVar.b = str;
                jtdVar.g = 6;
                objD3 = aosv.D(ajcqVarBa6, jtdVar);
                if (objD3 != aoluVar) {
                    return aoluVar;
                }
                sql sqlVar10 = sqlVar2;
                str2 = str;
                objB = objD3;
                sqlVar3 = sqlVar10;
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB6 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB6);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM12 = jsm.a.m();
                akzxVarM12.u();
                jsm jsmVar7 = akzxVarM12.b;
                jsmVar7.b |= 2;
                jsmVar7.d = epochMilli;
                jsm jsmVarP6 = akzxVarM12.p();
                aooh.e(jsmVarP6, "build(...)");
                jsmVar = jsmVarP6;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC11 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC11.j(str6);
                    jhwVarO.F(heqVarC11.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar1111 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar1111.b |= 1;
                    kiwVar1111.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar1112 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar1112.b |= 16;
                        kiwVar1112.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar1113 = (defpackage.kiw) akzxVarM.b;
                    kiwVar1113.o = rmtVar3.q;
                    kiwVar1113.b |= 4096;
                    alad aladVarP11 = akzxVarM.p();
                    aooh.e(aladVarP11, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP11);
                    akzx akzxVar11 = (akzx) jhwVarO.a;
                    akzxVar11.u();
                    defpackage.jrz jrzVar11 = (defpackage.jrz) akzxVar11.b;
                    jrzVar11.b |= 4;
                    jrzVar11.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString11 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString11, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString11);
                        java.lang.String id11 = phoneAccountHandle3.getId();
                        aooh.e(id11, "getId(...)");
                        jhwVarO.I(id11);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM13 = soz.a.m();
                akzxVarM13.u();
                soz sozVar8 = akzxVarM13.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar8.b |= 1;
                sozVar8.c = str3;
                soz sozVarP6 = akzxVarM13.p();
                aooh.e(sozVarP6, "build(...)");
                sozVar = sozVarP6;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str16 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str16;
                long j9 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j9;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC12 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC12.j(str6);
                jhwVarO.F(heqVarC12.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar1114 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar1114.b |= 1;
                kiwVar1114.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar1115 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar1115.b |= 16;
                    kiwVar1115.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar1116 = (defpackage.kiw) akzxVarM.b;
                kiwVar1116.o = rmtVar3.q;
                kiwVar1116.b |= 4096;
                alad aladVarP12 = akzxVarM.p();
                aooh.e(aladVarP12, str10);
                jhwVarO.G((defpackage.kiw) aladVarP12);
                akzx akzxVar12 = (akzx) jhwVarO.a;
                akzxVar12.u();
                defpackage.jrz jrzVar12 = (defpackage.jrz) akzxVar12.b;
                jrzVar12.b |= 4;
                jrzVar12.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString12 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString12, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString12);
                    java.lang.String id12 = phoneAccountHandle3.getId();
                    aooh.e(id12, "getId(...)");
                    jhwVarO.I(id12);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 6:
                str2 = (java.lang.String) jtdVar.b;
                sqlVar3 = (sql) jtdVar.a;
                i6 = jtdVar.l;
                aooc.af(objB);
                phoneAccountHandle = (android.telecom.PhoneAccountHandle) aooh.q((j$.util.Optional) objB);
                zI = defpackage.hhv.i(sqlVar3.b());
                if (zI) {
                    strH = sqlVar3.h();
                    if (strH != null) {
                        strH = null;
                    } else {
                        strH = null;
                    }
                    rmt rmtVarB7 = sqlVar3.b();
                    if (strH == null) {
                        strH = "";
                    }
                    aoiuVar = new aoiu(strH, rmtVarB7);
                } else {
                    aoiuVar = new aoiu(sqlVar3.k(), rmt.p);
                }
                str3 = (java.lang.String) aoiuVar.a;
                rmtVar = (rmt) aoiuVar.b;
                epochMilli = j$.time.Instant.now().toEpochMilli();
                akzx akzxVarM14 = jsm.a.m();
                akzxVarM14.u();
                jsm jsmVar8 = akzxVarM14.b;
                jsmVar8.b |= 2;
                jsmVar8.d = epochMilli;
                jsm jsmVarP7 = akzxVarM14.p();
                aooh.e(jsmVarP7, "build(...)");
                jsmVar = jsmVarP7;
                i7 = i6 - 1;
                if (i6 == 0) {
                    throw null;
                }
                if (i7 == 0) {
                    throw new java.lang.IllegalStateException("handleFeedback called with FeedbackType.UNKNOWN");
                }
                if (i7 != 1) {
                    if (i7 != 2) {
                        throw new aois();
                    }
                    ajcqVarB = this.b.b(str2, str3, jsmVar);
                    jtdVar.l = i6;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str2;
                    jtdVar.h = phoneAccountHandle;
                    jtdVar.i = str3;
                    jtdVar.j = rmtVar;
                    jtdVar.c = zI;
                    jtdVar.d = epochMilli;
                    jtdVar.g = 9;
                    if (aosv.D(ajcqVarB, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    j2 = epochMilli;
                    str6 = str2;
                    z2 = zI;
                    i9 = i6;
                    phoneAccountHandle3 = phoneAccountHandle;
                    rmtVar3 = rmtVar;
                    str7 = str3;
                    j3 = j2;
                    phgVar2 = this.c;
                    jpiVar2 = new defpackage.jpi(str7, 4);
                    jtdVar.l = i9;
                    jtdVar.a = sqlVar3;
                    jtdVar.b = str6;
                    jtdVar.h = phoneAccountHandle3;
                    jtdVar.i = str7;
                    jtdVar.j = rmtVar3;
                    jtdVar.c = z2;
                    jtdVar.d = j3;
                    jtdVar.g = 10;
                    if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    str10 = "build(...)";
                    this.f.a(ajcm.a);
                    jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                    defpackage.heq heqVarC13 = defpackage.hhb.c(defpackage.hkd.a.m());
                    heqVarC13.j(str6);
                    jhwVarO.F(heqVarC13.i());
                    akzxVarM = defpackage.kiw.a.m();
                    aooh.f(akzxVarM, "builder");
                    aooh.f(str7, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar1117 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(str7);
                    kiwVar1117.b |= 1;
                    kiwVar1117.c = str7;
                    if (z2) {
                        akzxVarM.u();
                        defpackage.kiw kiwVar1118 = (defpackage.kiw) akzxVarM.b;
                        j$.util.Objects.requireNonNull(strG);
                        kiwVar1118.b |= 16;
                        kiwVar1118.g = strG;
                    }
                    aooh.c(rmtVar3);
                    aooh.f(rmtVar3, "value");
                    akzxVarM.u();
                    defpackage.kiw kiwVar1119 = (defpackage.kiw) akzxVarM.b;
                    kiwVar1119.o = rmtVar3.q;
                    kiwVar1119.b |= 4096;
                    alad aladVarP13 = akzxVarM.p();
                    aooh.e(aladVarP13, str10);
                    jhwVarO.G((defpackage.kiw) aladVarP13);
                    akzx akzxVar13 = (akzx) jhwVarO.a;
                    akzxVar13.u();
                    defpackage.jrz jrzVar13 = (defpackage.jrz) akzxVar13.b;
                    jrzVar13.b |= 4;
                    jrzVar13.e = j3;
                    jhwVarO.J(9);
                    if (phoneAccountHandle3 != null) {
                        java.lang.String strFlattenToString13 = phoneAccountHandle3.getComponentName().flattenToString();
                        aooh.e(strFlattenToString13, "flattenToString(...)");
                        jhwVarO.H(strFlattenToString13);
                        java.lang.String id13 = phoneAccountHandle3.getId();
                        aooh.e(id13, "getId(...)");
                        jhwVarO.I(id13);
                    }
                    ajcqVarA = this.i.a(jhwVarO.E(), i9);
                    jtdVar.l = 0;
                    jtdVar.a = null;
                    jtdVar.b = null;
                    jtdVar.h = null;
                    jtdVar.i = null;
                    jtdVar.j = null;
                    jtdVar.g = 11;
                    if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                        return aoluVar;
                    }
                    this.f.a(ajcm.a);
                    return aojh.a;
                }
                akzx akzxVarM15 = soz.a.m();
                akzxVarM15.u();
                soz sozVar9 = akzxVarM15.b;
                j$.util.Objects.requireNonNull(str3);
                sozVar9.b |= 1;
                sozVar9.c = str3;
                soz sozVarP7 = akzxVarM15.p();
                aooh.e(sozVarP7, "build(...)");
                sozVar = sozVarP7;
                ajcqVarC = this.b.c(str2, sozVar, jsmVar);
                jtdVar.l = i6;
                jtdVar.a = sqlVar3;
                jtdVar.b = str2;
                jtdVar.h = phoneAccountHandle;
                jtdVar.i = str3;
                jtdVar.j = rmtVar;
                jtdVar.k = sozVar;
                jtdVar.c = zI;
                jtdVar.d = epochMilli;
                jtdVar.g = 7;
                if (aosv.D(ajcqVarC, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                sozVar2 = sozVar;
                z = zI;
                i8 = i6;
                rmtVar2 = rmtVar;
                str4 = str3;
                phoneAccountHandle2 = phoneAccountHandle;
                str5 = str2;
                sqlVar4 = sqlVar3;
                j = epochMilli;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str17 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str17;
                long j10 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j10;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC14 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC14.j(str6);
                jhwVarO.F(heqVarC14.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11110 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar11110.b |= 1;
                kiwVar11110.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar11111 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar11111.b |= 16;
                    kiwVar11111.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11112 = (defpackage.kiw) akzxVarM.b;
                kiwVar11112.o = rmtVar3.q;
                kiwVar11112.b |= 4096;
                alad aladVarP14 = akzxVarM.p();
                aooh.e(aladVarP14, str10);
                jhwVarO.G((defpackage.kiw) aladVarP14);
                akzx akzxVar14 = (akzx) jhwVarO.a;
                akzxVar14.u();
                defpackage.jrz jrzVar14 = (defpackage.jrz) akzxVar14.b;
                jrzVar14.b |= 4;
                jrzVar14.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString14 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString14, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString14);
                    java.lang.String id14 = phoneAccountHandle3.getId();
                    aooh.e(id14, "getId(...)");
                    jhwVarO.I(id14);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 7:
                j = jtdVar.d;
                z = jtdVar.c;
                sozVar2 = jtdVar.k;
                rmt rmtVar4 = jtdVar.j;
                str4 = jtdVar.i;
                android.telecom.PhoneAccountHandle phoneAccountHandle4 = jtdVar.h;
                str5 = (java.lang.String) jtdVar.b;
                sql sqlVar11 = (sql) jtdVar.a;
                i8 = jtdVar.l;
                aooc.af(objB);
                sqlVar4 = sqlVar11;
                rmtVar2 = rmtVar4;
                phoneAccountHandle2 = phoneAccountHandle4;
                phgVar = this.c;
                jpiVar = new defpackage.jpi(sozVar2, 3);
                jtdVar.l = i8;
                jtdVar.a = sqlVar4;
                jtdVar.b = str5;
                jtdVar.h = phoneAccountHandle2;
                jtdVar.i = str4;
                jtdVar.j = rmtVar2;
                jtdVar.k = null;
                jtdVar.c = z;
                jtdVar.d = j;
                jtdVar.g = 8;
                if (phgVar.a(jpiVar, jtdVar) != aoluVar) {
                    return aoluVar;
                }
                str8 = str4;
                str9 = str5;
                i10 = i8;
                java.lang.String str18 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str18;
                long j11 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j11;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC15 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC15.j(str6);
                jhwVarO.F(heqVarC15.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11113 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar11113.b |= 1;
                kiwVar11113.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar11114 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar11114.b |= 16;
                    kiwVar11114.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11115 = (defpackage.kiw) akzxVarM.b;
                kiwVar11115.o = rmtVar3.q;
                kiwVar11115.b |= 4096;
                alad aladVarP15 = akzxVarM.p();
                aooh.e(aladVarP15, str10);
                jhwVarO.G((defpackage.kiw) aladVarP15);
                akzx akzxVar15 = (akzx) jhwVarO.a;
                akzxVar15.u();
                defpackage.jrz jrzVar15 = (defpackage.jrz) akzxVar15.b;
                jrzVar15.b |= 4;
                jrzVar15.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString15 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString15, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString15);
                    java.lang.String id15 = phoneAccountHandle3.getId();
                    aooh.e(id15, "getId(...)");
                    jhwVarO.I(id15);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 8:
                j = jtdVar.d;
                z = jtdVar.c;
                rmtVar2 = jtdVar.j;
                str8 = jtdVar.i;
                phoneAccountHandle2 = jtdVar.h;
                str9 = (java.lang.String) jtdVar.b;
                sqlVar4 = (sql) jtdVar.a;
                i10 = jtdVar.l;
                aooc.af(objB);
                java.lang.String str19 = str9;
                str7 = str8;
                i9 = i10;
                str6 = str19;
                long j12 = j;
                z2 = z;
                sqlVar3 = sqlVar4;
                phoneAccountHandle3 = phoneAccountHandle2;
                rmtVar3 = rmtVar2;
                j3 = j12;
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC16 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC16.j(str6);
                jhwVarO.F(heqVarC16.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11116 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar11116.b |= 1;
                kiwVar11116.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar11117 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar11117.b |= 16;
                    kiwVar11117.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11118 = (defpackage.kiw) akzxVarM.b;
                kiwVar11118.o = rmtVar3.q;
                kiwVar11118.b |= 4096;
                alad aladVarP16 = akzxVarM.p();
                aooh.e(aladVarP16, str10);
                jhwVarO.G((defpackage.kiw) aladVarP16);
                akzx akzxVar16 = (akzx) jhwVarO.a;
                akzxVar16.u();
                defpackage.jrz jrzVar16 = (defpackage.jrz) akzxVar16.b;
                jrzVar16.b |= 4;
                jrzVar16.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString16 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString16, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString16);
                    java.lang.String id16 = phoneAccountHandle3.getId();
                    aooh.e(id16, "getId(...)");
                    jhwVarO.I(id16);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 9:
                long j13 = jtdVar.d;
                boolean z3 = jtdVar.c;
                rmt rmtVar5 = jtdVar.j;
                java.lang.String str20 = jtdVar.i;
                android.telecom.PhoneAccountHandle phoneAccountHandle5 = jtdVar.h;
                java.lang.String str21 = (java.lang.String) jtdVar.b;
                sql sqlVar12 = (sql) jtdVar.a;
                int i13 = jtdVar.l;
                aooc.af(objB);
                str7 = str20;
                i9 = i13;
                str6 = str21;
                j2 = j13;
                z2 = z3;
                sqlVar3 = sqlVar12;
                phoneAccountHandle3 = phoneAccountHandle5;
                rmtVar3 = rmtVar5;
                j3 = j2;
                phgVar2 = this.c;
                jpiVar2 = new defpackage.jpi(str7, 4);
                jtdVar.l = i9;
                jtdVar.a = sqlVar3;
                jtdVar.b = str6;
                jtdVar.h = phoneAccountHandle3;
                jtdVar.i = str7;
                jtdVar.j = rmtVar3;
                jtdVar.c = z2;
                jtdVar.d = j3;
                jtdVar.g = 10;
                if (phgVar2.a(jpiVar2, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                str10 = "build(...)";
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC17 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC17.j(str6);
                jhwVarO.F(heqVarC17.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar11119 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar11119.b |= 1;
                kiwVar11119.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar111110 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar111110.b |= 16;
                    kiwVar111110.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar111111 = (defpackage.kiw) akzxVarM.b;
                kiwVar111111.o = rmtVar3.q;
                kiwVar111111.b |= 4096;
                alad aladVarP17 = akzxVarM.p();
                aooh.e(aladVarP17, str10);
                jhwVarO.G((defpackage.kiw) aladVarP17);
                akzx akzxVar17 = (akzx) jhwVarO.a;
                akzxVar17.u();
                defpackage.jrz jrzVar17 = (defpackage.jrz) akzxVar17.b;
                jrzVar17.b |= 4;
                jrzVar17.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString17 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString17, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString17);
                    java.lang.String id17 = phoneAccountHandle3.getId();
                    aooh.e(id17, "getId(...)");
                    jhwVarO.I(id17);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 10:
                j3 = jtdVar.d;
                z2 = jtdVar.c;
                rmtVar3 = jtdVar.j;
                str7 = jtdVar.i;
                phoneAccountHandle3 = jtdVar.h;
                str6 = (java.lang.String) jtdVar.b;
                sqlVar3 = (sql) jtdVar.a;
                i9 = jtdVar.l;
                aooc.af(objB);
                str10 = "build(...)";
                this.f.a(ajcm.a);
                jhwVarO = defpackage.hhv.o(defpackage.jrz.a.m());
                defpackage.heq heqVarC18 = defpackage.hhb.c(defpackage.hkd.a.m());
                heqVarC18.j(str6);
                jhwVarO.F(heqVarC18.i());
                akzxVarM = defpackage.kiw.a.m();
                aooh.f(akzxVarM, "builder");
                aooh.f(str7, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar111112 = (defpackage.kiw) akzxVarM.b;
                j$.util.Objects.requireNonNull(str7);
                kiwVar111112.b |= 1;
                kiwVar111112.c = str7;
                if (z2) {
                    akzxVarM.u();
                    defpackage.kiw kiwVar111113 = (defpackage.kiw) akzxVarM.b;
                    j$.util.Objects.requireNonNull(strG);
                    kiwVar111113.b |= 16;
                    kiwVar111113.g = strG;
                }
                aooh.c(rmtVar3);
                aooh.f(rmtVar3, "value");
                akzxVarM.u();
                defpackage.kiw kiwVar111114 = (defpackage.kiw) akzxVarM.b;
                kiwVar111114.o = rmtVar3.q;
                kiwVar111114.b |= 4096;
                alad aladVarP18 = akzxVarM.p();
                aooh.e(aladVarP18, str10);
                jhwVarO.G((defpackage.kiw) aladVarP18);
                akzx akzxVar18 = (akzx) jhwVarO.a;
                akzxVar18.u();
                defpackage.jrz jrzVar18 = (defpackage.jrz) akzxVar18.b;
                jrzVar18.b |= 4;
                jrzVar18.e = j3;
                jhwVarO.J(9);
                if (phoneAccountHandle3 != null) {
                    java.lang.String strFlattenToString18 = phoneAccountHandle3.getComponentName().flattenToString();
                    aooh.e(strFlattenToString18, "flattenToString(...)");
                    jhwVarO.H(strFlattenToString18);
                    java.lang.String id18 = phoneAccountHandle3.getId();
                    aooh.e(id18, "getId(...)");
                    jhwVarO.I(id18);
                }
                ajcqVarA = this.i.a(jhwVarO.E(), i9);
                jtdVar.l = 0;
                jtdVar.a = null;
                jtdVar.b = null;
                jtdVar.h = null;
                jtdVar.i = null;
                jtdVar.j = null;
                jtdVar.g = 11;
                if (aosv.D(ajcqVarA, jtdVar) == aoluVar) {
                    return aoluVar;
                }
                this.f.a(ajcm.a);
                return aojh.a;
            case 11:
                aooc.af(objB);
                this.f.a(ajcm.a);
                return aojh.a;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
