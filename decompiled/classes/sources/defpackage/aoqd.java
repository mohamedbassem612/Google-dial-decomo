package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqd implements defpackage.aoql {
    private final java.util.concurrent.atomic.AtomicReference a;

    public aoqd(defpackage.aoql aoqlVar) {
        this.a = new java.util.concurrent.atomic.AtomicReference(aoqlVar);
    }

    @Override // defpackage.aoql
    public final java.util.Iterator a() {
        defpackage.aoql aoqlVar = (defpackage.aoql) this.a.getAndSet(null);
        if (aoqlVar != null) {
            return aoqlVar.a();
        }
        throw new java.lang.IllegalStateException("This sequence can be consumed only once.");
    }
}
