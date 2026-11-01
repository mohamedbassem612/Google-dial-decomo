package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rnl extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.rnn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rnl(defpackage.rnn rnnVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = rnnVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:26:0x00be  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x0136 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:66:0x0176  */
    /* JADX WARN: Code duplicated, block: B:69:0x0181  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:73:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.rnc rncVar;
        int i;
        defpackage.zmy zmyVar;
        java.lang.Object objD;
        defpackage.rnc rncVar2;
        defpackage.zmy zmyVar2;
        int iOrdinal;
        int iOrdinal2;
        qbc qbcVar;
        java.lang.String str;
        java.lang.Object objE;
        defpackage.zmy zmyVar3;
        java.lang.Object obj2;
        defpackage.zmy zmyVar4;
        int iOrdinal3;
        java.lang.String str2;
        defpackage.rnl rnlVar;
        java.lang.Object obj3;
        defpackage.zmy zmyVar5;
        java.lang.Object obj4;
        defpackage.rnn rnnVar;
        qbc qbcVar2;
        qbc qbcVar3;
        aolu aoluVar = aolu.a;
        int i2 = this.d;
        if (i2 != 0) {
            if (i2 == 1) {
                aooc.af(obj);
            } else if (i2 == 2) {
                aooc.af(obj);
                rncVar = (defpackage.rnc) obj;
                if (rncVar == null) {
                    defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 69, "RedialLoggingImpl.kt").v("previousCallInfo is null");
                    this.e.d.a(qbc.iH);
                    return aojh.a;
                }
                if (!(rncVar instanceof defpackage.rnb)) {
                    defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 75, "RedialLoggingImpl.kt").v("previousCallInfo is invalid");
                    return aojh.a;
                }
                i = ((defpackage.rnb) rncVar).b;
                if (i == 1) {
                    zmyVar = defpackage.zmy.a;
                } else if (i != 2) {
                    zmyVar = defpackage.zmy.b;
                } else if (i != 3 || i == 5 || i == 6 || i == 7) {
                    zmyVar = defpackage.zmy.a;
                } else {
                    zmyVar = defpackage.zmy.c;
                }
                ajcq ajcqVar = this.e.c.b;
                aooh.e(ajcqVar, "getDirection(...)");
                this.a = rncVar;
                this.b = zmyVar;
                this.d = 3;
                objD = aosv.D(ajcqVar, this);
                if (objD != aoluVar) {
                    return aoluVar;
                }
                rncVar2 = rncVar;
                obj = objD;
                defpackage.rnn rnnVar2 = this.e;
                zmyVar2 = (defpackage.zmy) obj;
                aooh.c(zmyVar2);
                iOrdinal = zmyVar2.ordinal();
                if (iOrdinal == 0) {
                    iOrdinal2 = zmyVar.ordinal();
                    if (iOrdinal2 == 0) {
                        qbcVar = qbc.iI;
                    } else if (iOrdinal2 != 1) {
                        qbcVar = qbc.iH;
                    } else {
                        qbcVar = qbc.iJ;
                    }
                } else if (iOrdinal != 1) {
                    qbcVar = qbc.iH;
                } else {
                    iOrdinal3 = zmyVar.ordinal();
                    if (iOrdinal3 == 0) {
                        qbcVar = qbc.iK;
                    } else if (iOrdinal3 != 1) {
                        qbcVar = qbc.iH;
                    } else {
                        qbcVar = qbc.iL;
                    }
                }
                rnnVar2.d.a(qbcVar);
                str = ((defpackage.rnb) rncVar2).d;
                this.a = zmyVar;
                this.b = zmyVar2;
                this.c = str;
                this.d = 4;
                objE = rnnVar2.e(this);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                zmyVar3 = zmyVar;
                obj2 = str;
                zmyVar4 = zmyVar2;
                obj = objE;
                defpackage.rnn rnnVar3 = this.e;
                str2 = (java.lang.String) obj;
                aooh.c(zmyVar4);
                this.a = zmyVar3;
                this.b = obj2;
                this.c = str2;
                this.d = 5;
                rnlVar = this;
                obj = rnnVar3.g(zmyVar3, zmyVar4, (java.lang.String) obj2, str2, rnlVar);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj3 = obj2;
                zmyVar5 = zmyVar3;
                obj4 = str2;
            } else if (i2 != 3) {
                obj4 = this.c;
                if (i2 != 4) {
                    obj3 = (java.lang.String) this.b;
                    zmyVar5 = (defpackage.zmy) this.a;
                    aooc.af(obj);
                    rnlVar = this;
                } else {
                    defpackage.zmy zmyVar6 = (defpackage.zmy) this.b;
                    defpackage.zmy zmyVar7 = (defpackage.zmy) this.a;
                    aooc.af(obj);
                    zmyVar4 = zmyVar6;
                    obj2 = obj4;
                    zmyVar3 = zmyVar7;
                    defpackage.rnn rnnVar4 = this.e;
                    str2 = (java.lang.String) obj;
                    aooh.c(zmyVar4);
                    this.a = zmyVar3;
                    this.b = obj2;
                    this.c = str2;
                    this.d = 5;
                    rnlVar = this;
                    obj = rnnVar4.g(zmyVar3, zmyVar4, (java.lang.String) obj2, str2, rnlVar);
                    if (obj != aoluVar) {
                        return aoluVar;
                    }
                    obj3 = obj2;
                    zmyVar5 = zmyVar3;
                    obj4 = str2;
                }
            } else {
                zmyVar = (defpackage.zmy) this.b;
                rncVar2 = (defpackage.rnc) this.a;
                aooc.af(obj);
                defpackage.rnn rnnVar5 = this.e;
                zmyVar2 = (defpackage.zmy) obj;
                aooh.c(zmyVar2);
                iOrdinal = zmyVar2.ordinal();
                if (iOrdinal == 0) {
                    iOrdinal2 = zmyVar.ordinal();
                    if (iOrdinal2 == 0) {
                        qbcVar = qbc.iI;
                    } else if (iOrdinal2 != 1) {
                        qbcVar = qbc.iH;
                    } else {
                        qbcVar = qbc.iJ;
                    }
                } else if (iOrdinal != 1) {
                    qbcVar = qbc.iH;
                } else {
                    iOrdinal3 = zmyVar.ordinal();
                    if (iOrdinal3 == 0) {
                        qbcVar = qbc.iK;
                    } else if (iOrdinal3 != 1) {
                        qbcVar = qbc.iH;
                    } else {
                        qbcVar = qbc.iL;
                    }
                }
                rnnVar5.d.a(qbcVar);
                str = ((defpackage.rnb) rncVar2).d;
                this.a = zmyVar;
                this.b = zmyVar2;
                this.c = str;
                this.d = 4;
                objE = rnnVar5.e(this);
                if (objE == aoluVar) {
                    return aoluVar;
                }
                zmyVar3 = zmyVar;
                obj2 = str;
                zmyVar4 = zmyVar2;
                obj = objE;
                defpackage.rnn rnnVar6 = this.e;
                str2 = (java.lang.String) obj;
                aooh.c(zmyVar4);
                this.a = zmyVar3;
                this.b = obj2;
                this.c = str2;
                this.d = 5;
                rnlVar = this;
                obj = rnnVar6.g(zmyVar3, zmyVar4, (java.lang.String) obj2, str2, rnlVar);
                if (obj != aoluVar) {
                    return aoluVar;
                }
                obj3 = obj2;
                zmyVar5 = zmyVar3;
                obj4 = str2;
            }
            if (((java.lang.Boolean) obj).booleanValue()) {
                rnnVar = rnlVar.e;
                if (zmyVar5 == defpackage.zmy.a) {
                    defpackage.qbe qbeVar = rnnVar.d;
                    if (aooh.n(obj3, obj4)) {
                        qbcVar3 = qbc.iM;
                    } else {
                        qbcVar3 = qbc.iN;
                    }
                    qbeVar.a(qbcVar3);
                }
                if (zmyVar5 == defpackage.zmy.b) {
                    defpackage.qbe qbeVar2 = rnnVar.d;
                    if (aooh.n(obj3, obj4)) {
                        qbcVar2 = qbc.iO;
                    } else {
                        qbcVar2 = qbc.iP;
                    }
                    qbeVar2.a(qbcVar2);
                }
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 59, "RedialLoggingImpl.kt").v("enter");
        defpackage.rnn rnnVar7 = this.e;
        this.d = 1;
        obj = rnnVar7.a(this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        hkd hkdVar = (hkd) obj;
        if (hkdVar == null) {
            defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 62, "RedialLoggingImpl.kt").v("dialerPhoneNumber is null");
            this.e.d.a(qbc.iH);
            return aojh.a;
        }
        defpackage.rnn rnnVar8 = this.e;
        this.d = 2;
        obj = rnnVar8.d(hkdVar, this);
        if (obj == aoluVar) {
            return aoluVar;
        }
        rncVar = (defpackage.rnc) obj;
        if (rncVar == null) {
            defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 69, "RedialLoggingImpl.kt").v("previousCallInfo is null");
            this.e.d.a(qbc.iH);
            return aojh.a;
        }
        if (!(rncVar instanceof defpackage.rnb)) {
            defpackage.rnn.a.b().l("com/android/dialer/logging/redial/RedialLoggingImpl", "logRedialImpressionIfApplicableAsync$<anonymous>", 75, "RedialLoggingImpl.kt").v("previousCallInfo is invalid");
            return aojh.a;
        }
        i = ((defpackage.rnb) rncVar).b;
        if (i == 1) {
            zmyVar = defpackage.zmy.a;
        } else if (i != 2) {
            zmyVar = defpackage.zmy.b;
        } else if (i != 3) {
            zmyVar = defpackage.zmy.a;
        } else {
            zmyVar = defpackage.zmy.a;
        }
        ajcq ajcqVar2 = this.e.c.b;
        aooh.e(ajcqVar2, "getDirection(...)");
        this.a = rncVar;
        this.b = zmyVar;
        this.d = 3;
        objD = aosv.D(ajcqVar2, this);
        if (objD != aoluVar) {
            return aoluVar;
        }
        rncVar2 = rncVar;
        obj = objD;
        defpackage.rnn rnnVar9 = this.e;
        zmyVar2 = (defpackage.zmy) obj;
        aooh.c(zmyVar2);
        iOrdinal = zmyVar2.ordinal();
        if (iOrdinal == 0) {
            iOrdinal2 = zmyVar.ordinal();
            if (iOrdinal2 == 0) {
                qbcVar = qbc.iI;
            } else if (iOrdinal2 != 1) {
                qbcVar = qbc.iH;
            } else {
                qbcVar = qbc.iJ;
            }
        } else if (iOrdinal != 1) {
            qbcVar = qbc.iH;
        } else {
            iOrdinal3 = zmyVar.ordinal();
            if (iOrdinal3 == 0) {
                qbcVar = qbc.iK;
            } else if (iOrdinal3 != 1) {
                qbcVar = qbc.iH;
            } else {
                qbcVar = qbc.iL;
            }
        }
        rnnVar9.d.a(qbcVar);
        str = ((defpackage.rnb) rncVar2).d;
        this.a = zmyVar;
        this.b = zmyVar2;
        this.c = str;
        this.d = 4;
        objE = rnnVar9.e(this);
        if (objE == aoluVar) {
            return aoluVar;
        }
        zmyVar3 = zmyVar;
        obj2 = str;
        zmyVar4 = zmyVar2;
        obj = objE;
        defpackage.rnn rnnVar10 = this.e;
        str2 = (java.lang.String) obj;
        aooh.c(zmyVar4);
        this.a = zmyVar3;
        this.b = obj2;
        this.c = str2;
        this.d = 5;
        rnlVar = this;
        obj = rnnVar10.g(zmyVar3, zmyVar4, (java.lang.String) obj2, str2, rnlVar);
        if (obj != aoluVar) {
            return aoluVar;
        }
        obj3 = obj2;
        zmyVar5 = zmyVar3;
        obj4 = str2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            rnnVar = rnlVar.e;
            if (zmyVar5 == defpackage.zmy.a) {
                defpackage.qbe qbeVar3 = rnnVar.d;
                if (aooh.n(obj3, obj4)) {
                    qbcVar3 = qbc.iM;
                } else {
                    qbcVar3 = qbc.iN;
                }
                qbeVar3.a(qbcVar3);
            }
            if (zmyVar5 == defpackage.zmy.b) {
                defpackage.qbe qbeVar4 = rnnVar.d;
                if (aooh.n(obj3, obj4)) {
                    qbcVar2 = qbc.iO;
                } else {
                    qbcVar2 = qbc.iP;
                }
                qbeVar4.a(qbcVar2);
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.rnl(this.e, aolnVar);
    }
}
