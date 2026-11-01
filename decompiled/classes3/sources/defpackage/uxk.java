package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxk {
    public static final aimz a = aimz.i("com/android/dialer/tts/internal/synthesis/TtsFileProvider");
    public static final long b;
    public final android.content.Context c;
    private final aolr d;

    static {
        long j = aorh.a;
        b = aooh.A(5, aorj.d);
    }

    public uxk(android.content.Context context, aolr aolrVar, aazc aazcVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "backgroundContext");
        aooh.f(aazcVar, "clock");
        this.c = context;
        this.d = aolrVar;
    }

    public final java.lang.Object a(android.speech.tts.TextToSpeech textToSpeech, java.lang.CharSequence charSequence, defpackage.uwu uwuVar, akzx akzxVar, aoln aolnVar) {
        return aoov.aj(this.d, new defpackage.uxi(akzxVar, this, textToSpeech, charSequence, uwuVar, null), aolnVar);
    }
}
