package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class qp extends defpackage.rm {
    public final defpackage.qo a;
    public final defpackage.qo b;
    public java.lang.String c = null;
    public defpackage.pw d = null;
    private java.lang.String e;

    public qp(defpackage.qo qoVar, defpackage.qo qoVar2) {
        this.a = qoVar;
        this.b = qoVar2;
    }

    public final java.lang.CharSequence a(defpackage.qo qoVar) {
        java.lang.String str;
        java.lang.String strI = this.e;
        if (strI == null) {
            defpackage.pw pwVar = this.d;
            if (pwVar == null || (str = this.c) == null) {
                throw new java.lang.IllegalStateException("Document or property path has not been populated; this TextMatchInfo cannot be used yet");
            }
            strI = pwVar.i(str);
            if (strI == null) {
                throw new java.lang.IllegalStateException("No content found for requested property path: ".concat(str));
            }
            this.e = strI;
        }
        return strI.substring(qoVar.a, qoVar.b);
    }
}
