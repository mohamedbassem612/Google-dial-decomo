package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vlg {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestServerConnection");
    private final defpackage.ajcu b;
    private final defpackage.vlb c;
    private final defpackage.ajct d;
    private final defpackage.zjm e;

    public vlg(defpackage.zjm zjmVar, defpackage.ajcu ajcuVar, defpackage.vlb vlbVar, defpackage.ajct ajctVar) {
        this.e = zjmVar;
        this.b = ajcuVar;
        this.c = vlbVar;
        this.d = ajctVar;
    }

    public final defpackage.ajcq a(ajzm ajzmVar) {
        defpackage.zjm zjmVar = this.e;
        if (!zjmVar.g().isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/RestServerConnection", "queryRestServer", 54, "RestServerConnection.java")).v("Dialer http not available");
        }
        defpackage.vlb vlbVar = this.c;
        java.lang.String str = ajzmVar.a;
        ajzk ajzkVarA = ajzmVar.a();
        ajzkVarA.b(ajzj.a("user-agent"), "3gpp-gba");
        ajzkVarA.b(ajzj.a("Accept"), "*/*");
        ajzm ajzmVar2 = new ajzm(ajzkVarA);
        defpackage.orl orlVar = (defpackage.orl) zjmVar.g().orElseThrow();
        android.net.Uri uri = android.net.Uri.parse(str);
        defpackage.ahrv ahrvVarJ = defpackage.ahrv.g(defpackage.ahvr.I(defpackage.dff.m(new vkz(vlbVar, new android.net.Uri.Builder().scheme(uri.getScheme()).encodedAuthority("3GPP-bootstrapping@".concat(java.lang.String.valueOf(((java.lang.Boolean) vlbVar.d.a()).booleanValue() ? uri.getHost() : uri.getEncodedAuthority()))).build(), new android.telephony.gba.UaSecurityProtocolIdentifier.Builder().setOrg(1).setProtocol(65536).setTlsCipherSuite(47).build(), vlbVar.b)), new ljp(orlVar, ajzmVar2, 18), orlVar.c)).j(1L, java.util.concurrent.TimeUnit.MINUTES, this.b);
        vju vjuVar = new vju(20);
        defpackage.ajct ajctVar = this.d;
        return ahrvVarJ.e(ork.class, vjuVar, ajctVar).e(ajzi.class, new vlk(1), ajctVar);
    }
}
