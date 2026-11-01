package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achc implements defpackage.acgp {
    public static final /* synthetic */ int a = 0;
    private final defpackage.amwu b;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public achc(defpackage.amwu amwuVar) {
        this.b = amwuVar;
    }

    public static java.lang.String g(java.lang.String str) {
        return str == null ? "signedout" : str;
    }

    public static final void h(defpackage.adag adagVar, defpackage.akiq akiqVar) {
        adagVar.n("(log_source = ?");
        adagVar.p(java.lang.String.valueOf(akiqVar.c));
        adagVar.n(" AND event_code = ?");
        adagVar.p(java.lang.String.valueOf(akiqVar.d));
        adagVar.n(" AND package_name = ?)");
        adagVar.p(akiqVar.e);
    }

    private final defpackage.ajcq i(java.util.function.Consumer consumer) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT log_source,event_code, package_name, COUNT(*) as event_count");
        adagVar.n(" FROM clearcut_events_table");
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, adagVar);
        adagVar.n(" GROUP BY log_source,event_code, package_name");
        return ((defpackage.acgx) this.b.a()).d.M(adagVar.B()).c(new vur(4), defpackage.ajbm.INSTANCE).h();
    }

    private final defpackage.ajcq j(wsk wskVar) {
        return ((defpackage.acgx) this.b.a()).d.F(new jsh(wskVar, 18));
    }

    @Override // defpackage.acgp
    public final defpackage.ajcq a() {
        return j(new wsk("clearcut_events_table").h());
    }

    @Override // defpackage.acgp
    public final defpackage.ajcq b(java.lang.String str) {
        return i(new achb(str, 0));
    }

    @Override // defpackage.acgp
    public final defpackage.ajcq c(defpackage.akiq akiqVar) {
        final defpackage.acht achtVar = new defpackage.acht(akiqVar.c, akiqVar.d, akiqVar.e, j$.time.Instant.now().toEpochMilli());
        return ((defpackage.acgx) this.b.a()).d.G(new defpackage.afii() { // from class: acha
            @Override // defpackage.afii
            public final void a(defpackage.adag adagVar) throws java.lang.InterruptedException {
                int i = defpackage.achc.a;
                android.content.ContentValues contentValues = new android.content.ContentValues(5);
                contentValues.put("account", "signedout");
                defpackage.acht achtVar2 = achtVar;
                contentValues.put("timestamp_ms", java.lang.Long.valueOf(achtVar2.d));
                contentValues.put("log_source", java.lang.Integer.valueOf(achtVar2.a));
                contentValues.put("event_code", java.lang.Integer.valueOf(achtVar2.b));
                contentValues.put("package_name", achtVar2.c);
                adagVar.k("clearcut_events_table", contentValues, 0);
            }
        });
    }

    @Override // defpackage.acgp
    public final void d(long j) {
        wsk wskVar = new wsk("clearcut_events_table");
        wskVar.e("timestamp_ms <= ?");
        wskVar.f(java.lang.String.valueOf(j));
        defpackage.agab.bR(j(wskVar.h()), new uwm(12), null);
    }

    @Override // defpackage.acgp
    public final void e(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        arrayList.add("signedout");
        defpackage.agab.bR(j(abxl.p("clearcut_events_table", arrayList)), new uwm(13), null);
    }

    @Override // defpackage.acgp
    public final defpackage.ajcq f(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        return !it.hasNext() ? defpackage.aiql.z(java.util.Collections.EMPTY_MAP) : i(new achb(it, 2));
    }
}
