package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yrw extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrw(nvw nvwVar, android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = nvwVar;
        this.c = phoneAccountHandle;
        this.b = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoxi) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x018b  */
    /* JADX WARN: Code duplicated, block: B:66:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0192  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [aolr, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        aosy aosyVarAm;
        java.lang.Object objA;
        java.lang.Object objA2;
        java.lang.Object objAj;
        java.lang.Object objAj2;
        java.lang.Object objB;
        java.lang.Object objB2;
        aoss aossVar;
        aii aiiVar;
        java.lang.Float f;
        aii aiiVar2;
        java.lang.Float f2;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            if (this.a != 0) {
                aooc.af(obj);
            } else {
                aooc.af(obj);
                aoxi aoxiVar = (aoxi) this.e;
                if (this.b) {
                    java.lang.Object obj2 = this.c;
                    java.lang.Object obj3 = this.d;
                    aooh.f(obj3, "feature");
                    ucm ucmVar = (ucm) ((zth) obj2).c;
                    aoxh aoxhVarAC = aoov.aC(new aowy(new defpackage.ysz(ucmVar, (defpackage.yse) obj3, (aoln) null, 0)), (aolr) ucmVar.a);
                    this.a = 1;
                    if (aoov.aG(aoxiVar, aoxhVarAC, this) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    defpackage.yta ytaVar = defpackage.yta.a;
                    this.a = 2;
                    if (aoxiVar.a(ytaVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        if (i != 1) {
            aolu aoluVar2 = aolu.a;
            int i2 = this.a;
            if (i2 == 0) {
                aooc.af(obj);
                aoss aossVar2 = (aoss) this.e;
                if (this.b) {
                    aii aiiVar3 = ((defpackage.acrz) this.c).i;
                    if (aiiVar3 != null) {
                        java.lang.Float f3 = new java.lang.Float(-0.2f);
                        this.e = aossVar2;
                        this.a = 1;
                        if (aiiVar3.f(f3, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    aossVar = aossVar2;
                    aiiVar = ((defpackage.acrz) this.c).j;
                    if (aiiVar != null) {
                        f = new java.lang.Float(0.0f);
                        this.e = aossVar;
                        this.a = 2;
                        if (aiiVar.f(f, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    aiiVar2 = ((defpackage.acrz) this.c).k;
                    if (aiiVar2 != null) {
                        f2 = new java.lang.Float(0.0f);
                        this.e = aossVar;
                        this.a = 3;
                        if (aiiVar2.f(f2, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                } else {
                    aossVar = aossVar2;
                }
            } else if (i2 != 1) {
                aossVar = (aoss) this.e;
                aooc.af(obj);
                if (i2 == 2) {
                    aiiVar2 = ((defpackage.acrz) this.c).k;
                    if (aiiVar2 != null) {
                        f2 = new java.lang.Float(0.0f);
                        this.e = aossVar;
                        this.a = 3;
                        if (aiiVar2.f(f2, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                }
            } else {
                aossVar = (aoss) this.e;
                aooc.af(obj);
                aiiVar = ((defpackage.acrz) this.c).j;
                if (aiiVar != null) {
                    f = new java.lang.Float(0.0f);
                    this.e = aossVar;
                    this.a = 2;
                    if (aiiVar.f(f, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                aiiVar2 = ((defpackage.acrz) this.c).k;
                if (aiiVar2 != null) {
                    f2 = new java.lang.Float(0.0f);
                    this.e = aossVar;
                    this.a = 3;
                    if (aiiVar2.f(f2, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
            java.lang.Object obj4 = this.c;
            defpackage.acsa acsaVar = (defpackage.acsa) this.d;
            defpackage.acrz acrzVar = (defpackage.acrz) obj4;
            aoov.an(aossVar, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar, (aoln) null, 12, (char[]) null), 3);
            aoov.an(aossVar, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar, (aoln) null, 13, (short[]) null), 3);
            aoov.an(aossVar, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar, (aoln) null, 14, (int[]) null), 3);
            aoov.an(aossVar, (aolr) null, 0, new defpackage.acju(acrzVar, acsaVar, (aoln) null, 15, (boolean[]) null), 3);
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                aooc.af(obj);
                if (i3 == 2) {
                    objA2 = obj;
                    if (!((java.lang.Boolean) objA2).booleanValue()) {
                        return nvr.e;
                    }
                    java.lang.Object obj5 = this.d;
                    java.lang.Object obj6 = this.c;
                    this.e = null;
                    this.a = 3;
                    nvw nvwVar = (nvw) obj5;
                    objAj = aoov.aj(nvwVar.e, new nrw(nvwVar, (android.telecom.PhoneAccountHandle) obj6, (aoln) null, 13, (boolean[]) null), this);
                    if (objAj == aoluVar3) {
                        return aoluVar3;
                    }
                    if (!((java.lang.Boolean) objAj).booleanValue()) {
                        if (this.b) {
                            java.lang.Object obj7 = this.d;
                            java.lang.Object obj8 = this.c;
                            this.a = 5;
                            objB = ((nvw) obj7).b((android.telecom.PhoneAccountHandle) obj8, 1024, this);
                            if (objB == aoluVar3) {
                                return aoluVar3;
                            }
                            if (!((java.lang.Boolean) objB).booleanValue()) {
                                return nvr.c;
                            }
                        }
                        return nvr.a;
                    }
                    java.lang.Object obj9 = this.d;
                    java.lang.Object obj10 = this.c;
                    this.a = 4;
                    nvw nvwVar2 = (nvw) obj9;
                    objAj2 = aoov.aj(nvwVar2.e, new nrw(nvwVar2, (android.telecom.PhoneAccountHandle) obj10, (aoln) null, 10, (short[]) null), this);
                    if (objAj2 == aoluVar3) {
                        return aoluVar3;
                    }
                    if (!((java.lang.Boolean) objAj2).booleanValue()) {
                        return nvr.b;
                    }
                    if (this.b) {
                        java.lang.Object obj11 = this.d;
                        java.lang.Object obj12 = this.c;
                        this.a = 5;
                        objB = ((nvw) obj11).b((android.telecom.PhoneAccountHandle) obj12, 1024, this);
                        if (objB == aoluVar3) {
                            return aoluVar3;
                        }
                        if (!((java.lang.Boolean) objB).booleanValue()) {
                            return nvr.c;
                        }
                    }
                    return nvr.a;
                    if (this.b) {
                        java.lang.Object obj13 = this.d;
                        java.lang.Object obj14 = this.c;
                        this.a = 6;
                        objB2 = ((nvw) obj13).b((android.telecom.PhoneAccountHandle) obj14, 8, this);
                        if (objB2 == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                    return nvr.a;
                }
                if (i3 == 3) {
                    objAj = obj;
                    if (!((java.lang.Boolean) objAj).booleanValue()) {
                        if (this.b) {
                            java.lang.Object obj15 = this.d;
                            java.lang.Object obj16 = this.c;
                            this.a = 5;
                            objB = ((nvw) obj15).b((android.telecom.PhoneAccountHandle) obj16, 1024, this);
                            if (objB == aoluVar3) {
                                return aoluVar3;
                            }
                            if (!((java.lang.Boolean) objB).booleanValue()) {
                                return nvr.c;
                            }
                        }
                        return nvr.a;
                    }
                    java.lang.Object obj17 = this.d;
                    java.lang.Object obj18 = this.c;
                    this.a = 4;
                    nvw nvwVar3 = (nvw) obj17;
                    objAj2 = aoov.aj(nvwVar3.e, new nrw(nvwVar3, (android.telecom.PhoneAccountHandle) obj18, (aoln) null, 10, (short[]) null), this);
                    if (objAj2 == aoluVar3) {
                        return aoluVar3;
                    }
                    if (!((java.lang.Boolean) objAj2).booleanValue()) {
                        return nvr.b;
                    }
                    if (this.b) {
                        java.lang.Object obj19 = this.d;
                        java.lang.Object obj110 = this.c;
                        this.a = 5;
                        objB = ((nvw) obj19).b((android.telecom.PhoneAccountHandle) obj110, 1024, this);
                        if (objB == aoluVar3) {
                            return aoluVar3;
                        }
                        if (!((java.lang.Boolean) objB).booleanValue()) {
                            return nvr.c;
                        }
                    }
                    return nvr.a;
                    if (this.b) {
                        java.lang.Object obj111 = this.d;
                        java.lang.Object obj112 = this.c;
                        this.a = 6;
                        objB2 = ((nvw) obj111).b((android.telecom.PhoneAccountHandle) obj112, 8, this);
                        if (objB2 == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                    return nvr.a;
                }
                if (i3 == 4) {
                    objAj2 = obj;
                    if (!((java.lang.Boolean) objAj2).booleanValue()) {
                        return nvr.b;
                    }
                    if (this.b) {
                        java.lang.Object obj113 = this.d;
                        java.lang.Object obj114 = this.c;
                        this.a = 5;
                        objB = ((nvw) obj113).b((android.telecom.PhoneAccountHandle) obj114, 1024, this);
                        if (objB == aoluVar3) {
                            return aoluVar3;
                        }
                        if (!((java.lang.Boolean) objB).booleanValue()) {
                            return nvr.c;
                        }
                        if (this.b) {
                            java.lang.Object obj115 = this.d;
                            java.lang.Object obj116 = this.c;
                            this.a = 6;
                            objB2 = ((nvw) obj115).b((android.telecom.PhoneAccountHandle) obj116, 8, this);
                            if (objB2 == aoluVar3) {
                                return aoluVar3;
                            }
                        }
                    } else if (this.b) {
                        java.lang.Object obj117 = this.d;
                        java.lang.Object obj118 = this.c;
                        this.a = 6;
                        objB2 = ((nvw) obj117).b((android.telecom.PhoneAccountHandle) obj118, 8, this);
                        if (objB2 == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                    return nvr.a;
                }
                if (i3 == 5) {
                    objB = obj;
                    if (!((java.lang.Boolean) objB).booleanValue()) {
                        return nvr.c;
                    }
                    if (this.b) {
                        java.lang.Object obj119 = this.d;
                        java.lang.Object obj1110 = this.c;
                        this.a = 6;
                        objB2 = ((nvw) obj119).b((android.telecom.PhoneAccountHandle) obj1110, 8, this);
                        if (objB2 == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                    return nvr.a;
                }
                objB2 = obj;
            } else {
                aosy aosyVar = (aosy) this.e;
                aooc.af(obj);
                aosyVarAm = aosyVar;
                objA = obj;
            }
            if (!((java.lang.Boolean) objB2).booleanValue()) {
                return nvr.d;
            }
            return nvr.a;
        }
        aooc.af(obj);
        aoss aossVar3 = (aoss) this.e;
        java.lang.Object obj20 = this.d;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.c;
        nvw nvwVar4 = (nvw) obj20;
        aosyVarAm = aoov.am(aossVar3, 0, new nrw(nvwVar4, phoneAccountHandle, (aoln) null, 8, (byte[]) null), 3);
        aosy aosyVarAm2 = aoov.am(aossVar3, 0, new nrw(nvwVar4, phoneAccountHandle, (aoln) null, 7), 3);
        this.e = aosyVarAm;
        this.a = 1;
        objA = aosyVarAm2.a(this);
        if (objA == aoluVar3) {
            return aoluVar3;
        }
        if (!((java.lang.Boolean) objA).booleanValue()) {
            this.e = null;
            this.a = 2;
            objA2 = aosyVarAm.a(this);
            if (objA2 == aoluVar3) {
                return aoluVar3;
            }
            if (!((java.lang.Boolean) objA2).booleanValue()) {
                return nvr.e;
            }
        }
        java.lang.Object obj21 = this.d;
        java.lang.Object obj22 = this.c;
        this.e = null;
        this.a = 3;
        nvw nvwVar5 = (nvw) obj21;
        objAj = aoov.aj(nvwVar5.e, new nrw(nvwVar5, (android.telecom.PhoneAccountHandle) obj22, (aoln) null, 13, (boolean[]) null), this);
        if (objAj == aoluVar3) {
            return aoluVar3;
        }
        if (!((java.lang.Boolean) objAj).booleanValue()) {
            if (this.b) {
                java.lang.Object obj1111 = this.d;
                java.lang.Object obj1112 = this.c;
                this.a = 5;
                objB = ((nvw) obj1111).b((android.telecom.PhoneAccountHandle) obj1112, 1024, this);
                if (objB == aoluVar3) {
                    return aoluVar3;
                }
                if (!((java.lang.Boolean) objB).booleanValue()) {
                    return nvr.c;
                }
            }
            return nvr.a;
        }
        java.lang.Object obj120 = this.d;
        java.lang.Object obj121 = this.c;
        this.a = 4;
        nvw nvwVar6 = (nvw) obj120;
        objAj2 = aoov.aj(nvwVar6.e, new nrw(nvwVar6, (android.telecom.PhoneAccountHandle) obj121, (aoln) null, 10, (short[]) null), this);
        if (objAj2 == aoluVar3) {
            return aoluVar3;
        }
        if (!((java.lang.Boolean) objAj2).booleanValue()) {
            return nvr.b;
        }
        if (this.b) {
            java.lang.Object obj1113 = this.d;
            java.lang.Object obj1114 = this.c;
            this.a = 5;
            objB = ((nvw) obj1113).b((android.telecom.PhoneAccountHandle) obj1114, 1024, this);
            if (objB == aoluVar3) {
                return aoluVar3;
            }
            if (!((java.lang.Boolean) objB).booleanValue()) {
                return nvr.c;
            }
        }
        return nvr.a;
        if (this.b) {
            java.lang.Object obj1115 = this.d;
            java.lang.Object obj1116 = this.c;
            this.a = 6;
            objB2 = ((nvw) obj1115).b((android.telecom.PhoneAccountHandle) obj1116, 8, this);
            if (objB2 == aoluVar3) {
                return aoluVar3;
            }
            if (!((java.lang.Boolean) objB2).booleanValue()) {
                return nvr.d;
            }
        }
        return nvr.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.yrw yrwVar = new defpackage.yrw(this.b, (zth) this.c, (defpackage.yse) this.d, aolnVar, 0);
            yrwVar.e = obj;
            return yrwVar;
        }
        if (i != 1) {
            defpackage.yrw yrwVar2 = new defpackage.yrw(this.b, (defpackage.acrz) this.c, (defpackage.acsa) this.d, aolnVar, 2);
            yrwVar2.e = obj;
            return yrwVar2;
        }
        java.lang.Object obj2 = this.d;
        nvw nvwVar = (nvw) obj2;
        defpackage.yrw yrwVar3 = new defpackage.yrw(nvwVar, (android.telecom.PhoneAccountHandle) this.c, this.b, aolnVar, 1);
        yrwVar3.e = obj;
        return yrwVar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrw(boolean z, defpackage.acrz acrzVar, defpackage.acsa acsaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = z;
        this.c = acrzVar;
        this.d = acsaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrw(boolean z, zth zthVar, defpackage.yse yseVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = z;
        this.c = zthVar;
        this.d = yseVar;
    }
}
