package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adl extends defpackage.aea implements java.util.Set, defpackage.aopb {
    public final defpackage.ady a;

    public adl(defpackage.ady adyVar) {
        super(adyVar);
        this.a = adyVar;
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        return this.a.j(obj);
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        return this.a.k(collection);
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new adk(this, 0);
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.l(obj);
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        defpackage.ady adyVar = this.a;
        int i = adyVar.d;
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            adyVar.e(it.next());
        }
        return i != adyVar.d;
    }

    @Override // defpackage.aea, java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.aooh.f(collection, "elements");
        if (collection == null) {
            defpackage.aooh.i("elements");
        }
        defpackage.ady adyVar = this.a;
        java.lang.Object[] objArr = adyVar.b;
        int i = adyVar.d;
        long[] jArr = adyVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = ~jArr[i2];
                long j2 = -9187201950435737472L;
                while (true) {
                    j &= j2;
                    if (j == 0) {
                        break;
                    }
                    int iNumberOfTrailingZeros = (i2 << 3) + (java.lang.Long.numberOfTrailingZeros(j) >>> 3);
                    if (!defpackage.ajsz.cj(collection, objArr[iNumberOfTrailingZeros])) {
                        adyVar.i(iNumberOfTrailingZeros);
                    }
                    j2 = (-1) + j;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != adyVar.d;
    }
}
