package com.google.android.material.progressindicator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class CircularProgressIndicator extends defpackage.afxm {
    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 2132086096);
        defpackage.afxo afxoVar = new defpackage.afxo((defpackage.afxz) this.a);
        android.content.Context context2 = getContext();
        defpackage.afxz afxzVar = (defpackage.afxz) this.a;
        defpackage.afyk afykVar = new defpackage.afyk(context2, afxzVar, afxoVar, afxzVar.q == 1 ? new defpackage.afxy(context2, afxzVar) : new defpackage.afxt(afxzVar));
        afykVar.c = gmf.b(context2.getResources(), 2131231741, (android.content.res.Resources.Theme) null);
        setIndeterminateDrawable(afykVar);
        setProgressDrawable(new defpackage.afyb(getContext(), (defpackage.afxz) this.a, afxoVar));
        this.f = true;
    }

    @Override // defpackage.afxm
    public final /* synthetic */ defpackage.afxn a(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.afxz(context, attributeSet);
    }

    public CircularProgressIndicator(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968880);
    }

    public CircularProgressIndicator(android.content.Context context) {
        this(context, null);
    }
}
