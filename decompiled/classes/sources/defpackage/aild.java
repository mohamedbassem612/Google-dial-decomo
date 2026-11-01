package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aild extends java.util.AbstractSet {
    static int d(java.util.Set set) {
        return set instanceof defpackage.aild ? ((defpackage.aild) set).a() : set.size();
    }

    static int e(java.util.Set set) {
        return set instanceof defpackage.aild ? ((defpackage.aild) set).b() : set.size();
    }

    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.ailj iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        int iD;
        int iE;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof java.util.Set) && b() <= (iD = d((set = (java.util.Set) obj))) && a() >= (iE = e(set))) {
            defpackage.ailj it = iterator();
            int i = 0;
            while (it.hasNext()) {
                try {
                    if (set.contains(it.next())) {
                        i++;
                    }
                } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                }
            }
            if (i == iD) {
                return true;
            }
            if (i >= iE) {
                java.util.Iterator it2 = set.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    it2.next();
                    i2++;
                    if (i2 > i) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final defpackage.aihd f() {
        int iA = a();
        if (iA == 0) {
            return defpackage.aikn.a;
        }
        defpackage.aihb aihbVarI = defpackage.aihd.i(iA);
        defpackage.ailj it = iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            defpackage.ahvr.ci(next);
            aihbVarI.c(next);
        }
        return aihbVarI.g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }
}
