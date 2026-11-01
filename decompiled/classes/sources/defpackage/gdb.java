package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdb implements defpackage.aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public gdb(defpackage.aonn aonnVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = aonnVar;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0182  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:150:0x0269  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kkd] */
    /* JADX WARN: Type inference failed for: r10v6, types: [dzn] */
    /* JADX WARN: Type inference failed for: r11v18, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v26, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [gdb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v30, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v41, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v5, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v51, types: [gdb] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v57, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v61, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v63 */
    /* JADX WARN: Type inference failed for: r9v64, types: [aoxi] */
    /* JADX WARN: Type inference failed for: r9v69, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v71 */
    /* JADX WARN: Type inference failed for: r9v72 */
    /* JADX WARN: Type inference failed for: r9v73 */
    /* JADX WARN: Type inference failed for: r9v74 */
    /* JADX WARN: Type inference failed for: r9v75 */
    /* JADX WARN: Type inference failed for: r9v76 */
    /* JADX WARN: Type inference failed for: r9v77 */
    @Override // defpackage.aoxi
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        defpackage.gda gdaVar;
        ?? r9;
        defpackage.gch gchVar;
        ?? r10;
        defpackage.rtf rtfVar;
        ?? r11;
        defpackage.uni uniVar;
        ?? r12;
        defpackage.aoxu aoxuVar;
        defpackage.aoya aoyaVar;
        defpackage.aoyd aoydVar;
        defpackage.aoym aoymVar;
        ?? r13;
        switch (this.$cid) {
            case 0:
                if (aolnVar instanceof defpackage.gda) {
                    gdaVar = (defpackage.gda) aolnVar;
                    int i = gdaVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        gdaVar.b = i - Integer.MIN_VALUE;
                    } else {
                        gdaVar = new defpackage.gda(this, aolnVar);
                    }
                } else {
                    gdaVar = new defpackage.gda(this, aolnVar);
                }
                java.lang.Object obj2 = gdaVar.a;
                defpackage.aolu aoluVar = defpackage.aolu.a;
                int i2 = gdaVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        java.lang.Object obj3 = gdaVar.j;
                        java.lang.Object obj4 = gdaVar.i;
                        java.lang.Object obj5 = gdaVar.h;
                        java.lang.Object obj6 = gdaVar.g;
                        java.lang.Object obj7 = gdaVar.f;
                        java.lang.Object obj8 = gdaVar.e;
                        java.lang.Object obj9 = gdaVar.c;
                        defpackage.aooc.af(obj2);
                        r9 = obj5;
                    } else {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj10 = gdaVar.g;
                        java.lang.Object obj11 = gdaVar.f;
                        java.lang.Object obj12 = gdaVar.e;
                        java.lang.Object obj13 = gdaVar.c;
                        defpackage.aooc.af(obj2);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj2);
                java.lang.Object obj14 = this.a;
                java.lang.Object obj15 = this.b;
                gdaVar.c = null;
                gdaVar.e = null;
                gdaVar.f = null;
                gdaVar.g = null;
                gdaVar.h = obj14;
                gdaVar.i = null;
                gdaVar.j = null;
                gdaVar.b = 1;
                java.lang.Object objC = ((defpackage.gcy) obj15).c((defpackage.dzn) obj, gdaVar);
                if (objC == aoluVar) {
                    return aoluVar;
                }
                obj2 = objC;
                r9 = obj14;
                gdaVar.c = null;
                gdaVar.e = null;
                gdaVar.f = null;
                gdaVar.g = null;
                gdaVar.h = null;
                gdaVar.i = null;
                gdaVar.j = null;
                gdaVar.b = 2;
                if (r9.a(obj2, gdaVar) == aoluVar) {
                    return aoluVar;
                }
                return defpackage.aojh.a;
            case 1:
                if (aolnVar instanceof defpackage.gch) {
                    gchVar = (defpackage.gch) aolnVar;
                    int i3 = gchVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gchVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        gchVar = new defpackage.gch(this, aolnVar);
                    }
                } else {
                    gchVar = new defpackage.gch(this, aolnVar);
                }
                java.lang.Object obj16 = gchVar.a;
                defpackage.aolu aoluVar2 = defpackage.aolu.a;
                int i4 = gchVar.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        java.lang.Object obj17 = gchVar.k;
                        java.lang.Object obj18 = gchVar.j;
                        java.lang.Object obj19 = gchVar.i;
                        java.lang.Object obj20 = gchVar.h;
                        java.lang.Object obj21 = gchVar.g;
                        java.lang.Object obj22 = gchVar.f;
                        java.lang.Object obj23 = gchVar.e;
                        java.lang.Object obj24 = gchVar.d;
                        java.lang.Object obj25 = gchVar.c;
                        defpackage.aooc.af(obj16);
                        r10 = obj21;
                    } else {
                        if (i4 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        java.lang.Object obj26 = gchVar.f;
                        java.lang.Object obj27 = gchVar.e;
                        java.lang.Object obj28 = gchVar.d;
                        java.lang.Object obj29 = gchVar.c;
                        defpackage.aooc.af(obj16);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj16);
                java.lang.Object obj30 = this.a;
                ?? r14 = this.b;
                gchVar.c = null;
                gchVar.d = null;
                gchVar.e = null;
                gchVar.f = null;
                gchVar.g = obj30;
                gchVar.h = null;
                gchVar.i = null;
                gchVar.j = null;
                gchVar.k = null;
                gchVar.b = 1;
                java.lang.Object objL = ((defpackage.dzn) obj).l(r14, gchVar);
                if (objL == aoluVar2) {
                    return aoluVar2;
                }
                obj16 = objL;
                r10 = obj30;
                gchVar.c = null;
                gchVar.d = null;
                gchVar.e = null;
                gchVar.f = null;
                gchVar.g = null;
                gchVar.h = null;
                gchVar.i = null;
                gchVar.j = null;
                gchVar.k = null;
                gchVar.b = 2;
                if (r10.a(obj16, gchVar) == aoluVar2) {
                    return aoluVar2;
                }
                return defpackage.aojh.a;
            case 2:
                java.lang.Object objA = this.a.a(new defpackage.kkh(this.b, (defpackage.kkk) obj), aolnVar);
                return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
            case 3:
                if (aolnVar instanceof defpackage.rtf) {
                    rtfVar = (defpackage.rtf) aolnVar;
                    int i5 = rtfVar.b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        rtfVar.b = i5 - Integer.MIN_VALUE;
                    } else {
                        rtfVar = new defpackage.rtf(this, aolnVar);
                    }
                } else {
                    rtfVar = new defpackage.rtf(this, aolnVar);
                }
                java.lang.Object obj31 = rtfVar.a;
                defpackage.aolu aoluVar3 = defpackage.aolu.a;
                int i6 = rtfVar.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        java.lang.Object obj32 = rtfVar.c;
                        defpackage.aooc.af(obj31);
                        r11 = obj32;
                    } else {
                        if (i6 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(obj31);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj31);
                java.lang.Object obj33 = this.a;
                java.lang.Object obj34 = this.b;
                rtfVar.c = obj33;
                rtfVar.b = 1;
                defpackage.rtg rtgVar = (defpackage.rtg) obj34;
                java.lang.Object objAj = defpackage.aoov.aj(rtgVar.b, new defpackage.zbj(rtgVar, (java.util.Map) obj, (defpackage.aoln) null, 1), rtfVar);
                if (objAj == aoluVar3) {
                    return aoluVar3;
                }
                obj31 = objAj;
                r11 = obj33;
                rtfVar.c = null;
                rtfVar.b = 2;
                if (r11.a(obj31, rtfVar) == aoluVar3) {
                    return aoluVar3;
                }
                return defpackage.aojh.a;
            case 4:
                ((defpackage.unb) this.b).i.e(null);
                java.lang.Object objA2 = this.a.a(defpackage.wsc.bA((java.util.List) obj), aolnVar);
                return objA2 != defpackage.aolu.a ? defpackage.aojh.a : objA2;
            case 5:
                if (aolnVar instanceof defpackage.uni) {
                    uniVar = (defpackage.uni) aolnVar;
                    int i7 = uniVar.b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        uniVar.b = i7 - Integer.MIN_VALUE;
                    } else {
                        uniVar = new defpackage.uni(this, aolnVar);
                    }
                } else {
                    uniVar = new defpackage.uni(this, aolnVar);
                }
                java.lang.Object obj35 = uniVar.a;
                defpackage.aolu aoluVar4 = defpackage.aolu.a;
                int i8 = uniVar.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        java.lang.Object obj36 = uniVar.c;
                        defpackage.aooc.af(obj35);
                        r12 = obj36;
                    } else {
                        if (i8 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(obj35);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj35);
                java.lang.Object obj37 = this.a;
                java.lang.Object obj38 = this.b;
                uniVar.c = obj37;
                uniVar.b = 1;
                java.lang.Object objN = ((defpackage.gpd) obj38).n(uniVar);
                if (objN == aoluVar4) {
                    return aoluVar4;
                }
                obj35 = objN;
                r12 = obj37;
                uniVar.c = null;
                uniVar.b = 2;
                if (r12.a(obj35, uniVar) == aoluVar4) {
                    return aoluVar4;
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                if (aolnVar instanceof defpackage.aoxu) {
                    aoxuVar = (defpackage.aoxu) aolnVar;
                    int i9 = aoxuVar.b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        aoxuVar.b = i9 - Integer.MIN_VALUE;
                    } else {
                        aoxuVar = new defpackage.aoxu(this, aolnVar);
                    }
                } else {
                    aoxuVar = new defpackage.aoxu(this, aolnVar);
                }
                java.lang.Object obj39 = aoxuVar.a;
                defpackage.aolu aoluVar5 = defpackage.aolu.a;
                int i10 = aoxuVar.b;
                try {
                    if (i10 == 0) {
                        defpackage.aooc.af(obj39);
                        ?? r15 = this.a;
                        aoxuVar.b = 1;
                        java.lang.Object objA3 = r15.a(obj, aoxuVar);
                        this = objA3;
                        if (objA3 == aoluVar5) {
                            return aoluVar5;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(obj39);
                        this = this;
                    }
                    return defpackage.aojh.a;
                } catch (java.lang.Throwable th) {
                    ((defpackage.aoot) this.b).a = th;
                    throw th;
                }
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                if (aolnVar instanceof defpackage.aoya) {
                    aoyaVar = (defpackage.aoya) aolnVar;
                    int i11 = aoyaVar.b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        aoyaVar.b = i11 - Integer.MIN_VALUE;
                    } else {
                        aoyaVar = new defpackage.aoya(this, aolnVar);
                    }
                } else {
                    aoyaVar = new defpackage.aoya(this, aolnVar);
                }
                java.lang.Object objA4 = aoyaVar.a;
                defpackage.aolu aoluVar6 = defpackage.aolu.a;
                int i12 = aoyaVar.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        obj = aoyaVar.c;
                        defpackage.aooc.af(objA4);
                    } else {
                        if (i12 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(objA4);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(objA4);
                ?? r16 = this.b;
                aoyaVar.c = obj;
                aoyaVar.b = 1;
                objA4 = r16.a(obj, aoyaVar);
                if (objA4 == aoluVar6) {
                    return aoluVar6;
                }
                if (!((java.lang.Boolean) objA4).booleanValue()) {
                    throw new defpackage.aozr(this);
                }
                ?? r17 = this.a;
                aoyaVar.c = null;
                aoyaVar.b = 2;
                if (r17.a(obj, aoyaVar) == aoluVar6) {
                    return aoluVar6;
                }
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                if (aolnVar instanceof defpackage.aoyd) {
                    aoydVar = (defpackage.aoyd) aolnVar;
                    int i13 = aoydVar.b;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        aoydVar.b = i13 - Integer.MIN_VALUE;
                    } else {
                        aoydVar = new defpackage.aoyd(this, aolnVar);
                    }
                } else {
                    aoydVar = new defpackage.aoyd(this, aolnVar);
                }
                java.lang.Object objA5 = aoydVar.a;
                defpackage.aolu aoluVar7 = defpackage.aolu.a;
                int i14 = aoydVar.b;
                if (i14 == 0) {
                    defpackage.aooc.af(objA5);
                    ?? r18 = this.b;
                    aoydVar.c = obj;
                    aoydVar.b = 1;
                    objA5 = r18.a(obj, aoydVar);
                    if (objA5 == aoluVar7) {
                        return aoluVar7;
                    }
                } else {
                    if (i14 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = aoydVar.c;
                    defpackage.aooc.af(objA5);
                }
                if (!((java.lang.Boolean) objA5).booleanValue()) {
                    return defpackage.aojh.a;
                }
                ((defpackage.aoot) this.a).a = obj;
                throw new defpackage.aozr(this);
            case 9:
                if (aolnVar instanceof defpackage.aoym) {
                    aoymVar = (defpackage.aoym) aolnVar;
                    int i15 = aoymVar.b;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        aoymVar.b = i15 - Integer.MIN_VALUE;
                    } else {
                        aoymVar = new defpackage.aoym(this, aolnVar);
                    }
                } else {
                    aoymVar = new defpackage.aoym(this, aolnVar);
                }
                java.lang.Object obj40 = aoymVar.a;
                defpackage.aolu aoluVar8 = defpackage.aolu.a;
                int i16 = aoymVar.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        java.lang.Object obj41 = aoymVar.d;
                        obj = aoymVar.c;
                        defpackage.aooc.af(obj40);
                        r13 = obj41;
                    } else {
                        if (i16 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        defpackage.aooc.af(obj40);
                    }
                    return defpackage.aojh.a;
                }
                defpackage.aooc.af(obj40);
                java.lang.Object obj42 = this.a;
                ?? r19 = this.b;
                aoymVar.c = obj;
                aoymVar.d = obj42;
                aoymVar.b = 1;
                if (r19.a(obj, aoymVar) == aoluVar8) {
                    return aoluVar8;
                }
                r13 = obj42;
                aoymVar.c = null;
                aoymVar.d = null;
                aoymVar.b = 2;
                if (r13.a(obj, aoymVar) == aoluVar8) {
                    return aoluVar8;
                }
                return defpackage.aojh.a;
            default:
                defpackage.aoor aoorVar = (defpackage.aoor) this.b;
                int i17 = aoorVar.a;
                aoorVar.a = i17 + 1;
                if (i17 < 0) {
                    throw new java.lang.ArithmeticException("Index overflow has happened");
                }
                java.lang.Object objA6 = this.a.a(new defpackage.aokg(i17, obj), aolnVar);
                return objA6 == defpackage.aolu.a ? objA6 : defpackage.aojh.a;
        }
    }

    public gdb(defpackage.aoxi aoxiVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aoxiVar;
        this.b = obj;
    }
}
