package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlj extends amzm {
    private final amzg b;
    private final amzg c;

    public qlj(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlj.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        j$.util.Optional optional = (j$.util.Optional) list.get(0);
        j$.util.Optional optionalOfNullable = (j$.util.Optional) list.get(1);
        aooh.f(optional, "defaultFullScreenIntent");
        aooh.f(optionalOfNullable, "oemNotificationModifier");
        defpackage.pnh pnhVar = new defpackage.pnh(new defpackage.qji(optional, 5), 20);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(pnhVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z((j$.util.Optional) aooh.p(optionalOfNullable, optional));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
