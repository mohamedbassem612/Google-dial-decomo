package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ite extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ java.lang.Object e;
    final /* synthetic */ java.lang.Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ite(itf itfVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = itfVar;
        this.f = list;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v21, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v13, types: [abwo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object obj2;
        ?? r3;
        java.lang.Object obj3;
        java.lang.Throwable th;
        java.lang.Object obj4;
        java.lang.Object obj5;
        java.lang.Object obj6;
        apdp apdpVar;
        java.lang.Object obj7;
        ?? r4;
        java.lang.Throwable th2;
        java.lang.Object obj8;
        java.lang.Object obj9;
        ?? r0;
        java.lang.Object obj10;
        java.lang.Object obj11;
        java.lang.Object obj12;
        ?? r5;
        java.lang.Throwable th3;
        java.lang.Object obj13;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.d;
            try {
                if (i2 == 0) {
                    aooc.af(obj);
                    obj2 = this.e;
                    java.lang.Object obj14 = this.f;
                    apdp apdpVar2 = ((itf) obj2).e;
                    this.a = apdpVar2;
                    this.b = obj2;
                    this.c = obj14;
                    this.d = 1;
                    if (apdpVar2.b(this) == aoluVar) {
                        return aoluVar;
                    }
                    r3 = obj14;
                    obj3 = apdpVar2;
                } else {
                    if (i2 != 1) {
                        obj4 = this.a;
                        try {
                            aooc.af(obj);
                            obj4 = obj4;
                            java.util.Map map = (java.util.Map) obj;
                            ((apdp) obj4).d();
                            return map;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            ((apdp) obj4).d();
                            throw th;
                        }
                    }
                    java.lang.Object obj15 = this.c;
                    obj2 = this.b;
                    java.lang.Object obj16 = this.a;
                    aooc.af(obj);
                    r3 = obj15;
                    obj3 = obj16;
                }
                abwo abwoVar = ((itf) obj2).d;
                this.a = obj3;
                this.b = null;
                this.c = null;
                this.d = 2;
                obj = abwoVar.c((java.util.Set) r3, this);
                if (obj == aoluVar) {
                    return aoluVar;
                }
                obj4 = obj3;
                java.util.Map map2 = (java.util.Map) obj;
                ((apdp) obj4).d();
                return map2;
            } catch (java.lang.Throwable th5) {
                th = th5;
                obj4 = obj3;
                ((apdp) obj4).d();
                throw th;
            }
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.d;
            try {
                if (i3 == 0) {
                    aooc.af(obj);
                    obj5 = this.e;
                    obj6 = this.f;
                    apdpVar = ((itf) obj5).e;
                    this.a = apdpVar;
                    this.b = obj5;
                    this.c = obj6;
                    this.d = 1;
                    if (apdpVar.b(this) == aoluVar2) {
                        r4 = obj6;
                        obj7 = apdpVar;
                        return aoluVar2;
                    }
                } else {
                    if (i3 != 1) {
                        obj8 = this.a;
                        try {
                            aooc.af(obj);
                            obj8 = obj8;
                            ahbq ahbqVar = (ahbq) obj;
                            ((apdp) obj8).d();
                            return java.lang.Boolean.valueOf(ahbqVar != null);
                        } catch (java.lang.Throwable th6) {
                            th2 = th6;
                            ((apdp) obj8).d();
                            throw th2;
                        }
                    }
                    java.lang.Object obj17 = this.c;
                    obj5 = this.b;
                    java.lang.Object obj18 = this.a;
                    aooc.af(obj);
                    obj7 = obj18;
                    r4 = obj17;
                }
                r4 = obj6;
                obj7 = apdpVar;
                abwo abwoVar2 = ((itf) obj5).d;
                kdu kduVar = ((itf) obj5).f;
                this.a = obj7;
                this.b = null;
                this.c = null;
                this.d = 2;
                java.lang.Object objJ = aazc.j(abwoVar2, (java.util.List) r4, kduVar, this);
                if (objJ == aoluVar2) {
                    return aoluVar2;
                }
                java.lang.Object obj19 = obj7;
                obj = objJ;
                obj8 = obj19;
                ahbq ahbqVar2 = (ahbq) obj;
                ((apdp) obj8).d();
                return java.lang.Boolean.valueOf(ahbqVar2 != null);
            } catch (java.lang.Throwable th7) {
                java.lang.Object obj20 = obj7;
                th2 = th7;
                obj8 = obj20;
                ((apdp) obj8).d();
                throw th2;
            }
        }
        if (i == 2) {
            aolu aoluVar3 = aolu.a;
            if (this.d != 0) {
                java.lang.Object obj21 = this.c;
                obj9 = this.b;
                obj10 = this.a;
                aooc.af(obj);
                r0 = obj21;
            } else {
                aooc.af(obj);
                obj9 = this.e;
                java.lang.Object obj22 = this.f;
                apdp apdpVar3 = ((kal) obj9).g;
                this.a = apdpVar3;
                this.b = obj9;
                this.c = obj22;
                this.d = 1;
                if (apdpVar3.b(this) == aoluVar3) {
                    return aoluVar3;
                }
                r0 = obj22;
                obj10 = apdpVar3;
            }
            try {
                return java.lang.Boolean.valueOf(((kal) obj9).e.removeAll(r0));
            } finally {
                ((apdp) obj10).d();
            }
        }
        aolu aoluVar4 = aolu.a;
        int i4 = this.d;
        try {
            if (i4 == 0) {
                aooc.af(obj);
                java.lang.Object obj23 = this.e;
                java.lang.Object obj24 = this.f;
                obj11 = ((tkl) obj23).a;
                this.a = obj11;
                this.b = obj24;
                this.c = obj23;
                this.d = 1;
                if (((apdp) obj11).b(this) == aoluVar4) {
                    return aoluVar4;
                }
                obj12 = obj23;
                r5 = obj24;
            } else {
                if (i4 != 1) {
                    obj13 = this.a;
                    try {
                        aooc.af(obj);
                        ahbq ahbqVar3 = (ahbq) obj;
                        ((apdp) obj13).d();
                        return ahbqVar3;
                    } catch (java.lang.Throwable th8) {
                        th3 = th8;
                        ((apdp) obj13).d();
                        throw th3;
                    }
                }
                obj12 = this.c;
                java.lang.Object obj25 = this.b;
                obj11 = this.a;
                aooc.af(obj);
                r5 = obj25;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl((java.lang.Iterable) r5, 10));
            for (kid kidVar : r5) {
                arrayList.add(new afpl(kidVar.a, new defpackage.jrb(kidVar, (aoln) null, 7), (char[]) null));
            }
            ?? r6 = ((tkl) obj12).b;
            this.a = obj11;
            this.b = null;
            this.c = null;
            this.d = 2;
            obj = aazc.j((abwo) r6, arrayList, (abwn) null, this);
            if (obj == aoluVar4) {
                return aoluVar4;
            }
            obj13 = obj11;
            ahbq ahbqVar4 = (ahbq) obj;
            ((apdp) obj13).d();
            return ahbqVar4;
        } catch (java.lang.Throwable th9) {
            th3 = th9;
            obj13 = obj11;
            ((apdp) obj13).d();
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.ite((itf) this.e, (java.util.Set) this.f, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.ite((itf) this.e, (java.util.List) this.f, aolnVar, 1);
        }
        java.lang.Object obj2 = this.e;
        if (i != 2) {
            return new defpackage.ite((tkl) obj2, (java.util.List) this.f, aolnVar, 3);
        }
        return new defpackage.ite((kal) obj2, (java.util.List) this.f, aolnVar, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ite(itf itfVar, java.util.Set set, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = itfVar;
        this.f = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ite(kal kalVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = kalVar;
        this.f = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ite(tkl tklVar, java.util.List list, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.e = tklVar;
        this.f = list;
    }
}
