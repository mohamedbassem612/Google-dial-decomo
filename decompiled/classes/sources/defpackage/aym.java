package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aym extends defpackage.cmv implements defpackage.dcz {
    public float a;
    public boolean b;

    public aym(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.dcz
    public final /* bridge */ /* synthetic */ java.lang.Object cW(defpackage.dpf dpfVar, java.lang.Object obj) {
        defpackage.azg azgVar = obj instanceof defpackage.azg ? (defpackage.azg) obj : null;
        if (azgVar == null) {
            azgVar = new defpackage.azg(null);
        }
        azgVar.a = this.a;
        azgVar.b = this.b;
        return azgVar;
    }
}
