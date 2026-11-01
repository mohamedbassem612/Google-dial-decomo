package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aeg implements java.util.Iterator, aoow {
    final /* synthetic */ aed a;
    private int b;

    public aeg(aed aedVar) {
        this.a = aedVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        this.b = i + 1;
        return this.a.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
