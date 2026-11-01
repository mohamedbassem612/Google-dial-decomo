package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jpp extends amzm {
    private final amzg b;

    public jpp(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.jpp.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [aonj, java.lang.Object] */
    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
        java.util.Set set = defpackage.jpk.a;
        aooh.f(optionalOfNullable, "telecomCallDuration");
        defpackage.hvd hvdVar = new defpackage.hvd(new defpackage.jak(10), 18);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = j$.util.Optional.ofNullable(hvdVar.a.a(optionalOfNullable.get()));
        }
        aooh.e(optionalOfNullable, "map(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
