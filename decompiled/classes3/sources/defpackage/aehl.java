package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class aehl extends defpackage.xfr {
    protected final android.content.Intent performCreateIntent(android.content.Context context, android.content.Intent intent) {
        aooh.f(context, "context");
        aooh.f(intent, "arg");
        prepareIntent(context, intent);
        return intent;
    }

    @Override // defpackage.xfp
    protected final android.content.Intent performExtractArgument(android.content.Intent intent) {
        aooh.f(intent, "intent");
        return intent;
    }

    protected void prepareIntent(android.content.Context context, android.content.Intent intent) {
        aooh.f(context, "context");
        aooh.f(intent, "intent");
    }

    @Override // defpackage.xfp
    public /* bridge */ /* synthetic */ java.lang.Object performExtractArgument(android.content.Intent intent) {
        performExtractArgument(intent);
        return intent;
    }

    @Override // defpackage.xfp
    public /* bridge */ /* synthetic */ android.content.Intent performCreateIntent(android.content.Context context, java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        performCreateIntent(context, intent);
        return intent;
    }
}
