package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lfg extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;

    public lfg(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11) {
        super(amyzVar2, new amzw(defpackage.lfg.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        lbw lbwVar = (lbw) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        defpackage.lee leeVar = (defpackage.lee) list.get(3);
        defpackage.ley leyVar = (defpackage.ley) list.get(4);
        qbe qbeVar = (qbe) list.get(5);
        j$.util.Objects.requireNonNull(lbwVar);
        return aiql.z(new uyg(new defpackage.iwm(lbwVar, 8), new acoa(this.d, this.e, this.f, this.g, this.j, qbeVar, leyVar, leeVar, context, ajctVar, 1)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.l;
        amzg amzgVar2 = this.k;
        amzg amzgVar3 = this.i;
        amzg amzgVar4 = this.h;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
