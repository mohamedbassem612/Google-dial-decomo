package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class rkr extends android.graphics.drawable.Drawable {
    public float a;
    public float b;
    private final android.graphics.Paint c;
    private final android.graphics.Rect d;
    private final char[] e;
    private final int[] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final float l;
    private final android.graphics.drawable.Drawable m;
    private final android.graphics.drawable.Drawable n;
    private final android.graphics.drawable.Drawable o;
    private final android.graphics.drawable.Drawable p;
    private final android.graphics.drawable.Drawable q;
    private int r;
    private boolean s;
    private int t;
    private final int[] u;
    private j$.util.Optional v;
    private java.lang.Character w;
    private java.lang.String x;

    public rkr(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.c = paint;
        this.d = new android.graphics.Rect();
        this.e = new char[1];
        this.r = 1;
        this.a = 1.0f;
        this.b = 0.0f;
        this.s = false;
        this.v = j$.util.Optional.empty();
        this.w = null;
        android.content.res.Resources resources = context.getResources();
        this.g = ((rkq) agab.aH(context, rkq.class)).cH().f(context);
        this.f = afsq.cn(context);
        this.u = afsq.cm(context);
        this.j = urg.c(context, 2130969107);
        this.k = urg.c(context, 2130969134);
        this.h = resources.getColor(2131102658);
        int color = resources.getColor(2131101258);
        this.i = color;
        this.l = resources.getFraction(2131361792, 1, 1);
        this.m = resources.getDrawable(2131231538, null);
        this.n = resources.getDrawable(2131232015, null);
        this.o = resources.getDrawable(2131232065, null);
        this.p = resources.getDrawable(2131232046, null);
        this.q = resources.getDrawable(2131232033, null);
        paint.setTypeface(android.graphics.Typeface.create("google-sans", 0));
        paint.setTextAlign(android.graphics.Paint.Align.CENTER);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        this.t = color;
    }

    private final void c(java.lang.String str, java.lang.String str2) {
        int i;
        char cCharAt;
        if (android.text.TextUtils.isEmpty(str) || (((cCharAt = str.charAt(0)) < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt >= '!' && cCharAt <= '@') || ((cCharAt >= '[' && cCharAt <= '`') || ((cCharAt >= '{' && cCharAt <= '~') || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.GENERAL_PUNCTUATION) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.MATHEMATICAL_OPERATORS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.HIGH_SURROGATES) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.LOW_SURROGATES) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.ARROWS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.MISCELLANEOUS_TECHNICAL) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.ENCLOSED_ALPHANUMERICS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.GEOMETRIC_SHAPES) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.DINGBATS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.MISCELLANEOUS_SYMBOLS_AND_ARROWS) || j$.util.Objects.equals(java.lang.Character.UnicodeBlock.of(cCharAt), java.lang.Character.UnicodeBlock.VARIATION_SELECTORS))))))) {
            this.w = null;
        } else {
            this.w = java.lang.Character.valueOf(java.lang.Character.toUpperCase(str.charAt(0)));
        }
        if (this.r == 5) {
            i = this.h;
        } else {
            if (this.w != null) {
                int iAbs = java.lang.Math.abs(str2.hashCode());
                int[] iArr = this.f;
                int length = iAbs % iArr.length;
                this.t = iArr[length];
                this.v = j$.util.Optional.of(java.lang.Integer.valueOf(this.u[length]));
                return;
            }
            i = this.j;
        }
        this.t = i;
    }

    public final int a() {
        return this.w == null ? this.k : ((java.lang.Integer) this.v.orElse(java.lang.Integer.valueOf(this.g))).intValue();
    }

    public final void b(java.lang.String str, java.lang.String str2, int i, int i2) {
        this.s = i == 1;
        if (i2 == 1) {
            if (str == null) {
                if (str2 == null) {
                    return;
                }
            } else if (str.equals(this.x) && this.r != 6) {
                return;
            }
            i2 = 1;
        }
        this.x = str;
        this.r = i2;
        if (i2 != 1 && i2 != 2) {
            c(null, null);
        } else if (str2 != null) {
            c(str, str2);
        } else {
            c(str, str);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.Paint paint = this.c;
        paint.setColor(this.t);
        android.graphics.Rect bounds = getBounds();
        int iMin = java.lang.Math.min(bounds.width(), bounds.height());
        if (this.s) {
            canvas.drawCircle(bounds.centerX(), bounds.centerY(), iMin / 2.0f, paint);
        } else {
            canvas.drawRect(bounds, paint);
        }
        java.lang.Character ch = this.w;
        if (ch != null) {
            float f = iMin;
            char[] cArr = this.e;
            cArr[0] = ch.charValue();
            paint.setTextSize(this.a * this.l * f);
            android.graphics.Rect rect = this.d;
            paint.getTextBounds(cArr, 0, 1, rect);
            paint.setColor(a());
            canvas.drawText(cArr, 0, 1, bounds.centerX(), (bounds.centerY() + (this.b * bounds.height())) - rect.exactCenterY(), paint);
            return;
        }
        int i = this.r;
        if (i == 2) {
            this.a = 0.7f;
            drawable = this.n;
        } else if (i == 3) {
            this.a = 0.7f;
            drawable = this.o;
        } else if (i == 5) {
            this.a = 0.7f;
            drawable = this.p;
        } else if (i != 6) {
            this.a = 0.6f;
            drawable = this.m;
        } else {
            this.a = 0.7f;
            drawable = this.q;
        }
        if (drawable == null) {
            throw new java.lang.IllegalStateException(a.bj(i, "Unable to find drawable for contact type "));
        }
        if (i != 5) {
            drawable.mutate().setColorFilter(a(), android.graphics.PorterDuff.Mode.SRC_IN);
        }
        float f2 = this.a;
        float f3 = this.b;
        android.graphics.Rect rectCopyBounds = copyBounds();
        int iMin2 = (int) ((f2 * java.lang.Math.min(rectCopyBounds.width(), rectCopyBounds.height())) / 2.0f);
        int iCenterX = rectCopyBounds.centerX() - iMin2;
        int iCenterY = rectCopyBounds.centerY() - iMin2;
        float fHeight = rectCopyBounds.height() * f3;
        rectCopyBounds.set(iCenterX, (int) (iCenterY + fHeight), rectCopyBounds.centerX() + iMin2, (int) (rectCopyBounds.centerY() + iMin2 + (f3 * rectCopyBounds.height())));
        drawable.setBounds(rectCopyBounds);
        drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(android.graphics.Outline outline) {
        if (this.s) {
            outline.setOval(getBounds());
        } else {
            outline.setRect(getBounds());
        }
        outline.setAlpha(1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}
