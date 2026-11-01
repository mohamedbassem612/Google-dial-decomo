package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class beh {
    private static final java.util.Comparator a = new defpackage.beg(0);

    public static final int a(defpackage.bef befVar, boolean z) {
        int iA;
        int iB;
        if (z) {
            iA = befVar.g();
            iB = befVar.h();
        } else {
            iA = befVar.a();
            iB = befVar.b();
        }
        return iA + iB;
    }

    public static final java.lang.Object b(defpackage.bef befVar, int i) {
        return ((defpackage.czc) befVar.l().get(i)).g();
    }

    public static final java.util.List c(int i, int i2, java.util.List list, java.util.List list2) {
        if (list.isEmpty()) {
            return defpackage.aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            defpackage.bef befVar = (defpackage.bef) list.get(i3);
            int iC = befVar.c();
            if (i <= iC && iC <= i2) {
                arrayList.add(befVar);
            }
        }
        defpackage.ajsz.bo(arrayList, a);
        return arrayList;
    }
}
