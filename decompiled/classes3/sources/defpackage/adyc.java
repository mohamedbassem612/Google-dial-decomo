package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adyc implements defpackage.adyb {
    public static final aiof a = aiof.i("GnpSdk");
    public final android.content.Context b;
    public final aoss c;
    public final adym d;
    public final aduu e;
    public final aeey f;
    public final java.lang.String g;
    public final java.lang.String h;
    public aosy i;
    private final aoir j;

    public adyc(android.content.Context context, aoss aossVar, adym adymVar, aduu aduuVar, aeey aeeyVar, java.lang.String str, java.lang.String str2) {
        aooh.f(context, "context");
        aooh.f(aossVar, "lightweightScope");
        aooh.f(adymVar, "gnpAuthManager");
        aooh.f(aduuVar, "gnpConfig");
        aooh.f(aeeyVar, "clientStreamz");
        aooh.f(str, "accountName");
        aooh.f(str2, "url");
        this.b = context;
        this.c = aossVar;
        this.d = adymVar;
        this.e = aduuVar;
        this.f = aeeyVar;
        this.g = str;
        this.h = str2;
        this.j = aooc.ag(new defpackage.addr(this, 2));
    }

    public final boolean a() {
        return ((java.lang.Boolean) this.j.a()).booleanValue();
    }

    public final void b(vx vxVar, android.app.Activity activity) {
        android.net.Uri uri = android.net.Uri.parse("https://accounts.google.com/AccountChooser");
        aooh.e(uri, "parse(...)");
        vxVar.c(activity, uri.buildUpon().appendQueryParameter("Email", this.g).appendQueryParameter("continue", this.h).build());
    }
}
