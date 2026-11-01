package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiie implements java.util.Iterator {
    private java.util.Iterator a;
    private java.util.Iterator b = defpackage.aiid.a;
    private java.util.Iterator c;
    private java.util.Deque d;

    public aiie(java.util.Iterator it) {
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.util.Iterator it;
        while (!((java.util.Iterator) j$.util.Objects.requireNonNull(this.b)).hasNext()) {
            while (true) {
                java.util.Iterator it2 = this.c;
                if (it2 != null && it2.hasNext()) {
                    it = this.c;
                    break;
                }
                java.util.Deque deque = this.d;
                if (deque == null || deque.isEmpty()) {
                    it = null;
                    break;
                }
                this.c = (java.util.Iterator) this.d.removeFirst();
            }
            this.c = it;
            if (it == null) {
                return false;
            }
            java.util.Iterator it3 = (java.util.Iterator) it.next();
            this.b = it3;
            if (it3 instanceof defpackage.aiie) {
                defpackage.aiie aiieVar = (defpackage.aiie) it3;
                this.b = aiieVar.b;
                if (this.d == null) {
                    this.d = new java.util.ArrayDeque();
                }
                this.d.addFirst(this.c);
                if (aiieVar.d != null) {
                    while (!aiieVar.d.isEmpty()) {
                        this.d.addFirst((java.util.Iterator) aiieVar.d.removeLast());
                    }
                }
                this.c = aiieVar.c;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.Iterator it = this.b;
        this.a = it;
        return ((java.util.Iterator) j$.util.Objects.requireNonNull(it)).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        java.util.Iterator it = this.a;
        if (it == null) {
            throw new java.lang.IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
