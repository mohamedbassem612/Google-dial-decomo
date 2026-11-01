package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lmb extends kh {
    private static final aimz l = aimz.i("com/android/dialer/callscreen/impl/ui/CallScreenChatAdapter");
    public final rlv a;
    boolean h;
    public rai k;
    private android.support.v7.widget.RecyclerView m;
    private android.animation.Animator n;
    private final defpackage.lyt o;
    private final pgi p;
    public defpackage.lgp e = defpackage.lgp.a;
    public abwd f = abwd.a;
    public aify g = aike.a;
    public int i = -1;
    public boolean j = true;

    public lmb(pgi pgiVar, defpackage.lyt lytVar, rlv rlvVar) {
        this.p = pgiVar;
        this.o = lytVar;
        this.a = rlvVar;
        r(true);
    }

    private final boolean x(int i) {
        return i == a() + (-1);
    }

    public final int a() {
        l.b().g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/callscreen/impl/ui/CallScreenChatAdapter", "getItemCount", 237, "CallScreenChatAdapter.java").C("callScreenMessages size: %d, show suggestions:%b", this.e.b.size(), this.g.isEmpty());
        return this.e.b.size() + 1;
    }

    public final int b(int i) {
        if (x(i)) {
            return 3;
        }
        defpackage.lgo lgoVar = (defpackage.lgo) this.e.b.get(i);
        int iAN = a.aN(lgoVar.g);
        if (iAN != 0 && iAN == 3) {
            return 1;
        }
        int iAN2 = a.aN(lgoVar.g);
        if (iAN2 == 0 || iAN2 != 2) {
            throw new java.lang.IllegalStateException(a.bj(i, "Invalid view type for position:"));
        }
        return 2;
    }

    public final long c(int i) {
        if (x(i)) {
            return -93827616L;
        }
        return ((defpackage.lgo) this.e.b.get(i)).d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [aoin, java.lang.Object] */
    public final ld d(android.view.ViewGroup viewGroup, int i) {
        ld lmmVar;
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(this.m.getContext());
        if (i == 1) {
            android.view.View viewInflate = layoutInflaterFrom.inflate(2131624077, viewGroup, false);
            pgi pgiVar = this.p;
            voc vocVar = (voc) pgiVar.b.a();
            vocVar.getClass();
            rlv rlvVar = (rlv) pgiVar.a.a();
            rlvVar.getClass();
            viewInflate.getClass();
            lmmVar = new defpackage.lmm(vocVar, rlvVar, viewInflate);
        } else {
            if (i != 2) {
                if (i == 3) {
                    return new defpackage.aham(layoutInflaterFrom.inflate(2131624076, viewGroup, false), (char[]) null, (byte[]) null);
                }
                throw new java.lang.IllegalStateException(a.bj(i, "No ViewHolder available for viewType: "));
            }
            android.view.View viewInflate2 = layoutInflaterFrom.inflate(2131624066, viewGroup, false);
            defpackage.lyt lytVar = this.o;
            voc vocVar2 = (voc) lytVar.a.a();
            vocVar2.getClass();
            ops opsVar = (ops) lytVar.c.a();
            opsVar.getClass();
            rlv rlvVar2 = (rlv) lytVar.b.a();
            rlvVar2.getClass();
            viewInflate2.getClass();
            lmmVar = new defpackage.lma(vocVar2, opsVar, rlvVar2, viewInflate2);
        }
        return lmmVar;
    }

    public final void l(android.support.v7.widget.RecyclerView recyclerView) {
        this.m = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:133:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x008a  */
    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    /* JADX WARN: Code duplicated, block: B:18:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x0103  */
    /* JADX WARN: Code duplicated, block: B:31:0x0118  */
    public final void m(ld ldVar, int i) {
        java.lang.String str;
        android.view.LayoutInflater layoutInflaterFrom;
        int size;
        int i2;
        defpackage.lgk lgkVar;
        alam alamVar;
        int i3;
        rai raiVar;
        j$.util.Optional optionalA;
        defpackage.kwv kwvVar;
        l.b().g(10, java.util.concurrent.TimeUnit.SECONDS).l("com/android/dialer/callscreen/impl/ui/CallScreenChatAdapter", "onBindViewHolder", 172, "CallScreenChatAdapter.java").w("position: %d", i);
        boolean z = true;
        if (x(i)) {
            aify aifyVar = this.g;
            boolean z2 = this.h;
            rai raiVar2 = this.k;
            android.view.View view = ((defpackage.aham) ldVar).s;
            com.android.dialer.callscreen.impl.ui.SuggestionsView suggestionsView = (com.android.dialer.callscreen.impl.ui.SuggestionsView) view;
            aify aifyVar2 = suggestionsView.c;
            if (aifyVar2.size() == aifyVar.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 < aifyVar.size()) {
                        if (((defpackage.lgk) aifyVar2.get(i4)).g.equals(((defpackage.lgk) aifyVar.get(i4)).g)) {
                            i4++;
                        } else {
                            aimw aimwVarL = com.android.dialer.callscreen.impl.ui.SuggestionsView.a.b().l("com/android/dialer/callscreen/impl/ui/SuggestionsView", "populateSuggestionsView", 76, "SuggestionsView.java");
                            if (true != suggestionsView.c.isEmpty()) {
                                str = "not empty";
                            } else {
                                str = "empty";
                            }
                            aimwVarL.y("populateSuggestionsView previously %s", str);
                            suggestionsView.c = aifyVar;
                            layoutInflaterFrom = android.view.LayoutInflater.from(suggestionsView.b.getContext());
                            suggestionsView.b.removeAllViews();
                            if (!aifyVar.isEmpty()) {
                                layoutInflaterFrom.inflate(2131624065, (android.view.ViewGroup) suggestionsView.b, true);
                                size = aifyVar.size();
                                i2 = 0;
                                while (i2 < size) {
                                    lgkVar = (defpackage.lgk) aifyVar.get(i2);
                                    alamVar = new alam(lgkVar.e, defpackage.lgk.a);
                                    if (alamVar.contains(defpackage.lln.REPORT_SPAM)) {
                                        i3 = 2131624067;
                                    } else if (alamVar.contains(defpackage.lln.END_CALL)) {
                                        i3 = 2131624073;
                                    } else {
                                        i3 = 2131624068;
                                    }
                                    android.widget.Button button = (android.widget.Button) layoutInflaterFrom.inflate(i3, (android.view.ViewGroup) suggestionsView.b, false);
                                    button.setText(lgkVar.g);
                                    button.setOnClickListener(new defpackage.jjg(view, lgkVar, 4));
                                    suggestionsView.b.addView(button);
                                    raiVar = suggestionsView.d;
                                    if (raiVar != null) {
                                        optionalA = ((defpackage.lmk) raiVar.a).a();
                                        kwvVar = new defpackage.kwv(lgkVar, 20);
                                        if (z == optionalA.isPresent()) {
                                            java.lang.Object obj = optionalA.get();
                                            java.lang.Object obj2 = kwvVar.a;
                                            defpackage.ldn ldnVar = ((defpackage.lev) obj).g.f;
                                            agsm.i(269, ahvr.E(new defpackage.jnv(ldnVar, ((defpackage.lgk) obj2).h, 14, null), ldnVar.g), "failed to log metrics for presented chip", new java.lang.Object[0]);
                                        }
                                    }
                                    i2++;
                                    z = true;
                                }
                                android.view.animation.LayoutAnimationController layoutAnimationControllerLoadLayoutAnimation = android.view.animation.AnimationUtils.loadLayoutAnimation(suggestionsView.getContext(), 2130772045);
                                layoutAnimationControllerLoadLayoutAnimation.getAnimation().setInterpolator(new eme());
                                suggestionsView.b.setLayoutAnimation(layoutAnimationControllerLoadLayoutAnimation);
                            }
                        }
                    }
                }
            } else {
                aimw aimwVarL2 = com.android.dialer.callscreen.impl.ui.SuggestionsView.a.b().l("com/android/dialer/callscreen/impl/ui/SuggestionsView", "populateSuggestionsView", 76, "SuggestionsView.java");
                if (true != suggestionsView.c.isEmpty()) {
                    str = "not empty";
                } else {
                    str = "empty";
                }
                aimwVarL2.y("populateSuggestionsView previously %s", str);
                suggestionsView.c = aifyVar;
                layoutInflaterFrom = android.view.LayoutInflater.from(suggestionsView.b.getContext());
                suggestionsView.b.removeAllViews();
                if (!aifyVar.isEmpty()) {
                    layoutInflaterFrom.inflate(2131624065, (android.view.ViewGroup) suggestionsView.b, true);
                    size = aifyVar.size();
                    i2 = 0;
                    while (i2 < size) {
                        lgkVar = (defpackage.lgk) aifyVar.get(i2);
                        alamVar = new alam(lgkVar.e, defpackage.lgk.a);
                        if (alamVar.contains(defpackage.lln.REPORT_SPAM)) {
                            i3 = 2131624067;
                        } else if (alamVar.contains(defpackage.lln.END_CALL)) {
                            i3 = 2131624073;
                        } else {
                            i3 = 2131624068;
                        }
                        android.widget.Button button2 = (android.widget.Button) layoutInflaterFrom.inflate(i3, (android.view.ViewGroup) suggestionsView.b, false);
                        button2.setText(lgkVar.g);
                        button2.setOnClickListener(new defpackage.jjg(view, lgkVar, 4));
                        suggestionsView.b.addView(button2);
                        raiVar = suggestionsView.d;
                        if (raiVar != null) {
                            optionalA = ((defpackage.lmk) raiVar.a).a();
                            kwvVar = new defpackage.kwv(lgkVar, 20);
                            if (z == optionalA.isPresent()) {
                                java.lang.Object obj3 = optionalA.get();
                                java.lang.Object obj4 = kwvVar.a;
                                defpackage.ldn ldnVar2 = ((defpackage.lev) obj3).g.f;
                                agsm.i(269, ahvr.E(new defpackage.jnv(ldnVar2, ((defpackage.lgk) obj4).h, 14, null), ldnVar2.g), "failed to log metrics for presented chip", new java.lang.Object[0]);
                            }
                        }
                        i2++;
                        z = true;
                    }
                    android.view.animation.LayoutAnimationController layoutAnimationControllerLoadLayoutAnimation2 = android.view.animation.AnimationUtils.loadLayoutAnimation(suggestionsView.getContext(), 2130772045);
                    layoutAnimationControllerLoadLayoutAnimation2.getAnimation().setInterpolator(new eme());
                    suggestionsView.b.setLayoutAnimation(layoutAnimationControllerLoadLayoutAnimation2);
                }
            }
            if (z2) {
                if (suggestionsView.b.getChildCount() <= 1) {
                    com.android.dialer.callscreen.impl.ui.SuggestionsView.a.b().l("com/android/dialer/callscreen/impl/ui/SuggestionsView", "disableSuggestionButtons", 137, "SuggestionsView.java").v("unable to disable suggestions since no clickable buttons present");
                } else {
                    suggestionsView.b.getChildAt(0).setAlpha(0.5f);
                    for (int i5 = 1; i5 < suggestionsView.b.getChildCount(); i5++) {
                        android.view.View childAt = suggestionsView.b.getChildAt(i5);
                        childAt.setClickable(false);
                        childAt.setAlpha(0.5f);
                    }
                }
            } else if (suggestionsView.b.getChildCount() <= 1) {
                com.android.dialer.callscreen.impl.ui.SuggestionsView.a.b().l("com/android/dialer/callscreen/impl/ui/SuggestionsView", "enableSuggestionsButtons", 153, "SuggestionsView.java").v("unable to enable suggestions since no clickable buttons present");
            } else {
                float f = 1.0f;
                suggestionsView.b.getChildAt(0).setAlpha(1.0f);
                int i6 = 1;
                while (i6 < suggestionsView.b.getChildCount()) {
                    android.view.View childAt2 = suggestionsView.b.getChildAt(i6);
                    childAt2.setClickable(true);
                    childAt2.setAlpha(f);
                    i6++;
                    f = 1.0f;
                }
            }
            suggestionsView.d = raiVar2;
            return;
        }
        defpackage.lgo lgoVar = (defpackage.lgo) this.e.b.get(i);
        int iAN = a.aN(lgoVar.g);
        int i7 = 2;
        int i8 = 3;
        if (iAN == 0 || iAN != 3) {
            int iAN2 = a.aN(lgoVar.g);
            if (iAN2 == 0 || iAN2 != 2) {
                return;
            }
            defpackage.lma lmaVar = (defpackage.lma) ldVar;
            abwd abwdVar = this.f;
            if (lgoVar.k) {
                rlv rlvVar = lmaVar.y;
                rlvVar.o(rmx.bD);
                lmaVar.t.setVisibility(8);
                android.widget.TextView textView = lmaVar.v;
                textView.setVisibility(0);
                int iAN3 = a.aN(lgoVar.f);
                if (iAN3 != 0 && iAN3 == 3) {
                    textView.setText(textView.getContext().getString(2132017777));
                    lmaVar.x.c();
                    rlvVar.o(rmx.bG);
                }
                int iAN4 = a.aN(lgoVar.f);
                if (iAN4 != 0 && iAN4 == 2) {
                    textView.setText(textView.getContext().getString(2132017779));
                    lmaVar.x.a();
                    rlvVar.o(rmx.bF);
                }
            } else {
                rlv rlvVar2 = lmaVar.y;
                rlvVar2.o(rmx.bE);
                android.widget.TextView textView2 = lmaVar.t;
                textView2.setVisibility(0);
                lmaVar.v.setVisibility(8);
                lmaVar.w.setVisibility(8);
                int iAN5 = a.aN(lgoVar.f);
                if (iAN5 != 0 && iAN5 == 3) {
                    textView2.setText(textView2.getContext().getString(2132017778));
                    lmaVar.x.c();
                    rlvVar2.o(rmx.bJ);
                }
                int iAN6 = a.aN(lgoVar.f);
                if (iAN6 != 0 && iAN6 == 2) {
                    textView2.setText(textView2.getContext().getString(2132017776));
                    lmaVar.x.a();
                    rlvVar2.o(rmx.bI);
                }
                int iAN7 = a.aN(lgoVar.f);
                if (iAN7 == 0 || iAN7 == 1) {
                    rlvVar2.o(rmx.bH);
                }
            }
            lmaVar.s.setText(lgoVar.e);
            lmaVar.z.f(lmaVar.u, abwdVar, false);
        } else {
            defpackage.lmm lmmVar = (defpackage.lmm) ldVar;
            android.widget.TextView textView3 = lmmVar.s;
            textView3.setTextColor(textView3.getContext().getColor(2131101043));
            textView3.setText("");
            android.widget.TextView textView4 = lmmVar.t;
            textView4.setText("");
            int iAN8 = a.aN(lgoVar.f);
            if (iAN8 != 0 && iAN8 == 3) {
                textView4.setText(textView3.getContext().getString(2132017864));
                lmmVar.u.c();
                lmmVar.v.o(rmx.bM);
            }
            int iAN9 = a.aN(lgoVar.f);
            if (iAN9 != 0 && iAN9 == 2) {
                textView4.setText(textView3.getContext().getString(2132017863));
                lmmVar.u.a();
                lmmVar.v.o(rmx.bL);
            }
            int iAN10 = a.aN(lgoVar.f);
            if (iAN10 == 0 || iAN10 == 1) {
                lmmVar.v.o(rmx.bK);
            }
            textView3.setText(lgoVar.e);
            j$.util.Optional optionalOf = (lgoVar.b & 64) != 0 ? j$.util.Optional.of(java.lang.Integer.valueOf(lgoVar.i)) : j$.util.Optional.empty();
            if (optionalOf.isPresent() && ((java.lang.Integer) optionalOf.orElseThrow()).intValue() == 0) {
                textView3.setTextColor(textView3.getContext().getColor(2131101043));
            } else if (!optionalOf.isPresent() || ((java.lang.Integer) optionalOf.orElseThrow()).intValue() <= 0 || ((java.lang.Integer) optionalOf.orElseThrow()).intValue() >= 100) {
                textView3.setTextColor(urg.c(textView3.getContext(), android.R.attr.textColorPrimary));
            } else {
                int iIntValue = (((java.lang.Integer) optionalOf.orElseThrow()).intValue() * lgoVar.e.length()) / 100;
                java.lang.String str2 = lgoVar.e;
                if (iIntValue != str2.length() - 1) {
                    while (true) {
                        if (iIntValue < 0) {
                            iIntValue = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(iIntValue);
                        char cCharAt2 = str2.charAt(iIntValue + 1);
                        boolean zIsAlphabetic = java.lang.Character.isAlphabetic(cCharAt2);
                        boolean zIsAlphabetic2 = java.lang.Character.isAlphabetic(cCharAt);
                        if (cCharAt2 != '\'' && !zIsAlphabetic && zIsAlphabetic2) {
                            break;
                        } else {
                            iIntValue--;
                        }
                    }
                }
                android.text.SpannableString spannableString = new android.text.SpannableString(lgoVar.e);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(urg.c(textView3.getContext(), android.R.attr.textColorPrimary)), 0, iIntValue + 1, 33);
                textView3.setText(spannableString);
            }
        }
        if (i > this.i) {
            if (this.j) {
                android.view.View view2 = ldVar.a;
                view2.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.m.getWidth(), Integer.MIN_VALUE), 0);
                int measuredHeight = view2.getMeasuredHeight();
                defpackage.lmn lmnVar = (defpackage.lmn) ldVar;
                android.view.View viewC = lmnVar.C();
                android.widget.TextView textViewE = lmnVar.E();
                android.widget.TextView textViewD = lmnVar.D();
                defpackage.hsh hshVarB = defpackage.hsh.b();
                hshVarB.g(0.0f, measuredHeight, new emd(), new defpackage.kkz(viewC, i7));
                eme emeVar = new eme();
                j$.util.Objects.requireNonNull(textViewE);
                hshVarB.g(0.0f, 1.0f, emeVar, new defpackage.kkz(textViewE, i8));
                eme emeVar2 = new eme();
                j$.util.Objects.requireNonNull(textViewD);
                hshVarB.g(0.0f, 1.0f, emeVar2, new defpackage.kkz(textViewD, i8));
                hshVarB.i(new defpackage.ldf(viewC, 14));
                android.animation.ValueAnimator duration = hshVarB.setDuration(530L);
                this.n = duration;
                duration.start();
            }
            this.i = i;
        }
    }

    public final void o(ld ldVar) {
        if (ldVar instanceof defpackage.lmn) {
            ((defpackage.lmn) ldVar).G();
        }
    }

    public final void p(ld ldVar) {
        android.animation.Animator animator;
        if (ldVar instanceof defpackage.lmn) {
            ((defpackage.lmn) ldVar).F();
            android.view.View view = ldVar.a;
            if (view.getLayoutParams().height != -2) {
                view.getLayoutParams().height = -2;
                view.requestLayout();
            }
        }
        if (ldVar.b() != a() - 1 || (animator = this.n) == null) {
            return;
        }
        animator.cancel();
        this.n = null;
    }

    public final void w() {
        this.h = true;
        f(a() - 1);
    }
}
