package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vkz implements dsf {
    public final /* synthetic */ vlb a;
    public final /* synthetic */ android.net.Uri b;
    public final /* synthetic */ android.telephony.gba.UaSecurityProtocolIdentifier c;
    public final /* synthetic */ java.util.concurrent.Executor d;

    public /* synthetic */ vkz(vlb vlbVar, android.net.Uri uri, android.telephony.gba.UaSecurityProtocolIdentifier uaSecurityProtocolIdentifier, java.util.concurrent.Executor executor) {
        this.a = vlbVar;
        this.b = uri;
        this.c = uaSecurityProtocolIdentifier;
        this.d = executor;
    }

    public final java.lang.Object a(dsd dsdVar) {
        vlb vlbVar = this.a;
        defpackage.vla vlaVar = new defpackage.vla(vlbVar, dsdVar);
        android.net.Uri uri = this.b;
        aooh.f(uri, "nafId");
        android.telephony.gba.UaSecurityProtocolIdentifier uaSecurityProtocolIdentifier = this.c;
        aooh.f(uaSecurityProtocolIdentifier, "securityProtocol");
        java.util.concurrent.Executor executor = this.d;
        aooh.f(executor, "e");
        oko okoVar = vlbVar.c;
        okoVar.j.bootstrapAuthenticationRequest(5, uri, uaSecurityProtocolIdentifier, false, executor, vlaVar);
        mgv mgvVar = mgv.bO;
        aokc aokcVar = aokc.a;
        android.telecom.PhoneAccountHandle phoneAccountHandle = okoVar.i;
        zjv.i(okoVar.g, mgvVar, aokcVar, gus.aw(aais.aH(phoneAccountHandle != null ? phoneAccountHandle.getId() : null)), 0, 24);
        return "gba-auth-tag";
    }
}
