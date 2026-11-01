package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ycl implements defpackage.xxe {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public ycl(byte[] bArr, int i) {
        this.$cid = i;
        anty.aI(bArr, "Argument must not be null");
        this.a = bArr;
    }

    @Override // defpackage.xxe
    public final int a() {
        int i = this.$cid;
        if (i == 0) {
            return ((byte[]) this.a).length;
        }
        java.lang.Object obj = this.a;
        if (i == 1) {
            return defpackage.ygc.a((android.graphics.Bitmap) obj);
        }
        android.graphics.drawable.PictureDrawable pictureDrawable = (android.graphics.drawable.PictureDrawable) obj;
        return (pictureDrawable.getIntrinsicHeight() * pictureDrawable.getIntrinsicWidth()) << 2;
    }

    @Override // defpackage.xxe
    public final java.lang.Class b() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? android.graphics.drawable.PictureDrawable.class : android.graphics.Bitmap.class;
        }
        return byte[].class;
    }

    @Override // defpackage.xxe
    public final /* synthetic */ java.lang.Object c() {
        int i = this.$cid;
        return this.a;
    }

    @Override // defpackage.xxe
    public final void e() {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return;
        }
        ((android.graphics.drawable.PictureDrawable) this.a).setPicture(null);
    }

    public ycl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
