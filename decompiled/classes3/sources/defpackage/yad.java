package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yad implements defpackage.xzp {
    public static final defpackage.xur a = new defpackage.xur("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500, defpackage.xur.a);
    private final defpackage.vqu b;

    public yad(defpackage.vqu vquVar) {
        this.b = vquVar;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj) {
        return true;
    }

    @Override // defpackage.xzp
    public final /* bridge */ /* synthetic */ ucm b(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) {
        defpackage.vqu vquVar = this.b;
        defpackage.xzg xzgVar = (defpackage.xzg) obj;
        defpackage.xzg xzgVar2 = (defpackage.xzg) vquVar.w(xzgVar, 0, 0);
        if (xzgVar2 == null) {
            vquVar.x(xzgVar, 0, 0, xzgVar);
        } else {
            xzgVar = xzgVar2;
        }
        return new ucm(xzgVar, new defpackage.xvk(xzgVar, ((java.lang.Integer) xusVar.b(a)).intValue()));
    }
}
