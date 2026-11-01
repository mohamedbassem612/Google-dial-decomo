package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gdx implements java.lang.Iterable, defpackage.aoow {
    private final java.util.concurrent.CopyOnWriteArrayList a = new java.util.concurrent.CopyOnWriteArrayList();

    public final void a(java.lang.Object obj) {
        this.a.add(obj);
    }

    public final void b(java.lang.Object obj) {
        this.a.remove(obj);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.util.Iterator it = this.a.iterator();
        defpackage.aooh.e(it, "iterator(...)");
        return it;
    }
}
