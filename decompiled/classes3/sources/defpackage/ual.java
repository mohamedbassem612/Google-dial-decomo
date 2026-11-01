package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ual extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public ual(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.ual.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        defpackage.tzv tzvVar = (defpackage.tzv) list.get(2);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(3);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        aify aifyVar = (aify) list.get(5);
        akzx akzxVarM = defpackage.uaa.a.m();
        if (zpoVar == defpackage.zpo.f && !zBooleanValue && !tzvVar.g() && !((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
            z = true;
        }
        akzxVarM.u();
        defpackage.uaa uaaVar = (defpackage.uaa) akzxVarM.b;
        uaaVar.b |= 1;
        uaaVar.c = z;
        j$.lang.Iterable.-EL.forEach(aifyVar, new rh(akzxVarM, optional2, 17));
        return aiql.z(j$.util.Optional.of((defpackage.uaa) akzxVarM.p()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
