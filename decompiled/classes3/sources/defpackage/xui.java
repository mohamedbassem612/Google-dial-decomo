package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xui implements defpackage.xun {
    final /* synthetic */ defpackage.xvp a;
    final /* synthetic */ defpackage.xxt b;

    public xui(defpackage.xvp xvpVar, defpackage.xxt xxtVar) {
        this.a = xvpVar;
        this.b = xxtVar;
    }

    @Override // defpackage.xun
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType a(defpackage.xug xugVar) throws java.lang.Throwable {
        defpackage.yby ybyVar;
        try {
            ybyVar = new defpackage.yby(new java.io.FileInputStream(this.a.a().getFileDescriptor()), this.b);
            try {
                com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageTypeA = xugVar.a(ybyVar);
                ybyVar.b();
                this.a.a();
                return imageHeaderParser$ImageTypeA;
            } catch (java.lang.Throwable th) {
                th = th;
                if (ybyVar != null) {
                    ybyVar.b();
                }
                this.a.a();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            ybyVar = null;
        }
    }
}
