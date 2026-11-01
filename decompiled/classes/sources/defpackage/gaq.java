package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gaq extends defpackage.aomh implements defpackage.aono {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    /* synthetic */ java.lang.Object e;
    /* synthetic */ java.lang.Object f;
    final /* synthetic */ defpackage.gat g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaq(defpackage.gat gatVar, defpackage.aoln aolnVar) {
        super(3, aolnVar);
        this.g = gatVar;
    }

    @Override // defpackage.aono
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        defpackage.gaq gaqVar = new defpackage.gaq(this.g, (defpackage.aoln) obj3);
        gaqVar.e = (defpackage.aogc) obj;
        gaqVar.f = (defpackage.gaj) obj2;
        return gaqVar.b(defpackage.aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0107  */
    /* JADX WARN: Code duplicated, block: B:45:0x0125  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0190  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce A[LOOP:0: B:68:0x01c8->B:70:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0206  */
    /* JADX WARN: Instruction removed from duplicated block: B:66:0x0190, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v34, types: [aoub, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [aoxh, java.lang.Object] */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        defpackage.gcp gcpVar;
        java.lang.Object aootVar;
        java.lang.Object objB;
        java.lang.Object obj3;
        java.lang.Object obj4;
        defpackage.aoot aootVar2;
        gao gaoVar;
        java.lang.Object objA;
        defpackage.aoiu aoiuVar;
        java.lang.Object obj5;
        java.lang.Object obj6;
        java.lang.Object obj7;
        java.lang.Object obj8;
        java.lang.Object obj9;
        java.lang.Integer num;
        java.lang.Object obj10;
        java.util.List list;
        java.util.Iterator it;
        int size;
        java.lang.Object objA2 = obj;
        java.lang.Object obj11 = this.e;
        java.lang.Object obj12 = this.f;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i = this.d;
        if (i == 0) {
            defpackage.aooc.af(objA2);
            if (obj12 instanceof defpackage.gaj) {
                boolean z = ((defpackage.gaj) obj12).b;
                defpackage.gat gatVar = this.g;
                if (obj11 == null) {
                    this.e = null;
                    this.f = null;
                    this.a = null;
                    this.d = 1;
                    objA2 = gatVar.a(null, this);
                    if (objA2 != aoluVar) {
                        obj2 = null;
                        defpackage.gat gatVar2 = this.g;
                        defpackage.gcp gcpVar2 = (defpackage.gcp) objA2;
                        defpackage.gap gapVar = new defpackage.gap(gatVar2, 1);
                        ?? r6 = ((defpackage.enr) gatVar2.d).b;
                        defpackage.gbr gbrVar = (defpackage.gbr) gatVar2.b;
                        return new defpackage.aogc((java.lang.Object) new defpackage.gbl(obj2, gcpVar2, gbrVar, r6, gbrVar.d, gapVar), (java.lang.Object) null, (java.lang.Object) new defpackage.aoud(null), (char[]) null);
                    }
                } else {
                    this.e = obj11;
                    this.f = obj12;
                    this.d = 2;
                    objA2 = gatVar.a(((defpackage.gbl) ((defpackage.aogc) obj11).a).a, this);
                    if (objA2 != aoluVar) {
                        gcpVar = (defpackage.gcp) objA2;
                        aootVar = new defpackage.aoot();
                        this.e = obj11;
                        this.f = obj12;
                        this.a = gcpVar;
                        this.b = aootVar;
                        this.c = aootVar;
                        this.d = 3;
                        objB = ((defpackage.gbl) ((defpackage.aogc) obj11).a).b(this);
                        if (objB != aoluVar) {
                            obj3 = gcpVar;
                            objA2 = objB;
                            obj4 = aootVar;
                            ((defpackage.aoot) obj4).a = objA2;
                            aootVar2 = (defpackage.aoot) aootVar;
                            if (((defpackage.gcq) aootVar2.a).a.isEmpty()) {
                                aootVar2.a = obj10;
                            }
                            if (((defpackage.gcq) aootVar2.a).b == null) {
                                obj9 = ((defpackage.aogc) obj11).b;
                                if (obj9 != null) {
                                    num = ((defpackage.gcq) obj9).b;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    aootVar2.a = obj9;
                                }
                            }
                            gaoVar = ((defpackage.gaj) obj12).c;
                            if (defpackage.aooh.n(gaoVar, defpackage.gam.a)) {
                            }
                            objA = ((defpackage.gcp) obj3).a((defpackage.gcq) aootVar2.a);
                            if (defpackage.dzn.j(3)) {
                                defpackage.dzn.k(3, defpackage.a.bi(obj3, objA, "Refresh key ", " returned from PagingSource "));
                            }
                            aoiuVar = new defpackage.aoiu(objA, new java.lang.Integer(((defpackage.gbr) this.g.b).d));
                            obj5 = aootVar;
                            obj6 = obj3;
                        }
                    }
                }
            } else {
                if (obj11 == null) {
                    throw new java.lang.IllegalArgumentException("Append or Prepend request should be sent after a Refresh. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                }
                defpackage.gac gacVar = ((defpackage.gaj) obj12).a;
                this.e = obj11;
                this.f = null;
                this.d = 6;
                if (((defpackage.gbl) ((defpackage.aogc) obj11).a).e(gacVar, this) != aoluVar) {
                    return obj11;
                }
            }
            return aoluVar;
        }
        if (i == 1) {
            java.lang.Object obj13 = this.a;
            defpackage.aooc.af(objA2);
            obj2 = obj13;
            defpackage.gat gatVar3 = this.g;
            defpackage.gcp gcpVar3 = (defpackage.gcp) objA2;
            defpackage.gap gapVar2 = new defpackage.gap(gatVar3, 1);
            ?? r7 = ((defpackage.enr) gatVar3.d).b;
            defpackage.gbr gbrVar2 = (defpackage.gbr) gatVar3.b;
            return new defpackage.aogc((java.lang.Object) new defpackage.gbl(obj2, gcpVar3, gbrVar2, r7, gbrVar2.d, gapVar2), (java.lang.Object) null, (java.lang.Object) new defpackage.aoud(null), (char[]) null);
        }
        if (i == 2) {
            defpackage.aooc.af(objA2);
            gcpVar = (defpackage.gcp) objA2;
            aootVar = new defpackage.aoot();
            this.e = obj11;
            this.f = obj12;
            this.a = gcpVar;
            this.b = aootVar;
            this.c = aootVar;
            this.d = 3;
            objB = ((defpackage.gbl) ((defpackage.aogc) obj11).a).b(this);
            if (objB != aoluVar) {
                obj3 = gcpVar;
                objA2 = objB;
                obj4 = aootVar;
                ((defpackage.aoot) obj4).a = objA2;
                aootVar2 = (defpackage.aoot) aootVar;
                if (((defpackage.gcq) aootVar2.a).a.isEmpty()) {
                    aootVar2.a = obj10;
                }
                if (((defpackage.gcq) aootVar2.a).b == null) {
                    obj9 = ((defpackage.aogc) obj11).b;
                    if (obj9 != null) {
                        num = ((defpackage.gcq) obj9).b;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        aootVar2.a = obj9;
                    }
                }
                gaoVar = ((defpackage.gaj) obj12).c;
                if (defpackage.aooh.n(gaoVar, defpackage.gam.a)) {
                }
                objA = ((defpackage.gcp) obj3).a((defpackage.gcq) aootVar2.a);
                if (defpackage.dzn.j(3)) {
                    defpackage.dzn.k(3, defpackage.a.bi(obj3, objA, "Refresh key ", " returned from PagingSource "));
                }
                aoiuVar = new defpackage.aoiu(objA, new java.lang.Integer(((defpackage.gbr) this.g.b).d));
                obj5 = aootVar;
                obj6 = obj3;
            }
            return aoluVar;
        }
        if (i == 3) {
            java.lang.Object obj14 = this.c;
            java.lang.Object obj15 = this.b;
            obj3 = this.a;
            defpackage.aooc.af(objA2);
            obj4 = obj14;
            aootVar = obj15;
            ((defpackage.aoot) obj4).a = objA2;
            aootVar2 = (defpackage.aoot) aootVar;
            if (((defpackage.gcq) aootVar2.a).a.isEmpty() && (obj10 = ((defpackage.aogc) obj11).b) != null && (list = ((defpackage.gcq) obj10).a) != null && !list.isEmpty()) {
                aootVar2.a = obj10;
            }
            if (((defpackage.gcq) aootVar2.a).b == null) {
                obj9 = ((defpackage.aogc) obj11).b;
                if (obj9 != null) {
                    num = ((defpackage.gcq) obj9).b;
                } else {
                    num = null;
                }
                if (num != null) {
                    aootVar2.a = obj9;
                }
            }
            gaoVar = ((defpackage.gaj) obj12).c;
            if (defpackage.aooh.n(gaoVar, defpackage.gam.a) && (!((defpackage.gcq) aootVar2.a).a.isEmpty() || ((defpackage.gcq) aootVar2.a).b != null)) {
                if (gaoVar instanceof gao) {
                    throw null;
                }
                if (!defpackage.aooh.n(gaoVar, gal.a)) {
                    throw new java.lang.IllegalStateException("should not get here");
                }
                java.lang.Object obj16 = ((defpackage.aogc) obj11).a;
                defpackage.gco gcoVar = (defpackage.gco) defpackage.ajsz.bE(((defpackage.gcq) aootVar2.a).a);
                this.e = obj11;
                this.f = null;
                this.a = obj3;
                this.b = aootVar;
                this.c = null;
                this.d = 5;
                objA2 = ((defpackage.gbl) obj16).f(gcoVar, this);
                if (objA2 != aoluVar) {
                    obj7 = aootVar;
                    obj8 = obj3;
                    if (defpackage.dzn.j(3)) {
                        defpackage.dzn.k(3, "Refresh key " + objA2 + " from first item " + defpackage.ajsz.bD((java.lang.Iterable) defpackage.ajsz.bE(((defpackage.gcq) ((defpackage.aoot) obj7).a).a)));
                    }
                    it = ((defpackage.gcq) ((defpackage.aoot) obj7).a).a.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        size += ((defpackage.gco) it.next()).a.size();
                    }
                    obj6 = obj8;
                    obj5 = obj7;
                    aoiuVar = new defpackage.aoiu(objA2, new java.lang.Integer(size));
                }
                return aoluVar;
            }
            objA = ((defpackage.gcp) obj3).a((defpackage.gcq) aootVar2.a);
            if (defpackage.dzn.j(3)) {
                defpackage.dzn.k(3, defpackage.a.bi(obj3, objA, "Refresh key ", " returned from PagingSource "));
            }
            aoiuVar = new defpackage.aoiu(objA, new java.lang.Integer(((defpackage.gbr) this.g.b).d));
            obj5 = aootVar;
            obj6 = obj3;
        } else if (i == 4) {
            java.lang.Object obj17 = this.c;
            obj5 = this.b;
            obj6 = this.a;
            defpackage.aooc.af(objA2);
            if (defpackage.dzn.j(3)) {
                defpackage.dzn.k(3, defpackage.a.bi(obj17, objA2, "Refresh key ", " based around item "));
            }
            aoiuVar = new defpackage.aoiu(objA2, new java.lang.Integer(((defpackage.gbr) this.g.b).d));
        } else {
            if (i != 5) {
                defpackage.aooc.af(objA2);
                return obj11;
            }
            obj7 = this.b;
            obj8 = this.a;
            defpackage.aooc.af(objA2);
            if (defpackage.dzn.j(3)) {
                defpackage.dzn.k(3, "Refresh key " + objA2 + " from first item " + defpackage.ajsz.bD((java.lang.Iterable) defpackage.ajsz.bE(((defpackage.gcq) ((defpackage.aoot) obj7).a).a)));
            }
            it = ((defpackage.gcq) ((defpackage.aoot) obj7).a).a.iterator();
            size = 0;
            while (it.hasNext()) {
                size += ((defpackage.gco) it.next()).a.size();
            }
            obj6 = obj8;
            obj5 = obj7;
            aoiuVar = new defpackage.aoiu(objA2, new java.lang.Integer(size));
        }
        int iIntValue = ((java.lang.Number) aoiuVar.b).intValue();
        defpackage.aogc aogcVar = (defpackage.aogc) obj11;
        ((defpackage.gbl) aogcVar.a).i();
        aogcVar.c.s(null);
        defpackage.gat gatVar4 = this.g;
        defpackage.gap gapVar3 = new defpackage.gap(gatVar4, 0);
        defpackage.aoot aootVar3 = (defpackage.aoot) obj5;
        return new defpackage.aogc((java.lang.Object) new defpackage.gbl(aoiuVar.a, (defpackage.gcp) obj6, (defpackage.gbr) gatVar4.b, ((defpackage.enr) gatVar4.d).b, iIntValue, gapVar3), aootVar3.a, (java.lang.Object) new defpackage.aoud(null), (char[]) null);
    }
}
