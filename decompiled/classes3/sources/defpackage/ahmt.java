package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahmt implements ahpm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ ahpm b;

    public /* synthetic */ ahmt(ahpm ahpmVar, ahpj ahpjVar, int i) {
        this.$cid = i;
        this.a = ahpmVar;
        this.b = ahpjVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [ahpm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [ahpm, java.lang.Object] */
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            this.a.close();
            ahns.u(this.b);
            return;
        }
        if (i == 1) {
            this.b.close();
            this.a.close();
            return;
        }
        if (i == 2) {
            this.b.close();
            this.a.close();
            return;
        }
        if (i == 3) {
            this.b.close();
            ahyn ahynVar = (ahyn) this.a;
            if (ahynVar.f()) {
                ahynVar.b().close();
                return;
            }
            return;
        }
        if (i == 4) {
            this.a.close();
            ahns.u(this.b);
        } else if (i == 5) {
            this.a.close();
            this.b.close();
        } else {
            this.b.close();
            this.a.close();
            ahns.l();
        }
    }

    public /* synthetic */ ahmt(ahpm ahpmVar, java.lang.Object obj, int i) {
        this.$cid = i;
        this.b = ahpmVar;
        this.a = obj;
    }
}
