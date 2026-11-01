package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahai implements defpackage.ahag {
    @Override // defpackage.ahag
    public final void a(java.util.List list, java.util.List list2, ahxt ahxtVar, kh khVar) {
        int size = list.size();
        int size2 = list2.size();
        int iMin = java.lang.Math.min(size, size2);
        int i = 0;
        while (i < iMin) {
            if (!ahxtVar.d(list.get(i), list2.get(i))) {
                int i2 = i + 1;
                while (i2 < iMin && !ahxtVar.d(list.get(i2), list2.get(i2))) {
                    i2++;
                }
                int i3 = i2 - i;
                khVar.k(i, i3);
                khVar.j(i, i3);
                i = i2;
            }
            i++;
        }
        if (size > iMin) {
            khVar.k(iMin, size - iMin);
        }
        if (size2 > iMin) {
            khVar.j(iMin, size2 - iMin);
        }
    }
}
