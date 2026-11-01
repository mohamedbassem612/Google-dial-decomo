package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class agsy implements defpackage.ajat {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ agsy(java.lang.Object obj, int i, int i2) {
        this.$cid = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.ajat
    public final defpackage.ajcq a(java.lang.Object obj) {
        if (this.$cid == 0) {
            return ((defpackage.agtc) this.b).b(this.a);
        }
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        defpackage.aimw aimwVar = (defpackage.aimw) ((defpackage.aimw) defpackage.kjw.a.b()).l("com/android/dialer/calllog/refresh/impl/RefreshAnnotatedCallLogWorker", "rebuildIfNecessary", 174, "RefreshAnnotatedCallLogWorker.java");
        bool.getClass();
        aimwVar.y("isDirty: %b", bool);
        if (!bool.booleanValue()) {
            return new defpackage.ajcm(defpackage.kjv.a);
        }
        int i = this.a;
        java.lang.Object obj2 = this.b;
        defpackage.ajcq ajcqVarY = i == 1 ? ((defpackage.kjw) obj2).n.Y() : new defpackage.ajcm(java.lang.Boolean.FALSE);
        defpackage.jwf jwfVar = new defpackage.jwf(obj2, 5);
        defpackage.ajct ajctVar = ((defpackage.kjw) obj2).f;
        long j = defpackage.ahqx.a;
        defpackage.ajax ajaxVar = new defpackage.ajax(defpackage.ahns.c(false), jwfVar, 1);
        int i2 = defpackage.ajan.c;
        defpackage.ajal ajalVar = new defpackage.ajal(ajcqVarY, ajaxVar);
        ajcqVarY.c(ajalVar, defpackage.aiql.t(ajctVar, ajalVar));
        return ajalVar;
    }
}
