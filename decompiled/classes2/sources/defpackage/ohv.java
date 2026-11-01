package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ohv {
    public static final /* synthetic */ aoqc[] a = {new aooj(defpackage.ohv.class, "timeMsOfGridShown", "getTimeMsOfGridShown()J")};
    public static final aimz b = aimz.i("com/android/dialer/expresso/sender/impl/ui/ExpressoGridFragmentPeer");
    public final android.content.Context c;
    public final agzc d;
    public final defpackage.odo e;
    public final ccp f;
    public final aopd g;
    public final defpackage.iyh h;
    public final afpl i;
    private final aoss j;
    private final zpm k;
    private final apni l;

    public ohv(android.content.Context context, aoss aossVar, apni apniVar, agzc agzcVar, defpackage.odo odoVar, afpl afplVar, zpm zpmVar, aazc aazcVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(zpmVar, "callscopes");
        aooh.f(aazcVar, "clock");
        this.c = context;
        this.j = aossVar;
        this.l = apniVar;
        this.d = agzcVar;
        this.e = odoVar;
        this.i = afplVar;
        this.k = zpmVar;
        this.g = new aopd();
        this.f = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.ohc(defpackage.ohb.b), cdu.c);
        this.h = new defpackage.iyh(this, 7);
    }

    public final defpackage.oez a() {
        defpackage.oht ohtVarB = b();
        if (ohtVarB != null) {
            return ohtVarB.S();
        }
        return null;
    }

    public final defpackage.oht b() {
        j$.util.Optional optionalH = this.k.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        apqr apqrVar = (apqr) aooh.q(optionalH);
        if (apqrVar != null) {
            return (defpackage.oht) apqrVar.a(defpackage.oht.class);
        }
        return null;
    }

    public final ahtm c(defpackage.oif oifVar) {
        aooh.f(oifVar, "event");
        qbe qbeVarD = d();
        if (qbeVarD != null) {
            qbeVarD.a(qbc.jm);
        }
        this.l.i(aoov.am(this.j, 0, new defpackage.ohh(this, oifVar, (aoln) null, 4), 3));
        return ahtm.a;
    }

    public final qbe d() {
        defpackage.oht ohtVarB = b();
        if (ohtVarB != null) {
            return ohtVarB.cp();
        }
        return null;
    }
}
