package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class chq extends defpackage.aojo implements j$.util.List, defpackage.chm {
    @Override // defpackage.aojj, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aojj, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.chm
    public defpackage.chm d(java.util.Collection collection) {
        cht chtVarJ = j();
        chtVarJ.addAll(collection);
        return chtVarJ.c();
    }

    @Override // defpackage.chm
    public final defpackage.chm e(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? h(iIndexOf) : this;
    }

    @Override // defpackage.chm
    public final defpackage.chm f(java.util.Collection collection) {
        return g(new bru(collection, 20));
    }

    @Override // defpackage.aojo, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.aojo, java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.aojo, java.util.List
    public final /* synthetic */ java.util.List subList(int i, int i2) {
        return new chj(this, i, i2);
    }
}
