package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rxq {
    private static final aihd b = new aile("com.google.android.contacts");
    public final defpackage.akck a;

    public rxq(defpackage.akck akckVar, android.content.Context context, java.util.concurrent.Executor executor) {
        aooh.f(context, "appContext");
        aooh.f(executor, "backgroundExecutor");
        this.a = akckVar;
        anrm anrmVarZ = ajsz.Z(context, b, executor);
        java.util.HashMap map = new java.util.HashMap();
        map.put("com.google.android.libraries.dialer.patrick.account.CallingCardAccountGrpcService", anrmVarZ);
        akckVar.b(anty.aT(map), anrq.a);
    }
}
