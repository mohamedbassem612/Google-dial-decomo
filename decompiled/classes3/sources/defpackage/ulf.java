package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulf extends amzm {
    private final amzg b;

    public ulf(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.ulf.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        aooh.f(optionalOfNullable, "disconnectionCause");
        defpackage.taj tajVar = new defpackage.taj(new ukw(0), 8);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(tajVar.a.a(optionalOfNullable.get()));
        }
        defpackage.taj tajVar2 = new defpackage.taj(new ukw(2), 9);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.k((aonj) tajVar2.a, optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        java.lang.Boolean bool = (java.lang.Boolean) aooh.p(optionalOfNullable, java.lang.Boolean.FALSE);
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
