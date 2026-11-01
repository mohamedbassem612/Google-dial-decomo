package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzg implements oql {
    private final /* synthetic */ int $cid;
    private final aoin a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public tzg(ajct ajctVar, aoin aoinVar, uav uavVar, int i) {
        this.$cid = i;
        this.b = ajctVar;
        this.a = aoinVar;
        this.c = uavVar;
    }

    public final oqt a() {
        int i = this.$cid;
        return oqt.b;
    }

    public final /* synthetic */ aify b() {
        return this.$cid != 0 ? aike.a : aike.a;
    }

    public final /* synthetic */ aify c() {
        return this.$cid != 0 ? aike.a : aike.a;
    }

    public final java.lang.String d() {
        return "main.hats_container";
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [aoin, java.lang.Object] */
    public final java.lang.String e() {
        return this.$cid != 0 ? (java.lang.String) this.b.a() : (java.lang.String) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq f(oqi oqiVar) {
        int i = this.$cid;
        aoin aoinVar = this.a;
        if (i == 0) {
            return ((java.lang.String) aoinVar.a()).isEmpty() ? aiql.z(java.lang.Boolean.FALSE) : ahrv.g(((uav) this.c).b()).h(new defpackage.tbp(10), (java.util.concurrent.Executor) this.b);
        }
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            return ((java.lang.String) this.b.a()).isEmpty() ? aiql.z(java.lang.Boolean.FALSE) : ahvr.H(oqiVar.a(oqt.f), new lbs(16), (java.util.concurrent.Executor) this.c);
        }
        return aiql.z(java.lang.Boolean.FALSE);
    }

    public tzg(aoin aoinVar, aoin aoinVar2, ajct ajctVar, int i) {
        this.$cid = i;
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = ajctVar;
    }
}
