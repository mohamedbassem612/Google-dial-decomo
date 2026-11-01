package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nym implements defpackage.zcr {
    private final defpackage.aoin a;
    private final defpackage.aoin b;

    public nym(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        if (aoinVar == null) {
            defpackage.aooh.i("enableIncallMeetApiIntegration");
        }
        if (aoinVar2 == null) {
            defpackage.aooh.i("enableMeetApiIntegration");
        }
        this.a = aoinVar;
        this.b = aoinVar2;
    }

    @Override // defpackage.zcr
    public final boolean a() {
        return ((java.lang.Boolean) this.a.a()).booleanValue() || ((java.lang.Boolean) this.b.a()).booleanValue();
    }
}
