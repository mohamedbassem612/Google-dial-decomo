package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class sws implements java.util.concurrent.Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ sws(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r9v120, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v122, types: [java.lang.Object, java.util.List] */
    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.$cid) {
            case 0:
                swt swtVar = (swt) this.a;
                if (!swtVar.s.b(defpackage.zpo.f).isEmpty()) {
                    swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "doesCurrentActiveCallExist", 570, "TidepodsRevelioGatekeeper.java").v("an active Dialer call was found");
                    return java.lang.Boolean.TRUE;
                }
                oju ojuVar = swtVar.r;
                if (ojuVar.b() == 2) {
                    swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "doesCurrentActiveCallExist", 574, "TidepodsRevelioGatekeeper.java").v("Some app is in call mode");
                    return java.lang.Boolean.TRUE;
                }
                if (ojuVar.b() != 3) {
                    return java.lang.Boolean.FALSE;
                }
                swt.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/TidepodsRevelioGatekeeper", "doesCurrentActiveCallExist", 578, "TidepodsRevelioGatekeeper.java").v("Some app is in communication mode");
                return java.lang.Boolean.TRUE;
            case 1:
                java.lang.Object obj = this.a;
                ahoq ahoqVarW = ahvr.W(847, "MotoSuggestionProvider_setupIsAvailableMemoize");
                try {
                    java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(((defpackage.svm) obj).c.getPackageManager().resolveContentProvider("com.motorola.android.providers.userpreferredsim", 1048576) != null);
                    ahoqVarW.close();
                    return boolValueOf;
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW.close();
                        break;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 2:
                return java.lang.Boolean.valueOf(((defpackage.szs) this.a).w);
            case 3:
                defpackage.szs szsVar = (defpackage.szs) this.a;
                return java.lang.Boolean.valueOf(szsVar.x.isPresent() && !((java.lang.Boolean) szsVar.x.orElseThrow()).booleanValue());
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_CACHE /* 4 */:
                return java.lang.Boolean.valueOf(((defpackage.szs) this.a).A);
            case org.chromium.net.UrlRequest$Status.DOWNLOADING_PAC_FILE /* 5 */:
                return java.lang.Boolean.valueOf(((defpackage.szs) this.a).z);
            case org.chromium.net.UrlRequest$Status.RESOLVING_PROXY_FOR_URL /* 6 */:
                ((defpackage.szs) this.a).B = true;
                return null;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST_IN_PAC_FILE /* 7 */:
                return ((defpackage.szs) this.a).y;
            case org.chromium.net.UrlRequest$Status.ESTABLISHING_PROXY_TUNNEL /* 8 */:
                defpackage.szs szsVar2 = (defpackage.szs) this.a;
                if (!szsVar2.x.isPresent()) {
                    defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "canAutoRejectCallDueToSpam", 652, "RevelioController.java").v("caller spam status check has not completed");
                    return java.lang.Boolean.FALSE;
                }
                java.lang.Boolean bool = (java.lang.Boolean) szsVar2.x.orElseThrow();
                bool.booleanValue();
                defpackage.szs.a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "canAutoRejectCallDueToSpam", 657, "RevelioController.java").y("isCallerSpam: %b", bool);
                return bool;
            case org.chromium.net.UrlRequest$Status.RESOLVING_HOST /* 9 */:
                defpackage.tam tamVar = (defpackage.tam) this.a;
                return java.lang.Boolean.valueOf(tamVar.d() && tamVar.n);
            case org.chromium.net.UrlRequest$Status.CONNECTING /* 10 */:
                android.content.Context context = (android.content.Context) ((hwv) this.a).b;
                android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean(context.getString(2132017914), true).apply();
                return null;
            case org.chromium.net.UrlRequest$Status.SSL_HANDSHAKE /* 11 */:
                android.content.Context context2 = (android.content.Context) ((hwv) this.a).b;
                return java.lang.Boolean.valueOf(android.preference.PreferenceManager.getDefaultSharedPreferences(context2).getBoolean(context2.getString(2132017914), false));
            case org.chromium.net.UrlRequest$Status.SENDING_REQUEST /* 12 */:
                return java.lang.Integer.valueOf(android.provider.Settings.Secure.getInt(((tcu) this.a).b.getContentResolver(), "rtt_calling_mode", 0));
            case org.chromium.net.UrlRequest$Status.WAITING_FOR_RESPONSE /* 13 */:
                return java.lang.Integer.valueOf(android.provider.Settings.Secure.getInt(((tcu) this.a).b.getContentResolver(), "dialer_rtt_configuration", 0));
            case org.chromium.net.UrlRequest$Status.READING_RESPONSE /* 14 */:
                defpackage.tdd tddVar = (defpackage.tdd) this.a;
                zjs zjsVar = tddVar.e;
                if (!zjsVar.z()) {
                    defpackage.tdd.a.b().l("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService", "shouldShowTtySetting", 185, "AccessibilitySettingsService.java").v("tty disabled on device: TelecomManager#isTtySupported()=false");
                    return java.lang.Boolean.FALSE;
                }
                java.util.Iterator it = zjsVar.s().iterator();
                while (it.hasNext()) {
                    android.os.PersistableBundle persistableBundle = (android.os.PersistableBundle) tddVar.l.a(tddVar.k.b((android.telecom.PhoneAccountHandle) it.next())).orElse((java.lang.Object) null);
                    if (persistableBundle != null && persistableBundle.getBoolean("tty_supported_bool")) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                defpackage.tdd.a.b().l("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService", "shouldShowTtySetting", 203, "AccessibilitySettingsService.java").v("tty disabled by carrier-config: tty_supported_bool=false");
                return java.lang.Boolean.FALSE;
            case 15:
                if (((defpackage.tdd) this.a).f.Y()) {
                    return java.lang.Boolean.TRUE;
                }
                defpackage.tdd.a.b().l("com/android/dialer/rtt/settings/impl/service/AccessibilitySettingsService", "shouldShowHearingAidPreference", 297, "AccessibilitySettingsService.java").v("hac disabled on device: TelephonyManager#isHearingAidCompatibilitySupportedLegacy()=false");
                return java.lang.Boolean.FALSE;
            case 16:
                zjs zjsVar2 = ((defpackage.tdd) this.a).e;
                java.util.Iterator it2 = zjsVar2.s().iterator();
                while (it2.hasNext()) {
                    j$.util.Optional optionalJ = zjsVar2.j((android.telecom.PhoneAccountHandle) it2.next());
                    if (optionalJ.isPresent() && ((android.telecom.PhoneAccount) optionalJ.orElseThrow()).hasCapabilities(4096)) {
                        return java.lang.Boolean.TRUE;
                    }
                }
                return java.lang.Boolean.FALSE;
            case 17:
                return java.lang.Boolean.valueOf(android.provider.Settings.Secure.getInt(((android.content.Context) ((defpackage.taq) this.a).b).getContentResolver(), "hearing_aid", 0) == 1);
            case 18:
                int i = android.provider.Settings.Secure.getInt(((android.content.Context) ((defpackage.sgi) this.a).a).getContentResolver(), "preferred_tty_mode", 0);
                if (i != 0) {
                    if (i == 1) {
                        return defpackage.tde.b;
                    }
                    if (i == 2) {
                        return defpackage.tde.c;
                    }
                    if (i == 3) {
                        return defpackage.tde.d;
                    }
                }
                return defpackage.tde.a;
            case 19:
                aimz aimzVar = defpackage.tib.a;
                aigb aigbVar = new aigb(4);
                java.util.Iterator it3 = this.a.iterator();
                while (it3.hasNext()) {
                    ailj ailjVarK = ((aigf) aiql.H((ajcq) it3.next())).e().k();
                    while (ailjVarK.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) ailjVarK.next();
                        aigbVar.i((java.lang.Long) entry.getKey(), aify.n((java.util.Collection) entry.getValue()));
                    }
                }
                return aigbVar.e(true);
            default:
                aimz aimzVar2 = defpackage.tic.a;
                aihb aihbVar = new aihb();
                java.util.Iterator it4 = this.a.iterator();
                while (it4.hasNext()) {
                    aihbVar.k((java.lang.Iterable) aiql.H((ajcq) it4.next()));
                }
                return aihbVar.h();
        }
    }
}
