package com.airbnb.lottie;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class LottieAnimationView extends android.support.v7.widget.AppCompatImageView {
    public static final defpackage.gzu a = new defpackage.gze();
    public int b;
    public final defpackage.gzs c;
    public boolean d;
    private final defpackage.gzu e;
    private final defpackage.gzu f;
    private java.lang.String g;
    private int h;
    private boolean i;
    private boolean j;
    private final java.util.Set k;
    private final java.util.Set l;
    private haa m;

    /* JADX INFO: compiled from: PG */
    public class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.gec(8);
        java.lang.String a;
        int b;
        float c;
        boolean d;
        java.lang.String e;
        int f;
        int g;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public LottieAnimationView(android.content.Context context) {
        super(context);
        this.e = new defpackage.gzg(this, 0);
        this.f = new defpackage.gzg(this, 1, null);
        this.b = 0;
        this.c = new defpackage.gzs();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new java.util.HashSet();
        this.l = new java.util.HashSet();
        u(null, 2130969816);
    }

    private final void t() {
        haa haaVar = this.m;
        if (haaVar != null) {
            haaVar.f(this.e);
            this.m.e(this.f);
        }
    }

    private final void u(android.util.AttributeSet attributeSet, int i) {
        java.lang.String string;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.hac.a, i, 0);
        this.d = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue) {
            if (zHasValue2) {
                throw new java.lang.IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                h(resourceId);
            }
        } else if (zHasValue2) {
            java.lang.String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                i(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            v(this.d ? defpackage.gzl.f(getContext(), string, "url_".concat(string)) : defpackage.gzl.f(getContext(), string, null));
        }
        this.b = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.j = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(12, false)) {
            this.c.s(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            q(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            p(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            r(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            this.c.o(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.c.n(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            java.lang.String string3 = typedArrayObtainStyledAttributes.getString(6);
            defpackage.gzs gzsVar = this.c;
            gzsVar.h = string3;
            defpackage.hcr hcrVarF = gzsVar.f();
            if (hcrVarF != null) {
                hcrVarF.e = string3;
            }
        }
        m(typedArrayObtainStyledAttributes.getString(11));
        o(typedArrayObtainStyledAttributes.getFloat(13, 0.0f), typedArrayObtainStyledAttributes.hasValue(13));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(7, false);
        defpackage.gzs gzsVar2 = this.c;
        gzsVar2.i(z);
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            b(new defpackage.hcw("**"), defpackage.gzx.K, new defpackage.hgp(new defpackage.had(dvx.d(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(15, 0);
            a.M();
            if (i2 >= 3) {
                i2 = 0;
            }
            gzsVar2.y(a.M()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            a.M();
            if (i3 >= 3) {
                i3 = 0;
            }
            gzsVar2.r = a.M()[i3];
        }
        gzsVar2.d = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            gzsVar2.c.l = typedArrayObtainStyledAttributes.getBoolean(20, false);
        }
        typedArrayObtainStyledAttributes.recycle();
        gzsVar2.t(java.lang.Boolean.valueOf(defpackage.hgm.b(getContext()) != 0.0f));
    }

    private final void v(haa haaVar) {
        defpackage.gzs gzsVar = this.c;
        defpackage.gzy gzyVar = haaVar.b;
        if (gzyVar != null && gzsVar == getDrawable() && gzsVar.b == gzyVar.a) {
            return;
        }
        this.k.add(defpackage.gzf.a);
        gzsVar.h();
        t();
        haaVar.d(this.e);
        haaVar.c(this.f);
        this.m = haaVar;
    }

    public final void a(android.animation.Animator.AnimatorListener animatorListener) {
        this.c.c.addListener(animatorListener);
    }

    public final void b(defpackage.hcw hcwVar, java.lang.Object obj, defpackage.hgp hgpVar) {
        this.c.g(hcwVar, obj, hgpVar);
    }

    public final void c() {
        this.j = false;
        this.k.add(defpackage.gzf.f);
        defpackage.gzs gzsVar = this.c;
        gzsVar.e.clear();
        gzsVar.c.cancel();
        if (gzsVar.isVisible()) {
            return;
        }
        gzsVar.q = 1;
    }

    public final void d() {
        this.j = false;
        this.c.j();
    }

    public final void e() {
        this.k.add(defpackage.gzf.f);
        this.c.k();
    }

    public final void f(android.animation.Animator.AnimatorListener animatorListener) {
        this.c.c.removeListener(animatorListener);
    }

    public final void g() {
        this.k.add(defpackage.gzf.f);
        this.c.m();
    }

    public final void h(int i) {
        haa haaVarE;
        this.h = i;
        this.g = null;
        if (isInEditMode()) {
            haaVarE = new haa(new defpackage.lqh(this, i, 1), true);
        } else if (this.d) {
            android.content.Context context = getContext();
            haaVarE = defpackage.gzl.e(context, i, defpackage.gzl.g(context, i));
        } else {
            haaVarE = defpackage.gzl.e(getContext(), i, null);
        }
        v(haaVarE);
    }

    public final void i(java.lang.String str) {
        haa haaVarD;
        this.g = str;
        this.h = 0;
        if (isInEditMode()) {
            haaVarD = new haa(new defpackage.gzk(this, str, 1), true);
        } else {
            haaVarD = this.d ? defpackage.gzl.d(getContext(), str, "asset_".concat(java.lang.String.valueOf(str))) : defpackage.gzl.d(getContext(), str, null);
        }
        v(haaVarD);
    }

    public final void invalidate() {
        super.invalidate();
        android.graphics.drawable.Drawable drawable = getDrawable();
        if ((drawable instanceof defpackage.gzs) && ((defpackage.gzs) drawable).m) {
            this.c.invalidateSelf();
        }
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable drawable2 = getDrawable();
        defpackage.gzs gzsVar = this.c;
        if (drawable2 == gzsVar) {
            super.invalidateDrawable(gzsVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void j(java.io.InputStream inputStream, java.lang.String str) {
        java.util.Map map = defpackage.gzl.a;
        v(defpackage.gzl.c(str, new defpackage.gzk(inputStream, str, 0), new defpackage.fkh(inputStream, 10, null)));
    }

    public final void k(java.lang.String str, java.lang.String str2) {
        j(new java.io.ByteArrayInputStream(str.getBytes()), str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(defpackage.gzh gzhVar) {
        defpackage.gzs gzsVar = this.c;
        gzsVar.setCallback(this);
        this.i = true;
        boolean zW = gzsVar.w(gzhVar);
        if (this.j) {
            gzsVar.k();
        }
        this.i = false;
        if (getDrawable() == gzsVar) {
            if (!zW) {
                return;
            }
        } else if (!zW) {
            boolean zS = s();
            setImageDrawable((android.graphics.drawable.Drawable) null);
            setImageDrawable(gzsVar);
            if (zS) {
                gzsVar.m();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        java.util.Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((defpackage.gzw) it.next()).a();
        }
    }

    public final void m(java.lang.String str) {
        this.c.g = str;
    }

    public final void n(int i, int i2) {
        this.c.q(i, i2);
    }

    public final void o(float f, boolean z) {
        if (z) {
            this.k.add(defpackage.gzf.b);
        }
        this.c.r(f);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.j) {
            return;
        }
        this.c.k();
    }

    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof com.airbnb.lottie.LottieAnimationView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.airbnb.lottie.LottieAnimationView.SavedState savedState = (com.airbnb.lottie.LottieAnimationView.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.g = savedState.a;
        java.util.Set set = this.k;
        defpackage.gzf gzfVar = defpackage.gzf.a;
        if (!set.contains(gzfVar) && !android.text.TextUtils.isEmpty(this.g)) {
            i(this.g);
        }
        this.h = savedState.b;
        if (!set.contains(gzfVar) && (i = this.h) != 0) {
            h(i);
        }
        if (!set.contains(defpackage.gzf.b)) {
            o(savedState.c, false);
        }
        if (!set.contains(defpackage.gzf.f) && savedState.d) {
            e();
        }
        if (!set.contains(defpackage.gzf.e)) {
            m(savedState.e);
        }
        if (!set.contains(defpackage.gzf.c)) {
            q(savedState.f);
        }
        if (set.contains(defpackage.gzf.d)) {
            return;
        }
        p(savedState.g);
    }

    protected final android.os.Parcelable onSaveInstanceState() {
        boolean z;
        com.airbnb.lottie.LottieAnimationView.SavedState savedState = new com.airbnb.lottie.LottieAnimationView.SavedState(super.onSaveInstanceState());
        savedState.a = this.g;
        savedState.b = this.h;
        defpackage.gzs gzsVar = this.c;
        savedState.c = gzsVar.c();
        if (gzsVar.isVisible()) {
            z = gzsVar.c.k;
        } else {
            int i = gzsVar.q;
            z = i == 2 || i == 3;
        }
        savedState.d = z;
        savedState.e = gzsVar.g;
        savedState.f = gzsVar.c.getRepeatMode();
        savedState.g = gzsVar.e();
        return savedState;
    }

    public final void p(int i) {
        this.k.add(defpackage.gzf.d);
        this.c.s(i);
    }

    public final void q(int i) {
        this.k.add(defpackage.gzf.c);
        this.c.c.setRepeatMode(i);
    }

    public final void r(float f) {
        this.c.c.c = f;
    }

    public final boolean s() {
        return this.c.v();
    }

    public final void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.h = 0;
        this.g = null;
        t();
        super.setImageBitmap(bitmap);
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        this.h = 0;
        this.g = null;
        t();
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        this.h = 0;
        this.g = null;
        t();
        super.setImageResource(i);
    }

    public final void unscheduleDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.gzs gzsVar;
        if (!this.i && drawable == (gzsVar = this.c) && gzsVar.v()) {
            d();
        } else if (!this.i && (drawable instanceof defpackage.gzs)) {
            defpackage.gzs gzsVar2 = (defpackage.gzs) drawable;
            if (gzsVar2.v()) {
                gzsVar2.j();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new defpackage.gzg(this, 0);
        this.f = new defpackage.gzg(this, 1, null);
        this.b = 0;
        this.c = new defpackage.gzs();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new java.util.HashSet();
        this.l = new java.util.HashSet();
        u(attributeSet, 2130969816);
    }

    public LottieAnimationView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new defpackage.gzg(this, 0);
        this.f = new defpackage.gzg(this, 1, null);
        this.b = 0;
        this.c = new defpackage.gzs();
        this.i = false;
        this.j = false;
        this.d = true;
        this.k = new java.util.HashSet();
        this.l = new java.util.HashSet();
        u(attributeSet, i);
    }
}
