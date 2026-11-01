package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pzz extends amzm {
    private final amzg b;
    private final amzg c;

    public pzz(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pzz.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        return aiql.z((j$.util.Optional) new mgr((mgu) list.get(1), j$.util.Collection.-EL.stream((aihd) list.get(0)).min(j$.util.Comparator.-CC.comparingInt(new fiy(18)))).a(mfy.cI).g(new defpackage.pvu(4)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
