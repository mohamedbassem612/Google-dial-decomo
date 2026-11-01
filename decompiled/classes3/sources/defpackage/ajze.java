package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajze implements java.lang.Runnable {
    final /* synthetic */ ajdd a;
    final /* synthetic */ org.chromium.net.UrlRequest b;

    public ajze(ajzh ajzhVar, ajdd ajddVar, org.chromium.net.UrlRequest urlRequest) {
        this.a = ajddVar;
        this.b = urlRequest;
        j$.util.Objects.requireNonNull(ajzhVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        aiof aiofVar = ajzh.a;
        ajdd ajddVar = this.a;
        ajddVar.isCancelled();
        if (ajddVar.isCancelled()) {
            this.b.cancel();
        }
    }
}
