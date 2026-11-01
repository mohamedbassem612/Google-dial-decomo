package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ktv implements defpackage.ktw {
    private static final aimz a = aimz.i("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor");
    private final android.content.Context b;
    private final android.content.Intent c;
    private final zzd d;
    private final zdi e;

    public ktv(android.content.Context context, android.content.Intent intent, zzd zzdVar, zdi zdiVar) {
        this.b = context;
        this.c = intent;
        this.d = zzdVar;
        this.e = zdiVar;
    }

    private static java.lang.String d(android.content.Intent intent) {
        return intent.getBundleExtra("call_info_bundle").getString("com.google.android.ims.client_call_id", "");
    }

    private final void e(zhw zhwVar) {
        if (d(this.c).isEmpty()) {
            return;
        }
        akzx akzxVarM = zhv.a.m();
        akzxVarM.u();
        zhv zhvVar = akzxVarM.b;
        zhvVar.b |= 1;
        zhvVar.c = 21L;
        akzxVarM.u();
        zhv zhvVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(zhwVar);
        zhvVar2.d = zhwVar;
        zhvVar2.b |= 16384;
        this.e.d(this.d.h(akzxVarM.p(), abtl.b(this.b, new apeb())));
        a.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "logCallQualityRatingFeedbackEvent", 135, "LoggingConnectivityMonitor.java").v("Sent feedback.");
    }

    private static java.lang.String f(akzx akzxVar) {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FeedbackEvent {clientCallId:");
        sb.append(akzxVar.b.c);
        sb.append(", callRating:");
        int iAQ = a.aQ(akzxVar.b.d);
        if (iAQ == 0 || iAQ == 1) {
            str = "UNKNOWN_RATING";
        } else {
            str = iAQ != 2 ? "RATING_HIGH" : "RATING_LOW";
        }
        sb.append(str);
        sb.append(", audioIssue:");
        int iY = a.Y(akzxVar.b.e);
        sb.append(wsc.m(iY != 0 ? iY : 1));
        sb.append(", isUnsubscribed:");
        sb.append(akzxVar.b.f);
        sb.append(", }");
        return sb.toString();
    }

    @Override // defpackage.ktw
    public final void a() {
        akzx akzxVarM = zhw.a.m();
        java.lang.String strD = d(this.c);
        akzxVarM.u();
        zhw zhwVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        zhwVar.b |= 1;
        zhwVar.c = strD;
        akzxVarM.u();
        zhw zhwVar2 = akzxVarM.b;
        zhwVar2.d = 2;
        zhwVar2.b |= 2;
        a.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "sendGoodCallRatingsEvent", 115, "LoggingConnectivityMonitor.java").y("Good rating selected: %s", f(akzxVarM));
        e((zhw) akzxVarM.p());
    }

    @Override // defpackage.ktw
    public final void b(java.lang.String str, android.content.res.Resources resources) {
        akzx akzxVarM = zhw.a.m();
        android.content.Intent intent = this.c;
        java.lang.String strD = d(intent);
        akzxVarM.u();
        zhw zhwVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        zhwVar.b |= 1;
        zhwVar.c = strD;
        akzxVarM.u();
        zhw zhwVar2 = akzxVarM.b;
        zhwVar2.d = 1;
        int i = 2;
        zhwVar2.b |= 2;
        if (!str.contentEquals(resources.getText(2132018690))) {
            if (str.contentEquals(resources.getText(2132018692))) {
                i = 3;
            } else if (str.contentEquals(resources.getText(2132018691))) {
                i = 4;
            } else if (str.contentEquals(resources.getText(2132018689))) {
                i = 6;
            } else if (str.contentEquals(resources.getText(2132018687))) {
                i = 5;
            } else {
                i = str.contentEquals(resources.getText(2132018698)) ? 7 : 1;
            }
        }
        akzxVarM.u();
        zhw zhwVar3 = akzxVarM.b;
        zhwVar3.e = i - 1;
        zhwVar3.b |= 4;
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "sendIssueSelectedEvent", 95, "LoggingConnectivityMonitor.java").y("Issue selected: %s", f(akzxVarM));
        e((zhw) akzxVarM.p());
        if (intent.getBundleExtra("call_info_bundle").getBoolean("com.google.android.ims.bad_call_quality", false)) {
            aimzVar.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "sendIssueSelectedEvent", 103, "LoggingConnectivityMonitor.java").v("ConnectivityMonitor detected voice quality as bad.");
            return;
        }
        aimzVar.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "sendIssueSelectedEvent", 105, "LoggingConnectivityMonitor.java").v("ConnectivityMonitor detected voice quality good,user feedback is bad");
        if (i != 1) {
            aimzVar.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "requestConnectivityMonitorBugreport", 143, "LoggingConnectivityMonitor.java").v("Sending bugreport");
            android.content.Intent intent2 = new android.content.Intent("com.android.dialer.feedback.impl.ACTION_BAD_QUALITY_RESPONSE");
            intent2.setClassName("com.google.android.apps.scone", "com.google.android.apps.scone.connectivitymonitor.CMBroadCastReceiver");
            intent2.putExtra("audio_issue", wsc.m(i));
            this.b.sendBroadcast(intent2);
        }
    }

    @Override // defpackage.ktw
    public final void c() {
        akzx akzxVarM = zhw.a.m();
        java.lang.String strD = d(this.c);
        akzxVarM.u();
        zhw zhwVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strD);
        zhwVar.b |= 1;
        zhwVar.c = strD;
        akzxVarM.u();
        zhw zhwVar2 = akzxVarM.b;
        zhwVar2.b |= 8;
        zhwVar2.f = true;
        a.b().l("com/android/dialer/callqualityrating/impl/LoggingConnectivityMonitor", "sendUnsubscribeEvent", 66, "LoggingConnectivityMonitor.java").y("User unsubscribed: %s", f(akzxVarM));
        e((zhw) akzxVarM.p());
    }
}
