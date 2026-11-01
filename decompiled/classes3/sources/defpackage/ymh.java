package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ymh {
    public final android.content.Context a;
    public final java.util.concurrent.ExecutorService b;
    public final java.util.concurrent.Executor c;
    public final boolean d;
    public final j$.time.Duration e;
    public final java.util.concurrent.ScheduledExecutorService f;
    public final j$.util.Optional g;

    public ymh(android.content.Context context, java.util.concurrent.ExecutorService executorService, java.util.concurrent.Executor executor, boolean z, j$.time.Duration duration, java.util.concurrent.ScheduledExecutorService scheduledExecutorService, j$.util.Optional optional) {
        this.a = context;
        this.b = executorService;
        this.c = executor;
        this.d = z;
        this.e = duration;
        this.f = scheduledExecutorService;
        this.g = optional;
    }

    public static defpackage.ymf a(android.content.Context context) {
        defpackage.ymf ymfVar = new defpackage.ymf();
        if (context == null) {
            throw new java.lang.NullPointerException("Null context");
        }
        ymfVar.a = context;
        defpackage.ymg ymgVar = defpackage.ymg.a;
        if (ymgVar == null) {
            throw new java.lang.NullPointerException("Null callbackExecutor");
        }
        ymfVar.b = ymgVar;
        ymfVar.c = true;
        ymfVar.f = (byte) 1;
        j$.time.Duration duration = j$.time.Duration.ZERO;
        if (duration == null) {
            throw new java.lang.NullPointerException("Null autoUnbindTimeoutMs");
        }
        ymfVar.d = duration;
        j$.util.Optional optionalEmpty = j$.util.Optional.empty();
        if (optionalEmpty == null) {
            throw new java.lang.NullPointerException("Null autoDownloadEnabled");
        }
        ymfVar.e = optionalEmpty;
        return ymfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ymh) {
            defpackage.ymh ymhVar = (defpackage.ymh) obj;
            if (this.a.equals(ymhVar.a) && this.b.equals(ymhVar.b) && this.c.equals(ymhVar.c) && this.d == ymhVar.d && this.e.equals(ymhVar.e) && this.f.equals(ymhVar.f) && this.g.equals(ymhVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.g;
        java.util.concurrent.ScheduledExecutorService scheduledExecutorService = this.f;
        j$.time.Duration duration = this.e;
        java.util.concurrent.Executor executor = this.c;
        java.util.concurrent.ExecutorService executorService = this.b;
        return "AiCoreClientOptions{context=" + java.lang.String.valueOf(this.a) + ", workerExecutor=" + java.lang.String.valueOf(executorService) + ", callbackExecutor=" + java.lang.String.valueOf(executor) + ", bindImportantEnabled=" + this.d + ", autoUnbindTimeoutMs=" + java.lang.String.valueOf(duration) + ", autoUnbindScheduledExecutor=" + java.lang.String.valueOf(scheduledExecutorService) + ", autoDownloadEnabled=" + java.lang.String.valueOf(optional) + '}';
    }

    public ymh() {
        throw null;
    }
}
