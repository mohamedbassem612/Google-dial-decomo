package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lor {
    public static final aimz a = aimz.i("com/android/dialer/common/PerAccountSharedPreferencesTMigrator");

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public static final void a(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.jyn jynVar) {
        ?? r0 = jynVar.b;
        if (r0.contains(jynVar.h(str, str2))) {
            editor.putBoolean(jynVar.h(str, str3), r0.getBoolean(jynVar.h(str, str2), false));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public static final void b(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.jyn jynVar) {
        ?? r0 = jynVar.b;
        if (r0.contains(jynVar.h(str, str2))) {
            editor.putInt(jynVar.h(str, str3), r0.getInt(jynVar.h(str, str2), 0));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public static final void c(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.String str2, java.lang.String str3, defpackage.jyn jynVar) {
        ?? r0 = jynVar.b;
        if (r0.contains(jynVar.h(str, str2))) {
            editor.putString(jynVar.h(str, str3), r0.getString(jynVar.h(str, str2), ""));
        }
    }
}
