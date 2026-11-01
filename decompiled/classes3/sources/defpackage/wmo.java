package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wmo extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public wmo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.wmo.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        whh whhVar = (whh) list.get(0);
        defpackage.abtr abtrVar = (defpackage.abtr) list.get(1);
        return aiql.z(defpackage.uyg.L(new defpackage.tok(whhVar, 3), new defpackage.vug(abtrVar, 13), (ajct) list.get(2)));
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
