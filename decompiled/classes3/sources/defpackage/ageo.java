package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ageo {
    private final defpackage.ager a;
    private final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());

    public ageo(defpackage.ager agerVar) {
        this.a = agerVar;
    }

    public final aaum a(android.app.Activity activity, com.google.android.play.core.review.ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return aazc.s((java.lang.Object) null);
        }
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.google.android.play.core.common.PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        final zzx zzxVar = new zzx((char[]) null);
        final android.os.Handler handler = this.b;
        intent.putExtra("result_receiver", new android.os.ResultReceiver(this, handler) { // from class: com.google.android.play.core.review.ReviewManagerImpl$1
            {
                j$.util.Objects.requireNonNull(this);
            }

            @Override // android.os.ResultReceiver
            public final void onReceiveResult(int i, android.os.Bundle bundle) {
                zzxVar.i((java.lang.Object) null);
            }
        });
        activity.startActivity(intent);
        return (aaum) zzxVar.a;
    }

    public final aaum b() {
        java.lang.Object objR;
        xtq xtqVar = defpackage.ager.c;
        defpackage.ager agerVar = this.a;
        xtqVar.E("requestInAppReview (%s)", new java.lang.Object[]{agerVar.b});
        if (agerVar.a == null) {
            java.lang.Object[] objArr = new java.lang.Object[0];
            if (android.util.Log.isLoggable("PlayCore", 6)) {
                android.util.Log.e("PlayCore", xtq.C((java.lang.String) xtqVar.a, "Play Store app is either not installed or not the official version", objArr));
            }
            objR = aazc.r(new defpackage.agen());
        } else {
            zzx zzxVar = new zzx((char[]) null);
            defpackage.agfc agfcVar = agerVar.a;
            defpackage.agep agepVar = new defpackage.agep(agerVar, zzxVar, zzxVar);
            agfcVar.c(new defpackage.agex(agfcVar, agepVar.c, zzxVar, agepVar));
            objR = zzxVar.a;
        }
        return (aaum) objR;
    }
}
