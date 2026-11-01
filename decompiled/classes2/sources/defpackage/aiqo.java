package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqo implements java.util.Iterator {
    final /* synthetic */ aiqp a;
    private int b;

    public aiqo(aiqp aiqpVar) {
        j$.util.Objects.requireNonNull(aiqpVar);
        this.a = aiqpVar;
        this.b = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.size();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.b;
        aiqp aiqpVar = this.a;
        if (i >= aiqpVar.size()) {
            throw new java.util.NoSuchElementException();
        }
        aiqq aiqqVar = aiqpVar.b;
        java.lang.Object obj = aiqqVar.b[aiqpVar.b() + i];
        this.b = i + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
