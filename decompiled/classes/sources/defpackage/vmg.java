package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vmg {
    public static final defpackage.vcr a;
    private static final defpackage.aimz f = defpackage.aimz.i("com/android/dialer/voicemail/service/impl/vvmclients/rest/StatusCheck");
    public final android.content.Context b;
    public final defpackage.ajct c;
    public final defpackage.vls d;
    public final defpackage.vze e;

    static {
        defpackage.akzx akzxVarM = defpackage.vcr.a.m();
        defpackage.vcq vcqVar = defpackage.vcq.a;
        akzxVarM.u();
        defpackage.vcr vcrVar = (defpackage.vcr) akzxVarM.b;
        j$.util.Objects.requireNonNull(vcqVar);
        vcrVar.c = vcqVar;
        vcrVar.b = 1;
        a = (defpackage.vcr) akzxVarM.r();
    }

    public vmg(android.content.Context context, defpackage.ajct ajctVar, defpackage.vls vlsVar, defpackage.vze vzeVar) {
        this.b = context;
        this.c = ajctVar;
        this.d = vlsVar;
        this.e = vzeVar;
    }

    public final defpackage.ajcq a(java.lang.String str, android.telecom.PhoneAccountHandle phoneAccountHandle) {
        ((defpackage.aimw) ((defpackage.aimw) f.b()).l("com/android/dialer/voicemail/service/impl/vvmclients/rest/StatusCheck", "updateStatus", 55, "StatusCheck.java")).v("updateStatus");
        ajzk ajzkVar = new ajzk();
        ajzkVar.d("GET");
        defpackage.vls vlsVar = this.d;
        ajzkVar.f(vlsVar.j.q(str));
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(vlsVar.e(new ajzm(ajzkVar), 2));
        defpackage.vma vmaVar = vlsVar.f;
        j$.util.Objects.requireNonNull(vmaVar);
        vge vgeVar = new vge(vmaVar, 16);
        defpackage.ajct ajctVar = vlsVar.d;
        defpackage.ahrv ahrvVarH = ahrvVarG.i(vgeVar, ajctVar).h(new vlk(11), ajctVar);
        vlk vlkVar = new vlk(18);
        defpackage.ajct ajctVar2 = this.c;
        defpackage.ajcq ajcqVarH = defpackage.ahvr.H(ahrvVarH, vlkVar, ajctVar2);
        defpackage.ajcq ajcqVarI = defpackage.ahvr.I(ahrvVarH, new vkn(this, str, 14, (byte[]) null), ajctVar2);
        defpackage.ajcq ajcqVarH2 = defpackage.ahvr.H(ahrvVarH, new vlk(19), ajctVar2);
        return defpackage.ahvr.B(defpackage.ahvr.ak(ajcqVarH, ajcqVarI, ajcqVarH2).p(new defpackage.uej(this, ajcqVarH, ajcqVarI, ajcqVarH2, phoneAccountHandle, 5), ajctVar2), vcx.class, new vlk(20), ajctVar2);
    }
}
