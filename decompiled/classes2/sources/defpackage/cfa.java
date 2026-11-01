package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfa implements java.util.List, aooy {
    private final /* synthetic */ int $cid;
    private final java.util.List a;
    private final int b;
    private int c;

    public cfa(java.util.List list, int i, int i2, int i3) {
        this.$cid = i3;
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2 = this.$cid;
        java.util.List list = this.a;
        if (i2 != 0) {
            list.add(i + this.b, obj);
            this.c++;
        } else {
            list.add(i + this.b, obj);
            this.c++;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        if (this.$cid != 0) {
            aooh.f(collection, "elements");
            this.a.addAll(i + this.b, collection);
            this.c += collection.size();
            if (collection.size() > 0) {
                return true;
            }
        } else {
            this.a.addAll(i + this.b, collection);
            int size = collection.size();
            this.c += size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.$cid;
        int i2 = this.c - 1;
        if (i != 0) {
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    this.a.remove(i2);
                    if (i2 == i3) {
                        break;
                    } else {
                        i2--;
                    }
                }
            }
            this.c = i3;
            return;
        }
        int i4 = this.b;
        if (i4 <= i2) {
            while (true) {
                this.a.remove(i2);
                if (i2 == i4) {
                    break;
                } else {
                    i2--;
                }
            }
        }
        this.c = i4;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            int i3 = this.c;
            while (i2 < i3) {
                if (!aooh.n(this.a.get(i2), obj)) {
                    i2++;
                }
            }
            return false;
        }
        int i4 = this.c;
        while (i2 < i4) {
            if (!aooh.n(this.a.get(i2), obj)) {
                i2++;
            }
        }
        return false;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if (this.$cid != 0) {
            aooh.f(collection, "elements");
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        } else {
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!contains(it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        if (this.$cid == 0) {
            cfd.a(this, i);
            return this.a.get(i + this.b);
        }
        adr.a(this, i);
        return this.a.get(i + this.b);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i;
        int i2 = this.$cid;
        int i3 = this.b;
        if (i2 != 0) {
            int i4 = this.c;
            i = i3;
            while (i < i4) {
                if (!aooh.n(this.a.get(i), obj)) {
                    i++;
                }
            }
            return -1;
        }
        int i5 = this.c;
        i = i3;
        while (i < i5) {
            if (!aooh.n(this.a.get(i), obj)) {
                i++;
            }
        }
        return -1;
        return i - i3;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.$cid;
        int i2 = this.c;
        int i3 = this.b;
        if (i != 0) {
            if (i2 == i3) {
                return true;
            }
        } else if (i2 == i3) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return this.$cid != 0 ? new defpackage.cfb(this, 0, 1, null) : new defpackage.cfb(this, 0, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i;
        int i2 = this.$cid;
        int i3 = this.c - 1;
        if (i2 != 0) {
            i = this.b;
            if (i > i3) {
                return -1;
            }
            while (!aooh.n(this.a.get(i3), obj)) {
                if (i3 == i) {
                    return -1;
                }
                i3--;
            }
        } else {
            i = this.b;
            if (i > i3) {
                return -1;
            }
            while (!aooh.n(this.a.get(i3), obj)) {
                if (i3 == i) {
                    return -1;
                }
                i3--;
            }
        }
        return i3 - i;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return this.$cid != 0 ? new defpackage.cfb(this, 0, 1, null) : new defpackage.cfb(this, 0, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            int i3 = this.c;
            while (i2 < i3) {
                java.util.List list = this.a;
                if (aooh.n(list.get(i2), obj)) {
                    list.remove(i2);
                    this.c--;
                } else {
                    i2++;
                }
            }
            return false;
        }
        int i4 = this.c;
        while (i2 < i4) {
            java.util.List list2 = this.a;
            if (aooh.n(list2.get(i2), obj)) {
                list2.remove(i2);
                this.c--;
            } else {
                i2++;
            }
        }
        return false;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (this.$cid != 0) {
            aooh.f(collection, "elements");
            int i = this.c;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.c) {
                return true;
            }
        } else {
            int i2 = this.c;
            java.util.Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                remove(it2.next());
            }
            if (i2 != this.c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        if (this.$cid != 0) {
            aooh.f(collection, "elements");
            int i = this.c;
            int i2 = i - 1;
            int i3 = this.b;
            if (i3 <= i2) {
                while (true) {
                    java.util.List list = this.a;
                    if (!collection.contains(list.get(i2))) {
                        list.remove(i2);
                        this.c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.c) {
                return true;
            }
        } else {
            int i4 = this.c;
            int i5 = i4 - 1;
            int i6 = this.b;
            if (i6 <= i5) {
                while (true) {
                    java.util.List list2 = this.a;
                    if (!collection.contains(list2.get(i5))) {
                        list2.remove(i5);
                        this.c--;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5--;
                }
            }
            if (i4 != this.c) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        if (this.$cid == 0) {
            cfd.a(this, i);
            return this.a.set(i + this.b, obj);
        }
        adr.a(this, i);
        return this.a.set(i + this.b, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.$cid;
        return this.c - this.b;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (this.$cid != 0) {
            adr.b(this, i, i2);
            return new defpackage.cfa(this, i, i2, 1);
        }
        cfd.b(this, i, i2);
        return new defpackage.cfa(this, i, i2, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        if (this.$cid == 0) {
            return aoob.b(this, objArr);
        }
        aooh.f(objArr, "array");
        return aoob.b(this, objArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return this.$cid != 0 ? new defpackage.cfb(this, i, 1, null) : new defpackage.cfb(this, i, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return this.$cid != 0 ? aoob.a(this) : aoob.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        int i = this.$cid;
        int i2 = this.c;
        if (i != 0) {
            this.c = i2 + 1;
            this.a.add(i2, obj);
        } else {
            this.c = i2 + 1;
            this.a.add(i2, obj);
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        if (this.$cid != 0) {
            aooh.f(collection, "elements");
            this.a.addAll(this.c, collection);
            this.c += collection.size();
            if (collection.size() > 0) {
                return true;
            }
        } else {
            this.a.addAll(this.c, collection);
            int size = collection.size();
            this.c += size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        if (this.$cid != 0) {
            adr.a(this, i);
            java.lang.Object objRemove = this.a.remove(i + this.b);
            this.c--;
            return objRemove;
        }
        cfd.a(this, i);
        java.lang.Object objRemove2 = this.a.remove(i + this.b);
        this.c--;
        return objRemove2;
    }
}
