package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rmb {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/logging/deviceinfo/DeviceInfoFetcher");
    public final android.content.Context b;
    private final defpackage.zdk e;
    public final int c = 3;
    public final int d = 5;
    private final defpackage.ahzi f = defpackage.ahvr.bI(new defpackage.hlv(this, 20));
    private final defpackage.ahzi g = defpackage.ahvr.bI(new defpackage.rwp(this, 1));

    public rmb(android.content.Context context, defpackage.zdk zdkVar, int i, int i2) {
        this.b = context;
        this.e = zdkVar;
    }

    public final defpackage.ampq a() {
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        int epochMilli = (int) ((j$.time.Instant.now().toEpochMilli() - ((java.lang.Long) this.g.eZ()).longValue()) / 86400000);
        defpackage.akzx akzxVarA = ((defpackage.akzx) this.f.eZ()).a();
        akzxVarA.u();
        defpackage.ampq ampqVar = (defpackage.ampq) akzxVarA.b;
        defpackage.ampq ampqVar2 = defpackage.ampq.a;
        ampqVar.b |= 512;
        ampqVar.l = epochMilli;
        defpackage.zdk zdkVar = this.e;
        j$.util.Optional optional = (j$.util.Optional) zdkVar.e.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar = new defpackage.jyv(akzxVarA, 2);
        if (true == optional.isPresent()) {
            java.lang.String str = (java.lang.String) optional.get();
            defpackage.akzx akzxVar = (defpackage.akzx) jyvVar.a;
            akzxVar.u();
            defpackage.ampq ampqVar3 = (defpackage.ampq) akzxVar.b;
            j$.util.Objects.requireNonNull(str);
            ampqVar3.b |= 16;
            ampqVar3.g = str;
        }
        j$.util.Optional optional2 = (j$.util.Optional) zdkVar.f.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar2 = new defpackage.jyv(akzxVarA, 3);
        if (true == optional2.isPresent()) {
            java.lang.String str2 = (java.lang.String) optional2.get();
            defpackage.akzx akzxVar2 = (defpackage.akzx) jyvVar2.a;
            akzxVar2.u();
            defpackage.ampq ampqVar4 = (defpackage.ampq) akzxVar2.b;
            j$.util.Objects.requireNonNull(str2);
            ampqVar4.b |= 128;
            ampqVar4.j = str2;
        }
        j$.util.Optional optional3 = (j$.util.Optional) zdkVar.g.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar3 = new defpackage.jyv(akzxVarA, 4);
        if (true == optional3.isPresent()) {
            java.lang.String str3 = (java.lang.String) optional3.get();
            defpackage.akzx akzxVar3 = (defpackage.akzx) jyvVar3.a;
            akzxVar3.u();
            defpackage.ampq ampqVar5 = (defpackage.ampq) akzxVar3.b;
            j$.util.Objects.requireNonNull(str3);
            ampqVar5.b |= 1024;
            ampqVar5.m = str3;
        }
        j$.util.Optional optional4 = (j$.util.Optional) zdkVar.h.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar4 = new defpackage.jyv(akzxVarA, 5);
        if (true == optional4.isPresent()) {
            java.lang.String str4 = (java.lang.String) optional4.get();
            defpackage.akzx akzxVar4 = (defpackage.akzx) jyvVar4.a;
            akzxVar4.u();
            defpackage.ampq ampqVar6 = (defpackage.ampq) akzxVar4.b;
            j$.util.Objects.requireNonNull(str4);
            ampqVar6.b |= 2048;
            ampqVar6.n = str4;
        }
        j$.util.Optional optional5 = (j$.util.Optional) zdkVar.i.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar5 = new defpackage.jyv(akzxVarA, 6);
        if (true == optional5.isPresent()) {
            java.lang.String str5 = (java.lang.String) optional5.get();
            defpackage.akzx akzxVar5 = (defpackage.akzx) jyvVar5.a;
            akzxVar5.u();
            defpackage.ampq ampqVar7 = (defpackage.ampq) akzxVar5.b;
            j$.util.Objects.requireNonNull(str5);
            ampqVar7.b |= 32;
            ampqVar7.h = str5;
        }
        j$.util.Optional optional6 = (j$.util.Optional) zdkVar.j.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar6 = new defpackage.jyv(akzxVarA, 7);
        if (true == optional6.isPresent()) {
            java.lang.String str6 = (java.lang.String) optional6.get();
            defpackage.akzx akzxVar6 = (defpackage.akzx) jyvVar6.a;
            akzxVar6.u();
            defpackage.ampq ampqVar8 = (defpackage.ampq) akzxVar6.b;
            j$.util.Objects.requireNonNull(str6);
            ampqVar8.b |= 256;
            ampqVar8.k = str6;
        }
        j$.util.Optional optional7 = (j$.util.Optional) zdkVar.k.eZ();
        j$.util.Objects.requireNonNull(akzxVarA);
        defpackage.jyv jyvVar7 = new defpackage.jyv(akzxVarA, 8);
        if (true == optional7.isPresent()) {
            java.lang.Object obj = optional7.get();
            java.lang.Object obj2 = jyvVar7.a;
            boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
            defpackage.akzx akzxVar7 = (defpackage.akzx) obj2;
            akzxVar7.u();
            defpackage.ampq ampqVar9 = (defpackage.ampq) akzxVar7.b;
            ampqVar9.b |= 65536;
            ampqVar9.s = zBooleanValue;
        }
        return (defpackage.ampq) akzxVarA.r();
    }
}
