package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kgd implements defpackage.kfy {
    private final /* synthetic */ int $cid;
    private final defpackage.rlv a;
    private final defpackage.kfz b;

    public kgd(defpackage.rlv rlvVar, int i, byte[] bArr) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.a = rlvVar;
        this.b = new defpackage.kfz(2132017698);
    }

    @Override // defpackage.kfy
    public final defpackage.kfz a() {
        return this.b;
    }

    @Override // defpackage.kfy
    public final java.util.List b(java.util.List list) {
        if (this.$cid != 0) {
            defpackage.aooh.f(list, "calls");
            return list;
        }
        defpackage.aooh.f(list, "calls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (defpackage.kcq.t(((kdc) obj).a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kfy
    public final java.util.List c(java.util.List list) {
        if (this.$cid != 0) {
            if (list != null) {
                return list;
            }
            defpackage.aooh.i("coalescedRows");
            return list;
        }
        defpackage.aooh.f(list, "coalescedRows");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (defpackage.kcq.t((defpackage.kiu) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.kfy
    public final void d() {
        int i = this.$cid;
        defpackage.rlv rlvVar = this.a;
        if (i != 0) {
            rlvVar.o(defpackage.rmx.CALL_LOG_FILTER_ALL_FILTER_CLICKED);
        } else {
            rlvVar.o(defpackage.rmx.CALL_LOG_FILTER_CONTACTS_FILTER_CLICKED);
        }
    }

    public kgd(defpackage.rlv rlvVar, int i) {
        this.$cid = i;
        if (rlvVar == null) {
            defpackage.aooh.i("loggingBindings");
        }
        this.a = rlvVar;
        this.b = new defpackage.kfz(2132017702);
    }
}
