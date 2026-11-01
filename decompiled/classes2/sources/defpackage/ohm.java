package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohm extends amzm {
    private final amzg b;

    public ohm(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new amzw(defpackage.ohm.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.ohi ohiVar = (defpackage.ohi) obj;
        aooh.f(ohiVar, "expressoController");
        j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.ohc(ohiVar.k));
        aooh.e(optionalOf, "of(...)");
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
