package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvm extends android.view.View {
    private final java.util.List a;
    private final java.util.List b;
    private final float c;

    public fvm(android.content.Context context) {
        super(context, null);
        this.a = new java.util.ArrayList();
        this.b = java.util.Collections.EMPTY_LIST;
        this.c = 0.0533f;
    }

    @Override // android.view.View
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        java.util.List list = this.b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        float f = this.c;
        if ((f == -3.4028235E38f ? -3.4028235E38f : f * (paddingBottom - paddingTop)) <= 0.0f || list.size() <= 0) {
            return;
        }
        defpackage.ess essVarA = (defpackage.ess) list.get(0);
        if (essVarA.J != Integer.MIN_VALUE) {
            defpackage.esr esrVar = new defpackage.esr(essVarA);
            esrVar.e = -3.4028235E38f;
            esrVar.f = Integer.MIN_VALUE;
            esrVar.b = null;
            if (essVarA.z == 0) {
                esrVar.c(1.0f - essVarA.y, 0);
            } else {
                esrVar.c((-essVarA.y) - 1.0f, 1);
            }
            int i = essVarA.A;
            if (i == 0) {
                esrVar.d = 2;
            } else if (i == 2) {
                esrVar.d = 0;
            }
            essVarA = esrVar.a();
        }
        int i2 = essVarA.H;
        float f2 = essVarA.I;
        throw null;
    }
}
