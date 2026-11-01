package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class snx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public snx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.snx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.zfd zfdVar = (defpackage.zfd) list.get(0);
        defpackage.zff zffVar = (defpackage.zff) list.get(1);
        aoss aossVar = (aoss) list.get(2);
        defpackage.ryu ryuVar = (defpackage.ryu) list.get(3);
        j$.util.Optional optional = (j$.util.Optional) list.get(4);
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ryuVar, "inCallProductionComponentRcsSessionFactoryImplFactory");
        aooh.f(optional, "rcsSessionFlowLogger");
        if (zfdVar == null) {
            defpackage.rhb rhbVar = new defpackage.rhb(new defpackage.skk(12), 8);
            if (true == optional.isPresent()) {
                rhbVar.a.a(optional.get());
            }
            return aiql.z((java.lang.Object) null);
        }
        if (zffVar != null) {
            return aosv.F(aossVar, 0, new hcn(ryuVar, zffVar, zfdVar, (aoln) null, 14), 3);
        }
        defpackage.rhb rhbVar2 = new defpackage.rhb(new defpackage.skk(13), 9);
        if (true == optional.isPresent()) {
            rhbVar2.a.a(optional.get());
        }
        return aiql.z((java.lang.Object) null);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        amzg amzgVar3 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
