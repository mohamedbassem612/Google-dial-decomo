package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hyo {
    public static final aimz a = aimz.i("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance");
    private static final long c;
    public final rlv b;
    private final android.content.Context d;
    private android.speech.tts.TextToSpeech e;
    private final apdp f;

    static {
        long j = aorh.a;
        c = aooh.A(10, aorj.d);
    }

    public hyo(android.content.Context context, rlv rlvVar) {
        aooh.f(context, "appContext");
        aooh.f(rlvVar, "loggingBindings");
        this.d = context;
        this.b = rlvVar;
        this.f = new apdp();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(java.util.Locale locale, aoln aolnVar) {
        defpackage.hyk hykVar;
        if (aolnVar instanceof defpackage.hyk) {
            hykVar = (defpackage.hyk) aolnVar;
            int i = hykVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hykVar.c = i - Integer.MIN_VALUE;
            } else {
                hykVar = new defpackage.hyk(this, aolnVar);
            }
        } else {
            hykVar = new defpackage.hyk(this, aolnVar);
        }
        java.lang.Object objL = hykVar.a;
        android.speech.tts.TextToSpeech textToSpeech = aolu.a;
        int i2 = hykVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objL);
                long j = c;
                defpackage.hnt hntVar = new defpackage.hnt(this, (aoln) null, 18);
                hykVar.d = locale;
                hykVar.c = 1;
                objL = aooh.L(j, hntVar, hykVar);
                if (objL != textToSpeech) {
                }
                return textToSpeech;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = hykVar.d;
            aooc.af(objL);
            textToSpeech = (android.speech.tts.TextToSpeech) objL;
            int iIsLanguageAvailable = textToSpeech.isLanguageAvailable(locale);
            aimz aimzVar = a;
            aimzVar.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "isLocaleSupported", 104, "BaseTtsInstance.kt").w("languageAvailability=%d", iIsLanguageAvailable);
            if (iIsLanguageAvailable < 0) {
                this.b.o(rmx.nh);
                throw new java.lang.IllegalStateException("Language not available for TTS.");
            }
            aimzVar.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "createTtsInternal", 66, "BaseTtsInstance.kt").y("initializing TTS with %s locale", locale);
            textToSpeech.setLanguage(locale);
            return textToSpeech;
        } catch (aovk e) {
            this.b.o(rmx.ng);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.util.Locale locale, aoln aolnVar) {
        defpackage.hyl hylVar;
        java.util.Locale locale2;
        android.speech.tts.TextToSpeech textToSpeech;
        if (aolnVar instanceof defpackage.hyl) {
            hylVar = (defpackage.hyl) aolnVar;
            int i = hylVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hylVar.d = i - Integer.MIN_VALUE;
            } else {
                hylVar = new defpackage.hyl(this, aolnVar);
            }
        } else {
            hylVar = new defpackage.hyl(this, aolnVar);
        }
        java.lang.Object objA = hylVar.b;
        aolu aoluVar = aolu.a;
        int i2 = hylVar.d;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    locale = hylVar.e;
                    locale2 = (java.util.Locale) hylVar.a;
                    aooc.af(objA);
                } else {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    locale = (apdp) hylVar.a;
                    aooc.af(objA);
                }
                textToSpeech = (android.speech.tts.TextToSpeech) objA;
                this.e = textToSpeech;
                android.speech.tts.TextToSpeech textToSpeech2 = textToSpeech;
                locale.d();
                return textToSpeech2;
            }
            aooc.af(objA);
            java.util.Locale locale3 = this.f;
            hylVar.a = locale;
            hylVar.e = locale3;
            hylVar.d = 1;
            if (locale3.b(hylVar) == aoluVar) {
                return aoluVar;
            }
            locale2 = locale;
            locale = locale3;
            textToSpeech = this.e;
            if (textToSpeech == null) {
                hylVar.a = locale;
                hylVar.e = null;
                hylVar.d = 2;
                objA = a(locale2, hylVar);
                if (objA == aoluVar) {
                    return aoluVar;
                }
                textToSpeech = (android.speech.tts.TextToSpeech) objA;
                this.e = textToSpeech;
            }
            android.speech.tts.TextToSpeech textToSpeech3 = textToSpeech;
            locale.d();
            return textToSpeech3;
        } catch (java.lang.Throwable th) {
            locale.d();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(aoln aolnVar) {
        defpackage.hym hymVar;
        aoot aootVar;
        if (aolnVar instanceof defpackage.hym) {
            hymVar = (defpackage.hym) aolnVar;
            int i = hymVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hymVar.c = i - Integer.MIN_VALUE;
            } else {
                hymVar = new defpackage.hym(this, aolnVar);
            }
        } else {
            hymVar = new defpackage.hym(this, aolnVar);
        }
        java.lang.Object obj = hymVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hymVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aoot aootVar2 = new aoot();
            hymVar.d = aootVar2;
            hymVar.c = 1;
            aosc aoscVar = new aosc(ajsz.ap(hymVar), 1);
            aoscVar.z();
            aootVar2.a = new android.speech.tts.TextToSpeech(this.d, new defpackage.hyn((aosb) aoscVar, (java.lang.Object) this, 0));
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
            aootVar = aootVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar = hymVar.d;
            aooc.af(obj);
        }
        java.lang.Object obj2 = aootVar.a;
        if (obj2 != null) {
            return (android.speech.tts.TextToSpeech) obj2;
        }
        aooh.j("textToSpeech");
        return null;
    }
}
