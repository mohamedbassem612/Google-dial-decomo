package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fdh extends defpackage.ewx implements defpackage.fdi {
    private final android.content.Context c;
    private final int d;

    public fdh(android.content.Context context) {
        super(new defpackage.ewu[1], new defpackage.fdl[1]);
        this.c = context;
        this.d = -1;
    }

    @Override // defpackage.ewx
    protected final /* synthetic */ defpackage.ews g(java.lang.Throwable th) {
        return new defpackage.fdj("Unexpected decode error", th);
    }

    @Override // defpackage.ewx
    protected final /* bridge */ /* synthetic */ defpackage.ews h(defpackage.ewu ewuVar, defpackage.ewv ewvVar, boolean z) {
        defpackage.fdj fdjVar;
        android.graphics.BitmapFactory.Options options;
        defpackage.fdl fdlVar = (defpackage.fdl) ewvVar;
        java.nio.ByteBuffer byteBuffer = ewuVar.d;
        ahvr.ci(byteBuffer);
        ahvr.bY(byteBuffer.hasArray());
        int i = 0;
        ahvr.bM(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.d;
            if (iMax == -1) {
                android.content.Context context = this.c;
                if (context != null) {
                    android.graphics.Point pointD = eum.D(context);
                    int i2 = pointD.x;
                    int i3 = pointD.y;
                    defpackage.eqg eqgVar = ewuVar.b;
                    iMax = (java.lang.Math.max(i2, i3) << 1) - 1;
                } else {
                    iMax = 4096;
                }
            }
            byte[] bArrArray = byteBuffer.array();
            int iRemaining = byteBuffer.remaining();
            if (iMax != -1) {
                options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeByteArray(bArrArray, 0, iRemaining, options);
                options.inJustDecodeBounds = false;
                options.inSampleSize = 1;
                for (int iMax2 = java.lang.Math.max(options.outWidth, options.outHeight); iMax2 > iMax; iMax2 /= 2) {
                    options.inSampleSize <<= 1;
                }
            } else {
                options = null;
            }
            android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrArray, 0, iRemaining, options);
            if (options != null) {
                options.inSampleSize = 1;
            }
            if (bitmapDecodeByteArray == null) {
                throw new defpackage.era("Could not decode image data", new java.lang.IllegalStateException(), true, 1);
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArrArray);
            try {
                defpackage.ekq ekqVar = new defpackage.ekq(byteArrayInputStream);
                byteArrayInputStream.close();
                switch (ekqVar.d()) {
                    case 3:
                    case 4:
                        i = 180;
                        break;
                    case 5:
                    case 8:
                        i = 270;
                        break;
                    case 6:
                    case 7:
                        i = 90;
                        break;
                }
                if (i != 0) {
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.postRotate(i);
                    bitmapDecodeByteArray = android.graphics.Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
                }
                fdlVar.e = bitmapDecodeByteArray;
                fdlVar.b = ewuVar.f;
                return null;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (defpackage.era e) {
            fdjVar = new defpackage.fdj("Could not decode image data with BitmapFactory.", e);
            return fdjVar;
        } catch (java.io.IOException e2) {
            fdjVar = new defpackage.fdj(e2);
            return fdjVar;
        }
    }

    @Override // defpackage.ewx
    protected final defpackage.ewu i() {
        return new defpackage.ewu(1);
    }

    @Override // defpackage.ewx
    protected final /* synthetic */ defpackage.ewv k() {
        return new defpackage.fdl(this);
    }

    @Override // defpackage.fdi
    public final /* bridge */ /* synthetic */ defpackage.fdl p() {
        return (defpackage.fdl) super.b();
    }
}
