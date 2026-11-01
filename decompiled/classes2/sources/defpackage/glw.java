package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class glw extends glx implements android.graphics.drawable.Animatable {
    private final android.content.Context f;
    public android.animation.Animator.AnimatorListener b = null;
    public java.util.ArrayList c = null;
    public final android.graphics.drawable.Drawable.Callback d = new ykm(this, 1);
    public final defpackage.glu a = new defpackage.glu();

    public glw(android.content.Context context) {
        this.f = context;
    }

    public final void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public final boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        defpackage.glu gluVar = this.a;
        gluVar.b.draw(canvas);
        if (gluVar.c.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.a.b.getAlpha();
    }

    public final int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        int i = this.a.a;
        return changingConfigurations;
    }

    public final android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.a.b.getColorFilter();
    }

    public final android.graphics.drawable.Drawable.ConstantState getConstantState() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return new defpackage.glv(drawable.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : this.a.b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : this.a.b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.getOpacity() : this.a.b.getOpacity();
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    android.content.res.TypedArray typedArrayK = dvf.k(resources, theme, attributeSet, defpackage.glq.e);
                    int resourceId = typedArrayK.getResourceId(0, 0);
                    if (resourceId != 0) {
                        gmf gmfVarB = gmf.b(resources, resourceId, theme);
                        gmfVarB.c = false;
                        gmfVarB.setCallback(this.d);
                        defpackage.glu gluVar = this.a;
                        gmf gmfVar = gluVar.b;
                        if (gmfVar != null) {
                            gmfVar.setCallback((android.graphics.drawable.Drawable.Callback) null);
                        }
                        gluVar.b = gmfVarB;
                    }
                    typedArrayK.recycle();
                } else if ("target".equals(name)) {
                    android.content.res.TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, defpackage.glq.f);
                    java.lang.String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.f;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                        android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, resourceId2);
                        defpackage.glu gluVar2 = this.a;
                        animatorLoadAnimator.setTarget(gluVar2.b.b.b.l.get(string));
                        if (gluVar2.d == null) {
                            gluVar2.d = new java.util.ArrayList();
                            gluVar2.e = new aca();
                        }
                        gluVar2.d.add(animatorLoadAnimator);
                        gluVar2.e.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        defpackage.glu gluVar3 = this.a;
        if (gluVar3.c == null) {
            gluVar3.c = new android.animation.AnimatorSet();
        }
        gluVar3.c.playTogether(gluVar3.d);
    }

    public final boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.a.b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? ((android.graphics.drawable.AnimatedVectorDrawable) drawable).isRunning() : this.a.c.isRunning();
    }

    public final boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.isStateful() : this.a.b.isStateful();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    protected final void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.a.b.setBounds(rect);
        }
    }

    protected final boolean onLevelChange(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setLevel(i) : this.a.b.setLevel(i);
    }

    protected final boolean onStateChange(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.e;
        return drawable != null ? drawable.setState(iArr) : this.a.b.setState(iArr);
    }

    public final void setAlpha(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.a.b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.a.b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.a.b.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.a.b.setTint(i);
        }
    }

    public final void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.a.b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.a.b.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.a.b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).start();
            return;
        }
        defpackage.glu gluVar = this.a;
        if (gluVar.c.isStarted()) {
            return;
        }
        gluVar.c.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        android.graphics.drawable.Drawable drawable = this.e;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).stop();
        } else {
            this.a.c.end();
        }
    }

    public final void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
