package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class SnapshotStateList implements android.os.Parcelable, java.util.List, java.util.RandomAccess, defpackage.clr, defpackage.aooy {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.cld();
    public defpackage.clt a;

    public SnapshotStateList(defpackage.chm chmVar) {
        defpackage.cko ckoVarB = defpackage.ckw.b();
        defpackage.clm clmVar = new defpackage.clm(ckoVarB.v(), chmVar);
        if (!(ckoVarB instanceof defpackage.ckf)) {
            clmVar.h = new defpackage.clm(1L, chmVar);
        }
        this.a = clmVar;
    }

    public final int a() {
        return defpackage.cle.b(this).a.size();
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        int i2;
        defpackage.chm chmVar;
        defpackage.cko ckoVarB;
        boolean z;
        do {
            java.lang.Object obj2 = defpackage.cle.a;
            synchronized (obj2) {
                defpackage.clt cltVar = this.a;
                if (cltVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                }
                defpackage.clm clmVar = (defpackage.clm) defpackage.ckw.f(cltVar, this);
                i2 = clmVar.b;
                chmVar = clmVar.a;
            }
            if (chmVar == null) {
                defpackage.aooh.g();
            }
            defpackage.chm chmVarC = chmVar.c(i, obj);
            if (defpackage.aooh.n(chmVarC, chmVar)) {
                return;
            }
            defpackage.clt cltVar2 = this.a;
            if (cltVar2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            }
            synchronized (defpackage.ckw.b) {
                try {
                    ckoVarB = defpackage.ckw.b();
                    defpackage.clm clmVar2 = (defpackage.clm) defpackage.ckw.k(cltVar2, this, ckoVarB);
                    synchronized (obj2) {
                        try {
                            int i3 = clmVar2.b;
                            if (i3 == i2) {
                                clmVar2.a = chmVarC;
                                z = true;
                                clmVar2.c++;
                                clmVar2.b = i3 + 1;
                            } else {
                                z = false;
                            }
                        } catch (java.lang.Throwable th) {
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            }
            defpackage.ckw.r(ckoVarB, this);
        } while (!z);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean addAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.cle.a
            monitor-enter(r0)
            clt r1 = r9.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r1 != 0) goto Lc
            defpackage.aooh.h(r2)     // Catch: java.lang.Throwable -> L5e
        Lc:
            clt r1 = defpackage.ckw.f(r1, r9)     // Catch: java.lang.Throwable -> L5e
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.b     // Catch: java.lang.Throwable -> L5e
            chm r1 = r1.a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            if (r1 != 0) goto L1c
            defpackage.aooh.g()
        L1c:
            chm r3 = r1.d(r10)
            boolean r1 = defpackage.aooh.n(r3, r1)
            r4 = 0
            if (r1 != 0) goto L57
            clt r1 = r9.a
            if (r1 != 0) goto L30
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            defpackage.aooh.h(r5)
        L30:
            java.lang.Object r5 = defpackage.ckw.b
            monitor-enter(r5)
            cko r6 = defpackage.ckw.b()     // Catch: java.lang.Throwable -> L5b
            clt r1 = defpackage.ckw.k(r1, r9, r6)     // Catch: java.lang.Throwable -> L5b
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5b
            int r7 = r1.b     // Catch: java.lang.Throwable -> L58
            r8 = 1
            if (r7 != r2) goto L4f
            r1.a = r3     // Catch: java.lang.Throwable -> L58
            int r2 = r1.c     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + r8
            r1.c = r2     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 1
            r1.b = r7     // Catch: java.lang.Throwable -> L58
            r4 = r8
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            defpackage.ckw.r(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L57:
            return r4
        L58:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L5b:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L5e:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.addAll(java.util.Collection):boolean");
    }

    public final java.lang.Object b(int i) {
        int i2;
        defpackage.chm chmVar;
        defpackage.cko ckoVarB;
        boolean z;
        java.lang.Object obj = get(i);
        do {
            java.lang.Object obj2 = defpackage.cle.a;
            synchronized (obj2) {
                defpackage.clt cltVar = this.a;
                if (cltVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                }
                defpackage.clm clmVar = (defpackage.clm) defpackage.ckw.f(cltVar, this);
                i2 = clmVar.b;
                chmVar = clmVar.a;
            }
            if (chmVar == null) {
                defpackage.aooh.g();
            }
            defpackage.chm chmVarH = chmVar.h(i);
            if (defpackage.aooh.n(chmVarH, chmVar)) {
                break;
            }
            defpackage.clt cltVar2 = this.a;
            if (cltVar2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            }
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                defpackage.clm clmVar2 = (defpackage.clm) defpackage.ckw.k(cltVar2, this, ckoVarB);
                synchronized (obj2) {
                    int i3 = clmVar2.b;
                    if (i3 == i2) {
                        clmVar2.a = chmVarH;
                        z = true;
                        clmVar2.c++;
                        clmVar2.b = i3 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.ckw.r(ckoVarB, this);
        } while (!z);
        return obj;
    }

    public final java.util.List c() {
        return defpackage.cle.b(this).a;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        defpackage.cko ckoVarB;
        defpackage.clt cltVar = this.a;
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        }
        synchronized (defpackage.ckw.b) {
            ckoVarB = defpackage.ckw.b();
            defpackage.clm clmVar = (defpackage.clm) defpackage.ckw.k(cltVar, this, ckoVarB);
            synchronized (defpackage.cle.a) {
                clmVar.a = defpackage.chx.a;
                clmVar.b++;
                clmVar.c++;
            }
        }
        defpackage.ckw.r(ckoVarB, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return defpackage.cle.b(this).a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        return defpackage.cle.b(this).a.containsAll(collection);
    }

    @Override // defpackage.clr
    public final defpackage.clt d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.clr
    public final void e(defpackage.clt cltVar) {
        cltVar.h = this.a;
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        }
        this.a = (defpackage.clm) cltVar;
    }

    @Override // defpackage.clr
    public final /* synthetic */ defpackage.clt g(defpackage.clt cltVar, defpackage.clt cltVar2, defpackage.clt cltVar3) {
        return null;
    }

    @Override // java.util.List
    public final java.lang.Object get(int i) {
        return defpackage.cle.b(this).a.get(i);
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        return defpackage.cle.b(this).a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return defpackage.cle.b(this).a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new cll(this, 0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        return defpackage.cle.b(this).a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        return new cll(this, 0);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.cle.a
            monitor-enter(r0)
            clt r1 = r9.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r1 != 0) goto Lc
            defpackage.aooh.h(r2)     // Catch: java.lang.Throwable -> L5e
        Lc:
            clt r1 = defpackage.ckw.f(r1, r9)     // Catch: java.lang.Throwable -> L5e
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.b     // Catch: java.lang.Throwable -> L5e
            chm r1 = r1.a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            if (r1 != 0) goto L1c
            defpackage.aooh.g()
        L1c:
            chm r3 = r1.e(r10)
            boolean r1 = defpackage.aooh.n(r3, r1)
            r4 = 0
            if (r1 != 0) goto L57
            clt r1 = r9.a
            if (r1 != 0) goto L30
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            defpackage.aooh.h(r5)
        L30:
            java.lang.Object r5 = defpackage.ckw.b
            monitor-enter(r5)
            cko r6 = defpackage.ckw.b()     // Catch: java.lang.Throwable -> L5b
            clt r1 = defpackage.ckw.k(r1, r9, r6)     // Catch: java.lang.Throwable -> L5b
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5b
            int r7 = r1.b     // Catch: java.lang.Throwable -> L58
            r8 = 1
            if (r7 != r2) goto L4f
            r1.a = r3     // Catch: java.lang.Throwable -> L58
            int r2 = r1.c     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + r8
            r1.c = r2     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 1
            r1.b = r7     // Catch: java.lang.Throwable -> L58
            r4 = r8
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            defpackage.ckw.r(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L57:
            return r4
        L58:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L5b:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L5e:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.remove(java.lang.Object):boolean");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.cle.a
            monitor-enter(r0)
            clt r1 = r9.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r1 != 0) goto Lc
            defpackage.aooh.h(r2)     // Catch: java.lang.Throwable -> L5e
        Lc:
            clt r1 = defpackage.ckw.f(r1, r9)     // Catch: java.lang.Throwable -> L5e
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.b     // Catch: java.lang.Throwable -> L5e
            chm r1 = r1.a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            if (r1 != 0) goto L1c
            defpackage.aooh.g()
        L1c:
            chm r3 = r1.f(r10)
            boolean r1 = defpackage.aooh.n(r3, r1)
            r4 = 0
            if (r1 != 0) goto L57
            clt r1 = r9.a
            if (r1 != 0) goto L30
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            defpackage.aooh.h(r5)
        L30:
            java.lang.Object r5 = defpackage.ckw.b
            monitor-enter(r5)
            cko r6 = defpackage.ckw.b()     // Catch: java.lang.Throwable -> L5b
            clt r1 = defpackage.ckw.k(r1, r9, r6)     // Catch: java.lang.Throwable -> L5b
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5b
            int r7 = r1.b     // Catch: java.lang.Throwable -> L58
            r8 = 1
            if (r7 != r2) goto L4f
            r1.a = r3     // Catch: java.lang.Throwable -> L58
            int r2 = r1.c     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + r8
            r1.c = r2     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 1
            r1.b = r7     // Catch: java.lang.Throwable -> L58
            r4 = r8
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            defpackage.ckw.r(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L57:
            return r4
        L58:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L5b:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L5e:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        return defpackage.cle.d(this, new defpackage.clc(collection, 0));
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        int i2;
        defpackage.chm chmVar;
        defpackage.cko ckoVarB;
        boolean z;
        java.lang.Object obj2 = get(i);
        do {
            java.lang.Object obj3 = defpackage.cle.a;
            synchronized (obj3) {
                defpackage.clt cltVar = this.a;
                if (cltVar == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                }
                defpackage.clm clmVar = (defpackage.clm) defpackage.ckw.f(cltVar, this);
                i2 = clmVar.b;
                chmVar = clmVar.a;
            }
            if (chmVar == null) {
                defpackage.aooh.g();
            }
            defpackage.chm chmVarI = chmVar.i(i, obj);
            if (defpackage.aooh.n(chmVarI, chmVar)) {
                break;
            }
            defpackage.clt cltVar2 = this.a;
            if (cltVar2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            }
            synchronized (defpackage.ckw.b) {
                ckoVarB = defpackage.ckw.b();
                defpackage.clm clmVar2 = (defpackage.clm) defpackage.ckw.k(cltVar2, this, ckoVarB);
                synchronized (obj3) {
                    int i3 = clmVar2.b;
                    if (i3 == i2) {
                        clmVar2.a = chmVarI;
                        clmVar2.b = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            defpackage.ckw.r(ckoVarB, this);
        } while (!z);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.List
    public final java.util.List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > a()) {
            defpackage.cdh.a("fromIndex or toIndex are out of bounds");
        }
        return new clv(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return defpackage.aoob.a(this);
    }

    public final java.lang.String toString() {
        defpackage.clt cltVar = this.a;
        if (cltVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        }
        return "SnapshotStateList(value=" + ((defpackage.clm) defpackage.ckw.f(cltVar, this)).a + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List listC = c();
        int size = listC.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(listC.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        return defpackage.aoob.b(this, objArr);
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i) {
        return new cll(this, i);
    }

    public SnapshotStateList() {
        this(defpackage.chx.a);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    @Override // java.util.List, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = defpackage.cle.a
            monitor-enter(r0)
            clt r1 = r9.a     // Catch: java.lang.Throwable -> L5e
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>"
            if (r1 != 0) goto Lc
            defpackage.aooh.h(r2)     // Catch: java.lang.Throwable -> L5e
        Lc:
            clt r1 = defpackage.ckw.f(r1, r9)     // Catch: java.lang.Throwable -> L5e
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5e
            int r2 = r1.b     // Catch: java.lang.Throwable -> L5e
            chm r1 = r1.a     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r0)
            if (r1 != 0) goto L1c
            defpackage.aooh.g()
        L1c:
            chm r3 = r1.b(r10)
            boolean r1 = defpackage.aooh.n(r3, r1)
            r4 = 0
            if (r1 != 0) goto L57
            clt r1 = r9.a
            if (r1 != 0) goto L30
            java.lang.String r5 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>"
            defpackage.aooh.h(r5)
        L30:
            java.lang.Object r5 = defpackage.ckw.b
            monitor-enter(r5)
            cko r6 = defpackage.ckw.b()     // Catch: java.lang.Throwable -> L5b
            clt r1 = defpackage.ckw.k(r1, r9, r6)     // Catch: java.lang.Throwable -> L5b
            clm r1 = (defpackage.clm) r1     // Catch: java.lang.Throwable -> L5b
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L5b
            int r7 = r1.b     // Catch: java.lang.Throwable -> L58
            r8 = 1
            if (r7 != r2) goto L4f
            r1.a = r3     // Catch: java.lang.Throwable -> L58
            int r2 = r1.c     // Catch: java.lang.Throwable -> L58
            int r2 = r2 + r8
            r1.c = r2     // Catch: java.lang.Throwable -> L58
            int r7 = r7 + 1
            r1.b = r7     // Catch: java.lang.Throwable -> L58
            r4 = r8
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r5)
            defpackage.ckw.r(r6, r9)
            if (r4 == 0) goto L0
            r4 = r8
        L57:
            return r4
        L58:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r9     // Catch: java.lang.Throwable -> L5b
        L5b:
            r9 = move-exception
            monitor-exit(r5)
            throw r9
        L5e:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.SnapshotStateList.add(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        return defpackage.cle.d(this, new bxc(i, collection, 2));
    }

    @Override // java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        return b(i);
    }
}
