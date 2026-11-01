package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class abdx implements cye {
    final /* synthetic */ float a;

    public abdx(float f) {
        this.a = f;
    }

    public final int a(cxf cxfVar, java.util.List list, int i) {
        aooh.f(cxfVar, "<this>");
        return cxfVar.dp(this.a);
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
        java.lang.Object obj;
        aooh.f(cyiVar, "$this$measure");
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cyd) it.next()).v(j));
        }
        java.lang.Object obj2 = null;
        int i = 1;
        if (!arrayList.isEmpty()) {
            obj = arrayList.get(0);
            int i2 = ((czc) obj).a;
            int iAZ = ajsz.aZ(arrayList);
            if (iAZ > 0) {
                int i3 = 1;
                while (true) {
                    java.lang.Object obj3 = arrayList.get(i3);
                    int i4 = ((czc) obj3).a;
                    if (i2 < i4) {
                        obj = obj3;
                        i2 = i4;
                    }
                    if (i3 == iAZ) {
                        break;
                    }
                    i3++;
                }
            }
        } else {
            obj = null;
        }
        czc czcVar = (czc) obj;
        int i5 = czcVar != null ? czcVar.a : 0;
        if (!arrayList.isEmpty()) {
            obj2 = arrayList.get(0);
            int i6 = ((czc) obj2).b;
            int iAZ2 = ajsz.aZ(arrayList);
            if (iAZ2 > 0) {
                while (true) {
                    java.lang.Object obj4 = arrayList.get(i);
                    int i7 = ((czc) obj4).b;
                    if (i6 < i7) {
                        obj2 = obj4;
                        i6 = i7;
                    }
                    if (i == iAZ2) {
                        break;
                    }
                    i++;
                }
            }
        }
        czc czcVar2 = (czc) obj2;
        return den.z(cyiVar, i5, czcVar2 != null ? czcVar2.b : 0, new xms(arrayList, 20));
    }
}
