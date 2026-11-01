package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rkg {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding");
    public final android.content.Context b;
    public final defpackage.rkh c;
    public final defpackage.zjm d;
    private final defpackage.rlv e;

    public rkg(android.content.Context context, defpackage.rkh rkhVar, defpackage.rlv rlvVar, defpackage.zjm zjmVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.b = context;
        this.c = rkhVar;
        this.e = rlvVar;
        this.d = zjmVar;
    }

    public final void a(defpackage.emx emxVar, android.app.Activity activity, defpackage.dxw dxwVar) {
        if (!this.c.b()) {
            ((defpackage.aimw) a.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "listenSplitInfoChangeOnStateResumed", 206, "ActivityEmbedding.kt")).v("split is not supported");
            return;
        }
        defpackage.aimz aimzVar = defpackage.zih.a;
        defpackage.aoov.al(defpackage.dzn.i(emxVar.P()), defpackage.zih.b.plus(defpackage.aols.a), 1, new defpackage.rkf(null, emxVar, this, activity, dxwVar));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [gom, java.lang.Object] */
    public final void b(android.content.Context context, android.net.Uri uri) throws java.io.IOException {
        defpackage.aooh.f(uri, "contactUri");
        java.util.Set setB = defpackage.gus.U(this.b).a.b();
        if ((setB instanceof java.util.Collection) && setB.isEmpty()) {
            ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b).l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "startQuickContactActivity", 164, "ActivityEmbedding.kt")).v("Doesn't have Trampoline activity split rule tag");
        } else {
            java.util.Iterator it = setB.iterator();
            while (it.hasNext()) {
                if (defpackage.aooh.n(((defpackage.gow) it.next()).a(), "DialerTrampolineActivity")) {
                }
            }
            ((defpackage.aimw) ((defpackage.aimw) a.d()).i(defpackage.zct.b).l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "startQuickContactActivity", 164, "ActivityEmbedding.kt")).v("Doesn't have Trampoline activity split rule tag");
        }
        this.e.o(defpackage.rmx.OPEN_QUICK_CONTACT_ACTIVITY_AS_EMBEDDING);
        defpackage.aooh.f(uri, "contactUri");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.largescreensupport.activityembedding.TrampolineActivity.class);
        intent.putExtra("EXTRA_CONTACT_URI", uri);
        defpackage.ahqx.l(context, intent);
    }

    public final boolean c(android.app.Activity activity) {
        return this.c.a(activity);
    }

    public final void d(android.app.Activity activity) throws java.io.IOException {
        if (this.c.a(activity)) {
            ((defpackage.aimw) a.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "terminateSecondaryActivityIfAny", 184, "ActivityEmbedding.kt")).v("request starting TerminatingActivity");
            defpackage.ahqx.l(activity, new android.content.Intent(activity, (java.lang.Class<?>) com.android.dialer.largescreensupport.activityembedding.TerminatingActivity.class));
        }
    }
}
