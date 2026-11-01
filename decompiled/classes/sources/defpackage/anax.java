package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class anax implements defpackage.ahaw {
    private final /* synthetic */ int $cid;

    @Override // defpackage.ahaw
    public final void a(defpackage.aigb aigbVar) {
        switch (this.$cid) {
            case 0:
                aigbVar.i("duo_upgrade_supported_cache_timeout_millis", defpackage.agab.aQ(1000L));
                aigbVar.i("G__enable_lightbringer_video_upgrade", defpackage.ahbb.a);
                break;
            case 1:
                aigbVar.i("G__disable_cnap_for_outgoing_call", defpackage.ahbb.b);
                break;
            case 2:
            case 3:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                break;
            case 4:
                aigbVar.i("enable_fides", defpackage.ahbb.b);
                break;
            case 5:
                aigbVar.i("enable_firebase_analytics", defpackage.ahbb.b);
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                aigbVar.i("face_down_threshold", defpackage.agab.aP(-9.0d));
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ahbb ahbbVar = defpackage.ahbb.b;
                aigbVar.i("G__answer_proximity_sensor_enabled", ahbbVar);
                aigbVar.i("G__cp2_extended_directory_phone_lookup_timout_millis", defpackage.agab.aQ(7000L));
                aigbVar.i("G__disable_phone_number_formatting", ahbbVar);
                aigbVar.i("G__enable_after_call_spam_blocking_promo", ahbbVar);
                aigbVar.i("G__enable_dual_alphabets_on_t9", ahbbVar);
                aigbVar.i("G__enable_new_search_fragment", ahbbVar);
                defpackage.ahbb ahbbVar2 = defpackage.ahbb.a;
                aigbVar.i("G__enable_post_call_prod", ahbbVar2);
                aigbVar.i("G__enable_primes", ahbbVar);
                aigbVar.i("G__enable_primes_battery_metric", ahbbVar);
                aigbVar.i("G__enable_primes_crash_metric", ahbbVar);
                aigbVar.i("G__enable_primes_jank_metric", ahbbVar);
                aigbVar.i("G__enable_primes_memory_metric", ahbbVar);
                aigbVar.i("G__enable_primes_network_metric", ahbbVar);
                aigbVar.i("G__enable_primes_timer_metric", ahbbVar);
                aigbVar.i("G__enable_primes_tracing", ahbbVar);
                aigbVar.i("G__enable_return_to_call_bubble", ahbbVar);
                aigbVar.i("G__enable_return_to_call_bubble_v2", ahbbVar);
                aigbVar.i("G__enable_spam_blocking_promo", ahbbVar);
                aigbVar.i("G__enable_video_share", ahbbVar);
                aigbVar.i("G__force_disable_enriched_call", ahbbVar2);
                aigbVar.i("G__is_nui_shortcut_enabled", ahbbVar);
                aigbVar.i("G__postcall_call_duration_threshold", defpackage.agab.aQ(7000L));
                aigbVar.i("G__primes_timer_sample_rate_per_second", defpackage.agab.aQ(10L));
                aigbVar.i("G__smart_dial_default_last_update_millis", defpackage.agab.aQ(1517472000000L));
                aigbVar.i("G__video_share_timeout_millis", defpackage.agab.aQ(2147483647L));
                aigbVar.i("G__voicemail_transcription_available", ahbbVar2);
                aigbVar.i("G__vvm_carrier_o2_uk", ahbbVar);
                aigbVar.i("G__vvm_charter_vzw_us_allows_transcription", ahbbVar);
                aigbVar.i("G__vvm_o2_uk_allows_transcription", ahbbVar);
                aigbVar.i("G__vvm_tmobile_us_allows_transcription", ahbbVar);
                aigbVar.i("G__vvm_tracfone_tmo_us_allows_transcription", ahbbVar);
                aigbVar.i("G__vvm_visible_vzw_us_allows_transcription", ahbbVar);
                break;
            case 9:
                defpackage.ahbb ahbbVar3 = defpackage.ahbb.b;
                aigbVar.i("enable_deny_growthkit_promo_using_session_timer", ahbbVar3);
                aigbVar.i("G__enable_growthkit", defpackage.ahbb.a);
                aigbVar.i("growthkit_promo_incubation_period", defpackage.agab.aQ(0L));
                aigbVar.i("GrowthKitIntegration__pixel_2019_and_beyond", ahbbVar3);
                break;
            case 10:
                aigbVar.i("enable_auth_context_manager", defpackage.ahbb.a);
                break;
            case 11:
                aigbVar.i("enable_hardware_acceleration_for_vivo_go", defpackage.ahbb.b);
                break;
            case 12:
                aigbVar.i("enable_hats_proof_mode", defpackage.ahbb.b);
                break;
            case 13:
                aigbVar.i("hide_default_avatar_incall", defpackage.ahbb.b);
                break;
            case 14:
                aigbVar.i("enable_basic_auth_for_domain", defpackage.agab.aS(""));
                aigbVar.i("http_basic_auth_password", defpackage.agab.aS(""));
                aigbVar.i("http_basic_auth_username", defpackage.agab.aS(""));
                break;
            case 15:
                aigbVar.i("interval_for_in_app_review_days", defpackage.agab.aQ(30L));
                aigbVar.i("postcall_call_duration_threshold", defpackage.agab.aQ(7000L));
                aigbVar.i("post_call_in_app_review_probability", defpackage.agab.aP(0.0d));
                aigbVar.i("postcall_last_call_threshold", defpackage.agab.aQ(30000L));
                aigbVar.i("post_call_prompt_duration_ms", defpackage.agab.aQ(8000L));
                break;
            case 16:
                aigbVar.i("enable_incall_fixed_60hz_refresh_rate", defpackage.ahbb.b);
                break;
            case 17:
                aigbVar.i("G__incallactivity_jank_record_duration_millis", defpackage.agab.aQ(3000L));
                break;
            case 19:
                aigbVar.i("G__new_call_log_fragment_enabled", defpackage.ahbb.b);
                break;
            default:
                defpackage.ahbb ahbbVar4 = defpackage.ahbb.b;
                aigbVar.i("enable_mono_generic_avatar", ahbbVar4);
                aigbVar.i("enable_oneplus_color_palette", ahbbVar4);
                break;
        }
    }
}
