package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final /* synthetic */ class jau extends defpackage.aoof implements defpackage.aonj {
    public static final defpackage.jau a = new defpackage.jau();

    public jau() {
        super(1, defpackage.ipb.class, "hasBeeslySettingsData", "hasBeeslySettingsData()Z", 0);
    }

    @Override // defpackage.aonj
    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        defpackage.ipb ipbVar = (defpackage.ipb) obj;
        defpackage.aooh.f(ipbVar, "p0");
        return java.lang.Boolean.valueOf((ipbVar.b & 512) != 0);
    }
}
