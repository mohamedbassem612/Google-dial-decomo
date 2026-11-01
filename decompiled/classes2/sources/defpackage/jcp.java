package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcp {
    public static final aimz a = aimz.i("com/android/dialer/beesly/impl/settings/ui/BeeslySettingsFragmentPeer");
    public final android.content.Context b;
    public final aoss c;
    public final aoss d;
    public final defpackage.jci e;
    public final defpackage.jbv f;
    public final agtj g;
    public final ahey h;
    public final odp i;
    public final defpackage.ojd j;
    public final rlv k;
    public final iqm l;
    public final aoin m;
    public boolean n;
    public aoub o;
    public final agtk p;
    public final agtk q;
    public final android.net.ConnectivityManager.NetworkCallback r;
    public android.net.ConnectivityManager s;
    public final twp t;
    public final ryg u;
    public final ajwr v;
    public final apni w;

    public jcp(android.content.Context context, aoss aossVar, aoss aossVar2, defpackage.jci jciVar, defpackage.jbv jbvVar, ajwr ajwrVar, agtj agtjVar, ahey aheyVar, twp twpVar, odp odpVar, apni apniVar, defpackage.ojd ojdVar, ryg rygVar, rlv rlvVar, iqm iqmVar, aoin aoinVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(aossVar2, "blockingScope");
        aooh.f(ajwrVar, "subscriptionMixin");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(apniVar, "androidJobs");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(aoinVar, "memoizePrefetchLegacyCustomGreeting");
        this.b = context;
        this.c = aossVar;
        this.d = aossVar2;
        this.e = jciVar;
        this.f = jbvVar;
        this.v = ajwrVar;
        this.g = agtjVar;
        this.h = aheyVar;
        this.t = twpVar;
        this.i = odpVar;
        this.w = apniVar;
        this.j = ojdVar;
        this.u = rygVar;
        this.k = rlvVar;
        this.l = iqmVar;
        this.m = aoinVar;
        this.p = new defpackage.jco();
        this.q = new defpackage.jcl(this);
        this.r = new defpackage.jcn(this);
    }

    public final androidx.preference.SwitchPreference a() {
        defpackage.jci jciVar = this.e;
        androidx.preference.SwitchPreference switchPreference = (androidx.preference.SwitchPreference) jciVar.ee(jciVar.Y(2132017526));
        if (switchPreference != null) {
            return switchPreference;
        }
        throw new java.lang.IllegalStateException("preference not available");
    }
}
