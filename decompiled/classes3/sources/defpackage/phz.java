package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class phz extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public phz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.phz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.zmn zmnVar = (defpackage.zmn) list.get(1);
        return aiql.z((java.lang.String) new mgt((mgu) list.get(2), (java.lang.String) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(zmnVar.d, optional, new defpackage.vxb(zmnVar, 15))).a(mfy.bI).f());
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
