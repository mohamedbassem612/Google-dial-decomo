package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xdp extends amzm {
    private final amzg b;

    public xdp(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.xdp.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        if (((j$.util.Optional) obj).isPresent()) {
            defpackage.rei reiVar = new defpackage.rei();
            reiVar.a = defpackage.rea.CONTROLLER_ATLAS;
            reiVar.b();
            reiVar.c(2132017372);
            optionalOf = j$.util.Optional.of(reiVar.a());
        } else {
            optionalOf = j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
