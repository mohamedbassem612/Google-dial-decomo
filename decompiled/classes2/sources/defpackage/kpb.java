package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kpb {
    private static final aimz a = aimz.i("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder");
    private final akzx b;
    private final defpackage.kvt c;

    public kpb(aazc aazcVar) {
        aooh.f(aazcVar, "clock");
        akzx akzxVarM = defpackage.koy.a.m();
        aooh.e(akzxVarM, "newBuilder(...)");
        this.b = akzxVarM;
        this.c = new defpackage.kvt((byte[]) null);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    private final void e(amle amleVar, defpackage.igd igdVar) {
        java.lang.String str;
        java.lang.String string;
        int iF = f(igdVar);
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        a.b().l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "appendTranscript", 118, "CallNotesTranscriptBuilder.kt").v("enter append transcript in builder");
        amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        aooh.e(amldVar, "getRecognitionEvent(...)");
        int i = amldVar.b;
        java.lang.String strQ = null;
        if (i == 1) {
            amkw amkwVar = (amkw) amldVar.c;
            aooh.e(amkwVar, "getFinalResult(...)");
            if (amkwVar.c.size() != 0) {
                str = (java.lang.String) amkwVar.c.get(0);
            } else {
                str = null;
            }
        } else if (i == 2) {
            amla amlaVar = (amla) amldVar.c;
            aooh.e(amlaVar, "getPartialResult(...)");
            if (amlaVar.b.size() != 0) {
                str = (java.lang.String) amlaVar.b.get(0);
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null && (string = aoov.x(str).toString()) != null) {
            strQ = aoov.Q(string, "</S>", "");
        }
        if (strQ != null) {
            akzx akzxVar = this.b;
            akzx akzxVarM = defpackage.kow.a.m();
            aooh.f(akzxVarM, "builder");
            aooh.f(amleVar, "value");
            akzxVarM.u();
            defpackage.kow kowVar = (defpackage.kow) akzxVarM.b;
            j$.util.Objects.requireNonNull(amleVar);
            kowVar.c = amleVar;
            kowVar.b |= 1;
            akzxVarM.u();
            defpackage.kow kowVar2 = (defpackage.kow) akzxVarM.b;
            j$.util.Objects.requireNonNull(strQ);
            kowVar2.b |= 2;
            kowVar2.d = strQ;
            akzxVarM.u();
            defpackage.kow kowVar3 = (defpackage.kow) akzxVarM.b;
            kowVar3.b |= 4;
            kowVar3.e = epochMilli;
            akzxVarM.u();
            defpackage.kow kowVar4 = (defpackage.kow) akzxVarM.b;
            kowVar4.f = a.aT(iF);
            kowVar4.b |= 8;
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            defpackage.kow kowVar5 = (defpackage.kow) aladVarP;
            akzxVar.u();
            defpackage.koy koyVar = (defpackage.koy) akzxVar.b;
            defpackage.koy koyVar2 = defpackage.koy.a;
            j$.util.Objects.requireNonNull(kowVar5);
            alat alatVar = koyVar.b;
            if (!alatVar.c()) {
                koyVar.b = alad.J(alatVar);
            }
            koyVar.b.add(kowVar5);
        }
    }

    private static final int f(defpackage.igd igdVar) {
        int iOrdinal = igdVar.ordinal();
        if (iOrdinal != 1) {
            return iOrdinal == 2 ? 4 : 1;
        }
        return 5;
    }

    public final defpackage.koy a() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "appendPartialSodaEventsToTranscript", 76, "CallNotesTranscriptBuilder.kt").v("enter append partial soda events");
        defpackage.kvt kvtVar = this.c;
        java.util.Set setEntrySet = ((java.util.EnumMap) kvtVar.b).entrySet();
        aooh.e(setEntrySet, "<get-entries>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setEntrySet) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            aooh.c(entry);
            defpackage.igd igdVar = (defpackage.igd) entry.getKey();
            amle amleVar = (amle) entry.getValue();
            amle amleVar2 = (amle) ((java.util.EnumMap) kvtVar.a).get(igdVar);
            if (amleVar2 != null) {
                aooh.c(amleVar);
                long jR = defpackage.hgz.R(amleVar);
                amld amldVar = amleVar2.c;
                if (amldVar == null) {
                    amldVar = amld.a;
                }
                amlg amlgVar = (amldVar.b == 1 ? (amkw) amldVar.c : amkw.a).e;
                if (amlgVar == null) {
                    amlgVar = amlg.a;
                }
                if (jR != amlgVar.c) {
                }
            }
            arrayList.add(obj);
        }
        for (java.lang.Object obj2 : ajsz.bX(arrayList, new defpackage.hte(10))) {
            aooh.e(obj2, "next(...)");
            java.util.Map.Entry entry2 = (java.util.Map.Entry) obj2;
            defpackage.igd igdVar2 = (defpackage.igd) entry2.getKey();
            amle amleVar3 = (amle) entry2.getValue();
            aimzVar.b().l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "appendPartialSodaEventsToTranscript", 78, "CallNotesTranscriptBuilder.kt").v("enter append transcript");
            aooh.c(amleVar3);
            aooh.c(igdVar2);
            e(amleVar3, igdVar2);
        }
        alad aladVarP = this.b.p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.koy) aladVarP;
    }

    public final void b(defpackage.igd igdVar, tvx tvxVar) {
        aooh.f(tvxVar, "languageDetectionEvent");
        a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onLanguageDetectionEvent", 55, "CallNotesTranscriptBuilder.kt").v("Received language detection events");
        long epochMilli = j$.time.Instant.now().toEpochMilli();
        akzx akzxVarM = defpackage.kox.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(tvxVar, "value");
        akzxVarM.u();
        defpackage.kox koxVar = (defpackage.kox) akzxVarM.b;
        j$.util.Objects.requireNonNull(tvxVar);
        koxVar.c = tvxVar;
        koxVar.b |= 1;
        int iF = f(igdVar);
        akzxVarM.u();
        defpackage.kox koxVar2 = (defpackage.kox) akzxVarM.b;
        koxVar2.d = a.aT(iF);
        koxVar2.b |= 2;
        akzxVarM.u();
        defpackage.kox koxVar3 = (defpackage.kox) akzxVarM.b;
        koxVar3.b |= 4;
        koxVar3.e = epochMilli;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        defpackage.kox koxVar4 = (defpackage.kox) aladVarP;
        akzx akzxVar = this.b;
        akzxVar.u();
        defpackage.koy koyVar = (defpackage.koy) akzxVar.b;
        defpackage.koy koyVar2 = defpackage.koy.a;
        j$.util.Objects.requireNonNull(koxVar4);
        alat alatVar = koyVar.c;
        if (!alatVar.c()) {
            koyVar.c = alad.J(alatVar);
        }
        koyVar.c.add(koxVar4);
    }

    public final void c(defpackage.igd igdVar, twj twjVar) {
        aooh.f(twjVar, "transcription");
        aimz aimzVar = a;
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onPartialResults", 61, "CallNotesTranscriptBuilder.kt").v("Received partial results");
        amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        if (amldVar.b != 2) {
            aimzVar.c().m(aioa.b).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onPartialResults", 63, "CallNotesTranscriptBuilder.kt").v("Partial result is missing");
            return;
        }
        defpackage.kvt kvtVar = this.c;
        amle amleVar = twjVar.b == 2 ? (amle) twjVar.c : amle.a;
        aooh.e(amleVar, "getSodaEvent(...)");
        kvtVar.b(igdVar, amleVar);
    }

    public final void d(defpackage.igd igdVar, twj twjVar) {
        aooh.f(twjVar, "transcription");
        aimz aimzVar = a;
        aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onSegmentResults", 34, "CallNotesTranscriptBuilder.kt").v("Received segment results");
        amle amleVar = twjVar.b == 2 ? (amle) twjVar.c : amle.a;
        aooh.e(amleVar, "getSodaEvent(...)");
        amld amldVar = amleVar.c;
        if (amldVar == null) {
            amldVar = amld.a;
        }
        aooh.e(amldVar, "getRecognitionEvent(...)");
        int i = amldVar.b;
        if (i != 1) {
            aimzVar.c().m(aioa.b).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onSegmentResults", 38, "CallNotesTranscriptBuilder.kt").v("Final result is missing");
            return;
        }
        amkw amkwVar = i == 1 ? (amkw) amldVar.c : amkw.a;
        aooh.e(amkwVar, "getFinalResult(...)");
        if (amkwVar.c.size() == 0) {
            aimzVar.c().m(aioa.b).l("com/android/dialer/callnotesinfra/incall/CallNotesTranscriptBuilder", "onSegmentResults", 43, "CallNotesTranscriptBuilder.kt").v("Failed to parse final result");
        } else {
            e(amleVar, igdVar);
            this.c.b(igdVar, amleVar);
        }
    }
}
