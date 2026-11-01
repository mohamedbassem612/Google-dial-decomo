package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class okd {
    final /* synthetic */ com.android.dialer.externals.androidapis.telecom.callscreeningservice.DialerCallScreeningService a;

    public okd(com.android.dialer.externals.androidapis.telecom.callscreeningservice.DialerCallScreeningService dialerCallScreeningService) {
        this.a = dialerCallScreeningService;
    }

    public final void a(android.telecom.Call.Details details, android.telecom.CallScreeningService.CallResponse callResponse) {
        aooh.f(details, "callDetails");
        aooh.f(callResponse, "response");
        this.a.respondToCall(details, callResponse);
    }
}
