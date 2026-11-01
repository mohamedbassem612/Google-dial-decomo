package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uoo {
    public final apni A;
    public final aogc B;
    private final ajct D;
    private final ahpz E;
    private final ccp F;
    public final umx c;
    public final defpackage.uog d;
    public final defpackage.agzc e;
    public final odo f;
    public final aoss g;
    public final ojo h;
    public final agtj i;
    public final rlv j;
    public final uof k;
    public final aoin l;
    public final aoin m;
    public final aoin n;
    public final aoin o;
    public boolean p;
    public final ok q;
    public final defpackage.uok r;
    public final odm s;
    public final defpackage.uol t;
    public final ok u;
    public final lxm v;
    public final zjm w;
    public final gpd x;
    public final defpackage.abtr y;
    public final aais z;
    public static final java.lang.String[] a = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final aimz b = aimz.i("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer");
    private static final defpackage.uoj C = new defpackage.uoj();

    public uoo(umx umxVar, defpackage.uog uogVar, defpackage.agzc agzcVar, odo odoVar, aoss aossVar, ajct ajctVar, apni apniVar, aais aaisVar, defpackage.abtr abtrVar, gpd gpdVar, aogc aogcVar, ojo ojoVar, ahpz ahpzVar, agtj agtjVar, rlv rlvVar, lxm lxmVar, uof uofVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, zjm zjmVar) {
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(ajctVar, "lightweightExecutor");
        aooh.f(apniVar, "androidJobs");
        aooh.f(abtrVar, "callPlacer");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(ojoVar, "dialerContentResolver");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "enableCallLogInCompose");
        this.c = umxVar;
        this.d = uogVar;
        this.e = agzcVar;
        this.f = odoVar;
        this.g = aossVar;
        this.D = ajctVar;
        this.A = apniVar;
        this.z = aaisVar;
        this.y = abtrVar;
        this.x = gpdVar;
        this.B = aogcVar;
        this.h = ojoVar;
        this.E = ahpzVar;
        this.i = agtjVar;
        this.j = rlvVar;
        this.v = lxmVar;
        this.k = uofVar;
        this.l = aoinVar;
        this.m = aoinVar2;
        this.n = aoinVar3;
        this.o = aoinVar4;
        this.w = zjmVar;
        this.F = new androidx.compose.runtime.ParcelableSnapshotMutableState(und.a, cdu.c);
        this.p = true;
        this.q = uogVar.O(new oz(), new defpackage.uoh(this, 1));
        this.r = new defpackage.uok(this, ahpzVar, ajctVar);
        this.s = new defpackage.quy(this, 15);
        this.t = new defpackage.uol(this);
        this.u = uogVar.O(C, new defpackage.uoh(this, 0));
    }

    public final void a() {
        aimz aimzVar = b;
        aimzVar.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer", "onAddFavoriteClicked", 324, "FavoritesBarFragmentPeer.kt").v("Add Favorite clicked");
        try {
            sky skyVar = new sky(this, 14);
            aimzVar.b().l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer", "bypassStrictMode", 383, "FavoritesBarFragmentPeer.kt").v("enter bypassStrict Mode");
            android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
            aooh.e(vmPolicy, "getVmPolicy(...)");
            android.os.StrictMode.setVmPolicy(android.os.StrictMode.VmPolicy.LAX);
            try {
                skyVar.a();
            } finally {
                android.os.StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (android.content.ActivityNotFoundException e) {
            b.b().i(zct.b).k(e).l("com/android/dialer/speeddial/bar/impl/ui/FavoritesBarFragmentPeer", "onAddFavoriteClicked", 334, "FavoritesBarFragmentPeer.kt").v("No contact app available to display the contacts");
            defpackage.agby.o(this.d.N(), 2132018660, 0).h();
        }
    }

    public final ttj b() {
        return (ttj) this.F.a();
    }

    public final void c(ttj ttjVar) {
        this.F.b(ttjVar);
    }
}
