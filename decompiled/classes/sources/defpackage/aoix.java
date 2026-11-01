package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoix implements java.io.Serializable, defpackage.aoir {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.aoix.class, java.lang.Object.class, "c");
    private volatile defpackage.aomy b;
    private volatile java.lang.Object c = defpackage.aoje.a;

    public aoix(defpackage.aomy aomyVar) {
        this.b = aomyVar;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new aoip(a());
    }

    @Override // defpackage.aoir
    public final java.lang.Object a() {
        java.lang.Object obj = this.c;
        defpackage.aoje aojeVar = defpackage.aoje.a;
        if (obj != aojeVar) {
            return obj;
        }
        defpackage.aomy aomyVar = this.b;
        if (aomyVar != null) {
            java.lang.Object objA = aomyVar.a();
            if (defpackage.anty.ag(a, this, aojeVar, objA)) {
                this.b = null;
                return objA;
            }
        }
        return this.c;
    }

    @Override // defpackage.aoir
    public final boolean b() {
        throw null;
    }

    public final java.lang.String toString() {
        return this.c != defpackage.aoje.a ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
