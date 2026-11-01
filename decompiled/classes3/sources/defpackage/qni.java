package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qni extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public qni(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qni.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aimz aimzVar = defpackage.qng.a;
        boolean zF = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        aooh.f(optional, "upgradingVideoState");
        aooh.f(optional2, "ringingVideoState");
        if (zBooleanValue) {
            defpackage.zcy zcyVar = (defpackage.zcy) aooh.q(optional);
            if (zcyVar != null) {
                zF = zcyVar.f();
            } else {
                defpackage.zcy zcyVar2 = (defpackage.zcy) aooh.q(optional2);
                zF = zcyVar2 != null ? zcyVar2.f() : zBooleanValue2;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(zF));
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
