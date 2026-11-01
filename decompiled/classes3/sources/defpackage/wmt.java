package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmt extends amzm {
    private final amzg b;
    private final amyz c;
    private final amzg d;

    public wmt(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amyz amyzVar3, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmt.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amyzVar3;
        this.d = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        whh whhVar = (whh) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        j$.util.Objects.requireNonNull(whhVar);
        return aiql.z(defpackage.uyg.L(new defpackage.tok(whhVar, 5), new defpackage.vug(this.c, 10), ajctVar));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.d.d()});
    }
}
