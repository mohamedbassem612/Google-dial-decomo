package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahhz implements defpackage.xzp {
    private static final aimz a = aimz.i("com/google/apps/tiktok/media/contrib/fife/FifeModelLoader");
    private final defpackage.xzp b;

    public ahhz(defpackage.xzp xzpVar) {
        this.b = xzpVar;
    }

    @Override // defpackage.xzp
    public final /* synthetic */ boolean a(java.lang.Object obj) {
        return defpackage.akvx.e(android.net.Uri.parse(((defpackage.ahhx) obj).a));
    }

    @Override // defpackage.xzp
    public final /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        defpackage.ahhx ahhxVar = (defpackage.ahhx) obj;
        try {
            defpackage.akwa akwaVar = new defpackage.akwa(new defpackage.ulw(ahhxVar.c.a, (byte[]) null));
            if (i != Integer.MIN_VALUE) {
                akwaVar.b(i);
            }
            if (i2 != Integer.MIN_VALUE) {
                akwaVar.a(i2);
            }
            try {
                return this.b.b(new defpackage.xzg(((android.net.Uri) defpackage.akvx.f(akwaVar, new defpackage.abzr(android.net.Uri.parse(ahhxVar.a)), true)).toString(), ahhxVar.b), i, i2, xusVar);
            } catch (defpackage.akvv e) {
                throw new defpackage.abzs(e);
            }
        } catch (defpackage.abzs e2) {
            a.by(a.c(), "Unable to apply FIFE options", "com/google/apps/tiktok/media/contrib/fife/FifeModelLoader", "buildLoadData", '1', "FifeModelLoader.java", e2);
            return null;
        }
    }
}
