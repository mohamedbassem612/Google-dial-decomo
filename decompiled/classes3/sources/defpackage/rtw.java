package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rtw implements rtt {
    public final android.content.Context a;
    private final aoir b;

    public rtw(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
        this.b = aooc.ag(new defpackage.pqf(this, 8));
    }

    private final android.app.MemoryBudgetManager d() {
        return (android.app.MemoryBudgetManager) this.b.a();
    }

    public final void a(final aonj aonjVar) {
        android.app.MemoryBudgetManager memoryBudgetManagerD = d();
        if (memoryBudgetManagerD != null) {
            memoryBudgetManagerD.registerProcessOverBudgetListener(android.os.Looper.getMainLooper(), new android.app.MemoryBudgetManager.OnOverBudgetListener() { // from class: rtv
                public final void onOverBudget(long j) {
                    aonjVar.a(java.lang.Long.valueOf(j));
                }
            });
        }
    }

    public final void b(long j) {
        android.app.MemoryBudgetManager memoryBudgetManagerD = d();
        if (memoryBudgetManagerD != null) {
            memoryBudgetManagerD.setPackageBudgetBytes(j);
        }
    }

    public final void c(long j) {
        android.app.MemoryBudgetManager memoryBudgetManagerD = d();
        if (memoryBudgetManagerD != null) {
            memoryBudgetManagerD.setProcessBudgetBytes(j);
        }
    }
}
