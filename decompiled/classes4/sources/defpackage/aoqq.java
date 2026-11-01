package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoqq implements java.util.Iterator, aoow {
    private final /* synthetic */ int $cid;
    private int a;
    private final java.util.Iterator b;

    public aoqq(defpackage.aoqf aoqfVar, int i) {
        this.$cid = i;
        this.b = aoqfVar.a.a();
        this.a = aoqfVar.b;
    }

    private final void a() {
        while (this.a > 0) {
            java.util.Iterator it = this.b;
            if (!it.hasNext()) {
                return;
            }
            it.next();
            this.a--;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.$cid == 0) {
            return this.a > 0 && this.b.hasNext();
        }
        a();
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.$cid != 0) {
            a();
            return this.b.next();
        }
        int i = this.a;
        if (i == 0) {
            throw new java.util.NoSuchElementException();
        }
        this.a = i - 1;
        return this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$cid != 0) {
            a.am();
        } else {
            a.am();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aoql, java.lang.Object] */
    public aoqq(defpackage.aoqr aoqrVar, int i) {
        this.$cid = i;
        this.a = 3;
        this.b = aoqrVar.a.a();
    }
}
