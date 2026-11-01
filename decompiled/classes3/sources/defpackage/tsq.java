package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tsq {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/settings/ui/SharpieSettingsFragmentPeer");
    public static final j$.time.Duration b;
    public final android.content.Context c;
    public final defpackage.tsn d;
    public final tsg e;
    public final agtj f;
    public final defpackage.ahey g;
    public final agsm h;
    public final ojd i;
    public final aoin j;
    public boolean k;
    public final agtk l;
    public final twp m;
    public final ajwr n;
    public final apni o;

    static {
        j$.time.Duration durationOfMillis = j$.time.Duration.ofMillis(500L);
        aooh.e(durationOfMillis, "ofMillis(...)");
        b = durationOfMillis;
    }

    public tsq(android.content.Context context, defpackage.tsn tsnVar, tsg tsgVar, ajwr ajwrVar, agtj agtjVar, defpackage.ahey aheyVar, twp twpVar, apni apniVar, agsm agsmVar, ojd ojdVar, aoin aoinVar) {
        aooh.f(tsgVar, "settingsService");
        aooh.f(ajwrVar, "subscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(apniVar, "androidJobs");
        aooh.f(agsmVar, "androidFutures");
        this.c = context;
        this.d = tsnVar;
        this.e = tsgVar;
        this.n = ajwrVar;
        this.f = agtjVar;
        this.g = aheyVar;
        this.m = twpVar;
        this.o = apniVar;
        this.h = agsmVar;
        this.i = ojdVar;
        this.j = aoinVar;
        this.k = true;
        this.l = new defpackage.tsp();
    }
}
