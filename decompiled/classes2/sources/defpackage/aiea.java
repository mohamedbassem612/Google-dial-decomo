package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiea extends java.util.AbstractCollection {
    final /* synthetic */ aieb a;

    public aiea(aieb aiebVar) {
        j$.util.Objects.requireNonNull(aiebVar);
        this.a = aiebVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        aieb aiebVar = this.a;
        java.util.Map mapJ = aiebVar.j();
        return mapJ != null ? mapJ.values().iterator() : new defpackage.aidv(aiebVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
