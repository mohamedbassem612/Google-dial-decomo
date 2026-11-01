package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqk extends defpackage.aiqg {
    public static final defpackage.aiqk a = new defpackage.aiqk();

    @Override // defpackage.aiqg
    public final long a() {
        return java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(java.lang.System.currentTimeMillis());
    }

    public final java.lang.String toString() {
        return "Default millisecond precision clock";
    }
}
