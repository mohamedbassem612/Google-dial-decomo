package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acld implements defpackage.aclb {
    public static final defpackage.aiof a = defpackage.aiof.i("GnpSdk");
    public final defpackage.ajct b;
    public final defpackage.aoin c;
    public final defpackage.amwu d;
    public final java.lang.String e;
    public final defpackage.amwu f;
    public final defpackage.aefv g;
    public final android.content.Context h;
    private final defpackage.aduj i;
    private final defpackage.amwu j;

    public acld(defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.amwu amwuVar, java.lang.String str, defpackage.aduj adujVar, defpackage.amwu amwuVar2, defpackage.amwu amwuVar3, defpackage.aefv aefvVar, android.content.Context context) {
        defpackage.aooh.f(ajctVar, "executor");
        defpackage.aooh.f(aoinVar, "enableFlagProvider");
        defpackage.aooh.f(amwuVar, "clientStreamz");
        defpackage.aooh.f(str, "packageName");
        defpackage.aooh.f(amwuVar2, "growthKitJobHandler");
        defpackage.aooh.f(amwuVar3, "gnpRasta");
        defpackage.aooh.f(context, "context");
        this.b = ajctVar;
        this.c = aoinVar;
        this.d = amwuVar;
        this.e = str;
        this.i = adujVar;
        this.f = amwuVar2;
        this.j = amwuVar3;
        this.g = aefvVar;
        this.h = context;
    }

    public final defpackage.ajcq a() {
        if (defpackage.anft.a.eZ().c()) {
            ((defpackage.adye) this.j.a()).c();
        }
        defpackage.ajct ajctVar = this.b;
        defpackage.aduj adujVar = this.i;
        defpackage.ajcq ajcqVarSubmit = ajctVar.submit(adujVar.d(new defpackage.vcz(this, 7)));
        defpackage.aooh.e(ajcqVarSubmit, "submit(...)");
        defpackage.ajcq ajcqVarG = defpackage.ajan.g(ajcqVarSubmit, adujVar.c(new defpackage.vmn(this, 12)), ajctVar);
        defpackage.agab.bR(ajcqVarG, new defpackage.vzg(this, 3, null), new defpackage.vzg(this, 2));
        return ajcqVarG;
    }
}
