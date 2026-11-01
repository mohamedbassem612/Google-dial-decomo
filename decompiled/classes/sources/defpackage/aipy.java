package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipy extends defpackage.aiql {
    public static final defpackage.aipy a = new defpackage.aipy(defpackage.aiqn.a);
    public final java.util.concurrent.atomic.AtomicReference b;

    public aipy(defpackage.aiql aiqlVar) {
        this.b = new java.util.concurrent.atomic.AtomicReference(aiqlVar);
    }

    @Override // defpackage.aiql
    public final defpackage.aiqs b() {
        return ((defpackage.aiql) this.b.get()).b();
    }

    @Override // defpackage.aiql
    public final void c(java.lang.String str, java.util.logging.Level level, boolean z) {
        ((defpackage.aiql) this.b.get()).c(str, level, z);
    }

    @Override // defpackage.aiql
    public final defpackage.aior fs() {
        return ((defpackage.aiql) this.b.get()).fs();
    }
}
