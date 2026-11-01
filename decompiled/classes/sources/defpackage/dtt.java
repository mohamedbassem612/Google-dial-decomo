package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dtt extends android.view.View {
    public int[] c;
    public int d;
    protected final android.content.Context e;
    public java.lang.String f;
    protected java.lang.String g;
    public final java.util.HashMap h;
    public defpackage.dtc i;

    public dtt(android.content.Context context) {
        super(context);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    private final void c(java.lang.String str) {
        int iD;
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        int identifier = 0;
        if (!isInEditMode() || constraintLayout == null) {
            iD = 0;
        } else {
            java.lang.Object objEY = constraintLayout.eY(strTrim);
            if (objEY instanceof java.lang.Integer) {
                iD = ((java.lang.Integer) objEY).intValue();
            } else {
                iD = 0;
            }
        }
        if (iD == 0) {
            iD = constraintLayout != null ? d(constraintLayout, strTrim) : 0;
        }
        if (iD == 0) {
            try {
                identifier = duh.class.getField(strTrim).getInt(null);
            } catch (java.lang.Exception unused) {
            }
        } else {
            identifier = iD;
        }
        if (identifier == 0) {
            android.content.Context context = this.e;
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier == 0) {
            android.util.Log.w("ConstraintHelper", defpackage.a.bp((byte) 34, strTrim, "Could not find id of \""));
        } else {
            this.h.put(java.lang.Integer.valueOf(identifier), strTrim);
            i(identifier);
        }
    }

    private final void i(int i) {
        if (i != getId()) {
            int i2 = this.d + 1;
            int[] iArrCopyOf = this.c;
            int length = iArrCopyOf.length;
            if (i2 > length) {
                iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, length << 1);
                this.c = iArrCopyOf;
            }
            int i3 = this.d;
            iArrCopyOf[i3] = i;
            this.d = i3 + 1;
        }
    }

    private final void j(java.lang.String str) {
        if (str == null || str.length() == 0 || this.e == null) {
            return;
        }
        java.lang.String strTrim = str.trim();
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = getParent() instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            android.util.Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof defpackage.dtv) && strTrim.equals(((defpackage.dtv) layoutParams).ac)) {
                if (childAt.getId() == -1) {
                    android.util.Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    i(childAt.getId());
                }
            }
        }
    }

    protected void a(android.util.AttributeSet attributeSet) {
        throw null;
    }

    public final int d(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, java.lang.String str) {
        android.content.res.Resources resources;
        java.lang.String resourceEntryName;
        if (str == null || (resources = this.e.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (android.content.res.Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final void e(java.lang.String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected final void f(java.lang.String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.d = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                j(str.substring(i));
                return;
            } else {
                j(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public final void g(int[] iArr) {
        this.f = null;
        this.d = 0;
        for (int i : iArr) {
            i(i);
        }
    }

    public final void h() {
        if (this.i != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof defpackage.dtv) {
                ((defpackage.dtv) layoutParams).av = this.i;
            }
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        java.lang.String str = this.f;
        if (str != null) {
            e(str);
        }
        java.lang.String str2 = this.g;
        if (str2 != null) {
            f(str2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, java.lang.Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            i(i);
        }
    }

    public dtt(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(attributeSet);
    }

    public dtt(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new int[32];
        this.h = new java.util.HashMap();
        this.e = context;
        a(attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
    }

    public void b(defpackage.dsy dsyVar, boolean z) {
    }
}
