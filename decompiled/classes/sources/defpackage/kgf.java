package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgf implements defpackage.kfy {
    private final defpackage.rlv a;
    private final defpackage.kfz b;
    private final defpackage.gpd c;
    private final defpackage.tkl d;

    public kgf(defpackage.tkl tklVar, defpackage.rlv rlvVar, defpackage.gpd gpdVar) {
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.d = tklVar;
        this.a = rlvVar;
        this.c = gpdVar;
        this.b = new defpackage.kfz(2132017719);
    }

    private final boolean e(defpackage.kiu kiuVar) {
        return this.d.v(kiuVar) && !kiuVar.s;
    }

    @Override // defpackage.kfy
    public final defpackage.kfz a() {
        return this.b;
    }

    @Override // defpackage.kfy
    public final java.util.List b(java.util.List list) {
        defpackage.aooh.f(list, "calls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (e(((kdc) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kfy
    public final java.util.List c(java.util.List list) {
        defpackage.aooh.f(list, "coalescedRows");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (e((defpackage.kiu) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kfy
    public final void d() {
        this.a.o(defpackage.rmx.CALL_LOG_FILTER_SPAM_FILTER_CLICKED);
        this.c.i(null).b(defpackage.mce.CONVERSATION_HISTORY_SPAM_FILTER_CLICKED);
    }
}
