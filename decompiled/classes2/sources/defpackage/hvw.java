package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvw extends aomh implements aonn {
    int a;
    final /* synthetic */ hvy b;
    final /* synthetic */ int c;
    final /* synthetic */ aosb d;
    private /* synthetic */ java.lang.Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvw(aoln aolnVar, hvy hvyVar, int i, aosb aosbVar) {
        super(2, aolnVar);
        this.b = hvyVar;
        this.c = i;
        this.d = aosbVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) throws java.lang.Exception {
        apdp apdpVar;
        aolu aoluVar = aolu.a;
        try {
            if (this.a != 0) {
                apdpVar = (apdp) this.e;
                aooc.af(obj);
            } else {
                aooc.af(obj);
                apdp apdpVar2 = this.b.h;
                this.e = apdpVar2;
                this.a = 1;
                if (apdpVar2.b(this) == aoluVar) {
                    return aoluVar;
                }
                apdpVar = apdpVar2;
            }
            try {
                int i = this.c;
                hvy hvyVar = this.b;
                if (i != 0) {
                    hvyVar.i.i((java.lang.String) null).a(mcd.ax);
                    this.d.w(aooc.ae(new java.lang.RuntimeException("tts initialization failed")));
                } else {
                    if (hvyVar.g == null) {
                        throw new java.lang.IllegalStateException("Tts should not be null.");
                    }
                    aimz aimzVar = hvy.a;
                    aimzVar.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl", "setupTts$<anonymous>$<anonymous>$<anonymous>", 87, "VoiceAssistAudioGeneratorImpl.kt").v("tts initialization complete");
                    android.speech.tts.TextToSpeech textToSpeech = hvyVar.g;
                    aooh.c(textToSpeech);
                    if (textToSpeech.setSpeechRate(0.8f) != 0) {
                        aimzVar.c().m(aioa.b).i(zct.b).l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl", "setSpeechRate", 127, "VoiceAssistAudioGeneratorImpl.kt").v("failed to set tts speech rate");
                    }
                    android.speech.tts.TextToSpeech textToSpeech2 = hvyVar.g;
                    aooh.c(textToSpeech2);
                    huy huyVar = hvyVar.b;
                    java.util.Locale localeA = huyVar.a();
                    int iIsLanguageAvailable = textToSpeech2.isLanguageAvailable(huyVar.a());
                    aimzVar.b().l("com/android/dialer/assistedemergencydialing/impl/tts/VoiceAssistAudioGeneratorImpl", "getTtsLocale", 135, "VoiceAssistAudioGeneratorImpl.kt").w("languageAvailability=%d", iIsLanguageAvailable);
                    if (iIsLanguageAvailable < 0) {
                        localeA = null;
                    }
                    if (localeA == null) {
                        this.d.w(aooc.ae(new java.lang.RuntimeException("tts locale not available.")));
                        hvyVar.i.i((java.lang.String) null).a(mcd.aw);
                    } else {
                        android.speech.tts.TextToSpeech textToSpeech3 = hvyVar.g;
                        aooh.c(textToSpeech3);
                        textToSpeech3.setLanguage(localeA);
                        hvyVar.f = true;
                        this.d.w((java.lang.Object) null);
                    }
                }
                apdpVar.d();
                return aojh.a;
            } catch (java.lang.Throwable th) {
                apdpVar.d();
                throw th;
            }
        } catch (java.lang.Exception e) {
            if (!(e instanceof java.util.concurrent.CancellationException)) {
                aimz aimzVar2 = zih.a;
                zih.a.c().k(e).m(aioa.b).l("com/google/android/dialershared/coroutines/DialerCoroutines", "dialerLaunchPropagatingLegacy$<anonymous>", 69, "DialerCoroutines.kt").v("Unhandled coroutine exception!");
            }
            throw e;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.hvw hvwVar = new defpackage.hvw(aolnVar, this.b, this.c, this.d);
        hvwVar.e = obj;
        return hvwVar;
    }
}
