package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghy implements defpackage.aggl {
    public static final xtq o = new xtq("SetupProgressIndicatorMixin", (byte[]) null);
    public final com.google.android.setupcompat.internal.TemplateLayout a;
    public final android.content.Context b;
    public final aoir c;
    public android.widget.FrameLayout d;
    public com.google.android.setupdesign.view.GradientCircularProgressIndicator e;
    public android.widget.ImageView f;
    public android.widget.FrameLayout g;
    public defpackage.agiq h;
    public defpackage.aghg i;
    public boolean j;
    public defpackage.aggs k;
    public aoub l;
    public boolean m;
    public defpackage.agby n;

    public aghy(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        android.content.Context context = templateLayout.getContext();
        aooh.e(context, "getContext(...)");
        this.b = context;
        this.c = aooc.ag(new defpackage.addr(this, 14));
        this.j = true;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.w, i, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final int d(android.view.View view) {
        try {
            return agab.X(view, android.R.attr.colorError);
        } catch (java.lang.Exception e) {
            o.A("Failed to get color for attribute: 16844099", e);
            return 0;
        }
    }

    public final android.view.View a() {
        return this.a.g(2131429064);
    }

    public final android.view.View b() {
        android.view.View viewA = a();
        if (viewA != null) {
            return viewA;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) this.a.g(2131429065);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new android.view.ViewStub.OnInflateListener() { // from class: aghv
                @Override // android.view.ViewStub.OnInflateListener
                public final void onInflate(android.view.ViewStub viewStub2, android.view.View view) {
                    android.widget.FrameLayout frameLayout;
                    defpackage.aghy aghyVar = this.a;
                    com.google.android.setupcompat.internal.TemplateLayout templateLayout = aghyVar.a;
                    if (defpackage.agfz.A(templateLayout.getContext()) || !((com.google.android.setupdesign.GlifLayout) templateLayout).w() || (frameLayout = aghyVar.d) == null) {
                        return;
                    }
                    android.content.Context context = frameLayout.getContext();
                    int dimension = (int) context.getResources().getDimension(2131167636);
                    int iS = defpackage.aftt.s(context, defpackage.agfx.CONFIG_ICON_SIZE, 0);
                    int i = iS > dimension ? iS - dimension : 0;
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
                    int iS2 = defpackage.aftt.s(context, defpackage.agfx.CONFIG_ICON_MARGIN_TOP, marginLayoutParams.topMargin);
                    if (i != 0) {
                        iS2 += i / 2;
                    }
                    int iS3 = marginLayoutParams.rightMargin;
                    defpackage.agfz agfzVarI = defpackage.agfz.i(context);
                    defpackage.agfx agfxVar = defpackage.agfx.CONFIG_LAYOUT_MARGIN_END;
                    if (agfzVarI.v(agfxVar)) {
                        iS3 = defpackage.aftt.s(context, agfxVar, iS3) - ((int) context.getResources().getDimension(2131167637));
                    }
                    if (iS2 == marginLayoutParams.topMargin && iS3 == marginLayoutParams.rightMargin) {
                        return;
                    }
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, iS2, iS3, marginLayoutParams.bottomMargin);
                    marginLayoutParams.setMarginEnd(iS3);
                    frameLayout.setLayoutParams(marginLayoutParams);
                }
            });
            try {
                viewStub.setLayoutInflater(android.view.LayoutInflater.from(this.b));
                viewStub.inflate();
                return a();
            } catch (android.view.InflateException e) {
                xtq xtqVar = o;
                e.toString();
                xtqVar.B("Incorrect theme: ".concat(e.toString()));
            }
        } else {
            o.B("ViewStub not found");
        }
        return null;
    }

    public final void c() {
        defpackage.agiq agiqVar = this.h;
        if (agiqVar == null || !agiqVar.isShowing()) {
            android.content.Context context = this.b;
            xtq xtqVar = defpackage.agfh.c;
            final android.app.Activity activityD = defpackage.agfz.d(context);
            if (activityD == null) {
                o.z("Cannot show BottomSheet. Context is not an Activity.");
                return;
            }
            try {
                defpackage.aghg aghgVar = this.i;
                if (aghgVar == null) {
                    throw new java.lang.IllegalStateException("Required value was null.");
                }
                defpackage.agiq agiqVar2 = new defpackage.agiq(activityD, aghgVar);
                agiqVar2.show();
                agiqVar2.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() { // from class: aghw
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(android.content.DialogInterface dialogInterface) {
                        defpackage.aghg aghgVar2;
                        defpackage.aghy aghyVar = this.a;
                        if (aghyVar.m || activityD.isChangingConfigurations() || (aghgVar2 = aghyVar.i) == null) {
                            return;
                        }
                        aghgVar2.c = false;
                    }
                });
                this.h = agiqVar2;
            } catch (java.lang.Exception e) {
                xtq xtqVar2 = o;
                xtqVar2.A("Failed to show BottomSheet", e);
                if ((e.getCause() instanceof android.view.InflateException) || (e instanceof android.view.InflateException)) {
                    java.lang.String string = this.b.getString(2132020305);
                    aooh.e(string, "getString(...)");
                    defpackage.agby agbyVar = this.n;
                    if (agbyVar != null) {
                        agbyVar.e(3);
                    }
                    if (string.length() == 0) {
                        xtqVar2.B("Message is empty, not showing snackbar");
                        return;
                    }
                    defpackage.agby agbyVarQ = defpackage.agby.q(this.a, string, 0);
                    agbyVarQ.h();
                    this.n = agbyVarQ;
                }
            }
        }
    }
}
