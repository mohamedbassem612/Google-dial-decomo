package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xow {
    public static final j$.util.concurrent.ConcurrentHashMap a = new j$.util.concurrent.ConcurrentHashMap();
    public static final j$.util.concurrent.ConcurrentHashMap b = new j$.util.concurrent.ConcurrentHashMap();

    public static final aosi a(int i) {
        java.lang.Object objPutIfAbsent;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = a;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Object aosiVar = concurrentHashMap.get(numValueOf);
        if (aosiVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (aosiVar = new aosi((aoub) null)))) != null) {
            aosiVar = objPutIfAbsent;
        }
        return (aosi) aosiVar;
    }
}
