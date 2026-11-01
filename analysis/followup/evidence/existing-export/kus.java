package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kus implements defpackage.kuo {
    public final rlv c;
    public final defpackage.hys d;
    private final aoss f;
    private final lbq g;
    private android.speech.tts.TextToSpeech h;
    private final apdp i;
    private final izg j;
    private static final aimz e = aimz.i("com/android/dialer/callrecording/disclosure/impl/TtsCallRecordingDisclosure");
    public static final defpackage.hxz a = new defpackage.hxz(2132017766);
    public static final defpackage.hxz b = new defpackage.hxz(2132017756);

    public kus(aoss aossVar, lbq lbqVar, rlv rlvVar, defpackage.hys hysVar, izg izgVar) {
        aooh.f(aossVar, "lightweightScope");
        aooh.f(lbqVar, "ttsPreWarm");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(izgVar, "ttsInstance");
        this.f = aossVar;
        this.g = lbqVar;
        this.c = rlvVar;
        this.d = hysVar;
        this.j = izgVar;
        this.i = new apdp();
    }

    @Override // defpackage.kuo
    public final ajcq a() {
        return aosv.F(this.f, 0, new defpackage.hqi(this, (aoln) null, 17), 3);
    }

    @Override // defpackage.kuo
    public final ajcq b() {
        return aosv.F(this.f, 0, new defpackage.hqi(this, (aoln) null, 18, (byte[]) null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.kur kurVar;
        apdp apdpVar;
        apdp apdpVar2;
        android.speech.tts.TextToSpeech textToSpeech;
        if (aolnVar instanceof defpackage.kur) {
            kurVar = (defpackage.kur) aolnVar;
            int i = kurVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kurVar.c = i - Integer.MIN_VALUE;
            } else {
                kurVar = new defpackage.kur(this, aolnVar);
            }
        } else {
            kurVar = new defpackage.kur(this, aolnVar);
        }
        java.lang.Object obj = kurVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kurVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdpVar = this.i;
                kurVar.d = apdpVar;
                kurVar.c = 1;
                if (apdpVar.b(kurVar) == aoluVar) {
                    return aoluVar;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = kurVar.d;
                    try {
                        aooc.af(obj);
                        textToSpeech = (android.speech.tts.TextToSpeech) obj;
                        this.h = textToSpeech;
                        apdpVar2.d();
                        return textToSpeech;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdp apdpVar3 = kurVar.d;
                aooc.af(obj);
                apdpVar = apdpVar3;
            }
            android.speech.tts.TextToSpeech textToSpeech2 = this.h;
            if (textToSpeech2 != null) {
                apdpVar.d();
                return textToSpeech2;
            }
            android.speech.tts.TextToSpeech textToSpeech3 = (android.speech.tts.TextToSpeech) ((j$.util.Optional) this.g.f.get()).orElse((java.lang.Object) null);
            if (textToSpeech3 != null) {
                e.b().l("com/android/dialer/callrecording/disclosure/impl/TtsCallRecordingDisclosure", "getPreWarmedTts", 94, "TtsCallRecordingDisclosure.kt").v("Using TTS instance from prewarmer");
                apdpVar2 = apdpVar;
                textToSpeech = textToSpeech3;
            } else {
                izg izgVar = this.j;
                kurVar.d = apdpVar;
                kurVar.c = 2;
                java.lang.Object objAj = aoov.aj((aolr) izgVar.c, new defpackage.hnt(izgVar, (aoln) null, 19), kurVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                apdpVar2 = apdpVar;
                obj = objAj;
                textToSpeech = (android.speech.tts.TextToSpeech) obj;
            }
            this.h = textToSpeech;
            apdpVar2.d();
            return textToSpeech;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
}
