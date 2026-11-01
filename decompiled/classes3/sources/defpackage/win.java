package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class win implements ahyc {
    private final /* synthetic */ int $cid;

    public final java.lang.Object apply(java.lang.Object obj) {
        if (this.$cid == 0) {
            return afsq.bR((java.lang.Integer) obj);
        }
        j$.util.Optional optional = (j$.util.Optional) obj;
        if (!optional.isPresent()) {
            return java.lang.Boolean.FALSE;
        }
        defpackage.wqt wqtVar = ((defpackage.wqp) optional.orElseThrow()).e;
        if (wqtVar == null) {
            wqtVar = defpackage.wqt.a;
        }
        defpackage.wgu wguVar = wqtVar.d;
        if (wguVar == null) {
            wguVar = defpackage.wgu.a;
        }
        return java.lang.Boolean.valueOf(wguVar.e);
    }
}
