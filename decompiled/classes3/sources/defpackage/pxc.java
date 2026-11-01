package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pxc extends amzm {
    private final amzg b;
    private final amzg c;

    public pxc(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.pxc.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        defpackage.pxh pxhVar = (defpackage.pxh) list.get(0);
        mgu mguVar = (mgu) list.get(1);
        defpackage.whl whlVar = new defpackage.whl(null, null);
        whlVar.a = pxhVar.e.a().b;
        whlVar.i((j$.util.Optional) pxhVar.g.get());
        return aiql.z((defpackage.pux) new mgr(mguVar, whlVar.h()).b(mfy.co).b(new defpackage.pir(19)).h(new defpackage.pvu(1)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
