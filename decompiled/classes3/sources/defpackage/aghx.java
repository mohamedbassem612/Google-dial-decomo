package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aghx implements aoxi {
    final /* synthetic */ defpackage.aghy a;

    public aghx(defpackage.aghy aghyVar) {
        this.a = aghyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, aoln aolnVar) {
        android.view.View viewA;
        android.widget.PopupWindow popupWindow;
        com.google.android.material.button.MaterialButton materialButton;
        com.google.android.setupdesign.view.RichTextView richTextView;
        com.google.android.setupdesign.view.RichTextView richTextView2;
        int color;
        defpackage.aghf aghfVar = (defpackage.aghf) obj;
        defpackage.aghy aghyVar = this.a;
        if (aghyVar.j) {
            if (aghyVar.d == null) {
                aghyVar.d = (android.widget.FrameLayout) aghyVar.a.g(2131429105);
                android.view.View viewB = aghyVar.b();
                if (viewB == null) {
                    defpackage.aghy.o.z("Indicator view is null after inflation attempt");
                } else {
                    aghyVar.e = (com.google.android.setupdesign.view.GradientCircularProgressIndicator) viewB.findViewById(2131429142);
                    aghyVar.f = (android.widget.ImageView) viewB.findViewById(2131429143);
                    aghyVar.g = (android.widget.FrameLayout) viewB;
                    android.widget.FrameLayout frameLayout = aghyVar.g;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener(new defpackage.afrh(aghyVar, 10));
                    }
                    defpackage.aghg aghgVar = aghyVar.i;
                    if (aghgVar != null && aghgVar.c) {
                        aghyVar.c();
                    }
                }
            }
            defpackage.aggc aggcVar = aghfVar.a;
            if (aggcVar == defpackage.aggc.a) {
                defpackage.aghy.o.B("ProgressUiType not set. Not updating progress UI.");
            } else if (aggcVar == defpackage.aggc.f) {
                android.widget.FrameLayout frameLayout2 = aghyVar.d;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(8);
                }
            } else {
                android.widget.FrameLayout frameLayout3 = aghyVar.d;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                com.google.android.setupdesign.view.GradientCircularProgressIndicator gradientCircularProgressIndicator = aghyVar.e;
                if (gradientCircularProgressIndicator != null) {
                    gradientCircularProgressIndicator.a(aghfVar.b);
                    gradientCircularProgressIndicator.c(aghfVar.c);
                    int iOrdinal = aggcVar.ordinal();
                    if (iOrdinal == 1) {
                        int color2 = gradientCircularProgressIndicator.getContext().getColor(2131102688);
                        gradientCircularProgressIndicator.b(new int[]{color2, color2});
                    } else if (iOrdinal == 2) {
                        gradientCircularProgressIndicator.b(new int[]{gradientCircularProgressIndicator.getContext().getColor(2131102688), gradientCircularProgressIndicator.getContext().getColor(2131102690), gradientCircularProgressIndicator.getContext().getColor(2131102689)});
                    } else if (iOrdinal == 3) {
                        gradientCircularProgressIndicator.b(new int[]{gradientCircularProgressIndicator.getContext().getColor(2131102697), gradientCircularProgressIndicator.getContext().getColor(2131102686)});
                    } else if (iOrdinal != 4) {
                        xtq xtqVar = defpackage.aghy.o;
                        java.util.Objects.toString(aggcVar);
                        xtqVar.z("Unsupported ProgressUiType: ".concat(java.lang.String.valueOf(aggcVar)));
                    } else {
                        int iD = defpackage.aghy.d(gradientCircularProgressIndicator);
                        gradientCircularProgressIndicator.b(new int[]{iD, iD});
                    }
                }
                android.widget.ImageView imageView = aghyVar.f;
                if (imageView != null) {
                    android.graphics.Bitmap bitmap = aghfVar.d;
                    imageView.setVisibility(bitmap != null ? 0 : 8);
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    int iOrdinal2 = aggcVar.ordinal();
                    if (iOrdinal2 == 1) {
                        color = imageView.getContext().getColor(2131102688);
                    } else if (iOrdinal2 == 2) {
                        color = imageView.getContext().getColor(2131102685);
                    } else if (iOrdinal2 != 3) {
                        color = iOrdinal2 != 4 ? 0 : defpackage.aghy.d(imageView);
                    } else {
                        color = imageView.getContext().getColor(2131102696);
                    }
                    if (color == 0) {
                        imageView.clearColorFilter();
                    } else {
                        imageView.setColorFilter(color, android.graphics.PorterDuff.Mode.SRC_IN);
                    }
                }
                java.lang.String str = aghfVar.f;
                android.widget.FrameLayout frameLayout4 = aghyVar.g;
                if (frameLayout4 != null) {
                    frameLayout4.setContentDescription((str == null || aoov.H(str)) ? aghyVar.b.getString(2132020306) : aghyVar.b.getString(2132020307, str));
                }
                try {
                    defpackage.aghg aghgVar2 = aghyVar.i;
                    if (((aghgVar2 != null && aghgVar2.b) || aghfVar.p) && (viewA = aghyVar.a()) != null) {
                        if (aghyVar.k == null) {
                            aghyVar.k = new defpackage.aggs(viewA, aghfVar.q, aghfVar.r, aghfVar.s, new defpackage.addr(aghyVar, 15));
                        }
                        defpackage.aggs aggsVar = aghyVar.k;
                        if (aggsVar != null && ((popupWindow = aggsVar.f) == null || !popupWindow.isShowing())) {
                            defpackage.aggs aggsVar2 = aghyVar.k;
                            if (aggsVar2 != null) {
                                android.view.View view = aggsVar2.a;
                                if (view.isAttachedToWindow()) {
                                    android.content.Context context = view.getContext();
                                    aggsVar2.f = new android.widget.PopupWindow(-1, -1);
                                    aooh.c(context);
                                    defpackage.agiu agiuVar = new defpackage.agiu(context);
                                    agiuVar.a = view;
                                    agiuVar.c = new defpackage.addr(aggsVar2, 11);
                                    java.lang.String str2 = aggsVar2.b;
                                    if (str2 != null && (richTextView2 = (com.google.android.setupdesign.view.RichTextView) agiuVar.findViewById(2131429250)) != null) {
                                        richTextView2.setText(str2);
                                    }
                                    java.lang.String str3 = aggsVar2.c;
                                    if (str3 != null && (richTextView = (com.google.android.setupdesign.view.RichTextView) agiuVar.findViewById(2131429251)) != null) {
                                        richTextView.setText(str3);
                                    }
                                    java.lang.String str4 = aggsVar2.d;
                                    if (str4 != null && (materialButton = (com.google.android.material.button.MaterialButton) agiuVar.findViewById(2131427632)) != null) {
                                        materialButton.setText(str4);
                                    }
                                    android.widget.PopupWindow popupWindow2 = aggsVar2.f;
                                    if (popupWindow2 != null) {
                                        popupWindow2.setContentView(agiuVar);
                                        popupWindow2.setFocusable(true);
                                        popupWindow2.setClippingEnabled(false);
                                        popupWindow2.setOnDismissListener(new kd(aggsVar2, 8, (byte[]) null));
                                    }
                                    aggsVar2.a();
                                    aggsVar2.g = new gk(aggsVar2, 6);
                                    view.addOnAttachStateChangeListener(aggsVar2.g);
                                    android.widget.PopupWindow popupWindow3 = aggsVar2.f;
                                    if (popupWindow3 != null) {
                                        popupWindow3.showAtLocation(view, 0, 0, 0);
                                    }
                                }
                            }
                            defpackage.aghg aghgVar3 = aghyVar.i;
                            if (aghgVar3 != null) {
                                aghgVar3.b = true;
                                aoov.an(eob.a(aghgVar3), (aolr) null, 0, new defpackage.adzb(aghgVar3, (aoln) null, 13, (byte[]) null), 3);
                            }
                        }
                    }
                } catch (java.lang.Exception e) {
                    defpackage.aghy.o.A("Failed to inflate tooltip. Hiding indicator.", e);
                    android.widget.FrameLayout frameLayout5 = aghyVar.d;
                    if (frameLayout5 != null) {
                        frameLayout5.setVisibility(8);
                    }
                }
            }
        } else {
            android.widget.FrameLayout frameLayout6 = aghyVar.d;
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(8);
            }
        }
        return aojh.a;
    }
}
