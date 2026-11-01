package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nza {
    public static final aimz a = aimz.i("com/android/dialer/duo/tidepods/DuoUpgradeSupportedCache");
    public final nwu b;
    public final android.content.Context c;
    public final ajcu d;
    public final ajct e;
    public final aoin f;
    public final java.util.concurrent.atomic.AtomicReference g;
    public final agtc h;
    public final zpz i;
    public final qbe j;

    public nza(nwu nwuVar, android.content.Context context, ajcu ajcuVar, ajct ajctVar, aoin aoinVar, zpz zpzVar, qbe qbeVar) {
        aooh.f(nwuVar, "meetCallController");
        aooh.f(context, "appContext");
        aooh.f(ajcuVar, "lightweightScheduledExecutor");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(qbeVar, "inCallLogging");
        this.b = nwuVar;
        this.c = context;
        this.d = ajcuVar;
        this.e = ajctVar;
        this.f = aoinVar;
        this.i = zpzVar;
        this.j = qbeVar;
        this.g = new java.util.concurrent.atomic.AtomicReference(null);
        this.h = new agtc(new defpackage.ibg(this, 18), ajctVar);
    }
}
