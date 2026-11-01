package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajne extends java.lang.RuntimeException {
    public ajne(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public static java.lang.Object a(defpackage.ajnd ajndVar) {
        try {
            return ajndVar.a();
        } catch (java.lang.Exception e) {
            throw new defpackage.ajne(e);
        }
    }

    public ajne(java.lang.Throwable th) {
        super(th);
    }
}
