package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aeyh extends defpackage.aeyo {
    private final defpackage.aeyd d;
    private volatile java.lang.Object e;

    public aeyh(java.lang.String str, java.lang.String str2, defpackage.aeyz aeyzVar, defpackage.aeyd aeydVar) {
        super(str, str2, aeyzVar);
        this.d = aeydVar;
    }

    @Override // defpackage.aexz
    protected final java.lang.Object b(java.lang.Object obj) {
        return this.d.a((byte[]) obj);
    }

    @Override // defpackage.aexz
    protected final java.lang.Object c(java.lang.String str) {
        return this.d.a(android.util.Base64.decode(str, 3));
    }

    @Override // defpackage.aeyc
    public final java.lang.Object d() {
        return this.e;
    }

    @Override // defpackage.aeyc
    public final void g(java.lang.Object obj) {
        this.e = obj;
    }
}
