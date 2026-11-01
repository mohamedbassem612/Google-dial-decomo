package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aejm {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    private final java.lang.Object d;

    public aejm(android.widget.TextView textView) {
        this.a = ahwt.a;
        this.c = aike.a;
        this.d = textView;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Iterable, java.lang.Object] */
    public final defpackage.aejl a(float f) {
        java.lang.String str = null;
        java.lang.String str2 = (java.lang.String) ahvr.bl((java.lang.Iterable) this.c, (java.lang.Object) null);
        float f2 = 0.0f;
        boolean z = false;
        if (f > 0.0f) {
            android.text.TextPaint paint = ((android.widget.TextView) this.d).getPaint();
            for (java.lang.String str3 : this.c) {
                float fMeasureText = paint.measureText(str3);
                if (fMeasureText <= f) {
                    z = true;
                    str = str3;
                    f2 = fMeasureText;
                    break;
                }
                f2 = fMeasureText;
            }
            if (str != null) {
                str2 = str;
            }
        }
        if (str2 == null || !str2.contentEquals(((android.widget.TextView) this.d).getText())) {
            ((android.widget.TextView) this.d).setText(str2);
        }
        return new defpackage.aejl(z, f2);
    }

    public final void b(int i) {
        float f;
        float f2;
        java.lang.Object obj = this.d;
        android.widget.TextView textView = (android.widget.TextView) obj;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        android.view.View view = (android.view.View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getCompoundPaddingLeft() + textView.getCompoundPaddingRight();
        if (obj instanceof com.google.android.material.chip.Chip) {
            defpackage.afrz afrzVar = ((com.google.android.material.chip.Chip) obj).c;
            if (afrzVar != null) {
                f = afrzVar.i;
                f2 = afrzVar.j;
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            paddingLeft += f + f2;
        }
        float f3 = i - paddingLeft;
        if (((ahyn) this.a).f() && f3 == ((java.lang.Float) ((ahyn) this.a).b()).floatValue() && this.b != null) {
            return;
        }
        this.a = ahyn.h(java.lang.Float.valueOf(f3));
        this.b = a(f3);
    }

    public final void c(defpackage.aelu aeluVar, java.lang.Object obj) {
        if (obj == null || aeluVar == null) {
            return;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) aeluVar.b(obj).a).add(this.d);
    }

    public final void d(defpackage.aelu aeluVar, java.lang.Object obj) {
        if (obj == null || aeluVar == null) {
            return;
        }
        ((java.util.concurrent.CopyOnWriteArrayList) aeluVar.b(obj).a).remove(this.d);
    }

    public aejm(aehj aehjVar) {
        this.d = aehjVar;
    }
}
