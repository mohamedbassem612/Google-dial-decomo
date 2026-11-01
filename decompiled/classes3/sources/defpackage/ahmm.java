package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahmm implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public /* synthetic */ ahmm(defpackage.agvm agvmVar, ajcq ajcqVar, androidx.work.WorkerParameters workerParameters, j$.time.Duration duration, int i) {
        this.$cid = i;
        this.b = agvmVar;
        this.c = ajcqVar;
        this.a = workerParameters;
        this.d = duration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ajcq, java.lang.Object] */
    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid != 0) {
            if (((java.lang.Boolean) obj).booleanValue()) {
                java.lang.Object obj2 = this.d;
                java.lang.Object obj3 = this.a;
                ((defpackage.agvm) this.b).b(this.c, (androidx.work.WorkerParameters) obj3, (j$.time.Duration) obj2);
            }
        } else if (((java.lang.Boolean) obj).booleanValue()) {
            java.lang.Object obj4 = this.d;
            java.lang.Object obj5 = this.c;
            ((defpackage.akxm) this.a).c(this.b, (j$.time.Duration) obj5, (java.lang.String) obj4);
        }
        return null;
    }

    public /* synthetic */ ahmm(defpackage.akxm akxmVar, ajcq ajcqVar, j$.time.Duration duration, java.lang.String str, int i) {
        this.$cid = i;
        this.a = akxmVar;
        this.b = ajcqVar;
        this.c = duration;
        this.d = str;
    }
}
