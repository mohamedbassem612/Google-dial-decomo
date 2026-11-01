package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ydd implements defpackage.ydf {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public ydd(android.content.res.Resources resources, int i) {
        this.$cid = i;
        anty.aI(resources, "Argument must not be null");
        this.a = resources;
    }

    @Override // defpackage.ydf
    public final defpackage.xxe a(defpackage.xxe xxeVar, defpackage.xus xusVar) {
        if (this.$cid == 0) {
            return defpackage.ybv.f((android.content.res.Resources) this.a, xxeVar);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.Bitmap) xxeVar.c()).compress((android.graphics.Bitmap.CompressFormat) this.a, 100, byteArrayOutputStream);
        xxeVar.e();
        return new defpackage.ycl(byteArrayOutputStream.toByteArray(), 0);
    }

    public ydd(int i) {
        this.$cid = i;
        this.a = android.graphics.Bitmap.CompressFormat.JPEG;
    }
}
