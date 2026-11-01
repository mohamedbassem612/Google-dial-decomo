package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class tup {
    public static final aimz a = aimz.i("com/android/dialer/sharpie/impl/ui/SharpieComposeAlertCenterFragmentPeer");
    public final defpackage.tuk b;
    public final agtj c;
    public final ruc d;
    public final agtk e;
    public final agtk f;
    private final zpm g;
    private final defpackage.zoe h;
    private final defpackage.afpl i;
    private final apjb j;

    public tup(defpackage.tuk tukVar, apjb apjbVar, defpackage.afpl afplVar, zpm zpmVar, agtj agtjVar, ruc rucVar) {
        aooh.f(zpmVar, "callScopes");
        aooh.f(agtjVar, "futuresMixin");
        aooh.f(rucVar, "metrics");
        this.b = tukVar;
        this.j = apjbVar;
        this.i = afplVar;
        this.g = zpmVar;
        this.c = agtjVar;
        this.d = rucVar;
        this.h = apjbVar.G(2131428937, afplVar.aa(defpackage.tum.class, new defpackage.qam(14)));
        this.e = new defpackage.tuo();
        this.f = new defpackage.tun();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [cer, java.lang.Object] */
    public final defpackage.tpj a() {
        defpackage.ahae ahaeVar = (defpackage.ahae) this.h.a.a();
        int iU = anty.U(ahaeVar);
        if (iU == 0) {
            defpackage.tpj tpjVar = (defpackage.tpj) aooh.q((j$.util.Optional) ((defpackage.ahad) ahaeVar).a);
            a.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/impl/ui/SharpieComposeAlertCenterFragmentPeer", "uiModel$<anonymous>", 77, "SharpieComposeAlertCenterFragmentPeer.kt").y("Successfully loaded alert model: %s", tpjVar);
            return tpjVar;
        }
        if (iU != 1) {
            return null;
        }
        a.c().k(((defpackage.ahab) ahaeVar).a).l("com/android/dialer/sharpie/impl/ui/SharpieComposeAlertCenterFragmentPeer", "getUiModel", 80, "SharpieComposeAlertCenterFragmentPeer.kt").v("Error loading alert model");
        return null;
    }

    public final defpackage.tmj b() {
        j$.util.Optional optionalH = this.g.h();
        aooh.e(optionalH, "getPrimaryCallScope(...)");
        defpackage.apqr apqrVar = (defpackage.apqr) aooh.q(optionalH);
        defpackage.tul tulVar = apqrVar != null ? (defpackage.tul) apqrVar.a(defpackage.tul.class) : null;
        if (tulVar != null) {
            return tulVar.cC();
        }
        return null;
    }
}
