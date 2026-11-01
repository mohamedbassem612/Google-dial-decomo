package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxv implements java.util.Iterator, aoow {
    final /* synthetic */ defpackage.fxw a;
    private int b = -1;
    private boolean c;

    public fxv(defpackage.fxw fxwVar) {
        this.a = fxwVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b + 1 < this.a.b.c();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.c = true;
        defpackage.fxw fxwVar = this.a;
        int i = this.b + 1;
        this.b = i;
        return (defpackage.fwc) fxwVar.b.e(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new java.lang.IllegalStateException("You must call next() before you can remove an element");
        }
        defpackage.fxw fxwVar = this.a;
        int i = this.b;
        aed aedVar = fxwVar.b;
        ((defpackage.fwc) aedVar.e(i)).c = null;
        int i2 = this.b;
        java.lang.Object[] objArr = aedVar.c;
        java.lang.Object obj = objArr[i2];
        java.lang.Object obj2 = defpackage.aee.a;
        if (obj != obj2) {
            objArr[i2] = obj2;
            aedVar.a = true;
        }
        this.b = i2 - 1;
        this.c = false;
    }
}
