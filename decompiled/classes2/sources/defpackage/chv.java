package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class chv extends defpackage.chp implements java.util.ListIterator, aoow {
    private final defpackage.cht c;
    private int d;
    private defpackage.chy e;
    private int f;

    public chv(defpackage.cht chtVar, int i) {
        super(i, chtVar.d);
        this.c = chtVar;
        this.d = chtVar.a();
        this.f = -1;
        f();
    }

    private final void c() {
        if (this.d != this.c.a()) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    private final void d() {
        if (this.f == -1) {
            throw new java.lang.IllegalStateException();
        }
    }

    private final void e() {
        defpackage.cht chtVar = this.c;
        this.b = chtVar.d;
        this.d = chtVar.a();
        this.f = -1;
        f();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private final void f() {
        defpackage.cht chtVar = this.c;
        java.lang.Object[] objArr = chtVar.b;
        if (objArr == null) {
            this.e = null;
            return;
        }
        int i = (chtVar.d - 1) & (-32);
        int iU = aooc.u(this.a, i);
        int i2 = chtVar.a / 5;
        defpackage.chy chyVar = this.e;
        int i3 = i2 + 1;
        if (chyVar == null) {
            this.e = new defpackage.chy(objArr, iU, i, i3);
            return;
        }
        chyVar.a = iU;
        chyVar.b = i;
        chyVar.c = i3;
        if (chyVar.d.length < i3) {
            chyVar.d = new java.lang.Object[i3];
        }
        chyVar.d[0] = objArr;
        ?? r0 = iU == i ? 1 : 0;
        chyVar.e = r0;
        chyVar.c(iU - r0, 1);
    }

    @Override // defpackage.chp, java.util.ListIterator
    public final void add(java.lang.Object obj) {
        c();
        this.c.add(this.a, obj);
        this.a++;
        e();
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
        c();
        a();
        int i = this.a;
        int i2 = i + 1;
        this.f = i;
        defpackage.chy chyVar = this.e;
        if (chyVar == null) {
            java.lang.Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i];
        }
        if (chyVar.hasNext()) {
            this.a = i2;
            return chyVar.next();
        }
        java.lang.Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i - chyVar.b];
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        c();
        b();
        int i = this.a;
        int i2 = i - 1;
        this.f = i2;
        defpackage.chy chyVar = this.e;
        if (chyVar == null) {
            java.lang.Object[] objArr = this.c.c;
            this.a = i2;
            return objArr[i2];
        }
        int i3 = chyVar.b;
        if (i <= i3) {
            this.a = i2;
            return chyVar.previous();
        }
        java.lang.Object[] objArr2 = this.c.c;
        this.a = i2;
        return objArr2[i2 - i3];
    }

    @Override // defpackage.chp, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        c();
        d();
        this.c.d(this.f);
        int i = this.f;
        if (i < this.a) {
            this.a = i;
        }
        e();
    }

    @Override // defpackage.chp, java.util.ListIterator
    public final void set(java.lang.Object obj) {
        c();
        d();
        defpackage.cht chtVar = this.c;
        chtVar.set(this.f, obj);
        this.d = chtVar.a();
        f();
    }
}
