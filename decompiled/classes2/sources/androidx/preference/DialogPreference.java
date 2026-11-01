package androidx.preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class DialogPreference extends androidx.preference.Preference {
    public java.lang.CharSequence a;
    public java.lang.CharSequence b;
    public android.graphics.drawable.Drawable c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public int f;

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gfd.c, i, i2);
        java.lang.String strM = dvf.m(typedArrayObtainStyledAttributes, 9, 0);
        this.a = strM;
        if (strM == null) {
            this.a = v();
        }
        this.b = dvf.m(typedArrayObtainStyledAttributes, 8, 1);
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(6);
        this.c = drawable == null ? typedArrayObtainStyledAttributes.getDrawable(2) : drawable;
        this.d = dvf.m(typedArrayObtainStyledAttributes, 11, 3);
        this.e = dvf.m(typedArrayObtainStyledAttributes, 10, 4);
        this.f = dvf.j(typedArrayObtainStyledAttributes, 7, 5, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    protected void c() {
        defpackage.gew gewVar = this.k.f;
        if (gewVar != null) {
            gewVar.p(this);
        }
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, dvf.h(context, 2130969256, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public DialogPreference(android.content.Context context) {
        this(context, null);
    }
}
