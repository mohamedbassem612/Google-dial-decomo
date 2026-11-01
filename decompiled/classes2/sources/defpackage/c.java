package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class c {
    public static volatile boolean a = false;
    public static boolean b = false;

    public static final void a() {
        if (android.os.Build.VERSION.SDK_INT > 35) {
            try {
                android.os.flagging.AconfigPackage aconfigPackageLoad = android.os.flagging.AconfigPackage.load("android.provider");
                aconfigPackageLoad.getBooleanFlagValue("expose_system_update_settings", false);
                aconfigPackageLoad.getBooleanFlagValue("expose_vpn_app_exclusion_settings", false);
                aconfigPackageLoad.getBooleanFlagValue("deprecate_bluetooth_class_of_device", false);
                b = aconfigPackageLoad.getBooleanFlagValue("enable_people_contract", false);
                aconfigPackageLoad.getBooleanFlagValue("new_account_attributes_api_enabled", false);
                aconfigPackageLoad.getBooleanFlagValue("new_default_account_api_enabled", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_documents_trash_api", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_documentsprovider_search_by_document_api", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_flag_unmountable", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_sync_state", false);
                aconfigPackageLoad.getBooleanFlagValue("enable_documents_system_apis_for_files_module", false);
                aconfigPackageLoad.getBooleanFlagValue("system_regional_preferences_api_enabled", false);
                aconfigPackageLoad.getBooleanFlagValue("launcher_data_access", false);
                aconfigPackageLoad.getBooleanFlagValue("system_settings_default", false);
                aconfigPackageLoad.getBooleanFlagValue("user_keys", false);
                aconfigPackageLoad.getBooleanFlagValue("prefix_phone_number_blocking", false);
                aconfigPackageLoad.getBooleanFlagValue("deprecate_legacy_show_password", false);
            } catch (java.lang.Exception e) {
                android.util.Log.e("ExportedFlags", e.toString());
            } catch (java.lang.LinkageError e2) {
                android.util.Log.w("ExportedFlags", e2.toString());
            }
            a = true;
        }
    }
}
