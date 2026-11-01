package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public interface aodo {
    public static final defpackage.aodo a;

    static {
        defpackage.anxv anwbVar;
        try {
            java.lang.Class.forName("java.time.Instant");
            anwbVar = new defpackage.anxv();
        } catch (java.lang.ClassNotFoundException unused) {
            anwbVar = new anwb();
        }
        a = anwbVar;
    }

    long a();
}
