package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dis {
    public static final aonn a;
    private static final java.util.Comparator[] b;

    static {
        java.util.Comparator[] comparatorArr = new java.util.Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new defpackage.bdt(new defpackage.dir(i == 0 ? cph.d : cph.c, dbk.b), 9);
            i++;
        }
        b = comparatorArr;
        a = new defpackage.cmp(2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00f5 A[LOOP:1: B:12:0x0047->B:31:0x00f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd A[EDGE_INSN: B:49:0x00fd->B:33:0x00fd BREAK  A[LOOP:1: B:12:0x0047->B:31:0x00f5], SYNTHETIC] */
    public static final java.util.List a(dij dijVar, aonj aonjVar, aonj aonjVar2, java.util.List list) {
        int i;
        java.util.ArrayList arrayList;
        aco acoVar = acp.a;
        aco acoVar2 = new aco(6);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            b((dij) list.get(i2), arrayList2, aonjVar, aonjVar2, acoVar2);
        }
        char c = dijVar.a.s == dpq.b ? (char) 0 : (char) 1;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size() / 2);
        int size2 = arrayList2.size() - 1;
        if (size2 >= 0) {
            int i3 = 0;
            while (true) {
                dij dijVar2 = (dij) arrayList2.get(i3);
                if (i3 != 0) {
                    float f = dijVar2.c().c;
                    float f2 = dijVar2.c().e;
                    int size3 = arrayList3.size() - 1;
                    if (size3 >= 0) {
                        int i4 = 0;
                        while (true) {
                            cpn cpnVar = (cpn) ((aoiu) arrayList3.get(i4)).a;
                            float f3 = cpnVar.c;
                            i = 0;
                            float f4 = cpnVar.e;
                            if (f < f2 && f3 < f4 && java.lang.Math.max(f, f3) < java.lang.Math.min(f2, f4)) {
                                arrayList = arrayList2;
                                arrayList3.set(i4, new aoiu(new cpn(java.lang.Math.max(cpnVar.b, 0.0f), java.lang.Math.max(f3, f), java.lang.Math.min(cpnVar.d, Float.POSITIVE_INFINITY), java.lang.Math.min(f4, f2)), ((aoiu) arrayList3.get(i4)).b));
                                ((java.util.List) ((aoiu) arrayList3.get(i4)).b).add(dijVar2);
                                break;
                            }
                            arrayList = arrayList2;
                            if (i4 != size3) {
                                i4++;
                                arrayList2 = arrayList;
                            }
                        }
                        if (i3 != size2) {
                            break;
                        }
                        i3++;
                        arrayList2 = arrayList;
                    } else {
                        arrayList = arrayList2;
                        i = 0;
                    }
                } else {
                    arrayList = arrayList2;
                    i = 0;
                    i3 = 0;
                }
                cpn cpnVarC = dijVar2.c();
                dij[] dijVarArr = new dij[1];
                dijVarArr[i] = dijVar2;
                arrayList3.add(new aoiu(cpnVarC, new java.util.ArrayList((java.util.Collection) new aojv(dijVarArr, true))));
                if (i3 != size2) {
                    break;
                    break;
                }
                i3++;
                arrayList2 = arrayList;
            }
        } else {
            i = 0;
        }
        ajsz.bo(arrayList3, cph.e);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Comparator comparator = b[c];
        int size4 = arrayList3.size();
        for (int i5 = i; i5 < size4; i5++) {
            java.lang.Object obj = ((aoiu) arrayList3.get(i5)).b;
            ajsz.bo((java.util.List) obj, comparator);
            arrayList4.addAll((java.util.Collection) obj);
        }
        ajsz.bo(arrayList4, new defpackage.bdt(a, 8, null));
        int size5 = i;
        while (size5 <= arrayList4.size() - 1) {
            java.util.List list2 = (java.util.List) acoVar2.a(((dij) arrayList4.get(size5)).c);
            if (list2 != null) {
                if (((java.lang.Boolean) aonjVar2.a(arrayList4.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList4.remove(size5);
                }
                arrayList4.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList4;
    }

    private static final void b(dij dijVar, java.util.ArrayList arrayList, aonj aonjVar, aonj aonjVar2, aco acoVar) {
        boolean zBooleanValue = ((java.lang.Boolean) dijVar.b.d(din.n, new defpackage.bmt(12))).booleanValue();
        if (zBooleanValue || ((java.lang.Boolean) aonjVar2.a(dijVar)).booleanValue()) {
            if (((java.lang.Boolean) aonjVar.a(dijVar)).booleanValue()) {
                arrayList.add(dijVar);
            }
            if (zBooleanValue) {
                acoVar.g(dijVar.c, a(dijVar, aonjVar, aonjVar2, dij.m(dijVar, false, 7)));
                return;
            }
        }
        java.util.List listM = dij.m(dijVar, false, 7);
        int size = listM.size();
        for (int i = 0; i < size; i++) {
            b((dij) listM.get(i), arrayList, aonjVar, aonjVar2, acoVar);
        }
    }
}
