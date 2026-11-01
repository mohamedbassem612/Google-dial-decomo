package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nyr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amyz f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;

    public nyr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amyz amyzVar3, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new amzw(defpackage.nyr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amyzVar3;
        this.g = amzs.b(amzgVar5);
        this.h = amzs.b(amzgVar6);
        this.i = amzs.b(amzgVar7);
        this.j = amzs.b(amzgVar8);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        zpo zpoVar = (zpo) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(6)).booleanValue();
        qbe qbeVar = (qbe) list.get(7);
        int i = defpackage.nyo.a;
        if (zBooleanValue && zpoVar == zpo.f && !optional.isEmpty() && zBooleanValue2) {
            if (!((java.lang.Boolean) this.f.a()).booleanValue()) {
                z = zBooleanValue3;
            } else if (zBooleanValue4) {
                qbeVar.c(qbc.es);
                z = zBooleanValue5;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.j;
        amzg amzgVar2 = this.i;
        amzg amzgVar3 = this.h;
        amzg amzgVar4 = this.g;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
