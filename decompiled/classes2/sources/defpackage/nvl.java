package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nvl {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/wear/bam/ui/BamCenterFragmentPeer");
    public final aoss b;
    public final agzc c;
    public final defpackage.nvi d;
    public final defpackage.odo e;
    public boolean f;
    public boolean g;
    public final defpackage.iyh h;
    public final zjm i;
    public final afpl j;
    private final aoin k;
    private final zpm l;

    public nvl(aoss aossVar, agzc agzcVar, zjm zjmVar, zpm zpmVar, aazc aazcVar, defpackage.nvi nviVar, afpl afplVar, defpackage.odo odoVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(zpmVar, "callScopes");
        aooh.f(aazcVar, "clock");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        this.b = aossVar;
        this.c = agzcVar;
        this.i = zjmVar;
        this.l = zpmVar;
        this.d = nviVar;
        this.j = afplVar;
        this.e = odoVar;
        this.k = aoinVar;
        this.h = new defpackage.iyh(this, 5);
    }

    public final defpackage.mqt a() {
        defpackage.nvj nvjVar;
        j$.util.Optional optionalH = this.l.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar == null || (nvjVar = (defpackage.nvj) apqrVar.a(defpackage.nvj.class)) == null) {
            return null;
        }
        return nvjVar.D();
    }

    public final void b(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.k.a()).booleanValue()) {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.nuh(aonnVar, (aoln) null, 8, (int[]) null), 3);
            return;
        }
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.nuh((aoln) null, aonnVar, 7, (short[]) null));
    }
}
