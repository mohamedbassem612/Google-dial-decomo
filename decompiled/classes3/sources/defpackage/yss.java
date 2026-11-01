package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yss extends aomh implements aonj {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ long b;
    final /* synthetic */ java.lang.Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yss(tmi tmiVar, long j, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = tmiVar;
        this.b = j;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ysd] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ysd] */
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.yss((defpackage.ysd) this.c, this.b, (aoln) obj, 0).b(aojh.a);
        }
        if (i == 1) {
            return new defpackage.yss(this.c, this.b, (aoln) obj, 1, null).b(aojh.a);
        }
        aoln aolnVar = (aoln) obj;
        return new defpackage.yss((tmi) this.c, this.b, aolnVar, 2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ysd] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ysd] */
    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aolu aoluVar = aolu.a;
            int i2 = this.a;
            aooc.af(obj);
            if (i2 == 0) {
                ?? r5 = this.c;
                long j = this.b;
                this.a = 1;
                if (r5.e(j, this) == aoluVar) {
                    return aoluVar;
                }
            }
            return aojh.a;
        }
        if (i == 1) {
            aolu aoluVar2 = aolu.a;
            int i3 = this.a;
            aooc.af(obj);
            if (i3 == 0) {
                ?? r6 = this.c;
                long j2 = this.b;
                this.a = 1;
                if (r6.d(j2, this) == aoluVar2) {
                    return aoluVar2;
                }
            }
            return aojh.a;
        }
        aolu aoluVar3 = aolu.a;
        int i4 = this.a;
        aooc.af(obj);
        if (i4 == 0) {
            java.lang.Object obj2 = this.c;
            this.a = 1;
            obj = ((tmi) obj2).b(this);
            if (obj == aoluVar3) {
                return aoluVar3;
            }
        }
        akfg akfgVar = ((defpackage.yuw) obj).b.b;
        if (akfgVar.c()) {
            throw new java.lang.IllegalStateException("SIM country code is unknown, createDownloadLabelsSupplier is being called without a check for Hades integration availability.");
        }
        java.lang.String str = akfgVar.eW;
        aooh.e(str, "toString(...)");
        java.util.Locale locale = java.util.Locale.ROOT;
        aooh.e(locale, "ROOT");
        java.lang.String lowerCase = str.toLowerCase(locale);
        aooh.e(lowerCase, "toLowerCase(...)");
        return ajsz.aO(new aoiu[]{new aoiu("country", lowerCase), new aoiu("version", java.lang.String.valueOf(this.b))});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yss(defpackage.ysd ysdVar, long j, aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = ysdVar;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yss(defpackage.ysd ysdVar, long j, aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.c = ysdVar;
        this.b = j;
    }
}
