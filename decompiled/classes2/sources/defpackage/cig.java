package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cig extends aojt implements java.util.Set, aopb {
    private final cie a;

    public cig(cie cieVar) {
        this.a = cieVar;
    }

    public final int a() {
        return this.a.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.cim[] cimVarArr = new defpackage.cim[8];
        for (int i = 0; i < 8; i++) {
            cimVarArr[i] = new defpackage.cio();
        }
        return new defpackage.cif(this.a, cimVarArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        cie cieVar = this.a;
        if (!cieVar.containsKey(obj)) {
            return false;
        }
        cieVar.remove(obj);
        return true;
    }
}
