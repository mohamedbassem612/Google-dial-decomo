package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agby extends defpackage.agbv {
    private static final int[] w = {2130970405, 2130970408};
    private final android.view.accessibility.AccessibilityManager x;
    private boolean y;

    private agby(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout) {
        super(context, viewGroup, view, snackbarContentLayout);
        this.x = (android.view.accessibility.AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static defpackage.agby o(android.view.View view, int i, int i2) {
        return q(view, view.getResources().getText(i), i2);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:30:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:? A[LOOP:0: B:3:0x0002->B:34:?, LOOP_END, SYNTHETIC] */
    public static defpackage.agby q(android.view.View view, java.lang.CharSequence charSequence, int i) {
        android.view.ViewGroup viewGroup;
        java.lang.Object parent;
        android.view.ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
                viewGroup = (android.view.ViewGroup) view;
                break;
            }
            if (!(view instanceof android.widget.FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof android.view.View) {
                        view = (android.view.View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (android.view.ViewGroup) view;
                    break;
                }
                viewGroup2 = (android.view.ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof android.view.View) {
                        view = (android.view.View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        android.content.Context context = viewGroup.getContext();
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(context);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(w);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        int i2 = 2131624129;
        if (resourceId != -1 && resourceId2 != -1) {
            i2 = 2131624329;
        }
        com.google.android.material.snackbar.SnackbarContentLayout snackbarContentLayout = (com.google.android.material.snackbar.SnackbarContentLayout) layoutInflaterFrom.inflate(i2, viewGroup, false);
        defpackage.agby agbyVar = new defpackage.agby(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        agbyVar.t().setText(charSequence);
        agbyVar.k = i;
        return agbyVar;
    }

    private final android.widget.TextView t() {
        return p().a;
    }

    @Override // defpackage.agbv
    public final int a() {
        int i = this.k;
        if (i != -2) {
            return da$.ExternalSyntheticApiModelOutline0.m(this.x, i, (true != this.y ? 0 : 4) | 3);
        }
        return -2;
    }

    public final com.google.android.material.snackbar.SnackbarContentLayout p() {
        return (com.google.android.material.snackbar.SnackbarContentLayout) this.j.getChildAt(0);
    }

    public final void r(int i) {
        t().setMaxLines(i);
    }

    public final void s(int i, android.view.View.OnClickListener onClickListener) {
        java.lang.CharSequence text = this.i.getText(i);
        android.widget.Button button = p().b;
        byte[] bArr = null;
        if (android.text.TextUtils.isEmpty(text)) {
            button.setVisibility(8);
            button.setOnClickListener(null);
            this.y = false;
        } else {
            this.y = true;
            button.setVisibility(0);
            button.setText(text);
            button.setOnClickListener(new defpackage.wgf(this, onClickListener, 20, bArr));
        }
    }
}
