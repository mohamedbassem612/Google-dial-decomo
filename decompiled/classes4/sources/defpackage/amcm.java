package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcm {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public java.util.ArrayList c;
    public final java.util.ArrayList d;

    public amcm() {
        this.c = new java.util.ArrayList();
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.d = new java.util.ArrayList();
    }

    public static aify c(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIndexOf = str.indexOf(32, ((java.lang.Integer) it.next()).intValue());
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            if (arrayList.isEmpty() || iIndexOf != ((java.lang.Integer) arrayList.get(arrayList.size() - 1)).intValue()) {
                arrayList.add(java.lang.Integer.valueOf(iIndexOf));
            }
        }
        return aify.n(arrayList);
    }

    static defpackage.amce v(int i, int i2) {
        defpackage.amcd amcdVarA = defpackage.amce.a();
        akzx akzxVarM = defpackage.amft.a.m();
        akzx akzxVarM2 = defpackage.amgd.a.m();
        akzxVarM2.u();
        defpackage.amgd amgdVar = (defpackage.amgd) akzxVarM2.b;
        amgdVar.c = i - 1;
        amgdVar.b |= 1;
        defpackage.amgd amgdVar2 = (defpackage.amgd) akzxVarM2.p();
        akzxVarM.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
        j$.util.Objects.requireNonNull(amgdVar2);
        amftVar.d = amgdVar2;
        amftVar.c = 9;
        akzxVarM.u();
        defpackage.amft amftVar2 = (defpackage.amft) akzxVarM.b;
        amftVar2.b |= 1;
        amftVar2.e = i2;
        amcdVarA.c((defpackage.amft) akzxVarM.p());
        return amcdVarA.a();
    }

    private final defpackage.amcm w() {
        java.util.ArrayList arrayList = this.b;
        int iIntValue = ((java.lang.Integer) ahvr.bl(arrayList, 0)).intValue();
        aift aiftVar = new aift(4);
        java.util.ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            defpackage.amce amceVar = (defpackage.amce) arrayList2.get(i);
            java.lang.String strE = amceVar.e();
            int iMax = java.lang.Math.max(0, java.lang.Math.min(strE.length(), iIntValue - length));
            defpackage.amcd amcdVar = new defpackage.amcd(amceVar);
            amcdVar.b = java.lang.Integer.valueOf(iMax);
            amcdVar.a = iMax == strE.length();
            aiftVar.i(amcdVar.a());
            if (strE.length() > 0) {
                length += strE.length() + 1;
            }
        }
        return new defpackage.amcm(aiftVar.h(), arrayList, this.c, this.d);
    }

    private final boolean x(int i) {
        return q().length() - i > 100;
    }

    public final int a() {
        int size = d().size();
        java.util.ArrayList arrayList = this.a;
        int size2 = arrayList.size() - 1;
        boolean z = false;
        while (size2 >= size) {
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(size2);
            if (amceVar.f || amceVar.o() || amceVar.h()) {
                return size2;
            }
            if (amceVar.m() && !amceVar.k()) {
                if (z && !amceVar.i()) {
                    return size2;
                }
                z = true;
            }
            size2--;
        }
        return size - 1;
    }

    public final long b() {
        return j$.util.Collection.-EL.stream(this.a).filter(new defpackage.alzc(16)).count();
    }

    public final aify d() {
        j$.util.Optional optionalEmpty;
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                optionalEmpty = j$.util.Optional.empty();
                break;
            }
            if (((defpackage.amce) arrayList.get(size)).p()) {
                optionalEmpty = j$.util.Optional.of(java.lang.Integer.valueOf(size));
                break;
            }
        }
        defpackage.amck amckVar = new defpackage.amck(this, 0);
        if (true == optionalEmpty.isPresent()) {
            java.lang.Object obj = optionalEmpty.get();
            optionalEmpty = j$.util.Optional.ofNullable(aify.n(((defpackage.amcm) amckVar.a).a.subList(0, ((java.lang.Integer) obj).intValue() + 1)));
        }
        return (aify) optionalEmpty.orElse(aike.a);
    }

    public final aify e() {
        return aify.n(this.a);
    }

    public final aify f(defpackage.ameo ameoVar) {
        int length;
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return aike.a;
        }
        int iA = a();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return aike.a;
            }
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(size);
            if (amceVar.g() || amceVar.f || amceVar.o()) {
                return aify.n(arrayList.subList(0, size + 1));
            }
            if (amceVar.i()) {
                if (amceVar.h()) {
                    if (size == arrayList.size() - 1) {
                        length = ameoVar.b(aify.n(arrayList)).a.split(" ").length;
                    } else {
                        int i = size + 1;
                        length = !((defpackage.amce) arrayList.get(i)).e().isEmpty() ? ((defpackage.amce) arrayList.get(i)).e().split(" ").length : 0;
                    }
                    if (amceVar.j() && length > 3) {
                        return aify.n(arrayList.subList(0, size + 1));
                    }
                } else {
                    continue;
                }
            } else if (size <= iA) {
                return aify.n(arrayList.subList(0, size + 1));
            }
        }
    }

    public final aify g(aify aifyVar) {
        return (aify) j$.util.Collection.-EL.stream(this.a).skip(aifyVar.size()).collect(aido.a);
    }

    public final aify h() {
        return (aify) j$.util.Collection.-EL.stream(this.a).map(new defpackage.alzr(16)).collect(aido.a);
    }

    public final defpackage.amcm i(int i) {
        java.util.ArrayList arrayList = this.b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        if (((java.lang.Integer) ahvr.bl(arrayList, 0)).intValue() >= i) {
            return this;
        }
        arrayList2.add(java.lang.Integer.valueOf(i));
        return new defpackage.amcm(e(), arrayList2, this.c, this.d).w();
    }

    public final defpackage.amcm j() {
        aify aifyVarE = e();
        java.util.ArrayList<java.lang.Integer> arrayList = this.c;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0, new aift(4));
        aift aiftVar = new aift(4);
        java.util.Iterator it = aifyVarE.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((defpackage.amce) it.next()).e().length() + 1;
            aiftVar.i(java.lang.Integer.valueOf(length));
        }
        aify aifyVarH = aiftVar.h();
        aift aiftVar2 = new aift(4);
        aift aiftVar3 = new aift(4);
        aiftVar3.i(0);
        aiftVar3.k(aifyVarH);
        aiftVar3.i(Integer.MAX_VALUE);
        aike aikeVarH = aiftVar3.h();
        int i = 0;
        while (i < aikeVarH.d - 1) {
            int iIntValue = ((java.lang.Integer) aikeVarH.get(i)).intValue();
            i++;
            int iIntValue2 = ((java.lang.Integer) aikeVarH.get(i)).intValue();
            for (java.lang.Integer num : arrayList) {
                int iIntValue3 = num.intValue();
                if (iIntValue3 >= iIntValue && iIntValue3 < iIntValue2) {
                    aiftVar2.i(num);
                    break;
                }
            }
        }
        aike aikeVarH2 = aiftVar2.h();
        int i2 = aikeVarH2.d;
        int i3 = 0;
        int i4 = 0;
        int length2 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            java.lang.Integer num2 = (java.lang.Integer) aikeVarH2.get(i5);
            while (length2 <= num2.intValue() && i4 < aifyVarE.size()) {
                length2 += ((defpackage.amce) aifyVarE.get(i4)).e().length();
                if (length2 <= num2.intValue()) {
                    ((aift) arrayList2.get(i3)).i((defpackage.amce) aifyVarE.get(i4));
                    i4++;
                }
            }
            if (length2 > num2.intValue() && i4 < aifyVarE.size()) {
                i3++;
                arrayList2.add(i3, new aift(4));
                ((aift) arrayList2.get(i3)).i((defpackage.amce) aifyVarE.get(i4));
                i4++;
            }
        }
        while (i4 < aifyVarE.size()) {
            ((aift) arrayList2.get(i3)).i((defpackage.amce) aifyVarE.get(i4));
            i4++;
        }
        aift aiftVar4 = new aift(4);
        j$.lang.Iterable.-EL.forEach(arrayList2, new defpackage.alkh(aiftVar4, 20));
        aike aikeVarH3 = aiftVar4.h();
        aift aiftVar5 = new aift(4);
        for (int i6 = 0; i6 < aikeVarH3.d; i6++) {
            for (defpackage.amce amceVar : (java.util.List) aikeVarH3.get(i6)) {
                if (amceVar.d.isPresent()) {
                    aiftVar5.i(amceVar);
                } else {
                    defpackage.amcd amcdVar = new defpackage.amcd(amceVar);
                    akzx akzxVarP = amceVar.b.p();
                    akzxVarP.u();
                    defpackage.amft amftVar = (defpackage.amft) akzxVarP.b;
                    amftVar.b |= 4;
                    amftVar.g = i6 + 1001;
                    amcdVar.c((defpackage.amft) akzxVarP.p());
                    aiftVar5.i(amcdVar.a());
                }
            }
        }
        return new defpackage.amcm(aiftVar5.h(), this.b, this.c, this.d);
    }

    public final defpackage.amcm k(java.util.List list, java.util.List list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList(list);
        aift aiftVar = new aift(4);
        aiftVar.k(list);
        aiftVar.k(list2);
        java.lang.String strP = defpackage.amev.p(aiftVar.h());
        defpackage.amcm amcmVar = new defpackage.amcm(arrayList, c(this.b, strP), this.c, c(this.d, strP));
        j$.util.Collection.-EL.stream(list2).forEach(new defpackage.alkh(amcmVar, 15));
        return amcmVar.w();
    }

    final defpackage.amcp l(defpackage.amen amenVar) {
        aift aiftVar = new aift(4);
        aift aiftVar2 = new aift(4);
        aift aiftVar3 = new aift(4);
        aihd aihdVarO = aihd.o(this.b);
        int i = 0;
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                defpackage.amcn amcnVarC = defpackage.amcp.c();
                amcnVarC.e(q());
                amcnVarC.f(aigf.l(defpackage.amco.a, aiftVar2.h(), defpackage.amco.b, aify.n(this.d)));
                amcnVarC.g(aiftVar3.h());
                amcnVarC.h(amenVar);
                amcnVarC.d(aiftVar.h());
                return amcnVarC.a();
            }
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(i);
            for (defpackage.amfx amfxVar : defpackage.amev.t(amceVar.b)) {
                defpackage.amfw amfwVarB = defpackage.amfw.b(amfxVar.e);
                if (amfwVarB == null) {
                    amfwVarB = defpackage.amfw.UNKNOWN;
                }
                if (amfwVarB.equals(defpackage.amfw.LOW_CONFIDENCE)) {
                    aiftVar.i(defpackage.altp.b(amfxVar.c + i2, amfxVar.d + i2));
                }
            }
            int iIntValue = amceVar.c.intValue() + i2;
            for (java.lang.String str : defpackage.amev.b.j(amceVar.e())) {
                if (!str.isEmpty()) {
                    int length = i2 + str.length();
                    if (length == iIntValue) {
                        aiftVar2.i(java.lang.Integer.valueOf(length));
                    }
                    if (aihdVarO.contains(java.lang.Integer.valueOf(length))) {
                        aiftVar3.i(-1);
                    } else {
                        aiftVar3.i(0);
                    }
                    i2 = length + 1;
                }
            }
            i++;
        }
    }

    public final j$.util.Optional m() {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return j$.util.Optional.empty();
        }
        if (((defpackage.amce) ahvr.bk(arrayList)).i()) {
            return j$.util.Optional.empty();
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return j$.util.Optional.of(0);
            }
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(size);
            if (amceVar.i() || amceVar.o()) {
                return j$.util.Optional.of(java.lang.Integer.valueOf(size + 1));
            }
            if (amceVar.m()) {
                defpackage.amft amftVar = amceVar.b;
                int i = amftVar.c;
                if (i == 2) {
                    defpackage.amgb amgbVar = (i == 2 ? (defpackage.amgc) amftVar.d : defpackage.amgc.a).f;
                    if (amgbVar == null) {
                        amgbVar = defpackage.amgb.a;
                    }
                    if (x(amgbVar.d)) {
                        break;
                    }
                }
                int i2 = amftVar.c;
                if (i2 != 8) {
                    continue;
                } else {
                    defpackage.amge amgeVar = (i2 == 8 ? (defpackage.amgf) amftVar.d : defpackage.amgf.a).f;
                    if (amgeVar == null) {
                        amgeVar = defpackage.amge.a;
                    }
                    if (x(amgeVar.d)) {
                        break;
                    }
                }
            }
        }
        return size == arrayList.size() + (-1) ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.Integer.valueOf(size + 1));
    }

    public final j$.util.Optional n(aify aifyVar) {
        return e().size() <= aifyVar.size() ? j$.util.Optional.empty() : j$.util.Optional.of((defpackage.amce) e().get(aifyVar.size()));
    }

    public final j$.util.Optional o(long j) {
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return j$.util.Optional.empty();
            }
            if (((defpackage.amce) arrayList.get(i)).b.e == j) {
                return j$.util.Optional.of(java.lang.Integer.valueOf(i));
            }
            i++;
        }
    }

    public final j$.util.Optional p() {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return j$.util.Optional.empty();
        }
        int iA = a();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size <= iA) {
                return j$.util.Optional.empty();
            }
            defpackage.amce amceVar = (defpackage.amce) arrayList.get(size);
            if (amceVar.m() && !amceVar.k()) {
                return j$.util.Optional.of(amceVar);
            }
        }
    }

    public final java.lang.String q() {
        return defpackage.amev.p(this.a);
    }

    public final void r() {
        this.c.add(java.lang.Integer.valueOf(q().length()));
    }

    public final boolean s() {
        java.util.ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return false;
        }
        return ((defpackage.amce) ahvr.bk(arrayList)).i();
    }

    public final void t(defpackage.amce amceVar) {
        this.a.add(amceVar);
    }

    public final java.lang.String toString() {
        return ((java.lang.String) j$.util.Collection.-EL.stream(this.a).map(new defpackage.alzr(17)).collect(j$.util.stream.Collectors.joining("\n"))).concat(". Final Indexes: ".concat(this.b.toString()));
    }

    public final void u(defpackage.amce amceVar) {
        int size = this.a.size();
        defpackage.amcd amcdVar = new defpackage.amcd(amceVar);
        akzx akzxVarP = amceVar.b.p();
        long j = size;
        akzxVarP.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarP.b;
        amftVar.b |= 1;
        amftVar.e = j;
        amcdVar.c((defpackage.amft) akzxVarP.p());
        t(amcdVar.a());
    }

    public amcm(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        this.c = new java.util.ArrayList();
        this.a = new java.util.ArrayList(list);
        this.b = new java.util.ArrayList(list2);
        this.c = new java.util.ArrayList(list3);
        this.d = new java.util.ArrayList(list4);
    }
}
