package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoji implements java.io.Serializable, defpackage.aoir {
    private defpackage.aomy a;
    private java.lang.Object b = defpackage.aoje.a;

    public aoji(defpackage.aomy aomyVar) {
        this.a = aomyVar;
    }

    private final void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final java.lang.Object writeReplace() {
        return new aoip(a());
    }

    @Override // defpackage.aoir
    public final java.lang.Object a() {
        if (this.b == defpackage.aoje.a) {
            defpackage.aomy aomyVar = this.a;
            if (aomyVar == null) {
                defpackage.aooh.g();
            }
            this.b = aomyVar.a();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.aoir
    public final boolean b() {
        throw null;
    }

    public final java.lang.String toString() {
        return this.b != defpackage.aoje.a ? java.lang.String.valueOf(a()) : "Lazy value not initialized yet.";
    }
}
