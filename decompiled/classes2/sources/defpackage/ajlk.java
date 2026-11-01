package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajlk implements defpackage.ajey {
    public final android.content.SharedPreferences.Editor a;
    public final java.lang.String b;

    public ajlk(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("keysetName cannot be null");
        }
        this.b = str;
        android.content.Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.a = android.preference.PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.a = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }
}
