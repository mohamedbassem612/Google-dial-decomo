package com.google.android.libraries.communications.ux.views.promo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PromoCard extends android.widget.FrameLayout {
    public final defpackage.ahiy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoCard(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        aooh.f(context, "context");
        android.widget.FrameLayout.inflate(context, 2131624395, this);
        defpackage.ahiy ahiyVar = new defpackage.ahiy(this);
        this.a = ahiyVar;
        java.lang.Object obj = ahiyVar.a;
        android.content.Context context2 = ((android.view.View) ahiyVar.e).getContext();
        aooh.e(context2, "getContext(...)");
        ((androidx.cardview.widget.CardView) obj).c(aaoo.aq(2131165874, context2));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (z != isEnabled()) {
            super.setEnabled(z);
            defpackage.ahiy ahiyVar = this.a;
            android.view.View view = (android.view.View) ahiyVar.c;
            android.view.View view2 = (android.view.View) ahiyVar.h;
            android.view.View view3 = (android.view.View) ahiyVar.f;
            android.view.View view4 = (android.view.View) ahiyVar.g;
            java.util.Iterator it = ajsz.bb(new android.view.View[]{view, view2, view3, view4}).iterator();
            while (it.hasNext()) {
                ((android.view.View) it.next()).setAlpha(true != z ? 0.38f : 1.0f);
            }
            java.util.Iterator it2 = ajsz.bb(new android.view.View[]{(android.view.View) ahiyVar.a, view4, (android.view.View) ahiyVar.b}).iterator();
            while (it2.hasNext()) {
                ((android.view.View) it2.next()).setEnabled(z);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoCard(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoCard(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        aooh.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoCard(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        aooh.f(context, "context");
    }

    public /* synthetic */ PromoCard(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, aooc aoocVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
