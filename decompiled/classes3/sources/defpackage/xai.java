package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xai implements lot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.xan a;

    public /* synthetic */ xai(defpackage.xan xanVar, int i) {
        this.$cid = i;
        this.a = xanVar;
    }

    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            java.lang.Boolean bool = (java.lang.Boolean) obj;
            defpackage.xan xanVar = this.a;
            xanVar.k.R(!bool.booleanValue());
            if (bool.booleanValue()) {
                return;
            }
            xanVar.a();
            return;
        }
        defpackage.xap xapVar = (defpackage.xap) obj;
        defpackage.xal xalVar = new defpackage.xal();
        boolean z = xapVar == defpackage.xap.USER_OPTED_IN || xapVar == defpackage.xap.AUTO_ENROLLED;
        defpackage.xan xanVar2 = this.a;
        xalVar.b(z);
        xalVar.c(true);
        xanVar2.b(xalVar.a());
        xanVar2.l.setVisibility(0);
    }
}
