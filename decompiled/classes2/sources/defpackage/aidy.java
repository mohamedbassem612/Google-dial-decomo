package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aidy extends java.util.AbstractSet {
    final /* synthetic */ aieb a;

    public aidy(aieb aiebVar) {
        j$.util.Objects.requireNonNull(aiebVar);
        this.a = aiebVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        return mapJ != null ? mapJ.keySet().iterator() : new defpackage.aidt(aiebVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        if (mapJ != null) {
            return mapJ.keySet().remove(obj);
        }
        return aiebVar.f(obj) != aieb.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
