package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udg implements lnq {
    public static final aimz a = aimz.i("com/android/dialer/spam/callscreeningservice/SpamCallResponseVoter");
    public final rlv b;
    public final defpackage.sqt c;
    public final uhs d;
    public final tvn e;
    private final aoss f;
    private final mgw g;

    public udg(aoss aossVar, rlv rlvVar, uhs uhsVar, tvn tvnVar, defpackage.sqt sqtVar, mgw mgwVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(uhsVar, "spamSettings");
        aooh.f(mgwVar, "eventRecoder");
        this.f = aossVar;
        this.b = rlvVar;
        this.d = uhsVar;
        this.e = tvnVar;
        this.c = sqtVar;
        this.g = mgwVar;
    }

    public final ajcq a(lmq lmqVar) {
        aooh.f(lmqVar, "callScreeningDetails");
        return aosv.F(this.f, 0, new defpackage.txm(lmqVar, this, (aoln) null, 7), 3);
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        gus.az(new mhc[]{gus.aw("SpamCallInfoBasedVoter"), gus.aw(str), gus.aw(str2)});
        this.g.c();
    }
}
