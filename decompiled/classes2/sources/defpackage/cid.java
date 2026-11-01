package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class cid implements java.util.Iterator, aoow {
    public final defpackage.cim[] a;
    public int b;
    public boolean c = true;

    public cid(cil cilVar, defpackage.cim[] cimVarArr) {
        this.a = cimVarArr;
        cimVarArr[0].c(cilVar.b, cilVar.a() << 1, 0);
        this.b = 0;
        d();
    }

    private final int b(int i) {
        defpackage.cim[] cimVarArr = this.a;
        if (cimVarArr[i].d()) {
            return i;
        }
        if (!cimVarArr[i].e()) {
            return -1;
        }
        defpackage.cim cimVar = cimVarArr[i];
        cimVar.e();
        java.lang.Object obj = cimVar.a[cimVar.b];
        if (obj == null) {
            aooh.h("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        cil cilVar = (cil) obj;
        if (i == 6) {
            defpackage.cim cimVar2 = cimVarArr[7];
            java.lang.Object[] objArr = cilVar.b;
            cimVar2.c(objArr, objArr.length, 0);
        } else {
            cimVarArr[i + 1].c(cilVar.b, cilVar.a() << 1, 0);
        }
        return b(i + 1);
    }

    private final void c() {
        if (!this.c) {
            throw new java.util.NoSuchElementException();
        }
    }

    private final void d() {
        defpackage.cim[] cimVarArr = this.a;
        if (cimVarArr[this.b].d()) {
            return;
        }
        for (int i = this.b; i >= 0; i--) {
            int iB = b(i);
            if (iB == -1) {
                if (cimVarArr[i].e()) {
                    cimVarArr[i].b();
                    iB = b(i);
                } else {
                    iB = -1;
                }
            }
            if (iB != -1) {
                this.b = iB;
                return;
            }
            if (i > 0) {
                cimVarArr[i - 1].b();
            }
            cimVarArr[i].c(cil.a.b, 0, 0);
        }
        this.c = false;
    }

    protected final java.lang.Object a() {
        c();
        return this.a[this.b].a();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        c();
        java.lang.Object next = this.a[this.b].next();
        d();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        a.am();
    }
}
