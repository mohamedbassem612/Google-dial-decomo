package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anxj implements defpackage.aode {
    @Override // defpackage.aode
    public final /* bridge */ /* synthetic */ java.lang.Object a() {
        return java.util.concurrent.Executors.newCachedThreadPool(defpackage.anxo.j("grpc-default-executor-%d"));
    }

    @Override // defpackage.aode
    public final /* bridge */ /* synthetic */ void b(java.lang.Object obj) {
        ((java.util.concurrent.ExecutorService) obj).shutdown();
    }

    public final java.lang.String toString() {
        return "grpc-default-executor";
    }
}
