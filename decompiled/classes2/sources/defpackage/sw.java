package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class sw {
    public android.os.Bundle b;
    private android.app.ActivityOptions d;
    public final android.content.Intent a = new android.content.Intent("android.intent.action.VIEW");
    public final defpackage.ve c = new defpackage.ve();

    public final vx a() {
        android.content.Intent intent = this.a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(this.c.b().a());
        android.os.Bundle bundle2 = this.b;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        android.os.LocaleList localeListM = fh$.ExternalSyntheticApiModelOutline0.m();
        java.lang.String languageTag = aa$.ExternalSyntheticApiModelOutline1.m(localeListM) > 0 ? aa$.ExternalSyntheticApiModelOutline1.m(localeListM, 0).toLanguageTag() : null;
        if (!android.text.TextUtils.isEmpty(languageTag)) {
            android.os.Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new android.os.Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            android.app.ActivityOptions activityOptionsMakeBasic = this.d;
            if (activityOptionsMakeBasic == null) {
                activityOptionsMakeBasic = android.app.ActivityOptions.makeBasic();
                this.d = activityOptionsMakeBasic;
            }
            rp$.ExternalSyntheticApiModelOutline0.m(activityOptionsMakeBasic, false);
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            if (this.d == null) {
                this.d = android.app.ActivityOptions.makeBasic();
            }
            this.d.setAllowPassThroughOnTouchOutside(!intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        android.app.ActivityOptions activityOptions = this.d;
        return new vx(intent, activityOptions != null ? activityOptions.toBundle() : null);
    }
}
