package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ucc {
    public static final aimz a = aimz.i("com/android/dialer/sonic/impl/ui/SonicPromoCenterFragmentPeer");
    public final defpackage.uby b;
    public final defpackage.agzc c;
    public final odo d;
    public final defpackage.ubz e;
    final odm f = new defpackage.quy(this, 14);
    public final zpm g;
    public final gpd h;
    public final defpackage.afpl i;

    public ucc(zpm zpmVar, gpd gpdVar, defpackage.uby ubyVar, defpackage.afpl afplVar, defpackage.agzc agzcVar, odo odoVar, defpackage.ubz ubzVar) {
        this.g = zpmVar;
        this.h = gpdVar;
        this.b = ubyVar;
        this.i = afplVar;
        this.c = agzcVar;
        this.d = odoVar;
        this.e = ubzVar;
    }

    public final j$.util.Optional a() {
        j$.util.Optional optionalH = this.g.h();
        return true == optionalH.isPresent() ? j$.util.Optional.ofNullable(((defpackage.uca) ((defpackage.apqr) optionalH.get()).a(defpackage.uca.class)).cp()) : optionalH;
    }

    public final j$.util.Optional b() {
        j$.util.Optional optionalH = this.g.h();
        return true == optionalH.isPresent() ? j$.util.Optional.ofNullable(((defpackage.uca) ((defpackage.apqr) optionalH.get()).a(defpackage.uca.class)).aH()) : optionalH;
    }

    public final java.lang.String c() {
        j$.util.Optional optionalH = this.g.h();
        if (true == optionalH.isPresent()) {
            optionalH = j$.util.Optional.ofNullable(((defpackage.apqr) optionalH.get()).b);
        }
        return (java.lang.String) optionalH.orElse((java.lang.Object) null);
    }
}
