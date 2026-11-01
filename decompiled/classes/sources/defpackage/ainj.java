package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class ainj {
    public final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();

    protected ainj() {
    }

    protected abstract java.lang.Object a();

    public final java.lang.Object b(defpackage.aini ainiVar, defpackage.aior aiorVar) {
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.a;
        java.lang.Object obj = concurrentHashMap.get(ainiVar);
        if (obj != null) {
            return obj;
        }
        java.lang.Object objA = a();
        java.lang.Object objPutIfAbsent = concurrentHashMap.putIfAbsent(ainiVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int i = ((defpackage.aind) aiorVar).b;
        agrz agrzVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (defpackage.ainc.f.equals(aiorVar.c(i2))) {
                java.lang.Object objE = aiorVar.e(i2);
                if (objE instanceof ainn) {
                    if (agrzVar == null) {
                        agrzVar = new agrz(this, ainiVar, 6);
                    }
                    ((ainn) objE).a();
                }
            }
        }
        return objA;
    }
}
