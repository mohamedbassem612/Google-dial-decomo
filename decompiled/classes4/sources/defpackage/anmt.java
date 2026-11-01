package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anmt {
    static final defpackage.anmu a;

    static {
        defpackage.anmu anrdVar;
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference();
        try {
            anrdVar = (defpackage.anmu) java.lang.Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(defpackage.anmu.class).getConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException e) {
            atomicReference.set(e);
            anrdVar = new defpackage.anrd();
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException("Storage override failed to initialize", e2);
        }
        a = anrdVar;
        java.lang.Throwable th = (java.lang.Throwable) atomicReference.get();
        if (th != null) {
            defpackage.anmv.c.logp(java.util.logging.Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
