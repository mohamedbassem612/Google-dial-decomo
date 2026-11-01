package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public kyx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new amzw(defpackage.kyx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        kwe kweVar = (kwe) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        ajct ajctVar = (ajct) list.get(2);
        if (!zBooleanValue || !kweVar.a()) {
            return aiql.z(java.lang.Boolean.FALSE);
        }
        amzg amzgVar = this.e;
        ajcq ajcqVarD = this.d.d();
        ajcq ajcqVarD2 = amzgVar.d();
        return ahvr.ak(new ajcq[]{ajcqVarD, ajcqVarD2}).o(new defpackage.gzk(ajcqVarD, ajcqVarD2, 16), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
