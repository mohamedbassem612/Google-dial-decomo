package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pwl extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;
    private final amzg e;
    private final amzg f;

    public pwl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pwl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
        this.e = amzs.b(amzgVar3);
        this.f = amzs.b(amzgVar4);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        mfz mfzVar = (mfz) list.get(0);
        java.lang.Boolean bool = (java.lang.Boolean) ((mgu) list.get(3)).a(new defpackage.pvv(((java.lang.Boolean) list.get(1)).booleanValue(), mfzVar, (zpm) list.get(2), (aoin) this.d, 0)).a(mfy.ct).f();
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        amzg amzgVar2 = this.e;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
