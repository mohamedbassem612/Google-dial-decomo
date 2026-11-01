package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mkc extends aomh implements aono {
    private final /* synthetic */ int $cid;
    int a;
    /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    private /* synthetic */ java.lang.Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(aoln aolnVar, aghd aghdVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = aghdVar;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, tel] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.$cid) {
            case 0:
                defpackage.mkc mkcVar = new defpackage.mkc((aoln) obj3, (defpackage.mki) this.c, 0);
                mkcVar.d = (aoxi) obj;
                mkcVar.b = obj2;
                return mkcVar.b(aojh.a);
            case 1:
                defpackage.mkc mkcVar2 = new defpackage.mkc((aoln) obj3, (defpackage.mki) this.c, 1, (byte[]) null);
                mkcVar2.d = (aoxi) obj;
                mkcVar2.b = obj2;
                return mkcVar2.b(aojh.a);
            case 2:
                defpackage.mkc mkcVar3 = new defpackage.mkc((rjl) this.c, (aoln) obj3, 2);
                mkcVar3.d = (rim) obj;
                mkcVar3.b = (rio) obj2;
                return mkcVar3.b(aojh.a);
            case 3:
                defpackage.mkc mkcVar4 = new defpackage.mkc((rjl) this.c, (aoln) obj3, 3, (byte[]) null);
                mkcVar4.d = (rim) obj;
                mkcVar4.b = (rio) obj2;
                return mkcVar4.b(aojh.a);
            case 4:
                defpackage.mkc mkcVar5 = new defpackage.mkc((tel) this.c, (aoln) obj3, 4);
                mkcVar5.d = (aoxi) obj;
                mkcVar5.b = (java.lang.Throwable) obj2;
                return mkcVar5.b(aojh.a);
            case 5:
                defpackage.mkc mkcVar6 = new defpackage.mkc((aoln) obj3, (tgq) this.c, 5);
                mkcVar6.d = (aoxi) obj;
                mkcVar6.b = obj2;
                return mkcVar6.b(aojh.a);
            case 6:
                defpackage.mkc mkcVar7 = new defpackage.mkc((aoln) obj3, (thj) this.c, 6);
                mkcVar7.d = (aoxi) obj;
                mkcVar7.b = obj2;
                return mkcVar7.b(aojh.a);
            default:
                defpackage.mkc mkcVar8 = new defpackage.mkc((aoln) obj3, (aghd) this.c, 7);
                mkcVar8.d = (aoxi) obj;
                mkcVar8.b = obj2;
                return mkcVar8.b(aojh.a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v13, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [aoxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, rio] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, rio] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, tel] */
    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Throwable {
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        java.lang.Object obj3;
        edg edgVarAC;
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                int i = this.a;
                aooc.af(obj);
                if (i == 0) {
                    ?? r13 = this.d;
                    aoxh aoxhVar = ((java.lang.Boolean) this.b).booleanValue() ? ((defpackage.mki) this.c).m : aoxg.a;
                    this.a = 1;
                    if (aoov.aG((aoxi) r13, aoxhVar, this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aolu aoluVar2 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 == 0) {
                    ?? r14 = this.d;
                    java.util.List list = (java.util.List) this.b;
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new edg(new aoxw(aoxo.a(new aoxa(new defpackage.hqq((defpackage.mki) this.c, (android.telecom.PhoneAccountHandle) it.next(), (aoln) null, 2))), 1), 5));
                        }
                    } else {
                        arrayList = aokc.a;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
                    arrayList2.add(((defpackage.mki) this.c).l);
                    aodc.p(arrayList.toArray(new aoxh[0]), arrayList2);
                    aoxh aoxhVarB = aoyc.b((aoxh[]) arrayList2.toArray(new aoxh[arrayList2.size()]));
                    this.a = 1;
                    if (aoov.aG((aoxi) r14, aoxhVarB, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            case 2:
                aolu aoluVar3 = aolu.a;
                int i3 = this.a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        aooc.af(obj);
                    } else {
                        obj2 = this.d;
                        aooc.af(obj);
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                obj2 = this.d;
                ?? r15 = this.b;
                this.a = 1;
                if (r15.b(this) == aoluVar3) {
                    return aoluVar3;
                }
                java.lang.Object obj4 = this.c;
                this.d = null;
                this.a = 2;
                if (((rjl) obj4).a.d((rim) obj2, false, this) == aoluVar3) {
                    return aoluVar3;
                }
                return aojh.a;
            case 3:
                aolu aoluVar4 = aolu.a;
                int i4 = this.a;
                if (i4 != 0) {
                    if (i4 != 1) {
                        aooc.af(obj);
                    } else {
                        obj3 = this.d;
                        aooc.af(obj);
                    }
                    return aojh.a;
                }
                aooc.af(obj);
                obj3 = this.d;
                ?? r16 = this.b;
                this.a = 1;
                if (r16.c(this) == aoluVar4) {
                    return aoluVar4;
                }
                java.lang.Object obj5 = this.c;
                this.d = null;
                this.a = 2;
                if (((rjl) obj5).a.d((rim) obj3, true, this) == aoluVar4) {
                    return aoluVar4;
                }
                return aojh.a;
            case 4:
                aolu aoluVar5 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    ?? r17 = this.d;
                    java.lang.Object obj6 = this.b;
                    if (obj6 instanceof java.util.concurrent.CancellationException) {
                        throw ((java.lang.Throwable) obj6);
                    }
                    java.lang.Throwable th = (java.lang.Throwable) obj6;
                    tgq.a.c().k(th).l("com/android/dialer/search/repository/SearchRepository", "createSearchFlow$<anonymous>$<anonymous>", 115, "SearchRepository.kt").y("SearchDataSource %s threw an exception", this.c.a());
                    tgi tgiVar = new tgi(th);
                    this.d = null;
                    this.a = 1;
                    if (r17.a(tgiVar, this) == aoluVar5) {
                        return aoluVar5;
                    }
                }
                return aojh.a;
            case 5:
                aolu aoluVar6 = aolu.a;
                int i6 = this.a;
                aooc.af(obj);
                if (i6 == 0) {
                    ?? r18 = this.d;
                    tei teiVar = (tei) this.b;
                    tgq tgqVar = (tgq) this.c;
                    aoxh aoxhVarA = tgqVar.a(teiVar, tgqVar.d);
                    this.a = 1;
                    if (aoov.aG((aoxi) r18, aoxhVarA, this) == aoluVar6) {
                        return aoluVar6;
                    }
                }
                return aojh.a;
            case 6:
                aolu aoluVar7 = aolu.a;
                int i7 = this.a;
                aooc.af(obj);
                if (i7 == 0) {
                    ?? r19 = this.d;
                    tei teiVar2 = (tei) this.b;
                    thj thjVar = (thj) this.c;
                    java.util.Set set = (java.util.Set) thjVar.i.a();
                    aooh.f(teiVar2, "query");
                    aooh.f(set, "dataSources");
                    if (set.isEmpty()) {
                        edgVarAC = new edg(aokc.a, 13);
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(ajsz.bl(set, 10));
                        java.util.Iterator it2 = set.iterator();
                        while (true) {
                            tgq tgqVar2 = thjVar.c;
                            if (it2.hasNext()) {
                                tek tekVar = (tek) it2.next();
                                java.lang.Object obj7 = tgqVar2.e.get(tekVar);
                                if (obj7 == null) {
                                    throw new java.lang.IllegalStateException(a.bg(tekVar, "Requested SearchDataSource ", " is not bound"));
                                }
                                arrayList3.add((tel) obj7);
                            } else {
                                edgVarAC = aoov.aC(aoxo.a(new aowy(new defpackage.hty(tgqVar2, teiVar2, arrayList3, (aoln) null, 2))), tgqVar2.b);
                            }
                        }
                    }
                    aoxh aoxhVarAw = snl.aw(edgVarAC);
                    this.a = 1;
                    if (aoov.aG((aoxi) r19, aoxhVarAw, this) == aoluVar7) {
                        return aoluVar7;
                    }
                }
                return aojh.a;
            default:
                aolu aoluVar8 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 == 0) {
                    ?? r110 = this.d;
                    aoxa aoxaVar = new aoxa(new uke((aggb) this.b, (aoln) null, 19));
                    this.a = 1;
                    if (aoov.aG((aoxi) r110, aoxaVar, this) == aoluVar8) {
                        return aoluVar8;
                    }
                }
                return aojh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(aoln aolnVar, defpackage.mki mkiVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = mkiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(aoln aolnVar, defpackage.mki mkiVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = mkiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(aoln aolnVar, tgq tgqVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = tgqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(aoln aolnVar, thj thjVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = thjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(rjl rjlVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = rjlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(rjl rjlVar, aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = rjlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mkc(tel telVar, aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
        this.c = telVar;
    }
}
