package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agie implements defpackage.aggl {
    public final com.google.android.setupcompat.internal.TemplateLayout a;
    public final boolean b;
    public final android.content.Context c;
    private final boolean d;

    public agie(com.google.android.setupcompat.internal.TemplateLayout templateLayout, android.util.AttributeSet attributeSet, int i) {
        boolean z;
        this.a = templateLayout;
        android.content.Context context = templateLayout.getContext();
        this.c = context;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.t, i, 0);
            z = typedArrayObtainStyledAttributes.hasValue(0) ? typedArrayObtainStyledAttributes.getBoolean(0, false) : false;
            typedArrayObtainStyledAttributes.recycle();
            android.widget.ProgressBar progressBarA = a();
            if (progressBarA != null) {
                if (this.d) {
                    progressBarA.setVisibility(8);
                } else {
                    progressBarA.setVisibility(true == this.b ? 4 : 8);
                }
            }
        } else {
            z = false;
        }
        this.b = z;
        boolean zT = defpackage.agfz.t(context);
        defpackage.agfz agfzVarI = defpackage.agfz.i(context);
        defpackage.agfx agfxVar = defpackage.agfx.CONFIG_HEADER_PROGRESS_BAR_COMMON_STYLE;
        this.d = agfzVarI.v(agfxVar) && !defpackage.agfz.i(context).m(context, agfxVar, true) && zT;
    }

    public final android.widget.ProgressBar a() {
        boolean z = this.d;
        com.google.android.setupcompat.internal.TemplateLayout templateLayout = this.a;
        if (z) {
            return (com.google.android.material.progressindicator.LinearProgressIndicator) templateLayout.g(2131429114);
        }
        return (android.widget.ProgressBar) templateLayout.g(true != this.b ? 2131429112 : 2131429066);
    }
}
