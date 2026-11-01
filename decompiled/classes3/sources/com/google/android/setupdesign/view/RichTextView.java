package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class RichTextView extends android.support.v7.widget.AppCompatTextView implements defpackage.aghp {
    public static android.graphics.Typeface a;
    private defpackage.agha b;

    public RichTextView(android.content.Context context) {
        super(context);
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void a() {
        if (isInEditMode()) {
            return;
        }
        defpackage.agha aghaVar = new defpackage.agha();
        this.b = aghaVar;
        dzs.i(this, aghaVar);
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        for (android.graphics.drawable.Drawable drawable : getCompoundDrawablesRelative()) {
            if (drawable != null && drawable.setState(drawableState)) {
                invalidateDrawable(drawable);
            }
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        android.text.method.MovementMethod movementMethod = getMovementMethod();
        if (!(movementMethod instanceof defpackage.agiv)) {
            return zOnTouchEvent;
        }
        defpackage.agiv agivVar = (defpackage.agiv) movementMethod;
        return agivVar.b == motionEvent ? agivVar.a : zOnTouchEvent;
    }

    public final void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        java.lang.Object aghqVar;
        android.content.Context context = getContext();
        if (charSequence instanceof android.text.Spanned) {
            android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
            for (android.text.Annotation annotation : (android.text.Annotation[]) spannableString.getSpans(0, spannableString.length(), android.text.Annotation.class)) {
                java.lang.String key = annotation.getKey();
                if ("textAppearance".equals(key)) {
                    int identifier = context.getResources().getIdentifier(annotation.getValue(), "style", context.getPackageName());
                    if (identifier == 0) {
                        android.util.Log.w("RichTextView", "Cannot find resource: 0");
                        identifier = 0;
                    }
                    defpackage.aftt.v(spannableString, annotation, new android.text.style.TextAppearanceSpan(context, identifier));
                } else if ("link".equals(key)) {
                    if (a.o()) {
                        annotation.getValue();
                        aghqVar = new defpackage.aghn(context);
                    } else {
                        annotation.getValue();
                        aghqVar = new defpackage.aghq();
                    }
                    defpackage.aftt.v(spannableString, annotation, aghqVar, a != null ? new android.text.style.TypefaceSpan(a) : new android.text.style.TypefaceSpan("sans-serif-medium"));
                }
            }
            charSequence = spannableString;
        }
        super.setText(charSequence, bufferType);
        boolean z = (charSequence instanceof android.text.Spanned) && ((android.text.style.ClickableSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.ClickableSpan.class)).length > 0;
        if (z) {
            setMovementMethod(new defpackage.agiv());
        } else {
            setMovementMethod(null);
        }
        setFocusable(z);
        setRevealOnFocusHint(false);
        setFocusableInTouchMode(z);
    }

    public RichTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    @Override // defpackage.aghp
    public final void h() {
    }
}
