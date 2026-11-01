package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class liw implements android.speech.RecognitionListener {
    private static final aimz a = aimz.i("com/android/dialer/callscreen/impl/speechrecognition/DestroyRecognizerListener");
    private final java.util.concurrent.atomic.AtomicReference b;

    public liw(android.speech.SpeechRecognizer speechRecognizer) {
        this.b = new java.util.concurrent.atomic.AtomicReference(speechRecognizer);
    }

    private final void a() {
        android.speech.SpeechRecognizer speechRecognizer = (android.speech.SpeechRecognizer) this.b.getAndSet(null);
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        a.c().m(aioa.b).i(zct.b).l("com/android/dialer/callscreen/impl/speechrecognition/DestroyRecognizerListener", "onError", 30, "DestroyRecognizerListener.java").w("error: %d", i);
        a();
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(android.os.Bundle bundle) {
        a.b().l("com/android/dialer/callscreen/impl/speechrecognition/DestroyRecognizerListener", "onResults", 36, "DestroyRecognizerListener.java").v("enter");
        a();
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(android.os.Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(android.os.Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, android.os.Bundle bundle) {
    }
}
