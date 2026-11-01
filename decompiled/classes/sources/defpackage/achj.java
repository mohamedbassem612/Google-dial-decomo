package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class achj implements defpackage.acgu {
    public static final /* synthetic */ int a = 0;
    private final defpackage.amwu b;

    static {
        defpackage.aiof.i("GnpSdk");
    }

    public achj(defpackage.amwu amwuVar) {
        this.b = amwuVar;
    }

    public static final java.lang.String f(java.lang.String str) {
        return str == null ? "signedout" : str;
    }

    public static final void g(defpackage.adag adagVar, akkn akknVar) {
        adagVar.n("(node_id = ?");
        adagVar.p(java.lang.String.valueOf(defpackage.ahvr.bk(akknVar.c)));
        adagVar.n(" AND action = ?)");
        akkm akkmVarB = akkm.b(akknVar.d);
        if (akkmVarB == null) {
            akkmVarB = akkm.a;
        }
        adagVar.p(java.lang.String.valueOf(akkmVarB.e));
    }

    private final defpackage.ajcq h(java.util.function.Consumer consumer) {
        defpackage.adag adagVar = new defpackage.adag((byte[]) null);
        adagVar.n("SELECT node_id_path,action, COUNT(*) as event_count");
        adagVar.n(" FROM visual_element_events_table");
        aa$.ExternalSyntheticApiModelOutline1.m(consumer, adagVar);
        adagVar.n(" GROUP BY node_id_path,action");
        return ((defpackage.acgx) this.b.a()).d.M(adagVar.B()).c(new vur(6), defpackage.ajbm.INSTANCE).h();
    }

    private final defpackage.ajcq i(wsk wskVar) {
        return ((defpackage.acgx) this.b.a()).d.F(new achi(wskVar));
    }

    @Override // defpackage.acgu
    public final defpackage.ajcq a() {
        defpackage.ajcq ajcqVarI = i(new wsk("visual_element_events_table").h());
        defpackage.agab.bR(ajcqVarI, new uwm(15), null);
        return ajcqVarI;
    }

    @Override // defpackage.acgu
    public final defpackage.ajcq b(java.lang.String str) {
        return h(new achb(str, 4));
    }

    @Override // defpackage.acgu
    public final void c(long j) {
        wsk wskVar = new wsk("visual_element_events_table");
        wskVar.e("timestamp_ms <= ?");
        wskVar.f(java.lang.String.valueOf(j));
        defpackage.agab.bR(i(wskVar.h()), new uwm(14), null);
    }

    @Override // defpackage.acgu
    public final void d(java.util.Collection collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        arrayList.add("signedout");
        i(abxl.p("visual_element_events_table", arrayList));
    }

    @Override // defpackage.acgu
    public final defpackage.ajcq e(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        return !it.hasNext() ? defpackage.aiql.z(defpackage.aikj.b) : h(new achb(it, 3));
    }
}
