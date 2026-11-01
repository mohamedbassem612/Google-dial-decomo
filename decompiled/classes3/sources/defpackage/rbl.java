package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rbl extends amzm {
    private final amyz b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public rbl(amyz amyzVar, amyz amyzVar2, amyz amyzVar3, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.rbl.class), amyzVar);
        this.b = amyzVar3;
        this.c = amzs.b(amzgVar);
        this.d = amzs.b(amzgVar2);
        this.e = amzs.b(amzgVar3);
        this.f = amzs.b(amzgVar4);
        this.g = amzs.b(amzgVar5);
        this.h = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        aihd aihdVar = (aihd) list.get(0);
        zzx zzxVar = (zzx) list.get(1);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(2)).booleanValue();
        ajct ajctVar = (ajct) list.get(3);
        if (zBooleanValue) {
            return aiql.z(j$.util.Optional.empty());
        }
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.d;
        if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
            j$.util.Optional optionalMin = j$.util.Collection.-EL.stream(aihdVar).filter(new jty(zzxVar, 19)).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(1)));
            return optionalMin.isPresent() ? aiql.z(optionalMin) : ahvr.I(ahvr.B(amzgVar2.d(), java.lang.Throwable.class, new defpackage.rht(1), ajctVar), new defpackage.qfc(amzgVar, 14), ajctVar);
        }
        defpackage.qum qumVar = (defpackage.qum) j$.util.Collection.-EL.stream(aihdVar).map(new defpackage.pei(zzxVar, 13)).min(j$.util.Comparator.-CC.comparingInt(new fiy(20))).orElse((java.lang.Object) null);
        if (qumVar == null) {
            return aiql.z(j$.util.Optional.empty());
        }
        return qumVar != defpackage.qum.PROMO ? aiql.z(j$.util.Collection.-EL.stream(aihdVar).filter(new lvq(zzxVar, qumVar, 2, (byte[]) null)).min(j$.util.Comparator.-CC.comparingInt(new defpackage.rar(1)))) : ahvr.I(ahvr.B(amzgVar2.d(), java.lang.Throwable.class, new defpackage.pqn(20), ajctVar), new defpackage.qfc(amzgVar, 13), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.g;
        amzg amzgVar2 = this.f;
        return aiql.w(new ajcq[]{this.c.d(), this.e.d(), amzgVar2.d(), amzgVar.d()});
    }
}
