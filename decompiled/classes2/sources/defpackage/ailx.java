package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ailx implements ahzi {
    final /* synthetic */ defpackage.aily a;

    public ailx(defpackage.aily ailyVar) {
        j$.util.Objects.requireNonNull(ailyVar);
        this.a = ailyVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object eZ() {
        java.lang.Object aimlVar;
        defpackage.aily ailyVar = this.a;
        defpackage.aizh aizhVar = ailyVar.b;
        int i = aizhVar.c;
        if (i == 0) {
            return defpackage.ailq.a;
        }
        int i2 = ailyVar.c;
        if (i <= 32) {
            aimlVar = new defpackage.aimk(aizhVar, i2);
        } else {
            aimlVar = i <= 64 ? new defpackage.aiml(aizhVar, i2) : new defpackage.aimj(aizhVar, i2);
        }
        return aimlVar;
    }
}
