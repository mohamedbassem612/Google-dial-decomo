package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pmh {
    public static final aimz a = aimz.i("com/android/dialer/incall/calltransfer/impl/ui/CallTransferDialogFragmentPeer");
    public final defpackage.pme b;
    public final defpackage.agzc c;
    public final odo d;
    public final odm e = new iyh(this, 18);
    public final ucm f;
    public final defpackage.afpl g;
    private final zpm h;

    public pmh(defpackage.pme pmeVar, ucm ucmVar, zpm zpmVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar) {
        this.b = pmeVar;
        this.f = ucmVar;
        this.h = zpmVar;
        this.g = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalH = this.h.h();
        return true == optionalH.isPresent() ? j$.util.Optional.ofNullable(((defpackage.pmf) ((defpackage.apqr) optionalH.get()).a(defpackage.pmf.class)).af()) : optionalH;
    }
}
