package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apxk implements java.util.Iterator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    private int b = 0;
    private final int c;

    public apxk(defpackage.apxo apxoVar, int i) {
        this.$cid = i;
        this.a = apxoVar;
        this.c = apxoVar.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        int i2 = this.b;
        int i3 = this.c;
        if (i != 0) {
            if (i2 < i3) {
                return true;
            }
        } else if (i2 < i3) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        int i = this.$cid;
        int i2 = this.b;
        if (i != 0) {
            if (i2 >= this.c) {
                throw new java.util.NoSuchElementException();
            }
            this.b = i2 + 1;
            return java.lang.Byte.valueOf(((egm) this.a).a(i2));
        }
        if (i2 >= this.c) {
            throw new java.util.NoSuchElementException();
        }
        this.b = i2 + 1;
        return java.lang.Byte.valueOf(((defpackage.apxo) this.a).a(i2));
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.$cid == 0) {
            throw new java.lang.UnsupportedOperationException();
        }
        throw new java.lang.UnsupportedOperationException();
    }

    public apxk(egm egmVar, int i) {
        this.$cid = i;
        this.a = egmVar;
        this.c = egmVar.b();
    }
}
