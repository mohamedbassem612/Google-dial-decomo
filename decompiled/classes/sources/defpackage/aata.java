package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aata extends defpackage.aada {
    public static final /* synthetic */ int a = 0;

    static {
        android.util.Pair.create(new defpackage.aazc(null), defpackage.aazc.s(null));
    }

    public aata(android.content.Context context) {
        super(context, null, defpackage.aasr.a, defpackage.aacu.q, defpackage.aacz.a);
    }

    private static defpackage.aaum u() {
        return defpackage.aazc.r(new defpackage.aacw(new com.google.android.gms.common.api.Status(16, null, null, null)));
    }

    public final defpackage.aaum a(com.google.android.gms.phenotype.RegistrationInfo[] registrationInfoArr) {
        if (!p(11021000)) {
            return u();
        }
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aaav(registrationInfoArr, 11);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum b(java.lang.String str) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasx(str, 0);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum c(defpackage.aexf aexfVar) {
        aexfVar.getClass();
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasx(aexfVar, 2);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aasp.a};
        aafqVar.b();
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aast(str, str2, str3, 1);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum e() {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasx(this, 1);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aasp.i};
        aafqVar.b();
        return super.i(0, aafqVar.a());
    }

    public final /* synthetic */ defpackage.aaum m(java.lang.String str, byte[] bArr, defpackage.aaum aaumVar) {
        if (aaumVar.k()) {
            return aaumVar;
        }
        if (!p(11925000)) {
            return u();
        }
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aarg(str, bArr, 2);
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum n(final java.lang.String str, final int i, final java.lang.String[] strArr, final byte[] bArr) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aafm() { // from class: aasw
            @Override // defpackage.aafm
            public final void a(java.lang.Object obj, java.lang.Object obj2) {
                int i2 = defpackage.aata.a;
                defpackage.aate aateVar = new defpackage.aate((defpackage.zzx) obj2);
                defpackage.aatf aatfVar = (defpackage.aatf) ((defpackage.aatg) obj).v();
                android.os.Parcel parcelEP = aatfVar.eP();
                java.lang.ClassLoader classLoader = defpackage.yld.a;
                parcelEP.writeStrongBinder(aateVar);
                parcelEP.writeString(str);
                parcelEP.writeInt(i);
                parcelEP.writeStringArray(strArr);
                parcelEP.writeByteArray(bArr);
                aatfVar.eR(1, parcelEP);
            }
        };
        return super.i(0, aafqVar.a());
    }

    public final defpackage.aaum o(java.lang.String str, defpackage.ajsx ajsxVar) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aast(this, str, ajsxVar, 2);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aasp.h};
        aafqVar.b();
        return super.i(0, aafqVar.a());
    }

    public final boolean p(int i) {
        return defpackage.aaby.d.l(this.b, i) == 0;
    }

    public final defpackage.aaum q(java.lang.String str) {
        if (!p(12451000)) {
            return u();
        }
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasv(str, 0);
        return super.i(0, aafqVar.a());
    }

    @java.lang.Deprecated
    public final defpackage.aaum r() {
        java.lang.String packageName = this.b.getPackageName();
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aaav(packageName, 12);
        aafqVar.b = new com.google.android.gms.common.Feature[]{defpackage.aasp.c};
        aafqVar.b();
        return super.i(0, aafqVar.a());
    }

    public final void s(int[] iArr, java.lang.String str, java.lang.String str2) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new aave(str, str2, iArr, 1);
        super.i(0, aafqVar.a());
    }

    public final defpackage.aaum t(java.lang.String str) {
        defpackage.aafq aafqVar = new defpackage.aafq();
        aafqVar.a = new defpackage.aasv(this, str, 2);
        return super.i(0, aafqVar.a());
    }
}
