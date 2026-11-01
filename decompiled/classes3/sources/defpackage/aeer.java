package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeer extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    java.lang.Object a;
    int b;
    final /* synthetic */ aeeu c;
    final /* synthetic */ aeco d;
    final /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeer(aeeu aeeuVar, aeco aecoVar, java.util.List list, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = aeeuVar;
        this.d = aecoVar;
        this.e = list;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            return new defpackage.aeer(this.c, (java.util.Map) this.e, this.d, (aoln) obj, 1).b(aojh.a);
        }
        return new defpackage.aeer(this.c, this.d, (java.util.List) this.e, (aoln) obj, 0).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0103  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [adty] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v5, types: [aeeo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4, types: [aeeo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, java.util.List] */
    public final java.lang.Object b(java.lang.Object obj) {
        adub adtwVar;
        aeeu aeeuVar;
        ?? r1;
        aeco aecoVar;
        java.util.List list;
        adty adtyVar;
        adtz adtwVar2;
        adtz adtzVar;
        ?? it;
        ?? r2 = 2;
        if (this.$cid != 0) {
            aolu aoluVar = aolu.a;
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    aooc.af(obj);
                } else {
                    java.lang.Object obj2 = this.a;
                    aooc.af(obj);
                    it = obj2;
                }
                return aojh.a;
            }
            aooc.af(obj);
            aeeu aeeuVar2 = this.c;
            int i2 = aeeu.e;
            aeeuVar2.d();
            it = this.e.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                defpackage.aecp aecpVar = (defpackage.aecp) entry.getKey();
                j$.time.Duration duration = (j$.time.Duration) entry.getValue();
                aeeu aeeuVar3 = this.c;
                int i3 = aeeu.e;
                j$.time.Instant instantMinus = j$.time.Instant.now().minus(duration);
                aooh.e(instantMinus, "minus(...)");
                aeco aecoVar2 = this.d;
                java.lang.Object objA = aeeuVar3.a.a();
                this.a = it;
                this.b = 1;
                if (dez.o(((defpackage.aeeq) objA).a, false, true, new defpackage.aclk(aecoVar2, aecpVar, instantMinus, 2), this) == aoluVar) {
                    return aoluVar;
                }
            }
            aeeu aeeuVar4 = this.c;
            aeco aecoVar3 = this.d;
            this.a = null;
            this.b = 2;
            int i4 = aeeu.e;
            obj = aeeuVar4.c(aecoVar3, this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            return aojh.a;
        }
        aolu aoluVar2 = aolu.a;
        int i5 = this.b;
        try {
            if (i5 == 0) {
                aooc.af(obj);
                boolean zA = anft.a.b().a();
                aeeu aeeuVar5 = this.c;
                if (zA) {
                    ?? r9 = this.e;
                    adty adtyVar2 = adty.e;
                    ?? A = aeeuVar5.a.a();
                    this.a = adtyVar2;
                    this.b = 3;
                    obj = A.a(r9, this);
                    r2 = adtyVar2;
                    if (obj == aoluVar2) {
                        return aoluVar2;
                    }
                    adtwVar = new adub(obj);
                    aeeuVar = this.c;
                    r1 = this.e;
                    aecoVar = this.d;
                    if (adtwVar instanceof adub) {
                        list = (java.util.List) adtwVar.a;
                        this.a = adtwVar;
                        this.b = 4;
                        if (aeeuVar.b((java.util.List) r1, list, aecoVar, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    return adtwVar;
                }
                aeeuVar5.d();
                ?? r10 = this.e;
                adty adtyVar3 = adty.e;
                try {
                    ?? A2 = aeeuVar5.a.a();
                    this.a = adtyVar3;
                    this.b = 1;
                    obj = A2.a(r10, this);
                    if (obj == aoluVar2) {
                        return aoluVar2;
                    }
                    adtyVar = adtyVar3;
                    adtwVar2 = new adub(obj);
                    aeeu aeeuVar6 = this.c;
                    aeco aecoVar4 = this.d;
                    this.a = adtwVar2;
                    this.b = 2;
                    obj = aeeuVar6.c(aecoVar4, this);
                    if (obj != aoluVar2) {
                        return aoluVar2;
                    }
                    adtzVar = adtwVar2;
                } catch (java.lang.Exception e) {
                    e = e;
                    adtyVar = adtyVar3;
                    aooc.Y(u());
                    adtwVar2 = new defpackage.adtw(e, adtyVar);
                }
            } else if (i5 == 1) {
                adtyVar = (adty) this.a;
                try {
                    aooc.af(obj);
                    adtwVar2 = new adub(obj);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    aooc.Y(u());
                    adtwVar2 = new defpackage.adtw(e, adtyVar);
                }
                aeeu aeeuVar7 = this.c;
                aeco aecoVar5 = this.d;
                this.a = adtwVar2;
                this.b = 2;
                obj = aeeuVar7.c(aecoVar5, this);
                if (obj != aoluVar2) {
                    return aoluVar2;
                }
                adtzVar = adtwVar2;
            } else {
                if (i5 != 2) {
                    java.lang.Object obj3 = this.a;
                    if (i5 != 3) {
                        adtz adtzVar2 = (adtz) obj3;
                        aooc.af(obj);
                        return adtzVar2;
                    }
                    adty adtyVar4 = (adty) obj3;
                    aooc.af(obj);
                    r2 = adtyVar4;
                    adtwVar = new adub(obj);
                    aeeuVar = this.c;
                    r1 = this.e;
                    aecoVar = this.d;
                    if (adtwVar instanceof adub) {
                        list = (java.util.List) adtwVar.a;
                        this.a = adtwVar;
                        this.b = 4;
                        if (aeeuVar.b((java.util.List) r1, list, aecoVar, this) == aoluVar2) {
                            return aoluVar2;
                        }
                    }
                    return adtwVar;
                }
                adtz adtzVar3 = (adtz) this.a;
                aooc.af(obj);
                adtzVar = adtzVar3;
            }
            return adtzVar;
        } catch (java.lang.Exception e3) {
            aooc.Y(u());
            adtwVar = new defpackage.adtw(e3, (adty) r2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeer(aeeu aeeuVar, java.util.Map map, aeco aecoVar, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = aeeuVar;
        this.e = map;
        this.d = aecoVar;
    }
}
