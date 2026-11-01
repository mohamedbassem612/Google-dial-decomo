package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class pb extends defpackage.or {
    @Override // defpackage.or
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(intent, "input");
        return intent;
    }

    @Override // defpackage.or
    public final /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        return new androidx.activity.result.ActivityResult(i, intent);
    }
}
