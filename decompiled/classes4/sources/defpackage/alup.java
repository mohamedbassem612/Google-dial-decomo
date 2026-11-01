package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alup implements defpackage.allg {
    private static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenBargeInProcessor");
    private final defpackage.alvg b;
    private final defpackage.allj c;
    private int d;
    private java.util.Locale e;

    public alup(defpackage.alvg alvgVar, defpackage.alli alliVar) {
        aooh.f(alvgVar, "stateManager");
        aooh.f(alliVar, "publisherFactory");
        this.b = alvgVar;
        this.c = alliVar.a("AGENTIC_CALL_SCREEN_BARGE_IN");
        this.d = 2;
        java.util.Locale locale = java.util.Locale.getDefault();
        aooh.e(locale, "getDefault(...)");
        this.e = locale;
    }

    @Override // defpackage.allg
    public final aihd a() {
        aihd aihdVarR = aihd.r(defpackage.alnb.EVENT_ASR_PARTIAL_CHUNK, defpackage.alnb.EVENT_ASR_COMPLETE_SENTENCE);
        aooh.e(aihdVarR, "of(...)");
        return aihdVarR;
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
        java.lang.String str;
        int iNextIndex;
        aooh.f(almyVar, "event");
        defpackage.alvg alvgVar = this.b;
        defpackage.alvd alvdVar = alvgVar.c;
        defpackage.alvd alvdVar2 = defpackage.alvd.c;
        if (alvdVar != alvdVar2 || alvgVar.l()) {
            return;
        }
        defpackage.almz almzVar = almyVar.h;
        if (almzVar == null) {
            almzVar = defpackage.almz.a;
        }
        defpackage.alnb alnbVarB = defpackage.alnb.b(almzVar.c);
        if (alnbVarB == null) {
            alnbVarB = defpackage.alnb.EVENT_UNKNOWN;
        }
        int iOrdinal = alnbVarB.ordinal();
        java.lang.String str2 = "";
        if (iOrdinal == 53) {
            defpackage.almz almzVar2 = almyVar.h;
            if (almzVar2 == null) {
                almzVar2 = defpackage.almz.a;
            }
            apdi apdiVar = defpackage.alvl.f;
            aooh.e(apdiVar, "asrCompleteSentenceEvent");
            defpackage.alvl alvlVar = (defpackage.alvl) akmr.x(almzVar2, apdiVar);
            if (alvlVar != null && (str = alvlVar.c) != null) {
                str2 = str;
            }
        } else if (iOrdinal == 54) {
            defpackage.almz almzVar3 = almyVar.h;
            if (almzVar3 == null) {
                almzVar3 = defpackage.almz.a;
            }
            apdi apdiVar2 = defpackage.alvm.f;
            aooh.e(apdiVar2, "asrPartialChunkEvent");
            defpackage.alvm alvmVar = (defpackage.alvm) akmr.x(almzVar3, apdiVar2);
            if (alvmVar != null && alvmVar.d) {
                str2 = alvmVar.c;
            }
        }
        aooh.c(str2);
        if (str2.length() != 0) {
            java.util.Locale locale = this.e;
            int i = defpackage.alph.a;
            int i2 = 0;
            if (str2 != null && !str2.trim().isEmpty()) {
                java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
                wordInstance.setText(str2);
                int iFirst = wordInstance.first();
                int i3 = 0;
                for (int next = wordInstance.next(); next != -1; next = wordInstance.next()) {
                    java.lang.String strSubstring = str2.substring(iFirst, next);
                    for (int i4 = 0; i4 < strSubstring.length(); i4++) {
                        if (java.lang.Character.isLetterOrDigit(strSubstring.charAt(i4))) {
                            i3++;
                            break;
                        }
                    }
                    iFirst = next;
                }
                i2 = i3;
            }
            if (i2 >= this.d) {
                java.util.concurrent.locks.ReentrantLock reentrantLock = alvgVar.b;
                reentrantLock.lock();
                try {
                    if (alvgVar.c != alvdVar2) {
                        reentrantLock.unlock();
                        return;
                    }
                    alvgVar.c = defpackage.alvd.b;
                    reentrantLock.lock();
                    try {
                        java.util.List list = alvgVar.d;
                        java.util.ListIterator listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                if (((defpackage.alvf) listIterator.previous()).f == 1) {
                                    iNextIndex = listIterator.nextIndex();
                                    break;
                                }
                            } else {
                                iNextIndex = -1;
                                break;
                            }
                        }
                        if (iNextIndex != -1) {
                            defpackage.alvf alvfVar = (defpackage.alvf) list.get(iNextIndex);
                            int i5 = alvfVar.f;
                            java.lang.String str3 = alvfVar.a;
                            java.lang.String str4 = alvfVar.b;
                            java.lang.String str5 = alvfVar.c;
                            java.lang.String str6 = alvfVar.d;
                            aooh.f(str3, "text");
                            aooh.f(str5, "action");
                            aooh.f(str6, "intent");
                            list.set(iNextIndex, new defpackage.alvf(i5, str3, str4, str5, str6, true));
                        }
                        reentrantLock.unlock();
                        reentrantLock.unlock();
                        a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/callassistant/agenticcallscreen/AgenticCallScreenBargeInProcessor", "triggerBargeIn", 92, "AgenticCallScreenBargeInProcessor.kt").v("Barge-in detected. Stopping bot speech.");
                        xtq xtqVarO = defpackage.alpv.o(defpackage.almz.a.m());
                        xtqVarO.ah(defpackage.alnb.EVENT_STOP_BOT_SPEECH);
                        this.c.a(xtqVarO.ag(), almyVar);
                    } catch (java.lang.Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) {
        java.util.Locale localeForLanguageTag;
        java.lang.String str = almbVar != null ? almbVar.m : null;
        if (str == null || str.length() == 0) {
            localeForLanguageTag = java.util.Locale.getDefault();
            aooh.e(localeForLanguageTag, "getDefault(...)");
        } else {
            localeForLanguageTag = java.util.Locale.forLanguageTag(aoov.P(str, '_', '-'));
            aooh.e(localeForLanguageTag, "forLanguageTag(...)");
        }
        this.e = localeForLanguageTag;
        if (almlVar != null) {
            apdi apdiVar = defpackage.alvz.p;
            aooh.e(apdiVar, "agenticBotConfig");
            defpackage.alvz alvzVar = (defpackage.alvz) akmr.x(almlVar, apdiVar);
            if (alvzVar == null || (alvzVar.b & 16384) == 0) {
                return;
            }
            this.d = alvzVar.l;
        }
    }

    @Override // defpackage.allg
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.allg
    public final /* synthetic */ void e() {
    }
}
