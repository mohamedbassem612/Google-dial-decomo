package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vft implements ahyc {
    private final /* synthetic */ int $cid;

    public /* synthetic */ vft(int i) {
        this.$cid = i;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        defpackage.vpf vpfVar;
        defpackage.vbs vbsVarB;
        switch (this.$cid) {
            case 0:
                return (vbu) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(13));
            case 1:
                vbu vbuVar = (vbu) obj;
                if (vbuVar == null) {
                    return j$.util.Optional.empty();
                }
                android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
                persistableBundle.putString("vvm_config_override_key_vvm_destination_number_string", vbuVar.d);
                persistableBundle.putInt("vvm_config_override_key_vvm_port_number_int", vbuVar.c);
                persistableBundle.putInt("vvm_config_override_key_vvm_application_port_number_int", vbuVar.u);
                persistableBundle.putBoolean("vvm_config_override_key_vvm_prefetch_bool", vbuVar.v);
                persistableBundle.putBoolean("vvm_config_override_key_vvm_cellular_data_required_bool", vbuVar.e);
                persistableBundle.putInt("vvm_config_override_key_vvm_ssl_port_number_int", vbuVar.m);
                persistableBundle.putBoolean("vvm_config_override_key_vvm_use_direct_tls_connection_bool", vbuVar.s);
                persistableBundle.putBoolean("vvm_config_override_key_vvm_change_greeting_enabled_bool", vbuVar.o);
                persistableBundle.putBoolean("vvm_config_override_key_vvm_legacy_mode_enabled_bool", vbuVar.i);
                persistableBundle.putString("vvm_config_override_key_vvm_client_prefix_string", vbuVar.h);
                persistableBundle.putString("vvm_config_override_key_vvm_network_capability_string", vbuVar.n);
                persistableBundle.putBoolean("vvm_config_override_key_validate_transcription_source_id_bool", vbuVar.l);
                alat alatVar = vbuVar.g;
                if (!alatVar.isEmpty()) {
                    persistableBundle.putStringArray("vvm_config_override_key_carrier_vvm_package_name_string_array", (java.lang.String[]) alatVar.toArray(new java.lang.String[alatVar.size()]));
                }
                alat alatVar2 = vbuVar.f;
                if (!alatVar2.isEmpty()) {
                    persistableBundle.putStringArray("vvm_config_override_key_vvm_disabled_capabilities_string_array", (java.lang.String[]) alatVar2.toArray(new java.lang.String[alatVar2.size()]));
                }
                return j$.util.Optional.of(persistableBundle);
            case 2:
                vbu vbuVar2 = (vbu) obj;
                return java.lang.Boolean.valueOf(!vbuVar2.j && vbuVar2.k);
            case 3:
                j$.util.Optional optionalOfNullable = (j$.util.Optional) obj;
                if (true == optionalOfNullable.isPresent()) {
                    java.lang.String str = ((defpackage.vgm) optionalOfNullable.get()).j;
                    try {
                        alto altoVar = new alto();
                        altoVar.f(android.text.TextUtils.isEmpty(str) ? 0 : java.lang.Integer.parseInt(str));
                        vpfVar = altoVar.e();
                    } catch (java.lang.NumberFormatException e) {
                        a.bq(vfu.a.c(), "failed to parse the tui greeting length.", "com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmConfiguration", "extractGreetingSpecification", (char) 351, "OmtpVvmConfiguration.java", e, zct.b);
                        vpfVar = new defpackage.vpf(0, 0);
                    }
                    optionalOfNullable = j$.util.Optional.ofNullable(vpfVar);
                    break;
                }
                return (defpackage.vpf) optionalOfNullable.orElse(new defpackage.vpf(0, 0));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return ((defpackage.vcx) obj).a;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                if (optional.isPresent()) {
                    return ((defpackage.viz) optional.orElseThrow()).c();
                }
                throw new java.lang.IllegalStateException("could not find SMS Builder for phone account");
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                defpackage.vcf vcfVar = (defpackage.vcf) obj;
                vcr vcrVar = vgg.a;
                return java.lang.Boolean.valueOf(vcfVar != defpackage.vcf.a);
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                vcr vcrVar2 = vgg.a;
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                vcr vcrVar3 = vgg.a;
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                vgg.c.c().k((defpackage.vgv) obj).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/OmtpVvmSyncService", "updateAudio", 774, "OmtpVvmSyncService.java").v("Failed to fetch voicemail payload");
                return j$.util.Optional.empty();
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                vcr vcrVar4 = vgg.a;
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                vcr vcrVar5 = vgg.a;
                return (vcg) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(15));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                vcr vcrVar6 = vgg.a;
                return java.lang.Boolean.TRUE;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                vcr vcrVar7 = vgg.a;
                return java.lang.Boolean.valueOf(j$.util.Collection.-EL.stream((java.util.List) obj).allMatch(new vgb(2)));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                return j$.util.Optional.of((defpackage.vdg) obj);
            case 15:
                return (vbu) ((j$.util.Optional) obj).orElseThrow(new defpackage.rqc(17));
            case 16:
                return new defpackage.aprf((vbu) obj, (byte[]) null);
            case 17:
                return afsq.bU((java.lang.Boolean) obj);
            case 18:
                return null;
            case 19:
                aimw aimwVarL = defpackage.vjr.a.b().i(zct.a).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/standardomtp/DefaultOmtpSmsReceiver", "processSyncMessage", 174, "DefaultOmtpSmsReceiver.java");
                vcp vcpVar = ((defpackage.vcv) obj).a;
                if (vcpVar.b == 1) {
                    vbsVarB = defpackage.vbs.b(((java.lang.Integer) vcpVar.c).intValue());
                    if (vbsVarB == null) {
                        vbsVarB = defpackage.vbs.UNRECOGNIZED;
                    }
                } else {
                    vbsVarB = defpackage.vbs.UNSPECIFIED;
                }
                aimwVarL.y("New voicemail was not inserted because: %s", vbsVarB);
                return null;
            default:
                defpackage.aprf aprfVar = (defpackage.aprf) obj;
                return java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s;%s=%s;%s", "Activate", "pv", "12", "ct", wsc.aE(), "pt", java.lang.Integer.valueOf(aprfVar.u()), aprfVar.v());
        }
    }
}
