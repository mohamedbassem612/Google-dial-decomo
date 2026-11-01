package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexd {
    public static final java.util.Map a = new defpackage.aca();
    private final android.content.SharedPreferences b;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener c;

    static synchronized void a() {
        java.util.Map map = a;
        java.util.Iterator it = map.values().iterator();
        if (it.hasNext()) {
            defpackage.aexd aexdVar = (defpackage.aexd) it.next();
            android.content.SharedPreferences sharedPreferences = aexdVar.b;
            android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = aexdVar.c;
            throw null;
        }
        map.clear();
    }
}
