package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alar extends java.util.AbstractSet {
    final /* synthetic */ defpackage.alas a;
    private final java.util.Set b;

    public alar(defpackage.alas alasVar, java.util.Set set) {
        j$.util.Objects.requireNonNull(alasVar);
        this.a = alasVar;
        this.b = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new defpackage.alaq(this.a, this.b.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b.size();
    }
}
