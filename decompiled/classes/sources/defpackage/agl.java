package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agl implements java.util.Comparator {
    static final /* synthetic */ defpackage.agl a = new defpackage.agl(0);
    private final /* synthetic */ int $cid;

    public agl(defpackage.anox anoxVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anoxVar);
    }

    private static final float a(defpackage.agm agmVar) {
        if (agmVar.a() == 0.0f && (agmVar instanceof agy) && ((agy) agmVar).j == null) {
            return -1.0f;
        }
        return agmVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a2, code lost:
    
        if (r6 < r7) goto L68;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ int compare(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agl.compare(java.lang.Object, java.lang.Object):int");
    }

    public agl(int i) {
        this.$cid = i;
    }
}
