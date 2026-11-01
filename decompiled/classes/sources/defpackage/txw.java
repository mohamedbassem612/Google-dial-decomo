package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class txw extends defpackage.or {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl");
    private final android.content.Context b;

    public txw(android.content.Context context) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
    }

    @Override // defpackage.or
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        defpackage.akff akffVar = (defpackage.akff) obj;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(akffVar, "input");
        android.content.Intent intent = new android.content.Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE");
        intent.setComponent(afbq.a(this.b));
        intent.putExtra("android.speech.extra.LANGUAGE", agmc.af(akffVar));
        return intent;
    }

    @Override // defpackage.or
    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        if (i != -1) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 38, "SodaDownloadEnqueueContractImpl.kt")).v("result code not ok.");
            return null;
        }
        if (intent == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 42, "SodaDownloadEnqueueContractImpl.kt")).v("No intent available to parse result.");
            return null;
        }
        android.os.Bundle extras = intent.getExtras();
        if (extras == null) {
            ((defpackage.aimw) a.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 47, "SodaDownloadEnqueueContractImpl.kt")).v("No extras available to parse result.");
            return null;
        }
        boolean zContainsKey = extras.containsKey("com.google.recognition.extra.ENQUEUE_STATUS");
        defpackage.aimz aimzVar = a;
        if (!zContainsKey) {
            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 51, "SodaDownloadEnqueueContractImpl.kt")).v("No enqueue status available.");
            return null;
        }
        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 54, "SodaDownloadEnqueueContractImpl.kt")).v("Parsing enqueue status.");
        byte[] byteArray = extras.getByteArray("com.google.recognition.extra.ENQUEUE_STATUS");
        if (byteArray == null) {
            ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 57, "SodaDownloadEnqueueContractImpl.kt")).v("Error parsing enqueue status bytes.");
            return null;
        }
        try {
            return defpackage.alad.B(yqi.a, byteArray, defpackage.akzq.a());
        } catch (defpackage.alaz e) {
            ((defpackage.aimw) ((defpackage.aimw) a.c()).k(e).l("com/android/dialer/sodatranscription/impl/androidspeech/SodaDownloadEnqueueContractImpl", "parseResult", 66, "SodaDownloadEnqueueContractImpl.kt")).v("Error parsing soda model enqueue status.");
            return null;
        }
    }
}
