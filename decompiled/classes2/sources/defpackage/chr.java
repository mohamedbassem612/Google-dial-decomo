package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chr extends defpackage.chp {
    private final java.lang.Object[] c;

    public chr(java.lang.Object[] objArr, int i, int i2) {
        super(i, i2);
        this.c = objArr;
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a - 1;
        this.a = i;
        return objArr[i];
    }
}
