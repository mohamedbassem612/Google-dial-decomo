package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qec extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;

    public qec(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8) {
        super(amyzVar2, new defpackage.amzw(defpackage.qec.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ac  */
    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        boolean z = false;
        zms zmsVar = (zms) list.get(0);
        qdo qdoVar = (qdo) list.get(1);
        defpackage.zpo zpoVar = (defpackage.zpo) list.get(2);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(3)).booleanValue();
        defpackage.rce rceVar = (defpackage.rce) list.get(4);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(5)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(6)).booleanValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(7);
        defpackage.qdn qdnVar = (defpackage.qdn) qdoVar.k.get();
        boolean zEquals = zpoVar.equals(defpackage.zpo.f);
        if (zmsVar.a().equals(defpackage.zmw.ROUTE_WIRED_HEADSET) || zmsVar.a().equals(defpackage.zmw.ROUTE_SPEAKER) || zmsVar.a().equals(defpackage.zmw.ROUTE_BLUETOOTH) || zBooleanValue2 || ((zEquals && (zBooleanValue3 || ((java.lang.Boolean) optional.orElse(java.lang.Boolean.FALSE)).booleanValue())) || (!zBooleanValue && qdnVar.equals(defpackage.qdn.c)))) {
            z = true;
        } else {
            defpackage.rcd rcdVarB = defpackage.rcd.b(rceVar.c);
            if (rcdVarB == null) {
                rcdVarB = defpackage.rcd.EMPTY;
            }
            if (rcdVarB == defpackage.rcd.DIALPAD && qdnVar.equals(defpackage.qdn.c)) {
                z = true;
            }
        }
        return aiql.z(java.lang.Boolean.valueOf(z));
    }

    protected final ajcq c() {
        amzg amzgVar = this.i;
        amzg amzgVar2 = this.h;
        amzg amzgVar3 = this.g;
        amzg amzgVar4 = this.f;
        amzg amzgVar5 = this.e;
        amzg amzgVar6 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
