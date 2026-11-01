package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afiq {
    private static defpackage.afiq e;
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;

    public afiq(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.d = new defpackage.aabg(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized defpackage.afiq c(android.content.Context context) {
        defpackage.afiq afiqVar;
        afiqVar = e;
        if (afiqVar == null) {
            aazc aazcVar = aang.a;
            afiqVar = new defpackage.afiq(context, java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new aaiv("MessengerIpcClient"))));
            e = afiqVar;
        }
        return afiqVar;
    }

    private final synchronized int d() {
        int i;
        i = this.a;
        this.a = i + 1;
        return i;
    }

    private final synchronized aaum e(defpackage.aabi aabiVar) {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Queueing ".concat(aabiVar.toString()));
        }
        if (!((defpackage.aabg) this.d).e(aabiVar)) {
            defpackage.aabg aabgVar = new defpackage.aabg(this);
            this.d = aabgVar;
            aabgVar.e(aabiVar);
        }
        return (aaum) aabiVar.d.a;
    }

    public final aaum a(int i, android.os.Bundle bundle) {
        return e(new defpackage.aabh(d(), i, bundle));
    }

    public final aaum b(int i, android.os.Bundle bundle) {
        return e(new defpackage.aabk(d(), i, bundle));
    }

    public afiq(java.lang.String str, afio... afioVarArr) {
        this.b = str;
        this.c = afioVarArr;
    }
}
