package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abxo extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        return defpackage.abxl.h((defpackage.abxn) obj);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        byte[] byteArrayExtra;
        if (i != -1 || intent == null || (byteArrayExtra = intent.getByteArrayExtra("patrickDataKey")) == null) {
            return null;
        }
        return (defpackage.abxt) alad.y(defpackage.abxt.a, byteArrayExtra);
    }
}
