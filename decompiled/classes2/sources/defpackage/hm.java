package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hm {
    public android.graphics.PorterDuff.Mode a = null;
    public boolean b = false;
    public boolean c = false;
    private final android.widget.CompoundButton d;
    private boolean e;

    public hm(android.widget.CompoundButton compoundButton) {
        this.d = compoundButton;
    }

    public final void a() {
        android.widget.CompoundButton compoundButton = this.d;
        android.graphics.drawable.Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.b || this.c) {
                android.graphics.drawable.Drawable drawableMutate = buttonDrawable.mutate();
                if (this.b) {
                    drawableMutate.setTintList(null);
                }
                if (this.c) {
                    drawableMutate.setTintMode(this.a);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    final void b(android.util.AttributeSet attributeSet, int i) {
        int iR;
        int iR2;
        android.widget.CompoundButton compoundButton = this.d;
        android.content.Context context = compoundButton.getContext();
        int[] iArr = ef.m;
        ajxw ajxwVarD = ajxw.D(context, attributeSet, iArr, i, 0);
        java.lang.Object obj = ajxwVarD.b;
        android.content.Context context2 = compoundButton.getContext();
        int i2 = dzs.a;
        dzp.b(compoundButton, context2, iArr, attributeSet, (android.content.res.TypedArray) obj, i, 0);
        try {
            if (ajxwVarD.z(1) && (iR2 = ajxwVarD.r(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(den.bO(compoundButton.getContext(), iR2));
                } catch (android.content.res.Resources.NotFoundException unused) {
                    if (ajxwVarD.z(0)) {
                        android.widget.CompoundButton compoundButton2 = this.d;
                        compoundButton2.setButtonDrawable(den.bO(compoundButton2.getContext(), iR));
                    }
                }
            } else if (ajxwVarD.z(0) && (iR = ajxwVarD.r(0, 0)) != 0) {
                android.widget.CompoundButton compoundButton3 = this.d;
                compoundButton3.setButtonDrawable(den.bO(compoundButton3.getContext(), iR));
            }
            if (ajxwVarD.z(2)) {
                this.d.setButtonTintList(ajxwVarD.s(2));
            }
            if (ajxwVarD.z(3)) {
                android.widget.CompoundButton compoundButton4 = this.d;
                int iO = ajxwVarD.o(3, -1);
                android.graphics.Rect rect = iz.a;
                compoundButton4.setButtonTintMode(a.q(iO, (android.graphics.PorterDuff.Mode) null));
            }
        } finally {
            ajxwVarD.x();
        }
    }

    final void c() {
        if (this.e) {
            this.e = false;
        } else {
            this.e = true;
            a();
        }
    }
}
