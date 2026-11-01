package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class acic extends aomh implements aonn {
    java.lang.Object a;
    int b;
    final /* synthetic */ akst c;
    final /* synthetic */ acig d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acic(akst akstVar, acig acigVar, aoln aolnVar) {
        super(2, aolnVar);
        this.c = akstVar;
        this.d = acigVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123 A[LOOP:1: B:44:0x011d->B:46:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:? A[LOOP:2: B:55:0x0151->B:72:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [adzz, java.lang.Object] */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        java.lang.Object objB;
        aoss aossVar;
        java.lang.Object obj2;
        java.lang.Object objW;
        ?? r2;
        adtv adtvVar;
        int iR;
        java.util.List list;
        java.lang.Object objV;
        java.util.Iterator it;
        acig acigVar;
        akst akstVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.Iterator it2;
        aolu aoluVar = aolu.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                java.lang.Object obj3 = this.a;
                aossVar = (aoss) this.e;
                aooc.af(obj);
                objB = obj;
                obj2 = obj3;
            } else if (i != 2) {
                aooc.af(obj);
                objV = obj;
            } else {
                java.lang.Object obj4 = this.a;
                aoss aossVar2 = (aoss) this.e;
                aooc.af(obj);
                aossVar = aossVar2;
                objW = obj;
                r2 = obj4;
                r2 = obj2;
                adtvVar = (adtz) objW;
                iR = anty.R(adtvVar);
                if (iR != 0) {
                    if (iR == 1) {
                        return adtvVar;
                    }
                    throw new aois();
                }
                list = (java.util.List) ((adub) adtvVar).a;
                if (angy.c()) {
                    acigVar = this.d;
                    akstVar = this.c;
                    arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj5 : list) {
                        if (((aduy) obj5).b() instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                            arrayList.add(obj5);
                        }
                    }
                    arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(aoov.am(aossVar, 0, new defpackage.xhb(acigVar, (aduy) it2.next(), akstVar, (aoln) null, 8), 3));
                    }
                    r2.addAll(arrayList2);
                }
                if (angy.d() && (!(list instanceof java.util.Collection) || !list.isEmpty())) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        if (((aduy) it.next()).b() instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                            r2.add(aoov.am(aossVar, 0, new defpackage.abvg(this.d, this.c, (aoln) null, 16, (byte[]) null), 3));
                            break;
                        }
                    }
                }
                this.e = null;
                this.a = null;
                this.b = 3;
                objV = aooh.v((java.util.Collection) r2, this);
                if (objV == aoluVar) {
                    return aoluVar;
                }
            }
            return agab.bV((java.util.List) objV, acig.a);
        }
        aooc.af(obj);
        aoss aossVar3 = (aoss) this.e;
        akst akstVar2 = this.c;
        if (akstVar2 == akst.a) {
            java.util.Objects.toString(akstVar2);
            return new defpackage.adtw("Invalid fetchReason - ".concat(java.lang.String.valueOf(akstVar2)), adty.ad);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        acig acigVar2 = this.d;
        arrayList3.add(aoov.am(aossVar3, 0, new defpackage.acbt(acigVar2, (aoln) null, 11, (byte[]) null), 3));
        this.e = aossVar3;
        this.a = arrayList3;
        this.b = 1;
        objB = !((java.lang.Boolean) acigVar2.f.a()).booleanValue() ? acigVar2.e.a.b(akti.m, aduw.c, this) : new adub(aojh.a);
        if (objB == aoluVar) {
            return aoluVar;
        }
        aossVar = aossVar3;
        obj2 = arrayList3;
        adtv adtvVar2 = (adtz) objB;
        int iR2 = anty.R(adtvVar2);
        if (iR2 != 0) {
            if (iR2 == 1) {
                return adtvVar2;
            }
            throw new aois();
        }
        java.lang.Object obj6 = ((adub) adtvVar2).a;
        aogc aogcVar = (aogc) this.d.g.a();
        this.e = aossVar;
        this.a = obj2;
        this.b = 2;
        objW = aogcVar.W(this);
        if (objW == aoluVar) {
            r2 = obj2;
            return aoluVar;
        }
        r2 = obj2;
        adtvVar = (adtz) objW;
        iR = anty.R(adtvVar);
        if (iR != 0) {
            if (iR == 1) {
                return adtvVar;
            }
            throw new aois();
        }
        list = (java.util.List) ((adub) adtvVar).a;
        if (angy.c()) {
            acigVar = this.d;
            akstVar = this.c;
            arrayList = new java.util.ArrayList();
            while (r9.hasNext()) {
                if (((aduy) obj5).b() instanceof com.google.android.libraries.notifications.platform.registration.Gaia) {
                    arrayList.add(obj5);
                }
            }
            arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(aoov.am(aossVar, 0, new defpackage.xhb(acigVar, (aduy) it2.next(), akstVar, (aoln) null, 8), 3));
            }
            r2.addAll(arrayList2);
        }
        if (angy.d()) {
            it = list.iterator();
            while (it.hasNext()) {
                if (((aduy) it.next()).b() instanceof com.google.android.libraries.notifications.platform.registration.Zwieback) {
                    r2.add(aoov.am(aossVar, 0, new defpackage.abvg(this.d, this.c, (aoln) null, 16, (byte[]) null), 3));
                    break;
                }
            }
        }
        this.e = null;
        this.a = null;
        this.b = 3;
        objV = aooh.v((java.util.Collection) r2, this);
        if (objV == aoluVar) {
            return aoluVar;
        }
        return agab.bV((java.util.List) objV, acig.a);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.acic acicVar = new defpackage.acic(this.c, this.d, aolnVar);
        acicVar.e = obj;
        return acicVar;
    }
}
