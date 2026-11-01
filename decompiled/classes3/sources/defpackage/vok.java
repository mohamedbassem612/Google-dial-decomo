package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vok {
    public int a;
    public int b;

    private final int e() {
        if (this.a == 0) {
            return 0;
        }
        return ((int) android.os.SystemClock.elapsedRealtime()) - this.a;
    }

    public final int a() {
        return this.b + e();
    }

    public final void b() {
        this.a = 0;
        this.b = 0;
    }

    public final void c() {
        this.a = (int) android.os.SystemClock.elapsedRealtime();
    }

    public final void d() {
        this.b += e();
        this.a = 0;
    }
}
