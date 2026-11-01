package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class vjl extends aomh implements aonn {
    java.lang.Object a;
    java.lang.Object b;
    java.lang.Object c;
    int d;
    int e;
    final /* synthetic */ defpackage.vjm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjl(defpackage.vjm vjmVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = vjmVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        int i;
        java.lang.Object obj4;
        aolu aoluVar = aolu.a;
        if (this.e != 0) {
            i = this.d;
            java.lang.Object obj5 = this.c;
            java.lang.Object obj6 = this.b;
            obj3 = this.a;
            aooc.af(obj);
            obj4 = obj5;
            obj2 = obj6;
        } else {
            aooc.af(obj);
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = "ATTV";
            objArr[1] = android.os.Build.DEVICE;
            objArr[2] = android.os.Build.VERSION.RELEASE;
            defpackage.vjm vjmVar = this.f;
            this.a = "%s:%s/%s:%s";
            this.b = objArr;
            this.c = objArr;
            this.d = 3;
            this.e = 1;
            obj = aoov.aj(vjmVar.c, new uer(vjmVar, (aoln) null, 6), this);
            if (obj == aoluVar) {
                return aoluVar;
            }
            obj2 = objArr;
            obj3 = "%s:%s/%s:%s";
            i = 3;
            obj4 = objArr;
        }
        ((java.lang.Object[]) obj4)[i] = obj;
        java.lang.Object[] objArr2 = (java.lang.Object[]) obj2;
        int length = objArr2.length;
        java.lang.String str = java.lang.String.format((java.lang.String) obj3, java.util.Arrays.copyOf(objArr2, 4));
        aooh.e(str, "format(...)");
        return str;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.vjl(this.f, aolnVar);
    }
}
