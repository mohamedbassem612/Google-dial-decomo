package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class cph implements java.util.Comparator {
    private final /* synthetic */ int $cid;
    public static final defpackage.cph e = new defpackage.cph(5);
    public static final defpackage.cph d = new defpackage.cph(4);
    public static final defpackage.cph c = new defpackage.cph(3);
    public static final defpackage.cph b = new defpackage.cph(2);
    public static final defpackage.cph a = new defpackage.cph(0);

    public cph(hgt hgtVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(hgtVar);
    }

    private static final defpackage.cfc a(defpackage.dbk dbkVar) {
        defpackage.cfc cfcVar = new defpackage.cfc(new defpackage.dbk[16]);
        while (dbkVar != null) {
            cfcVar.f(0, dbkVar);
            dbkVar = dbkVar.k();
        }
        return cfcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r3 > r4) goto L59;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ int compare(java.lang.Object r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cph.compare(java.lang.Object, java.lang.Object):int");
    }

    public cph(int i) {
        this.$cid = i;
    }

    public cph(amuw amuwVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(amuwVar);
    }
}
