package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cw {
    public final int B;
    public final int C;
    final int D;
    final int E;
    final int F;
    final int G;
    public final boolean H;
    public final android.os.Handler I;
    public final android.content.Context a;
    public final defpackage.ds b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    android.widget.ListView f;
    public android.view.View g;
    public int h;
    public android.widget.Button j;
    public java.lang.CharSequence k;
    public android.os.Message l;
    public android.widget.Button m;
    public java.lang.CharSequence n;
    public android.os.Message o;
    public android.widget.Button p;
    public java.lang.CharSequence q;
    public android.os.Message r;
    androidx.core.widget.NestedScrollView s;
    public android.graphics.drawable.Drawable u;
    public android.widget.ImageView v;
    public android.widget.TextView w;
    public android.widget.TextView x;
    public android.view.View y;
    android.widget.ListAdapter z;
    public boolean i = false;
    public int t = 0;
    int A = -1;
    public final android.view.View.OnClickListener J = new defpackage.gr(this, 1);

    public cw(android.content.Context context, defpackage.ds dsVar, android.view.Window window) {
        this.a = context;
        this.b = dsVar;
        this.c = window;
        this.I = new defpackage.cu(dsVar);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ef.e, 2130968628, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.F = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.G = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.H = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dsVar.g();
    }

    static boolean b(android.view.View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (b(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void c(android.widget.Button button) {
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final android.view.ViewGroup d(android.view.View view, android.view.View view2) {
        if (view == null) {
            if (view2 instanceof android.view.ViewStub) {
                view2 = ((android.view.ViewStub) view2).inflate();
            }
            return (android.view.ViewGroup) view2;
        }
        if (view2 != null) {
            android.view.ViewParent parent = view2.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof android.view.ViewStub) {
            view = ((android.view.ViewStub) view).inflate();
        }
        return (android.view.ViewGroup) view;
    }

    public final void a(java.lang.CharSequence charSequence) {
        this.d = charSequence;
        android.widget.TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void e(int i, java.lang.CharSequence charSequence, android.content.DialogInterface.OnClickListener onClickListener) {
        android.os.Message messageObtainMessage = onClickListener != null ? this.I.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.q = charSequence;
            this.r = messageObtainMessage;
        } else if (i != -2) {
            this.k = charSequence;
            this.l = messageObtainMessage;
        } else {
            this.n = charSequence;
            this.o = messageObtainMessage;
        }
    }
}
