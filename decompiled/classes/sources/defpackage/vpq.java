package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vpq {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/voicemail/settings/greeting/database/VoicemailGreetingsDataStore");
    public final android.content.Context b;
    private final defpackage.ajct c;
    private final defpackage.ajct d;
    private final defpackage.afhf e;

    public vpq(android.content.Context context, defpackage.afhf afhfVar, defpackage.ajct ajctVar, defpackage.ajct ajctVar2) {
        this.b = context;
        this.e = afhfVar;
        this.d = ajctVar;
        this.c = ajctVar2;
    }

    public static vpj a(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vpk vpkVar) {
        return (vpj) j$.util.Collection.-EL.stream(vpkVar.b).filter(new defpackage.vpl(phoneAccountHandle, 0)).findAny().orElseThrow(new vjq(11));
    }

    public static defpackage.vpk b(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vpk vpkVar) {
        defpackage.akzx akzxVarL = vpkVar.L();
        defpackage.akzx akzxVarM = vpj.a.m();
        java.lang.String id = phoneAccountHandle.getId();
        akzxVarM.u();
        vpj vpjVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        vpjVar.d = id;
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        akzxVarM.u();
        vpj vpjVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        vpjVar2.c = strFlattenToString;
        vpj vpjVarR = akzxVarM.r();
        akzxVarL.u();
        defpackage.vpk vpkVar2 = (defpackage.vpk) akzxVarL.b;
        j$.util.Objects.requireNonNull(vpjVarR);
        vpkVar2.b();
        vpkVar2.b.add(vpjVarR);
        return (defpackage.vpk) akzxVarL.r();
    }

    public static boolean g(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.vpk vpkVar) {
        return j$.util.Collection.-EL.stream(vpkVar.b).anyMatch(new defpackage.vpl(phoneAccountHandle, 2));
    }

    public final defpackage.ajcq c(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.ajcq ajcqVarC = this.e.c();
        vmb vmbVar = new vmb(phoneAccountHandle, 11);
        defpackage.ajct ajctVar = this.d;
        return defpackage.ahvr.H(defpackage.ahvr.H(ajcqVarC, vmbVar, ajctVar), new vmb(phoneAccountHandle, 10), ajctVar);
    }

    public final defpackage.ajcq d(android.telecom.PhoneAccountHandle phoneAccountHandle, java.lang.String str, defpackage.aify aifyVar) {
        return defpackage.ahvr.I(defpackage.ahvr.F(new defpackage.vms(this, aifyVar, 3, null), this.c), new vjx(this, phoneAccountHandle, str, 18), this.d);
    }

    public final defpackage.ajcq e(android.telecom.PhoneAccountHandle phoneAccountHandle, java.util.function.Function function) {
        return this.e.a(new vpn(phoneAccountHandle, function), this.d);
    }

    public final defpackage.ajcq f(android.telecom.PhoneAccountHandle phoneAccountHandle, vps vpsVar) {
        if (defpackage.ahvr.an(vpsVar.c, vpsVar.d).isEmpty()) {
            return e(phoneAccountHandle, new vpm(this, phoneAccountHandle, vpsVar));
        }
        throw new java.lang.IllegalArgumentException("marking and unmarking a custom greeting for deletion doesn't make sense.");
    }
}
