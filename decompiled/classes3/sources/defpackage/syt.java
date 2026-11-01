package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class syt extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;

    public syt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5) {
        super(amyzVar2, new defpackage.amzw(defpackage.syt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        swq swqVar = (swq) list.get(0);
        tkl tklVar = (tkl) list.get(1);
        ajct ajctVar = (ajct) list.get(2);
        j$.util.Objects.requireNonNull(swqVar);
        return aiql.z(new defpackage.uyg((defpackage.zka) new nfp(swqVar, 13), (ajas) new kff(this.e, this.c, tklVar, ajctVar, 11)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.f;
        return aiql.w(new ajcq[]{this.b.d(), this.d.d(), amzgVar.d()});
    }
}
