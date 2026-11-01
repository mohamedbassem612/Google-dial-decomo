package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxt extends kh {
    public static final aimz a = aimz.i("com/android/dialer/conversationhistorycalldetails/ConversationHistoryCallDetailsAdapter");
    public final defpackage.lyb e;
    public abwd f;
    public defpackage.lxq g;
    public kiu h;
    private final android.content.Context i;
    private final da j;
    private final java.lang.String k;
    private final defpackage.koo l;
    private final zjm m;
    private final ahbv n;
    private final rai o;

    public lxt(android.content.Context context, ahbv ahbvVar, aazc aazcVar, rai raiVar, zjm zjmVar, da daVar, defpackage.lyb lybVar, abwd abwdVar, java.lang.String str) {
        aooh.f(context, "appContext");
        aooh.f(aazcVar, "clock");
        aooh.f(raiVar, "conversationHistoryCallDetailsEntryViewHolderFactory");
        aooh.f(daVar, "activity");
        aooh.f(lybVar, "fragment");
        aooh.f(abwdVar, "photoInfo");
        aooh.f(str, "primaryText");
        this.i = context;
        this.n = ahbvVar;
        this.o = raiVar;
        this.m = zjmVar;
        this.j = daVar;
        this.e = lybVar;
        this.f = abwdVar;
        this.k = str;
        this.g = new defpackage.lxq(this, defpackage.hgt.E(defpackage.kiq.a.m()).p());
        this.l = new defpackage.koo(daVar);
    }

    private final void A(defpackage.lxq lxqVar, defpackage.lxq lxqVar2) {
        defpackage.ev.a(new defpackage.lxs(lxqVar, lxqVar2)).c(this);
    }

    public static final boolean z(defpackage.kip kipVar) {
        return defpackage.hgu.p(j$.time.Instant.now().toEpochMilli(), kipVar.d) == 0;
    }

    public final int a() {
        return this.g.a().size();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final int b(int i) throws aois {
        defpackage.lxr lxrVar = (defpackage.lxr) this.g.a().get(i);
        j$.util.Objects.checkIndex(0, 3);
        if (lxrVar != null) {
            if (lxrVar instanceof defpackage.lxp) {
                return 3;
            }
            if (lxrVar instanceof defpackage.lxo) {
                return 4;
            }
        }
        throw new aois();
    }

    public final ld d(android.view.ViewGroup viewGroup, int i) {
        if (i == 3) {
            return new defpackage.lyl(this.e.K().inflate(2131624114, viewGroup, false));
        }
        if (i != 4) {
            throw new java.lang.IllegalArgumentException(a.bj(i, "No ViewHolder available for viewType: "));
        }
        rai raiVar = this.o;
        defpackage.lyb lybVar = this.e;
        defpackage.koo kooVar = this.l;
        emy emyVar = ((ahfw) lybVar).a;
        android.view.View viewInflate = lybVar.K().inflate(2131624113, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        hir hirVar = (hir) raiVar.a;
        defpackage.him himVar = hirVar.a;
        return new defpackage.lya((aazc) himVar.l.a(), himVar.mZ(), (nwu) himVar.va.a(), new rze((sou) hirVar.b.b.vr.a()), (ahpz) himVar.bb.a(), this, emyVar, kooVar, viewInflate);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:154:0x051e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0523  */
    /* JADX WARN: Code duplicated, block: B:157:0x0526  */
    /* JADX WARN: Code duplicated, block: B:158:0x0528  */
    /* JADX WARN: Code duplicated, block: B:160:0x053d  */
    /* JADX WARN: Code duplicated, block: B:162:0x055b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0561  */
    /* JADX WARN: Code duplicated, block: B:165:0x0568  */
    /* JADX WARN: Code duplicated, block: B:173:0x0595  */
    /* JADX WARN: Code duplicated, block: B:174:0x059b  */
    /* JADX WARN: Instruction removed from duplicated block: B:160:0x053d, please report this as an issue */
    public final void m(ld ldVar, int i) {
        char c;
        java.lang.CharSequence charSequenceConcat;
        int i2;
        defpackage.kip kipVar;
        java.lang.String string;
        java.lang.String strReplace;
        defpackage.kip kipVar2;
        boolean z;
        java.lang.String string2;
        kgz kgzVar;
        kgu kguVarA;
        defpackage.lxy lxyVar;
        android.widget.TextView textView;
        sou souVar;
        sot sotVar;
        java.lang.String str;
        aooh.f(ldVar, "holder");
        int i3 = 0;
        j$.util.Objects.checkIndex(0, 3);
        if (ldVar != null) {
            if (ldVar instanceof defpackage.lyl) {
                java.lang.Object obj = this.g.a().get(i);
                aooh.d(obj, "null cannot be cast to non-null type com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsAdapter.HeaderRow");
                ((defpackage.lyl) ldVar).s.setText(this.i.getString(((defpackage.lxp) obj).a));
                return;
            }
            if (ldVar instanceof defpackage.lya) {
                java.lang.Object obj2 = this.g.a().get(i);
                aooh.d(obj2, "null cannot be cast to non-null type com.android.dialer.conversationhistorycalldetails.ConversationHistoryCallDetailsAdapter.CallDetailsRow");
                defpackage.lxo lxoVar = (defpackage.lxo) obj2;
                defpackage.kip kipVar3 = lxoVar.a;
                defpackage.lya lyaVar = (defpackage.lya) ldVar;
                long j = kipVar3.c;
                java.lang.String str2 = this.k;
                abwd abwdVar = lxoVar.c;
                aooh.f(abwdVar, "photoInfo");
                aooh.f(kipVar3, "callDetails");
                lyaVar.G = java.lang.Long.valueOf(j);
                zzx zzxVarNW = ((man) agab.aH(lyaVar.C(), man.class)).nW();
                char c2 = 5;
                java.util.List list = (java.util.List) j$.util.Collection.-EL.stream((aify) j$.util.Collection.-EL.stream(zzxVarNW.k().f()).sorted(j$.util.Comparator.-CC.comparingInt(new defpackage.fiy(5))).map(new defpackage.jil(zzxVarNW, 10)).collect(aido.a)).map(new defpackage.jil(kipVar3, 11)).filter(new defpackage.mif(1)).collect(j$.util.stream.Collectors.toCollection(new defpackage.iaz(14)));
                aooh.e(list, "getIcons(...)");
                if (kipVar3.e != 3 || kipVar3.i) {
                    android.widget.TextView textView2 = lyaVar.v;
                    textView2.setTextAppearance(2132083269);
                    textView2.setTextColor(urg.c(lyaVar.C(), 2130969053));
                } else {
                    android.widget.TextView textView3 = lyaVar.v;
                    textView3.setTextAppearance(2132083261);
                    textView3.setTypeface(textView3.getTypeface(), 1);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = list.iterator();
                while (true) {
                    c = c2;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i4 = i3;
                    if ((((defpackage.kie) next).b & 4) != 0) {
                        arrayList.add(next);
                    }
                    c2 = c;
                    i3 = i4;
                }
                int i5 = i3;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(ajsz.bl(arrayList, 10));
                java.util.Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(lyaVar.C().getString(((defpackage.kie) it2.next()).e));
                }
                defpackage.koo kooVar = lyaVar.t;
                int i6 = kipVar3.e;
                aooh.f(kipVar3, "<this>");
                int i7 = kipVar3.f & 1;
                aooh.f(kipVar3, "<this>");
                int i8 = kipVar3.f & 2;
                boolean zM = lyaVar.s.m(kipVar3.j, kipVar3.k);
                aooh.f(kipVar3, "<this>");
                int i9 = kipVar3.f & 32;
                j$.util.Optional optionalG = lyaVar.I.g();
                aooh.e(optionalG, "getFeature(...)");
                kgz kgzVar2 = (kgz) aooh.q(optionalG);
                kgu kguVarA2 = kgzVar2 != null ? kgzVar2.a(kipVar3) : null;
                switch (i6) {
                    case 1:
                        if (i9 == 32) {
                            charSequenceConcat = kooVar.t;
                        } else if (i7 == 0) {
                            if (kguVarA2 == null) {
                                charSequenceConcat = i8 != 2 ? kooVar.a : kooVar.c;
                            } else {
                                charSequenceConcat = kooVar.b;
                            }
                        } else if (i8 != 2) {
                            charSequenceConcat = !zM ? kooVar.i : kooVar.r;
                        } else {
                            charSequenceConcat = kooVar.j;
                        }
                        break;
                    case 2:
                        if (i9 == 32) {
                            charSequenceConcat = kooVar.u;
                        } else if (i7 == 0) {
                            if (kguVarA2 == null) {
                                charSequenceConcat = i8 != 2 ? kooVar.d : kooVar.f;
                            } else {
                                charSequenceConcat = kooVar.e;
                            }
                        } else if (i8 != 2) {
                            charSequenceConcat = !zM ? kooVar.k : kooVar.s;
                        } else {
                            charSequenceConcat = kooVar.l;
                        }
                        break;
                    case 3:
                        if (i9 == 32) {
                            charSequenceConcat = kooVar.v;
                        } else if (i7 == 0) {
                            charSequenceConcat = kguVarA2 == null ? kooVar.g : kooVar.h;
                        } else {
                            charSequenceConcat = kooVar.m;
                        }
                        break;
                    case 4:
                        charSequenceConcat = kooVar.n;
                        break;
                    case 5:
                        charSequenceConcat = kooVar.o;
                        break;
                    case 6:
                        charSequenceConcat = kooVar.p;
                        break;
                    case 7:
                        charSequenceConcat = kooVar.q;
                        break;
                    default:
                        charSequenceConcat = kooVar.g;
                        break;
                }
                aooh.e(charSequenceConcat, "getCallTypeText(...)");
                android.widget.TextView textView4 = lyaVar.v;
                textView4.setText(charSequenceConcat);
                if (!arrayList2.isEmpty()) {
                    java.lang.CharSequence[] charSequenceArr = new java.lang.CharSequence[3];
                    charSequenceArr[i5] = charSequenceConcat;
                    charSequenceArr[1] = ", ";
                    charSequenceArr[2] = android.text.TextUtils.join(", ", arrayList2);
                    charSequenceConcat = android.text.TextUtils.concat(charSequenceArr);
                }
                textView4.setContentDescription(charSequenceConcat);
                if (kipVar3.e != 3 || kipVar3.i) {
                    lyaVar.w.setTextAppearance(2132083252);
                } else {
                    android.widget.TextView textView5 = lyaVar.w;
                    textView5.setTextAppearance(2132083262);
                    textView5.setTextColor(urg.c(lyaVar.C(), 2130968953));
                }
                android.widget.TextView textView6 = lyaVar.w;
                android.content.Context contextC = lyaVar.C();
                int i10 = kipVar3.e;
                textView6.setTextColor((i10 == 1 || i10 == 2 || i10 == 4 || i10 == 6 || i10 == 7) ? urg.c(contextC, 2130969057) : urg.c(contextC, 2130968953));
                textView6.setText(defpackage.hgu.q(lyaVar.C(), j$.time.Instant.now().toEpochMilli(), kipVar3.d));
                int i11 = kipVar3.e;
                if (i11 == 1) {
                    i2 = 2131231344;
                } else if (i11 == 2) {
                    i2 = 2131231341;
                } else if (i11 == 4) {
                    i2 = 2131231667;
                } else if (i11 == 6) {
                    i2 = 2131231319;
                } else if (i11 != 7) {
                    i2 = 2131231343;
                } else {
                    i2 = 2131231344;
                }
                android.widget.ImageView imageView = lyaVar.u;
                imageView.setImageDrawable(lyaVar.C().getDrawable(i2));
                imageView.setImageTintList(android.content.res.ColorStateList.valueOf(i2 == 2131231343 ? urg.c(lyaVar.C(), 2130968953) : urg.c(lyaVar.C(), 2130968958)));
                int i12 = kipVar3.e;
                if (i12 == 1 || i12 == 2 || i12 == 4 || i12 == 7) {
                    android.content.Context contextC2 = lyaVar.C();
                    long j2 = kipVar3.g;
                    long j3 = kipVar3.h;
                    if (j2 == 0) {
                        kipVar = kipVar3;
                        strReplace = "";
                    } else {
                        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                        long j4 = j2 / 3600;
                        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.SECONDS;
                        long seconds = (j2 - java.util.concurrent.TimeUnit.HOURS.toSeconds(j4)) / 60;
                        kipVar = kipVar3;
                        long seconds2 = (j2 - java.util.concurrent.TimeUnit.HOURS.toSeconds(j4)) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(seconds);
                        android.content.res.Resources resources = contextC2.getResources();
                        if (j4 > 0) {
                            java.lang.String string3 = resources.getString(2132017649);
                            java.lang.String string4 = resources.getString(2132017651);
                            java.lang.String string5 = resources.getString(2132017652);
                            java.lang.Long lValueOf = java.lang.Long.valueOf(j4);
                            java.lang.Long lValueOf2 = java.lang.Long.valueOf(seconds);
                            java.lang.Long lValueOf3 = java.lang.Long.valueOf(seconds2);
                            java.lang.Object[] objArr = new java.lang.Object[6];
                            objArr[i5] = lValueOf;
                            objArr[1] = string3;
                            objArr[2] = lValueOf2;
                            objArr[3] = string4;
                            objArr[4] = lValueOf3;
                            objArr[c] = string5;
                            string = contextC2.getString(2132017655, objArr);
                        } else if (seconds > 0) {
                            java.lang.String string6 = resources.getString(2132017651);
                            java.lang.String string7 = resources.getString(2132017652);
                            java.lang.Long lValueOf4 = java.lang.Long.valueOf(seconds);
                            java.lang.Long lValueOf5 = java.lang.Long.valueOf(seconds2);
                            java.lang.Object[] objArr2 = new java.lang.Object[4];
                            objArr2[i5] = lValueOf4;
                            objArr2[1] = string6;
                            objArr2[2] = lValueOf5;
                            objArr2[3] = string7;
                            string = contextC2.getString(2132017654, objArr2);
                        } else {
                            java.lang.String string8 = resources.getString(2132017652);
                            java.lang.Object[] objArr3 = new java.lang.Object[2];
                            objArr3[i5] = java.lang.Long.valueOf(seconds2);
                            objArr3[1] = string8;
                            string = contextC2.getString(2132017656, objArr3);
                        }
                        strReplace = string.replace("'", "");
                    }
                    java.lang.CharSequence charSequenceT = defpackage.hgz.T(contextC2, strReplace, j3);
                    android.widget.TextView textView7 = lyaVar.x;
                    aooh.c(charSequenceT);
                    textView7.setVisibility(charSequenceT.length() > 0 ? i5 : 8);
                    if (charSequenceT.length() > 0) {
                        textView7.setText(charSequenceT);
                        android.content.Context contextC3 = lyaVar.C();
                        kipVar2 = kipVar;
                        long j5 = kipVar2.g;
                        long j6 = kipVar2.h;
                        if (j5 == 0) {
                            lxoVar = lxoVar;
                            string2 = "";
                            str2 = str2;
                            abwdVar = abwdVar;
                        } else {
                            android.content.res.Resources resources2 = contextC3.getResources();
                            java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.SECONDS;
                            lxoVar = lxoVar;
                            int i13 = (int) (j5 / 3600);
                            java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.SECONDS;
                            str2 = str2;
                            abwdVar = abwdVar;
                            long j7 = i13;
                            int seconds3 = (int) ((j5 - java.util.concurrent.TimeUnit.HOURS.toSeconds(j7)) / 60);
                            int seconds4 = (int) ((j5 - java.util.concurrent.TimeUnit.HOURS.toSeconds(j7)) - java.util.concurrent.TimeUnit.MINUTES.toSeconds(seconds3));
                            if (i13 > 0) {
                                java.lang.String quantityString = resources2.getQuantityString(2131886080, seconds3);
                                java.lang.String quantityString2 = resources2.getQuantityString(2131886081, seconds3);
                                java.lang.String quantityString3 = resources2.getQuantityString(2131886092, seconds4);
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i13);
                                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(seconds3);
                                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(seconds4);
                                java.lang.Object[] objArr4 = new java.lang.Object[6];
                                objArr4[i5] = numValueOf;
                                objArr4[1] = quantityString;
                                objArr4[2] = numValueOf2;
                                objArr4[3] = quantityString2;
                                objArr4[4] = numValueOf3;
                                objArr4[c] = quantityString3;
                                string2 = contextC3.getString(2132017160, objArr4);
                            } else if (seconds3 > 0) {
                                java.lang.String quantityString4 = resources2.getQuantityString(2131886081, seconds3);
                                java.lang.String quantityString5 = resources2.getQuantityString(2131886092, seconds4);
                                java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(seconds3);
                                java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(seconds4);
                                java.lang.Object[] objArr5 = new java.lang.Object[4];
                                objArr5[i5] = numValueOf4;
                                z = true;
                                objArr5[1] = quantityString4;
                                objArr5[2] = numValueOf5;
                                objArr5[3] = quantityString5;
                                string2 = contextC3.getString(2132017159, objArr5);
                            } else {
                                z = true;
                                java.lang.String quantityString6 = resources2.getQuantityString(2131886092, (int) j5);
                                java.lang.Long lValueOf6 = java.lang.Long.valueOf(j5);
                                java.lang.Object[] objArr6 = new java.lang.Object[2];
                                objArr6[i5] = lValueOf6;
                                objArr6[1] = quantityString6;
                                string2 = contextC3.getString(2132017161, objArr6);
                            }
                            textView7.setContentDescription(defpackage.hgz.T(contextC3, string2, j6));
                        }
                        z = true;
                        textView7.setContentDescription(defpackage.hgz.T(contextC3, string2, j6));
                    } else {
                        kipVar2 = kipVar;
                    }
                    com.android.dialer.calllog.icons.container.CallLogIconContainerView callLogIconContainerView = lyaVar.D;
                    aify aifyVarBv = ahvr.bv(list);
                    int i14 = com.android.dialer.calllog.icons.container.CallLogIconContainerView.a;
                    callLogIconContainerView.a(aifyVarBv, z, null);
                    ((vwb) lyaVar.A.y().c).m(new defpackage.maf(kipVar2, str2, abwdVar));
                    lyaVar.y.setVisibility(8);
                    j$.util.Optional optionalG2 = this.m.g();
                    aooh.e(optionalG2, "getFeature(...)");
                    kgzVar = (kgz) aooh.q(optionalG2);
                    if (kgzVar != null) {
                        kguVarA = kgzVar.a(kipVar2);
                    } else {
                        kguVarA = null;
                    }
                    if (kguVarA != null) {
                        lxyVar = null;
                    } else {
                        java.lang.String str3 = kipVar2.j;
                        aooh.e(str3, "getPhoneAccountComponentName(...)");
                        java.lang.String str4 = kipVar2.k;
                        aooh.e(str4, "getPhoneAccountId(...)");
                        lxyVar = new defpackage.lxy(str3, str4);
                    }
                    if (lxyVar != null) {
                        rze rzeVar = lyaVar.H;
                        textView = lyaVar.z;
                        aooh.f(textView, "textView");
                        java.lang.String str5 = lxyVar.b;
                        java.lang.String str6 = lxyVar.a;
                        souVar = (sou) rzeVar.a;
                        sotVar = (sot) souVar.b(str6, str5).orElse((java.lang.Object) null);
                        if (sotVar == null) {
                            textView.setVisibility(8);
                        } else {
                            str = souVar.a() > 1 ? sotVar.c : null;
                            if (str != null || str.length() == 0) {
                                textView.setVisibility(8);
                            } else {
                                int iC = sotVar.d;
                                if (iC == 0) {
                                    iC = urg.c(textView.getContext(), android.R.attr.textColorSecondary);
                                }
                                textView.setText(pez.aq(textView.getContext(), str));
                                textView.setTextColor(iC);
                                textView.setVisibility(i5);
                            }
                        }
                    } else {
                        lyaVar.z.setVisibility(8);
                    }
                    lyaVar.C.setTranslationY(0.0f);
                    lyaVar.E(0.0f);
                    lyaVar.F(1);
                    defpackage.lxn lxnVar = lxoVar.b;
                    com.google.android.material.card.MaterialCardView materialCardViewFindViewById = ldVar.a.findViewById(2131427866);
                    ahbv ahbvVar = this.n;
                    aooh.c(materialCardViewFindViewById);
                    ahbvVar.C(materialCardViewFindViewById, new defpackage.inx(lxnVar.b, lxnVar.c));
                    materialCardViewFindViewById.setClipToOutline(true);
                    return;
                }
                lyaVar.x.setVisibility(8);
                kipVar2 = kipVar3;
                z = true;
                com.android.dialer.calllog.icons.container.CallLogIconContainerView callLogIconContainerView2 = lyaVar.D;
                aify aifyVarBv2 = ahvr.bv(list);
                int i15 = com.android.dialer.calllog.icons.container.CallLogIconContainerView.a;
                callLogIconContainerView2.a(aifyVarBv2, z, null);
                ((vwb) lyaVar.A.y().c).m(new defpackage.maf(kipVar2, str2, abwdVar));
                lyaVar.y.setVisibility(8);
                j$.util.Optional optionalG3 = this.m.g();
                aooh.e(optionalG3, "getFeature(...)");
                kgzVar = (kgz) aooh.q(optionalG3);
                if (kgzVar != null) {
                    kguVarA = kgzVar.a(kipVar2);
                } else {
                    kguVarA = null;
                }
                if (kguVarA != null) {
                    lxyVar = null;
                } else {
                    java.lang.String str7 = kipVar2.j;
                    aooh.e(str7, "getPhoneAccountComponentName(...)");
                    java.lang.String str8 = kipVar2.k;
                    aooh.e(str8, "getPhoneAccountId(...)");
                    lxyVar = new defpackage.lxy(str7, str8);
                }
                if (lxyVar != null) {
                    rze rzeVar2 = lyaVar.H;
                    textView = lyaVar.z;
                    aooh.f(textView, "textView");
                    java.lang.String str9 = lxyVar.b;
                    java.lang.String str10 = lxyVar.a;
                    souVar = (sou) rzeVar2.a;
                    sotVar = (sot) souVar.b(str10, str9).orElse((java.lang.Object) null);
                    if (sotVar == null) {
                        textView.setVisibility(8);
                    } else {
                        if (souVar.a() > 1) {
                        }
                        if (str != null) {
                            textView.setVisibility(8);
                        } else {
                            textView.setVisibility(8);
                        }
                    }
                } else {
                    lyaVar.z.setVisibility(8);
                }
                lyaVar.C.setTranslationY(0.0f);
                lyaVar.E(0.0f);
                lyaVar.F(1);
                defpackage.lxn lxnVar2 = lxoVar.b;
                com.google.android.material.card.MaterialCardView materialCardViewFindViewById2 = ldVar.a.findViewById(2131427866);
                ahbv ahbvVar2 = this.n;
                aooh.c(materialCardViewFindViewById2);
                ahbvVar2.C(materialCardViewFindViewById2, new defpackage.inx(lxnVar2.b, lxnVar2.c));
                materialCardViewFindViewById2.setClipToOutline(true);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Unexpected ViewHolder: " + ldVar + " at position: " + i);
    }

    public final defpackage.kip w(int i) {
        java.lang.Object obj = this.g.a().get(i);
        defpackage.lxo lxoVar = obj instanceof defpackage.lxo ? (defpackage.lxo) obj : null;
        if (lxoVar != null) {
            return lxoVar.a;
        }
        return null;
    }

    public final void x(defpackage.kiq kiqVar) {
        aooh.f(kiqVar, "callDetailsList");
        defpackage.lxq lxqVar = new defpackage.lxq(this, kiqVar);
        A(this.g, lxqVar);
        this.g = lxqVar;
    }

    public final void y(abwd abwdVar) {
        aooh.f(abwdVar, "photoInfo");
        this.f = abwdVar;
        defpackage.lxq lxqVar = new defpackage.lxq(this, this.g.a);
        A(this.g, lxqVar);
        this.g = lxqVar;
    }
}
