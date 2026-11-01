package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aovs implements aotj {
    public final /* synthetic */ aovt a;
    public final /* synthetic */ java.lang.Runnable b;

    public /* synthetic */ aovs(aovt aovtVar, java.lang.Runnable runnable) {
        this.a = aovtVar;
        this.b = runnable;
    }

    public final void fz() {
        this.a.a.removeCallbacks(this.b);
    }
}
