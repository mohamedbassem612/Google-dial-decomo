package okhttp3.internal.publicsuffix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class PublicSuffixDatabase {
    public static final appb a;
    public static final java.util.List b;
    public static final okhttp3.internal.publicsuffix.PublicSuffixDatabase c;
    public final defpackage.apnz d;

    static {
        appb appbVar = appb.a;
        a = aoov.aR(new byte[]{42});
        b = ajsz.aY("*");
        c = new okhttp3.internal.publicsuffix.PublicSuffixDatabase(new defpackage.apoa(defpackage.apoa.f, defpackage.appe.b));
    }

    public PublicSuffixDatabase(defpackage.apnz apnzVar) {
        this.d = apnzVar;
    }

    public final java.util.List a(java.lang.String str) {
        java.util.List listR = aoov.R(str, new char[]{'.'});
        return aooh.n(ajsz.bI(listR), "") ? ajsz.co(listR) : listR;
    }
}
