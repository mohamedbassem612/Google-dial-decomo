package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aeql {
    public abstract defpackage.albh a(java.lang.String str, java.lang.Object obj);

    public abstract defpackage.albh b(defpackage.albh albhVar, defpackage.albh albhVar2);

    public abstract java.lang.String c(defpackage.albh albhVar);

    public final java.util.List d(java.util.Map map) {
        defpackage.albh albhVarA;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null && (albhVarA = a((java.lang.String) entry.getKey(), entry.getValue())) != null) {
                arrayList.add(albhVarA);
            }
        }
        return arrayList;
    }

    public final java.util.List e(java.util.List list, java.util.List list2) {
        defpackage.albh albhVar;
        if (list.isEmpty()) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.albh albhVar2 = (defpackage.albh) it.next();
            java.lang.String strC = c(albhVar2);
            java.util.Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    albhVar = null;
                    break;
                }
                albhVar = (defpackage.albh) it2.next();
            } while (!strC.equals(c(albhVar)));
            defpackage.albh albhVarB = b(albhVar2, albhVar);
            if (albhVarB != null) {
                arrayList.add(albhVarB);
            }
        }
        return arrayList;
    }
}
