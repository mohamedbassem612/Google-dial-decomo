package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djz implements defpackage.dkc {
    public final defpackage.dji a;
    public final java.util.List b;
    public final java.util.List d;
    public final defpackage.aoir c = defpackage.aooc.ah(3, new defpackage.ddw(this, 5));
    private final defpackage.aoir e = defpackage.aooc.ah(3, new defpackage.ddw(this, 6));

    public djz(defpackage.dji djiVar, defpackage.dkz dkzVar, java.util.List list, defpackage.dpf dpfVar, defpackage.gat gatVar, boolean z, defpackage.dnx dnxVar) {
        int i;
        java.lang.String strSubstring;
        defpackage.dji djiVar2 = djiVar;
        defpackage.dkz dkzVar2 = dkzVar;
        this.a = djiVar2;
        this.b = list;
        defpackage.dkd dkdVar = dkzVar2.c;
        int i2 = defpackage.djj.a;
        java.util.List list2 = djiVar2.e;
        java.util.List listBX = (list2 == null || (listBX = defpackage.ajsz.bX(list2, new djh(2))) == null) ? defpackage.aokc.a : listBX;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.aojw aojwVar = new defpackage.aojw();
        int size = listBX.size();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            defpackage.djg djgVar = (defpackage.djg) listBX.get(i4);
            defpackage.djg djgVarA = defpackage.djg.a(djgVar, dkdVar.a((defpackage.dkd) djgVar.a), i3, 14);
            while (true) {
                int i6 = djgVarA.b;
                if (i5 < i6) {
                    if (aojwVar.isEmpty()) {
                        arrayList.add(new defpackage.djg(dkdVar, i5, i6, ""));
                        i5 = djgVarA.b;
                        break;
                    }
                    defpackage.djg djgVar2 = (defpackage.djg) aojwVar.e();
                    int i7 = djgVarA.b;
                    int i8 = djgVar2.c;
                    if (i7 < i8) {
                        arrayList.add(new defpackage.djg(djgVar2.a, i5, i7, ""));
                        i5 = djgVarA.b;
                    } else {
                        arrayList.add(new defpackage.djg(djgVar2.a, i5, i8, ""));
                        i5 = djgVar2.c;
                        while (!aojwVar.isEmpty() && i5 == ((defpackage.djg) aojwVar.e()).c) {
                            aojwVar.removeLast();
                        }
                    }
                } else {
                    break;
                }
            }
            defpackage.djg djgVar3 = (defpackage.djg) aojwVar.f();
            if (djgVar3 != null) {
                int i9 = djgVar3.b;
                if (i9 == djgVarA.b && djgVar3.c == djgVarA.c) {
                    aojwVar.removeLast();
                    aojwVar.addLast(new defpackage.djg(((defpackage.dkd) djgVar3.a).a((defpackage.dkd) djgVarA.a), djgVarA.b, djgVarA.c, ""));
                } else {
                    int i10 = djgVar3.c;
                    if (i9 == i10) {
                        arrayList.add(new defpackage.djg(djgVar3.a, i9, i10, ""));
                        aojwVar.removeLast();
                        aojwVar.addLast(new defpackage.djg(djgVarA.a, djgVarA.b, djgVarA.c, ""));
                    } else {
                        if (i10 < djgVarA.c) {
                            throw new java.lang.IllegalArgumentException();
                        }
                        aojwVar.addLast(new defpackage.djg(((defpackage.dkd) djgVar3.a).a((defpackage.dkd) djgVarA.a), djgVarA.b, djgVarA.c, ""));
                    }
                }
            } else {
                aojwVar.addLast(new defpackage.djg(djgVarA.a, djgVarA.b, djgVarA.c, ""));
            }
            i4++;
            i3 = 0;
        }
        while (i5 <= djiVar2.c.length() && !aojwVar.isEmpty()) {
            defpackage.djg djgVar4 = (defpackage.djg) aojwVar.e();
            arrayList.add(new defpackage.djg(djgVar4.a, i5, djgVar4.c, ""));
            i5 = djgVar4.c;
            while (!aojwVar.isEmpty() && i5 == ((defpackage.djg) aojwVar.e()).c) {
                aojwVar.removeLast();
            }
        }
        if (i5 < djiVar2.c.length()) {
            arrayList.add(new defpackage.djg(dkdVar, i5, djiVar2.c.length(), ""));
        }
        if (arrayList.isEmpty()) {
            i = 0;
            arrayList.add(new defpackage.djg(dkdVar, 0, 0, ""));
        } else {
            i = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i11 = i;
        while (i11 < size2) {
            defpackage.djg djgVar5 = (defpackage.djg) arrayList.get(i11);
            int i12 = djgVar5.b;
            int i13 = djgVar5.c;
            if (i12 != i13) {
                strSubstring = djiVar2.c.substring(i12, i13);
                defpackage.aooh.e(strSubstring, "substring(...)");
            } else {
                strSubstring = "";
            }
            java.util.List listA = defpackage.djj.a(djiVar2, i12, i13, new defpackage.dcx(12));
            defpackage.dji djiVar3 = new defpackage.dji(strSubstring, listA == null ? defpackage.aokc.a : listA);
            defpackage.dkd dkdVar2 = (defpackage.dkd) djgVar5.a;
            if (dkdVar2.b == 0) {
                dkdVar2 = new defpackage.dkd(dkdVar2.a, dkdVar.b, dkdVar2.c, dkdVar2.d, dkdVar2.e, dkdVar2.f, dkdVar2.g, dkdVar2.h, dkdVar2.i);
            }
            java.lang.String str = djiVar3.c;
            defpackage.dkz dkzVar3 = new defpackage.dkz(dkzVar2.b, dkzVar2.c.a(dkdVar2));
            java.util.List list3 = djiVar3.b;
            java.util.List list4 = list3 == null ? defpackage.aokc.a : list3;
            java.util.List list5 = this.b;
            int i14 = djgVar5.b;
            int i15 = djgVar5.c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(list5.size());
            int size3 = list5.size();
            int i16 = 0;
            while (i16 < size3) {
                int i17 = i16;
                defpackage.djg djgVar6 = (defpackage.djg) list5.get(i16);
                defpackage.dkd dkdVar3 = dkdVar;
                int i18 = djgVar6.b;
                java.util.ArrayList arrayList4 = arrayList;
                int i19 = djgVar6.c;
                boolean z2 = i18 < i15;
                if ((((i14 == i15) | (i18 == i19)) & (i14 == i18)) | ((i14 < i19) & z2)) {
                    if (i14 > i18 || i19 > i15) {
                        dnv.b("placeholder can not overlap with paragraph.");
                    }
                    arrayList3.add(new defpackage.djg(djgVar6.a, djgVar6.b - i14, djgVar6.c - i14, ""));
                }
                i16 = i17 + 1;
                list5 = list5;
                dkdVar = dkdVar3;
                arrayList = arrayList4;
            }
            arrayList2.add(new defpackage.dkb(new defpackage.djc(str, dkzVar3, list4, arrayList3, gatVar, dnxVar, dpfVar, z), djgVar5.b, djgVar5.c));
            i11++;
            djiVar2 = djiVar;
            dkzVar2 = dkzVar;
            size2 = size2;
            dkdVar = dkdVar;
        }
        this.d = arrayList2;
    }

    @Override // defpackage.dkc
    public final float a() {
        return ((java.lang.Number) this.e.a()).floatValue();
    }

    @Override // defpackage.dkc
    public final float b() {
        throw null;
    }

    @Override // defpackage.dkc
    public final boolean c() {
        java.util.List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.dkb) list.get(i)).a.c()) {
                return true;
            }
        }
        return false;
    }
}
