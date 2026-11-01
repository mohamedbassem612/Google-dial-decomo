package android.support.v7.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class AppCompatViewInflater {
    public final java.lang.Object[] c = new java.lang.Object[2];
    private static final java.lang.Class[] d = {android.content.Context.class, android.util.AttributeSet.class};
    public static final int[] a = {android.R.attr.onClick};
    public static final java.lang.String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final defpackage.aec e = new defpackage.aec(0);

    public hh a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new hh(context, attributeSet);
    }

    public hj b(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new hj(context, attributeSet);
    }

    public hk c(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new hk(context, attributeSet);
    }

    public hv d(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new hv(context, attributeSet);
    }

    public android.support.v7.widget.AppCompatTextView e(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new android.support.v7.widget.AppCompatTextView(context, attributeSet);
    }

    public final android.view.View f(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        defpackage.aec aecVar = e;
        java.lang.reflect.Constructor constructor = (java.lang.reflect.Constructor) aecVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (java.lang.Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = java.lang.Class.forName(str3, false, context.getClassLoader()).asSubclass(android.view.View.class).getConstructor(d);
            aecVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (android.view.View) constructor.newInstance(this.c);
    }
}
