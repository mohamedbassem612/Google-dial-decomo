package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jal extends aomh implements aonn {
    int a;
    final /* synthetic */ aii b;
    final /* synthetic */ aii c;
    final /* synthetic */ ajh d;
    final /* synthetic */ aonj e;
    final /* synthetic */ defpackage.jad f;
    final /* synthetic */ aii g;
    final /* synthetic */ ajh h;
    final /* synthetic */ ccp i;
    final /* synthetic */ ccp j;
    final /* synthetic */ ccp k;
    final /* synthetic */ ccp l;
    final /* synthetic */ ccp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jal(aii aiiVar, aii aiiVar2, ajh ajhVar, aonj aonjVar, defpackage.jad jadVar, aii aiiVar3, ajh ajhVar2, ccp ccpVar, ccp ccpVar2, ccp ccpVar3, ccp ccpVar4, ccp ccpVar5, aoln aolnVar) {
        super(2, aolnVar);
        this.b = aiiVar;
        this.c = aiiVar2;
        this.d = ajhVar;
        this.e = aonjVar;
        this.f = jadVar;
        this.g = aiiVar3;
        this.h = ajhVar2;
        this.i = ccpVar;
        this.j = ccpVar2;
        this.k = ccpVar3;
        this.l = ccpVar4;
        this.m = ccpVar5;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:13:0x0044  */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00be  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:37:0x010c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aii aiiVar;
        float fFloatValue;
        java.lang.Float f;
        alm almVarBv;
        aii aiiVar2;
        java.lang.Float f2;
        aii aiiVar3;
        java.lang.Float f3;
        alm almVarBv2;
        aii aiiVar4;
        java.lang.Float f4;
        boolean z;
        int iOrdinal;
        aii aiiVar5;
        int iFloatValue;
        java.lang.Float f5;
        alm almVarBv3;
        aii aiiVar6;
        int iFloatValue2;
        java.lang.Float f6;
        alm almVarBv4;
        aii aiiVar7;
        java.lang.Float f7;
        alm almVarBv5;
        aolu aoluVar = aolu.a;
        int i = this.a;
        aooc.af(obj);
        switch (i) {
            case 0:
                ccp ccpVar = this.i;
                boolean zC = a.C(ccpVar);
                z = !zC;
                ccpVar.b(java.lang.Boolean.FALSE);
                if (zC) {
                    aii aiiVar8 = this.b;
                    java.lang.Float f8 = new java.lang.Float(0.0f);
                    this.a = 1;
                    if (aiiVar8.f(f8, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    iOrdinal = defpackage.hhe.h(this.j).ordinal();
                    if (iOrdinal != 0) {
                        if (!z) {
                            a.E(this.k, true);
                            a.E(this.l, false);
                        }
                        aiiVar5 = this.c;
                        iFloatValue = (int) ((java.lang.Number) aiiVar5.d()).floatValue();
                        if (iFloatValue > 0) {
                            f5 = new java.lang.Float(0.0f);
                            almVarBv3 = den.bv(iFloatValue, 0, ajk.d, 2);
                            this.a = 2;
                            if (aii.l(aiiVar5, f5, almVarBv3, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        a.E(this.k, false);
                        a.E(this.l, true);
                        aiiVar = this.b;
                        fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
                        if (fFloatValue > -1.0f) {
                            float f9 = fFloatValue + 1.0f;
                            f = new java.lang.Float(-1.0f);
                            almVarBv = den.bv((int) (f9 * 300.0f), 0, this.d, 2);
                            this.a = 3;
                            if (aii.l(aiiVar, f, almVarBv, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        this.e.a(defpackage.jac.b);
                        this.f.a.a();
                    } else if (iOrdinal != 1) {
                        aiiVar6 = this.g;
                        iFloatValue2 = (int) (60000.0f - ((java.lang.Number) aiiVar6.d()).floatValue());
                        if (iFloatValue2 > 0) {
                            f6 = new java.lang.Float(60000.0f);
                            almVarBv4 = den.bv(iFloatValue2, 0, ajk.d, 2);
                            this.a = 4;
                            if (aii.l(aiiVar6, f6, almVarBv4, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                                return aoluVar;
                            }
                        }
                        this.f.e.a();
                    } else if (iOrdinal != 2) {
                        if (iOrdinal == 3) {
                            throw new aois();
                        }
                        a.E(this.m, false);
                        aiiVar7 = this.g;
                        f7 = new java.lang.Float(60000.0f);
                        almVarBv5 = den.bv(300, 0, this.h, 2);
                        this.a = 5;
                        if (aii.l(aiiVar7, f7, almVarBv5, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                        aiiVar4 = this.g;
                        f4 = new java.lang.Float(0.0f);
                        this.a = 6;
                        if (aiiVar4.f(f4, this) == aoluVar) {
                            return aoluVar;
                        }
                        a.E(this.m, true);
                        aiiVar3 = this.b;
                        f3 = new java.lang.Float(-1.0f);
                        almVarBv2 = den.bv(300, 0, this.d, 2);
                        this.a = 7;
                        if (aii.l(aiiVar3, f3, almVarBv2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                        a.E(this.l, false);
                        aiiVar2 = this.c;
                        f2 = new java.lang.Float(3000.0f);
                        this.a = 8;
                        if (aiiVar2.f(f2, this) == aoluVar) {
                            return aoluVar;
                        }
                        this.e.a(defpackage.jac.a);
                    }
                }
                return aojh.a;
            case 1:
                z = false;
                iOrdinal = defpackage.hhe.h(this.j).ordinal();
                if (iOrdinal != 0) {
                    if (!z) {
                        a.E(this.k, true);
                        a.E(this.l, false);
                    }
                    aiiVar5 = this.c;
                    iFloatValue = (int) ((java.lang.Number) aiiVar5.d()).floatValue();
                    if (iFloatValue > 0) {
                        f5 = new java.lang.Float(0.0f);
                        almVarBv3 = den.bv(iFloatValue, 0, ajk.d, 2);
                        this.a = 2;
                        if (aii.l(aiiVar5, f5, almVarBv3, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    a.E(this.k, false);
                    a.E(this.l, true);
                    aiiVar = this.b;
                    fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
                    if (fFloatValue > -1.0f) {
                        float f10 = fFloatValue + 1.0f;
                        f = new java.lang.Float(-1.0f);
                        almVarBv = den.bv((int) (f10 * 300.0f), 0, this.d, 2);
                        this.a = 3;
                        if (aii.l(aiiVar, f, almVarBv, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    this.e.a(defpackage.jac.b);
                    this.f.a.a();
                } else if (iOrdinal != 1) {
                    aiiVar6 = this.g;
                    iFloatValue2 = (int) (60000.0f - ((java.lang.Number) aiiVar6.d()).floatValue());
                    if (iFloatValue2 > 0) {
                        f6 = new java.lang.Float(60000.0f);
                        almVarBv4 = den.bv(iFloatValue2, 0, ajk.d, 2);
                        this.a = 4;
                        if (aii.l(aiiVar6, f6, almVarBv4, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    this.f.e.a();
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        throw new aois();
                    }
                    a.E(this.m, false);
                    aiiVar7 = this.g;
                    f7 = new java.lang.Float(60000.0f);
                    almVarBv5 = den.bv(300, 0, this.h, 2);
                    this.a = 5;
                    if (aii.l(aiiVar7, f7, almVarBv5, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                        return aoluVar;
                    }
                    aiiVar4 = this.g;
                    f4 = new java.lang.Float(0.0f);
                    this.a = 6;
                    if (aiiVar4.f(f4, this) == aoluVar) {
                        return aoluVar;
                    }
                    a.E(this.m, true);
                    aiiVar3 = this.b;
                    f3 = new java.lang.Float(-1.0f);
                    almVarBv2 = den.bv(300, 0, this.d, 2);
                    this.a = 7;
                    if (aii.l(aiiVar3, f3, almVarBv2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                        return aoluVar;
                    }
                    a.E(this.l, false);
                    aiiVar2 = this.c;
                    f2 = new java.lang.Float(3000.0f);
                    this.a = 8;
                    if (aiiVar2.f(f2, this) == aoluVar) {
                        return aoluVar;
                    }
                    this.e.a(defpackage.jac.a);
                }
                return aojh.a;
            case 2:
                a.E(this.k, false);
                a.E(this.l, true);
                aiiVar = this.b;
                fFloatValue = ((java.lang.Number) aiiVar.d()).floatValue();
                if (fFloatValue > -1.0f) {
                    float f11 = fFloatValue + 1.0f;
                    f = new java.lang.Float(-1.0f);
                    almVarBv = den.bv((int) (f11 * 300.0f), 0, this.d, 2);
                    this.a = 3;
                    if (aii.l(aiiVar, f, almVarBv, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                        return aoluVar;
                    }
                }
            case 3:
                this.e.a(defpackage.jac.b);
                this.f.a.a();
                return aojh.a;
            case 4:
                this.f.e.a();
                return aojh.a;
            case 5:
                aiiVar4 = this.g;
                f4 = new java.lang.Float(0.0f);
                this.a = 6;
                if (aiiVar4.f(f4, this) == aoluVar) {
                    return aoluVar;
                }
            case 6:
                a.E(this.m, true);
                aiiVar3 = this.b;
                f3 = new java.lang.Float(-1.0f);
                almVarBv2 = den.bv(300, 0, this.d, 2);
                this.a = 7;
                if (aii.l(aiiVar3, f3, almVarBv2, (java.lang.Object) null, (aonj) null, this, 12) == aoluVar) {
                    return aoluVar;
                }
            case 7:
                a.E(this.l, false);
                aiiVar2 = this.c;
                f2 = new java.lang.Float(3000.0f);
                this.a = 8;
                if (aiiVar2.f(f2, this) == aoluVar) {
                    return aoluVar;
                }
            default:
                this.e.a(defpackage.jac.a);
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.jal(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, aolnVar);
    }
}
