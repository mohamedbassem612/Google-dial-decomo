package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgg implements cye {
    private final /* synthetic */ int $cid;
    public static final defpackage.bgg f = new defpackage.bgg(6);
    public static final defpackage.bgg e = new defpackage.bgg(4);
    public static final defpackage.bgg d = new defpackage.bgg(3);
    public static final defpackage.bgg c = new defpackage.bgg(2);
    public static final defpackage.bgg b = new defpackage.bgg(1);
    public static final defpackage.bgg a = new defpackage.bgg(0);

    public bgg(int i) {
        this.$cid = i;
    }

    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return vn.f(this, cxfVar, list, i);
        }
        if (i2 == 1) {
            return vn.f(this, cxfVar, list, i);
        }
        if (i2 == 2) {
            return vn.f(this, cxfVar, list, i);
        }
        if (i2 == 3) {
            return vn.f(this, cxfVar, list, i);
        }
        if (i2 != 4) {
            return i2 != 5 ? vn.f(this, cxfVar, list, i) : vn.f(this, cxfVar, list, i);
        }
        return vn.f(this, cxfVar, list, i);
    }

    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return vn.g(this, cxfVar, list, i);
        }
        if (i2 == 1) {
            return vn.g(this, cxfVar, list, i);
        }
        if (i2 == 2) {
            return vn.g(this, cxfVar, list, i);
        }
        if (i2 == 3) {
            return vn.g(this, cxfVar, list, i);
        }
        if (i2 != 4) {
            return i2 != 5 ? vn.g(this, cxfVar, list, i) : vn.g(this, cxfVar, list, i);
        }
        return vn.g(this, cxfVar, list, i);
    }

    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return vn.h(this, cxfVar, list, i);
        }
        if (i2 == 1) {
            return vn.h(this, cxfVar, list, i);
        }
        if (i2 == 2) {
            return vn.h(this, cxfVar, list, i);
        }
        if (i2 == 3) {
            return vn.h(this, cxfVar, list, i);
        }
        if (i2 != 4) {
            return i2 != 5 ? vn.h(this, cxfVar, list, i) : vn.h(this, cxfVar, list, i);
        }
        return vn.h(this, cxfVar, list, i);
    }

    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        int i2 = this.$cid;
        if (i2 == 0) {
            return vn.i(this, cxfVar, list, i);
        }
        if (i2 == 1) {
            return vn.i(this, cxfVar, list, i);
        }
        if (i2 == 2) {
            return vn.i(this, cxfVar, list, i);
        }
        if (i2 == 3) {
            return vn.i(this, cxfVar, list, i);
        }
        if (i2 != 4) {
            return i2 != 5 ? vn.i(this, cxfVar, list, i) : vn.i(this, cxfVar, list, i);
        }
        return vn.i(this, cxfVar, list, i);
    }

    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        java.lang.Integer numValueOf;
        int i = this.$cid;
        int iIntValue = 0;
        if (i == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((cyd) list.get(i2)).v(j));
            }
            return cyiVar.du(dpd.b(j), dpd.a(j), aokd.a, new defpackage.bgf(arrayList, iIntValue));
        }
        if (i == 1) {
            return cyiVar.du(dpd.d(j), dpd.c(j), aokd.a, new nq(17));
        }
        int i3 = 10;
        if (i == 2) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            int size2 = list.size();
            int iMax = 0;
            int iMax2 = 0;
            while (iIntValue < size2) {
                czc czcVarV = ((cyd) list.get(iIntValue)).v(j);
                iMax = java.lang.Math.max(iMax, czcVarV.a);
                iMax2 = java.lang.Math.max(iMax2, czcVarV.b);
                arrayList2.add(czcVarV);
                iIntValue++;
            }
            return cyiVar.du(iMax, iMax2, aokd.a, new defpackage.bln(arrayList2, i3));
        }
        if (i == 3) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
            int size3 = list.size();
            int iC = 0;
            int iD = 0;
            while (iIntValue < size3) {
                czc czcVarV2 = ((cyd) list.get(iIntValue)).v(j);
                iD = java.lang.Math.max(iD, czcVarV2.a);
                iC = java.lang.Math.max(iC, czcVarV2.b);
                arrayList3.add(czcVarV2);
                iIntValue++;
            }
            if (list.isEmpty()) {
                iD = dpd.d(j);
                iC = dpd.c(j);
            }
            return den.z(cyiVar, iD, iC, new dih(arrayList3, 9));
        }
        if (i == 4) {
            int size4 = list.size();
            if (size4 == 0) {
                return den.z(cyiVar, 0, 0, defpackage.bbb.c);
            }
            if (size4 == 1) {
                czc czcVarV3 = ((cyd) list.get(0)).v(j);
                return den.z(cyiVar, czcVarV3.a, czcVarV3.b, new defpackage.aib(czcVarV3, 5));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            int size5 = list.size();
            int iMax3 = 0;
            int iMax4 = 0;
            while (iIntValue < size5) {
                czc czcVarV4 = ((cyd) list.get(iIntValue)).v(j);
                iMax3 = java.lang.Math.max(iMax3, czcVarV4.a);
                iMax4 = java.lang.Math.max(iMax4, czcVarV4.b);
                arrayList4.add(czcVarV4);
                iIntValue++;
            }
            return den.z(cyiVar, iMax3, iMax4, new defpackage.aib(arrayList4, 6));
        }
        if (i != 5) {
            aooh.f(cyiVar, "$this$Layout");
            final int iDp = cyiVar.dp(40.0f);
            final int iA = dpd.g(j) ? dpd.a(j) : iDp;
            if (dpd.h(j)) {
                iDp = dpd.b(j);
            }
            final int iMin = java.lang.Math.min(iA, iDp);
            final czc czcVarV5 = ((cyd) list.get(0)).v(dpe.l(iMin, iMin));
            return den.z(cyiVar, iDp, iA, new aonj() { // from class: abkn
                public final java.lang.Object a(java.lang.Object obj) {
                    czb czbVar = (czb) obj;
                    aooh.f(czbVar, "$this$layout");
                    int i4 = iA;
                    int i5 = iDp;
                    int i6 = iMin;
                    czbVar.u(czcVarV5, (i5 - i6) / 2, (i4 - i6) / 2, 0.0f);
                    return aojh.a;
                }
            });
        }
        aooh.f(cyiVar, "$this$Layout");
        long jK = dpd.k(j, 0, 0, 0, 0, 10);
        java.util.ArrayList arrayList5 = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList5.add(((cyd) it.next()).v(jK));
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList(ajsz.bl(arrayList5, 10));
        java.util.Iterator it2 = arrayList5.iterator();
        while (true) {
            numValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            czc czcVar = (czc) it2.next();
            aooh.f(czcVar, "placeable");
            java.lang.Object objG = czcVar.g();
            defpackage.abek abekVar = objG instanceof defpackage.abek ? (defpackage.abek) objG : null;
            if (abekVar == null) {
                abekVar = new defpackage.abek(false, false);
            }
            arrayList6.add(new defpackage.abej(czcVar, abekVar));
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList6) {
            if (((defpackage.abej) obj).b.b) {
                arrayList7.add(obj);
            }
        }
        int iDp2 = cyiVar.dp(8.0f);
        int iT = aooc.t(arrayList7.size() - 1, 0) * iDp2;
        java.util.Iterator it3 = arrayList7.iterator();
        int i4 = 0;
        while (it3.hasNext()) {
            i4 += ((defpackage.abej) it3.next()).a.a;
        }
        int i5 = i4 + iT;
        java.util.Iterator it4 = arrayList6.iterator();
        if (it4.hasNext()) {
            numValueOf = java.lang.Integer.valueOf(((defpackage.abej) it4.next()).a.b);
            while (it4.hasNext()) {
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(((defpackage.abej) it4.next()).a.b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
        }
        iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        return den.z(cyiVar, i5, iIntValue, new defpackage.ayc(arrayList6, iIntValue, iDp2, 3));
    }
}
