package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class ghi extends defpackage.aoof implements defpackage.aonj {
    public static final defpackage.ghi a = new defpackage.ghi();

    public ghi() {
        super(1, defpackage.gip.class, "inTransaction", "inTransaction()Z", 0);
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.gip gipVar = (defpackage.gip) obj;
        if (gipVar == null) {
            defpackage.aooh.i("p0");
        }
        return java.lang.Boolean.valueOf(gipVar.l());
    }
}
