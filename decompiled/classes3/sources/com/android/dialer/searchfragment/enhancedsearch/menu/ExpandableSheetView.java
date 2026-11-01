package com.android.dialer.searchfragment.enhancedsearch.menu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ExpandableSheetView extends com.google.android.material.card.MaterialCardView {
    public com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView f;
    public defpackage.tji g;
    private android.widget.LinearLayout j;

    public ExpandableSheetView(android.content.Context context) {
        super(context);
        j(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void j(android.content.Context context) {
        this.g = new defpackage.tji();
        android.view.LayoutInflater.from(context).inflate(2131624209, (android.view.ViewGroup) this);
        this.j = (android.widget.LinearLayout) findViewById(2131427851);
        com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView dialerExpandedSheetView = (com.android.dialer.searchfragment.enhancedsearch.menu.DialerExpandedSheetView) findViewById(2131428208);
        this.f = dialerExpandedSheetView;
        dialerExpandedSheetView.setVisibility(8);
        defpackage.afrp afrpVar = this.h;
        if (afrpVar.i != 0) {
            afrpVar.i = 0;
            afrpVar.k();
        }
        invalidate();
        i();
        dzs.i(this, new defpackage.tjl(this));
    }

    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.LinearLayout linearLayout = this.j;
        if (linearLayout == null) {
            super.addView(view, i, layoutParams);
        } else {
            if (linearLayout.getChildCount() > 1) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(getClass().getSimpleName()).concat(" should only have a single child"));
            }
            this.j.addView(view, 0, layoutParams);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.animation.Animator d() {
        defpackage.tji tjiVar = this.g;
        int iAo = snl.ao(this);
        android.widget.LinearLayout linearLayoutA = defpackage.tji.a(this);
        aooh.c(linearLayoutA);
        int iAo2 = iAo - snl.ao(linearLayoutA);
        hsh hshVar = tjiVar.e;
        hshVar.d();
        hshVar.g(iAo, iAo2, defpackage.tji.c, new kkz(this, 9));
        hshVar.j(0.33333334f, 1.0f, 0.0f, defpackage.tji.a, new kkz(linearLayoutA, 10));
        hshVar.g(0.0f, -snl.ap(this), defpackage.tji.b, new kkz(linearLayoutA, 11));
        hshVar.h(new kkz(this, 12));
        hshVar.i(new defpackage.rqy(linearLayoutA, this, 7, null));
        hshVar.setDuration(snl.an(this));
        return hshVar;
    }

    public final void e() {
        this.f.setVisibility(8);
    }

    public final void f() {
        this.f.setVisibility(0);
        this.f.setAlpha(1.0f);
        this.f.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.j.setShowDividers(0);
    }

    public ExpandableSheetView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        j(context);
    }

    public ExpandableSheetView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        j(context);
    }
}
