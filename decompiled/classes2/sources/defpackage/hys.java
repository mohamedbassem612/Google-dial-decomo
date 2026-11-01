package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hys {
    public static final aimz a = aimz.i("com/android/dialer/audio/audioinjector/fileprovider/TtsFileProvider");
    public static final long b;
    public final android.content.Context c;
    public final aoin d;
    public final rlv e;
    private final aolr f;
    private final hyt g;

    static {
        long j = aorh.a;
        b = aooh.A(5, aorj.d);
    }

    public hys(android.content.Context context, aolr aolrVar, aoin aoinVar, hyt hytVar, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aoinVar, "enableClearListenerOnCancellation");
        aooh.f(rlvVar, "loggingBindings");
        this.c = context;
        this.f = aolrVar;
        this.d = aoinVar;
        this.g = hytVar;
        this.e = rlvVar;
    }

    public final java.io.File a(defpackage.hxw hxwVar) {
        java.lang.String str;
        aooh.f(hxwVar, "<this>");
        android.content.Context context = this.c;
        java.io.File file = new java.io.File(context.getFilesDir(), "audioinjector");
        int iF = defpackage.hgu.f(hxwVar);
        if (iF == 0) {
            str = context.getResources().getResourceEntryName(((defpackage.hxz) hxwVar).a) + '_' + c() + ".wav";
        } else {
            if (iF == 1) {
                throw null;
            }
            str = "";
        }
        return new java.io.File(file, str);
    }

    public final java.lang.Object b(android.speech.tts.TextToSpeech textToSpeech, defpackage.hxw hxwVar, aoln aolnVar) {
        return aoov.aj(this.f, new defpackage.mwq(this, hxwVar, textToSpeech, (aoln) null, 1), aolnVar);
    }

    public final java.util.Locale c() {
        java.lang.Object objOrElse = this.g.a().orElse(java.util.Locale.US);
        aooh.d(objOrElse, "null cannot be cast to non-null type java.util.Locale");
        return (java.util.Locale) objOrElse;
    }
}
