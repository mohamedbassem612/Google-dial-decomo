package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrw extends android.view.ViewOutlineProvider {
    final /* synthetic */ com.google.android.material.chip.Chip a;

    public afrw(com.google.android.material.chip.Chip chip) {
        j$.util.Objects.requireNonNull(chip);
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        defpackage.afrz afrzVar = this.a.c;
        if (afrzVar != null) {
            afrzVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
