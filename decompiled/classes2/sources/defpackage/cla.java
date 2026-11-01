package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cla extends defpackage.ckz {
    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        defpackage.clg clgVar = this.a;
        return new defpackage.clq(clgVar, clgVar.c().a.entrySet().iterator(), 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object next;
        defpackage.clg clgVar = this.a;
        java.util.Iterator it = clgVar.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!aooh.n(((java.util.Map.Entry) next).getValue(), obj));
        java.util.Map.Entry entry = (java.util.Map.Entry) next;
        if (entry == null) {
            return false;
        }
        clgVar.remove(entry.getKey());
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        cho choVar;
        int i;
        boolean z;
        cko ckoVarB;
        java.util.Set setCf = ajsz.cf(collection);
        defpackage.clg clgVar = this.a;
        boolean z2 = false;
        do {
            java.lang.Object obj = defpackage.clh.a;
            synchronized (obj) {
                clt cltVar = clgVar.a;
                if (cltVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                }
                defpackage.clf clfVar = (defpackage.clf) ckw.f(cltVar, clgVar);
                choVar = clfVar.a;
                i = clfVar.b;
            }
            if (choVar == null) {
                aooh.g();
            }
            java.util.Set set = clgVar.b;
            chn chnVarA = choVar.a();
            java.util.Iterator it = set.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (setCf.contains(entry.getValue())) {
                    chnVarA.remove(entry.getKey());
                    z2 = true;
                }
            }
            cho choVarA = chnVarA.a();
            if (aooh.n(choVarA, choVar)) {
                break;
            }
            clt cltVar2 = clgVar.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                ckoVarB = ckw.b();
                defpackage.clf clfVar2 = (defpackage.clf) ckw.k(cltVar2, clgVar, ckoVarB);
                synchronized (obj) {
                    int i2 = clfVar2.b;
                    if (i2 == i) {
                        clfVar2.a = choVarA;
                        clfVar2.b = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            ckw.r(ckoVarB, clgVar);
        } while (!z);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        cho choVar;
        int i;
        boolean z;
        cko ckoVarB;
        java.util.Set setCf = ajsz.cf(collection);
        defpackage.clg clgVar = this.a;
        boolean z2 = false;
        do {
            java.lang.Object obj = defpackage.clh.a;
            synchronized (obj) {
                clt cltVar = clgVar.a;
                if (cltVar == null) {
                    aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                }
                defpackage.clf clfVar = (defpackage.clf) ckw.f(cltVar, clgVar);
                choVar = clfVar.a;
                i = clfVar.b;
            }
            if (choVar == null) {
                aooh.g();
            }
            java.util.Set set = clgVar.b;
            chn chnVarA = choVar.a();
            java.util.Iterator it = set.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!setCf.contains(entry.getValue())) {
                    chnVarA.remove(entry.getKey());
                    z2 = true;
                }
            }
            cho choVarA = chnVarA.a();
            if (aooh.n(choVarA, choVar)) {
                break;
            }
            clt cltVar2 = clgVar.a;
            if (cltVar2 == null) {
                aooh.h("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            }
            synchronized (ckw.b) {
                ckoVarB = ckw.b();
                defpackage.clf clfVar2 = (defpackage.clf) ckw.k(cltVar2, clgVar, ckoVarB);
                synchronized (obj) {
                    int i2 = clfVar2.b;
                    if (i2 == i) {
                        clfVar2.a = choVarA;
                        clfVar2.b = i2 + 1;
                    } else {
                        z = false;
                    }
                }
            }
            ckw.r(ckoVarB, clgVar);
        } while (!z);
        return z2;
    }
}
