package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gez {
    public final android.content.Context a;
    public android.content.SharedPreferences b;
    public boolean c;
    public androidx.preference.PreferenceScreen d;
    public gey e;
    public gew f;
    public gex g;
    private long h = 0;
    private android.content.SharedPreferences.Editor i;
    private java.lang.String j;

    public gez(android.content.Context context) {
        this.a = context;
        i(h(context));
    }

    public static android.content.SharedPreferences c(android.content.Context context) {
        return context.getSharedPreferences(java.lang.String.valueOf(context.getPackageName()).concat("_preferences"), 0);
    }

    public static java.lang.String h(android.content.Context context) {
        return java.lang.String.valueOf(context.getPackageName()).concat("_preferences");
    }

    private final void j(boolean z) {
        android.content.SharedPreferences.Editor editor;
        if (!z && (editor = this.i) != null) {
            editor.apply();
        }
        this.c = z;
    }

    public final long a() {
        long j;
        synchronized (this) {
            j = this.h;
            this.h = 1 + j;
        }
        return j;
    }

    public final android.content.SharedPreferences.Editor b() {
        if (!this.c) {
            return d().edit();
        }
        android.content.SharedPreferences.Editor editor = this.i;
        if (editor != null) {
            return editor;
        }
        android.content.SharedPreferences.Editor editorEdit = d().edit();
        this.i = editorEdit;
        return editorEdit;
    }

    public final android.content.SharedPreferences d() {
        android.content.SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        android.content.SharedPreferences sharedPreferences2 = this.a.getSharedPreferences(this.j, 0);
        this.b = sharedPreferences2;
        return sharedPreferences2;
    }

    public final androidx.preference.Preference e(java.lang.CharSequence charSequence) {
        androidx.preference.PreferenceScreen preferenceScreen = this.d;
        if (preferenceScreen == null) {
            return null;
        }
        return preferenceScreen.l(charSequence);
    }

    public final androidx.preference.PreferenceScreen f(android.content.Context context) {
        androidx.preference.PreferenceScreen preferenceScreen = new androidx.preference.PreferenceScreen(context, (android.util.AttributeSet) null);
        preferenceScreen.E(this);
        return preferenceScreen;
    }

    public final androidx.preference.PreferenceScreen g(android.content.Context context, int i, androidx.preference.PreferenceScreen preferenceScreen) {
        j(true);
        int i2 = gev.a;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String[] strArr = {java.lang.String.valueOf(androidx.preference.Preference.class.getPackage().getName()).concat("."), java.lang.String.valueOf(androidx.preference.SwitchPreference.class.getPackage().getName()).concat(".")};
        android.content.res.XmlResourceParser xml = context.getResources().getXml(i);
        try {
            androidx.preference.PreferenceScreen preferenceScreenA = gev.a(xml, preferenceScreen, context, objArr, this, strArr);
            xml.close();
            androidx.preference.PreferenceScreen preferenceScreen2 = preferenceScreenA;
            preferenceScreen2.E(this);
            j(false);
            return preferenceScreen2;
        } catch (java.lang.Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final void i(java.lang.String str) {
        this.j = str;
        this.b = null;
    }
}
