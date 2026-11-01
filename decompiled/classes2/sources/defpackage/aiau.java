package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiau extends defpackage.aiae {
    final /* synthetic */ aibt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiau(aibt aibtVar) {
        super(aibtVar);
        j$.util.Objects.requireNonNull(aibtVar);
        this.b = aibtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.aiat(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        return this.b.remove(obj) != null;
    }
}
