package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
class aeyl extends defpackage.aeyo {
    private volatile long d;

    public aeyl(java.lang.String str, java.lang.String str2, defpackage.aeyz aeyzVar) {
        super(str, str2, aeyzVar);
    }

    @Override // defpackage.aexz
    protected final /* synthetic */ java.lang.Object b(java.lang.Object obj) {
        return (java.lang.Long) obj;
    }

    @Override // defpackage.aexz
    protected final /* bridge */ /* synthetic */ java.lang.Object c(java.lang.String str) {
        return java.lang.Long.valueOf(java.lang.Long.parseLong(str));
    }

    @Override // defpackage.aeyc
    public final /* bridge */ /* synthetic */ java.lang.Object d() {
        return java.lang.Long.valueOf(this.d);
    }

    @Override // defpackage.aeyc
    public final /* bridge */ /* synthetic */ void g(java.lang.Object obj) {
        this.d = ((java.lang.Long) obj).longValue();
    }
}
