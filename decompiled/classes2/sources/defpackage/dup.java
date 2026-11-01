package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dup extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.dum a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public final android.graphics.Rect p;
    java.lang.Object q;
    private boolean r;

    public dup(android.content.Context context, android.util.AttributeSet attributeSet) {
        defpackage.dum dumVar;
        super(context, attributeSet);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, duk.b);
        this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.b = zHasValue;
        if (zHasValue) {
            java.lang.String string = typedArrayObtainStyledAttributes.getString(3);
            int i = androidx.coordinatorlayout.widget.CoordinatorLayout.i;
            if (android.text.TextUtils.isEmpty(string)) {
                dumVar = null;
            } else {
                if (string.startsWith(".")) {
                    string = java.lang.String.valueOf(context.getPackageName()).concat(java.lang.String.valueOf(string));
                } else if (string.indexOf(46) < 0) {
                    java.lang.String str = androidx.coordinatorlayout.widget.CoordinatorLayout.a;
                    if (!android.text.TextUtils.isEmpty(str)) {
                        string = str + '.' + string;
                    }
                }
                try {
                    java.lang.ThreadLocal threadLocal = androidx.coordinatorlayout.widget.CoordinatorLayout.c;
                    java.util.Map map = (java.util.Map) threadLocal.get();
                    if (map == null) {
                        map = new java.util.HashMap();
                        threadLocal.set(map);
                    }
                    java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = java.lang.Class.forName(string, false, context.getClassLoader()).getConstructor(androidx.coordinatorlayout.widget.CoordinatorLayout.b);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    dumVar = (defpackage.dum) constructor.newInstance(context, attributeSet);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Could not inflate Behavior subclass ".concat(java.lang.String.valueOf(string)), e);
                }
            }
            this.a = dumVar;
        }
        typedArrayObtainStyledAttributes.recycle();
        defpackage.dum dumVar2 = this.a;
        if (dumVar2 != null) {
            dumVar2.onAttachedToLayoutParams(this);
        }
    }

    public final void a() {
        this.o = false;
    }

    public final void b(defpackage.dum dumVar) {
        defpackage.dum dumVar2 = this.a;
        if (dumVar2 != dumVar) {
            if (dumVar2 != null) {
                dumVar2.onDetachedFromLayoutParams();
            }
            this.a = dumVar;
            this.q = null;
            this.b = true;
            if (dumVar != null) {
                dumVar.onAttachedToLayoutParams(this);
            }
        }
    }

    public final void c(int i, boolean z) {
        if (i != 0) {
            this.r = z;
        } else {
            this.n = z;
        }
    }

    public final boolean d(int i) {
        return i != 0 ? this.r : this.n;
    }

    public dup() {
        super(-2, -2);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dup(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dup(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }

    public dup(defpackage.dup dupVar) {
        super((android.view.ViewGroup.MarginLayoutParams) dupVar);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.p = new android.graphics.Rect();
    }
}
