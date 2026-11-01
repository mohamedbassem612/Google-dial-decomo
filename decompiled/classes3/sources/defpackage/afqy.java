package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class afqy extends ds {
    public com.google.android.material.bottomsheet.BottomSheetBehavior a;
    public android.widget.FrameLayout b;
    public boolean c;
    public boolean d;
    public boolean e;
    public afqx f;
    private android.widget.FrameLayout g;
    private androidx.coordinatorlayout.widget.CoordinatorLayout h;
    private final boolean i;
    private final defpackage.afqs j;
    private aogc k;

    public afqy(android.content.Context context, int i) {
        if (i == 0) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            i = context.getTheme().resolveAttribute(2130968752, typedValue, true) ? typedValue.resourceId : 2132084604;
        }
        super(context, i);
        this.c = true;
        this.d = true;
        this.j = new defpackage.afqw(this);
        g();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{2130969338});
        this.i = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.view.View b(int i, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        j();
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayoutFindViewById = this.g.findViewById(2131427900);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (android.view.ViewGroup) coordinatorLayoutFindViewById, false);
        }
        if (this.i) {
            android.widget.FrameLayout frameLayout = this.g;
            ebx ebxVar = new ebx(this, 11);
            int i2 = dzs.a;
            dzk.o(frameLayout, ebxVar);
        }
        this.b.removeAllViews();
        android.widget.FrameLayout frameLayout2 = this.b;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayoutFindViewById.findViewById(2131429309).setOnClickListener(new defpackage.afrh(this, 1));
        dzs.i(this.b, new defpackage.afqv(this));
        this.b.setOnTouchListener(new defpackage.afmg(this, 2));
        return this.g;
    }

    private final void d() {
        aogc aogcVar = this.k;
        if (aogcVar != null) {
            if (this.c) {
                aogcVar.I(false);
            } else {
                aogcVar.J();
            }
        }
    }

    private final void j() {
        if (this.g == null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), 2131624127, null);
            this.g = frameLayout;
            frameLayout.findViewById(2131428748);
            this.h = this.g.findViewById(2131427900);
            android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) this.g.findViewById(2131427944);
            this.b = frameLayout2;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(frameLayout2);
            this.a = bottomSheetBehaviorH;
            bottomSheetBehaviorH.i(this.j);
            this.a.s(this.c);
            this.k = new aogc(this.a, this.b);
        }
    }

    public final com.google.android.material.bottomsheet.BottomSheetBehavior a() {
        if (this.a == null) {
            j();
        }
        return this.a;
    }

    public final void cancel() {
        a();
        super.cancel();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.view.Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.i && android.graphics.Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            android.widget.FrameLayout frameLayout = this.g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            dzn.c(window, z2);
            afqx afqxVar = this.f;
            if (afqxVar != null) {
                afqxVar.d(window);
            }
        }
        d();
    }

    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onDetachedFromWindow() {
        afqx afqxVar = this.f;
        if (afqxVar != null) {
            afqxVar.d((android.view.Window) null);
        }
        aogc aogcVar = this.k;
        if (aogcVar != null) {
            aogcVar.J();
        }
    }

    protected void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior == null || bottomSheetBehavior.y != 5) {
            return;
        }
        bottomSheetBehavior.t(4);
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.c != z) {
            this.c = z;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.s(z);
            }
            if (getWindow() != null) {
                d();
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.c) {
            this.c = true;
        }
        this.d = z;
        this.e = true;
    }

    public final void setContentView(android.view.View view) {
        super.setContentView(b(0, view, null));
    }

    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
