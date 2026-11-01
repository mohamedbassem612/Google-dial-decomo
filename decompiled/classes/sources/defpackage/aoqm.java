package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqm extends defpackage.aoqn implements java.util.Iterator, defpackage.aoln, defpackage.aoow {
    public defpackage.aoln a;
    private int b;
    private java.lang.Object c;
    private java.util.Iterator d;

    private final java.lang.Throwable c() {
        int i = this.b;
        if (i != 4) {
            return i != 5 ? new java.lang.IllegalStateException(defpackage.a.bj(i, "Unexpected state of the iterator: ")) : new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.util.NoSuchElementException();
    }

    @Override // defpackage.aoqn
    public final java.lang.Object a(java.lang.Object obj, defpackage.aoln aolnVar) {
        this.c = obj;
        this.b = 3;
        this.a = aolnVar;
        return defpackage.aolu.a;
    }

    @Override // defpackage.aoqn
    public final java.lang.Object b(java.util.Iterator it, defpackage.aoln aolnVar) {
        if (!it.hasNext()) {
            return defpackage.aojh.a;
        }
        this.d = it;
        this.b = 2;
        this.a = aolnVar;
        return defpackage.aolu.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws java.lang.Throwable {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                java.util.Iterator it = this.d;
                defpackage.aooh.c(it);
                if (it.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            defpackage.aoln aolnVar = this.a;
            defpackage.aooh.c(aolnVar);
            this.a = null;
            aolnVar.w(defpackage.aojh.a);
        }
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() throws java.lang.Throwable {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new java.util.NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            java.util.Iterator it = this.d;
            defpackage.aooh.c(it);
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        java.lang.Object obj = this.c;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }

    @Override // defpackage.aoln
    public final defpackage.aolr u() {
        return defpackage.aols.a;
    }

    @Override // defpackage.aoln
    public final void w(java.lang.Object obj) {
        defpackage.aooc.af(obj);
        this.b = 4;
    }
}
