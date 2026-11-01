package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class eih {
    public static final java.lang.Class a;
    public static final defpackage.ein b;

    static {
        java.lang.Class<?> cls;
        java.lang.Class cls2 = defpackage.egd.a;
        try {
            cls = java.lang.Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (java.lang.Throwable unused) {
            cls = null;
        }
        a = cls;
        b = new defpackage.ein();
    }

    @java.lang.Deprecated
    static int a(int i, defpackage.ehw ehwVar, defpackage.eig eigVar) {
        return (((352 - (java.lang.Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) << 1) + ((defpackage.egb) ehwVar).c(eigVar);
    }

    static int b(defpackage.egb egbVar, defpackage.eig eigVar) {
        int iC = egbVar.c(eigVar);
        return ((352 - (java.lang.Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    static int c(int i, java.lang.Object obj, defpackage.eig eigVar) {
        int iNumberOfLeadingZeros;
        int iB;
        int i2 = i << 3;
        if (obj instanceof defpackage.ehq) {
            iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i2) * 9;
            iB = ((defpackage.ehq) obj).a();
        } else {
            iNumberOfLeadingZeros = java.lang.Integer.numberOfLeadingZeros(i2) * 9;
            iB = b((defpackage.egb) obj, eigVar);
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
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iE = ehhVar.e(i);
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
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jE = ehsVar.e(i);
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
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(ehhVar.e(i)) * 9)) >>> 6;
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

    static java.lang.Object g(java.lang.Object obj, int i, java.util.List list, defpackage.ehj ehjVar, java.lang.Object obj2, defpackage.ein einVar) {
        if (ehjVar != null) {
            if (list instanceof java.util.RandomAccess) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    java.lang.Integer num = (java.lang.Integer) list.get(i3);
                    int iIntValue = num.intValue();
                    if (ehjVar.a()) {
                        if (i3 != i2) {
                            list.set(i2, num);
                        }
                        i2++;
                    } else {
                        obj2 = h(obj, i, iIntValue, obj2, einVar);
                    }
                }
                if (i2 != size) {
                    list.subList(i2, size).clear();
                }
            } else {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((java.lang.Integer) it.next()).intValue();
                    if (!ehjVar.a()) {
                        obj2 = h(obj, i, iIntValue2, obj2, einVar);
                        it.remove();
                    }
                }
            }
        }
        return obj2;
    }

    static java.lang.Object h(java.lang.Object obj, int i, int i2, java.lang.Object obj2, defpackage.ein einVar) {
        if (obj2 == null) {
            obj2 = einVar.b(obj);
        }
        einVar.d(obj2, i, i2);
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
    static void i(defpackage.ein einVar, java.lang.Object obj, java.lang.Object obj2) {
        defpackage.eio eioVarC = einVar.c(obj);
        defpackage.eio eioVarC2 = einVar.c(obj2);
        defpackage.eio eioVar = defpackage.eio.a;
        if (!eioVar.equals(eioVarC2)) {
            if (eioVar.equals(eioVarC)) {
                int i = eioVarC.b + eioVarC2.b;
                int[] iArrCopyOf = java.util.Arrays.copyOf(eioVarC.c, i);
                java.lang.System.arraycopy(eioVarC2.c, 0, iArrCopyOf, eioVarC.b, eioVarC2.b);
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(eioVarC.d, i);
                java.lang.System.arraycopy(eioVarC2.d, 0, objArrCopyOf, eioVarC.b, eioVarC2.b);
                eioVarC = new defpackage.eio(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!eioVarC2.equals(eioVar)) {
                eioVarC.b();
                int i2 = eioVarC.b + eioVarC2.b;
                eioVarC.c(i2);
                java.lang.System.arraycopy(eioVarC2.c, 0, eioVarC.c, eioVarC.b, eioVarC2.b);
                java.lang.System.arraycopy(eioVarC2.d, 0, eioVarC.d, eioVarC.b, eioVarC2.b);
                eioVarC.b = i2;
            }
        }
        einVar.f(obj, eioVarC);
    }

    public static /* synthetic */ int j(java.util.List list) {
        int I;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ehh) {
            ehh ehhVar = (ehh) list;
            I = 0;
            while (i < size) {
                I += defpackage.egv.I(ehhVar.e(i));
                i++;
            }
        } else {
            I = 0;
            while (i < size) {
                I += defpackage.egv.I(((java.lang.Integer) list.get(i)).intValue());
                i++;
            }
        }
        return I;
    }

    public static /* synthetic */ int k(java.util.List list) {
        int iNumberOfLeadingZeros;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ehs) {
            ehs ehsVar = (ehs) list;
            iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(ehsVar.e(i)) * 9)) >>> 6;
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
        defpackage.ehb ehbVarG = defpackage.dzl.g(obj2);
        if (ehbVarG.e()) {
            return;
        }
        defpackage.dzl.h(obj);
        defpackage.eik eikVar = ehbVarG.b;
        if (eikVar.size() > 0) {
            eii eiiVarA = eikVar.a(0);
            aehu aehuVar = eiiVarA.c;
            java.lang.Object obj3 = eiiVarA.a;
            throw null;
        }
    }

    public static void m(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ege)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).e(i, ((java.lang.Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            egvVar.u(i3);
            while (i2 < list.size()) {
                egvVar.c(((java.lang.Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        ege egeVar = (ege) list;
        if (!z) {
            while (i2 < egeVar.a) {
                ((defpackage.egv) ipcVar.a).e(i, egeVar.f(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < egeVar.a; i6++) {
            egeVar.f(i6);
            i5++;
        }
        egvVar2.u(i5);
        while (i2 < egeVar.a) {
            egvVar2.c(egeVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof egw)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).L(i, ((java.lang.Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            egvVar.u(i3);
            while (i2 < list.size()) {
                egvVar.M(((java.lang.Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        egw egwVar = (egw) list;
        if (!z) {
            while (i2 < egwVar.a) {
                ((defpackage.egv) ipcVar.a).L(i, egwVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < egwVar.a; i6++) {
            egwVar.e(i6);
            i5 += 8;
        }
        egvVar2.u(i5);
        while (i2 < egwVar.a) {
            egvVar2.M(egwVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehd)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).N(i, ((java.lang.Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            egvVar.u(i3);
            while (i2 < list.size()) {
                egvVar.O(((java.lang.Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        ehd ehdVar = (ehd) list;
        if (!z) {
            while (i2 < ehdVar.a) {
                ((defpackage.egv) ipcVar.a).N(i, ehdVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ehdVar.a; i6++) {
            ehdVar.e(i6);
            i5 += 4;
        }
        egvVar2.u(i5);
        while (i2 < ehdVar.a) {
            egvVar2.O(ehdVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehh)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = ipcVar.a;
                    int iIntValue = ((java.lang.Integer) list.get(i2)).intValue();
                    ((defpackage.egv) obj).t(i, (iIntValue << 1) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((java.lang.Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros((iIntValue2 << 1) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            egvVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((java.lang.Integer) list.get(i2)).intValue();
                egvVar.u((iIntValue3 << 1) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        ehh ehhVar = (ehh) list;
        if (!z) {
            while (i2 < ehhVar.a) {
                java.lang.Object obj2 = ipcVar.a;
                int iE = ehhVar.e(i2);
                ((defpackage.egv) obj2).t(i, (iE << 1) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ehhVar.a; i4++) {
            int iE2 = ehhVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros((iE2 << 1) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        egvVar2.u(iNumberOfLeadingZeros2);
        while (i2 < ehhVar.a) {
            int iE3 = ehhVar.e(i2);
            egvVar2.u((iE3 << 1) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void q(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehs)) {
            if (!z) {
                while (i2 < list.size()) {
                    java.lang.Object obj = ipcVar.a;
                    long jLongValue = ((java.lang.Long) list.get(i2)).longValue();
                    ((defpackage.egv) obj).v(i, (jLongValue << 1) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((java.lang.Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros((jLongValue2 << 1) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            egvVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((java.lang.Long) list.get(i2)).longValue();
                egvVar.w((jLongValue3 << 1) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        ehs ehsVar = (ehs) list;
        if (!z) {
            while (i2 < ehsVar.a) {
                java.lang.Object obj2 = ipcVar.a;
                long jE = ehsVar.e(i2);
                ((defpackage.egv) obj2).v(i, (jE << 1) ^ (jE >> 63));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ehsVar.a; i4++) {
            long jE2 = ehsVar.e(i4);
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros((jE2 << 1) ^ (jE2 >> 63)) * 9)) >>> 6;
        }
        egvVar2.u(iNumberOfLeadingZeros2);
        while (i2 < ehsVar.a) {
            long jE3 = ehsVar.e(i2);
            egvVar2.w((jE3 << 1) ^ (jE3 >> 63));
            i2++;
        }
    }

    public static void r(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).t(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (java.lang.Integer.numberOfLeadingZeros(((java.lang.Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            egvVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                egvVar.u(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ehh ehhVar = (ehh) list;
        if (!z) {
            while (i2 < ehhVar.a) {
                ((defpackage.egv) ipcVar.a).t(i, ehhVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ehhVar.a; i4++) {
            iNumberOfLeadingZeros2 += (352 - (java.lang.Integer.numberOfLeadingZeros(ehhVar.e(i4)) * 9)) >>> 6;
        }
        egvVar2.u(iNumberOfLeadingZeros2);
        while (i2 < ehhVar.a) {
            egvVar2.u(ehhVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void s(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).l(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += defpackage.egv.I(((java.lang.Integer) list.get(i3)).intValue());
            }
            egvVar.u(I);
            while (i2 < list.size()) {
                egvVar.m(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ehh ehhVar = (ehh) list;
        if (!z) {
            while (i2 < ehhVar.a) {
                ((defpackage.egv) ipcVar.a).l(i, ehhVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < ehhVar.a; i4++) {
            I2 += defpackage.egv.I(ehhVar.e(i4));
        }
        egvVar2.u(I2);
        while (i2 < ehhVar.a) {
            egvVar2.m(ehhVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void t(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).h(i, ((java.lang.Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            egvVar.u(i3);
            while (i2 < list.size()) {
                egvVar.i(((java.lang.Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ehh ehhVar = (ehh) list;
        if (!z) {
            while (i2 < ehhVar.a) {
                ((defpackage.egv) ipcVar.a).h(i, ehhVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ehhVar.a; i6++) {
            ehhVar.e(i6);
            i5 += 4;
        }
        egvVar2.u(i5);
        while (i2 < ehhVar.a) {
            egvVar2.i(ehhVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehs)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).j(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((java.lang.Long) list.get(i4)).longValue();
                i3 += 8;
            }
            egvVar.u(i3);
            while (i2 < list.size()) {
                egvVar.k(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ehs ehsVar = (ehs) list;
        if (!z) {
            while (i2 < ehsVar.a) {
                ((defpackage.egv) ipcVar.a).j(i, ehsVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ehsVar.a; i6++) {
            ehsVar.e(i6);
            i5 += 8;
        }
        egvVar2.u(i5);
        while (i2 < ehsVar.a) {
            egvVar2.k(ehsVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, java.util.List list, defpackage.ipc ipcVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ehs)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((defpackage.egv) ipcVar.a).v(i, ((java.lang.Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            defpackage.egv egvVar = (defpackage.egv) ipcVar.a;
            egvVar.s(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (java.lang.Long.numberOfLeadingZeros(((java.lang.Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            egvVar.u(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                egvVar.w(((java.lang.Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ehs ehsVar = (ehs) list;
        if (!z) {
            while (i2 < ehsVar.a) {
                ((defpackage.egv) ipcVar.a).v(i, ehsVar.e(i2));
                i2++;
            }
            return;
        }
        defpackage.egv egvVar2 = (defpackage.egv) ipcVar.a;
        egvVar2.s(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ehsVar.a; i4++) {
            iNumberOfLeadingZeros2 += (640 - (java.lang.Long.numberOfLeadingZeros(ehsVar.e(i4)) * 9)) >>> 6;
        }
        egvVar2.u(iNumberOfLeadingZeros2);
        while (i2 < ehsVar.a) {
            egvVar2.w(ehsVar.e(i2));
            i2++;
        }
    }
}
