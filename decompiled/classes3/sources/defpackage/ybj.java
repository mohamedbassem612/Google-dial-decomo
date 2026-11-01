package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ybj {
    private static final defpackage.xxm a = new defpackage.ybi();

    static defpackage.xxe a(defpackage.xxm xxmVar, android.graphics.drawable.Drawable drawable, int i, int i2) {
        android.graphics.Bitmap bitmap;
        android.graphics.drawable.Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof android.graphics.drawable.BitmapDrawable) {
            bitmap = ((android.graphics.drawable.BitmapDrawable) current).getBitmap();
        } else if (current instanceof android.graphics.drawable.Animatable) {
            bitmap = null;
        } else {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    java.util.concurrent.locks.Lock lock = defpackage.ycc.c;
                    lock.lock();
                    android.graphics.Bitmap bitmapA = xxmVar.a(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
                    try {
                        android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapA);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapA;
                    } catch (java.lang.Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                    android.util.Log.w("DrawableToBitmap", hgb.i(current, "Unable to draw ", " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"));
                }
                z = true;
            } else if (android.util.Log.isLoggable("DrawableToBitmap", 5)) {
                android.util.Log.w("DrawableToBitmap", hgb.i(current, "Unable to draw ", " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"));
            }
            bitmap = null;
            z = true;
        }
        if (!z) {
            xxmVar = a;
        }
        return defpackage.ybv.g(bitmap, xxmVar);
    }
}
