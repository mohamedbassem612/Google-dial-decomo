package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bvh implements cye {
    final /* synthetic */ float a;

    public bvh(float f) {
        this.a = f;
    }

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
    public final cyf e(cyi cyiVar, java.util.List list, long j) throws aoiq {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cyd cydVar = (cyd) list.get(i);
            if (aooh.n(cwh.j(cydVar), "LeadingButton")) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cyd cydVar2 = (cyd) list.get(i2);
                    if (aooh.n(cwh.j(cydVar2), "TrailingButton")) {
                        int iDp = cyiVar.dp(this.a);
                        int iD = cydVar2.d(dpd.a(j));
                        int iB = dpe.b(j, java.lang.Math.max(cydVar.c(defpackage.rq.o(dpd.b(j), iD + iDp)), cydVar2.c(iD)));
                        czc czcVarV = cydVar2.v(dpd.k(j, 0, 0, iB, iB, 2));
                        czc czcVarV2 = cydVar.v(dpd.k(dpe.g(j, -(czcVarV.a + iDp), 0), 0, 0, iB, iB, 2));
                        int i3 = czcVarV2.a + czcVarV.a + iDp;
                        int iMax = java.lang.Math.max(czcVarV2.b, czcVarV.b);
                        int iD2 = dpd.d(j);
                        int iB2 = dpd.b(j);
                        if (i3 < iD2) {
                            i3 = iD2;
                        }
                        int i4 = i3 > iB2 ? iB2 : i3;
                        int iB3 = dpe.b(j, iMax);
                        return den.z(cyiVar, i4, iB3, new defpackage.bvg(czcVarV2, iB3, czcVarV, iDp, 0));
                    }
                }
                dpy.a("Collection contains no element matching the predicate.");
                throw new aoiq();
            }
        }
        dpy.a("Collection contains no element matching the predicate.");
        throw new aoiq();
    }
}
