package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ots implements defpackage.zno {
    public static final aimz a = aimz.i("com/android/dialer/incall/activity/outgoingcalllauncher/InCallActivityCallDialingStartedListener");
    public final defpackage.ott b;
    public final ajct c;
    public final defpackage.qbe d;
    public final tkl e;
    private final defpackage.afpl f;

    public ots(defpackage.ott ottVar, defpackage.afpl afplVar, ajct ajctVar, defpackage.qbe qbeVar, tkl tklVar) {
        this.b = ottVar;
        this.f = afplVar;
        this.c = ajctVar;
        this.d = qbeVar;
        this.e = tklVar;
    }

    public final defpackage.otr b() {
        return (defpackage.otr) aooc.ar(this.f.Y(), defpackage.otr.class);
    }

    @Override // defpackage.zno
    public final ajcq em() {
        ajcq ajcqVarBH = b().bH();
        onp onpVar = new onp(9);
        ajct ajctVar = this.c;
        return ahvr.I(ahvr.H(ajcqVarBH, onpVar, ajctVar), new ocj(this, 8), ajctVar);
    }
}
