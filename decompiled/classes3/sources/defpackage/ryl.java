package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryl {
    public static final aimz a = aimz.i("com/android/dialer/patrick/account/sharing/ui/CallingCardSharingFragmentPeer");
    public final defpackage.ryi b;
    public final defpackage.sjf c;
    public final defpackage.ryp d;
    public final agtj e;
    public final defpackage.abxt f;
    public final defpackage.ryf g;
    public final aoin h;
    public final aoin i;
    public final aoin j;
    public final defpackage.sjl k;
    public final defpackage.sjh l;
    public final rlv m;
    public final agtk n;
    public final defpackage.sjh o;
    public final defpackage.zoe p;
    private final gpd q;
    private final apjb r;

    public ryl(defpackage.ryi ryiVar, defpackage.sjf sjfVar, defpackage.ryp rypVar, agtj agtjVar, apjb apjbVar, defpackage.abxt abxtVar, defpackage.ryf ryfVar, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, defpackage.sjl sjlVar, defpackage.sjh sjhVar, gpd gpdVar, rlv rlvVar) {
        defpackage.rye mmjVar;
        aooh.f(sjfVar, "navigationAdapter");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(aoinVar, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(aoinVar3, "enableCallingCardAccountPersistenceOnSave");
        aooh.f(sjlVar, "viewModel");
        aooh.f(sjhVar, "navigationController");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(rlvVar, "loggingBindings");
        this.b = ryiVar;
        this.c = sjfVar;
        this.d = rypVar;
        this.e = agtjVar;
        this.r = apjbVar;
        this.f = abxtVar;
        this.g = ryfVar;
        this.h = aoinVar;
        this.i = aoinVar2;
        this.j = aoinVar3;
        this.k = sjlVar;
        this.l = sjhVar;
        this.q = gpdVar;
        this.m = rlvVar;
        if (((java.lang.Boolean) aoinVar3.a()).booleanValue()) {
            java.lang.String str = sjlVar.a().h;
            aooh.f(str, "accountName");
            mmjVar = new defpackage.rye(ryfVar, str);
        } else {
            mmjVar = new mmj(ryfVar, 2);
        }
        this.p = apjbVar.G(2131427734, mmjVar);
        this.n = new defpackage.ryk(this);
        this.o = new defpackage.ryy(this, 1);
    }

    public final zas a() {
        return this.q.i((java.lang.String) null);
    }
}
