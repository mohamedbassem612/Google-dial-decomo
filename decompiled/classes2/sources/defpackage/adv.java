package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
class adv implements java.util.Set, aoow {
    public final ads b;

    public adv(ads adsVar) {
        this.b = adsVar;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        return anty.al();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        a.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.b.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        aooh.f(collection, "elements");
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.a(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.adv) {
            return aooh.n(this.b, ((defpackage.adv) obj).b);
        }
        if (obj instanceof java.util.Set) {
            ads adsVar = this.b;
            java.util.Set set = (java.util.Set) obj;
            if (adsVar.g == set.size()) {
                java.lang.Object[] objArr = adsVar.b;
                long[] jArr = adsVar.c;
                int i = adsVar.e;
                while (i != Integer.MAX_VALUE) {
                    long j = jArr[i] >> 31;
                    if (set.contains(objArr[i])) {
                        i = (int) (j & 2147483647L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.b.b();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return aooc.e(new defpackage.adu(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return anty.al();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        return anty.am();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return this.b.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        aooh.f(objArr, "array");
        return aoob.b(this, objArr);
    }

    public final java.lang.String toString() {
        return this.b.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return aoob.a(this);
    }
}
