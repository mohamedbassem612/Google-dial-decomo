package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aplb implements defpackage.apir {
    public static final defpackage.aplb b = new defpackage.aplb();

    @Override // defpackage.apir
    public final java.util.List a(java.lang.String str) throws java.net.UnknownHostException {
        if (str == null) {
            defpackage.aooh.i("hostname");
        }
        try {
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str);
            defpackage.aooh.e(allByName, "getAllByName(...)");
            return defpackage.ajsz.cU(allByName);
        } catch (java.lang.NullPointerException e) {
            java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of ".concat(java.lang.String.valueOf(str)));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
