package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class omb implements ahas {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ omb(aoss aossVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = aossVar;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [aoss, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ecx, java.lang.Object] */
    public final ajcq a(ahau ahauVar) {
        int i = this.$cid;
        if (i == 0) {
            if (!ahauVar.a.contains(ahap.a)) {
                return aiql.z(ahas.d);
            }
            return aosv.F((aoss) this.a, 0, new defpackage.ogf((ecx) this.b, (aoln) null, 17), 3);
        }
        if (i == 1) {
            if (!ahauVar.a.contains(ahap.a)) {
                return aiql.z(ahas.d);
            }
            return aosv.F((aoss) this.a, 0, new defpackage.hqi((jbm) this.b, (aoln) null, 6), 3);
        }
        if (ahauVar.a()) {
            return aiql.z(ahas.d);
        }
        if (!ahauVar.a.contains(ahap.b)) {
            return aiql.z(ahas.d);
        }
        return ahvr.H(((soj) this.b).a(), new rht(4), (java.util.concurrent.Executor) this.a);
    }

    public /* synthetic */ omb(soj sojVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.b = sojVar;
        this.a = ajctVar;
    }
}
