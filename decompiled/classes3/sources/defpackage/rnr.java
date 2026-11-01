package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rnr {
    public static final long a;

    static {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.DAYS;
        a = 86400000L;
    }

    public static void a(java.util.Set set, android.content.SharedPreferences sharedPreferences) {
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("RATE_LIMITER_PREFS", set);
        editorEdit.apply();
    }

    public static java.lang.String[] b(java.lang.String str) {
        int iLastIndexOf = str.lastIndexOf("_");
        ahvr.bM(iLastIndexOf != -1);
        return new java.lang.String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
    }
}
