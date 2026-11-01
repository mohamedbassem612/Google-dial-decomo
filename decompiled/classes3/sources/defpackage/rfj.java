package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rfj extends amzm {
    private final amzg b;

    public rfj(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.rfj.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalOf;
        aihd aihdVar = (aihd) j$.util.Collection.-EL.stream((aihd) obj).map(new defpackage.rat(2)).collect(aido.b);
        defpackage.rea reaVar = defpackage.rea.CONTROLLER_ATLAS;
        defpackage.rea reaVar2 = defpackage.rea.CONTROLLER_XATU;
        if (aihdVar.equals(aihd.r(reaVar, reaVar2))) {
            optionalOf = j$.util.Optional.of(defpackage.rev.PROMO_TEXT_ATLAS_AND_XATU);
        } else if (aihdVar.equals(new aile(reaVar))) {
            optionalOf = j$.util.Optional.of(defpackage.rev.PROMO_TEXT_ATLAS);
        } else {
            optionalOf = aihdVar.equals(new aile(reaVar2)) ? j$.util.Optional.of(defpackage.rev.PROMO_TEXT_XATU) : j$.util.Optional.empty();
        }
        return aiql.z(optionalOf);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
