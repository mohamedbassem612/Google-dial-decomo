package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cky extends defpackage.ckz {
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
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.a.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
        defpackage.clg clgVar = this.a;
        return new defpackage.clq(clgVar, clgVar.c().a.entrySet().iterator(), 1, null);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        return this.a.remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (this.a.remove(it.next()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
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
                if (!setCf.contains(entry.getKey())) {
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
