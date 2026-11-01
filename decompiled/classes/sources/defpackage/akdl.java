package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akdl implements defpackage.afah {
    private static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final defpackage.akdk b;

    public akdl(defpackage.akdk akdkVar) {
        this.b = akdkVar;
    }

    @Override // defpackage.afah
    public final void a() {
        if (ft$.ExternalSyntheticApiModelOutline0.m() || a.getAndSet(true)) {
            return;
        }
        defpackage.ahoq ahoqVarX = defpackage.ahvr.X(1500, "AndroidLoggerConfig", defpackage.ahot.a, true);
        try {
            defpackage.akdk akdkVar = this.b;
            if (!defpackage.aipr.a.compareAndSet(false, true)) {
                throw new java.lang.IllegalStateException("Logger backend configuration may only occur once.");
            }
            if (!defpackage.anty.aq(defpackage.aipx.d, akdkVar)) {
                throw new java.lang.IllegalStateException("Logger backends can only be configured once.");
            }
            defpackage.aipx.e();
            defpackage.aipy.a.b.set(defpackage.aiqn.a);
            ahoqVarX.close();
        } catch (java.lang.Throwable th) {
            try {
                ahoqVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
