package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ps {
    private static volatile defpackage.ps a;
    private final java.util.Map b = new java.util.HashMap();

    private ps() {
    }

    public static defpackage.ps b() {
        if (a == null) {
            synchronized (defpackage.ps.class) {
                if (a == null) {
                    a = new defpackage.ps();
                }
            }
        }
        return a;
    }

    private final defpackage.pr c(java.lang.Class cls) throws defpackage.qv {
        java.lang.String strConcat;
        java.lang.Package r0 = cls.getPackage();
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new defpackage.qv(2, a.bg(cls, "Failed to find simple name for document class \"", "\". Perhaps it is anonymous?"), null);
        }
        if (r0 != null) {
            strConcat = java.lang.String.valueOf(r0.getName()).concat(".");
            canonicalName = canonicalName.substring(strConcat.length()).replace(".", "$$__");
        } else {
            strConcat = "";
        }
        java.lang.String strBr = a.br(canonicalName, strConcat, "$$__AppSearch__");
        try {
            try {
                return (defpackage.pr) java.lang.Class.forName(strBr).getDeclaredConstructor(null).newInstance(null);
            } catch (java.lang.Exception e) {
                throw new defpackage.qv(2, a.bp((byte) 34, strBr, "Failed to construct document class converter \""), e);
            }
        } catch (java.lang.ClassNotFoundException e2) {
            java.lang.Class superclass = cls.getSuperclass();
            java.lang.Class<?>[] interfaces = cls.getInterfaces();
            java.lang.Class cls2 = superclass != java.lang.Object.class ? superclass : null;
            int length = interfaces.length;
            if (cls2 != null) {
                length++;
            }
            if (length == 1) {
                return cls2 != null ? c(cls2) : c(interfaces[0]);
            }
            java.lang.String strBk = a.bk(strBr, "Failed to find document class converter \"", "\". Perhaps the annotation processor was not run or the class was proguarded out?");
            if (length > 1) {
                strBk = strBk.concat(" Or, this class may not have been annotated with @Document, and there is an ambiguity to determine a unique @Document annotated parent class/interface.");
            }
            throw new defpackage.qv(2, strBk, e2);
        }
    }

    public final defpackage.pr a(java.lang.Class cls) throws defpackage.qv {
        defpackage.pr prVarC;
        synchronized (this) {
            prVarC = (defpackage.pr) this.b.get(cls);
        }
        if (prVarC == null) {
            prVarC = c(cls);
            synchronized (this) {
                java.util.Map map = this.b;
                defpackage.pr prVar = (defpackage.pr) map.get(cls);
                if (prVar == null) {
                    map.put(cls, prVarC);
                } else {
                    prVarC = prVar;
                }
            }
        }
        return prVarC;
    }
}
