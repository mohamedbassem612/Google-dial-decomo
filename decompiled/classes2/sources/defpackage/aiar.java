package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aiar extends defpackage.aiae {
    final /* synthetic */ aibt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiar(aibt aibtVar) {
        super(aibtVar);
        j$.util.Objects.requireNonNull(aibtVar);
        this.b = aibtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry;
        java.lang.Object key;
        aibt aibtVar;
        java.lang.Object obj2;
        if (!(obj instanceof java.util.Map.Entry) || (key = (entry = (java.util.Map.Entry) obj).getKey()) == null || (obj2 = (aibtVar = this.b).get(key)) == null) {
            return false;
        }
        return aibtVar.i.d(entry.getValue(), obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.aiaq(this.b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        return this.b.remove(entry.getKey(), entry.getValue());
    }
}
