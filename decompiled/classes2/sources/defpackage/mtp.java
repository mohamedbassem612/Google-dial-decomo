package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mtp implements defpackage.mab {
    private static final aimz a = aimz.i("com/android/dialer/dobby/impl/conversationhistorycalldetails/DobbyCallDetailsFeatureIntegration");
    private final android.content.Context b;
    private final mnl c;
    private final rlv d;
    private final j$.util.Optional e;
    private final aoin f;
    private final aoin g;
    private final zjm h;

    public mtp(android.content.Context context, mnl mnlVar, rlv rlvVar, j$.util.Optional optional, zjm zjmVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(context, "context");
        aooh.f(rlvVar, "loggingBindings");
        aooh.f(optional, "transcriptAudioFeedback");
        aooh.f(aoinVar, "enableAgenticCallScreen");
        aooh.f(aoinVar2, "gacsUseGeminiBranding");
        this.b = context;
        this.c = mnlVar;
        this.d = rlvVar;
        this.e = optional;
        this.h = zjmVar;
        this.f = aoinVar;
        this.g = aoinVar2;
    }

    private final boolean d(defpackage.mmw mmwVar) {
        int iAR;
        return this.h.g().isPresent() && (iAR = a.aR(mmwVar.i)) != 0 && iAR == 4;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    @Override // defpackage.mab
    public final defpackage.mac a(defpackage.maf mafVar) {
        int i;
        boolean z;
        defpackage.mae maeVar;
        defpackage.maa maaVar;
        defpackage.kip kipVar = mafVar.a;
        defpackage.mmw mmwVar = kipVar.t;
        if (mmwVar == null) {
            mmwVar = defpackage.mmw.a;
        }
        aooh.e(mmwVar, "getDobbyCallDetails(...)");
        if (!mmwVar.e || this.c.a() == mnm.a) {
            return null;
        }
        if (mmwVar.h) {
            i = 2132017496;
        } else {
            i = d(mmwVar) ? 2132017562 : 2132018490;
        }
        android.content.Context context = this.b;
        java.lang.String string = context.getString(i);
        aooh.e(string, "getString(...)");
        defpackage.mae maeVar2 = new defpackage.mae(string, 2132083188);
        boolean z2 = (mmwVar.c || mmwVar.d) ? false : true;
        if (mmwVar.h) {
            int i2 = kipVar.e;
            if (i2 != 1) {
                if (i2 == 3 || i2 == 5) {
                    z = false;
                } else {
                    a.d().l("com/android/dialer/dobby/impl/conversationhistorycalldetails/DobbyCallDetailsFeatureIntegration", "shouldShowSecondaryCallDetailsFeatureTextForBam", 178, "DobbyCallDetailsFeatureIntegration.kt").w("Unexpected call type for BAM: %d", i2);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (z2 || z) {
            maeVar = null;
        } else {
            java.lang.String string2 = context.getString(true != mmwVar.g ? 2132020596 : 2132020595);
            aooh.e(string2, "getString(...)");
            maeVar = new defpackage.mae(string2, 2132083189);
        }
        if (d(mmwVar)) {
            maaVar = new defpackage.maa(2131231357, java.lang.Integer.valueOf(urg.c(context, 2130968958)));
        } else {
            maaVar = (((java.lang.Boolean) this.f.a()).booleanValue() && ((java.lang.Boolean) this.g.a()).booleanValue()) ? new defpackage.maa(2131232150, null) : new defpackage.maa(2131231550, java.lang.Integer.valueOf(urg.c(context, 2130968958)));
        }
        return new defpackage.mac(maeVar2, maeVar, maaVar, maeVar != null);
    }

    @Override // defpackage.mab
    public final void b(android.view.View view, defpackage.maf mafVar) {
        rlv rlvVar = this.d;
        rlvVar.o(rmx.md);
        abwd abwdVar = mafVar.c;
        if (abwdVar == null || ((wsc) aooh.q(this.e)) == null) {
            return;
        }
        vqf vqfVarBy = wsc.by(utu.a.m());
        defpackage.kip kipVar = mafVar.a;
        vqfVarBy.z(kipVar.d);
        vqfVarBy.C(5);
        java.lang.String strC = defpackage.kon.c(kipVar);
        aooh.e(strC, "getUniqueCallId(...)");
        vqfVarBy.B(strC);
        vqfVarBy.A(abwdVar);
        defpackage.mmw mmwVar = kipVar.t;
        if (mmwVar == null) {
            mmwVar = defpackage.mmw.a;
        }
        int iAR = a.aR(mmwVar.i);
        if (iAR != 0 && iAR == 4) {
            vqfVarBy.y(kipVar.c);
            ucu ucuVar = kipVar.r;
            if (ucuVar == null) {
                ucuVar = ucu.a;
            }
            aooh.e(ucuVar, "getSpamStatus(...)");
            if (wsc.bU(ucuVar)) {
                rlvVar.o(rmx.wS);
            } else {
                rlvVar.o(rmx.wP);
            }
        }
        wsc.bf(view.getContext(), vqfVarBy.x());
    }

    @Override // defpackage.mab
    public final void c() {
        this.d.o(rmx.mb);
    }
}
