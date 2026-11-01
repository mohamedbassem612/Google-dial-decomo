package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tgo implements aoxi {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;

    public tgo(aoot aootVar, aono aonoVar, aoxi aoxiVar, int i) {
        this.$cid = i;
        this.b = aootVar;
        this.c = aonoVar;
        this.a = aoxiVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Type inference failed for: r0v16, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v11, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tel] */
    /* JADX WARN: Type inference failed for: r6v10, types: [aono, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aoss, java.lang.Object] */
    public final java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        apn apnVar;
        defpackage.aoyn aoynVar;
        java.lang.Object obj2;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object objA = this.a.a(new defpackage.tgh(this.b.b(), (snl) obj, (defpackage.tei) this.c), aolnVar);
            return objA != aolu.a ? aojh.a : objA;
        }
        if (i == 1) {
            if (aolnVar instanceof apn) {
                apnVar = (apn) aolnVar;
                int i2 = apnVar.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    apnVar.e = i2 - Integer.MIN_VALUE;
                } else {
                    apnVar = new apn(this, aolnVar);
                }
            } else {
                apnVar = new apn(this, aolnVar);
            }
            java.lang.Object obj3 = apnVar.d;
            aolu aoluVar = aolu.a;
            int i3 = apnVar.e;
            if (i3 == 0) {
                aooc.af(obj3);
                aoub aoubVar = (aoub) ((aoot) this.b).a;
                if (aoubVar != null) {
                    aoubVar.s(new aph());
                    apnVar.a = obj;
                    apnVar.b = aoubVar;
                    apnVar.c = null;
                    apnVar.e = 1;
                    if (aoubVar.n(apnVar) == aoluVar) {
                        return aoluVar;
                    }
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                java.lang.Object obj4 = apnVar.c;
                java.lang.Object obj5 = apnVar.b;
                obj = apnVar.a;
                aooc.af(obj3);
            }
            java.lang.Object obj6 = obj;
            java.lang.Object obj7 = this.b;
            ?? r9 = this.a;
            ((aoot) obj7).a = aoov.an((aoss) r9, (aolr) null, 4, new amh((aonn) this.c, obj6, (aoss) r9, (aoln) null, 5), 1);
            return aojh.a;
        }
        if (i == 2) {
            java.lang.Long l = (java.lang.Long) obj;
            java.lang.Object objA2 = this.a.a(java.lang.Boolean.valueOf((boolean) ((((l != null ? l.longValue() : -1L) > ((zth) this.c).e((defpackage.yse) this.b).b() ? 1 : ((l != null ? l.longValue() : -1L) == ((zth) this.c).e((defpackage.yse) this.b).b() ? 0 : -1)) ^ (-1)) >>> 31)), aolnVar);
            return objA2 != aolu.a ? aojh.a : objA2;
        }
        if (i == 3) {
            java.lang.Long l2 = (java.lang.Long) obj;
            java.lang.Object objA3 = this.a.a(java.lang.Boolean.valueOf((boolean) ((((l2 != null ? l2.longValue() : -1L) > ((zth) this.c).e((defpackage.yse) this.b).c() ? 1 : ((l2 != null ? l2.longValue() : -1L) == ((zth) this.c).e((defpackage.yse) this.b).c() ? 0 : -1)) ^ (-1)) >>> 31)), aolnVar);
            return objA3 != aolu.a ? aojh.a : objA3;
        }
        if (i == 4) {
            aoot aootVar = (aoot) this.c;
            aozj aozjVar = (aozj) aootVar.a;
            if (aozjVar != null) {
                aozjVar.e(obj);
            } else {
                ?? r0 = this.a;
                java.lang.Object obj8 = this.b;
                aozj aozjVarA = aozk.a(obj);
                ((aoul) obj8).Q(new aoiw(new aoys(aozjVarA, aooc.V(r0.c()))));
                aootVar.a = aozjVarA;
            }
            return aojh.a;
        }
        if (aolnVar instanceof defpackage.aoyn) {
            aoynVar = (defpackage.aoyn) aolnVar;
            int i4 = aoynVar.b;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aoynVar.b = i4 - Integer.MIN_VALUE;
            } else {
                aoynVar = new defpackage.aoyn(this, aolnVar);
            }
        } else {
            aoynVar = new defpackage.aoyn(this, aolnVar);
        }
        java.lang.Object obj9 = aoynVar.a;
        aolu aoluVar2 = aolu.a;
        int i5 = aoynVar.b;
        if (i5 != 0) {
            if (i5 == 1) {
                obj2 = aoynVar.c;
                aooc.af(obj9);
            } else {
                if (i5 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aooc.af(obj9);
            }
            return aojh.a;
        }
        aooc.af(obj9);
        java.lang.Object obj10 = this.b;
        aoot aootVar2 = (aoot) obj10;
        java.lang.Object obj11 = aootVar2.a;
        if (obj11 != apam.a) {
            ?? r6 = this.c;
            aoynVar.c = aootVar2;
            aoynVar.b = 1;
            obj = r6.a(obj11, obj, aoynVar);
            if (obj == aoluVar2) {
                return aoluVar2;
            }
        }
        obj9 = obj;
        obj2 = obj10;
        ((aoot) obj2).a = obj9;
        ?? r14 = this.a;
        java.lang.Object obj12 = ((aoot) this.b).a;
        aoynVar.c = null;
        aoynVar.b = 2;
        if (r14.a(obj12, aoynVar) == aoluVar2) {
            return aoluVar2;
        }
        return aojh.a;
    }

    public tgo(aoot aootVar, aoss aossVar, aonn aonnVar, int i) {
        this.$cid = i;
        this.b = aootVar;
        this.a = aossVar;
        this.c = aonnVar;
    }

    public tgo(aoot aootVar, aoss aossVar, aosi aosiVar, int i) {
        this.$cid = i;
        this.c = aootVar;
        this.a = aossVar;
        this.b = aosiVar;
    }

    public tgo(aoxi aoxiVar, defpackage.tel telVar, defpackage.tei teiVar, int i) {
        this.$cid = i;
        this.a = aoxiVar;
        this.b = telVar;
        this.c = teiVar;
    }

    public tgo(aoxi aoxiVar, zth zthVar, defpackage.yse yseVar, int i) {
        this.$cid = i;
        this.a = aoxiVar;
        this.c = zthVar;
        this.b = yseVar;
    }
}
