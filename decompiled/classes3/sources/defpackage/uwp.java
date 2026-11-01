package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uwp {
    public static final aimz a = aimz.i("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger");
    public final java.util.Map b = new aca();
    public final rlv c;
    private final java.util.concurrent.Executor d;
    private final ajct e;

    public uwp(ajct ajctVar, rlv rlvVar) {
        this.e = ajctVar;
        this.d = new ajdc(ajctVar);
        this.c = rlvVar;
    }

    public final void a(java.lang.String str) {
        ahvr.J(ahvr.F(new defpackage.uwl(this, str, 0), this.d), new defpackage.uwo(this, 0), this.e);
    }

    public final void b(final java.lang.String str, final java.util.function.Consumer consumer) {
        ahvr.J(ahvr.E(new java.lang.Runnable() { // from class: uwn
            @Override // java.lang.Runnable
            public final void run() {
                java.util.Map map = this.a.b;
                java.lang.String str2 = str;
                akzx akzxVar = (akzx) map.get(str2);
                java.util.function.Consumer consumer2 = consumer;
                if (akzxVar != null) {
                    aa$.ExternalSyntheticApiModelOutline1.m(consumer2, akzxVar);
                    return;
                }
                akzx akzxVarM = amry.a.m();
                akzxVarM.u();
                amry amryVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str2);
                amryVar.b |= 1;
                amryVar.c = str2;
                aa$.ExternalSyntheticApiModelOutline1.m(consumer2, akzxVarM);
                map.put(str2, akzxVarM);
            }
        }, this.d), new jya(this, 12), this.e);
    }

    public final void c(java.lang.String str, int i) {
        java.lang.String str2;
        aimw aimwVarL = a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logOrigin", 59, "FeedbackMetricsLogger.java");
        if (i == 2) {
            str2 = "NOTIFICATION";
        } else if (i == 3) {
            str2 = "CALL_LOG";
        } else if (i == 4) {
            str2 = "VIEW_TRANSCRIPT_CALL_LOG";
        } else if (i != 5) {
            str2 = i != 6 ? "VOICEMAIL" : "REPORT_SPAM";
        } else {
            str2 = "VIEW_TRANSCRIPT_CALL_DETAILS";
        }
        aimwVarL.y("logging feedback origin: %s", str2);
        b(str, new defpackage.tbn(i, 2));
    }
}
