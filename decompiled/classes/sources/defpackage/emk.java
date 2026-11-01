package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class emk implements defpackage.emv {
    private final defpackage.emj a;
    private final defpackage.emv b;

    public emk(defpackage.emj emjVar, defpackage.emv emvVar) {
        if (emjVar == null) {
            defpackage.aooh.i("defaultLifecycleObserver");
        }
        this.a = emjVar;
        this.b = emvVar;
    }

    @Override // defpackage.emv
    public final void a(defpackage.emx emxVar, defpackage.emp empVar) {
        switch (empVar.ordinal()) {
            case 0:
                this.a.a(emxVar);
                break;
            case 1:
                this.a.e(emxVar);
                break;
            case 2:
                this.a.fn(emxVar);
                break;
            case 3:
                this.a.c(emxVar);
                break;
            case 4:
                this.a.f(emxVar);
                break;
            case 5:
                this.a.b(emxVar);
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new java.lang.IllegalArgumentException("ON_ANY must not be sent by anybody");
            default:
                throw new defpackage.aois();
        }
        defpackage.emv emvVar = this.b;
        if (emvVar != null) {
            emvVar.a(emxVar, empVar);
        }
    }
}
