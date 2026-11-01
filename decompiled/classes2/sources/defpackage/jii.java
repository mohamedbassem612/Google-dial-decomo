package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jii implements znr, znv {
    public static final aimz a = aimz.i("com/android/dialer/beesly/logging/BeeslyLoggingCallListener");
    public final defpackage.jif b;
    public long c;
    private final aoss d;

    public jii(aoss aossVar, defpackage.jif jifVar, aazc aazcVar) {
        aooh.f(aossVar, "coroutineScope");
        aooh.f(jifVar, "beeslyCallEventClearcutLogger");
        aooh.f(aazcVar, "clock");
        this.d = aossVar;
        this.b = jifVar;
        this.c = -1L;
    }

    public final ajcq a() {
        return aosv.F(this.d, 0, new defpackage.jeb(this, (aoln) null, 19), 3);
    }

    public final ajcq ej() {
        if (this.c == -1) {
            this.c = android.os.SystemClock.elapsedRealtime();
        }
        return ajcm.a;
    }
}
