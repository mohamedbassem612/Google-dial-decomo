package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvb implements cye {
    final /* synthetic */ java.lang.String a = "action";
    final /* synthetic */ java.lang.String b = "dismissAction";
    final /* synthetic */ java.lang.String c = "text";

    public final /* synthetic */ int a(cxf cxfVar, java.util.List list, int i) {
        return vn.f(this, cxfVar, list, i);
    }

    public final /* synthetic */ int b(cxf cxfVar, java.util.List list, int i) {
        return vn.g(this, cxfVar, list, i);
    }

    public final /* synthetic */ int c(cxf cxfVar, java.util.List list, int i) {
        return vn.h(this, cxfVar, list, i);
    }

    public final /* synthetic */ int d(cxf cxfVar, java.util.List list, int i) {
        return vn.i(this, cxfVar, list, i);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    public final cyf e(cyi cyiVar, java.util.List list, long j) throws aoiq {
        java.lang.Object obj;
        java.lang.Object obj2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iDp;
        int iDp2;
        int iMax;
        final int i6;
        final int i7;
        int i8;
        final int i9;
        int iDm;
        int iMin = java.lang.Math.min(dpd.b(j), cyiVar.dp(600.0f));
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            java.lang.String str = this.a;
            obj = list.get(i10);
            if (aooh.n(cwh.j((cyd) obj), str)) {
                break;
            }
            i10++;
        }
        cyd cydVar = (cyd) obj;
        final czc czcVarV = cydVar != null ? cydVar.v(j) : null;
        java.lang.String str2 = this.b;
        int size2 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i11);
            if (aooh.n(cwh.j((cyd) obj2), str2)) {
                break;
            }
            i11++;
        }
        cyd cydVar2 = (cyd) obj2;
        final czc czcVarV2 = cydVar2 != null ? cydVar2.v(j) : null;
        if (czcVarV != null) {
            i = czcVarV.a;
            i2 = czcVarV.b;
        } else {
            i = 0;
            i2 = 0;
        }
        if (czcVarV2 != null) {
            i3 = czcVarV2.a;
            i4 = czcVarV2.b;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (i3 == 0) {
            iDp = cyiVar.dp(8.0f);
            i5 = 0;
        } else {
            i5 = i3;
            iDp = 0;
        }
        int i12 = iMin - i;
        int iD = dpd.d(j);
        java.lang.String str3 = this.c;
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            cyd cydVar3 = (cyd) list.get(i13);
            if (aooh.n(cwh.j(cydVar3), str3)) {
                final czc czcVarV3 = cydVar3.v(dpd.k(j, 0, aooc.t((i12 - i5) - iDp, iD), 0, 0, 9));
                cxa cxaVar = cwn.a;
                int iDm2 = czcVarV3.dm(cxaVar);
                int iDm3 = czcVarV3.dm(cwn.b);
                boolean z = true;
                boolean z2 = (iDm2 == Integer.MIN_VALUE || iDm3 == Integer.MIN_VALUE) ? false : true;
                if (iDm2 != iDm3 && z2) {
                    z = false;
                }
                final int i14 = iMin - i5;
                final int i15 = i14 - i;
                if (!z) {
                    iDp2 = cyiVar.dp(30.0f) - iDm2;
                    iMax = java.lang.Math.max(cyiVar.dp(68.0f), czcVarV3.b + iDp2);
                    if (czcVarV != null) {
                        i8 = (iMax - czcVarV.b) / 2;
                    } else {
                        i6 = iDp2;
                        i7 = 0;
                    }
                    if (czcVarV2 != null) {
                        i9 = (iMax - czcVarV2.b) / 2;
                    } else {
                        i9 = 0;
                    }
                    return den.z(cyiVar, iMin, iMax, new aonj() { // from class: bva
                        public final java.lang.Object a(java.lang.Object obj3) {
                            czb czbVar = (czb) obj3;
                            czbVar.u(czcVarV3, 0, i6, 0.0f);
                            czc czcVar = czcVarV;
                            if (czcVar != null) {
                                czbVar.u(czcVar, i15, i7, 0.0f);
                            }
                            czc czcVar2 = czcVarV2;
                            if (czcVar2 != null) {
                                czbVar.u(czcVar2, i14, i9, 0.0f);
                            }
                            return aojh.a;
                        }
                    });
                }
                iMax = java.lang.Math.max(cyiVar.dp(48.0f), java.lang.Math.max(i2, i4));
                iDp2 = (iMax - czcVarV3.b) / 2;
                i8 = (czcVarV == null || (iDm = czcVarV.dm(cxaVar)) == Integer.MIN_VALUE) ? 0 : (iDm2 + iDp2) - iDm;
                i7 = i8;
                i6 = iDp2;
                if (czcVarV2 != null) {
                    i9 = (iMax - czcVarV2.b) / 2;
                } else {
                    i9 = 0;
                }
                return den.z(cyiVar, iMin, iMax, new aonj() { // from class: bva
                    public final java.lang.Object a(java.lang.Object obj3) {
                        czb czbVar = (czb) obj3;
                        czbVar.u(czcVarV3, 0, i6, 0.0f);
                        czc czcVar = czcVarV;
                        if (czcVar != null) {
                            czbVar.u(czcVar, i15, i7, 0.0f);
                        }
                        czc czcVar2 = czcVarV2;
                        if (czcVar2 != null) {
                            czbVar.u(czcVar2, i14, i9, 0.0f);
                        }
                        return aojh.a;
                    }
                });
            }
        }
        dpy.a("Collection contains no element matching the predicate.");
        throw new aoiq();
    }
}
