package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edb extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    java.lang.Object d;
    java.lang.Object e;
    java.lang.Object f;
    int g;
    int h;
    final /* synthetic */ defpackage.eei i;
    final /* synthetic */ defpackage.aonn j;
    final /* synthetic */ defpackage.eez k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edb(defpackage.eei eeiVar, defpackage.aonn aonnVar, defpackage.eez eezVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.i = eeiVar;
        this.j = aonnVar;
        this.k = eezVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edb(this.i, this.j, this.k, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:32:0x010d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:17:0x009e->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.Iterator] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        defpackage.aoot aootVar;
        java.lang.Object obj4;
        defpackage.eda edaVar;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        ?? it;
        defpackage.aonn aonnVar;
        java.lang.Object obj8;
        int iHashCode;
        java.lang.Object objBo;
        int i;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == 1) {
                aootVar = (defpackage.aoot) this.d;
                java.lang.Object obj9 = this.c;
                java.lang.Object obj10 = this.b;
                java.lang.Object obj11 = this.a;
                defpackage.aooc.af(obj);
                obj2 = obj11;
                obj3 = obj10;
                obj4 = obj9;
            } else if (i2 == 2) {
                java.lang.Object obj12 = this.f;
                edaVar = (defpackage.eda) this.d;
                obj4 = this.c;
                obj3 = this.b;
                obj2 = this.a;
                defpackage.aooc.af(obj);
                it = obj12;
                while (it.hasNext()) {
                    aonnVar = (defpackage.aonn) it.next();
                    this.a = obj2;
                    this.b = obj3;
                    this.c = obj4;
                    this.d = edaVar;
                    this.e = null;
                    this.f = it;
                    this.h = 2;
                    if (aonnVar.a(edaVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                obj5 = obj3;
                obj6 = obj2;
                this.k.b = null;
                this.a = null;
                this.b = obj5;
                this.c = obj4;
                this.d = null;
                this.e = obj6;
                this.f = null;
                this.h = 3;
                if (((defpackage.apdp) obj6).b(this) != aoluVar) {
                    return aoluVar;
                }
                obj7 = obj4;
                ((defpackage.aoop) obj5).a = true;
                ((defpackage.apdp) obj6).d();
                obj8 = ((defpackage.aoot) obj7).a;
                if (obj8 != null) {
                    iHashCode = obj8.hashCode();
                } else {
                    iHashCode = 0;
                }
                defpackage.aogc aogcVarO = this.i.o();
                this.a = null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = obj8;
                this.g = iHashCode;
                this.h = 4;
                objBo = aogcVarO.bo();
                if (objBo == aoluVar) {
                    return aoluVar;
                }
                i = iHashCode;
                obj = objBo;
            } else if (i2 != 3) {
                i = this.g;
                obj8 = this.e;
                defpackage.aooc.af(obj);
            } else {
                obj6 = (defpackage.apdp) this.e;
                obj7 = this.c;
                obj5 = this.b;
                defpackage.aooc.af(obj);
                try {
                    ((defpackage.aoop) obj5).a = true;
                    ((defpackage.apdp) obj6).d();
                    obj8 = ((defpackage.aoot) obj7).a;
                    if (obj8 != null) {
                        iHashCode = obj8.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    defpackage.aogc aogcVarO2 = this.i.o();
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = obj8;
                    this.g = iHashCode;
                    this.h = 4;
                    objBo = aogcVarO2.bo();
                    if (objBo == aoluVar) {
                        return aoluVar;
                    }
                    i = iHashCode;
                    obj = objBo;
                } catch (java.lang.Throwable th) {
                    ((defpackage.apdp) obj6).d();
                    throw th;
                }
            }
            return new defpackage.ecr(obj8, i, ((java.lang.Number) obj).intValue());
        }
        defpackage.aooc.af(obj);
        defpackage.apdp apdpVar = new defpackage.apdp();
        defpackage.aoop aoopVar = new defpackage.aoop();
        defpackage.aoot aootVar2 = new defpackage.aoot();
        defpackage.eei eeiVar = this.i;
        defpackage.aonn aonnVar2 = this.j;
        this.a = apdpVar;
        this.b = aoopVar;
        this.c = aootVar2;
        this.d = aootVar2;
        this.h = 1;
        java.lang.Object objH = eeiVar.h(true, aonnVar2, this);
        if (objH == aoluVar) {
            return aoluVar;
        }
        obj2 = apdpVar;
        obj3 = aoopVar;
        aootVar = aootVar2;
        obj = objH;
        obj4 = aootVar;
        aootVar.a = ((defpackage.ecr) obj).a;
        edaVar = new defpackage.eda((defpackage.apdp) obj2, (defpackage.aoop) obj3, (defpackage.aoot) obj4, this.i);
        java.util.List list = this.k.b;
        if (list != null) {
            it = list.iterator();
            while (it.hasNext()) {
                aonnVar = (defpackage.aonn) it.next();
                this.a = obj2;
                this.b = obj3;
                this.c = obj4;
                this.d = edaVar;
                this.e = null;
                this.f = it;
                this.h = 2;
                if (aonnVar.a(edaVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
        }
        obj5 = obj3;
        obj6 = obj2;
        this.k.b = null;
        this.a = null;
        this.b = obj5;
        this.c = obj4;
        this.d = null;
        this.e = obj6;
        this.f = null;
        this.h = 3;
        if (((defpackage.apdp) obj6).b(this) != aoluVar) {
            return aoluVar;
        }
        obj7 = obj4;
        ((defpackage.aoop) obj5).a = true;
        ((defpackage.apdp) obj6).d();
        obj8 = ((defpackage.aoot) obj7).a;
        if (obj8 != null) {
            iHashCode = obj8.hashCode();
        } else {
            iHashCode = 0;
        }
        defpackage.aogc aogcVarO3 = this.i.o();
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = obj8;
        this.g = iHashCode;
        this.h = 4;
        objBo = aogcVarO3.bo();
        if (objBo == aoluVar) {
            return aoluVar;
        }
        i = iHashCode;
        obj = objBo;
        return new defpackage.ecr(obj8, i, ((java.lang.Number) obj).intValue());
    }
}
