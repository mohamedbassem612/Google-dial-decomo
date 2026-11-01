package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
@java.lang.Deprecated
public final class yee {
    public static defpackage.yec a(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            java.lang.Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.IllegalAccessException e) {
                h(cls, e);
            } catch (java.lang.InstantiationException e2) {
                h(cls, e2);
            } catch (java.lang.NoSuchMethodException e3) {
                h(cls, e3);
            } catch (java.lang.reflect.InvocationTargetException e4) {
                h(cls, e4);
            }
            if (objNewInstance instanceof defpackage.yec) {
                return (defpackage.yec) objNewInstance;
            }
            throw new java.lang.RuntimeException("Expected instanceof GlideModule, but found: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(objNewInstance))));
        } catch (java.lang.ClassNotFoundException e5) {
            throw new java.lang.IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static java.lang.CharSequence b(android.content.Context context) {
        return g(context) + (-1) != 0 ? context.getText(2132018111) : context.getText(2132018110);
    }

    public static java.lang.CharSequence c(android.content.Context context) {
        return g(context) + (-1) != 0 ? context.getText(2132017714) : context.getText(2132017713);
    }

    public static java.lang.CharSequence d(android.content.Context context) {
        return g(context) + (-1) != 0 ? context.getText(2132020233) : context.getText(2132020232);
    }

    public static java.lang.CharSequence e(android.content.Context context) {
        return g(context) + (-1) != 0 ? context.getText(2132020239) : context.getText(2132020238);
    }

    public static java.lang.CharSequence f(android.content.Context context, java.lang.CharSequence charSequence) {
        return g(context) + (-1) != 0 ? android.text.TextUtils.expandTemplate(context.getText(2132020237), charSequence) : android.text.TextUtils.expandTemplate(context.getText(2132020236), charSequence);
    }

    @java.lang.Deprecated
    public static int g(android.content.Context context) {
        return ((java.lang.Long) ((ujc) agab.aH(context, ujc.class)).hT().a()).longValue() == 230151 ? 2 : 1;
    }

    private static void h(java.lang.Class cls, java.lang.Exception exc) {
        throw new java.lang.RuntimeException("Unable to instantiate GlideModule implementation for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(cls))), exc);
    }
}
