package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class fzp implements defpackage.aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ defpackage.aoxi a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public fzp(defpackage.aoop aoopVar, defpackage.aoxi aoxiVar, defpackage.aonn aonnVar, int i) {
        this.$cid = i;
        this.b = aoopVar;
        this.a = aoxiVar;
        this.c = aonnVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [aono, java.lang.Object] */
    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.fzo fzoVar;
        java.lang.Object obj2;
        defpackage.fzm fzmVar;
        java.lang.Object obj3;
        defpackage.aoxy aoxyVar;
        defpackage.aoxi aoxiVar;
        int i = this.$cid;
        if (i == 0) {
            if (aolnVar instanceof defpackage.fzo) {
                fzoVar = (defpackage.fzo) aolnVar;
                int i2 = fzoVar.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fzoVar.d = i2 - Integer.MIN_VALUE;
                } else {
                    fzoVar = new defpackage.fzo(this, aolnVar);
                }
            } else {
                fzoVar = new defpackage.fzo(this, aolnVar);
            }
            java.lang.Object obj4 = fzoVar.b;
            defpackage.aolu aoluVar = defpackage.aolu.a;
            int i3 = fzoVar.d;
            if (i3 != 0) {
                if (i3 == 1) {
                    obj2 = fzoVar.e;
                    java.lang.Object obj5 = fzoVar.a;
                    defpackage.aooc.af(obj4);
                } else {
                    if (i3 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj6 = fzoVar.a;
                    defpackage.aooc.af(obj4);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj4);
            java.lang.Object obj7 = this.b;
            ?? r1 = this.c;
            defpackage.aoot aootVar = (defpackage.aoot) obj7;
            java.lang.Object obj8 = aootVar.a;
            fzoVar.a = null;
            fzoVar.e = aootVar;
            fzoVar.d = 1;
            java.lang.Object objA = r1.a(obj8, obj, fzoVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            obj4 = objA;
            obj2 = obj7;
            ((defpackage.aoot) obj2).a = obj4;
            defpackage.aoxi aoxiVar2 = this.a;
            java.lang.Object obj9 = ((defpackage.aoot) this.b).a;
            fzoVar.a = null;
            fzoVar.e = null;
            fzoVar.d = 2;
            if (aoxiVar2.a(obj9, fzoVar) == aoluVar) {
                return aoluVar;
            }
            return defpackage.aojh.a;
        }
        if (i == 1) {
            if (aolnVar instanceof defpackage.fzm) {
                fzmVar = (defpackage.fzm) aolnVar;
                int i4 = fzmVar.c;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fzmVar.c = i4 - Integer.MIN_VALUE;
                } else {
                    fzmVar = new defpackage.fzm(this, aolnVar);
                }
            } else {
                fzmVar = new defpackage.fzm(this, aolnVar);
            }
            java.lang.Object obj10 = fzmVar.b;
            defpackage.aolu aoluVar2 = defpackage.aolu.a;
            int i5 = fzmVar.c;
            if (i5 != 0) {
                if (i5 == 1) {
                    obj3 = fzmVar.d;
                    java.lang.Object obj11 = fzmVar.a;
                    defpackage.aooc.af(obj10);
                } else {
                    if (i5 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.lang.Object obj12 = fzmVar.a;
                    defpackage.aooc.af(obj10);
                }
                return defpackage.aojh.a;
            }
            defpackage.aooc.af(obj10);
            java.lang.Object obj13 = this.b;
            defpackage.aoot aootVar2 = (defpackage.aoot) obj13;
            java.lang.Object obj14 = aootVar2.a;
            if (obj14 != defpackage.fzr.a) {
                ?? r7 = this.c;
                fzmVar.a = null;
                fzmVar.d = aootVar2;
                fzmVar.c = 1;
                obj = r7.a(obj14, obj, fzmVar);
                if (obj == aoluVar2) {
                    return aoluVar2;
                }
            }
            obj10 = obj;
            obj3 = obj13;
            ((defpackage.aoot) obj3).a = obj10;
            defpackage.aoxi aoxiVar3 = this.a;
            java.lang.Object obj15 = ((defpackage.aoot) this.b).a;
            fzmVar.a = null;
            fzmVar.d = null;
            fzmVar.c = 2;
            if (aoxiVar3.a(obj15, fzmVar) == aoluVar2) {
                return aoluVar2;
            }
            return defpackage.aojh.a;
        }
        if (i == 2) {
            java.lang.Object obj16 = this.c;
            defpackage.aoxf aoxfVar = (defpackage.aoxf) this.b;
            java.lang.Object objA2 = aoxfVar.a.a(obj);
            defpackage.aoot aootVar3 = (defpackage.aoot) obj16;
            java.lang.Object obj17 = aootVar3.a;
            if (obj17 == defpackage.apam.a || !((java.lang.Boolean) aoxfVar.b.a(obj17, objA2)).booleanValue()) {
                aootVar3.a = objA2;
                java.lang.Object objA3 = this.a.a(obj, aolnVar);
                if (objA3 == defpackage.aolu.a) {
                    return objA3;
                }
            }
            return defpackage.aojh.a;
        }
        if (aolnVar instanceof defpackage.aoxy) {
            aoxyVar = (defpackage.aoxy) aolnVar;
            int i6 = aoxyVar.c;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                aoxyVar.c = i6 - Integer.MIN_VALUE;
            } else {
                aoxyVar = new defpackage.aoxy(this, aolnVar);
            }
        } else {
            aoxyVar = new defpackage.aoxy(this, aolnVar);
        }
        java.lang.Object objA4 = aoxyVar.b;
        defpackage.aolu aoluVar3 = defpackage.aolu.a;
        int i7 = aoxyVar.c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    obj = aoxyVar.a;
                    defpackage.aooc.af(objA4);
                    if (!((java.lang.Boolean) objA4).booleanValue()) {
                        ((defpackage.aoop) this.b).a = true;
                        aoxiVar = this.a;
                        aoxyVar.a = null;
                        aoxyVar.c = 3;
                        if (aoxiVar.a(obj, aoxyVar) == aoluVar3) {
                            return aoluVar3;
                        }
                    }
                } else if (i7 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            defpackage.aooc.af(objA4);
        } else {
            defpackage.aooc.af(objA4);
            if (((defpackage.aoop) this.b).a) {
                defpackage.aoxi aoxiVar4 = this.a;
                aoxyVar.c = 1;
                if (aoxiVar4.a(obj, aoxyVar) == aoluVar3) {
                    return aoluVar3;
                }
            } else {
                ?? r11 = this.c;
                aoxyVar.a = obj;
                aoxyVar.c = 2;
                objA4 = r11.a(obj, aoxyVar);
                if (objA4 == aoluVar3) {
                    return aoluVar3;
                }
                if (!((java.lang.Boolean) objA4).booleanValue()) {
                    ((defpackage.aoop) this.b).a = true;
                    aoxiVar = this.a;
                    aoxyVar.a = null;
                    aoxyVar.c = 3;
                    if (aoxiVar.a(obj, aoxyVar) == aoluVar3) {
                        return aoluVar3;
                    }
                }
            }
        }
        return defpackage.aojh.a;
    }

    public fzp(java.lang.Object obj, java.lang.Object obj2, defpackage.aoxi aoxiVar, int i) {
        this.$cid = i;
        this.b = obj;
        this.c = obj2;
        this.a = aoxiVar;
    }
}
