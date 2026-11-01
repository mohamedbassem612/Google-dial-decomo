package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class acfz extends defpackage.acev {
    static final ahxq a = new defpackage.acet();
    static final ahxq b = new defpackage.acfm();
    static final ahyc c = new defpackage.acen(9);
    static final ahxq d = new defpackage.acfl();
    static final ahxq e = new defpackage.acfp();
    static final ahxq f = new defpackage.acft();
    static final ahyc g = new acfy();
    static final ahxq h = new defpackage.acfk();

    @Override // defpackage.acev
    public final void a(defpackage.akui akuiVar, akzx akzxVar) {
        ahxq ahxqVar = d;
        defpackage.akuf akufVar = akuiVar.l;
        if (akufVar == null) {
            akufVar = defpackage.akuf.a;
        }
        defpackage.akue akueVarB = defpackage.akue.b(akufVar.e);
        if (akueVarB == null) {
            akueVarB = defpackage.akue.ALIGNMENT_UNSPECIFIED;
        }
        defpackage.akjd akjdVar = (defpackage.akjd) ahxqVar.d(akueVarB);
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        akjhVar.i = akjdVar.d;
        akjhVar.b |= 32;
    }

    @Override // defpackage.acev
    public final void b(defpackage.akui akuiVar, akzx akzxVar) {
        ahxq ahxqVar = b;
        defpackage.akuf akufVar = akuiVar.l;
        if (akufVar == null) {
            akufVar = defpackage.akuf.a;
        }
        defpackage.akud akudVar = akufVar.d;
        if (akudVar == null) {
            akudVar = defpackage.akud.a;
        }
        defpackage.akub akubVarB = defpackage.akub.b(akudVar.g);
        if (akubVarB == null) {
            akubVarB = defpackage.akub.BUTTONS_LAYOUT_UNSPECIFIED;
        }
        defpackage.akje akjeVar = (defpackage.akje) ahxqVar.d(akubVarB);
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        akjhVar.h = akjeVar.d;
        akjhVar.b |= 16;
    }

    @Override // defpackage.acev
    public final void c(defpackage.akui akuiVar, akzx akzxVar) {
        defpackage.ammn ammnVar = akuiVar.g;
        if (ammnVar == null) {
            ammnVar = defpackage.ammn.a;
        }
        java.lang.String str = ammnVar.b;
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        j$.util.Objects.requireNonNull(str);
        akjhVar.b |= 2;
        akjhVar.d = str;
    }

    @Override // defpackage.acev
    public final void d(defpackage.akui akuiVar, akzx akzxVar) {
        ahyc ahycVar = c;
        defpackage.akuf akufVar = akuiVar.l;
        if (akufVar == null) {
            akufVar = defpackage.akuf.a;
        }
        defpackage.akud akudVar = akufVar.d;
        if (akudVar == null) {
            akudVar = defpackage.akud.a;
        }
        defpackage.akuc akucVarB = defpackage.akuc.b(akudVar.k);
        if (akucVarB == null) {
            akucVarB = defpackage.akuc.BUTTONS_ORDER_UNSPECIFIED;
        }
        java.lang.Object objApply = ahycVar.apply(akucVarB);
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        akjhVar.m = ((defpackage.akjf) objApply).d;
        akjhVar.b |= 1024;
    }

    @Override // defpackage.acev
    public final void e(defpackage.akui akuiVar, akzx akzxVar) {
        defpackage.ammn ammnVar = akuiVar.f;
        if (ammnVar == null) {
            ammnVar = defpackage.ammn.a;
        }
        java.lang.String str = ammnVar.b;
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        j$.util.Objects.requireNonNull(str);
        akjhVar.b |= 1;
        akjhVar.c = str;
    }

    @Override // defpackage.acev
    public final void f(defpackage.akui akuiVar, akzx akzxVar) {
        boolean z = akuiVar.h;
        akzxVar.u();
        defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar2 = defpackage.akjh.a;
        akjhVar.b |= 4;
        akjhVar.e = z;
    }

    @Override // defpackage.acev
    public final void g(defpackage.akui akuiVar, akzx akzxVar) {
        int i = akuiVar.c;
        if (i == 8) {
            akzxVar.u();
            defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
            defpackage.akjh akjhVar2 = defpackage.akjh.a;
            akjhVar.k = 1;
            akjhVar.b |= 256;
            return;
        }
        if (i == 9) {
            akzxVar.u();
            defpackage.akjh akjhVar3 = (defpackage.akjh) akzxVar.b;
            defpackage.akjh akjhVar4 = defpackage.akjh.a;
            akjhVar3.k = 2;
            akjhVar3.b |= 256;
            return;
        }
        akzxVar.u();
        defpackage.akjh akjhVar5 = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar6 = defpackage.akjh.a;
        akjhVar5.k = 0;
        akjhVar5.b |= 256;
    }

    @Override // defpackage.acev
    public final void h(defpackage.akui akuiVar, akzx akzxVar) {
        int iAS = a.aS(akuiVar.e);
        if (iAS == 0) {
            iAS = 1;
        }
        int i = iAS - 1;
        if (i == 1) {
            akzxVar.u();
            defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
            defpackage.akjh akjhVar2 = defpackage.akjh.a;
            akjhVar.l = 6;
            akjhVar.b |= 512;
            return;
        }
        if (i != 2) {
            akzxVar.u();
            defpackage.akjh akjhVar3 = (defpackage.akjh) akzxVar.b;
            defpackage.akjh akjhVar4 = defpackage.akjh.a;
            akjhVar3.l = 0;
            akjhVar3.b |= 512;
            return;
        }
        akzxVar.u();
        defpackage.akjh akjhVar5 = (defpackage.akjh) akzxVar.b;
        defpackage.akjh akjhVar6 = defpackage.akjh.a;
        akjhVar5.l = 4;
        akjhVar5.b |= 512;
    }

    @Override // defpackage.acev
    public final void i(defpackage.akui akuiVar, akzx akzxVar) {
        if ((akuiVar.b & 32) != 0) {
            akzx akzxVarM = defpackage.akkd.a.m();
            ahxq ahxqVar = a;
            defpackage.aktz aktzVar = akuiVar.j;
            if (aktzVar == null) {
                aktzVar = defpackage.aktz.a;
            }
            defpackage.akiv akivVar = (defpackage.akiv) ahxqVar.d(aktzVar);
            akzxVarM.u();
            defpackage.akkd akkdVar = (defpackage.akkd) akzxVarM.b;
            j$.util.Objects.requireNonNull(akivVar);
            akkdVar.d = akivVar;
            akkdVar.b |= 2;
            akkc akkcVar = akkc.b;
            akzxVarM.u();
            defpackage.akkd akkdVar2 = (defpackage.akkd) akzxVarM.b;
            akkdVar2.c = akkcVar.d;
            akkdVar2.b |= 1;
            if (akuiVar.c == 9) {
                akzx akzxVarM2 = defpackage.akjk.a.m();
                java.lang.String str = (akuiVar.c == 9 ? (defpackage.akuh) akuiVar.d : defpackage.akuh.a).b;
                akzxVarM2.u();
                defpackage.akjk akjkVar = (defpackage.akjk) akzxVarM2.b;
                j$.util.Objects.requireNonNull(str);
                akjkVar.b = 1;
                akjkVar.c = str;
                akzxVarM.u();
                defpackage.akkd akkdVar3 = (defpackage.akkd) akzxVarM.b;
                defpackage.akjk akjkVar2 = (defpackage.akjk) akzxVarM2.p();
                j$.util.Objects.requireNonNull(akjkVar2);
                akkdVar3.e = akjkVar2;
                akkdVar3.b |= 4;
            }
            if (akuiVar.c == 8) {
                akzx akzxVarM3 = defpackage.akjk.a.m();
                java.lang.String str2 = (akuiVar.c == 8 ? (defpackage.akuh) akuiVar.d : defpackage.akuh.a).b;
                akzxVarM3.u();
                defpackage.akjk akjkVar3 = (defpackage.akjk) akzxVarM3.b;
                j$.util.Objects.requireNonNull(str2);
                akjkVar3.b = 1;
                akjkVar3.c = str2;
                akzxVarM.u();
                defpackage.akkd akkdVar4 = (defpackage.akkd) akzxVarM.b;
                defpackage.akjk akjkVar4 = (defpackage.akjk) akzxVarM3.p();
                j$.util.Objects.requireNonNull(akjkVar4);
                akkdVar4.e = akjkVar4;
                akkdVar4.b |= 4;
            }
            akzxVar.aF(akzxVarM);
        }
        if ((akuiVar.b & 64) != 0) {
            akzx akzxVarM4 = defpackage.akkd.a.m();
            ahxq ahxqVar2 = a;
            defpackage.aktz aktzVar2 = akuiVar.k;
            if (aktzVar2 == null) {
                aktzVar2 = defpackage.aktz.a;
            }
            defpackage.akiv akivVar2 = (defpackage.akiv) ahxqVar2.d(aktzVar2);
            akzxVarM4.u();
            defpackage.akkd akkdVar5 = (defpackage.akkd) akzxVarM4.b;
            j$.util.Objects.requireNonNull(akivVar2);
            akkdVar5.d = akivVar2;
            akkdVar5.b |= 2;
            akkc akkcVar2 = akkc.c;
            akzxVarM4.u();
            defpackage.akkd akkdVar6 = (defpackage.akkd) akzxVarM4.b;
            akkdVar6.c = akkcVar2.d;
            akkdVar6.b |= 1;
            if (akuiVar.c == 9) {
                akzx akzxVarM5 = defpackage.akjk.a.m();
                java.lang.String str3 = (akuiVar.c == 9 ? (defpackage.akuh) akuiVar.d : defpackage.akuh.a).c;
                akzxVarM5.u();
                defpackage.akjk akjkVar5 = (defpackage.akjk) akzxVarM5.b;
                j$.util.Objects.requireNonNull(str3);
                akjkVar5.b = 1;
                akjkVar5.c = str3;
                akzxVarM4.u();
                defpackage.akkd akkdVar7 = (defpackage.akkd) akzxVarM4.b;
                defpackage.akjk akjkVar6 = (defpackage.akjk) akzxVarM5.p();
                j$.util.Objects.requireNonNull(akjkVar6);
                akkdVar7.e = akjkVar6;
                akkdVar7.b |= 4;
            }
            if (akuiVar.c == 8) {
                akzx akzxVarM6 = defpackage.akjk.a.m();
                java.lang.String str4 = (akuiVar.c == 8 ? (defpackage.akuh) akuiVar.d : defpackage.akuh.a).c;
                akzxVarM6.u();
                defpackage.akjk akjkVar7 = (defpackage.akjk) akzxVarM6.b;
                j$.util.Objects.requireNonNull(str4);
                akjkVar7.b = 1;
                akjkVar7.c = str4;
                akzxVarM4.u();
                defpackage.akkd akkdVar8 = (defpackage.akkd) akzxVarM4.b;
                defpackage.akjk akjkVar8 = (defpackage.akjk) akzxVarM6.p();
                j$.util.Objects.requireNonNull(akjkVar8);
                akkdVar8.e = akjkVar8;
                akkdVar8.b |= 4;
            }
            akzxVar.aF(akzxVarM4);
        }
    }

    @Override // defpackage.acev
    public final void j(defpackage.akui akuiVar, akzx akzxVar) {
        defpackage.akuf akufVar = akuiVar.l;
        if (akufVar == null) {
            akufVar = defpackage.akuf.a;
        }
        defpackage.akua akuaVar = akufVar.c;
        if (akuaVar == null) {
            akuaVar = defpackage.akua.a;
        }
        defpackage.akjc akjcVar = defpackage.akjc.a;
        akzx akzxVarM = akjcVar.m();
        ahxq ahxqVar = h;
        defpackage.akty aktyVarB = defpackage.akty.b(akuaVar.g);
        if (aktyVarB == null) {
            aktyVarB = defpackage.akty.USER_ACTION_UNSPECIFIED;
        }
        defpackage.akjb akjbVar = (defpackage.akjb) ahxqVar.d(aktyVarB);
        akzxVarM.u();
        defpackage.akjc akjcVar2 = (defpackage.akjc) akzxVarM.b;
        akjcVar2.e = akjbVar.f;
        akjcVar2.b |= 1;
        defpackage.ammn ammnVar = akuaVar.c;
        if (ammnVar == null) {
            ammnVar = defpackage.ammn.a;
        }
        java.lang.String str = ammnVar.b;
        akzxVarM.u();
        defpackage.akjc akjcVar3 = (defpackage.akjc) akzxVarM.b;
        j$.util.Objects.requireNonNull(str);
        akjcVar3.b |= 2;
        akjcVar3.f = str;
        int i = true != akuaVar.d ? 1 : 2;
        akzxVarM.u();
        defpackage.akjc akjcVar4 = (defpackage.akjc) akzxVarM.b;
        akjcVar4.i = i - 1;
        akjcVar4.b |= 16;
        if ((akuaVar.b & 4) != 0) {
            akzx akzxVarM2 = defpackage.akkd.a.m();
            akkc akkcVar = akkc.b;
            akzxVarM2.u();
            defpackage.akkd akkdVar = (defpackage.akkd) akzxVarM2.b;
            akkdVar.c = akkcVar.d;
            akkdVar.b |= 1;
            ahxq ahxqVar2 = a;
            defpackage.aktz aktzVar = akuaVar.e;
            if (aktzVar == null) {
                aktzVar = defpackage.aktz.a;
            }
            defpackage.akiv akivVar = (defpackage.akiv) ahxqVar2.d(aktzVar);
            akzxVarM2.u();
            defpackage.akkd akkdVar2 = (defpackage.akkd) akzxVarM2.b;
            j$.util.Objects.requireNonNull(akivVar);
            akkdVar2.d = akivVar;
            akkdVar2.b |= 2;
            akzxVarM.aE(akzxVarM2);
        }
        if ((akuaVar.b & 8) != 0) {
            akzx akzxVarM3 = defpackage.akkd.a.m();
            akkc akkcVar2 = akkc.c;
            akzxVarM3.u();
            defpackage.akkd akkdVar3 = (defpackage.akkd) akzxVarM3.b;
            akkdVar3.c = akkcVar2.d;
            akkdVar3.b |= 1;
            ahxq ahxqVar3 = a;
            defpackage.aktz aktzVar2 = akuaVar.f;
            if (aktzVar2 == null) {
                aktzVar2 = defpackage.aktz.a;
            }
            defpackage.akiv akivVar2 = (defpackage.akiv) ahxqVar3.d(aktzVar2);
            akzxVarM3.u();
            defpackage.akkd akkdVar4 = (defpackage.akkd) akzxVarM3.b;
            j$.util.Objects.requireNonNull(akivVar2);
            akkdVar4.d = akivVar2;
            akkdVar4.b |= 2;
            akzxVarM.aE(akzxVarM3);
        }
        akzxVar.av((defpackage.akjc) akzxVarM.p());
        defpackage.akuf akufVar2 = akuiVar.l;
        if (((akufVar2 == null ? defpackage.akuf.a : akufVar2).b & 2) != 0) {
            if (akufVar2 == null) {
                akufVar2 = defpackage.akuf.a;
            }
            defpackage.akud akudVar = akufVar2.d;
            if (akudVar == null) {
                akudVar = defpackage.akud.a;
            }
            akzx akzxVarM4 = akjcVar.m();
            defpackage.akty aktyVarB2 = defpackage.akty.b(akudVar.j);
            if (aktyVarB2 == null) {
                aktyVarB2 = defpackage.akty.USER_ACTION_UNSPECIFIED;
            }
            defpackage.akjb akjbVar2 = (defpackage.akjb) ahxqVar.d(aktyVarB2);
            akzxVarM4.u();
            defpackage.akjc akjcVar5 = (defpackage.akjc) akzxVarM4.b;
            akjcVar5.e = akjbVar2.f;
            akjcVar5.b |= 1;
            defpackage.ammn ammnVar2 = akudVar.e;
            if (ammnVar2 == null) {
                ammnVar2 = defpackage.ammn.a;
            }
            java.lang.String str2 = ammnVar2.b;
            akzxVarM4.u();
            defpackage.akjc akjcVar6 = (defpackage.akjc) akzxVarM4.b;
            j$.util.Objects.requireNonNull(str2);
            akjcVar6.b |= 2;
            akjcVar6.f = str2;
            int i2 = true != akudVar.f ? 1 : 2;
            akzxVarM4.u();
            defpackage.akjc akjcVar7 = (defpackage.akjc) akzxVarM4.b;
            akjcVar7.i = i2 - 1;
            akjcVar7.b |= 16;
            if ((akudVar.b & 16) != 0) {
                akzx akzxVarM5 = defpackage.akkd.a.m();
                akkc akkcVar3 = akkc.b;
                akzxVarM5.u();
                defpackage.akkd akkdVar5 = (defpackage.akkd) akzxVarM5.b;
                akkdVar5.c = akkcVar3.d;
                akkdVar5.b |= 1;
                ahxq ahxqVar4 = a;
                defpackage.aktz aktzVar3 = akudVar.h;
                if (aktzVar3 == null) {
                    aktzVar3 = defpackage.aktz.a;
                }
                defpackage.akiv akivVar3 = (defpackage.akiv) ahxqVar4.d(aktzVar3);
                akzxVarM5.u();
                defpackage.akkd akkdVar6 = (defpackage.akkd) akzxVarM5.b;
                j$.util.Objects.requireNonNull(akivVar3);
                akkdVar6.d = akivVar3;
                akkdVar6.b |= 2;
                akzxVarM4.aE(akzxVarM5);
            }
            if ((akudVar.b & 32) != 0) {
                akzx akzxVarM6 = defpackage.akkd.a.m();
                akkc akkcVar4 = akkc.c;
                akzxVarM6.u();
                defpackage.akkd akkdVar7 = (defpackage.akkd) akzxVarM6.b;
                akkdVar7.c = akkcVar4.d;
                akkdVar7.b |= 1;
                ahxq ahxqVar5 = a;
                defpackage.aktz aktzVar4 = akudVar.i;
                if (aktzVar4 == null) {
                    aktzVar4 = defpackage.aktz.a;
                }
                defpackage.akiv akivVar4 = (defpackage.akiv) ahxqVar5.d(aktzVar4);
                akzxVarM6.u();
                defpackage.akkd akkdVar8 = (defpackage.akkd) akzxVarM6.b;
                j$.util.Objects.requireNonNull(akivVar4);
                akkdVar8.d = akivVar4;
                akkdVar8.b |= 2;
                akzxVarM4.aE(akzxVarM6);
            }
            int i3 = akudVar.c;
            if (i3 == 3) {
                defpackage.akik akikVar = (defpackage.akik) f.d(i3 == 3 ? (defpackage.akva) akudVar.d : defpackage.akva.a);
                akzxVarM4.u();
                defpackage.akjc akjcVar8 = (defpackage.akjc) akzxVarM4.b;
                j$.util.Objects.requireNonNull(akikVar);
                akjcVar8.d = akikVar;
                akjcVar8.c = 8;
            }
            int i4 = akudVar.c;
            if (i4 == 14) {
                java.lang.Object objApply = g.apply(i4 == 14 ? (akvd) akudVar.d : akvd.a);
                akzxVarM4.u();
                defpackage.akjc akjcVar9 = (defpackage.akjc) akzxVarM4.b;
                j$.util.Objects.requireNonNull(objApply);
                akjcVar9.d = objApply;
                akjcVar9.c = 14;
            }
            defpackage.akjc akjcVar10 = (defpackage.akjc) akzxVarM4.p();
            int i5 = akudVar.k;
            defpackage.akuc akucVarB = defpackage.akuc.b(i5);
            if (akucVarB == null) {
                akucVarB = defpackage.akuc.BUTTONS_ORDER_UNSPECIFIED;
            }
            if (akucVarB != defpackage.akuc.ACTION_BUTTON_PRIMARY) {
                defpackage.akuc akucVarB2 = defpackage.akuc.b(i5);
                if (akucVarB2 == null) {
                    akucVarB2 = defpackage.akuc.BUTTONS_ORDER_UNSPECIFIED;
                }
                if (akucVarB2 != defpackage.akuc.BUTTONS_ORDER_UNSPECIFIED) {
                    akzxVar.av(akjcVar10);
                    return;
                }
            }
            akzxVar.u();
            defpackage.akjh akjhVar = (defpackage.akjh) akzxVar.b;
            defpackage.akjh akjhVar2 = defpackage.akjh.a;
            j$.util.Objects.requireNonNull(akjcVar10);
            akjhVar.b();
            akjhVar.g.add(0, akjcVar10);
        }
    }
}
