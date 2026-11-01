package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class wtx implements ahzi {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ wtx(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final java.lang.Object eZ() {
        defpackage.aams aqanVar;
        switch (this.$cid) {
            case 0:
                return java.lang.Integer.valueOf(urg.c((android.content.Context) this.a, 2130968948));
            case 1:
                return java.lang.Integer.valueOf(((android.content.res.Resources) this.a).getDimensionPixelSize(2131168036));
            case 2:
                return java.lang.Integer.valueOf(urg.c((android.content.Context) this.a, 2130969121));
            case 3:
                aigb aigbVar = new aigb(4);
                defpackage.wvk wvkVar = (defpackage.wvk) this.a;
                if (((java.lang.Boolean) wvkVar.c.a()).booleanValue()) {
                    aigbVar.l(defpackage.wvk.a);
                }
                aoin aoinVar = wvkVar.b;
                if (!((java.lang.String) aoinVar.a()).isEmpty() && !defpackage.wvk.a.containsKey(aoinVar.a())) {
                    aigbVar.i((java.lang.String) aoinVar.a(), defpackage.wvj.TEST_PHENOTYPE);
                }
                return aigbVar.e(true);
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd = ((android.content.Context) ((defpackage.taq) this.a).b).getAssets().openFd("sed_15600.tflite");
                    try {
                        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new java.io.FileInputStream(assetFileDescriptorOpenFd.getFileDescriptor()).getChannel());
                        try {
                            java.nio.MappedByteBuffer map = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getDeclaredLength());
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            }
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                            aqanVar = new aqan(map, (aqam) null);
                        } catch (java.lang.Throwable th) {
                            if (fileChannelConvertMaybeLegacyFileChannelFromLibrary == null) {
                                throw th;
                            }
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                            throw new defpackage.ahzr("Model couldn't load.", e);
                        }
                        break;
                    } catch (java.lang.Throwable th3) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th3;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new defpackage.ahzr("Model couldn't load.", e);
                }
                break;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                acxg acxgVar = defpackage.aamh.a;
                aqanVar = new defpackage.aams((android.app.Activity) this.a);
                break;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                aaoo aaooVar = defpackage.aana.a;
                java.io.File filesDir = ((android.content.Context) this.a).getFilesDir();
                int i = defpackage.aanb.a;
                java.io.File file = new java.io.File(aaoo.j(filesDir, "wearos_assets"));
                aaoo aaooVar2 = defpackage.aana.a;
                java.io.File file2 = new java.io.File(aaoo.j(file, "streamtmp"));
                file2.mkdirs();
                java.io.File[] fileArrListFiles = file2.listFiles();
                if (fileArrListFiles == null) {
                    return file2;
                }
                for (java.io.File file3 : fileArrListFiles) {
                    file3.delete();
                }
                return file2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                afip afipVarE = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/invalid_user_profile_switch", new afio[]{new afio("app_package", java.lang.String.class)});
                afipVarE.c();
                return afipVarE;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                afip afipVarE2 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/ads_migration_parity", new afio[]{new afio("result", java.lang.String.class), new afio("data_type", java.lang.String.class), new afio("title_error", java.lang.Boolean.class), new afio("subtitle_error", java.lang.Boolean.class), new afio("icon_error", java.lang.Boolean.class), new afio("buttons_error", java.lang.Boolean.class), new afio("other_error", java.lang.Boolean.class)});
                afipVarE2.c();
                return afipVarE2;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                afip afipVarE3 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/switch_profile", new afio[]{new afio("result", java.lang.String.class), new afio("has_category_launcher", java.lang.Boolean.class), new afio("has_category_info", java.lang.Boolean.class), new afio("user_in_target_user_profiles", java.lang.Boolean.class), new afio("api_version", java.lang.Integer.class), new afio("app_package", java.lang.String.class)});
                afipVarE3.c();
                return afipVarE3;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                afip afipVarE4 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/g1_capability_parity", new afio[]{new afio("app_package", java.lang.String.class), new afio("matches", java.lang.Boolean.class)});
                afipVarE4.c();
                return afipVarE4;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                afim afimVarC = ((defpackage.ahix) this.a).a.c("/client_streamz/og_android/g1_capability_latency", new afio[]{new afio("app_package", java.lang.String.class), new afio("result", java.lang.String.class)});
                afimVarC.c();
                return afimVarC;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                afip afipVarE5 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/load_owners_count", new afio[]{new afio("implementation", java.lang.String.class), new afio("result", java.lang.String.class), new afio("number_of_owners", java.lang.Integer.class), new afio("app_package", java.lang.String.class), new afio("load_cached", java.lang.Boolean.class)});
                afipVarE5.c();
                return afipVarE5;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                afip afipVarE6 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/load_owner_count", new afio[]{new afio("implementation", java.lang.String.class), new afio("result", java.lang.String.class), new afio("app_package", java.lang.String.class)});
                afipVarE6.c();
                return afipVarE6;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                afip afipVarE7 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/legacy/load_owners", new afio[]{new afio("app_package", java.lang.String.class)});
                afipVarE7.c();
                return afipVarE7;
            case 15:
                afip afipVarE8 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/load_owner_avatar_count", new afio[]{new afio("implementation", java.lang.String.class), new afio("avatar_size", java.lang.String.class), new afio("result", java.lang.String.class), new afio("app_package", java.lang.String.class), new afio("load_cached", java.lang.Boolean.class)});
                afipVarE8.c();
                return afipVarE8;
            case 16:
                afim afimVarC2 = ((defpackage.ahix) this.a).a.c("/client_streamz/og_android/load_owners_latency", new afio[]{new afio("implementation", java.lang.String.class), new afio("result", java.lang.String.class), new afio("number_of_owners", java.lang.Integer.class), new afio("app_package", java.lang.String.class), new afio("load_cached", java.lang.Boolean.class)});
                afimVarC2.c();
                return afimVarC2;
            case 17:
                afim afimVarC3 = ((defpackage.ahix) this.a).a.c("/client_streamz/og_android/load_owner_avatar_latency", new afio[]{new afio("implementation", java.lang.String.class), new afio("avatar_size", java.lang.String.class), new afio("result", java.lang.String.class), new afio("app_package", java.lang.String.class), new afio("load_cached", java.lang.Boolean.class)});
                afimVarC3.c();
                return afimVarC3;
            case 18:
                afip afipVarE9 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/visual_elements_usage", new afio[]{new afio("app_package", java.lang.String.class), new afio("ve_provided", java.lang.Boolean.class)});
                afipVarE9.c();
                return afipVarE9;
            case 19:
                afip afipVarE10 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/profile_cache/get_people_me", new afio[]{new afio("result", java.lang.String.class), new afio("app_package", java.lang.String.class)});
                afipVarE10.c();
                return afipVarE10;
            default:
                afip afipVarE11 = ((defpackage.ahix) this.a).a.e("/client_streamz/og_android/lazy_provider_count", new afio[]{new afio("app_package", java.lang.String.class)});
                afipVarE11.c();
                return afipVarE11;
        }
        return aqanVar;
    }
}
