package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class apzf {
    public static final java.lang.Class a;
    public static final defpackage.apzm b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class cls2 = defpackage.apxh.a;
        try {
            cls = java.lang.Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new defpackage.apzm();
    }

    @java.lang.Deprecated
    static int a(int i, defpackage.apyv apyvVar, defpackage.apze apzeVar) {
        return (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((defpackage.apxf) apyvVar).b(apzeVar);
    }

    static int b(defpackage.apxf apxfVar, defpackage.apze apzeVar) {
        int iB = apxfVar.b(apzeVar);
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iB) * 9)) >>> 6) + iB;
    }

    static int c(int i, java.lang.Object obj, defpackage.apze apzeVar) {
        int iNumberOfLeadingZeros;
        int iB;
        int i2 = i << 3;
        if (obj instanceof defpackage.apyo) {
            iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i2) * 9;
            iB = ((defpackage.apyo) obj).a();
        } else {
            iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i2) * 9;
            iB = b((defpackage.apxf) obj, apzeVar);
        }
        return ((352 - iNumberOfLeadingZeros) >>> 6) + iB;
    }

    static int d(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iE = apygVar.e(i);
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
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jE = apyqVar.e(i);
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jE << 1) ^ (jE >> 63)) * 9)) >>> 6;
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
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(apygVar.e(i)) * 9)) >>> 6;
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

    static java.lang.Object g(java.lang.Object obj, int i, int i2, java.lang.Object obj2, defpackage.apzm apzmVar) {
        if (obj2 == null) {
            obj2 = apzmVar.b(obj);
        }
        apzmVar.d(obj2, i, i2);
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    static void h(defpackage.apzm apzmVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.apzn apznVarC = apzmVar.c(obj);
        defpackage.apzn apznVarC2 = apzmVar.c(obj2);
        defpackage.apzn apznVar = defpackage.apzn.a;
        if (!apznVar.equals(apznVarC2)) {
            if (apznVar.equals(apznVarC)) {
                int i = apznVarC.b + apznVarC2.b;
                int[] iArrCopyOf = java.util.Arrays.copyOf(apznVarC.c, i);
                java.lang.System.arraycopy(apznVarC2.c, 0, iArrCopyOf, apznVarC.b, apznVarC2.b);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(apznVarC.d, i);
                java.lang.System.arraycopy(apznVarC2.d, 0, objArrCopyOf, apznVarC.b, apznVarC2.b);
                apznVarC = new defpackage.apzn(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!apznVarC2.equals(apznVar)) {
                apznVarC.b();
                int i2 = apznVarC.b + apznVarC2.b;
                apznVarC.c(i2);
                java.lang.System.arraycopy(apznVarC2.c, 0, apznVarC.c, apznVarC.b, apznVarC2.b);
                java.lang.System.arraycopy(apznVarC2.d, 0, apznVarC.d, apznVarC.b, apznVarC2.b);
                apznVarC.b = i2;
            }
        }
        apzmVar.f(obj, apznVarC);
    }

    static java.lang.Object i(java.lang.Object obj, int i, java.util.List list, defpackage.apxc apxcVar, java.lang.Object obj2, defpackage.apzm apzmVar) {
        if (apxcVar != null) {
            if (list instanceof java.util.RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Integer num = (java.lang.Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (defpackage.apxc.a(iIntValue)) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = g(obj, i, iIntValue, obj2, apzmVar);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                    if (!defpackage.apxc.a(iIntValue2)) {
                        obj2 = g(obj, i, iIntValue2, obj2, apzmVar);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    public static /* synthetic */ int j(java.util.List list) {
        int iE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.apyg) {
            defpackage.apyg apygVar = (defpackage.apyg) list;
            iE = 0;
            while (i < size) {
                iE += defpackage.apxj.e(apygVar.e(i));
                i++;
            }
        } else {
            iE = 0;
            while (i < size) {
                iE += defpackage.apxj.e(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iE;
    }

    public static /* synthetic */ int k(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof defpackage.apyq) {
            defpackage.apyq apyqVar = (defpackage.apyq) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(apyqVar.e(i)) * 9)) >>> 6;
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

    static void l(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.apya apyaVarN = aoog.n(obj2);
        if (apyaVarN.d()) {
            return;
        }
        aoog.o(obj);
        defpackage.apzj apzjVar = apyaVarN.b;
        if (apzjVar.size() > 0) {
            defpackage.apzg apzgVar = (defpackage.apzg) apzjVar.a(0);
            aehu aehuVar = apzgVar.c;
            java.lang.Object obj3 = apzgVar.a;
            throw null;
        }
    }

    public static void m(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apxi)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).o(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            apxjVar.B(i3);
            while (i2 < list.size()) {
                apxjVar.m(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        defpackage.apxi apxiVar = (defpackage.apxi) list;
        if (!z) {
            while (i2 < apxiVar.a) {
                ((defpackage.apxj) uzxVar.a).o(i, apxiVar.f(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < apxiVar.a; i6++) {
            apxiVar.f(i6);
            i5++;
        }
        apxjVar2.B(i5);
        while (i2 < apxiVar.a) {
            apxjVar2.m(apxiVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apxv)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).h(i, ((java.lang.Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            apxjVar.B(i3);
            while (i2 < list.size()) {
                apxjVar.i(((java.lang.Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        defpackage.apxv apxvVar = (defpackage.apxv) list;
        if (!z) {
            while (i2 < apxvVar.a) {
                ((defpackage.apxj) uzxVar.a).h(i, apxvVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < apxvVar.a; i6++) {
            apxvVar.e(i6);
            i5 += 8;
        }
        apxjVar2.B(i5);
        while (i2 < apxvVar.a) {
            apxjVar2.i(apxvVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyc)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).j(i, ((java.lang.Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            apxjVar.B(i3);
            while (i2 < list.size()) {
                apxjVar.k(((java.lang.Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        defpackage.apyc apycVar = (defpackage.apyc) list;
        if (!z) {
            while (i2 < apycVar.a) {
                ((defpackage.apxj) uzxVar.a).j(i, apycVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < apycVar.a; i6++) {
            apycVar.e(i6);
            i5 += 4;
        }
        apxjVar2.B(i5);
        while (i2 < apycVar.a) {
            apxjVar2.k(apycVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyg)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = uzxVar.a;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    ((defpackage.apxj) obj).A(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            apxjVar.B(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                apxjVar.B((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        defpackage.apyg apygVar = (defpackage.apyg) list;
        if (!z) {
            while (i2 < apygVar.a) {
                java.lang.Object obj2 = uzxVar.a;
                int iE = apygVar.e(i2);
                ((defpackage.apxj) obj2).A(i, (iE << 1) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < apygVar.a; i4++) {
            int iE2 = apygVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros((iE2 << 1) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        apxjVar2.B(iNumberOfLeadingZeros2);
        while (i2 < apygVar.a) {
            int iE3 = apygVar.e(i2);
            apxjVar2.B((iE3 << 1) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void q(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyq)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = uzxVar.a;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    ((defpackage.apxj) obj).C(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            apxjVar.B(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                apxjVar.D((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        defpackage.apyq apyqVar = (defpackage.apyq) list;
        if (!z) {
            while (i2 < apyqVar.a) {
                java.lang.Object obj2 = uzxVar.a;
                long jE = apyqVar.e(i2);
                ((defpackage.apxj) obj2).C(i, (jE << 1) ^ (jE >> 63));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < apyqVar.a; i4++) {
            long jE2 = apyqVar.e(i4);
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros((jE2 << 1) ^ (jE2 >> 63)) * 9)) >>> 6;
        }
        apxjVar2.B(iNumberOfLeadingZeros2);
        while (i2 < apyqVar.a) {
            long jE3 = apyqVar.e(i2);
            apxjVar2.D((jE3 << 1) ^ (jE3 >> 63));
            i2++;
        }
    }

    public static void r(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).A(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            apxjVar.B(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                apxjVar.B(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.apyg apygVar = (defpackage.apyg) list;
        if (!z) {
            while (i2 < apygVar.a) {
                ((defpackage.apxj) uzxVar.a).A(i, apygVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < apygVar.a; i4++) {
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros(apygVar.e(i4)) * 9)) >>> 6;
        }
        apxjVar2.B(iNumberOfLeadingZeros2);
        while (i2 < apygVar.a) {
            apxjVar2.B(apygVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).v(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int iE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iE += defpackage.apxj.e(((java.lang.Integer) list.get(i3)).intValue());
            }
            apxjVar.B(iE);
            while (i2 < list.size()) {
                apxjVar.w(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.apyg apygVar = (defpackage.apyg) list;
        if (!z) {
            while (i2 < apygVar.a) {
                ((defpackage.apxj) uzxVar.a).v(i, apygVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int iE2 = 0;
        for (int i4 = 0; i4 < apygVar.a; i4++) {
            iE2 += defpackage.apxj.e(apygVar.e(i4));
        }
        apxjVar2.B(iE2);
        while (i2 < apygVar.a) {
            apxjVar2.w(apygVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).r(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            apxjVar.B(i3);
            while (i2 < list.size()) {
                apxjVar.s(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        defpackage.apyg apygVar = (defpackage.apyg) list;
        if (!z) {
            while (i2 < apygVar.a) {
                ((defpackage.apxj) uzxVar.a).r(i, apygVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < apygVar.a; i6++) {
            apygVar.e(i6);
            i5 += 4;
        }
        apxjVar2.B(i5);
        while (i2 < apygVar.a) {
            apxjVar2.s(apygVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).t(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            apxjVar.B(i3);
            while (i2 < list.size()) {
                apxjVar.u(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.apyq apyqVar = (defpackage.apyq) list;
        if (!z) {
            while (i2 < apyqVar.a) {
                ((defpackage.apxj) uzxVar.a).t(i, apyqVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int i5 = 0;
        for (int i6 = 0; i6 < apyqVar.a; i6++) {
            apyqVar.e(i6);
            i5 += 8;
        }
        apxjVar2.B(i5);
        while (i2 < apyqVar.a) {
            apxjVar2.u(apyqVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, java.util.List list, uzx uzxVar, boolean z) throws defpackage.apxu {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof defpackage.apyq)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.apxj) uzxVar.a).C(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.apxj apxjVar = (defpackage.apxj) uzxVar.a;
            apxjVar.B((i << 3) | 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            apxjVar.B(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                apxjVar.D(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        defpackage.apyq apyqVar = (defpackage.apyq) list;
        if (!z) {
            while (i2 < apyqVar.a) {
                ((defpackage.apxj) uzxVar.a).C(i, apyqVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.apxj apxjVar2 = (defpackage.apxj) uzxVar.a;
        apxjVar2.B((i << 3) | 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < apyqVar.a; i4++) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(apyqVar.e(i4)) * 9)) >>> 6;
        }
        apxjVar2.B(iNumberOfLeadingZeros2);
        while (i2 < apyqVar.a) {
            apxjVar2.D(apyqVar.e(i2));
            i2++;
        }
    }
}
