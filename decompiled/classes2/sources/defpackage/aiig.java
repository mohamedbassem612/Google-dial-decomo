package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiig implements java.util.Iterator {
    public final java.util.Iterator a;
    public boolean b;
    public java.lang.Object c;

    public aiig(java.util.Iterator it) {
        ahvr.ci(it);
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!this.b) {
            return this.a.next();
        }
        java.lang.Object obj = this.c;
        this.b = false;
        this.c = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ahvr.bZ(!this.b, "Can't remove after you've peeked at next");
        this.a.remove();
    }
}
