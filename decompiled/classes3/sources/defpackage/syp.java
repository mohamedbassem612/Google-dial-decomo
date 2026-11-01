package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syp extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public syp(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.syp.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        ajct ajctVar = (ajct) list.get(1);
        if (!zBooleanValue) {
            return aiql.z(aike.a);
        }
        amzg amzgVar = this.c;
        ajcq ajcqVarD = this.b.d();
        ajcq ajcqVarD2 = amzgVar.d();
        return ahvr.ak(new ajcq[]{ajcqVarD, ajcqVarD2}).o(new defpackage.syg(ajcqVarD, ajcqVarD2, 0), ajctVar);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.d.d(), this.e.d()});
    }
}
