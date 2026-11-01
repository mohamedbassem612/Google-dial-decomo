package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zeg extends aomh implements aonn {
    long a;
    java.lang.Object b;
    int c;
    final /* synthetic */ defpackage.zff d;
    final /* synthetic */ java.util.Set e;
    final /* synthetic */ defpackage.abtr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeg(defpackage.abtr abtrVar, defpackage.zff zffVar, java.util.Set set, aoln aolnVar) {
        super(2, aolnVar);
        this.f = abtrVar;
        this.d = zffVar;
        this.e = set;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, zer] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, zek] */
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        long j;
        aolu aoluVar = aolu.a;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                aooc.af(obj);
            } else {
                j = this.a;
                obj2 = this.b;
                aooc.af(obj);
            }
            return aojh.a;
        }
        aooc.af(obj);
        defpackage.abtr abtrVar = this.f;
        j$.time.Instant instantNow = j$.time.Instant.now();
        j$.time.Instant instant = j$.time.Instant.EPOCH;
        aooh.e(instant, "EPOCH");
        long epochMilli = aooc.z(instantNow, instant).toEpochMilli();
        defpackage.zff zffVar = this.d;
        java.util.Set set = this.e;
        java.lang.String str = zffVar.a;
        defpackage.zeh zehVar = !set.isEmpty() ? defpackage.zeh.b : defpackage.zeh.c;
        ?? r11 = abtrVar.b;
        java.util.List listAY = ajsz.aY(new defpackage.zeu(str, zehVar, epochMilli));
        this.b = str;
        this.a = epochMilli;
        this.c = 1;
        if (r11.b(listAY, this) == aoluVar) {
            return aoluVar;
        }
        obj2 = str;
        j = epochMilli;
        java.util.Set set2 = this.e;
        if (!set2.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(set2, 10));
            java.util.Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(new defpackage.zeo((java.lang.String) obj2, (defpackage.zdv) it.next(), j));
            }
            defpackage.abtr abtrVar2 = this.f;
            this.b = null;
            this.c = 2;
            if (abtrVar2.f.b(arrayList, this) == aoluVar) {
                return aoluVar;
            }
        }
        return aojh.a;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.zeg(this.f, this.d, this.e, aolnVar);
    }
}
