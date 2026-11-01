package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class muk implements defpackage.ahek {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/dobby/impl/feedback/upload/DobbyDonationsWorkerScheduler");
    public final defpackage.zjx b;
    public final defpackage.muj c;
    private final defpackage.aoss d;

    public muk(defpackage.aoss aossVar, defpackage.zjx zjxVar, defpackage.muj mujVar) {
        defpackage.aooh.f(aossVar, "lightweightScope");
        defpackage.aooh.f(zjxVar, "dialerTikTokWorkManager");
        defpackage.aooh.f(mujVar, "donationsWorker");
        this.d = aossVar;
        this.b = zjxVar;
        this.c = mujVar;
    }

    @Override // defpackage.ahek
    public final defpackage.ajcq a() {
        return defpackage.aosv.F(this.d, 0, new defpackage.mev(this, (defpackage.aoln) null, 3), 3);
    }
}
