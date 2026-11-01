package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cfb implements java.util.ListIterator, aoow {
    private final /* synthetic */ int $cid;
    private final java.util.List a;
    private int b;

    public cfb(java.util.List list, int i, int i2, byte[] bArr) {
        this.$cid = i2;
        this.a = list;
        this.b = i - 1;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        if (this.$cid == 0) {
            this.a.add(this.b, obj);
            this.b++;
        } else {
            int i = this.b + 1;
            this.b = i;
            this.a.add(i, obj);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        int i2 = this.b;
        java.util.List list = this.a;
        if (i != 0) {
            if (i2 < list.size() - 1) {
                return true;
            }
        } else if (i2 < list.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            if (i2 >= 0) {
                return true;
            }
        } else if (i2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        int i = this.$cid;
        int i2 = this.b;
        if (i == 0) {
            this.b = i2 + 1;
            return this.a.get(i2);
        }
        int i3 = i2 + 1;
        this.b = i3;
        return this.a.get(i3);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i = this.$cid;
        int i2 = this.b;
        return i != 0 ? i2 + 1 : i2;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            this.b = i2 - 1;
            return this.a.get(i2);
        }
        int i3 = i2 - 1;
        this.b = i3;
        return this.a.get(i3);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i = this.$cid;
        int i2 = this.b;
        return i == 0 ? i2 - 1 : i2;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.$cid != 0) {
            this.a.remove(this.b);
            this.b--;
        } else {
            int i = this.b - 1;
            this.b = i;
            this.a.remove(i);
        }
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        int i = this.$cid;
        java.util.List list = this.a;
        int i2 = this.b;
        if (i != 0) {
            list.set(i2, obj);
        } else {
            list.set(i2, obj);
        }
    }

    public cfb(java.util.List list, int i, int i2) {
        this.$cid = i2;
        this.a = list;
        this.b = i;
    }
}
