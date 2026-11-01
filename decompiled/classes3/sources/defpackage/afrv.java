package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afrv extends defpackage.afzb {
    final /* synthetic */ com.google.android.material.chip.Chip a;

    public afrv(com.google.android.material.chip.Chip chip) {
        j$.util.Objects.requireNonNull(chip);
        this.a = chip;
    }

    @Override // defpackage.afzb
    public final void b(android.graphics.Typeface typeface, boolean z) {
        com.google.android.material.chip.Chip chip = this.a;
        defpackage.afrz afrzVar = chip.c;
        chip.setText(afrzVar.o ? afrzVar.d : chip.getText());
        chip.requestLayout();
        chip.invalidate();
    }

    @Override // defpackage.afzb
    public final void a(int i) {
    }
}
