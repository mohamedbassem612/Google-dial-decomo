package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aipi {
    private static final defpackage.aipi a = new defpackage.aipc();

    public static defpackage.aipi g(defpackage.aior aiorVar, defpackage.aior aiorVar2) {
        int iB = aiorVar2.b();
        if (iB == 0) {
            return a;
        }
        return iB <= 28 ? new defpackage.aipg(aiorVar, aiorVar2) : new aiph(aiorVar, aiorVar2);
    }

    public abstract int a();

    public abstract java.lang.Object b(defpackage.ainp ainpVar);

    public abstract java.util.Set c();

    public abstract void d(defpackage.aioy aioyVar, java.lang.Object obj);
}
