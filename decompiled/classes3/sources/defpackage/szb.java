package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szb extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;

    public szb(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6) {
        super(amyzVar2, new defpackage.amzw(defpackage.szb.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        lgj lgjVar = (lgj) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        if (optional.isPresent() && (lgjVar == lgj.e || lgjVar == lgj.d)) {
            return ahvr.H(this.f.d(), new defpackage.syf(2), ajctVar);
        }
        return (lgjVar == lgj.c || lgjVar == lgj.d) ? ahvr.H(this.g.d(), new defpackage.syf(2), ajctVar) : ahvr.H(this.c.d(), new defpackage.syf(3), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar.d()});
    }
}
