package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class cib extends defpackage.cia implements java.util.Map.Entry, aooz {
    private java.lang.Object b;
    private final defpackage.ctw c;

    public cib(defpackage.ctw ctwVar, java.lang.Object obj, java.lang.Object obj2) {
        super(obj, obj2);
        this.c = ctwVar;
        this.b = obj2;
    }

    @Override // defpackage.cia, java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.b;
    }

    @Override // defpackage.cia, java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        java.lang.Object obj2 = this.b;
        this.b = obj;
        java.util.Iterator it = this.c.a;
        defpackage.cif cifVar = (defpackage.cif) it;
        cie cieVar = cifVar.d;
        java.lang.Object obj3 = this.a;
        if (cieVar.containsKey(obj3)) {
            defpackage.cid cidVar = (defpackage.cid) it;
            if (cidVar.c) {
                java.lang.Object objA = cidVar.a();
                cieVar.put(obj3, obj);
                cifVar.b(objA != null ? objA.hashCode() : 0, cieVar.a, objA, 0);
            } else {
                cieVar.put(obj3, obj);
            }
            cifVar.e = cieVar.c;
        }
        return obj2;
    }
}
