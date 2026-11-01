package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aagr implements java.util.concurrent.Executor {
    public static android.content.Context a;
    private static volatile defpackage.aagr b;

    private aagr() {
    }

    public static defpackage.aagr a(android.content.Context context) {
        defpackage.aagr aagrVar = b;
        if (aagrVar == null) {
            synchronized (defpackage.aagr.class) {
                aagrVar = b;
                if (aagrVar == null) {
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        throw new java.lang.NullPointerException("null reference");
                    }
                    a = applicationContext;
                    defpackage.aagr aagrVar2 = new defpackage.aagr();
                    b = aagrVar2;
                    aagrVar = aagrVar2;
                }
            }
        }
        return aagrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        defpackage.aagq.a.post(runnable);
    }
}
