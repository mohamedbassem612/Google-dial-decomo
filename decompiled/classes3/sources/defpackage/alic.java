package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alic {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public alic(android.view.View view, android.view.View view2, int i) {
        ahvr.cj(view, "contentView cannot be null");
        ahvr.cj(view2, "anchorView cannot be null");
        this.c = view2;
        this.a = i;
        defpackage.ackh ackhVar = new defpackage.ackh(view.getContext());
        this.b = ackhVar;
        ackhVar.e = view;
        ackhVar.c = new android.widget.PopupWindow(ackhVar, 0, 0, !defpackage.acax.b(ackhVar.getContext()) && anfq.a.b().g());
        ackhVar.addView(view);
        if (anfq.e()) {
            int i2 = dzs.a;
            ackhVar.setImportantForAccessibility(4);
        }
    }

    public static defpackage.alib b() {
        defpackage.alib alibVar = new defpackage.alib();
        alibVar.f(aikj.b);
        alibVar.e("");
        alibVar.b("");
        return alibVar;
    }

    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object, java.util.Map] */
    public final alia a(java.lang.String str) {
        java.util.Iterator it;
        java.lang.String strSubstring;
        java.util.Iterator it2;
        int i;
        int type;
        java.util.List listAsList = java.util.Arrays.asList(str.trim().split("\\s+"));
        java.util.List arrayList = new java.util.ArrayList();
        java.util.List arrayList2 = new java.util.ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < listAsList.size()) {
            java.lang.String str2 = (java.lang.String) listAsList.get(i3);
            java.lang.Object obj = this.b;
            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList();
            if (str2 == null) {
                throw new java.lang.NullPointerException("The input String is null.");
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("");
            for (int i4 = i2; i4 < str2.length(); i4++) {
                char cCharAt = str2.charAt(i4);
                if (cCharAt != 0 && cCharAt != 65533 && (java.lang.Character.isWhitespace(cCharAt) || ((type = java.lang.Character.getType(cCharAt)) != 15 && type != 16))) {
                    if (aknx.G(cCharAt)) {
                        sb.append(' ');
                    } else {
                        sb.append(cCharAt);
                    }
                }
            }
            java.util.List listA = defpackage.alin.a(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.util.Iterator it3 = listA.iterator();
            while (it3.hasNext()) {
                java.lang.Object obj2 = ((defpackage.ulw) obj).a;
                java.lang.String strP = (java.lang.String) it3.next();
                defpackage.alin alinVar = (defpackage.alin) obj2;
                if (strP.equals(alinVar.b) || strP.equals(alinVar.c)) {
                    it2 = it3;
                    i = i3;
                    sb2.append(strP);
                } else {
                    if (alinVar.a) {
                        strP = ahvr.p(strP);
                    }
                    if (strP == null) {
                        throw new java.lang.NullPointerException("The input String is null.");
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    boolean z = true;
                    int i5 = 0;
                    while (i5 < strP.length()) {
                        char cCharAt2 = strP.charAt(i5);
                        java.util.Iterator it4 = it3;
                        int type2 = java.lang.Character.getType(cCharAt2);
                        int i6 = i3;
                        if (type2 == 23 || type2 == 26 || type2 == 20 || type2 == 21 || type2 == 22 || type2 == 29 || type2 == 30 || type2 == 24) {
                            arrayList4.add(java.lang.String.valueOf(cCharAt2));
                            z = true;
                        } else {
                            if (z) {
                                arrayList4.add("");
                            }
                            arrayList4.set(arrayList4.size() - 1, ((java.lang.String) ahvr.bk(arrayList4)) + cCharAt2);
                            z = false;
                        }
                        i5++;
                        it3 = it4;
                        i3 = i6;
                    }
                    it2 = it3;
                    i = i3;
                    java.util.Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        sb2.append((java.lang.String) it5.next());
                        sb2.append(' ');
                    }
                }
                listAsList = listAsList;
                it3 = it2;
                i3 = i;
            }
            java.util.List list = listAsList;
            int i7 = i3;
            java.util.Iterator it6 = defpackage.alin.a(sb2.toString()).iterator();
            while (it6.hasNext()) {
                java.lang.String str3 = (java.lang.String) it6.next();
                java.lang.Object obj3 = ((defpackage.ulw) obj).c;
                if (str3 == null) {
                    throw new java.lang.NullPointerException("The input String is null.");
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.Iterator it7 = defpackage.alin.a(str3).iterator();
                while (it7.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it7.next();
                    if (str4.length() <= 200) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.util.Iterator it8 = it6;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= str4.length()) {
                                arrayList5.addAll(arrayList6);
                                it6 = it8;
                                break;
                            }
                            int length = str4.length();
                            while (true) {
                                if (i8 >= length) {
                                    length = length;
                                    it = it7;
                                    strSubstring = "";
                                    break;
                                }
                                it = it7;
                                strSubstring = i8 == 0 ? str4.substring(0, length) : "##".concat(java.lang.String.valueOf(str4.substring(i8, length)));
                                if (((xtq) obj3).a.containsKey(strSubstring)) {
                                    break;
                                }
                                length--;
                                it7 = it;
                            }
                            if ("".equals(strSubstring)) {
                                arrayList5.add("[UNK]");
                                it6 = it8;
                                it7 = it;
                                break;
                            }
                            arrayList6.add(strSubstring);
                            i8 = length;
                            it7 = it;
                        }
                    } else {
                        arrayList5.add("[UNK]");
                    }
                }
                arrayList3.addAll(arrayList5);
            }
            for (java.lang.String str5 : arrayList3) {
                arrayList.add(java.lang.Integer.valueOf(i7));
                arrayList2.add(str5);
            }
            i3 = i7 + 1;
            listAsList = list;
            i2 = 0;
        }
        java.util.List list2 = listAsList;
        int size = arrayList2.size();
        int i9 = this.a;
        if (size > i9) {
            int size2 = arrayList2.size() - i9;
            while (size2 < arrayList.size() && ((java.lang.Integer) arrayList.get(size2)).equals(arrayList.get(size2 - 1))) {
                size2++;
            }
            arrayList2 = arrayList2.subList(size2, arrayList2.size());
            arrayList = arrayList.subList(size2, arrayList.size());
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            java.lang.String str6 = (java.lang.String) arrayList2.get(i10);
            map.put(java.lang.Integer.valueOf(arrayList7.size()), (java.lang.Integer) arrayList.get(i10));
            arrayList7.add(str6);
        }
        java.util.List listD = ((defpackage.ulw) this.b).d(arrayList7);
        java.util.ArrayList arrayList8 = new java.util.ArrayList(java.util.Collections.nCopies(listD.size(), 1));
        java.util.ArrayList arrayList9 = new java.util.ArrayList(java.util.Collections.nCopies(listD.size(), 0));
        while (listD.size() < i9) {
            listD.add(0);
            arrayList8.add(0);
            arrayList9.add(0);
        }
        java.util.List list3 = (java.util.List) j$.util.Collection.-EL.stream(listD).map(new aite(this, 5)).collect(aido.a);
        if (str == null) {
            throw new java.lang.NullPointerException("Null origText");
        }
        aizh aizhVarC = aizh.c(list3);
        aizh aizhVarC2 = aizh.c(arrayList8);
        aizh aizhVarC3 = aizh.c(arrayList9);
        aify aifyVarN = aify.n(list2);
        aigf aigfVarI = aigf.i(map);
        if (aifyVarN != null && aigfVarI != null) {
            return new alia(str, aizhVarC, aizhVarC2, aizhVarC3, aifyVarN, aigfVarI);
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        if (aifyVarN == null) {
            sb3.append(" origTokens");
        }
        if (aigfVarI == null) {
            sb3.append(" tokenToOrigMap");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb3.toString()));
    }

    public final void c() {
        android.widget.PopupWindow popupWindow = ((defpackage.ackh) this.b).c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean d() {
        return ((defpackage.ackh) this.b).isShown();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [fga, java.lang.Object] */
    public final void e(java.util.function.Consumer consumer) {
        for (kvt kvtVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            ?? r1 = kvtVar.a;
            eum.af((android.os.Handler) kvtVar.b, new ffx(consumer, (fga) r1));
        }
    }

    public final void f(ffq ffqVar) {
        e(new rh(this, ffqVar, 2, (byte[]) null));
    }

    public final void g(ffl fflVar, ffq ffqVar) {
        e(new ffz(this, fflVar, ffqVar, 0));
    }

    public final void h(ffl fflVar, ffq ffqVar) {
        e(new ffz(this, fflVar, ffqVar, 1));
    }

    public final void i(ffl fflVar, ffq ffqVar, java.io.IOException iOException, boolean z) {
        e(new obn(this, fflVar, ffqVar, iOException, z, 1));
    }

    public final void j(ffl fflVar, ffq ffqVar, int i) {
        e(new ffy(this, fflVar, ffqVar, i));
    }

    public final void k() {
        for (ils ilsVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            java.lang.Object obj = ilsVar.a;
            eum.af((android.os.Handler) ilsVar.b, new esz(this, obj, 15));
        }
    }

    public final void l(int i) {
        for (ils ilsVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            java.lang.Object obj = ilsVar.a;
            eum.af((android.os.Handler) ilsVar.b, new mo(this, obj, i, 5, (byte[]) null));
        }
    }

    public final void m(java.lang.Exception exc) {
        for (ils ilsVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            java.lang.Object obj = ilsVar.a;
            eum.af((android.os.Handler) ilsVar.b, new ac(this, obj, exc, 11, (byte[]) null));
        }
    }

    public final void n() {
        for (ils ilsVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            java.lang.Object obj = ilsVar.a;
            eum.af((android.os.Handler) ilsVar.b, new esz(this, obj, 16));
        }
    }

    public final android.widget.ListView o() {
        return ((jv) this.c).e;
    }

    public final defpackage.alic p(ffu ffuVar) {
        return new defpackage.alic((java.util.concurrent.CopyOnWriteArrayList) this.c, ffuVar);
    }

    public final defpackage.alic q(ffu ffuVar) {
        return new defpackage.alic((java.util.concurrent.CopyOnWriteArrayList) this.c, ffuVar);
    }

    public final void r(hgt hgtVar) {
        for (ils ilsVar : (java.util.concurrent.CopyOnWriteArrayList) this.c) {
            java.lang.Object obj = ilsVar.a;
            eum.af((android.os.Handler) ilsVar.b, new ac(this, obj, hgtVar, 12, (byte[]) null));
        }
    }

    public alic(java.lang.String str, int i, java.lang.String str2) {
        this.c = str;
        this.a = i;
        this.b = str2;
    }

    public alic(java.util.UUID uuid, int i, byte[] bArr) {
        this.b = uuid;
        this.a = i;
        this.c = bArr;
    }

    public alic(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, ffu ffuVar) {
        this.c = copyOnWriteArrayList;
        this.a = 0;
        this.b = ffuVar;
    }

    public alic(jy jyVar, ft ftVar, int i) {
        this.c = jyVar;
        this.b = ftVar;
        this.a = i;
    }

    public alic() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), (ffu) null);
    }

    public alic(eqg eqgVar, java.lang.String str) {
        this.b = eqgVar;
        this.a = 0;
        this.c = str;
    }

    public alic(java.util.List list, int i, android.view.MotionEvent motionEvent) {
        this.c = list;
        this.a = i;
        this.b = motionEvent;
        if (list.isEmpty()) {
            throw new java.lang.IllegalArgumentException("changes cannot be empty");
        }
    }

    public alic(defpackage.ajzq ajzqVar) {
        this.c = aiga.b(ajzqVar.a);
        this.b = ajzqVar.c;
        this.a = ajzqVar.d;
        aify.n(ajzqVar.b);
    }

    public alic(java.util.Map map, boolean z, int i, aigf aigfVar, java.lang.String str, java.lang.String str2) {
        defpackage.ulw ulwVar = new defpackage.ulw(map, z, str, str2);
        this.b = ulwVar;
        this.a = i;
        aigf aigfVar2 = (aigf) j$.util.Collection.-EL.stream(aigfVar.e()).filter(new defpackage.abdh(this, 18)).collect(aigf.r());
        this.c = aitt.n(ulwVar.d(aigfVar2.f().g()), ulwVar.d(aigfVar2.c().g())).f();
    }
}
