package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahim {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/apps/tiktok/monitoring/feedback/HelpAndFeedbackStarter");
    public final android.app.Activity b;
    public final defpackage.agtj c;
    public final defpackage.ahyn d;
    public final defpackage.aoin e;
    public final defpackage.agtk f;
    private final defpackage.emj g;

    public ahim(android.app.Activity activity, defpackage.aw awVar, defpackage.agtj agtjVar, defpackage.ahyn ahynVar, defpackage.aoin aoinVar) {
        defpackage.ahik ahikVar = new defpackage.ahik(this);
        this.g = ahikVar;
        this.f = new defpackage.ahil(this);
        this.b = activity;
        this.c = agtjVar;
        this.d = ahynVar;
        this.e = aoinVar;
        if (((defpackage.emy) awVar.P()).d != defpackage.emq.b) {
            throw new java.lang.IllegalStateException();
        }
        awVar.P().c(ahikVar);
    }
}
