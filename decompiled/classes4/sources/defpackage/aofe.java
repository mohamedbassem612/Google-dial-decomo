package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aofe extends defpackage.anup {
    public static final apoy a = new apoy();
    public final defpackage.anpk b;
    public final java.lang.String c;
    public final defpackage.aodj d;
    public final java.lang.String e;
    public final defpackage.aofd f;
    public final boolean g;
    private final defpackage.aofc h;
    private final defpackage.anlw i;

    public aofe(defpackage.anpk anpkVar, anph anphVar, defpackage.aoet aoetVar, defpackage.aofk aofkVar, aofv aofvVar, java.lang.Object obj, int i, int i2, java.lang.String str, java.lang.String str2, defpackage.aodj aodjVar, aodq aodqVar, anmb anmbVar) {
        super(new defpackage.aofr(0), aodjVar, aodqVar, anphVar, anmbVar);
        this.h = new defpackage.aofc(this);
        this.g = false;
        this.d = aodjVar;
        this.b = anpkVar;
        this.e = str;
        this.c = str2;
        this.i = aofkVar.r;
        java.lang.String str3 = anpkVar.b;
        this.f = new defpackage.aofd(this, i, aodjVar, obj, aoetVar, aofvVar, aofkVar, i2);
    }

    @Override // defpackage.anvp
    public final defpackage.anlw a() {
        return this.i;
    }

    @Override // defpackage.anup
    protected final /* synthetic */ defpackage.anuo p() {
        return this.h;
    }

    @Override // defpackage.anup, defpackage.anus
    protected final /* synthetic */ defpackage.anur q() {
        return this.f;
    }

    public final defpackage.anpj r() {
        return this.b.a;
    }

    @Override // defpackage.anup
    protected final /* synthetic */ defpackage.anur t() {
        return this.f;
    }
}
