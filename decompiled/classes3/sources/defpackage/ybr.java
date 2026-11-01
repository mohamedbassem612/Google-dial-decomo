package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybr implements defpackage.ybt {
    private final java.nio.ByteBuffer a;
    private final java.util.List b;
    private final boolean c;
    private final defpackage.xxt d;

    public ybr(java.nio.ByteBuffer byteBuffer, java.util.List list, defpackage.xxt xxtVar, boolean z) {
        this.a = byteBuffer;
        this.b = list;
        this.d = xxtVar;
        this.c = z;
    }

    @Override // defpackage.ybt
    public final int a() {
        return defpackage.xff.F(this.b, defpackage.yfp.b(this.a), this.d);
    }

    @Override // defpackage.ybt
    public final android.graphics.Bitmap b(android.graphics.BitmapFactory.Options options) {
        boolean z = this.c;
        java.nio.ByteBuffer byteBuffer = this.a;
        if (!z) {
            return defpackage.xfh.x(new defpackage.yfo(defpackage.yfp.b(byteBuffer)), options, this);
        }
        defpackage.yfp.b(byteBuffer);
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            return defpackage.xfh.w(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), options, this);
        }
        byte[] bArrD = defpackage.yfp.d(byteBuffer);
        return defpackage.xfh.w(bArrD, 0, bArrD.length, options, this);
    }

    @Override // defpackage.ybt
    public final com.bumptech.glide.load.ImageHeaderParser$ImageType c() {
        return defpackage.xff.B(this.b, defpackage.yfp.b(this.a));
    }

    @Override // defpackage.ybt
    public final boolean e() {
        java.nio.ByteBuffer byteBufferB = defpackage.yfp.b(this.a);
        if (byteBufferB == null) {
            return false;
        }
        return defpackage.xff.D(this.b, new defpackage.xuk(byteBufferB, this.d, 1));
    }

    @Override // defpackage.ybt
    public final void d() {
    }
}
