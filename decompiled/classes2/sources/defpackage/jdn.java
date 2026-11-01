package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jdn extends amzm {
    private final amzg b;
    private final amzg c;

    public jdn(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new amzw(defpackage.jdn.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        java.util.List list = (java.util.List) obj;
        qin qinVar = (qin) list.get(0);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(1)).booleanValue();
        aooh.f(qinVar, "content");
        if (zBooleanValue) {
            optionalEmpty = j$.util.Optional.of(new qie(aokc.a, 1, qinVar.c, true));
            aooh.c(optionalEmpty);
        } else {
            optionalEmpty = j$.util.Optional.empty();
            aooh.c(optionalEmpty);
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
