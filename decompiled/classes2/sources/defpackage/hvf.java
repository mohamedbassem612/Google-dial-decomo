package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hvf extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;

    public hvf(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7) {
        super(amyzVar2, new amzw(defpackage.hvf.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String str;
        java.util.List list = (java.util.List) obj;
        java.lang.String str2 = (java.lang.String) list.get(0);
        defpackage.huu huuVar = (defpackage.huu) list.get(1);
        defpackage.hwj hwjVar = (defpackage.hwj) list.get(2);
        defpackage.hux huxVar = (defpackage.hux) list.get(3);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(4)).booleanValue();
        int iIntValue = ((java.lang.Integer) list.get(5)).intValue();
        java.lang.String str3 = (java.lang.String) list.get(6);
        aooh.f(str2, "callId");
        aooh.f(huuVar, "rttButtonModel");
        aooh.f(hwjVar, "voiceAssistAudioPlayer");
        aooh.f(huxVar, "autoDetectedEmergency");
        aooh.f(str3, "silentlyShareYourEmergencyText");
        akzx akzxVarM = defpackage.huv.a.m();
        aooh.f(akzxVarM, "builder");
        aooh.f(str2, "value");
        akzxVarM.u();
        defpackage.huv huvVar = (defpackage.huv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str2);
        huvVar.b |= 1;
        huvVar.c = str2;
        akzxVarM.u();
        defpackage.huv huvVar2 = (defpackage.huv) akzxVarM.b;
        huvVar2.b |= 4;
        huvVar2.e = zBooleanValue;
        aooh.f(huuVar, "value");
        akzxVarM.u();
        defpackage.huv huvVar3 = (defpackage.huv) akzxVarM.b;
        j$.util.Objects.requireNonNull(huuVar);
        huvVar3.d = huuVar;
        huvVar3.b |= 2;
        aooh.f(huxVar, "value");
        akzxVarM.u();
        defpackage.huv huvVar4 = (defpackage.huv) akzxVarM.b;
        huvVar4.h = huxVar.g;
        huvVar4.b |= 64;
        boolean z = hwjVar.l instanceof defpackage.hwc;
        akzxVarM.u();
        defpackage.huv huvVar5 = (defpackage.huv) akzxVarM.b;
        huvVar5.b |= 16;
        huvVar5.f = z;
        defpackage.hgt hgtVar = hwjVar.l;
        defpackage.hwc hwcVar = hgtVar instanceof defpackage.hwc ? (defpackage.hwc) hgtVar : null;
        if (hwcVar == null || (str = hwcVar.a) == null) {
            str = "";
        }
        aooh.f(str, "value");
        akzxVarM.u();
        defpackage.huv huvVar6 = (defpackage.huv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        huvVar6.b |= 32;
        huvVar6.g = str;
        akzxVarM.u();
        defpackage.huv huvVar7 = (defpackage.huv) akzxVarM.b;
        huvVar7.b |= 128;
        huvVar7.i = iIntValue;
        aooh.f(str3, "value");
        akzxVarM.u();
        defpackage.huv huvVar8 = (defpackage.huv) akzxVarM.b;
        j$.util.Objects.requireNonNull(str3);
        huvVar8.b |= 256;
        huvVar8.j = str3;
        alad aladVarP = akzxVarM.p();
        aooh.e(aladVarP, "build(...)");
        return aiql.z((defpackage.huv) aladVarP);
    }

    protected final ajcq c() {
        amzg amzgVar = this.h;
        amzg amzgVar2 = this.g;
        amzg amzgVar3 = this.f;
        amzg amzgVar4 = this.e;
        amzg amzgVar5 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
