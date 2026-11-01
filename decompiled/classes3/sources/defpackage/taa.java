package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class taa extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amyz e;
    private final amzg f;

    public taa(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amyz amyzVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.taa.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amyzVar3;
        this.f = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(1);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(2);
        swn swnVar = (swn) list.get(3);
        if (optional.isPresent() && optional2.isPresent()) {
            amyz amyzVar = this.e;
            lhc lhcVarA = lhd.a(2, (adnw) optional.orElseThrow(), (adnw) optional2.orElseThrow());
            lhcVarA.d(((java.lang.Boolean) amyzVar.a()).booleanValue());
            lhcVarA.c(optional3);
            lhcVarA.b(swnVar.a());
            optionalEmpty = j$.util.Optional.of(lhcVarA.a());
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
