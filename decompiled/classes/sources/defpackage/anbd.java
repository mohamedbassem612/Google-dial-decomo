package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class anbd implements defpackage.ahaw {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahaw
    public final void a(defpackage.aigb aigbVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.ahbb ahbbVar = defpackage.ahbb.b;
            aigbVar.i("enable_auto_download_voicemail_over_cellular", ahbbVar);
            aigbVar.i("enable_check_tos_accepted", ahbbVar);
            aigbVar.i("enable_error_model_builder_on_cvvm", ahbbVar);
            aigbVar.i("enable_remaining_carriers_on_vvm_service", ahbbVar);
            aigbVar.i("VvmService__get_response_sms_timeout_millis", defpackage.agab.aQ(60000L));
            aigbVar.i("max_number_of_task_retries", defpackage.agab.aQ(3L));
            aigbVar.i("max_tmo_rest_retrieving_voicemail_entries_per_page", defpackage.agab.aQ(100L));
            aigbVar.i("max_tmo_rest_retrieving_voicemail_page", defpackage.agab.aQ(10L));
            aigbVar.i("max_tmo_rest_voicemail_per_delete_request", defpackage.agab.aQ(100L));
            aigbVar.i("max_tmo_rest_voicemail_per_update_request", defpackage.agab.aQ(100L));
            aigbVar.i("perform_provisioning_timeout_millis", defpackage.agab.aQ(6000L));
            aigbVar.i("VvmService__send_request_sms_timeout_millis", defpackage.agab.aQ(15000L));
            return;
        }
        if (i == 1) {
            aigbVar.i("G__enable_reduce_vvm_server_load_o2uk", defpackage.ahbb.b);
            return;
        }
        if (i == 2) {
            aigbVar.i("enable_modernized_change_pin_ui", defpackage.ahbb.a);
            return;
        }
        if (i == 3) {
            aigbVar.i("G__enable_wifi_calling_icons_all_carriers", defpackage.ahbb.b);
            return;
        }
        if (i == 4) {
            defpackage.ahbb ahbbVar2 = defpackage.ahbb.a;
            aigbVar.i("enable_tagging_model", ahbbVar2);
            defpackage.ahbb ahbbVar3 = defpackage.ahbb.b;
            aigbVar.i("enable_xatu", ahbbVar3);
            aigbVar.i("Xatu__lp_confidence_mappings", defpackage.agab.aR(new defpackage.anbc(6), defpackage.ypz.a));
            aigbVar.i("Xatu__lp_preferences", defpackage.agab.aR(new defpackage.anbc(7), defpackage.yqa.a));
            aigbVar.i("model_download_group_config", defpackage.agab.aR(new defpackage.anbc(8), defpackage.acux.a));
            aigbVar.i("restart_terse_model_periodically", ahbbVar2);
            aigbVar.i("xatu_allowlisted_non_tfn_prefixes_per_country", defpackage.agab.aR(new defpackage.anbc(9), defpackage.alfc.a));
            aigbVar.i("xatu_enable_eligibility_expansion", ahbbVar3);
            aigbVar.i("Xatu__xatu_enable_item_animator", ahbbVar3);
            aigbVar.i("xatu_soda_locale", defpackage.agab.aS("en-US"));
            return;
        }
        if (i == 5) {
            defpackage.ahbb ahbbVar4 = defpackage.ahbb.b;
            aigbVar.i("G__frequents_enable_missed_call_effect", ahbbVar4);
            aigbVar.i("G__frequents_enable_time_of_day_effect", ahbbVar4);
            aigbVar.i("G__frequents_recency_decay", defpackage.agab.aQ(50L));
            aigbVar.i("G__frequents_time_of_day_weight_fraction_pct", defpackage.agab.aQ(50L));
            return;
        }
        if (i == 9) {
            aigbVar.i("atlas_agent_greeting_timeout_padding_millis", defpackage.agab.aQ(600L));
            aigbVar.i("atlas_agent_greeting_version_jp", defpackage.agab.aS("V2"));
            defpackage.ahbb ahbbVar5 = defpackage.ahbb.b;
            aigbVar.i("atlas_allow_hardcoded_business", ahbbVar5);
            aigbVar.i("atlas_asr_emit_throttled_millis", defpackage.agab.aQ(100L));
            aigbVar.i("G__atlas_business_number_matching_timeout_millis", defpackage.agab.aQ(1000L));
            aigbVar.i("atlas_cconfirmation_dialog_start_button_style_version", defpackage.agab.aS("V2"));
            defpackage.anbc anbcVar = new defpackage.anbc(10);
            defpackage.alfc alfcVar = defpackage.alfc.a;
            aigbVar.i("atlas_enabled_business_number_country_codes", defpackage.agab.aR(anbcVar, alfcVar));
            defpackage.ahbb ahbbVar6 = defpackage.ahbb.a;
            aigbVar.i("atlas_filter_ivr_alerts", ahbbVar6);
            aigbVar.i("atlas_filter_ivr_alerts_duration_mins", defpackage.agab.aQ(10L));
            aigbVar.i("G__atlas_get_call_audio_timeout_millis", defpackage.agab.aQ(2000L));
            aigbVar.i("atlas_google_help_context_string_for_donation", defpackage.agab.aS("hold_for_me_PT"));
            aigbVar.i("atlas_google_help_context_string_for_settings", defpackage.agab.aS("hold_for_me_PT"));
            aigbVar.i("atlas_google_help_fallback_uri", defpackage.agab.aS("https://support.google.com/phoneapp"));
            aigbVar.i("atlas_happiness_survey_trigger_id", defpackage.agab.aS("zErYNAsAy0pknLeYX5R0VLqfwksU"));
            aigbVar.i("atlas_ivr_alert_false_positive_threshold_secs", defpackage.agab.aQ(30L));
            aigbVar.i("atlas_ivr_alert_max_false_positives_allowed", defpackage.agab.aQ(1L));
            aigbVar.i("atlas_ivr_alert_use_dialpad_clicks", ahbbVar6);
            aigbVar.i("atlas_min_wait_time_for_model_download_millis", defpackage.agab.aQ(3000L));
            aigbVar.i("atlas_missing_byte_monitor_start_secs", defpackage.agab.aQ(30L));
            aigbVar.i("atlas_missing_byte_pct_alarm_threshold", defpackage.agab.aP(0.5d));
            aigbVar.i("atlas_opted_out_business_numbers", defpackage.agab.aR(new defpackage.anbc(11), alfcVar));
            aigbVar.i("atlas_polling_call_audio_state_initial_delay_millis", defpackage.agab.aQ(50L));
            aigbVar.i("atlas_polling_call_audio_state_interval_millis", defpackage.agab.aQ(50L));
            aigbVar.i("atlas_polling_call_audio_state_timeout_millis", defpackage.agab.aQ(1000L));
            aigbVar.i("atlas_polling_call_state_initial_delay_millis", defpackage.agab.aQ(500L));
            aigbVar.i("atlas_polling_call_state_interval_millis", defpackage.agab.aQ(200L));
            aigbVar.i("atlas_polling_call_state_timeout_millis", defpackage.agab.aQ(2000L));
            aigbVar.i("atlas_pstn_byte_step_size", defpackage.agab.aQ(7800L));
            aigbVar.i("atlas_pstn_read_size", defpackage.agab.aQ(2048L));
            aigbVar.i("atlas_scotty_upload_target", defpackage.agab.aS("DOMAIN_0"));
            aigbVar.i("atlas_settings_cache_time_sec", defpackage.agab.aQ(30L));
            aigbVar.i("atlas_show_additional_feedback_description", ahbbVar5);
            aigbVar.i("atlas_show_preview_label", ahbbVar6);
            aigbVar.i("atlas_soda_num_partial_results_for_stablization", defpackage.agab.aQ(3L));
            aigbVar.i("atlas_sound_event_collection_min_period_secs", defpackage.agab.aQ(10L));
            aigbVar.i("atlas_supports_english_only_string_for_settings", ahbbVar6);
            aigbVar.i("atlas_use_constraints_for_metrics", ahbbVar6);
            aigbVar.i("atlas_voip_byte_step_size", defpackage.agab.aQ(15600L));
            aigbVar.i("atlas_voip_read_size", defpackage.agab.aQ(4096L));
            aigbVar.i("atlas_wait_for_session_to_detach_logger_timeout_millis", defpackage.agab.aQ(5000L));
            aigbVar.i("enable_atlas_call_audio_state_verification", ahbbVar6);
            aigbVar.i("G__atlas_mdd_ph_config", defpackage.agab.aR(new defpackage.anbc(12), defpackage.acux.a));
            aigbVar.i("show_atlas_hold_for_me_confirmation_dialog", ahbbVar6);
        }
    }
}
