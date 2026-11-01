package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wly extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public wly(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.wly.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        java.util.List list = (java.util.List) obj;
        defpackage.wpc wpcVar = (defpackage.wpc) list.get(0);
        defpackage.wlf wlfVar = (defpackage.wlf) list.get(1);
        defpackage.wlf wlfVar2 = (defpackage.wlf) list.get(2);
        int iX = a.X(wpcVar.b);
        if (iX == 0) {
            throw null;
        }
        int i = iX - 1;
        if (i != 1) {
            optionalOf = i != 2 ? j$.util.Optional.empty() : j$.util.Optional.of(wlfVar);
        } else {
            optionalOf = j$.util.Optional.of(wlfVar2);
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
