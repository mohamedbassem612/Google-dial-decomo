package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfa implements defpackage.znp {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/service/RttCallMessageReceiver");
    public final android.telecom.Call b;
    public final ajcu c;
    public final defpackage.qfg d;
    public ajcq e;
    public final mfz f;
    public final java.util.concurrent.atomic.AtomicBoolean g = new java.util.concurrent.atomic.AtomicBoolean(false);
    public final zpz h;
    public final aazc i;
    private final ajct j;

    public qfa(android.telecom.Call call, ajct ajctVar, ajcu ajcuVar, defpackage.qfg qfgVar, aazc aazcVar, zpz zpzVar, mfz mfzVar) {
        this.b = call;
        this.j = ajctVar;
        this.c = ajcuVar;
        this.d = qfgVar;
        this.i = aazcVar;
        this.h = zpzVar;
        this.f = mfzVar;
    }

    public final ajcq b() {
        return ahvr.F(new defpackage.qfe(this, 1), this.j);
    }

    final void c() {
        if (this.g.compareAndSet(true, false)) {
            this.e.cancel(true);
            a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageReceiver", "stopPollingForNewMessages", 133, "RttCallMessageReceiver.java").v("RTT message polling stopped.");
        }
    }

    @Override // defpackage.znp
    public final ajcq ek() {
        c();
        ahrv ahrvVarG = ahrv.g(b());
        ocj ocjVar = new ocj(this, 19);
        ajcu ajcuVar = this.c;
        return ahrvVarG.i(ocjVar, ajcuVar).i(new ocj(this, 20), ajcuVar);
    }
}
