package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aobq {
    final boolean a;
    final java.util.List b;
    final java.util.Collection c;
    final java.util.Collection d;
    public final int e;
    final defpackage.aobs f;
    final boolean g;
    final boolean h;

    public aobq(java.util.List list, java.util.Collection collection, java.util.Collection collection2, defpackage.aobs aobsVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        ahvr.cj(collection, "drainedSubstreams");
        this.c = collection;
        this.f = aobsVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        ahvr.bZ(!z2 || list == null, "passThrough should imply buffer is null");
        ahvr.bZ((z2 && aobsVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        ahvr.bZ(!z2 || (collection.size() == 1 && collection.contains(aobsVar)) || (collection.size() == 0 && aobsVar.b), "passThrough should imply winningSubstream is drained");
        ahvr.bZ((z && aobsVar == null) ? false : true, "cancelled should imply committed");
    }

    final defpackage.aobq a(defpackage.aobs aobsVar) {
        java.util.Collection collectionUnmodifiableCollection;
        boolean z = this.h;
        ahvr.bZ(!z, "hedging frozen");
        defpackage.aobs aobsVar2 = this.f;
        ahvr.bZ(aobsVar2 == null, "already committed");
        java.util.Collection collection = this.d;
        if (collection == null) {
            collectionUnmodifiableCollection = java.util.Collections.singleton(aobsVar);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            arrayList.add(aobsVar);
            collectionUnmodifiableCollection = j$.util.DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new defpackage.aobq(this.b, this.c, collectionUnmodifiableCollection, aobsVar2, this.g, this.a, z, this.e + 1);
    }

    final defpackage.aobq b() {
        return !this.h ? new defpackage.aobq(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e) : this;
    }

    final defpackage.aobq c(defpackage.aobs aobsVar) {
        ahvr.bZ(!this.a, "Already passThrough");
        boolean z = aobsVar.b;
        java.util.Collection collectionUnmodifiableCollection = this.c;
        if (!z) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = java.util.Collections.singletonList(aobsVar);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(collectionUnmodifiableCollection);
                arrayList.add(aobsVar);
                collectionUnmodifiableCollection = j$.util.DesugarCollections.unmodifiableCollection(arrayList);
            }
        }
        java.util.Collection collection = collectionUnmodifiableCollection;
        defpackage.aobs aobsVar2 = this.f;
        boolean z2 = aobsVar2 != null;
        java.util.List list = this.b;
        if (z2) {
            ahvr.bZ(aobsVar2 == aobsVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new defpackage.aobq(list, collection, this.d, aobsVar2, this.g, z2, this.h, this.e);
    }
}
