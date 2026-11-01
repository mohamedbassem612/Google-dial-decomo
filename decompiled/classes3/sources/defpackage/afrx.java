package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrx extends ecj {
    final /* synthetic */ com.google.android.material.chip.Chip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public afrx(com.google.android.material.chip.Chip chip, com.google.android.material.chip.Chip chip2) {
        super(chip2);
        j$.util.Objects.requireNonNull(chip);
        this.f = chip;
    }

    protected final void l(java.util.List list) {
        list.add(0);
        this.f.o();
    }

    protected final void n(ebd ebdVar) {
        com.google.android.material.chip.Chip chip = this.f;
        ebdVar.q(chip.m());
        ebdVar.t(chip.isClickable());
        ebdVar.s(chip.getAccessibilityClassName());
        ebdVar.R(chip.getText());
    }

    protected final void o(int i, ebd ebdVar) {
        if (i != 1) {
            ebdVar.w("");
            ebdVar.o(com.google.android.material.chip.Chip.b);
            return;
        }
        com.google.android.material.chip.Chip chip = this.f;
        java.lang.CharSequence text = chip.getText();
        ebdVar.w(chip.getContext().getString(2132019380, true != android.text.TextUtils.isEmpty(text) ? text : "").trim());
        android.graphics.RectF rectFE = chip.e();
        int i2 = (int) rectFE.left;
        int i3 = (int) rectFE.top;
        int i4 = (int) rectFE.right;
        int i5 = (int) rectFE.bottom;
        android.graphics.Rect rect = chip.f;
        rect.set(i2, i3, i4, i5);
        ebdVar.o(rect);
        ebdVar.i(ebc.c);
        ebdVar.y(chip.isEnabled());
        ebdVar.s(android.widget.Button.class.getName());
    }

    protected final void p(int i, boolean z) {
        if (i == 1) {
            this.f.e = z;
        }
        com.google.android.material.chip.Chip chip = this.f;
        defpackage.afrz afrzVar = chip.c;
        boolean z2 = chip.e;
        if (afrzVar.f != null) {
            if (afrzVar.w(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : defpackage.afrz.a)) {
                chip.refreshDrawableState();
            }
        }
    }

    public final boolean t(int i, int i2, android.os.Bundle bundle) {
        if (i2 != 16) {
            return false;
        }
        if (i == 0) {
            return this.f.performClick();
        }
        if (i != 1) {
            return false;
        }
        this.f.playSoundEffect(0);
        return false;
    }
}
