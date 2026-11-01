    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v1, types: [aolr, java.lang.Object] */
    public final Object c(aoln aolnVar) {
        kur kurVar;
        apdp apdpVar;
        apdp apdpVar2;
        TextToSpeech textToSpeech;
        if (aolnVar instanceof kur) {
            kurVar = (kur) aolnVar;
            int i = kurVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kurVar.c = i - Integer.MIN_VALUE;
            } else {
                kurVar = new kur(this, aolnVar);
            }
        } else {
            kurVar = new kur(this, aolnVar);
        }
        Object obj = kurVar.a;
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
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apdpVar2 = kurVar.d;
                    try {
                        aooc.af(obj);
                        textToSpeech = (TextToSpeech) obj;
                        this.h = textToSpeech;
                        apdpVar2.d();
                        return textToSpeech;
                    } catch (Throwable th) {
                        th = th;
                        apdpVar2.d();
                        throw th;
                    }
                }
                apdp apdpVar3 = kurVar.d;
                aooc.af(obj);
                apdpVar = apdpVar3;
            }
            TextToSpeech textToSpeech2 = this.h;
            if (textToSpeech2 != null) {
                apdpVar.d();
                return textToSpeech2;
            }
            TextToSpeech textToSpeech3 = (TextToSpeech) ((Optional) this.g.f.get()).orElse(null);
            if (textToSpeech3 != null) {
                ((aimw) e.b().l("com/android/dialer/callrecording/disclosure/impl/TtsCallRecordingDisclosure", "getPreWarmedTts", 94, "TtsCallRecordingDisclosure.kt")).v("Using TTS instance from prewarmer");
                apdpVar2 = apdpVar;
                textToSpeech = textToSpeech3;
            } else {
                izg izgVar = this.j;
                kurVar.d = apdpVar;
                kurVar.c = 2;
                Object objAj = aoov.aj(izgVar.c, new hnt(izgVar, (aoln) null, 19), kurVar);
                if (objAj == aoluVar) {
                    return aoluVar;
                }
                apdpVar2 = apdpVar;
                obj = objAj;
                textToSpeech = (TextToSpeech) obj;
            }
            this.h = textToSpeech;
            apdpVar2.d();
            return textToSpeech;
        } catch (Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
