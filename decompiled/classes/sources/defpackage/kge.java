package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kge implements defpackage.kfy {
    private final /* synthetic */ int $cid;
    private final defpackage.rlv a;
    private final defpackage.kfz b;
    private final java.lang.Object c;

    public kge(defpackage.rlv rlvVar, defpackage.gpd gpdVar, int i) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        if (gpdVar == null) {
            defpackage.aooh.i("cuiSemanticLoggerFactory");
        }
        this.a = rlvVar;
        this.c = gpdVar;
        this.b = new defpackage.kfz(2132017716);
    }

    private final boolean e(defpackage.kiu kiuVar) {
        return !((defpackage.tkl) this.c).v(kiuVar) || kiuVar.s;
    }

    private static final boolean f(defpackage.kiu kiuVar) {
        int i = kiuVar.q;
        return i == 3 || i == 5;
    }

    @Override // defpackage.kfy
    public final defpackage.kfz a() {
        return this.b;
    }

    @Override // defpackage.kfy
    public final java.util.List b(java.util.List list) {
        if (this.$cid != 0) {
            defpackage.aooh.f(list, "calls");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (f(((kdc) obj).a)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        defpackage.aooh.f(list, "calls");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (e(((kdc) obj2).a)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.kfy
    public final java.util.List c(java.util.List list) {
        if (this.$cid != 0) {
            defpackage.aooh.f(list, "coalescedRows");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (f((defpackage.kiu) obj)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        defpackage.aooh.f(list, "coalescedRows");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (e((defpackage.kiu) obj2)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.kfy
    public final void d() {
        int i = this.$cid;
        defpackage.rlv rlvVar = this.a;
        if (i == 0) {
            rlvVar.o(defpackage.rmx.CALL_LOG_FILTER_NON_SPAM_FILTER_CLICKED);
        } else {
            rlvVar.o(defpackage.rmx.CALL_LOG_FILTER_MISSED_FILTER_CLICKED);
            ((defpackage.gpd) this.c).i(null).b(defpackage.mce.CONVERSATION_HISTORY_MISSED_FILTER_CLICKED);
        }
    }

    public kge(defpackage.tkl tklVar, defpackage.rlv rlvVar, int i) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.c = tklVar;
        this.a = rlvVar;
        this.b = new defpackage.kfz(2132017717);
    }
}
