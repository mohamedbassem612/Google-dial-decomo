package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cij extends aojj implements java.util.Collection, j$.util.Collection, aoow {
    private final cic a;

    public cij(cic cicVar) {
        this.a = cicVar;
    }

    public final int a() {
        return this.a.b();
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
        return new defpackage.cid(this.a.b, cimVarArr);
    }
}
