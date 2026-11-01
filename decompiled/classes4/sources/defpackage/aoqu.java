package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqu implements java.util.Iterator, aoow {
    final /* synthetic */ defpackage.aoqt a;
    private final java.util.Iterator b;

    public aoqu(defpackage.aoqt aoqtVar) {
        this.a = aoqtVar;
        this.b = aoqtVar.a.a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        return this.a.b.a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
