package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class uqu extends gfj {
    public uqu(defpackage.uqv uqvVar) {
        j$.util.Objects.requireNonNull(uqvVar);
    }

    public final java.lang.String a() {
        return "INSERT OR IGNORE INTO `ContactScore` (`normalizedNumber`,`score`) VALUES (?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.uqs uqsVar = (defpackage.uqs) obj;
        java.lang.String str = uqsVar.a;
        if (str == null) {
            ginVar.i(1);
        } else {
            ginVar.j(1, str);
        }
        ginVar.g(2, uqsVar.b);
    }
}
