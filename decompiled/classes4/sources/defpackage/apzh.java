package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apzh implements java.util.Iterator {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.util.AbstractMap a;
    private int b = -1;

    public apzh(java.util.AbstractMap abstractMap, int i) {
        this.$cid = i;
        this.a = abstractMap;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$cid;
        eik eikVar = this.a;
        if (i != 0) {
            eik eikVar2 = eikVar;
            eikVar2.c();
            if (this.b + 1 >= eikVar2.b) {
                return false;
            }
        } else {
            defpackage.apzj apzjVar = (defpackage.apzj) eikVar;
            apzjVar.c();
            if (this.b + 1 >= apzjVar.b) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        int i = this.$cid;
        eik eikVar = this.a;
        if (i != 0) {
            eik eikVar2 = eikVar;
            eikVar2.c();
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            java.lang.Object[] objArr = eikVar2.a;
            int i2 = this.b + 1;
            this.b = i2;
            return (defpackage.eii) objArr[i2];
        }
        defpackage.apzj apzjVar = (defpackage.apzj) eikVar;
        apzjVar.c();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object[] objArr2 = apzjVar.a;
        int i3 = this.b + 1;
        this.b = i3;
        return (defpackage.apzg) objArr2[i3];
    }
}
