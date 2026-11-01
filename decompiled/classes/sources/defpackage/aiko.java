package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiko extends defpackage.aiho {
    public static final defpackage.aiko c = new defpackage.aiko(defpackage.aike.a, defpackage.aiju.a);
    final transient defpackage.aify d;

    public aiko(defpackage.aify aifyVar, java.util.Comparator comparator) {
        super(comparator);
        this.d = aifyVar;
    }

    @Override // defpackage.aiho
    public final defpackage.aiho B(java.lang.Object obj, boolean z) {
        return K(0, I(obj, z));
    }

    @Override // defpackage.aiho
    public final defpackage.aiho D(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        return F(obj, z).B(obj2, z2);
    }

    @Override // defpackage.aiho
    public final defpackage.aiho F(java.lang.Object obj, boolean z) {
        return K(J(obj, z), size());
    }

    @Override // defpackage.aiho, java.util.NavigableSet
    /* JADX INFO: renamed from: H */
    public final defpackage.ailj descendingIterator() {
        return this.d.a().listIterator(0);
    }

    final int I(java.lang.Object obj, boolean z) {
        defpackage.ahvr.ci(obj);
        int iBinarySearch = java.util.Collections.binarySearch(this.d, obj, ((defpackage.aiho) this).a);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final int J(java.lang.Object obj, boolean z) {
        defpackage.ahvr.ci(obj);
        int iBinarySearch = java.util.Collections.binarySearch(this.d, obj, ((defpackage.aiho) this).a);
        if (iBinarySearch >= 0) {
            return !z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    final defpackage.aiko K(int i, int i2) {
        if (i == 0) {
            if (i2 == size()) {
                return this;
            }
            i = 0;
        }
        if (i >= i2) {
            return G(this.a);
        }
        defpackage.aify aifyVar = this.d;
        return new defpackage.aiko(aifyVar.subList(i, i2), this.a);
    }

    @Override // defpackage.aifo
    public final int c(java.lang.Object[] objArr, int i) {
        return this.d.c(objArr, i);
    }

    @Override // defpackage.aiho, java.util.NavigableSet
    public final java.lang.Object ceiling(java.lang.Object obj) {
        int iJ = J(obj, true);
        if (iJ == size()) {
            return null;
        }
        return this.d.get(iJ);
    }

    @Override // defpackage.aifo, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return java.util.Collections.binarySearch(this.d, obj, this.a) >= 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        if (collection instanceof defpackage.aijo) {
            collection = ((defpackage.aijo) collection).i();
        }
        if (!airh.e(((defpackage.aiho) this).a, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        defpackage.ailj it = iterator();
        java.util.Iterator it2 = collection.iterator();
        if (it.hasNext()) {
            java.lang.Object next = it2.next();
            java.lang.Object next2 = it.next();
            while (true) {
                try {
                    int iA = a(next2, next);
                    if (iA >= 0) {
                        if (iA != 0) {
                            break;
                        }
                        if (!it2.hasNext()) {
                            return true;
                        }
                        next = it2.next();
                    } else {
                        if (!it.hasNext()) {
                            break;
                        }
                        next2 = it.next();
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.aifo
    public final int e() {
        return this.d.e();
    }

    @Override // defpackage.aihd, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                if (!airh.e(this.a, set)) {
                    return containsAll(set);
                }
                java.util.Iterator it = set.iterator();
                try {
                    defpackage.ailj it2 = iterator();
                    while (it2.hasNext()) {
                        java.lang.Object next = it2.next();
                        java.lang.Object next2 = it.next();
                        if (next2 == null || a(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (java.lang.ClassCastException | java.util.NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // defpackage.aifo
    public final int f() {
        return this.d.f();
    }

    @Override // defpackage.aiho, java.util.SortedSet
    public final java.lang.Object first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.d.get(0);
    }

    @Override // defpackage.aiho, java.util.NavigableSet
    public final java.lang.Object floor(java.lang.Object obj) {
        int I = I(obj, true) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.aihd, defpackage.aifo
    public final defpackage.aify g() {
        return this.d;
    }

    @Override // defpackage.aiho, java.util.NavigableSet
    public final java.lang.Object higher(java.lang.Object obj) {
        int iJ = J(obj, false);
        if (iJ == size()) {
            return null;
        }
        return this.d.get(iJ);
    }

    @Override // defpackage.aiho, defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public final defpackage.ailj iterator() {
        return this.d.listIterator(0);
    }

    @Override // defpackage.aifo
    public final boolean l() {
        return this.d.l();
    }

    @Override // defpackage.aiho, java.util.SortedSet
    public final java.lang.Object last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        return this.d.get(size() - 1);
    }

    @Override // defpackage.aiho, java.util.NavigableSet
    public final java.lang.Object lower(java.lang.Object obj) {
        int I = I(obj, false) - 1;
        if (I == -1) {
            return null;
        }
        return this.d.get(I);
    }

    @Override // defpackage.aifo
    public final java.lang.Object[] m() {
        return this.d.m();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.aiho, defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return super.writeReplace();
    }

    @Override // defpackage.aiho
    public final defpackage.aiho y() {
        java.util.Comparator comparatorReverseOrder = java.util.Collections.reverseOrder(this.a);
        return isEmpty() ? G(comparatorReverseOrder) : new defpackage.aiko(this.d.a(), comparatorReverseOrder);
    }
}
