package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dax implements java.util.List, j$.util.List, defpackage.aoow {
    public final defpackage.adq b = new defpackage.adq(16);
    public final defpackage.acw c = new defpackage.acw(16);
    public int a = -1;

    public final int a() {
        return this.b.b;
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final long b() {
        long jE = defpackage.wl.e(Float.POSITIVE_INFINITY, false, false);
        int i = this.a + 1;
        int iA = a() - 1;
        if (i <= iA) {
            while (true) {
                defpackage.acw acwVar = this.c;
                if (i < 0 || i >= acwVar.b) {
                    defpackage.un.c("Index must be between 0 and size");
                }
                long j = acwVar.a[i];
                if (das.a(j, jE) < 0) {
                    jE = j;
                }
                if ((java.lang.Float.intBitsToFloat((int) (jE >> 32)) < 0.0f && das.c(jE)) || i == iA) {
                    break;
                }
                i++;
            }
        }
        return jE;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.cmv get(int i) {
        java.lang.Object objC = this.b.c(i);
        if (objC == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        }
        return (defpackage.cmv) objC;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a = -1;
        this.b.l();
        this.c.b = 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        return (obj instanceof defpackage.cmv) && indexOf((defpackage.cmv) obj) != -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((defpackage.cmv) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i < i2) {
            this.b.m(i, i2);
            defpackage.acw acwVar = this.c;
            if (i < 0 || i > (i3 = acwVar.b) || i2 < 0 || i2 > i3) {
                defpackage.un.c("Index must be between 0 and size");
            }
            if (i2 < i) {
                defpackage.un.a("The end index must be < start index");
            }
            if (i2 != i) {
                int i4 = acwVar.b;
                if (i2 < i4) {
                    long[] jArr = acwVar.a;
                    defpackage.ajsz.dc(jArr, jArr, i, i2, i4);
                }
                acwVar.b -= i2 - i;
            }
        }
    }

    public final boolean e(float f, boolean z) {
        if (this.a != a() - 1) {
            return das.a(b(), defpackage.wl.e(f, z, false)) > 0;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable.-CC.$default$forEach(this, consumer);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cmv)) {
            return -1;
        }
        defpackage.cmv cmvVar = (defpackage.cmv) obj;
        int iA = a() - 1;
        if (iA < 0) {
            return -1;
        }
        int i = 0;
        while (!defpackage.aooh.n(this.b.c(i), cmvVar)) {
            if (i == iA) {
                return -1;
            }
            i++;
        }
        return i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.f();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new dav(this, 0, 7);
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof defpackage.cmv)) {
            return -1;
        }
        defpackage.cmv cmvVar = (defpackage.cmv) obj;
        for (int iA = a() - 1; iA >= 0; iA--) {
            if (defpackage.aooh.n(this.b.c(iA), cmvVar)) {
                return iA;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new dav(this, 0, 7);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream parallelStream() {
        return j$.util.Collection.-CC.$default$parallelStream(this);
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ java.lang.Object removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return j$.util.Collection.-CC.$default$removeIf(this, predicate);
    }

    public final /* synthetic */ java.lang.Object removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.List.-CC.$default$spliterator(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ j$.util.stream.Stream stream() {
        return j$.util.Collection.-CC.$default$stream(this);
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        return new daw(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }

    @Override // java.util.Collection
    public final /* synthetic */ java.lang.Object[] toArray(java.util.function.IntFunction intFunction) {
        return j$.util.Collection.-CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.aoob.b(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new dav(this, i, 6);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
