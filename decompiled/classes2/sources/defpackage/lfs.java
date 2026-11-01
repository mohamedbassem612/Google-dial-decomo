package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfs extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;

    public lfs(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11) {
        super(amyzVar2, new amzw(defpackage.lfs.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        ajcq ajcqVarZ;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(2)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(3)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(4)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(6)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(7)).booleanValue();
        zpm zpmVar = (zpm) list.get(8);
        ajct ajctVar = (ajct) list.get(9);
        ahoq ahoqVarW = ahvr.W(280, "CallScreenProducerModule.produceIsCallScreenEligible");
        amzg amzgVar = this.k;
        try {
            if (!optional.isPresent() || !((android.telecom.PhoneAccount) optional.orElseThrow()).hasCapabilities(4) || zBooleanValue || zBooleanValue2 || zBooleanValue3 || zBooleanValue5 || zBooleanValue6 || zBooleanValue7 || zpmVar.a().size() > 1) {
                ajcqVarZ = aiql.z(java.lang.Boolean.FALSE);
            } else {
                ajcqVarZ = ahvr.H(amzgVar.d(), new defpackage.kxa(zBooleanValue4, 2), ajctVar);
                ahoqVarW.a(ajcqVarZ);
            }
            ahoqVarW.close();
            return ajcqVarZ;
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.j;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        amzg amzgVar5 = this.g;
        amzg amzgVar6 = this.f;
        amzg amzgVar7 = this.e;
        amzg amzgVar8 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
