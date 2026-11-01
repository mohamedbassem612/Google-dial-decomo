package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aipd implements java.util.Iterator {
    final /* synthetic */ defpackage.aipe a;
    private int b;

    public aipd(defpackage.aipe aipeVar) {
        j$.util.Objects.requireNonNull(aipeVar);
        this.a = aipeVar;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.a.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        aipg aipgVar = this.a.a;
        return aipgVar.e(aipgVar.a[i] & 31);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
