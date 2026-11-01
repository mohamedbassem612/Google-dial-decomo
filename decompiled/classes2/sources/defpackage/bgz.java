package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bgz implements cye {
    private final aomy a;
    private final aomy b;

    public bgz(aomy aomyVar, aomy aomyVar2) {
        this.a = aomyVar;
        this.b = aomyVar2;
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

    public final cyf e(cyi cyiVar, java.util.List list, long j) {
        aoiu aoiuVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            java.lang.Object obj = list.get(i);
            if (!(((cyd) obj).g() instanceof defpackage.bha)) {
                arrayList.add(obj);
            }
        }
        java.util.List list2 = (java.util.List) this.b.a();
        java.util.ArrayList arrayList2 = null;
        if (list2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                cpn cpnVar = (cpn) list2.get(i2);
                if (cpnVar != null) {
                    cyd cydVar = (cyd) arrayList.get(i2);
                    float f = cpnVar.d;
                    float f2 = cpnVar.b;
                    float fFloor = (float) java.lang.Math.floor(f - f2);
                    float f3 = cpnVar.e;
                    float f4 = cpnVar.c;
                    aoiuVar = new aoiu(cydVar.v(dpe.c(0, (int) fFloor, 0, (int) java.lang.Math.floor(f3 - f4))), new dpn((((long) java.lang.Math.round(f2)) << 32) | (((long) java.lang.Math.round(f4)) & 4294967295L)));
                } else {
                    aoiuVar = null;
                }
                if (aoiuVar != null) {
                    arrayList3.add(aoiuVar);
                }
            }
            arrayList2 = arrayList3;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            java.lang.Object obj2 = list.get(i3);
            if (((cyd) obj2).g() instanceof defpackage.bha) {
                arrayList4.add(obj2);
            }
        }
        return cyiVar.du(dpd.b(j), dpd.a(j), aokd.a, new defpackage.aum(arrayList2, den.au(arrayList4, this.a), 17));
    }
}
