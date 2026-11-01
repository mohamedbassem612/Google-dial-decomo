package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afbq {
    public static final aimz a = aimz.i("com/google/android/libraries/speech/transcription/TranscriptionUtils");

    static {
        aiue.c(j$.time.Duration.ofMillis(500L), 1.2d, 15);
        aiue.c(j$.time.Duration.ofSeconds(5L), 1.5d, 13);
    }

    public static android.content.ComponentName a(android.content.Context context) {
        android.content.ComponentName componentName = null;
        for (android.content.pm.ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(new android.content.Intent("com.google.recognition.action.DOWNLOAD_LANGUAGE"), 0)) {
            if (resolveInfo.activityInfo.packageName.equals("com.google.android.tts") && android.os.Build.VERSION.SDK_INT >= 31) {
                return new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
            if (resolveInfo.activityInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                componentName = new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
            }
        }
        if (componentName != null) {
            return componentName;
        }
        a.d().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerDownloadComponent", 254, "TranscriptionUtils.java").v("No Model Manager Download Language Pack API provided by Google.");
        return null;
    }

    public static android.content.ComponentName b(android.content.Context context) {
        android.content.ComponentName componentName = null;
        for (android.content.pm.ResolveInfo resolveInfo : context.getPackageManager().queryIntentServices(new android.content.Intent("android.speech.RecognitionService"), 0)) {
            if (resolveInfo.serviceInfo.packageName.equals("com.google.android.tts") && android.os.Build.VERSION.SDK_INT >= 31) {
                return new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
            }
            if (resolveInfo.serviceInfo.packageName.equals("com.google.android.googlequicksearchbox")) {
                componentName = new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name);
            }
        }
        if (componentName != null) {
            return componentName;
        }
        a.d().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getRecognitionServiceComponent", 131, "TranscriptionUtils.java").v("No speech services provided by Google.");
        return null;
    }

    public static int c(android.os.Bundle bundle) {
        if (!bundle.containsKey("com.google.recognition.extra.LANGUAGE_DOWNLOAD_RESULT")) {
            a.c().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLanguageDownloadResult", 313, "TranscriptionUtils.java").v("Extras did not contain a LanguageDownloadResult. Is the Intent type correct? Returning UNKNOWN");
            return 1;
        }
        byte[] byteArray = bundle.getByteArray("com.google.recognition.extra.LANGUAGE_DOWNLOAD_RESULT");
        if (byteArray != null) {
            try {
                defpackage.afbp afbpVar = (defpackage.afbp) alad.B(defpackage.afbp.a, byteArray, akzq.a());
                aimw aimwVarL = a.b().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLanguageDownloadResult", 325, "TranscriptionUtils.java");
                int iAQ = a.aQ(afbpVar.b);
                if (iAQ == 0) {
                    iAQ = 1;
                }
                aimwVarL.w("Parsed EXTRA_LANGUAGE_DOWNLOAD_RESULT with type proto: %d", iAQ - 1);
                int iAQ2 = a.aQ(afbpVar.b);
                if (iAQ2 != 0) {
                    return iAQ2;
                }
                return 1;
            } catch (alaz unused) {
            }
        }
        int i = bundle.getInt("com.google.recognition.extra.LANGUAGE_DOWNLOAD_RESULT", 10);
        if (i != 10) {
            a.b().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLanguageDownloadResult", 337, "TranscriptionUtils.java").w("Parsed EXTRA_LANGUAGE_DOWNLOAD_RESULT with type int: %d", i);
            if (i == -1) {
                return 3;
            }
            if (i == 0) {
                return 2;
            }
        }
        a.c().l("com/google/android/libraries/speech/transcription/TranscriptionUtils", "getModelManagerLanguageDownloadResult", 350, "TranscriptionUtils.java").v("Unrecognized data for EXTRA_LANGUAGE_DOWNLOAD_RESULT. Returning UNKNOWN.");
        return 1;
    }
}
