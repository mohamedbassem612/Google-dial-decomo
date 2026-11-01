package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cif extends defpackage.cid implements java.util.Iterator, aoow {
    public final cie d;
    public int e;
    private java.lang.Object f;
    private boolean g;

    public cif(cie cieVar, defpackage.cim[] cimVarArr) {
        super(cieVar.a, cimVarArr);
        this.d = cieVar;
        this.e = cieVar.c;
    }

    public final void b(int i, cil cilVar, java.lang.Object obj, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            defpackage.cim[] cimVarArr = this.a;
            defpackage.cim cimVar = cimVarArr[i2];
            java.lang.Object[] objArr = cilVar.b;
            cimVar.c(objArr, objArr.length, 0);
            while (!aooh.n(cimVarArr[i2].a(), obj)) {
                cimVarArr[i2].b += 2;
            }
            this.b = i2;
            return;
        }
        int i4 = 1 << ((i >> i3) & 31);
        if (cilVar.m(i4)) {
            this.a[i2].c(cilVar.b, cilVar.a() << 1, cilVar.b(i4));
            this.b = i2;
        } else {
            int iC = cilVar.c(i4);
            cil cilVarI = cilVar.i(iC);
            this.a[i2].c(cilVar.b, cilVar.a() << 1, iC);
            b(i, cilVarI, obj, i2 + 1);
        }
    }

    @Override // defpackage.cid, java.util.Iterator
    public final java.lang.Object next() {
        if (this.d.c != this.e) {
            throw new java.util.ConcurrentModificationException();
        }
        this.f = a();
        this.g = true;
        return super.next();
    }

    @Override // defpackage.cid, java.util.Iterator
    public final void remove() {
        if (!this.g) {
            throw new java.lang.IllegalStateException();
        }
        if (this.c) {
            java.lang.Object objA = a();
            cie cieVar = this.d;
            java.lang.Object obj = this.f;
            aoov.g(cieVar);
            cieVar.remove(obj);
            b(objA != null ? objA.hashCode() : 0, cieVar.a, objA, 0);
        } else {
            cie cieVar2 = this.d;
            java.lang.Object obj2 = this.f;
            aoov.g(cieVar2);
            cieVar2.remove(obj2);
        }
        this.f = null;
        this.g = false;
        this.e = this.d.c;
    }
}
