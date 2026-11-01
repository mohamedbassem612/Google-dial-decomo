package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aida extends java.util.AbstractCollection implements defpackage.aijo {
    public int a(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        a(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        defpackage.ahvr.ci(collection);
        if (!(collection instanceof defpackage.aijo)) {
            if (collection.isEmpty()) {
                return false;
            }
            return defpackage.ahvr.bd(this, collection.iterator());
        }
        defpackage.aijo aijoVar = (defpackage.aijo) collection;
        if (aijoVar instanceof defpackage.aicv) {
            defpackage.aicv aicvVar = (defpackage.aicv) aijoVar;
            if (aicvVar.isEmpty()) {
                return false;
            }
            for (int iA = aicvVar.a.a(); iA >= 0; iA = aicvVar.a.e(iA)) {
                a(aicvVar.a.i(iA), aicvVar.a.c(iA));
            }
        } else {
            if (aijoVar.isEmpty()) {
                return false;
            }
            for (aijp aijpVar : aijoVar.j()) {
                a(aijpVar.a, aijpVar.a());
            }
        }
        return true;
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aijo
    public final boolean contains(java.lang.Object obj) {
        return b(obj) > 0;
    }

    public int d(java.lang.Object obj, int i) {
        throw null;
    }

    public abstract java.util.Iterator e();

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return airh.h(this, obj);
    }

    public abstract java.util.Iterator f();

    public boolean h(java.lang.Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection, defpackage.aijo
    public final int hashCode() {
        return new aijr(this).hashCode();
    }

    @Override // defpackage.aijo
    public final java.util.Set i() {
        return new aijq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return new aijr(this).isEmpty();
    }

    @Override // defpackage.aijo
    public final java.util.Set j() {
        return new aijr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.aijo
    public final boolean remove(java.lang.Object obj) {
        return d(obj, 1) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection instanceof defpackage.aijo) {
            collection = ((defpackage.aijo) collection).i();
        }
        return i().removeAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        defpackage.ahvr.ci(collection);
        if (collection instanceof defpackage.aijo) {
            collection = ((defpackage.aijo) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final java.lang.String toString() {
        return new aijr(this).toString();
    }
}
