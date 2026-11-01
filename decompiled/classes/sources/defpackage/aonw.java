package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aonw implements java.util.Iterator, defpackage.aoow {
    private final java.lang.Object[] a;
    private int b;

    public aonw(java.lang.Object[] objArr) {
        if (objArr == null) {
            defpackage.aooh.i("array");
        }
        this.a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        try {
            java.lang.Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return objArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        defpackage.a.am();
    }
}
