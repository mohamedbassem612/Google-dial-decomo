package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afky {
    public static aigf a;
    public final defpackage.afkx b;
    public com.google.android.libraries.surveys.internal.model.Answer c;
    public android.content.Context d;
    public android.app.Activity e;
    public defpackage.amip f;
    public com.google.android.libraries.surveys.internal.model.QuestionMetrics g;
    public amje h;
    public defpackage.afkf i;
    public boolean j;
    public java.lang.String k;
    public java.lang.String l;
    public aogw n;
    public defpackage.afpl o;
    private android.view.View p;
    private android.view.ViewGroup q;
    private int s;
    private java.lang.Integer t;
    private defpackage.afiz u;
    private java.lang.String v;
    private boolean r = false;
    private boolean w = false;
    private boolean x = true;
    private boolean y = true;
    public int m = 0;

    public afky(defpackage.afkx afkxVar) {
        this.b = afkxVar;
    }

    private final void m(android.view.View.OnClickListener onClickListener, java.lang.String str) {
        ((com.google.android.material.button.MaterialButton) this.q.findViewById(2131429166)).setOnClickListener(new knj(this, onClickListener, str, 11));
    }

    private final void n() {
        ((android.view.LayoutInflater) this.d.getSystemService("layout_inflater")).inflate(2131624634, this.q);
        if (afjz.n(this.f)) {
            f(false);
            com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.q.findViewById(2131429166);
            if (materialButton != null && this.f.g.size() == 1 && !this.w) {
                materialButton.setText(2132020358);
            }
            defpackage.afjs.e(this.q.findViewById(2131429157), this.q.findViewById(2131429166), 2131167813, 0);
        } else {
            this.q.findViewById(2131429166).setVisibility(8);
        }
        this.q.findViewById(2131429158).setVisibility(8);
        this.q.findViewById(2131429159).setVisibility(8);
    }

    private final void o(android.content.Context context, java.lang.String str, amje amjeVar, boolean z) {
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        answer.g = 3;
        new defpackage.wyw(context, str, amjeVar).h(answer, z);
    }

    private final boolean p() {
        android.app.Activity activity;
        if (this.r) {
            return false;
        }
        aehj aehjVar = afjy.c;
        android.content.Context context = afjy.b;
        return (afjy.b(true) && (activity = this.b.getActivity()) != null && activity.isChangingConfigurations()) ? false : true;
    }

    private static final void q(android.view.View view, java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131429184);
        android.text.Spanned spannedF = yv.f(str);
        textView.setText(spannedF);
        textView.announceForAccessibility(spannedF.toString());
    }

    public final afjj a() {
        amje amjeVar = this.h;
        if (amjeVar == null || this.k == null) {
            long j = afjz.a;
            return null;
        }
        defpackage.aliq aliqVar = new defpackage.aliq((byte[]) null);
        aliqVar.i(amjeVar.b);
        aliqVar.k(this.k);
        aliqVar.j(defpackage.afjk.b);
        return aliqVar.h();
    }

    public final void b(defpackage.amiv amivVar) {
        int size = 1;
        if (afjy.a()) {
            defpackage.amiu amiuVar = amivVar.k;
            if (amiuVar == null) {
                amiuVar = defpackage.amiu.a;
            }
            if ((amiuVar.b & 1) != 0) {
                defpackage.amiu amiuVar2 = amivVar.k;
                if (amiuVar2 == null) {
                    amiuVar2 = defpackage.amiu.a;
                }
                amho amhoVar = amiuVar2.d;
                if (amhoVar == null) {
                    amhoVar = amho.a;
                }
                int iW = a.W(amhoVar.b);
                if (iW == 0) {
                    iW = 1;
                }
                if (iW - 2 == 3) {
                    size = this.f.g.size();
                }
            }
        }
        this.m = size;
    }

    public final void c() {
        defpackage.afiz afizVar;
        defpackage.afiz afizVar2;
        this.g.a();
        aehj aehjVar = afjy.c;
        if (!afjy.c(defpackage.anlf.c(afjy.b)) || (((afizVar = this.u) != (afizVar2 = defpackage.afiz.b) && afizVar != defpackage.afiz.c) || (this.f.g.size() != 1 && !aehj.y(this.j, this.f, this.c) && this.m != this.f.g.size()))) {
            h();
            return;
        }
        defpackage.afiz afizVar3 = this.u;
        if (afizVar3 == afizVar2) {
            android.view.View view = this.p;
            defpackage.amhw amhwVar = this.f.d;
            if (amhwVar == null) {
                amhwVar = defpackage.amhw.b;
            }
            defpackage.agby.q(view, amhwVar.c, -1).h();
        } else if (afizVar3 == defpackage.afiz.c) {
            android.util.Log.v("SurveyPromptDialogDel", "Silent SurveyCompletionStyle, client apps will display their own completion dialog if need");
        }
        android.content.Context context = this.d;
        java.lang.String str = this.k;
        amje amjeVar = this.h;
        boolean zL = afjz.l(this.f);
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        answer.g = 5;
        new defpackage.wyw(context, str, amjeVar).h(answer, zL);
        o(this.d, this.k, this.h, afjz.l(this.f));
        this.b.dismissAllowingStateLoss();
    }

    public final void d() {
        if (afjy.b != null) {
            if (!afjy.d()) {
                if (p()) {
                    aehj.b.n();
                }
            } else {
                afjj afjjVarA = a();
                if (!p() || afjjVarA == null) {
                    return;
                }
                aehj.b.o(afjjVarA);
            }
        }
    }

    public final void e(android.view.View view) {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.d.getSystemService("accessibility");
        android.view.View viewFindViewById = view.findViewById(2131429184);
        aehj aehjVar = afjy.c;
        if (!afjy.b(defpackage.ankh.a.eZ().a(afjy.b)) || !accessibilityManager.isTouchExplorationEnabled() || viewFindViewById == null || viewFindViewById.isAccessibilityFocused()) {
            return;
        }
        viewFindViewById.performAccessibilityAction(64, null);
    }

    public final void f(boolean z) {
        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) this.q.findViewById(2131429166);
        if (materialButton == null || materialButton.isEnabled() == z) {
            return;
        }
        materialButton.setEnabled(z);
    }

    public final void g(defpackage.amiv amivVar) {
        java.lang.Object obj;
        aogw aogwVar = this.n;
        akzx akzxVarM = amig.a.m();
        int iIntValue = 1;
        if (this.g.c() && (obj = aogwVar.c) != null) {
            akzx akzxVarM2 = defpackage.amie.a.m();
            int i = aogwVar.b;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).c = i;
            int i2 = aogwVar.a;
            akzxVarM2.u();
            ((defpackage.amie) akzxVarM2.b).b = a.Q(i2);
            akzxVarM2.u();
            defpackage.amie amieVar = (defpackage.amie) akzxVarM2.b;
            j$.util.Objects.requireNonNull(obj);
            amieVar.d = (java.lang.String) obj;
            defpackage.amie amieVar2 = (defpackage.amie) akzxVarM2.p();
            akzx akzxVarM3 = amif.a.m();
            akzxVarM3.u();
            amif amifVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(amieVar2);
            amifVar.c = amieVar2;
            amifVar.b |= 1;
            amif amifVarP = akzxVarM3.p();
            akzxVarM.u();
            amig amigVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(amifVarP);
            amigVar.c = amifVarP;
            amigVar.b = 2;
            int i3 = amivVar.e;
            akzxVarM.u();
            akzxVarM.b.d = i3;
        }
        amig amigVarP = akzxVarM.p();
        if (amigVarP != null) {
            this.c.a = amigVarP;
        }
        b(amivVar);
        aogw aogwVar2 = this.n;
        aehj aehjVar = afjy.c;
        if (afjy.c(anke.c(afjy.b))) {
            defpackage.amhm amhmVar = defpackage.amhm.a;
            amhn amhnVar = (amivVar.c == 4 ? (defpackage.amjf) amivVar.d : defpackage.amjf.a).c;
            if (amhnVar == null) {
                amhnVar = amhn.a;
            }
            for (defpackage.amhm amhmVar2 : amhnVar.b) {
                if (amhmVar2.d == aogwVar2.b) {
                    amhmVar = amhmVar2;
                    break;
                }
            }
            if ((amhmVar.b & 1) != 0) {
                amho amhoVar = amhmVar.g;
                if (amhoVar == null) {
                    amhoVar = amho.a;
                }
                int iW = a.W(amhoVar.b);
                if (iW == 0) {
                    iW = 1;
                }
                int i4 = iW - 2;
                if (i4 == 2) {
                    amho amhoVar2 = amhmVar.g;
                    if (amhoVar2 == null) {
                        amhoVar2 = amho.a;
                    }
                    java.lang.String str = amhoVar2.c;
                    iIntValue = a.containsKey(str) ? ((java.lang.Integer) a.get(str)).intValue() : 0;
                } else if (i4 == 3) {
                    iIntValue = this.f.g.size();
                }
                this.m = iIntValue;
            }
        } else {
            this.m = 1;
        }
        c();
    }

    public final void h() {
        defpackage.amip amipVar;
        defpackage.afkx afkxVar = this.b;
        android.app.Activity activity = afkxVar.getActivity();
        java.lang.String str = this.k;
        defpackage.amip amipVar2 = this.f;
        amje amjeVar = this.h;
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        int i = this.s;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        boolean z = this.j;
        java.lang.Integer num = this.t;
        defpackage.afiz afizVar = this.u;
        java.lang.String str2 = this.v;
        int i2 = this.m;
        boolean z2 = this.w;
        boolean z3 = this.x;
        boolean z4 = this.y;
        java.util.HashMap map = new java.util.HashMap();
        java.util.Iterator it = amipVar2.g.iterator();
        while (true) {
            amipVar = amipVar2;
            if (!it.hasNext()) {
                break;
            }
            defpackage.amiv amivVar = (defpackage.amiv) it.next();
            java.util.Iterator it2 = it;
            if ((amivVar.b & 1) != 0) {
                defpackage.amiu amiuVar = amivVar.k;
                if (amiuVar == null) {
                    amiuVar = defpackage.amiu.a;
                }
                if (!map.containsKey(amiuVar.c)) {
                    defpackage.amiu amiuVar2 = amivVar.k;
                    if (amiuVar2 == null) {
                        amiuVar2 = defpackage.amiu.a;
                    }
                    map.put(amiuVar2.c, java.lang.Integer.valueOf(amivVar.e - 1));
                }
            }
            it = it2;
            amipVar2 = amipVar;
        }
        defpackage.aflv.a = aigf.i(map);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) defpackage.aflv.class);
        intent.setClassName(activity, str2);
        intent.putExtra("TriggerId", str);
        intent.putExtra("SurveyPayload", amipVar.i());
        intent.putExtra("SurveySession", amjeVar.i());
        intent.putExtra("Answer", answer);
        intent.putExtra("IsFullWidth", false);
        intent.putExtra("IgnoreFirstQuestion", z);
        if (num != null) {
            intent.putExtra("LogoResId", num);
        }
        intent.putExtra("IsSubmitting", false);
        intent.putExtra("SurveyCompletionStyle", afizVar);
        intent.putExtra("StartingQuestionIndex", i2);
        intent.putExtra("keepNextButtonForLastQuestion", z2);
        intent.putExtra("isCarDisplayFullyReachable", z3);
        intent.putExtra("isCarDisplayRightOfUser", z4);
        long j = afjz.a;
        numValueOf.getClass();
        activity.startActivityForResult(intent, i);
        this.r = true;
        o(this.d, this.k, this.h, afjz.l(this.f));
        afkxVar.dismissAllowingStateLoss();
    }

    public final void i(android.content.Context context, java.lang.String str, amje amjeVar, boolean z) {
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        answer.g = 4;
        new defpackage.wyw(context, str, amjeVar).h(answer, z);
    }

    public final void j(android.content.Context context, java.lang.String str, amje amjeVar, boolean z) {
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        answer.g = 6;
        new defpackage.wyw(context, str, amjeVar).h(answer, z);
    }

    public final void k() {
        if (afjy.b == null) {
            this.b.dismissAllowingStateLoss();
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0472  */
    /* JADX WARN: Code duplicated, block: B:128:0x0479  */
    /* JADX WARN: Code duplicated, block: B:130:0x047f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0489  */
    /* JADX WARN: Code duplicated, block: B:135:0x048f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0496  */
    /* JADX WARN: Code duplicated, block: B:140:0x049e  */
    /* JADX WARN: Code duplicated, block: B:141:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x04a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:148:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:152:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:159:0x04d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:163:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:165:0x04e3  */
    public final android.view.View l(android.view.ViewGroup viewGroup) {
        java.lang.Integer numValueOf;
        java.lang.String str;
        defpackage.amim amimVar;
        java.lang.String str2;
        defpackage.amim amimVar2;
        defpackage.amim amimVar3;
        java.lang.String str3;
        defpackage.amim amimVar4;
        defpackage.amim amimVar5;
        defpackage.amim amimVar6;
        defpackage.amim amimVar7;
        defpackage.amim amimVar8;
        defpackage.amim amimVar9;
        defpackage.amip amipVar;
        defpackage.afkx afkxVar = this.b;
        this.e = afkxVar.getActivity();
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(this.e, 2132084154);
        this.d = contextThemeWrapper;
        int i = 0;
        contextThemeWrapper.getTheme().applyStyle(2132085218, false);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.d.getSystemService("layout_inflater");
        android.os.Bundle arguments = afkxVar.getArguments();
        this.k = arguments.getString("TriggerId");
        this.s = arguments.getInt("RequestCode", -1);
        this.c = (com.google.android.libraries.surveys.internal.model.Answer) arguments.getParcelable("Answer");
        this.v = arguments.getString("SurveyActivityClassName");
        this.u = (defpackage.afiz) dpe.s(arguments, "SurveyCompletionCode", defpackage.afiz.class);
        defpackage.afja afjaVar = (defpackage.afja) dpe.s(arguments, "SurveyPromptCode", defpackage.afja.class);
        this.w = arguments.getBoolean("keepNextButtonForLastQuestion");
        this.x = arguments.getBoolean("isCarDisplayFullyReachable");
        this.y = arguments.getBoolean("isCarDisplayRightOfUser");
        aehj aehjVar = afjy.c;
        java.lang.String str4 = null;
        if (afjy.b(ankz.c(afjy.b))) {
            this.f = null;
            byte[] byteArray = arguments.getByteArray("SurveyPayload");
            if (byteArray != null) {
                this.f = afjz.c(defpackage.amip.a, byteArray);
            }
            this.h = null;
            byte[] byteArray2 = arguments.getByteArray("SurveySession");
            if (byteArray2 != null) {
                this.h = afjz.c(amje.a, byteArray2);
            }
            if (this.k == null || (amipVar = this.f) == null || amipVar.g.size() == 0 || this.c == null || this.h == null) {
                android.util.Log.e("SurveyPromptDialogDel", "Required EXTRAS not found in the intent, bailing out.");
                return null;
            }
        } else {
            this.f = afjz.c(defpackage.amip.a, arguments.getByteArray("SurveyPayload"));
            this.h = afjz.c(amje.a, arguments.getByteArray("SurveySession"));
        }
        defpackage.amip amipVar2 = this.f;
        int i2 = arguments.getInt("LogoResId");
        amhz amhzVar = amipVar2.e;
        if (amhzVar == null) {
            amhzVar = amhz.b;
        }
        int iW = a.W(amhzVar.e);
        if (iW == 0) {
            iW = 1;
        }
        int i3 = iW - 2;
        if (i3 == 2) {
            numValueOf = 2131231264;
        } else if (i3 != 3) {
            numValueOf = null;
        } else {
            if (i2 == 0) {
                i2 = 2131231264;
            }
            numValueOf = java.lang.Integer.valueOf(i2);
        }
        this.t = numValueOf;
        defpackage.amip amipVar3 = this.f;
        java.util.HashMap map = new java.util.HashMap();
        for (defpackage.amiv amivVar : amipVar3.g) {
            if ((amivVar.b & 1) != 0) {
                defpackage.amiu amiuVar = amivVar.k;
                if (amiuVar == null) {
                    amiuVar = defpackage.amiu.a;
                }
                if (!map.containsKey(amiuVar.c)) {
                    defpackage.amiu amiuVar2 = amivVar.k;
                    if (amiuVar2 == null) {
                        amiuVar2 = defpackage.amiu.a;
                    }
                    map.put(amiuVar2.c, java.lang.Integer.valueOf(amivVar.e - 1));
                }
            }
        }
        a = aigf.i(map);
        if (afkxVar.getShowsDialog()) {
            afkxVar.getDialog().requestWindowFeature(1);
        }
        android.content.Context context = this.d;
        java.lang.String str5 = this.k;
        amje amjeVar = this.h;
        boolean zL = afjz.l(this.f);
        com.google.android.libraries.surveys.internal.model.Answer answer = this.c;
        answer.g = 2;
        new defpackage.wyw(context, str5, amjeVar).h(answer, zL);
        android.view.View viewInflate = layoutInflater.inflate(2131624639, viewGroup, false);
        this.p = viewInflate;
        com.google.android.material.card.MaterialCardView materialCardView = (com.google.android.material.card.MaterialCardView) viewInflate.findViewById(2131429178);
        android.view.ViewGroup.LayoutParams layoutParams = materialCardView.getLayoutParams();
        layoutParams.width = defpackage.afjs.a(materialCardView.getContext());
        materialCardView.setLayoutParams(layoutParams);
        androidx.core.widget.NestedScrollView nestedScrollViewFindViewById = this.p.findViewById(2131429179);
        if (defpackage.afjs.d(nestedScrollViewFindViewById.getContext())) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) nestedScrollViewFindViewById.getLayoutParams();
            layoutParams2.gravity = true != this.y ? 85 : 83;
            nestedScrollViewFindViewById.setLayoutParams(layoutParams2);
        }
        this.q = (android.view.ViewGroup) this.p.findViewById(2131429174);
        defpackage.afjs.c((android.widget.ImageView) this.p.findViewById(2131429175), this.t);
        com.google.android.libraries.surveys.internal.model.Answer answer2 = this.c;
        java.lang.String str6 = (answer2 == null || android.text.TextUtils.isEmpty(answer2.b)) ? null : this.c.b;
        aehj aehjVar2 = afjy.c;
        if (afjy.c(defpackage.anlf.c(afjy.b)) && afjaVar == defpackage.afja.a) {
            h();
            return this.p;
        }
        if (afjy.d()) {
            afjj afjjVarA = a();
            if (afjjVarA != null) {
                aehj.b.q(afjjVarA);
            }
        } else {
            aehj.b.p();
        }
        defpackage.amil amilVar = this.f.c;
        if (amilVar == null) {
            amilVar = defpackage.amil.a;
        }
        if (!amilVar.b) {
            this.j = true;
            defpackage.amiv amivVar2 = (defpackage.amiv) this.f.g.get(0);
            q(this.p, amivVar2.g.isEmpty() ? amivVar2.f : amivVar2.g);
            int iAb = a.ab(amivVar2.i);
            if (iAb == 0) {
                iAb = 1;
            }
            int i4 = iAb - 2;
            if (i4 == 1) {
                com.google.android.libraries.surveys.internal.model.QuestionMetrics questionMetrics = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
                this.g = questionMetrics;
                questionMetrics.b();
                final defpackage.amiv amivVar3 = (defpackage.amiv) this.f.g.get(0);
                defpackage.aflq aflqVar = new defpackage.aflq(this.d);
                aflqVar.a = new defpackage.aflp() { // from class: afkt
                    @Override // defpackage.aflp
                    public final void a(aogw aogwVar) {
                        defpackage.afky afkyVar = this.a;
                        afkyVar.n = aogwVar;
                        afjj afjjVarA2 = afkyVar.a();
                        if (afjjVarA2 != null) {
                            defpackage.aprf.w(aehj.b, afjjVarA2);
                        }
                        if (aogwVar.a == 4) {
                            afkyVar.f(true);
                        } else {
                            afkyVar.g(amivVar3);
                        }
                    }
                };
                aflqVar.a(amivVar3.c == 4 ? (defpackage.amjf) amivVar3.d : defpackage.amjf.a);
                this.q.addView(aflqVar);
                n();
                m(new defpackage.wgf(this, amivVar3, 10), str6);
                android.widget.ImageButton imageButton = (android.widget.ImageButton) this.p.findViewById(2131429155);
                imageButton.setImageDrawable(aehj.K(this.d));
                str = str6;
                imageButton.setOnClickListener(new knj(this, aflqVar, str, 9, (char[]) null));
            } else if (i4 == 2) {
                com.google.android.libraries.surveys.internal.model.QuestionMetrics questionMetrics2 = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
                this.g = questionMetrics2;
                questionMetrics2.b();
                defpackage.amiv amivVar4 = (defpackage.amiv) this.f.g.get(0);
                defpackage.afkk afkkVar = new defpackage.afkk(this.d);
                afkkVar.c = new defpackage.afkv(this, i);
                afkkVar.a(amivVar4.c == 5 ? (defpackage.amin) amivVar4.d : defpackage.amin.a, null);
                this.q.addView(afkkVar);
                n();
                m(new defpackage.wgf(this, amivVar4, 13), str6);
                android.widget.ImageButton imageButton2 = (android.widget.ImageButton) this.p.findViewById(2131429155);
                imageButton2.setImageDrawable(aehj.K(this.d));
                imageButton2.setOnClickListener(new knj(this, afkkVar, str6, 12));
            } else if (i4 == 3) {
                com.google.android.libraries.surveys.internal.model.QuestionMetrics questionMetrics3 = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
                this.g = questionMetrics3;
                questionMetrics3.b();
                final defpackage.amiv amivVar5 = (defpackage.amiv) this.f.g.get(0);
                defpackage.aflh aflhVar = new defpackage.aflh(this.d);
                aflhVar.e(amivVar5.c == 6 ? (defpackage.amix) amivVar5.d : defpackage.amix.a);
                aflhVar.a = new defpackage.aflg() { // from class: afks
                    @Override // defpackage.aflg
                    public final void a(int i5) {
                        defpackage.afky afkyVar = this.a;
                        if (afkyVar.b.getActivity() != null) {
                            afjj afjjVarA2 = afkyVar.a();
                            if (afjjVarA2 != null) {
                                defpackage.aprf.w(aehj.b, afjjVarA2);
                            }
                            defpackage.amiv amivVar6 = amivVar5;
                            akzx akzxVarM = amig.a.m();
                            java.lang.String string = java.lang.Integer.toString(i5);
                            if (afkyVar.g.c()) {
                                akzx akzxVarM2 = defpackage.amie.a.m();
                                akzxVarM2.u();
                                ((defpackage.amie) akzxVarM2.b).c = i5;
                                akzxVarM2.u();
                                defpackage.amie amieVar = (defpackage.amie) akzxVarM2.b;
                                j$.util.Objects.requireNonNull(string);
                                amieVar.d = string;
                                akzxVarM2.u();
                                ((defpackage.amie) akzxVarM2.b).b = a.Q(3);
                                defpackage.amie amieVar2 = (defpackage.amie) akzxVarM2.p();
                                akzx akzxVarM3 = amid.a.m();
                                akzxVarM3.u();
                                amid amidVar = akzxVarM3.b;
                                j$.util.Objects.requireNonNull(amieVar2);
                                amidVar.c = amieVar2;
                                amidVar.b |= 1;
                                amid amidVarP = akzxVarM3.p();
                                int i6 = amivVar6.e;
                                akzxVarM.u();
                                akzxVarM.b.d = i6;
                                akzxVarM.u();
                                amig amigVar = akzxVarM.b;
                                j$.util.Objects.requireNonNull(amidVarP);
                                amigVar.c = amidVarP;
                                amigVar.b = 4;
                                if (string != null) {
                                    long j = afjz.a;
                                }
                            }
                            amig amigVarP = akzxVarM.p();
                            if (amigVarP != null) {
                                afkyVar.c.a = amigVarP;
                            }
                            afkyVar.b(amivVar6);
                            aehj aehjVar3 = afjy.c;
                            if (!afjy.c(anke.d(afjy.b))) {
                                afkyVar.m = 1;
                            } else if (afkyVar.m <= 1) {
                                int iF = new xm((char[]) null, (byte[]) null).f(defpackage.afky.a, afkyVar.f.g.size(), i5, amivVar6);
                                if (iF == -1) {
                                    afkyVar.m = 1;
                                } else {
                                    int i7 = iF - 1;
                                    if (i7 == afkyVar.f.g.size()) {
                                        iF = i7;
                                    }
                                    afkyVar.m = iF;
                                }
                            }
                            afkyVar.c();
                        }
                    }
                };
                this.q.addView(aflhVar);
                n();
                this.q.findViewById(2131429166).setVisibility(8);
                android.widget.ImageButton imageButton3 = (android.widget.ImageButton) this.p.findViewById(2131429155);
                imageButton3.setImageDrawable(aehj.K(this.d));
                str = str6;
                imageButton3.setOnClickListener(new knj(this, aflhVar, str, 10, (char[]) null));
            } else if (i4 != 4) {
                android.util.Log.e("SurveyPromptDialogDel", "Error, unknown question type encountered.");
            } else {
                com.google.android.libraries.surveys.internal.model.QuestionMetrics questionMetrics4 = new com.google.android.libraries.surveys.internal.model.QuestionMetrics();
                this.g = questionMetrics4;
                questionMetrics4.b();
                defpackage.amiv amivVar6 = (defpackage.amiv) this.f.g.get(0);
                defpackage.afkq afkqVar = new defpackage.afkq(this.d);
                afkqVar.a(amivVar6.c == 7 ? (defpackage.amio) amivVar6.d : defpackage.amio.a);
                afkqVar.a = new defpackage.afku(this, 0);
                this.q.addView(afkqVar);
                n();
                f(true);
                m(new defpackage.wgf(this, amivVar6, 11), str6);
                android.widget.ImageButton imageButton4 = (android.widget.ImageButton) this.p.findViewById(2131429155);
                imageButton4.setImageDrawable(aehj.K(this.d));
                imageButton4.setOnClickListener(new defpackage.wgf(this, str6, 12));
            }
            defpackage.aflu afluVar = new defpackage.aflu(this, str, 1);
            amimVar = this.f.i;
            if (amimVar == null) {
                amimVar = defpackage.amim.a;
            }
            if ((amimVar.b & 1) == 0) {
                str2 = null;
            } else {
                amimVar8 = this.f.i;
                if (amimVar8 == null) {
                    amimVar8 = defpackage.amim.a;
                }
                if (amimVar8.c.length() > 0) {
                    amimVar9 = this.f.i;
                    if (amimVar9 == null) {
                        amimVar9 = defpackage.amim.a;
                    }
                    str2 = amimVar9.c;
                } else {
                    str2 = null;
                }
            }
            amimVar2 = this.f.i;
            if (amimVar2 == null) {
                amimVar3 = defpackage.amim.a;
            } else {
                amimVar3 = amimVar2;
            }
            if ((amimVar3.b & 2) == 0) {
                str3 = null;
            } else {
                if (amimVar2 == null) {
                    amimVar2 = defpackage.amim.a;
                }
                if (amimVar2.d.length() > 0) {
                    amimVar7 = this.f.i;
                    if (amimVar7 == null) {
                        amimVar7 = defpackage.amim.a;
                    }
                    str3 = amimVar7.d;
                } else {
                    str3 = null;
                }
            }
            amimVar4 = this.f.i;
            if (amimVar4 == null) {
                amimVar5 = defpackage.amim.a;
            } else {
                amimVar5 = amimVar4;
            }
            if ((amimVar5.b & 4) != 0) {
                if (amimVar4 == null) {
                    amimVar4 = defpackage.amim.a;
                }
                if (amimVar4.e.length() > 0) {
                    amimVar6 = this.f.i;
                    if (amimVar6 == null) {
                        amimVar6 = defpackage.amim.a;
                    }
                    str4 = amimVar6.e;
                }
            }
            aehj.H(afkxVar.getActivity(), (android.widget.TextView) this.p.findViewById(2131429161), str, str2, str3, str4, afluVar);
            this.p.setOnKeyListener(new afkw(this, 0));
            this.p.setOnTouchListener(new defpackage.afmg(1));
            return this.p;
        }
        this.j = false;
        android.view.View view = this.p;
        defpackage.amil amilVar2 = this.f.c;
        if (amilVar2 == null) {
            amilVar2 = defpackage.amil.a;
        }
        q(view, amilVar2.c);
        defpackage.afkf afkfVar = new defpackage.afkf(this.d);
        this.i = afkfVar;
        afkfVar.a.setOnClickListener(new defpackage.wtm(this, 17));
        this.i.b.setOnClickListener(new defpackage.wtm(this, 18));
        this.q.addView(this.i);
        android.widget.ImageButton imageButton5 = (android.widget.ImageButton) this.p.findViewById(2131429155);
        imageButton5.setImageDrawable(aehj.K(this.d));
        imageButton5.setOnClickListener(new defpackage.wgf(this, str6, 9));
        str = str6;
        defpackage.aflu afluVar2 = new defpackage.aflu(this, str, 1);
        amimVar = this.f.i;
        if (amimVar == null) {
            amimVar = defpackage.amim.a;
        }
        if ((amimVar.b & 1) == 0) {
            str2 = null;
        } else {
            amimVar8 = this.f.i;
            if (amimVar8 == null) {
                amimVar8 = defpackage.amim.a;
            }
            if (amimVar8.c.length() > 0) {
                amimVar9 = this.f.i;
                if (amimVar9 == null) {
                    amimVar9 = defpackage.amim.a;
                }
                str2 = amimVar9.c;
            } else {
                str2 = null;
            }
        }
        amimVar2 = this.f.i;
        if (amimVar2 == null) {
            amimVar3 = defpackage.amim.a;
        } else {
            amimVar3 = amimVar2;
        }
        if ((amimVar3.b & 2) == 0) {
            str3 = null;
        } else {
            if (amimVar2 == null) {
                amimVar2 = defpackage.amim.a;
            }
            if (amimVar2.d.length() > 0) {
                amimVar7 = this.f.i;
                if (amimVar7 == null) {
                    amimVar7 = defpackage.amim.a;
                }
                str3 = amimVar7.d;
            } else {
                str3 = null;
            }
        }
        amimVar4 = this.f.i;
        if (amimVar4 == null) {
            amimVar5 = defpackage.amim.a;
        } else {
            amimVar5 = amimVar4;
        }
        if ((amimVar5.b & 4) != 0) {
            if (amimVar4 == null) {
                amimVar4 = defpackage.amim.a;
            }
            if (amimVar4.e.length() > 0) {
                amimVar6 = this.f.i;
                if (amimVar6 == null) {
                    amimVar6 = defpackage.amim.a;
                }
                str4 = amimVar6.e;
            }
        }
        aehj.H(afkxVar.getActivity(), (android.widget.TextView) this.p.findViewById(2131429161), str, str2, str3, str4, afluVar2);
        this.p.setOnKeyListener(new afkw(this, 0));
        this.p.setOnTouchListener(new defpackage.afmg(1));
        return this.p;
    }
}
