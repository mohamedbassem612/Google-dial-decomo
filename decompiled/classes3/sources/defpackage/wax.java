package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wax implements defpackage.znv, defpackage.zkd {
    public static final aimz a = aimz.i("com/android/dialer/wear/echo/impl/eligibility/EchoPhoneEligibilityChecker");
    public final defpackage.wbn b;
    public final defpackage.wbk c;
    private final aoss d;
    private final apni e;

    public wax(defpackage.wbk wbkVar, defpackage.wbn wbnVar, apni apniVar, aoss aossVar) {
        aooh.f(wbkVar, "echoPhoneRelay");
        aooh.f(wbnVar, "echoRingingController");
        aooh.f(apniVar, "androidJobs");
        aooh.f(aossVar, "lightweightScope");
        this.c = wbkVar;
        this.b = wbnVar;
        this.e = apniVar;
        this.d = aossVar;
    }

    @Override // defpackage.zkd
    public final void b() {
        aimz aimzVar = zih.a;
        this.e.i(aoov.al(this.d, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, this, 7)));
    }

    @Override // defpackage.znv
    public final ajcq ej() {
        return aosv.F(this.d, 0, new ung(this, (aoln) null, 20), 3);
    }
}
