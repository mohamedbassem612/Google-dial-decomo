package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ahrl implements defpackage.ahrj {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(defpackage.ahrn.class, defpackage.ahrk.class, "currentMetadata");

    @Override // defpackage.ahrj
    public final defpackage.ahrk a(defpackage.ahrn ahrnVar) {
        return (defpackage.ahrk) this.a.get(ahrnVar);
    }

    @Override // defpackage.ahrj
    public final boolean b(defpackage.ahrn ahrnVar, defpackage.ahrk ahrkVar, defpackage.ahrk ahrkVar2) {
        return defpackage.anty.ag(this.a, ahrnVar, ahrkVar, ahrkVar2);
    }
}
