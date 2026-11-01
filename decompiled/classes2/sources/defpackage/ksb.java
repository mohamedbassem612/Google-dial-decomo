package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ksb extends or {
    public static final defpackage.ksb a = new defpackage.ksb();

    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        aooh.f(context, "context");
        aooh.f(intent, "input");
        return intent;
    }

    public final /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        return new defpackage.ksc(i == -1);
    }
}
