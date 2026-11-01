package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class trw extends defpackage.aoof implements defpackage.aonj {
    public static final defpackage.trw a = new defpackage.trw();

    public trw() {
        super(1, defpackage.ipb.class, "hasSharpieSettingsData", "hasSharpieSettingsData()Z", 0);
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.ipb ipbVar = (defpackage.ipb) obj;
        defpackage.aooh.f(ipbVar, "p0");
        return java.lang.Boolean.valueOf((ipbVar.b & 256) != 0);
    }
}
