package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class agpg implements agot {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ agpg(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [aoin, java.lang.Object] */
    public final ajcq c() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            ajcq ajcqVarZ = aiql.z((java.lang.Object) null);
            ((aogc) obj).s(ajcqVarZ, "com.google.apps.tiktok.account.data.AllAccounts");
            return ajcqVarZ;
        }
        if (i != 1) {
            return ((ahlt) this.a.a()).e();
        }
        java.lang.Object obj2 = this.a;
        aiql.E(ahqx.b(new defpackage.adbi(obj2, 6)), ((defpackage.agno) obj2).c);
        return aiql.z((java.lang.Object) null);
    }
}
