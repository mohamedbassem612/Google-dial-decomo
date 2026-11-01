package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class albx {
    public static final defpackage.alci a = new defpackage.alci();

    @java.lang.Deprecated
    static int a(int i, defpackage.albh albhVar, defpackage.albw albwVar) {
        return (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((defpackage.akym) albhVar).e(albwVar);
    }

    static int b(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(alaeVar.e(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int c(java.util.List list) {
        int iF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            iF = 0;
            while (i < size) {
                iF += defpackage.akzk.F(alaeVar.e(i));
                i++;
            }
        } else {
            iF = 0;
            while (i < size) {
                iF += defpackage.akzk.F(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iF;
    }

    static int d(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iE = alaeVar.e(i);
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iE << 1) ^ (iE >> 31)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((java.lang.Integer) list.get(i)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue << 1) ^ (iIntValue >> 31)) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int e(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jA = albdVar.a(i);
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jA << 1) ^ (jA >> 63)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((java.lang.Long) list.get(i)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue << 1) ^ (jLongValue >> 63)) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static int f(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.alae) {
            defpackage.alae alaeVar = (defpackage.alae) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(alaeVar.e(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static java.lang.Object g(java.lang.Object obj, int i, java.util.List list, defpackage.alai alaiVar, java.lang.Object obj2, defpackage.alci alciVar) {
        if (alaiVar != null) {
            if (list instanceof java.util.RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Integer num = (java.lang.Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (alaiVar.a(iIntValue)) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = j(obj, i, iIntValue, obj2);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                    if (!alaiVar.a(iIntValue2)) {
                        obj2 = j(obj, i, iIntValue2, obj2);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static /* synthetic */ int h(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.albd) {
            defpackage.albd albdVar = (defpackage.albd) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(albdVar.a(i)) * 9)) >>> 6;
                i++;
            }
        } else {
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
        }
        return iNumberOfLeadingZeros;
    }

    static void i(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.akzs akzsVarT = defpackage.ajsz.T(obj2);
        if (akzsVarT.g()) {
            return;
        }
        defpackage.akzs akzsVarU = defpackage.ajsz.U(obj);
        defpackage.alcb alcbVar = akzsVarT.b;
        int size = alcbVar.size();
        for (int i = 0; i < size; i++) {
            defpackage.alby albyVar = (defpackage.alby) alcbVar.a(i);
            defpackage.alac alacVar = albyVar.c;
            java.lang.Object objB = albyVar.a;
            boolean z = objB instanceof defpackage.alax;
            if (alacVar.a() == defpackage.alcs.i) {
                java.lang.Object objJ = akzsVarU.j(alacVar);
                if (objJ == null) {
                    akzsVarU.b.d(alacVar, defpackage.akzs.c(objB));
                    if (z) {
                        akzsVarU.d = true;
                    }
                } else {
                    if (z) {
                        objB = ((defpackage.alax) objB).b();
                    }
                    if (objJ instanceof defpackage.albh) {
                        defpackage.albg albgVarL = ((defpackage.albh) objJ).L();
                        defpackage.alac.b(albgVarL, objB);
                        akzsVarU.b.d(alacVar, albgVarL.r());
                    } else {
                        defpackage.alac.b(objJ, objB);
                    }
                }
            } else {
                if (z) {
                    throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
                }
                akzsVarU.b.d(alacVar, defpackage.akzs.c(objB));
            }
        }
    }

    static java.lang.Object j(java.lang.Object obj, int i, int i2, java.lang.Object obj2) {
        if (obj2 == null) {
            obj2 = defpackage.alci.d(obj);
        }
        ((defpackage.alcj) obj2).e(i << 3, java.lang.Long.valueOf(i2));
        return obj2;
    }

    public static void k(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.akyt)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).f(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            akzkVar.v(i3);
            while (i2 < list.size()) {
                akzkVar.d(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        defpackage.akyt akytVar = (defpackage.akyt) list;
        if (!z) {
            while (i2 < akytVar.b) {
                ((defpackage.akzk) ajykVar.b).f(i, akytVar.f(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < akytVar.b; i6++) {
            akytVar.f(i6);
            i5++;
        }
        akzkVar2.v(i5);
        while (i2 < akytVar.b) {
            akzkVar2.d(akytVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void l(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.akzl)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).I(i, ((java.lang.Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            akzkVar.v(i3);
            while (i2 < list.size()) {
                akzkVar.J(((java.lang.Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        defpackage.akzl akzlVar = (defpackage.akzl) list;
        if (!z) {
            while (i2 < akzlVar.c) {
                ((defpackage.akzk) ajykVar.b).I(i, akzlVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < akzlVar.c; i6++) {
            akzlVar.e(i6);
            i5 += 8;
        }
        akzkVar2.v(i5);
        while (i2 < akzlVar.c) {
            akzkVar2.J(akzlVar.e(i2));
            i2++;
        }
    }

    public static void m(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.alae)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).m(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += defpackage.akzk.F(((java.lang.Integer) list.get(i3)).intValue());
            }
            akzkVar.v(iF);
            while (i2 < list.size()) {
                akzkVar.n(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.alae alaeVar = (defpackage.alae) list;
        if (!z) {
            while (i2 < alaeVar.c) {
                ((defpackage.akzk) ajykVar.b).m(i, alaeVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i4 = 0; i4 < alaeVar.c; i4++) {
            iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(alaeVar.e(i4)) * 9)) >>> 6;
        }
        akzkVar2.v(iNumberOfLeadingZeros);
        while (i2 < alaeVar.c) {
            akzkVar2.n(alaeVar.e(i2));
            i2++;
        }
    }

    public static void n(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.akzu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).K(i, ((java.lang.Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            akzkVar.v(i3);
            while (i2 < list.size()) {
                akzkVar.L(((java.lang.Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        defpackage.akzu akzuVar = (defpackage.akzu) list;
        if (!z) {
            while (i2 < akzuVar.c) {
                ((defpackage.akzk) ajykVar.b).K(i, akzuVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < akzuVar.c; i6++) {
            akzuVar.e(i6);
            i5 += 4;
        }
        akzkVar2.v(i5);
        while (i2 < akzuVar.c) {
            akzkVar2.L(akzuVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.alae)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).m(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += defpackage.akzk.F(((java.lang.Integer) list.get(i3)).intValue());
            }
            akzkVar.v(iF);
            while (i2 < list.size()) {
                akzkVar.n(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.alae alaeVar = (defpackage.alae) list;
        if (!z) {
            while (i2 < alaeVar.c) {
                ((defpackage.akzk) ajykVar.b).m(i, alaeVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iF2 = 0;
        for (int i4 = 0; i4 < alaeVar.c; i4++) {
            iF2 += defpackage.akzk.F(alaeVar.e(i4));
        }
        akzkVar2.v(iF2);
        while (i2 < alaeVar.c) {
            akzkVar2.n(alaeVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.alae)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = ajykVar.b;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    ((defpackage.akzk) obj).u(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            akzkVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                akzkVar.v((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        defpackage.alae alaeVar = (defpackage.alae) list;
        if (!z) {
            while (i2 < alaeVar.c) {
                java.lang.Object obj2 = ajykVar.b;
                int iE = alaeVar.e(i2);
                ((defpackage.akzk) obj2).u(i, (iE << 1) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < alaeVar.c; i4++) {
            int iE2 = alaeVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros((iE2 << 1) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        akzkVar2.v(iNumberOfLeadingZeros2);
        while (i2 < alaeVar.c) {
            int iE3 = alaeVar.e(i2);
            akzkVar2.v((iE3 << 1) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void q(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.albd)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = ajykVar.b;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    ((defpackage.akzk) obj).w(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            akzkVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                akzkVar.x((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        defpackage.albd albdVar = (defpackage.albd) list;
        if (!z) {
            while (i2 < albdVar.c) {
                java.lang.Object obj2 = ajykVar.b;
                long jA = albdVar.a(i2);
                ((defpackage.akzk) obj2).w(i, (jA << 1) ^ (jA >> 63));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < albdVar.c; i4++) {
            long jA2 = albdVar.a(i4);
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros((jA2 << 1) ^ (jA2 >> 63)) * 9)) >>> 6;
        }
        akzkVar2.v(iNumberOfLeadingZeros2);
        while (i2 < albdVar.c) {
            long jA3 = albdVar.a(i2);
            akzkVar2.x((jA3 << 1) ^ (jA3 >> 63));
            i2++;
        }
    }

    public static void r(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.alae)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).u(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            akzkVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                akzkVar.v(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.alae alaeVar = (defpackage.alae) list;
        if (!z) {
            while (i2 < alaeVar.c) {
                ((defpackage.akzk) ajykVar.b).u(i, alaeVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < alaeVar.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros(alaeVar.e(i4)) * 9)) >>> 6;
        }
        akzkVar2.v(iNumberOfLeadingZeros2);
        while (i2 < alaeVar.c) {
            akzkVar2.v(alaeVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.alae)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).i(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            akzkVar.v(i3);
            while (i2 < list.size()) {
                akzkVar.j(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.alae alaeVar = (defpackage.alae) list;
        if (!z) {
            while (i2 < alaeVar.c) {
                ((defpackage.akzk) ajykVar.b).i(i, alaeVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < alaeVar.c; i6++) {
            alaeVar.e(i6);
            i5 += 4;
        }
        akzkVar2.v(i5);
        while (i2 < alaeVar.c) {
            akzkVar2.j(alaeVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.albd)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).k(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            akzkVar.v(i3);
            while (i2 < list.size()) {
                akzkVar.l(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.albd albdVar = (defpackage.albd) list;
        if (!z) {
            while (i2 < albdVar.c) {
                ((defpackage.akzk) ajykVar.b).k(i, albdVar.a(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < albdVar.c; i6++) {
            albdVar.a(i6);
            i5 += 8;
        }
        akzkVar2.v(i5);
        while (i2 < albdVar.c) {
            akzkVar2.l(albdVar.a(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, java.util.List list, defpackage.ajyk ajykVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.albd)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.akzk) ajykVar.b).w(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.akzk akzkVar = (defpackage.akzk) ajykVar.b;
            akzkVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            akzkVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                akzkVar.x(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.albd albdVar = (defpackage.albd) list;
        if (!z) {
            while (i2 < albdVar.c) {
                ((defpackage.akzk) ajykVar.b).w(i, albdVar.a(i2));
                i2++;
            }
            return;
        }
        defpackage.akzk akzkVar2 = (defpackage.akzk) ajykVar.b;
        akzkVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < albdVar.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(albdVar.a(i4)) * 9)) >>> 6;
        }
        akzkVar2.v(iNumberOfLeadingZeros2);
        while (i2 < albdVar.c) {
            akzkVar2.x(albdVar.a(i2));
            i2++;
        }
    }
}
