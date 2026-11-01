package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfd {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/service/RttCallMessageSender");
    public final android.telecom.Call b;
    public final ajct c;
    public final defpackage.qfg d;
    public final mfz e;
    private final ajcu f;
    private final ajwr g = new ajwr();

    public qfd(android.telecom.Call call, ajct ajctVar, ajcu ajcuVar, defpackage.qfg qfgVar, mfz mfzVar) {
        this.b = call;
        this.c = ajctVar;
        this.f = ajcuVar;
        this.d = qfgVar;
        this.e = mfzVar;
    }

    public final ajcq a() {
        return ahrv.g(this.d.c()).i(new defpackage.qfc(this, 0), this.c);
    }

    public final ajcq b(java.lang.String str) {
        a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageSender", "updateCurrentMessage", 65, "RttCallMessageSender.java").y("updateCurrentMessage: %s", aais.aD(str));
        return this.g.e(ahqx.b(new qat(this, str, 4, (byte[]) null)), this.c);
    }

    public final ajcq c(java.lang.String str) {
        return ahvr.F(new defpackage.qfb(this, str, 0), this.f);
    }
}
