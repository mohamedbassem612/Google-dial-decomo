package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class clu implements java.util.ListIterator, aoow {
    final /* synthetic */ aoor a;
    final /* synthetic */ defpackage.clv b;

    public clu(aoor aoorVar, defpackage.clv clvVar) {
        this.a = aoorVar;
        this.b = clvVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) throws aoiq {
        cle.e();
        throw new aoiq();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.a.a < this.b.a + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.a.a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        aoor aoorVar = this.a;
        int i = aoorVar.a + 1;
        defpackage.clv clvVar = this.b;
        cle.c(i, clvVar.a);
        aoorVar.a = i;
        return clvVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.a + 1;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        aoor aoorVar = this.a;
        defpackage.clv clvVar = this.b;
        int i = aoorVar.a;
        cle.c(i, clvVar.a);
        aoorVar.a = i - 1;
        return clvVar.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() throws aoiq {
        cle.e();
        throw new aoiq();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aoiq */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) throws aoiq {
        cle.e();
        throw new aoiq();
    }
}
