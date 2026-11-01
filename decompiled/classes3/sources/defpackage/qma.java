package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qma extends amzm {
    private final amzg b;

    public qma(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qma.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        aihd aihdVar = (aihd) obj;
        aooh.f(aihdVar, "safeBadgeIcons");
        java.util.Comparator comparatorComparing = j$.util.Comparator.-CC.comparing(new defpackage.pei(new qks(2), 10));
        aooh.e(comparatorComparing, "comparing(...)");
        j$.util.Optional optionalOfNullable = j$.util.Optional.ofNullable(ajsz.bK(aihdVar, comparatorComparing));
        aooh.e(optionalOfNullable, "ofNullable(...)");
        return aiql.z(optionalOfNullable);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
