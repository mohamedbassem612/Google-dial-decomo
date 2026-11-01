package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uof implements defpackage.kau {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/speeddial/bar/impl/shortcuts/FavoritesBarShortcutRefreshListener");
    public final defpackage.zrw b;
    public final defpackage.aoin c;
    public final defpackage.gpd d;
    public final defpackage.rsr e;
    private final defpackage.aoss f;
    private final defpackage.aoin g;

    public uof(defpackage.gpd gpdVar, defpackage.rsr rsrVar, defpackage.zrw zrwVar, defpackage.aoss aossVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (gpdVar == null) {
            defpackage.aooh.i("dataLoader");
        }
        if (rsrVar == null) {
            defpackage.aooh.i("shortcutRefresher");
        }
        if (aossVar == null) {
            defpackage.aooh.i("lightweightScope");
        }
        if (aoinVar == null) {
            defpackage.aooh.i("enableUpdateShortcuts");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableOptimizeMemoryUsage");
        }
        this.d = gpdVar;
        this.e = rsrVar;
        this.b = zrwVar;
        this.f = aossVar;
        this.g = aoinVar;
        this.c = aoinVar2;
    }

    @Override // defpackage.kau
    public final /* synthetic */ void a(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    @Override // defpackage.kau
    public final void b(java.lang.Long l) {
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            defpackage.aoov.an(this.f, null, 0, new defpackage.ung(this, (defpackage.aoln) null, 2), 3);
        }
    }

    @Override // defpackage.kau
    public final /* synthetic */ void c(defpackage.kav kavVar) {
        if (kavVar == null) {
            defpackage.aooh.i("loggingContext");
        }
    }

    @Override // defpackage.kau
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kau
    public final /* synthetic */ void e() {
    }
}
