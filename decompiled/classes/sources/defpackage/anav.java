package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class anav implements defpackage.ahaw {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahaw
    public final void a(defpackage.aigb aigbVar) {
        switch (this.$cid) {
            case 0:
                aigbVar.i("G__assisted_dialing_csv_country_codes", defpackage.agab.aS("CA,GB,JP,US,IN,ES"));
                break;
            case 1:
                aigbVar.i("G__experiment_for_alternative_spam_word", defpackage.agab.aQ(230150L));
                break;
            case 2:
                aigbVar.i("AssistedEmergencyDialing__assisted_emergency_dialing_countries", defpackage.agab.aR(new defpackage.anau(11), defpackage.ypt.a));
                defpackage.ahbb ahbbVar = defpackage.ahbb.b;
                aigbVar.i("G__enable_emergency_buttons_in_emergency_rtt_chat", ahbbVar);
                aigbVar.i("G__enable_emergency_panel", ahbbVar);
                aigbVar.i("G__enable_voice_assist_on_emergency_panel", ahbbVar);
                aigbVar.i("force_enable_assisted_emergency_dialing_for_testing", ahbbVar);
                break;
            case 3:
                aigbVar.i("G__audio_framework_voip_enabled", defpackage.ahbb.a);
                break;
            case 4:
                aigbVar.i("enable_qresampler", defpackage.ahbb.b);
                break;
            case 5:
                aigbVar.i("broadcast_receiver_strategy_inline_delay_foreground_millis", defpackage.agab.aQ(3000L));
                aigbVar.i("broadcast_receiver_strategy_log_sampling_rate", defpackage.agab.aQ(1L));
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                aigbVar.i("CallAnnouncer__on_device_tts_supported_languages", defpackage.agab.aR(new defpackage.anau(12), defpackage.alfc.a));
                aigbVar.i("CallAnnouncer__prewarm_tts_worker_initial_delay_hours", defpackage.agab.aQ(24L));
                aigbVar.i("CallAnnouncer__prewarm_tts_worker_run_frequency_hours", defpackage.agab.aQ(24L));
                aigbVar.i("CallAnnouncer__repeat_announcement_delay_millis", defpackage.agab.aQ(3000L));
                aigbVar.i("use_headset_as_default_enabled_state", defpackage.ahbb.b);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ahbb ahbbVar2 = defpackage.ahbb.b;
                aigbVar.i("G__enable_feedback_log_upload", ahbbVar2);
                aigbVar.i("G__enable_feedback_module", ahbbVar2);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                aigbVar.i("call_audio_timeout_millis", defpackage.agab.aQ(200L));
                defpackage.anau anauVar = new defpackage.anau(13);
                defpackage.ypt yptVar = defpackage.ypt.a;
                aigbVar.i("CallRecording__call_recording_countries", defpackage.agab.aR(anauVar, yptVar));
                aigbVar.i("CallRecording__call_recording_countries_with_built_in_audio_file", defpackage.agab.aR(new defpackage.anau(14), yptVar));
                aigbVar.i("G__call_recording_force_enable_device_models", defpackage.agab.aR(new defpackage.anau(15), defpackage.ypv.a));
                aigbVar.i("CallRecording__call_recording_wait_for_metrics_timeout_millis", defpackage.agab.aQ(3000L));
                aigbVar.i("CallRecording__crosby_countries", defpackage.agab.aR(new defpackage.anau(16), yptVar));
                defpackage.ahbb ahbbVar3 = defpackage.ahbb.a;
                aigbVar.i("enable_crosbycrosby_enable_delete_snackbar_with_undo", ahbbVar3);
                defpackage.ahbb ahbbVar4 = defpackage.ahbb.b;
                aigbVar.i("G__enable_call_recording", ahbbVar4);
                aigbVar.i("CallRecording__enable_call_recording_for_fi", ahbbVar4);
                aigbVar.i("enable_call_recording_system_feature", ahbbVar3);
                aigbVar.i("G__force_within_call_recording_geofence_value", ahbbVar4);
                aigbVar.i("G__force_within_crosby_geofence_value", ahbbVar4);
                aigbVar.i("G__use_call_recording_geofence_overrides", ahbbVar4);
                aigbVar.i("G__use_minutes_for_call_recording_deletion", ahbbVar4);
                break;
            case 9:
                aigbVar.i("agsa_model_manager_api_support_version", defpackage.agab.aQ(301106615L));
                aigbVar.i("call_avatar_session_manager_producer_timeout_millis", defpackage.agab.aQ(100L));
                aigbVar.i("call_screen_activated_banner_duration_millis", defpackage.agab.aQ(1000L));
                aigbVar.i("call_screen_audio_and_metrics_retention_days", defpackage.agab.aQ(2L));
                aigbVar.i("CallScreenI18n__call_screen_device_specific_asr_model_override", defpackage.agab.aR(new defpackage.anau(17), defpackage.ypo.b));
                aigbVar.i("call_screen_hats_trigger_id", defpackage.agab.aS(""));
                aigbVar.i("CallScreenI18n__call_screen_i18n_config", defpackage.agab.aR(new defpackage.anau(18), defpackage.ypq.a));
                aigbVar.i("call_screen_scotty_upload_target", defpackage.agab.aS("DOMAIN_0"));
                aigbVar.i("call_screen_survey_chance", defpackage.agab.aP(0.0d));
                aigbVar.i("call_screen_voice_pack_download_timout_seconds", defpackage.agab.aQ(10L));
                aigbVar.i("CallScreenI18n__default_manifest_file_flag", defpackage.agab.aR(new defpackage.anau(19), defpackage.acve.a));
                defpackage.ahbb ahbbVar5 = defpackage.ahbb.b;
                aigbVar.i("enable_call_screen_demo", ahbbVar5);
                aigbVar.i("enable_call_screen_hats", ahbbVar5);
                aigbVar.i("enable_call_screen_i18n_tidepods", ahbbVar5);
                aigbVar.i("load_and_cache_interpreter_timeout_millis", defpackage.agab.aQ(100L));
                break;
            case 10:
                defpackage.ahbb ahbbVar6 = defpackage.ahbb.a;
                aigbVar.i("enable_lte_technology_icons", ahbbVar6);
                aigbVar.i("enable_shared_data_call_icon", defpackage.ahbb.b);
                aigbVar.i("enable_wifi_technology_icons", ahbbVar6);
                break;
            case 11:
                aigbVar.i("caller_id_retention_days", defpackage.agab.aQ(180L));
                aigbVar.i("CallerIdFeedback__rate_limit_count", defpackage.agab.aQ(50L));
                aigbVar.i("CallerIdFeedback__rate_limit_days", defpackage.agab.aQ(180L));
                break;
            case 12:
                aigbVar.i("G__config_caller_id_enabled", defpackage.ahbb.b);
                aigbVar.i("G__enable_caller_id_and_spam", defpackage.ahbb.a);
                break;
            case 13:
                aigbVar.i("caller_tag_crowdsourcing_experiment_id", defpackage.agab.aQ(0L));
                aigbVar.i("caller_tag_experiment_id", defpackage.agab.aQ(0L));
                aigbVar.i("feedback_chip_string_id", defpackage.agab.aQ(233351L));
                aigbVar.i("CallerTag__manifest_file_flag", defpackage.agab.aR(new defpackage.anau(20), defpackage.acve.a));
                break;
            case 14:
                defpackage.anaw anawVar = new defpackage.anaw(0);
                defpackage.alfa alfaVar = defpackage.alfa.a;
                aigbVar.i("CarrierIdentifier__carrier_id_kddi", defpackage.agab.aR(anawVar, alfaVar));
                aigbVar.i("CarrierIdentifier__carrier_id_orange_poland", defpackage.agab.aR(new defpackage.anaw(2), alfaVar));
                aigbVar.i("CarrierIdentifier__carrier_id_rogers", defpackage.agab.aR(new defpackage.anaw(3), alfaVar));
                defpackage.anaw anawVar2 = new defpackage.anaw(4);
                defpackage.alfc alfcVar = defpackage.alfc.a;
                aigbVar.i("CarrierIdentifier__mccmnc_att", defpackage.agab.aR(anawVar2, alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_orange_france", defpackage.agab.aR(new defpackage.anaw(5), alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_orange_spain", defpackage.agab.aR(new defpackage.anaw(6), alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_sprint", defpackage.agab.aR(new defpackage.anaw(7), alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_telcel", defpackage.agab.aR(new defpackage.anaw(8), alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_tmobile", defpackage.agab.aR(new defpackage.anaw(9), alfcVar));
                aigbVar.i("CarrierIdentifier__mccmnc_verizon", defpackage.agab.aR(new defpackage.anaw(1), alfcVar));
                break;
            case 15:
                aigbVar.i("G__enable_client_error_logging", defpackage.ahbb.a);
                aigbVar.i("client_logging_sampling_interval", defpackage.agab.aQ(100L));
                break;
            case 16:
                aigbVar.i("G__enable_coin", defpackage.ahbb.b);
                break;
            case 17:
                defpackage.ahbb ahbbVar7 = defpackage.ahbb.b;
                aigbVar.i("G__enable_call_screen_data_in_call_log", ahbbVar7);
                aigbVar.i("G__enable_call_screen_saving_audio", ahbbVar7);
                break;
            case 18:
                aigbVar.i("ContactRetriever__max_num_scores_considered_in_popularity_ranking", defpackage.agab.aQ(150L));
                break;
            case 19:
                aigbVar.i("G__enable_default_dialer", defpackage.ahbb.a);
                break;
            default:
                aigbVar.i("enable_dialpad_v2_ux", defpackage.ahbb.b);
                break;
        }
    }
}
