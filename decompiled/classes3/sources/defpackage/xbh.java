package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class xbh implements ahyc {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ xbh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x04b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final java.lang.Object apply(java.lang.Object obj) {
        int iIntValue;
        int i = 5;
        int i2 = 2;
        ?? r10 = 1;
        int i3 = 0;
        switch (this.$cid) {
            case 0:
                a.bI(defpackage.xbk.a.b(), "started probing playback", "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "handlePlayAudioEvent", (char) 306, "HoldForMeModelEventListener.java", zct.a);
                defpackage.xbk xbkVar = (defpackage.xbk) this.a;
                xbkVar.b.b(xbkVar.k, defpackage.alex.ATLAS_START_PLAYING_PROBING_AUDIO);
                return null;
            case 1:
                a.bI(defpackage.xbk.a.b(), "started playing disclosure audio", "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "playGreetingToAgent", (char) 430, "HoldForMeModelEventListener.java", zct.a);
                defpackage.xbk xbkVar2 = (defpackage.xbk) this.a;
                xbkVar2.b.b(xbkVar2.k, defpackage.alex.ATLAS_START_PLAYING_DISCLOSURE_AUDIO);
                return null;
            case 2:
                a.bt(defpackage.xbk.a.b(), "playback of probing audio ended with reason: %s", ((hxe) obj).name(), "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "handlePlayAudioEvent", (char) 323, "HoldForMeModelEventListener.java", zct.a);
                defpackage.xbk xbkVar3 = (defpackage.xbk) this.a;
                xbkVar3.b.b(xbkVar3.k, defpackage.alex.ATLAS_FINISH_PLAYING_PROBING_AUDIO);
                return null;
            case 3:
                ((defpackage.xbk) this.a).b();
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                java.lang.Object obj2 = this.a;
                if (zBooleanValue) {
                    a.bI(defpackage.xbk.a.b(), "Ignoring USER_ATTENTION_REQUIRED due to previous false positive IVR alert", "com/android/incallui/atlas/ui/impl/tidepods/modeleventlistener/HoldForMeModelEventListener", "checkAndHandleUserAttentionRequiredEvent", (char) 528, "HoldForMeModelEventListener.java", zct.a);
                    defpackage.xbk xbkVar4 = (defpackage.xbk) obj2;
                    xbkVar4.b.b(xbkVar4.k, defpackage.alex.ATLAS_IGNORE_IVR_ALERT_EVENT);
                    return null;
                }
                defpackage.xbk xbkVar5 = (defpackage.xbk) obj2;
                defpackage.xbe xbeVar = xbkVar5.g;
                agsm.i(1151, xbeVar.h.d(ahqx.i(new defpackage.xbd(xbeVar, j$.time.Instant.now().toEpochMilli(), 1)), xbeVar.d), "failed to record ivr alert event time", new java.lang.Object[0]);
                defpackage.xdh xdhVar = xbkVar5.i;
                akzx akzxVarM = defpackage.wya.a.m();
                defpackage.wxy wxyVar = defpackage.wxy.a;
                akzxVarM.u();
                defpackage.wya wyaVar = (defpackage.wya) akzxVarM.b;
                j$.util.Objects.requireNonNull(wxyVar);
                wyaVar.d = wxyVar;
                wyaVar.c = 5;
                long j = xbkVar5.k;
                akzxVarM.u();
                defpackage.wya wyaVar2 = (defpackage.wya) akzxVarM.b;
                wyaVar2.b |= 1;
                wyaVar2.e = j;
                ahrv ahrvVarG = ahrv.g(xdhVar.b((defpackage.wya) akzxVarM.p()));
                defpackage.wyv wyvVar = new defpackage.wyv(obj2, 8);
                ajcu ajcuVar = xbkVar5.j;
                agsm.i(1163, ahrvVarG.i(wyvVar, ajcuVar).h(new defpackage.wrn(obj2, 20), ajcuVar), "failed to handle USER_ATTENTION_REQUIRED", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                ((defpackage.xbk) this.a).c();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.xbk) this.a).c();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                hzb hzbVar = (hzb) obj;
                defpackage.xbx xbxVar = (defpackage.xbx) this.a;
                xbxVar.j.set(true);
                hwy hwyVar = hzbVar.d;
                if (!xbxVar.k.isPresent() || xbxVar.k.orElseThrow() != hwyVar) {
                    xbxVar.k = j$.util.Optional.of(hwyVar);
                    if (hwyVar == hwy.a) {
                        a.bI(defpackage.xbx.a.b(), "audio mode is pstn", "com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "logAudioMode", (char) 315, "HoldForMeCallAudioReader.java", zct.a);
                        xbxVar.b.b(xbxVar.i, defpackage.alex.ATLAS_PSTN_MODE);
                    } else if (hwyVar == hwy.b) {
                        a.bI(defpackage.xbx.a.b(), "audio mode is voip", "com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "logAudioMode", (char) 319, "HoldForMeCallAudioReader.java", zct.a);
                        xbxVar.b.b(xbxVar.i, defpackage.alex.ATLAS_VOIP_MODE);
                    }
                }
                int iOrdinal = hzbVar.d.ordinal();
                if (iOrdinal == 0) {
                    iIntValue = ((java.lang.Long) xbxVar.f.a()).intValue();
                } else if (iOrdinal == 1) {
                    iIntValue = ((java.lang.Long) xbxVar.g.a()).intValue();
                } else {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        throw new java.lang.IllegalStateException("unsupported audio mode");
                    }
                    if (iOrdinal != 4) {
                        throw new defpackage.ahzr("Not an exhaustive switch");
                    }
                    iIntValue = ((java.lang.Long) xbxVar.f.a()).intValue();
                }
                xbxVar.l = j$.util.Optional.of(hzbVar.b(iIntValue, new defpackage.xbu(xbxVar, hzbVar, i3), xbxVar.d));
                ahvr.J((ajcq) xbxVar.l.orElseThrow(), new defpackage.uwo(xbxVar, 3), ajbm.a);
                return null;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                hxb hxbVar = (hxb) obj;
                aimw aimwVarL = defpackage.xbx.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "stopReadingCallAudio", 237, "HoldForMeCallAudioReader.java");
                java.lang.String strName = hxbVar != null ? hxbVar.name() : "null";
                java.lang.Object obj3 = this.a;
                aimwVarL.y("stopped reading call audio, read result: %s", strName);
                ((defpackage.xbx) obj3).l = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.xbx.a.b().k((java.lang.Throwable) obj).l("com/android/incallui/atlas/ui/impl/tidepods/service/callaudioreader/HoldForMeCallAudioReader", "stopReadingCallAudio", 248, "HoldForMeCallAudioReader.java").v("stopped reading call audio due to an exception");
                ((defpackage.xbx) this.a).l = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                ((defpackage.xca) this.a).f = j$.util.Optional.empty();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                ((defpackage.xcq) this.a).l.a = defpackage.wxx.a;
                return null;
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                agsm.i(1173, ((defpackage.xcq) this.a).m.R(oqt.c), "failed to log Atlas Activated HaTS event", new java.lang.Object[0]);
                return null;
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                ((defpackage.xcq) this.a).h.set(j$.util.Optional.empty());
                return null;
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                j$.util.Optional optional = (j$.util.Optional) obj;
                j$.util.Optional optionalA = ((defpackage.xcq) this.a).b.a();
                if (true == optionalA.isPresent()) {
                    optionalA = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((defpackage.zmw) optionalA.get()).equals(defpackage.zmw.ROUTE_BLUETOOTH)));
                }
                return java.lang.Boolean.valueOf(((java.lang.Boolean) optionalA.orElse(java.lang.Boolean.FALSE)).booleanValue() && lnr.a(optional));
            case 15:
                ((defpackage.xcy) this.a).B = true;
                return null;
            case 16:
                defpackage.xcy xcyVar = (defpackage.xcy) this.a;
                xcyVar.D.x();
                defpackage.xcy.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", 425, "HoldForMeSession.java").v("checking for and setting transcript availability");
                defpackage.wyw wywVar = xcyVar.E;
                java.lang.Object obj4 = wywVar.b;
                long j2 = xcyVar.r;
                ahrv ahrvVarG2 = ahrv.g(((wzd) obj4).f(j2));
                jwi jwiVar = new jwi(wywVar, j2, 16);
                ajbm ajbmVar = ajbm.a;
                agsm.i(1146, ahrvVarG2.i(jwiVar, ajbmVar).h(new defpackage.wrn(wywVar, 13), ajbmVar), "failed to check transcript availability for atlas call.", new java.lang.Object[0]);
                aenj aenjVar = defpackage.xcy.b;
                ruc rucVar = xcyVar.q;
                rucVar.l(aenjVar);
                rucVar.f(defpackage.xcy.c);
                xcyVar.B = false;
                return null;
            case 17:
                defpackage.xcy.a.d().i(zct.b).k((java.lang.Throwable) obj).i(zct.a).l("com/android/incallui/atlas/ui/impl/tidepods/session/HoldForMeSession", "stop", 355, "HoldForMeSession.java").v("unmute failed");
                defpackage.xcy xcyVar2 = (defpackage.xcy) this.a;
                xcyVar2.e.b(xcyVar2.r, defpackage.alex.ATLAS_FAILED_TO_UNMUTE_CALL);
                return null;
            case 18:
                j$.util.Optional optional2 = (j$.util.Optional) obj;
                defpackage.xch xchVar = new defpackage.xch(this.a, i2);
                if (true == optional2.isPresent()) {
                    java.lang.Object obj5 = optional2.get();
                    java.lang.Object obj6 = xchVar.a;
                    defpackage.wvi wviVar = ((defpackage.wus) obj5).c;
                    if (wviVar == null) {
                        wviVar = defpackage.wvi.a;
                    }
                    akzx akzxVar = ((defpackage.xcy) obj6).D;
                    akzxVar.u();
                    defpackage.xac xacVar = (defpackage.xac) akzxVar.b;
                    defpackage.xac xacVar2 = defpackage.xac.a;
                    j$.util.Objects.requireNonNull(wviVar);
                    alat alatVar = xacVar.c;
                    if (!alatVar.c()) {
                        xacVar.c = alad.J(alatVar);
                    }
                    xacVar.c.add(wviVar);
                    return null;
                }
                return null;
            case 19:
                j$.util.Optional optional3 = (j$.util.Optional) obj;
                defpackage.xch xchVar2 = new defpackage.xch(this.a, i);
                if (true == optional3.isPresent()) {
                    java.lang.Object obj7 = optional3.get();
                    java.lang.Object obj8 = xchVar2.a;
                    defpackage.xdx.a.b().l("com/android/incallui/atlas/ui/impl/tidepods/xatu/AtlasXatuAddonFeatureController", "handleActivationError", 63, "AtlasXatuAddonFeatureController.java").y("AtlasSessionController activation error: %s", (defpackage.xco) obj7);
                    ((defpackage.xdx) obj8).c.a(ajcm.a);
                }
                return java.lang.Boolean.valueOf(optional3 != null && optional3.isPresent());
            default:
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return null;
                }
                android.content.Context context = ((defpackage.xri) this.a).b;
                android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
                if (!defaultSharedPreferences.contains("dialer_feature_version_acknowledged")) {
                    android.database.Cursor cursorQuery = context.getContentResolver().query(android.provider.VoicemailContract.Voicemails.buildSourceUri(context.getPackageName()), new java.lang.String[]{"_id"}, "type = 4", null, null);
                    try {
                        if (cursorQuery == null) {
                            defpackage.xri.a.c().m(aioa.b).i(zct.b).l("com/android/voicemail/impl/PackageReplacedReceiver", "setVoicemailFeatureVersion", 178, "PackageReplacedReceiver.java").v("failed to check for existing voicemails");
                        } else {
                            if (!cursorQuery.moveToFirst()) {
                            }
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            defpackage.xri.a.b().l("com/android/voicemail/impl/PackageReplacedReceiver", "setVoicemailFeatureVersion", 184, "PackageReplacedReceiver.java").y("has voicemails: %b", java.lang.Boolean.valueOf((boolean) r10));
                            defaultSharedPreferences.edit().putInt("dialer_feature_version_acknowledged", r10).apply();
                        }
                        r10 = 0;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        defpackage.xri.a.b().l("com/android/voicemail/impl/PackageReplacedReceiver", "setVoicemailFeatureVersion", 184, "PackageReplacedReceiver.java").y("has voicemails: %b", java.lang.Boolean.valueOf((boolean) r10));
                        defaultSharedPreferences.edit().putInt("dialer_feature_version_acknowledged", r10).apply();
                    } catch (java.lang.Throwable th) {
                        if (cursorQuery == null) {
                            throw th;
                        }
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                return null;
        }
    }
}
