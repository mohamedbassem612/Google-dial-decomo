package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aeop {
    public static aify a(java.util.List list, long j, long j2) {
        if (j < 0 && j2 < 0) {
            return (aify) j$.util.Collection.-EL.stream(list).map(new defpackage.adci(7)).collect(aido.a);
        }
        java.util.Iterator it = list.iterator();
        long jA = 0;
        while (it.hasNext()) {
            jA += ((defpackage.aeoo) it.next()).a();
        }
        if (list.size() <= j && jA <= j2) {
            return (aify) j$.util.Collection.-EL.stream(list).map(new defpackage.adci(7)).collect(aido.a);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        java.util.Collections.sort(arrayList);
        aift aiftVar = new aift(4);
        int size = arrayList.size();
        long jA2 = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.aeoo aeooVar = (defpackage.aeoo) arrayList.get(i2);
            i++;
            jA2 += aeooVar.a();
            if ((j >= 0 && i > j) || (j2 >= 0 && jA2 > j2)) {
                break;
            }
            aiftVar.i(aeooVar.b());
        }
        return aiftVar.h();
    }
}
