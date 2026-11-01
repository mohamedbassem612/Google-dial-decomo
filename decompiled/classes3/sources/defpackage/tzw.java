package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tzw implements defpackage.qts {
    private static final aimz a = aimz.i("com/android/dialer/sonic/impl/service/SonicBottomSheetFragmentListener");
    private final defpackage.uaq b;
    private final ajct c;
    private final defpackage.qbe d;

    public tzw(defpackage.uaq uaqVar, ajct ajctVar, defpackage.qbe qbeVar) {
        this.b = uaqVar;
        this.c = ajctVar;
        this.d = qbeVar;
    }

    @Override // defpackage.qts
    public final ajcq h(int i) {
        a.b().l("com/android/dialer/sonic/impl/service/SonicBottomSheetFragmentListener", "onBottomSheetFragmentHidden", 38, "SonicBottomSheetFragmentListener.java").v("Sonic bottomFragmentSheet was hidden, running callback");
        int i2 = i - 1;
        if (i2 == 1) {
            this.d.a(qbc.hN);
        } else if (i2 == 2) {
            this.d.a(qbc.hO);
        }
        defpackage.uaq uaqVar = this.b;
        j$.util.Objects.requireNonNull(uaqVar);
        return ahvr.E(new defpackage.sxq(uaqVar, 15), this.c);
    }
}
