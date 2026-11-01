package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aggi {
    public static final java.util.HashMap a = new java.util.HashMap();

    public static int a(int i, float f) {
        return android.graphics.Color.argb((int) (f * 255.0f), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i));
    }

    public static android.graphics.drawable.GradientDrawable b(android.widget.Button button) {
        android.graphics.drawable.Drawable background = button.getBackground();
        if (background instanceof android.graphics.drawable.InsetDrawable) {
            return (android.graphics.drawable.GradientDrawable) ((android.graphics.drawable.LayerDrawable) ((android.graphics.drawable.InsetDrawable) background).getDrawable()).getDrawable(0);
        }
        if (!(background instanceof android.graphics.drawable.RippleDrawable)) {
            return null;
        }
        android.graphics.drawable.RippleDrawable rippleDrawable = (android.graphics.drawable.RippleDrawable) background;
        return rippleDrawable.getDrawable(0) instanceof android.graphics.drawable.GradientDrawable ? (android.graphics.drawable.GradientDrawable) rippleDrawable.getDrawable(0) : (android.graphics.drawable.GradientDrawable) ((android.graphics.drawable.InsetDrawable) rippleDrawable.getDrawable(0)).getDrawable();
    }

    static void c(android.content.Context context, android.widget.Button button, defpackage.agfx agfxVar) {
        if (defpackage.agfz.i(context).v(agfxVar)) {
            int iB = defpackage.agfz.i(context).b(context, agfxVar);
            if (iB != 0) {
                button.setTextColor(android.content.res.ColorStateList.valueOf(iB));
                return;
            }
            return;
        }
        java.util.HashMap map = a;
        if (!map.containsKey(java.lang.Integer.valueOf(button.getId()))) {
            throw new java.lang.IllegalStateException("There is no saved default color for button");
        }
        button.setTextColor((android.content.res.ColorStateList) map.get(java.lang.Integer.valueOf(button.getId())));
    }

    static void d(android.widget.Button button, int i) {
        if (i != 0) {
            button.setTextColor(android.content.res.ColorStateList.valueOf(i));
        }
    }

    static void e(android.content.Context context, android.widget.Button button, defpackage.agfx agfxVar) {
        d(button, defpackage.agfz.i(context).b(context, agfxVar));
    }
}
