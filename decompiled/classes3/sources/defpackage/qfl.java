package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class qfl implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ boolean a;

    public /* synthetic */ qfl(boolean z, int i) {
        this.$cid = i;
        this.a = z;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        int i = this.$cid;
        if (i == 0) {
            return this.a ? j$.util.Optional.of(defpackage.pzp.RTT_CHAT_SCREEN) : j$.util.Optional.empty();
        }
        if (i == 1) {
            defpackage.otm otmVar = new defpackage.otm((char[]) null);
            otmVar.a = "system_sensor_manager_throws_illegal_state_exception";
            otmVar.f(this.a ? "true" : "");
            return otmVar.e();
        }
        if (i == 2) {
            return this.a ? j$.util.Optional.of(defpackage.ouk.REVELIO) : j$.util.Optional.empty();
        }
        boolean z = this.a;
        if (i != 3) {
            return z ? j$.util.Optional.of(new wsc((byte[]) null)) : j$.util.Optional.empty();
        }
        if (!z) {
            return j$.util.Optional.empty();
        }
        defpackage.rei reiVar = new defpackage.rei();
        reiVar.a = defpackage.rea.CONTROLLER_XATU;
        reiVar.b();
        reiVar.c(2132021051);
        return j$.util.Optional.of(reiVar.a());
    }
}
