package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class npr {
    public static final aimz a = aimz.i("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer");
    public final defpackage.npg b;
    public final android.content.Context c;
    public final aoss d;
    public final defpackage.npe e;
    public final mnl f;
    public final mvy g;
    public final aoin h;
    public final agtj i;
    public final rlv j;
    public final aoin k;
    public final aoin l;
    public java.lang.Boolean m;
    public java.lang.Boolean n;
    public java.lang.Boolean o;
    public final defpackage.npp p;
    public final defpackage.npq q;
    public final defpackage.npn r;
    public final defpackage.npm s;
    public final defpackage.npo t;
    public final defpackage.npl u;
    public final twp v;
    public final zjm w;
    public final uzx x;
    public final zoe y;
    public final apni z;

    public npr(defpackage.npg npgVar, android.content.Context context, aoss aossVar, apni apniVar, agyq agyqVar, defpackage.npe npeVar, mnl mnlVar, mvy mvyVar, aoin aoinVar, agtj agtjVar, zjm zjmVar, rlv rlvVar, aaoo aaooVar, uzx uzxVar, twp twpVar, aoin aoinVar2, aoin aoinVar3) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(apniVar, "androidJobs");
        aooh.f(mvyVar, "dobbySingletonLocaleProvider");
        aooh.f(aoinVar, "enableLlmSmartReplyConsentFlow");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aaooVar, "googleHelpLauncherFactory");
        aooh.f(aoinVar2, "useGeminiRunner");
        aooh.f(aoinVar3, "enableAgenticCallScreen");
        this.b = npgVar;
        this.c = context;
        this.d = aossVar;
        this.z = apniVar;
        this.e = npeVar;
        this.f = mnlVar;
        this.g = mvyVar;
        this.h = aoinVar;
        this.i = agtjVar;
        this.w = zjmVar;
        this.j = rlvVar;
        this.x = uzxVar;
        this.v = twpVar;
        this.k = aoinVar2;
        this.l = aoinVar3;
        this.y = agyqVar.a(2131428052, npeVar.d);
        this.p = new defpackage.npp();
        this.q = new defpackage.npq();
        this.r = new defpackage.npn();
        this.s = new defpackage.npm();
        this.t = new defpackage.npo();
        this.u = new defpackage.npl();
    }

    public final void a(defpackage.noi noiVar) {
        a.b().l("com/android/dialer/dobby/impl/settings/ui/DobbySettingsMainFragmentPeer", "onProtectionLevelSelected", 598, "DobbySettingsMainFragmentPeer.kt").y("radio protection level has been updated to %s", noiVar);
        defpackage.npe.a.b().l("com/android/dialer/dobby/impl/settings/service/DobbySettingsService", "saveProtectionLevel", 194, "DobbySettingsService.kt").y("updating protection level to %s", noiVar);
        defpackage.npe npeVar = this.e;
        ajcq ajcqVarF = aosv.F(npeVar.b, 0, new defpackage.nea(npeVar, noiVar, (aoln) null, 20), 3);
        npeVar.p.s(ajcqVarF, defpackage.not.a);
        this.i.i(zoe.N(ajcqVarF), this.r);
    }
}
