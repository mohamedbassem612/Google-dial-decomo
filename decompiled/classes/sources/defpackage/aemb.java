package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aemb implements defpackage.aelx {
    public static final java.lang.String[] a;
    public final android.content.Context b;
    public final defpackage.ajct c;

    static {
        int i = defpackage.aayl.a;
        a = new java.lang.String[]{"service_googleone"};
    }

    public aemb(android.content.Context context, java.util.concurrent.ExecutorService executorService) {
        this.b = context;
        this.c = defpackage.aiql.r(executorService);
    }

    @Override // defpackage.aelx
    public final defpackage.ajcq a() {
        return defpackage.ahvr.F(new java.util.concurrent.Callable() { // from class: aema
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.String str = defpackage.zwk.a;
                return java.util.Arrays.asList(defpackage.zwq.h(this.a.b));
            }
        }, this.c);
    }
}
