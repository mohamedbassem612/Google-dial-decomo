package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ahnl implements defpackage.ahpm {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.ahpm a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ ahnl(defpackage.ahpm ahpmVar, defpackage.ahmw ahmwVar, int i) {
        this.$cid = i;
        this.a = ahpmVar;
        this.b = ahmwVar;
    }

    @Override // defpackage.ahpm, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.$cid;
        defpackage.ahpm ahpmVar = this.a;
        if (i == 0) {
            ahpmVar.close();
            defpackage.ajwa ajwaVar = (defpackage.ajwa) this.b;
            ajwaVar.b = null;
            ajwaVar.c = null;
            return;
        }
        ahpmVar.close();
        defpackage.ahmw ahmwVar = (defpackage.ahmw) this.b;
        ahmwVar.a = null;
        ahmwVar.b = false;
        defpackage.ahns.d((defpackage.ahpe) defpackage.ahns.d.get(), ahmwVar.c);
        ahmwVar.c = null;
    }

    public /* synthetic */ ahnl(defpackage.ajwa ajwaVar, defpackage.ahpm ahpmVar, int i) {
        this.$cid = i;
        this.b = ajwaVar;
        this.a = ahpmVar;
    }
}
