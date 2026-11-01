package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agto implements ajcb {
    final /* synthetic */ com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture a;

    public agto(com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture) {
        j$.util.Objects.requireNonNull(parcelableFuture);
        this.a = parcelableFuture;
    }

    public final void a(java.lang.Throwable th) {
        this.a.b(th);
    }

    public final void b(java.lang.Object obj) {
        com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture parcelableFuture = this.a;
        parcelableFuture.e = obj;
        parcelableFuture.b = true;
        parcelableFuture.a();
    }
}
