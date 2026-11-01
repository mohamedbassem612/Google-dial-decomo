package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uxm {
    public static final aimz a = aimz.i("com/android/dialer/tts/internal/synthesis/TtsInstance");
    public static final long b;
    public final aolr c;
    private final android.content.Context d;
    private final aoin e;

    static {
        long j = aorh.a;
        b = aooh.A(10, aorj.d);
    }

    public uxm(android.content.Context context, aolr aolrVar, aoin aoinVar) {
        aooh.f(context, "appContext");
        aooh.f(aolrVar, "lightweightContext");
        aooh.f(aoinVar, "enableVoiceSelectionFix");
        this.d = context;
        this.c = aolrVar;
        this.e = aoinVar;
    }

    private static final boolean b(defpackage.uwu uwuVar) {
        int i = uwuVar.f;
        int iAb = a.ab(i);
        if (iAb == 0) {
            iAb = 1;
        }
        int i2 = iAb - 2;
        if (i2 == 1 || i2 == 2) {
            return false;
        }
        if (i2 == 3 || i2 == 4) {
            return true;
        }
        int iAb2 = a.ab(i);
        throw new java.lang.IllegalStateException("Unsupported TTS Synthesis Mode: ".concat(java.lang.Integer.toString((iAb2 != 0 ? iAb2 : 1) - 2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object a(defpackage.uwu uwuVar, akzx akzxVar, aoln aolnVar) {
        defpackage.uxl uxlVar;
        aoot aootVar;
        defpackage.uwu uwuVar2;
        android.speech.tts.TextToSpeech textToSpeech;
        java.lang.String str;
        aimp aimpVar;
        java.lang.Object next;
        java.util.Iterator it;
        android.speech.tts.TextToSpeech textToSpeech2;
        defpackage.uxm uxmVar = this;
        akzx akzxVar2 = akzxVar;
        if (aolnVar instanceof defpackage.uxl) {
            uxlVar = (defpackage.uxl) aolnVar;
            int i = uxlVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxlVar.c = i - Integer.MIN_VALUE;
            } else {
                uxlVar = new defpackage.uxl(uxmVar, aolnVar);
            }
        } else {
            uxlVar = new defpackage.uxl(uxmVar, aolnVar);
        }
        java.lang.Object obj = uxlVar.a;
        aolu aoluVar = aolu.a;
        int i2 = uxlVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aootVar = new aoot();
            uxlVar.d = uwuVar;
            uxlVar.f = akzxVar2;
            uxlVar.e = aootVar;
            uxlVar.c = 1;
            aosc aoscVar = new aosc(ajsz.ap(uxlVar), 1);
            aoscVar.z();
            aootVar.a = new android.speech.tts.TextToSpeech(uxmVar.d, new hyn(aoscVar, akzxVar2, 2));
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
            uwuVar2 = uwuVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aoot aootVar2 = uxlVar.e;
            akzx akzxVar3 = uxlVar.f;
            uwuVar2 = uxlVar.d;
            aooc.af(obj);
            aootVar = aootVar2;
            akzxVar2 = akzxVar3;
        }
        java.lang.String str2 = "textToSpeech";
        if ((uwuVar2.b & 16) != 0) {
            java.lang.Object obj2 = aootVar.a;
            if (obj2 == null) {
                aooh.j("textToSpeech");
                textToSpeech2 = null;
            } else {
                textToSpeech2 = (android.speech.tts.TextToSpeech) obj2;
            }
            if (textToSpeech2.setSpeechRate(uwuVar2.g) != 0) {
                a.d().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "initializeTts", 90, "TtsInstance.kt").y("Failed to set TTS speech rate to %f", new java.lang.Float(uwuVar2.g));
            }
        }
        java.lang.Object obj3 = aootVar.a;
        if (obj3 == null) {
            aooh.j("textToSpeech");
            textToSpeech = null;
        } else {
            textToSpeech = (android.speech.tts.TextToSpeech) obj3;
        }
        defpackage.uwt uwtVar = uwuVar2.c;
        if (uwtVar == null) {
            uwtVar = defpackage.uwt.a;
        }
        aooh.e(uwtVar, "getVoice(...)");
        java.util.Locale localeAY = wsc.aY(uwtVar);
        int iIsLanguageAvailable = textToSpeech.isLanguageAvailable(localeAY);
        aimp aimpVar2 = a;
        aimpVar2.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "isLocaleSupported", 165, "TtsInstance.kt").w("languageAvailability=%d", iIsLanguageAvailable);
        if (iIsLanguageAvailable != -2 && iIsLanguageAvailable != -1) {
            if (iIsLanguageAvailable == 0 || iIsLanguageAvailable == 1 || iIsLanguageAvailable == 2) {
                textToSpeech.setLanguage(localeAY);
                aimpVar2.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "setVoice", 107, "TtsInstance.kt").y("initializing TTS with %s locale", localeAY);
                defpackage.uwt uwtVar2 = uwuVar2.c;
                if (uwtVar2 == null) {
                    uwtVar2 = defpackage.uwt.a;
                }
                aooh.e(uwtVar2, "getVoice(...)");
                java.lang.String strAX = wsc.aX(uwtVar2);
                if (aooh.n(strAX, "default")) {
                    aimpVar2.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "setVoice", 113, "TtsInstance.kt").v("initializing TTS with default voice");
                    str = "textToSpeech";
                } else {
                    java.util.Set<android.speech.tts.Voice> voices = textToSpeech.getVoices();
                    aooh.e(voices, "getVoices(...)");
                    java.util.Iterator it2 = voices.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            str = str2;
                            aimpVar = aimpVar2;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        android.speech.tts.Voice voice = (android.speech.tts.Voice) next;
                        aooh.c(voice);
                        if (((java.lang.Boolean) uxmVar.e.a()).booleanValue()) {
                            java.lang.String name = voice.getName();
                            aooh.e(name, "getName(...)");
                            str = str2;
                            defpackage.uwt uwtVar3 = uwuVar2.c;
                            if (uwtVar3 == null) {
                                uwtVar3 = defpackage.uwt.a;
                            }
                            aooh.e(uwtVar3, "getVoice(...)");
                            java.lang.String languageTag = wsc.aY(uwtVar3).toLanguageTag();
                            it = it2;
                            aooh.e(languageTag, "toLanguageTag(...)");
                            if (aoov.G(name, languageTag, true)) {
                                java.lang.String name2 = voice.getName();
                                aooh.e(name2, "getName(...)");
                                defpackage.uwt uwtVar4 = uwuVar2.c;
                                if (uwtVar4 == null) {
                                    uwtVar4 = defpackage.uwt.a;
                                }
                                aooh.e(uwtVar4, "getVoice(...)");
                                if (aoov.G(name2, wsc.aX(uwtVar4), false) && voice.isNetworkConnectionRequired() == b(uwuVar2)) {
                                    aimpVar = aimpVar2;
                                    break;
                                }
                            }
                            aimpVar = aimpVar2;
                            uxmVar = this;
                            str2 = str;
                            it2 = it;
                            aimpVar2 = aimpVar;
                        } else {
                            str = str2;
                            it = it2;
                            java.lang.String name3 = voice.getName();
                            aooh.e(name3, "getName(...)");
                            aimpVar = aimpVar2;
                            if (aoov.G(name3, voice.getLocale().getLanguage() + '-' + voice.getLocale().getCountry(), true)) {
                                java.lang.String name4 = voice.getName();
                                aooh.e(name4, "getName(...)");
                                defpackage.uwt uwtVar5 = uwuVar2.c;
                                if (uwtVar5 == null) {
                                    uwtVar5 = defpackage.uwt.a;
                                }
                                aooh.e(uwtVar5, "getVoice(...)");
                                if (aoov.G(name4, wsc.aX(uwtVar5), false) && voice.isNetworkConnectionRequired() == b(uwuVar2)) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                            uxmVar = this;
                            str2 = str;
                            it2 = it;
                            aimpVar2 = aimpVar;
                        }
                    }
                    android.speech.tts.Voice voice2 = (android.speech.tts.Voice) next;
                    if (voice2 != null) {
                        aimpVar.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "setVoice$<anonymous>", 120, "TtsInstance.kt").y("Using voice for TTS: %s", voice2);
                        akzxVar2.u();
                        amsa amsaVar = akzxVar2.b;
                        alal alalVar = amsa.a;
                        amsaVar.c |= 16;
                        amsaVar.j = false;
                        akzxVar2.u();
                        amsa amsaVar2 = akzxVar2.b;
                        amsaVar2.c |= 1;
                        amsaVar2.d = false;
                        textToSpeech.setVoice(voice2);
                    } else {
                        if ((uwuVar2.b & 2) != 0 && uwuVar2.d) {
                            akzxVar2.u();
                            amsa amsaVar3 = akzxVar2.b;
                            alal alalVar2 = amsa.a;
                            amsaVar3.c |= 16;
                            amsaVar3.j = true;
                            akzxVar2.u();
                            amsa amsaVar4 = akzxVar2.b;
                            amsaVar4.c |= 8;
                            amsaVar4.i = false;
                            throw new java.lang.IllegalStateException(a.bk(strAX, "Voice ", " not found"));
                        }
                        akzxVar2.u();
                        amsa amsaVar5 = akzxVar2.b;
                        alal alalVar3 = amsa.a;
                        amsaVar5.c |= 1;
                        amsaVar5.d = true;
                        aimpVar.b().l("com/android/dialer/tts/internal/synthesis/TtsInstance", "setVoice", 136, "TtsInstance.kt").I("%s not found, initializing TTS with default voice for %s locale", strAX, localeAY);
                    }
                }
                java.lang.Object obj4 = aootVar.a;
                if (obj4 != null) {
                    return (android.speech.tts.TextToSpeech) obj4;
                }
                aooh.j(str);
                return null;
            }
            aimpVar2.c().m(aioa.b).l("com/android/dialer/tts/internal/synthesis/TtsInstance", "isLocaleSupported", 177, "TtsInstance.kt").v("Unsupported language availability code, returning false");
        }
        throw new java.lang.IllegalStateException("Language not available for TTS.");
    }
}
