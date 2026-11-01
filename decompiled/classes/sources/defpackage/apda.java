package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apda extends defpackage.apdb {
    public static final defpackage.apda a = new defpackage.apda();

    private apda() {
        super(defpackage.apde.c, defpackage.apde.d, defpackage.apde.e, defpackage.apde.a);
    }

    @Override // defpackage.apdb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.aosp
    public final defpackage.aosp e(int i) {
        defpackage.aosv.B(i);
        return i < defpackage.apde.c ? super.e(i) : this;
    }

    @Override // defpackage.aosp
    public final java.lang.String toString() {
        return "Dispatchers.Default";
    }
}
