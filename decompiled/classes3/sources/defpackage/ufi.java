package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ufi implements uip {
    private final uio a;

    public ufi(uio uioVar) {
        this.a = uioVar;
    }

    public static defpackage.ufi c(defpackage.uim uimVar, udm udmVar, udm udmVar2) {
        uil uilVar = new uil();
        uilVar.c = uimVar;
        uilVar.g = (short) (uilVar.g | 32);
        uilVar.d(udmVar);
        uilVar.b = udmVar2;
        uilVar.g = (short) (uilVar.g | 4);
        return new defpackage.ufi(uilVar.a());
    }

    public static defpackage.ufi d() {
        defpackage.uim uimVar = defpackage.uim.e;
        udm udmVar = defpackage.udn.a;
        return c(uimVar, udmVar, udmVar);
    }

    public static defpackage.ufu e(defpackage.ufi ufiVar) {
        int i;
        akzx akzxVarM = defpackage.ufu.a.m();
        int iOrdinal = ufiVar.f().ordinal();
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal != 1) {
            i = 3;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    i = 4;
                } else {
                    if (iOrdinal != 4) {
                        throw new java.lang.RuntimeException(null, null);
                    }
                    i = 5;
                }
            }
        } else {
            i = 2;
        }
        akzxVarM.u();
        defpackage.ufu ufuVar = (defpackage.ufu) akzxVarM.b;
        ufuVar.c = i - 1;
        ufuVar.b |= 2;
        udj udjVarB = udj.b(ufiVar.a().d);
        if (udjVarB == null) {
            udjVarB = udj.a;
        }
        akzxVarM.u();
        defpackage.ufu ufuVar2 = (defpackage.ufu) akzxVarM.b;
        ufuVar2.e = udjVarB.f;
        ufuVar2.b |= 8;
        udj udjVarB2 = udj.b(ufiVar.b().d);
        if (udjVarB2 == null) {
            udjVarB2 = udj.a;
        }
        akzxVarM.u();
        defpackage.ufu ufuVar3 = (defpackage.ufu) akzxVarM.b;
        ufuVar3.d = udjVarB2.f;
        ufuVar3.b |= 4;
        int iAQ = a.aQ(ufiVar.b().i);
        if (iAQ == 0) {
            iAQ = 1;
        }
        akzxVarM.u();
        defpackage.ufu ufuVar4 = (defpackage.ufu) akzxVarM.b;
        ufuVar4.f = iAQ - 1;
        ufuVar4.b |= 16;
        int iAQ2 = a.aQ(ufiVar.b().j);
        int i2 = iAQ2 != 0 ? iAQ2 : 1;
        akzxVarM.u();
        defpackage.ufu ufuVar5 = (defpackage.ufu) akzxVarM.b;
        ufuVar5.g = i2 - 1;
        ufuVar5.b |= 32;
        return (defpackage.ufu) akzxVarM.p();
    }

    public final udm a() {
        j$.util.Optional optionalB = this.a.b();
        ahvr.bN(optionalB.isPresent(), "globalSpamListStatus must be set");
        return (udm) optionalB.orElseThrow();
    }

    public final udm b() {
        j$.util.Optional optionalG = this.a.g();
        ahvr.bN(optionalG.isPresent(), "userSpamListStatus must be set");
        return (udm) optionalG.orElseThrow();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ufi) {
            return this.a.equals(((defpackage.ufi) obj).a);
        }
        return false;
    }

    public final defpackage.uim f() {
        j$.util.Optional optionalC = this.a.c();
        ahvr.bN(optionalC.isPresent(), "numberClassification must be set");
        return (defpackage.uim) optionalC.orElseThrow();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final udj j() {
        udm udmVarB = b();
        if (defpackage.udn.a(udmVarB)) {
            udj udjVarB = udj.b(udmVarB.d);
            return udjVarB == null ? udj.a : udjVarB;
        }
        if (f().a()) {
            return udj.c;
        }
        udj udjVarB2 = udj.b(a().d);
        return udjVarB2 == null ? udj.a : udjVarB2;
    }

    public final uio k() {
        return this.a;
    }

    public final j$.util.Optional m() {
        udm udmVarA = a();
        udm udmVarB = b();
        int i = udmVarA.b & 1;
        if (i != 0 && (udmVarB.b & 1) != 0) {
            return j$.util.Optional.of(java.lang.Long.valueOf(java.lang.Math.max(udmVarA.c, udmVarB.c)));
        }
        if ((udmVarB.b & 1) != 0) {
            return j$.util.Optional.of(java.lang.Long.valueOf(udmVarB.c));
        }
        return i != 0 ? j$.util.Optional.of(java.lang.Long.valueOf(udmVarA.c)) : j$.util.Optional.empty();
    }

    public final java.lang.String toString() {
        return "InAppSpamStatus{spamMetadata=" + this.a.toString() + '}';
    }

    public ufi() {
        throw null;
    }
}
