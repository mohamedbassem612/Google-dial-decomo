package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agia implements defpackage.aggl {
    private static final xtq l = new xtq(defpackage.agia.class);
    public final com.airbnb.lottie.LottieAnimationView a;
    private final com.google.android.setupcompat.internal.TemplateLayout b;
    private final int c;
    private final android.widget.ImageView.ScaleType d;
    private final android.content.Context e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i = false;
    private final android.os.Handler j = new android.os.Handler(android.os.Looper.getMainLooper());
    private final java.lang.Runnable k = new defpackage.agdr(this, 3);

    public agia(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        int i2;
        this.f = false;
        this.g = true;
        this.h = 0;
        new java.util.HashMap();
        this.b = templateLayout;
        android.content.Context context = templateLayout.getContext();
        this.e = context;
        com.airbnb.lottie.LottieAnimationView lottieAnimationViewG = templateLayout.g(2131429098);
        this.a = lottieAnimationViewG;
        android.widget.ImageView imageViewB = b();
        if (imageViewB != null) {
            i2 = imageViewB.getLayoutParams().height;
            this.c = i2;
            this.d = imageViewB.getScaleType();
        } else {
            this.c = 0;
            this.d = null;
            i2 = 0;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.m, i, 0);
        this.f = typedArrayObtainStyledAttributes.getBoolean(2, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.h = resourceId;
        if (resourceId != 0 || defpackage.agfz.t(context)) {
            int i3 = this.h;
            android.widget.ImageView imageViewB2 = b();
            if (imageViewB2 != null) {
                imageViewB2.setImageResource(i3);
                if (!defpackage.agfz.t(context)) {
                    imageViewB2.setVisibility(i3 != 0 ? 0 : 8);
                    d(imageViewB2.getVisibility());
                } else if (defpackage.aggo.c(context)) {
                    imageViewB2.setVisibility(8);
                    if (lottieAnimationViewG != null) {
                        lottieAnimationViewG.setVisibility(0);
                        if (!this.i) {
                            lottieAnimationViewG.setImageResource(i3);
                            if (i3 == 0 || this.f) {
                                lottieAnimationViewG.clearColorFilter();
                            } else {
                                android.util.TypedValue typedValue = new android.util.TypedValue();
                                lottieAnimationViewG.setColorFilter(new android.graphics.PorterDuffColorFilter(context.getTheme().resolveAttribute(android.R.attr.colorPrimary, typedValue, true) ? typedValue.data : 0, android.graphics.PorterDuff.Mode.SRC_IN));
                            }
                        }
                    }
                    d(0);
                } else {
                    imageViewB2.setVisibility(i3 != 0 ? 0 : 4);
                    d(imageViewB2.getVisibility());
                }
                c();
            }
        }
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.g = typedArrayObtainStyledAttributes.getBoolean(4, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(5, false);
        android.widget.ImageView imageViewB3 = b();
        if (imageViewB3 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = imageViewB3.getLayoutParams();
            layoutParams.height = z ? imageViewB3.getMaxHeight() : i2;
            imageViewB3.setLayoutParams(layoutParams);
            imageViewB3.setScaleType(z ? android.widget.ImageView.ScaleType.FIT_CENTER : this.d);
        }
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (defpackage.agfz.t(context) && !defpackage.agfz.x(context)) {
            defpackage.agfz agfzVarI = defpackage.agfz.i(context);
            defpackage.agfx agfxVar = defpackage.agfx.CONFIG_ICON_COLOR;
            if (agfzVarI.v(agfxVar)) {
                color = defpackage.agfz.i(context).b(context, agfxVar);
            }
        }
        if (color != 0) {
            android.widget.ImageView imageViewB4 = b();
            if (imageViewB4 != null) {
                imageViewB4.setColorFilter(color);
            }
            if (defpackage.aggo.c(context) && defpackage.agfz.t(context) && lottieAnimationViewG != null) {
                lottieAnimationViewG.b(new hcw(new java.lang.String[]{"**"}), gzx.K, new hgp(new android.graphics.PorterDuffColorFilter(color, android.graphics.PorterDuff.Mode.SRC_ATOP)));
            }
        }
        e(resourceId2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void d(int i) {
        if (a() != null) {
            a().setVisibility(i);
        }
    }

    private final void e(int i) {
        android.content.Context context = this.e;
        if (defpackage.aggo.c(context) && defpackage.agfz.t(context)) {
            com.airbnb.lottie.LottieAnimationView lottieAnimationView = this.a;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            try {
                if (i != 0) {
                    java.io.InputStream inputStreamOpenRawResource = context.getResources().openRawResource(i);
                    android.os.Trace.beginSection("IconMixin#setAnimation");
                    try {
                        lottieAnimationView.j(inputStreamOpenRawResource, (java.lang.String) null);
                        android.os.Trace.endSection();
                        this.i = true;
                    } catch (java.lang.Throwable th) {
                        android.os.Trace.endSection();
                        throw th;
                    }
                } else {
                    int i2 = this.h;
                    if (i2 != 0) {
                        this.a.setImageResource(i2);
                    }
                }
                com.airbnb.lottie.LottieAnimationView lottieAnimationView2 = this.a;
                if (lottieAnimationView2 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    android.content.Context context2 = this.e;
                    java.util.Collections.addAll(arrayList, context2.getResources().getStringArray(2130903082));
                    if (defpackage.agih.a == null) {
                        defpackage.agih.a = new defpackage.agih();
                    }
                    java.util.Map mapA = defpackage.agih.a.a(context2, arrayList);
                    for (hcw hcwVar : mapA.keySet()) {
                        lottieAnimationView2.b(hcwVar, gzx.K, new hgp(new had(((java.lang.Integer) mapA.get(hcwVar)).intValue())));
                    }
                }
                android.os.Handler handler = this.j;
                java.lang.Runnable runnable = this.k;
                handler.removeCallbacks(runnable);
                if (this.g) {
                    handler.postDelayed(runnable, this.e.getResources().getInteger(2131493044));
                } else {
                    handler.post(runnable);
                }
            } catch (android.content.res.Resources.NotFoundException | java.lang.IllegalStateException | java.lang.NullPointerException e) {
                l.z("Fail to display the lottie icon from partner overlay, e=".concat(java.lang.String.valueOf(e.getMessage())));
            }
        }
    }

    protected final android.widget.FrameLayout a() {
        return (android.widget.FrameLayout) this.b.g(2131429108);
    }

    protected final android.widget.ImageView b() {
        return (android.widget.ImageView) this.b.g(2131429107);
    }

    public final void c() {
        com.airbnb.lottie.LottieAnimationView lottieAnimationView;
        if (defpackage.aftt.o(this.b)) {
            if (!defpackage.aggo.c(this.e) || (lottieAnimationView = this.a) == null) {
                defpackage.aftt.t(b(), a());
            } else {
                defpackage.aftt.t(lottieAnimationView, a());
            }
        }
    }
}
