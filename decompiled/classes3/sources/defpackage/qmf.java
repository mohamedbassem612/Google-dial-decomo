package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qmf extends amzm {
    private final amzg b;

    public qmf(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qmf.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        aooh.f(optionalOfNullable, "carrierConfig");
        defpackage.qkv qkvVar = new defpackage.qkv(new qks(0), 1);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.k((aonj) qkvVar.a, optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        java.lang.Boolean bool = (java.lang.Boolean) aooh.p(optionalOfNullable, java.lang.Boolean.TRUE);
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
