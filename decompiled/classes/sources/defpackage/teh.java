package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class teh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/search/NewSearchEnabledFn");
    public final defpackage.aoin b;
    private final defpackage.aoin c;

    public teh(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (aoinVar == null) {
            defpackage.aooh.i("newSearchEnabled");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableAppSearchContactSearch");
        }
        this.c = aoinVar;
        this.b = aoinVar2;
    }

    public final boolean a() {
        java.lang.Boolean bool = (java.lang.Boolean) this.c.a();
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/search/NewSearchEnabledFn", "isEnabled", 25, "NewSearchEnabledFn.kt")).y("new search enabled: %s", bool);
        defpackage.aooh.c(bool);
        return bool.booleanValue();
    }
}
