package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class adfi implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ adfi(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        int i;
        boolean zContains;
        switch (this.$cid) {
            case 0:
                return (defpackage.adfm) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 1:
                defpackage.adag adagVar = (defpackage.adag) this.a;
                return new defpackage.afsq((android.content.Context) adagVar.b, (defpackage.apnt) adagVar.a);
            case 2:
                return (defpackage.adfn) ((java.util.concurrent.atomic.AtomicReference) this.a).get();
            case 3:
                java.lang.Object obj = this.a;
                defpackage.adla adlaVar = (defpackage.adla) obj;
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest = adlaVar.a;
                java.lang.String str = ((defpackage.adhb) packManifest.p()).a;
                defpackage.aify aifyVarG = packManifest.g();
                synchronized (obj) {
                    i = ((defpackage.adla) obj).e;
                    ((defpackage.adla) obj).e = i + 1;
                    break;
                }
                java.lang.String str2 = (java.lang.String) aifyVarG.get(i);
                str2.getClass();
                defpackage.aezs aezsVar = adlaVar.j;
                java.io.File file = adlaVar.c;
                defpackage.adin adinVar = adlaVar.b;
                defpackage.adkz adkzVar = adlaVar.i;
                defpackage.ajdd ajddVar = new defpackage.ajdd();
                boolean z = aezsVar.a;
                defpackage.adsy adsyVar = adinVar.g(true) ? defpackage.adsy.a : defpackage.adsy.b;
                boolean zG = adinVar.g(true);
                defpackage.adia adiaVar = new defpackage.adia();
                adiaVar.d(false);
                adiaVar.b(false);
                adiaVar.e(zG);
                adiaVar.c(false);
                adiaVar.d(false);
                adiaVar.b(false);
                defpackage.adib adibVarA = adiaVar.a();
                defpackage.aiob aiobVar = (defpackage.aiob) ((defpackage.aiob) defpackage.adhn.a.b()).l("com/google/android/libraries/micore/superpacks/packs/HttpDownloadProtocol", "download", 113, "HttpDownloadProtocol.java");
                synchronized (defpackage.adik.b) {
                    zContains = defpackage.adik.a.contains(str);
                    break;
                }
                aiobVar.M("Requesting download of URL %s to %s (constraints: %s)", true != zContains ? str2 : "redacted", file.getName(), adibVarA);
                java.io.File parentFile = file.getParentFile();
                parentFile.getClass();
                java.lang.String name = file.getName();
                defpackage.adsz adszVar = new defpackage.adsz((defpackage.adth) aezsVar.c, str2, parentFile, name, new defpackage.adlj(aezsVar, ajddVar, str2, adkzVar, file), new defpackage.adku(parentFile, name, new defpackage.adqg(aezsVar, adkzVar, str2)));
                adszVar.g(adsyVar);
                adszVar.e();
                com.google.android.libraries.micore.superpacks.common.PackManifest packManifest2 = (com.google.android.libraries.micore.superpacks.common.PackManifest) adkzVar.a;
                defpackage.adhw adhwVarP = packManifest2.p();
                com.google.android.libraries.micore.superpacks.base.VersionedName versionedNameE = packManifest2.e();
                defpackage.adhb adhbVar = (defpackage.adhb) adhwVarP;
                java.lang.String str3 = adhbVar.a;
                long length = ((java.io.File) adkzVar.b).length();
                defpackage.adhl.a.b();
                java.lang.String str4 = adhbVar.b;
                ((defpackage.adla) adkzVar.c).h.d.P(new defpackage.admq(adhwVarP, str2, versionedNameE, length, adibVarA, 1));
                return ajddVar;
            case 4:
                java.util.Iterator it = this.a.iterator();
                long jC = 0;
                while (it.hasNext()) {
                    jC += ((defpackage.adkd) it.next()).c();
                }
                return java.lang.Long.valueOf(jC);
            case 5:
                defpackage.afip afipVarE = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/gnp_job_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class), new defpackage.afio("is_automotive", java.lang.Boolean.class));
                afipVarE.c();
                return afipVarE;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afip afipVarE2 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/growthkit_promotions_fetched", new defpackage.afio("package_name", java.lang.String.class));
                afipVarE2.c();
                return afipVarE2;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afim afimVarC = ((defpackage.aeey) this.a).a.c("/client_streamz/gnp_android/operation_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("domain", java.lang.String.class));
                afimVarC.c();
                return afimVarC;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.afip afipVarE3 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/growthkit_network_library_count", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("fetch_reason", java.lang.String.class));
                afipVarE3.c();
                return afipVarE3;
            case 9:
                defpackage.afim afimVarC2 = ((defpackage.aeey) this.a).a.c("/client_streamz/gnp_android/growthkit_sync_latency", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("fetch_reason", java.lang.String.class), new defpackage.afio("promotions_synced", java.lang.Integer.class));
                afimVarC2.c();
                return afimVarC2;
            case 10:
                defpackage.afim afimVarC3 = ((defpackage.aeey) this.a).a.c("/client_streamz/gnp_android/inapp_cross_app_capping_read_latency", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("did_fail", java.lang.Boolean.class));
                afimVarC3.c();
                return afimVarC3;
            case 11:
                defpackage.afim afimVarC4 = ((defpackage.aeey) this.a).a.c("/client_streamz/gnp_android/inapp_cross_app_capping_write_latency", new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("did_fail", java.lang.Boolean.class));
                afimVarC4.c();
                return afimVarC4;
            case 12:
                defpackage.afip afipVarE4 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/gnp/account/username_change_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_failure", java.lang.Boolean.class));
                afipVarE4.c();
                return afipVarE4;
            case 13:
                defpackage.afip afipVarE5 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/gnp/account/account_removal_result", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_failure", java.lang.Boolean.class));
                afipVarE5.c();
                return afipVarE5;
            case 14:
                defpackage.afip afipVarE6 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/customtabs/customtab_launch_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("url_type", java.lang.String.class));
                afipVarE6.c();
                return afipVarE6;
            case 15:
                defpackage.afip afipVarE7 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/growthkit_browser_redirect_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("is_chrome_ecct_supported", java.lang.Boolean.class));
                afipVarE7.c();
                return afipVarE7;
            case 16:
                defpackage.afip afipVarE8 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/gnp/registration/multi_login_update_request_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("registration_reason", java.lang.String.class), new defpackage.afio("target_type", java.lang.String.class));
                afipVarE8.c();
                return afipVarE8;
            case 17:
                defpackage.afip afipVarE9 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/growthkit_hyperlinks_count", new defpackage.afio("app_package_name", java.lang.String.class));
                afipVarE9.c();
                return afipVarE9;
            case 18:
                defpackage.afip afipVarE10 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/blocking_notification_receiver_exception", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("is_timeout_exception", java.lang.Boolean.class), new defpackage.afio("exception_class_name", java.lang.String.class));
                afipVarE10.c();
                return afipVarE10;
            case 19:
                defpackage.afim afimVarC5 = ((defpackage.aeey) this.a).a.c("/client_streamz/gnp_android/gnp_job_latency", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("job_key", java.lang.String.class), new defpackage.afio("result", java.lang.String.class), new defpackage.afio("failure_type", java.lang.String.class));
                afimVarC5.c();
                return afimVarC5;
            default:
                defpackage.afip afipVarE11 = ((defpackage.aeey) this.a).a.e("/client_streamz/gnp_android/device_payload_count", new defpackage.afio("app_package_name", java.lang.String.class), new defpackage.afio("client_id", java.lang.String.class), new defpackage.afio("source", java.lang.String.class), new defpackage.afio("is_pseudonymous", java.lang.Boolean.class), new defpackage.afio("is_null", java.lang.Boolean.class), new defpackage.afio("result", java.lang.String.class));
                afipVarE11.c();
                return afipVarE11;
        }
    }
}
