package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kyg {
    public static final aimz a = aimz.i("com/android/dialer/callrecording/impl/service/CallRecordingDialogFragmentPeer");
    public final defpackage.kye b;
    public final defpackage.lbo c;
    public final zpm d;
    public final gpd e;
    public final ucm f;

    public kyg(defpackage.kye kyeVar, ucm ucmVar, zpm zpmVar, defpackage.lbo lboVar, gpd gpdVar) {
        this.b = kyeVar;
        this.f = ucmVar;
        this.d = zpmVar;
        this.c = lboVar;
        this.e = gpdVar;
    }

    private final j$.util.Optional c() {
        j$.util.Optional optionalH = this.d.h();
        return true == optionalH.isPresent() ? j$.util.Optional.ofNullable((defpackage.kyf) ((apqr) optionalH.get()).a(defpackage.kyf.class)) : optionalH;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalC = c();
        return true == optionalC.isPresent() ? j$.util.Optional.ofNullable(((defpackage.kyf) optionalC.get()).t()) : optionalC;
    }

    public final j$.util.Optional b() {
        j$.util.Optional optionalC = c();
        return true == optionalC.isPresent() ? j$.util.Optional.ofNullable(((defpackage.kyf) optionalC.get()).cp()) : optionalC;
    }
}
