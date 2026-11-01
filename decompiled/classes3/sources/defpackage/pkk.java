package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pkk extends amzm {
    private final amzg b;

    public pkk(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.pkk.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalMin = j$.util.Collection.-EL.stream((aihd) obj).min(j$.util.Comparator.-CC.comparingInt(new fiy(12)));
        if (true == optionalMin.isPresent()) {
            int iAR = a.aR(((defpackage.plt) optionalMin.get()).d);
            optionalMin = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(iAR != 0 && iAR == 3));
        }
        java.lang.Boolean bool = (java.lang.Boolean) optionalMin.orElse(java.lang.Boolean.FALSE);
        bool.booleanValue();
        return aiql.z(bool);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
