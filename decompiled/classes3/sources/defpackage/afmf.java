package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afmf extends defpackage.aflx {
    private final defpackage.amhw c;

    public afmf(defpackage.amhw amhwVar) {
        this.c = amhwVar;
        this.b = 5;
    }

    @Override // defpackage.aflx
    public final aw a(java.lang.Integer num, int i) {
        defpackage.afmi afmiVar = new defpackage.afmi();
        android.os.Bundle bundle = new android.os.Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.i());
        afmiVar.au(bundle);
        return afmiVar;
    }
}
