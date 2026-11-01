package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pbn implements odm {
    final /* synthetic */ defpackage.pbp a;

    public pbn(defpackage.pbp pbpVar) {
        this.a = pbpVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final /* synthetic */ void a(java.lang.Object obj) throws aois {
        java.util.List listBZ;
        defpackage.oue oueVar;
        defpackage.pac pacVar;
        j$.util.Optional optional;
        aify aifyVar;
        defpackage.pac pacVar2 = (defpackage.pac) aooh.q((j$.util.Optional) obj);
        defpackage.pbp pbpVar = this.a;
        if (pbpVar.b() == null && pacVar2 != null) {
            pbpVar.j.n(rmw.kr);
            defpackage.wjc wjcVarN = pbpVar.n(pacVar2);
            if (wjcVarN != null) {
                ((java.util.concurrent.atomic.AtomicBoolean) wjcVarN.a).set(true);
            }
        }
        pbpVar.w.b(pacVar2);
        if (pacVar2 == null || (aifyVar = pacVar2.a) == null || (listBZ = ajsz.bZ(aifyVar)) == null) {
            listBZ = aokc.a;
        }
        defpackage.oxm oxmVar = pbpVar.i;
        az azVar = pbpVar.b;
        aooh.f(azVar, "activity");
        int iA = oxmVar.a(azVar, null, false);
        if (iA == 3 || iA == 4) {
            java.util.List arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : listBZ) {
                if (((defpackage.oui) obj2).a != defpackage.ouj.ANSWER_AS_RTT) {
                    arrayList.add(obj2);
                }
            }
            listBZ = arrayList;
        }
        aoin aoinVar = pbpVar.v;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue() && pbpVar.k.a(pbpVar.c.A())) {
            java.util.List arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : listBZ) {
                if (((defpackage.oui) obj3).a == defpackage.ouj.REPLY_WITH_SMS) {
                    arrayList2.add(obj3);
                }
            }
            listBZ = arrayList2;
        }
        aimz aimzVar = defpackage.pbp.a;
        aimzVar.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "filterAnswerAsRttChipBasedOnScreenConfiguration", 424, "AnswerFragmentPeer.kt").w("updating %d chips", pbpVar.e().size());
        pbpVar.x.b(listBZ);
        defpackage.pbj pbjVar = pbpVar.c;
        androidx.compose.ui.platform.ComposeView composeViewFindViewById = pbjVar.N().findViewById(2131427758);
        int i = 8;
        if (composeViewFindViewById != null) {
            if (((java.lang.Boolean) aoinVar.a()).booleanValue() || !pbpVar.k.a(pbjVar.A())) {
                composeViewFindViewById.setVisibility(true != pbpVar.e().isEmpty() ? 0 : 8);
            } else {
                composeViewFindViewById.setVisibility(8);
            }
        }
        if (pacVar2 != null) {
            j$.util.Optional optional2 = pacVar2.c;
            if (optional2 != null) {
                oueVar = (defpackage.oue) aooh.q(optional2);
                pacVar = pacVar2;
            } else {
                pacVar = pacVar2;
                oueVar = null;
            }
        } else {
            oueVar = null;
            pacVar = null;
        }
        if (pbpVar.y != oueVar) {
            pbpVar.y = oueVar;
            if (oueVar == null) {
                aw awVarD = pbjVar.I().d(2131428379);
                if (awVarD != null) {
                    u uVar = new u(pbjVar.I());
                    uVar.k(awVarD);
                    uVar.c();
                }
            } else {
                defpackage.wjc wjcVarN2 = pbpVar.n(pacVar);
                if (wjcVarN2 != null) {
                    u uVar2 = new u(pbjVar.I());
                    aoin aoinVar2 = (aoin) wjcVarN2.b.get(oueVar);
                    if (aoinVar2 == null) {
                        throw new java.lang.IllegalStateException(java.lang.String.format("AnswerCenterFragmentProvider for %s not injected to CallScopeComponent", oueVar.name()));
                    }
                    uVar2.q(2131428379, ((defpackage.ouf) aoinVar2.a()).a(), (java.lang.String) null);
                    uVar2.c();
                }
            }
        }
        defpackage.our ourVar = (pacVar2 == null || (optional = pacVar2.d) == null) ? null : (defpackage.our) aooh.q(optional);
        if (!aooh.n(pbpVar.z, ourVar)) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) pbjVar.N().findViewById(2131428388);
            if (frameLayout == null) {
                throw new java.lang.IllegalStateException();
            }
            pbpVar.z = ourVar;
            if (ourVar == null) {
                frameLayout.setVisibility(8);
            } else {
                frameLayout.setVisibility(0);
                int i2 = ourVar.d;
                if (i2 == 0) {
                    throw new java.lang.IllegalStateException("Label type is unknown when it should be either legal or warning.");
                }
                if (i2 - 1 == 1) {
                    frameLayout.removeAllViewsInLayout();
                    defpackage.ouq ouqVar = ourVar.c;
                    j$.util.Objects.checkIndex(0, 4);
                    if (ouqVar != null) {
                        if (ouqVar instanceof defpackage.oun) {
                            int i3 = ourVar.b;
                            android.view.View viewInflate = pbjVar.K().inflate(2131623982, (android.view.ViewGroup) frameLayout, false);
                            frameLayout.addView(viewInflate, 0);
                            android.widget.TextView textView = (android.widget.TextView) pbjVar.N().findViewById(2131428451);
                            if (textView == null) {
                                throw new java.lang.IllegalStateException();
                            }
                            textView.setText(pbjVar.Y(i3));
                            aooh.c(viewInflate);
                            pbpVar.j(viewInflate, new defpackage.pbo(viewInflate));
                        } else if (ouqVar instanceof defpackage.ouo) {
                            pbpVar.l(ourVar.b, (defpackage.ouo) ouqVar, frameLayout);
                        } else if (ouqVar instanceof defpackage.oup) {
                            pbpVar.l(ourVar.b, null, frameLayout);
                        }
                    }
                    throw new aois();
                }
                frameLayout.removeAllViewsInLayout();
                frameLayout.addView(pbjVar.K().inflate(2131623983, (android.view.ViewGroup) frameLayout, false), 0);
                android.widget.TextView textView2 = (android.widget.TextView) pbjVar.N().findViewById(2131427473);
                if (textView2 == null) {
                    throw new java.lang.IllegalStateException();
                }
                textView2.setText(ourVar.b);
                defpackage.ouq ouqVar2 = ourVar.c;
                if (ouqVar2 instanceof defpackage.ouo) {
                    defpackage.ouo ouoVar = (defpackage.ouo) ouqVar2;
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(ouoVar.a, 0, 0, 0);
                    java.lang.Integer num = ouoVar.b;
                    if (num != null) {
                        textView2.setCompoundDrawableTintList(android.content.res.ColorStateList.valueOf(pbjVar.A().getColor(num.intValue())));
                    }
                }
            }
        }
        pbpVar.k(pacVar2);
        android.view.View viewFindViewById = pbjVar.N().findViewById(2131428749);
        aooh.e(viewFindViewById, "findViewById(...)");
        if (pacVar2 != null && pacVar2.g) {
            i = 0;
        }
        aimzVar.b().l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "updateBlackOverlay", 907, "AnswerFragmentPeer.kt").w("Updating black overlay visibility state to %d", i);
        viewFindViewById.setVisibility(i);
        if (pacVar2 != null && pacVar2.i && !pbpVar.I.m()) {
            com.android.dialer.calllocation.ui.LocationView locationViewFindViewById = pbjVar.N().findViewById(2131428402);
            if (locationViewFindViewById != null) {
                jxs jxsVar = pacVar2.h;
                jxw jxwVarA = locationViewFindViewById.a();
                aooh.e(jxsVar, "locationModel(...)");
                jxwVarA.b(jxsVar);
                locationViewFindViewById.setVisibility(0);
            } else {
                android.view.ViewStub viewStub = (android.view.ViewStub) pbjVar.N().findViewById(2131428483);
                if (viewStub == null) {
                    aimzVar.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/incall/answer/ui/AnswerFragmentPeer", "updateMap", 665, "AnswerFragmentPeer.kt").v("Secondary small screen detected");
                } else {
                    viewStub.inflate();
                    locationViewFindViewById = (com.android.dialer.calllocation.ui.LocationView) pbjVar.N().findViewById(2131428402);
                    if (locationViewFindViewById == null) {
                        throw new java.lang.IllegalStateException();
                    }
                    jxs jxsVar2 = pacVar2.h;
                    jxw jxwVarA2 = locationViewFindViewById.a();
                    aooh.e(jxsVar2, "locationModel(...)");
                    jxwVarA2.b(jxsVar2);
                    locationViewFindViewById.setVisibility(0);
                }
            }
        }
        if (pbpVar.k.a(pbjVar.A())) {
            pbpVar.e.b(false, null, pacVar2 != null ? java.lang.Boolean.valueOf(pacVar2.j) : null);
        }
    }

    public final void b(java.lang.Throwable th) {
        this.a.c().a(mcd.aj);
    }
}
