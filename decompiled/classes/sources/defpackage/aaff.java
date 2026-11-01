package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aaff implements defpackage.aaug {
    private final defpackage.aaet a;
    private final int b;
    private final defpackage.aadx c;
    private final long d;
    private final long e;

    public aaff(defpackage.aaet aaetVar, int i, defpackage.aadx aadxVar, long j, long j2) {
        this.a = aaetVar;
        this.b = i;
        this.c = aadxVar;
        this.d = j;
        this.e = j2;
    }

    public static com.google.android.gms.common.internal.ConnectionTelemetryConfiguration b(defpackage.aaeo aaeoVar, defpackage.aagf aagfVar, int i) {
        com.google.android.gms.common.internal.ConnectionInfo connectionInfo = aagfVar.m;
        com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b) {
            return null;
        }
        int[] iArr = connectionTelemetryConfiguration.d;
        if (iArr == null) {
            int[] iArr2 = connectionTelemetryConfiguration.f;
            if (iArr2 != null && defpackage.aehj.bR(iArr2, i)) {
                return null;
            }
        } else if (!defpackage.aehj.bR(iArr, i)) {
            return null;
        }
        if (aaeoVar.k < connectionTelemetryConfiguration.e) {
            return connectionTelemetryConfiguration;
        }
        return null;
    }

    @Override // defpackage.aaug
    public final void a(defpackage.aaum aaumVar) {
        defpackage.aaeo aaeoVarB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        defpackage.aaet aaetVar = this.a;
        if (aaetVar.g()) {
            com.google.android.gms.common.internal.RootTelemetryConfiguration rootTelemetryConfiguration = defpackage.aaho.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (aaeoVarB = aaetVar.b(this.c)) != null) {
                java.lang.Object obj = aaeoVarB.b;
                if (obj instanceof defpackage.aagf) {
                    defpackage.aagf aagfVar = (defpackage.aagf) obj;
                    long j3 = this.d;
                    int i6 = 0;
                    boolean z = j3 > 0;
                    int i7 = aagfVar.i;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        boolean zH = aagfVar.H();
                        i = rootTelemetryConfiguration.d;
                        i3 = rootTelemetryConfiguration.e;
                        i2 = rootTelemetryConfiguration.a;
                        if (zH && !aagfVar.p()) {
                            com.google.android.gms.common.internal.ConnectionTelemetryConfiguration connectionTelemetryConfigurationB = b(aaeoVarB, aagfVar, this.b);
                            if (connectionTelemetryConfigurationB == null) {
                                return;
                            }
                            boolean z2 = connectionTelemetryConfigurationB.c && j3 > 0;
                            i3 = connectionTelemetryConfigurationB.e;
                            z = z2;
                        }
                    } else {
                        i = 5000;
                        i2 = 0;
                        i3 = 100;
                    }
                    int iElapsedRealtime = -1;
                    if (aaumVar.k()) {
                        i5 = 0;
                    } else if (((defpackage.aauq) aaumVar).c) {
                        i6 = -1;
                        i5 = 100;
                    } else {
                        java.lang.Exception excF = aaumVar.f();
                        if (excF instanceof defpackage.aacw) {
                            com.google.android.gms.common.api.Status status = ((defpackage.aacw) excF).a;
                            i4 = status.f;
                            com.google.android.gms.common.ConnectionResult connectionResult = status.i;
                            if (connectionResult != null) {
                                i5 = i4;
                                i6 = connectionResult.c;
                            }
                        } else {
                            i4 = 101;
                        }
                        i5 = i4;
                        i6 = -1;
                    }
                    if (z) {
                        long j4 = this.e;
                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                        iElapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j4);
                        j = j3;
                        j2 = jCurrentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    int i8 = iElapsedRealtime;
                    android.os.Handler handler = aaetVar.r;
                    handler.sendMessage(handler.obtainMessage(18, new aafg(new com.google.android.gms.common.internal.MethodInvocation(this.b, i5, i6, j, j2, (java.lang.String) null, (java.lang.String) null, i7, i8), i2, i, i3)));
                }
            }
        }
    }
}
