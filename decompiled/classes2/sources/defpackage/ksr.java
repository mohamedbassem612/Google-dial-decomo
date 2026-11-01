package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksr {
    private static final java.util.List a;
    private static final java.util.Map b;
    private final zlr c;
    private final zoe d;

    static {
        java.util.List list = defpackage.kss.a;
        java.util.List list2 = defpackage.kss.a;
        a = list2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(list2, 10)), 16));
        for (java.lang.Object obj : list2) {
            linkedHashMap.put(((defpackage.ksp) obj).a, obj);
        }
        b = linkedHashMap;
    }

    public ksr(zlr zlrVar, zoe zoeVar) {
        this.c = zlrVar;
        this.d = zoeVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.lang.String str, aoln aolnVar) {
        defpackage.ksq ksqVar;
        java.lang.String str2;
        akfg akfgVar;
        java.lang.String str3;
        if (aolnVar instanceof defpackage.ksq) {
            ksqVar = (defpackage.ksq) aolnVar;
            int i = ksqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ksqVar.c = i - Integer.MIN_VALUE;
            } else {
                ksqVar = new defpackage.ksq(this, aolnVar);
            }
        } else {
            ksqVar = new defpackage.ksq(this, aolnVar);
        }
        java.lang.Object objW = ksqVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ksqVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                str = ksqVar.d;
                aooc.af(objW);
            } else {
                if (i2 == 2) {
                    akfgVar = ksqVar.e;
                    str2 = ksqVar.d;
                    aooc.af(objW);
                    str3 = (java.lang.String) objW;
                    if (str3 == null) {
                        zlr zlrVar = this.c;
                        java.lang.String strValueOf = java.lang.String.valueOf(str2);
                        aooh.c(akfgVar);
                        ksqVar.d = null;
                        ksqVar.e = null;
                        ksqVar.c = 3;
                        objW = zlrVar.b("+".concat(strValueOf), akfgVar, ksqVar);
                        if (objW == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return b.get(str3);
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(objW);
            }
            str3 = (java.lang.String) objW;
            if (str3 == null) {
                return null;
            }
            return b.get(str3);
        }
        aooc.af(objW);
        zoe zoeVar = this.d;
        ksqVar.d = str;
        ksqVar.c = 1;
        objW = zoeVar.w(ksqVar);
        if (objW == aoluVar) {
            return aoluVar;
        }
        akfg akfgVarB = akfg.b((java.lang.String) objW);
        zlr zlrVar2 = this.c;
        ksqVar.d = str;
        ksqVar.e = akfgVarB;
        ksqVar.c = 2;
        java.lang.Object objB = zlrVar2.b(str, akfgVarB, ksqVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        str2 = str;
        akfgVar = akfgVarB;
        objW = objB;
        str3 = (java.lang.String) objW;
        if (str3 == null) {
            zlr zlrVar3 = this.c;
            java.lang.String strValueOf2 = java.lang.String.valueOf(str2);
            aooh.c(akfgVar);
            ksqVar.d = null;
            ksqVar.e = null;
            ksqVar.c = 3;
            objW = zlrVar3.b("+".concat(strValueOf2), akfgVar, ksqVar);
            if (objW == aoluVar) {
                return aoluVar;
            }
            str3 = (java.lang.String) objW;
            if (str3 == null) {
                return null;
            }
        }
        return b.get(str3);
    }
}
