package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class anay implements defpackage.ahaw {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahaw
    public final void a(defpackage.aigb aigbVar) {
        switch (this.$cid) {
            case 0:
                aigbVar.i("enable_cp2_phone_lookup_before_full_lookup", defpackage.ahbb.b);
                break;
            case 1:
                aigbVar.i("G__enable_oslo_integration", defpackage.ahbb.a);
                break;
            case 2:
                aigbVar.i("persistent_log_in_bug_reports_timeout_millis", defpackage.agab.aQ(1000L));
                break;
            case 3:
                aigbVar.i("G__enable_phone_number_classification_spam", defpackage.ahbb.b);
                break;
            case 4:
                aigbVar.i("G__phone_number_variations_json_corrected", defpackage.agab.aS("{}"));
                break;
            case 5:
                aigbVar.i("Playback__always_use_bluetooth_sco", defpackage.ahbb.a);
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                aigbVar.i("min_phone_number_length_for_wait_time", defpackage.agab.aQ(10L));
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                aigbVar.i("kill_wps_warning_migration", defpackage.ahbb.b);
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                aigbVar.i("G__enable_pride_month_celebration", defpackage.ahbb.b);
                break;
            case 10:
                defpackage.ahbb ahbbVar = defpackage.ahbb.b;
                aigbVar.i("G__enable_tiktok_primes_battery_metric", ahbbVar);
                aigbVar.i("PrimesMetrics__enable_tiktok_primes_crash_metric", ahbbVar);
                aigbVar.i("G__enable_tiktok_primes_jank_metric", ahbbVar);
                aigbVar.i("G__enable_tiktok_primes_jank_monitor_all_activities", ahbbVar);
                aigbVar.i("G__enable_tiktok_primes_memory_metric", ahbbVar);
                aigbVar.i("G__enable_tiktok_primes_network_metric", ahbbVar);
                aigbVar.i("G__enable_tiktok_primes_timer_metric", ahbbVar);
                aigbVar.i("PrimesMetrics__enable_tiktok_tracing_primes_integration", ahbbVar);
                aigbVar.i("G__tiktok_primes_timer_sample_rate_per_second", defpackage.agab.aQ(10L));
                aigbVar.i("tiktok_tracing_sampling_probability", defpackage.agab.aP(5.0E-4d));
                break;
            case 11:
                aigbVar.i("G__ramping_ringer_dialer_duration", defpackage.agab.aQ(10000L));
                aigbVar.i("G__ramping_ringer_dialer_enabled", defpackage.ahbb.a);
                aigbVar.i("G__ramping_ringer_dialer_vibration_duration", defpackage.agab.aQ(5000L));
                break;
            case 12:
                aigbVar.i("enable_remote_actions_service", defpackage.ahbb.b);
                break;
            case 13:
                aigbVar.i("audio_download_group_config", defpackage.agab.aR(new defpackage.anaw(10), defpackage.acux.a));
                defpackage.ahbb ahbbVar2 = defpackage.ahbb.b;
                aigbVar.i("enable_async_fi_spam_option_update", ahbbVar2);
                aigbVar.i("G__enable_caller_id_and_spam_confirmation_dialogs", ahbbVar2);
                aigbVar.i("G__enable_revelio_on_bluetooth", ahbbVar2);
                aigbVar.i("G__enable_revelio_on_wired_headset", ahbbVar2);
                aigbVar.i("G__enable_revelio_r_api", ahbbVar2);
                aigbVar.i("enable_spam_option_migration_between_fi_and_revelio", ahbbVar2);
                aigbVar.i("enable_spam_setting_sync_between_fi_and_revelio", ahbbVar2);
                aigbVar.i("maximum_revelio_ringing_sound_to_caller_loop_count", defpackage.agab.aQ(10L));
                aigbVar.i("G__maximum_revelio_voicemail_duration_in_seconds", defpackage.agab.aQ(45L));
                aigbVar.i("G__prefix_match_length", defpackage.agab.aQ(3L));
                aigbVar.i("revelio_fi_spam_option_update_timeout_millis", defpackage.agab.aQ(3000L));
                aigbVar.i("revelio_screening_timeout_millis", defpackage.agab.aQ(15000L));
                aigbVar.i("show_survey_for_revelio", ahbbVar2);
                aigbVar.i("Revelio__supported_voices", defpackage.agab.aR(new defpackage.anaw(11), defpackage.yqc.a));
                break;
            case 14:
                aigbVar.i("flag_direct_boot_access_sentinel", defpackage.ahbb.b);
                break;
            case 15:
                aigbVar.i("audio_detector_threshold", defpackage.agab.aQ(5000L));
                defpackage.ahbb ahbbVar3 = defpackage.ahbb.b;
                aigbVar.i("G__enable_rtt_visibility_setting", ahbbVar3);
                aigbVar.i("kill_rtt_videocall_transition", ahbbVar3);
                aigbVar.i("G__show_legal_text_for_att", ahbbVar3);
                aigbVar.i("G__show_legal_text_for_tmo", ahbbVar3);
                aigbVar.i("show_tty_setting", ahbbVar3);
                break;
            case 16:
                aigbVar.i("G__show_phone_number_when_cnap_available", defpackage.ahbb.b);
                break;
            case 17:
                aigbVar.i("enable_sigil", defpackage.ahbb.b);
                break;
            case 18:
                aigbVar.i("SodaTranscription__persisted_language_pack_info_refresh_frequency_hours", defpackage.agab.aQ(24L));
                aigbVar.i("SodaTranscription__persisted_language_pack_info_refresh_initial_delay_hours", defpackage.agab.aQ(24L));
                aigbVar.i("skip_soda_availability_check_for_emulator_tests", defpackage.ahbb.b);
                break;
            case 19:
                aigbVar.i("G__percentage_of_non_spam_notifications_to_show", defpackage.agab.aQ(20L));
                aigbVar.i("G__percentage_of_spam_notifications_to_show", defpackage.agab.aQ(100L));
                break;
            default:
                aigbVar.i("G__call_screen_audio_stitching_downlink_volume_multiplier", defpackage.agab.aP(1.0d));
                aigbVar.i("G__enable_audio_donation_with_spatula_header", defpackage.ahbb.a);
                defpackage.ahbb ahbbVar4 = defpackage.ahbb.b;
                aigbVar.i("G__enable_call_screen_deleting_old_recordings", ahbbVar4);
                aigbVar.i("G__enable_custom_message_markcallasremoved", ahbbVar4);
                aigbVar.i("G__donation_based_intro_message_enabled", ahbbVar4);
                aigbVar.i("G__enable_speakeasy_details", ahbbVar4);
                aigbVar.i("retry_initialization_limit_per_call", defpackage.agab.aQ(3L));
                aigbVar.i("G__speakeasy_audio_donation_enabled", ahbbVar4);
                aigbVar.i("G__speak_easy_bypass_locale_check", ahbbVar4);
                aigbVar.i("G__speak_easy_enable_listen_in_button", ahbbVar4);
                aigbVar.i("G__speak_easy_enabled", ahbbVar4);
                aigbVar.i("G__speakeasy_postcall_survey_enabled", ahbbVar4);
                aigbVar.i("G__speak_easy_use_soda_asr", ahbbVar4);
                break;
        }
    }
}
