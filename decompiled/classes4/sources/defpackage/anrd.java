package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anrd extends defpackage.anmu {
    private static final java.util.logging.Logger b = java.util.logging.Logger.getLogger(defpackage.anrd.class.getName());
    static final java.lang.ThreadLocal a = new java.lang.ThreadLocal();

    @Override // defpackage.anmu
    public final defpackage.anmv a() {
        defpackage.anmv anmvVar = (defpackage.anmv) a.get();
        return anmvVar == null ? defpackage.anmv.d : anmvVar;
    }

    @Override // defpackage.anmu
    public final defpackage.anmv b(defpackage.anmv anmvVar) {
        defpackage.anmv anmvVarA = a();
        a.set(anmvVar);
        return anmvVarA;
    }

    @Override // defpackage.anmu
    public final void c(defpackage.anmv anmvVar, defpackage.anmv anmvVar2) {
        if (a() != anmvVar) {
            b.logp(java.util.logging.Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new java.lang.Throwable().fillInStackTrace());
        }
        defpackage.anmv anmvVar3 = defpackage.anmv.d;
        java.lang.ThreadLocal threadLocal = a;
        if (anmvVar2 != anmvVar3) {
            threadLocal.set(anmvVar2);
        } else {
            threadLocal.set(null);
        }
    }
}
