package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class heh extends defpackage.hef {
    private final android.graphics.Paint j;
    private final android.graphics.Rect k;
    private final android.graphics.Rect l;
    private final defpackage.gzt m;
    private defpackage.hbd n;
    private defpackage.hbd o;

    public heh(defpackage.gzs gzsVar, defpackage.hei heiVar) {
        super(gzsVar, heiVar);
        this.j = new defpackage.hae(3);
        this.k = new android.graphics.Rect();
        this.l = new android.graphics.Rect();
        java.lang.String str = heiVar.f;
        defpackage.gzh gzhVar = gzsVar.b;
        this.m = gzhVar == null ? null : (defpackage.gzt) gzhVar.d().get(str);
    }

    @Override // defpackage.hef, defpackage.hcx
    public final void a(java.lang.Object obj, defpackage.hgp hgpVar) {
        super.a(obj, hgpVar);
        if (obj == defpackage.gzx.K) {
            if (hgpVar == null) {
                this.n = null;
                return;
            } else {
                this.n = new defpackage.hbu(hgpVar, null);
                return;
            }
        }
        if (obj == defpackage.gzx.N) {
            if (hgpVar == null) {
                this.o = null;
            } else {
                this.o = new defpackage.hbu(hgpVar, null);
            }
        }
    }

    @Override // defpackage.hef, defpackage.hai
    public final void c(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        defpackage.gzt gztVar = this.m;
        if (gztVar != null) {
            float f = gztVar.a;
            float fA = defpackage.hgm.a();
            rectF.set(0.0f, 0.0f, f * fA, gztVar.b * fA);
            this.a.mapRect(rectF);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f7  */
    @Override // defpackage.hef
    public final void j(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmapD;
        defpackage.hbd hbdVar = this.o;
        if (hbdVar == null || (bitmap = (android.graphics.Bitmap) hbdVar.e()) == null) {
            defpackage.hei heiVar = this.c;
            defpackage.gzs gzsVar = this.b;
            defpackage.hcs hcsVar = gzsVar.f;
            if (hcsVar != null) {
                android.graphics.drawable.Drawable.Callback callback = gzsVar.getCallback();
                android.content.Context context = (callback == null || !(callback instanceof android.view.View)) ? null : ((android.view.View) callback).getContext();
                android.content.Context context2 = hcsVar.a;
                if (context2 instanceof android.app.Application) {
                    context = context.getApplicationContext();
                }
                if (context != context2) {
                    gzsVar.f = null;
                }
            }
            if (gzsVar.f == null) {
                gzsVar.f = new defpackage.hcs(gzsVar.getCallback(), gzsVar.g, gzsVar.b.d());
            }
            defpackage.hcs hcsVar2 = gzsVar.f;
            if (hcsVar2 != null) {
                java.lang.String str = heiVar.f;
                defpackage.gzt gztVar = (defpackage.gzt) hcsVar2.c.get(str);
                if (gztVar == null) {
                    bitmap = null;
                } else {
                    android.graphics.Bitmap bitmap2 = gztVar.f;
                    if (bitmap2 != null) {
                        bitmap = bitmap2;
                    } else {
                        android.content.Context context3 = hcsVar2.a;
                        if (context3 != null) {
                            java.lang.String str2 = gztVar.d;
                            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
                                try {
                                    java.lang.String str3 = hcsVar2.b;
                                    if (android.text.TextUtils.isEmpty(str3)) {
                                        throw new java.lang.IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                    }
                                    try {
                                        android.graphics.Bitmap bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(context3.getAssets().open(str3 + str2), null, options);
                                        if (bitmapDecodeStream == null) {
                                            defpackage.hge.a(a.bk(str, "Decoded image `", "` is null."));
                                            bitmap = null;
                                        } else {
                                            bitmapD = defpackage.hgm.d(bitmapDecodeStream, gztVar.a, gztVar.b);
                                            hcsVar2.a(str, bitmapD);
                                            bitmap = bitmapD;
                                        }
                                    } catch (java.lang.IllegalArgumentException e) {
                                        defpackage.hge.b(a.bk(str, "Unable to decode image `", "`."), e);
                                    }
                                } catch (java.io.IOException e2) {
                                    defpackage.hge.b("Unable to open asset.", e2);
                                }
                            } else {
                                try {
                                    byte[] bArrDecode = android.util.Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                                    bitmapD = defpackage.hgm.d(android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), gztVar.a, gztVar.b);
                                    hcsVar2.a(str, bitmapD);
                                    bitmap = bitmapD;
                                } catch (java.lang.IllegalArgumentException e3) {
                                    defpackage.hge.b("data URL did not have correct base64 format.", e3);
                                    bitmap = null;
                                }
                            }
                        } else {
                            bitmap = null;
                        }
                    }
                }
            } else {
                bitmap = null;
            }
            if (bitmap == null) {
                defpackage.gzt gztVar2 = this.m;
                bitmap = gztVar2 != null ? gztVar2.f : null;
            }
        }
        if (bitmap == null || bitmap.isRecycled() || this.m == null) {
            return;
        }
        java.lang.ThreadLocal threadLocal = defpackage.hgm.a;
        float f = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        android.graphics.Paint paint = this.j;
        paint.setAlpha(i);
        defpackage.hbd hbdVar2 = this.n;
        if (hbdVar2 != null) {
            paint.setColorFilter((android.graphics.ColorFilter) hbdVar2.e());
        }
        canvas.save();
        canvas.concat(matrix);
        android.graphics.Rect rect = this.k;
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        android.graphics.Rect rect2 = this.l;
        rect2.set(0, 0, (int) (bitmap.getWidth() * f), (int) (bitmap.getHeight() * f));
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        canvas.restore();
    }
}
