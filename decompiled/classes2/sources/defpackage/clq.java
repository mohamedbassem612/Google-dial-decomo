package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class clq extends defpackage.clp implements java.util.Iterator, aoow {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clq(defpackage.clg clgVar, java.util.Iterator it, int i, byte[] bArr) {
        super(clgVar, it);
        this.$cid = i;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.$cid;
        java.util.Map.Entry entry = this.d;
        if (i != 0) {
            if (entry == null) {
                throw new java.lang.IllegalStateException();
            }
            a();
            return entry.getKey();
        }
        if (entry == null) {
            throw new java.lang.IllegalStateException();
        }
        a();
        return entry.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clq(defpackage.clg clgVar, java.util.Iterator it, int i) {
        super(clgVar, it);
        this.$cid = i;
    }
}
