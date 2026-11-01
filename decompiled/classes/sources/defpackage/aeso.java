package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class aeso {
    public abstract defpackage.ajcq b(defpackage.aesm aesmVar);

    public abstract void c(defpackage.aenj aenjVar);

    public abstract void d(defpackage.aenj aenjVar);

    public final defpackage.ajcq f(defpackage.aenj aenjVar) {
        java.lang.String str = aenjVar.a;
        defpackage.ahwt ahwtVar = defpackage.ahwt.a;
        if (str != null) {
            return b(new defpackage.aesm(str, aenjVar, ahwtVar, ahwtVar, ahwtVar, ahwtVar));
        }
        throw new java.lang.NullPointerException("Null eventName");
    }
}
