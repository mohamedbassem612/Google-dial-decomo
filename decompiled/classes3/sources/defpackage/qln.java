package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qln extends amzm {
    private final amzg b;

    public qln(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qln.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        j$.util.Optional optionalEmpty;
        defpackage.qix qixVar = (defpackage.qix) obj;
        aooh.f(qixVar, "notificationType");
        if (ajsz.cW(new defpackage.qix[]{defpackage.qix.c, defpackage.qix.b}).contains(qixVar)) {
            optionalEmpty = j$.util.Optional.of("call");
            aooh.c(optionalEmpty);
        } else {
            optionalEmpty = j$.util.Optional.empty();
            aooh.c(optionalEmpty);
        }
        return aiql.z(optionalEmpty);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
