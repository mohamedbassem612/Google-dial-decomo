package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lja implements android.speech.RecognitionListener {
    public static final /* synthetic */ int c = 0;
    public final java.util.concurrent.ConcurrentMap a;
    final /* synthetic */ defpackage.ljb b;

    public lja(defpackage.ljb ljbVar) {
        j$.util.Objects.requireNonNull(ljbVar);
        this.b = ljbVar;
        this.a = new j$.util.concurrent.ConcurrentHashMap();
    }

    private final adrr a(java.util.ArrayList arrayList, j$.util.Optional optional) {
        byte[] bArrCopyOf;
        j$.util.Optional optionalEmpty;
        defpackage.aift aiftVar = new defpackage.aift(4);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                aiftVar.i(new adrq((java.lang.String) arrayList.get(i), optional.isPresent() ? j$.util.Optional.of(java.lang.Float.valueOf(((float[]) optional.orElseThrow())[i])) : j$.util.Optional.empty()));
            }
        }
        adrp adrpVar = new adrp();
        adrpVar.d(aiftVar.g());
        adrpVar.c(defpackage.ahwr.a.a());
        defpackage.ljb ljbVar = this.b;
        if (ljbVar.r.h) {
            synchronized (ljbVar.u) {
                int i2 = ljbVar.t;
                if (i2 > 0) {
                    bArrCopyOf = java.util.Arrays.copyOf(ljbVar.s, i2);
                    ljbVar.t = 0;
                } else {
                    bArrCopyOf = null;
                }
            }
            optionalEmpty = bArrCopyOf == null ? j$.util.Optional.empty() : j$.util.Optional.of(new adns(bArrCopyOf, new android.media.AudioFormat.Builder().setSampleRate(ljbVar.r.b).setChannelMask(4).setEncoding(2).build()));
        } else {
            optionalEmpty = j$.util.Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            adrpVar.b((adns) optionalEmpty.orElseThrow());
        }
        adrr adrrVarA = adrpVar.a();
        j$.util.Optional optionalA = this.b.g.a(adrrVarA, true);
        if (!optionalA.isPresent()) {
            return adrrVarA;
        }
        adrp adrpVar2 = new adrp(adrrVarA);
        adrpVar2.e((adol) optionalA.orElseThrow());
        return adrpVar2.a();
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onBeginningOfSpeech", 387, "SodaSpeechRecognizer.java")).v("On Beginning Of Speech");
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onBufferReceived", 405, "SodaSpeechRecognizer.java")).v("On Buffer Received");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onEndOfSpeech", 410, "SodaSpeechRecognizer.java")).v("On End Of Speech");
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.a;
        for (adrs adrsVar : concurrentMap.keySet()) {
            ((defpackage.adqu) concurrentMap.get(adrsVar)).d(new eyd(adrsVar, i, 4), liy.c);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, android.os.Bundle bundle) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onEvent", 450, "SodaSpeechRecognizer.java")).v("onEvent");
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(android.os.Bundle bundle) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onPartialResults", 455, "SodaSpeechRecognizer.java")).v("On Partial Results");
        if (bundle.getBoolean("final_result")) {
            onResults(bundle);
            return;
        }
        adrr adrrVarA = a(bundle.getStringArrayList("results_recognition"), j$.util.Optional.ofNullable(bundle.getFloatArray("confidence_scores")));
        java.util.concurrent.ConcurrentMap concurrentMap = this.a;
        for (adrs adrsVar : concurrentMap.keySet()) {
            defpackage.adqu adquVar = (defpackage.adqu) concurrentMap.get(adrsVar);
            liy liyVar = liy.a;
            adquVar.c(liyVar);
            adquVar.d(new lge(adrsVar, adrrVarA, 6, (byte[]) null), liyVar);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(android.os.Bundle bundle) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onReadyForSpeech", 382, "SodaSpeechRecognizer.java")).v("On Ready For Speech");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(android.os.Bundle bundle) {
        ((defpackage.aimw) ((defpackage.aimw) defpackage.ljb.a.b()).l("com/android/dialer/callscreen/impl/speechrecognition/SodaSpeechRecognizer$SpeechRecognitionListener", "onResults", 479, "SodaSpeechRecognizer.java")).v("On Results");
        adrr adrrVarA = a(bundle.getStringArrayList("results_recognition"), j$.util.Optional.ofNullable(bundle.getFloatArray("confidence_scores")));
        java.util.concurrent.ConcurrentMap concurrentMap = this.a;
        for (adrs adrsVar : concurrentMap.keySet()) {
            defpackage.adqu adquVar = (defpackage.adqu) concurrentMap.get(adrsVar);
            adquVar.c(liy.a);
            adquVar.d(new lge(adrsVar, adrrVarA, 7, (byte[]) null), liy.b);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        java.util.concurrent.ConcurrentMap concurrentMap = this.a;
        for (adrs adrsVar : concurrentMap.keySet()) {
            ((defpackage.adqu) concurrentMap.get(adrsVar)).d(new liz(adrsVar, f), liy.d);
        }
    }
}
