package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qkz extends amzm {
    private final amzg b;

    public qkz(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qkz.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        aooh.f(aihdVar, "safeActionButtons");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj2 : aihdVar) {
            defpackage.qic qicVar = ((defpackage.qib) obj2).b;
            java.lang.Object arrayList = linkedHashMap.get(qicVar);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(qicVar, arrayList);
            }
            ((java.util.List) arrayList).add(obj2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.util.List list = (java.util.List) ((java.util.Map.Entry) it.next()).getValue();
            java.util.Comparator comparatorComparingInt = j$.util.Comparator.-CC.comparingInt(new defpackage.qkr(new qks(1), 0));
            aooh.e(comparatorComparingInt, "comparingInt(...)");
            defpackage.qib qibVar = (defpackage.qib) ajsz.bK(list, comparatorComparingInt);
            if (qibVar != null) {
                arrayList2.add(qibVar);
            }
        }
        return aiql.z(ahvr.bv(ajsz.bX(arrayList2, new hte(20))));
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
