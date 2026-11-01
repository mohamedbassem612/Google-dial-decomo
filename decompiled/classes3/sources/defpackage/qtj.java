package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qtj {
    public static final aimz a = aimz.i("com/android/dialer/incall/video/view/BlurredImageGenerator");
    public final ajct b;
    public final aazc c;
    private final android.content.Context d;
    private final aoin e;

    public qtj(android.content.Context context, aazc aazcVar, ajct ajctVar, aoin aoinVar) {
        this.d = context;
        this.c = aazcVar;
        this.b = ajctVar;
        this.e = aoinVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d6 A[Catch: RSDriverException -> 0x0142, PHI: r0
      0x00d6: PHI (r0v25 j$.util.Optional) = (r0v22 j$.util.Optional), (r0v28 j$.util.Optional) binds: [B:32:0x00d4, B:16:0x0093] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {RSDriverException -> 0x0142, blocks: (B:3:0x0002, B:6:0x0012, B:8:0x0018, B:33:0x00d6, B:52:0x00f5, B:51:0x00f2, B:53:0x00f6, B:47:0x00ec, B:9:0x002a, B:15:0x0090, B:31:0x00d1, B:43:0x00e7, B:42:0x00e4), top: B:62:0x0002, inners: #0, #4 }] */
    public final j$.util.Optional a(android.graphics.Bitmap bitmap, float f, long j) {
        j$.util.Optional optionalOf;
        try {
            if (!((java.lang.Boolean) this.e.a()).booleanValue() || android.os.Build.VERSION.SDK_INT < 31) {
                android.renderscript.RenderScript renderScriptCreate = android.renderscript.RenderScript.create(this.d);
                android.renderscript.ScriptIntrinsicBlur scriptIntrinsicBlurCreate = android.renderscript.ScriptIntrinsicBlur.create(renderScriptCreate, android.renderscript.Element.U8_4(renderScriptCreate));
                android.renderscript.Allocation allocationCreateFromBitmap = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmap);
                android.renderscript.Allocation allocationCreateFromBitmap2 = android.renderscript.Allocation.createFromBitmap(renderScriptCreate, bitmap);
                scriptIntrinsicBlurCreate.setRadius(f);
                scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                allocationCreateFromBitmap2.copyTo(bitmap);
                scriptIntrinsicBlurCreate.destroy();
                allocationCreateFromBitmap.destroy();
                allocationCreateFromBitmap2.destroy();
                optionalOf = j$.util.Optional.of(bitmap);
            } else {
                android.media.ImageReader imageReaderM = fn$.ExternalSyntheticApiModelOutline0.m(bitmap.getWidth(), bitmap.getHeight(), 1, 1, 768L);
                try {
                    android.graphics.RenderNode renderNode = new android.graphics.RenderNode("BlurEffect");
                    android.graphics.HardwareRenderer hardwareRenderer = new android.graphics.HardwareRenderer();
                    hardwareRenderer.setSurface(imageReaderM.getSurface());
                    hardwareRenderer.setContentRoot(renderNode);
                    da$.ExternalSyntheticApiModelOutline0.m(renderNode, 0, 0, imageReaderM.getWidth(), imageReaderM.getHeight());
                    renderNode.setRenderEffect(android.graphics.RenderEffect.createBlurEffect(f, f, android.graphics.Shader.TileMode.MIRROR));
                    fn$.ExternalSyntheticApiModelOutline0.m(da$.ExternalSyntheticApiModelOutline0.m(renderNode), bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
                    da$.ExternalSyntheticApiModelOutline0.m(renderNode);
                    fn$.ExternalSyntheticApiModelOutline0.m(hardwareRenderer).setWaitForPresent(true).syncAndDraw();
                    android.media.Image imageAcquireNextImage = imageReaderM.acquireNextImage();
                    try {
                        try {
                            ahvr.ci(imageAcquireNextImage);
                            android.hardware.HardwareBuffer hardwareBufferM = ft$.ExternalSyntheticApiModelOutline0.m(imageAcquireNextImage);
                            try {
                                ahvr.ci(hardwareBufferM);
                                android.graphics.Bitmap bitmapM = da$.ExternalSyntheticApiModelOutline0.m(hardwareBufferM, (android.graphics.ColorSpace) null);
                                da$.ExternalSyntheticApiModelOutline0.m$1(renderNode);
                                hardwareRenderer.destroy();
                                optionalOf = j$.util.Optional.of(bitmapM);
                                if (hardwareBufferM != null) {
                                    rs$.ExternalSyntheticApiModelOutline0.m(hardwareBufferM);
                                }
                                if (imageAcquireNextImage != null) {
                                    imageAcquireNextImage.close();
                                }
                                if (imageReaderM != null) {
                                    imageReaderM.close();
                                }
                            } catch (java.lang.Throwable th) {
                                if (hardwareBufferM == null) {
                                    throw th;
                                }
                                try {
                                    rs$.ExternalSyntheticApiModelOutline0.m(hardwareBufferM);
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            if (imageAcquireNextImage == null) {
                                throw th3;
                            }
                            try {
                                imageAcquireNextImage.close();
                                throw th3;
                            } catch (java.lang.Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                            a.bq(a.d(), "failed to blur", "com/android/dialer/incall/video/view/BlurredImageGenerator", "blurBitmap", (char) 157, "BlurredImageGenerator.java", e, zct.b);
                            return j$.util.Optional.empty();
                        }
                    } catch (java.lang.NullPointerException e) {
                        a.d().i(zct.b).k(e).l("com/android/dialer/incall/video/view/BlurredImageGenerator", "blurWithRenderEffect", 223, "BlurredImageGenerator.java").v("failed to blur");
                        optionalOf = j$.util.Optional.empty();
                        if (imageAcquireNextImage != null) {
                            imageAcquireNextImage.close();
                        }
                        if (imageReaderM != null) {
                            imageReaderM.close();
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    if (imageReaderM == null) {
                        throw th5;
                    }
                    try {
                        imageReaderM.close();
                        throw th5;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            }
            a.b().l("com/android/dialer/incall/video/view/BlurredImageGenerator", "blurBitmap", 161, "BlurredImageGenerator.java").x("took %d millis", android.os.SystemClock.elapsedRealtime() - j);
            return optionalOf;
        } catch (android.renderscript.RSDriverException e2) {
            a.bq(a.d(), "failed to blur", "com/android/dialer/incall/video/view/BlurredImageGenerator", "blurBitmap", (char) 157, "BlurredImageGenerator.java", e2, zct.b);
            return j$.util.Optional.empty();
        }
    }
}
