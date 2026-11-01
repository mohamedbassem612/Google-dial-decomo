package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqz {
    private static final defpackage.aera c = new defpackage.aera(-1, -1);
    public final defpackage.aera a;
    public defpackage.aera b;

    public aeqz() {
        this.b = c;
        this.a = new defpackage.aera(android.os.SystemClock.elapsedRealtime(), j$.time.Duration.ofMillis(android.os.SystemClock.uptimeMillis()).toMillis());
    }

    public aeqz(defpackage.aera aeraVar, defpackage.aera aeraVar2) {
        this.a = aeraVar;
        this.b = aeraVar2;
    }
}
