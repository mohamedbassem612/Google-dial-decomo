package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aony implements java.io.Serializable, defpackage.aopt {
    public static final java.lang.Object d = defpackage.aonx.a;
    private transient defpackage.aopt a;
    private final java.lang.Class b;
    private final boolean c;
    protected final java.lang.Object e;
    public final java.lang.String f;
    public final java.lang.String g;

    protected aony(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, boolean z) {
        this.e = obj;
        this.b = cls;
        this.f = str;
        this.g = str2;
        this.c = z;
    }

    @Override // defpackage.aopt
    public final java.lang.String c() {
        return this.f;
    }

    public final defpackage.aopt e() {
        defpackage.aopt aoptVar = this.a;
        if (aoptVar != null) {
            return aoptVar;
        }
        h();
        this.a = this;
        return this;
    }

    public final defpackage.aopv f() {
        java.lang.Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            defpackage.aopu[] aopuVarArr = defpackage.aoou.a;
            return new aook(cls);
        }
        defpackage.aopu[] aopuVarArr2 = defpackage.aoou.a;
        return new defpackage.aooa(cls);
    }

    @Override // defpackage.aopt
    public final java.lang.Object g() {
        throw null;
    }

    protected abstract void h();
}
