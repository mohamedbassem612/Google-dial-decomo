package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class utj extends amzm {
    private final amzg b;
    private final amzg c;
    private final amyz d;

    public utj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amyz amyzVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.utj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amyzVar3;
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        usg usgVar = (usg) list.get(0);
        ajct ajctVar = (ajct) list.get(1);
        j$.util.Objects.requireNonNull(usgVar);
        return aiql.z(new defpackage.uyg((defpackage.zka) new defpackage.tok(usgVar, 2), (ajas) new qat(this.d, ajctVar, 20)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
