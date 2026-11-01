package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahmv implements defpackage.ahpm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public ahmv(defpackage.ahpm ahpmVar, int i) {
        this.$cid = i;
        this.a = ahpmVar;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [ahok, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [ahpj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [ahok, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ahpj, java.lang.Object] */
    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ahmw ahmwVar = (defpackage.ahmw) this.a;
            ahmwVar.s();
            ahmwVar.q();
            ahmwVar.a = null;
            return;
        }
        if (i == 1) {
            defpackage.ahmw ahmwVar2 = (defpackage.ahmw) this.a;
            ahmwVar2.s();
            ahmwVar2.q();
            return;
        }
        if (i == 2) {
            this.a.close();
            defpackage.ahns.l();
            return;
        }
        if (i == 3) {
            defpackage.ahns.u(this.a);
            return;
        }
        if (i == 4) {
            this.a.close();
            defpackage.ahns.l();
        } else if (i != 5) {
            defpackage.ahns.u(this.a);
        } else {
            defpackage.afec.d(new ahts(this, 1), 10000L);
        }
    }

    public /* synthetic */ ahmv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
