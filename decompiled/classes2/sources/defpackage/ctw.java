package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ctw implements java.util.Iterator, aoow {
    private final /* synthetic */ int $cid;
    public final java.util.Iterator a;

    public ctw(cie cieVar, int i) {
        this.$cid = i;
        defpackage.cim[] cimVarArr = new defpackage.cim[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cimVarArr[i2] = new defpackage.cip(this);
        }
        this.a = new defpackage.cif(cieVar, cimVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        java.util.Iterator it = this.a;
        return i != 0 ? ((defpackage.cid) it).c : it.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        int i = this.$cid;
        java.util.Iterator it = this.a;
        return i != 0 ? (java.util.Map.Entry) ((defpackage.cid) it).next() : (sl) it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$cid == 0) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        ((defpackage.cid) this.a).remove();
    }

    public ctw(ctx ctxVar, int i) {
        this.$cid = i;
        this.a = ctxVar.j.iterator();
    }
}
