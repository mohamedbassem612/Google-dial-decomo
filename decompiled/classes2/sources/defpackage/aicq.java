package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aicq extends defpackage.aicn implements java.util.Set {
    final /* synthetic */ aicr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicq(aicr aicrVar, java.lang.Object obj, java.util.Set set) {
        super(aicrVar, obj, set, null);
        j$.util.Objects.requireNonNull(aicrVar);
        this.f = aicrVar;
    }

    @Override // defpackage.aicn, java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAu = ahvr.au((java.util.Set) this.b, collection);
        if (zAu) {
            int size2 = this.b.size();
            this.f.b += size2 - size;
            c();
        }
        return zAu;
    }
}
