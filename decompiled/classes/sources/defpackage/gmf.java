package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gmf extends defpackage.glx {
    static final android.graphics.PorterDuff.Mode a = android.graphics.PorterDuff.Mode.SRC_IN;
    public gmd b;
    public boolean c;
    private android.graphics.PorterDuffColorFilter d;
    private android.graphics.ColorFilter f;
    private boolean g;
    private final float[] h;
    private final android.graphics.Matrix i;
    private final android.graphics.Rect j;

    public gmf(gmd gmdVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.b = gmdVar;
        this.d = c(gmdVar.c, gmdVar.d);
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (android.graphics.Color.alpha(i) * f)) << 24);
    }

    public static defpackage.gmf b(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        defpackage.gmf gmfVar = new defpackage.gmf();
        int i2 = defpackage.dwk.a;
        gmfVar.e = resources.getDrawable(i, theme);
        return gmfVar;
    }

    final android.graphics.PorterDuffColorFilter c(android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.Paint paint;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        android.graphics.Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        android.graphics.Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = java.lang.Math.abs(fArr[0]);
        float fAbs2 = java.lang.Math.abs(fArr[4]);
        float fAbs3 = java.lang.Math.abs(fArr[1]);
        float fAbs4 = java.lang.Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        float fWidth = rect.width();
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = java.lang.Math.min(2048, (int) (fWidth * fAbs));
        int iMin2 = java.lang.Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        gmd gmdVar = this.b;
        android.graphics.Bitmap bitmap = gmdVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != gmdVar.f.getHeight()) {
            gmdVar.f = android.graphics.Bitmap.createBitmap(iMin, iMin2, android.graphics.Bitmap.Config.ARGB_8888);
            gmdVar.k = true;
        }
        boolean z = this.c;
        gmd gmdVar2 = this.b;
        if (!z) {
            gmdVar2.a(iMin, iMin2);
        } else if (gmdVar2.k || gmdVar2.g != gmdVar2.c || gmdVar2.h != gmdVar2.d || gmdVar2.j != gmdVar2.e || gmdVar2.i != gmdVar2.b.getRootAlpha()) {
            this.b.a(iMin, iMin2);
            gmd gmdVar3 = this.b;
            gmdVar3.g = gmdVar3.c;
            gmdVar3.h = gmdVar3.d;
            gmdVar3.i = gmdVar3.b.getRootAlpha();
            gmdVar3.j = gmdVar3.e;
            gmdVar3.k = false;
        }
        gmd gmdVar4 = this.b;
        if (gmdVar4.b.getRootAlpha() < 255 || colorFilter != null) {
            if (gmdVar4.l == null) {
                gmdVar4.l = new android.graphics.Paint();
                gmdVar4.l.setFilterBitmap(true);
            }
            gmdVar4.l.setAlpha(gmdVar4.b.getRootAlpha());
            gmdVar4.l.setColorFilter(colorFilter);
            paint = gmdVar4.l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(gmdVar4.f, (android.graphics.Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return this.b.getChangingConfigurations() | super.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return new gme(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        int i2;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        gmd gmdVar = this.b;
        gmdVar.b = new gmc();
        android.content.res.TypedArray typedArrayK = defpackage.dvf.k(resources, theme, attributeSet, glq.a);
        gmd gmdVar2 = this.b;
        gmc gmcVar = gmdVar2.b;
        gmdVar2.d = defpackage.a.q(defpackage.dvf.i(typedArrayK, xmlPullParser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        android.content.res.ColorStateList colorStateListT = defpackage.dvf.t(typedArrayK, xmlPullParser, theme);
        if (colorStateListT != null) {
            gmdVar2.c = colorStateListT;
        }
        gmdVar2.e = defpackage.dvf.r(typedArrayK, xmlPullParser, gmdVar2.e);
        gmcVar.g = defpackage.dvf.g(typedArrayK, xmlPullParser, "viewportWidth", 7, gmcVar.g);
        float fG = defpackage.dvf.g(typedArrayK, xmlPullParser, "viewportHeight", 8, gmcVar.h);
        gmcVar.h = fG;
        if (gmcVar.g <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fG <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
        }
        int i3 = 3;
        gmcVar.e = typedArrayK.getDimension(3, gmcVar.e);
        int i4 = 2;
        float dimension = typedArrayK.getDimension(2, gmcVar.f);
        gmcVar.f = dimension;
        if (gmcVar.e <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires width > 0"));
        }
        if (dimension <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(java.lang.String.valueOf(typedArrayK.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        gmcVar.setAlpha(defpackage.dvf.g(typedArrayK, xmlPullParser, "alpha", 4, gmcVar.getAlpha()));
        java.lang.String string = typedArrayK.getString(0);
        if (string != null) {
            gmcVar.j = string;
            gmcVar.l.put(string, gmcVar);
        }
        typedArrayK.recycle();
        gmdVar.a = getChangingConfigurations();
        gmdVar.k = true;
        gmd gmdVar3 = this.b;
        gmc gmcVar2 = gmdVar3.b;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(gmcVar2.d);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i3); i5 = 1) {
            if (eventType == i4) {
                java.lang.String name = xmlPullParser.getName();
                gma gmaVar = (gma) arrayDeque.peek();
                if (gmaVar != null) {
                    if ("path".equals(name)) {
                        glz glzVar = new glz();
                        android.content.res.TypedArray typedArrayK2 = defpackage.dvf.k(resources, theme, attributeSet, glq.c);
                        glzVar.a = null;
                        if (defpackage.dvf.o(xmlPullParser, "pathData")) {
                            java.lang.String string2 = typedArrayK2.getString(0);
                            if (string2 != null) {
                                glzVar.n = string2;
                            }
                            java.lang.String string3 = typedArrayK2.getString(2);
                            if (string3 != null) {
                                glzVar.m = defpackage.dvf.d(string3);
                            }
                            glzVar.l = defpackage.dvf.u(typedArrayK2, xmlPullParser, theme, "fillColor", 1);
                            glzVar.d = defpackage.dvf.g(typedArrayK2, xmlPullParser, "fillAlpha", 12, glzVar.d);
                            int i6 = defpackage.dvf.i(typedArrayK2, xmlPullParser, "strokeLineCap", 8, -1);
                            android.graphics.Paint.Cap cap = glzVar.h;
                            if (i6 == 0) {
                                cap = android.graphics.Paint.Cap.BUTT;
                            } else if (i6 == 1) {
                                cap = android.graphics.Paint.Cap.ROUND;
                            } else if (i6 == 2) {
                                cap = android.graphics.Paint.Cap.SQUARE;
                            }
                            glzVar.h = cap;
                            int i7 = defpackage.dvf.i(typedArrayK2, xmlPullParser, "strokeLineJoin", 9, -1);
                            android.graphics.Paint.Join join = glzVar.i;
                            if (i7 == 0) {
                                join = android.graphics.Paint.Join.MITER;
                            } else if (i7 == 1) {
                                join = android.graphics.Paint.Join.ROUND;
                            } else if (i7 == 2) {
                                join = android.graphics.Paint.Join.BEVEL;
                            }
                            glzVar.i = join;
                            glzVar.j = defpackage.dvf.g(typedArrayK2, xmlPullParser, "strokeMiterLimit", 10, glzVar.j);
                            glzVar.k = defpackage.dvf.u(typedArrayK2, xmlPullParser, theme, "strokeColor", 3);
                            glzVar.c = defpackage.dvf.g(typedArrayK2, xmlPullParser, "strokeAlpha", 11, glzVar.c);
                            glzVar.b = defpackage.dvf.g(typedArrayK2, xmlPullParser, "strokeWidth", 4, glzVar.b);
                            glzVar.f = defpackage.dvf.g(typedArrayK2, xmlPullParser, "trimPathEnd", 6, glzVar.f);
                            glzVar.g = defpackage.dvf.g(typedArrayK2, xmlPullParser, "trimPathOffset", 7, glzVar.g);
                            glzVar.e = defpackage.dvf.g(typedArrayK2, xmlPullParser, "trimPathStart", 5, glzVar.e);
                            glzVar.o = defpackage.dvf.i(typedArrayK2, xmlPullParser, "fillType", 13, glzVar.o);
                        }
                        typedArrayK2.recycle();
                        gmaVar.b.add(glzVar);
                        if (glzVar.getPathName() != null) {
                            gmcVar2.l.put(glzVar.getPathName(), glzVar);
                        }
                        int i8 = gmdVar3.a;
                        i = 3;
                        z = false;
                    } else {
                        depth = depth;
                        if ("clip-path".equals(name)) {
                            gly glyVar = new gly();
                            if (defpackage.dvf.o(xmlPullParser, "pathData")) {
                                android.content.res.TypedArray typedArrayK3 = defpackage.dvf.k(resources, theme, attributeSet, glq.d);
                                java.lang.String string4 = typedArrayK3.getString(0);
                                if (string4 != null) {
                                    glyVar.n = string4;
                                }
                                java.lang.String string5 = typedArrayK3.getString(1);
                                if (string5 != null) {
                                    glyVar.m = defpackage.dvf.d(string5);
                                }
                                glyVar.o = defpackage.dvf.i(typedArrayK3, xmlPullParser, "fillType", 2, 0);
                                typedArrayK3.recycle();
                            }
                            gmaVar.b.add(glyVar);
                            if (glyVar.getPathName() != null) {
                                gmcVar2.l.put(glyVar.getPathName(), glyVar);
                            }
                            int i9 = gmdVar3.a;
                        } else if ("group".equals(name)) {
                            gma gmaVar2 = new gma();
                            android.content.res.TypedArray typedArrayK4 = defpackage.dvf.k(resources, theme, attributeSet, glq.b);
                            gmaVar2.l = null;
                            gmaVar2.c = defpackage.dvf.g(typedArrayK4, xmlPullParser, "rotation", 5, gmaVar2.c);
                            gmaVar2.d = typedArrayK4.getFloat(1, gmaVar2.d);
                            gmaVar2.e = typedArrayK4.getFloat(2, gmaVar2.e);
                            gmaVar2.f = defpackage.dvf.g(typedArrayK4, xmlPullParser, "scaleX", 3, gmaVar2.f);
                            gmaVar2.g = defpackage.dvf.g(typedArrayK4, xmlPullParser, "scaleY", 4, gmaVar2.g);
                            gmaVar2.h = defpackage.dvf.g(typedArrayK4, xmlPullParser, "translateX", 6, gmaVar2.h);
                            gmaVar2.i = defpackage.dvf.g(typedArrayK4, xmlPullParser, "translateY", 7, gmaVar2.i);
                            java.lang.String string6 = typedArrayK4.getString(0);
                            if (string6 != null) {
                                gmaVar2.m = string6;
                            }
                            gmaVar2.N();
                            typedArrayK4.recycle();
                            gmaVar.b.add(gmaVar2);
                            arrayDeque.push(gmaVar2);
                            if (gmaVar2.getGroupName() != null) {
                                gmcVar2.l.put(gmaVar2.getGroupName(), gmaVar2);
                            }
                            int i10 = gmdVar3.a;
                        }
                    }
                    i2 = 2;
                } else {
                    depth = depth;
                }
                i = 3;
                i2 = 2;
            } else {
                i = i3;
                depth = depth;
                i2 = i4;
                if (eventType == i && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i3 = i;
            i4 = i2;
            depth = depth;
        }
        if (z) {
            throw new org.xmlpull.v1.XmlPullParserException("no path defined");
        }
        this.d = c(gmdVar.c, gmdVar.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        gmd gmdVar;
        android.content.res.ColorStateList colorStateList;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((gmdVar = this.b) != null && (gmdVar.b() || ((colorStateList = this.b.c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.g && super.mutate() == this) {
            this.b = new gmd(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.glx, android.graphics.drawable.Drawable
    protected final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        android.graphics.PorterDuff.Mode mode;
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        gmd gmdVar = this.b;
        android.content.res.ColorStateList colorStateList = gmdVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = gmdVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (gmdVar.b()) {
            boolean zG = gmdVar.b.d.G(iArr);
            gmdVar.k |= zG;
            if (zG) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        gmd gmdVar = this.b;
        if (gmdVar.c != colorStateList) {
            gmdVar.c = colorStateList;
            this.d = c(colorStateList, gmdVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        gmd gmdVar = this.b;
        if (gmdVar.d != mode) {
            gmdVar.d = mode;
            this.d = c(gmdVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public gmf() {
        this.c = true;
        this.h = new float[9];
        this.i = new android.graphics.Matrix();
        this.j = new android.graphics.Rect();
        this.b = new gmd();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
