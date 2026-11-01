package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajlr {
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.ajlr.class.getName());
    public static final defpackage.ajlr a = new defpackage.ajlr();
    private final java.util.concurrent.ConcurrentMap d = new j$.util.concurrent.ConcurrentHashMap();
    public final java.util.concurrent.ConcurrentMap b = new j$.util.concurrent.ConcurrentHashMap();

    private final synchronized void e(defpackage.ajep ajepVar, boolean z) {
        java.lang.String strD = ajepVar.d();
        if (z) {
            java.util.concurrent.ConcurrentMap concurrentMap = this.b;
            if (concurrentMap.containsKey(strD) && !((java.lang.Boolean) concurrentMap.get(strD)).booleanValue()) {
                throw new java.security.GeneralSecurityException("New keys are already disallowed for key type ".concat(strD));
            }
        }
        java.util.concurrent.ConcurrentMap concurrentMap2 = this.d;
        defpackage.ajep ajepVar2 = (defpackage.ajep) concurrentMap2.get(strD);
        if (ajepVar2 != null && !ajepVar2.getClass().equals(ajepVar.getClass())) {
            c.logp(java.util.logging.Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strD));
            throw new java.security.GeneralSecurityException(java.lang.String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strD, ajepVar2.getClass().getName(), ajepVar.getClass().getName()));
        }
        concurrentMap2.putIfAbsent(strD, ajepVar);
        this.b.put(strD, java.lang.Boolean.valueOf(z));
    }

    public final defpackage.ajep a(java.lang.String str, java.lang.Class cls) throws java.security.GeneralSecurityException {
        defpackage.ajep ajepVarB = b(str);
        if (ajepVarB.b().equals(cls)) {
            return ajepVarB;
        }
        throw new java.security.GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + java.lang.String.valueOf(ajepVarB.getClass()) + ", which only supports: " + ajepVarB.b().toString());
    }

    public final synchronized defpackage.ajep b(java.lang.String str) {
        java.util.concurrent.ConcurrentMap concurrentMap;
        concurrentMap = this.d;
        if (!concurrentMap.containsKey(str)) {
            throw new java.security.GeneralSecurityException(defpackage.a.bk(str, "No key manager found for key type ", ", see https://developers.google.com/tink/faq/registration_errors"));
        }
        return (defpackage.ajep) concurrentMap.get(str);
    }

    public final synchronized void c(defpackage.ajep ajepVar, boolean z) {
        d(ajepVar, 1, z);
    }

    public final synchronized void d(defpackage.ajep ajepVar, int i, boolean z) {
        if (!defpackage.ajsz.u(i)) {
            throw new java.security.GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        e(ajepVar, z);
    }
}
