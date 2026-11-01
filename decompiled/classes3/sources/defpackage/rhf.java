package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class rhf implements odm {
    final /* synthetic */ defpackage.rhh a;

    public rhf(defpackage.rhh rhhVar) {
        j$.util.Objects.requireNonNull(rhhVar);
        this.a = rhhVar;
    }

    public final /* synthetic */ void a(java.lang.Object obj) {
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (optional.isPresent()) {
            defpackage.rhh rhhVar = this.a;
            defpackage.rgp rgpVar = ((defpackage.rgw) optional.orElseThrow()).b;
            defpackage.rgn rgnVar = rgpVar.b;
            android.util.TypedValue typedValue = new android.util.TypedValue();
            defpackage.afyh afyhVar = rhhVar.g;
            ((defpackage.rhe) afyhVar.c).dX().getValue(2131165325, typedValue, true);
            if (!((j$.util.Optional) afyhVar.a).isPresent() || !((java.lang.Float) ((j$.util.Optional) afyhVar.a).orElseThrow()).equals(java.lang.Float.valueOf(typedValue.getFloat()))) {
                afyhVar.a = j$.util.Optional.of(java.lang.Float.valueOf(typedValue.getFloat()));
                afyhVar.g(new defpackage.oxs(afyhVar, 11), new lct(15));
            }
            if (!((j$.util.Optional) afyhVar.b).isPresent() || !((defpackage.rgn) ((j$.util.Optional) afyhVar.b).orElseThrow()).equals(rgnVar)) {
                afyhVar.b = j$.util.Optional.of(rgnVar);
                int iOrdinal = ((defpackage.rgn) ((j$.util.Optional) afyhVar.b).orElseThrow()).ordinal();
                if (iOrdinal == 0) {
                    afyhVar.g(new lct(11), new lct(12));
                } else if (iOrdinal == 1) {
                    afyhVar.g(new lct(13), new lct(14));
                }
            }
            defpackage.rhd rhdVar = rhhVar.b;
            defpackage.rgt rgtVar = rgpVar.c;
            defpackage.rgs rgsVar = rgtVar.a;
            if (!rhdVar.d.isPresent() || !((defpackage.rgs) rhdVar.d.orElseThrow()).equals(rgsVar)) {
                rhdVar.d = j$.util.Optional.of(rgsVar);
                if (rhdVar.c.isPresent()) {
                    ((android.os.CountDownTimer) rhdVar.c.orElseThrow()).cancel();
                    rhdVar.c = j$.util.Optional.empty();
                }
                android.widget.TextView textView = (android.widget.TextView) rhdVar.b.N().findViewById(2131429238);
                if (((defpackage.rgs) rhdVar.d.orElseThrow()).b() - 1 != 0) {
                    defpackage.rgr rgrVarA = ((defpackage.rgs) rhdVar.d.orElseThrow()).a();
                    java.lang.CharSequence text = rhdVar.a.getText(rgrVarA.a);
                    int i = rgrVarA.c;
                    textView.setText(android.text.TextUtils.expandTemplate(text, java.lang.String.valueOf(i)));
                    rhdVar.c = j$.util.Optional.of(new max(rhdVar.f, java.util.concurrent.TimeUnit.SECONDS.toMillis(i), 1000L, new defpackage.ajxi(rhdVar, textView, rgrVarA)));
                    ((android.os.CountDownTimer) rhdVar.c.orElseThrow()).start();
                } else {
                    textView.setText(((defpackage.rgs) rhdVar.d.orElseThrow()).c());
                }
            }
            defpackage.rgq rgqVar = rgtVar.b;
            if (!rhdVar.e.isPresent() || !((defpackage.rgq) rhdVar.e.orElseThrow()).equals(rgqVar)) {
                rhdVar.e = j$.util.Optional.of(rgqVar);
                android.widget.TextView textView2 = (android.widget.TextView) rhdVar.b.N().findViewById(2131429238);
                int iOrdinal2 = ((defpackage.rgq) rhdVar.e.orElseThrow()).ordinal();
                if (iOrdinal2 == 0) {
                    textView2.setTextColor(urg.c(rhdVar.a, android.R.attr.textColorPrimary));
                } else if (iOrdinal2 == 1) {
                    textView2.setTextColor(urg.c(rhdVar.a, 2130968948));
                }
            }
            defpackage.yzr yzrVar = rhhVar.j;
            j$.util.OptionalInt optionalInt = rgpVar.d;
            android.widget.TextView textView3 = (android.widget.TextView) ((defpackage.rhe) yzrVar.b).N().findViewById(2131429237);
            if (!optionalInt.isPresent()) {
                textView3.setVisibility(4);
                yzrVar.a = j$.util.OptionalInt.empty();
            } else if (!((j$.util.OptionalInt) yzrVar.a).equals(optionalInt)) {
                yzrVar.a = optionalInt;
                textView3.setText(optionalInt.getAsInt());
                textView3.setVisibility(0);
            }
            vwb vwbVar = rhhVar.h;
            java.lang.String str = ((defpackage.rgw) optional.orElseThrow()).a;
            if (str == null) {
                throw new java.lang.NullPointerException("Null callId");
            }
            int i2 = rgpVar.f;
            if (i2 == 0) {
                throw new java.lang.NullPointerException("Null style");
            }
            defpackage.rea reaVar = rgpVar.a;
            if (reaVar == null) {
                throw new java.lang.NullPointerException("Null featureControllerKey");
            }
            defpackage.rhc rhcVar = new defpackage.rhc(str, i2, reaVar);
            if (!((j$.util.Optional) vwbVar.c).isPresent() || !((defpackage.rhc) ((j$.util.Optional) vwbVar.c).orElseThrow()).equals(rhcVar)) {
                vwbVar.c = j$.util.Optional.of(rhcVar);
                ahvr.bY(((j$.util.Optional) vwbVar.c).isPresent());
                defpackage.rhe rheVar = (defpackage.rhe) vwbVar.b;
                android.view.View viewFindViewById = rheVar.N().findViewById(2131428788);
                android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById.findViewById(2131428790);
                android.widget.TextView textView4 = (android.widget.TextView) viewFindViewById.findViewById(2131428791);
                android.view.View viewFindViewById2 = viewFindViewById.findViewById(2131428789);
                android.content.Context contextA = rheVar.A();
                int iC = urg.c(contextA, 2130969072);
                int i3 = ((defpackage.rhc) ((j$.util.Optional) vwbVar.c).orElseThrow()).c;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                if (i4 == 0) {
                    viewFindViewById.setAlpha(1.0f);
                    viewFindViewById.setBackgroundResource(2131232083);
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(iC));
                    textView4.setTextColor(iC);
                    imageView.setVisibility(0);
                    textView4.setVisibility(0);
                    viewFindViewById2.setVisibility(8);
                } else if (i4 == 1) {
                    viewFindViewById.setAlpha(1.0f);
                    viewFindViewById.setBackgroundResource(2131232082);
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(contextA, android.R.attr.colorBackground)));
                    textView4.setTextColor(urg.c(contextA, android.R.attr.colorBackground));
                    imageView.setVisibility(0);
                    textView4.setVisibility(0);
                    viewFindViewById2.setVisibility(8);
                } else if (i4 == 2) {
                    viewFindViewById.setAlpha(0.5f);
                    viewFindViewById.setBackgroundResource(2131232082);
                    imageView.setImageTintList(android.content.res.ColorStateList.valueOf(urg.c(contextA, android.R.attr.colorBackground)));
                    textView4.setTextColor(urg.c(contextA, android.R.attr.colorBackground));
                    imageView.setVisibility(8);
                    textView4.setVisibility(8);
                    viewFindViewById2.setVisibility(0);
                }
                ahvr.bY(((j$.util.Optional) vwbVar.c).isPresent());
                android.view.View viewFindViewById3 = rheVar.N().findViewById(2131428788);
                int i5 = ((defpackage.rhc) ((j$.util.Optional) vwbVar.c).orElseThrow()).c;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                if (i6 == 0 || i6 == 1) {
                    viewFindViewById3.setOnClickListener(new defpackage.qht(vwbVar, 13));
                } else if (i6 == 2) {
                    viewFindViewById3.setOnClickListener(null);
                    viewFindViewById3.setClickable(false);
                }
            }
            defpackage.yzr yzrVar2 = rhhVar.i;
            j$.util.Optional optional2 = rgpVar.e;
            defpackage.rhe rheVar2 = (defpackage.rhe) yzrVar2.b;
            android.view.View viewFindViewById4 = rheVar2.N().findViewById(2131429310);
            com.google.android.libraries.communications.ux.views.captionsview.CaptionsView captionsView = (com.google.android.libraries.communications.ux.views.captionsview.CaptionsView) rheVar2.N().findViewById(2131429311);
            if (!optional2.isPresent()) {
                viewFindViewById4.setVisibility(4);
                captionsView.b.clear();
                defpackage.aboy aboyVar = captionsView.c;
                if (aboyVar != null) {
                    if (aboyVar.isRunning()) {
                        aboyVar.cancel();
                    }
                    aboyVar.a.clear();
                    aboyVar.b.clear();
                    aboyVar.c.clear();
                    aboyVar.d.clear();
                }
                java.lang.CharSequence charSequence = null;
                captionsView.c = null;
                captionsView.f = false;
                android.widget.TextView[] textViewArr = captionsView.a;
                int length = textViewArr.length;
                int i7 = 0;
                while (i7 < length) {
                    android.widget.TextView textView5 = textViewArr[i7];
                    textView5.setText(charSequence);
                    textView5.setAlpha(1.0f);
                    i7++;
                    charSequence = null;
                }
                captionsView.setTranslationY(0.0f);
                captionsView.e = false;
                captionsView.d = 0;
                if (captionsView.getChildAt(0) != textViewArr[0]) {
                    captionsView.removeAllViews();
                    for (android.widget.TextView textView6 : textViewArr) {
                        captionsView.addView(textView6);
                    }
                }
                yzrVar2.a = j$.util.Optional.empty();
            } else if (!((j$.util.Optional) yzrVar2.a).equals(optional2)) {
                viewFindViewById4.setVisibility(0);
                int i8 = ((defpackage.rgu) optional2.orElseThrow()).b;
                int i9 = i8 - 1;
                if (i8 == 0) {
                    throw null;
                }
                if (i9 == 0) {
                    captionsView.b(((defpackage.rgu) optional2.orElseThrow()).a, 3);
                } else if (i9 == 1) {
                    captionsView.b(((defpackage.rgu) optional2.orElseThrow()).a, 2);
                } else if (i9 == 2) {
                    captionsView.b(((defpackage.rgu) optional2.orElseThrow()).a, 1);
                }
                yzrVar2.a = optional2;
            }
            rhhVar.c.N().setVisibility(0);
        }
    }

    public final void b(java.lang.Throwable th) {
        a.bq(defpackage.rhh.a.c(), "failed to load VoiceFeatureTakeoverModel", "com/android/dialer/incall/voicefeaturecombiner/templates/takeover/ui/VoiceFeatureTakeoverFragmentPeer$1", "onDataLoadError", '>', "VoiceFeatureTakeoverFragmentPeer.java", th, zct.b);
    }
}
