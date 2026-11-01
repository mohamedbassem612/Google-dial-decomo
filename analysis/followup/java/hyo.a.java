    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Locale locale, aoln aolnVar) {
        hyk hykVar;
        Object obj;
        if (aolnVar instanceof hyk) {
            hykVar = (hyk) aolnVar;
            int i = hykVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hykVar.c = i - Integer.MIN_VALUE;
            } else {
                hykVar = new hyk(this, aolnVar);
            }
        } else {
            hykVar = new hyk(this, aolnVar);
        }
        Object objL = hykVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hykVar.c;
        try {
            if (i2 == 0) {
                aooc.af(objL);
                long j = c;
                hnt hntVar = new hnt(this, (aoln) null, 18);
                hykVar.d = locale;
                hykVar.c = 1;
                objL = aooh.L(j, hntVar, hykVar);
                obj = aoluVar;
                if (objL != aoluVar) {
                }
                return obj;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            locale = hykVar.d;
            aooc.af(objL);
            TextToSpeech textToSpeech = (TextToSpeech) objL;
            int iIsLanguageAvailable = textToSpeech.isLanguageAvailable(locale);
            aimz aimzVar = a;
            ((aimw) aimzVar.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "isLocaleSupported", 104, "BaseTtsInstance.kt")).w("languageAvailability=%d", iIsLanguageAvailable);
            if (iIsLanguageAvailable < 0) {
                this.b.o(rmx.TTS_INSTANCE_CREATE_TTS_UNSUPPORTED_LANGUAGE_ERROR);
                throw new IllegalStateException("Language not available for TTS.");
            }
            ((aimw) aimzVar.b().l("com/android/dialer/audio/audioinjector/fileprovider/BaseTtsInstance", "createTtsInternal", 66, "BaseTtsInstance.kt")).y("initializing TTS with %s locale", locale);
            textToSpeech.setLanguage(locale);
            obj = textToSpeech;
            return obj;
        } catch (aovk e) {
            this.b.o(rmx.TTS_INSTANCE_CREATE_TTS_TIMEOUT_ERROR);
            throw e;
        }
    }
