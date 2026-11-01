package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public lfb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new amzw(defpackage.lfb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.lll lllVar = (defpackage.lll) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        zdl zdlVar = (zdl) list.get(2);
        ajct ajctVar = (ajct) list.get(3);
        if (!optional.isPresent()) {
            return aiql.z(j$.util.Optional.empty());
        }
        pgi pgiVar = (pgi) optional.orElseThrow();
        defpackage.lls llsVar = ((defpackage.llv) pgiVar.b).g;
        if (llsVar == null) {
            llsVar = defpackage.lls.a;
        }
        defpackage.llw llwVarW = pgiVar.w(llsVar, lllVar);
        return ahvr.H(zdlVar.a(llwVarW.a), new defpackage.kxn(llwVarW, 20), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
