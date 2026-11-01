package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rmz implements defpackage.znk {
    public static final aimz a = aimz.i("com/android/dialer/logging/redial/RedialLoggingCallConnectedListener");
    public final defpackage.rnn b;
    private final aoss c;

    public rmz(defpackage.rnn rnnVar, aoss aossVar) {
        aooh.f(rnnVar, "redialLogging");
        aooh.f(aossVar, "lightweightScope");
        this.b = rnnVar;
        this.c = aossVar;
    }

    @Override // defpackage.znk
    public final ajcq b() {
        return aosv.F(this.c, 0, new defpackage.roy(this, (aoln) null, 1), 3);
    }
}
