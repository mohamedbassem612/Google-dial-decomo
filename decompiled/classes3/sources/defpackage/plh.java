package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class plh extends amzm {
    private final amzg b;

    public plh(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.plh.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty = (j$.util.Optional) obj;
        if (true == optionalEmpty.isPresent()) {
            optionalEmpty = j$.util.Optional.ofNullable(java.lang.Integer.valueOf(((defpackage.sot) optionalEmpty.get()).d));
        }
        if (true == optionalEmpty.isPresent() && ((java.lang.Integer) optionalEmpty.get()).intValue() == 0) {
            optionalEmpty = j$.util.Optional.empty();
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
