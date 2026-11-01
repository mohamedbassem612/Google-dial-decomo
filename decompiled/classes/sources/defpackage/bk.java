package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class bk extends defpackage.or {
    @Override // defpackage.or
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        android.os.Bundle bundleExtra;
        androidx.activity.result.IntentSenderRequest intentSenderRequestA = (androidx.activity.result.IntentSenderRequest) obj;
        android.content.Intent intent = new android.content.Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        android.content.Intent intent2 = intentSenderRequestA.b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                op opVar = new op(intentSenderRequestA.a);
                opVar.b(intentSenderRequestA.d, intentSenderRequestA.c);
                intentSenderRequestA = opVar.a();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", (android.os.Parcelable) intentSenderRequestA);
        if (defpackage.bo.Z(2)) {
            intent.toString();
            android.util.Log.v("FragmentManager", "CreateIntent created the following intent: ".concat(intent.toString()));
        }
        return intent;
    }

    @Override // defpackage.or
    public final /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i, intent);
    }
}
