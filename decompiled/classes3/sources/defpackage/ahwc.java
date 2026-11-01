package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahwc extends ajac implements java.lang.Runnable {
    public final ajcr a;

    public ahwc(defpackage.ahwd ahwdVar, ajcr ajcrVar, defpackage.xwr xwrVar) {
        j$.util.Objects.requireNonNull(ahwdVar);
        this.a = ajcrVar;
        ajbm ajbmVar = ajbm.a;
        ajcrVar.c(xwrVar, ajbmVar);
        aiql.I(ajcrVar, new defpackage.ahwb(this), ajbmVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }
}
