package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qfj {
    public static final aimz a = aimz.i("com/android/dialer/incall/rtt/service/RttChatController");
    public static final java.lang.Long b = 5L;
    public final ajct c;
    public final defpackage.qfd d;
    public final defpackage.zmo e;
    public final zms f;
    public final zmq g;
    public final rlv h;
    public final agsm i;
    public final aoin j;
    public boolean k;
    public boolean l;
    public final defpackage.pqm m;
    public final zpm n;
    public final zpz o;
    public final defpackage.qbe p;
    public final defpackage.afpl q;
    private final defpackage.qfa r;

    public qfj(ajct ajctVar, defpackage.qfd qfdVar, defpackage.qfa qfaVar, defpackage.pqm pqmVar, defpackage.zmo zmoVar, zpm zpmVar, zms zmsVar, zmq zmqVar, zpz zpzVar, rlv rlvVar, defpackage.qbe qbeVar, defpackage.afpl afplVar, agsm agsmVar, aoin aoinVar) {
        this.c = ajctVar;
        this.d = qfdVar;
        this.r = qfaVar;
        this.m = pqmVar;
        this.e = zmoVar;
        this.n = zpmVar;
        this.f = zmsVar;
        this.g = zmqVar;
        this.o = zpzVar;
        this.h = rlvVar;
        this.p = qbeVar;
        this.q = afplVar;
        this.i = agsmVar;
        this.j = aoinVar;
    }

    public final void a() {
        a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "hideDialpad", 184, "RttChatController.java").v("hideDialpad");
        this.k = false;
        this.o.a(ajcm.a);
    }

    public final void b() {
        a.b().l("com/android/dialer/incall/rtt/service/RttChatController", "onMergeCallClicked", 156, "RttChatController.java").v("onMergeCallClicked");
        this.m.o();
    }

    public final void c() {
        defpackage.qfa qfaVar = this.r;
        if (qfaVar.g.compareAndSet(false, true)) {
            defpackage.qfa.a.b().l("com/android/dialer/incall/rtt/service/RttCallMessageReceiver", "startPollingForNewMessages", 72, "RttCallMessageReceiver.java").v("RTT message polling");
            java.lang.Runnable runnableH = ahqx.h(new defpackage.pmx(qfaVar, 16));
            aazc aazcVar = qfaVar.i;
            qfaVar.e = defpackage.ahus.t(runnableH, 0L, 200L, java.util.concurrent.TimeUnit.MILLISECONDS, qfaVar.c);
        }
    }

    public final void d() {
        this.r.c();
    }
}
