package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uoj extends or {
    public final /* bridge */ /* synthetic */ android.content.Intent createIntent(android.content.Context context, java.lang.Object obj) {
        aooh.f(context, "context");
        aooh.f((aojh) obj, "input");
        return new android.content.Intent("android.intent.action.PICK", android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object parseResult(int i, android.content.Intent intent) {
        if (i != -1 || intent == null) {
            return null;
        }
        return intent.getData();
    }
}
