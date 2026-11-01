package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nze {
    private static final aimz b = aimz.i("com/android/dialer/eligibilityexpansion/EligibilityExpansion");
    public final ruc a;
    private final defpackage.nzg c;
    private final aoin d;
    private final ajct e;

    public nze(defpackage.nzg nzgVar, aoin aoinVar, ajct ajctVar, ruc rucVar) {
        this.c = nzgVar;
        this.d = aoinVar;
        this.e = ajctVar;
        this.a = rucVar;
    }

    public final ajcq a(defpackage.hkd hkdVar, int i) {
        for (ypw ypwVar : ((ypx) this.d.a()).b) {
            if (ypwVar.c.equals(hkdVar.c)) {
                if (!new alam(ypwVar.d, ypw.a).contains(i + (-1) != 1 ? ypp.c : ypp.b)) {
                    break;
                }
                b.b().l("com/android/dialer/eligibilityexpansion/EligibilityExpansion", "getEligibilityData", 56, "EligibilityExpansion.java").v("Phone number is in denylist.");
                akzx akzxVarM = defpackage.nzb.a.m();
                akzxVarM.u();
                defpackage.nzb nzbVar = (defpackage.nzb) akzxVarM.b;
                nzbVar.b |= 1;
                nzbVar.c = false;
                akzxVarM.u();
                defpackage.nzb nzbVar2 = (defpackage.nzb) akzxVarM.b;
                nzbVar2.d = 1001;
                nzbVar2.b |= 2;
                return aiql.z((defpackage.nzb) akzxVarM.p());
            }
        }
        this.a.j(ruc.by);
        defpackage.nzg nzgVar = this.c;
        adag adagVar = new adag((byte[]) null);
        adagVar.n("SELECT eligibility_details FROM eligibility_expansion WHERE phone_number = ?");
        adagVar.p(hkdVar.c);
        ajcq ajcqVarG = ahvr.G(new defpackage.jsr(nzgVar, adagVar.B(), hkdVar, 10, (short[]) null), nzgVar.b);
        ajcq ajcqVarA = nzgVar.a();
        return ahvr.ak(new ajcq[]{ajcqVarG, ajcqVarA}).o(new defpackage.nzd(this, ajcqVarA, ajcqVarG, i, 0), this.e);
    }
}
