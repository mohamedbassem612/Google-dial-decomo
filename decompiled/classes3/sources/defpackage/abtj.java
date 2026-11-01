package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abtj {
    public static final /* synthetic */ int a = 0;
    private static final java.lang.String[] b = {"COLLECTION_BASIS_VERIFIER"};
    private static boolean c = false;
    private static final java.lang.Object d = new java.lang.Object();

    public static void a(absq absqVar, defpackage.amdx amdxVar) {
        android.content.Context context = absqVar.a;
        if (c) {
            return;
        }
        synchronized (d) {
            if (!c) {
                c = true;
                aewq.d(context);
                aexb.f(context);
                if (!abts.n(context)) {
                    if (defpackage.anea.a.eZ().f() && !aaco.a(context).b(context.getPackageName())) {
                        android.util.Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                        return;
                    }
                    b(absqVar, amdxVar);
                }
            }
        }
    }

    private static void b(absq absqVar, defpackage.amdx amdxVar) {
        acxg acxgVar = aasr.a;
        android.content.Context context = absqVar.a;
        final aata aataVar = new aata(context);
        final java.lang.String strConcat = "com.google.android.libraries.consentverifier#".concat(java.lang.String.valueOf(context.getPackageName()));
        aaum aaumVarN = aataVar.n(strConcat, amdxVar.i(context), b, (byte[]) null);
        final java.util.concurrent.Executor executorA = abts.a(absqVar);
        try {
            aaumVarN.p(executorA, new aaui() { // from class: abti
                public final void d(java.lang.Object obj) {
                    int i = defpackage.abtj.a;
                    aata aataVar2 = aataVar;
                    java.lang.String str = strConcat;
                    aataVar2.q(str).o(executorA, new defpackage.rix(str, 8));
                }
            });
            aaumVarN.o(executorA, new defpackage.rix(strConcat, 7));
        } catch (java.util.concurrent.RejectedExecutionException e) {
            android.util.Log.w("CBVerifier", java.lang.String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
