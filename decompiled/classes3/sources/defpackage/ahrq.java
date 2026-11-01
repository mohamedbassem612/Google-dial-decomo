package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahrq implements android.speech.RecognitionListener {
    private final android.speech.RecognitionListener a;
    private final ahqz b;

    public ahrq(android.speech.RecognitionListener recognitionListener, ahqz ahqzVar) {
        this.a = recognitionListener;
        this.b = ahqzVar;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onBeginningOfSpeech();
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
        ahqz ahqzVar = this.b;
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(ahqzVar);
        try {
            aooh.f(bArr, "buffer");
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onEndOfSegmentedSession();
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onEndOfSpeech();
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onError(i);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, android.os.Bundle bundle) {
        ahqz ahqzVar = this.b;
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(ahqzVar);
        try {
            aooh.f(bundle, "params");
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(android.os.Bundle bundle) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onPartialResults(bundle);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(android.os.Bundle bundle) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onReadyForSpeech(bundle);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(android.os.Bundle bundle) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onResults(bundle);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        ahqz.d(ahqzVarF);
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(android.os.Bundle bundle) {
        ahqz ahqzVarF = ahqz.f();
        ahqz.d(this.b);
        try {
            this.a.onSegmentResults(bundle);
        } finally {
            ahqz.d(ahqzVarF);
        }
    }
}
