package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqj implements java.util.Iterator, defpackage.aoow {
    final /* synthetic */ defpackage.aoqk a;
    private java.lang.Object b;
    private int c = -2;

    public aoqj(defpackage.aoqk aoqkVar) {
        this.a = aoqkVar;
    }

    private final void a() {
        java.lang.Object objA;
        int i = this.c;
        defpackage.aoqk aoqkVar = this.a;
        if (i == -2) {
            objA = aoqkVar.a.a();
        } else {
            java.lang.Object obj = this.b;
            if (obj == null) {
                defpackage.aooh.g();
            }
            objA = aoqkVar.b.a(obj);
        }
        this.b = objA;
        this.c = objA == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.b;
        if (obj == null) {
            defpackage.aooh.h("null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        }
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }
}
