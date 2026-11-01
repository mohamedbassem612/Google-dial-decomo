package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alix extends com.google.speech.recognizer.AbstractRecognizer {
    public final com.google.speech.recognizer.ResourceManager a = new defpackage.aliw();

    public static void b(int i, java.lang.String str) throws defpackage.alio {
        if (i != 1) {
            java.util.Locale locale = java.util.Locale.US;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            throw new defpackage.alio(java.lang.String.format(locale, "%s: %s", str, java.lang.Integer.valueOf(i2)), defpackage.alti.RECOGNIZER_STATUS_INITIALIZATION_ERROR);
        }
    }

    @Override // com.google.speech.recognizer.AbstractRecognizer
    public final synchronized void a() {
        this.a.a();
        super.a();
    }
}
