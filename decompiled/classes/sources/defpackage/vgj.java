package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vgj {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/omtp/configuration/impl/OmtpConfigurationLoaderImpl");
    public final defpackage.aoin b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.vgl e;
    private final defpackage.ajct f;
    private final defpackage.vdc g;
    private final defpackage.ahbv h;
    private final defpackage.gat i;
    private final defpackage.rsr j;

    public vgj(defpackage.vgl vglVar, defpackage.vdc vdcVar, defpackage.ajct ajctVar, defpackage.aoin aoinVar, defpackage.rsr rsrVar, defpackage.gat gatVar, defpackage.ahbv ahbvVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3) {
        this.e = vglVar;
        this.g = vdcVar;
        this.f = ajctVar;
        this.b = aoinVar;
        this.j = rsrVar;
        this.i = gatVar;
        this.h = ahbvVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
    }

    private final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.g.a(phoneAccountHandle));
        vfv vfvVar = new vfv(this, phoneAccountHandle, 9);
        defpackage.ajct ajctVar = this.f;
        return ahrvVarG.i(vfvVar, ajctVar).h(new vft(15), ajctVar);
    }

    public final defpackage.ajcq a(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ahbv ahbvVar = this.h;
        defpackage.ajcq ajcqVarX = this.j.x(phoneAccountHandle);
        defpackage.ajcq ajcqVarC = c(phoneAccountHandle);
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(ahbvVar.q(phoneAccountHandle));
        defpackage.gat gatVar = this.i;
        j$.util.Objects.requireNonNull(gatVar);
        vfw vfwVar = new vfw(gatVar, 3);
        defpackage.ajct ajctVar = this.f;
        defpackage.ahrv ahrvVarH = ahrvVarG.h(vfwVar, ajctVar);
        return defpackage.ahvr.ak(ajcqVarX, ajcqVarC, ahrvVarH).o(new defpackage.joq((java.lang.Object) this, ajcqVarX, ajcqVarC, (defpackage.ajcq) ahrvVarH, 13), ajctVar);
    }

    public final defpackage.ajcq b(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        return defpackage.ahvr.H(c(phoneAccountHandle), new vft(16), this.f);
    }
}
