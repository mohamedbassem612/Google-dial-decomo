package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tkk implements defpackage.zcr {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/sharpie/enabledfn/SharpieEnabledFn");
    private final defpackage.aoin b;
    private final defpackage.aoin c;
    private final defpackage.aoin d;
    private final defpackage.aoin f;
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private final defpackage.aoin k;
    private final defpackage.aoin l;
    private final defpackage.aoin m;
    private final defpackage.zzx n;

    public tkk(defpackage.aoin aoinVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9, defpackage.aoin aoinVar10, defpackage.aoin aoinVar11, defpackage.zzx zzxVar) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableSharpieMain");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableSharpieIdP9Plus");
        }
        if (aoinVar3 == null) {
            defpackage.aooh.i("enableSharpiePlP9Plus");
        }
        if (aoinVar4 == null) {
            defpackage.aooh.i("enableSharpiePtP9Plus");
        }
        if (aoinVar5 == null) {
            defpackage.aooh.i("enableSharpieBrP9Plus");
        }
        if (aoinVar6 == null) {
            defpackage.aooh.i("enableSharpieOnXovhm");
        }
        if (aoinVar7 == null) {
            defpackage.aooh.i("enableSharpieOnXiaomi");
        }
        if (aoinVar8 == null) {
            defpackage.aooh.i("enableSharpieOnVivo");
        }
        if (aoinVar9 == null) {
            defpackage.aooh.i("enableSharpieOnOppo");
        }
        if (aoinVar10 == null) {
            defpackage.aooh.i("enableSharpieOnHonor");
        }
        if (aoinVar11 == null) {
            defpackage.aooh.i("enableSharpieOnSony");
        }
        this.b = aoinVar;
        this.c = aoinVar2;
        this.d = aoinVar3;
        this.f = aoinVar4;
        this.g = aoinVar5;
        this.h = aoinVar6;
        this.i = aoinVar7;
        this.j = aoinVar8;
        this.k = aoinVar9;
        this.l = aoinVar10;
        this.m = aoinVar11;
        this.n = zzxVar;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        if (this.n.m()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/enabledfn/SharpieEnabledFn", "isEnabled", 48, "SharpieEnabledFn.kt")).v("disabled in direct boot mode");
            return false;
        }
        if (((java.lang.Boolean) this.b.a()).booleanValue() || ((java.lang.Boolean) this.c.a()).booleanValue() || ((java.lang.Boolean) this.d.a()).booleanValue() || ((java.lang.Boolean) this.f.a()).booleanValue() || ((java.lang.Boolean) this.g.a()).booleanValue() || ((java.lang.Boolean) this.h.a()).booleanValue() || ((java.lang.Boolean) this.i.a()).booleanValue() || ((java.lang.Boolean) this.j.a()).booleanValue() || ((java.lang.Boolean) this.k.a()).booleanValue() || ((java.lang.Boolean) this.l.a()).booleanValue() || ((java.lang.Boolean) this.m.a()).booleanValue()) {
            return true;
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/sharpie/enabledfn/SharpieEnabledFn", "isEnabled", 53, "SharpieEnabledFn.kt")).v("disabled by flag");
        return false;
    }
}
