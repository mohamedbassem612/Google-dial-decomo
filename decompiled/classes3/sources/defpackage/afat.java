package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afat extends defpackage.afay {
    final /* synthetic */ java.lang.String a;

    public afat(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.afay
    protected final int a(android.content.Context context, defpackage.afpl afplVar, boolean z) {
        android.content.pm.ProviderInfo providerInfo = (android.content.pm.ProviderInfo) afplVar.b;
        if (context.getPackageName().equals(providerInfo.packageName)) {
            if (!z) {
                return 2;
            }
        } else {
            if (z) {
                return 2;
            }
            if (!this.a.equals(providerInfo.packageName)) {
                return 3;
            }
        }
        return 1;
    }
}
