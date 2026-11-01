package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxj extends android.speech.tts.UtteranceProgressListener {
    final /* synthetic */ android.speech.tts.TextToSpeech a;
    final /* synthetic */ aosb b;
    final /* synthetic */ java.lang.String c;
    final /* synthetic */ akzx d;

    public uxj(android.speech.tts.TextToSpeech textToSpeech, aosb aosbVar, java.lang.String str, akzx akzxVar) {
        this.a = textToSpeech;
        this.b = aosbVar;
        this.c = str;
        this.d = akzxVar;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(java.lang.String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 118, "TtsFileProvider.kt").v("tts generation was completed. ignoring");
            return;
        }
        defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onDone", 122, "TtsFileProvider.kt").y("tts generation complete. Generated: %s", this.c);
        akzx akzxVar = this.d;
        long j = akzxVar.b.g + 1;
        akzxVar.u();
        amsa amsaVar = akzxVar.b;
        amsaVar.c |= 4;
        amsaVar.g = j;
        aosbVar.w(aojh.a);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str, int i) {
        defpackage.amsb amsbVar;
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        switch (i) {
            case -9:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_NOT_INSTALLED_YET;
                break;
            case -8:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_INVALID_REQUEST;
                break;
            case -7:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_NETWORK_TIMEOUT;
                break;
            case -6:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_NETWORK;
                break;
            case -5:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_OUTPUT;
                break;
            case -4:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_SERVICE;
                break;
            case -3:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_SYNTHESIS;
                break;
            case -2:
            default:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_UNKNOWN;
                break;
            case org.chromium.net.UrlRequest$Status.INVALID /* -1 */:
                amsbVar = defpackage.amsb.TTS_SYNTHESIS_ERROR_GENERIC;
                break;
        }
        akzx akzxVar = this.d;
        akzxVar.u();
        amsa amsaVar = akzxVar.b;
        alal alalVar = amsa.a;
        j$.util.Objects.requireNonNull(amsbVar);
        alak alakVar = amsaVar.e;
        if (!alakVar.c()) {
            amsaVar.e = alad.H(alakVar);
        }
        amsaVar.e.g(amsbVar.j);
        this.b.w(aooc.ae(new java.lang.IllegalStateException(a.bj(i, "tts generation failed: "))));
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(java.lang.String str) {
        aooh.f(str, "utteranceId");
        defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onStart", 108, "TtsFileProvider.kt").v("tts generation started");
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(java.lang.String str) {
        aooh.f(str, "utteranceId");
        this.a.setOnUtteranceProgressListener(null);
        aosb aosbVar = this.b;
        if (aosbVar.i()) {
            defpackage.uxk.a.b().l("com/android/dialer/tts/internal/synthesis/TtsFileProvider$synthesizeTextIntoFile$<anonymous>$<anonymous>", "onError", 137, "TtsFileProvider.kt").v("tts generation was completed. ignoring");
        } else {
            aosbVar.w(aooc.ae(new java.lang.IllegalStateException("tts generation failed")));
        }
    }
}
