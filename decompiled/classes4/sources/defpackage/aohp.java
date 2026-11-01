package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aohp {
    static final anma a;
    public static final /* synthetic */ int b = 0;
    private static final java.util.logging.Logger c = java.util.logging.Logger.getLogger(defpackage.aohp.class.getName());

    static {
        if (!ahvr.cp(java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE");
        }
        a = new anma("internal-stub-type", (java.lang.Object) null);
    }

    private aohp() {
    }

    public static ajcq a(ajsz ajszVar, java.lang.Object obj) {
        defpackage.aohk aohkVar = new defpackage.aohk(ajszVar);
        b(ajszVar, obj, new defpackage.aoho(aohkVar));
        return aohkVar;
    }

    public static void b(ajsz ajszVar, java.lang.Object obj, defpackage.aohl aohlVar) {
        c(ajszVar, aohlVar);
        try {
            ajszVar.dy(obj);
            ajszVar.dw();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            throw d(ajszVar, e);
        }
    }

    public static void c(ajsz ajszVar, defpackage.aohl aohlVar) {
        ajszVar.a(aohlVar, new anph());
        aohlVar.f();
    }

    private static java.lang.RuntimeException d(ajsz ajszVar, java.lang.Throwable th) {
        try {
            ajszVar.dv((java.lang.String) null, th);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            c.logp(java.util.logging.Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        throw new java.lang.AssertionError(th);
    }
}
