package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uza {
    public static final aimz a = aimz.i("com/android/dialer/videohandoverdialog/impl/ui/VideoHandoverDialogFragmentPeer");
    public final defpackage.uyx b;
    public final rlv c;
    public final defpackage.uyy d;
    public final defpackage.agzc e;
    public final odo f;
    public j$.util.Optional g = j$.util.Optional.empty();
    public final odm h = new defpackage.quy(this, 16);
    public final ucm i;
    public final defpackage.afpl j;
    private final defpackage.vaa k;

    public uza(defpackage.uyx uyxVar, ucm ucmVar, rlv rlvVar, defpackage.afpl afplVar, defpackage.vaa vaaVar, defpackage.uyy uyyVar, defpackage.agzc agzcVar, odo odoVar) {
        this.b = uyxVar;
        this.i = ucmVar;
        this.c = rlvVar;
        this.j = afplVar;
        this.k = vaaVar;
        this.d = uyyVar;
        this.e = agzcVar;
        this.f = odoVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optional = this.g;
        defpackage.vaa vaaVar = this.k;
        j$.util.Objects.requireNonNull(vaaVar);
        defpackage.taj tajVar = new defpackage.taj(vaaVar, 12);
        if (true != optional.isPresent()) {
            return optional;
        }
        java.lang.Object obj = optional.get();
        j$.util.Optional optionalH = ((defpackage.vaa) tajVar.a).h((defpackage.uyq) obj);
        optionalH.getClass();
        return optionalH;
    }
}
