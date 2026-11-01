package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qxc extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amyz f;

    public qxc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amyz amyzVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.qxc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amyzVar4;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        her herVar = (her) list.get(1);
        if (!((java.lang.Boolean) list.get(2)).booleanValue() && zBooleanValue && (((java.lang.Boolean) this.e.a()).booleanValue() || ((java.lang.Boolean) this.f.a()).booleanValue() || !j$.util.Collection.-EL.stream(((zpm) herVar.a).a()).anyMatch(new mif(8)))) {
            z = true;
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
