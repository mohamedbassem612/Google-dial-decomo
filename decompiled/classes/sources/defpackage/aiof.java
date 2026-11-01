package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiof extends defpackage.aiod {
    public aiof(defpackage.aion aionVar) {
        super(aionVar);
    }

    public static defpackage.aiof i(java.lang.String str) {
        return new defpackage.aiof(defpackage.aipl.d(str));
    }

    @Override // defpackage.aimp
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final defpackage.aiob a(java.util.logging.Level level) {
        boolean zG = g(level);
        defpackage.aipl.n(e(), level, zG);
        return !zG ? b : new defpackage.aioe(this, level);
    }
}
