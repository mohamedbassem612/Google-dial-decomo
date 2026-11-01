package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahel implements ajas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ahel(defpackage.ahex ahexVar, int i, int i2) {
        this.$cid = i2;
        this.c = ahexVar;
        this.a = 1;
        this.b = "file_completion_present";
    }

    public final ajcq a() {
        int i = this.$cid;
        if (i == 0) {
            return ((defpackage.ahex) this.c).a(1, (java.lang.String) this.b);
        }
        if (i != 1) {
            ahbq ahbqVar = ahew.k;
            return ((defpackage.ahex) this.c).a(2, (java.lang.String) this.b);
        }
        defpackage.pqm pqmVar = (defpackage.pqm) this.b;
        defpackage.zpo zpoVarA = defpackage.zpo.a(pqmVar.b.getState());
        java.lang.Object obj = this.c;
        if ((zpoVarA == defpackage.zpo.j || zpoVarA == defpackage.zpo.g) && ((java.lang.Boolean) pqmVar.r.a()).booleanValue()) {
            pqmVar.v(22);
            ((dsd) obj).b((java.lang.Object) null);
            return ajcm.a;
        }
        int i2 = this.a;
        hwv hwvVar = pqmVar.x;
        if (hwvVar.i().equals(defpackage.zmx.c)) {
            pqmVar.v(19);
            if (zpoVarA != defpackage.zpo.f) {
                pqmVar.f.b(mfy.dS, aify.p(gus.au(i2)));
                pqmVar.t(i2);
            }
            pqmVar.g.add(obj);
            return hwvVar.j(defpackage.zmx.a);
        }
        if (zpoVarA == defpackage.zpo.f) {
            pqmVar.v(18);
            ((dsd) obj).b((java.lang.Object) null);
            return ajcm.a;
        }
        if (!((java.lang.Boolean) pqmVar.q.a()).booleanValue() || (zpoVarA != defpackage.zpo.i && pqmVar.g.isEmpty())) {
            pqmVar.f.b(mfy.dS, aify.p(gus.au(i2)));
            pqmVar.t(i2);
            pqmVar.g.add(obj);
        } else {
            pqmVar.v(18);
            pqmVar.g.add(obj);
        }
        return ajcm.a;
    }

    public /* synthetic */ ahel(defpackage.ahex ahexVar, int i, java.lang.String str, int i2) {
        this.$cid = i2;
        this.c = ahexVar;
        this.a = 2;
        this.b = str;
    }

    public /* synthetic */ ahel(defpackage.pqm pqmVar, int i, dsd dsdVar, int i2) {
        this.$cid = i2;
        this.b = pqmVar;
        this.a = i;
        this.c = dsdVar;
    }
}
