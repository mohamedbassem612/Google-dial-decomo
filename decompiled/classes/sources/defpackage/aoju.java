package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aoju extends defpackage.aojj implements java.util.Set, j$.util.Set, defpackage.aoow {
    protected aoju() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set = (java.util.Set) obj;
            if (set == null) {
                defpackage.aooh.i("other");
            }
            if (size() == set.size()) {
                return containsAll(set);
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        java.util.Iterator<E> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator iterator() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.aojj, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.Set.-CC.$default$spliterator(this);
    }
}
