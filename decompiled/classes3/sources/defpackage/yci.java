package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yci implements defpackage.xuu {
    public static final defpackage.xur a = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new defpackage.ycd(1, null));
    public static final defpackage.xur b = new defpackage.xur("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new defpackage.ycd(0));
    private static final java.util.List c = j$.util.DesugarCollections.unmodifiableList(java.util.Arrays.asList("TP1A", "TD1A.220804.031"));
    private final defpackage.ycg d;
    private final defpackage.xxm e;

    public yci(defpackage.xxm xxmVar, defpackage.ycg ycgVar) {
        this.e = xxmVar;
        this.d = ycgVar;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0123  */
    /* JADX WARN: Code duplicated, block: B:68:0x0128 A[Catch: all -> 0x01dc, TryCatch #6 {all -> 0x01dc, blocks: (B:68:0x0128, B:69:0x012c, B:71:0x0139, B:73:0x013d, B:74:0x0143, B:76:0x0149, B:82:0x015e, B:86:0x0178, B:89:0x0188, B:91:0x018e, B:92:0x0193, B:93:0x01bf, B:95:0x01c5, B:99:0x01d6, B:100:0x01db, B:79:0x0158, B:63:0x0117, B:65:0x011d), top: B:119:0x0117, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0158 A[Catch: all -> 0x01dc, TRY_LEAVE, TryCatch #6 {all -> 0x01dc, blocks: (B:68:0x0128, B:69:0x012c, B:71:0x0139, B:73:0x013d, B:74:0x0143, B:76:0x0149, B:82:0x015e, B:86:0x0178, B:89:0x0188, B:91:0x018e, B:92:0x0193, B:93:0x01bf, B:95:0x01c5, B:99:0x01d6, B:100:0x01db, B:79:0x0158, B:63:0x0117, B:65:0x011d), top: B:119:0x0117, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0174 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x018e A[Catch: all -> 0x01dc, TryCatch #6 {all -> 0x01dc, blocks: (B:68:0x0128, B:69:0x012c, B:71:0x0139, B:73:0x013d, B:74:0x0143, B:76:0x0149, B:82:0x015e, B:86:0x0178, B:89:0x0188, B:91:0x018e, B:92:0x0193, B:93:0x01bf, B:95:0x01c5, B:99:0x01d6, B:100:0x01db, B:79:0x0158, B:63:0x0117, B:65:0x011d), top: B:119:0x0117, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d6 A[Catch: all -> 0x01dc, TRY_ENTER, TryCatch #6 {all -> 0x01dc, blocks: (B:68:0x0128, B:69:0x012c, B:71:0x0139, B:73:0x013d, B:74:0x0143, B:76:0x0149, B:82:0x015e, B:86:0x0178, B:89:0x0188, B:91:0x018e, B:92:0x0193, B:93:0x01bf, B:95:0x01c5, B:99:0x01d6, B:100:0x01db, B:79:0x0158, B:63:0x0117, B:65:0x011d), top: B:119:0x0117, inners: #4 }] */
    @Override // defpackage.xuu
    public final defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) throws java.lang.Exception {
        android.media.MediaMetadataRetriever mediaMetadataRetriever;
        long j;
        int i3;
        android.graphics.Bitmap bitmapCreateBitmap;
        int i4;
        android.media.MediaExtractor mediaExtractor;
        long jLongValue = ((java.lang.Long) xusVar.b(a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new java.lang.IllegalArgumentException(a.bz(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
        }
        java.lang.Integer num = (java.lang.Integer) xusVar.b(b);
        if (num == null) {
            num = 2;
        }
        defpackage.ybe ybeVar = (defpackage.ybe) xusVar.b(defpackage.ybe.g);
        if (ybeVar == null) {
            ybeVar = defpackage.ybe.f;
        }
        android.media.MediaMetadataRetriever mediaMetadataRetriever2 = new android.media.MediaMetadataRetriever();
        try {
            defpackage.ycg ycgVar = this.d;
            ycgVar.b(mediaMetadataRetriever2, obj);
            int iIntValue = num.intValue();
            android.graphics.Bitmap frameAtTime = null;
            if (android.os.Build.DEVICE != null && android.os.Build.DEVICE.matches(".+_cheets|cheets_.+")) {
                try {
                    if ("video/webm".equals(mediaMetadataRetriever2.extractMetadata(12))) {
                        mediaExtractor = new android.media.MediaExtractor();
                        try {
                            ycgVar.a(mediaExtractor, obj);
                            int trackCount = mediaExtractor.getTrackCount();
                            for (int i5 = 0; i5 < trackCount; i5++) {
                                if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i5).getString("mime"))) {
                                    mediaExtractor.release();
                                    throw new java.lang.IllegalStateException("Cannot decode VP8 video on CrOS.");
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            try {
                                if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                    android.util.Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                                }
                                if (mediaExtractor != null) {
                                }
                                if (i != Integer.MIN_VALUE) {
                                    j = jLongValue;
                                    i3 = iIntValue;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                } else {
                                    j = jLongValue;
                                    i3 = iIntValue;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                }
                                if (frameAtTime == null) {
                                    frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i3);
                                }
                                bitmapCreateBitmap = frameAtTime;
                                if (!android.os.Build.MODEL.startsWith("Pixel")) {
                                    if (android.os.Build.VERSION.SDK_INT < 33) {
                                        try {
                                            java.lang.String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                            java.lang.String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                            i4 = java.lang.Integer.parseInt(strExtractMetadata);
                                            int i6 = java.lang.Integer.parseInt(strExtractMetadata2);
                                            if (i4 != 7) {
                                                if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                                    android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                                }
                                                android.graphics.Matrix matrix = new android.graphics.Matrix();
                                                matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                            } else {
                                                if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                                    android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                                }
                                                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                                                matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                            }
                                        } catch (java.lang.NumberFormatException unused) {
                                            if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                                android.util.Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                            }
                                        }
                                    }
                                } else if (android.os.Build.VERSION.SDK_INT < 33) {
                                    java.lang.String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                                    java.lang.String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                                    i4 = java.lang.Integer.parseInt(strExtractMetadata3);
                                    int i7 = java.lang.Integer.parseInt(strExtractMetadata4);
                                    if (i4 != 7) {
                                        if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                            android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                        }
                                        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                                    } else {
                                        if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                            android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                        }
                                        android.graphics.Matrix matrix4 = new android.graphics.Matrix();
                                        matrix4.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                        bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix4, true);
                                    }
                                }
                                if (bitmapCreateBitmap != null) {
                                    throw new defpackage.ych();
                                }
                                mediaMetadataRetriever.close();
                                return defpackage.ybv.g(bitmapCreateBitmap, this.e);
                            } catch (java.lang.Throwable th2) {
                                if (mediaExtractor != null) {
                                    mediaExtractor.release();
                                }
                                throw th2;
                            }
                        }
                        mediaExtractor.release();
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    mediaExtractor = null;
                }
            }
            if (i != Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || ybeVar == defpackage.ybe.e) {
                j = jLongValue;
                i3 = iIntValue;
                mediaMetadataRetriever = mediaMetadataRetriever2;
            } else {
                try {
                    int i8 = java.lang.Integer.parseInt(mediaMetadataRetriever2.extractMetadata(18));
                    int i9 = java.lang.Integer.parseInt(mediaMetadataRetriever2.extractMetadata(19));
                    int i10 = java.lang.Integer.parseInt(mediaMetadataRetriever2.extractMetadata(24));
                    if (i10 == 90 || i10 == 270) {
                        i9 = i8;
                        i8 = i9;
                    }
                    float fA = ybeVar.a(i8, i9, i, i2);
                    int iRound = java.lang.Math.round(i8 * fA);
                    int iRound2 = java.lang.Math.round(fA * i9);
                    j = jLongValue;
                    i3 = iIntValue;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                    try {
                        frameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i3, iRound, iRound2);
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                        try {
                            if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                android.util.Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                            }
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            mediaMetadataRetriever.close();
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    j = jLongValue;
                    i3 = iIntValue;
                    mediaMetadataRetriever = mediaMetadataRetriever2;
                }
            }
            if (frameAtTime == null) {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, i3);
            }
            bitmapCreateBitmap = frameAtTime;
            if (!android.os.Build.MODEL.startsWith("Pixel") && android.os.Build.VERSION.SDK_INT == 33) {
                java.util.Iterator it = c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (android.os.Build.ID.startsWith((java.lang.String) it.next())) {
                            java.lang.String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(36);
                            java.lang.String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(35);
                            i4 = java.lang.Integer.parseInt(strExtractMetadata5);
                            int i11 = java.lang.Integer.parseInt(strExtractMetadata6);
                            if (i4 != 7) {
                                if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                    android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                }
                                android.graphics.Matrix matrix5 = new android.graphics.Matrix();
                                matrix5.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix5, true);
                            } else {
                                if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                                    android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                }
                                android.graphics.Matrix matrix6 = new android.graphics.Matrix();
                                matrix6.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix6, true);
                            }
                        }
                    }
                }
            } else if (android.os.Build.VERSION.SDK_INT < 33) {
                java.lang.String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(36);
                java.lang.String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(35);
                i4 = java.lang.Integer.parseInt(strExtractMetadata7);
                int i12 = java.lang.Integer.parseInt(strExtractMetadata8);
                if ((i4 != 7 || i4 == 6) && i12 == 6 && java.lang.Math.abs(java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    if (android.util.Log.isLoggable("VideoDecoder", 3)) {
                        android.util.Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                    }
                    android.graphics.Matrix matrix7 = new android.graphics.Matrix();
                    matrix7.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                    bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix7, true);
                }
            }
            if (bitmapCreateBitmap != null) {
                throw new defpackage.ych();
            }
            mediaMetadataRetriever.close();
            return defpackage.ybv.g(bitmapCreateBitmap, this.e);
        } catch (java.lang.Throwable th7) {
            th = th7;
            mediaMetadataRetriever = mediaMetadataRetriever2;
            mediaMetadataRetriever.close();
            throw th;
        }
    }

    @Override // defpackage.xuu
    public final boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        return true;
    }
}
