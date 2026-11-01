package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahrm implements defpackage.ahrj {
    @Override // defpackage.ahrj
    public final defpackage.ahrk a(defpackage.ahrn ahrnVar) {
        defpackage.ahrk ahrkVar;
        synchronized (ahrnVar) {
            ahrkVar = ahrnVar.currentMetadata;
        }
        return ahrkVar;
    }

    @Override // defpackage.ahrj
    public final boolean b(defpackage.ahrn ahrnVar, defpackage.ahrk ahrkVar, defpackage.ahrk ahrkVar2) {
        synchronized (ahrnVar) {
            if (ahrnVar.currentMetadata != ahrkVar) {
                return false;
            }
            ahrnVar.currentMetadata = ahrkVar2;
            return true;
        }
    }
}
