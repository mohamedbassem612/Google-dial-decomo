package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aaho {
    private static defpackage.aaho b;
    private static final com.google.android.gms.common.internal.RootTelemetryConfiguration c = new com.google.android.gms.common.internal.RootTelemetryConfiguration(0, false, false, 0, 0);
    public com.google.android.gms.common.internal.RootTelemetryConfiguration a;

    public static synchronized defpackage.aaho a() {
        defpackage.aaho aahoVar;
        aahoVar = b;
        if (aahoVar == null) {
            aahoVar = new defpackage.aaho();
            b = aahoVar;
        }
        return aahoVar;
    }

    public final synchronized void b(com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration) {
        try {
            if (rootTelemetryConfiguration == null) {
                rootTelemetryConfiguration = c;
            } else {
                com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration2 = this.a;
                if (rootTelemetryConfiguration2 != null) {
                    if (rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                    }
                }
            }
            this.a = rootTelemetryConfiguration;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
