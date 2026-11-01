package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syx extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public syx(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.syx.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qiy qiyVarE;
        java.util.List list = (java.util.List) obj;
        lgj lgjVar = (lgj) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        java.lang.Long l = (java.lang.Long) list.get(2);
        l.longValue();
        if (lgjVar != lgj.e) {
            defpackage.acxk acxkVar = new defpackage.acxk();
            j$.util.Optional optionalEmpty = j$.util.Optional.empty();
            aooh.f(optionalEmpty, "callConnectTimeMillis");
            acxkVar.g((java.lang.Long) aooh.q(optionalEmpty));
            acxkVar.f(false);
            qiyVarE = acxkVar.e();
        } else {
            defpackage.acxk acxkVar2 = new defpackage.acxk();
            acxkVar2.g(l);
            acxkVar2.f(!zBooleanValue);
            qiyVarE = acxkVar2.e();
        }
        return aiql.z(qiyVarE);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
