package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acgx {
    static final defpackage.aify a;
    static final defpackage.afid b;
    static final defpackage.aify c;
    public static final /* synthetic */ int e = 0;
    public final defpackage.zzx d;

    static {
        int i = defpackage.achc.a;
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("CREATE TABLE ");
        adagVar.n("clearcut_events_table");
        adagVar.n(" (");
        adagVar.n("account TEXT NOT NULL, ");
        adagVar.n("timestamp_ms INTEGER NOT NULL, ");
        adagVar.n("log_source INTEGER NOT NULL, ");
        adagVar.n("event_code INTEGER NOT NULL, ");
        adagVar.n("package_name TEXT NOT NULL)");
        defpackage.afic aficVar = new defpackage.afic(adagVar.B());
        defpackage.afic aficVar2 = new defpackage.afic(defpackage.ache.g("promotions"));
        defpackage.afic aficVar3 = new defpackage.afic(defpackage.ache.g("capped_promos"));
        defpackage.afic aficVar4 = new defpackage.afic(defpackage.ache.g("presented_promos"));
        defpackage.afic aficVar5 = new defpackage.afic(defpackage.ache.g("monitored_events_clearcut"));
        defpackage.afic aficVar6 = new defpackage.afic(defpackage.ache.g("monitored_events_visual_element"));
        int i2 = defpackage.achj.a;
        defpackage.adag adagVar2 = new defpackage.adag((byte[]) null);
        adagVar2.n("CREATE TABLE ");
        adagVar2.n("visual_element_events_table");
        adagVar2.n(" (");
        adagVar2.n("account TEXT NOT NULL, ");
        adagVar2.n("timestamp_ms INTEGER NOT NULL, ");
        adagVar2.n("node_id INTEGER NOT NULL, ");
        adagVar2.n("node_id_path TEXT NOT NULL, ");
        adagVar2.n("action INTEGER NOT NULL)");
        defpackage.aify aifyVarW = defpackage.aify.w(aficVar, aficVar2, aficVar3, aficVar4, aficVar5, aficVar6, new defpackage.afic(adagVar2.B()), new defpackage.afic(defpackage.ache.g("preview_promotions")), new defpackage.afic(defpackage.ache.g("eval_results")), new defpackage.afic(defpackage.achh.d("success_event_store")), new defpackage.afic(defpackage.achh.d("user_experiments_store")), new defpackage.afic(defpackage.ache.g("versioned_identifiers")), new defpackage.afic(defpackage.ache.g("chime_versioned_identifiers")));
        a = aifyVarW;
        defpackage.acgw acgwVar = new defpackage.acgw();
        b = acgwVar;
        defpackage.aift aiftVar = new defpackage.aift(4);
        aiftVar.k(aifyVarW);
        aiftVar.i(acgwVar);
        c = aiftVar.g();
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aoin, java.lang.Object] */
    public acgx(defpackage.aogc aogcVar, defpackage.adtq adtqVar, android.content.Context context) {
        java.lang.String strA = adtqVar.a(context, "growthkit.db", true);
        java.lang.String strSubstring = strA.substring(0, strA.lastIndexOf(47));
        defpackage.acgv acgvVar = new defpackage.acgv();
        defpackage.aify aifyVar = c;
        defpackage.afib afibVar = new defpackage.afib();
        int i = ((defpackage.aike) aifyVar).d;
        for (int i2 = 0; i2 < i; i2++) {
            afibVar.a.i((defpackage.afid) aifyVar.get(i2));
        }
        defpackage.ahbq ahbqVarB = afibVar.b();
        android.content.Context context2 = (android.content.Context) aogcVar.a.a();
        context2.getClass();
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = (java.util.concurrent.ScheduledExecutorService) aogcVar.b.a();
        scheduledExecutorService.getClass();
        defpackage.zzx zzxVar = (defpackage.zzx) aogcVar.c.a();
        zzxVar.getClass();
        strSubstring.getClass();
        this.d = new defpackage.zzx(new defpackage.afhx(context2, scheduledExecutorService, zzxVar, acgvVar, ahbqVarB, strSubstring));
    }
}
