package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class bc {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.aec b = new defpackage.aec(0);

    public static java.lang.Class a(java.lang.ClassLoader classLoader, java.lang.String str) throws java.lang.ClassNotFoundException {
        defpackage.aec aecVar = b;
        defpackage.aec aecVar2 = (defpackage.aec) aecVar.get(classLoader);
        if (aecVar2 == null) {
            aecVar2 = new defpackage.aec(0);
            aecVar.put(classLoader, aecVar2);
        }
        java.lang.Class cls = (java.lang.Class) aecVar2.get(str);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        aecVar2.put(str, cls2);
        return cls2;
    }

    public defpackage.aw b(java.lang.String str) {
        throw null;
    }
}
