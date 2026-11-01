package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajcp {
    private final defpackage.ahzs a = new defpackage.ahzs();
    private final java.lang.String b;
    private volatile java.util.logging.Logger c;

    public ajcp(java.lang.Class cls) {
        this.b = cls.getName();
    }

    public final java.util.logging.Logger a() {
        java.util.logging.Logger logger = this.c;
        if (logger == null) {
            synchronized (this.a) {
                java.util.logging.Logger logger2 = this.c;
                if (logger2 != null) {
                    logger = logger2;
                } else {
                    this.c = java.util.logging.Logger.getLogger(this.b);
                    logger = this.c;
                }
            }
        }
        return logger;
    }
}
