package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aooa implements defpackage.aopu, defpackage.aonz {
    public static final java.util.Map a;
    public final java.lang.Class b;

    static {
        int i = 0;
        java.util.List listBb = defpackage.ajsz.bb(defpackage.aomy.class, defpackage.aonj.class, defpackage.aonn.class, defpackage.aono.class, defpackage.aonp.class, defpackage.aonq.class, defpackage.aonr.class, defpackage.aons.class, defpackage.aont.class, defpackage.aonu.class, defpackage.aomz.class, defpackage.aona.class, defpackage.aonb.class, defpackage.aonc.class, defpackage.aond.class, defpackage.aone.class, defpackage.aonf.class, defpackage.aong.class, defpackage.aonh.class, defpackage.aoni.class, defpackage.aonk.class, defpackage.aonl.class, defpackage.aonm.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listBb, 10));
        for (java.lang.Object obj : listBb) {
            int i2 = i + 1;
            if (i < 0) {
                defpackage.ajsz.bh();
            }
            arrayList.add(new defpackage.aoiu((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i = i2;
        }
        a = defpackage.ajsz.aR(arrayList);
    }

    public aooa(java.lang.Class cls) {
        if (cls == null) {
            defpackage.aooh.i("jClass");
        }
        this.b = cls;
    }

    @Override // defpackage.aonz
    public final java.lang.Class a() {
        return this.b;
    }

    @Override // defpackage.aopu
    public final java.lang.String b() {
        java.lang.Class cls = this.b;
        if (cls == null) {
            defpackage.aooh.i("jClass");
        }
        java.lang.String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            java.lang.String name = cls.getName();
            defpackage.aooh.e(name, "getName(...)");
            java.lang.String strF = defpackage.aooc.F(name);
            return strF == null ? cls.getCanonicalName() : strF;
        }
        java.lang.Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive()) {
            java.lang.String name2 = componentType.getName();
            defpackage.aooh.e(name2, "getName(...)");
            java.lang.String strF2 = defpackage.aooc.F(name2);
            if (strF2 != null) {
                strConcat = strF2.concat("Array");
            }
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.aopu
    public final java.lang.String c() {
        java.lang.Class cls = this.b;
        if (cls == null) {
            defpackage.aooh.i("jClass");
        }
        java.lang.String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                java.lang.String name = cls.getName();
                defpackage.aooh.e(name, "getName(...)");
                java.lang.String strG = defpackage.aooc.G(name);
                return strG == null ? cls.getSimpleName() : strG;
            }
            java.lang.Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive()) {
                java.lang.String name2 = componentType.getName();
                defpackage.aooh.e(name2, "getName(...)");
                java.lang.String strG2 = defpackage.aooc.G(name2);
                if (strG2 != null) {
                    strConcat = strG2.concat("Array");
                }
            }
            return strConcat == null ? "Array" : strConcat;
        }
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            if (simpleName == null) {
                defpackage.aooh.g();
            }
            java.lang.String strB = defpackage.aoov.B(simpleName, java.lang.String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
            if (strB != null) {
                return strB;
            }
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            if (simpleName == null) {
                defpackage.aooh.g();
            } else {
                strConcat = simpleName;
            }
            return defpackage.aoov.B(strConcat, java.lang.String.valueOf(enclosingConstructor.getName()).concat("$"), strConcat);
        }
        if (simpleName == null) {
            defpackage.aooh.g();
        } else {
            strConcat = simpleName;
        }
        if (strConcat == null) {
            defpackage.aooh.i("<this>");
            defpackage.aooh.i("missingDelimiterValue");
        }
        int iM = defpackage.aoov.M(strConcat, '$', 0);
        if (iM == -1) {
            return strConcat;
        }
        java.lang.String strSubstring = strConcat.substring(iM + 1, strConcat.length());
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // defpackage.aopu
    public final boolean d(java.lang.Object obj) {
        java.lang.Class clsJ = this.b;
        if (clsJ == null) {
            defpackage.aooh.i("jClass");
        }
        java.util.Map map = a;
        if (map == null) {
            defpackage.aooh.h("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        }
        java.lang.Integer num = (java.lang.Integer) map.get(clsJ);
        if (num != null) {
            return defpackage.aoov.b(obj, num.intValue());
        }
        if (clsJ.isPrimitive()) {
            if (clsJ == null) {
                defpackage.aooh.i("<this>");
            }
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            clsJ = defpackage.aooc.J(new defpackage.aooa(clsJ));
        }
        return clsJ.isInstance(obj);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.aooa) && defpackage.aooh.n(defpackage.aooc.J(this), defpackage.aooc.J((defpackage.aopu) obj));
    }

    @Override // defpackage.aopu
    public final int hashCode() {
        return defpackage.aooc.J(this).hashCode();
    }

    public final java.lang.String toString() {
        return java.lang.String.valueOf(this.b.toString()).concat(" (Kotlin reflection is not available)");
    }
}
