package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xuh implements defpackage.xun {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public xuh(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.xun
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType a(defpackage.xug xugVar) throws java.io.IOException {
        com.bumptech.glide.load.ImageHeaderParser$ImageType imageHeaderParser$ImageTypeB;
        if (this.$cid != 0) {
            try {
                imageHeaderParser$ImageTypeB = xugVar.a((java.io.InputStream) this.a);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        } else {
            try {
                imageHeaderParser$ImageTypeB = xugVar.b((java.nio.ByteBuffer) this.a);
            } finally {
                defpackage.yfp.b((java.nio.ByteBuffer) this.a);
            }
        }
        return imageHeaderParser$ImageTypeB;
    }
}
