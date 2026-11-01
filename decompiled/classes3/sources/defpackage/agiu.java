package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agiu extends android.widget.FrameLayout {
    public static final xtq e = new xtq("ToolTipOverlayView", (byte[]) null);
    public android.view.View a;
    public final android.widget.FrameLayout b;
    public aomy c;
    public final aoir d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agiu(android.content.Context context) {
        super(context, null, 0);
        aooh.f(context, "context");
        android.view.LayoutInflater.from(context).inflate(2131624624, (android.view.ViewGroup) this, true);
        android.view.View viewFindViewById = findViewById(2131429292);
        aooh.e(viewFindViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewFindViewById;
        this.b = frameLayout;
        frameLayout.setAlpha(0.0f);
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) findViewById(2131427632);
        materialButton.setOnClickListener(new defpackage.aght(materialButton, this, 2));
        setOnClickListener(new defpackage.afrh(this, 12));
        frameLayout.setClickable(true);
        this.d = aooc.ag(new defpackage.addr(this, 16));
    }

    public final android.view.View a() {
        android.view.View view = this.a;
        if (view != null) {
            return view;
        }
        aooh.j("anchorView");
        return null;
    }

    public final void b() {
        android.widget.FrameLayout frameLayout = this.b;
        aggz background = frameLayout.getBackground();
        aggz aggzVar = background instanceof aggz ? background : null;
        if (aggzVar != null) {
            android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(aggzVar.a, 0.0f);
            valueAnimatorOfFloat.setDuration(800L);
            valueAnimatorOfFloat.setInterpolator(new android.view.animation.AnticipateInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new defpackage.afzo(aggzVar, 12));
            valueAnimatorOfFloat.addListener(new defpackage.agit(this));
            valueAnimatorOfFloat.start();
            frameLayout.animate().alpha(0.0f).setDuration(400L).start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        e.x("onAttachToWindow");
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(new jvi(this, 5));
        android.graphics.drawable.Drawable aggzVar = new aggz();
        aggzVar.setColorFilter(new android.graphics.PorterDuffColorFilter(getContext().getColor(2131102691), android.graphics.PorterDuff.Mode.SRC_IN));
        this.b.setBackground(aggzVar);
    }
}
