package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cih extends aojq implements java.util.Collection, aoox {
    private final cie a;

    public cih(cie cieVar) {
        this.a = cieVar;
    }

    public final int a() {
        return this.a.b();
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.cim[] cimVarArr = new defpackage.cim[8];
        for (int i = 0; i < 8; i++) {
            cimVarArr[i] = new defpackage.ciq();
        }
        return new defpackage.cif(this.a, cimVarArr);
    }
}
