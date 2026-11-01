package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mwj {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/notification/DobbyNotificationController");
    public final android.content.Context b;
    public final aoss c;
    public final ovb d;
    public final defpackage.nbr e;
    public final defpackage.mqt f;
    public final defpackage.nej g;
    public final defpackage.neu h;
    public final defpackage.mba i;
    public final defpackage.nhq j;
    public final aoin k;
    public boolean l;
    public boolean m;
    public final qbe n;
    public final ptx o;
    public final defpackage.ogj p;
    public final ipc q;
    private final aoin r;

    public mwj(android.content.Context context, aoss aossVar, ovb ovbVar, defpackage.ogj ogjVar, defpackage.nbr nbrVar, defpackage.mqt mqtVar, defpackage.nej nejVar, ipc ipcVar, defpackage.neu neuVar, defpackage.mba mbaVar, qbe qbeVar, ptx ptxVar, defpackage.nhq nhqVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "appContext");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ovbVar, "answeredCallState");
        aooh.f(ogjVar, "dobbyCallScopeState");
        aooh.f(nbrVar, "dobbyDuplexRelay");
        aooh.f(mqtVar, "dobbyLoggingCoordinator");
        aooh.f(nejVar, "lifecycleController");
        aooh.f(qbeVar, "inCallLogging");
        aooh.f(ptxVar, "callProperties");
        aooh.f(nhqVar, "dobbySession");
        aooh.f(aoinVar, "useCoroutinesLaunch");
        aooh.f(aoinVar2, "enableDobbyScreeningNotificationFix");
        this.b = context;
        this.c = aossVar;
        this.d = ovbVar;
        this.p = ogjVar;
        this.e = nbrVar;
        this.f = mqtVar;
        this.g = nejVar;
        this.q = ipcVar;
        this.h = neuVar;
        this.i = mbaVar;
        this.n = qbeVar;
        this.o = ptxVar;
        this.j = nhqVar;
        this.r = aoinVar;
        this.k = aoinVar2;
    }

    public final void a(aoss aossVar, aonn aonnVar) {
        if (((java.lang.Boolean) this.r.a()).booleanValue()) {
            aoov.an(aossVar, (aolr) null, 0, new defpackage.itj(aonnVar, (aoln) null, 5, (char[]) null), 3);
            return;
        }
        aimz aimzVar = zih.a;
        aoov.al(aossVar, zih.b.plus(aols.a), 1, new defpackage.itj((aoln) null, aonnVar, 4, (byte[]) null));
    }
}
