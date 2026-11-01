package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjf {
    public static final or a = new defpackage.sjd();
    public static final or b = new defpackage.sje();
    public final android.app.Activity c;
    private final aoin d;
    private final defpackage.sjh e;
    private defpackage.sjh f;

    public sjf(android.app.Activity activity, aoin aoinVar, defpackage.sjh sjhVar) {
        aooh.f(aoinVar, "enableContactsYourInfoFeatureRequestChanges");
        aooh.f(sjhVar, "modernNavigationController");
        this.c = activity;
        this.d = aoinVar;
        this.e = sjhVar;
    }

    public final defpackage.sjh a() {
        if (((java.lang.Boolean) this.d.a()).booleanValue()) {
            return this.e;
        }
        defpackage.sjh sjhVar = this.f;
        if (sjhVar != null) {
            return sjhVar;
        }
        throw new java.lang.IllegalStateException("Legacy navigation handler not registered.");
    }

    public final void b(defpackage.sjh sjhVar) {
        aooh.f(sjhVar, "handler");
        this.f = sjhVar;
    }
}
