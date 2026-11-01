package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqs implements java.util.Iterator, aoow {
    final /* synthetic */ defpackage.aoqt a;
    private final java.util.Iterator b;
    private int c = -1;
    private java.lang.Object d;

    public aoqs(defpackage.aoqt aoqtVar) {
        this.a = aoqtVar;
        this.b = aoqtVar.a.a();
    }

    private final void a() {
        java.util.Iterator it = this.b;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) this.a.b.a(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c == -1) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.c == -1) {
            a();
        }
        if (this.c == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.d;
        this.d = null;
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
