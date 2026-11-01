package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjq extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    int c;
    final /* synthetic */ sjy d;
    final /* synthetic */ android.net.Uri e;
    final /* synthetic */ android.util.Size f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjq(sjy sjyVar, android.net.Uri uri, android.util.Size size, int i, aoln aolnVar) {
        super(2, aolnVar);
        this.d = sjyVar;
        this.e = uri;
        this.f = size;
        this.g = i;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x021d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0234  */
    /* JADX WARN: Code duplicated, block: B:76:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x024b  */
    /* JADX WARN: Code duplicated, block: B:78:0x024d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0262  */
    /* JADX WARN: Code duplicated, block: B:82:0x0268  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objK;
        java.lang.Object objC;
        java.lang.Object obj2;
        java.io.File file;
        java.lang.Object objD;
        java.lang.Object obj3;
        sjy sjyVar;
        android.net.Uri uri;
        android.graphics.Bitmap bitmap;
        java.io.File file2;
        android.net.Uri uriU;
        long byteCount;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i == 1) {
                aooc.af(obj);
                objK = obj;
            } else {
                if (i == 2) {
                    java.lang.Object obj4 = this.a;
                    aooc.af(obj);
                    obj2 = obj4;
                    objC = obj;
                    file = (java.io.File) objC;
                    if (!file.exists()) {
                        sjy sjyVar2 = this.d;
                        this.a = obj2;
                        this.b = file;
                        this.c = 3;
                        objD = sjyVar2.d(this);
                        if (objD == aoluVar) {
                            obj3 = file;
                            return aoluVar;
                        }
                    }
                    return this.e;
                }
                java.lang.Object obj5 = this.b;
                obj2 = this.a;
                aooc.af(obj);
                objD = obj;
                obj3 = obj5;
            }
            obj3 = file;
            if (((java.lang.Boolean) objD).booleanValue()) {
                sjyVar = this.d;
                uri = this.e;
                bitmap = (android.graphics.Bitmap) obj2;
                file2 = (java.io.File) obj3;
                if (sjyVar.m(sjyVar.l(uri), file2, bitmap, this.g)) {
                    if (obj2 == null) {
                        uriU = uri;
                    } else {
                        uriU = sjyVar.k.u(file2);
                    }
                    rlv rlvVar = sjyVar.f;
                    akzx akzxVarM = amph.a.m();
                    aooh.f(akzxVarM, "builder");
                    if (obj2 != null) {
                        byteCount = bitmap.getByteCount();
                    } else {
                        byteCount = 0;
                    }
                    akzxVarM.u();
                    amph amphVar = akzxVarM.b;
                    amphVar.b |= 1;
                    amphVar.c = byteCount;
                    long length = file2.length();
                    akzxVarM.u();
                    amph amphVar2 = akzxVarM.b;
                    amphVar2.b |= 4;
                    amphVar2.e = length;
                    java.lang.String strName = sjy.a.name();
                    aooh.f(strName, "value");
                    akzxVarM.u();
                    amph amphVar3 = akzxVarM.b;
                    j$.util.Objects.requireNonNull(strName);
                    amphVar3.b |= 2;
                    amphVar3.d = strName;
                    amph amphVarP = akzxVarM.p();
                    aooh.e(amphVarP, "build(...)");
                    rlvVar.j(amphVarP);
                    return uriU;
                }
            }
            return this.e;
        }
        aooc.af(obj);
        sjy sjyVar3 = this.d;
        android.net.Uri uri2 = this.e;
        this.c = 1;
        objK = sjyVar3.k(uri2, this);
        if (objK == aoluVar) {
            return aoluVar;
        }
        if (((java.lang.Boolean) objK).booleanValue()) {
            sjy sjyVar4 = this.d;
            android.util.Size size = this.f;
            android.content.Context context = sjyVar4.c;
            if (context.getResources().getConfiguration().orientation == 2) {
                sjy.b.d().l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "getRequestedImageSize", 511, "CallingCardImageProcessor.kt").v("Landscape orientation is not supported for calling cards");
            } else {
                android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                size = new android.util.Size(displayMetrics.widthPixels > size.getWidth() ? displayMetrics.widthPixels : size.getWidth(), displayMetrics.heightPixels > size.getHeight() ? displayMetrics.heightPixels : size.getHeight());
            }
            android.net.Uri uri3 = this.e;
            int width = size.getWidth();
            int height = size.getHeight();
            akzx akzxVarM2 = ampi.a.m();
            aooh.e(akzxVarM2, "newBuilder(...)");
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            android.graphics.Bitmap bitmap2 = null;
            try {
                android.content.res.AssetFileDescriptor assetFileDescriptorB = defpackage.afax.b(context, uri3, "r", pez.aw(uri3));
                aooh.c(assetFileDescriptorB);
                options.inJustDecodeBounds = true;
                try {
                    android.graphics.BitmapFactory.decodeStream(assetFileDescriptorB.createInputStream(), null, options);
                    long length2 = assetFileDescriptorB.getLength();
                    akzxVarM2.u();
                    ampi ampiVar = akzxVarM2.b;
                    ampiVar.b |= 4;
                    ampiVar.e = length2;
                    ajsz.ak(assetFileDescriptorB, (java.lang.Throwable) null);
                    defpackage.vqu vquVarO = akky.O(defpackage.ampj.a.m());
                    vquVarO.aM(options.outWidth);
                    vquVarO.aL(options.outHeight);
                    defpackage.ampj ampjVarAK = vquVarO.aK();
                    akzxVarM2.u();
                    ampi ampiVar2 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(ampjVarAK);
                    ampiVar2.c = ampjVarAK;
                    ampiVar2.b |= 1;
                    int i2 = options.outHeight;
                    int i3 = options.outWidth;
                    options.inSampleSize = (i2 > height || i3 > width) ? java.lang.Math.max(aopc.i(i2 / height), aopc.i(i3 / width)) : 1;
                    options.inJustDecodeBounds = false;
                    try {
                        java.io.InputStream inputStreamC = defpackage.afax.c(sjyVar4.c, uri3, pez.aw(uri3));
                        aooh.c(inputStreamC);
                        try {
                            android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options);
                            if (bitmapDecodeStream != null) {
                                defpackage.vqu vquVarO2 = akky.O(defpackage.ampj.a.m());
                                vquVarO2.aM(bitmapDecodeStream.getWidth());
                                vquVarO2.aL(bitmapDecodeStream.getHeight());
                                defpackage.ampj ampjVarAK2 = vquVarO2.aK();
                                akzxVarM2.u();
                                ampi ampiVar3 = akzxVarM2.b;
                                j$.util.Objects.requireNonNull(ampjVarAK2);
                                ampiVar3.d = ampjVarAK2;
                                ampiVar3.b |= 2;
                                long byteCount2 = bitmapDecodeStream.getByteCount();
                                akzxVarM2.u();
                                ampi ampiVar4 = akzxVarM2.b;
                                ampiVar4.b |= 8;
                                ampiVar4.f = byteCount2;
                            }
                            sjyVar4.f.k(akzxVarM2.p());
                            ajsz.ak(inputStreamC, (java.lang.Throwable) null);
                            bitmap2 = bitmapDecodeStream;
                            if (bitmap2 == null) {
                                sjy.b.d().l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "compressImage$<anonymous>", 146, "CallingCardImageProcessor.kt").v("Downsampled image is null, compression failed.");
                                return this.e;
                            }
                            sjy sjyVar5 = this.d;
                            android.net.Uri uri4 = this.e;
                            this.a = bitmap2;
                            this.c = 2;
                            objC = sjyVar5.c(uri4, this);
                            if (objC == aoluVar) {
                                return aoluVar;
                            }
                            obj2 = bitmap2;
                            file = (java.io.File) objC;
                            if (!file.exists()) {
                                sjy sjyVar6 = this.d;
                                this.a = obj2;
                                this.b = file;
                                this.c = 3;
                                objD = sjyVar6.d(this);
                                if (objD == aoluVar) {
                                    obj3 = file;
                                    return aoluVar;
                                }
                                obj3 = file;
                                if (((java.lang.Boolean) objD).booleanValue()) {
                                    sjyVar = this.d;
                                    uri = this.e;
                                    bitmap = (android.graphics.Bitmap) obj2;
                                    file2 = (java.io.File) obj3;
                                    if (sjyVar.m(sjyVar.l(uri), file2, bitmap, this.g)) {
                                        if (obj2 == null) {
                                            uriU = uri;
                                        } else {
                                            uriU = sjyVar.k.u(file2);
                                        }
                                        rlv rlvVar2 = sjyVar.f;
                                        akzx akzxVarM3 = amph.a.m();
                                        aooh.f(akzxVarM3, "builder");
                                        if (obj2 != null) {
                                            byteCount = bitmap.getByteCount();
                                        } else {
                                            byteCount = 0;
                                        }
                                        akzxVarM3.u();
                                        amph amphVar4 = akzxVarM3.b;
                                        amphVar4.b |= 1;
                                        amphVar4.c = byteCount;
                                        long length3 = file2.length();
                                        akzxVarM3.u();
                                        amph amphVar5 = akzxVarM3.b;
                                        amphVar5.b |= 4;
                                        amphVar5.e = length3;
                                        java.lang.String strName2 = sjy.a.name();
                                        aooh.f(strName2, "value");
                                        akzxVarM3.u();
                                        amph amphVar6 = akzxVarM3.b;
                                        j$.util.Objects.requireNonNull(strName2);
                                        amphVar6.b |= 2;
                                        amphVar6.d = strName2;
                                        amph amphVarP2 = akzxVarM3.p();
                                        aooh.e(amphVarP2, "build(...)");
                                        rlvVar2.j(amphVarP2);
                                        return uriU;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                throw th;
                            } catch (java.lang.Throwable th2) {
                                ajsz.ak(inputStreamC, th);
                                throw th2;
                            }
                        }
                    } catch (java.lang.Exception e) {
                        sjy.b.d().k(e).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "lessResolution", 560, "CallingCardImageProcessor.kt").v("Failed to load image from external Uri for downsampling.");
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        ajsz.ak(assetFileDescriptorB, th3);
                        throw th4;
                    }
                }
            } catch (java.lang.Exception e2) {
                sjy.b.d().k(e2).l("com/android/dialer/patrick/onboarding/imageprocessor/CallingCardImageProcessor", "lessResolution", 534, "CallingCardImageProcessor.kt").v("Failed to load image from Uri for image bounds.");
            }
        }
        return this.e;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.sjq(this.d, this.e, this.f, this.g, aolnVar);
    }
}
