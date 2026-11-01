package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cfi implements java.util.Iterator, aoow {
    private final cfm a;
    private final int b;
    private int c;
    private final int d;

    public cfi(cfm cfmVar, int i, int i2) {
        this.a = cfmVar;
        this.b = i2;
        this.c = i;
        this.d = cfmVar.g;
        if (cfmVar.f) {
            cfo.f();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        cfm cfmVar = this.a;
        int i = cfmVar.g;
        int i2 = this.d;
        if (i != i2) {
            cfo.f();
        }
        int i3 = this.c;
        this.c = cfmVar.a[(i3 * 5) + 3] + i3;
        return new defpackage.cfn(cfmVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
