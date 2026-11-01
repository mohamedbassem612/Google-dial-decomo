package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aiue implements java.io.Serializable {
    public static final j$.time.Duration d = j$.time.Duration.ofMillis(-1);

    public static defpackage.aiue c(j$.time.Duration duration, double d2, int i) {
        defpackage.ahvr.ci(duration);
        return new aiub(duration, d2, i);
    }

    public abstract j$.time.Duration a(int i);

    public boolean b(int i) {
        throw null;
    }

    public final j$.time.Duration d(int i, j$.time.Duration duration) {
        duration.getClass();
        return !b(i) ? d : a(i);
    }
}
