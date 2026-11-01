package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xte extends java.io.ByteArrayOutputStream {
    final /* synthetic */ defpackage.xtf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xte(defpackage.xtf xtfVar, int i) {
        super(i);
        j$.util.Objects.requireNonNull(xtfVar);
        this.a = xtfVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final java.lang.String toString() {
        try {
            return new java.lang.String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
