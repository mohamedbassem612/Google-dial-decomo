package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class abop implements aonp {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ abop(java.util.List list, int i, defpackage.afpl afplVar, aonp aonpVar, int i2) {
        this.$cid = i2;
        this.b = list;
        this.a = i;
        this.c = afplVar;
        this.d = aonpVar;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aonp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, teu] */
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        if (this.$cid == 0) {
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            cav cavVar = (cav) obj3;
            int iIntValue2 = ((java.lang.Integer) obj4).intValue();
            aooh.f((nf) obj, "$this$items");
            if ((iIntValue2 & 48) == 0) {
                iIntValue2 |= true == cavVar.z(iIntValue) ? 32 : 16;
            }
            if (cavVar.H((iIntValue2 & 145) != 144, iIntValue2 & 1)) {
                ?? r0 = this.d;
                java.lang.Object obj5 = this.c;
                r0.a(new defpackage.abom(iIntValue == 0, iIntValue == this.a, (defpackage.afpl) obj5), this.b.get(iIntValue), cavVar, 0);
            } else {
                cavVar.s();
            }
            return aojh.a;
        }
        int iIntValue3 = ((java.lang.Integer) obj2).intValue();
        cav cavVar2 = (cav) obj3;
        int iIntValue4 = ((java.lang.Integer) obj4).intValue();
        aooh.f((nf) obj, "$this$items");
        if ((iIntValue4 & 48) == 0) {
            iIntValue4 |= true == cavVar2.z(iIntValue3) ? 32 : 16;
        }
        if (cavVar2.H((iIntValue4 & 145) != 144, iIntValue4 & 1)) {
            java.lang.Object obj6 = this.d;
            int i = this.a;
            java.util.List list = ((defpackage.thc) this.b).b;
            defpackage.tgy tgyVar = (defpackage.tgy) list.get(iIntValue3);
            java.lang.String strA = tgyVar.a();
            int size = list.size();
            int i2 = i + iIntValue3;
            java.lang.String strA2 = tgyVar.a();
            java.lang.String str = ((defpackage.tha) obj6).b;
            this.c.g(tgyVar, new defpackage.ten(strA, iIntValue3, size, i2, str != null ? aooh.n(strA2, str) : false), cavVar2);
        } else {
            cavVar2.s();
        }
        return aojh.a;
    }

    public /* synthetic */ abop(defpackage.thc thcVar, defpackage.teu teuVar, int i, defpackage.thd thdVar, int i2) {
        this.$cid = i2;
        this.b = thcVar;
        this.c = teuVar;
        this.a = i;
        this.d = thdVar;
    }
}
