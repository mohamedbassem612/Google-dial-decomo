package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wps extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public wps(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.wps.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        ajct ajctVar = (ajct) list.get(0);
        whh whhVar = (whh) list.get(1);
        j$.util.Objects.requireNonNull(whhVar);
        return aiql.z(new defpackage.uyg((defpackage.zka) new defpackage.tok(whhVar, 6), (ajas) new defpackage.vfm(this.d, ajctVar, 18)));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
