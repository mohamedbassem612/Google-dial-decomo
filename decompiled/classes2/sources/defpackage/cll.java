package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cll implements java.util.ListIterator, aoow {
    private final androidx.compose.runtime.snapshots.SnapshotStateList a;
    private int b;
    private int c = -1;
    private java.util.List d;
    private int e;

    public cll(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i) {
        this.a = snapshotStateList;
        this.b = i - 1;
        this.d = snapshotStateList.c();
        this.e = cle.a(snapshotStateList);
    }

    private final void a() {
        if (cle.a(this.a) != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        a();
        int i = this.b + 1;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.add(i, obj);
        this.c = -1;
        this.b++;
        this.d = snapshotStateList.c();
        this.e = cle.a(snapshotStateList);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.d.size() + (-1);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        int i = this.b + 1;
        this.c = i;
        cle.c(i, this.d.size());
        java.lang.Object obj = this.d.get(i);
        this.b = i;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b + 1;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        a();
        cle.c(this.b, this.d.size());
        int i = this.b;
        this.c = i;
        java.lang.Object obj = this.d.get(i);
        this.b--;
        return obj;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.b(this.c);
        this.b--;
        this.c = -1;
        this.d = snapshotStateList.c();
        this.e = cle.a(snapshotStateList);
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        a();
        int i = this.c;
        if (i < 0) {
            throw new java.lang.IllegalStateException("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
        }
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.a;
        snapshotStateList.set(i, obj);
        this.d = snapshotStateList.c();
        this.e = cle.a(snapshotStateList);
    }
}
