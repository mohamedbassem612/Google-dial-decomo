package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahgx extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgx(aoln aolnVar, apdp apdpVar, aonn aonnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = apdpVar;
        this.b = aonnVar;
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
        return c((aoxi) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [aonn, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        apdp apdpVar;
        java.lang.Object obj3;
        apdp apdpVar2;
        fyq fyqVar;
        aoot aootVar;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            try {
                if (i2 != 0) {
                    obj2 = (apdp) this.d;
                    if (i2 != 1) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                    }
                    apdpVar = (apdp) obj2;
                    apdpVar.d();
                    return aojh.a;
                }
                aooc.af(obj);
                java.lang.Object obj4 = this.c;
                this.d = obj4;
                this.a = 1;
                if (((apdp) obj4).b(this) == aoluVar) {
                    return aoluVar;
                }
                obj2 = obj4;
                defpackage.abiw abiwVar = new defpackage.abiw((aonn) this.b, (aoln) null, 2);
                this.d = obj2;
                this.a = 2;
                if (aosv.m(abiwVar, this) == aoluVar) {
                    return aoluVar;
                }
                apdpVar = (apdp) obj2;
                apdpVar.d();
                return aojh.a;
            } catch (java.lang.Throwable th) {
                apdpVar.d();
                throw th;
            }
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            try {
                if (i3 != 0) {
                    obj3 = (apdp) this.d;
                    if (i3 != 1) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                    }
                    apdpVar2 = (apdp) obj3;
                    apdpVar2.d();
                    return aojh.a;
                }
                aooc.af(obj);
                java.lang.Object obj5 = this.c;
                this.d = obj5;
                this.a = 1;
                if (((apdp) obj5).b(this) == aoluVar2) {
                    return aoluVar2;
                }
                obj3 = obj5;
                defpackage.abiw abiwVar2 = new defpackage.abiw((aonn) this.b, (aoln) null, 2);
                this.d = obj3;
                this.a = 2;
                if (aosv.m(abiwVar2, this) == aoluVar2) {
                    return aoluVar2;
                }
                apdpVar2 = (apdp) obj3;
                apdpVar2.d();
                return aojh.a;
            } catch (java.lang.Throwable th2) {
                apdpVar2.d();
                throw th2;
            }
        }
        if (i == 2) {
            aolu aoluVar3 = aolu.a;
            if (this.a != 0) {
                fyqVar = (fyq) this.d;
                try {
                    aooc.af(obj);
                } catch (aozr e) {
                    e = e;
                    aosv.H(e, fyqVar);
                    aooc.Y(u());
                }
            } else {
                aooc.af(obj);
                aoxi aoxiVar = (aoxi) this.d;
                ?? r1 = this.c;
                fyq fyqVar2 = new fyq(this.b, aoxiVar, 18);
                try {
                    this.d = fyqVar2;
                    this.a = 1;
                    if (r1.fM(fyqVar2, this) == aoluVar3) {
                        return aoluVar3;
                    }
                } catch (aozr e2) {
                    e = e2;
                    fyqVar = fyqVar2;
                    aosv.H(e, fyqVar);
                    aooc.Y(u());
                }
            }
            return aojh.a;
        }
        aolu aoluVar4 = aolu.a;
        try {
            if (this.a != 0) {
                aootVar = (aoot) this.d;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                aoss aossVar = (aoss) this.d;
                aoot aootVar2 = new aoot();
                ?? r2 = this.c;
                defpackage.tgo tgoVar = new defpackage.tgo(aootVar2, aossVar, (aosi) this.b, 4);
                this.d = aootVar2;
                this.a = 1;
                if (r2.fM(tgoVar, this) == aoluVar4) {
                    return aoluVar4;
                }
                aootVar = aootVar2;
            }
            if (aootVar.a == null) {
                ((aoul) this.b).Q(new aoiw(aooc.ae(new java.util.NoSuchElementException("Flow is empty"))));
            }
            return aojh.a;
        } catch (java.lang.Throwable th3) {
            ((aosi) this.b).c(th3);
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [aoxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aonn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aono, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ahgx ahgxVar = new defpackage.ahgx(aolnVar, (apdp) this.c, (aonn) this.b, 0);
            ahgxVar.d = obj;
            return ahgxVar;
        }
        if (i == 1) {
            defpackage.ahgx ahgxVar2 = new defpackage.ahgx(aolnVar, (apdp) this.c, this.b, 1, null);
            ahgxVar2.d = obj;
            return ahgxVar2;
        }
        if (i != 2) {
            defpackage.ahgx ahgxVar3 = new defpackage.ahgx((aoxh) this.c, (aosi) this.b, aolnVar, 3);
            ahgxVar3.d = obj;
            return ahgxVar3;
        }
        defpackage.ahgx ahgxVar4 = new defpackage.ahgx((aoxh) this.c, (aono) this.b, aolnVar, 2);
        ahgxVar4.d = obj;
        return ahgxVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgx(aoln aolnVar, apdp apdpVar, aonn aonnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = apdpVar;
        this.b = aonnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgx(aoxh aoxhVar, aono aonoVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aoxhVar;
        this.b = aonoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgx(aoxh aoxhVar, aosi aosiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = aoxhVar;
        this.b = aosiVar;
    }
}
