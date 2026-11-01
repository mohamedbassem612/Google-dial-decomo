package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzf implements defpackage.zmp {
    public final defpackage.afpl b;
    public final ipc c;
    private final aoss e;
    public static final wsc d = new wsc((byte[]) null);
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/gnp/SonicGnpEventLogger");

    public tzf(ipc ipcVar, defpackage.afpl afplVar, aoss aossVar) {
        aooh.f(afplVar, "inCallProductionComponentBuilder");
        aooh.f(aossVar, "lightweightScope");
        this.c = ipcVar;
        this.b = afplVar;
        this.e = aossVar;
    }

    @Override // defpackage.zmp
    public final void el(android.telecom.CallAudioState callAudioState) {
        aooh.f(callAudioState, "newCallAudioState");
        if (callAudioState.getRoute() == 1) {
            a.b().l("com/android/dialer/sonic/impl/gnp/SonicGnpEventLogger", "onAudioStateChanged", 38, "SonicGnpEventLogger.kt").v("earpiece; do not log event");
        } else {
            aoov.an(this.e, (aolr) null, 0, new defpackage.txf(this, (aoln) null, 12), 3);
        }
    }
}
