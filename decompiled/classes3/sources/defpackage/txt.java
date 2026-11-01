package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class txt extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    final /* synthetic */ defpackage.txv e;
    final /* synthetic */ defpackage.ajxi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txt(defpackage.txv txvVar, defpackage.ajxi ajxiVar, aoln aolnVar) {
        super(2, aolnVar);
        this.e = txvVar;
        this.f = ajxiVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object objD;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.String languageTag;
        defpackage.amkr amkrVar;
        aolu aoluVar = aolu.a;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                obj2 = this.c;
                java.lang.Object obj5 = this.b;
                java.lang.Object obj6 = this.a;
                aooc.af(obj);
                obj3 = obj6;
                objD = obj;
                obj4 = obj5;
            }
            defpackage.txv txvVar = this.e;
            return new defpackage.txp(txvVar, txvVar);
        }
        aooc.af(obj);
        defpackage.txv txvVar2 = this.e;
        txvVar2.r = this.f;
        this.a = txvVar2;
        this.b = txvVar2;
        obj2 = txvVar2.i;
        this.c = obj2;
        this.d = 1;
        objD = txvVar2.d(this);
        if (objD == aoluVar) {
            return aoluVar;
        }
        obj3 = txvVar2;
        obj4 = txvVar2;
        defpackage.txv txvVar3 = this.e;
        android.net.Uri uri = (android.net.Uri) objD;
        aimz aimzVar = defpackage.txv.a;
        aimzVar.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "createSpeechRecognizerIntent", 186, "SodaAndroidSpeechSession.kt").v("Creating Speech Recognizer Intent");
        android.content.Intent intent = new android.content.Intent("android.speech.action.RECOGNIZE_SPEECH");
        defpackage.txv txvVar4 = (defpackage.txv) obj4;
        android.content.Context context = txvVar4.c;
        intent.putExtra("calling_package", context.getPackageName());
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        java.util.Map map = defpackage.txv.b;
        defpackage.twd twdVar = (defpackage.twd) obj2;
        if ((twdVar.b & 16) != 0) {
            languageTag = twdVar.g;
            aooh.c(languageTag);
        } else {
            languageTag = gus.ae(context).toLanguageTag();
            aooh.c(languageTag);
        }
        boolean z = txvVar3.k;
        akff akffVar = akff.p;
        java.lang.Object obj7 = obj3;
        aooh.e(akffVar, "US");
        intent.putExtra("android.speech.extra.LANGUAGE", ((akff) j$.util.Map.-EL.getOrDefault(map, languageTag, akffVar)).q);
        intent.putExtra("android.speech.extra.MAX_RESULTS", 1);
        intent.putExtra("android.speech.extra.PREFER_OFFLINE", z);
        intent.putExtra("android.speech.extra.DICTATION_MODE", true);
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
        intent.putExtra("com.google.recognition.extra.REQUEST_SODA_EVENTS", twdVar.e);
        intent.putExtra("android.speech.extras.ENABLE_LANG_ID", twdVar.h);
        intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE_SAMPLING_RATE", twdVar.d);
        android.content.ComponentName componentNameB = defpackage.afbq.b(context);
        if (componentNameB != null) {
            context.grantUriPermission(componentNameB.getPackageName(), uri, 3);
        }
        if ((twdVar.b & 64) != 0) {
            defpackage.twb twbVar = twdVar.i;
            if (twbVar == null) {
                twbVar = defpackage.twb.a;
            }
            aooh.e(twbVar, "getSodaDiarizationConfig(...)");
            int i2 = twbVar.b;
            int i3 = twbVar.c;
            int iAN = a.aN(twbVar.d);
            if (iAN == 0) {
                iAN = 1;
            }
            int i4 = iAN - 1;
            if (i4 == 0 || i4 == 1) {
                amkrVar = defpackage.amkr.DISABLED;
            } else {
                amkrVar = i4 != 2 ? defpackage.amkr.SPEAKER_CHANGE : defpackage.amkr.SPEAKER_LABEL;
            }
            akzz akzzVarM = defpackage.amks.a.m();
            akzzVarM.u();
            defpackage.amks amksVar = akzzVarM.b;
            amksVar.c = amkrVar.d;
            amksVar.b |= 1;
            akzzVarM.u();
            defpackage.amks amksVar2 = akzzVarM.b;
            amksVar2.b |= 4;
            amksVar2.d = i2;
            akzzVarM.u();
            defpackage.amks amksVar3 = akzzVarM.b;
            amksVar3.b |= 8;
            amksVar3.e = i3;
            intent.putExtra("com.google.recognition.extra.REQUEST_DIARIZATION", akzzVarM.p().i());
            aimzVar.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaAndroidSpeechSession", "createSpeechRecognizerIntent", 233, "SodaAndroidSpeechSession.kt").M("Requesting Diarization with minSpeakerCount: %s, maxSpeakerCount: %s, diarizationMode: %s", java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), amkrVar);
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            int iAQ = a.aQ(twdVar.j);
            if (iAQ == 0) {
                iAQ = 1;
            }
            int i5 = iAQ - 1;
            if (i5 != 0) {
                if (i5 != 1) {
                    aooh.e(intent.putExtra("android.speech.extra.ENABLE_FORMATTING", "latency"), "putExtra(...)");
                } else {
                    aooh.e(intent.putExtra("android.speech.extra.ENABLE_FORMATTING", "quality"), "putExtra(...)");
                }
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            intent.putExtra("com.google.recognition.extra.EXTRA_AUDIO_SOURCE_NON_MIC", twdVar.f);
            android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = txvVar4.n;
            if (parcelFileDescriptorArr != null) {
                intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE", parcelFileDescriptorArr[0]);
            }
        } else {
            aooh.c(intent.putExtra("com.google.recognition.extra.AUDIO_SOURCE", uri));
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 && twdVar.l.size() > 0) {
            intent.putStringArrayListExtra("android.speech.extra.BIASING_STRINGS", new java.util.ArrayList<>((java.util.Collection) twdVar.l));
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        defpackage.txv txvVar5 = (defpackage.txv) obj7;
        java.lang.Object objAj = aoov.aj(txvVar5.e, new defpackage.txm(intent, txvVar5, (aoln) null, 2), this);
        if (objAj != aoluVar) {
            objAj = aojh.a;
        }
        if (objAj == aoluVar) {
            return aoluVar;
        }
        defpackage.txv txvVar6 = this.e;
        return new defpackage.txp(txvVar6, txvVar6);
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.txt(this.e, this.f, aolnVar);
    }
}
