package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class clv implements java.util.List, aooy {
    public int a;
    private final androidx.compose.runtime.snapshots.SnapshotStateList b;
    private final int c;
    private int d;

    public clv(androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, int i, int i2) {
        this.b = snapshotStateList;
        this.c = i;
        this.d = cle.a(snapshotStateList);
        this.a = i2 - i;
    }

    private final void b() {
        if (cle.a(this.b) != this.d) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final java.lang.Object a(int i) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        java.lang.Object objB = snapshotStateList.b(this.c + i);
        this.a--;
        this.d = cle.a(snapshotStateList);
        return objB;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        b();
        int i = this.c + this.a;
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(i, obj);
        this.a++;
        this.d = cle.a(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        boolean zAddAll = snapshotStateList.addAll(i + this.c, collection);
        if (zAddAll) {
            this.a += collection.size();
            this.d = cle.a(snapshotStateList);
        }
        return zAddAll;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0074 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void clear() {
        /*
            r11 = this;
            int r0 = r11.a
            if (r0 <= 0) goto L83
            r11.b()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = r11.b
            int r1 = r11.c
            int r2 = r11.a
            int r2 = r2 + r1
        Le:
            java.lang.Object r3 = cle.a
            monitor-enter(r3)
            clt r4 = r0.a     // Catch: java.lang.Throwable -> L80
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r4 != 0) goto L1a
            aooh.h(r5)     // Catch: java.lang.Throwable -> L80
        L1a:
            clt r4 = ckw.f(r4, r0)     // Catch: java.lang.Throwable -> L80
            clm r4 = (clm) r4     // Catch: java.lang.Throwable -> L80
            int r5 = r4.b     // Catch: java.lang.Throwable -> L80
            chm r4 = r4.a     // Catch: java.lang.Throwable -> L80
            monitor-exit(r3)
            if (r4 != 0) goto L2a
            aooh.g()
        L2a:
            cht r6 = r4.j()
            java.util.List r7 = r6.subList(r1, r2)
            r7.clear()
            chm r6 = r6.c()
            boolean r4 = aooh.n(r6, r4)
            r7 = 0
            if (r4 != 0) goto L77
            clt r4 = r0.a
            if (r4 != 0) goto L49
            java.lang.String r8 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            aooh.h(r8)
        L49:
            java.lang.Object r8 = ckw.b
            monitor-enter(r8)
            cko r9 = ckw.b()     // Catch: java.lang.Throwable -> L74
            clt r4 = ckw.k(r4, r0, r9)     // Catch: java.lang.Throwable -> L74
            clm r4 = (clm) r4     // Catch: java.lang.Throwable -> L74
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L74
            int r10 = r4.b     // Catch: java.lang.Throwable -> L71
            if (r10 != r5) goto L68
            r4.a = r6     // Catch: java.lang.Throwable -> L71
            int r5 = r4.c     // Catch: java.lang.Throwable -> L71
            r6 = 1
            int r5 = r5 + r6
            r4.c = r5     // Catch: java.lang.Throwable -> L71
            int r10 = r10 + 1
            r4.b = r10     // Catch: java.lang.Throwable -> L71
            goto L69
        L68:
            r6 = r7
        L69:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r8)
            ckw.r(r9, r0)
            if (r6 == 0) goto Le
            goto L77
        L71:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L74
            throw r11     // Catch: java.lang.Throwable -> L74
        L74:
            r11 = move-exception
            monitor-exit(r8)
            throw r11
        L77:
            r11.a = r7
            int r0 = cle.a(r0)
            r11.d = r0
            goto L83
        L80:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clv.clear():void");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
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

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        b();
        cle.c(i, this.a);
        return this.b.get(this.c + i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        b();
        int i = this.c;
        aopp aoppVarA = aooc.C(i, this.a + i).a();
        while (aoppVarA.a) {
            int iA = aoppVarA.a();
            if (aooh.n(obj, this.b.get(iA))) {
                return iA - i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        b();
        int i = this.c;
        for (int i2 = (this.a + i) - 1; i2 >= i; i2--) {
            if (aooh.n(obj, this.b.get(i2))) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        b();
        aoor aoorVar = new aoor();
        aoorVar.a = i - 1;
        return new defpackage.clu(aoorVar, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0075 */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean retainAll(java.util.Collection r14) {
        /*
            r13 = this;
            r13.b()
            int r0 = r13.c
            int r1 = r13.a
            int r1 = r1 + r0
            androidx.compose.runtime.snapshots.SnapshotStateList r2 = r13.b
            int r3 = r2.a()
        Le:
            java.lang.Object r4 = cle.a
            monitor-enter(r4)
            clt r5 = r2.a     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r5 != 0) goto L1a
            aooh.h(r6)     // Catch: java.lang.Throwable -> L8e
        L1a:
            clt r5 = ckw.f(r5, r2)     // Catch: java.lang.Throwable -> L8e
            clm r5 = (clm) r5     // Catch: java.lang.Throwable -> L8e
            int r6 = r5.b     // Catch: java.lang.Throwable -> L8e
            chm r5 = r5.a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r4)
            if (r5 != 0) goto L2a
            aooh.g()
        L2a:
            cht r7 = r5.j()
            java.util.List r8 = r7.subList(r0, r1)
            r8.retainAll(r14)
            chm r7 = r7.c()
            boolean r5 = aooh.n(r7, r5)
            r8 = 0
            r9 = 1
            if (r5 != 0) goto L78
            clt r5 = r2.a
            if (r5 != 0) goto L4a
            java.lang.String r10 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            aooh.h(r10)
        L4a:
            java.lang.Object r10 = ckw.b
            monitor-enter(r10)
            cko r11 = ckw.b()     // Catch: java.lang.Throwable -> L75
            clt r5 = ckw.k(r5, r2, r11)     // Catch: java.lang.Throwable -> L75
            clm r5 = (clm) r5     // Catch: java.lang.Throwable -> L75
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L75
            int r12 = r5.b     // Catch: java.lang.Throwable -> L72
            if (r12 != r6) goto L69
            r5.a = r7     // Catch: java.lang.Throwable -> L72
            int r6 = r5.c     // Catch: java.lang.Throwable -> L72
            int r6 = r6 + r9
            r5.c = r6     // Catch: java.lang.Throwable -> L72
            int r12 = r12 + 1
            r5.b = r12     // Catch: java.lang.Throwable -> L72
            r5 = r9
            goto L6a
        L69:
            r5 = r8
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L75
            monitor-exit(r10)
            ckw.r(r11, r2)
            if (r5 == 0) goto Le
            goto L78
        L72:
            r13 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L75
            throw r13     // Catch: java.lang.Throwable -> L75
        L75:
            r13 = move-exception
            monitor-exit(r10)
            throw r13
        L78:
            int r14 = r2.a()
            int r3 = r3 - r14
            if (r3 <= 0) goto L8d
            androidx.compose.runtime.snapshots.SnapshotStateList r14 = r13.b
            int r14 = cle.a(r14)
            r13.d = r14
            int r14 = r13.a
            int r14 = r14 - r3
            r13.a = r14
            r8 = r9
        L8d:
            return r8
        L8e:
            r13 = move-exception
            monitor-exit(r4)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clv.retainAll(java.util.Collection):boolean");
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        cle.c(i, this.a);
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        java.lang.Object obj2 = snapshotStateList.set(i + this.c, obj);
        this.d = cle.a(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.a) {
            cdh.a("fromIndex or toIndex are out of bounds");
        }
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        int i3 = this.c;
        return new defpackage.clv(snapshotStateList, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return aoob.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return aoob.b(this, objArr);
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        return a(i);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        b();
        androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = this.b;
        snapshotStateList.add(this.c + i, obj);
        this.a++;
        this.d = cle.a(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.a, collection);
    }
}
