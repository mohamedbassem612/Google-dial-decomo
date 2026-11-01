package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akem extends java.util.AbstractSet {
    final /* synthetic */ defpackage.aker a;

    public akem(defpackage.aker akerVar) {
        j$.util.Objects.requireNonNull(akerVar);
        this.a = akerVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.util.Map.Entry) && this.a.b((java.util.Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.akel(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        defpackage.aker akerVar;
        defpackage.akeq akeqVarB;
        if (!(obj instanceof java.util.Map.Entry) || (akeqVarB = (akerVar = this.a).b((java.util.Map.Entry) obj)) == null) {
            return false;
        }
        akerVar.e(akeqVarB, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.b;
    }
}
