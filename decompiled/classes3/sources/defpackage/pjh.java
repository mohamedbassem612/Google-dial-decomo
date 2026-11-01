package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pjh extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public pjh(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.pjh.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        defpackage.zmn zmnVar = (defpackage.zmn) list.get(1);
        return aiql.z((j$.util.Optional) new mgr((mgu) list.get(2), (j$.util.Optional) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(zmnVar.e, optional, new defpackage.pgq(zmnVar, optional, 17, null))).a(mfy.bl).g(j$.util.function.Function.-CC.identity()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
