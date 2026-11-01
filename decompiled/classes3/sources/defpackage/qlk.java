package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qlk extends amzm {
    private final amzg b;

    public qlk(amyz amyzVar, amyz amyzVar2, amzg amzgVar) {
        super(amyzVar2, new defpackage.amzw(defpackage.qlk.class), amyzVar);
        this.b = amzs.b(amzgVar);
    }

    public final /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.qko qkoVar = (defpackage.qko) obj;
        aooh.f(qkoVar, "statusBarNotificationController");
        ajcq ajcqVarG = qkoVar.s.g(new defpackage.qfe(qkoVar, 6), qkoVar.n);
        aooh.e(ajcqVarG, "getHasRingerBeenSilenced(...)");
        return ajcqVarG;
    }

    protected final ajcq c() {
        return this.b.d();
    }
}
