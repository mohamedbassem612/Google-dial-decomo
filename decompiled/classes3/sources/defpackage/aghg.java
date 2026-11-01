package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghg extends eoa {
    public static final xtq d = new xtq("SetupProgressViewModel", (byte[]) null);
    public final android.content.Context a;
    public boolean b;
    public boolean c;
    private final aoir e;
    private final aoir f;

    public aghg(android.content.Context context) {
        aooh.f(context, "applicationContext");
        this.a = context;
        this.e = aooc.ag(new defpackage.addr(this, 12));
        this.f = aooc.ag(new defpackage.addr(this, 13));
    }

    public final android.graphics.Bitmap a(int i) {
        if (i == 0) {
            return null;
        }
        try {
            android.graphics.drawable.Drawable drawable = this.a.getPackageManager().getDrawable("com.google.android.apps.restore", i, null);
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if ((drawable instanceof android.graphics.drawable.BitmapDrawable) && ((android.graphics.drawable.BitmapDrawable) drawable).getBitmap() == null) {
                return null;
            }
            return dvg.d(drawable, intrinsicWidth, intrinsicHeight);
        } catch (java.lang.Exception e) {
            d.A(a.bj(i, "Failed to get bitmap for resId "), e);
            return null;
        }
    }

    public final defpackage.aghd b() {
        return (defpackage.aghd) this.e.a();
    }

    public final aozh c() {
        return (aozh) this.f.a();
    }
}
