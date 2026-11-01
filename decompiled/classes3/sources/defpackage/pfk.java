package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pfk extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;

    public pfk(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4) {
        super(amyzVar2, new defpackage.amzw(defpackage.pfk.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        ops opsVar = (ops) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        defpackage.abwd abwdVar = (defpackage.abwd) list.get(3);
        int dimension = (int) context.getResources().getDimension(2131165390);
        defpackage.akcu akcuVar = new defpackage.akcu();
        akcuVar.f();
        akcuVar.g(true);
        akcuVar.h(false);
        return ahvr.H(opsVar.e(abwdVar, akcuVar.e(), dimension, dimension), new icy(context, opsVar, abwdVar, 8, (int[]) null), ajctVar);
    }

    protected final ajcq c() {
        amzg amzgVar = this.e;
        amzg amzgVar2 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar2.d(), amzgVar.d()});
    }
}
