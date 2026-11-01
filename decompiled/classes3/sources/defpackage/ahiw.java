package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class ahiw implements ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ahiw(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object eZ() {
        switch (this.$cid) {
            case 0:
                afim afimVarC = ((afit) ((apdi) this.a).d).c("/client_streamz/tiktok/processreaper/skip/time_since_eligibility", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("skip_reason", java.lang.String.class)});
                afimVarC.c();
                return afimVarC;
            case 1:
                afim afimVarC2 = ((afit) ((apdi) this.a).d).c("/client_streamz/tiktok/processreaper/success/process_age", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("strategy", java.lang.String.class)});
                afimVarC2.c();
                return afimVarC2;
            case 2:
                afim afimVarC3 = ((defpackage.ahix) this.a).a.c("/client_streamz/tiktok/grpc/global/duration", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("status", java.lang.Integer.class), new afio("is_force_refresh", java.lang.Boolean.class), new afio("is_remote_unauthenticated", java.lang.Boolean.class)});
                afimVarC3.c();
                return afimVarC3;
            case 3:
                afip afipVarE = ((defpackage.ahix) this.a).a.e("/client_streamz/tiktok/grpc/auth/unauthenticated_method", new afio[]{new afio("method", java.lang.String.class), new afio("is_remote_unauthenticated", java.lang.Boolean.class)});
                afipVarE.c();
                return afipVarE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                afip afipVarE2 = ((defpackage.ahix) this.a).a.e("/client_streamz/tiktok/grpc/global/transport", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("transport_type", java.lang.String.class), new afio("status", java.lang.String.class)});
                afipVarE2.c();
                return afipVarE2;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                afip afipVarE3 = ((defpackage.ahix) this.a).a.e("/client_streamz/tiktok/grpc/auth/refresh", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("status", java.lang.String.class)});
                afipVarE3.c();
                return afipVarE3;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                afip afipVarE4 = ((defpackage.ahix) this.a).a.e("/client_streamz/tiktok/grpc/auth/expiry_null", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class)});
                afipVarE4.c();
                return afipVarE4;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                afim afimVarC4 = ((defpackage.ahix) this.a).a.c("/client_streamz/tiktok/grpc/auth/get_token_duration", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class)});
                afimVarC4.c();
                return afimVarC4;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                afip afipVarE5 = ((afit) ((defpackage.ahiy) this.a).a).e("/client_streamz/tiktok/sync/synclet/count", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("synclet_key_name", java.lang.String.class), new afio("status", java.lang.String.class)});
                afipVarE5.c();
                return afipVarE5;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                afim afimVarC5 = ((afit) ((defpackage.ahiy) this.a).a).c("/client_streamz/tiktok/sync/synclet/duration", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("synclet_key_name", java.lang.String.class), new afio("status", java.lang.String.class)});
                afimVarC5.c();
                return afimVarC5;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                afim afimVarC6 = ((afit) ((defpackage.ahiy) this.a).a).c("/client_streamz/tiktok/sync/synclet/observed_interval", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("synclet_key_name", java.lang.String.class)});
                afimVarC6.c();
                return afimVarC6;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                afim afimVarC7 = ((afit) ((defpackage.ahiy) this.a).a).c("/client_streamz/tiktok/sync/synclet/configured_interval", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("synclet_key_name", java.lang.String.class)});
                afimVarC7.c();
                return afimVarC7;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                afip afipVarE6 = ((afit) ((defpackage.ahiy) this.a).a).e("/client_streamz/tiktok/sync/system/count", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("invocation_type", java.lang.String.class)});
                afipVarE6.c();
                return afipVarE6;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                afim afimVarC8 = ((afit) ((defpackage.ahiy) this.a).a).c("/client_streamz/tiktok/sync/worker/configured_wakeup_delay", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("worker_type", java.lang.String.class), new afio("constraints", java.lang.String.class)});
                afimVarC8.c();
                return afimVarC8;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                afim afimVarC9 = ((afit) ((defpackage.ahiy) this.a).a).c("/client_streamz/tiktok/sync/worker/actual_wakeup_delay", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("worker_type", java.lang.String.class), new afio("constraints", java.lang.String.class)});
                afimVarC9.c();
                return afimVarC9;
            case 15:
                afip afipVarE7 = ((afit) ((defpackage.aljf) this.a).d).e("/client_streamz/tiktok/work/worker/count", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("worker_permanent_tag", java.lang.String.class), new afio("status", java.lang.String.class)});
                afipVarE7.c();
                return afipVarE7;
            case 16:
                afim afimVarC10 = ((afit) ((defpackage.aljf) this.a).d).c("/client_streamz/tiktok/work/worker/duration", new afio[]{new afio("app_package", java.lang.String.class), new afio("process_name", java.lang.String.class), new afio("worker_permanent_tag", java.lang.String.class), new afio("status", java.lang.String.class)});
                afimVarC10.c();
                return afimVarC10;
            case 17:
                return new defpackage.ahsg((ahpz) this.a);
            case 18:
                aihd aihdVar = akwz.a;
                akxv akxvVar = ((akxt) this.a).c;
                if (akxvVar == null) {
                    akxvVar = akxv.a;
                }
                return aify.n(akxvVar.d);
            default:
                aihd aihdVar2 = akwz.a;
                return aify.p(java.lang.Integer.valueOf(((alfr) this.a).j));
        }
    }
}
