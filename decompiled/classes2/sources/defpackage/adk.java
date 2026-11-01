package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class adk implements java.util.Iterator, aoow {
    private final /* synthetic */ int $cid;
    public int a = -1;
    final /* synthetic */ java.lang.Object b;
    private final java.util.Iterator c;

    public adk(defpackage.adi adiVar, int i) {
        this.$cid = i;
        this.b = adiVar;
        this.c = aooc.e(new defpackage.adh(adiVar, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        java.util.Iterator it = this.c;
        return i != 0 ? it.hasNext() : it.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        int i = this.$cid;
        java.util.Iterator it = this.c;
        return i != 0 ? it.next() : it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.$cid;
        int i2 = this.a;
        if (i != 0) {
            if (i2 != -1) {
                ((defpackage.adi) this.b).a.e(i2);
                this.a = -1;
                return;
            }
            return;
        }
        if (i2 != -1) {
            ((adl) this.b).a.i(i2);
            this.a = -1;
        }
    }

    public adk(adl adlVar, int i) {
        this.$cid = i;
        this.b = adlVar;
        this.c = aooc.e(new defpackage.adj(adlVar, this, null));
    }
}
