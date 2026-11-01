package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abos extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;
    final /* synthetic */ java.lang.Object c;
    final /* synthetic */ java.lang.Object d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(akks akksVar, aazz aazzVar, java.util.Map map, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = akksVar;
        this.b = aazzVar;
        this.c = map;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((akla) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 2) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 3) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 4) {
            return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aozh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [cvr, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aoiq {
        java.lang.Object objB;
        java.lang.Object objV;
        java.lang.Object objV2;
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                aoss aossVar = (aoss) this.e;
                ?? r9 = this.b;
                abor aborVar = new abor(aossVar, (aonj) this.c, (abow) this.d, (aoln) null, 0);
                this.a = 1;
                if (ro.d((cvr) r9, aborVar, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            try {
                if (this.a != 0) {
                    aooc.af(obj);
                    objB = obj;
                } else {
                    aooc.af(obj);
                    akla aklaVar = (akla) this.e;
                    aimw aimwVarL = aazz.a.b().l("com/google/android/libraries/abuse/hades/download/fetcher/PersephoneGrpcManifestConfigFetcher", "fetch$<anonymous>", 101, "PersephoneGrpcManifestConfigFetcher.kt");
                    java.lang.Object obj2 = this.d;
                    aimwVarL.y("PersephoneGrpcManifestConfigFetcher starts downloading: %s", obj2);
                    this.a = 1;
                    objB = aklaVar.b((akks) obj2, new anph(), this);
                    if (objB == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return (akkt) objB;
            } catch (anqx e) {
                aazz.c(e, (java.util.Map) this.c);
                throw new aoiq();
            } catch (anqz e2) {
                aazz.c(e2, (java.util.Map) this.c);
                throw new aoiq();
            }
        }
        if (i == 2) {
            aolu aoluVar3 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 != 0) {
                objV = obj;
            } else {
                aoss aossVar2 = (aoss) this.e;
                ?? r8 = this.c;
                java.lang.Object obj3 = this.d;
                java.lang.Object obj4 = this.b;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = r8.iterator();
                while (it.hasNext()) {
                    defpackage.ackv ackvVar = (defpackage.ackv) ((defpackage.afpl) obj3).b.get((java.lang.String) it.next());
                    aosy aosyVarAm = ackvVar != null ? aoov.am(aossVar2, 0, new defpackage.abvg(ackvVar, (acdl) obj4, (aoln) null, 9), 3) : null;
                    if (aosyVarAm != null) {
                        arrayList.add(aosyVarAm);
                    }
                }
                this.a = 1;
                objV = aooh.v(arrayList, this);
                if (objV == aoluVar3) {
                    return aoluVar3;
                }
            }
            java.util.ArrayList<defpackage.afpl> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj5 : (java.lang.Iterable) objV) {
                java.lang.Object obj6 = ((defpackage.afpl) obj5).a;
                arrayList2.add(obj5);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(arrayList2, 10)), 16));
            for (defpackage.afpl afplVar : arrayList2) {
                aoiu aoiuVar = new aoiu(afplVar.b, afplVar.a);
                linkedHashMap.put(aoiuVar.a, aoiuVar.b);
            }
            return linkedHashMap;
        }
        if (i == 3) {
            aolu aoluVar4 = aolu.a;
            int i4 = this.a;
            aooc.af(obj);
            if (i4 != 0) {
                objV2 = obj;
            } else {
                aoss aossVar3 = (aoss) this.e;
                java.lang.Object obj7 = this.d;
                if (obj7 == akst.a) {
                    java.util.Objects.toString(obj7);
                    return new defpackage.adtw("Invalid fetchReason - ".concat(obj7.toString()), adty.ad);
                }
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                acig acigVar = (acig) this.b;
                arrayList3.add(aoov.am(aossVar3, 0, new defpackage.acbt(acigVar, (aoln) null, 10), 3));
                java.lang.Object obj8 = this.c;
                if (obj8 == null && angy.d()) {
                    arrayList3.add(aoov.am(aossVar3, 0, new defpackage.abvg(acigVar, (akst) obj7, (aoln) null, 15), 3));
                }
                if (obj8 != null && angy.c()) {
                    arrayList3.add(aoov.am(aossVar3, 0, new defpackage.xhb(acigVar, (java.lang.String) obj8, (akst) obj7, (aoln) null, 10), 3));
                }
                this.a = 1;
                objV2 = aooh.v(arrayList3, this);
                if (objV2 == aoluVar4) {
                    return aoluVar4;
                }
            }
            return agab.bV((java.util.List) objV2, acig.a);
        }
        if (i == 4) {
            aolu aoluVar5 = aolu.a;
            int i5 = this.a;
            aooc.af(obj);
            if (i5 != 0) {
                return obj;
            }
            aoss aossVar4 = (aoss) this.e;
            aoud aoudVar = new aoud((aoub) null);
            defpackage.acuc acucVar = defpackage.acuc.a;
            android.os.CancellationSignal cancellationSignal = new android.os.CancellationSignal();
            aoov.al(aossVar4, aoudVar, 1, new defpackage.agjg(null, 1, null)).p(new defpackage.abph(cancellationSignal, 7));
            android.content.Context context = (android.content.Context) this.b;
            android.content.ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                throw new java.lang.IllegalStateException("No content resolver");
            }
            java.lang.Object obj9 = this.d;
            aolr aolrVarC = aossVar4.c();
            acub acubVar = new acub(context, contentResolver, (java.lang.String) this.c, cancellationSignal, (dmc) obj9, aoudVar, (aoln) null, 0);
            this.a = 1;
            java.lang.Object objAj = aoov.aj(aolrVarC, acubVar, this);
            return objAj != aoluVar5 ? objAj : aoluVar5;
        }
        aolu aoluVar6 = aolu.a;
        int i6 = this.a;
        aooc.af(obj);
        if (i6 == 0) {
            java.lang.Object obj10 = this.d;
            ?? r4 = this.c;
            java.lang.Object obj11 = this.b;
            emy emyVarP = ((defpackage.ahhe) obj10).a.P();
            emq emqVar = emq.d;
            defpackage.afmq afmqVar = new defpackage.afmq((aozh) r4, (defpackage.aprf) obj11, (aoln) null, 5);
            this.a = 1;
            if (emqVar == emq.b) {
                throw new java.lang.IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
            }
            if (emyVarP.d == emq.a) {
                throw new java.lang.IllegalArgumentException("repeatOnLifecycle cannot start after its input Lifecycle has already been destroyed.");
            }
            if (android.os.Looper.getMainLooper().getThread() != java.lang.Thread.currentThread()) {
                throw new java.lang.IllegalArgumentException("repeatOnLifecycle must be called from the main thread.");
            }
            java.lang.Object objM = aosv.m(new defpackage.ahgz(emqVar, emyVarP, afmqVar, null), this);
            if (objM != aoluVar6) {
                objM = aojh.a;
            }
            if (objM == aoluVar6) {
                return aoluVar6;
            }
        }
        return aojh.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cvr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [aozh, java.lang.Object] */
    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.abos abosVar;
        int i = this.$cid;
        if (i == 0) {
            abosVar = new defpackage.abos((cvr) this.b, (aonj) this.c, (abow) this.d, aolnVar, 0);
            abosVar.e = obj;
        } else if (i == 1) {
            java.lang.Object obj2 = this.d;
            akks akksVar = (akks) obj2;
            abosVar = new defpackage.abos(akksVar, (aazz) this.b, (java.util.Map) this.c, aolnVar, 1);
            abosVar.e = obj;
        } else if (i == 2) {
            abosVar = new defpackage.abos((java.util.Set) this.c, (defpackage.afpl) this.d, (acdl) this.b, aolnVar, 2);
            abosVar.e = obj;
        } else if (i == 3) {
            java.lang.Object obj3 = this.d;
            akst akstVar = (akst) obj3;
            abosVar = new defpackage.abos(akstVar, (java.lang.String) this.c, (acig) this.b, aolnVar, 3);
            abosVar.e = obj;
        } else {
            if (i != 4) {
                defpackage.abos abosVar2 = new defpackage.abos(aolnVar, (defpackage.ahhe) this.d, (aozh) this.c, (defpackage.aprf) this.b, 5);
                abosVar2.e = obj;
                return abosVar2;
            }
            java.lang.Object obj4 = this.b;
            android.content.Context context = (android.content.Context) obj4;
            abosVar = new defpackage.abos(context, (dmc) this.d, (java.lang.String) this.c, aolnVar, 4);
            abosVar.e = obj;
        }
        return abosVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(akst akstVar, java.lang.String str, acig acigVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = akstVar;
        this.c = str;
        this.b = acigVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(android.content.Context context, dmc dmcVar, java.lang.String str, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = context;
        this.d = dmcVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(aoln aolnVar, defpackage.ahhe ahheVar, aozh aozhVar, defpackage.aprf aprfVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.d = ahheVar;
        this.c = aozhVar;
        this.b = aprfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(cvr cvrVar, aonj aonjVar, abow abowVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = cvrVar;
        this.c = aonjVar;
        this.d = abowVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abos(java.util.Set set, defpackage.afpl afplVar, acdl acdlVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.c = set;
        this.d = afplVar;
        this.b = acdlVar;
    }
}
