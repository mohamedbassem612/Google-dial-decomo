package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xku extends defpackage.xne {
    private final java.util.Map a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xku(defpackage.xhu xhuVar, java.util.Collection collection) {
        super(new defpackage.xkt(xhuVar));
        aooh.f(xhuVar, "component");
        java.util.List listBQ = ajsz.bQ(collection);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(aooc.t(ajsz.aL(ajsz.bl(listBQ, 10)), 16));
        for (java.lang.Object obj : listBQ) {
            linkedHashMap.put(((defpackage.xkr) obj).a, obj);
        }
        this.a = linkedHashMap;
    }

    @Override // defpackage.xmb
    public final /* bridge */ /* synthetic */ java.lang.Object eq(java.lang.Object obj, aoln aolnVar) {
        java.util.Map map = this.a;
        defpackage.xox.a("ContractMetadataProvider", "Providing contract metadata index: size=" + map.size());
        return map;
    }
}
