package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dji implements java.lang.CharSequence {
    public static final defpackage.ckb a = defpackage.dkp.a;
    public final java.util.List b;
    public final java.lang.String c;
    public final java.util.List d;
    public final java.util.List e;

    public dji(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        this.b = list;
        this.c = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                defpackage.djg djgVar = (defpackage.djg) list.get(i);
                java.lang.Object obj = djgVar.a;
                if (obj instanceof defpackage.dks) {
                    arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                    if (djgVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                        djgVar = null;
                    }
                    arrayList.add(djgVar);
                } else if (obj instanceof defpackage.dkd) {
                    arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                    if (djgVar == null) {
                        defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                        djgVar = null;
                    }
                    arrayList2.add(djgVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.d = arrayList;
        this.e = arrayList2;
        java.util.List listBX = arrayList2 != null ? defpackage.ajsz.bX(arrayList2, new djh(0)) : null;
        if (listBX == null || listBX.isEmpty()) {
            return;
        }
        if (listBX.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        defpackage.acm acmVarA = defpackage.acn.a(((defpackage.djg) listBX.get(0)).c);
        int size2 = listBX.size();
        for (int i2 = 1; i2 < size2; i2++) {
            defpackage.djg djgVar2 = (defpackage.djg) listBX.get(i2);
            while (acmVarA.b != 0) {
                int iB = acmVarA.b();
                if (djgVar2.b < iB) {
                    int i3 = djgVar2.c;
                    if (i3 <= iB) {
                        break;
                    }
                    dnv.b(defpackage.a.bf(iB, i3, "Paragraph overlap not allowed, end ", " should be less than or equal to "));
                    break;
                }
                acmVarA.h(acmVarA.b - 1);
            }
            acmVarA.f(djgVar2.c);
        }
    }

    public final int a() {
        return this.c.length();
    }

    public final defpackage.dji b(defpackage.aonj aonjVar) {
        djf djfVar = new djf(this);
        java.util.List list = djfVar.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, wx.i((defpackage.djg) aonjVar.a(((dje) list.get(i)).a(Integer.MIN_VALUE))));
        }
        return djfVar.c();
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.dji subSequence(int i, int i2) {
        if (i > i2) {
            dnv.b(defpackage.a.bv((byte) 41, i2, i, "start (", ") should be less or equal to end ("));
        }
        if (i == 0 && i2 == this.c.length()) {
            return this;
        }
        java.lang.String strSubstring = this.c.substring(i, i2);
        defpackage.aooh.e(strSubstring, "substring(...)");
        java.util.List list = this.b;
        int i3 = defpackage.djj.a;
        if (i > i2) {
            dnv.b("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        java.util.ArrayList arrayList = null;
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            int size = list.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                defpackage.djg djgVar = (defpackage.djg) list.get(i4);
                int i5 = djgVar.b;
                int i6 = djgVar.c;
                boolean z = i5 < i2;
                if ((((i == i2) | (i5 == i6)) & (i == i5)) | ((i < i6) & z)) {
                    arrayList2.add(new defpackage.djg(djgVar.a, java.lang.Math.max(i, i5) - i, java.lang.Math.min(i2, i6) - i, djgVar.d));
                }
                i4++;
            }
            if (true != arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new defpackage.dji(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.c.charAt(i);
    }

    public final java.util.List d() {
        java.util.List list = this.d;
        return list == null ? defpackage.aokc.a : list;
    }

    public final java.util.List e(int i) {
        java.util.List list = this.b;
        if (list == null) {
            return defpackage.aokc.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.Object obj = list.get(i2);
            defpackage.djg djgVar = (defpackage.djg) obj;
            if (djgVar.a instanceof djw) {
                int i3 = djgVar.b;
                int i4 = djgVar.c;
                int i5 = defpackage.djj.a;
                boolean z = i3 < i;
                if ((((i == 0) | (i3 == i4)) & (i3 == 0)) | ((i4 > 0) & z)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dji) {
            defpackage.dji djiVar = (defpackage.dji) obj;
            if (defpackage.aooh.n(this.c, djiVar.c) && defpackage.aooh.n(this.b, djiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i) {
        java.util.List list = this.b;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.djg djgVar = (defpackage.djg) list.get(i2);
            if (djgVar.a instanceof djw) {
                int i3 = djgVar.b;
                int i4 = djgVar.c;
                int i5 = defpackage.djj.a;
                boolean z = i3 < i;
                if ((((i == 0) | (i3 == i4)) & (i3 == 0)) | ((i4 > 0) & z)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        java.util.List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.c;
    }

    public /* synthetic */ dji(java.lang.String str) {
        this(str, defpackage.aokc.a);
    }

    public dji(java.lang.String str, java.util.List list) {
        this(true == list.isEmpty() ? null : list, str);
    }
}
