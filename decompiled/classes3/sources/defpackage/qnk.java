package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qnk extends amzm {
    private final amzg b;

    public qnk(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qnk.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qnd qndVar = (defpackage.qnd) obj;
        aimz aimzVar = defpackage.qng.a;
        aooh.f(qndVar, "videoAnswerController");
        j$.util.Optional optional = (j$.util.Optional) qndVar.i.get();
        aooh.e(optional, "getRingingVideoState(...)");
        return aiql.z(optional);
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
