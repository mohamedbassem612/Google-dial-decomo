package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvw extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ float b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(abgq abgqVar, float f, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = abgqVar;
        this.b = f;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 3) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d0  */
    public final java.lang.Object b(java.lang.Object obj) {
        defpackage.bvw bvwVar;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 != 0) {
            } else {
                defpackage.bvx bvxVar = (defpackage.bvx) this.c;
                aii aiiVar = bvxVar.d;
                if (aiiVar != null) {
                    java.lang.Float f = new java.lang.Float(this.b);
                    defpackage.aks aksVar = bvxVar.c ? defpackage.bvr.a : bvxVar.b;
                    this.a = 1;
                    obj = aii.l(aiiVar, f, aksVar, (java.lang.Object) null, (aonj) null, this, 12);
                    if (obj == aoluVar) {
                        return aoluVar;
                    }
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 != 0) {
            } else {
                defpackage.bvx bvxVar2 = (defpackage.bvx) this.c;
                aii aiiVar2 = bvxVar2.e;
                if (aiiVar2 != null) {
                    java.lang.Float f2 = new java.lang.Float(this.b);
                    defpackage.aks aksVar2 = bvxVar2.c ? defpackage.bvr.a : bvxVar2.b;
                    this.a = 1;
                    obj = aii.l(aiiVar2, f2, aksVar2, (java.lang.Object) null, (aonj) null, this, 12);
                    if (obj == aoluVar2) {
                        return aoluVar2;
                    }
                }
            }
            return aojh.a;
        }
        if (i == 2) {
            defpackage.bvw bvwVar2 = this;
            aolu aoluVar3 = aolu.a;
            int i4 = bvwVar2.a;
            aooc.af(obj);
            if (i4 == 0) {
                java.lang.Object obj2 = bvwVar2.c;
                aii aiiVar3 = ((defpackage.byf) obj2).p;
                if (aiiVar3 != null) {
                    float f3 = bvwVar2.b;
                    java.lang.Float f4 = new java.lang.Float(f3);
                    aiq aiqVar = ((java.lang.Number) aiiVar3.d()).floatValue() < f3 ? defpackage.bws.a : defpackage.bws.b;
                    defpackage.bru bruVar = new defpackage.bru(obj2, 17);
                    bvwVar2.a = 1;
                    java.lang.Object objL = aii.l(aiiVar3, f4, aiqVar, (java.lang.Object) null, bruVar, bvwVar2, 4);
                    bvwVar2 = bvwVar2;
                    if (objL == aoluVar3) {
                        return aoluVar3;
                    }
                    if (bvwVar2.b == 0.0f) {
                        ((defpackage.bxn) bvwVar2.c).f();
                    }
                }
            } else if (bvwVar2.b == 0.0f) {
                ((defpackage.bxn) bvwVar2.c).f();
            }
            return aojh.a;
        }
        if (i == 3) {
            aolu aoluVar4 = aolu.a;
            int i5 = this.a;
            aooc.af(obj);
            if (i5 == 0) {
                java.lang.Object obj3 = this.c;
                java.lang.Float f5 = new java.lang.Float(this.b);
                this.a = 1;
                if (((abgq) obj3).n.f(f5, this) == aoluVar4) {
                    return aoluVar4;
                }
            }
            return aojh.a;
        }
        aolu aoluVar5 = aolu.a;
        int i6 = this.a;
        aooc.af(obj);
        if (i6 != 0) {
            if (i6 != 1) {
                bvwVar = this;
            }
            ((agii) bvwVar.c).c((java.lang.Integer) null);
            return aojh.a;
        }
        java.lang.Object obj4 = this.c;
        java.lang.Float f6 = new java.lang.Float(this.b);
        this.a = 1;
        if (((aii) ((agii) obj4).e).f(f6, this) == aoluVar5) {
            return aoluVar5;
        }
        java.lang.Object obj5 = this.c;
        java.lang.Float f7 = new java.lang.Float(0.0f);
        aku akuVar = new aku(1.0f, 700.0f, new java.lang.Float(1.0f));
        this.a = 2;
        java.lang.Object objL2 = aii.l((aii) ((agii) obj5).e, f7, akuVar, (java.lang.Object) null, (aonj) null, this, 12);
        bvwVar = this;
        if (objL2 == aoluVar5) {
            return aoluVar5;
        }
        ((agii) bvwVar.c).c((java.lang.Integer) null);
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.bvw((defpackage.bvx) this.c, this.b, aolnVar, 0);
        }
        if (i == 1) {
            return new defpackage.bvw((defpackage.bvx) this.c, this.b, aolnVar, 1, null);
        }
        if (i == 2) {
            return new defpackage.bvw((defpackage.byf) this.c, this.b, aolnVar, 2);
        }
        java.lang.Object obj2 = this.c;
        if (i != 3) {
            return new defpackage.bvw((agii) obj2, this.b, aolnVar, 4);
        }
        return new defpackage.bvw((abgq) obj2, this.b, aolnVar, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(agii agiiVar, float f, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = agiiVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(defpackage.bvx bvxVar, float f, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = bvxVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(defpackage.bvx bvxVar, float f, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = bvxVar;
        this.b = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvw(defpackage.byf byfVar, float f, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = byfVar;
        this.b = f;
    }
}
