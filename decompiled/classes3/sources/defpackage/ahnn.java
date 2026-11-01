package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahnn {
    public static final /* synthetic */ int a = 0;
    private static final java.util.WeakHashMap b = new java.util.WeakHashMap();
    private static final java.util.WeakHashMap c = new java.util.WeakHashMap();

    public static void a(java.lang.Throwable th) {
        java.util.WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            weakHashMap.put(th, java.lang.Boolean.TRUE);
        }
    }

    public static void b(java.lang.Throwable th) {
        java.lang.Throwable cause;
        boolean z;
        ahpj ahpjVarB;
        java.util.WeakHashMap weakHashMap = c;
        synchronized (weakHashMap) {
            cause = th;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                } else {
                    if (weakHashMap.containsKey(cause)) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                }
            }
            weakHashMap.put(th, java.lang.Boolean.valueOf(z));
        }
        if (cause == null && c(th) == null && (ahpjVarB = ahns.b()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (ahpjVarB = ahns.b(); ahpjVarB != null; ahpjVarB = ahpjVarB.b()) {
                arrayList.add(ahpjVarB);
            }
            java.util.UUID uuidG = ((ahpj) arrayList.get(0)).g();
            if (uuidG == null) {
                throw new java.lang.NullPointerException("Null rootTraceId");
            }
            long jL = ((ahpj) arrayList.get(0)).l();
            aift aiftVarD = aify.d(arrayList.size());
            aift aiftVarD2 = aify.d(arrayList.size());
            for (ahpj ahpjVar : ahvr.aN(arrayList)) {
                aiftVarD2.i(ahpjVar.d());
                aiftVarD.i(ahpjVar.j());
            }
            java.util.WeakHashMap weakHashMap2 = b;
            synchronized (weakHashMap2) {
                aify aifyVarH = aiftVarD2.h();
                if (aifyVarH == null) {
                    throw new java.lang.NullPointerException("Null spansNames");
                }
                aify aifyVarH2 = aiftVarD.h();
                if (aifyVarH2 == null) {
                    throw new java.lang.NullPointerException("Null extras");
                }
                weakHashMap2.put(th, new defpackage.ahqg(aifyVarH, aifyVarH2, uuidG, jL));
            }
        }
    }

    public static defpackage.uzx c(java.lang.Throwable th) {
        java.util.WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            for (java.lang.Throwable cause = th; cause != null; cause = cause.getCause()) {
                if (weakHashMap.containsKey(cause)) {
                    defpackage.ahqg ahqgVar = (defpackage.ahqg) weakHashMap.get(cause);
                    weakHashMap.put(th, ahqgVar);
                    return new defpackage.uzx(ahqgVar);
                }
            }
            return null;
        }
    }
}
