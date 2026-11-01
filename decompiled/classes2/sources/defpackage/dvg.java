package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dvg {
    static android.app.Notification.MessagingStyle a(android.app.Person person) {
        return new android.app.Notification.MessagingStyle(person);
    }

    static android.app.Notification.MessagingStyle b(android.app.Notification.MessagingStyle messagingStyle, boolean z) {
        return ft$.ExternalSyntheticApiModelOutline0.m(messagingStyle, z);
    }

    public static android.graphics.drawable.Icon c(androidx.core.graphics.drawable.IconCompat iconCompat) {
        android.graphics.drawable.Icon iconCreateWithBitmap;
        switch (iconCompat.b) {
            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                return (android.graphics.drawable.Icon) iconCompat.c;
            case 0:
            default:
                throw new java.lang.IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithBitmap((android.graphics.Bitmap) iconCompat.c);
                break;
            case 2:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithResource(iconCompat.i(), iconCompat.f);
                break;
            case 3:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                iconCreateWithBitmap = android.graphics.drawable.Icon.createWithContentUri((java.lang.String) iconCompat.c);
                break;
            case 5:
                iconCreateWithBitmap = da$.ExternalSyntheticApiModelOutline1.m((android.graphics.Bitmap) iconCompat.c);
                break;
            case 6:
                iconCreateWithBitmap = baa$.ExternalSyntheticApiModelOutline1.m(iconCompat.c());
                break;
        }
        android.content.res.ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        android.graphics.PorterDuff.Mode mode = iconCompat.i;
        if (mode == androidx.core.graphics.drawable.IconCompat.a) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    public static final android.graphics.Bitmap d(android.graphics.drawable.Drawable drawable, int i, int i2) {
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            android.graphics.drawable.BitmapDrawable bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                throw new java.lang.IllegalArgumentException("bitmap is null");
            }
            if (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) {
                android.graphics.Bitmap bitmap = bitmapDrawable.getBitmap();
                aooh.e(bitmap, "getBitmap(...)");
                return bitmap;
            }
            android.graphics.Bitmap bitmapCreateScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            aooh.e(bitmapCreateScaledBitmap, "createScaledBitmap(...)");
            return bitmapCreateScaledBitmap;
        }
        android.graphics.Rect bounds = drawable.getBounds();
        aooh.e(bounds, "getBounds(...)");
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
        aooh.e(bitmapCreateBitmap, "createBitmap(...)");
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new android.graphics.Canvas(bitmapCreateBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return bitmapCreateBitmap;
    }
}
