package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqh implements java.util.Iterator, defpackage.aoow {
    final /* synthetic */ defpackage.aoqi a;
    private final java.util.Iterator b;
    private int c = -1;
    private java.lang.Object d;

    public aoqh(defpackage.aoqi aoqiVar) {
        this.a = aoqiVar;
        this.b = aoqiVar.a.a();
    }

    private final void a() {
        int i;
        java.lang.Object next;
        defpackage.aoqi aoqiVar;
        do {
            java.util.Iterator it = this.b;
            if (it.hasNext()) {
                next = it.next();
                aoqiVar = this.a;
            } else {
                i = 0;
            }
            this.c = i;
        } while (((java.lang.Boolean) aoqiVar.c.a(next)).booleanValue() != aoqiVar.b);
        this.d = next;
        i = 1;
        this.c = i;
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
        defpackage.a.am();
    }
}
