package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class djj {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.dji("");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0082  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0067, please report this as an issue */
    public static final java.util.List a(defpackage.dji djiVar, int i, int i2, defpackage.aonj aonjVar) {
        java.util.List list;
        java.util.ArrayList arrayList;
        int size;
        int i3;
        defpackage.djg djgVar;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (i == i2 || (list = djiVar.b) == null) {
            return null;
        }
        if (i != 0) {
            arrayList = new java.util.ArrayList(list.size());
            size = list.size();
            for (i3 = 0; i3 < size; i3++) {
                djgVar = (defpackage.djg) list.get(i3);
                if (aonjVar != null || ((java.lang.Boolean) aonjVar.a(djgVar.a)).booleanValue()) {
                    i4 = djgVar.b;
                    i5 = djgVar.c;
                    if (i4 < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i < i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i4 == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((((i == i2) | z4) & z3) | (z2 & z)) {
                        arrayList.add(new defpackage.djg((defpackage.djd) djgVar.a, defpackage.aooc.w(i4, i, i2) - i, defpackage.aooc.w(i5, i, i2) - i, djgVar.d));
                    }
                }
            }
        } else if (i2 < djiVar.c.length()) {
            i = 0;
            arrayList = new java.util.ArrayList(list.size());
            size = list.size();
            while (i3 < size) {
                djgVar = (defpackage.djg) list.get(i3);
                if (aonjVar != null) {
                    i4 = djgVar.b;
                    i5 = djgVar.c;
                    if (i4 < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i < i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i4 == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((((i == i2) | z4) & z3) | (z2 & z)) {
                        arrayList.add(new defpackage.djg((defpackage.djd) djgVar.a, defpackage.aooc.w(i4, i, i2) - i, defpackage.aooc.w(i5, i, i2) - i, djgVar.d));
                    }
                } else {
                    i4 = djgVar.b;
                    i5 = djgVar.c;
                    if (i4 < i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i < i5) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i == i4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i4 == i5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if ((((i == i2) | z4) & z3) | (z2 & z)) {
                        arrayList.add(new defpackage.djg((defpackage.djd) djgVar.a, defpackage.aooc.w(i4, i, i2) - i, defpackage.aooc.w(i5, i, i2) - i, djgVar.d));
                    }
                }
            }
        } else {
            if (aonjVar == null) {
                return list;
            }
            arrayList = new java.util.ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                java.lang.Object obj = list.get(i6);
                if (((java.lang.Boolean) aonjVar.a(((defpackage.djg) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }
}
