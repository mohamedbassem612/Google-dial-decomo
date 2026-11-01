package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class dzf implements java.util.Iterator, aoow {
    private final aonj a;
    private final java.util.List b = new java.util.ArrayList();
    private java.util.Iterator c;

    public dzf(java.util.Iterator it, aonj aonjVar) {
        this.a = aonjVar;
        this.c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Iterator] */
    @Override // java.util.Iterator
    public final java.lang.Object next() {
        java.lang.Object next = this.c.next();
        ?? A = this.a.a(next);
        if (A == 0 || !A.hasNext()) {
            while (!this.c.hasNext()) {
                java.util.List list = this.b;
                if (list.isEmpty()) {
                    break;
                }
                this.c = (java.util.Iterator) ajsz.bI(list);
                ajsz.bq(list);
            }
        } else {
            this.b.add(this.c);
            this.c = A;
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.am();
    }
}
