package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class afvm {
    public static final java.util.Comparator a = new defpackage.agl(5);

    public static android.support.v7.widget.ActionMenuView a(android.support.v7.widget.Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof android.support.v7.widget.ActionMenuView) {
                return (android.support.v7.widget.ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static android.widget.ImageButton b(android.support.v7.widget.Toolbar toolbar) {
        android.graphics.drawable.Drawable drawableE = toolbar.e();
        if (drawableE == null) {
            return null;
        }
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof android.widget.ImageButton) {
                android.widget.ImageButton imageButton = (android.widget.ImageButton) childAt;
                if (imageButton.getDrawable() == drawableE) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static java.util.List c(android.support.v7.widget.Toolbar toolbar, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            android.view.View childAt = toolbar.getChildAt(i);
            if (childAt instanceof android.widget.TextView) {
                android.widget.TextView textView = (android.widget.TextView) childAt;
                if (android.text.TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
