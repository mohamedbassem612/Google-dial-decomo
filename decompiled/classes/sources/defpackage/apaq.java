package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class apaq implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ apaq(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    @Override // defpackage.aonn
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        if (this.$cid != 0) {
            defpackage.aolr aolrVar = (defpackage.aolr) obj;
            defpackage.aolp aolpVar = (defpackage.aolp) obj2;
            if (!(aolpVar instanceof defpackage.ahrd)) {
                return aolrVar;
            }
            defpackage.aoot aootVar = (defpackage.aoot) this.a;
            defpackage.aolp aolpVar2 = ((defpackage.aolr) aootVar.a).get(aolpVar.getKey());
            if (aolpVar2 == null) {
                return aolrVar.plus(((defpackage.ahrd) aolpVar).d());
            }
            aootVar.a = ((defpackage.aolr) aootVar.a).minusKey(aolpVar.getKey());
            return aolrVar.plus(((defpackage.ahrd) aolpVar).b(aolpVar2));
        }
        int iIntValue = ((java.lang.Integer) obj).intValue();
        defpackage.aolp aolpVar3 = (defpackage.aolp) obj2;
        defpackage.aolq key = aolpVar3.getKey();
        defpackage.aolp aolpVar4 = ((defpackage.apan) this.a).b.get(key);
        if (key == defpackage.aoub.d) {
            defpackage.aoub aoubVar = (defpackage.aoub) aolpVar4;
            if (aolpVar3 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type kotlinx.coroutines.Job");
            }
            defpackage.aoub aoubVarR = (defpackage.aoub) aolpVar3;
            while (true) {
                if (aoubVarR == null) {
                    aoubVarR = null;
                    break;
                }
                if (aoubVarR == aoubVar || !(aoubVarR instanceof defpackage.apcj)) {
                    break;
                }
                aoubVarR = ((defpackage.apcj) aoubVarR).r();
            }
            if (aoubVarR != aoubVar) {
                throw new java.lang.IllegalStateException(defpackage.a.bl(aoubVar, aoubVarR, "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ", ", expected child of ", ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"));
            }
            if (aoubVar != null) {
                iIntValue++;
            }
        } else if (aolpVar3 != aolpVar4) {
            iIntValue = Integer.MIN_VALUE;
        } else {
            iIntValue++;
        }
        return java.lang.Integer.valueOf(iIntValue);
    }
}
