package com.android.dialer.rtt.settings.impl.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class RttSettingsPreferenceCompat extends androidx.preference.Preference {
    public static final aimz a = aimz.i("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat");
    private androidx.constraintlayout.widget.ConstraintLayout F;
    private android.widget.TextView G;
    private android.widget.TextView H;
    private android.widget.TextView I;
    private android.widget.ImageView J;
    public final java.util.Map b;
    public j$.util.Optional c;
    public defpackage.aprf d;
    private android.widget.RadioButton e;
    private android.widget.RadioButton f;
    private android.widget.RadioButton g;
    private androidx.constraintlayout.widget.ConstraintLayout h;
    private androidx.constraintlayout.widget.ConstraintLayout i;

    public RttSettingsPreferenceCompat(android.content.Context context) {
        super(context);
        this.b = new aca();
        this.c = j$.util.Optional.empty();
    }

    private final void l(java.lang.CharSequence charSequence, j$.util.Optional optional, java.lang.String str) {
        boolean zIsPresent = optional.isPresent();
        android.widget.TextView textView = this.G;
        if (zIsPresent) {
            textView.setText(new defpackage.akwb(((androidx.preference.Preference) this).j, false).d(charSequence, (java.lang.String) optional.orElseThrow(), str));
        } else {
            textView.setText(new defpackage.akwb(((androidx.preference.Preference) this).j, false).b(charSequence, str));
        }
        this.G.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    private final void n(java.lang.String[] strArr) {
        int dimension = (int) ((androidx.preference.Preference) this).j.getResources().getDimension(2131165393);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        for (java.lang.String str : strArr) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            spannableString.setSpan(new android.text.style.BulletSpan(dimension), 0, str.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString);
        }
        this.I.setText(spannableStringBuilder);
    }

    public final void a(gfc gfcVar) {
        boolean z;
        super.a(gfcVar);
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "onBindViewHolder", 76, "RttSettingsPreferenceCompat.java").v("onBindViewHolder");
        android.widget.RadioButton radioButton = (android.widget.RadioButton) gfcVar.C(2131428830);
        ahvr.ci(radioButton);
        this.e = radioButton;
        android.widget.RadioButton radioButton2 = (android.widget.RadioButton) gfcVar.C(2131428831);
        ahvr.ci(radioButton2);
        this.f = radioButton2;
        android.widget.RadioButton radioButton3 = (android.widget.RadioButton) gfcVar.C(2131428829);
        ahvr.ci(radioButton3);
        this.g = radioButton3;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutC = gfcVar.C(2131428828);
        ahvr.ci(constraintLayoutC);
        this.h = constraintLayoutC;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutC2 = gfcVar.C(2131428838);
        ahvr.ci(constraintLayoutC2);
        this.i = constraintLayoutC2;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayoutC3 = gfcVar.C(2131428827);
        ahvr.ci(constraintLayoutC3);
        this.F = constraintLayoutC3;
        java.util.Map map = this.b;
        map.put(this.e, tcp.b);
        map.put(this.f, tcp.c);
        map.put(this.g, tcp.d);
        this.h.setOnClickListener(new hww(5));
        this.i.setOnClickListener(new hww(6));
        this.F.setOnClickListener(new hww(7));
        int i = 4;
        byte[] bArr = null;
        this.e.setOnClickListener(new defpackage.szl(this, i, bArr));
        this.f.setOnClickListener(new defpackage.szl(this, i, bArr));
        this.g.setOnClickListener(new defpackage.szl(this, i, bArr));
        k();
        android.widget.TextView textView = (android.widget.TextView) gfcVar.C(2131428814);
        ahvr.ci(textView);
        this.G = textView;
        android.widget.TextView textView2 = (android.widget.TextView) gfcVar.C(2131428841);
        ahvr.ci(textView2);
        this.H = textView2;
        android.widget.TextView textView3 = (android.widget.TextView) gfcVar.C(2131428842);
        ahvr.ci(textView3);
        this.I = textView3;
        android.widget.ImageView imageView = (android.widget.ImageView) gfcVar.C(2131428840);
        ahvr.ci(imageView);
        this.J = imageView;
        android.content.Context context = ((androidx.preference.Preference) this).j;
        boolean zBooleanValue = ((java.lang.Boolean) defpackage.sns.l(context).hY().a()).booleanValue();
        boolean zBooleanValue2 = ((java.lang.Boolean) defpackage.sns.l(context).hZ().a()).booleanValue();
        if (zBooleanValue) {
            l(context.getText(2132019942), j$.util.Optional.empty(), context.getString(2132019968, gus.ae(context).getLanguage()));
            this.H.setVisibility(0);
            n(context.getResources().getStringArray(2130903094));
            this.J.setVisibility(8);
            return;
        }
        if (zBooleanValue2) {
            j$.util.Optional optionalE = defpackage.sns.l(context).be().E(defpackage.sns.l(context).bd().a());
            defpackage.taj tajVar = new defpackage.taj(this, 3);
            if (true == optionalE.isPresent()) {
                oko okoVar = (oko) optionalE.get();
                if (((alfc) defpackage.sns.l(((androidx.preference.Preference) tajVar.a).j).au().b.a()).b.contains((java.lang.String) okoVar.q().orElse((java.lang.Object) null))) {
                    int iC = okoVar.c();
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(iC);
                    if (lnr.a(j$.util.Optional.of(numValueOf))) {
                        aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 299, "RttSettingsPreferenceCompat.java").v("Fi on T-Mobile network");
                    } else if (lnr.a.contains(numValueOf)) {
                        aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 304, "RttSettingsPreferenceCompat.java").v("Tracfone on T-Mobile network");
                    } else {
                        numValueOf.getClass();
                        if (iC == 2683) {
                            aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 309, "RttSettingsPreferenceCompat.java").v("Comcast Business on T-Mobile network");
                        } else {
                            numValueOf.getClass();
                            if (iC == 2687) {
                                aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 314, "RttSettingsPreferenceCompat.java").v("Spectrum on T-Mobile network");
                            } else {
                                z = true;
                            }
                            optionalE = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z));
                        }
                    }
                } else {
                    aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "isTMobileMno", 291, "RttSettingsPreferenceCompat.java").v("Not T-Mobile network");
                }
                z = false;
                optionalE = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(z));
            }
            if (((java.lang.Boolean) optionalE.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                l(context.getText(2132019943), j$.util.Optional.of(context.getString(2132019162)), context.getString(2132019969));
                this.H.setVisibility(0);
                n(context.getResources().getStringArray(2130903096));
                this.J.setVisibility(0);
                return;
            }
        }
        l(context.getText(2132019941), j$.util.Optional.empty(), context.getString(2132019968, gus.ae(context).getLanguage()));
        this.H.setVisibility(8);
        n(context.getResources().getStringArray(2130903095));
        this.J.setVisibility(8);
    }

    public final void k() {
        android.widget.RadioButton radioButton;
        if (this.e == null || this.f == null || this.g == null) {
            a.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "updateCheckedStateUi", 149, "RttSettingsPreferenceCompat.java").v("radio buttons have not been initialized");
            return;
        }
        boolean zIsPresent = this.c.isPresent();
        aimz aimzVar = a;
        if (!zIsPresent) {
            aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "updateCheckedStateUi", 154, "RttSettingsPreferenceCompat.java").v("rtt configuration is not available");
            return;
        }
        aimzVar.b().l("com/android/dialer/rtt/settings/impl/ui/RttSettingsPreferenceCompat", "updateCheckedStateUi", 158, "RttSettingsPreferenceCompat.java").v("update checked state of radio buttons");
        this.e.setChecked(false);
        this.f.setChecked(false);
        this.g.setChecked(false);
        int iOrdinal = ((tcp) this.c.orElseThrow()).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            radioButton = this.e;
        } else if (iOrdinal == 2) {
            radioButton = this.f;
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    throw new java.lang.AssertionError("the fragment should only be used when RTT visibility is not UNSUPPORTED");
                }
                throw new java.lang.AssertionError("Unexpected rtt configuration: ".concat(java.lang.String.valueOf(((tcp) this.c.orElseThrow()).name())));
            }
            radioButton = this.g;
        }
        radioButton.setChecked(true);
    }

    public RttSettingsPreferenceCompat(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new aca();
        this.c = j$.util.Optional.empty();
    }
}
