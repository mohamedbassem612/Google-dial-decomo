package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahkx {
    public defpackage.ahkz a;
    private long b = -1;

    public final defpackage.ahky a() {
        return new defpackage.ahky(this.a, this.b);
    }

    public final void b(long j, java.util.concurrent.TimeUnit timeUnit) {
        this.b = java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
