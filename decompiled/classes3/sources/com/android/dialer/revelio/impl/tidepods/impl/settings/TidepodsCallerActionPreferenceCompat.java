package com.android.dialer.revelio.impl.tidepods.impl.settings;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class TidepodsCallerActionPreferenceCompat extends androidx.preference.DialogPreference {
    public static final aimz g = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/settings/TidepodsCallerActionPreferenceCompat");
    public j$.util.Optional F;
    public android.widget.RadioButton G;
    public android.widget.RadioButton H;
    public android.widget.RadioButton I;
    public j$.util.Optional J;
    public lpa K;
    public lpa L;
    public final java.util.Map M;
    private j$.util.Optional N;
    private j$.util.Optional O;
    private lpa P;
    private int Q;
    public defpackage.tap h;
    public java.lang.String i;

    public TidepodsCallerActionPreferenceCompat(android.content.Context context) {
        super(context);
        this.Q = 1;
        this.F = j$.util.Optional.empty();
        this.J = j$.util.Optional.empty();
        this.N = j$.util.Optional.empty();
        this.O = j$.util.Optional.empty();
        this.M = new aca();
        ah(context, j$.util.Optional.empty());
    }

    private static int af(defpackage.tbe tbeVar) {
        int iOrdinal = tbeVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return 2132017616;
        }
        if (iOrdinal == 2) {
            return 2132017615;
        }
        if (iOrdinal == 3) {
            return 2132017617;
        }
        throw new java.lang.AssertionError("Unexpected call action: ".concat(java.lang.String.valueOf(tbeVar.name())));
    }

    private final android.widget.RadioButton ag(defpackage.tbe tbeVar) {
        int iOrdinal = tbeVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return this.G;
        }
        if (iOrdinal == 2) {
            return this.H;
        }
        if (iOrdinal == 3) {
            return this.I;
        }
        throw new java.lang.AssertionError("Unexpected call action: ".concat(java.lang.String.valueOf(tbeVar.name())));
    }

    private final void ah(android.content.Context context, j$.util.Optional optional) {
        java.lang.String string;
        if (optional.isPresent()) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) optional.orElseThrow(), defpackage.tau.a, 0, 0);
            string = typedArrayObtainStyledAttributes.getString(0);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            string = "";
        }
        this.i = string;
        ((androidx.preference.DialogPreference) this).d = null;
    }

    public final void a(gfc gfcVar) {
        super.a(gfcVar);
        ((android.widget.TextView) gfcVar.C(2131427721)).setText(((androidx.preference.Preference) this).r);
        this.N = j$.util.Optional.of((android.widget.TextView) gfcVar.C(2131427719));
        this.O = j$.util.Optional.of(gfcVar.C(2131427720));
        o();
    }

    public final hwv ae() {
        return defpackage.sns.q(((androidx.preference.Preference) this).j).nS();
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void k(defpackage.tbe tbeVar) {
        ajcq ajcqVarI;
        java.lang.String str;
        ahvr.bY(this.J.isPresent());
        lpa lpaVarA = lpa.a(((defpackage.tav) this.J.orElseThrow()).I(), "CallerActionPreference.PreferenceChange_".concat(java.lang.String.valueOf(((androidx.preference.Preference) this).s)));
        android.content.Context context = ((androidx.preference.Preference) this).j;
        defpackage.rze rzeVarNE = defpackage.sns.q(context).nE();
        int i = this.Q;
        byte[] bArr = null;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        int i3 = 4;
        int i4 = 2;
        if (i2 == 1) {
            java.lang.Object obj = rzeVarNE.a;
            gou gouVar = (gou) obj;
            if (((uhs) gouVar.e).e()) {
                boolean z = (tbeVar == defpackage.tbe.NOT_SET_BY_USER || tbeVar == defpackage.tbe.RING_PHONE) ? false : true;
                ajcq ajcqVarJ = gouVar.j();
                ajcq ajcqVarI2 = gouVar.i();
                ajcqVarI = ahvr.I(ahvr.ak(new ajcq[]{ajcqVarJ, ajcqVarI2}).p(new defpackage.qwf(obj, ajcqVarJ, ajcqVarI2, z, 3), (java.util.concurrent.Executor) gouVar.b), ahqx.c(new defpackage.tak(obj, tbeVar, i4, bArr)), (java.util.concurrent.Executor) gouVar.a);
            } else {
                ajcqVarI = ((kaw) gouVar.d).p(((aogc) gouVar.c).bl(new defpackage.tbd(tbeVar, 0)));
            }
        } else if (i2 == 2) {
            gou gouVar2 = (gou) rzeVarNE.a;
            ajcqVarI = ((kaw) gouVar2.d).p(((aogc) gouVar2.c).bl(new defpackage.tbd(tbeVar, 3)));
        } else if (i2 == 3) {
            gou gouVar3 = (gou) rzeVarNE.a;
            ajcqVarI = ((kaw) gouVar3.d).p(((aogc) gouVar3.c).bl(new defpackage.tbd(tbeVar, 1)));
        } else {
            if (i2 != 4) {
                if (i == 1) {
                    str = "UNKNOWN_CALLER_TYPE";
                } else if (i == 2) {
                    str = "SPAM";
                } else if (i != 3) {
                    str = i != 4 ? "PRIVATE_OR_HIDDEN" : "FIRST_TIME_CALLER";
                } else {
                    str = "POSSIBLY_FAKED_NUMBER";
                }
                throw new java.lang.AssertionError("Unexpected caller type: ".concat(str));
            }
            gou gouVar4 = (gou) rzeVarNE.a;
            ajcqVarI = ((kaw) gouVar4.d).p(((aogc) gouVar4.c).bl(new defpackage.tbd(tbeVar, 2)));
        }
        lpaVarA.b(context, ajcqVarI, new oom(this, tbeVar, 4), new defpackage.taw(this, i3));
    }

    public final void l(defpackage.tbe tbeVar) {
        this.F = j$.util.Optional.of(tbeVar);
        o();
    }

    public final void n() {
        android.content.Context context = ((androidx.preference.Preference) this).j;
        this.P.b(context, ahvr.H(defpackage.sns.q(context).nm().e(), new defpackage.syf(14), defpackage.sns.q(context).fH()), new kll(this, 12), new jox(17));
    }

    public final void o() {
        android.widget.RadioButton radioButton;
        if (this.F.isPresent()) {
            if (this.Q == 2 && (radioButton = this.I) != null) {
                radioButton.setVisibility(0);
            }
            if (ag((defpackage.tbe) this.F.orElseThrow()) != null) {
                ag((defpackage.tbe) this.F.orElseThrow()).setChecked(true);
            }
            defpackage.tbe tbeVar = (defpackage.tbe) this.F.orElseThrow();
            N(af(tbeVar));
            if (this.O.isPresent() && this.N.isPresent()) {
                ((android.view.View) this.O.orElseThrow()).setVisibility(tbeVar != defpackage.tbe.AUTOMATICALLY_SCREEN ? 8 : 0);
                ((android.widget.TextView) this.N.orElseThrow()).setText(af(tbeVar));
            }
        }
    }

    public final void q(int i, defpackage.tav tavVar) {
        ajcq ajcqVarH;
        I(false);
        this.J = j$.util.Optional.of(tavVar);
        lpa lpaVarA = lpa.a(tavVar.I(), "CallerActionPreference.Setup_".concat(java.lang.String.valueOf(((androidx.preference.Preference) this).s)));
        this.Q = i;
        this.P = lpa.a(tavVar.I(), "CallerActionPreference.audioStorageListener_".concat(java.lang.String.valueOf(((androidx.preference.Preference) this).s)));
        this.K = lpa.a(tavVar.I(), "CallerActionPreference.callerIdAndSpamGetterListener_".concat(java.lang.String.valueOf(((androidx.preference.Preference) this).s)));
        this.L = lpa.a(tavVar.I(), "CallerActionPreference.callerIdAndSpamSetterListener_".concat(java.lang.String.valueOf(((androidx.preference.Preference) this).s)));
        android.content.Context context = ((androidx.preference.Preference) this).j;
        defpackage.rze rzeVarNE = defpackage.sns.q(context).nE();
        int i2 = i - 1;
        if (i2 == 1) {
            ajcqVarH = ((gou) rzeVarNE.a).h();
        } else if (i2 != 2) {
            ajcqVarH = i2 != 3 ? ahvr.H(((gou) rzeVarNE.a).e(), new defpackage.syf(18), ajbm.a) : ahvr.H(((gou) rzeVarNE.a).e(), new defpackage.syf(19), ajbm.a);
        } else {
            ajcqVarH = ahvr.H(((gou) rzeVarNE.a).e(), new defpackage.syf(17), ajbm.a);
        }
        lpaVarA.b(context, ajcqVarH, new kll(this, 11), new defpackage.taw(this, 5));
    }

    public TidepodsCallerActionPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.Q = 1;
        this.F = j$.util.Optional.empty();
        this.J = j$.util.Optional.empty();
        this.N = j$.util.Optional.empty();
        this.O = j$.util.Optional.empty();
        this.M = new aca();
        ah(context, j$.util.Optional.of(attributeSet));
    }

    public TidepodsCallerActionPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Q = 1;
        this.F = j$.util.Optional.empty();
        this.J = j$.util.Optional.empty();
        this.N = j$.util.Optional.empty();
        this.O = j$.util.Optional.empty();
        this.M = new aca();
        ah(context, j$.util.Optional.of(attributeSet));
    }

    public TidepodsCallerActionPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.Q = 1;
        this.F = j$.util.Optional.empty();
        this.J = j$.util.Optional.empty();
        this.N = j$.util.Optional.empty();
        this.O = j$.util.Optional.empty();
        this.M = new aca();
        ah(context, j$.util.Optional.of(attributeSet));
    }
}
