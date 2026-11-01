package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amce {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmItemWrapper");
    public final defpackage.amft b;
    public final java.lang.Integer c;
    public final j$.util.Optional d;
    public final j$.util.Optional e;
    public final boolean f;
    public final aify g;

    public amce(defpackage.amft amftVar, java.lang.Integer num, j$.util.Optional optional, j$.util.Optional optional2, boolean z, aify aifyVar) {
        this.b = amftVar;
        this.c = num;
        this.d = optional;
        this.e = optional2;
        this.f = z;
        this.g = aifyVar;
    }

    public static defpackage.amcd a() {
        defpackage.amcd amcdVar = new defpackage.amcd((byte[]) null);
        amcdVar.c(defpackage.amft.a);
        amcdVar.b = 0;
        amcdVar.d(j$.util.Optional.empty());
        amcdVar.e(j$.util.Optional.empty());
        amcdVar.g(aike.a);
        amcdVar.f(false);
        return amcdVar;
    }

    public static java.lang.String f(defpackage.amft amftVar) {
        j$.util.Optional optionalK = defpackage.amev.k(amftVar);
        if (optionalK.isEmpty()) {
            return "";
        }
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.amfy) optionalK.get()).d).filter(new defpackage.alzc(12)).collect(aido.a);
        return aifyVar.isEmpty() ? defpackage.amev.n(amftVar) : defpackage.amev.n(amftVar).substring(0, java.lang.Math.max(((defpackage.amfx) aifyVar.get(0)).c - 1, 0));
    }

    private final java.lang.String r(aihd aihdVar) {
        j$.util.Optional optionalK = defpackage.amev.k(this.b);
        if (optionalK.isEmpty()) {
            return "";
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strD = d();
        aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.amfy) optionalK.get()).d).filter(new defpackage.amcc(aihdVar, 2)).collect(aido.a);
        int size = aifyVar.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.amfx amfxVar = (defpackage.amfx) aifyVar.get(i2);
            int i3 = amfxVar.c;
            if (i3 > i + 1) {
                break;
            }
            arrayList.add(strD.substring(i3, amfxVar.d));
            i = amfxVar.d;
        }
        return defpackage.amjk.i(" ", arrayList);
    }

    private final java.lang.String s(defpackage.amfw amfwVar) {
        j$.util.Optional optionalK = defpackage.amev.k(this.b);
        if (!optionalK.isEmpty()) {
            aify aifyVar = (aify) j$.util.Collection.-EL.stream(((defpackage.amfy) optionalK.get()).d).filter(new defpackage.amcc(amfwVar, 0)).collect(aido.a);
            if (!aifyVar.isEmpty()) {
                return d().substring(((defpackage.amfx) aifyVar.get(0)).c, ((defpackage.amfx) aifyVar.get(0)).d);
            }
        }
        return "";
    }

    public final defpackage.amce b() {
        defpackage.amft amftVar = this.b;
        int i = amftVar.c;
        if (i != 2) {
            return this;
        }
        int iAN = a.aN((i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).g);
        if (iAN != 0 && iAN == 2) {
            return this;
        }
        akzx akzxVarP = amftVar.p();
        akzx akzxVarP2 = (amftVar.c == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).p();
        akzxVarP2.u();
        defpackage.amgc amgcVar = (defpackage.amgc) akzxVarP2.b;
        amgcVar.g = 3;
        amgcVar.b |= 32;
        defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP2.p();
        akzxVarP.u();
        defpackage.amft amftVar2 = (defpackage.amft) akzxVarP.b;
        j$.util.Objects.requireNonNull(amgcVar2);
        amftVar2.d = amgcVar2;
        amftVar2.c = 2;
        defpackage.amft amftVar3 = (defpackage.amft) akzxVarP.p();
        defpackage.amcd amcdVar = new defpackage.amcd(this);
        amcdVar.c(amftVar3);
        return amcdVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x020d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0222  */
    /* JADX WARN: Code duplicated, block: B:87:0x0250  */
    public final j$.util.Optional c(int i) {
        j$.util.Optional optionalOf;
        defpackage.amfy amfyVar;
        j$.util.Optional optionalOf2;
        defpackage.amgb amgbVar;
        defpackage.amgb amgbVar2;
        defpackage.amgb amgbVar3;
        defpackage.amgb amgbVar4;
        defpackage.amgb amgbVar5;
        defpackage.amfy amfyVar2;
        j$.util.Optional optionalOf3;
        defpackage.amge amgeVar;
        defpackage.amge amgeVar2;
        defpackage.amge amgeVar3;
        defpackage.amge amgeVar4;
        defpackage.amge amgeVar5;
        if (i()) {
            a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AmItemWrapper", "truncateText", 459, "AmItemWrapper.java").v("Truncating cache-based items is unsupported, returning full item!");
            return j$.util.Optional.of(new defpackage.amcd(this).a());
        }
        defpackage.amcd amcdVar = new defpackage.amcd(this);
        defpackage.amft amftVar = this.b;
        aimz aimzVar = defpackage.amev.a;
        int iE = defpackage.amjk.e(amftVar.c);
        java.lang.String strN = defpackage.amev.n(amftVar);
        if (!strN.isEmpty() && !defpackage.amev.s(strN, i).equals(strN)) {
            int i2 = iE - 1;
            if (iE == 0) {
                throw null;
            }
            switch (i2) {
                case 0:
                    akzx akzxVarM = defpackage.amft.a.m();
                    defpackage.amfp amfpVar = amftVar.c == 1 ? (defpackage.amfp) amftVar.d : defpackage.amfp.a;
                    defpackage.amfy amfyVar3 = amfpVar.d;
                    if (amfyVar3 == null) {
                        amfyVar3 = defpackage.amfy.a;
                    }
                    java.lang.String strS = defpackage.amev.s(amfyVar3.c, i);
                    akzx akzxVarP = amfpVar.p();
                    if ((amfpVar.b & 1) != 0) {
                        akzxVarP.u();
                        defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarP.b;
                        j$.util.Objects.requireNonNull(strS);
                        amfpVar2.b |= 1;
                        amfpVar2.c = strS;
                    }
                    defpackage.amfy amfyVar4 = amfpVar.d;
                    if (amfyVar4 == null) {
                        amfyVar4 = defpackage.amfy.a;
                    }
                    defpackage.amfy amfyVarI = defpackage.amev.i(amfyVar4, i);
                    akzxVarP.u();
                    defpackage.amfp amfpVar3 = (defpackage.amfp) akzxVarP.b;
                    j$.util.Objects.requireNonNull(amfyVarI);
                    amfpVar3.d = amfyVarI;
                    amfpVar3.b |= 2;
                    defpackage.amfp amfpVar4 = (defpackage.amfp) akzxVarP.p();
                    akzxVarM.u();
                    defpackage.amft amftVar2 = (defpackage.amft) akzxVarM.b;
                    j$.util.Objects.requireNonNull(amfpVar4);
                    amftVar2.d = amfpVar4;
                    amftVar2.c = 1;
                    optionalOf = j$.util.Optional.of((defpackage.amft) akzxVarM.p());
                    break;
                case 1:
                    defpackage.amgc amgcVar = amftVar.c == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a;
                    akzx akzxVarP2 = amgcVar.p();
                    defpackage.amfy amfyVar5 = amgcVar.e;
                    if (amfyVar5 == null) {
                        amfyVar5 = defpackage.amfy.a;
                    }
                    java.lang.String str = amfyVar5.c;
                    java.lang.String strS2 = defpackage.amev.s(str, i);
                    if ((amgcVar.b & 4) == 0) {
                        if ((amgcVar.b & 16) != 0) {
                            amgbVar = amgcVar.f;
                            if (amgbVar == null) {
                                amgbVar = defpackage.amgb.a;
                            }
                            int i3 = amgbVar.d;
                            amgbVar2 = amgcVar.f;
                            if (amgbVar2 == null) {
                                amgbVar2 = defpackage.amgb.a;
                            }
                            int length = (i3 - amgbVar2.c) - strS2.length();
                            amgbVar3 = defpackage.amgb.a;
                            akzx akzxVarM2 = amgbVar3.m();
                            amgbVar4 = amgcVar.f;
                            if (amgbVar4 == null) {
                                amgbVar4 = amgbVar3;
                            }
                            int i4 = amgbVar4.c;
                            akzxVarM2.u();
                            defpackage.amgb amgbVar6 = (defpackage.amgb) akzxVarM2.b;
                            amgbVar6.b |= 1;
                            amgbVar6.c = i4;
                            amgbVar5 = amgcVar.f;
                            if (amgbVar5 != null) {
                                amgbVar3 = amgbVar5;
                            }
                            int i5 = amgbVar3.d - length;
                            akzxVarM2.u();
                            defpackage.amgb amgbVar7 = (defpackage.amgb) akzxVarM2.b;
                            amgbVar7.b |= 2;
                            amgbVar7.d = i5;
                            akzxVarP2.u();
                            defpackage.amgc amgcVar2 = (defpackage.amgc) akzxVarP2.b;
                            defpackage.amgb amgbVar8 = (defpackage.amgb) akzxVarM2.p();
                            j$.util.Objects.requireNonNull(amgbVar8);
                            amgcVar2.f = amgbVar8;
                            amgcVar2.b |= 16;
                        }
                        amfyVar = amgcVar.e;
                        if (amfyVar == null) {
                            amfyVar = defpackage.amfy.a;
                        }
                        defpackage.amfy amfyVarI2 = defpackage.amev.i(amfyVar, i);
                        akzxVarP2.u();
                        defpackage.amgc amgcVar3 = (defpackage.amgc) akzxVarP2.b;
                        j$.util.Objects.requireNonNull(amfyVarI2);
                        amgcVar3.e = amfyVarI2;
                        amgcVar3.b |= 8;
                        optionalOf2 = j$.util.Optional.of((defpackage.amgc) akzxVarP2.p());
                    } else {
                        java.lang.String str2 = amgcVar.d;
                        int iIndexOf = str.indexOf(str2);
                        if (iIndexOf == -1) {
                            defpackage.amev.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "truncateIvrOption", 662, "Utils.java").I("Action %s not found in text %s", str2, str);
                            optionalOf2 = j$.util.Optional.empty();
                        } else if (str2.length() + iIndexOf > strS2.length()) {
                            optionalOf2 = j$.util.Optional.empty();
                        } else {
                            if ((amgcVar.b & 16) != 0) {
                                amgbVar = amgcVar.f;
                                if (amgbVar == null) {
                                    amgbVar = defpackage.amgb.a;
                                }
                                int i6 = amgbVar.d;
                                amgbVar2 = amgcVar.f;
                                if (amgbVar2 == null) {
                                    amgbVar2 = defpackage.amgb.a;
                                }
                                int length2 = (i6 - amgbVar2.c) - strS2.length();
                                amgbVar3 = defpackage.amgb.a;
                                akzx akzxVarM3 = amgbVar3.m();
                                amgbVar4 = amgcVar.f;
                                if (amgbVar4 == null) {
                                    amgbVar4 = amgbVar3;
                                }
                                int i7 = amgbVar4.c;
                                akzxVarM3.u();
                                defpackage.amgb amgbVar9 = (defpackage.amgb) akzxVarM3.b;
                                amgbVar9.b |= 1;
                                amgbVar9.c = i7;
                                amgbVar5 = amgcVar.f;
                                if (amgbVar5 != null) {
                                    amgbVar3 = amgbVar5;
                                }
                                int i8 = amgbVar3.d - length2;
                                akzxVarM3.u();
                                defpackage.amgb amgbVar10 = (defpackage.amgb) akzxVarM3.b;
                                amgbVar10.b |= 2;
                                amgbVar10.d = i8;
                                akzxVarP2.u();
                                defpackage.amgc amgcVar4 = (defpackage.amgc) akzxVarP2.b;
                                defpackage.amgb amgbVar11 = (defpackage.amgb) akzxVarM3.p();
                                j$.util.Objects.requireNonNull(amgbVar11);
                                amgcVar4.f = amgbVar11;
                                amgcVar4.b |= 16;
                            }
                            amfyVar = amgcVar.e;
                            if (amfyVar == null) {
                                amfyVar = defpackage.amfy.a;
                            }
                            defpackage.amfy amfyVarI3 = defpackage.amev.i(amfyVar, i);
                            akzxVarP2.u();
                            defpackage.amgc amgcVar5 = (defpackage.amgc) akzxVarP2.b;
                            j$.util.Objects.requireNonNull(amfyVarI3);
                            amgcVar5.e = amfyVarI3;
                            amgcVar5.b |= 8;
                            optionalOf2 = j$.util.Optional.of((defpackage.amgc) akzxVarP2.p());
                        }
                    }
                    if (!optionalOf2.isPresent()) {
                        optionalOf = j$.util.Optional.empty();
                    } else {
                        akzx akzxVarP3 = amftVar.p();
                        java.lang.Object obj = optionalOf2.get();
                        akzxVarP3.u();
                        defpackage.amft amftVar3 = (defpackage.amft) akzxVarP3.b;
                        j$.util.Objects.requireNonNull(obj);
                        amftVar3.d = obj;
                        amftVar3.c = 2;
                        optionalOf = j$.util.Optional.of((defpackage.amft) akzxVarP3.p());
                    }
                    break;
                case 2:
                case 3:
                case 4:
                case 6:
                    optionalOf = j$.util.Optional.of(amftVar);
                    break;
                case 5:
                    defpackage.amgf amgfVar = amftVar.c == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a;
                    akzx akzxVarP4 = amgfVar.p();
                    defpackage.amfy amfyVar6 = amgfVar.e;
                    if (amfyVar6 == null) {
                        amfyVar6 = defpackage.amfy.a;
                    }
                    java.lang.String str3 = amfyVar6.c;
                    java.lang.String strS3 = defpackage.amev.s(str3, i);
                    if ((amgfVar.b & 2) == 0) {
                        if ((amgfVar.b & 8) != 0) {
                            amgeVar = amgfVar.f;
                            if (amgeVar == null) {
                                amgeVar = defpackage.amge.a;
                            }
                            int i9 = amgeVar.d;
                            amgeVar2 = amgfVar.f;
                            if (amgeVar2 == null) {
                                amgeVar2 = defpackage.amge.a;
                            }
                            int length3 = (i9 - amgeVar2.c) - strS3.length();
                            amgeVar3 = defpackage.amge.a;
                            akzx akzxVarM4 = amgeVar3.m();
                            amgeVar4 = amgfVar.f;
                            if (amgeVar4 == null) {
                                amgeVar4 = amgeVar3;
                            }
                            int i10 = amgeVar4.c;
                            akzxVarM4.u();
                            defpackage.amge amgeVar6 = (defpackage.amge) akzxVarM4.b;
                            amgeVar6.b |= 1;
                            amgeVar6.c = i10;
                            amgeVar5 = amgfVar.f;
                            if (amgeVar5 != null) {
                                amgeVar3 = amgeVar5;
                            }
                            int i11 = amgeVar3.d - length3;
                            akzxVarM4.u();
                            defpackage.amge amgeVar7 = (defpackage.amge) akzxVarM4.b;
                            amgeVar7.b |= 2;
                            amgeVar7.d = i11;
                            akzxVarP4.u();
                            defpackage.amgf amgfVar2 = (defpackage.amgf) akzxVarP4.b;
                            defpackage.amge amgeVar8 = (defpackage.amge) akzxVarM4.p();
                            j$.util.Objects.requireNonNull(amgeVar8);
                            amgfVar2.f = amgeVar8;
                            amgfVar2.b |= 8;
                        }
                        amfyVar2 = amgfVar.e;
                        if (amfyVar2 == null) {
                            amfyVar2 = defpackage.amfy.a;
                        }
                        defpackage.amfy amfyVarI4 = defpackage.amev.i(amfyVar2, i);
                        akzxVarP4.u();
                        defpackage.amgf amgfVar3 = (defpackage.amgf) akzxVarP4.b;
                        j$.util.Objects.requireNonNull(amfyVarI4);
                        amgfVar3.e = amfyVarI4;
                        amgfVar3.b |= 4;
                        optionalOf3 = j$.util.Optional.of((defpackage.amgf) akzxVarP4.p());
                    } else {
                        java.lang.String str4 = amgfVar.d;
                        int iIndexOf2 = str3.indexOf(str4);
                        if (iIndexOf2 == -1) {
                            defpackage.amev.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "truncateVoiceIvrOption", 700, "Utils.java").I("Voice action %s not found in text %s", str4, str3);
                            optionalOf3 = j$.util.Optional.empty();
                        } else if (str4.length() + iIndexOf2 > strS3.length()) {
                            optionalOf3 = j$.util.Optional.empty();
                        } else {
                            if ((amgfVar.b & 8) != 0) {
                                amgeVar = amgfVar.f;
                                if (amgeVar == null) {
                                    amgeVar = defpackage.amge.a;
                                }
                                int i12 = amgeVar.d;
                                amgeVar2 = amgfVar.f;
                                if (amgeVar2 == null) {
                                    amgeVar2 = defpackage.amge.a;
                                }
                                int length4 = (i12 - amgeVar2.c) - strS3.length();
                                amgeVar3 = defpackage.amge.a;
                                akzx akzxVarM5 = amgeVar3.m();
                                amgeVar4 = amgfVar.f;
                                if (amgeVar4 == null) {
                                    amgeVar4 = amgeVar3;
                                }
                                int i13 = amgeVar4.c;
                                akzxVarM5.u();
                                defpackage.amge amgeVar9 = (defpackage.amge) akzxVarM5.b;
                                amgeVar9.b |= 1;
                                amgeVar9.c = i13;
                                amgeVar5 = amgfVar.f;
                                if (amgeVar5 != null) {
                                    amgeVar3 = amgeVar5;
                                }
                                int i14 = amgeVar3.d - length4;
                                akzxVarM5.u();
                                defpackage.amge amgeVar10 = (defpackage.amge) akzxVarM5.b;
                                amgeVar10.b |= 2;
                                amgeVar10.d = i14;
                                akzxVarP4.u();
                                defpackage.amgf amgfVar4 = (defpackage.amgf) akzxVarP4.b;
                                defpackage.amge amgeVar11 = (defpackage.amge) akzxVarM5.p();
                                j$.util.Objects.requireNonNull(amgeVar11);
                                amgfVar4.f = amgeVar11;
                                amgfVar4.b |= 8;
                            }
                            amfyVar2 = amgfVar.e;
                            if (amfyVar2 == null) {
                                amfyVar2 = defpackage.amfy.a;
                            }
                            defpackage.amfy amfyVarI5 = defpackage.amev.i(amfyVar2, i);
                            akzxVarP4.u();
                            defpackage.amgf amgfVar5 = (defpackage.amgf) akzxVarP4.b;
                            j$.util.Objects.requireNonNull(amfyVarI5);
                            amgfVar5.e = amfyVarI5;
                            amgfVar5.b |= 4;
                            optionalOf3 = j$.util.Optional.of((defpackage.amgf) akzxVarP4.p());
                        }
                    }
                    if (!optionalOf3.isPresent()) {
                        optionalOf = j$.util.Optional.empty();
                    } else {
                        akzx akzxVarP5 = amftVar.p();
                        java.lang.Object obj2 = optionalOf3.get();
                        akzxVarP5.u();
                        defpackage.amft amftVar4 = (defpackage.amft) akzxVarP5.b;
                        j$.util.Objects.requireNonNull(obj2);
                        amftVar4.d = obj2;
                        amftVar4.c = 8;
                        optionalOf = j$.util.Optional.of((defpackage.amft) akzxVarP5.p());
                    }
                    break;
                case 7:
                    defpackage.amev.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "truncateAmItem", 777, "Utils.java").v("Truncating an unset AMItem with text!");
                    optionalOf = j$.util.Optional.empty();
                    break;
                default:
                    defpackage.amev.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/Utils", "truncateAmItem", 782, "Utils.java").v("Truncating an unhandled AMItem type");
                    optionalOf = j$.util.Optional.empty();
                    break;
            }
        } else {
            optionalOf = j$.util.Optional.of(amftVar);
        }
        if (optionalOf.isEmpty()) {
            return j$.util.Optional.empty();
        }
        amcdVar.c((defpackage.amft) optionalOf.get());
        java.lang.String strN2 = defpackage.amev.n((defpackage.amft) optionalOf.get());
        if (this.c.intValue() > strN2.length()) {
            amcdVar.b = java.lang.Integer.valueOf(strN2.length());
        }
        return j$.util.Optional.of(amcdVar.a());
    }

    public final java.lang.String d() {
        return defpackage.amev.n(this.b);
    }

    public final java.lang.String e() {
        return f(this.b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amce) {
            defpackage.amce amceVar = (defpackage.amce) obj;
            if (this.b.equals(amceVar.b) && this.c.equals(amceVar.c) && this.d.equals(amceVar.d) && this.e.equals(amceVar.e) && this.f == amceVar.f && ahvr.aP(this.g, amceVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        int iIntValue = this.c.intValue();
        return iIntValue > 0 && iIntValue == d().length();
    }

    public final boolean h() {
        if (!j()) {
            return false;
        }
        aify aifyVar = this.g;
        return j$.util.Collection.-EL.stream(aifyVar).mapToDouble(new defpackage.alyx(6)).average().orElse(0.0d) <= 0.4000000059604645d && j$.util.Collection.-EL.stream(aifyVar.b(java.lang.Math.max(0, aifyVar.size() + (-3)), aifyVar.size())).mapToDouble(new defpackage.alyx(7)).average().orElse(0.0d) <= 0.4000000059604645d;
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode();
    }

    public final boolean i() {
        return r(defpackage.amev.d).equals(d());
    }

    public final boolean j() {
        return r(new aile(defpackage.amfw.MATCHED_CACHE)).equals(d());
    }

    public final boolean k() {
        return r(new aile(defpackage.amfw.PREDICTED_BY_CACHE)).equals(d());
    }

    public final boolean l() {
        return this.b.c == 1;
    }

    public final boolean m() {
        return n() || q();
    }

    public final boolean n() {
        return this.b.c == 2;
    }

    public final boolean o() {
        defpackage.amft amftVar = this.b;
        int iAN = a.aN((amftVar.c == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).g);
        return iAN != 0 && iAN == 2;
    }

    public final boolean p() {
        int iIntValue = this.c.intValue();
        return iIntValue > 0 && iIntValue >= e().length();
    }

    public final boolean q() {
        return this.b.c == 8;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String strConcat = "[".concat(java.lang.String.valueOf(e()));
        arrayList.add(i() ? strConcat.concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "|<M: %s> <P: %s>", s(defpackage.amfw.MATCHED_CACHE), s(defpackage.amfw.PREDICTED_BY_CACHE)))) : strConcat.concat("| online"));
        defpackage.amft amftVar = this.b;
        switch (defpackage.amjk.e(amftVar.c)) {
            case 1:
                str = "INFO";
                break;
            case 2:
                str = "IVR_OPTION";
                break;
            case 3:
                str = "MUSIC_PLAYING";
                break;
            case 4:
                str = "AGENT_DETECTED";
                break;
            case 5:
                str = "ON_HOLD_DETECTED";
                break;
            case 6:
                str = "VOICE_IVR_OPTION";
                break;
            case 7:
                str = "TRANSCRIPTION_MODE_CHANGED";
                break;
            case 8:
                str = "ITEM_NOT_SET";
                break;
            default:
                str = "null";
                break;
        }
        arrayList.add("type: ".concat(str));
        if (p()) {
            arrayList.add("spokenTextFinal");
        }
        if (g()) {
            arrayList.add("completelyFinal");
        }
        arrayList.add(java.lang.String.format(java.util.Locale.US, "finalizedTextLen: %d", this.c));
        if (this.f) {
            arrayList.add("wasBeforeLastSkip");
        }
        if ((amftVar.b & 4) != 0) {
            arrayList.add(java.lang.String.format("layerId: %s", java.lang.Long.valueOf(amftVar.g)));
        }
        java.util.Locale locale = java.util.Locale.US;
        j$.util.Optional optional = this.d;
        arrayList.add(java.lang.String.format(locale, "cacheId: %s]", optional.isPresent() ? optional.get() : "NO ID"));
        return defpackage.amjk.i("] [", arrayList);
    }

    public amce() {
        throw null;
    }
}
