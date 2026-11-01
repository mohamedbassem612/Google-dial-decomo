package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aiho extends defpackage.aihd implements java.util.NavigableSet, j$.util.SortedSet, defpackage.ailf {
    private static final long serialVersionUID = 912559;
    final transient java.util.Comparator a;
    transient defpackage.aiho b;

    public aiho(java.util.Comparator comparator) {
        this.a = comparator;
    }

    static defpackage.aiko G(java.util.Comparator comparator) {
        return defpackage.aiju.a.equals(comparator) ? defpackage.aiko.c : new defpackage.aiko(defpackage.aike.a, comparator);
    }

    private void readObject(java.io.ObjectInputStream objectInputStream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException("Use SerializedForm");
    }

    static defpackage.aiho x(java.util.Comparator comparator, int i, java.lang.Object... objArr) {
        if (i == 0) {
            return G(comparator);
        }
        defpackage.ahvr.ay(objArr, i);
        java.util.Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            java.lang.Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        java.util.Arrays.fill(objArr, i2, i, (java.lang.Object) null);
        if (i2 < (objArr.length >> 1)) {
            objArr = java.util.Arrays.copyOf(objArr, i2);
        }
        return new defpackage.aiko(defpackage.aify.i(objArr, i2), comparator);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiho headSet(java.lang.Object obj, boolean z) {
        defpackage.ahvr.ci(obj);
        return B(obj, z);
    }

    public abstract defpackage.aiho B(java.lang.Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiho subSet(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2) {
        defpackage.ahvr.ci(obj);
        defpackage.ahvr.ci(obj2);
        defpackage.ahvr.bM(this.a.compare(obj, obj2) <= 0);
        return D(obj, z, obj2, z2);
    }

    public abstract defpackage.aiho D(java.lang.Object obj, boolean z, java.lang.Object obj2, boolean z2);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiho tailSet(java.lang.Object obj, boolean z) {
        defpackage.ahvr.ci(obj);
        return F(obj, z);
    }

    public abstract defpackage.aiho F(java.lang.Object obj, boolean z);

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract defpackage.ailj descendingIterator();

    final int a(java.lang.Object obj, java.lang.Object obj2) {
        return this.a.compare(obj, obj2);
    }

    @java.lang.Deprecated
    public final void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object ceiling(java.lang.Object obj) {
        return defpackage.ahvr.bj(tailSet(obj, true), null);
    }

    @Override // java.util.SortedSet, defpackage.ailf
    public final java.util.Comparator comparator() {
        return this.a;
    }

    @Override // java.util.SortedSet
    public java.lang.Object first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object floor(java.lang.Object obj) {
        return defpackage.ahvr.aY(headSet(obj, true).descendingIterator(), null);
    }

    public final java.lang.Object getFirst() {
        return first();
    }

    public final java.lang.Object getLast() {
        return last();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet headSet(java.lang.Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public java.lang.Object higher(java.lang.Object obj) {
        return defpackage.ahvr.bj(tailSet(obj, false), null);
    }

    @Override // defpackage.aihd, defpackage.aifo, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: k */
    public abstract defpackage.ailj iterator();

    @Override // java.util.SortedSet
    public java.lang.Object last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public java.lang.Object lower(java.lang.Object obj) {
        return defpackage.ahvr.aY(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final java.lang.Object pollFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @java.lang.Deprecated
    public final java.lang.Object pollLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException();
    }

    @java.lang.Deprecated
    public final java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet subSet(java.lang.Object obj, java.lang.Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final /* synthetic */ java.util.SortedSet tailSet(java.lang.Object obj) {
        return tailSet(obj, true);
    }

    @Override // defpackage.aihd, defpackage.aifo
    public java.lang.Object writeReplace() {
        return new aihn(this.a, toArray());
    }

    public abstract defpackage.aiho y();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiho descendingSet() {
        defpackage.aiho aihoVar = this.b;
        if (aihoVar != null) {
            return aihoVar;
        }
        defpackage.aiho aihoVarY = y();
        this.b = aihoVarY;
        aihoVarY.b = this;
        return aihoVarY;
    }
}
