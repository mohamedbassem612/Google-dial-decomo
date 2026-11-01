package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sfq extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        aooh.f((aojh) obj, "input");
        defpackage.sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$Companion$contactPickerActivityResultContract$<anonymous>", "createIntent", 508, "CallingCardSettingsFragmentPeer.kt").v("createIntent");
        android.content.Intent intent = new android.content.Intent("com.android.contacts.action.PICK_CONTACT_FOR_CALLING_CARD");
        intent.addFlags(1);
        return intent;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        defpackage.sfz.a.b().l("com/android/dialer/patrick/impl/settings/ui/CallingCardSettingsFragmentPeer$Companion$contactPickerActivityResultContract$<anonymous>", "parseResult", 516, "CallingCardSettingsFragmentPeer.kt").v("parseResult");
        if (i != -1 || intent == null) {
            return null;
        }
        return intent.getData();
    }
}
