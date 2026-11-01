package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class uer extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(ahdv ahdvVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ahdvVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 1:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.uer) c((defpackage.unv) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 12:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 13:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 14:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 15:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 16:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 17:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 18:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 19:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.uer) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: vcv */
    /* JADX WARN: Code duplicated, block: B:101:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x03dc  */
    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) throws vcv, java.io.IOException {
        boolean z;
        android.content.pm.PackageInfo packageInfoM;
        java.lang.Object num;
        int i = 1;
        switch (this.$cid) {
            case 0:
                defpackage.aooc.af(obj);
                defpackage.ues uesVar = (defpackage.ues) this.a;
                uesVar.c.o(defpackage.rmx.BACKUP_SPAM_BACKED_UP);
                defpackage.akzx akzxVarM = defpackage.ipa.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                android.database.Cursor cursorF = uesVar.b.f("client_spam_table", new java.lang.String[]{"number", "spam_status", "created", "client_meta_data"}, null, null);
                if (cursorF != null) {
                    try {
                        int columnIndexOrThrow = cursorF.getColumnIndexOrThrow("number");
                        int columnIndexOrThrow2 = cursorF.getColumnIndexOrThrow("spam_status");
                        int columnIndexOrThrow3 = cursorF.getColumnIndexOrThrow("created");
                        int columnIndexOrThrow4 = cursorF.getColumnIndexOrThrow("client_meta_data");
                        cursorF.moveToFirst();
                        while (!cursorF.isAfterLast()) {
                            java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.ipa) akzxVarM.b).b);
                            defpackage.aooh.e(listUnmodifiableList, "getRowsList(...)");
                            new defpackage.alct(listUnmodifiableList);
                            defpackage.akzx akzxVarM2 = ioz.a.m();
                            defpackage.aooh.f(akzxVarM2, "builder");
                            java.lang.String string = cursorF.getString(columnIndexOrThrow);
                            defpackage.aooh.e(string, "getString(...)");
                            defpackage.aooh.f(string, "value");
                            akzxVarM2.u();
                            ioz iozVar = akzxVarM2.b;
                            j$.util.Objects.requireNonNull(string);
                            iozVar.b |= i;
                            iozVar.c = string;
                            int i2 = cursorF.getInt(columnIndexOrThrow2);
                            akzxVarM2.u();
                            ioz iozVar2 = akzxVarM2.b;
                            iozVar2.b |= 2;
                            iozVar2.d = i2;
                            long j = cursorF.getLong(columnIndexOrThrow3);
                            akzxVarM2.u();
                            ioz iozVar3 = akzxVarM2.b;
                            iozVar3.b |= 4;
                            iozVar3.e = j;
                            if (cursorF.getBlob(columnIndexOrThrow4) != null) {
                                try {
                                    uei ueiVarB = defpackage.alad.B(uei.a, cursorF.getBlob(columnIndexOrThrow4), defpackage.akzq.a());
                                    defpackage.aooh.e(ueiVarB, "parseFrom(...)");
                                    defpackage.aooh.f(ueiVarB, "value");
                                    akzxVarM2.u();
                                    ioz iozVar4 = akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(ueiVarB);
                                    iozVar4.f = ueiVarB;
                                    iozVar4.b |= 8;
                                } catch (defpackage.alaz e) {
                                    throw new java.lang.AssertionError("Unable to parse ClientMetaData from args.", e);
                                }
                            }
                            ioz iozVarR = akzxVarM2.r();
                            defpackage.aooh.e(iozVarR, "build(...)");
                            ioz iozVar5 = iozVarR;
                            defpackage.aooh.f(iozVar5, "value");
                            akzxVarM.u();
                            defpackage.ipa ipaVar = (defpackage.ipa) akzxVarM.b;
                            j$.util.Objects.requireNonNull(iozVar5);
                            defpackage.alat alatVar = ipaVar.b;
                            if (!alatVar.c()) {
                                ipaVar.b = defpackage.alad.J(alatVar);
                            }
                            ipaVar.b.add(iozVar5);
                            cursorF.moveToNext();
                            i = 1;
                            break;
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            defpackage.ajsz.ak(cursorF, th);
                            throw th2;
                        }
                    }
                }
                defpackage.ajsz.ak(cursorF, null);
                defpackage.alad aladVarR = akzxVarM.r();
                defpackage.aooh.e(aladVarR, "build(...)");
                return (defpackage.ipa) aladVarR;
            case 1:
                defpackage.aooc.af(obj);
                ((uch) this.a).e.a();
                return defpackage.aojh.a;
            case 2:
                defpackage.aooc.af(obj);
                return this.a;
            case 3:
                defpackage.aooc.af(obj);
                uxh uxhVar = (uxh) this.a;
                android.speech.tts.TextToSpeech textToSpeech = uxhVar.g;
                if (textToSpeech == null) {
                    throw new java.lang.IllegalStateException("Please call start before checking Voice Download Status");
                }
                uwt uwtVar = uxhVar.b.c;
                if (uwtVar == null) {
                    uwtVar = uwt.a;
                }
                defpackage.aooh.e(uwtVar, "getVoice(...)");
                java.lang.String strAX = defpackage.wsc.aX(uwtVar);
                if (!defpackage.aooh.n(strAX, "default")) {
                    java.lang.String name = textToSpeech.getVoice().getName();
                    defpackage.aooh.e(name, "getName(...)");
                    if (defpackage.aoov.G(name, strAX, false)) {
                        z = textToSpeech.getVoice().getFeatures().contains("notInstalled") && !textToSpeech.getVoice().isNetworkConnectionRequired();
                    }
                } else if (textToSpeech.getVoice().getFeatures().contains("notInstalled")) {
                }
                return java.lang.Boolean.valueOf(z);
            case 4:
                defpackage.aooc.af(obj);
                uxh uxhVar2 = (uxh) this.a;
                android.speech.tts.TextToSpeech textToSpeech2 = uxhVar2.g;
                if (textToSpeech2 == null) {
                    throw new java.lang.IllegalStateException("Stop was called before start!");
                }
                ((defpackage.aimw) uxh.a.b().l("com/android/dialer/tts/api/session/TtsSession", "stop$<anonymous>$<anonymous>", 220, "TtsSession.kt")).v("Stopping TTS Session");
                textToSpeech2.shutdown();
                uxhVar2.g = null;
                uxhVar2.h = false;
                uxhVar2.f.z((defpackage.amsa) uxhVar2.i.r());
                return defpackage.aojh.a;
            case 5:
                defpackage.aooc.af(obj);
                java.lang.String str = ((veo) this.a).c;
                defpackage.aooh.e(str, "getProvisioningStatus(...)");
                defpackage.aimz aimzVar = vjj.a;
                defpackage.aimw aimwVar = (defpackage.aimw) aimzVar.b();
                defpackage.ainp ainpVar = defpackage.zct.a;
                ((defpackage.aimw) aimwVar.i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/advvm/AdvvmProvisioner", "checkSubscriberStatus$<anonymous>", 114, "AdvvmProvisioner.kt")).y("provisioning status = %s", str);
                if (defpackage.aooh.n(str, "R")) {
                    return vjb.d;
                }
                if (defpackage.aooh.n(str, "N")) {
                    return vjb.a;
                }
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) aimzVar.c()).m(defpackage.aioa.MEDIUM)).i(ainpVar).l("com/android/dialer/voicemail/service/impl/vvmclients/omtp/protocol/advvm/AdvvmProvisioner", "checkSubscriberStatus$<anonymous>", 128, "AdvvmProvisioner.kt")).v("unexpected provisioning status, throwing VvmExecutionException with provisioning state unknown");
                throw new vcv(vbs.x);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                try {
                    if (android.os.Build.VERSION.SDK_INT < 33) {
                        android.content.Context context = ((vjm) this.a).a;
                        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    }
                    int i3 = android.os.Build.VERSION.SDK_INT;
                    java.lang.Object obj2 = this.a;
                    if (i3 >= 34) {
                        android.content.Context context2 = ((vjm) obj2).a;
                        packageInfoM = ae$.ExternalSyntheticApiModelOutline0.m(context2.getPackageManager(), context2.getPackageName(), ae$.ExternalSyntheticApiModelOutline0.m(2147483648L));
                    } else {
                        android.content.Context context3 = ((vjm) obj2).a;
                        packageInfoM = ae$.ExternalSyntheticApiModelOutline0.m(context3.getPackageManager(), context3.getPackageName(), ae$.ExternalSyntheticApiModelOutline0.m(-2147483648L));
                    }
                    defpackage.aooh.c(packageInfoM);
                    return packageInfoM.versionName;
                } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                    throw new java.lang.AssertionError("failed to get version name", e2);
                }
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((vnx) this.a).b.isSystemUser());
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(obj);
                try {
                    java.lang.Object obj3 = this.a;
                    defpackage.ojo ojoVar = ((defpackage.vyy) obj3).b;
                    android.net.Uri uri = android.provider.VoicemailContract.Status.CONTENT_URI;
                    defpackage.aooh.e(uri, "CONTENT_URI");
                    defpackage.rsr rsrVar = ((defpackage.vyy) obj3).c;
                    return new java.lang.Integer(ojoVar.a(uri, (java.lang.String) rsrVar.b, (java.lang.String[]) rsrVar.a));
                } catch (java.lang.RuntimeException e3) {
                    j$.util.Objects.checkIndex(0, 4);
                    if ((e3 instanceof java.lang.SecurityException) || (e3 instanceof java.lang.IllegalArgumentException) || (e3 instanceof android.database.sqlite.SQLiteException)) {
                        ((defpackage.aimw) defpackage.vyy.a.b().l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "cleanUp$<anonymous>", 92, "VoicemailStatusDataMigration.kt")).v("Permission missing, provider unavailable, or database error; failed to delete voicemail status data");
                        num = defpackage.aojh.a;
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) defpackage.vyy.a.d()).k(e3).l("com/android/dialer/voicemailstatus/dataservice/impl/VoicemailStatusDataMigration", "cleanUp$<anonymous>", 99, "VoicemailStatusDataMigration.kt")).v("failed to delete voicemail status data from database");
                        num = defpackage.aojh.a;
                    }
                }
                break;
            case 9:
                defpackage.aooc.af(obj);
                java.util.List list = wbt.b;
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    android.net.Uri actualDefaultRingtoneUri = android.media.RingtoneManager.getActualDefaultRingtoneUri(((wbt) this.a).d, ((java.lang.Number) it.next()).intValue());
                    if (actualDefaultRingtoneUri != null) {
                        ((defpackage.aimw) wbt.a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "getDefaultRingtone$<anonymous>", 181, "EchoRingingControllerImpl.kt")).I("Found ringtone for %s, ringtoneUri: %s", list, actualDefaultRingtoneUri.getEncodedPath());
                        return actualDefaultRingtoneUri;
                    }
                }
                return null;
            case 10:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((wbt) this.a).c.a() != 3);
            case 11:
                defpackage.aooc.af(obj);
                android.media.AudioManager audioManager = ((wbt) this.a).e;
                int streamVolume = audioManager.getStreamVolume(4);
                int streamMaxVolume = audioManager.getStreamMaxVolume(4);
                if (streamVolume == streamMaxVolume) {
                    return null;
                }
                try {
                    audioManager.setStreamVolume(4, streamMaxVolume, 0);
                    num = new java.lang.Integer(streamVolume);
                } catch (java.lang.SecurityException e4) {
                    ((defpackage.aimw) ((defpackage.aimw) wbt.a.c()).k(e4).l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "setMaxVolumeAndGetPreviousVolume$<anonymous>", 205, "EchoRingingControllerImpl.kt")).v("Could not set stream volume to maximum.");
                    return null;
                }
                break;
                break;
            case 12:
                defpackage.aooc.af(obj);
                android.media.MediaRouter mediaRouter = (android.media.MediaRouter) ((wbt) this.a).d.getSystemService(android.media.MediaRouter.class);
                android.media.MediaRouter.RouteInfo selectedRoute = mediaRouter.getSelectedRoute(1);
                android.media.MediaRouter.RouteInfo defaultRoute = mediaRouter.getDefaultRoute();
                if (defpackage.aooh.n(selectedRoute, defaultRoute)) {
                    return null;
                }
                ((defpackage.aimw) wbt.a.b().l("com/android/dialer/wear/echo/impl/ringer/impl/EchoRingingControllerImpl", "setPhoneSpeakerAsAudioRouteAndGetPreviousAudioRoute$<anonymous>", 238, "EchoRingingControllerImpl.kt")).y("Setting audio route to: %s.", defaultRoute.getDescription());
                mediaRouter.selectRoute(1, defaultRoute);
                return selectedRoute;
            case 13:
                defpackage.aooc.af(obj);
                defpackage.akzx akzxVarM3 = amtl.a.m();
                defpackage.aooh.f(akzxVarM3, "builder");
                ihb ihbVar = ihb.a;
                java.lang.Integer num2 = new java.lang.Integer(0);
                java.util.EnumMap enumMap = ((wjr) this.a).c;
                java.lang.Object orDefault = j$.util.Map.-EL.getOrDefault(enumMap, ihbVar, num2);
                defpackage.aooh.e(orDefault, "getOrDefault(...)");
                int iIntValue = ((java.lang.Number) orDefault).intValue();
                akzxVarM3.u();
                amtl amtlVar = akzxVarM3.b;
                amtlVar.b |= 1;
                amtlVar.c = iIntValue;
                java.lang.Object orDefault2 = j$.util.Map.-EL.getOrDefault(enumMap, ihb.b, new java.lang.Integer(0));
                defpackage.aooh.e(orDefault2, "getOrDefault(...)");
                int iIntValue2 = ((java.lang.Number) orDefault2).intValue();
                akzxVarM3.u();
                amtl amtlVar2 = akzxVarM3.b;
                amtlVar2.b |= 2;
                amtlVar2.d = iIntValue2;
                java.lang.Object orDefault3 = j$.util.Map.-EL.getOrDefault(enumMap, ihb.c, new java.lang.Integer(0));
                defpackage.aooh.e(orDefault3, "getOrDefault(...)");
                int iIntValue3 = ((java.lang.Number) orDefault3).intValue();
                akzxVarM3.u();
                amtl amtlVar3 = akzxVarM3.b;
                amtlVar3.b |= 4;
                amtlVar3.e = iIntValue3;
                java.lang.Object orDefault4 = j$.util.Map.-EL.getOrDefault(enumMap, ihb.d, new java.lang.Integer(0));
                defpackage.aooh.e(orDefault4, "getOrDefault(...)");
                int iIntValue4 = ((java.lang.Number) orDefault4).intValue();
                akzxVarM3.u();
                amtl amtlVar4 = akzxVarM3.b;
                amtlVar4.b |= 8;
                amtlVar4.f = iIntValue4;
                java.lang.Object orDefault5 = j$.util.Map.-EL.getOrDefault(enumMap, ihb.e, new java.lang.Integer(0));
                defpackage.aooh.e(orDefault5, "getOrDefault(...)");
                int iIntValue5 = ((java.lang.Number) orDefault5).intValue();
                akzxVarM3.u();
                amtl amtlVar5 = akzxVarM3.b;
                amtlVar5.b |= 16;
                amtlVar5.g = iIntValue5;
                amtl amtlVarR = akzxVarM3.r();
                defpackage.aooh.e(amtlVarR, "build(...)");
                return amtlVarR;
            case 14:
                defpackage.aooc.af(obj);
                ((wjr) this.a).c.clear();
                return defpackage.aojh.a;
            case 15:
                defpackage.aooc.af(obj);
                wjt wjtVar = (wjt) this.a;
                wjtVar.b.clear();
                wjtVar.c.clear();
                wjtVar.d = null;
                return defpackage.aojh.a;
            case 16:
                defpackage.aooc.af(obj);
                return ((wpx) ((ahdv) this.a).e).e();
            case 17:
                defpackage.aooc.af(obj);
                ((yzk) this.a).i = 3;
                return defpackage.aojh.a;
            case 18:
                defpackage.aooc.af(obj);
                ((yzk) this.a).i = 3;
                return defpackage.aojh.a;
            case 19:
                defpackage.aooc.af(obj);
                ((yzk) this.a).i = 3;
                return defpackage.aojh.a;
            default:
                defpackage.aooc.af(obj);
                try {
                    android.content.Context context4 = ((zde) this.a).b;
                    android.content.pm.PackageInfo packageInfo = context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0);
                    long jM = ft$.ExternalSyntheticApiModelOutline0.m(packageInfo);
                    java.lang.String str2 = packageInfo.versionName;
                    if (str2 == null) {
                        str2 = "Version Name Not Found";
                    }
                    return new zdc(jM, str2);
                } catch (android.content.pm.PackageManager.NameNotFoundException e5) {
                    ((defpackage.aimw) ((defpackage.aimw) zde.a.b()).k(e5).l("com/google/android/callingshared/logging/appinfo/AppInfo", "memoizedAppInfo$<anonymous>$<anonymous>", 38, "AppInfo.kt")).v("failed to get the app version name");
                    return new zdc(-1L, "Version Name Not Found");
                }
        }
        return num;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.uer((defpackage.ues) this.a, aolnVar, 0);
            case 1:
                return new defpackage.uer((uch) this.a, aolnVar, 1);
            case 2:
                return new defpackage.uer((defpackage.unv) this.a, aolnVar, 2);
            case 3:
                return new defpackage.uer((uxh) this.a, aolnVar, 3);
            case 4:
                return new defpackage.uer((uxh) this.a, aolnVar, 4, (byte[]) null);
            case 5:
                return new defpackage.uer((veo) this.a, aolnVar, 5);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.uer((vjm) this.a, aolnVar, 6);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.uer((vnx) this.a, aolnVar, 7);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.uer((defpackage.vyy) this.a, aolnVar, 8);
            case 9:
                return new defpackage.uer((wbt) this.a, aolnVar, 9);
            case 10:
                return new defpackage.uer((wbt) this.a, aolnVar, 10, (byte[]) null);
            case 11:
                return new defpackage.uer((wbt) this.a, aolnVar, 11, (char[]) null);
            case 12:
                return new defpackage.uer((wbt) this.a, aolnVar, 12, (short[]) null);
            case 13:
                return new defpackage.uer((wjr) this.a, aolnVar, 13);
            case 14:
                return new defpackage.uer((wjr) this.a, aolnVar, 14, (byte[]) null);
            case 15:
                return new defpackage.uer((wjt) this.a, aolnVar, 15);
            case 16:
                return new defpackage.uer((ahdv) this.a, aolnVar, 16);
            case 17:
                return new defpackage.uer((yzk) this.a, aolnVar, 17);
            case 18:
                return new defpackage.uer((yzk) this.a, aolnVar, 18, (byte[]) null);
            case 19:
                return new defpackage.uer((yzk) this.a, aolnVar, 19, (char[]) null);
            default:
                return new defpackage.uer((zde) this.a, aolnVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(uch uchVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uchVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(defpackage.ues uesVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uesVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(defpackage.unv unvVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = unvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(uxh uxhVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(uxh uxhVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = uxhVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(veo veoVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = veoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(vjm vjmVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vjmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(vnx vnxVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vnxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(defpackage.vyy vyyVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = vyyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wbt wbtVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wbt wbtVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wbt wbtVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wbt wbtVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wjr wjrVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wjr wjrVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wjrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(wjt wjtVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = wjtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(yzk yzkVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = yzkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(yzk yzkVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = yzkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(yzk yzkVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = yzkVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uer(zde zdeVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = zdeVar;
    }
}
