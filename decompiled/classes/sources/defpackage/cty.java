package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cty {
    public static final java.util.List a = defpackage.aokc.a;

    public static final boolean a(defpackage.cqh cqhVar) {
        if (cqhVar instanceof defpackage.cqa) {
            int i = ((defpackage.cqa) cqhVar).a;
            if (i != 5 && i != 3) {
                return false;
            }
        } else if (cqhVar != null) {
            return false;
        }
        return true;
    }
}
