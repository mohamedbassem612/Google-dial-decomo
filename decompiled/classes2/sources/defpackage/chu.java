package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chu extends defpackage.chp {
    private final java.lang.Object[] c;
    private final defpackage.chy d;

    public chu(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new defpackage.chy(objArr, aooc.u(i, i4), i4, i3);
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        a();
        defpackage.chy chyVar = this.d;
        if (chyVar.hasNext()) {
            this.a++;
            return chyVar.next();
        }
        java.lang.Object[] objArr = this.c;
        int i = this.a;
        this.a = i + 1;
        return objArr[i - chyVar.b];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        b();
        int i = this.a;
        int i2 = i - 1;
        defpackage.chy chyVar = this.d;
        int i3 = chyVar.b;
        if (i <= i3) {
            this.a = i2;
            return chyVar.previous();
        }
        java.lang.Object[] objArr = this.c;
        this.a = i2;
        return objArr[i2 - i3];
    }
}
