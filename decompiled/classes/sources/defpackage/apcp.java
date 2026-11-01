package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apcp {
    public static final defpackage.apcm a = new defpackage.apcm("NO_THREAD_ELEMENTS");
    private static final defpackage.aonn b;
    private static final defpackage.aonn c;
    private static final defpackage.aonn d;

    static {
        final int i = 1;
        b = new defpackage.aonn() { // from class: apco
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                int i2 = i;
                if (i2 == 0) {
                    defpackage.aovi aoviVar = (defpackage.aovi) obj;
                    defpackage.aolp aolpVar = (defpackage.aolp) obj2;
                    if (aoviVar != null) {
                        return aoviVar;
                    }
                    if (aolpVar instanceof defpackage.aovi) {
                        return (defpackage.aovi) aolpVar;
                    }
                    return null;
                }
                if (i2 == 1) {
                    defpackage.aolp aolpVar2 = (defpackage.aolp) obj2;
                    if (!(aolpVar2 instanceof defpackage.aovi)) {
                        return obj;
                    }
                    java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? aolpVar2 : java.lang.Integer.valueOf(iIntValue + 1);
                }
                defpackage.apcu apcuVar = (defpackage.apcu) obj;
                defpackage.aolp aolpVar3 = (defpackage.aolp) obj2;
                if (!(aolpVar3 instanceof defpackage.aovi)) {
                    return apcuVar;
                }
                defpackage.aovi aoviVar2 = (defpackage.aovi) aolpVar3;
                java.lang.Object objA = aoviVar2.a(apcuVar.a);
                java.lang.Object[] objArr = apcuVar.b;
                int i3 = apcuVar.d;
                objArr[i3] = objA;
                defpackage.aovi[] aoviVarArr = apcuVar.c;
                apcuVar.d = i3 + 1;
                if (aoviVar2 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
                aoviVarArr[i3] = aoviVar2;
                return apcuVar;
            }
        };
        final int i2 = 0;
        c = new defpackage.aonn() { // from class: apco
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                int i3 = i2;
                if (i3 == 0) {
                    defpackage.aovi aoviVar = (defpackage.aovi) obj;
                    defpackage.aolp aolpVar = (defpackage.aolp) obj2;
                    if (aoviVar != null) {
                        return aoviVar;
                    }
                    if (aolpVar instanceof defpackage.aovi) {
                        return (defpackage.aovi) aolpVar;
                    }
                    return null;
                }
                if (i3 == 1) {
                    defpackage.aolp aolpVar2 = (defpackage.aolp) obj2;
                    if (!(aolpVar2 instanceof defpackage.aovi)) {
                        return obj;
                    }
                    java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? aolpVar2 : java.lang.Integer.valueOf(iIntValue + 1);
                }
                defpackage.apcu apcuVar = (defpackage.apcu) obj;
                defpackage.aolp aolpVar3 = (defpackage.aolp) obj2;
                if (!(aolpVar3 instanceof defpackage.aovi)) {
                    return apcuVar;
                }
                defpackage.aovi aoviVar2 = (defpackage.aovi) aolpVar3;
                java.lang.Object objA = aoviVar2.a(apcuVar.a);
                java.lang.Object[] objArr = apcuVar.b;
                int i4 = apcuVar.d;
                objArr[i4] = objA;
                defpackage.aovi[] aoviVarArr = apcuVar.c;
                apcuVar.d = i4 + 1;
                if (aoviVar2 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
                aoviVarArr[i4] = aoviVar2;
                return apcuVar;
            }
        };
        final int i3 = 2;
        d = new defpackage.aonn() { // from class: apco
            @Override // defpackage.aonn
            public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                int i4 = i3;
                if (i4 == 0) {
                    defpackage.aovi aoviVar = (defpackage.aovi) obj;
                    defpackage.aolp aolpVar = (defpackage.aolp) obj2;
                    if (aoviVar != null) {
                        return aoviVar;
                    }
                    if (aolpVar instanceof defpackage.aovi) {
                        return (defpackage.aovi) aolpVar;
                    }
                    return null;
                }
                if (i4 == 1) {
                    defpackage.aolp aolpVar2 = (defpackage.aolp) obj2;
                    if (!(aolpVar2 instanceof defpackage.aovi)) {
                        return obj;
                    }
                    java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
                    int iIntValue = num != null ? num.intValue() : 1;
                    return iIntValue == 0 ? aolpVar2 : java.lang.Integer.valueOf(iIntValue + 1);
                }
                defpackage.apcu apcuVar = (defpackage.apcu) obj;
                defpackage.aolp aolpVar3 = (defpackage.aolp) obj2;
                if (!(aolpVar3 instanceof defpackage.aovi)) {
                    return apcuVar;
                }
                defpackage.aovi aoviVar2 = (defpackage.aovi) aolpVar3;
                java.lang.Object objA = aoviVar2.a(apcuVar.a);
                java.lang.Object[] objArr = apcuVar.b;
                int i5 = apcuVar.d;
                objArr[i5] = objA;
                defpackage.aovi[] aoviVarArr = apcuVar.c;
                apcuVar.d = i5 + 1;
                if (aoviVar2 == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                }
                aoviVarArr[i5] = aoviVar2;
                return apcuVar;
            }
        };
    }

    public static final java.lang.Object a(defpackage.aolr aolrVar) {
        java.lang.Object objFold = aolrVar.fold(0, b);
        if (objFold == null) {
            defpackage.aooh.g();
        }
        return objFold;
    }

    public static final java.lang.Object b(defpackage.aolr aolrVar, java.lang.Object obj) {
        if (obj == null) {
            obj = a(aolrVar);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof java.lang.Integer) {
            return aolrVar.fold(new defpackage.apcu(aolrVar, ((java.lang.Number) obj).intValue()), d);
        }
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        return ((defpackage.aovi) obj).a(aolrVar);
    }

    public static final void c(defpackage.aolr aolrVar, java.lang.Object obj) {
        if (obj == a) {
            return;
        }
        if (!(obj instanceof defpackage.apcu)) {
            java.lang.Object objFold = aolrVar.fold(null, c);
            if (objFold == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            }
            ((defpackage.aovi) objFold).c(aolrVar, obj);
            return;
        }
        defpackage.apcu apcuVar = (defpackage.apcu) obj;
        defpackage.aovi[] aoviVarArr = apcuVar.c;
        int length = aoviVarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            defpackage.aovi aoviVar = aoviVarArr[length];
            if (aoviVar == null) {
                defpackage.aooh.g();
            }
            aoviVar.c(aolrVar, apcuVar.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
