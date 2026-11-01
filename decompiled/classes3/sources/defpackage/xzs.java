package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xzs implements defpackage.xzp {
    private final java.util.List a;
    private final dxz b;

    public xzs(java.util.List list, dxz dxzVar) {
        this.a = list;
        this.b = dxzVar;
    }

    @Override // defpackage.xzp
    public final boolean a(java.lang.Object obj) {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((defpackage.xzp) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [xuo] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    @Override // defpackage.xzp
    public final ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        ucm ucmVarB;
        java.util.List list = this.a;
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        int i3 = 0;
        ?? r5 = 0;
        while (i3 < size) {
            defpackage.xzp xzpVar = (defpackage.xzp) list.get(i3);
            if (xzpVar.a(obj) && (ucmVarB = xzpVar.b(obj, i, i2, xusVar)) != null) {
                arrayList.add(ucmVarB.c);
                r5 = ucmVarB.a;
            }
            i3++;
            r5 = r5;
        }
        if (arrayList.isEmpty() || r5 == 0) {
            return null;
        }
        return new ucm((defpackage.xuo) r5, new defpackage.xzr(arrayList, this.b));
    }

    public final java.lang.String toString() {
        return "MultiModelLoader{modelLoaders=" + java.util.Arrays.toString(this.a.toArray()) + '}';
    }
}
