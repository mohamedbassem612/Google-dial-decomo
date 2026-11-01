package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpz extends amzm {
    private final amzg b;

    public jpz(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpz.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optionalOfNullable, "dialerPhoneNumber");
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(13), 19);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(a.k((aonj) hvdVar.a, optionalOfNullable.get()));
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
