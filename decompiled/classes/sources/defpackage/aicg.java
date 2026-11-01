package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aicg extends defpackage.aijb {
    final /* synthetic */ defpackage.aicr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicg(defpackage.aicr aicrVar, java.util.Map map) {
        super(map);
        j$.util.Objects.requireNonNull(aicrVar);
        this.a = aicrVar;
    }

    @Override // defpackage.aijb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        defpackage.ahvr.bc(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(java.util.Collection collection) {
        return this.d.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        return this == obj || this.d.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.keySet().hashCode();
    }

    @Override // defpackage.aijb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.aicf(this, this.d.entrySet().iterator());
    }

    @Override // defpackage.aijb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Collection collection = (java.util.Collection) this.d.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.a.b -= size;
            if (size > 0) {
                return true;
            }
        }
        return false;
    }
}
