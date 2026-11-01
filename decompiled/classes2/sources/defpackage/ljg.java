package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ljg extends or {
    private static final aimz a = aimz.i("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract");
    private final defpackage.oq b;

    public ljg(defpackage.oq oqVar) {
        this.b = oqVar;
    }

    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        android.content.Intent intent = new android.content.Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE");
        intent.setComponent(afbq.a((android.content.Context) this.b.a));
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(((akff) obj).q);
        intent.putExtra("android.speech.extra.LANGUAGE", new java.util.Locale(localeForLanguageTag.getLanguage(), localeForLanguageTag.getCountry()).toLanguageTag());
        return intent;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        if (i != -1) {
            a.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 46, "SodaDownloadEnqueueContract.java").v("result code not ok.");
            return j$.util.Optional.empty();
        }
        if (intent == null) {
            a.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 51, "SodaDownloadEnqueueContract.java").v("No intent available to parse result.");
            return j$.util.Optional.empty();
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            a.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 57, "SodaDownloadEnqueueContract.java").v("No extras available to parse result.");
            return j$.util.Optional.empty();
        }
        boolean zContainsKey = extras.containsKey("com.google.recognition.extra.ENQUEUE_STATUS");
        aimz aimzVar = a;
        if (!zContainsKey) {
            aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 62, "SodaDownloadEnqueueContract.java").v("No enqueue status available.");
            return j$.util.Optional.empty();
        }
        aimzVar.b().l("com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 66, "SodaDownloadEnqueueContract.java").v("Parsing enqueue status.");
        byte[] byteArray = extras.getByteArray("com.google.recognition.extra.ENQUEUE_STATUS");
        if (byteArray == null) {
            a.bI(aimzVar.c().m(aioa.b), "Error parsing enqueue status bytes.", "com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 'I', "SodaDownloadEnqueueContract.java", zct.b);
            return j$.util.Optional.empty();
        }
        try {
            return j$.util.Optional.of(alad.B(yqi.a, byteArray, akzq.a()));
        } catch (alaz e) {
            a.bq(a.c(), "Error parsing soda model enqueue status.", "com/android/dialer/callscreen/impl/speechrecognition/modelchooser/modelmanager/SodaDownloadEnqueueContract", "parseResult", 'V', "SodaDownloadEnqueueContract.java", e, zct.b);
            return j$.util.Optional.empty();
        }
    }
}
