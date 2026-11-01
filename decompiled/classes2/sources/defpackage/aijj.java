package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aijj implements defpackage.aiiy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aijj(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahyc, java.lang.Object] */
    @Override // defpackage.aiiy
    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return this.a.apply(obj2);
        }
        if (i == 1) {
            return this.a.apply(obj2);
        }
        return ((defpackage.aijn) this.a).a(obj, (java.util.Collection) obj2);
    }
}
