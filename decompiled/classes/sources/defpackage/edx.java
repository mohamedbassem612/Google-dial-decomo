package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class edx extends defpackage.aomh implements defpackage.aonj {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    final /* synthetic */ boolean f;
    final /* synthetic */ defpackage.eei g;
    final /* synthetic */ defpackage.aonn h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edx(boolean z, defpackage.eei eeiVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        super(1, aolnVar);
        this.f = z;
        this.g = eeiVar;
        this.h = aonnVar;
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        return new defpackage.edx(this.f, this.g, this.h, (defpackage.aoln) obj).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: ecp -> 0x00a8, TryCatch #1 {ecp -> 0x00a8, blocks: (B:15:0x003a, B:35:0x00a4, B:18:0x0044, B:32:0x0084, B:19:0x004a, B:27:0x0063, B:29:0x0069, B:22:0x0053, B:24:0x0059, B:33:0x0091), top: B:59:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objA;
        defpackage.aoot aootVar;
        java.lang.Object obj2;
        defpackage.aoot aootVar2;
        java.lang.Object obj3;
        defpackage.aoot aootVar3;
        defpackage.aoor aoorVar;
        java.lang.Object objBn;
        java.lang.Object objG;
        int iHashCode;
        java.lang.Object objA2;
        java.lang.Object obj4;
        int i;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = this.e;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                boolean z = this.f;
                defpackage.eei eeiVar = this.g;
                if (!z) {
                    defpackage.aogc aogcVarO = eeiVar.o();
                    edv edvVar = new edv(eeiVar, this.h, (defpackage.aoln) null);
                    this.e = 3;
                    objBn = aogcVarO.bn(edvVar, this);
                    if (objBn == aoluVar) {
                        return aoluVar;
                    }
                    return (defpackage.ecr) objBn;
                }
                this.e = 1;
                objG = eeiVar.g(this);
                if (objG == aoluVar) {
                    return aoluVar;
                }
                if (objG != null) {
                    iHashCode = objG.hashCode();
                } else {
                    iHashCode = 0;
                }
                defpackage.aonn aonnVar = this.h;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(this.f);
                this.a = null;
                this.b = objG;
                this.d = iHashCode;
                this.e = 2;
                objA2 = aonnVar.a(boolValueOf, this);
                if (objA2 != aoluVar) {
                    return aoluVar;
                }
                int i3 = iHashCode;
                obj4 = objG;
                i = i3;
            } else if (i2 == 1) {
                defpackage.aooc.af(obj);
                objG = obj;
                if (objG != null) {
                    iHashCode = objG.hashCode();
                } else {
                    iHashCode = 0;
                }
                defpackage.aonn aonnVar2 = this.h;
                java.lang.Boolean boolValueOf2 = java.lang.Boolean.valueOf(this.f);
                this.a = null;
                this.b = objG;
                this.d = iHashCode;
                this.e = 2;
                objA2 = aonnVar2.a(boolValueOf2, this);
                if (objA2 != aoluVar) {
                    return aoluVar;
                }
                int i4 = iHashCode;
                obj4 = objG;
                i = i4;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        defpackage.aooc.af(obj);
                        objBn = obj;
                        return (defpackage.ecr) objBn;
                    }
                    java.lang.Object obj5 = this.c;
                    if (i2 != 4) {
                        aoorVar = (defpackage.aoor) obj5;
                        aootVar3 = (defpackage.aoot) this.b;
                        obj3 = this.a;
                        try {
                            defpackage.aooc.af(obj);
                            java.lang.Object obj6 = aootVar3.a;
                            return new defpackage.ecr(obj6, obj6 != null ? obj6.hashCode() : 0, aoorVar.a);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            java.lang.Throwable th2 = (java.lang.Throwable) obj3;
                            aoil.b(th2, th);
                            throw th2;
                        }
                    }
                    defpackage.aoot aootVar4 = (defpackage.aoot) this.b;
                    java.lang.Object obj7 = this.a;
                    defpackage.aooc.af(obj);
                    aootVar = aootVar4;
                    aootVar2 = (defpackage.aoot) obj5;
                    obj2 = obj7;
                    objA = obj;
                    aootVar2.a = objA;
                    defpackage.aoor aoorVar2 = new defpackage.aoor();
                    try {
                        defpackage.eei eeiVar2 = this.g;
                        boolean z2 = this.f;
                        edw edwVar = new edw(aootVar, eeiVar2, aoorVar2, this.h, z2, (defpackage.aoln) null);
                        this.a = obj2;
                        this.b = aootVar;
                        this.c = aoorVar2;
                        this.e = 5;
                        if ((z2 ? edwVar.a(this) : eeiVar2.o().bm(new blq(edwVar, (defpackage.aoln) null, 5, (char[]) null), this)) == aoluVar) {
                            return aoluVar;
                        }
                        aootVar3 = aootVar;
                        aoorVar = aoorVar2;
                        java.lang.Object obj8 = aootVar3.a;
                        return new defpackage.ecr(obj8, obj8 != null ? obj8.hashCode() : 0, aoorVar.a);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        obj3 = obj2;
                        java.lang.Throwable th4 = (java.lang.Throwable) obj3;
                        aoil.b(th4, th);
                        throw th4;
                    }
                }
                i = this.d;
                obj4 = this.b;
                defpackage.aooc.af(obj);
                objA2 = obj;
            }
            return new defpackage.ecr(obj4, i, ((java.lang.Number) objA2).intValue());
        } catch (defpackage.ecp e) {
            defpackage.aoot aootVar5 = new defpackage.aoot();
            defpackage.eei eeiVar3 = this.g;
            this.a = e;
            this.b = aootVar5;
            this.c = aootVar5;
            this.e = 4;
            objA = eeiVar3.b.a(e);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aootVar = aootVar5;
            obj2 = e;
            aootVar2 = aootVar;
        }
    }
}
