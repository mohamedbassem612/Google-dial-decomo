package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhv implements defpackage.xzp {
    public final defpackage.xzp a;
    public final ahpz b;
    public final defpackage.ahjs c;
    public final ajct d;

    public ahhv(defpackage.xzp xzpVar, ahpz ahpzVar, defpackage.ahjs ahjsVar, ajct ajctVar) {
        this.a = xzpVar;
        this.b = ahpzVar;
        this.c = ahjsVar;
        this.d = ajctVar;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        defpackage.xzg xzgVar = (defpackage.xzg) obj;
        com.google.apps.tiktok.account.AccountId accountId = (com.google.apps.tiktok.account.AccountId) xusVar.b(defpackage.agqz.a);
        android.net.Uri uri = android.net.Uri.parse(xzgVar.c());
        if (accountId == null) {
            return this.a.b(xzgVar, i, i2, xusVar);
        }
        if (!"https".equals(uri.getScheme())) {
            return this.a.b(xzgVar, i, i2, xusVar);
        }
        if (!defpackage.akvx.e(uri)) {
            return this.a.b(xzgVar, i, i2, xusVar);
        }
        return new ucm(new defpackage.ahib(xzgVar, accountId), new defpackage.ahhu(this, xzgVar, i, i2, xusVar));
    }
}
