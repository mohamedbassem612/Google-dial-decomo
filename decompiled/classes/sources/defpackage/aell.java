package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class aell implements defpackage.ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ aell(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v57, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v70, types: [ahzi, java.lang.Object] */
    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        switch (this.$cid) {
            case 0:
                defpackage.afip afipVarE = ((ahix) this.a).a.e("/client_streamz/og_android/safety_exp_default_entry_point", new defpackage.afio[0]);
                afipVarE.c();
                return afipVarE;
            case 1:
                defpackage.afip afipVarE2 = ((ahix) this.a).a.e("/client_streamz/og_android/safety_exp_account_menu_refresh", new defpackage.afio[0]);
                afipVarE2.c();
                return afipVarE2;
            case 2:
                defpackage.afip afipVarE3 = ((ahix) this.a).a.e("/client_streamz/og_android/safety_exp_color_resolve_crash", new defpackage.afio("app_package", java.lang.String.class), new defpackage.afio("has_material", java.lang.Boolean.class), new defpackage.afio("is_material3", java.lang.Boolean.class), new defpackage.afio("is_light_theme", java.lang.Boolean.class), new defpackage.afio("failing_attribute_index", java.lang.Integer.class), new defpackage.afio("is_next_attribute_failing", java.lang.Boolean.class));
                afipVarE3.c();
                return afipVarE3;
            case 3:
                defpackage.afip afipVarE4 = ((ahix) this.a).a.e("/client_streamz/og_android/anchor_view_is_shown_on_screen_data", new defpackage.afio("part_of_the_view_is_visible", java.lang.Boolean.class), new defpackage.afio("is_laid_out", java.lang.Boolean.class), new defpackage.afio("is_shown", java.lang.Boolean.class));
                afipVarE4.c();
                return afipVarE4;
            case 4:
                defpackage.afip afipVarE5 = ((ahix) this.a).a.e("/client_streamz/og_android/bento_unbound_flow_crash", new defpackage.afio("host_activity_or_fragment_name", java.lang.String.class), new defpackage.afio("on_attach_called_count", java.lang.Integer.class), new defpackage.afio("on_create_called_count", java.lang.Integer.class), new defpackage.afio("on_view_created_called_count", java.lang.Integer.class), new defpackage.afio("on_config_changed_called_count", java.lang.Integer.class), new defpackage.afio("on_detach_called_count", java.lang.Integer.class), new defpackage.afio("bento_intent_launcher_binder_bind_called_count", java.lang.Integer.class), new defpackage.afio("package_name", java.lang.String.class), new defpackage.afio("error_type", java.lang.String.class), new defpackage.afio("bento_intent_launcher_source", java.lang.String.class));
                afipVarE5.c();
                return afipVarE5;
            case 5:
                defpackage.afip afipVarE6 = ((ahix) this.a).a.e("/client_streamz/og_android/shared_prefs_access_before_unlock_crash", new defpackage.afio("ui_mode_type", java.lang.Integer.class), new defpackage.afio("app_package", java.lang.String.class), new defpackage.afio("android_sdk_version", java.lang.Integer.class), new defpackage.afio("is_realme_device", java.lang.Boolean.class), new defpackage.afio("storage_type", java.lang.String.class), new defpackage.afio("status", java.lang.String.class), new defpackage.afio("exception_type", java.lang.String.class), new defpackage.afio("account_state", java.lang.String.class));
                afipVarE6.c();
                return afipVarE6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.afip afipVarE7 = ((ahix) this.a).a.e("/client_streamz/og_android/add_account/flow_initiations", new defpackage.afio("flow_type", java.lang.String.class), new defpackage.afio("app_package", java.lang.String.class));
                afipVarE7.c();
                return afipVarE7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.afip afipVarE8 = ((ahix) this.a).a.e("/client_streamz/og_android/add_account/account_manager_flow/completions", new defpackage.afio("result", java.lang.String.class), new defpackage.afio("app_package", java.lang.String.class));
                afipVarE8.c();
                return afipVarE8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return java.lang.Long.valueOf(java.lang.Double.valueOf((java.lang.String) ((aepb) this.a).a.eZ()).longValue());
            case 9:
                return this.a;
            case 10:
                android.content.Context context = (android.content.Context) this.a;
                try {
                    return defpackage.ahyn.g(baa$.ExternalSyntheticApiModelOutline1.m(baa$.ExternalSyntheticApiModelOutline1.m(context.getPackageManager(), context.getPackageName())));
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    return defpackage.ahwt.a;
                }
            case 11:
                return java.lang.Long.valueOf(((defpackage.vwb) ((defpackage.aeqx) this.a).g).l().getTotalSpace() / 1024);
            case 12:
                return (defpackage.aere) this.a.a();
            case 13:
                return java.lang.Boolean.valueOf(anip.a.b().a((android.content.Context) this.a));
            case 14:
                java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
                defpackage.ajje ajjeVar = new defpackage.ajje((char[]) null);
                ajjeVar.d = this.a;
                return ajjeVar.g();
            case 15:
                java.util.concurrent.atomic.AtomicReference atomicReference2 = defpackage.aewq.a;
                return new defpackage.aogc((java.util.List) this.a);
            case 16:
                return defpackage.ahyn.h(new aezj((defpackage.ahzi) ((defpackage.ajje) this.a).f));
            case 17:
                long j = afjz.a;
                return (android.app.UiModeManager) ((android.content.Context) this.a).getSystemService("uimode");
            case 18:
                defpackage.afip afipVarE9 = ((defpackage.afit) ((abtr) this.a).f).e("/client_streamz/tiktok/package_replaced/listener/count", new defpackage.afio("app_package", java.lang.String.class), new defpackage.afio("process_name", java.lang.String.class), new defpackage.afio("listener_key", java.lang.String.class), new defpackage.afio("impl", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                afipVarE9.c();
                return afipVarE9;
            case 19:
                defpackage.afim afimVarC = ((defpackage.afit) ((abtr) this.a).f).c("/client_streamz/tiktok/package_replaced/listener/duration", new defpackage.afio("app_package", java.lang.String.class), new defpackage.afio("process_name", java.lang.String.class), new defpackage.afio("listener_key", java.lang.String.class), new defpackage.afio("impl", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                afimVarC.c();
                return afimVarC;
            default:
                defpackage.afip afipVarE10 = ((defpackage.afit) ((abtr) this.a).f).e("/client_streamz/tiktok/package_replaced/system/count", new defpackage.afio("app_package", java.lang.String.class), new defpackage.afio("process_name", java.lang.String.class), new defpackage.afio("impl", java.lang.String.class), new defpackage.afio("status", java.lang.String.class));
                afipVarE10.c();
                return afipVarE10;
        }
    }
}
