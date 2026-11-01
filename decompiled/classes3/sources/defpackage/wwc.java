package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwc implements defpackage.twh {
    final /* synthetic */ defpackage.wwd a;
    private final defpackage.wvs b;
    private final defpackage.aiep c;
    private int d;

    public wwc(defpackage.wwd wwdVar, defpackage.wvs wvsVar) {
        j$.util.Objects.requireNonNull(wwdVar);
        this.a = wwdVar;
        long jLongValue = ((java.lang.Long) wwdVar.d.a()).longValue();
        int i = (int) jLongValue;
        if (jLongValue != i) {
            throw new java.lang.ArithmeticException();
        }
        this.c = new defpackage.aiep(i);
        this.d = 0;
        this.b = wvsVar;
    }

    private final j$.util.OptionalInt g() {
        defpackage.aiep<java.lang.String> aiepVar = this.c;
        if (aiepVar.b() > 0) {
            return j$.util.OptionalInt.empty();
        }
        int i = this.d;
        int i2 = i;
        while (i < ((java.lang.String) aiepVar.peek()).length()) {
            j$.util.Optional optionalH = h((java.lang.String) aiepVar.peek(), i);
            for (java.lang.String str : aiepVar) {
                if (!h(str, i).isPresent() || !optionalH.equals(h(str, i))) {
                    return j$.util.OptionalInt.of(i2);
                }
            }
            i2++;
            i++;
        }
        return j$.util.OptionalInt.of(i2);
    }

    private static final j$.util.Optional h(java.lang.String str, int i) {
        return str.length() <= i ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Character.valueOf(str.charAt(i)));
    }

    @Override // defpackage.twh
    public final void a(defpackage.twg twgVar) {
        a.bt(defpackage.wwd.a.c().m(aioa.b), "SODA model runner error %s", twgVar, "com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onError", (char) 314, "SodaModelRunner.java", zct.b);
        this.a.a();
    }

    @Override // defpackage.twh
    public final void b(j$.util.Optional optional) {
        if (!optional.isPresent()) {
            a.bI(defpackage.wwd.a.d(), "transcription missing", "com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onFinalTranscription", (char) 278, "SodaModelRunner.java", zct.b);
            return;
        }
        aimw aimwVarL = defpackage.wwd.a.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onFinalTranscription", 281, "SodaModelRunner.java");
        defpackage.twj twjVar = (defpackage.twj) optional.orElseThrow();
        aimwVarL.y("onFinalTranscription: %s", twjVar.b == 1 ? (java.lang.String) twjVar.c : "");
    }

    @Override // defpackage.twh
    public final /* synthetic */ void c(defpackage.tvx tvxVar) {
        aooh.f(tvxVar, "languageDetectionEvent");
    }

    @Override // defpackage.twh
    public final /* synthetic */ void d(amle amleVar) {
        aooh.f(amleVar, "sodaEvent");
    }

    @Override // defpackage.twh
    public final void e(defpackage.twj twjVar) {
        java.lang.String str = twjVar.b == 1 ? (java.lang.String) twjVar.c : "";
        defpackage.aiep aiepVar = this.c;
        aiepVar.add(str);
        j$.util.OptionalInt optionalIntG = g();
        if (!optionalIntG.isPresent() || optionalIntG.getAsInt() <= this.d) {
            return;
        }
        java.lang.String strSubstring = ((java.lang.String) aiepVar.peek()).substring(this.d, optionalIntG.getAsInt());
        defpackage.wwd.a.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onPartialResults", 298, "SodaModelRunner.java").y("emitting text: %s", strSubstring);
        defpackage.wvs wvsVar = this.b;
        akzx akzxVarM = defpackage.wwa.a.m();
        akzx akzxVarM2 = defpackage.wvz.a.m();
        akzxVarM2.u();
        defpackage.wvz wvzVar = (defpackage.wvz) akzxVarM2.b;
        j$.util.Objects.requireNonNull(strSubstring);
        wvzVar.b |= 1;
        wvzVar.c = strSubstring;
        defpackage.wvz wvzVar2 = (defpackage.wvz) akzxVarM2.p();
        akzxVarM.u();
        defpackage.wwa wwaVar = (defpackage.wwa) akzxVarM.b;
        j$.util.Objects.requireNonNull(wvzVar2);
        wwaVar.d = wvzVar2;
        wwaVar.c = 5;
        wvsVar.a((defpackage.wwa) akzxVarM.p());
        this.d = optionalIntG.getAsInt();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
    @Override // defpackage.twh
    public final void f(defpackage.twj twjVar) {
        aimz aimzVar = defpackage.wwd.a;
        aimzVar.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onSegmentResults", 245, "SodaModelRunner.java").y("onSegmentResults transcription: %s", twjVar.b == 1 ? (java.lang.String) twjVar.c : "");
        j$.util.OptionalInt optionalIntG = g();
        if (!(twjVar.b == 1 ? (java.lang.String) twjVar.c : "").isEmpty()) {
            defpackage.wvs wvsVar = this.b;
            akzx akzxVarM = defpackage.wwa.a.m();
            akzx akzxVarM2 = defpackage.wvy.a.m();
            java.lang.String str = twjVar.b == 1 ? (java.lang.String) twjVar.c : "";
            akzxVarM2.u();
            defpackage.wvy wvyVar = (defpackage.wvy) akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            wvyVar.b |= 1;
            wvyVar.c = str;
            defpackage.wvy wvyVar2 = (defpackage.wvy) akzxVarM2.p();
            akzxVarM.u();
            defpackage.wwa wwaVar = (defpackage.wwa) akzxVarM.b;
            j$.util.Objects.requireNonNull(wvyVar2);
            wwaVar.d = wvyVar2;
            wwaVar.c = 4;
            wvsVar.a((defpackage.wwa) akzxVarM.p());
        }
        if (optionalIntG.isPresent()) {
            if (optionalIntG.getAsInt() < (twjVar.b == 1 ? (java.lang.String) twjVar.c : "").length()) {
                java.lang.String strSubstring = (twjVar.b == 1 ? (java.lang.String) twjVar.c : "").substring(this.d);
                aimzVar.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onSegmentResults", 263, "SodaModelRunner.java").y("emitting text: %s", strSubstring);
                defpackage.wvs wvsVar2 = this.b;
                akzx akzxVarM3 = defpackage.wwa.a.m();
                akzx akzxVarM4 = defpackage.wvz.a.m();
                akzxVarM4.u();
                defpackage.wvz wvzVar = (defpackage.wvz) akzxVarM4.b;
                j$.util.Objects.requireNonNull(strSubstring);
                wvzVar.b |= 1;
                wvzVar.c = strSubstring;
                defpackage.wvz wvzVar2 = (defpackage.wvz) akzxVarM4.p();
                akzxVarM3.u();
                defpackage.wwa wwaVar2 = (defpackage.wwa) akzxVarM3.b;
                j$.util.Objects.requireNonNull(wvzVar2);
                wwaVar2.d = wvzVar2;
                wwaVar2.c = 5;
                wvsVar2.a((defpackage.wwa) akzxVarM3.p());
            }
        } else {
            java.lang.String strSubstring2 = (twjVar.b == 1 ? (java.lang.String) twjVar.c : "").substring(this.d);
            aimzVar.b().l("com/android/incallui/atlas/detection/techniques/asr/SodaModelRunner$SodaEventListenerImpl", "onSegmentResults", 263, "SodaModelRunner.java").y("emitting text: %s", strSubstring2);
            defpackage.wvs wvsVar3 = this.b;
            akzx akzxVarM5 = defpackage.wwa.a.m();
            akzx akzxVarM6 = defpackage.wvz.a.m();
            akzxVarM6.u();
            defpackage.wvz wvzVar3 = (defpackage.wvz) akzxVarM6.b;
            j$.util.Objects.requireNonNull(strSubstring2);
            wvzVar3.b |= 1;
            wvzVar3.c = strSubstring2;
            defpackage.wvz wvzVar4 = (defpackage.wvz) akzxVarM6.p();
            akzxVarM5.u();
            defpackage.wwa wwaVar3 = (defpackage.wwa) akzxVarM5.b;
            j$.util.Objects.requireNonNull(wvzVar4);
            wwaVar3.d = wvzVar4;
            wwaVar3.c = 5;
            wvsVar3.a((defpackage.wwa) akzxVarM5.p());
        }
        this.d = 0;
        this.c.clear();
    }
}
