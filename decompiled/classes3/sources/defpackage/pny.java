package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pny extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public pny(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.pny.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        final defpackage.zpo zpoVar = (defpackage.zpo) list.get(0);
        final boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        final boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        final boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        final j$.util.Optional optional = (j$.util.Optional) list.get(4);
        java.lang.Boolean bool = (java.lang.Boolean) ((mgu) list.get(5)).a(new java.util.function.Supplier() { // from class: pns
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                java.lang.String str = (java.lang.String) optional.orElse((java.lang.Object) null);
                if (str == null) {
                    return java.lang.Boolean.FALSE;
                }
                if (akfg.b(str) != akfg.G) {
                    return java.lang.Boolean.FALSE;
                }
                boolean z = false;
                if (!zBooleanValue3 && zBooleanValue && zpoVar != defpackage.zpo.d && zBooleanValue2) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        }).a(mfy.eS).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        amzg amzgVar3 = this.e;
        amzg amzgVar4 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
