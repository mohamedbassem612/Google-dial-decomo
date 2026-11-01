package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agsx implements defpackage.ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agsx(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.ajas
    public final defpackage.ajcq a() {
        int i = this.$cid;
        int i2 = this.a;
        if (i == 0) {
            return ((defpackage.agtc) this.b).b(i2);
        }
        java.lang.Object obj = this.b;
        defpackage.ajcq ajcqVarY = i2 == 2 ? ((defpackage.kjw) obj).n.Y() : new defpackage.ajcm(java.lang.Boolean.FALSE);
        defpackage.jwf jwfVar = new defpackage.jwf(obj, 4);
        defpackage.ajct ajctVar = ((defpackage.kjw) obj).f;
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), jwfVar, 1);
        int i3 = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarY, ajaxVar);
        ajcqVarY.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
        defpackage.ajal ajalVar2 = new defpackage.ajal(ajalVar, new defpackage.ajax(defpackage.ahns.c(false), new defpackage.agsy(obj, i2, 1), 1));
        ajalVar.c(ajalVar2, defpackage.aiql.t(ajctVar, ajalVar2));
        return ajalVar2;
    }
}
