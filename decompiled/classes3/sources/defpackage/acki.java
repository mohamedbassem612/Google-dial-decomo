package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class acki implements java.lang.Runnable {
    public final /* synthetic */ oge a;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        android.view.View view;
        int i3;
        int i4;
        android.view.View viewInflate;
        boolean z;
        ahyn ahynVarH;
        defpackage.ackr ackrVar;
        java.lang.Object obj = this.a.b;
        aw awVar = (aw) obj;
        android.os.Bundle bundle = awVar.m;
        bundle.setClassLoader(com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext.class.getClassLoader());
        defpackage.ackk ackkVar = (defpackage.ackk) obj;
        ackkVar.al = (com.google.android.libraries.internal.growth.growthkit.internal.common.PromoContext) bundle.getParcelable("promo_context");
        defpackage.akkc akkcVar = defpackage.akkc.UNSPECIFIED;
        ackkVar.am = defpackage.akkc.b(bundle.getInt("theme", akkcVar.d));
        akjx akjxVar = ackkVar.al.c().h;
        if (akjxVar == null) {
            akjxVar = akjx.a;
        }
        defpackage.akkh akkhVar = akjxVar.c == 5 ? (defpackage.akkh) akjxVar.d : defpackage.akkh.a;
        android.view.View viewJ = ackkVar.aq.J(awVar.G(), akkhVar);
        if (!defpackage.ackm.c(viewJ)) {
            ackkVar.ap.u(ackkVar.al, defpackage.acir.i);
            ackkVar.b();
            return;
        }
        int iAQ = a.aQ(akjxVar.h);
        boolean z2 = iAQ != 0 && iAQ == 3 && afsg.a();
        android.content.Context contextZ = awVar.z();
        int iAQ2 = a.aQ(akjxVar.h);
        if (iAQ2 == 0) {
            iAQ2 = 1;
        }
        defpackage.akkc akkcVar2 = ackkVar.am;
        aooh.f(contextZ, "context");
        aooh.f(akkcVar2, "theme");
        defpackage.aciy aciyVarN = defpackage.abxl.n(contextZ, akkcVar2, iAQ2 == 3 && afsg.a());
        defpackage.ackn acknVar = new defpackage.ackn();
        acknVar.c(false);
        if (viewJ == null) {
            throw new java.lang.NullPointerException("Null targetView");
        }
        acknVar.a = viewJ;
        acknVar.c = akkhVar.g;
        acknVar.c(akkhVar.i);
        acknVar.e = akkhVar.i ? ackkVar.ao.t(akkhVar.h) : akkhVar.h;
        defpackage.akkg akkgVarB = defpackage.akkg.b(akkhVar.l);
        if (akkgVarB == null) {
            akkgVarB = defpackage.akkg.UNKNOWN;
        }
        acknVar.q = akkgVarB.ordinal() != 1 ? 2 : 1;
        acknVar.n = 0.95f;
        acknVar.o = (byte) (acknVar.o | 2);
        acknVar.p = 2;
        defpackage.akkc akkcVar3 = ackkVar.am;
        if (akkcVar3 == akkcVar) {
            if ((akkhVar.b & 1) != 0) {
                defpackage.amml ammlVar = akkhVar.e;
                if (ammlVar == null) {
                    ammlVar = defpackage.amml.a;
                }
                acknVar.b(java.lang.Integer.valueOf(aesg.m(ammlVar)));
            }
            if ((akkhVar.b & 2) != 0) {
                defpackage.amml ammlVar2 = akkhVar.f;
                if (ammlVar2 == null) {
                    ammlVar2 = defpackage.amml.a;
                }
                acknVar.d(java.lang.Integer.valueOf(aesg.m(ammlVar2)));
            }
        } else if (!z2 || aciyVarN == null) {
            akkd akkdVar = (akkd) defpackage.acjh.a(akkcVar3, akkhVar.j).d();
            if (akkdVar == null) {
                ackkVar.a();
                return;
            }
            akiv akivVar = akkdVar.d;
            if (akivVar == null) {
                akivVar = akiv.a;
            }
            defpackage.amml ammlVar3 = akivVar.c;
            if (ammlVar3 == null) {
                ammlVar3 = defpackage.amml.a;
            }
            acknVar.e(java.lang.Integer.valueOf(aesg.m(ammlVar3)));
            defpackage.amml ammlVar4 = akivVar.d;
            if (ammlVar4 == null) {
                ammlVar4 = defpackage.amml.a;
            }
            acknVar.d(java.lang.Integer.valueOf(aesg.m(ammlVar4)));
            defpackage.amml ammlVar5 = akivVar.e;
            if (ammlVar5 == null) {
                ammlVar5 = defpackage.amml.a;
            }
            acknVar.b(java.lang.Integer.valueOf(aesg.m(ammlVar5)));
        } else {
            if (akkcVar3 == defpackage.akkc.DARK) {
                i = aciyVarN.b;
                i2 = aciyVarN.a;
            } else {
                i = aciyVarN.f;
                i2 = aciyVarN.g;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            acknVar.e(numValueOf);
            acknVar.d(numValueOf);
            acknVar.b(java.lang.Integer.valueOf(i2));
        }
        if ((akkhVar.b & 32) != 0) {
            defpackage.akkc akkcVar4 = ackkVar.am;
            if (akkcVar4 == akkcVar) {
                akjc akjcVar = akkhVar.k;
                if (akjcVar == null) {
                    akjcVar = akjc.a;
                }
                if ((akjcVar.b & 4) != 0) {
                    akjc akjcVar2 = akkhVar.k;
                    if (akjcVar2 == null) {
                        akjcVar2 = akjc.a;
                    }
                    defpackage.amml ammlVar6 = akjcVar2.g;
                    if (ammlVar6 == null) {
                        ammlVar6 = defpackage.amml.a;
                    }
                    acknVar.a(java.lang.Integer.valueOf(aesg.m(ammlVar6)));
                }
            } else if (!z2 || aciyVarN == null) {
                akjc akjcVar3 = akkhVar.k;
                if (akjcVar3 == null) {
                    akjcVar3 = akjc.a;
                }
                akkd akkdVar2 = (akkd) defpackage.acjh.a(akkcVar4, akjcVar3.h).d();
                if (akkdVar2 == null) {
                    ackkVar.a();
                    return;
                }
                akiv akivVar2 = akkdVar2.d;
                if (akivVar2 == null) {
                    akivVar2 = akiv.a;
                }
                defpackage.amml ammlVar7 = akivVar2.c;
                if (ammlVar7 == null) {
                    ammlVar7 = defpackage.amml.a;
                }
                acknVar.a(java.lang.Integer.valueOf(aesg.m(ammlVar7)));
            } else {
                acknVar.a(java.lang.Integer.valueOf(akkcVar4 == defpackage.akkc.DARK ? aciyVarN.b : aciyVarN.f));
            }
            akjc akjcVar4 = akkhVar.k;
            if (akjcVar4 == null) {
                akjcVar4 = akjc.a;
            }
            acknVar.i = akjcVar4.f;
            acknVar.k = new defpackage.wgf(obj, akkhVar, 4);
        }
        acknVar.l = new defpackage.ahpq(ackkVar.b.a, (android.widget.PopupWindow.OnDismissListener) new kd(obj, 5, (byte[]) null), 0);
        acknVar.m = new defpackage.wtm(obj, 9);
        acknVar.d = new defpackage.wtm(obj, 10);
        if (acknVar.o != 3 || (view = acknVar.a) == null || (i3 = acknVar.p) == 0 || (i4 = acknVar.q) == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (acknVar.a == null) {
                sb.append(" targetView");
            }
            if ((acknVar.o & 1) == 0) {
                sb.append(" isHtmlBodyText");
            }
            if (acknVar.p == 0) {
                sb.append(" tapDismissalType");
            }
            if (acknVar.q == 0) {
                sb.append(" placement");
            }
            if ((acknVar.o & 2) == 0) {
                sb.append(" maxWidthPercentage");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ackkVar.d = new defpackage.ackm(new defpackage.acko(view, acknVar.b, acknVar.c, acknVar.d, acknVar.e, acknVar.f, acknVar.g, acknVar.h, acknVar.i, acknVar.j, acknVar.k, acknVar.l, acknVar.m, i3, i4, acknVar.n));
        defpackage.ackm ackmVar = ackkVar.d;
        android.view.View view2 = ackmVar.a.a;
        ackmVar.c = view2.getRootView();
        pc pcVar = new pc(ackmVar.a.a.getContext(), 2132084741);
        if (!android.text.TextUtils.isEmpty(ackmVar.a.c) && !android.text.TextUtils.isEmpty(ackmVar.a.e) && !android.text.TextUtils.isEmpty(ackmVar.a.i)) {
            viewInflate = android.view.View.inflate(pcVar, 2131624666, null);
        } else if (!android.text.TextUtils.isEmpty(ackmVar.a.c) && !android.text.TextUtils.isEmpty(ackmVar.a.e) && android.text.TextUtils.isEmpty(ackmVar.a.i)) {
            viewInflate = android.view.View.inflate(pcVar, 2131624667, null);
        } else if (!android.text.TextUtils.isEmpty(ackmVar.a.c) && android.text.TextUtils.isEmpty(ackmVar.a.e) && android.text.TextUtils.isEmpty(ackmVar.a.i)) {
            viewInflate = android.view.View.inflate(pcVar, 2131624668, null);
        } else if (android.text.TextUtils.isEmpty(ackmVar.a.c) && !android.text.TextUtils.isEmpty(ackmVar.a.e) && android.text.TextUtils.isEmpty(ackmVar.a.i)) {
            viewInflate = android.view.View.inflate(pcVar, 2131624664, null);
        } else {
            viewInflate = (!android.text.TextUtils.isEmpty(ackmVar.a.c) || android.text.TextUtils.isEmpty(ackmVar.a.e) || android.text.TextUtils.isEmpty(ackmVar.a.i)) ? android.view.View.inflate(pcVar, 2131624666, null) : android.view.View.inflate(pcVar, 2131624663, null);
        }
        if (!android.text.TextUtils.isEmpty(ackmVar.a.c)) {
            android.widget.TextView textView = (android.widget.TextView) viewInflate.findViewById(2131429299);
            if (ackmVar.a.g.f()) {
                textView.setTextColor(((java.lang.Integer) ackmVar.a.g.b()).intValue());
            }
            if (ackmVar.a.h.f()) {
                textView.setTextColor(((java.lang.Integer) ackmVar.a.h.b()).intValue());
            }
            if (anfq.f()) {
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                android.util.DisplayMetrics displayMetrics = view2.getContext().getResources().getDisplayMetrics();
                int iL = aesg.l(displayMetrics, 12);
                int iL2 = aesg.l(displayMetrics, 6);
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMargins(iL, iL2, iL, iL2);
                textView.setLayoutParams(layoutParams);
            }
            aesg.o(textView, ackmVar.a.c);
        }
        if (!android.text.TextUtils.isEmpty(ackmVar.a.e)) {
            android.widget.TextView textView2 = (android.widget.TextView) viewInflate.findViewById(2131429298);
            if (ackmVar.a.g.f()) {
                textView2.setTextColor(((java.lang.Integer) ackmVar.a.g.b()).intValue());
                textView2.setLinkTextColor(((java.lang.Integer) ackmVar.a.g.b()).intValue());
            }
            if (anfq.f()) {
                android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                android.util.DisplayMetrics displayMetrics2 = view2.getContext().getResources().getDisplayMetrics();
                int iL3 = aesg.l(displayMetrics2, 12);
                int iL4 = aesg.l(displayMetrics2, 6);
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMargins(iL3, iL4, iL3, iL4);
                textView2.setLayoutParams(layoutParams2);
            }
            defpackage.acko ackoVar = ackmVar.a;
            java.lang.CharSequence charSequence = ackoVar.e;
            if (ackoVar.f) {
                textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            }
            aesg.o(textView2, charSequence);
        }
        ackmVar.d = new defpackage.alic(viewInflate, view2, ackmVar.a.p);
        if (ackmVar.a.b.f()) {
            ((defpackage.ackh) ackmVar.d.b).b(((java.lang.Integer) ackmVar.a.b.b()).intValue());
        }
        if (android.text.TextUtils.isEmpty(ackmVar.a.i)) {
            z = false;
        } else {
            android.widget.TextView textView3 = (android.widget.TextView) viewInflate.findViewById(2131429296);
            defpackage.alic alicVar = ackmVar.d;
            defpackage.acko ackoVar2 = ackmVar.a;
            java.lang.CharSequence charSequence2 = ackoVar2.i;
            ahyn ahynVar = ackoVar2.j;
            android.view.View.OnClickListener onClickListener = ackoVar2.k;
            if (android.text.TextUtils.isEmpty(charSequence2)) {
                textView3.setVisibility(8);
                z = false;
            } else {
                textView3.setText(charSequence2);
                if (ahynVar.f()) {
                    textView3.setTextColor(((java.lang.Integer) ahynVar.b()).intValue());
                }
                textView3.setOnClickListener(new knj(onClickListener, textView3, alicVar, 8, (char[]) null));
                android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_focused}}, new int[]{855638016});
                int i5 = dzs.a;
                textView3.setBackgroundTintList(colorStateList);
                z = true;
            }
        }
        defpackage.alic alicVar2 = ackmVar.d;
        defpackage.acko ackoVar3 = ackmVar.a;
        boolean z3 = ackoVar3.o == 2;
        defpackage.ackh ackhVar = (defpackage.ackh) alicVar2.b;
        ackhVar.d = z3;
        ackhVar.g = ackoVar3.n;
        if (ackhVar.isShown()) {
            ackhVar.requestLayout();
        }
        if (!z) {
            ((defpackage.ackh) ackmVar.d.b).setOnClickListener(new defpackage.wtm(ackmVar, 11));
        }
        defpackage.alic alicVar3 = ackmVar.d;
        android.widget.PopupWindow.OnDismissListener kdVar = new kd(ackmVar, 6, (byte[]) null);
        android.widget.PopupWindow popupWindow = ((defpackage.ackh) alicVar3.b).c;
        if (popupWindow != null) {
            popupWindow.setOnDismissListener(kdVar);
        }
        defpackage.alic alicVar4 = ackmVar.d;
        defpackage.wtm wtmVar = new defpackage.wtm(ackmVar, 12);
        defpackage.ackh ackhVar2 = (defpackage.ackh) alicVar4.b;
        ackhVar2.k = wtmVar;
        ackhVar2.j = ackmVar.a.d;
        if (anfq.c() && (ackrVar = ackmVar.b) != null) {
            ackrVar.b(null);
        }
        ackmVar.b = new defpackage.ackr(ackmVar.c);
        defpackage.ackr ackrVar2 = ackmVar.b;
        ackrVar2.b = ackmVar;
        ackrVar2.a = ackmVar;
        ackrVar2.b(view2);
        if (anfq.e()) {
            if (akkhVar.g.isEmpty()) {
                ahynVarH = !akkhVar.h.isEmpty() ? ahyn.h(akkhVar.h) : ahwt.a;
            } else {
                ahynVarH = ahyn.h(akkhVar.g);
            }
            if (ahynVarH.f()) {
                dzs.i(viewJ, new defpackage.ackj(ackkVar, ahynVarH));
            }
        }
        if (!ackkVar.an.booleanValue()) {
            ackkVar.ap.u(ackkVar.al, defpackage.acir.a);
            ackkVar.an = java.lang.Boolean.TRUE;
        }
        ackkVar.c = true;
    }
}
