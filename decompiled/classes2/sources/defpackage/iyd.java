package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iyd extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        aooh.f((aojh) obj, "input");
        return new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.beesly.impl.settings.greeting.ui.RecordGreetingActivity.class);
    }

    public final /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i, intent);
    }
}
