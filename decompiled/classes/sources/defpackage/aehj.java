package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aehj {
    private static android.content.Context a;
    public static aprf b;
    private static java.lang.Boolean c;

    public aehj(com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc accountParticleDisc) {
        j$.util.Objects.requireNonNull(accountParticleDisc);
    }

    public static void A(android.widget.EditText editText, android.widget.TextView textView) {
        defpackage.dzs.i(editText, new afjx(editText, textView));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:195:0x060a  */
    public static void B(amhk amhkVar, amhl amhlVar, defpackage.apdh apdhVar, android.content.Context context, java.lang.String str) {
        alhs alhsVar;
        int i;
        defpackage.aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            defpackage.akzx akzxVarM = alhr.a.m();
            if ((amhkVar.b & 1) != 0) {
                amji amjiVar = amhkVar.c;
                if (amjiVar == null) {
                    amjiVar = amji.a;
                }
                defpackage.akzx akzxVarM2 = alhw.a.m();
                java.lang.String str2 = amjiVar.b;
                akzxVarM2.u();
                alhw alhwVar = akzxVarM2.b;
                j$.util.Objects.requireNonNull(str2);
                alhwVar.b = str2;
                defpackage.alat alatVar = amjiVar.c;
                akzxVarM2.u();
                alhw alhwVar2 = akzxVarM2.b;
                defpackage.alat alatVar2 = alhwVar2.c;
                if (!alatVar2.c()) {
                    alhwVar2.c = defpackage.alad.J(alatVar2);
                }
                defpackage.akyl.i(alatVar, alhwVar2.c);
                boolean z = amjiVar.d;
                akzxVarM2.u();
                akzxVarM2.b.d = z;
                alhw alhwVarP = akzxVarM2.r();
                akzxVarM.u();
                alhr alhrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(alhwVarP);
                alhrVar.c = alhwVarP;
                alhrVar.b |= 1;
            }
            defpackage.akzx akzxVarM3 = alht.a.m();
            java.lang.String str3 = amhlVar.e;
            akzxVarM3.u();
            alht alhtVar = akzxVarM3.b;
            j$.util.Objects.requireNonNull(str3);
            alhtVar.e = str3;
            java.lang.String str4 = amhlVar.g;
            akzxVarM3.u();
            alht alhtVar2 = akzxVarM3.b;
            j$.util.Objects.requireNonNull(str4);
            alhtVar2.g = str4;
            if ((amhlVar.b & 1) != 0) {
                amje amjeVar = amhlVar.c;
                if (amjeVar == null) {
                    amjeVar = amje.a;
                }
                defpackage.akzx akzxVarM4 = alhn.a.m();
                java.lang.String str5 = amjeVar.b;
                akzxVarM4.u();
                alhn alhnVar = akzxVarM4.b;
                j$.util.Objects.requireNonNull(str5);
                alhnVar.b = str5;
                defpackage.akzc akzcVar = amjeVar.c;
                akzxVarM4.u();
                alhn alhnVar2 = akzxVarM4.b;
                j$.util.Objects.requireNonNull(akzcVar);
                alhnVar2.c = akzcVar;
                akzxVarM3.u();
                alht alhtVar3 = akzxVarM3.b;
                alhn alhnVarP = akzxVarM4.r();
                j$.util.Objects.requireNonNull(alhnVarP);
                alhtVar3.c = alhnVarP;
                alhtVar3.b |= 1;
            }
            int i2 = 4;
            if ((amhlVar.b & 2) != 0) {
                amip amipVar = amhlVar.d;
                if (amipVar == null) {
                    amipVar = amip.a;
                }
                defpackage.akzx akzxVarM5 = alhb.a.m();
                if ((amipVar.b & 1) != 0) {
                    amil amilVar = amipVar.c;
                    if (amilVar == null) {
                        amilVar = amil.a;
                    }
                    defpackage.akzx akzxVarM6 = algq.a.m();
                    boolean z2 = amilVar.b;
                    akzxVarM6.u();
                    akzxVarM6.b.b = z2;
                    java.lang.String str6 = amilVar.c;
                    akzxVarM6.u();
                    algq algqVar = akzxVarM6.b;
                    j$.util.Objects.requireNonNull(str6);
                    algqVar.c = str6;
                    akzxVarM5.u();
                    alhb alhbVar = akzxVarM5.b;
                    algq algqVarP = akzxVarM6.r();
                    j$.util.Objects.requireNonNull(algqVarP);
                    alhbVar.c = algqVarP;
                    alhbVar.b |= 1;
                }
                if ((amipVar.b & 2) != 0) {
                    amhw amhwVar = amipVar.d;
                    if (amhwVar == null) {
                        amhwVar = amhw.b;
                    }
                    defpackage.akzx akzxVarM7 = algb.a.m();
                    java.lang.String str7 = amhwVar.c;
                    akzxVarM7.u();
                    algb algbVar = akzxVarM7.b;
                    j$.util.Objects.requireNonNull(str7);
                    algbVar.b = str7;
                    java.lang.String str8 = amhwVar.d;
                    akzxVarM7.u();
                    algb algbVar2 = akzxVarM7.b;
                    j$.util.Objects.requireNonNull(str8);
                    algbVar2.c = str8;
                    java.lang.String str9 = amhwVar.e;
                    akzxVarM7.u();
                    algb algbVar3 = akzxVarM7.b;
                    j$.util.Objects.requireNonNull(str9);
                    algbVar3.d = str9;
                    defpackage.aehj aehjVar2 = afjy.c;
                    if (afjy.c(anlf.c(afjy.b)) && amhwVar.f.size() > 0) {
                        defpackage.alak alakVar = amhwVar.f;
                        akzxVarM7.u();
                        algb algbVar4 = akzxVarM7.b;
                        defpackage.alak alakVar2 = algbVar4.e;
                        if (!alakVar2.c()) {
                            algbVar4.e = defpackage.alad.H(alakVar2);
                        }
                        java.util.Iterator<E> it = alakVar.iterator();
                        while (it.hasNext()) {
                            algbVar4.e.g(((java.lang.Integer) it.next()).intValue());
                        }
                    }
                    akzxVarM5.u();
                    alhb alhbVar2 = akzxVarM5.b;
                    algb algbVarP = akzxVarM7.r();
                    j$.util.Objects.requireNonNull(algbVarP);
                    alhbVar2.d = algbVarP;
                    alhbVar2.b |= 2;
                }
                if ((amipVar.b & 4) != 0) {
                    amhz amhzVar = amipVar.e;
                    if (amhzVar == null) {
                        amhzVar = amhz.b;
                    }
                    defpackage.akzx akzxVarM8 = algd.a.m();
                    int i3 = amhzVar.e;
                    akzxVarM8.u();
                    akzxVarM8.b.d = i3;
                    if ((amhzVar.c & 1) != 0) {
                        amhx amhxVar = amhzVar.d;
                        if (amhxVar == null) {
                            amhxVar = amhx.a;
                        }
                        defpackage.akzx akzxVarM9 = algc.a.m();
                        defpackage.akzm akzmVar = amhxVar.b;
                        if (akzmVar == null) {
                            akzmVar = defpackage.akzm.a;
                        }
                        akzxVarM9.u();
                        algc algcVar = akzxVarM9.b;
                        j$.util.Objects.requireNonNull(akzmVar);
                        algcVar.c = akzmVar;
                        algcVar.b |= 1;
                        defpackage.akzm akzmVar2 = amhxVar.c;
                        if (akzmVar2 == null) {
                            akzmVar2 = defpackage.akzm.a;
                        }
                        akzxVarM9.u();
                        algc algcVar2 = akzxVarM9.b;
                        j$.util.Objects.requireNonNull(akzmVar2);
                        algcVar2.d = akzmVar2;
                        algcVar2.b |= 2;
                        akzxVarM8.u();
                        algd algdVar = akzxVarM8.b;
                        algc algcVarP = akzxVarM9.r();
                        j$.util.Objects.requireNonNull(algcVarP);
                        algdVar.c = algcVarP;
                        algdVar.b |= 1;
                    }
                    defpackage.aehj aehjVar3 = afjy.c;
                    if (afjy.c(anlf.c(afjy.b)) && amhzVar.f.size() > 0) {
                        defpackage.alak alakVar3 = amhzVar.f;
                        akzxVarM8.u();
                        algd algdVar2 = akzxVarM8.b;
                        defpackage.alak alakVar4 = algdVar2.e;
                        if (!alakVar4.c()) {
                            algdVar2.e = defpackage.alad.H(alakVar4);
                        }
                        java.util.Iterator<E> it2 = alakVar3.iterator();
                        while (it2.hasNext()) {
                            algdVar2.e.g(((java.lang.Integer) it2.next()).intValue());
                        }
                    }
                    akzxVarM5.u();
                    alhb alhbVar3 = akzxVarM5.b;
                    algd algdVarP = akzxVarM8.r();
                    j$.util.Objects.requireNonNull(algdVarP);
                    alhbVar3.e = algdVarP;
                    alhbVar3.b |= 4;
                }
                if ((amipVar.b & 8) != 0) {
                    amiq amiqVar = amipVar.f;
                    if (amiqVar == null) {
                        amiqVar = amiq.a;
                    }
                    defpackage.akzx akzxVarM10 = alhc.a.m();
                    boolean z3 = amiqVar.b;
                    akzxVarM10.u();
                    akzxVarM10.b.b = z3;
                    boolean z4 = amiqVar.c;
                    akzxVarM10.u();
                    akzxVarM10.b.c = z4;
                    akzxVarM5.u();
                    alhb alhbVar4 = akzxVarM5.b;
                    alhc alhcVarP = akzxVarM10.r();
                    j$.util.Objects.requireNonNull(alhcVarP);
                    alhbVar4.f = alhcVarP;
                    alhbVar4.b |= 8;
                }
                if (amipVar.g.size() > 0) {
                    for (amiv amivVar : amipVar.g) {
                        defpackage.akzx akzxVarM11 = alhf.a.m();
                        int i4 = amivVar.e;
                        akzxVarM11.u();
                        akzxVarM11.b.d = i4;
                        java.lang.String str10 = amivVar.f;
                        akzxVarM11.u();
                        alhf alhfVar = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(str10);
                        alhfVar.e = str10;
                        java.lang.String str11 = amivVar.g;
                        akzxVarM11.u();
                        alhf alhfVar2 = akzxVarM11.b;
                        j$.util.Objects.requireNonNull(str11);
                        alhfVar2.f = str11;
                        int i5 = amivVar.i;
                        akzxVarM11.u();
                        akzxVarM11.b.h = i5;
                        boolean z5 = amivVar.j;
                        akzxVarM11.u();
                        akzxVarM11.b.i = z5;
                        if (amivVar.h.size() > 0) {
                            for (amjh amjhVar : amivVar.h) {
                                defpackage.akzx akzxVarM12 = alhv.a.m();
                                java.lang.String str12 = amjhVar.d;
                                akzxVarM12.u();
                                alhv alhvVar = akzxVarM12.b;
                                j$.util.Objects.requireNonNull(str12);
                                alhvVar.d = str12;
                                if (amjhVar.b == 2) {
                                    defpackage.akzx akzxVarM13 = alhu.a.m();
                                    int i6 = (amjhVar.b == 2 ? (amjg) amjhVar.c : amjg.a).b;
                                    akzxVarM13.u();
                                    akzxVarM13.b.b = i6;
                                    akzxVarM12.u();
                                    alhv alhvVar2 = akzxVarM12.b;
                                    alhu alhuVarP = akzxVarM13.r();
                                    j$.util.Objects.requireNonNull(alhuVarP);
                                    alhvVar2.c = alhuVarP;
                                    alhvVar2.b = 2;
                                }
                                akzxVarM11.u();
                                alhf alhfVar3 = akzxVarM11.b;
                                alhv alhvVarP = akzxVarM12.r();
                                j$.util.Objects.requireNonNull(alhvVarP);
                                defpackage.alat alatVar3 = alhfVar3.g;
                                if (!alatVar3.c()) {
                                    alhfVar3.g = defpackage.alad.J(alatVar3);
                                }
                                alhfVar3.g.add(alhvVarP);
                            }
                        }
                        int i7 = amivVar.c;
                        if (i7 == 0) {
                            i = 5;
                        } else if (i7 == i2) {
                            i = 1;
                        } else if (i7 == 5) {
                            i = 2;
                        } else if (i7 != 6) {
                            i = i7 != 7 ? 0 : i2;
                        } else {
                            i = 3;
                        }
                        int i8 = i - 1;
                        if (i == 0) {
                            throw null;
                        }
                        if (i8 == 0) {
                            amjf amjfVar = i7 == 4 ? (amjf) amivVar.d : amjf.a;
                            defpackage.akzx akzxVarM14 = alho.a.m();
                            int i9 = amjfVar.d;
                            akzxVarM14.u();
                            akzxVarM14.b.d = i9;
                            if ((amjfVar.b & 1) != 0) {
                                amhn amhnVar = amjfVar.c;
                                if (amhnVar == null) {
                                    amhnVar = amhn.a;
                                }
                                alfu alfuVarCA = cA(amhnVar);
                                akzxVarM14.u();
                                alho alhoVar = akzxVarM14.b;
                                j$.util.Objects.requireNonNull(alfuVarCA);
                                alhoVar.c = alfuVarCA;
                                alhoVar.b |= 1;
                            }
                            akzxVarM11.u();
                            alhf alhfVar4 = akzxVarM11.b;
                            alho alhoVarP = akzxVarM14.r();
                            j$.util.Objects.requireNonNull(alhoVarP);
                            alhfVar4.c = alhoVarP;
                            alhfVar4.b = 4;
                        } else if (i8 == 1) {
                            amin aminVar = i7 == 5 ? (amin) amivVar.d : amin.a;
                            defpackage.akzx akzxVarM15 = algz.a.m();
                            if ((aminVar.b & 1) != 0) {
                                amhn amhnVar2 = aminVar.c;
                                if (amhnVar2 == null) {
                                    amhnVar2 = amhn.a;
                                }
                                alfu alfuVarCA2 = cA(amhnVar2);
                                akzxVarM15.u();
                                algz algzVar = akzxVarM15.b;
                                j$.util.Objects.requireNonNull(alfuVarCA2);
                                algzVar.c = alfuVarCA2;
                                algzVar.b |= 1;
                            }
                            akzxVarM11.u();
                            alhf alhfVar5 = akzxVarM11.b;
                            algz algzVarP = akzxVarM15.r();
                            j$.util.Objects.requireNonNull(algzVarP);
                            alhfVar5.c = algzVarP;
                            alhfVar5.b = 5;
                        } else if (i8 == 2) {
                            amix amixVar = i7 == 6 ? (amix) amivVar.d : amix.a;
                            defpackage.akzx akzxVarM16 = alhg.a.m();
                            int i10 = amixVar.b;
                            akzxVarM16.u();
                            akzxVarM16.b.b = i10;
                            int i11 = amixVar.c;
                            akzxVarM16.u();
                            akzxVarM16.b.c = i11;
                            java.lang.String str13 = amixVar.e;
                            akzxVarM16.u();
                            alhg alhgVar = akzxVarM16.b;
                            j$.util.Objects.requireNonNull(str13);
                            alhgVar.e = str13;
                            java.lang.String str14 = amixVar.f;
                            akzxVarM16.u();
                            alhg alhgVar2 = akzxVarM16.b;
                            j$.util.Objects.requireNonNull(str14);
                            alhgVar2.f = str14;
                            if (amixVar.d.size() > 0) {
                                defpackage.alak alakVar5 = amixVar.d;
                                akzxVarM16.u();
                                alhg alhgVar3 = akzxVarM16.b;
                                defpackage.alak alakVar6 = alhgVar3.d;
                                if (!alakVar6.c()) {
                                    alhgVar3.d = defpackage.alad.H(alakVar6);
                                }
                                defpackage.akyl.i(alakVar5, alhgVar3.d);
                            }
                            akzxVarM11.u();
                            alhf alhfVar6 = akzxVarM11.b;
                            alhg alhgVarP = akzxVarM16.r();
                            j$.util.Objects.requireNonNull(alhgVarP);
                            alhfVar6.c = alhgVarP;
                            alhfVar6.b = 6;
                        } else if (i8 == 3) {
                            amio amioVar = i7 == 7 ? (amio) amivVar.d : amio.a;
                            defpackage.akzx akzxVarM17 = alha.a.m();
                            java.lang.String str15 = amioVar.b;
                            akzxVarM17.u();
                            alha alhaVar = akzxVarM17.b;
                            j$.util.Objects.requireNonNull(str15);
                            alhaVar.b = str15;
                            java.lang.String str16 = amioVar.c;
                            akzxVarM17.u();
                            alha alhaVar2 = akzxVarM17.b;
                            j$.util.Objects.requireNonNull(str16);
                            alhaVar2.c = str16;
                            akzxVarM11.u();
                            alhf alhfVar7 = akzxVarM11.b;
                            alha alhaVarP = akzxVarM17.r();
                            j$.util.Objects.requireNonNull(alhaVarP);
                            alhfVar7.c = alhaVarP;
                            alhfVar7.b = 7;
                        }
                        akzxVarM5.u();
                        alhb alhbVar5 = akzxVarM5.b;
                        alhf alhfVarP = akzxVarM11.r();
                        j$.util.Objects.requireNonNull(alhfVarP);
                        defpackage.alat alatVar4 = alhbVar5.g;
                        if (!alatVar4.c()) {
                            alhbVar5.g = defpackage.alad.J(alatVar4);
                        }
                        alhbVar5.g.add(alhfVarP);
                        i2 = 4;
                    }
                }
                if (amipVar.h.size() > 0) {
                    java.util.Iterator it3 = amipVar.h.iterator();
                    while (it3.hasNext()) {
                        int iIntValue = ((java.lang.Integer) it3.next()).intValue();
                        akzxVarM5.u();
                        alhb alhbVar6 = akzxVarM5.b;
                        defpackage.alak alakVar7 = alhbVar6.h;
                        if (!alakVar7.c()) {
                            alhbVar6.h = defpackage.alad.H(alakVar7);
                        }
                        alhbVar6.h.g(iIntValue);
                    }
                }
                akzxVarM3.u();
                alht alhtVar4 = akzxVarM3.b;
                alhb alhbVarP = akzxVarM5.r();
                j$.util.Objects.requireNonNull(alhbVarP);
                alhtVar4.d = alhbVarP;
                alhtVar4.b |= 2;
            }
            if (amhlVar.f.size() > 0) {
                java.util.Iterator it4 = amhlVar.f.iterator();
                while (it4.hasNext()) {
                    switch ((java.lang.String) it4.next()) {
                        case "FAILED_TO_FETCH_SURVEY":
                            alhsVar = alhs.c;
                            break;
                        case "UNSUPPORTED_CRONET_ENGINE":
                            alhsVar = alhs.f;
                            break;
                        case "BACKEND_TIMEOUT":
                            alhsVar = alhs.b;
                            break;
                        case "NO_AVAILABLE_SURVEY":
                            alhsVar = alhs.d;
                            break;
                        case "TRIGGER_ID_NOT_SET":
                            alhsVar = alhs.e;
                            break;
                        default:
                            alhsVar = alhs.a;
                            break;
                    }
                    akzxVarM3.u();
                    alht alhtVar5 = akzxVarM3.b;
                    j$.util.Objects.requireNonNull(alhsVar);
                    defpackage.alak alakVar8 = alhtVar5.f;
                    if (!alakVar8.c()) {
                        alhtVar5.f = defpackage.alad.H(alakVar8);
                    }
                    alhtVar5.f.g(alhsVar.a());
                }
            }
            amac amacVarT = amac.t();
            defpackage.akzx akzxVarM18 = algp.a.m();
            akzxVarM18.u();
            algp algpVar = akzxVarM18.b;
            alhr alhrVarP = akzxVarM.r();
            j$.util.Objects.requireNonNull(alhrVarP);
            algpVar.c = alhrVarP;
            algpVar.b = 2;
            akzxVarM18.u();
            algp algpVar2 = akzxVarM18.b;
            alht alhtVarP = akzxVarM3.r();
            j$.util.Objects.requireNonNull(alhtVarP);
            algpVar2.e = alhtVarP;
            algpVar2.d = 4;
            amacVarT.p(akzxVarM18.r(), apdhVar.b(), apdhVar.a(), context, str);
        }
    }

    public static void C(defpackage.apdh apdhVar, android.content.Context context, java.lang.String str) {
        defpackage.aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            amac amacVarT = amac.t();
            defpackage.akzx akzxVarM = alhy.a.m();
            akzxVarM.u();
            akzxVarM.b.b = defpackage.a.U(2);
            akzxVarM.u();
            akzxVarM.b.c = 4;
            amacVarT.r(akzxVarM.r(), apdhVar.b(), apdhVar.a(), context, str);
        }
    }

    public static void D(defpackage.apdh apdhVar, android.content.Context context, java.lang.String str) {
        defpackage.aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            amac amacVarT = amac.t();
            defpackage.akzx akzxVarM = alhy.a.m();
            akzxVarM.u();
            akzxVarM.b.b = defpackage.a.U(2);
            akzxVarM.u();
            akzxVarM.b.c = 6;
            amacVarT.r(akzxVarM.r(), apdhVar.b(), apdhVar.a(), context, str);
        }
    }

    public static void E(defpackage.apdh apdhVar, android.content.Context context, java.lang.String str) {
        defpackage.aehj aehjVar = afjy.c;
        if (afjy.c(anjv.c(afjy.b))) {
            amac amacVarT = amac.t();
            defpackage.akzx akzxVarM = alhy.a.m();
            akzxVarM.u();
            akzxVarM.b.b = defpackage.a.U(2);
            akzxVarM.u();
            akzxVarM.b.c = 5;
            amacVarT.r(akzxVarM.r(), apdhVar.b(), apdhVar.a(), context, str);
        }
    }

    public static android.graphics.drawable.Drawable F(android.graphics.drawable.Drawable drawable, android.content.Context context, int i) {
        android.graphics.drawable.Drawable drawableMutate = drawable.getConstantState().newDrawable(context.getResources()).mutate();
        drawableMutate.setColorFilter(i, android.graphics.PorterDuff.Mode.SRC_ATOP);
        return drawableMutate;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e7  */
    public static java.util.List G(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        android.content.res.Resources resources = context.getResources();
        amhu amhuVarD = afjz.d(context);
        amhs amhsVar = amhuVarD.c;
        if (amhsVar == null) {
            amhsVar = amhs.a;
        }
        defpackage.akzm akzmVar = amhsVar.e;
        if (akzmVar == null) {
            akzmVar = defpackage.akzm.a;
        }
        amhq amhqVar = amhsVar.c;
        if (amhqVar == null) {
            amhqVar = amhq.a;
        }
        amhr amhrVar = amhsVar.d;
        if (amhrVar == null) {
            amhrVar = amhr.a;
        }
        amht amhtVar = amhuVarD.d;
        if (amhtVar == null) {
            amhtVar = amht.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(15);
        long nanos = java.util.concurrent.TimeUnit.SECONDS.toNanos(akzmVar.b) + ((long) akzmVar.c);
        cB(2132020332, str, arrayList, resources);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.NANOSECONDS;
        long j = nanos / 3600000000000L;
        java.lang.Long lValueOf = java.lang.Long.valueOf(j);
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long j2 = nanos / 60000000000L;
        java.util.concurrent.TimeUnit timeUnit3 = java.util.concurrent.TimeUnit.HOURS;
        java.util.concurrent.TimeUnit timeUnit4 = java.util.concurrent.TimeUnit.NANOSECONDS;
        java.lang.Long lValueOf2 = java.lang.Long.valueOf(j2 - timeUnit3.toMinutes(j));
        java.util.concurrent.TimeUnit timeUnit5 = java.util.concurrent.TimeUnit.NANOSECONDS;
        java.util.concurrent.TimeUnit timeUnit6 = java.util.concurrent.TimeUnit.MINUTES;
        java.util.concurrent.TimeUnit timeUnit7 = java.util.concurrent.TimeUnit.NANOSECONDS;
        cB(2132020362, java.lang.String.format("%02d:%02d:%02d", lValueOf, lValueOf2, java.lang.Long.valueOf((nanos / 1000000000) - timeUnit6.toSeconds(j2))), arrayList, resources);
        cB(2132020364, amhqVar.b, arrayList, resources);
        cB(2132020363, amhqVar.c, arrayList, resources);
        cB(2132020331, amhrVar.b, arrayList, resources);
        cB(2132020328, amhrVar.c, arrayList, resources);
        cB(2132020348, amhrVar.e, arrayList, resources);
        cB(2132020325, amhrVar.f, arrayList, resources);
        cB(2132020324, amhrVar.g, arrayList, resources);
        cB(2132020326, amhrVar.h, arrayList, resources);
        cB(2132020336, amhrVar.i, arrayList, resources);
        int iAR = defpackage.a.aR(amhrVar.d);
        java.lang.String str3 = "UNRECOGNIZED";
        if (iAR == 0) {
            str2 = "UNRECOGNIZED";
        } else if (iAR == 2) {
            str2 = "OS_TYPE_UNKNOWN";
        } else if (iAR == 3) {
            str2 = "OS_TYPE_ANDROID";
        } else if (iAR != 4) {
            str2 = "UNRECOGNIZED";
        } else {
            str2 = "OS_TYPE_IOS";
        }
        cB(2132020347, str2, arrayList, resources);
        int iW = defpackage.a.W(amhtVar.b);
        if (iW != 0) {
            if (iW == 2) {
                str3 = "PLATFORM_UNKNOWN";
            } else if (iW == 3) {
                str3 = "PLATFORM_WEB";
            } else if (iW == 4) {
                str3 = "PLATFORM_ANDROID";
            } else if (iW == 5) {
                str3 = "PLATFORM_IOS";
            }
        }
        cB(2132020350, str3, arrayList, resources);
        cB(2132020339, amhtVar.c, arrayList, resources);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str4 : bundle.keySet()) {
            sb.append(java.lang.String.format("%s %s %s\n", str4, context.getString(2132020354), bundle.get(str4)));
        }
        cB(2132020327, sb.toString(), arrayList, resources);
        return arrayList;
    }

    public static void H(android.app.Activity activity, android.widget.TextView textView, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, afjw afjwVar) {
        android.content.res.Resources resources = activity.getResources();
        long j = afjz.a;
        if (((android.app.UiModeManager) defpackage.ahvr.bI(new defpackage.aell(activity, 17)).eZ()).getCurrentModeType() == 3) {
            textView.setText(resources.getString(2132020338));
        } else {
            java.lang.String string = resources.getString(2132020322);
            java.lang.String string2 = resources.getString(2132020351);
            java.lang.String string3 = resources.getString(2132020360);
            java.lang.String string4 = resources.getString(2132020337, string, string2, string3);
            if (str2 != null) {
                string4 = string4.replace("Google", str2);
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(string4);
            cC(spannableString, string, new afjt(afjwVar));
            cC(spannableString, string2, new afju(str3, activity, str));
            cC(spannableString, string3, new afjv(activity, str4, str));
            textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
        defpackage.aehj aehjVar = afjy.c;
        android.content.Context context = afjy.b;
        anll anllVar = anll.a;
        if (afjy.c(anllVar.b().d(context))) {
            java.lang.String packageName = activity.getPackageName();
            defpackage.aehj aehjVar2 = afjy.c;
            java.lang.String[] strArrSplit = android.text.TextUtils.split(anllVar.b().a(afjy.b), ",");
            int i = 0;
            while (true) {
                if (i >= strArrSplit.length) {
                    break;
                }
                strArrSplit[i] = strArrSplit[i].trim();
                i++;
            }
            for (java.lang.String str5 : strArrSplit) {
                if (android.text.TextUtils.equals(str5, packageName)) {
                    defpackage.dzs.i(textView, new afka(textView));
                    return;
                }
            }
        }
    }

    public static void I(android.content.Context context, java.lang.String str) {
        android.net.NetworkInfo activeNetworkInfo = ((android.net.ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            android.widget.Toast.makeText(context, context.getString(2132020340), 0).show();
            return;
        }
        ve veVar = new ve();
        veVar.a(-1118482);
        vk vkVarB = veVar.b();
        sw swVar = new sw();
        swVar.b = vkVarB.a();
        defpackage.vx vxVarA = swVar.a();
        if (afjz.j(context)) {
            ((android.content.Intent) vxVarA.a).addFlags(268435456);
        }
        try {
            vxVarA.c(context, android.net.Uri.parse(str));
        } catch (android.content.ActivityNotFoundException unused) {
            android.util.Log.e("ResourceUtils", "No app found to open URL: ".concat(str));
        }
    }

    public static void J(android.widget.ImageView imageView, android.content.Context context, int i) {
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            imageView.setImageDrawable(F(drawable, context, i));
        }
    }

    public static android.graphics.drawable.Drawable K(android.content.Context context) {
        return F(context.getDrawable(2131232216), context, context.getColor(2131102931));
    }

    public static cx L(android.content.Context context) {
        return defpackage.a.n() ? new afsn(new android.view.ContextThemeWrapper(context, 2132084131), 2132084129) : new cx(context, 2132084122);
    }

    public static java.io.OutputStream M(defpackage.affz affzVar, java.io.OutputStream outputStream) throws java.io.IOException {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new defpackage.affa("wrapForAppend not supported by ".concat(affzVar.c()));
    }

    public static android.net.Uri N(java.lang.String str, java.lang.String str2, long j) throws defpackage.afex {
        android.net.Uri.Builder builderPath = new android.net.Uri.Builder().scheme("blobstore").authority(str2).path(str);
        defpackage.ahzf ahzfVar = afek.a;
        if (str.endsWith(".lease")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            if (!android.text.TextUtils.equals(str, "*.lease")) {
                builderPath.appendQueryParameter("expiryDateSecs", java.lang.String.valueOf(j));
            }
        }
        android.net.Uri uriBuild = builderPath.build();
        java.util.List<java.lang.String> pathSegments = uriBuild.getPathSegments();
        if (pathSegments.size() == 1) {
            java.lang.String str3 = pathSegments.get(0);
            if (afek.a.j(str3).size() == 1 || (str3.endsWith(".lease") && !android.text.TextUtils.equals(str3, ".lease"))) {
                if (android.text.TextUtils.isEmpty(uriBuild.getQuery()) || (uriBuild.getQueryParameterNames().size() == 1 && uriBuild.getQueryParameter("expiryDateSecs") != null)) {
                    return uriBuild;
                }
                throw new defpackage.afex(java.lang.String.format("The uri query is malformed, expected %s but found query %s", "expiryDateSecs=<expiryDateSecs>", uriBuild.getQuery()));
            }
        }
        throw new defpackage.afex(java.lang.String.format("The uri is malformed, expected %s or %s but found %s", "<non_empty_checksum>", "<non_empty_checksum>.lease", uriBuild.getPath()));
    }

    public static int O(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 8;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }

    public static java.io.File P(android.net.Uri uri, defpackage.zzx zzxVar) throws defpackage.afex {
        java.lang.String scheme = uri.getScheme();
        int iHashCode = scheme.hashCode();
        if (iHashCode != -861391249) {
            if (iHashCode == 3143036 && scheme.equals("file")) {
                return defpackage.agab.ai(uri);
            }
        } else if (scheme.equals("android")) {
            return zzxVar.H(uri);
        }
        throw new defpackage.afex("Couldn't convert URI to path: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    public static void Q(java.util.List list, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2035435124);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.aokv aokvVar = new defpackage.aokv(10);
            java.util.Iterator it = list.iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int i6 = i5 + 1;
                ablv ablvVar = (abmb) it.next();
                j$.util.Objects.checkIndex(0, 6);
                if (ablvVar != null) {
                    if ((ablvVar instanceof abll) || (ablvVar instanceof ablq) || (ablvVar instanceof ablp)) {
                        aokvVar.add(ablvVar);
                    } else if (ablvVar instanceof ablv) {
                        ablv ablvVar2 = ablvVar;
                        boolean z = defpackage.ajsz.bH(list, i5 - 1) instanceof ablv;
                        defpackage.aokv aokvVar2 = new defpackage.aokv(10);
                        if (z) {
                            aokvVar2.add(ablf.a);
                        }
                        java.util.List list2 = ablvVar2.a;
                        abjp abjpVar = abjp.a;
                        aokvVar2.addAll(ax(list2, new xpf(10)));
                        aokvVar.addAll(defpackage.ajsz.aX(aokvVar2));
                    } else if (ablvVar instanceof ably) {
                        aokvVar.add(ablvVar);
                    }
                    i5 = i6;
                }
                throw new defpackage.aois();
            }
            java.util.List listAX = defpackage.ajsz.aX(aokvVar);
            if (!(listAX instanceof java.util.Collection) || !listAX.isEmpty()) {
                java.util.ListIterator listIterator = ((defpackage.aokv) listAX).listIterator(0);
                while (listIterator.hasNext()) {
                    ablm ablmVar = (abmh) listIterator.next();
                    if (!defpackage.aooh.n(ablmVar, ablf.a) && !(ablmVar instanceof ablg)) {
                        if (ablmVar instanceof ablh) {
                            ablm ablmVar2 = ((ablh) ablmVar).a;
                            j$.util.Objects.checkIndex(0, 13);
                            if (ablmVar2 != null) {
                                if (ablmVar2 instanceof abln) {
                                    throw null;
                                }
                                if (ablmVar2 instanceof ablo) {
                                    throw null;
                                }
                                if (ablmVar2 instanceof ablw) {
                                    continue;
                                } else if (ablmVar2 instanceof ablz) {
                                } else {
                                    if (ablmVar2 instanceof ablx) {
                                        throw null;
                                    }
                                    if (ablmVar2 instanceof abma) {
                                    } else {
                                        if (ablmVar2 instanceof abls) {
                                            throw null;
                                        }
                                        if (ablmVar2 instanceof ablt) {
                                            continue;
                                        } else {
                                            if (ablmVar2 instanceof ablm) {
                                                throw null;
                                            }
                                            if ((ablmVar2 instanceof ablu) || (ablmVar2 instanceof ablp) || (ablmVar2 instanceof ablr)) {
                                            }
                                        }
                                    }
                                }
                            }
                            throw new defpackage.aois();
                        }
                        if (ablmVar instanceof abll) {
                            continue;
                        } else {
                            if (ablmVar instanceof abln) {
                                throw null;
                            }
                            if (ablmVar instanceof ablo) {
                                throw null;
                            }
                            if (!(ablmVar instanceof ablq) && !(ablmVar instanceof ablw)) {
                                if (ablmVar instanceof ablz) {
                                } else {
                                    if (ablmVar instanceof ablx) {
                                        throw null;
                                    }
                                    if (ablmVar instanceof abma) {
                                    } else {
                                        if (ablmVar instanceof abls) {
                                            throw null;
                                        }
                                        if (!(ablmVar instanceof ablp) && !(ablmVar instanceof ablt)) {
                                            if (ablmVar instanceof ablm) {
                                                throw null;
                                            }
                                            if (!(ablmVar instanceof ably)) {
                                                throw new defpackage.aois();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            ablk ablkVar = new ablk();
            defpackage.cmw cmwVarB = defpackage.azm.b(cmwVar, 1.0f);
            boolean zD = cavVarB.D(listAX) | cavVarB.D(ablkVar);
            boolean z2 = (i4 & 896) == 256;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((zD | z2) || objR == defpackage.cau.a) {
                objR = new abdu(listAX, ablkVar, 7);
                cbtVar.ab(objR);
            }
            defpackage.den.aM(cmwVarB, null, null, false, null, null, null, false, null, null, (defpackage.aonj) objR, cavVarB, 0, 0, 1022);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(list, cmwVar, i, 14, (byte[]) null);
        }
    }

    public static void R(ablk ablkVar, ablm ablmVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1628047649);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(ablkVar) : cavVarB.D(ablkVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(ablmVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.den.al(cavVarB);
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablkVar, ablmVar, i, 13);
        }
    }

    public static /* synthetic */ defpackage.aojh S(float f, java.lang.String str, java.util.List list, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.afsq.bm(new abfr(str, list), defpackage.ru.o(defpackage.cmw.c, f), 0L, 0L, null, 0, false, 0, null, cavVar, 0, 1020);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static /* synthetic */ defpackage.aojh T(float f, java.lang.String str, defpackage.cav cavVar, int i) {
        if (cavVar.H((i & 3) != 2, i & 1)) {
            defpackage.abrz.k(str, defpackage.ru.o(defpackage.cmw.c, f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, cavVar, 0, 0, 262140);
        } else {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static ablb U(defpackage.ccp ccpVar) {
        return (ablb) ccpVar.a();
    }

    public static void V(ablb ablbVar, defpackage.cmw cmwVar, int i, boolean z, defpackage.aomy aomyVar, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        boolean z2;
        defpackage.aomy aomyVar2;
        boolean z3;
        defpackage.aomy aomyVar3;
        boolean z4;
        defpackage.ccp ccpVar;
        defpackage.cav cavVarB = cavVar.b(810818552);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (true != cavVarB.B(ablbVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            cmwVar2 = cmwVar;
            i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
        } else {
            cmwVar2 = cmwVar;
        }
        int i6 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i6 = i3 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i6 |= true != cavVarB.C(true) ? 8192 : 16384;
        }
        int i7 = 1769472 | i6;
        if (cavVarB.H((599187 & i7) != 599186, i7 & 1)) {
            int i8 = i7 & (-7169);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i2 & 1) == 0 || cavVarB.E()) {
                boolean zU = defpackage.abts.U((android.content.Context) cavVarB.e(defpackage.dep.b));
                java.lang.Object objR = cbtVar.R();
                if (objR == defpackage.cau.a) {
                    objR = new defpackage.uoq(15);
                    cbtVar.ab(objR);
                }
                z3 = zU;
                aomyVar3 = (defpackage.aomy) objR;
            } else {
                cavVarB.s();
                i5 = i;
                z3 = z;
                aomyVar3 = aomyVar;
            }
            int i9 = i8 << 3;
            cavVarB.l();
            java.lang.Object objR2 = cbtVar.R();
            if (objR2 == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(ablbVar, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR2 = parcelableSnapshotMutableState;
            }
            defpackage.ccp ccpVar2 = (defpackage.ccp) objR2;
            if (ablbVar != null) {
                ccpVar2.b(ablbVar);
                z4 = true;
            } else {
                z4 = false;
            }
            cavVarB.u(1807569566);
            defpackage.cmw cmwVarQ = defpackage.cmw.c;
            if (U(ccpVar2) != null) {
                ccpVar = ccpVar2;
                cmwVarQ = defpackage.abts.Q(cmwVarQ, 3, z4, z3, aomyVar3, cavVarB, 6 | (3670016 & i9) | (29360128 & i9), 140);
            } else {
                ccpVar = ccpVar2;
            }
            boolean z5 = z3;
            defpackage.aomy aomyVar4 = aomyVar3;
            cbtVar.W(false);
            int i10 = i5;
            abeb.c(z4, cmwVar2, cmwVarQ, i10, defpackage.cfo.j(-894483839, new lpn(ccpVar, z5, 8), cavVarB), cavVarB, (i7 & 112) | 196608 | (i9 & 7168) | (i7 & 57344));
            i4 = i10;
            z2 = z5;
            aomyVar2 = aomyVar4;
        } else {
            cavVarB.s();
            i4 = i;
            z2 = z;
            aomyVar2 = aomyVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abdz(ablbVar, cmwVar, i4, z2, aomyVar2, i2, 4);
        }
    }

    public static void W(ablb ablbVar, defpackage.aonp aonpVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(559974082);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonpVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.abni abniVar = defpackage.abts.H(cavVarB).a;
            defpackage.abni abniVar2 = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarJ = defpackage.aga.j(new defpackage.alm(250, 150, defpackage.abts.H(cavVarB).b.e), 0.8f, 0L, 4);
            defpackage.abni abniVar3 = defpackage.abts.H(cavVarB).a;
            defpackage.abni abniVar4 = defpackage.abts.H(cavVarB).a;
            defpackage.agf agfVarA = agfVarJ.a(defpackage.aga.n(new defpackage.alm(100, 150, defpackage.abts.H(cavVarB).b.c), 2));
            defpackage.abni abniVar5 = defpackage.abts.H(cavVarB).a;
            defpackage.agg aggVarK = defpackage.aga.k(defpackage.den.bv(250, 0, defpackage.abts.H(cavVarB).b.e, 2), 0.8f, 0L, 4);
            defpackage.abni abniVar6 = defpackage.abts.H(cavVarB).a;
            defpackage.afsq.bz(ablbVar, agfVarA, aggVarK.a(defpackage.aga.o(defpackage.den.bv(100, 0, defpackage.abts.H(cavVarB).b.c, 2), 2)), null, aonpVar, cavVarB, (i2 & 14) | ((i2 << 12) & 458752));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablbVar, aonpVar, i, 10);
        }
    }

    public static void X(java.lang.String str, java.util.List list, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1890084261);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            cavVar2 = cavVarB;
            abew.e(new abey(str, list), (defpackage.cmw) null, defpackage.den.ba(defpackage.cmw.c, 52.0f, 0.0f, 16.0f, 0.0f), 0L, defpackage.den.an(cavVar2).k, defpackage.abts.F(cavVar2).v, false, (java.util.Map) null, (defpackage.aonn) null, (defpackage.dkz) null, cavVar2, 384, 0, 32602);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(str, list, i, 9);
        }
    }

    public static void Y(abja abjaVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-407166090);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarBn = defpackage.den.bn(defpackage.azm.g(cmtVar, 28.0f), defpackage.abts.F(cavVarB).v, defpackage.bge.a);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarBn);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.W(aL(abjaVar, cavVarB), null, defpackage.azm.g(cmtVar, 18.0f), defpackage.den.ak(cavVarB).x, cavVarB, 384, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abjaVar, i, 6);
        }
    }

    public static void Z(abld abldVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1631416038);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abldVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.aomy aomyVar = abldVar.b;
            defpackage.ayy ayyVar = acpl.a;
            defpackage.aaoo.am(aomyVar, null, false, null, acpl.f(defpackage.abts.F(cavVarB).v, cavVarB, 13), null, defpackage.cfo.j(-1868499063, new abkx(abldVar, 3), cavVarB), cavVarB, 805306368, 494);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abldVar, i, 7);
        }
    }

    public static /* synthetic */ java.lang.String a(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "SHOWN_NO_DATA" : "SKIPPED_AND_FEATURE_DISABLED";
        }
        return "SKIPPED_AND_FEATURE_ENABLED";
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:108:0x0206  */
    /* JADX WARN: Code duplicated, block: B:111:0x022e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0234  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237  */
    /* JADX WARN: Code duplicated, block: B:116:0x024a  */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:121:0x026f  */
    /* JADX WARN: Code duplicated, block: B:124:0x027b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x029b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x029d  */
    /* JADX WARN: Code duplicated, block: B:130:0x029f  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:139:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:144:0x0306  */
    /* JADX WARN: Code duplicated, block: B:145:0x0314 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0161  */
    /* JADX WARN: Code duplicated, block: B:84:0x0173  */
    /* JADX WARN: Code duplicated, block: B:86:0x017c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e7  */
    public static void aA(abjm abjmVar, defpackage.cmw cmwVar, defpackage.aonj aonjVar, defpackage.aonj aonjVar2, defpackage.cav cavVar, int i, int i2) throws java.io.IOException {
        int i3;
        defpackage.cmw cmwVar2;
        int i4;
        defpackage.aonj aonjVar3;
        int i5;
        int i6;
        defpackage.aonj aonjVar4;
        int i7;
        int i8;
        boolean z;
        abjm abjmVar2;
        defpackage.aonj aonjVar5;
        defpackage.aonj aonjVar6;
        defpackage.cdk cdkVarI;
        defpackage.abje abjeVar;
        android.content.Context context;
        android.net.Uri uri;
        boolean zB;
        defpackage.cbt cbtVar;
        long j;
        long j2;
        defpackage.dpp dppVar;
        long j3;
        float f;
        float f2;
        float f3;
        float fMax;
        java.lang.Object abjhVar;
        long j4;
        java.io.InputStream inputStreamC;
        abjh abjhVar2;
        defpackage.dpp dppVar2;
        android.content.Context context2;
        defpackage.aonj aonjVar7;
        boolean zD;
        defpackage.cbt cbtVar2;
        java.lang.Object abjgVar;
        defpackage.aonj aonjVar8;
        android.content.Context context3;
        android.net.Uri uri2;
        android.graphics.Bitmap bitmap;
        defpackage.cpu cpuVar;
        java.lang.Object objR;
        java.lang.Object obj;
        abjn abjnVar;
        int i9;
        java.lang.Object objR2;
        bhm bhmVar;
        defpackage.cmw cmwVarA;
        boolean zD2;
        java.lang.Object objR3;
        defpackage.cbt cbtVar3;
        java.lang.Object objR4;
        defpackage.cav cavVarB = cavVar.b(-1486545387);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(abjmVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    aonjVar3 = aonjVar;
                    if (true != cavVarB.D(aonjVar3)) {
                        i5 = 128;
                    } else {
                        i5 = 256;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        aonjVar4 = aonjVar2;
                        if (true != cavVarB.D(aonjVar4)) {
                            i7 = 1024;
                        } else {
                            i7 = 2048;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i8 & 1171) != 1170) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (cavVarB.H(z, i8 & 1)) {
                        if (i10 != 0) {
                            cmwVar2 = defpackage.cmw.c;
                        }
                        if (i4 != 0) {
                            aonjVar3 = null;
                        }
                        if (i6 != 0) {
                            cbtVar3 = (defpackage.cbt) cavVarB;
                            objR4 = cbtVar3.R();
                            if (objR4 == defpackage.cau.a) {
                                objR4 = new abiy(3);
                                cbtVar3.ab(objR4);
                            }
                            aonjVar4 = (defpackage.aonj) objR4;
                        }
                        context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                        uri = abjmVar.a;
                        zB = cavVarB.B(context) | cavVarB.B(uri);
                        cbtVar = (defpackage.cbt) cavVarB;
                        java.lang.Object objR5 = cbtVar.R();
                        if (!zB || objR5 == defpackage.cau.a) {
                            defpackage.aooh.f(context, "<this>");
                            android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                            int i11 = displayMetrics.heightPixels;
                            long j5 = displayMetrics.widthPixels;
                            j = i11;
                            defpackage.aooh.f(context, "context");
                            j2 = j5 << 32;
                            if (uri == null) {
                                ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                            } else {
                                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                try {
                                    int i12 = afax.a;
                                    inputStreamC = afax.c(context, uri, afaw.a);
                                    defpackage.aooh.c(inputStreamC);
                                    try {
                                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options);
                                        defpackage.ajsz.ak(inputStreamC, null);
                                        dppVar = new defpackage.dpp((((long) options.outWidth) << 32) | (((long) options.outHeight) & 4294967295L));
                                    } catch (java.lang.Throwable th) {
                                        try {
                                            throw th;
                                        } catch (java.lang.Throwable th2) {
                                            defpackage.ajsz.ak(inputStreamC, th);
                                            throw th2;
                                        }
                                    }
                                } catch (java.lang.Exception e) {
                                    ((defpackage.aimw) ((defpackage.aimw) abji.a.d()).k(e).l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getImageSize", 64, "ImageResizingCalculator.kt")).v("Failed to load image from Uri.");
                                    dppVar = null;
                                }
                                if (dppVar != null) {
                                    j3 = dppVar.a;
                                    long j6 = j3 & 4294967295L;
                                    f = (int) (j3 >> 32);
                                    f2 = (int) j6;
                                    if (abji.a(j3)) {
                                        f3 = 1.0f;
                                        fMax = 1.0f;
                                    } else {
                                        j4 = j2 | (j & 4294967295L);
                                        if (abji.a(j4)) {
                                            fMax = 1.0f;
                                            f3 = 1.0f;
                                        } else {
                                            f3 = 1.0f;
                                            fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                        }
                                    }
                                    abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                                }
                                cbtVar.ab(abjhVar);
                            }
                            f3 = 1.0f;
                            abjhVar = null;
                            cbtVar.ab(abjhVar);
                        } else {
                            abjhVar = objR5;
                            f3 = 1.0f;
                        }
                        abjhVar2 = (abjh) abjhVar;
                        if (abjhVar2 != null) {
                            dppVar2 = new defpackage.dpp(abjhVar2.a);
                        } else {
                            dppVar2 = null;
                        }
                        int i13 = (i8 & 7168) | 384;
                        defpackage.aooh.f(uri, "uri");
                        context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                        aonjVar7 = aonjVar4;
                        zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i13 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i13 & 3072) == 2048) | cavVarB.D(uri);
                        java.lang.Object objR6 = cbtVar.R();
                        if (!zD || objR6 == defpackage.cau.a) {
                            cbtVar2 = cbtVar;
                            aonjVar8 = aonjVar7;
                            abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                            context3 = context2;
                            uri2 = uri;
                            cbtVar2.ab(abjgVar);
                        } else {
                            abjgVar = objR6;
                            cbtVar2 = cbtVar;
                            context3 = context2;
                            uri2 = uri;
                            aonjVar8 = aonjVar7;
                        }
                        bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                        if (bitmap != null) {
                            cpuVar = new defpackage.cpu(bitmap);
                        } else {
                            cpuVar = null;
                        }
                        if (cpuVar == null) {
                            cavVarB.u(-265150083);
                            defpackage.den.aR(cmwVar2, cavVarB);
                            cbtVar2.W(false);
                            cdkVarI = cavVarB.I();
                            if (cdkVarI != null) {
                                return;
                            } else {
                                abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                            }
                        } else {
                            abjmVar2 = abjmVar;
                            cavVarB.u(-265103955);
                            cbtVar2.W(false);
                            objR = cbtVar2.R();
                            obj = defpackage.cau.a;
                            if (objR == obj) {
                                objR = new abjn();
                                cbtVar2.ab(objR);
                            }
                            abjnVar = (abjn) objR;
                            if (abjhVar2 != null) {
                                f3 = abjhVar2.b;
                            }
                            abjnVar.a = f3;
                            abjl abjlVarAz = az(abjmVar2.c, f3);
                            defpackage.aooh.f(abjlVarAz, "<set-?>");
                            abjnVar.b.b(abjlVarAz);
                            i9 = i8 & 896;
                            objR2 = cbtVar2.R();
                            if (i9 != 256 || objR2 == obj) {
                                if (aonjVar3 == null) {
                                    objR2 = null;
                                } else {
                                    objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                                }
                                cbtVar2.ab(objR2);
                            }
                            bhmVar = (bhm) objR2;
                            if (bhmVar != null) {
                                cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                            } else {
                                cmwVarA = cmwVar2;
                            }
                            defpackage.cmw cmwVarBE = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                            zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                            objR3 = cbtVar2.R();
                            if (zD2 || objR3 == obj) {
                                objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                                cbtVar2.ab(objR3);
                            }
                            yt.a(cmwVarBE, (defpackage.aonj) objR3, cavVarB, 0);
                            aonjVar5 = aonjVar8;
                        }
                        cdkVarI.c = abjeVar;
                    }
                    abjmVar2 = abjmVar;
                    cavVarB.s();
                    cmwVar2 = cmwVar2;
                    aonjVar5 = aonjVar4;
                    aonjVar6 = aonjVar3;
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                        cdkVarI.c = abjeVar;
                    }
                }
                i3 |= 3072;
                aonjVar4 = aonjVar2;
                i8 = i3;
                if ((i8 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i8 & 1)) {
                    if (i10 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonjVar3 = null;
                    }
                    if (i6 != 0) {
                        cbtVar3 = (defpackage.cbt) cavVarB;
                        objR4 = cbtVar3.R();
                        if (objR4 == defpackage.cau.a) {
                            objR4 = new abiy(3);
                            cbtVar3.ab(objR4);
                        }
                        aonjVar4 = (defpackage.aonj) objR4;
                    }
                    context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    uri = abjmVar.a;
                    zB = cavVarB.B(context) | cavVarB.B(uri);
                    cbtVar = (defpackage.cbt) cavVarB;
                    java.lang.Object objR7 = cbtVar.R();
                    if (zB) {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                        int i14 = displayMetrics2.heightPixels;
                        long j7 = displayMetrics2.widthPixels;
                        j = i14;
                        defpackage.aooh.f(context, "context");
                        j2 = j7 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            int i15 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options2);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options2.outWidth) << 32) | (((long) options2.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j8 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j8;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    } else {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                        int i16 = displayMetrics3.heightPixels;
                        long j9 = displayMetrics3.widthPixels;
                        j = i16;
                        defpackage.aooh.f(context, "context");
                        j2 = j9 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options3 = new android.graphics.BitmapFactory.Options();
                            options3.inJustDecodeBounds = true;
                            int i17 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options3);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options3.outWidth) << 32) | (((long) options3.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j10 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j10;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    }
                    abjhVar2 = (abjh) abjhVar;
                    if (abjhVar2 != null) {
                        dppVar2 = new defpackage.dpp(abjhVar2.a);
                    } else {
                        dppVar2 = null;
                    }
                    int i18 = (i8 & 7168) | 384;
                    defpackage.aooh.f(uri, "uri");
                    context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    aonjVar7 = aonjVar4;
                    zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i18 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i18 & 3072) == 2048) | cavVarB.D(uri);
                    java.lang.Object objR8 = cbtVar.R();
                    if (zD) {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    } else {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    }
                    bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                    if (bitmap != null) {
                        cpuVar = new defpackage.cpu(bitmap);
                    } else {
                        cpuVar = null;
                    }
                    if (cpuVar == null) {
                        cavVarB.u(-265150083);
                        defpackage.den.aR(cmwVar2, cavVarB);
                        cbtVar2.W(false);
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            return;
                        } else {
                            abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                        }
                    } else {
                        abjmVar2 = abjmVar;
                        cavVarB.u(-265103955);
                        cbtVar2.W(false);
                        objR = cbtVar2.R();
                        obj = defpackage.cau.a;
                        if (objR == obj) {
                            objR = new abjn();
                            cbtVar2.ab(objR);
                        }
                        abjnVar = (abjn) objR;
                        if (abjhVar2 != null) {
                            f3 = abjhVar2.b;
                        }
                        abjnVar.a = f3;
                        abjl abjlVarAz2 = az(abjmVar2.c, f3);
                        defpackage.aooh.f(abjlVarAz2, "<set-?>");
                        abjnVar.b.b(abjlVarAz2);
                        i9 = i8 & 896;
                        objR2 = cbtVar2.R();
                        if (i9 != 256) {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        } else {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        }
                        bhmVar = (bhm) objR2;
                        if (bhmVar != null) {
                            cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                        } else {
                            cmwVarA = cmwVar2;
                        }
                        defpackage.cmw cmwVarBE2 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                        zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                        objR3 = cbtVar2.R();
                        if (zD2) {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        } else {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        }
                        yt.a(cmwVarBE2, (defpackage.aonj) objR3, cavVarB, 0);
                        aonjVar5 = aonjVar8;
                    }
                    cdkVarI.c = abjeVar;
                }
                abjmVar2 = abjmVar;
                cavVarB.s();
                cmwVar2 = cmwVar2;
                aonjVar5 = aonjVar4;
                aonjVar6 = aonjVar3;
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                    cdkVarI.c = abjeVar;
                }
            }
            i3 |= 384;
            aonjVar3 = aonjVar;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonjVar4 = aonjVar2;
                    if (true != cavVarB.D(aonjVar4)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i8 & 1)) {
                    if (i10 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonjVar3 = null;
                    }
                    if (i6 != 0) {
                        cbtVar3 = (defpackage.cbt) cavVarB;
                        objR4 = cbtVar3.R();
                        if (objR4 == defpackage.cau.a) {
                            objR4 = new abiy(3);
                            cbtVar3.ab(objR4);
                        }
                        aonjVar4 = (defpackage.aonj) objR4;
                    }
                    context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    uri = abjmVar.a;
                    zB = cavVarB.B(context) | cavVarB.B(uri);
                    cbtVar = (defpackage.cbt) cavVarB;
                    java.lang.Object objR9 = cbtVar.R();
                    if (zB) {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics4 = context.getResources().getDisplayMetrics();
                        int i19 = displayMetrics4.heightPixels;
                        long j11 = displayMetrics4.widthPixels;
                        j = i19;
                        defpackage.aooh.f(context, "context");
                        j2 = j11 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options4 = new android.graphics.BitmapFactory.Options();
                            options4.inJustDecodeBounds = true;
                            int i110 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options4);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options4.outWidth) << 32) | (((long) options4.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j12 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j12;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    } else {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics5 = context.getResources().getDisplayMetrics();
                        int i111 = displayMetrics5.heightPixels;
                        long j13 = displayMetrics5.widthPixels;
                        j = i111;
                        defpackage.aooh.f(context, "context");
                        j2 = j13 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options5 = new android.graphics.BitmapFactory.Options();
                            options5.inJustDecodeBounds = true;
                            int i112 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options5);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options5.outWidth) << 32) | (((long) options5.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j14 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j14;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    }
                    abjhVar2 = (abjh) abjhVar;
                    if (abjhVar2 != null) {
                        dppVar2 = new defpackage.dpp(abjhVar2.a);
                    } else {
                        dppVar2 = null;
                    }
                    int i113 = (i8 & 7168) | 384;
                    defpackage.aooh.f(uri, "uri");
                    context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    aonjVar7 = aonjVar4;
                    zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i113 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i113 & 3072) == 2048) | cavVarB.D(uri);
                    java.lang.Object objR10 = cbtVar.R();
                    if (zD) {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    } else {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    }
                    bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                    if (bitmap != null) {
                        cpuVar = new defpackage.cpu(bitmap);
                    } else {
                        cpuVar = null;
                    }
                    if (cpuVar == null) {
                        cavVarB.u(-265150083);
                        defpackage.den.aR(cmwVar2, cavVarB);
                        cbtVar2.W(false);
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            return;
                        } else {
                            abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                        }
                    } else {
                        abjmVar2 = abjmVar;
                        cavVarB.u(-265103955);
                        cbtVar2.W(false);
                        objR = cbtVar2.R();
                        obj = defpackage.cau.a;
                        if (objR == obj) {
                            objR = new abjn();
                            cbtVar2.ab(objR);
                        }
                        abjnVar = (abjn) objR;
                        if (abjhVar2 != null) {
                            f3 = abjhVar2.b;
                        }
                        abjnVar.a = f3;
                        abjl abjlVarAz3 = az(abjmVar2.c, f3);
                        defpackage.aooh.f(abjlVarAz3, "<set-?>");
                        abjnVar.b.b(abjlVarAz3);
                        i9 = i8 & 896;
                        objR2 = cbtVar2.R();
                        if (i9 != 256) {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        } else {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        }
                        bhmVar = (bhm) objR2;
                        if (bhmVar != null) {
                            cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                        } else {
                            cmwVarA = cmwVar2;
                        }
                        defpackage.cmw cmwVarBE3 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                        zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                        objR3 = cbtVar2.R();
                        if (zD2) {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        } else {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        }
                        yt.a(cmwVarBE3, (defpackage.aonj) objR3, cavVarB, 0);
                        aonjVar5 = aonjVar8;
                    }
                    cdkVarI.c = abjeVar;
                }
                abjmVar2 = abjmVar;
                cavVarB.s();
                cmwVar2 = cmwVar2;
                aonjVar5 = aonjVar4;
                aonjVar6 = aonjVar3;
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                    cdkVarI.c = abjeVar;
                }
            }
            i3 |= 3072;
            aonjVar4 = aonjVar2;
            i8 = i3;
            if ((i8 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i8 & 1)) {
                if (i10 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i4 != 0) {
                    aonjVar3 = null;
                }
                if (i6 != 0) {
                    cbtVar3 = (defpackage.cbt) cavVarB;
                    objR4 = cbtVar3.R();
                    if (objR4 == defpackage.cau.a) {
                        objR4 = new abiy(3);
                        cbtVar3.ab(objR4);
                    }
                    aonjVar4 = (defpackage.aonj) objR4;
                }
                context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                uri = abjmVar.a;
                zB = cavVarB.B(context) | cavVarB.B(uri);
                cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR11 = cbtVar.R();
                if (zB) {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics6 = context.getResources().getDisplayMetrics();
                    int i114 = displayMetrics6.heightPixels;
                    long j15 = displayMetrics6.widthPixels;
                    j = i114;
                    defpackage.aooh.f(context, "context");
                    j2 = j15 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options6 = new android.graphics.BitmapFactory.Options();
                        options6.inJustDecodeBounds = true;
                        int i115 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options6);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options6.outWidth) << 32) | (((long) options6.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j16 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j16;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                } else {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics7 = context.getResources().getDisplayMetrics();
                    int i116 = displayMetrics7.heightPixels;
                    long j17 = displayMetrics7.widthPixels;
                    j = i116;
                    defpackage.aooh.f(context, "context");
                    j2 = j17 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options7 = new android.graphics.BitmapFactory.Options();
                        options7.inJustDecodeBounds = true;
                        int i117 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options7);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options7.outWidth) << 32) | (((long) options7.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j18 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j18;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                }
                abjhVar2 = (abjh) abjhVar;
                if (abjhVar2 != null) {
                    dppVar2 = new defpackage.dpp(abjhVar2.a);
                } else {
                    dppVar2 = null;
                }
                int i118 = (i8 & 7168) | 384;
                defpackage.aooh.f(uri, "uri");
                context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                aonjVar7 = aonjVar4;
                zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i118 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i118 & 3072) == 2048) | cavVarB.D(uri);
                java.lang.Object objR12 = cbtVar.R();
                if (zD) {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                } else {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                }
                bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                if (bitmap != null) {
                    cpuVar = new defpackage.cpu(bitmap);
                } else {
                    cpuVar = null;
                }
                if (cpuVar == null) {
                    cavVarB.u(-265150083);
                    defpackage.den.aR(cmwVar2, cavVarB);
                    cbtVar2.W(false);
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        return;
                    } else {
                        abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                    }
                } else {
                    abjmVar2 = abjmVar;
                    cavVarB.u(-265103955);
                    cbtVar2.W(false);
                    objR = cbtVar2.R();
                    obj = defpackage.cau.a;
                    if (objR == obj) {
                        objR = new abjn();
                        cbtVar2.ab(objR);
                    }
                    abjnVar = (abjn) objR;
                    if (abjhVar2 != null) {
                        f3 = abjhVar2.b;
                    }
                    abjnVar.a = f3;
                    abjl abjlVarAz4 = az(abjmVar2.c, f3);
                    defpackage.aooh.f(abjlVarAz4, "<set-?>");
                    abjnVar.b.b(abjlVarAz4);
                    i9 = i8 & 896;
                    objR2 = cbtVar2.R();
                    if (i9 != 256) {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    } else {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    }
                    bhmVar = (bhm) objR2;
                    if (bhmVar != null) {
                        cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                    } else {
                        cmwVarA = cmwVar2;
                    }
                    defpackage.cmw cmwVarBE4 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                    zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                    objR3 = cbtVar2.R();
                    if (zD2) {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    } else {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    }
                    yt.a(cmwVarBE4, (defpackage.aonj) objR3, cavVarB, 0);
                    aonjVar5 = aonjVar8;
                }
                cdkVarI.c = abjeVar;
            }
            abjmVar2 = abjmVar;
            cavVarB.s();
            cmwVar2 = cmwVar2;
            aonjVar5 = aonjVar4;
            aonjVar6 = aonjVar3;
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                cdkVarI.c = abjeVar;
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                aonjVar3 = aonjVar;
                if (true != cavVarB.D(aonjVar3)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    aonjVar4 = aonjVar2;
                    if (true != cavVarB.D(aonjVar4)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (cavVarB.H(z, i8 & 1)) {
                    if (i10 != 0) {
                        cmwVar2 = defpackage.cmw.c;
                    }
                    if (i4 != 0) {
                        aonjVar3 = null;
                    }
                    if (i6 != 0) {
                        cbtVar3 = (defpackage.cbt) cavVarB;
                        objR4 = cbtVar3.R();
                        if (objR4 == defpackage.cau.a) {
                            objR4 = new abiy(3);
                            cbtVar3.ab(objR4);
                        }
                        aonjVar4 = (defpackage.aonj) objR4;
                    }
                    context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    uri = abjmVar.a;
                    zB = cavVarB.B(context) | cavVarB.B(uri);
                    cbtVar = (defpackage.cbt) cavVarB;
                    java.lang.Object objR13 = cbtVar.R();
                    if (zB) {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics8 = context.getResources().getDisplayMetrics();
                        int i119 = displayMetrics8.heightPixels;
                        long j19 = displayMetrics8.widthPixels;
                        j = i119;
                        defpackage.aooh.f(context, "context");
                        j2 = j19 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options8 = new android.graphics.BitmapFactory.Options();
                            options8.inJustDecodeBounds = true;
                            int i1110 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options8);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options8.outWidth) << 32) | (((long) options8.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j110 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j110;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    } else {
                        defpackage.aooh.f(context, "<this>");
                        android.util.DisplayMetrics displayMetrics9 = context.getResources().getDisplayMetrics();
                        int i1111 = displayMetrics9.heightPixels;
                        long j111 = displayMetrics9.widthPixels;
                        j = i1111;
                        defpackage.aooh.f(context, "context");
                        j2 = j111 << 32;
                        if (uri == null) {
                            ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                        } else {
                            android.graphics.BitmapFactory.Options options9 = new android.graphics.BitmapFactory.Options();
                            options9.inJustDecodeBounds = true;
                            int i1112 = afax.a;
                            inputStreamC = afax.c(context, uri, afaw.a);
                            defpackage.aooh.c(inputStreamC);
                            android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options9);
                            defpackage.ajsz.ak(inputStreamC, null);
                            dppVar = new defpackage.dpp((((long) options9.outWidth) << 32) | (((long) options9.outHeight) & 4294967295L));
                            if (dppVar != null) {
                                j3 = dppVar.a;
                                long j112 = j3 & 4294967295L;
                                f = (int) (j3 >> 32);
                                f2 = (int) j112;
                                if (abji.a(j3)) {
                                    j4 = j2 | (j & 4294967295L);
                                    if (abji.a(j4)) {
                                        fMax = 1.0f;
                                        f3 = 1.0f;
                                    } else {
                                        f3 = 1.0f;
                                        fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                    }
                                } else {
                                    f3 = 1.0f;
                                    fMax = 1.0f;
                                }
                                abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                            }
                            cbtVar.ab(abjhVar);
                        }
                        f3 = 1.0f;
                        abjhVar = null;
                        cbtVar.ab(abjhVar);
                    }
                    abjhVar2 = (abjh) abjhVar;
                    if (abjhVar2 != null) {
                        dppVar2 = new defpackage.dpp(abjhVar2.a);
                    } else {
                        dppVar2 = null;
                    }
                    int i1113 = (i8 & 7168) | 384;
                    defpackage.aooh.f(uri, "uri");
                    context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                    aonjVar7 = aonjVar4;
                    zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i1113 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i1113 & 3072) == 2048) | cavVarB.D(uri);
                    java.lang.Object objR14 = cbtVar.R();
                    if (zD) {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    } else {
                        cbtVar2 = cbtVar;
                        aonjVar8 = aonjVar7;
                        abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                        context3 = context2;
                        uri2 = uri;
                        cbtVar2.ab(abjgVar);
                    }
                    bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                    if (bitmap != null) {
                        cpuVar = new defpackage.cpu(bitmap);
                    } else {
                        cpuVar = null;
                    }
                    if (cpuVar == null) {
                        cavVarB.u(-265150083);
                        defpackage.den.aR(cmwVar2, cavVarB);
                        cbtVar2.W(false);
                        cdkVarI = cavVarB.I();
                        if (cdkVarI != null) {
                            return;
                        } else {
                            abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                        }
                    } else {
                        abjmVar2 = abjmVar;
                        cavVarB.u(-265103955);
                        cbtVar2.W(false);
                        objR = cbtVar2.R();
                        obj = defpackage.cau.a;
                        if (objR == obj) {
                            objR = new abjn();
                            cbtVar2.ab(objR);
                        }
                        abjnVar = (abjn) objR;
                        if (abjhVar2 != null) {
                            f3 = abjhVar2.b;
                        }
                        abjnVar.a = f3;
                        abjl abjlVarAz5 = az(abjmVar2.c, f3);
                        defpackage.aooh.f(abjlVarAz5, "<set-?>");
                        abjnVar.b.b(abjlVarAz5);
                        i9 = i8 & 896;
                        objR2 = cbtVar2.R();
                        if (i9 != 256) {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        } else {
                            if (aonjVar3 == null) {
                                objR2 = null;
                            } else {
                                objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                            }
                            cbtVar2.ab(objR2);
                        }
                        bhmVar = (bhm) objR2;
                        if (bhmVar != null) {
                            cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                        } else {
                            cmwVarA = cmwVar2;
                        }
                        defpackage.cmw cmwVarBE5 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                        zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                        objR3 = cbtVar2.R();
                        if (zD2) {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        } else {
                            objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                            cbtVar2.ab(objR3);
                        }
                        yt.a(cmwVarBE5, (defpackage.aonj) objR3, cavVarB, 0);
                        aonjVar5 = aonjVar8;
                    }
                    cdkVarI.c = abjeVar;
                }
                abjmVar2 = abjmVar;
                cavVarB.s();
                cmwVar2 = cmwVar2;
                aonjVar5 = aonjVar4;
                aonjVar6 = aonjVar3;
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                    cdkVarI.c = abjeVar;
                }
            }
            i3 |= 3072;
            aonjVar4 = aonjVar2;
            i8 = i3;
            if ((i8 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i8 & 1)) {
                if (i10 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i4 != 0) {
                    aonjVar3 = null;
                }
                if (i6 != 0) {
                    cbtVar3 = (defpackage.cbt) cavVarB;
                    objR4 = cbtVar3.R();
                    if (objR4 == defpackage.cau.a) {
                        objR4 = new abiy(3);
                        cbtVar3.ab(objR4);
                    }
                    aonjVar4 = (defpackage.aonj) objR4;
                }
                context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                uri = abjmVar.a;
                zB = cavVarB.B(context) | cavVarB.B(uri);
                cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR15 = cbtVar.R();
                if (zB) {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics10 = context.getResources().getDisplayMetrics();
                    int i1114 = displayMetrics10.heightPixels;
                    long j113 = displayMetrics10.widthPixels;
                    j = i1114;
                    defpackage.aooh.f(context, "context");
                    j2 = j113 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options10 = new android.graphics.BitmapFactory.Options();
                        options10.inJustDecodeBounds = true;
                        int i1115 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options10);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options10.outWidth) << 32) | (((long) options10.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j114 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j114;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                } else {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics11 = context.getResources().getDisplayMetrics();
                    int i1116 = displayMetrics11.heightPixels;
                    long j115 = displayMetrics11.widthPixels;
                    j = i1116;
                    defpackage.aooh.f(context, "context");
                    j2 = j115 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options11 = new android.graphics.BitmapFactory.Options();
                        options11.inJustDecodeBounds = true;
                        int i1117 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options11);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options11.outWidth) << 32) | (((long) options11.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j116 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j116;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                }
                abjhVar2 = (abjh) abjhVar;
                if (abjhVar2 != null) {
                    dppVar2 = new defpackage.dpp(abjhVar2.a);
                } else {
                    dppVar2 = null;
                }
                int i1118 = (i8 & 7168) | 384;
                defpackage.aooh.f(uri, "uri");
                context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                aonjVar7 = aonjVar4;
                zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i1118 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i1118 & 3072) == 2048) | cavVarB.D(uri);
                java.lang.Object objR16 = cbtVar.R();
                if (zD) {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                } else {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                }
                bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                if (bitmap != null) {
                    cpuVar = new defpackage.cpu(bitmap);
                } else {
                    cpuVar = null;
                }
                if (cpuVar == null) {
                    cavVarB.u(-265150083);
                    defpackage.den.aR(cmwVar2, cavVarB);
                    cbtVar2.W(false);
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        return;
                    } else {
                        abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                    }
                } else {
                    abjmVar2 = abjmVar;
                    cavVarB.u(-265103955);
                    cbtVar2.W(false);
                    objR = cbtVar2.R();
                    obj = defpackage.cau.a;
                    if (objR == obj) {
                        objR = new abjn();
                        cbtVar2.ab(objR);
                    }
                    abjnVar = (abjn) objR;
                    if (abjhVar2 != null) {
                        f3 = abjhVar2.b;
                    }
                    abjnVar.a = f3;
                    abjl abjlVarAz6 = az(abjmVar2.c, f3);
                    defpackage.aooh.f(abjlVarAz6, "<set-?>");
                    abjnVar.b.b(abjlVarAz6);
                    i9 = i8 & 896;
                    objR2 = cbtVar2.R();
                    if (i9 != 256) {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    } else {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    }
                    bhmVar = (bhm) objR2;
                    if (bhmVar != null) {
                        cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                    } else {
                        cmwVarA = cmwVar2;
                    }
                    defpackage.cmw cmwVarBE6 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                    zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                    objR3 = cbtVar2.R();
                    if (zD2) {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    } else {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    }
                    yt.a(cmwVarBE6, (defpackage.aonj) objR3, cavVarB, 0);
                    aonjVar5 = aonjVar8;
                }
                cdkVarI.c = abjeVar;
            }
            abjmVar2 = abjmVar;
            cavVarB.s();
            cmwVar2 = cmwVar2;
            aonjVar5 = aonjVar4;
            aonjVar6 = aonjVar3;
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                cdkVarI.c = abjeVar;
            }
        }
        i3 |= 384;
        aonjVar3 = aonjVar;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                aonjVar4 = aonjVar2;
                if (true != cavVarB.D(aonjVar4)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (cavVarB.H(z, i8 & 1)) {
                if (i10 != 0) {
                    cmwVar2 = defpackage.cmw.c;
                }
                if (i4 != 0) {
                    aonjVar3 = null;
                }
                if (i6 != 0) {
                    cbtVar3 = (defpackage.cbt) cavVarB;
                    objR4 = cbtVar3.R();
                    if (objR4 == defpackage.cau.a) {
                        objR4 = new abiy(3);
                        cbtVar3.ab(objR4);
                    }
                    aonjVar4 = (defpackage.aonj) objR4;
                }
                context = (android.content.Context) cavVarB.e(defpackage.dep.b);
                uri = abjmVar.a;
                zB = cavVarB.B(context) | cavVarB.B(uri);
                cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR17 = cbtVar.R();
                if (zB) {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics12 = context.getResources().getDisplayMetrics();
                    int i1119 = displayMetrics12.heightPixels;
                    long j117 = displayMetrics12.widthPixels;
                    j = i1119;
                    defpackage.aooh.f(context, "context");
                    j2 = j117 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options12 = new android.graphics.BitmapFactory.Options();
                        options12.inJustDecodeBounds = true;
                        int i11110 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options12);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options12.outWidth) << 32) | (((long) options12.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j118 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j118;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                } else {
                    defpackage.aooh.f(context, "<this>");
                    android.util.DisplayMetrics displayMetrics13 = context.getResources().getDisplayMetrics();
                    int i11111 = displayMetrics13.heightPixels;
                    long j119 = displayMetrics13.widthPixels;
                    j = i11111;
                    defpackage.aooh.f(context, "context");
                    j2 = j119 << 32;
                    if (uri == null) {
                        ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                    } else {
                        android.graphics.BitmapFactory.Options options13 = new android.graphics.BitmapFactory.Options();
                        options13.inJustDecodeBounds = true;
                        int i11112 = afax.a;
                        inputStreamC = afax.c(context, uri, afaw.a);
                        defpackage.aooh.c(inputStreamC);
                        android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options13);
                        defpackage.ajsz.ak(inputStreamC, null);
                        dppVar = new defpackage.dpp((((long) options13.outWidth) << 32) | (((long) options13.outHeight) & 4294967295L));
                        if (dppVar != null) {
                            j3 = dppVar.a;
                            long j1110 = j3 & 4294967295L;
                            f = (int) (j3 >> 32);
                            f2 = (int) j1110;
                            if (abji.a(j3)) {
                                j4 = j2 | (j & 4294967295L);
                                if (abji.a(j4)) {
                                    fMax = 1.0f;
                                    f3 = 1.0f;
                                } else {
                                    f3 = 1.0f;
                                    fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                                }
                            } else {
                                f3 = 1.0f;
                                fMax = 1.0f;
                            }
                            abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                        }
                        cbtVar.ab(abjhVar);
                    }
                    f3 = 1.0f;
                    abjhVar = null;
                    cbtVar.ab(abjhVar);
                }
                abjhVar2 = (abjh) abjhVar;
                if (abjhVar2 != null) {
                    dppVar2 = new defpackage.dpp(abjhVar2.a);
                } else {
                    dppVar2 = null;
                }
                int i11113 = (i8 & 7168) | 384;
                defpackage.aooh.f(uri, "uri");
                context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
                aonjVar7 = aonjVar4;
                zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i11113 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i11113 & 3072) == 2048) | cavVarB.D(uri);
                java.lang.Object objR18 = cbtVar.R();
                if (zD) {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                } else {
                    cbtVar2 = cbtVar;
                    aonjVar8 = aonjVar7;
                    abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                    context3 = context2;
                    uri2 = uri;
                    cbtVar2.ab(abjgVar);
                }
                bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
                if (bitmap != null) {
                    cpuVar = new defpackage.cpu(bitmap);
                } else {
                    cpuVar = null;
                }
                if (cpuVar == null) {
                    cavVarB.u(-265150083);
                    defpackage.den.aR(cmwVar2, cavVarB);
                    cbtVar2.W(false);
                    cdkVarI = cavVarB.I();
                    if (cdkVarI != null) {
                        return;
                    } else {
                        abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                    }
                } else {
                    abjmVar2 = abjmVar;
                    cavVarB.u(-265103955);
                    cbtVar2.W(false);
                    objR = cbtVar2.R();
                    obj = defpackage.cau.a;
                    if (objR == obj) {
                        objR = new abjn();
                        cbtVar2.ab(objR);
                    }
                    abjnVar = (abjn) objR;
                    if (abjhVar2 != null) {
                        f3 = abjhVar2.b;
                    }
                    abjnVar.a = f3;
                    abjl abjlVarAz7 = az(abjmVar2.c, f3);
                    defpackage.aooh.f(abjlVarAz7, "<set-?>");
                    abjnVar.b.b(abjlVarAz7);
                    i9 = i8 & 896;
                    objR2 = cbtVar2.R();
                    if (i9 != 256) {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    } else {
                        if (aonjVar3 == null) {
                            objR2 = null;
                        } else {
                            objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                        }
                        cbtVar2.ab(objR2);
                    }
                    bhmVar = (bhm) objR2;
                    if (bhmVar != null) {
                        cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                    } else {
                        cmwVarA = cmwVar2;
                    }
                    defpackage.cmw cmwVarBE7 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                    zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                    objR3 = cbtVar2.R();
                    if (zD2) {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    } else {
                        objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                        cbtVar2.ab(objR3);
                    }
                    yt.a(cmwVarBE7, (defpackage.aonj) objR3, cavVarB, 0);
                    aonjVar5 = aonjVar8;
                }
                cdkVarI.c = abjeVar;
            }
            abjmVar2 = abjmVar;
            cavVarB.s();
            cmwVar2 = cmwVar2;
            aonjVar5 = aonjVar4;
            aonjVar6 = aonjVar3;
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
                cdkVarI.c = abjeVar;
            }
        }
        i3 |= 3072;
        aonjVar4 = aonjVar2;
        i8 = i3;
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (cavVarB.H(z, i8 & 1)) {
            if (i10 != 0) {
                cmwVar2 = defpackage.cmw.c;
            }
            if (i4 != 0) {
                aonjVar3 = null;
            }
            if (i6 != 0) {
                cbtVar3 = (defpackage.cbt) cavVarB;
                objR4 = cbtVar3.R();
                if (objR4 == defpackage.cau.a) {
                    objR4 = new abiy(3);
                    cbtVar3.ab(objR4);
                }
                aonjVar4 = (defpackage.aonj) objR4;
            }
            context = (android.content.Context) cavVarB.e(defpackage.dep.b);
            uri = abjmVar.a;
            zB = cavVarB.B(context) | cavVarB.B(uri);
            cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR19 = cbtVar.R();
            if (zB) {
                defpackage.aooh.f(context, "<this>");
                android.util.DisplayMetrics displayMetrics14 = context.getResources().getDisplayMetrics();
                int i11114 = displayMetrics14.heightPixels;
                long j1111 = displayMetrics14.widthPixels;
                j = i11114;
                defpackage.aooh.f(context, "context");
                j2 = j1111 << 32;
                if (uri == null) {
                    ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                } else {
                    android.graphics.BitmapFactory.Options options14 = new android.graphics.BitmapFactory.Options();
                    options14.inJustDecodeBounds = true;
                    int i11115 = afax.a;
                    inputStreamC = afax.c(context, uri, afaw.a);
                    defpackage.aooh.c(inputStreamC);
                    android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options14);
                    defpackage.ajsz.ak(inputStreamC, null);
                    dppVar = new defpackage.dpp((((long) options14.outWidth) << 32) | (((long) options14.outHeight) & 4294967295L));
                    if (dppVar != null) {
                        j3 = dppVar.a;
                        long j1112 = j3 & 4294967295L;
                        f = (int) (j3 >> 32);
                        f2 = (int) j1112;
                        if (abji.a(j3)) {
                            j4 = j2 | (j & 4294967295L);
                            if (abji.a(j4)) {
                                fMax = 1.0f;
                                f3 = 1.0f;
                            } else {
                                f3 = 1.0f;
                                fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                            }
                        } else {
                            f3 = 1.0f;
                            fMax = 1.0f;
                        }
                        abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                    }
                    cbtVar.ab(abjhVar);
                }
                f3 = 1.0f;
                abjhVar = null;
                cbtVar.ab(abjhVar);
            } else {
                defpackage.aooh.f(context, "<this>");
                android.util.DisplayMetrics displayMetrics15 = context.getResources().getDisplayMetrics();
                int i11116 = displayMetrics15.heightPixels;
                long j1113 = displayMetrics15.widthPixels;
                j = i11116;
                defpackage.aooh.f(context, "context");
                j2 = j1113 << 32;
                if (uri == null) {
                    ((defpackage.aimw) abji.a.d().l("com/google/android/libraries/communications/ux/components/image/transform/ImageResizingCalculator", "getResizeRequest", 46, "ImageResizingCalculator.kt")).v("Image uri not available for resizing");
                } else {
                    android.graphics.BitmapFactory.Options options15 = new android.graphics.BitmapFactory.Options();
                    options15.inJustDecodeBounds = true;
                    int i11117 = afax.a;
                    inputStreamC = afax.c(context, uri, afaw.a);
                    defpackage.aooh.c(inputStreamC);
                    android.graphics.BitmapFactory.decodeStream(inputStreamC, null, options15);
                    defpackage.ajsz.ak(inputStreamC, null);
                    dppVar = new defpackage.dpp((((long) options15.outWidth) << 32) | (((long) options15.outHeight) & 4294967295L));
                    if (dppVar != null) {
                        j3 = dppVar.a;
                        long j1114 = j3 & 4294967295L;
                        f = (int) (j3 >> 32);
                        f2 = (int) j1114;
                        if (abji.a(j3)) {
                            j4 = j2 | (j & 4294967295L);
                            if (abji.a(j4)) {
                                fMax = 1.0f;
                                f3 = 1.0f;
                            } else {
                                f3 = 1.0f;
                                fMax = java.lang.Math.max(defpackage.aooc.r(((int) (j4 >> 32)) / f, 1.0f), defpackage.aooc.r(((int) (j4 & 4294967295L)) / f2, 1.0f));
                            }
                        } else {
                            f3 = 1.0f;
                            fMax = 1.0f;
                        }
                        abjhVar = new abjh((((long) ((int) (f * fMax))) << 32) | (((long) ((int) (f2 * fMax))) & 4294967295L), fMax);
                    }
                    cbtVar.ab(abjhVar);
                }
                f3 = 1.0f;
                abjhVar = null;
                cbtVar.ab(abjhVar);
            }
            abjhVar2 = (abjh) abjhVar;
            if (abjhVar2 != null) {
                dppVar2 = new defpackage.dpp(abjhVar2.a);
            } else {
                dppVar2 = null;
            }
            int i11118 = (i8 & 7168) | 384;
            defpackage.aooh.f(uri, "uri");
            context2 = (android.content.Context) cavVarB.e(defpackage.dep.b);
            aonjVar7 = aonjVar4;
            zD = cavVarB.D(context2) | cavVarB.B(dppVar2) | ((((i11118 & 7168) ^ 3072) <= 2048 && cavVarB.B(aonjVar7)) || (i11118 & 3072) == 2048) | cavVarB.D(uri);
            java.lang.Object objR110 = cbtVar.R();
            if (zD) {
                cbtVar2 = cbtVar;
                aonjVar8 = aonjVar7;
                abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                context3 = context2;
                uri2 = uri;
                cbtVar2.ab(abjgVar);
            } else {
                cbtVar2 = cbtVar;
                aonjVar8 = aonjVar7;
                abjgVar = new abjg(context2, aonjVar8, uri, dppVar2, (defpackage.aoln) null, 0);
                context3 = context2;
                uri2 = uri;
                cbtVar2.ab(abjgVar);
            }
            bitmap = (android.graphics.Bitmap) rr.e((java.lang.Object) null, context3, uri2, (defpackage.aonn) abjgVar, cavVarB).a();
            if (bitmap != null) {
                cpuVar = new defpackage.cpu(bitmap);
            } else {
                cpuVar = null;
            }
            if (cpuVar == null) {
                cavVarB.u(-265150083);
                defpackage.den.aR(cmwVar2, cavVarB);
                cbtVar2.W(false);
                cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    return;
                } else {
                    abjeVar = new defpackage.abje(abjmVar, cmwVar2, aonjVar3, aonjVar8, i, i2, 2);
                }
            } else {
                abjmVar2 = abjmVar;
                cavVarB.u(-265103955);
                cbtVar2.W(false);
                objR = cbtVar2.R();
                obj = defpackage.cau.a;
                if (objR == obj) {
                    objR = new abjn();
                    cbtVar2.ab(objR);
                }
                abjnVar = (abjn) objR;
                if (abjhVar2 != null) {
                    f3 = abjhVar2.b;
                }
                abjnVar.a = f3;
                abjl abjlVarAz8 = az(abjmVar2.c, f3);
                defpackage.aooh.f(abjlVarAz8, "<set-?>");
                abjnVar.b.b(abjlVarAz8);
                i9 = i8 & 896;
                objR2 = cbtVar2.R();
                if (i9 != 256) {
                    if (aonjVar3 == null) {
                        objR2 = null;
                    } else {
                        objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                    }
                    cbtVar2.ab(objR2);
                } else {
                    if (aonjVar3 == null) {
                        objR2 = null;
                    } else {
                        objR2 = new bhm(new bbs(new bli(abjnVar, aonjVar3, 13), 1));
                    }
                    cbtVar2.ab(objR2);
                }
                bhmVar = (bhm) objR2;
                if (bhmVar != null) {
                    cmwVarA = cmwVar2.a(new auh(bhmVar, new defpackage.apk(9)));
                } else {
                    cmwVarA = cmwVar2;
                }
                defpackage.cmw cmwVarBE8 = defpackage.afsq.bE(cmwVarA, abjmVar2.b, new defpackage.dib(5));
                zD2 = cavVarB.D(cpuVar) | cavVarB.D(abjnVar);
                objR3 = cbtVar2.R();
                if (zD2) {
                    objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                    cbtVar2.ab(objR3);
                } else {
                    objR3 = new abdu(cpuVar, abjnVar, 5, (byte[]) null);
                    cbtVar2.ab(objR3);
                }
                yt.a(cmwVarBE8, (defpackage.aonj) objR3, cavVarB, 0);
                aonjVar5 = aonjVar8;
            }
            cdkVarI.c = abjeVar;
        }
        abjmVar2 = abjmVar;
        cavVarB.s();
        cmwVar2 = cmwVar2;
        aonjVar5 = aonjVar4;
        aonjVar6 = aonjVar3;
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            abjeVar = new defpackage.abje(abjmVar2, cmwVar2, aonjVar6, aonjVar5, i, i2, 3);
            cdkVarI.c = abjeVar;
        }
    }

    public static float aB(long j, long j2) {
        return java.lang.Math.max(java.lang.Float.intBitsToFloat((int) (j2 >> 32)) / java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) / java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static long aC(abjl abjlVar, long j, long j2, long j3) {
        defpackage.aooh.f(abjlVar, "$this$previewPointToImagePoint");
        return defpackage.mni.aM(defpackage.mni.bl(defpackage.cdh.q(j), defpackage.cpm.b(defpackage.mni.aM(j3, defpackage.cdh.q(j2)), aB(j, j2) * abjlVar.b)), (((long) java.lang.Float.floatToRawIntBits(abjlVar.c)) << 32) | (((long) java.lang.Float.floatToRawIntBits(abjlVar.d)) & 4294967295L));
    }

    public static long aD(long j) {
        int i = (int) (j & 4294967295L);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat(i);
        return (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static abjl aE(abjl abjlVar, float f, long j, long j2, long j3) {
        defpackage.aooh.f(abjlVar, "$this$onTransformation");
        float f2 = abjlVar.b * f;
        float fAB = 1.0f / aB(j2, j3);
        float fS = defpackage.aooc.s(f2, 1.0f, 5.0f);
        float f3 = fAB / fS;
        long jBm = defpackage.mni.bm(j3, f3);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) - java.lang.Float.intBitsToFloat((int) (jBm >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (jBm & 4294967295L));
        return new abjl(fS, cG(abjlVar.c + (java.lang.Float.intBitsToFloat((int) (j >> 32)) * f3), fIntBitsToFloat / 2.0f), cG(abjlVar.d + (java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) * f3), fIntBitsToFloat2 / 2.0f));
    }

    public static void aF(java.lang.Object obj, defpackage.cmw cmwVar, defpackage.cmj cmjVar, cwy cwyVar, defpackage.cav cavVar, int i, int i2, int i3) {
        java.lang.Object obj2;
        int i4;
        cwy cwyVar2;
        int i5;
        defpackage.aooh.f(cmwVar, "modifier");
        defpackage.cav cavVarB = cavVar.b(2031874715);
        boolean z = true;
        if ((i & 6) == 0) {
            obj2 = obj;
            i4 = (true != cavVarB.D(obj2) ? 2 : 4) | i;
        } else {
            obj2 = obj;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.D(null) ? 1024 : 2048;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= true != cavVarB.D(null) ? 8192 : 16384;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            i4 |= true != cavVarB.C(false) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i4 |= true != cavVarB.B(cmjVar) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            cwyVar2 = cwyVar;
            i4 |= true != cavVarB.B(cwyVar2) ? 4194304 : 8388608;
        } else {
            cwyVar2 = cwyVar;
        }
        if ((100663296 & i) == 0) {
            i4 |= true != cavVarB.y(1.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i4 |= true != cavVarB.B(null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (true != cavVarB.B(null) ? 2 : 4);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true == cavVarB.D(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= true == cavVarB.B(null) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true == cavVarB.B(null) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= true != ((262144 & i2) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= true != cavVarB.D(null) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= true != cavVarB.C(true) ? 4194304 : 8388608;
        }
        if ((306783379 & i4) == 306783378 && (4793491 & i5) == 4793490) {
            z = false;
        }
        if (cavVarB.H(z, i4 & 1)) {
            cavVarB.u(-1687822048);
            aG(obj2, cmwVar, cmjVar, cwyVar2, cavVarB, 2147483646 & i4, 33554430 & i5);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abjd(obj, cmwVar, cmjVar, cwyVar, i, i2, i3);
        }
    }

    public static void aG(java.lang.Object obj, defpackage.cmw cmwVar, defpackage.cmj cmjVar, cwy cwyVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        cwy cwyVar2;
        int i4;
        defpackage.cav cavVarB = cavVar.b(914593490);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.D(obj) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(null) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(null) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            i3 |= true != cavVarB.C(false) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            i3 |= true != cavVarB.B(cmjVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            cwyVar2 = cwyVar;
            i3 |= true != cavVarB.B(cwyVar2) ? 4194304 : 8388608;
        } else {
            cwyVar2 = cwyVar;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != cavVarB.y(1.0f) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != cavVarB.B(null) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != cavVarB.B(null) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != cavVarB.D(null) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i4 |= true != cavVarB.B(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != cavVarB.B(null) ? 8192 : 16384;
        }
        if ((i2 & 196608) == 0) {
            i4 |= true != ((262144 & i2) == 0 ? cavVarB.B(null) : cavVarB.D(null)) ? 65536 : 131072;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= true != cavVarB.D(null) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != cavVarB.C(true) ? 4194304 : 8388608;
        }
        if (cavVarB.H(((306783379 & i3) == 306783378 && (4793491 & i4) == 4793490) ? false : true, i3 & 1)) {
            boolean zD = ((i4 & 14) == 4) | ((i4 & 112) == 32) | cavVarB.D(obj) | ((i4 & 458752) == 131072 || ((262144 & i4) != 0 && cavVarB.D(null))) | cavVarB.D(null) | ((57344 & i4) == 16384) | cavVarB.D((defpackage.aais) cavVarB.e(defpackage.abjc.a)) | cavVarB.D(null) | ((i3 & 458752) == 131072) | cavVarB.D(null) | cavVarB.D(null);
            boolean z = (i4 & 29360128) == 8388608;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if ((zD | z) || objR == defpackage.cau.a) {
                objR = new abiy(2);
                cbtVar.ab(objR);
            }
            int i5 = i3 >> 9;
            cwy cwyVar3 = cwyVar2;
            xtm.a(obj, (java.lang.String) null, cmwVar, cmjVar, cwyVar3, 1.0f, (defpackage.aonj) objR, cavVarB, (i3 & 126) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 384);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abje(obj, cmwVar, cmjVar, cwyVar, i, i2, 0);
        }
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [cer, java.lang.Object] */
    public static void aH(defpackage.nf nfVar, defpackage.agii agiiVar, int i, defpackage.cmw cmwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        defpackage.cmw bdfVar;
        defpackage.aooh.f(nfVar, "<this>");
        defpackage.aooh.f(agiiVar, "dragDropState");
        defpackage.aooh.f(aonoVar, "content");
        defpackage.cav cavVarB = cavVar.b(104438750);
        if ((i2 & 6) == 0) {
            i3 = (true != cavVarB.B(nfVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? cavVarB.B(agiiVar) : cavVarB.D(agiiVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.C(true) ? 1024 : 2048;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= true != cavVarB.D(aonoVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i4) != 74898, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            java.lang.Integer numA = agiiVar.a();
            boolean z = numA != null && i == numA.intValue();
            if (z) {
                int i5 = i4 & 112;
                boolean z2 = (i4 & 7168) == 2048;
                cavVarB.u(1778772084);
                cmz cmzVar = new cmz();
                boolean z3 = z2 | (i5 == 32 || ((i4 & 64) != 0 && cavVarB.D(agiiVar)));
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                java.lang.Object objR = cbtVar.R();
                if (z3 || objR == defpackage.cau.a) {
                    objR = new abgj(agiiVar, 12);
                    cbtVar.ab(objR);
                }
                bdfVar = defpackage.cfd.J(cmzVar, (defpackage.aonj) objR);
                cbtVar.W(false);
            } else {
                java.lang.Integer num = (java.lang.Integer) agiiVar.k.a();
                if (num == null || i != num.intValue()) {
                    cavVarB.u(1779258939);
                    ((defpackage.cbt) cavVarB).W(false);
                    bdfVar = new defpackage.bdf(new defpackage.aku(1.0f, 400.0f, new defpackage.dpn(4294967297L)));
                } else {
                    int i6 = i4 & 112;
                    boolean z4 = (i4 & 7168) == 2048;
                    cavVarB.u(1779039304);
                    cmz cmzVar2 = new cmz();
                    boolean z5 = z4 | (i6 == 32 || ((i4 & 64) != 0 && cavVarB.D(agiiVar)));
                    defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
                    java.lang.Object objR2 = cbtVar2.R();
                    if (z5 || objR2 == defpackage.cau.a) {
                        objR2 = new abgj(agiiVar, 13);
                        cbtVar2.ab(objR2);
                    }
                    bdfVar = defpackage.cfd.J(cmzVar2, (defpackage.aonj) objR2);
                    cbtVar2.W(false);
                }
            }
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar3 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar3.x);
            defpackage.cje cjeVarAi = cbtVar3.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, bdfVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar3.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonoVar.a(java.lang.Boolean.valueOf(z), cavVarB, java.lang.Integer.valueOf((i4 >> 12) & 112));
            cbtVar3.W(true);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.abje(nfVar, agiiVar, i, cmwVar2, aonoVar, i2, 4);
        }
    }

    public static void aI(java.lang.Object obj, defpackage.cmw cmwVar, defpackage.cmj cmjVar, cwy cwyVar, cwy cwyVar2, float f, boolean z, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmj cmjVar2;
        cwy cwyVar3;
        cwy cwyVar4;
        float f2;
        boolean z2;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(832037842);
        if (i4 == 0) {
            i3 = (true != cavVarB.D(obj) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        int i5 = i2 | 920350134;
        int i6 = i3 | 920349696;
        if (cavVarB.H(((i6 & 306783379) == 306783378 && (306783379 & i5) == 306783378) ? false : true, i6 & 1)) {
            int i7 = i5 >> 6;
            int i8 = i5 >> 3;
            int i9 = i5 << 27;
            int i10 = i6 >> 3;
            int i11 = i6 & 3670016;
            int i12 = i6 & 7168;
            int i13 = i6 & 896;
            int i14 = i6 & 112;
            defpackage.cmj cmjVar3 = defpackage.cmh.e;
            cwy cwyVar5 = defpackage.cwx.b;
            cwy cwyVar6 = defpackage.cwx.a;
            boolean zB = cavVarB.B(null);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.cdu.c);
                cbtVar.ab(parcelableSnapshotMutableState);
                objR = parcelableSnapshotMutableState;
            }
            int i15 = 234881024 & i10;
            int i16 = i9 & 1879048192;
            int i17 = i7 & 7168;
            int i18 = i7 & 57344;
            int i19 = i7 & 458752;
            int i20 = i7 & 3670016;
            int i21 = i7 & 29360128;
            defpackage.ccp ccpVar = (defpackage.ccp) objR;
            if (defpackage.aooh.n(obj, android.net.Uri.EMPTY)) {
                cavVarB.u(985330673);
                if (defpackage.a.C(ccpVar)) {
                    cavVarB.u(985548944);
                    cbtVar.W(false);
                } else {
                    cavVarB.u(724522542);
                    cavVarB.u(985362323);
                    cbtVar.W(false);
                    cbtVar.W(false);
                }
                aF(null, cmwVar, cmjVar3, cwyVar6, cavVarB, ((i6 >> 12) & 14) | 24576 | i14 | i13 | i12 | i11 | (i10 & 29360128) | i15 | i16, (i8 & 1022) | i17 | i18 | i19 | i20 | i21, 32);
                cbtVar.W(false);
                cwyVar3 = cwyVar5;
                z2 = true;
                cmjVar2 = cmjVar3;
                cwyVar4 = cwyVar6;
                f2 = 1.0f;
            } else {
                cavVarB.u(983946833);
                cavVarB.u(984636707);
                aF(obj, cmwVar, cmjVar3, cwyVar5, cavVarB, (i6 & 33554430) | i15 | i16, (i8 & 1022) | i17 | i18 | i19 | i20 | i21, 0);
                cbtVar.W(false);
                cbtVar.W(false);
                cwyVar3 = cwyVar5;
                cmjVar2 = cmjVar3;
                cwyVar4 = cwyVar6;
                f2 = 1.0f;
                z2 = true;
            }
        } else {
            cavVarB.s();
            cmjVar2 = cmjVar;
            cwyVar3 = cwyVar;
            cwyVar4 = cwyVar2;
            f2 = f;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abjb(obj, cmwVar, cmjVar2, cwyVar3, cwyVar4, f2, z2, i, i2);
        }
    }

    public static defpackage.cmw aJ(defpackage.cmw cmwVar, abja abjaVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        return defpackage.dig.b(cmwVar, false, new abgj(abjaVar, 10));
    }

    public static int aK(abja abjaVar) {
        defpackage.aooh.f(abjaVar, "<this>");
        switch (abjaVar.ordinal()) {
            case 0:
                return 2131231278;
            case 1:
                return 2131231280;
            case 2:
                return 2131231279;
            case 3:
                return 2131231289;
            case 4:
                return 2131231281;
            case 5:
                return 2131231283;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return 2131231285;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return 2131231284;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return 2131231286;
            case 9:
                return 2131231287;
            case 10:
                return 2131231292;
            case 11:
                return 2131231291;
            case 12:
                return 2131231290;
            case 13:
                return 2131231293;
            case 14:
                return 2131231294;
            case 15:
                return 2131231296;
            case 16:
                return 2131231295;
            case 17:
                return 2131231298;
            case 18:
                return 2131231300;
            case 19:
                return 2131231301;
            case 20:
                return 2131231302;
            case 21:
                return 2131231303;
            case 22:
                return 2131231304;
            case 23:
                return 2131231305;
            case 24:
                return 2131231306;
            case 25:
                return 2131231307;
            case 26:
                return 2131231308;
            case 27:
                return 2131231309;
            case 28:
                return 2131230909;
            case 29:
                return 2131231313;
            case 30:
                return 2131231312;
            case 31:
                return 2131231310;
            case 32:
                return 2131231311;
            case 33:
                return 2131231314;
            case 34:
                return 2131231685;
            case 35:
                return 2131231316;
            case 36:
                return 2131231315;
            case 37:
                return 2131230927;
            case 38:
                return 2131231317;
            case 39:
                return 2131231319;
            case 40:
                return 2131231318;
            case 41:
                return 2131231323;
            case 42:
                return 2131231324;
            case 43:
                return 2131231325;
            case 44:
                return 2131231326;
            case 45:
                return 2131231327;
            case 46:
                return 2131231328;
            case 47:
                return 2131231329;
            case 48:
                return 2131231330;
            case 49:
                return 2131231331;
            case 50:
                return 2131231332;
            case 51:
                return 2131231333;
            case 52:
                return 2131231335;
            case 53:
                return 2131231334;
            case 54:
                return 2131231336;
            case 55:
                return 2131231337;
            case 56:
                return 2131231345;
            case 57:
                return 2131231339;
            case 58:
                return 2131231338;
            case 59:
                return 2131231340;
            case 60:
                return 2131231341;
            case 61:
                return 2131231342;
            case 62:
                return 2131231343;
            case 63:
                return 2131231344;
            case 64:
                return 2131231771;
            case 65:
                return 2131231346;
            case 66:
                return 2131231347;
            case 67:
                return 2131231349;
            case 68:
                return 2131231348;
            case 69:
                return 2131231695;
            case 70:
                return 2131231358;
            case 71:
                return 2131231352;
            case 72:
                return 2131231353;
            case 73:
                return 2131231354;
            case 74:
                return 2131231355;
            case 75:
                return 2131231356;
            case 76:
                return 2131231357;
            case 77:
                return 2131231361;
            case 78:
                return 2131231363;
            case 79:
                return 2131231362;
            case 80:
                return 2131231360;
            case 81:
                return 2131231359;
            case 82:
                return 2131231365;
            case 83:
                return 2131231366;
            case 84:
                return 2131231368;
            case 85:
                return 2131231367;
            case 86:
                return 2131231369;
            case 87:
                return 2131231370;
            case 88:
                return 2131231088;
            case 89:
                return 2131231089;
            case 90:
                return 2131231104;
            case 91:
                return 2131231106;
            case 92:
                return 2131231371;
            case 93:
                return 2131231700;
            case 94:
                return 2131231701;
            case 95:
                return 2131231702;
            case 96:
                return 2131231703;
            case 97:
                return 2131231704;
            case 98:
                return 2131231705;
            case 99:
                return 2131231710;
            case 100:
                return 2131231711;
            case 101:
                return 2131231712;
            case 102:
                return 2131231374;
            case 103:
                return 2131231373;
            case 104:
                return 2131231376;
            case 105:
                return 2131231713;
            case 106:
                return 2131231377;
            case 107:
                return 2131231383;
            case 108:
                return 2131231379;
            case 109:
                return 2131231381;
            case 110:
                return 2131231384;
            case 111:
                return 2131231387;
            case 112:
                return 2131231389;
            case 113:
                return 2131231390;
            case 114:
                return 2131231391;
            case 115:
                return 2131231392;
            case 116:
                return 2131231393;
            case 117:
                return 2131231394;
            case 118:
                return 2131231395;
            case 119:
                return 2131231396;
            case 120:
                return 2131231397;
            case 121:
                return 2131231399;
            case 122:
                return 2131231398;
            case 123:
                return 2131231400;
            case 124:
                return 2131231401;
            case 125:
                return 2131231402;
            case 126:
                return 2131231406;
            case 127:
                return 2131231404;
            case 128:
                return 2131231405;
            case 129:
                return 2131231407;
            case 130:
                return 2131231719;
            case 131:
                return 2131231408;
            case 132:
                return 2131231409;
            case 133:
                return 2131231412;
            case 134:
                return 2131231410;
            case 135:
                return 2131231414;
            case 136:
                return 2131231413;
            case 137:
                return 2131231415;
            case 138:
                return 2131231416;
            case 139:
                return 2131231417;
            case 140:
                return 2131231418;
            case 141:
                return 2131231419;
            case 142:
                return 2131231420;
            case 143:
                return 2131231421;
            case 144:
                return 2131231422;
            case 145:
                return 2131231423;
            case 146:
                return 2131231424;
            case 147:
                return 2131231425;
            case 148:
                return 2131231426;
            case 149:
                return 2131231427;
            case 150:
                return 2131231428;
            case 151:
                return 2131231429;
            case 152:
                return 2131231431;
            case 153:
                return 2131231430;
            case 154:
                return 2131231432;
            case 155:
                return 2131231248;
            case 156:
                return 2131231249;
            case 157:
                return 2131231436;
            case 158:
                return 2131231435;
            case 159:
                return 2131231434;
            case 160:
                return 2131231438;
            case 161:
                return 2131231437;
            case 162:
                return 2131231445;
            case 163:
                return 2131231446;
            case 164:
                return 2131231440;
            case 165:
                return 2131231439;
            case 166:
                return 2131231441;
            case 167:
                return 2131231442;
            case 168:
                return 2131231444;
            case 169:
                return 2131231443;
            case 170:
                return 2131231447;
            case 171:
                return 2131231433;
            case 172:
                return 2131231448;
            case 173:
                return 2131231449;
            case 174:
                return 2131231728;
            case 175:
                return 2131231453;
            case 176:
                return 2131231451;
            case 177:
                return 2131231452;
            case 178:
                return 2131231456;
            case 179:
                return 2131231455;
            case 180:
                return 2131231458;
            case 181:
                return 2131231457;
            case 182:
                return 2131231459;
            case 183:
                return 2131231462;
            case 184:
                return 2131231461;
            case 185:
                return 2131231466;
            case 186:
                return 2131231463;
            case 187:
                return 2131231464;
            case 188:
                return 2131231467;
            case 189:
                return 2131231468;
            case 190:
                return 2131231471;
            case 191:
                return 2131231469;
            case 192:
                return 2131231470;
            case 193:
                return 2131231472;
            case 194:
                return 2131231473;
            case 195:
                return 2131231474;
            case 196:
                return 2131231475;
            case 197:
                return 2131231477;
            case 198:
                return 2131231476;
            case 199:
                return 2131231478;
            case 200:
                return 2131231479;
            case 201:
                return 2131231480;
            case 202:
                return 2131231481;
            case 203:
                return 2131231482;
            case 204:
                return 2131231484;
            case 205:
                return 2131231483;
            case 206:
                return 2131231487;
            case 207:
                return 2131231517;
            case 208:
                return 2131231485;
            case 209:
                return 2131231486;
            case 210:
                return 2131231489;
            case 211:
                return 2131231488;
            case 212:
                return 2131231490;
            case 213:
                return 2131231087;
            case 214:
                return 2131231491;
            case 215:
                return 2131231492;
            case 216:
                return 2131231737;
            case 217:
                return 2131231738;
            case 218:
                return 2131231739;
            case 219:
                return 2131231499;
            case 220:
                return 2131231494;
            case 221:
                return 2131231496;
            case 222:
                return 2131231498;
            case 223:
                return 2131231497;
            case 224:
                return 2131231501;
            case 225:
                return 2131231500;
            case 226:
                return 2131231502;
            case 227:
                return 2131231503;
            case 228:
                return 2131231504;
            case 229:
                return 2131231506;
            case 230:
                return 2131231505;
            case 231:
                return 2131231507;
            case 232:
                return 2131231508;
            case 233:
                return 2131231510;
            case 234:
                return 2131231512;
            case 235:
                return 2131231511;
            case 236:
                return 2131231513;
            case 237:
                return 2131231514;
            case 238:
                return 2131231515;
            case 239:
                return 2131231521;
            case 240:
                return 2131231520;
            case 241:
                return 2131231519;
            case 242:
                return 2131231516;
            case 243:
                return 2131231522;
            case 244:
                return 2131231523;
            case 245:
                return 2131231591;
            case 246:
                return 2131231524;
            case 247:
                return 2131231525;
            case 248:
                return 2131231530;
            case 249:
                return 2131231527;
            case 250:
                return 2131231526;
            case 251:
                return 2131231528;
            case 252:
                return 2131231529;
            case 253:
                return 2131231533;
            case 254:
                return 2131231532;
            case 255:
                return 2131231531;
            case 256:
                return 2131231534;
            case 257:
                return 2131231543;
            case 258:
                return 2131231536;
            case 259:
                return 2131231535;
            case 260:
                return 2131231537;
            case 261:
                return 2131231538;
            case 262:
                return 2131231539;
            case 263:
                return 2131231541;
            case 264:
                return 2131231540;
            case 265:
                return 2131231553;
            case 266:
                return 2131231552;
            case 267:
                return 2131231548;
            case 268:
                return 2131231551;
            case 269:
                return 2131231557;
            case 270:
                return 2131231558;
            case 271:
                return 2131231554;
            case 272:
                return 2131231555;
            case 273:
                return 2131231556;
            case 274:
                return 2131231559;
            case 275:
                return 2131231563;
            case 276:
                return 2131231561;
            case 277:
                return 2131231562;
            case 278:
                return 2131231565;
            case 279:
                return 2131231564;
            case 280:
                return 2131231385;
            case 281:
                return 2131231566;
            case 282:
                return 2131231567;
            case 283:
                return 2131231568;
            case 284:
                return 2131231569;
            case 285:
                return 2131231748;
            case 286:
                return 2131231570;
            case 287:
                return 2131231571;
            case 288:
                return 2131231572;
            case 289:
                return 2131231573;
            case 290:
                return 2131231574;
            case 291:
                return 2131231577;
            case 292:
                return 2131231575;
            case 293:
                return 2131231576;
            case 294:
                return 2131231579;
            case 295:
                return 2131231580;
            case 296:
                return 2131231582;
            case 297:
                return 2131231581;
            case 298:
                return 2131231584;
            case 299:
                return 2131231583;
            case 300:
                return 2131231585;
            case 301:
                return 2131231587;
            case 302:
                return 2131231589;
            case 303:
                return 2131231588;
            case 304:
                return 2131231590;
            case 305:
                return 2131231752;
            case 306:
                return 2131231707;
            case 307:
                return 2131231706;
            case 308:
                return 2131231708;
            case 309:
                return 2131231709;
            case 310:
                return 2131231592;
            case 311:
                return 2131231593;
            case 312:
                return 2131231594;
            case 313:
                return 2131231596;
            case 314:
                return 2131231599;
            case 315:
                return 2131231597;
            case 316:
                return 2131231600;
            case 317:
                return 2131231602;
            case 318:
                return 2131231601;
            case 319:
                return 2131231604;
            case 320:
                return 2131231606;
            case 321:
                return 2131231608;
            case 322:
                return 2131231607;
            case 323:
                return 2131231611;
            case 324:
                return 2131231610;
            case 325:
                return 2131231612;
            case 326:
                return 2131231613;
            case 327:
                return 2131231614;
            case 328:
                return 2131231615;
            case 329:
                return 2131231616;
            case 330:
                return 2131231619;
            case 331:
                return 2131231754;
            case 332:
                return 2131231617;
            case 333:
                return 2131231621;
            case 334:
                return 2131231625;
            case 335:
                return 2131231755;
            case 336:
                return 2131231622;
            case 337:
                return 2131231623;
            case 338:
                return 2131231624;
            case 339:
                return 2131231756;
            case 340:
                return 2131231757;
            case 341:
                return 2131231758;
            case 342:
                return 2131231759;
            case 343:
                return 2131231760;
            case 344:
                return 2131231761;
            case 345:
                return 2131231762;
            case 346:
                return 2131231763;
            case 347:
                return 2131231764;
            case 348:
                return 2131231765;
            case 349:
                return 2131231766;
            case 350:
                return 2131231767;
            case 351:
                return 2131231768;
            case 352:
                return 2131231626;
            case 353:
                return 2131231627;
            case 354:
                return 2131231628;
            case 355:
                return 2131231629;
            case 356:
                return 2131231630;
            case 357:
                return 2131231631;
            case 358:
                return 2131231632;
            case 359:
                return 2131231633;
            case 360:
                return 2131231634;
            case 361:
                return 2131231769;
            case 362:
                return 2131231770;
            case 363:
                return 2131231277;
            case 364:
                return 2131231638;
            case 365:
                return 2131231641;
            case 366:
                return 2131231642;
            case 367:
                return 2131231643;
            case 368:
                return 2131231644;
            case 369:
                return 2131231645;
            case 370:
                return 2131231646;
            case 371:
                return 2131231647;
            case 372:
                return 2131231648;
            case 373:
                return 2131231649;
            case 374:
                return 2131231650;
            case 375:
                return 2131231654;
            case 376:
                return 2131231772;
            case 377:
                return 2131231651;
            case 378:
                return 2131231653;
            case 379:
                return 2131231652;
            case 380:
                return 2131231655;
            case 381:
                return 2131231656;
            case 382:
                return 2131231657;
            case 383:
                return 2131231080;
            case 384:
                return 2131231658;
            case 385:
                return 2131231659;
            case 386:
                return 2131231079;
            case 387:
                return 2131231660;
            case 388:
                return 2131231661;
            case 389:
                return 2131231663;
            case 390:
                return 2131231662;
            case 391:
                return 2131231664;
            case 392:
                return 2131231667;
            case 393:
                return 2131231665;
            case 394:
                return 2131231669;
            case 395:
                return 2131231668;
            case 396:
                return 2131231671;
            case 397:
                return 2131231670;
            case 398:
                return 2131231672;
            case 399:
                return 2131231673;
            case 400:
                return 2131231674;
            case 401:
                return 2131231675;
            case 402:
                return 2131231775;
            case 403:
                return 2131231678;
            case 404:
                return 2131231605;
            case 405:
                return 2131231677;
            case 406:
                return 2131231679;
            default:
                throw new defpackage.aois();
        }
    }

    public static defpackage.csx aL(abja abjaVar, defpackage.cav cavVar) {
        defpackage.aooh.f(abjaVar, "<this>");
        return defpackage.wv.i(aK(abjaVar), cavVar, 6);
    }

    public static defpackage.css aM(abja abjaVar, defpackage.cav cavVar) {
        return defpackage.wv.k(aK(abjaVar), cavVar, 0);
    }

    public static defpackage.cmw aN(defpackage.cmw cmwVar, defpackage.aomy aomyVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        defpackage.aooh.f(aomyVar, "alpha");
        return defpackage.cfd.J(cmwVar, new abgj(aomyVar, 6));
    }

    public static defpackage.cmw aO(defpackage.cmw cmwVar, defpackage.cqd cqdVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        return defpackage.ru.l(defpackage.cfd.J(cmwVar, new yrz(19)), new abgj(cqdVar, 7));
    }

    public static defpackage.cmw aP(defpackage.cmw cmwVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        return defpackage.dig.a(defpackage.ru.m(defpackage.den.C(cmwVar, new abiq(4)), new abiy(1)), new abiy(0));
    }

    public static defpackage.cmw aQ(defpackage.cmw cmwVar, defpackage.aomy aomyVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        defpackage.aooh.f(aomyVar, "scale");
        return defpackage.cfd.J(cmwVar, new abgj(aomyVar, 8));
    }

    public static defpackage.cmw aR(defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar) {
        defpackage.aooh.f(cmwVar, "<this>");
        cavVar.u(-2094183505);
        if (z) {
            cavVar.u(286079415);
            long jDq = ((defpackage.dpf) cavVar.e(defpackage.dfo.e)).dq(defpackage.dpy.l(((defpackage.dgn) cavVar.e(defpackage.dfo.o)).b()));
            cavVar.o();
            if (defpackage.dpi.a(defpackage.dpk.b(jDq), 600.0f) >= 0) {
                boolean zY = cavVar.y(412.0f);
                java.lang.Object objG = cavVar.g();
                if (zY || objG == defpackage.cau.a) {
                    objG = new abiq(3);
                    cavVar.w(objG);
                }
                cmwVar = defpackage.den.C(cmwVar, (defpackage.aono) objG);
            }
        }
        cavVar.o();
        return cmwVar;
    }

    public static long aS(long j, defpackage.cav cavVar) {
        long j2 = defpackage.den.ak(cavVar).a;
        int iL = defpackage.cfd.L(j);
        int iL2 = defpackage.cfd.L(j2);
        afsj afsjVar = new afsj(iL);
        afsj afsjVar2 = new afsj(iL2);
        double d = afsjVar.a;
        double d2 = afsjVar2.a;
        return defpackage.cfd.M(afsj.a(defpackage.afsq.c(d + (java.lang.Math.min((180.0d - java.lang.Math.abs(java.lang.Math.abs(d - d2) - 180.0d)) * 0.5d, 15.0d) * (defpackage.afsq.c(d2 - d) <= 180.0d ? 1.0d : -1.0d))), afsjVar.b, afsjVar.c).d);
    }

    public static void aT(abix abixVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1263223211);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            j$.util.Objects.checkIndex(0, 8);
            cavVarB.u(1518242512);
            aY(cmwVar, abixVar, cavVarB, ((i4 >> 3) & 14) | ((i4 << 3) & 112));
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(abixVar, cmwVar2, i, 7, (byte[]) null);
        }
    }

    public static void aU(abkq abkqVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1231953501);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.aomy aomyVar = abkqVar.c;
            java.lang.String str = abkqVar.a;
            boolean z = abkqVar.b;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            aW(cmtVar, aomyVar, str, z, cavVarB, (i4 >> 3) & 14);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(abkqVar, cmwVar2, i, 6, (byte[]) null);
        }
    }

    public static void aV(java.lang.String str, java.util.List list, defpackage.cmw cmwVar, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        boolean z2;
        boolean z3;
        defpackage.cmw cmwVar3;
        defpackage.aooh.f(str, "text");
        defpackage.aooh.f(list, "annotations");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2102491242);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if ((i & 24576) == 0) {
            i4 = i2 | 11648;
        }
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                defpackage.cmt cmtVar = defpackage.cmw.c;
                defpackage.aomy aomyVar = defpackage.abts.G(cavVarB).d;
                java.lang.Boolean.FALSE.booleanValue();
                z3 = true;
                cmwVar3 = cmtVar;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                z3 = z;
            }
            cavVarB.l();
            cavVarB.u(1859468719);
            defpackage.cmw cmwVarF = z3 ? rl.f(defpackage.cmw.c, rl.e(cavVarB, 0), true) : cmwVar3;
            cbtVar.W(false);
            cavVar2 = cavVarB;
            abew.e(new abey(str, list), (defpackage.cmw) null, cmwVarF, defpackage.abrz.t(18, cavVarB), defpackage.dkz.z(defpackage.den.an(cavVarB).k, 0L, 0L, null, null, null, null, 0L, 0L, null, 0, 0L, null, null, 0, 0, 16744447), 0L, false, (java.util.Map) null, (defpackage.aonn) null, (defpackage.dkz) null, cavVar2, 0, 0, 32714);
            cmwVar2 = cmwVar3;
            z2 = z3;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(str, list, cmwVar2, z2, i, 10);
        }
    }

    public static void aW(defpackage.cmw cmwVar, defpackage.aomy aomyVar, java.lang.String str, boolean z, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        boolean z2;
        defpackage.aooh.f(str, "text");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-535680474);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar2) ? 16 : 32;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            int i4 = i2 >> 3;
            defpackage.aaoo.am(aomyVar2, cmwVar, z2, null, null, null, defpackage.cfo.j(-1880376669, new abkx(str, 1), cavVarB), cavVarB, (i4 & 14) | 805306368 | ((i2 << 3) & 112) | (i4 & 896), 504);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppv(cmwVar, aomyVar, str, z, i, 11);
        }
    }

    public static void aX(abja abjaVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(2134529896);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        int i5 = 18;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            defpackage.css cssVarAM = aM(abjaVar, cavVarB);
            cavVarB.u(-1711133233);
            long j = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
            ((defpackage.cbt) cavVarB).W(false);
            defpackage.aaoo.V(cssVarAM, null, null, j, cavVarB, 8, 4);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(abjaVar, i, i5);
        }
    }

    public static void aY(defpackage.cmw cmwVar, abix abixVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aooh.f(cmwVar, "modifier");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1516118501);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abixVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.aomy aomyVar = defpackage.abts.G(cavVarB).d;
            java.lang.Boolean.FALSE.booleanValue();
            cavVarB.u(-809393881);
            ((defpackage.cbt) cavVarB).W(false);
            aZ(cmwVar, abixVar, cavVarB, i2 & 126);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(cmwVar, abixVar, i, 4);
        }
    }

    public static void aZ(defpackage.cmw cmwVar, abix abixVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cja cjaVarJ;
        defpackage.cja cjaVarJ2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1822033028);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(cmwVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abixVar) ? 16 : 32;
        }
        int i5 = 18;
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            abja abjaVar = abixVar.c;
            java.lang.String str = abixVar.d;
            defpackage.aomy aomyVar = abixVar.g;
            defpackage.cja cjaVarJ3 = null;
            if (abjaVar == null) {
                cavVarB.u(389488072);
                ((defpackage.cbt) cavVarB).W(false);
                cjaVarJ = null;
            } else {
                cavVarB.u(389516344);
                cjaVarJ = defpackage.cfo.j(-783242885, new defpackage.ubr(abjaVar, i4), cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
            }
            if (str == null) {
                cavVarB.u(389592232);
                ((defpackage.cbt) cavVarB).W(false);
                cjaVarJ2 = null;
            } else {
                cavVarB.u(389621279);
                cjaVarJ2 = defpackage.cfo.j(824199481, new defpackage.ubr(str, 17), cavVarB);
                ((defpackage.cbt) cavVarB).W(false);
            }
            cavVarB.u(389885988);
            defpackage.cja cjaVarJ4 = defpackage.cfo.j(1422815817, new defpackage.ubr(abixVar, i5), cavVarB);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            abkq abkqVar = abixVar.f;
            if (abkqVar == null) {
                cavVarB.u(390076637);
            } else {
                cavVarB.u(390076638);
                cjaVarJ3 = defpackage.cfo.j(-1783108569, new defpackage.ubr(abkqVar, 19), cavVarB);
            }
            cbtVar.W(false);
            cavVarB.u(390212232);
            long jT = defpackage.abrz.t(30, cavVarB);
            cbtVar.W(false);
            cavVar2 = cavVarB;
            defpackage.aaoo.ap(aomyVar, defpackage.cfo.j(-715342132, new defpackage.ubr(abixVar, 20), cavVarB), cmwVar, cjaVarJ3, cjaVarJ, cjaVarJ2, cjaVarJ4, null, 0L, 0.0f, jT, 0L, 0L, null, cavVar2, ((i2 << 6) & 896) | 48, 0);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(cmwVar, abixVar, i, 5);
        }
    }

    public static void aa(defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(422118303);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(null) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVarB.u(-337533603);
            defpackage.den.aR(defpackage.azm.g(defpackage.cmw.c, 48.0f), cavVarB);
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 10);
        }
    }

    public static void ab(ablc ablcVar, abld abldVar, int i, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1139326751);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(ablcVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(abldVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i + (-1)) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            defpackage.sa.f(defpackage.den.aZ(defpackage.azm.d(defpackage.cmw.c, 1.0f), 16.0f, 0.0f), defpackage.awi.b, null, null, 0, 0, defpackage.cfo.j(-1870395706, new abkz(abldVar, ablcVar, i), cavVarB), cavVarB, 1572918, 60);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(ablcVar, abldVar, i, i2, 8);
        }
    }

    public static void ac(abja abjaVar, boolean z, int i, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(11970339);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i + (-1)) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i5 = i3 & 14;
            if (z) {
                cavVarB.u(126201910);
                Y(abjaVar, cavVarB, i5);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(126248844);
                ad(abjaVar, i, cavVarB, i5 | ((i3 >> 3) & 112));
                ((defpackage.cbt) cavVarB).W(false);
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abky(abjaVar, z, i, i2);
        }
    }

    public static void ad(abja abjaVar, int i, defpackage.cav cavVar, int i2) {
        int i3;
        defpackage.cbt cbtVar;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(522217939);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i + (-1)) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarG = defpackage.azm.g(cmtVar, 28.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarG);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            if (i == 3) {
                cavVarB.u(1533878860);
                long j = defpackage.abts.F(cavVarB).v;
                long j2 = defpackage.den.ak(cavVarB).a;
                cbtVar = cbtVar2;
                long j3 = defpackage.den.ak(cavVarB).f;
                long j4 = defpackage.den.ak(cavVarB).j;
                long j5 = defpackage.den.ak(cavVarB).p;
                boolean zA = cavVarB.A(j) | cavVarB.A(j2) | cavVarB.A(j3) | cavVarB.A(j4) | cavVarB.A(j5);
                java.lang.Object objR = cbtVar.R();
                if (zA || objR == defpackage.cau.a) {
                    int[] iArrB = amnj.b(defpackage.cfd.L(j), defpackage.cfd.L(j2), defpackage.cfd.L(j3), defpackage.cfd.L(j4), defpackage.cfd.L(j5), false, 1, amnk.a);
                    defpackage.cqg[] cqgVarArr = new defpackage.cqg[2];
                    int length = iArrB.length;
                    cqgVarArr[0] = new defpackage.cqg(defpackage.cfd.M(length > 0 ? iArrB[0] : defpackage.cfd.L(j)));
                    cqgVarArr[1] = new defpackage.cqg(defpackage.cfd.M(length > 1 ? iArrB[1] : defpackage.cfd.L(j)));
                    objR = defpackage.ajsz.bb(cqgVarArr);
                    cbtVar.ab(objR);
                }
                java.util.List list = (java.util.List) objR;
                boolean zB = cavVarB.B(list);
                java.lang.Object objR2 = cbtVar.R();
                if (zB || objR2 == defpackage.cau.a) {
                    objR2 = defpackage.cfd.T(list, 0L, 0L, 14);
                    cbtVar.ab(objR2);
                }
                defpackage.cqd cqdVar = (defpackage.cqd) objR2;
                defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.azm.g(cmtVar, 24.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 1, 983039);
                boolean zB2 = cavVarB.B(cqdVar);
                java.lang.Object objR3 = cbtVar.R();
                if (zB2 || objR3 == defpackage.cau.a) {
                    objR3 = new abgj(cqdVar, 14);
                    cbtVar.ab(objR3);
                }
                defpackage.aaoo.W(aL(abjaVar, cavVarB), null, defpackage.ru.m(cmwVarK, (defpackage.aonj) objR3), defpackage.cfd.S(), cavVarB, 3072, 0);
                cbtVar.W(false);
            } else {
                cbtVar = cbtVar2;
                cavVarB.u(1534399536);
                defpackage.aaoo.W(aL(abjaVar, cavVarB), null, defpackage.azm.g(cmtVar, 24.0f), defpackage.abts.F(cavVarB).v, cavVarB, 384, 0);
                cbtVar.W(false);
            }
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(abjaVar, i, i2, 5);
        }
    }

    public static void ae(ablc ablcVar, int i, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1629016161);
        if (i5 == 0) {
            i3 = (true != cavVarB.B(ablcVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i4 + (-1)) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            if (i4 != 2) {
                i4 = 3;
            }
            cavVarB.u(-1184716491);
            long j = defpackage.abts.F(cavVarB).s;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            cavVarB.u(-1184563661);
            long j2 = defpackage.abts.F(cavVarB).t;
            cbtVar.W(false);
            defpackage.aomy aomyVar = ablcVar.c;
            defpackage.ayy ayyVar = acpl.a;
            defpackage.aaoo.ak(aomyVar, null, false, null, acpl.a(j, j2, cavVarB, 12), null, null, null, defpackage.cfo.j(987364239, new abkx(ablcVar, 0), cavVarB), cavVarB, 805306368, 494);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(ablcVar, i4, i2, 6);
        }
    }

    public static void af(abja abjaVar, boolean z, int i, defpackage.aono aonoVar, defpackage.cav cavVar, int i2) {
        int i3;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(2129791001);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != cavVarB.D(null) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i3 & 9363) != 9362, i3 & 1)) {
            defpackage.cmn cmnVar = defpackage.cmh.n;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, cmnVar, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.azk azkVar = defpackage.azk.a;
            defpackage.den.aR(defpackage.azm.k(cmtVar, 16.0f), cavVarB);
            ac(abjaVar, z, i, cavVarB, i3 & 1022);
            defpackage.den.aR(defpackage.azm.k(cmtVar, 8.0f), cavVarB);
            int i5 = i3 >> 9;
            aonoVar.a(azkVar, cavVarB, java.lang.Integer.valueOf((i5 & 112) | 6));
            aa(cavVarB, i5 & 14);
            defpackage.den.aR(defpackage.azm.k(cmtVar, 4.0f), cavVarB);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abla(abjaVar, z, i, aonoVar, i2, 0);
        }
    }

    public static void ag(ablb ablbVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1369635439);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(ablbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (cavVarB.H((i4 & 19) != 18, i4 & 1)) {
            cmwVar = defpackage.cmw.c;
            W(ablbVar, defpackage.cfo.j(1503353845, new bbs(cmwVar, 6), cavVarB), cavVarB, (i4 & 14) | 48);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(ablbVar, cmwVar2, i, 11, (byte[]) null);
        }
    }

    public static void ah(java.lang.String str, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        java.lang.String str2;
        int i2;
        defpackage.cav cavVar2;
        defpackage.cav cavVarB = cavVar.b(2067297472);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (true != cavVarB.B(str2) ? 2 : 4) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.z(1) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.z(2) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(str2, cmwVar, defpackage.den.ak(cavVarB).q, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).g, cavVar2, i2 & 126, ((i2 >> 3) & 896) | ((i2 << 6) & 57344), 110584);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(str, cmwVar, i, 12, (byte[]) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x02e5 A[PHI: r5
      0x02e5: PHI (r5v60 aonn) = (r5v50 aonn), (r5v61 aonn) binds: [B:174:0x02e3, B:170:0x02dc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:183:0x0308  */
    /* JADX WARN: Code duplicated, block: B:188:0x0316  */
    /* JADX WARN: Code duplicated, block: B:192:0x0320  */
    /* JADX WARN: Code duplicated, block: B:193:0x0323  */
    /* JADX WARN: Code duplicated, block: B:196:0x0332  */
    /* JADX WARN: Code duplicated, block: B:199:0x033c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x033e  */
    public static void ai(defpackage.cmw cmwVar, defpackage.bbh bbhVar, defpackage.ayy ayyVar, defpackage.aonn aonnVar, defpackage.aonj aonjVar, defpackage.aonn aonnVar2, defpackage.aomy aomyVar, defpackage.aomy aomyVar2, java.lang.Integer num, java.util.List list, defpackage.aonn aonnVar3, defpackage.aonr aonrVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        defpackage.cav cavVar2;
        int i5;
        boolean z3;
        defpackage.cbt cbtVar;
        defpackage.bbh bbhVar2;
        defpackage.aonn aonnVar4;
        boolean z4;
        boolean z5;
        java.lang.Object objR;
        java.util.List list2;
        boolean z6;
        boolean z7;
        boolean zD;
        java.lang.Object objR2;
        defpackage.aooh.f(aonnVar, "onOrderChange");
        defpackage.aooh.f(aonrVar, "content");
        defpackage.cav cavVarB = cavVar.b(1712057655);
        if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(bbhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(ayyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != cavVarB.D(aonnVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != cavVarB.D(aonjVar) ? 8192 : 16384;
        }
        if ((i & 196608) == 0) {
            z = true;
            i3 |= true != cavVarB.D(aonnVar2) ? 65536 : 131072;
        } else {
            z = true;
        }
        if ((1572864 & i) == 0) {
            i3 |= z != cavVarB.D(aomyVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != cavVarB.D(aomyVar2) ? 4194304 : 8388608;
        }
        int i6 = i3 | 100663296;
        if ((805306368 & i) == 0) {
            i6 |= true != cavVarB.B(num) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            z2 = true;
            i4 = i2 | (true != ((i2 & 8) == 0 ? cavVarB.B(list) : cavVarB.D(list)) ? 2 : 4);
        } else {
            z2 = true;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= z2 == cavVarB.D(aonnVar3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= z2 == cavVarB.D(aonrVar) ? 256 : 128;
        }
        int i7 = i4;
        if (cavVarB.H(((306783379 & i6) == 306783378 && (i7 & 147) == 146) ? false : true, i6 & 1)) {
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            cbtVar2.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.dpq dpqVar = (defpackage.dpq) cavVarB.e(defpackage.dfo.j);
            int iIntValue = num.intValue();
            int i8 = i6 & 7168;
            int i9 = i6;
            java.lang.Object objR3 = cbtVar2.R();
            if (i8 == 2048 || objR3 == defpackage.cau.a) {
                objR3 = new abkv(aonnVar, 1);
                cbtVar2.ab(objR3);
            }
            int i10 = ((i9 >> 3) & 14) | 384;
            int i11 = i9 >> 12;
            defpackage.aonn aonnVar5 = (defpackage.aonn) objR3;
            defpackage.aooh.f(bbhVar, "lazyListState");
            defpackage.aooh.f(dpqVar, "layoutDirection");
            defpackage.aooh.f(aonnVar5, "onMove");
            java.lang.Object objR4 = cbtVar2.R();
            java.lang.Object obj = defpackage.cau.a;
            if (objR4 == obj) {
                objR4 = defpackage.cbp.a(defpackage.aols.a, cavVarB);
                cbtVar2.ab(objR4);
            }
            int i12 = i10 | (i11 & 57344);
            defpackage.aoss aossVar = (defpackage.aoss) objR4;
            defpackage.cbd cbdVar = defpackage.dfo.h;
            int i13 = (i12 & 14) ^ 6;
            boolean z8 = ((i13 > 4 && cavVarB.B(bbhVar)) || (i12 & 6) == 4) | cavVarB.z(dpqVar.ordinal()) | cavVarB.B(aossVar) | cavVarB.B(aonnVar5) | cavVarB.z(iIntValue);
            java.lang.Object objR5 = cbtVar2.R();
            if (z8 || objR5 == obj) {
                i5 = 4;
                z3 = true;
                cbtVar = cbtVar2;
                defpackage.agii agiiVar = new defpackage.agii(dpqVar, aossVar, new abkv(aonnVar5, 0), bbhVar, iIntValue);
                bbhVar2 = bbhVar;
                cbtVar.ab(agiiVar);
                objR5 = agiiVar;
            } else {
                cbtVar = cbtVar2;
                i5 = 4;
                z3 = true;
                bbhVar2 = bbhVar;
            }
            defpackage.agii agiiVar2 = (defpackage.agii) objR5;
            boolean zD2 = cavVarB.D(agiiVar2) | (((i13 <= i5 || !cavVarB.B(bbhVar2)) && (i12 & 6) != i5) ? false : z3);
            java.lang.Object objR6 = cbtVar.R();
            if (zD2 || objR6 == obj) {
                objR6 = new defpackage.ytl(agiiVar2, bbhVar2, (defpackage.aoln) null, 19);
                cbtVar.ab(objR6);
            }
            defpackage.cbp.g(agiiVar2, (defpackage.aonn) objR6, cavVarB);
            int i14 = i9 >> 6;
            defpackage.aooh.f(cmwVar, "<this>");
            defpackage.aooh.f(agiiVar2, "dragDropState");
            defpackage.aooh.f(aomyVar, "onDragEnd");
            defpackage.aooh.f(aomyVar2, "onDragCancel");
            int i15 = (i9 & 14) | 64 | (i14 & 896) | (i14 & 7168) | (i14 & 57344) | (458752 & i14) | (i14 & 3670016);
            boolean zD3 = (((((i15 & 896) ^ 384) <= 256 || !cavVarB.B(aonjVar)) && (i15 & 384) != 256) ? false : z3) | cavVarB.D(agiiVar2) | ((((3670016 & i15) ^ 1572864) <= 1048576 || !cavVarB.C(false)) ? false : z3) | cavVarB.D((defpackage.kaw) cavVarB.e(cbdVar)) | (((((i15 & 57344) ^ 24576) <= 16384 || !cavVarB.B(aomyVar)) && (i15 & 24576) != 16384) ? false : z3) | (((((458752 & i15) ^ 196608) <= 131072 || !cavVarB.B(aomyVar2)) && (i15 & 196608) != 131072) ? false : z3);
            if (((i15 & 7168) ^ 3072) > 2048) {
                aonnVar4 = aonnVar2;
                if (cavVarB.B(aonnVar4)) {
                    z4 = z3;
                }
                z5 = zD3 | z4;
                objR = cbtVar.R();
                if (z5 || objR == obj) {
                    objR = new defpackage.abkw(aonjVar, agiiVar2, aomyVar, aomyVar2, aonnVar4);
                    cbtVar.ab(objR);
                }
                defpackage.cmw cmwVarA = defpackage.cvy.a(cmwVar, agiiVar2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR);
                if ((i7 & 14) != i5) {
                    list2 = list;
                    if ((i7 & 8) != 0 || !cavVarB.D(list2)) {
                        z6 = false;
                    }
                    if ((i7 & 112) == 32) {
                        z7 = z3;
                    } else {
                        z7 = false;
                    }
                    zD = z6 | z7 | cavVarB.D(agiiVar2);
                    if ((i7 & 896) != 256) {
                        z3 = false;
                    }
                    objR2 = cbtVar.R();
                    if (!(zD | z3) || objR2 == obj) {
                        objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                        cbtVar.ab(objR2);
                    }
                    cavVar2 = cavVarB;
                    defpackage.den.aN(cmwVarA, bbhVar, ayyVar, null, null, null, false, null, null, (defpackage.aonj) objR2, cavVar2, i9 & 1008, 0, 1016);
                } else {
                    list2 = list;
                }
                z6 = z3;
                if ((i7 & 112) == 32) {
                    z7 = z3;
                } else {
                    z7 = false;
                }
                zD = z6 | z7 | cavVarB.D(agiiVar2);
                if ((i7 & 896) != 256) {
                    z3 = false;
                }
                objR2 = cbtVar.R();
                if (!zD && !z3) {
                    objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                    cbtVar.ab(objR2);
                } else {
                    objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                    cbtVar.ab(objR2);
                }
                cavVar2 = cavVarB;
                defpackage.den.aN(cmwVarA, bbhVar, ayyVar, null, null, null, false, null, null, (defpackage.aonj) objR2, cavVar2, i9 & 1008, 0, 1016);
            } else {
                aonnVar4 = aonnVar2;
            }
            if ((i15 & 3072) == 2048) {
                z4 = z3;
            } else {
                z4 = false;
            }
            z5 = zD3 | z4;
            objR = cbtVar.R();
            if (z5) {
                objR = new defpackage.abkw(aonjVar, agiiVar2, aomyVar, aomyVar2, aonnVar4);
                cbtVar.ab(objR);
            } else {
                objR = new defpackage.abkw(aonjVar, agiiVar2, aomyVar, aomyVar2, aonnVar4);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarA2 = defpackage.cvy.a(cmwVar, agiiVar2, (androidx.compose.ui.input.pointer.PointerInputEventHandler) objR);
            if ((i7 & 14) != i5) {
                list2 = list;
                if ((i7 & 8) != 0) {
                }
                z6 = false;
                if ((i7 & 112) == 32) {
                    z7 = z3;
                } else {
                    z7 = false;
                }
                zD = z6 | z7 | cavVarB.D(agiiVar2);
                if ((i7 & 896) != 256) {
                    z3 = false;
                }
                objR2 = cbtVar.R();
                if (!zD && !z3) {
                    objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                    cbtVar.ab(objR2);
                } else {
                    objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                    cbtVar.ab(objR2);
                }
                cavVar2 = cavVarB;
                defpackage.den.aN(cmwVarA2, bbhVar, ayyVar, null, null, null, false, null, null, (defpackage.aonj) objR2, cavVar2, i9 & 1008, 0, 1016);
            } else {
                list2 = list;
            }
            z6 = z3;
            if ((i7 & 112) == 32) {
                z7 = z3;
            } else {
                z7 = false;
            }
            zD = z6 | z7 | cavVarB.D(agiiVar2);
            if ((i7 & 896) != 256) {
                z3 = false;
            }
            objR2 = cbtVar.R();
            if (!zD && !z3) {
                objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                cbtVar.ab(objR2);
            } else {
                objR2 = new defpackage.tfm(list2, aonnVar3, agiiVar2, aonrVar, 5);
                cbtVar.ab(objR2);
            }
            cavVar2 = cavVarB;
            defpackage.den.aN(cmwVarA2, bbhVar, ayyVar, null, null, null, false, null, null, (defpackage.aonj) objR2, cavVar2, i9 & 1008, 0, 1016);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkt(cmwVar, bbhVar, ayyVar, aonnVar, aonjVar, aonnVar2, aomyVar, aomyVar2, num, list, aonnVar3, aonrVar, i, i2);
        }
    }

    public static void aj(defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(395096845);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            abja abjaVar = abja.gn;
            defpackage.aaoo.W(aL(abjaVar, cavVarB), defpackage.dfa.f(2132020701, cavVarB), aJ(cmwVar, abjaVar), defpackage.den.ak(cavVarB).a, cavVarB, 0, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(cmwVar, i, 5);
        }
    }

    public static void ak(long j, defpackage.cmw cmwVar, defpackage.crd crdVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        defpackage.aonn aonnVar2;
        defpackage.cbt cbtVar;
        defpackage.aonn aonnVar3 = aonnVar;
        defpackage.aooh.f(aonnVar3, "content");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(157563386);
        if (i3 == 0) {
            i2 = (true != cavVarB.A(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(crdVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != cavVarB.D(aonnVar3) ? 1024 : 2048;
        }
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar2.x);
            defpackage.cje cjeVarAi = cbtVar2.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmtVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar2.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar4 = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarB, aonnVar4);
            defpackage.aonn aonnVar5 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar5);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar6 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar6);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar7 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar7);
            cmwVar2 = cmtVar;
            int i5 = i4;
            defpackage.cmw cmwVarK = defpackage.cfd.K(defpackage.azm.c(cmtVar, 1.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, crdVar, true, 0, 1042431);
            int i6 = i5 & 14;
            java.lang.Object objR = cbtVar2.R();
            if (i6 == 4 || objR == defpackage.cau.a) {
                objR = new abks(j);
                cbtVar = cbtVar2;
                cbtVar.ab(objR);
            } else {
                cbtVar = cbtVar2;
            }
            defpackage.cye cyeVar = (defpackage.cye) objR;
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarK);
            int i7 = ((i5 >> 9) & 14) << 6;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar, aonnVar4);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar5);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar6);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar7);
            defpackage.aonn aonnVar8 = aonnVar;
            aonnVar8.a(cavVarB, java.lang.Integer.valueOf(((i7 & 896) >> 6) & 14));
            cbtVar.W(true);
            cbtVar.W(true);
            aonnVar2 = aonnVar8;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            aonnVar2 = aonnVar3;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(j, cmwVar2, crdVar, aonnVar2, i, 7);
        }
    }

    public static void al(abkh abkhVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(765030636);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cmw cmwVarC = defpackage.azm.c(defpackage.cmw.c, 1.0f);
            android.net.Uri uri = abkhVar.a;
            int i4 = i2 & 14;
            cwy cwyVar = defpackage.cwx.a;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i4 == 4 || objR == defpackage.cau.a) {
                objR = new abgj(abkhVar, 11);
                cbtVar.ab(objR);
            }
            xtm.a(uri, (java.lang.String) null, cmwVarC, (defpackage.cmj) null, cwyVar, 0.0f, (defpackage.aonj) objR, cavVarB, 24960, 488);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abkhVar, i, 4);
        }
    }

    public static void am(abjr abjrVar, defpackage.cav cavVar, int i) {
        int i2;
        abja abjaVar;
        long jM;
        long j;
        long j2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1156091810);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abjrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            int i4 = abjrVar.a - 1;
            if (i4 == 0) {
                cavVarB.u(211811337);
                abjaVar = abja.N;
                jM = defpackage.den.ak(cavVarB).r;
                j = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
            } else if (i4 == 1) {
                cavVarB.u(211992098);
                abjaVar = abja.ck;
                jM = defpackage.den.ak(cavVarB).r;
                j = defpackage.den.ak(cavVarB).q;
                ((defpackage.cbt) cavVarB).W(false);
            } else if (i4 == 2) {
                cavVarB.u(212182128);
                abjaVar = abja.az;
                jM = defpackage.den.ak(cavVarB).a;
                j = defpackage.den.ak(cavVarB).b;
                ((defpackage.cbt) cavVarB).W(false);
            } else if (i4 != 3) {
                if (i4 != 4) {
                    cavVarB.u(212718707);
                    ((defpackage.cbt) cavVarB).W(false);
                    abjaVar = abja.eG;
                    jM = defpackage.cfd.M(533186503);
                    j2 = -4310450653102080L;
                } else {
                    cavVarB.u(212524709);
                    abjaVar = abja.eG;
                    jM = defpackage.den.ak(cavVarB).r;
                    j = defpackage.den.ak(cavVarB).w;
                    ((defpackage.cbt) cavVarB).W(false);
                }
                an(abjaVar, j2, jM, cavVarB, 0);
            } else {
                cavVarB.u(212353682);
                abjaVar = abja.fq;
                jM = defpackage.abts.F(cavVarB).h;
                j = defpackage.abts.F(cavVarB).i;
                ((defpackage.cbt) cavVarB).W(false);
            }
            j2 = j;
            an(abjaVar, j2, jM, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abjrVar, i, 1);
        }
    }

    public static void an(abja abjaVar, long j, long j2, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1707120520);
        if (i3 == 0) {
            i2 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j2) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarA = defpackage.azm.c(cmtVar, 1.0f).a(new defpackage.amq(j2, null, defpackage.cqz.a, 2));
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarA);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.W(aL(abjaVar, cavVarB), null, aJ(defpackage.awt.a.a(defpackage.azm.c(cmtVar, 0.6f), defpackage.cmh.e), abjaVar), j, cavVarB, (i2 << 6) & 7168, 0);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkm(abjaVar, j, j2, i);
        }
    }

    public static void ao(abko abkoVar, defpackage.cmw cmwVar, defpackage.crd crdVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.bgc bgcVar;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1256956460);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(abkoVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0 && cavVarB.B(crdVar)) {
                i6 = 256;
            }
            i3 |= i6;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i7 = i2 & 4;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                if (i5 != 0) {
                    cmwVar = defpackage.cmw.c;
                }
                if (i7 != 0) {
                    j$.util.Objects.checkIndex(0, 3);
                    if (abkoVar instanceof abkp) {
                        i3 &= -897;
                        cavVarB.u(-25448943);
                        abjz abjzVarA = ((abkp) abkoVar).a.a();
                        defpackage.aooh.f(abjzVarA, "<this>");
                        int iOrdinal = abjzVarA.ordinal();
                        if (iOrdinal == 0) {
                            cavVarB.u(-1282452461);
                            cbtVar.W(false);
                            bgcVar = defpackage.bge.a;
                        } else {
                            if (iOrdinal != 1) {
                                cavVarB.u(-1282453697);
                                cbtVar.W(false);
                                throw new defpackage.aois();
                            }
                            cavVarB.u(-1282450415);
                            ely elyVarC = bqt.g;
                            if (elyVarC == null) {
                                elyVarC = akf.e(new float[]{0.5f, 0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, -0.5f}, bqt.b, (java.util.List) null, 0.0f, 0.0f).c();
                                bqt.g = elyVarC;
                            }
                            boolean zB = cavVarB.B(elyVarC) | cavVarB.z(0);
                            java.lang.Object objR = cbtVar.R();
                            if (zB || objR == defpackage.cau.a) {
                                objR = new bqu(elyVarC);
                                cbtVar.ab(objR);
                            }
                            bgcVar = (bqu) objR;
                            cbtVar.W(false);
                        }
                        cbtVar.W(false);
                    } else {
                        if (abkoVar instanceof abjq) {
                            cavVarB.u(-788866732);
                            throw null;
                        }
                        i3 &= -897;
                        cavVarB.u(-25442516);
                        cbtVar.W(false);
                        bgcVar = defpackage.bge.a;
                    }
                    crdVar = bgcVar;
                }
            } else {
                cavVarB.s();
                if (i7 != 0) {
                    i3 &= -897;
                }
            }
            cavVarB.l();
            au(cmwVar, defpackage.cfo.j(-197934756, new zjn(abkoVar, crdVar, 8), cavVarB), cavVarB, ((i3 >> 3) & 14) | 48);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.crd crdVar2 = crdVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqg(abkoVar, cmwVar2, crdVar2, i, i2, 7);
        }
    }

    public static void ap(abjt abjtVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1668583419);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abjtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            long jCF = cF(abjtVar.b, cavVarB);
            defpackage.aomy aomyVar = defpackage.abts.G(cavVarB).f;
            java.lang.Boolean.FALSE.booleanValue();
            cavVarB.u(1183080357);
            long j = defpackage.den.ak(cavVarB).v;
            ((defpackage.cbt) cavVarB).W(false);
            defpackage.rz.f(defpackage.azm.c(defpackage.cmw.c, 1.0f).a(new defpackage.amq(jCF, null, defpackage.cqz.a, 2)), null, defpackage.cfo.j(1233865819, new abkk(abjtVar, defpackage.abts.F(cavVarB).b.a(jCF, j)), cavVarB), cavVarB, 3072);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abjtVar, i, 0);
        }
    }

    public static void aq(abju abjuVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1081145477);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abjuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            long jCF = cF(abjuVar.b, cavVarB);
            defpackage.aomy aomyVar = defpackage.abts.G(cavVarB).f;
            java.lang.Boolean.FALSE.booleanValue();
            cavVarB.u(-444925681);
            long j = defpackage.den.ak(cavVarB).v;
            ((defpackage.cbt) cavVarB).W(false);
            an(abjuVar.a, defpackage.abts.F(cavVarB).b.a(jCF, j), jCF, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(abjuVar, i, 20);
        }
    }

    public static void ar(abki abkiVar, defpackage.cav cavVar, int i) {
        int i2;
        long j;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-124455080);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            j$.util.Objects.checkIndex(0, 8);
            if (abkiVar instanceof abjs) {
                cavVarB.u(-1084397936);
                defpackage.azm.c(defpackage.cmw.c, 1.0f);
                throw null;
            }
            if (abkiVar instanceof abjt) {
                cavVarB.u(657763313);
                ap((abjt) abkiVar, cavVarB, i2 & 14);
                ((defpackage.cbt) cavVarB).W(false);
            } else if (abkiVar instanceof abju) {
                cavVarB.u(657765393);
                aq((abju) abkiVar, cavVarB, i2 & 14);
                ((defpackage.cbt) cavVarB).W(false);
            } else if (abkiVar instanceof abka) {
                cavVarB.u(657767660);
                as(cavVarB, 0);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                if (abkiVar instanceof abkb) {
                    cavVarB.u(-1083964463);
                    defpackage.azm.c(defpackage.cmw.c, 1.0f);
                    throw null;
                }
                if (abkiVar instanceof abkh) {
                    cavVarB.u(657777074);
                    al((abkh) abkiVar, cavVarB, i2 & 14);
                    ((defpackage.cbt) cavVarB).W(false);
                } else {
                    if (!(abkiVar instanceof abkg)) {
                        cavVarB.u(657754809);
                        ((defpackage.cbt) cavVarB).W(false);
                        throw new defpackage.aois();
                    }
                    cavVarB.u(657779605);
                    abkc abkcVar = ((abkg) abkiVar).a;
                    j$.util.Objects.checkIndex(0, 4);
                    if (abkcVar instanceof abkd) {
                        cavVarB.u(1501012421);
                        j = defpackage.den.ak(cavVarB).G;
                        ((defpackage.cbt) cavVarB).W(false);
                    } else {
                        if (!(abkcVar instanceof abke)) {
                            if (abkcVar instanceof abkc) {
                                cavVarB.u(1501018013);
                                ((defpackage.cbt) cavVarB).W(false);
                                throw null;
                            }
                            cavVarB.u(1501009740);
                            ((defpackage.cbt) cavVarB).W(false);
                            throw new defpackage.aois();
                        }
                        cavVarB.u(1501015880);
                        j = defpackage.den.ak(cavVarB).H;
                        ((defpackage.cbt) cavVarB).W(false);
                    }
                    av(j, cavVarB, 0);
                    ((defpackage.cbt) cavVarB).W(false);
                }
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abkiVar, i, 3);
        }
    }

    public static void as(defpackage.cav cavVar, int i) {
        defpackage.cav cavVarB = cavVar.b(-1681411385);
        if (cavVarB.H(i != 0, i & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cmw cmwVarC = defpackage.azm.c(cmtVar, 1.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.e, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarC);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.aaoo.S(defpackage.azm.c(cmtVar, 0.6f), 0L, null, cavVarB, 6, 6);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new peb(i, 9);
        }
    }

    public static void at(abkp abkpVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1492645438);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abkpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            ar(abkpVar.a, cavVarB, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkl(abkpVar, i, 2);
        }
    }

    public static void au(defpackage.cmw cmwVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(432115036);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = bgg.f;
                cbtVar.ab(objR);
            }
            defpackage.cye cyeVar = (defpackage.cye) objR;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            int i4 = ((((i2 >> 3) & 14) | 384) | ((i2 << 3) & 112)) << 6;
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVar, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonnVar.a(cavVarB, java.lang.Integer.valueOf(((i4 & 896) >> 6) & 14));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(cmwVar, aonnVar, i, 8);
        }
    }

    public static void av(long j, defpackage.cav cavVar, int i) {
        int i2;
        long j2;
        long j3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2039348406);
        if (i3 == 0) {
            i2 = (true != cavVarB.A(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            abja abjaVar = abja.ea;
            defpackage.aomy aomyVar = defpackage.abts.G(cavVarB).f;
            java.lang.Boolean.FALSE.booleanValue();
            cavVarB.u(-1915680612);
            if (defpackage.abts.K(cavVarB)) {
                cavVarB.u(-1915648093);
                j3 = defpackage.abts.J(cavVarB).j;
                cbtVar.W(false);
            } else {
                cavVarB.u(-1915589565);
                j3 = defpackage.abts.J(cavVarB).k;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            long j4 = j3;
            j2 = j;
            an(abjaVar, j4, j2, cavVarB, ((i2 << 6) & 896) | 6);
        } else {
            j2 = j;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abkj(j2, i);
        }
    }

    public static void aw(abjq abjqVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(938388580);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abjqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(abjqVar, i, 19);
        }
    }

    public static java.util.List ax(java.util.List list, defpackage.aonn aonnVar) {
        java.util.List listAY;
        abjp abjpVar;
        defpackage.aooh.f(list, "data");
        int size = list.size();
        if (size == 1) {
            listAY = defpackage.ajsz.aY(abjp.d);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            int i = 0;
            while (i < size) {
                if (i == 0) {
                    abjpVar = abjp.a;
                } else {
                    abjpVar = i == size + (-1) ? abjp.c : abjp.b;
                }
                arrayList.add(abjpVar);
                i++;
            }
            listAY = arrayList;
        }
        java.util.Iterator it = list.iterator();
        java.util.Iterator it2 = listAY.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(java.lang.Math.min(defpackage.ajsz.bl(list, 10), defpackage.ajsz.bl(listAY, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList2.add(aonnVar.a(it.next(), it2.next()));
        }
        return arrayList2;
    }

    public static defpackage.crd ay(abjp abjpVar) {
        defpackage.aooh.f(abjpVar, "$this$toShape");
        float f = true != abjpVar.e ? 4.0f : 16.0f;
        float f2 = true == abjpVar.f ? 16.0f : 4.0f;
        return defpackage.bge.c(f, f, f2, f2);
    }

    public static abjl az(abjl abjlVar, float f) {
        defpackage.aooh.f(abjlVar, "<this>");
        if (f == 1.0f) {
            return abjlVar;
        }
        return new abjl(abjlVar.b, abjlVar.c * f, abjlVar.d * f);
    }

    public static aeih b(aeip aeipVar, java.lang.String str) {
        return new aeih(aeipVar, str);
    }

    public static void bA(abhs abhsVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        abil abilVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(717217560);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            abja abjaVar = abhsVar.a;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int i5 = i4 << 9;
            bI(new abhw(abjaVar), abhsVar.b, abhsVar.e, abhsVar.c, cmtVar, abilVar, abhsVar.f, defpackage.cfo.j(144322638, new defpackage.ubr(abhsVar, 12), cavVarB), cavVarB, (57344 & i5) | 12582912 | (i5 & 458752));
            abilVar2 = abilVar;
            cmwVar2 = cmtVar;
        } else {
            abilVar2 = abilVar;
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abhsVar, cmwVar2, abilVar2, i, 3);
        }
    }

    public static void bB(abht abhtVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        abil abilVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-642069188);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhtVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            abhv abhvVar = abhtVar.e;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int i5 = i4 >> 3;
            abilVar2 = abilVar;
            bq(cmtVar, abilVar2, abhvVar, false, defpackage.cfo.j(338889582, new defpackage.ubr(abhtVar, 13), cavVarB), cavVarB, (i5 & 14) | 27648 | (i5 & 112));
            cmwVar = cmtVar;
        } else {
            abilVar2 = abilVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(abhtVar, cmwVar, abilVar2, i, 18);
        }
    }

    public static void bC(abhu abhuVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        abil abilVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1907883907);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int i5 = i4 >> 3;
            abilVar2 = abilVar;
            bq(cmtVar, abilVar2, null, true, defpackage.cfo.j(-693994223, new xpf(6), cavVarB), cavVarB, (i5 & 14) | 27648 | (i5 & 112));
            cmwVar = cmtVar;
        } else {
            abilVar2 = abilVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(abhuVar, cmwVar, abilVar2, i, 20);
        }
    }

    public static void bD(abhx abhxVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        abil abilVar2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-94717028);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            int i5 = i4 & 14;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.aojh aojhVar = defpackage.aojh.a;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (i5 == 4 || objR == defpackage.cau.a) {
                objR = new defpackage.zhb(abhxVar, (defpackage.aoln) null, 17);
                cbtVar.ab(objR);
            }
            defpackage.cbp.g(aojhVar, (defpackage.aonn) objR, cavVarB);
            int i6 = i4 << 9;
            bI(abhxVar.h, abhxVar.a, abhxVar.e, abhxVar.b, cmtVar, abilVar, abhxVar.g, defpackage.cfo.j(-1501215790, new defpackage.ubr(abhxVar, 11), cavVarB), cavVarB, (57344 & i6) | 12582912 | (i6 & 458752));
            abilVar2 = abilVar;
            cmwVar2 = cmtVar;
        } else {
            abilVar2 = abilVar;
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abhxVar, cmwVar2, abilVar2, i, 0);
        }
    }

    public static void bE(abhl abhlVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        abil abilVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-786070742);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            int i5 = i4 >> 3;
            abilVar2 = abilVar;
            bq(cmtVar, abilVar2, null, false, defpackage.cfo.j(1412993720, new xpf(7), cavVarB), cavVarB, (i5 & 14) | 27648 | (i5 & 112));
            cmwVar = cmtVar;
        } else {
            abilVar2 = abilVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abhlVar, cmwVar, abilVar2, i, 4);
        }
    }

    public static void bF(abhy abhyVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(133863488);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(abhyVar, abilVar, i, 1);
        }
    }

    public static void bG(abhz abhzVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(710760668);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(abhzVar, abilVar, i, 20, null);
        }
    }

    public static void bH(abhi abhiVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1569487225);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            j$.util.Objects.checkIndex(0, 3);
            cavVarB.u(-743697504);
            defpackage.rd.f(defpackage.wv.k(abhiVar.a, cavVarB, 0), null, cmwVar, null, null, 0.0f, cavVarB, ((i2 << 3) & 896) | 8, 120);
            cmwVar2 = cmwVar;
            ((defpackage.cbt) cavVarB).W(false);
        } else {
            cmwVar2 = cmwVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(abhiVar, cmwVar2, i, 2, (byte[]) null);
        }
    }

    public static void bI(abhw abhwVar, java.lang.String str, defpackage.aomy aomyVar, java.lang.String str2, defpackage.cmw cmwVar, abil abilVar, abhv abhvVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.aomy aomyVar2;
        java.lang.String str3;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1288924864);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(abhwVar) : cavVarB.D(abhwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aomyVar2 = aomyVar;
            i2 |= true != cavVarB.D(aomyVar2) ? 128 : 256;
        } else {
            aomyVar2 = aomyVar;
        }
        if ((i & 3072) == 0) {
            str3 = str2;
            i2 |= true != cavVarB.B(str3) ? 1024 : 2048;
        } else {
            str3 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(abilVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != cavVarB.B(abhvVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 4194304 : 8388608;
        }
        int i4 = i2;
        if (cavVarB.H((4793491 & i4) != 4793490, i4 & 1)) {
            int i5 = i4 >> 12;
            cavVar2 = cavVarB;
            bq(cmwVar, abilVar, abhvVar, false, defpackage.cfo.j(178068174, new fxd(str3, aonnVar, abhwVar, str, aomyVar2, 3), cavVarB), cavVar2, (i5 & 14) | 27648 | (i5 & 112) | (i5 & 896));
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abib(abhwVar, str, aomyVar, str2, cmwVar, abilVar, abhvVar, aonnVar, i, 0);
        }
    }

    public static void bJ(abhw abhwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        long j2;
        long j3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1429977353);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? cavVarB.B(abhwVar) : cavVarB.D(abhwVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if (cavVarB.H((i2 & 19) != 18, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                j3 = defpackage.den.ak(cavVarB).a;
            } else {
                cavVarB.s();
                j3 = j;
            }
            cavVarB.l();
            defpackage.bvo.b(defpackage.azm.g(defpackage.den.ba(defpackage.cmw.c, 0.0f, 0.0f, 12.0f, 0.0f), 28.0f), defpackage.bge.a, j3, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(-26826162, new defpackage.ubr(abhwVar, 10), cavVarB), cavVarB, 120);
            j2 = j3;
        } else {
            cavVarB.s();
            j2 = j;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(abhwVar, j2, i, 3);
        }
    }

    public static void bK(abhi abhiVar, java.lang.String str, defpackage.aomy aomyVar, java.lang.String str2, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-733407346);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(str2) ? 1024 : 2048;
        }
        int i4 = i2 | 24576;
        if (cavVarB.H((i4 & 9363) != 9362, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.rz.f(cmtVar, null, defpackage.cfo.j(-980922632, new defpackage.afd(abhiVar, str2, str, aomyVar, 5, null), cavVarB), cavVarB, ((i4 >> 12) & 14) | 3072);
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new alh(abhiVar, str, aomyVar, str2, cmwVar2, i, 18);
        }
    }

    public static /* synthetic */ defpackage.aojh bL(oq oqVar, defpackage.cav cavVar, int i) {
        defpackage.aooh.f(oqVar, "it");
        if (!cavVar.H((i & 17) != 16, i & 1)) {
            cavVar.s();
        }
        return defpackage.aojh.a;
    }

    public static void bM(defpackage.vx vxVar, abio abioVar, bpw bpwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.vx vxVar2;
        bpw bpwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2135963012);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(vxVar) : cavVarB.D(vxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abioVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            j$.util.Objects.checkIndex(0, 3);
            if (abioVar != null) {
                if (abioVar instanceof abim) {
                    cavVarB.u(1761508251);
                    abim abimVar = (abim) abioVar;
                    abja abjaVar = abimVar.a;
                    java.lang.String str = abimVar.b;
                    defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                    java.lang.Object objR = cbtVar.R();
                    if (objR == defpackage.cau.a) {
                        objR = new defpackage.kaw((byte[]) null, (char[]) null, (byte[]) null);
                        cbtVar.ab(objR);
                    }
                    vxVar2 = vxVar;
                    cw(vxVar2, abjaVar, str, bpwVar, (defpackage.kaw) objR, abimVar.c, cavVarB, (i2 & 14) | 24576 | ((i2 << 3) & 7168));
                    bpwVar2 = bpwVar;
                    cbtVar.W(false);
                } else if (abioVar instanceof abin) {
                    cavVarB.u(1761777641);
                    throw null;
                }
            }
            cavVarB.u(333916409);
            ((defpackage.cbt) cavVarB).W(false);
            throw new defpackage.aois();
        }
        vxVar2 = vxVar;
        bpwVar2 = bpwVar;
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(vxVar2, abioVar, bpwVar2, i, 6);
        }
    }

    public static synchronized boolean bN(android.content.Context context) {
        boolean zBooleanValue;
        java.lang.Boolean bool;
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.Context context2 = a;
        if (context2 == null || (bool = c) == null || context2 != applicationContext) {
            c = null;
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(aa$.ExternalSyntheticApiModelOutline0.m(applicationContext.getPackageManager()));
            c = boolValueOf;
            a = applicationContext;
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = bool.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean bO(android.content.Context context, int i) {
        if (!bP(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            defpackage.aaco aacoVarA = defpackage.aaco.a(context);
            if (packageInfo == null) {
                return false;
            }
            if (!defpackage.aaco.d(packageInfo, false)) {
                if (!defpackage.aaco.d(packageInfo, true)) {
                    return false;
                }
                if (!defpackage.aacn.e(aacoVarA.a)) {
                    android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                    return false;
                }
            }
            return true;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            if (!android.util.Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            android.util.Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean bP(android.content.Context context, int i, java.lang.String str) {
        try {
            android.app.AppOpsManager appOpsManager = (android.app.AppOpsManager) ((android.content.Context) defpackage.aaiy.b(context).a).getSystemService("appops");
            if (appOpsManager == null) {
                throw new java.lang.NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i, str);
            return true;
        } catch (java.lang.SecurityException unused) {
            return false;
        }
    }

    public static void bQ(android.content.Context context) {
        try {
            defpackage.aais.as(context);
        } catch (java.lang.Exception e) {
            android.util.Log.e("CrashUtils", "Error adding exception to DropBox!", e);
        }
    }

    public static boolean bR(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static com.google.android.gms.common.internal.safeparcel.SafeParcelable bS(byte[] bArr, android.os.Parcelable.Creator creator) {
        defpackage.aais.as(creator);
        int length = bArr.length;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, length);
        parcelObtain.setDataPosition(0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable = (com.google.android.gms.common.internal.safeparcel.SafeParcelable) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return safeParcelable;
    }

    public static byte[] bT(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        safeParcelable.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }

    public static void bU(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable, android.content.Intent intent) {
        intent.putExtra("EXTRA_IN_PRODUCT_HELP", bT(safeParcelable));
    }

    public static boolean bV(android.os.Bundle bundle, android.os.Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
        } else if (bundle.size() == bundle2.size()) {
            java.util.Set<java.lang.String> setKeySet = bundle.keySet();
            if (setKeySet.containsAll(bundle2.keySet())) {
                for (java.lang.String str : setKeySet) {
                    if (!j$.util.Objects.equals(bundle.get(str), bundle2.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static java.lang.String bW(java.util.List list, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        sb.append(obj.getClass().getSimpleName());
        sb.append('{');
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((java.lang.String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static void bX(java.lang.String str, java.lang.Object obj, java.util.List list) {
        list.add(str + '=' + java.lang.String.valueOf(obj));
    }

    public static defpackage.aacw bY(com.google.android.gms.common.api.Status status) {
        return status.h != null ? new aadk(status) : new defpackage.aacw(status);
    }

    public static int bZ(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static void ba(java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.dkz dkzVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.dkz dkzVar2;
        defpackage.cav cavVar2;
        defpackage.aooh.f(str, "text");
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1477508975);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            dkzVar2 = dkzVar;
            i2 |= true != cavVarB.B(dkzVar2) ? 1024 : 2048;
        } else {
            dkzVar2 = dkzVar;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, cmwVar, j, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, defpackage.dkz.z(dkzVar2, 0L, 0L, null, null, null, "tnum", 0L, 0L, null, 0, 0L, null, null, 0, 0, 16777151), cavVar2, i2 & 1022, 24576, 114680);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(str, cmwVar, j, dkzVar, i, 6);
        }
    }

    public static defpackage.cer bb(defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        defpackage.aooh.f(aomyVar, "elapsedTime");
        boolean z = true;
        boolean z2 = (((i & 112) ^ 48) > 32 && cavVar.B(aomyVar)) || (i & 48) == 32;
        defpackage.cbt cbtVar = (defpackage.cbt) cavVar;
        java.lang.Object objR = cbtVar.R();
        if (z2 || objR == defpackage.cau.a) {
            objR = new abgd(aomyVar, 17);
            cbtVar.ab(objR);
        }
        defpackage.aomy aomyVar2 = (defpackage.aomy) objR;
        java.lang.Object objA = aomyVar2.a();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if ((((i & 14) ^ 6) <= 4 || !cavVar.C(true)) && (i & 6) != 4) {
            z = false;
        }
        boolean zB = z | cavVar.B(aomyVar2);
        java.lang.Object objR2 = cbtVar.R();
        if (zB || objR2 == defpackage.cau.a) {
            objR2 = new abiw(aomyVar2, (defpackage.aoln) null, 0);
            cbtVar.ab(objR2);
        }
        return rr.e(objA, bool, aomyVar2, (defpackage.aonn) objR2, cavVar);
    }

    public static void bc(abiv abivVar, defpackage.cmw cmwVar, int i, defpackage.ayy ayyVar, long j, boolean z, defpackage.cav cavVar, int i2) {
        int i3;
        int i4;
        defpackage.ayy ayyVar2;
        long j2;
        boolean z2;
        int i5 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1711980273);
        if (i5 == 0) {
            i3 = i2 | (true != cavVarB.B(abivVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        int i6 = i3 | 224640;
        if (cavVarB.H((74899 & i6) != 74898, i6 & 1)) {
            long jM = defpackage.cfd.M(0);
            defpackage.ayy ayyVar3 = defpackage.ayx.a;
            defpackage.cmw cmwVarAX = defpackage.den.aX(rl.f(cmwVar, rl.e(cavVarB, 0), false), ayyVar3);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarAX);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            defpackage.awt awtVar = defpackage.awt.a;
            defpackage.bry bryVarAl = defpackage.den.al(cavVarB);
            defpackage.cmw cmwVarA = awtVar.a(defpackage.cmw.c, defpackage.cmh.d);
            java.util.List list = abivVar.a;
            defpackage.agf agfVarJ = defpackage.aga.j(bryVarAl.b(), 0.0f, 0L, 6);
            defpackage.agg aggVarK = defpackage.aga.k(bryVarAl.b(), 0.0f, 0L, 6);
            java.lang.Object objR = cbtVar.R();
            if (objR == defpackage.cau.a) {
                objR = new yrz(18);
                cbtVar.ab(objR);
            }
            defpackage.afsq.bu(list, (defpackage.aonj) objR, cmwVarA, agfVarJ, aggVarK, null, defpackage.cfo.j(1491967385, new abit(jM), cavVarB), cavVarB, 14155824);
            cbtVar.W(true);
            ayyVar2 = ayyVar3;
            i4 = 1;
            z2 = true;
            j2 = jM;
        } else {
            cavVarB.s();
            i4 = i;
            ayyVar2 = ayyVar;
            j2 = j;
            z2 = z;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abiu(abivVar, cmwVar, i4, ayyVar2, j2, z2, i2);
        }
    }

    public static void bd(abja abjaVar, int i, defpackage.cav cavVar, int i2) {
        int i3;
        long jS;
        int i4 = i2 & 6;
        defpackage.cav cavVarB = cavVar.b(-1786227646);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != cavVarB.z(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != cavVarB.z(0) ? 128 : 256;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i5 = i - 1;
            cavVarB.u(1422154329);
            defpackage.cmw cmwVarAO = defpackage.cmw.c;
            if (i == 2) {
                cmwVarAO = aO(cmwVarAO, defpackage.abts.F(cavVarB).w);
                i = 2;
            }
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            defpackage.csx csxVarAL = aL(abjaVar, cavVarB);
            if (i5 == 0) {
                cavVarB.u(1422165353);
                jS = ((defpackage.cqg) cavVarB.e(defpackage.boy.a)).a;
                cbtVar.W(false);
            } else if (i5 != 1) {
                cavVarB.u(1422169069);
                jS = defpackage.abts.F(cavVarB).s;
                cbtVar.W(false);
            } else {
                cavVarB.u(1422166829);
                cbtVar.W(false);
                jS = defpackage.cfd.S();
            }
            defpackage.aaoo.W(csxVarAL, null, cmwVarAO, jS, cavVarB, 0, 0);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbt(abjaVar, i, i2, 4);
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [ajl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [ajl, java.lang.Object] */
    public static void be(abis abisVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        abis abisVar2;
        long j2;
        java.lang.Object objF;
        long j3;
        long j4;
        long j5;
        java.lang.Object objF2;
        long j6;
        long j7;
        defpackage.cja cjaVar;
        defpackage.cja cjaVar2;
        defpackage.cav cavVarB = cavVar.b(-1857730643);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(abisVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(0) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.A(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(true) ? 1024 : 2048;
        }
        if (cavVarB.H((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.alg algVarD = defpackage.alk.d(java.lang.Boolean.valueOf(abisVar.d), cavVarB, 0);
            smd smdVar = smd.e;
            boolean zBooleanValue = ((java.lang.Boolean) algVarD.h()).booleanValue();
            cavVarB.u(-1354689621);
            if (zBooleanValue) {
                cavVarB.u(-2045770307);
                j2 = defpackage.den.ak(cavVarB).d;
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(-2045706943);
                j2 = defpackage.den.ak(cavVarB).B;
                ((defpackage.cbt) cavVarB).W(false);
            }
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.W(false);
            defpackage.crn crnVarF = defpackage.cqg.f(j2);
            boolean zB = cavVarB.B(crnVarF);
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = afn.a.a(crnVarF);
                cbtVar.ab(objR);
            }
            defpackage.nf nfVar = (defpackage.nf) objR;
            if (algVarD.C()) {
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF = algVarD.f();
            } else {
                cavVarB.u(1666573488);
                boolean zB2 = cavVarB.B(algVarD);
                objF = cbtVar.R();
                if (zB2 || objF == defpackage.cau.a) {
                    defpackage.cko ckoVarG = defpackage.cfd.g();
                    defpackage.aonj aonjVarI = ckoVarG != null ? ckoVarG.i() : null;
                    defpackage.cko ckoVarH = defpackage.cfd.h(ckoVarG);
                    try {
                        java.lang.Object objF3 = algVarD.f();
                        defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        cbtVar.ab(objF3);
                        objF = objF3;
                    } catch (java.lang.Throwable th) {
                        defpackage.cfd.i(ckoVarG, ckoVarH, aonjVarI);
                        throw th;
                    }
                }
                cbtVar.W(false);
            }
            boolean zBooleanValue2 = ((java.lang.Boolean) objF).booleanValue();
            cavVarB.u(-1354689621);
            if (zBooleanValue2) {
                cavVarB.u(-2045770307);
                j3 = defpackage.den.ak(cavVarB).d;
                cbtVar.W(false);
            } else {
                cavVarB.u(-2045706943);
                j3 = defpackage.den.ak(cavVarB).B;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            defpackage.cqg cqgVar = new defpackage.cqg(j3);
            boolean zB3 = cavVarB.B(algVarD);
            java.lang.Object objR2 = cbtVar.R();
            if (zB3 || objR2 == defpackage.cau.a) {
                abgd abgdVar = new abgd(algVarD, 15);
                defpackage.ajxw ajxwVar = defpackage.ceo.a;
                objR2 = new defpackage.cbk(abgdVar, null);
                cbtVar.ab(objR2);
            }
            boolean zBooleanValue3 = ((java.lang.Boolean) ((defpackage.cer) objR2).a()).booleanValue();
            cavVarB.u(-1354689621);
            if (zBooleanValue3) {
                cavVarB.u(-2045770307);
                j4 = defpackage.den.ak(cavVarB).d;
                cbtVar.W(false);
            } else {
                cavVarB.u(-2045706943);
                j4 = defpackage.den.ak(cavVarB).B;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            defpackage.cqg cqgVar2 = new defpackage.cqg(j4);
            boolean zB4 = cavVarB.B(algVarD);
            java.lang.Object objR3 = cbtVar.R();
            if (zB4 || objR3 == defpackage.cau.a) {
                bmx bmxVar = new bmx(algVarD, 17);
                defpackage.ajxw ajxwVar2 = defpackage.ceo.a;
                objR3 = new defpackage.cbk(bmxVar, null);
                cbtVar.ab(objR3);
            }
            defpackage.cer cerVarE = defpackage.alk.e(algVarD, cqgVar, cqgVar2, smdVar.a(((defpackage.cer) objR3).a(), cavVarB, 0), nfVar, cavVarB, 0);
            smd smdVar2 = smd.f;
            boolean zBooleanValue4 = ((java.lang.Boolean) algVarD.h()).booleanValue();
            cavVarB.u(285810668);
            if (zBooleanValue4) {
                cavVarB.u(1960445404);
                j5 = defpackage.den.ak(cavVarB).d;
                cbtVar.W(false);
            } else {
                cavVarB.u(1960508613);
                j5 = defpackage.den.ak(cavVarB).q;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            defpackage.crn crnVarF2 = defpackage.cqg.f(j5);
            boolean zB5 = cavVarB.B(crnVarF2);
            java.lang.Object objR4 = cbtVar.R();
            if (zB5 || objR4 == defpackage.cau.a) {
                objR4 = afn.a.a(crnVarF2);
                cbtVar.ab(objR4);
            }
            defpackage.nf nfVar2 = (defpackage.nf) objR4;
            if (algVarD.C()) {
                cavVarB.u(1666827533);
                cbtVar.W(false);
                objF2 = algVarD.f();
            } else {
                cavVarB.u(1666573488);
                boolean zB6 = cavVarB.B(algVarD);
                objF2 = cbtVar.R();
                if (zB6 || objF2 == defpackage.cau.a) {
                    defpackage.cko ckoVarG2 = defpackage.cfd.g();
                    defpackage.aonj aonjVarI2 = ckoVarG2 != null ? ckoVarG2.i() : null;
                    defpackage.cko ckoVarH2 = defpackage.cfd.h(ckoVarG2);
                    try {
                        java.lang.Object objF4 = algVarD.f();
                        defpackage.cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        cbtVar.ab(objF4);
                        objF2 = objF4;
                    } catch (java.lang.Throwable th2) {
                        defpackage.cfd.i(ckoVarG2, ckoVarH2, aonjVarI2);
                        throw th2;
                    }
                }
                cbtVar.W(false);
            }
            boolean zBooleanValue5 = ((java.lang.Boolean) objF2).booleanValue();
            cavVarB.u(285810668);
            if (zBooleanValue5) {
                cavVarB.u(1960445404);
                long j8 = defpackage.den.ak(cavVarB).d;
                cbtVar.W(false);
                j6 = j8;
            } else {
                cavVarB.u(1960508613);
                j6 = defpackage.den.ak(cavVarB).q;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            defpackage.cqg cqgVar3 = new defpackage.cqg(j6);
            boolean zB7 = cavVarB.B(algVarD);
            java.lang.Object objR5 = cbtVar.R();
            if (zB7 || objR5 == defpackage.cau.a) {
                abgd abgdVar2 = new abgd(algVarD, 16);
                defpackage.ajxw ajxwVar3 = defpackage.ceo.a;
                objR5 = new defpackage.cbk(abgdVar2, null);
                cbtVar.ab(objR5);
            }
            boolean zBooleanValue6 = ((java.lang.Boolean) ((defpackage.cer) objR5).a()).booleanValue();
            cavVarB.u(285810668);
            if (zBooleanValue6) {
                cavVarB.u(1960445404);
                j7 = defpackage.den.ak(cavVarB).d;
                cbtVar.W(false);
            } else {
                cavVarB.u(1960508613);
                j7 = defpackage.den.ak(cavVarB).q;
                cbtVar.W(false);
            }
            cbtVar.W(false);
            defpackage.cqg cqgVar4 = new defpackage.cqg(j7);
            boolean zB8 = cavVarB.B(algVarD);
            java.lang.Object objR6 = cbtVar.R();
            if (zB8 || objR6 == defpackage.cau.a) {
                bmx bmxVar2 = new bmx(algVarD, 18);
                defpackage.ajxw ajxwVar4 = defpackage.ceo.a;
                cjaVar = null;
                objR6 = new defpackage.cbk(bmxVar2, null);
                cbtVar.ab(objR6);
            } else {
                cjaVar = null;
            }
            defpackage.cer cerVarE2 = defpackage.alk.e(algVarD, cqgVar3, cqgVar4, smdVar2.a(((defpackage.cer) objR6).a(), cavVarB, 0), nfVar2, cavVarB, 0);
            defpackage.ayy ayyVar = acph.a;
            defpackage.ayy ayyVar2 = acph.a;
            defpackage.cmw cmwVarM = defpackage.azm.m(defpackage.cmw.c, 0.0f, 40.0f, 1);
            abisVar2 = abisVar;
            defpackage.aomy aomyVar = abisVar2.e;
            if (abisVar2.b == null) {
                cavVarB.u(1295963487);
                cbtVar.W(false);
                cjaVar2 = cjaVar;
            } else {
                cavVarB.u(1295993340);
                defpackage.cja cjaVarJ = defpackage.cfo.j(-874620966, new defpackage.ubr(abisVar2, 14), cavVarB);
                cbtVar.W(false);
                cjaVar2 = cjaVarJ;
            }
            defpackage.amu amuVarBl = defpackage.den.bl(1.0f, ((defpackage.cqg) cerVarE.a()).a);
            defpackage.abrz.w(aomyVar, defpackage.cfo.j(-304992342, new zjn(abisVar2, cerVarE2, 7), cavVarB), cmwVarM, false, cjaVar2, defpackage.bge.a, acph.a(j, 0L, 0L, cavVarB, 254), null, amuVarBl, null, ayyVar2, cavVarB, 48, 0);
            cavVarB = cavVarB;
        } else {
            abisVar2 = abisVar;
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpe(abisVar2, j, i, 4);
        }
    }

    public static void bf(abip abipVar, defpackage.cmw cmwVar, bpw bpwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1639164902);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abipVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.cye cyeVarA = defpackage.aww.a(defpackage.awi.c, defpackage.cmh.j, cavVarB, 0);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVar);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.aonn aonnVar = defpackage.dam.e;
            defpackage.cev.c(cavVarB, cyeVarA, aonnVar);
            defpackage.aonn aonnVar2 = defpackage.dam.d;
            defpackage.cev.c(cavVarB, cjeVarAi, aonnVar2);
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iM);
            defpackage.aonn aonnVar3 = defpackage.dam.f;
            defpackage.cev.c(cavVarB, numValueOf, aonnVar3);
            defpackage.aonj aonjVar = defpackage.dam.g;
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.aonn aonnVar4 = defpackage.dam.c;
            defpackage.cev.c(cavVarB, cmwVarM, aonnVar4);
            int i4 = i2 & 14;
            defpackage.awb awbVarF = defpackage.awi.f(8.0f);
            boolean z = i4 == 4;
            int i5 = (i2 & 896) ^ 384;
            boolean z2 = z;
            defpackage.aono aonoVar = abir.a;
            boolean z3 = z2 | ((i5 > 256 && cavVarB.B(bpwVar)) || (i2 & 384) == 256);
            java.lang.Object objR = cbtVar.R();
            if (z3 || objR == defpackage.cau.a) {
                objR = new abdu(abipVar, bpwVar, 3);
                cbtVar.ab(objR);
            }
            defpackage.aaoo.ao(aonoVar, null, 0.0f, awbVarF, null, (defpackage.aonj) objR, cavVarB, 3078);
            defpackage.cmw cmwVarD = defpackage.azm.d(defpackage.cmw.c, 1.0f);
            defpackage.cye cyeVarA2 = defpackage.azh.a(defpackage.awi.f(8.0f), defpackage.cmh.m, cavVarB, 54);
            int iM2 = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi2 = cbtVar.ai();
            defpackage.cmw cmwVarM2 = defpackage.cfo.m(cavVarB, cmwVarD);
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA2, aonnVar);
            defpackage.cev.c(cavVarB, cjeVarAi2, aonnVar2);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM2), aonnVar3);
            defpackage.cev.b(cavVarB, aonjVar);
            defpackage.cev.c(cavVarB, cmwVarM2, aonnVar4);
            defpackage.azk azkVar = defpackage.azk.a;
            cavVarB.u(1966599019);
            java.util.Iterator it = abipVar.a.iterator();
            while (it.hasNext()) {
                bh(azkVar, ((abio) it.next()).a(), cavVarB, 6);
            }
            cbtVar.W(false);
            cbtVar.W(true);
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abipVar, cmwVar, bpwVar, i, 5);
        }
    }

    public static void bg(abip abipVar, defpackage.cmw cmwVar, bpw bpwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1427993338);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abipVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar = defpackage.cmw.c;
                bpwVar = defpackage.aaoo.Z(cavVarB);
            } else {
                cavVarB.s();
            }
            cavVarB.l();
            cavVarB.u(-301244081);
            bf(abipVar, cmwVar, bpwVar, cavVarB, i4 & 126);
            cbtVar.W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        bpw bpwVar2 = bpwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abipVar, cmwVar2, bpwVar2, i, 7);
        }
    }

    public static void bh(defpackage.azj azjVar, java.lang.String str, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cav cavVarB = cavVar.b(-1161673604);
        if ((i & 6) == 0) {
            i2 = (true != cavVarB.B(azjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.z(1) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, defpackage.afsq.bD(defpackage.den.ba(azjVar.a(defpackage.cmw.c, 1.0f, true), 0.0f, 8.0f, 0.0f, 0.0f)), 0L, 0L, null, null, 0L, new defpackage.dot(3), 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).n, cavVar2, (i2 >> 3) & 14, ((i2 << 6) & 57344) | 384, 109564);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(azjVar, str, i, 3);
        }
    }

    public static abil bi(long j, defpackage.crd crdVar, defpackage.cav cavVar, int i) {
        if ((i & 1) != 0) {
            j = defpackage.den.ak(cavVar).F;
        }
        long j2 = j;
        long j3 = (i & 2) != 0 ? defpackage.den.ak(cavVar).y : 0L;
        if ((i & 4) != 0) {
            crdVar = defpackage.den.am(cavVar).g;
        }
        return new abil(j2, j3, crdVar);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static void bj(java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cmw cmwVar2;
        long j2;
        defpackage.cmw cmwVar3;
        long j3;
        defpackage.cdk cdkVarI;
        int i4;
        defpackage.cmw cmwVar4;
        int i5;
        defpackage.cmw cmwVar5;
        long j4;
        defpackage.cdk cdkVarI2;
        int i6;
        int i7 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1858656607);
        if (i7 == 0) {
            i3 = (true != cavVarB.B(str) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i6 = 128;
                j2 = j;
                if ((i2 & 4) == 0 && cavVarB.A(j2)) {
                    i6 = 256;
                }
                i3 |= i6;
            } else {
                j2 = j;
            }
            if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
                i4 = i2 & 4;
                ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
                if ((i & 1) != 0 || cavVarB.E()) {
                    if (i8 != 0) {
                        cmwVar4 = defpackage.cmw.c;
                    } else {
                        cmwVar4 = cmwVar2;
                    }
                    if (i4 != 0) {
                        defpackage.cmw cmwVar6 = cmwVar4;
                        i5 = i3 & (-897);
                        cmwVar5 = cmwVar6;
                        cavVarB = cavVarB;
                        j4 = defpackage.den.ak(cavVarB).s;
                    } else {
                        defpackage.cmw cmwVar7 = cmwVar4;
                        i5 = i3;
                        cmwVar5 = cmwVar7;
                    }
                    cavVarB.l();
                    if (str == null) {
                        cdkVarI2 = cavVarB.I();
                        if (cdkVarI2 != null) {
                            cdkVarI2.c = new abij(cmwVar5, j4, i, i2, 0);
                            return;
                        }
                        return;
                    }
                    defpackage.abrz.k(str, cmwVar5, j4, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, null, defpackage.den.an(cavVarB).k, cavVarB, i5 & 1022, 24960, 110584);
                    j3 = j4;
                    cmwVar3 = cmwVar5;
                } else {
                    cavVarB.s();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    cmwVar5 = cmwVar2;
                }
                j4 = j2;
                cavVarB.l();
                if (str == null) {
                    cdkVarI2 = cavVarB.I();
                    if (cdkVarI2 != null) {
                        cdkVarI2.c = new abij(cmwVar5, j4, i, i2, 0);
                        return;
                    }
                    return;
                }
                defpackage.abrz.k(str, cmwVar5, j4, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, null, defpackage.den.an(cavVarB).k, cavVarB, i5 & 1022, 24960, 110584);
                j3 = j4;
                cmwVar3 = cmwVar5;
            } else {
                cavVarB = cavVarB;
                cavVarB.s();
                cmwVar3 = cmwVar2;
                j3 = j2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new qyg(str, cmwVar3, j3, i, i2, 2);
            }
        }
        i3 |= 48;
        cmwVar2 = cmwVar;
        if ((i & 384) == 0) {
            i6 = 128;
            j2 = j;
            if ((i2 & 4) == 0) {
                i6 = 256;
            }
            i3 |= i6;
        } else {
            j2 = j;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            i4 = i2 & 4;
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    defpackage.cmw cmwVar8 = cmwVar4;
                    i5 = i3 & (-897);
                    cmwVar5 = cmwVar8;
                    cavVarB = cavVarB;
                    j4 = defpackage.den.ak(cavVarB).s;
                } else {
                    defpackage.cmw cmwVar9 = cmwVar4;
                    i5 = i3;
                    cmwVar5 = cmwVar9;
                    j4 = j2;
                }
            } else {
                if (i8 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                if (i4 != 0) {
                    defpackage.cmw cmwVar10 = cmwVar4;
                    i5 = i3 & (-897);
                    cmwVar5 = cmwVar10;
                    cavVarB = cavVarB;
                    j4 = defpackage.den.ak(cavVarB).s;
                } else {
                    defpackage.cmw cmwVar11 = cmwVar4;
                    i5 = i3;
                    cmwVar5 = cmwVar11;
                    j4 = j2;
                }
            }
            cavVarB.l();
            if (str == null) {
                cdkVarI2 = cavVarB.I();
                if (cdkVarI2 != null) {
                    cdkVarI2.c = new abij(cmwVar5, j4, i, i2, 0);
                    return;
                }
                return;
            }
            defpackage.abrz.k(str, cmwVar5, j4, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, null, defpackage.den.an(cavVarB).k, cavVarB, i5 & 1022, 24960, 110584);
            j3 = j4;
            cmwVar3 = cmwVar5;
        } else {
            cavVarB = cavVarB;
            cavVarB.s();
            cmwVar3 = cmwVar2;
            j3 = j2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new qyg(str, cmwVar3, j3, i, i2, 2);
        }
    }

    public static void bk(java.lang.String str, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1816283016);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, defpackage.den.an(cavVarB).m, cavVar2, i2 & 14, 24960, 110590);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ryr(str, i, 17);
        }
    }

    public static void bl(defpackage.cmw cmwVar, defpackage.aono aonoVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cav cavVarB = cavVar.b(-1652771887);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.D(aonoVar) ? 16 : 32;
        }
        if (cavVarB.H((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                cmwVar = defpackage.cmw.c;
            }
            int i4 = ((i3 << 6) & 7168) | 384;
            defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar, 1.0f);
            defpackage.cye cyeVarA = defpackage.azh.a(defpackage.awi.a, defpackage.cmh.n, cavVarB, 48);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarA, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            aonoVar.a(defpackage.azk.a, cavVarB, java.lang.Integer.valueOf(((i4 >> 6) & 112) | 6));
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cmw cmwVar2 = cmwVar;
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bbu(cmwVar2, aonoVar, i, i2, 7);
        }
    }

    public static void bm(abja abjaVar, long j, long j2, defpackage.cav cavVar, int i, int i2) {
        int i3;
        long j3;
        long jS;
        defpackage.cav cavVar2;
        long j4;
        long j5;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-700171153);
        if (i4 == 0) {
            i3 = (true != cavVarB.z(abjaVar.ordinal()) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            j3 = j;
            if ((i2 & 2) == 0 && cavVarB.A(j3)) {
                i5 = 32;
            }
            i3 |= i5;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            jS = j2;
            if ((i2 & 4) == 0 && cavVarB.A(jS)) {
                i6 = 256;
            }
            i3 |= i6;
        } else {
            jS = j2;
        }
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            int i7 = i2 & 4;
            int i8 = i2 & 2;
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                if (i8 != 0) {
                    j3 = defpackage.den.ak(cavVarB).a;
                }
                if (i7 != 0) {
                    defpackage.cbd cbdVar = defpackage.abmz.a;
                    cavVarB.u(-989916019);
                    defpackage.abmy abmyVarF = defpackage.abts.F(cavVarB);
                    long j6 = abmyVarF.c;
                    if (defpackage.anty.ah(j3, -904674731360256L)) {
                        jS = abmyVarF.d;
                    } else {
                        long j7 = abmyVarF.e;
                        if (defpackage.anty.ah(j3, -2556733901766656L)) {
                            jS = abmyVarF.f;
                        } else if (defpackage.anty.ah(j3, abmyVarF.h)) {
                            jS = abmyVarF.i;
                        } else if (defpackage.anty.ah(j3, abmyVarF.j) || defpackage.anty.ah(j3, abmyVarF.k) || defpackage.anty.ah(j3, abmyVarF.l)) {
                            jS = abmyVarF.m;
                        } else if (defpackage.anty.ah(j3, abmyVarF.n)) {
                            jS = abmyVarF.o;
                        } else if (defpackage.anty.ah(j3, abmyVarF.p) || defpackage.anty.ah(j3, abmyVarF.q)) {
                            jS = abmyVarF.r;
                        } else if (defpackage.anty.ah(j3, abmyVarF.s)) {
                            jS = abmyVarF.t;
                        } else {
                            jS = defpackage.anty.ah(j3, abmyVarF.u) ? abmyVarF.v : defpackage.cfd.S();
                        }
                    }
                    if (jS == 16) {
                        jS = defpackage.abrz.r(j3, cavVarB);
                    }
                    cbtVar.W(false);
                }
            } else {
                cavVarB.s();
            }
            long j8 = jS;
            long j9 = j3;
            cavVarB.l();
            cavVar2 = cavVarB;
            defpackage.bvo.b(defpackage.azm.g(defpackage.den.ba(defpackage.cmw.c, 0.0f, 0.0f, 12.0f, 0.0f), 28.0f), defpackage.bge.a, j9, 0L, 0.0f, 0.0f, null, defpackage.cfo.j(2009359860, new bok(abjaVar, j8, 2), cavVarB), cavVar2, 120);
            j5 = j8;
            j4 = j9;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            j4 = j3;
            j5 = jS;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abic(abjaVar, j4, j5, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static void bn(abhh abhhVar, defpackage.bni bniVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.bni bniVar2;
        defpackage.cmw cmwVar2;
        defpackage.cmw cmwVar3;
        defpackage.cdk cdkVarI;
        defpackage.cmw cmwVar4;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1309305085);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(abhhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            bniVar2 = bniVar;
            i3 |= true != cavVarB.B(bniVar2) ? 16 : 32;
        } else {
            bniVar2 = bniVar;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                cmwVar2 = cmwVar;
                i3 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
            }
            if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
                if (i5 != 0) {
                    cmwVar4 = defpackage.cmw.c;
                } else {
                    cmwVar4 = cmwVar2;
                }
                defpackage.aaoo.am(abhhVar.b, cmwVar4, false, null, bniVar2, null, defpackage.cfo.j(458528864, new defpackage.ped(abhhVar, 20), cavVarB), cavVarB, ((i3 >> 3) & 112) | 805306368 | ((i3 << 9) & 57344), 492);
                cmwVar3 = cmwVar4;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar2;
            }
            cdkVarI = cavVarB.I();
            if (cdkVarI != null) {
                cdkVarI.c = new dqg(abhhVar, bniVar, cmwVar3, i, i2, 6);
            }
        }
        i3 |= 384;
        cmwVar2 = cmwVar;
        if (cavVarB.H((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                cmwVar4 = defpackage.cmw.c;
            } else {
                cmwVar4 = cmwVar2;
            }
            defpackage.aaoo.am(abhhVar.b, cmwVar4, false, null, bniVar2, null, defpackage.cfo.j(458528864, new defpackage.ped(abhhVar, 20), cavVarB), cavVarB, ((i3 >> 3) & 112) | 805306368 | ((i3 << 9) & 57344), 492);
            cmwVar3 = cmwVar4;
        } else {
            cavVarB.s();
            cmwVar3 = cmwVar2;
        }
        cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new dqg(abhhVar, bniVar, cmwVar3, i, i2, 6);
        }
    }

    public static void bo(defpackage.azj azjVar, abhh abhhVar, boolean z, boolean z2, defpackage.bni bniVar, defpackage.bni bniVar2, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.bni bniVar3;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1758446789);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(azjVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abhhVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.C(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            bniVar3 = bniVar;
            i2 |= true != cavVarB.B(bniVar3) ? 8192 : 16384;
        } else {
            bniVar3 = bniVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.B(bniVar2) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            if (abhhVar == null) {
                defpackage.cdk cdkVarI = cavVarB.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new smh(azjVar, z, z2, bniVar3, bniVar2, i, 3);
                    return;
                }
                return;
            }
            int i4 = i2 >> 6;
            int i5 = ((i2 >> 3) & 14) | (i4 & 112);
            int i6 = i4 & 896;
            int i7 = i4 & 7168;
            if (z) {
                cavVarB.u(172408027);
                cavVar2 = cavVarB;
                bp(abhhVar, z2, bniVar, bniVar2, defpackage.azm.l(azjVar.a(defpackage.cmw.c, 1.0f, true), Float.NaN, 412.0f), cavVar2, i5 | i6 | i7);
                cbtVar.W(false);
            } else {
                cavVar2 = cavVarB;
                cavVar2.u(172678285);
                bp(abhhVar, z2, bniVar, bniVar2, ((axx) azjVar).b.b(defpackage.cmw.c, defpackage.cmh.n), cavVar2, i5 | i6 | i7);
                cbtVar.W(false);
            }
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI2 = cavVar2.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new lpl(azjVar, abhhVar, z, z2, bniVar, bniVar2, i, 2);
        }
    }

    public static void bp(abhh abhhVar, boolean z, defpackage.bni bniVar, defpackage.bni bniVar2, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(715408454);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.C(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(bniVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bniVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            int i4 = i2 >> 6;
            int i5 = i2 & 14;
            int i6 = i4 & 896;
            if (z) {
                cavVarB.u(1105717635);
                bs(abhhVar, bniVar, cmwVar, cavVarB, i5 | ((i2 >> 3) & 112) | i6);
                ((defpackage.cbt) cavVarB).W(false);
            } else {
                cavVarB.u(1105811813);
                bn(abhhVar, bniVar2, cmwVar, cavVarB, i5 | (i4 & 112) | i6, 0);
                ((defpackage.cbt) cavVarB).W(false);
            }
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(abhhVar, z, bniVar, bniVar2, cmwVar, i, 4);
        }
    }

    public static void bq(defpackage.cmw cmwVar, abil abilVar, abhv abhvVar, boolean z, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-2047178587);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(abilVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(abhvVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.C(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 8192 : 16384;
        }
        if (cavVarB.H((i2 & 9363) != 9362, i2 & 1)) {
            long j = z ? abilVar.b : abilVar.a;
            cavVarB.u(1038758456);
            ((defpackage.cbt) cavVarB).W(false);
            br(cmwVar, j, null, abilVar.c, abhvVar, aonnVar, cavVarB, (i2 & 14) | ((i2 << 6) & 57344) | ((i2 << 3) & 458752));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new pbu(cmwVar, abilVar, abhvVar, z, aonnVar, i, 3);
        }
    }

    public static void br(defpackage.cmw cmwVar, long j, defpackage.cqg cqgVar, defpackage.crd crdVar, abhv abhvVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        abhv abhvVar2;
        defpackage.aonn aonnVar2;
        defpackage.cav cavVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1919076192);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(cmwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.A(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(cqgVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(crdVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            abhvVar2 = abhvVar;
            i2 |= true != cavVarB.B(abhvVar2) ? 8192 : 16384;
        } else {
            abhvVar2 = abhvVar;
        }
        if ((196608 & i) == 0) {
            aonnVar2 = aonnVar;
            i2 |= true != cavVarB.D(aonnVar2) ? 65536 : 131072;
        } else {
            aonnVar2 = aonnVar;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            java.lang.String strF = defpackage.dfa.f(2132017499, cavVarB);
            cavVarB.u(1691260998);
            defpackage.cmt cmtVar = defpackage.cmw.c;
            boolean zB = cavVarB.B(strF);
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar.R();
            if (zB || objR == defpackage.cau.a) {
                objR = new abgj(strF, 4);
                cbtVar.ab(objR);
            }
            defpackage.cmw cmwVarL = aaf.l(defpackage.dig.b(cmtVar, false, (defpackage.aonj) objR), true, (defpackage.kaw) null);
            cbtVar.W(false);
            cavVar2 = cavVarB;
            defpackage.bvo.b(cmwVarL, crdVar, j, 0L, 0.0f, 0.0f, cqgVar != null ? defpackage.den.bl(1.0f, cqgVar.a) : null, aonnVar2, cavVar2, 56);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abik(cmwVar, j, cqgVar, crdVar, abhvVar2, aonnVar, i);
        }
    }

    public static void bs(abhh abhhVar, defpackage.bni bniVar, defpackage.cmw cmwVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1575534350);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(bniVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cmwVar2 = cmwVar;
            i2 |= true != cavVarB.B(cmwVar2) ? 128 : 256;
        } else {
            cmwVar2 = cmwVar;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.aaoo.ak(abhhVar.b, cmwVar2, false, null, bniVar, null, null, null, defpackage.cfo.j(-1745689854, new defpackage.ped(abhhVar, 19), cavVarB), cavVarB, ((i2 >> 3) & 112) | 805306368 | ((i2 << 9) & 57344), 492);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abhhVar, bniVar, cmwVar, i, 2);
        }
    }

    public static void bt(abia abiaVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1963458337);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abiaVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(cmwVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) != 0 && !cavVarB.E()) {
                cavVarB.s();
            }
            cavVarB.l();
            defpackage.cmw cmwVarD = defpackage.azm.d(cmwVar, 1.0f);
            defpackage.cye cyeVarB = defpackage.awo.b(defpackage.cmh.a, false);
            int iM = defpackage.anty.M(cbtVar.x);
            defpackage.cje cjeVarAi = cbtVar.ai();
            defpackage.cmw cmwVarM = defpackage.cfo.m(cavVarB, cmwVarD);
            defpackage.aomy aomyVar = defpackage.dam.a;
            cavVarB.v();
            if (cbtVar.w) {
                cavVarB.j(aomyVar);
            } else {
                cavVarB.x();
            }
            defpackage.cev.c(cavVarB, cyeVarB, defpackage.dam.e);
            defpackage.cev.c(cavVarB, cjeVarAi, defpackage.dam.d);
            defpackage.cev.c(cavVarB, java.lang.Integer.valueOf(iM), defpackage.dam.f);
            defpackage.cev.b(cavVarB, defpackage.dam.g);
            defpackage.cev.c(cavVarB, cmwVarM, defpackage.dam.c);
            j$.util.Objects.checkIndex(0, 11);
            if (abiaVar instanceof abhl) {
                cavVarB.u(1830592369);
                bE((abhl) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhu) {
                cavVarB.u(1830597323);
                bC((abhu) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhx) {
                cavVarB.u(1830602282);
                bD((abhx) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhs) {
                cavVarB.u(1830607540);
                bA((abhs) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhy) {
                cavVarB.u(1830612778);
                bF((abhy) abiaVar, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abht) {
                cavVarB.u(1830618036);
                bB((abht) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhz) {
                cavVarB.u(1830623142);
                bG((abhz) abiaVar, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhq) {
                cavVarB.u(1830627880);
                by((abhq) abiaVar, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else if (abiaVar instanceof abhr) {
                cavVarB.u(1830633010);
                bz((abhr) abiaVar, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            } else {
                if (!(abiaVar instanceof abhp)) {
                    cavVarB.u(1830591098);
                    cbtVar.W(false);
                    throw new defpackage.aois();
                }
                cavVarB.u(1830637127);
                bx((abhp) abiaVar, null, abilVar, cavVarB, i2 & 910);
                cbtVar.W(false);
            }
            cbtVar.W(true);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abif(abiaVar, cmwVar, abilVar, i, 1);
        }
    }

    public static void bu(abhh abhhVar, defpackage.cmw cmwVar, boolean z, defpackage.bni bniVar, defpackage.bni bniVar2, defpackage.cav cavVar, int i, int i2) {
        int i3;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        defpackage.bni bniVar3;
        defpackage.bni bniVar4;
        defpackage.cmw cmwVar3;
        defpackage.cav cavVar3;
        defpackage.bni bniVarF;
        defpackage.bni bniVar5;
        boolean z2 = z;
        int i4 = i & 6;
        defpackage.cav cavVarB = cavVar.b(183025021);
        if (i4 == 0) {
            i3 = (true != cavVarB.B(abhhVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != cavVarB.B(null) ? 16 : 32;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != cavVarB.B(cmwVar) ? 128 : 256;
        }
        int i6 = i2 & 8;
        boolean z3 = i6 == 0;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != cavVarB.C(z2) ? 1024 : 2048;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != cavVarB.C(false) ? 8192 : 16384;
        }
        int i7 = 196608 | i3;
        if ((1572864 & i) == 0) {
            i7 = i3 | 720896;
        }
        if ((12582912 & i) == 0) {
            i7 |= 4194304;
        }
        if (cavVarB.H((4793491 & i7) != 4793490, i7 & 1)) {
            ((defpackage.cbt) cavVarB).Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = i5 != 0 ? defpackage.cmw.c : cmwVar;
                z2 &= z3;
                defpackage.ayy ayyVar = acpl.a;
                cavVar3 = cavVarB;
                defpackage.bni bniVarA = acpl.a(0L, 0L, cavVar3, 15);
                bniVarF = acpl.f(0L, cavVar3, 15);
                bniVar5 = bniVarA;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                bniVar5 = bniVar;
                bniVarF = bniVar2;
                cavVar3 = cavVarB;
            }
            boolean z4 = z2;
            cavVar3.l();
            if (abhhVar == null) {
                defpackage.cdk cdkVarI = cavVar3.I();
                if (cdkVarI != null) {
                    cdkVarI.c = new abdz(cmwVar3, z4, bniVar5, bniVarF, i, i2, 3);
                    return;
                }
                return;
            }
            z2 = z4;
            defpackage.bni bniVar6 = bniVar5;
            defpackage.bni bniVar7 = bniVarF;
            defpackage.cav cavVar4 = cavVar3;
            defpackage.sa.f(defpackage.den.aZ(defpackage.den.ba(aR(defpackage.azm.d(cmwVar3, 1.0f), z2, cavVar3), 0.0f, 12.0f, 0.0f, 12.0f), 16.0f, 0.0f), z2 ? defpackage.awi.f(8.0f) : defpackage.awi.g(8.0f, defpackage.cmh.l), defpackage.awi.f(4.0f), null, 0, 0, defpackage.cfo.j(-976526238, new abid(z2, bniVar6, bniVar7, abhhVar), cavVar3), cavVar4, 1573248, 56);
            cavVar2 = cavVar4;
            cmwVar2 = cmwVar3;
            bniVar3 = bniVar6;
            bniVar4 = bniVar7;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            bniVar3 = bniVar;
            bniVar4 = bniVar2;
        }
        boolean z5 = z2;
        defpackage.cdk cdkVarI2 = cavVar2.I();
        if (cdkVarI2 != null) {
            cdkVarI2.c = new abie(abhhVar, cmwVar2, z5, bniVar3, bniVar4, i, i2, 0);
        }
    }

    public static void bv(defpackage.aomy aomyVar, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        long j2;
        defpackage.cmw cmwVar3;
        long j3;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1884234360);
        if (i3 == 0) {
            i2 = (true != cavVarB.D(aomyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
            cbtVar.Z(-127, null, 0, null);
            if ((i & 1) == 0 || cavVarB.E()) {
                cmwVar3 = defpackage.cmw.c;
                j3 = defpackage.den.ak(cavVarB).s;
            } else {
                cavVarB.s();
                cmwVar3 = cmwVar;
                j3 = j;
            }
            cavVarB.l();
            cavVarB.u(1996927202);
            defpackage.aaoo.aC(aomyVar, defpackage.den.ba(cmwVar3, 0.0f, 0.0f, 4.0f, 0.0f), false, null, null, null, defpackage.cfo.j(-898038911, new abig(j3), cavVarB), cavVarB, (i4 & 14) | 1572864, 60);
            cbtVar.W(false);
            cmwVar2 = cmwVar3;
            j2 = j3;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
            j2 = j;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abih(aomyVar, cmwVar2, j2, i, 0);
        }
    }

    public static void bw(defpackage.azj azjVar, java.lang.String str, defpackage.cmw cmwVar, long j, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cav cavVar2;
        defpackage.cmw cmwVar2;
        long jS;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1501765365);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(azjVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.B(str) ? 16 : 32;
        }
        int i4 = i2 | 3456;
        if (cavVarB.H((i4 & 1171) != 1170, i4 & 1)) {
            defpackage.cmt cmtVar = defpackage.cmw.c;
            jS = defpackage.cfd.S();
            cavVar2 = cavVarB;
            defpackage.abrz.k(str, defpackage.den.aZ(azjVar.a(cmtVar, 1.0f, true), 0.0f, 8.0f), jS, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, null, defpackage.den.an(cavVarB).h, cavVar2, (i4 >> 3) & 910, 24960, 110584);
            cmwVar2 = cmtVar;
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
            cmwVar2 = cmwVar;
            jS = j;
        }
        defpackage.cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new bpy(azjVar, str, cmwVar2, jS, i, 5);
        }
    }

    public static void bx(abhp abhpVar, defpackage.cmw cmwVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        defpackage.cmw cmwVar2;
        long jM;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1217193572);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            boolean z = abhpVar instanceof abhm;
            defpackage.cmt cmtVar = defpackage.cmw.c;
            defpackage.cer cerVarA = ahp.a(z ? abilVar.b : abilVar.a, (defpackage.aiq) null, cavVarB, 0, 14);
            if (z) {
                cavVarB.u(995659875);
                ((defpackage.cbt) cavVarB).W(false);
                jM = defpackage.cfd.M(0);
            } else {
                cavVarB.u(995740227);
                ((defpackage.cbt) cavVarB).W(false);
                jM = defpackage.cfd.M(0);
            }
            defpackage.cer cerVarA2 = ahp.a(jM, (defpackage.aiq) null, cavVarB, 0, 14);
            long jF = defpackage.a.F(cerVarA);
            defpackage.cqg cqgVar = new defpackage.cqg(defpackage.a.F(cerVarA2));
            if (true == defpackage.anty.ah(cqgVar.a, defpackage.cfd.M(0))) {
                cqgVar = null;
            }
            br(cmtVar, jF, cqgVar, abilVar.c, abhpVar.a(), defpackage.cfo.j(1233203693, new defpackage.ubr(abhpVar, 9), cavVarB), cavVarB, ((i4 >> 3) & 14) | 196608);
            cavVarB = cavVarB;
            cmwVar2 = cmtVar;
        } else {
            cavVarB.s();
            cmwVar2 = cmwVar;
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new ppx(abhpVar, cmwVar2, abilVar, i, 19);
        }
    }

    public static void by(abhq abhqVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-886147002);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new abii(abhqVar, abilVar, i, 0);
        }
    }

    public static void bz(abhr abhrVar, abil abilVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(1251245058);
        if (i3 == 0) {
            i2 = (true != cavVarB.B(abhrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= true != cavVarB.B(abilVar) ? 128 : 256;
        }
        if (cavVarB.H((i4 & 147) != 146, i4 & 1)) {
            throw null;
        }
        cavVarB.s();
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.slz(abhrVar, abilVar, i, 19, null);
        }
    }

    public static int c(android.content.res.Resources resources, int i, akvo akvoVar) {
        defpackage.aooh.f(resources, "<this>");
        defpackage.aooh.f(akvoVar, "badgePosition");
        if (akvoVar == akvo.b) {
            return resources.getDimensionPixelSize(2131167254);
        }
        if (i > resources.getDimensionPixelSize(2131167247)) {
            return resources.getDimensionPixelSize(2131167242);
        }
        if (i > resources.getDimensionPixelSize(2131167248)) {
            return resources.getDimensionPixelSize(2131167249);
        }
        return i > resources.getDimensionPixelSize(2131167246) ? resources.getDimensionPixelSize(2131167258) : resources.getDimensionPixelSize(2131167240);
    }

    private static alfu cA(amhn amhnVar) {
        defpackage.akzx akzxVarM = alfu.a.m();
        for (amhm amhmVar : amhnVar.b) {
            defpackage.akzx akzxVarM2 = alft.a.m();
            int i = amhmVar.c;
            akzxVarM2.u();
            akzxVarM2.b.b = i;
            int i2 = amhmVar.d;
            akzxVarM2.u();
            akzxVarM2.b.c = i2;
            java.lang.String str = amhmVar.e;
            akzxVarM2.u();
            alft alftVar = akzxVarM2.b;
            j$.util.Objects.requireNonNull(str);
            alftVar.d = str;
            boolean z = amhmVar.f;
            akzxVarM2.u();
            akzxVarM2.b.e = z;
            akzxVarM.u();
            alfu alfuVar = akzxVarM.b;
            alft alftVarP = akzxVarM2.r();
            j$.util.Objects.requireNonNull(alftVarP);
            defpackage.alat alatVar = alfuVar.b;
            if (!alatVar.c()) {
                alfuVar.b = defpackage.alad.J(alatVar);
            }
            alfuVar.b.add(alftVarP);
        }
        return akzxVarM.r();
    }

    private static void cB(int i, java.lang.String str, java.util.List list, android.content.res.Resources resources) {
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        list.add(new defpackage.dxy(resources.getString(i), str));
    }

    private static void cC(android.text.Spannable spannable, java.lang.String str, android.text.style.ClickableSpan clickableSpan) {
        int iIndexOf = spannable.toString().indexOf(str);
        int length = str.length() + iIndexOf;
        if (iIndexOf >= 0) {
            spannable.setSpan(clickableSpan, iIndexOf, length, 0);
        }
    }

    private static java.io.IOException cD(java.io.File file, java.io.IOException iOException, java.lang.String str) {
        java.lang.String strConcat;
        try {
            strConcat = "Inoperable file:" + java.lang.String.format(java.util.Locale.US, " canonical[%s] freeSpace[%d] protoName[%s]", file.getCanonicalPath(), java.lang.Long.valueOf(file.getFreeSpace()), str);
            try {
                strConcat = strConcat + java.lang.String.format(java.util.Locale.US, " mode[%d]", java.lang.Integer.valueOf(android.system.Os.stat(file.getCanonicalPath()).st_mode));
            } catch (java.lang.Exception unused) {
            }
        } catch (java.io.IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new java.io.IOException(strConcat, iOException);
    }

    private static java.io.IOException cE(java.io.File file, java.io.IOException iOException, java.lang.String str) {
        java.io.File parentFile = file.getParentFile();
        if (parentFile == null) {
            return cD(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return cD(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? cD(file, iOException, str) : cD(file, iOException, str);
            }
            return parentFile.canWrite() ? cD(file, iOException, str) : cD(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? cD(file, iOException, str) : cD(file, iOException, str);
        }
        return parentFile.canWrite() ? cD(file, iOException, str) : cD(file, iOException, str);
    }

    private static long cF(abjv abjvVar, defpackage.cav cavVar) {
        j$.util.Objects.checkIndex(0, 4);
        if (abjvVar instanceof abjy) {
            cavVar.u(1986419124);
            defpackage.abng abngVar = defpackage.abts.F(cavVar).b;
            throw null;
        }
        if (abjvVar instanceof abjw) {
            cavVar.u(1986421677);
            ((defpackage.cbt) cavVar).W(false);
            return defpackage.cfd.M(((abjw) abjvVar).a);
        }
        if (!(abjvVar instanceof abjx)) {
            cavVar.u(1986415722);
            ((defpackage.cbt) cavVar).W(false);
            throw new defpackage.aois();
        }
        cavVar.u(1986425357);
        long jB = defpackage.abts.F(cavVar).b.b(((abjx) abjvVar).a);
        ((defpackage.cbt) cavVar).W(false);
        return jB;
    }

    private static float cG(float f, float f2) {
        if (f2 >= 0.1f) {
            return defpackage.aooc.s(f, -f2, f2);
        }
        return 0.0f;
    }

    private static int cH(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private static long cI(byte[] bArr, int i) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArr, i, 8);
        byteBufferWrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        return byteBufferWrap.getLong();
    }

    private static void cJ(byte[] bArr, int i, long j, long j2, long[] jArr) {
        long jCI = j + cI(bArr, i);
        long jCI2 = cI(bArr, i + 8);
        long jCI3 = cI(bArr, i + 16);
        long jCI4 = cI(bArr, i + 24);
        long j3 = jCI2 + jCI + jCI3;
        long jRotateRight = java.lang.Long.rotateRight(j2 + jCI + jCI4, 21) + java.lang.Long.rotateRight(j3, 44);
        jArr[0] = j3 + jCI4;
        jArr[1] = jRotateRight + jCI;
    }

    public static int ca(int i) {
        int[] iArrM = defpackage.a.M();
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArrM[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    public static long cb(byte[] bArr) {
        byte[] bArr2 = bArr;
        int length = bArr2.length;
        long j = -5435081209227447693L;
        if (length <= 32) {
            if (length > 16) {
                long jCI = cI(bArr2, 0) * (-5435081209227447693L);
                long jCI2 = cI(bArr2, 8);
                long j2 = ((long) (length << 1)) - 7286425919675154353L;
                long jCI3 = cI(bArr2, length - 8) * j2;
                long jCI4 = cI(bArr2, length - 16) * (-7286425919675154353L);
                long jRotateRight = java.lang.Long.rotateRight(jCI + jCI2, 43) + java.lang.Long.rotateRight(jCI3, 30);
                long jRotateRight2 = jCI + java.lang.Long.rotateRight(jCI2 - 7286425919675154353L, 18) + jCI3;
                long j3 = ((jRotateRight + jCI4) ^ jRotateRight2) * j2;
                long j4 = (jRotateRight2 ^ (j3 ^ (j3 >>> 47))) * j2;
                return j2 * (j4 ^ (j4 >>> 47));
            }
            if (length >= 8) {
                long j5 = ((long) (length << 1)) - 7286425919675154353L;
                long jCI5 = cI(bArr2, 0) - 7286425919675154353L;
                long jCI6 = cI(bArr2, length - 8);
                long jRotateRight3 = java.lang.Long.rotateRight(jCI6, 37) * j5;
                long jRotateRight4 = (java.lang.Long.rotateRight(jCI5, 25) + jCI6) * j5;
                long j6 = ((jRotateRight3 + jCI5) ^ jRotateRight4) * j5;
                long j7 = (jRotateRight4 ^ (j6 ^ (j6 >>> 47))) * j5;
                return (j7 ^ (j7 >>> 47)) * j5;
            }
            if (length < 4) {
                if (length <= 0) {
                    return -7286425919675154353L;
                }
                long j8 = (((long) ((bArr2[0] & 255) + ((bArr2[length >> 1] & 255) << 8))) * (-7286425919675154353L)) ^ (((long) (length + ((bArr2[length - 1] & 255) << 2))) * (-4348849565147123417L));
                return (-7286425919675154353L) * (j8 ^ (j8 >>> 47));
            }
            long j9 = ((long) (length << 1)) - 7286425919675154353L;
            long jCH = cH(bArr2, 0);
            long jCH2 = ((long) cH(bArr2, length - 4)) & 4294967295L;
            long j10 = ((((long) length) + ((jCH & 4294967295L) << 3)) ^ jCH2) * j9;
            long j11 = (jCH2 ^ (j10 ^ (j10 >>> 47))) * j9;
            return (j11 ^ (j11 >>> 47)) * j9;
        }
        char c2 = '@';
        if (length <= 64) {
            long jCI7 = cI(bArr2, 0) * (-7286425919675154353L);
            long jCI8 = cI(bArr2, 8);
            long j12 = ((long) (length << 1)) - 7286425919675154353L;
            long jCI9 = cI(bArr2, length - 8) * j12;
            long jCI10 = cI(bArr2, length - 16) * (-7286425919675154353L);
            long jRotateRight5 = java.lang.Long.rotateRight(jCI7 + jCI8, 43) + java.lang.Long.rotateRight(jCI9, 30);
            long jRotateRight6 = java.lang.Long.rotateRight(jCI8 - 7286425919675154353L, 18) + jCI7;
            long jCI11 = cI(bArr2, 16) * j12;
            long jCI12 = cI(bArr2, 24);
            long j13 = jRotateRight5 + jCI10;
            long jCI13 = j13 + cI(bArr2, length - 32);
            long jCI14 = cI(bArr2, length - 24);
            long j14 = jRotateRight6 + jCI9;
            long j15 = (j13 ^ j14) * j12;
            long j16 = (j14 ^ (j15 ^ (j15 >>> 47))) * j12;
            long j17 = ((j16 ^ (j16 >>> 47)) * j12) + jCI14;
            long j18 = jCI13 * j12;
            long jRotateRight7 = java.lang.Long.rotateRight(jCI11 + jCI12, 43) + java.lang.Long.rotateRight(j18, 30);
            long jRotateRight8 = jCI11 + java.lang.Long.rotateRight(jCI12 + jCI7, 18) + j18;
            long j19 = ((jRotateRight7 + (j17 * j12)) ^ jRotateRight8) * j12;
            long j20 = (jRotateRight8 ^ (j19 ^ (j19 >>> 47))) * j12;
            return (j20 ^ (j20 >>> 47)) * j12;
        }
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jCI15 = cI(bArr2, 0) + 95310865018149119L;
        long j21 = 1390051526045402406L;
        long j22 = 2480279821605975764L;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            long j23 = j;
            int i3 = (i2 >> 6) << 6;
            long jRotateRight9 = java.lang.Long.rotateRight(jCI15 + j22 + jArr[0] + cI(bArr2, i + 8), 37) * j23;
            long jRotateRight10 = java.lang.Long.rotateRight(j22 + jArr[1] + cI(bArr2, i + 48), 42) * j23;
            long j24 = jRotateRight9 ^ jArr2[1];
            char c3 = c2;
            long jCI16 = jArr[0] + cI(bArr2, i + 40);
            long jRotateRight11 = java.lang.Long.rotateRight(j21 + jArr2[0], 33) * j23;
            int i4 = i;
            cJ(bArr2, i4, jArr[1] * j23, j24 + jArr2[0], jArr);
            long[] jArr3 = jArr;
            j22 = jRotateRight10 + jCI16;
            cJ(bArr2, i4 + 32, jRotateRight11 + jArr2[1], cI(bArr2, i4 + 16) + j22, jArr2);
            i = i4 + 64;
            if (i == i3) {
                int i5 = i2 & 63;
                int i6 = i3 + i5;
                long j25 = ((j24 & 255) << 1) + j23;
                long j26 = jArr2[0] + ((long) i5);
                long j27 = jArr3[0] + j26;
                jArr3[0] = j27;
                jArr2[0] = j26 + j27;
                long jRotateRight12 = java.lang.Long.rotateRight(jRotateRight11 + j22 + j27 + cI(bArr2, i6 - 55), 37) * j25;
                long jRotateRight13 = java.lang.Long.rotateRight(j22 + jArr3[1] + cI(bArr2, i6 - 15), 42) * j25;
                long j28 = jArr2[1] * 9;
                long jCI17 = (jArr3[0] * 9) + cI(bArr2, i6 - 23);
                long jRotateRight14 = java.lang.Long.rotateRight(j24 + jArr2[0], 33) * j25;
                long j29 = jRotateRight12 ^ j28;
                cJ(bArr2, i6 - 63, jArr3[1] * j25, j29 + jArr2[0], jArr3);
                long j30 = jRotateRight13 + jCI17;
                cJ(bArr2, i6 - 31, jArr2[1] + jRotateRight14, cI(bArr2, i6 - 47) + j30, jArr2);
                long j31 = jArr3[0];
                long j32 = jArr2[0];
                long j33 = (j31 ^ j32) * j25;
                long j34 = jArr3[1];
                long j35 = jArr2[1];
                long j36 = (j34 ^ j35) * j25;
                long j37 = (j35 ^ (j36 ^ (j36 >>> 47))) * j25;
                long j38 = (j32 ^ (j33 ^ (j33 >>> 47))) * j25;
                long j39 = ((j37 ^ (j37 >>> 47)) * j25) + jRotateRight14;
                long j40 = (((((j38 ^ (j38 >>> 47)) * j25) + ((j30 ^ (j30 >>> 47)) * (-4348849565147123417L))) + j29) ^ j39) * j25;
                long j41 = (j39 ^ (j40 ^ (j40 >>> 47))) * j25;
                return (j41 ^ (j41 >>> 47)) * j25;
            }
            bArr2 = bArr;
            c2 = c3;
            j = j23;
            j21 = j24;
            jCI15 = jRotateRight11;
            jArr = jArr3;
        }
    }

    public static java.lang.String cc(com.google.android.gms.clearcut.internal.PlayLoggerContext playLoggerContext) {
        java.lang.String str = playLoggerContext.f;
        if (!defpackage.ahvr.cp(str)) {
            return str;
        }
        int i = playLoggerContext.c;
        return i > 0 ? java.lang.String.valueOf(i) : "";
    }

    public static android.content.Intent cd(android.app.PendingIntent pendingIntent) {
        defpackage.aais.at(pendingIntent, "The target cannot be null!");
        return new android.content.Intent("com.google.android.gms.ui.UNPACKING_REDIRECT").setPackage("com.google.android.gms").setData(android.net.Uri.parse("intent://com.google.android.gms.auth.uiflows.common/".concat(java.lang.String.valueOf(java.lang.String.valueOf(java.util.UUID.randomUUID()))))).putExtra("target", pendingIntent);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afeb */
    public static void ce(defpackage.aw awVar, zsu zsuVar) throws afeb {
        defpackage.ahvr.e(awVar, zsy.class, new wtl(zsuVar, 15));
        defpackage.ahvr.e(awVar, ztc.class, new wtl(zsuVar, 16));
    }

    public static android.telecom.PhoneAccountHandle cf(zrz zrzVar) {
        defpackage.aooh.f(zrzVar, "<this>");
        android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(zrzVar.c);
        if (componentNameUnflattenFromString == null) {
            return null;
        }
        return (zrzVar.b & 4) != 0 ? new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, zrzVar.d, android.os.UserHandle.of(zrzVar.e)) : new android.telecom.PhoneAccountHandle(componentNameUnflattenFromString, zrzVar.d);
    }

    public static zrz cg(android.telecom.PhoneAccountHandle phoneAccountHandle) {
        defpackage.akzx akzxVarM = zrz.a.m();
        defpackage.aooh.f(akzxVarM, "builder");
        java.lang.String strFlattenToString = phoneAccountHandle.getComponentName().flattenToString();
        defpackage.aooh.e(strFlattenToString, "flattenToString(...)");
        defpackage.aooh.f(strFlattenToString, "value");
        akzxVarM.u();
        zrz zrzVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(strFlattenToString);
        zrzVar.b |= 1;
        zrzVar.c = strFlattenToString;
        java.lang.String id = phoneAccountHandle.getId();
        defpackage.aooh.e(id, "getId(...)");
        defpackage.aooh.f(id, "value");
        akzxVarM.u();
        zrz zrzVar2 = akzxVarM.b;
        j$.util.Objects.requireNonNull(id);
        zrzVar2.b |= 2;
        zrzVar2.d = id;
        android.os.UserHandle userHandle = phoneAccountHandle.getUserHandle();
        if (userHandle != null) {
            int iHashCode = userHandle.hashCode();
            akzxVarM.u();
            zrz zrzVar3 = akzxVarM.b;
            zrzVar3.b |= 4;
            zrzVar3.e = iHashCode;
        }
        zrz zrzVarP = akzxVarM.r();
        defpackage.aooh.e(zrzVarP, "build(...)");
        return zrzVarP;
    }

    public static defpackage.ajcq ch() {
        return defpackage.aiql.z(j$.util.Optional.empty());
    }

    public static /* synthetic */ zoe ci(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static void cj(java.lang.Object obj, defpackage.aonj aonjVar) {
        java.lang.Throwable thA;
        if (!(obj instanceof zoy) || (thA = zpb.a(obj)) == null) {
            return;
        }
        aonjVar.a(thA);
    }

    public static void ck(java.lang.Object obj, defpackage.aonj aonjVar) {
        if (zpb.b(obj)) {
            aonjVar.a(obj);
        }
    }

    public static long cl(android.telecom.Call call) {
        return aa$.ExternalSyntheticApiModelOutline0.m(call.getDetails());
    }

    public static /* synthetic */ zoe cm(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe cn(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe co(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe cp(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ zoe cq(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static /* synthetic */ uzx cr(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static uyg cs(defpackage.aoss aossVar, zka zkaVar, defpackage.aonj aonjVar) {
        defpackage.aooh.f(aossVar, "<this>");
        return new uyg(zkaVar, new wwg(aossVar, aonjVar, 12));
    }

    public static uyg ct(defpackage.aoss aossVar, defpackage.aonj aonjVar) {
        defpackage.aooh.f(aossVar, "<this>");
        return uyg.J(new wwg(aossVar, aonjVar, 13));
    }

    public static /* synthetic */ uzx cu(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    public static /* synthetic */ uzx cv(defpackage.akzx akzxVar) {
        defpackage.aooh.f(akzxVar, "builder");
        return new uzx(akzxVar);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [aiq, java.lang.Object] */
    public static void cw(defpackage.vx vxVar, abja abjaVar, java.lang.String str, bpw bpwVar, defpackage.kaw kawVar, defpackage.aomy aomyVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(-1257559414);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(vxVar) : cavVarB.D(vxVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.z(abjaVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.B(str) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != cavVarB.B(bpwVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != cavVarB.B(kawVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != cavVarB.D(aomyVar) ? 65536 : 131072;
        }
        if (cavVarB.H((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2 >> 15;
            int i5 = i2 << 3;
            defpackage.aaoo.aD(aomyVar, defpackage.azm.e(new bnn(1.0f).a(new bpf(kawVar, (defpackage.aiq) vxVar.a)), 56.0f), false, null, bpwVar, kawVar, defpackage.cfo.j(1213006356, new zjn(abjaVar, str, 6, (byte[]) null), cavVarB), cavVarB, (i4 & 14) | 1572864 | (57344 & i5) | (i5 & 458752));
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new axp(vxVar, abjaVar, str, bpwVar, kawVar, aomyVar, i, 7);
        }
    }

    public static java.io.IOException cx(defpackage.aogc aogcVar, android.net.Uri uri, java.io.IOException iOException, java.lang.String str) {
        try {
            affp affpVar = new affp();
            affpVar.b();
            java.io.File file = (java.io.File) aogcVar.M(uri, affpVar);
            if (!file.exists()) {
                return cE(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? cE(file, iOException, str) : cE(file, iOException, str);
                }
                return file.canWrite() ? cE(file, iOException, str) : cE(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? cE(file, iOException, str) : cE(file, iOException, str);
            }
            return file.canWrite() ? cE(file, iOException, str) : cE(file, iOException, str);
        } catch (java.io.IOException unused) {
            return new java.io.IOException(iOException);
        }
    }

    public static void cy(defpackage.aehj aehjVar, defpackage.aonj aonjVar, defpackage.aomy aomyVar, defpackage.aonj aonjVar2) {
        j$.util.Objects.checkIndex(0, 5);
        if (aehjVar instanceof zox) {
            return;
        }
        if (aehjVar instanceof zow) {
            aonjVar.a(((zow) aehjVar).a);
        } else if (aehjVar instanceof zou) {
            aonjVar2.a(((zou) aehjVar).a);
        } else {
            if (!(aehjVar instanceof zov)) {
                throw new defpackage.aois();
            }
            aomyVar.a();
        }
    }

    public static int d(boolean z) {
        return z ? 2131101150 : 2131102117;
    }

    public static int e(boolean z) {
        return z ? 2131101048 : 2131101036;
    }

    public static int f(boolean z) {
        return z ? 2131101036 : 2131101046;
    }

    public static boolean g(android.content.Context context) {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        return (accessibilityManager == null || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || enabledAccessibilityServiceList.isEmpty()) ? false : true;
    }

    public static float h(android.util.DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int i(android.util.DisplayMetrics displayMetrics, int i) {
        return (int) h(displayMetrics, i);
    }

    public static boolean j(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{2130969603, 2130969078});
        boolean z = false;
        try {
            if (typedArrayObtainStyledAttributes.getBoolean(0, false) && typedArrayObtainStyledAttributes.hasValue(1)) {
                z = true;
            }
            return z;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void k(android.graphics.drawable.Drawable drawable, int i) {
        android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(i);
        boolean z = true;
        if (!defpackage.afec.g() && drawable.getCallback() != null) {
            z = false;
        }
        defpackage.ahvr.bZ(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        drawable.mutate().setTintList(colorStateListValueOf);
    }

    public static java.util.concurrent.ThreadFactory l() {
        defpackage.annk annkVar = new defpackage.annk(null, null, null);
        annkVar.o("OneGoogle #%d");
        annkVar.n(false);
        defpackage.ahvr.bT(true, "Thread priority (%s) must be >= %s", 5, 1);
        defpackage.ahvr.bT(true, "Thread priority (%s) must be <= %s", 5, 10);
        annkVar.b = 5;
        annkVar.c = new ibm(3);
        return defpackage.annk.p(annkVar);
    }

    public static java.lang.String m(java.lang.Throwable th) {
        java.lang.String simpleName = th.getClass().getSimpleName();
        if (simpleName.endsWith("Exception")) {
            return simpleName.contains("$") ? simpleName.substring(simpleName.lastIndexOf(36) + 1) : simpleName;
        }
        return th instanceof defpackage.aacw ? "ApiException" : "ObfuscatedException";
    }

    public static java.lang.Throwable n(java.lang.Throwable th, java.lang.Class cls) {
        if (th == null) {
            return null;
        }
        return !th.getClass().equals(cls) ? n(th.getCause(), cls) : th;
    }

    public static int o(android.content.Context context, int i) {
        return context.getResources().getColor(q(context, i).resourceId);
    }

    public static int p(android.content.Context context, int i) {
        return android.util.TypedValue.complexToDimensionPixelSize(q(context, i).data, context.getResources().getDisplayMetrics());
    }

    public static android.util.TypedValue q(android.content.Context context, int i) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new java.lang.IllegalStateException("Attribute not available.");
    }

    public static aeii u(android.content.Context context, boolean z) {
        if (z) {
            android.content.res.Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131167256);
            return new aeii(new aeij(resources.getDimensionPixelSize(2131167250), resources.getDimensionPixelSize(2131167251), resources.getDimensionPixelSize(2131167255), resources.getDimensionPixelSize(2131167255), resources.getDimensionPixelSize(2131167257), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize));
        }
        android.content.res.Resources resources2 = context.getResources();
        int dimensionPixelSize2 = resources2.getDimensionPixelSize(2131167244);
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(2131167243);
        int dimensionPixelSize4 = resources2.getDimensionPixelSize(2131167259);
        return new aeii(new aeij(resources2.getDimensionPixelSize(2131167250), resources2.getDimensionPixelSize(2131167251), dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize4, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4));
    }

    public static /* synthetic */ java.lang.String v(int i) {
        if (i == 1) {
            return "NON_RETRYABLE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "OFFLINE";
        }
        return "RETRYABLE";
    }

    public static android.net.Uri w(akmc akmcVar) {
        defpackage.aooh.f(akmcVar, "photo");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("https://lh3.googleusercontent.com/p/");
        if ((akmcVar.b & 1) != 0) {
            sb.append(akmcVar.c);
        }
        if ((akmcVar.b & 2) != 0) {
            sb.append("=iv");
            sb.append(akmcVar.d);
        }
        android.net.Uri uri = android.net.Uri.parse(sb.toString());
        defpackage.aooh.e(uri, "parse(...)");
        return uri;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4 A[LOOP:0: B:64:0x00ee->B:66:0x00f4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x010b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static boolean x(int i, amip amipVar, com.google.android.libraries.surveys.internal.model.Answer answer) {
        defpackage.aify aifyVarH;
        java.util.ArrayList arrayList;
        amig amigVar;
        int i2;
        int iAc;
        int i3;
        amif amifVar;
        amie amieVar;
        amib amibVar;
        java.util.Iterator it;
        amid amidVar;
        amie amieVar2;
        if (i >= amipVar.g.size()) {
            return false;
        }
        amiv amivVar = (amiv) amipVar.g.get(i);
        if (amivVar.j) {
            defpackage.aift aiftVar = new defpackage.aift(4);
            int iAb = defpackage.a.ab(amivVar.i);
            if (iAb == 0) {
                iAb = 1;
            }
            int i4 = iAb - 2;
            if (i4 == 1) {
                amhn amhnVar = (amivVar.c == 4 ? (amjf) amivVar.d : amjf.a).c;
                if (amhnVar == null) {
                    amhnVar = amhn.a;
                }
                for (amhm amhmVar : amhnVar.b) {
                    if (amhmVar.f) {
                        aiftVar.i(java.lang.Integer.valueOf(amhmVar.d));
                    }
                }
            } else if (i4 != 2) {
                if (i4 == 3) {
                    aifyVarH = defpackage.aify.n((amivVar.c == 6 ? (amix) amivVar.d : amix.a).d);
                }
                if (!aifyVarH.isEmpty()) {
                    return false;
                }
                arrayList = new java.util.ArrayList();
                amigVar = answer.a;
                i2 = amigVar.b;
                iAc = defpackage.a.ac(i2);
                if (iAc != 0) {
                    throw null;
                }
                i3 = iAc - 1;
                if (i3 != 0) {
                    if (i2 == 2) {
                        amifVar = (amif) amigVar.c;
                    } else {
                        amifVar = amif.a;
                    }
                    amieVar = amifVar.c;
                    if (amieVar == null) {
                        amieVar = amie.a;
                    }
                    arrayList.add(java.lang.Integer.valueOf(amieVar.c));
                } else if (i3 != 1) {
                    if (i2 == 3) {
                        amibVar = (amib) amigVar.c;
                    } else {
                        amibVar = amib.a;
                    }
                    it = amibVar.b.iterator();
                    while (it.hasNext()) {
                        arrayList.add(java.lang.Integer.valueOf(((amie) it.next()).c));
                    }
                } else if (i3 == 2) {
                    if (i2 == 4) {
                        amidVar = (amid) amigVar.c;
                    } else {
                        amidVar = amid.a;
                    }
                    amieVar2 = amidVar.c;
                    if (amieVar2 == null) {
                        amieVar2 = amie.a;
                    }
                    arrayList.add(java.lang.Integer.valueOf(amieVar2.c));
                }
                if (java.util.Collections.disjoint(arrayList, aifyVarH)) {
                    return false;
                }
            } else {
                amhn amhnVar2 = (amivVar.c == 5 ? (amin) amivVar.d : amin.a).c;
                if (amhnVar2 == null) {
                    amhnVar2 = amhn.a;
                }
                for (amhm amhmVar2 : amhnVar2.b) {
                    if (amhmVar2.f) {
                        aiftVar.i(java.lang.Integer.valueOf(amhmVar2.d));
                    }
                }
            }
            aifyVarH = aiftVar.g();
            if (!aifyVarH.isEmpty()) {
                return false;
            }
            arrayList = new java.util.ArrayList();
            amigVar = answer.a;
            i2 = amigVar.b;
            iAc = defpackage.a.ac(i2);
            if (iAc != 0) {
                throw null;
            }
            i3 = iAc - 1;
            if (i3 != 0) {
                if (i2 == 2) {
                    amifVar = (amif) amigVar.c;
                } else {
                    amifVar = amif.a;
                }
                amieVar = amifVar.c;
                if (amieVar == null) {
                    amieVar = amie.a;
                }
                arrayList.add(java.lang.Integer.valueOf(amieVar.c));
            } else if (i3 != 1) {
                if (i2 == 3) {
                    amibVar = (amib) amigVar.c;
                } else {
                    amibVar = amib.a;
                }
                it = amibVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Integer.valueOf(((amie) it.next()).c));
                }
            } else if (i3 == 2) {
                if (i2 == 4) {
                    amidVar = (amid) amigVar.c;
                } else {
                    amidVar = amid.a;
                }
                amieVar2 = amidVar.c;
                if (amieVar2 == null) {
                    amieVar2 = amie.a;
                }
                arrayList.add(java.lang.Integer.valueOf(amieVar2.c));
            }
            if (java.util.Collections.disjoint(arrayList, aifyVarH)) {
                return false;
            }
        }
        return true;
    }

    public static boolean y(boolean z, amip amipVar, com.google.android.libraries.surveys.internal.model.Answer answer) {
        defpackage.aehj aehjVar = afjy.c;
        android.content.Context context = afjy.b;
        return afjy.b(true) && z && !x(0, amipVar, answer);
    }

    public static algi z(amie amieVar) {
        defpackage.akzx akzxVarM = algi.a.m();
        int i = amieVar.b;
        akzxVarM.u();
        akzxVarM.b.b = i;
        int i2 = amieVar.c;
        akzxVarM.u();
        akzxVarM.b.c = i2;
        java.lang.String str = amieVar.d;
        akzxVarM.u();
        algi algiVar = akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        algiVar.d = str;
        return akzxVarM.r();
    }

    public aehj(char[] cArr) {
    }

    public aehj() {
    }

    public void s() {
    }

    public void r(defpackage.aify aifyVar) {
    }

    public void t(java.lang.Object obj) {
    }
}
