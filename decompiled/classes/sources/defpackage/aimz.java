package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aimz extends defpackage.aimp {
    public static final defpackage.aimy b = new defpackage.aimy();

    @java.lang.Deprecated
    public static defpackage.aimz i(java.lang.String str) {
        return new defpackage.aimz(defpackage.aipl.d(str.replace('/', '.')));
    }

    @Override // defpackage.aimp
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final defpackage.aimw a(java.util.logging.Level level) {
        boolean zG = g(level);
        defpackage.aipl.n(e(), level, zG);
        return !zG ? b : new defpackage.aimx(this, level);
    }
}
