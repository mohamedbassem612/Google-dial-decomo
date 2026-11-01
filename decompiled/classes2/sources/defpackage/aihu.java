package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class aihu implements java.util.Iterator {
    boolean a;
    final /* synthetic */ java.util.Iterator b;

    public aihu(defpackage.aihv aihvVar, java.util.Iterator it) {
        this.b = it;
        j$.util.Objects.requireNonNull(aihvVar);
        this.a = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object next = this.b.next();
        this.a = false;
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahvr.bZ(!this.a, "no calls to next() since the last call to remove()");
        this.b.remove();
    }
}
