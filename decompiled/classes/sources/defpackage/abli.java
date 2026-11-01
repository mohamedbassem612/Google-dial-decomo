package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abli implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public abli(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.os.MessageQueue$IdleHandler, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [ajcq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 1:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 2:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 3:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 4:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case 5:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                this.a.cancel(false);
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str = (java.lang.String) obj;
                defpackage.aooh.f(str, "selected");
                this.a.a(str);
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 9:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 10:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 11:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            case 12:
                akmc akmcVar = (akmc) obj;
                defpackage.aooh.f(akmcVar, "selected");
                this.a.a(akmcVar);
                return defpackage.aojh.a;
            case 13:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.aooh.f(str2, "selected");
                this.a.a(str2);
                return defpackage.aojh.a;
            case 14:
                akmc akmcVar2 = (akmc) obj;
                defpackage.aooh.f(akmcVar2, "selected");
                this.a.a(akmcVar2);
                return defpackage.aojh.a;
            case 15:
                akmc akmcVar3 = (akmc) obj;
                defpackage.aooh.f(akmcVar3, "selected");
                this.a.a(akmcVar3);
                return defpackage.aojh.a;
            case 16:
                this.a.get(((java.lang.Number) obj).intValue());
                return null;
            default:
                android.os.Looper.getMainLooper().getQueue().removeIdleHandler(this.a);
                return defpackage.aojh.a;
        }
    }
}
