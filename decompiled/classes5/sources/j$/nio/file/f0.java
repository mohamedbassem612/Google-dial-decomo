package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract class f0 {
    public static final j$.nio.file.e0 a = new j$.nio.file.e0((java.lang.Object) "OVERFLOW", (java.lang.Object) java.lang.Object.class, (byte) 0);
    public static final j$.nio.file.e0 b;
    public static final j$.nio.file.e0 c;
    public static final j$.nio.file.e0 d;

    static {
        java.lang.Class<j$.nio.file.Path> cls = j$.nio.file.Path.class;
        b = new j$.nio.file.e0((java.lang.Object) "ENTRY_CREATE", (java.lang.Object) cls, (byte) 0);
        byte b2 = 0;
        c = new j$.nio.file.e0("ENTRY_DELETE", cls, b2);
        d = new j$.nio.file.e0("ENTRY_MODIFY", cls, b2);
    }

    public static /* synthetic */ j$.nio.file.LinkOption[] h(java.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        j$.nio.file.LinkOption[] linkOptionArr2 = new j$.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = linkOptionArr[i] == null ? null : j$.nio.file.LinkOption.NOFOLLOW_LINKS;
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ j$.nio.file.i0[] i(java.nio.file.WatchEvent.Kind[] kindArr) {
        if (kindArr == null) {
            return null;
        }
        int length = kindArr.length;
        j$.nio.file.i0[] i0VarArr = new j$.nio.file.i0[length];
        for (int i = 0; i < length; i++) {
            i0VarArr[i] = j$.nio.file.a.b(kindArr[i]);
        }
        return i0VarArr;
    }

    public static /* synthetic */ j$.nio.file.l0[] j(java.nio.file.WatchEvent.Modifier[] modifierArr) {
        if (modifierArr == null) {
            return null;
        }
        int length = modifierArr.length;
        j$.nio.file.l0[] l0VarArr = new j$.nio.file.l0[length];
        for (int i = 0; i < length; i++) {
            java.nio.file.WatchEvent.Modifier modifier = modifierArr[i];
            l0VarArr[i] = modifier == null ? null : modifier instanceof j$.nio.file.k0 ? ((j$.nio.file.k0) modifier).a : new j$.nio.file.j0(modifier);
        }
        return l0VarArr;
    }

    public static /* synthetic */ java.nio.file.LinkOption[] k(j$.nio.file.LinkOption[] linkOptionArr) {
        if (linkOptionArr == null) {
            return null;
        }
        int length = linkOptionArr.length;
        java.nio.file.LinkOption[] linkOptionArr2 = new java.nio.file.LinkOption[length];
        for (int i = 0; i < length; i++) {
            linkOptionArr2[i] = j$.nio.file.a.c(linkOptionArr[i]);
        }
        return linkOptionArr2;
    }

    public static /* synthetic */ java.nio.file.WatchEvent.Kind[] l(j$.nio.file.i0[] i0VarArr) {
        if (i0VarArr == null) {
            return null;
        }
        int length = i0VarArr.length;
        java.nio.file.WatchEvent.Kind[] kindArr = new java.nio.file.WatchEvent.Kind[length];
        for (int i = 0; i < length; i++) {
            kindArr[i] = j$.nio.file.a.f(i0VarArr[i]);
        }
        return kindArr;
    }

    public static /* synthetic */ java.nio.file.WatchEvent.Modifier[] m(j$.nio.file.l0[] l0VarArr) {
        if (l0VarArr == null) {
            return null;
        }
        int length = l0VarArr.length;
        java.nio.file.WatchEvent.Modifier[] modifierArr = new java.nio.file.WatchEvent.Modifier[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.l0 l0Var = l0VarArr[i];
            modifierArr[i] = l0Var == null ? null : l0Var instanceof j$.nio.file.j0 ? ((j$.nio.file.j0) l0Var).a : new j$.nio.file.k0(l0Var);
        }
        return modifierArr;
    }

    public abstract java.lang.Object a(java.lang.String str);

    public abstract long b();

    public abstract j$.nio.file.attribute.c0 c(java.lang.Class cls);

    public abstract long d();

    public abstract long e();

    public abstract long f();

    public abstract boolean g();

    public abstract java.lang.String n();

    public abstract boolean o(java.lang.Class cls);

    public abstract boolean p(java.lang.String str);

    public abstract java.lang.String q();
}
