package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uds extends defpackage.uea {
    public final uip a;
    private final uip c;
    private final uip d;
    private final j$.util.Optional e;
    private final j$.util.Optional f;
    private final j$.util.Optional g;
    private final j$.util.Optional h;
    private volatile transient uip i;
    private final int j = 1;

    public uds(int i, uip uipVar, uip uipVar2, uip uipVar3, j$.util.Optional optional, j$.util.Optional optional2, j$.util.Optional optional3, j$.util.Optional optional4) {
        this.a = uipVar;
        this.c = uipVar2;
        this.d = uipVar3;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null callIsSampled");
        }
        this.e = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null alternativeSpamSolutionUsed");
        }
        this.f = optional2;
        if (optional3 == null) {
            throw new java.lang.NullPointerException("Null shouldSetVerdictSource");
        }
        this.g = optional3;
        if (optional4 == null) {
            throw new java.lang.NullPointerException("Null patronusSpamCheckSkipReason");
        }
        this.h = optional4;
    }

    @Override // defpackage.uea
    public final uip a() {
        return this.a;
    }

    @Override // defpackage.uea
    public final uip b() {
        return this.d;
    }

    @Override // defpackage.uea
    public final uip c() {
        return this.c;
    }

    @Override // defpackage.uea
    public final j$.util.Optional d() {
        return this.f;
    }

    @Override // defpackage.uea
    public final j$.util.Optional e() {
        return this.e;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uea) {
            defpackage.uea ueaVar = (defpackage.uea) obj;
            ueaVar.i();
            if (this.a.equals(ueaVar.a()) && this.c.equals(ueaVar.c()) && this.d.equals(ueaVar.b()) && this.e.equals(ueaVar.e()) && this.f.equals(ueaVar.d()) && this.g.equals(ueaVar.g()) && this.h.equals(ueaVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.uea
    public final j$.util.Optional f() {
        return this.h;
    }

    @Override // defpackage.uea
    public final j$.util.Optional g() {
        return this.g;
    }

    @Override // defpackage.uea
    public final uip h() {
        uip uipVarL;
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    aimz aimzVar = defpackage.uea.b;
                    aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 64, "CompositeSpamStatus.java").v("enter");
                    uip uipVar = this.a;
                    uio uioVarK = uipVar.k();
                    if (defpackage.udn.b(uioVarK.g())) {
                        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 68, "CompositeSpamStatus.java").v("inApp is source of truth because of user status");
                        uipVarL = super.l(uipVar, defpackage.udl.USER);
                    } else if (!uioVarK.c().isPresent()) {
                        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 74, "CompositeSpamStatus.java").v("inApp is source of truth because numberClassification is empty");
                        uipVarL = super.l(uipVar, defpackage.udl.REMOTE);
                    } else if (((defpackage.uim) uioVarK.c().orElseThrow()).a()) {
                        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 82, "CompositeSpamStatus.java").v("inApp is source of truth because of number classification");
                        uipVarL = super.l(uipVar, defpackage.udl.REMOTE);
                    } else if (defpackage.udn.b(uioVarK.b())) {
                        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 88, "CompositeSpamStatus.java").v("inApp is source of truth because of global status");
                        uipVarL = super.l(uipVar, defpackage.udl.REMOTE);
                    } else {
                        aimzVar.b().l("com/android/dialer/spam/composite/CompositeSpamStatus", "getSpamStatusSourceOfTruth", 93, "CompositeSpamStatus.java").v("patronus is source of truth");
                        uipVarL = super.l(this.d, defpackage.udl.REMOTE);
                    }
                    this.i = uipVarL;
                    if (this.i == null) {
                        throw new java.lang.NullPointerException("getSpamStatusSourceOfTruth() cannot return null");
                    }
                }
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ (-722379962)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @Override // defpackage.uea
    public final int i() {
        return 1;
    }

    public final java.lang.String toString() {
        return "CompositeSpamStatus{compositeSuspiciousStatus=0, inAppSpamStatus=" + this.a.toString() + ", stirShakenSpamStatus=" + this.c.toString() + ", patronusSpamStatus=" + this.d.toString() + ", callIsSampled=" + this.e.toString() + ", alternativeSpamSolutionUsed=" + this.f.toString() + ", shouldSetVerdictSource=" + this.g.toString() + ", patronusSpamCheckSkipReason=" + this.h.toString() + '}';
    }
}
