package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ante extends defpackage.antg {
    public static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.ante.class.getName());
    private final defpackage.aocd d;

    public ante(android.os.IBinder iBinder, java.util.concurrent.Executor executor) {
        super(iBinder);
        this.d = new defpackage.aocd(executor);
    }

    public final void a(int i, defpackage.antl antlVar) {
        this.d.execute(new mo(this, i, antlVar.a(), 18));
        antlVar.b();
    }
}
