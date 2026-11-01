package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alaq implements java.util.Iterator {
    final /* synthetic */ defpackage.alas a;
    private final java.util.Iterator b;

    public alaq(defpackage.alas alasVar, java.util.Iterator it) {
        j$.util.Objects.requireNonNull(alasVar);
        this.a = alasVar;
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new defpackage.alap(this.a, (java.util.Map.Entry) this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
