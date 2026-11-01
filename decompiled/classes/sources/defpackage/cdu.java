package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cdu implements defpackage.cen {
    private final /* synthetic */ int $cid;
    public static final defpackage.cdu c = new defpackage.cdu(2);
    public static final defpackage.cdu b = new defpackage.cdu(1);
    public static final defpackage.cdu a = new defpackage.cdu(0);

    private cdu(int i) {
        this.$cid = i;
    }

    @Override // defpackage.cen
    public final boolean a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return obj == obj2;
        }
        if (i != 1) {
            return defpackage.aooh.n(obj, obj2);
        }
        return false;
    }

    public final java.lang.String toString() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? "StructuralEqualityPolicy" : "NeverEqualPolicy";
        }
        return "ReferentialEqualityPolicy";
    }

    @Override // defpackage.cen
    public final /* synthetic */ void b() {
    }
}
