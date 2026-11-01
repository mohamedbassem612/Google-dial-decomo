package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class anth {
    public static final defpackage.aooc c = new defpackage.aooc();

    public static defpackage.anth e(android.os.IBinder iBinder, java.util.concurrent.Executor executor) {
        return iBinder instanceof android.os.Binder ? new ante(iBinder, executor) : new antf(iBinder);
    }

    public abstract void a(int i, antl antlVar);

    public abstract void c(android.os.IBinder.DeathRecipient deathRecipient);

    public abstract void d(android.os.IBinder.DeathRecipient deathRecipient);
}
