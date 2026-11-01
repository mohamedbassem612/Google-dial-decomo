package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aipf implements java.util.Iterator {
    final /* synthetic */ aipg a;
    private final ainp b;
    private int c;
    private int d;

    public aipf(aipg aipgVar, ainp ainpVar, int i) {
        j$.util.Objects.requireNonNull(aipgVar);
        this.a = aipgVar;
        this.b = ainpVar;
        int i2 = i & 31;
        this.c = i2;
        this.d = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object objC = this.b.c(this.a.f(this.c));
        int i = this.d;
        if (i != 0) {
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(i) + 1;
            this.d >>>= iNumberOfTrailingZeros;
            this.c += iNumberOfTrailingZeros;
        } else {
            this.c = -1;
        }
        return objC;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
