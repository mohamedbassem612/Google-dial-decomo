package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class mnl {
    private final defpackage.aoin a;
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin e;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final defpackage.aoin m;
    private final defpackage.aoin n;
    private final defpackage.aoin o;

    public mnl(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9, defpackage.aoin aoinVar10, defpackage.aoin aoinVar11, defpackage.aoin aoinVar12, defpackage.aoin aoinVar13, defpackage.aoin aoinVar14, defpackage.aoin aoinVar15) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableManualOnlyModeInUk");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableManualOnlyModeInJp");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableManualAndAutoScreeningInCa");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("enableModeSupportsAutoAndManualScreeningInUs");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("enableModeSupportsAutoAndManualScreeningInIsraelIrelandTf");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("enableModeSupportsManualOnlyEarlierDevicesInJp");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("enableModeSupportsManualOnlyEarlierDevicesInUk");
        }
        if (aoinVar8 == null) {
            defpackage.aooh.i("enableModeSupportsManualAndAutoEarlierDevices");
        }
        if (aoinVar9 == null) {
            defpackage.aooh.i("enableManualScreeningModeForCaIeAu");
        }
        if (aoinVar10 == null) {
            defpackage.aooh.i("enableIndiaManualScreeningOnlyModeToPublic");
        }
        if (aoinVar11 == null) {
            defpackage.aooh.i("enableAuAcsMode");
        }
        if (aoinVar12 == null) {
            defpackage.aooh.i("enableCaAcsMode");
        }
        if (aoinVar13 == null) {
            defpackage.aooh.i("enableIeAcsMode");
        }
        if (aoinVar14 == null) {
            defpackage.aooh.i("enableUkAcsMode");
        }
        if (aoinVar15 == null) {
            defpackage.aooh.i("enable3CountriesDogfoodAcsMode");
        }
        this.a = aoinVar;
        this.b = aoinVar2;
        this.c = aoinVar3;
        this.d = aoinVar4;
        this.e = aoinVar5;
        this.f = aoinVar6;
        this.g = aoinVar7;
        this.h = aoinVar8;
        this.i = aoinVar9;
        this.j = aoinVar10;
        this.k = aoinVar11;
        this.l = aoinVar12;
        this.m = aoinVar13;
        this.n = aoinVar14;
        this.o = aoinVar15;
    }

    public final defpackage.mnm a() {
        if (((java.lang.Boolean) this.d.a()).booleanValue() || ((java.lang.Boolean) this.e.a()).booleanValue() || ((java.lang.Boolean) this.h.a()).booleanValue() || ((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.k.a()).booleanValue() || ((java.lang.Boolean) this.l.a()).booleanValue() || ((java.lang.Boolean) this.m.a()).booleanValue() || ((java.lang.Boolean) this.n.a()).booleanValue() || ((java.lang.Boolean) this.o.a()).booleanValue()) {
            return defpackage.mnm.MODE_SUPPORTS_AUTO_AND_MANUAL_SCREENING;
        }
        return (((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue() || ((java.lang.Boolean) this.f.a()).booleanValue() || ((java.lang.Boolean) this.g.a()).booleanValue() || ((java.lang.Boolean) this.i.a()).booleanValue() || ((java.lang.Boolean) this.j.a()).booleanValue()) ? defpackage.mnm.MODE_SUPPORTS_MANUAL_SCREENING_ONLY : defpackage.mnm.MODE_UNKNOWN;
    }
}
