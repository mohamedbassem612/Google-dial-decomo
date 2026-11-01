package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tve {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/shortcuts/IconFactory");
    private final android.content.Context b;
    private final defpackage.aoin c;

    public tve(android.content.Context context, defpackage.aoin aoinVar) {
        this.b = context;
        this.c = aoinVar;
    }

    private final android.graphics.drawable.Icon b(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        int i;
        int iMax;
        int iMax2;
        android.graphics.Bitmap bitmapCreateScaledBitmap;
        android.content.Context context = this.b;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166225);
        if (uri != null) {
            try {
                java.io.InputStream inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(context.getContentResolver(), uri, false);
                if (inputStreamOpenContactPhotoInputStream != null) {
                    try {
                        byte[] bArrB = defpackage.aisk.b(inputStreamOpenContactPhotoInputStream);
                        int length = bArrB.length;
                        if (length > 0) {
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            android.graphics.BitmapFactory.decodeByteArray(bArrB, 0, length, options);
                            if (options.outWidth > 0 && options.outHeight > 0) {
                                int i2 = options.outWidth;
                                int i3 = options.outHeight;
                                if (i3 > dimensionPixelSize || i2 > dimensionPixelSize) {
                                    int i4 = i3 / 2;
                                    int i5 = i2 / 2;
                                    i = 1;
                                    while (i4 / i >= dimensionPixelSize && i5 / i >= dimensionPixelSize) {
                                        i <<= 1;
                                    }
                                } else {
                                    i = 1;
                                }
                                options.inSampleSize = i;
                                options.inJustDecodeBounds = false;
                                android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrB, 0, bArrB.length, options);
                                if (bitmapDecodeByteArray != null) {
                                    android.graphics.Bitmap bitmap = null;
                                    try {
                                        int width = bitmapDecodeByteArray.getWidth();
                                        int height = bitmapDecodeByteArray.getHeight();
                                        if (width > dimensionPixelSize || height > dimensionPixelSize) {
                                            if (width >= height) {
                                                iMax2 = java.lang.Math.max(1, java.lang.Math.round((height * dimensionPixelSize) / width));
                                                iMax = dimensionPixelSize;
                                            } else {
                                                iMax = java.lang.Math.max(1, java.lang.Math.round((width * dimensionPixelSize) / height));
                                                iMax2 = dimensionPixelSize;
                                            }
                                            bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapDecodeByteArray, iMax, iMax2, true);
                                        } else {
                                            bitmapCreateScaledBitmap = bitmapDecodeByteArray;
                                        }
                                        try {
                                            int height2 = bitmapCreateScaledBitmap.getHeight();
                                            int width2 = bitmapCreateScaledBitmap.getWidth();
                                            int i6 = (int) (((double) height2) * 0.1d);
                                            int i7 = (int) (((double) width2) * 0.1d);
                                            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap((i7 << 1) + width2, (i6 << 1) + height2, bitmapCreateScaledBitmap.getConfig() != null ? bitmapCreateScaledBitmap.getConfig() : android.graphics.Bitmap.Config.ARGB_8888);
                                            new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapCreateScaledBitmap, (android.graphics.Rect) null, new android.graphics.Rect(i7, i6, width2 + i7, height2 + i6), (android.graphics.Paint) null);
                                            android.graphics.drawable.Icon iconM = da$.ExternalSyntheticApiModelOutline1.m(bitmapCreateBitmap);
                                            if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                                                bitmapCreateScaledBitmap.recycle();
                                            }
                                            bitmapDecodeByteArray.recycle();
                                            inputStreamOpenContactPhotoInputStream.close();
                                            return iconM;
                                        } catch (java.lang.Throwable th) {
                                            th = th;
                                            bitmap = bitmapCreateScaledBitmap;
                                            if (bitmap != null && bitmap != bitmapDecodeByteArray) {
                                                bitmap.recycle();
                                            }
                                            bitmapDecodeByteArray.recycle();
                                            throw th;
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        try {
                            inputStreamOpenContactPhotoInputStream.close();
                            throw th3;
                        } catch (java.lang.Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (inputStreamOpenContactPhotoInputStream != null) {
                    inputStreamOpenContactPhotoInputStream.close();
                }
            } catch (java.lang.Exception | java.lang.OutOfMemoryError e) {
                ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.d()).k(e)).l("com/android/dialer/shortcuts/IconFactory", "createOptimized", 145, "IconFactory.java")).y("Failed to create photo icon for contact: %s", str);
            }
        }
        rkr rkrVar = new rkr(this.b);
        rkrVar.a = 1.0f / (rs$.ExternalSyntheticApiModelOutline0.m() + 1.0f);
        rkrVar.b(str, str2, 2, 1);
        return da$.ExternalSyntheticApiModelOutline1.m(uxx.a(rkrVar, dimensionPixelSize, dimensionPixelSize));
    }

    public final android.graphics.drawable.Icon a(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        defpackage.lpb.a();
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            return b(uri, str, str2);
        }
        java.io.InputStream inputStreamOpenContactPhotoInputStream = uri != null ? android.provider.ContactsContract.Contacts.openContactPhotoInputStream(this.b.getContentResolver(), uri, false) : null;
        if (inputStreamOpenContactPhotoInputStream == null) {
            android.content.Context context = this.b;
            rkr rkrVar = new rkr(context);
            rkrVar.a = 1.0f / (rs$.ExternalSyntheticApiModelOutline0.m() + 1.0f);
            rkrVar.b(str, str2, 2, 1);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166225);
            return da$.ExternalSyntheticApiModelOutline1.m(uxx.a(rkrVar, dimensionPixelSize, dimensionPixelSize));
        }
        android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream);
        int height = bitmapDecodeStream.getHeight();
        int width = bitmapDecodeStream.getWidth();
        int i = (int) (((double) height) * 0.1d);
        int i2 = (int) (((double) width) * 0.1d);
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap((i2 << 1) + width, (i << 1) + height, bitmapDecodeStream.getConfig());
        new android.graphics.Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, (android.graphics.Rect) null, new android.graphics.Rect(i2, i, width + i2, height + i), (android.graphics.Paint) null);
        return da$.ExternalSyntheticApiModelOutline1.m(bitmapCreateBitmap);
    }
}
