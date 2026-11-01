package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeey {
    private final defpackage.ahzi A;
    private final defpackage.ahzi B;
    private final defpackage.ahzi C;
    private final defpackage.ahzi D;
    private final defpackage.ahzi E;
    private final defpackage.ahzi F;
    public final defpackage.afit a;
    public final defpackage.ahzi b;
    public final defpackage.ahzi c;
    public final defpackage.ahzi d;
    public final defpackage.ahzi e;
    public final defpackage.ahzi f;
    public final defpackage.ahzi g;
    public final defpackage.ahzi h;
    public final defpackage.ahzi i;
    public final defpackage.ahzi j;
    public final defpackage.ahzi k;
    public final defpackage.ahzi l;
    public final defpackage.ahzi m;
    public final defpackage.ahzi n;
    public final defpackage.ahzi o;
    public final defpackage.ahzi p;
    public final defpackage.ahzi q;
    private final defpackage.afis r;
    private final defpackage.ahzi s = defpackage.ahvr.bI(new defpackage.adfi(this, 5));
    private final defpackage.ahzi t = defpackage.ahvr.bI(new defpackage.adfi(this, 7));
    private final defpackage.ahzi u;
    private final defpackage.ahzi v;
    private final defpackage.ahzi w;
    private final defpackage.ahzi x;
    private final defpackage.ahzi y;
    private final defpackage.ahzi z;

    public aeey(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, defpackage.ajxw ajxwVar, android.app.Application application) {
        final int i = 19;
        this.b = defpackage.ahvr.bI(new defpackage.adfi(this, i));
        final int i2 = 10;
        this.c = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i2) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i3 = 11;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i3) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i4 = 12;
        this.d = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i4) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i5 = 13;
        this.e = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i5) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i6 = 14;
        this.f = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i6) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i7 = 15;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i7) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i8 = 16;
        this.u = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i8) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        this.v = defpackage.ahvr.bI(new defpackage.adfi(this, i8));
        final int i9 = 6;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i9) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i10 = 17;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i10) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i11 = 18;
        this.g = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i11) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i12 = 20;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i12) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i13 = 1;
        this.h = defpackage.ahvr.bI(new defpackage.aeex(this, i13));
        final int i14 = 0;
        this.w = defpackage.ahvr.bI(new defpackage.aeex(this, i14));
        final int i15 = 2;
        this.i = defpackage.ahvr.bI(new defpackage.aeex(this, i15));
        this.j = defpackage.ahvr.bI(new defpackage.adfi(this, i9));
        this.x = defpackage.ahvr.bI(new defpackage.adfi(this, 8));
        final int i16 = 9;
        this.k = defpackage.ahvr.bI(new defpackage.adfi(this, i16));
        this.l = defpackage.ahvr.bI(new defpackage.adfi(this, i2));
        this.m = defpackage.ahvr.bI(new defpackage.adfi(this, i3));
        this.n = defpackage.ahvr.bI(new defpackage.adfi(this, i4));
        this.o = defpackage.ahvr.bI(new defpackage.adfi(this, i5));
        this.y = defpackage.ahvr.bI(new defpackage.adfi(this, i6));
        this.z = defpackage.ahvr.bI(new defpackage.adfi(this, i7));
        this.p = defpackage.ahvr.bI(new defpackage.adfi(this, i10));
        defpackage.ahvr.bI(new defpackage.adfi(this, i11));
        this.A = defpackage.ahvr.bI(new defpackage.adfi(this, i12));
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i13) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        this.q = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i14) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        this.B = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i15) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i17 = 3;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i17) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i18 = 4;
        defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i18) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i19 = 5;
        this.C = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i19) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i20 = 7;
        this.D = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i20) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        final int i21 = 8;
        this.E = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i21) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        this.F = defpackage.ahvr.bI(new defpackage.ahzi(this) { // from class: aeew
            public final /* synthetic */ defpackage.aeey a;

            {
                this.a = this;
            }

            @Override // defpackage.ahzi
            public final java.lang.Object eZ() {
                switch (i16) {
                    case 0:
                        defpackage.afip afipVarE = this.a.a.e("/client_streamz/gnp_android/growthkit_account_settings_intent_count", new defpackage.afio("app_package_name", java.lang.String.class));
                        afipVarE.c();
                        return afipVarE;
                    case 1:
                        defpackage.afip afipVarE2 = this.a.a.e("/client_streamz/gnp_android/system_tray/notification_post_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_summary_notification", java.lang.Boolean.class), new defpackage.afio("exceed_post_threshold", java.lang.Boolean.class));
                        afipVarE2.c();
                        return afipVarE2;
                    case 2:
                        defpackage.afip afipVarE3 = this.a.a.e("/client_streamz/gnp_android/storage/database_migration", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE3.c();
                        return afipVarE3;
                    case 3:
                        defpackage.afip afipVarE4 = this.a.a.e("/client_streamz/gnp_android/media/image_download_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("is_success", java.lang.Boolean.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE4.c();
                        return afipVarE4;
                    case 4:
                        defpackage.afip afipVarE5 = this.a.a.e("/client_streamz/gnp_android/media/image_download_dedup_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("uri_type", java.lang.String.class), new defpackage.afio("image_source", java.lang.String.class), new defpackage.afio("asset_type", java.lang.String.class));
                        afipVarE5.c();
                        return afipVarE5;
                    case 5:
                        defpackage.afip afipVarE6 = this.a.a.e("/client_streamz/gnp_android/auth/get_spatula_header_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE6.c();
                        return afipVarE6;
                    case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.afip afipVarE7 = this.a.a.e("/client_streamz/gnp_android/tray_management/tray_instructions_processing_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("requested_tray_limit", java.lang.Integer.class), new defpackage.afio("above_tray_limit_count", java.lang.Integer.class), new defpackage.afio("requested_slot_limit", java.lang.Integer.class), new defpackage.afio("above_slot_limit_count", java.lang.Integer.class));
                        afipVarE7.c();
                        return afipVarE7;
                    case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.afip afipVarE8 = this.a.a.e("/client_streamz/gnp_android/auth/token_retrieval_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afipVarE8.c();
                        return afipVarE8;
                    case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.afim afimVarC = this.a.a.c("/client_streamz/gnp_android/auth/token_retrieval_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                        afimVarC.c();
                        return afimVarC;
                    case 9:
                        defpackage.afip afipVarE9 = this.a.a.e("/client_streamz/gnp_android/experiments/gnp_rasta_experiment_propagation_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("experiment_source", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                        afipVarE9.c();
                        return afipVarE9;
                    case 10:
                        defpackage.afip afipVarE10 = this.a.a.e("/client_streamz/gnp_android/gnp_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class), new defpackage.afio("network_requirement", java.lang.String.class));
                        afipVarE10.c();
                        return afipVarE10;
                    case 11:
                        defpackage.afip afipVarE11 = this.a.a.e("/client_streamz/gnp_android/rpc/http_rpc_executor/count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class));
                        afipVarE11.c();
                        return afipVarE11;
                    case 12:
                        defpackage.afip afipVarE12 = this.a.a.e("/client_streamz/gnp_android/http/gnp_http_client/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("client_impl", java.lang.String.class), new defpackage.afio("path", java.lang.String.class), new defpackage.afio("status_code", java.lang.Integer.class), new defpackage.afio("purpose", java.lang.String.class));
                        afipVarE12.c();
                        return afipVarE12;
                    case 13:
                        defpackage.afip afipVarE13 = this.a.a.e("/client_streamz/gnp_android/push/event_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("event_type", java.lang.String.class));
                        afipVarE13.c();
                        return afipVarE13;
                    case 14:
                        defpackage.afip afipVarE14 = this.a.a.e("/client_streamz/gnp_android/push/decryption/request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("failure", java.lang.Boolean.class), new defpackage.afio("has_placeholder", java.lang.Boolean.class), new defpackage.afio("fetched_threads", java.lang.Boolean.class));
                        afipVarE14.c();
                        return afipVarE14;
                    case 15:
                        defpackage.afip afipVarE15 = this.a.a.e("/client_streamz/chime_android/sdk/registration/request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class));
                        afipVarE15.c();
                        return afipVarE15;
                    case 16:
                        defpackage.afip afipVarE16 = this.a.a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_total_accounts_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                        afipVarE16.c();
                        return afipVarE16;
                    case 17:
                        defpackage.afip afipVarE17 = this.a.a.e("/client_streamz/gnp_android/media/icon_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("num_of_icons", java.lang.Integer.class), new defpackage.afio("shape", java.lang.String.class));
                        afipVarE17.c();
                        return afipVarE17;
                    case 18:
                        defpackage.afip afipVarE18 = this.a.a.e("/client_streamz/gnp_android/registration/registration_request_builder_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("encryption_requested", java.lang.Boolean.class), new defpackage.afio("key_generation_result", java.lang.Boolean.class), new defpackage.afio("target_type", java.lang.String.class));
                        afipVarE18.c();
                        return afipVarE18;
                    case 19:
                        defpackage.afip afipVarE19 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("executed_in_place", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                        afipVarE19.c();
                        return afipVarE19;
                    default:
                        defpackage.afip afipVarE20 = this.a.a.e("/client_streamz/gnp_android/job/chime_job_start_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_gnp_job", java.lang.Boolean.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("has_internet_connection", java.lang.String.class));
                        afipVarE20.c();
                        return afipVarE20;
                }
            }
        });
        defpackage.afit afitVarD = defpackage.afit.d("gnp_android");
        this.a = afitVarD;
        defpackage.afis afisVar = afitVarD.c;
        if (afisVar == null) {
            this.r = defpackage.afiv.c(ajxwVar, scheduledExecutorService, afitVarD, application);
        } else {
            this.r = afisVar;
            ((defpackage.afiv) afisVar).f = ajxwVar;
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((defpackage.afip) this.D.eZ()).b(1L, str, str2, str3, str4, str5);
    }

    public final void b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((defpackage.afip) this.y.eZ()).b(1L, str, str2, str3);
    }

    public final void c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((defpackage.afip) this.B.eZ()).b(1L, str, str2, str3);
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((defpackage.afip) this.C.eZ()).b(1L, str, str2, str3);
    }

    public final void e(java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        ((defpackage.afip) this.s.eZ()).b(1L, str, str2, java.lang.Integer.valueOf(i), str3, str4, str5, java.lang.Boolean.valueOf(z));
    }

    public final void f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((defpackage.afip) this.F.eZ()).b(1L, str, str2, str3, str4, str5);
    }

    public final void g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((defpackage.afip) this.v.eZ()).b(1L, str, str2, str3, str4, str5);
    }

    public final void h(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((defpackage.afip) this.u.eZ()).b(i, str, str2, str3);
    }

    public final void i(java.lang.String str, boolean z) {
        ((defpackage.afip) this.z.eZ()).b(1L, str, java.lang.Boolean.valueOf(z));
    }

    public final void j(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        ((defpackage.afip) this.x.eZ()).b(1L, str, str2, str3);
    }

    public final void k(java.lang.String str, java.lang.String str2) {
        ((defpackage.afip) this.w.eZ()).b(1L, str, str2);
    }

    public final void l(double d, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        ((defpackage.afim) this.E.eZ()).b(d, str, str2, str3, str4, str5);
    }

    public final void m(double d, java.lang.String str, java.lang.String str2, int i, java.lang.String str3) {
        ((defpackage.afim) this.t.eZ()).b(d, str, str2, java.lang.Integer.valueOf(i), str3);
    }

    public final void n(java.lang.String str, java.lang.String str2, boolean z, boolean z2, java.lang.String str3) {
        ((defpackage.afip) this.A.eZ()).b(1L, str, str2, "REQUEST_UTIL", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2), str3);
    }
}
