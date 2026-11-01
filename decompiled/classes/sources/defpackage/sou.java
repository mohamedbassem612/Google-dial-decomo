package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sou {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/phoneaccount/PhoneAccountInfoFetcher");
    private final defpackage.sor b;
    private final defpackage.zjs c;
    private final java.util.Map d = new j$.util.concurrent.ConcurrentHashMap();
    private j$.util.OptionalInt e = j$.util.OptionalInt.empty();
    private j$.util.Optional f = j$.util.Optional.empty();
    private final defpackage.aoin g;
    private final defpackage.aoin h;
    private final defpackage.jwk i;

    public sou(defpackage.jwk jwkVar, defpackage.sor sorVar, defpackage.zjs zjsVar, defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.i = jwkVar;
        this.b = sorVar;
        this.c = zjsVar;
        this.g = aoinVar;
        this.h = aoinVar2;
    }

    public final int a() {
        if (!((java.lang.Boolean) this.h.a()).booleanValue()) {
            if (this.e.isPresent()) {
                return this.e.getAsInt();
            }
            j$.util.OptionalInt optionalIntOf = j$.util.OptionalInt.of(this.c.s().size());
            this.e = optionalIntOf;
            return optionalIntOf.getAsInt();
        }
        java.lang.Integer num = (java.lang.Integer) this.f.orElse((java.lang.Object) null);
        if (num != null) {
            return num.intValue();
        }
        int size = this.c.s().size();
        this.f = j$.util.Optional.of(java.lang.Integer.valueOf(size));
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0186  */
    /* JADX WARN: Multi-variable type inference failed */
    public final j$.util.Optional b(java.lang.String str, java.lang.String str2) {
        int i;
        boolean z;
        int i2;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) sos.a(str, str2).orElse((java.lang.Object) null);
        if (phoneAccountHandle == null) {
            ((defpackage.aimw) ((defpackage.aimw) ((defpackage.aimw) a.b()).g((byte) 1, java.util.concurrent.TimeUnit.SECONDS)).l("com/android/dialer/phoneaccount/PhoneAccountInfoFetcher", "getPhoneAccountInfo", (char) 141, "PhoneAccountInfoFetcher.java")).v("Failed to get PhoneAccountInfo, returning empty optional");
            return j$.util.Optional.empty();
        }
        java.util.Map map = this.d;
        j$.util.Optional optional = (j$.util.Optional) j$.util.Map.-EL.getOrDefault(map, phoneAccountHandle, (java.lang.Object) null);
        if (optional != null) {
            return optional;
        }
        j$.util.Optional optionalJ = this.c.j(phoneAccountHandle);
        if (!optionalJ.isPresent()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phoneaccount/PhoneAccountInfoFetcher", "getPhoneAccountInfo", 159, "PhoneAccountInfoFetcher.java")).y("PhoneAccount was not found for handle:'%s'", phoneAccountHandle);
            map.put(phoneAccountHandle, j$.util.Optional.empty());
            return j$.util.Optional.empty();
        }
        android.telecom.PhoneAccount phoneAccount = (android.telecom.PhoneAccount) optionalJ.orElseThrow();
        defpackage.akzx akzxVarM = sot.a.m();
        java.lang.String string = android.text.TextUtils.isEmpty(phoneAccount.getLabel()) ? "" : phoneAccount.getLabel().toString();
        akzxVarM.u();
        sot sotVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(string);
        sotVar.b |= 1;
        sotVar.c = string;
        defpackage.sor sorVar = this.b;
        int highlightColor = phoneAccount.getHighlightColor();
        int iU = 0;
        if (highlightColor != 0) {
            if (sorVar.a.contains(java.lang.Integer.valueOf(highlightColor))) {
                i = 2;
                z = true;
                i2 = 0;
            } else {
                int i3 = defpackage.dwm.a;
                z = true;
                double[] dArr = {java.lang.Math.max(0.0d, d), (dC - dC) * 500.0d, (dC - dC) * 200.0d};
                defpackage.dwm.j(android.graphics.Color.red(highlightColor), android.graphics.Color.green(highlightColor), android.graphics.Color.blue(highlightColor), dArr);
                double d = dArr[0];
                double d2 = dArr[1];
                double d3 = dArr[2] / 108.883d;
                double dC = defpackage.dwm.c(d / 95.047d);
                double dC2 = defpackage.dwm.c(d2 / 100.0d);
                i2 = 0;
                double d4 = (116.0d * dC2) - 16.0d;
                double dC3 = defpackage.dwm.c(d3);
                i = 2;
                defpackage.ailj it = sorVar.b.entrySet().iterator();
                double d5 = Double.MAX_VALUE;
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    double[] dArr2 = (double[]) entry.getValue();
                    double d6 = dArr[0] - dArr2[0];
                    double d7 = dArr[1] - dArr2[1];
                    double d8 = dArr[2] - dArr2[2];
                    double d9 = (d6 * d6) + (d7 * d7) + (d8 * d8);
                    if (d9 < d5) {
                        highlightColor = ((java.lang.Integer) entry.getKey()).intValue();
                        d5 = d9;
                    }
                }
            }
            if (highlightColor != -10525848) {
                android.content.Context context = sorVar.c;
                boolean z2 = sorVar.d.g() == i ? z : i2;
                java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
                defpackage.aooh.f(context, "context");
                if (highlightColor == 0) {
                    iU = i2;
                } else {
                    boolValueOf.getClass();
                    if (z2 != 0) {
                        switch (defpackage.abts.u(highlightColor)) {
                            case -16749196:
                                iU = -11677471;
                                break;
                            case -15502541:
                                iU = -8271467;
                                break;
                            case -15181124:
                                iU = -7686920;
                                break;
                            case -9033797:
                                iU = -3831047;
                                break;
                            case -6728704:
                                iU = -217744;
                                break;
                            case -4716942:
                                iU = -29749;
                                break;
                            default:
                                iU = highlightColor;
                                break;
                        }
                    } else {
                        iU = defpackage.abts.u(highlightColor);
                    }
                }
            } else {
                iU = i2;
            }
        }
        akzxVarM.u();
        sot sotVar2 = akzxVarM.b;
        sotVar2.b |= 2;
        sotVar2.d = iU;
        boolean zHasCapabilities = phoneAccount.hasCapabilities(64);
        akzxVarM.u();
        sot sotVar3 = akzxVarM.b;
        sotVar3.b |= 4;
        sotVar3.e = zHasCapabilities;
        jvy jvyVarA = this.i.a(phoneAccountHandle);
        akzxVarM.u();
        sot sotVar4 = akzxVarM.b;
        j$.util.Objects.requireNonNull(jvyVarA);
        sotVar4.f = jvyVarA;
        sotVar4.b |= 8;
        sot sotVarR = akzxVarM.r();
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phoneaccount/PhoneAccountInfoFetcher", "getPhoneAccountInfo", 178, "PhoneAccountInfoFetcher.java")).I("Updating PhoneAccountInfo cache for phone account handle '%s':\n%s", phoneAccountHandle, defpackage.aais.aD(sotVarR));
        j$.util.Optional optionalOf = j$.util.Optional.of(sotVarR);
        map.put(phoneAccountHandle, optionalOf);
        return optionalOf;
    }

    public final void c() {
        if (((java.lang.Boolean) this.h.a()).booleanValue()) {
            this.f = j$.util.Optional.empty();
        } else {
            this.e = j$.util.OptionalInt.empty();
        }
        ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/phoneaccount/PhoneAccountInfoFetcher", "clearCache", 202, "PhoneAccountInfoFetcher.java")).v("Clearing PhoneAccountInfo cache");
        if (((java.lang.Boolean) this.g.a()).booleanValue()) {
            this.c.k.b();
        }
        this.d.clear();
    }
}
