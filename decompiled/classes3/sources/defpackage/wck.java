package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wck implements defpackage.znt {
    public static final aimz a = aimz.i("com/android/dialer/wear/simulatedringing/impl/SimulatedRingingRingerSilencedListener");
    public final defpackage.zij b;
    public final defpackage.ptx c;
    private final aoss d;

    public wck(defpackage.ptx ptxVar, defpackage.zij zijVar, aoss aossVar) {
        aooh.f(ptxVar, "callProperties");
        aooh.f(aossVar, "lightweightScope");
        this.c = ptxVar;
        this.b = zijVar;
        this.d = aossVar;
    }

    @Override // defpackage.znt
    public final ajcq b() {
        return aosv.F(this.d, 0, new defpackage.wcj(this, (aoln) null, 0), 3);
    }
}
