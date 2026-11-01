package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mlz implements mlr {
    final /* synthetic */ android.content.Context a;

    public mlz(android.content.Context context) {
        this.a = context;
    }

    public final void a() {
        defpackage.mma.b.b().l("com/android/dialer/disconnectprompt/service/DisconnectPromptProducerModule$Companion$openWifiCallingSettingsClickListener$<anonymous>", "onClick", 144, "DisconnectPromptProducerModule.kt").v("opening WiFi calling settings");
        android.content.Intent flags = new android.content.Intent("android.settings.WIFI_CALLING_SETTINGS").setPackage("com.android.settings").setFlags(268435456);
        aooh.e(flags, "setFlags(...)");
        ahqx.l(this.a, flags);
    }
}
